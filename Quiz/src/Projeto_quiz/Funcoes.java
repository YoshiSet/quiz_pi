package Perguntas_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Funcoes {

    public static void logoJogo(){

        System.out.println("____    ____  ______     ______  _______         _______.     ___      .______    __       ___          ______");
        System.out.println("\\   \\  /   / /  __  \\   /      ||   ____|       /       |    /   \\     |   _  \\  |  |     /   \\        |      \\");
        System.out.println(" \\   \\/   / |  |  |  | |  ,----'|  |__         |   (----`   /  ^  \\    |  |_)  | |  |    /  ^  \\       `----)  |");
        System.out.println("  \\      /  |  |  |  | |  |     |   __|         \\   \\      /  /_\\  \\   |   _  <  |  |   /  /_\\  \\          /  /");
        System.out.println("   \\    /   |  `--'  | |  `----.|  |____    .----)   |    /  _____  \\  |  |_)  | |  |  /  _____  \\        |__|");
        System.out.println("    \\__/     \\______/   \\______||_______|   |_______/    /__/     \\__\\ |______/  |__| /__/     \\__\\        __");
        System.out.println("                                                                                                          (__)");

    }

    public static void separador(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static String leia(){

        Scanner ler = new Scanner(System.in);

        String input = ler.nextLine().toLowerCase().trim();

        return input;

    }


    public static ArrayList<String[]> perguntasAleatorias() {

        String blocoPergunta01[] = {

                "--- Pergunta de dificuldade Fácil ---",

                //----------------------------------------------------

                "1.Qual a Capital do Brasil? \n",

                //----------------------------------------------------

                "a) São Paulo\n" +
                "b) Rio de Janeiro\n" +
                "c) Brasília\n" +
                "d) Belo Horizonte\n" +
                "e) Salvador\n",

                //----------------------------------------------------

                "c",

                //----------------------------------------------------

                "5"

        };

        String blocoPergunta02[] = {

                "--- Pergunta de dificuldade Média ---",

                //----------------------------------------------------

                "1.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?? \n",

                //----------------------------------------------------

                "a) A queda do muro de Berlim.\n" +
                "b) A assinatura do tratado de Versalhes.\n" +
                "c) A Revolução Russa.\n" +
                "d) A Crise dos Mísseis em Cuba.\n" +
                "e) A queda da Bastilha.\n",

                //----------------------------------------------------

                "a",

                //----------------------------------------------------

                "7"

        };

        String blocoPergunta03[] = {

                "--- Pergunta de dificuldade Difícil ---",

                //----------------------------------------------------

                "1. A \"Massa de Chandrasekhar\" ou \"Limite de Chandrasekhar\" determina a massa \n"
                + "máxima que uma estrela anã branca pode ter antes de colapsar e se tornar uma estrela de nêutrons \n"
                + "ou um buraco negro. Qual é o valor aproximado desse limite em relação à massa do nosso Sol? \n",

                //----------------------------------------------------

                "a) 1,02 massas solares. \n" +
                "b) 1,44 massas solares. \n" +
                "c) 2,15 massas solares. \n" +
                "d) 3,14 massas solares. \n" +
                "e) 4,60 massas solares. \n",

                //----------------------------------------------------

                "b",

                //----------------------------------------------------

                "10"

        };

        ArrayList<String[]> perguntasAlternativasResposta = new ArrayList<>(List.of(blocoPergunta01, blocoPergunta02, blocoPergunta03));

        Collections.shuffle(perguntasAlternativasResposta);

        return perguntasAlternativasResposta;

    }

    public static String fazerPerguntas(ArrayList<String[]> perguntasEmbaralhadas) {

        String dificuldade = perguntasEmbaralhadas.get(0)[0];
        String pergunta = perguntasEmbaralhadas.get(0)[1];
        String alternativas = perguntasEmbaralhadas.get(0)[2];
        String respostaCerta = perguntasEmbaralhadas.get(0)[3];

        System.out.println(dificuldade + "\n" +pergunta + "\n" + alternativas);

        return respostaCerta;

    }

    public static int somarPontuacao(ArrayList<String[]> perguntasEmbaralhadas){

        int somarPontuacao = Integer.parseInt(perguntasEmbaralhadas.get(0)[4]);

        return somarPontuacao;

    }

    public static String validarResposta (){

        System.out.print("Digite a resposta: ");

        String respostaUsuario;

            do {

                respostaUsuario = leia();

                if (!respostaUsuario.matches("[abcde]")) {

                    System.out.print("Opção inválida! Digite apenas (a-e): ");

                }

            } while (!respostaUsuario.matches("[abcde]"));

            return respostaUsuario;

    }

    public static int acertouOuNao(String respostaCerta, ArrayList<String[]> perguntasEmbaralhadas) {

        String respostaUsuario = validarResposta();

        int pontuacao = 0;

        if (respostaUsuario.equals(respostaCerta)) {

            pontuacao = pontuacao + somarPontuacao(perguntasEmbaralhadas);
            System.out.println("\nResposta Correta! \n");
            System.out.println("Você ganhou +" + somarPontuacao(perguntasEmbaralhadas) + " pontos!\n");

        } else {

            System.out.println("\nResposta incorreta! \n");
            System.out.println("Você ganhou +0 pontos\n");

        }

        return pontuacao;

    }

}
