package Projeto_quiz;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class funcoes_quiz {

    public static void logoJogo(){

        System.out.println("     ___      .______       _______ .__   __.      ___          _______   ______           _______.     ___      .______    _______ .______                                                            ");
        System.out.println("    /   \\     |   _  \\     |   ____||  \\ |  |     /   \\        |       \\ /  __  \\         /       |    /   \\     |   _  \\  |   ____||   _  \\                                                            ");
        System.out.println("   /  ^  \\    |  |_)  |    |  |__   |   \\|  |    /  ^  \\       |  .--.  |  |  |  |       |   (----`   /  ^  \\    |  |_)  | |  |__   |  |_)  |                                                            ");
        System.out.println("  /  /_\\  \\   |      /     |   __|  |  . `  |   /  /_\\  \\      |  |  |  |  |  |  |        \\   \\      /  /_\\  \\   |   _  <  |   __|  |      /      ");
        System.out.println(" /  _____  \\  |  |\\  \\----.|  |____ |  |\\   |  /  _____  \\     |  '--'  |  `--'  |    .----)   |    /  _____  \\  |  |_)  | |  |____ |  |\\  \\----.");
        System.out.println("/__/     \\__\\ | _| `._____||_______||__| \\__| /__/     \\__\\    |_______/ \\______/     |_______/    /__/     \\__\\ |______/  |_______|| _| `._____|  ");


    }


    public static void separador(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }

    public static void menuQuiz(){

        System.out.println("=========MENU========");
        System.out.println("1. Inciar");
        System.out.println("2. Placar");
        System.out.println("3. Encerrar");

    }

    public static String entradaMenu(){

        System.out.print("Qual opçao:");
        Scanner entrada = new Scanner(System.in);

        return entrada.nextLine().toLowerCase().trim();
    }

    public static int validarRespostamenu(){

        int resposta = 0;

        do {
            String entrada = entradaMenu();
            if (!entrada.matches("[123]")) {  // <---------- REGEX:  verifica se a String ler contém exatamente um dos caracteres: 1, 2 ou 3, e retorna true ou false.

                System.out.println("Opção Inválida!");

            } else {

                resposta = Integer.parseInt(entrada);  // <----------  converte uma String em um número inteiro, pois não é possivel comparar String com Inteiro.

            }
        }while(resposta < 1 || resposta > 3);

        return resposta;
    }

    public static String entradaNome(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");

        return entrada.nextLine().trim();
    }


    public static  String[] perguntasQuiz(Random random, ArrayList<Integer> indices) {

        String[][] perguntas = {

                {"1.Qual a Capital do Brasil?", "a) São Paulo", "b) Rio de Janeiro", "c) Brasília", "d) Belo Horizonte", "e) Salvador", "c", "10"},
                {"2.Quantos Planetas existem no sistema solar?", "a) 7", "b) 8", "c) 9", "d) 10", "e) 6", "b", "10"},
                {"3.Em que ano o homem pisou na Lua pela primeira vez?", "a) 1965","b) 1971", "c) 1969", "d) 1967","e) 1973", "c", "15"},
                {"4.Qual é o maior oceano do mundo?", "a) Atlântico", "b) Índico", "c) Ártico","d) Antártico", "e) Pacífico", "e", "10"},
                {"5.Quantos lados tem um hexágono?", "a) 5", "b) 7", "c) 8", "d) 6", "e) 4", "d", "10"},
                {"6.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?", "a) A queda do muro de Berlim.", "b) A assinatura do tratado de Versalhes.","c) A Revolução Russa.", "d) A Crise dos Mísseis em Cuba.", "e) A queda da Bastilha.", "a", "10"}
                //{""},

        };

        //1. indices guarda números:  [3, 0, 5, 1, 4, 2]
        //2. remove(0) tira o 3 de indices
        //3. indice = 3
        //4. perguntas[3] → acessa a linha 3 da matriz
        //5. perguntas continua com todas as 6 linhas intactas

        int indice = indices.remove(0);   // pega e remove o primeiro elemento da lista já embaralhada no main

        System.out.println(perguntas[indice][0]); // exibe o enunciado da pergunta sorteada
        System.out.println(perguntas[indice][1]); // a)
        System.out.println(perguntas[indice][2]); // b)
        System.out.println(perguntas[indice][3]); // c)
        System.out.println(perguntas[indice][4]); // d)
        System.out.println(perguntas[indice][5]); // e)

        return perguntas[indice];// retorna o vetor da pergunta sorteada para o main acessar o gabarito em [6]
    }

    public static String entradaResposta(){
        System.out.print("Qual opcão?");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }

    public static char validarRespostaPergunta() {
        String resposta = "";
        char respostaVerificada = 0;

        do {
            resposta = entradaResposta();
            if (resposta.matches("[abcde]")) {

                respostaVerificada = resposta.charAt(0);

            } else {

                System.out.print("Opção inválida! Digite apenas (a-e). ");

            }


        } while (!resposta.matches("[abcde]"));
        return respostaVerificada;
    }
    public static boolean verificarGabarito(char usuarioResponde, char gabarito ){

        /* passa o valor do char gabarito do main pra função */

        if(usuarioResponde == gabarito){

            return true;

        }else{
            return false;
        }


    }

    public static class Jogador {
        String nome;
        int pontos;

        public Jogador(String nome, int pontos) {
            this.nome = nome;
            this.pontos = pontos;
        }
    }

    public static void separaEntrada(){

        Scanner entrada = new Scanner(System.in);
        String enter = entrada.nextLine();

    }



}
