package Perguntas_quiz;

import java.util.ArrayList;

public class excibicao {

    public static void main(String args [] ) {

        ArrayList<String[]> perguntasEmbaralhadas = Funcoes.perguntasAleatorias();

        int contador = perguntasEmbaralhadas.size();

        int pontuacao = 0;

        Funcoes.logoJogo();
        Funcoes.separador();

        do {

            String respostaCerta = Funcoes.fazerPerguntas(perguntasEmbaralhadas);

            pontuacao = pontuacao + Funcoes.acertouOuNao(respostaCerta, perguntasEmbaralhadas);

            contador --;
            perguntasEmbaralhadas.remove(0);

        }while (contador != 0);

        System.out.println("Você fez " + pontuacao + " pontos!");

    }

}
