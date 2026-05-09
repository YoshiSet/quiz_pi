package quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz_modificado {

    Scanner entrada = new Scanner(System.in);

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

    public static void menuQuiz(){

        System.out.println("=========MENU========");
        System.out.println("1. Inciar");
        System.out.println("2. Regras");
        System.out.println("3. Sair");

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

                resposta = Integer.parseInt(entradaMenu());  // <----------  converte uma String em um número inteiro, pois não é possivel comparar String com Inteiro.

            }
        }while(resposta < 1 || resposta > 3);

        return resposta;
    }

    public static  String[][] perguntasQuiz(Random random) {

        String[][] perguntas = {

                {"1.Qual a Capital do Brasil?", "a) São Paulo", "b) Rio de Janeiro", "c) Brasília", "d) Belo Horizonte", "e) Salvador", "c"},
                {"2.Quantos Planetas existem no sistema solar?", "a) 7", "b) 8", "c) 9", "d) 10", "e) 6", "b"},
                {"3.Em que ano o homem pisou na Lua pela primeira vez?", "a) 1965","b) 1971", "c) 1969", "d) 1967","e) 1973", "c"},
                {"4.Qual é o maior oceano do mundo?", "a) Atlântico", "b) Índico", "c) Ártico","d) Antártico", "e) Pacífico", "e"},
                {"5.Quantos lados tem um hexágono?", "a) 5", "b) 7", "c) 8", "d) 6", "e) 4", "d"},
                {"6.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?", "a) A queda do muro de Berlim.", "b) A assinatura do tratado de Versalhes.","c) A Revolução Russa.", "d) A Crise dos Mísseis em Cuba.", "e) A queda da Bastilha.", "a"}

        };

        int indice = random.nextInt(perguntas.length);

        System.out.println(perguntas[indice][0]); // pergunta
        System.out.println(perguntas[indice][1]); // a)
        System.out.println(perguntas[indice][2]); // b)
        System.out.println(perguntas[indice][3]); // c)
        System.out.println(perguntas[indice][4]); // d)
        System.out.println(perguntas[indice][5]); // e)

        return perguntas[indice];
    }

    public static String entradaResposta(){
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();

        return entrada.nextLine().toLowerCase().trim();
    }

    public static char validarRespostaPergunta(char gabarito) {
        String resposta = "";
        char respostaCerta = 0;
        
        do {
            resposta = entradaMenu();
            if (resposta.matches("[abcde]")) {

                respostaCerta = resposta.charAt(0);

            } else {

                System.out.print("Opção inválida! Digite apenas (a-e): ");

            }


        } while (!resposta.matches("[abcde]"));
        return respostaCerta;
    }


    public static void main(String args [] ) {

      
          int opcao = 0;

          logoJogo();
          separador();
          menuQuiz();
          opcao = validarRespostamenu();
          switch (opcao) {
              case 1:
                  separador();
                  perguntasQuiz();
                  validarRespostaPergunta();
                  break;
              case 2:
                  separador();
                  menuQuiz();
          }

      



    }

}
