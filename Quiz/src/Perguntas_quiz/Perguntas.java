package Perguntas_quiz;

import java.util.Scanner;

public class Perguntas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		//-----------------VARIAVEIS UTILZADAS-----------------------
		
		int pontos = 0;
		int acertou = 0;
		int errou = 0;
		int op1 = 0;
		char resposta =' ';
		
		String ler;
		int opcao = 0;
		
		//-----------------------------------------------------------
		
		
		do {
			
			pontos = 0;
			acertou = 0;
			errou = 0;
			op1 = 0;
			resposta =' ';
			opcao = 0;
			
		do {
		System.out.println("BEM VINDO AO QUIZ, VOCÊ SABIA?");
		System.out.print("\n1. Facíl\n2. Médio\n3. Dificíl\nEscolha a dificuladade:");
	    ler = entrada.nextLine();
	    
	    if(!ler.matches("[123]")) {
	    	
	    	System.out.println("Opção Inválida!");
	    	
	    }else {
	
	    	opcao = Integer.parseInt(ler);
	    }
	    
		}while(opcao < 1 || opcao > 3);
		
		
		switch(opcao) {
		case 1:
			System.out.println("1.Qual a Capital do Brasil? \n");
			
			System.out.println("a) São Paulo\n"
					+ "b) Rio de Janeiro\n"
					+ "c) Brasília\n"
					+ "d) Belo Horizonte\n"
					+ "e) Salvador\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'c') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
            System.out.println("\n2.Quantos Planetas existem no sistema solar? \n");
			
			System.out.println("a) 7\n"
					+ "b) 8\n"
					+ "c) 9\n"
					+ "d) 10\n"
					+ "e) 6\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'b') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			System.out.println("\n3.Em que ano o homem pisou na Lua pela primeira vez? \n");
			
			System.out.println("a) 1965\n"
					+ "b) 1971\n"
					+ "c) 1969\n"
					+ "d) 1967\n"
					+ "e) 1973\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'c') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
            System.out.println("\n4.Qual é o maior oceano do mundo? \n");
			
			System.out.println("a) Atlântico\n"
					+ "b) Índico\n"
					+ "c) Ártico\n"
					+ "d) Antártico\n"
					+ "e) Pacífico\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'e') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			System.out.println("\n5.Quantos lados tem um hexágono? \n");
			
			System.out.println("a) 5\n"
					+ "b) 7\n"
					+ "c) 8\n"
					+ "d) 6\n"
					+ "e) 4\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'd') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			
			System.out.printf("PARABÉNS POR TER CHEGADO ATÉ O FINAL!\n");
			System.out.println("");
			System.out.println("VOCÊ ACERTOU: " + acertou);
			System.out.println("VOCÊ ERROU: " + errou);
			
			break;
		case 2:
			System.out.println("1.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?? \n");
			
			System.out.println("a) A queda do muro de Berlim.\n"
					+ "b) A assinatura do tratado de Versalhes.\n"
					+ "c) A Revolução Russa.\n"
					+ "d) A Crise dos Mísseis em Cuba.\n"
					+ "e) A queda da Bastilha.\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'a') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
            System.out.println("\n2.Qual evento histórico, ocorrido em 1989, simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?? \n");
			
			System.out.println("a) Bil Gates\n"
					+ "b) Steve Jobs.\n"
					+ "c) Linus Torvalds.\n"
					+ "d) Mark Zuckerberg.\n"
					+ "e) Richard Stallman.\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'b') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			System.out.println("\n3.Em um buraco negro, como se chama a fronteira teórica a partir da qual a velocidade de escape necessária excede a velocidade da luz, tornando impossível o retorno de qualquer matéria ou informação?? \n");
			
			System.out.println("a) Singularidade.\n"
					+ "b) Cinturão de Kuiper.\n"
					+ "c) Horizonte de Eventos.\n"
					+ "d) Esfera de Dyson.\n"
					+ "e) Limite de Chandrasekhar.\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'c') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
            System.out.println("\n4. Qual é o maior oceano do mundo? \n");
			
			System.out.println("a) Atlântico\n"
					+ "b) Índico\n"
					+ "c) Ártico\n"
					+ "d) Antártico\n"
					+ "e) Pacífico\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'e') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			System.out.println("\n5. Quantos lados tem um hexágono? \n");
			
			System.out.println("a) 5\n"
					+ "b) 7\n"
					+ "c) 8\n"
					+ "d) 6\n"
					+ "e) 4\n");
			System.out.print("Digite sua resposta: ");
			entrada.nextLine(); 
			do {
			    ler = entrada.nextLine().toLowerCase().trim();
			    if(ler.matches("[abcde]")) {
			        resposta = ler.charAt(0);
			    } else {
			        System.out.print("Opção inválida! Digite apenas (a-e): ");
			    }
			} while(!ler.matches("[abcde]"));
			
			if(resposta == 'd') {
				
				acertou++;
				System.out.println("Resposta Correta!");
				System.out.println("\nPontuação atual: " + pontos );
				
			}else {
				
				errou++;
				System.out.println("Resposta incorreta!");
				System.out.println("\nPontuação atual: " + pontos );
			
			}
			
			
			System.out.printf("PARABÉNS POR TER CHEGADO ATÉ O FINAL!\n");
			System.out.println("");
			System.out.println("VOCÊ ACERTOU: " + acertou);
			System.out.println("VOCÊ ERROU: " + errou);
			
			
			break;
		case 3: 
			System.out.println("Modo dificil em desenvolvimento.");
			break;
		
		default:
			System.out.println("Erro!");
			
		
		}
		
		System.out.println("");
		System.out.println("1.Reiniciar\n2.Encerrar");
		System.out.print("Qual opção: ");
		
		//-------------VALIDACAO DE RESPOTA-------------------
		
		do {
		ler = entrada.nextLine().trim();
		
		if(ler.matches("[12]")) {
			
			op1 = Integer.parseInt(ler);
			
		}else {
			System.out.println("Opcao invalida! Digite 1 ou 2");
		}
		
		}while(!ler.matches("[12]"));
		
		//---------------------------------------------------
		
		}while(op1 == 1);
		
		System.out.println("Ocorreu tudo certo!");

		
		entrada.close();
		
		
	}

}
