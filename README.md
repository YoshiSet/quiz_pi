🎯 Quiz em Java — Projeto Integrador

Projeto de Quiz desenvolvido em Java como parte de um Projeto Integrador. A aplicação funciona no terminal e apresenta perguntas de conhecimentos gerais com alternativas de A a E, ordem de questões aleatória, validação das respostas e sistema de pontuação baseado na dificuldade de cada questão.

O projeto também registra a evolução do desenvolvimento, contendo diferentes versões da implementação e experimentos com organização das funções, sorteio das perguntas e criação de um placar.

📌 Sobre o projeto

O objetivo do projeto é desenvolver uma aplicação simples e interativa utilizando conceitos fundamentais de programação em Java.

Durante a execução, o usuário pode iniciar uma partida e responder a uma sequência de seis perguntas. As questões são apresentadas em uma ordem aleatória, sem repetição durante a partida.

Cada questão possui uma pontuação própria. Dessa forma, o resultado final depende da quantidade de respostas corretas e das questões que foram acertadas.

Principais características

🎮 Quiz executado pelo terminal;

🧠 6 perguntas de conhecimentos gerais;

🔀 Questões apresentadas em ordem aleatória;

♻️ Nenhuma pergunta é repetida durante a mesma partida;

🔤 Respostas de a até e;

✅ Validação da entrada do usuário;

🏆 Sistema de pontuação;

📊 Contagem de acertos e erros;

🎯 Pontuação diferente para determinadas questões;

🖥️ Interface textual com menu e elementos visuais em ASCII;

📚 Organização das responsabilidades em classes e métodos.

🕹️ Como funciona

Ao executar a aplicação, o menu principal é apresentado:

========= MENU =========
1. Iniciar
2. Placar
3. Encerrar

1. Iniciar

A opção Iniciar cria uma lista contendo os índices das seis perguntas:

[0, 1, 2, 3, 4, 5]

Essa lista é embaralhada usando Collections.shuffle().

Depois, a aplicação percorre os seis índices. A cada rodada, o primeiro índice da lista é retirado com remove(0) e utilizado para acessar a pergunta correspondente.

Esse processo permite que as seis perguntas sejam apresentadas em uma ordem diferente a cada partida, sem repetir uma questão.

2. Responder

Cada pergunta possui cinco alternativas:

a)
b)
c)
d)
e)

O programa aceita somente uma dessas cinco letras.

A resposta também é convertida para letras minúsculas e espaços extras são removidos. Caso o usuário digite uma opção inválida, o sistema solicita uma nova resposta.

A validação utiliza expressão regular:

resposta.matches("[abcde]")

3. Verificação

Depois que o usuário responde, a aplicação compara a resposta fornecida com o gabarito armazenado na pergunta.

A comparação é realizada por meio do método:

verificarGabarito()

O método retorna true quando a resposta está correta e false quando está incorreta.

4. Pontuação

Cada pergunta possui uma pontuação associada.

Questão

Valor

Capital do Brasil

10 pontos

Quantidade de planetas

10 pontos

Primeiro pouso humano na Lua

15 pontos

Maior oceano do mundo

10 pontos

Lados de um hexágono

10 pontos

Queda do Muro de Berlim

10 pontos

Pontuação máxima

65 pontos

Quando a resposta está correta, os pontos da questão são adicionados à pontuação acumulada.

Quando a resposta está incorreta, o usuário recebe 0 pontos naquela rodada.

🧩 Estrutura do projeto

A implementação principal atualmente utilizada está organizada dentro da pasta Quiz/src/Projeto_quiz/Projeto_quiz(placar).

Estrutura simplificada:

quiz_pi/
└── Quiz/
    ├── bin/
    │   └── Perguntas_quiz/
    │
    └── src/
        ├── Perguntas_quiz/
        │   ├── Funcoes.java
        │   └── Perguntas.java
        │
        ├── Projeto_quiz/
        │   ├── Funcoes.java
        │   ├── excibicao.java
        │   │
        │   └── Projeto_quiz(placar)/
        │       ├── funcoes_quiz.java
        │       └── excibicao.java
        │
        └── quiz_modificado.java

O repositório possui algumas versões e experimentos do projeto. A versão localizada em Projeto_quiz(placar) é a implementação que concentra a lógica mais completa do quiz atualmente.

🏗️ Principais classes

funcoes_quiz.java

Essa classe concentra as principais funções utilizadas pelo quiz.

Entre suas responsabilidades estão:

exibir o logotipo;

imprimir separadores;

exibir o menu;

validar a opção escolhida no menu;

armazenar e selecionar perguntas;

validar respostas;

verificar o gabarito;

retornar informações relacionadas à pontuação.

A classe também utiliza uma matriz bidimensional de String para armazenar as perguntas.

Cada pergunta possui a seguinte estrutura conceitual:

[0] Enunciado
[1] Alternativa A
[2] Alternativa B
[3] Alternativa C
[4] Alternativa D
[5] Alternativa E
[6] Gabarito
[7] Pontuação

Por exemplo:

perguntas[indice][6]

representa o gabarito da pergunta selecionada, enquanto:

perguntas[indice][7]

