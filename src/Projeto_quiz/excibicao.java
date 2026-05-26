package Projeto_quiz;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class excibicao {

    public static void main(String args [] ) {

        Random random = new Random();
        ArrayList<funcoes_quiz.Jogador> placar = new ArrayList<>();
        int opcao = 0;

        do {
            Projeto_quiz.funcoes_quiz.logoJogo();
            Projeto_quiz.funcoes_quiz.separador();
            Projeto_quiz.funcoes_quiz.menuQuiz();
            opcao = Projeto_quiz.funcoes_quiz.validarRespostamenu();
            switch (opcao) {
                case 1:
                    int errou = 0;
                    int acertou = 0;
                    int pontos = 0;

                    Projeto_quiz.funcoes_quiz.separador();
                    String nomeJogador = Projeto_quiz.funcoes_quiz.entradaNome();

                    ArrayList<Integer> indices = new ArrayList<>(); // cria a lista vazia
                    for (int i = 0; i<20;i++){
                        indices.add(i); // adiciona o valor de i na lista a cada volta
                    }
                    // resultado: indices = [0, 1, 2, 3, 4, 5]

                    // embaralha a lista — agora a ordem é aleatória sem repetição
                    Collections.shuffle(indices, random);
                    Projeto_quiz.funcoes_quiz.separador();

                    for(int i = 0; i < 20; i++) {
                        Projeto_quiz.funcoes_quiz.separador();
                        System.out.println("==============================================");
                        String[] perguntaSorteada = Projeto_quiz.funcoes_quiz.perguntasQuiz(random, indices); // sorteia a próxima pergunta sem repetir, usando o índice removido da lista embaralhada
                        char gabarito = perguntaSorteada[6].charAt(0); // char gabarito recebe 'resposta'
                        int ponto = Integer.parseInt(perguntaSorteada[7]);
                        char usuarioResponde = Projeto_quiz.funcoes_quiz.validarRespostaPergunta();// pega a entrada e valida
                        if(Projeto_quiz.funcoes_quiz.verificarGabarito(usuarioResponde, gabarito)){// faz a validacao da reposta no gabarito
                            System.out.println("\nVOCÊ ACERTOU!");
                            System.out.println("VOCÊ RECEBEU " + ponto + " PONTOS");
                            acertou++;
                            pontos += ponto;
                            System.out.println("SUA PONTUAÇÃO ATUAL É: "+ pontos);

                        }else{
                            System.out.println("\nVOCÊ ERROU!");
                            System.out.println("SUA PONTUAÇÃO ATUAL É: "+ pontos);
                            errou++;
                        }
                        System.out.println("Digite Enter para continuar");
                        Projeto_quiz.funcoes_quiz.separaEntrada();
                    }
                    placar.add(new Projeto_quiz.funcoes_quiz.Jogador(nomeJogador, pontos));

                    Projeto_quiz.funcoes_quiz.separador();

                    System.out.println("=== RESULTADO FINAL ===");
                    System.out.println("ACERTOS: " + acertou);
                    System.out.println("ERROS:   " + errou);
                    System.out.println("PONTUAÇÃO: " + pontos);
                    System.out.println();
                    System.out.println("Digite enter para voltar ao menu.");
                    Projeto_quiz.funcoes_quiz.separaEntrada();


                    Projeto_quiz.funcoes_quiz.separador();

                    break;
                case 2:
                    Projeto_quiz.funcoes_quiz.separador();
                    System.out.println("=======PLACAR=======");
                    placar.sort((a, b) -> b.pontos - a.pontos);
                    for (int i = 0; i < placar.size(); i++) {
                        System.out.println((i+1) + "º " + placar.get(i).nome + " — " + placar.get(i).pontos + " pts");
                    }
                    System.out.println("");
                    System.out.println("Digite Enter para voltar ao menu.");
                    Projeto_quiz.funcoes_quiz.separaEntrada();

                    Projeto_quiz.funcoes_quiz.separador();
                    break;
                case 3:
                    opcao = 3;
                    break;
            }

        }while(opcao != 3);



    }

}
