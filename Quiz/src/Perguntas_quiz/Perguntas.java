package Perguntas_quiz;

import java.util.Scanner;

public class Perguntas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// -----------------VARIAVEIS UTILZADAS-----------------------

		int acertou = 0;
		int errou = 0;
		int op1 = 0;
		char resposta = ' ';

		String ler;
		int opcao = 0;

		// -----------------------------------------------------------

		do {
			
			acertou = 0;
			errou = 0;
			op1 = 0;
			resposta = ' ';
			opcao = 0;

			do {
				
				System.out.println("BEM VINDO AO QUIZ, VOCÊ SABIA?");
				System.out.print("\n1. Facíl\n2. Médio\n3. Dificíl\nEscolha a dificuladade:");
				ler = entrada.nextLine();

				if (!ler.matches("[123]")) {
					
					System.out.println("Opção Inválida!");
					
				} else {
					
					opcao = Integer.parseInt(ler);
					
				}

			} while (opcao < 1 || opcao > 3);

			
			switch (opcao) {
			
			case 1:
				System.out.println("1.Qual a Capital do Brasil? \n");

				System.out.println("a) São Paulo\n" + "b) Rio de Janeiro\n" + "c) Brasília\n" + "d) Belo Horizonte\n"
						+ "e) Salvador\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'c') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println("\n2.Quantos Planetas existem no sistema solar? \n");

				System.out.println("a) 7\n" + "b) 8\n" + "c) 9\n" + "d) 10\n" + "e) 6\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'b') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println("\n3.Em que ano o homem pisou na Lua pela primeira vez? \n");

				System.out.println("a) 1965\n" + "b) 1971\n" + "c) 1969\n" + "d) 1967\n" + "e) 1973\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'c') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println("\n4.Qual é o maior oceano do mundo? \n");

				System.out
						.println("a) Atlântico\n" + "b) Índico\n" + "c) Ártico\n" + "d) Antártico\n" + "e) Pacífico\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'e') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println("\n5.Quantos lados tem um hexágono? \n");

				System.out.println("a) 5\n" + "b) 7\n" + "c) 8\n" + "d) 6\n" + "e) 4\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'd') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.printf("PARABÉNS POR TER CHEGADO ATÉ O FINAL!\n");
				System.out.println("");
				System.out.println("VOCÊ ACERTOU: " + acertou);
				System.out.println("VOCÊ ERROU: " + errou);

				break;
			case 2:
				System.out.println(
						"1.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?? \n");

				System.out.println("a) A queda do muro de Berlim.\n" + "b) A assinatura do tratado de Versalhes.\n"
						+ "c) A Revolução Russa.\n" + "d) A Crise dos Mísseis em Cuba.\n"
						+ "e) A queda da Bastilha.\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'a') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println(
						"\n2.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?? \n");

				System.out.println("a) Bil Gates\n" + "b) Steve Jobs.\n" + "c) Linus Torvalds.\n"
						+ "d) Mark Zuckerberg.\n" + "e) Richard Stallman.\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'b') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println(
						"\n3.Em um buraco negro, como se chama a fronteira teórica a partir da qual a velocidade de escape necessária excede a velocidade da luz, tornando impossível o retorno de qualquer matéria ou informação?? \n");

				System.out.println("a) Singularidade.\n" + "b) Cinturão de Kuiper.\n" + "c) Horizonte de Eventos.\n"
						+ "d) Esfera de Dyson.\n" + "e) Limite de Chandrasekhar.\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'c') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println(
						"\n4.Qual conceito fundamental do existencialismo de Jean-Paul Sartre afirma que o ser humano não possui um destino ou natureza pré-determinada, sendo responsável por criar seu próprio sentido através de suas escolhas?? \n");

				System.out.println("a) O Imperativo Categórico.\n" + "b) A Existência Precede a Essência.\n"
						+ "c) O Eterno Retorno.\n" + "d) A Sociedade do Espetáculo.\n"
						+ "e) O Super-Homem (Übermensch).\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'b') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.println(
						"\n5.Qual foi o principal objetivo do Pacto de Varsóvia, assinado em 1955 durante a Guerra Fria?? \n");

				System.out.println("a) Estabelecer o Plano Marshall para a reconstrução da Europa.\n"
						+ "b) Unificar economicamente os países da Europa Ocidental.\n"
						+ "c) Criar uma aliança militar entre a União Soviética e seus estados satélites em resposta à OTAN.\n"
						+ "d) Formalizar a rendição da Alemanha Nazista.\n"
						+ "e) Proibir o uso de armas nucleares em território asiático.\n");
				System.out.print("Digite sua resposta: ");
				do {
					ler = entrada.nextLine().toLowerCase().trim();
					if (ler.matches("[abcde]")) {
						resposta = ler.charAt(0);
					} else {
						System.out.print("Opção inválida! Digite apenas (a-e): ");
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'd') {
					acertou++;
					System.out.println("Resposta Correta!");
				} else {
					errou++;
					System.out.println("Resposta incorreta!");
				}

				System.out.printf("PARABÉNS POR TER CHEGADO ATÉ O FINAL!\n");
				System.out.println("");
				System.out.println("VOCÊ ACERTOU: " + acertou);
				System.out.println("VOCÊ ERROU: " + errou);

				break;
				
			case 3:
				
				System.out.println("\n1. A \"Massa de Chandrasekhar\" ou \"Limite de Chandrasekhar\" determina a massa "
						+ "máxima que uma estrela anã branca pode ter antes de colapsar e se tornar uma estrela de nêutrons "
						+ "ou um buraco negro. Qual é o valor aproximado desse limite em relação à massa do nosso Sol? \n");

				System.out.println(
						
				  "a) 1,02 massas solares. \n" 
				+ "b) 1,44 massas solares. \n"
				+ "c) 2,15 massas solares. \n" 
				+ "d) 3,14 massas solares. \n"
				+ "e) 4,60 massas solares. \n"
				
						);
				
				System.out.print("Digite sua resposta: ");
				
				do {
					
					ler = entrada.nextLine().toLowerCase().trim();
					
					if (ler.matches("[abcde]")) {
						
						resposta = ler.charAt(0);
						
					} else {
						
						System.out.print("Opção inválida! Digite apenas (a-e): ");
						
					}
					
				} while (!ler.matches("[abcde]"));

				if (resposta == 'b') {
					
					acertou++;
					
					System.out.println("Resposta Correta!");
					
				} else {
					
					errou++;
					
					System.out.println("Resposta incorreta!");
				}

				System.out.println("\n2. Qual é o nome da montanha considerada o pico não escalado mais alto do mundo, "
						+ "localizada na fronteira entre o Butão e a China, cujo acesso ao cume é proibido desde "
						+ "1994 por respeito às crenças espirituais locais? \n");

				System.out.println(
						
				  "a) Monte Kailash. \n" 
				+ "b) Machapuchare. \n" 
				+ "c) K2. \n"
				+ "d) Annapurna III. \n" 
				+ "e) Gangkhar Puensum. \n"
				
						);
				
				System.out.print("Digite sua resposta: ");
				
				do {
					
					ler = entrada.nextLine().toLowerCase().trim();
					
					if (ler.matches("[abcde]")) {
						
						resposta = ler.charAt(0);
						
					} else {
						
						System.out.print("Opção inválida! Digite apenas (a-e): ");
						
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'e') {
					
					acertou++;
					
					System.out.println("Resposta Correta!");
					
				} else {
					
					errou++;
					
					System.out.println("Resposta incorreta!");
					
				}

				System.out.println("\n3. A Pedra de Roseta foi crucial para decifrar os antigos hieróglifos egípcios. "
						+ "O artefato contém um decreto do faraó Ptolomeu V escrito em três sistemas de escrita diferentes. "
						+ "Além dos hieróglifos e do grego antigo, qual é a terceira grafia presente na pedra? \n");

				System.out.println(
						
				  "a) Copta. \n" 
				+ "b) Arameu. \n" 
				+ "c) Demótico egípcio. \n"
				+ "d) Cuneiforme acadiano. \n" 
				+ "e) Fenício. \n"
				
						);
				
				System.out.print("Digite sua resposta: ");
				
				do {
					
					ler = entrada.nextLine().toLowerCase().trim();
					
					if (ler.matches("[abcde]")) {
						
						resposta = ler.charAt(0);
						
					} else {
						
						System.out.print("Opção inválida! Digite apenas (a-e): ");
						
					}
				} while (!ler.matches("[abcde]"));

				if (resposta == 'c') {
					
					acertou++;
					
					System.out.println("Resposta Correta!");
					
				} else {
					
					errou++;
					
					System.out.println("Resposta incorreta!");
					
				}

				System.out.println("\n4. Em 1926, o químico James B. Sumner alcançou um marco histórico na bioquímica "
						+ "ao isolar e cristalizar a primeira enzima da história, provando definitivamente que as "
						+ "enzimas são proteínas (um feito que lhe rendeu o Prêmio Nobel). Qual foi essa enzima? \n");

				System.out.println(
						
				  "A) Amilase. \n" 
				+ "B) Pepsina. \n"
				+ "C) Catalase. \n" 
				+ "D) Urease. \n"
				+ "E) Lisozima. \n"
				
						);
				
				System.out.print("Digite sua resposta: ");
				
				do {
					
					ler = entrada.nextLine().toLowerCase().trim();
					
					if (ler.matches("[abcde]")) {
						
						resposta = ler.charAt(0);
						
					} else {
						
						System.out.print("Opção inválida! Digite apenas (a-e): ");
						
					}
					
				} while (!ler.matches("[abcde]"));

				if (resposta == 'd') {
					
					acertou++;
					
					System.out.println("Resposta Correta!");
					
				} else {
					
					errou++;
					
					System.out.println("Resposta incorreta!");
					
				}

				System.out.println("\n5. O célebre e misterioso \"Manuscrito Voynich\" é um códice ilustrado escrito em um "
						+ "alfabeto até hoje não decifrado por criptógrafos. Através de exames de datação por radiocarbono "
						+ "feitos no pergaminho das páginas, os cientistas descobriram que o material foi fabricado no início "
						+ "de qual século? \n");

				System.out.println(
						
					  "A) Século XII. \n"
					+ "B) Século XIII. \n"
					+ "C) Século XIV. \n"
					+ "D) Século XV. \n"
					+ "E) Século XVI. \n"
					
						);
				
				System.out.print("Digite sua resposta: ");
				
				do {
					
					ler = entrada.nextLine().toLowerCase().trim();
					
					if (ler.matches("[abcde]")) {
						
						resposta = ler.charAt(0);
						
					} else {
						
						System.out.print("Opção inválida! Digite apenas (a-e): ");
						
					}
					
				} while (!ler.matches("[abcde]"));

				if (resposta == 'd') {
					
					acertou++;
					
					System.out.println("Resposta Correta!");
					
				} else {
					
					errou++;
					
					System.out.println("Resposta incorreta!");
					
				}

				System.out.printf("PARABÉNS POR TER CHEGADO ATÉ O FINAL!\n");
				System.out.println("");
				System.out.println("VOCÊ ACERTOU: " + acertou);
				System.out.println("VOCÊ ERROU: " + errou);

				break;

			}

			System.out.println("");
			System.out.println("1.Reiniciar\n2.Encerrar");
			System.out.print("Qual opção: ");

			// -------------VALIDACAO DE RESPOSTA-------------------

			do {
				
				ler = entrada.nextLine().trim();

				if (ler.matches("[12]")) {

					op1 = Integer.parseInt(ler);

				} else {
					
					System.out.println("Opcao invalida! Digite 1 ou 2:");
					
				}

			} while (!ler.matches("[12]"));

			// ---------------------------------------------------

		} while (op1 == 1);

		System.out.println("\nPrograma Encerrado!");

		entrada.close();

	}

}
