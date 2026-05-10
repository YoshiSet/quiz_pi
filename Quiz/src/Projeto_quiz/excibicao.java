package Projeto_quiz;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class excibicao {

    public static void main(String args [] ) {

        Random random = new Random();
        int opcao = 0;

        do {
            funcoes_quiz.logoJogo();
            funcoes_quiz.separador();
            funcoes_quiz.menuQuiz();
            opcao = funcoes_quiz.validarRespostamenu();
            switch (opcao) {
                case 1:
                    int errou = 0;
                    int acertou = 0;

                    ArrayList<Integer> indices = new ArrayList<>(); // cria a lista vazia
                    for (int i = 0; i<6;i++){
                        indices.add(i); // adiciona o valor de i na lista a cada volta
                    }
                    // resultado: indices = [0, 1, 2, 3, 4, 5]

                    // embaralha a lista — agora a ordem é aleatória sem repetição
                    Collections.shuffle(indices, random);

                    for(int i = 0; i < 6; i++) {
                        funcoes_quiz.separador();
                        String[] perguntaSorteada = funcoes_quiz.perguntasQuiz(random, indices); // sorteia a próxima pergunta sem repetir, usando o índice removido da lista embaralhada
                        char gabarito = perguntaSorteada[6].charAt(0); // char gabarito recebe 'resposta'
                        char usuarioResponde = funcoes_quiz.validarRespostaPergunta();// pega a entrada e valida
                        if(funcoes_quiz.verificarGabarito(usuarioResponde, gabarito)){// faz a validacao da reposta no gabarito
                            System.out.println("\nVOCÊ ACERTOU!");
                            acertou++;
                        }else{
                            System.out.println("\nVOCÊ ERROU!");
                            errou++;
                        }
                    }

                    funcoes_quiz.separador();

                    System.out.println("=== RESULTADO FINAL ===");
                    System.out.println("Acertos: " + acertou);
                    System.out.println("Erros:   " + errou);

                    break;
                case 2:
                    opcao = 2;
                    break;
            }

        }while(opcao != 2);



    }

}