representa a pontuação correspondente.

excibicao.java

Essa é a classe responsável pelo fluxo principal da aplicação.

Ela contém o método:

public static void main(String args[])

O fluxo principal pode ser resumido da seguinte forma:

Início
  ↓
Exibe logo
  ↓
Exibe menu
  ↓
Usuário escolhe uma opção
  ↓
Iniciar quiz?
  ↓
Cria índices das perguntas
  ↓
Embaralha os índices
  ↓
Seleciona uma pergunta
  ↓
Usuário responde
  ↓
Valida resposta
  ↓
Compara com gabarito
  ↓
Adiciona pontos se acertar
  ↓
Repete até responder as 6 perguntas
  ↓
Exibe resultado final

O programa mantém três informações principais durante a partida:

int errou = 0;
int acertou = 0;
int pontos = 0;

Ao final, essas informações são apresentadas ao usuário.

🔀 Como funciona o sorteio das perguntas

Um dos pontos importantes da implementação é o uso de uma lista de índices.

Primeiro são adicionados os índices das seis perguntas:

ArrayList<Integer> indices = new ArrayList<>();

for (int i = 0; i < 6; i++) {
    indices.add(i);
}

Resultado:

[0, 1, 2, 3, 4, 5]

Em seguida, a lista é embaralhada:

Collections.shuffle(indices, random);

Por exemplo:

[3, 0, 5, 1, 4, 2]

Na hora de selecionar uma pergunta, o primeiro elemento é removido:

int indice = indices.remove(0);

Assim, se o primeiro elemento for 3, a aplicação acessará:

perguntas[3]

Na próxima rodada, o índice 3 já não está mais disponível.

Resultado

Essa abordagem garante:

ordem aleatória;

ausência de repetição;

utilização de todas as seis perguntas durante uma partida.

🧠 Conceitos de Java utilizados

O projeto trabalha diversos conceitos importantes para quem está construindo uma base em Java.

Variáveis e tipos de dados

São utilizados tipos como:

int
char
boolean
String

Eles representam informações como pontuação, respostas, resultados de validações e textos.

Estruturas condicionais

O projeto utiliza:

if
else
switch

Exemplo conceitual:

if (usuarioResponde == gabarito) {
    // adiciona pontos
} else {
    // registra erro
}

Estruturas de repetição

São utilizados:

for
do while

O for é utilizado para percorrer as perguntas e criar os índices.

O do while é utilizado principalmente para garantir que uma entrada inválida seja solicitada novamente.

Arrays

As perguntas são armazenadas em uma matriz:

String[][] perguntas

Isso permite organizar várias perguntas e suas respectivas informações em uma única estrutura.

ArrayList

O projeto utiliza:

ArrayList<Integer>

para armazenar os índices das perguntas.

Collections

O método:

Collections.shuffle()

é utilizado para embaralhar a ordem das perguntas.

Random

A classe:

java.util.Random

é utilizada para trabalhar com aleatoriedade.

Scanner

A entrada de dados do usuário é realizada com:

java.util.Scanner

Expressões regulares

A validação das alternativas utiliza:

matches("[abcde]")

Com isso, somente uma letra entre a e e é aceita.

📚 Perguntas disponíveis

Atualmente, o banco principal contém perguntas sobre conhecimentos gerais, incluindo:

🇧🇷 Geografia;

🌎 Sistema Solar;

🚀 História da exploração espacial;

🌊 Geografia física;

📐 Matemática básica;

🏛️ História mundial.

Exemplos de temas presentes no banco:

Qual é a capital do Brasil?

Quantos planetas existem no Sistema Solar?

Em que ano o ser humano pisou na Lua pela primeira vez?

Qual é o maior oceano do mundo?

Quantos lados tem um hexágono?

Qual evento histórico ocorrido em 1989 simbolizou o fim da Guerra Fria e a futura reunificação da Alemanha?

▶️ Como executar

Pré-requisitos

É necessário ter instalado:

Java JDK

Uma IDE Java, como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java.

Recomenda-se utilizar uma versão moderna do JDK, como Java 17 ou superior.

Pela IDE

Clone o repositório:

git clone https://github.com/DEV-RafaelFreitas/quiz_pi.git

Abra a pasta do projeto na sua IDE.

Acesse:

Quiz/src/Projeto_quiz/Projeto_quiz(placar)

Execute a classe:

excibicao.java

Interaja com o programa pelo terminal da IDE.

Pelo terminal

A estrutura atual possui diferentes versões do projeto, portanto a forma mais simples e segura de execução é utilizar uma IDE e executar a classe excibicao.java da versão Projeto_quiz(placar).

Caso queira compilar manualmente, é importante respeitar os pacotes declarados nos arquivos Java e o diretório de saída dos .class.

🖥️ Exemplo de execução

Uma partida segue aproximadamente este fluxo:

========= MENU =========

1. Iniciar
2. Placar
3. Encerrar

Qual opção: 1


1. Qual a Capital do Brasil?

a) São Paulo
b) Rio de Janeiro
c) Brasília
d) Belo Horizonte
e) Salvador

Qual opção? c

