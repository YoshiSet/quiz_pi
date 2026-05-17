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

                {"Qual a Capital do Brasil?", "a) São Paulo", "b) Rio de Janeiro", "c) Brasília", "d) Belo Horizonte", "e) Salvador", "c", "5"},
                {"Quantos Planetas existem no sistema solar?", "a) 7", "b) 8", "c) 9", "d) 10", "e) 6", "b", "5"},
                {"Em que ano o homem pisou na Lua pela primeira vez?", "a) 1965","b) 1971", "c) 1969", "d) 1967","e) 1973", "c", "5"},
                {"Qual é o maior oceano do mundo?", "a) Atlântico", "b) Índico", "c) Ártico","d) Antártico", "e) Pacífico", "e", "5"},
                {"Quantos lados tem um hexágono?", "a) 5", "b) 7", "c) 8", "d) 6", "e) 4", "d", "5"},
                {"Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?", "a) A queda do muro de Berlim.", "b) A assinatura do tratado de Versalhes.","c) A Revolução Russa.", "d) A Crise dos Mísseis em Cuba.", "e) A queda da Bastilha.", "a", "5"},
                {"Qual é o maior planeta do Sistema Solar","a) Terra","b) Marte", "c) Júpiter","d) Saturno","e) Netuno","c","5"},
                {"Em qual continente fica o Egito?","a) Europa","b) Ásia","c) Oceania","d) África","e) América","d", "5"},
                {"Qual cientista formulou as três leis do movimento clássico?","a) Albert Einstein","b) Galileu Galilei","c) Isaac Newton","d) Nikola Tesla","e) Stephen Hawking","c", "7"},
                {"Qual foi o primeiro país a lançar um satélite artificial ao espaço?","a) Estados Unidos","b) China","c) Alemanha","d) União Soviética","e) Japão","d","7"},
                {"O tratado que encerrou oficialmente a Primeira Guerra Mundial foi:","a) Tratado de Tordesilhas","b) Tratado de Versalhes","c) Tratado de Utrecht","d) Tratado de Paris","e) Tratado de Viena","b","7"},
                {"Qual elemento químico possui o símbolo “Au”?","a) Prata","b) Mercúrio","c) Ouro","d) Alumínio","e) Argônio","c","7"},
                {"Qual país possui a maior floresta tropical do mundo em extensão territorial?","a) Indonésia","b) Congo","c) Peru","d) Brasil","e) Colômbia","d","7"},
                {"Quem escreveu a obra “Dom Quixote”?","a) William Shakespeare","b) Machado de Assis","c) Miguel de Cervantes","d) José Saramago","e) Dante Alighieri","c","7"},
                {"Qual foi a civilização responsável pela construção de Machu Picchu?","a) Asteca","d) Egípcia","d) Inca","e) Fenícia","d","7"},
                {"Qual país foi o último a abolir oficialmente a escravidão nas Américas?","a) Cuba","b) Brasil","c) Haiti","c) Estados Unidos","e) República Dominicana","b","10"},
                {"Qual matemático é considerado o “pai da computação” e propôs a Máquina de Turing?","a) John von Neumann","b) Blaise Pascal","c) Alan Turing","d) Charles Babbage","e) Claude Shannon","c","10"},
                {"Qual império utilizava a cidade de Tenochtitlán como capital?","a) Maia","b) Inca","c) Asteca","d) Otomano","e) Persa","c","10"},
                {"Qual é o único metal líquido em temperatura ambiente?","a) Gálio","b) Mercúrio","c) Césio","d) Bromo","e) Platina","b","10"},
                {"Em qual ano ocorreu a queda do Império Romano do Ocidente?","a) 395 d.C.","b) 410 d.C.","c) 476 d.C.","d) 509 d.C.","e) 622 d.C.","c","10"}

        };

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