VOCÊ ACERTOU!
VOCÊ RECEBEU 10 PONTOS

SUA PONTUAÇÃO ATUAL É: 10

Depois das seis perguntas:

=== RESULTADO FINAL ===

ACERTOS: 4
ERROS:   2
PONTUAÇÃO: 40

⚠️ Estado atual do projeto

O projeto está em desenvolvimento acadêmico e possui algumas partes que ainda podem ser aprimoradas.

Placar

Apesar de existir uma opção 2. Placar no menu e uma pasta chamada Projeto_quiz(placar), a implementação atual dessa opção ainda não apresenta um ranking funcional.

A estrutura relacionada ao placar aparece no código como uma etapa de desenvolvimento, mas não está completamente integrada ao fluxo principal.

Outras versões

O repositório mantém versões anteriores e experimentais, incluindo:

quiz_modificado.java;

Projeto_quiz/Funcoes.java;

Projeto_quiz/excibicao.java;

Perguntas_quiz/Perguntas.java;

Perguntas_quiz/Funcoes.java;

uma implementação posterior com sistema de pontuação.

Esses arquivos são úteis para acompanhar a evolução do projeto e as diferentes abordagens utilizadas durante o desenvolvimento.

🔧 Possíveis melhorias

Algumas evoluções que podem ser implementadas futuramente:

🏆 Sistema de ranking

Implementar um placar real contendo:

Posição | Jogador | Pontuação
--------|---------|----------
1º      | Rafael  | 65
2º      | João    | 50
3º      | Maria   | 40

🧱 Melhor organização das perguntas

Em vez de utilizar uma matriz de String, pode ser criada uma classe própria:

public class Pergunta {
    private String enunciado;
    private String[] alternativas;
    private char gabarito;
    private int pontuacao;
}

Isso tornaria o código mais legível e aproximaria o projeto dos princípios de Orientação a Objetos.

🗂️ Separação do banco de perguntas

As perguntas podem ser transferidas para:

arquivo .txt;

.csv;

JSON;

banco de dados.

Assim, novas perguntas poderiam ser adicionadas sem alterar diretamente o código Java.

🎚️ Sistema de dificuldade

As perguntas podem ser organizadas em:

Fácil
Médio
Difícil

Cada nível poderia possuir uma pontuação diferente.

📊 Estatísticas

Adicionar informações como:

percentual de acertos;

quantidade total de partidas;

maior pontuação;

média de pontos;

melhor jogador.

🎨 Interface gráfica

Uma evolução natural seria transformar o projeto de console em uma aplicação gráfica utilizando, por exemplo:

JavaFX;

Swing.

🎓 Objetivo acadêmico

O projeto foi desenvolvido com foco no aprendizado e na aplicação prática de conceitos de programação.

Entre os conhecimentos trabalhados estão:

lógica de programação;

estruturas condicionais;

estruturas de repetição;

arrays;

listas;

métodos;

entrada e saída de dados;

validação de informações;

aleatoriedade;

organização de código;

primeiros conceitos de modularização.

O projeto também demonstra uma evolução incremental: diferentes versões foram mantidas no repositório para registrar tentativas, melhorias e mudanças na implementação.

📈 Evolução da implementação

De forma geral, o desenvolvimento passou por etapas como:

Versão inicial
     ↓
Perguntas armazenadas em arrays
     ↓
Validação das respostas
     ↓
Sorteio de perguntas
     ↓
Embaralhamento sem repetição
     ↓
Sistema de pontuação
     ↓
Contagem de acertos e erros
     ↓
Tentativa de implementação do placar

Essa evolução é parte importante do projeto, pois demonstra a aplicação gradual de novos conceitos conforme a implementação foi sendo aprimorada.

🛠️ Tecnologias

Tecnologia

Utilização

Java

Linguagem principal

JDK

Compilação e execução

Scanner

Entrada de dados

Random

Aleatoriedade

ArrayList

Controle dos índices

Collections

Embaralhamento

Regex

Validação das respostas

Git

Controle de versão

GitHub

Hospedagem do código

📂 Repositório

O projeto está disponível no GitHub:

DEV-RafaelFreitas/quiz_pi

https://github.com/DEV-RafaelFreitas/quiz_pi

👨‍💻 Autor

Rafael Freitas

Projeto desenvolvido como atividade acadêmica de Projeto Integrador, com foco no desenvolvimento da lógica de programação e na aplicação prática de Java.

📄 Licença

Este projeto foi desenvolvido para fins acadêmicos e de aprendizado.

Caso o projeto seja posteriormente disponibilizado sob uma licença específica, esta seção poderá ser atualizada de acordo com a licença escolhida.

⭐ Considerações finais

O Quiz representa uma aplicação prática de conceitos fundamentais de Java em um problema simples e interativo.

Além da funcionalidade do jogo, o projeto serve como registro da evolução no aprendizado de programação, mostrando a utilização de estruturas de dados, métodos, validação de entradas, aleatoriedade e organização da lógica da aplicação.

Novas funcionalidades podem ser adicionadas conforme o projeto evolui, especialmente o sistema de ranking, uma melhor modelagem das perguntas e uma interface gráfica.
