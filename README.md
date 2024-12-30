# Atividades da 3ª aula do curso de Java: criando a sua primeira aplicação

## Descrição
Este repositório é dedicado as atividades da 3ª aula do curso de Java: criando a sua primeira aplicação. Nessas atividades foi explicado sobre condicionais, laço de repetição e leitura de dados.

## Detalhes técnicos
Para a realização dessas atividades foi utilizada a IDE Intellij. Não houve instalação de bibliotecas externas. A versão do Java utilizada nas atividades é: Java 21. 

## Pré-requisitos
Antes de executar os códigos Java presentes neste repositório, é necessário instalar o JDK (Java Development Kit).
O JDK é indispensável para compilar o código-fonte (.java) e gerar arquivos .class, que contêm os bytecodes essenciais para que a máquina execute o programa. O bytecode é uma linguagem intermediária compreendida pela Máquina Virtual Java (JVM), mas não diretamente pelos seres humanos. Essa conversão da linguagem Java para bytecode ocorre durante a compilação, por isso a instalação do JDK é imprescindível.

Caso este repositório já incluísse os arquivos .class gerados a partir do código-fonte, seria necessário apenas instalar o JRE (Java Runtime Environment). O JRE fornece o ambiente necessário para executar o bytecode, dispensando a necessidade de compilação. Da mesma forma, se o repositório contivesse um arquivo .jar (um executável Java), apenas a instalação do JRE seria suficiente.

Essas instalações, tanto do JDK quanto do JRE, são importantes porque incluem a Máquina Virtual Java (JVM), responsável por interpretar e executar o bytecode, garantindo a execução do programa Java.

**Link de instalação do JDK e JRE:**
1. JDK: https://www.oracle.com/br/java/technologies/downloads/
2. JRE: https://www.java.com/pt-BR/download/manual.jsp
   
*Importante: ao instalar o JDK escolha a versão com suporte, ela é identificada pela sigla LTS*

**Link de instalação do Intellij e tutorial de uso:**
1. Instalação: https://www.jetbrains.com/pt-br/idea/
2. Tutotrial de uso: https://www.youtube.com/watch?v=0_e9Egeyk2E

*Importante: ao instalar o Intellij escolha a edição community, ela é gratuita*

## Conteúdo estudado e aprendido com o desenvolvimento dessas atividades: 
O contexto presente em todos os programas desenvolvidos nesta etapa do curso é sobre o projeto final do curso: desenvolvimento de uma plataforma de streaming. Inicialmente nessa etapa do curso não foi utilizado o paradigma de orientação a objetos.

**Condicionais:** utilizamos as condicionais para verificar se um filme está ou não incluso no plano e posteriormente enviar uma mensagem para o usuário com esta informação. Para a realização de condicionais é necessário o usado de expressões lógicas que retornem um valor booleano: true ou false.

**Leitura de dados:** utilizamos a classe Scanner para receber entrada de dados do usúario pelo terminal, neste contexto o usuário dispõe informações sobre o filme. A leitura dos dados ocorrre pelo método next que deve ser seguido do tipo de dados correspondente a entrada do usúario, ou seja, se o usuário irá entrar com um tipo de dado inteiro, o método next deverá ser: nextInt(), por exemplo.

**Laços de repetição: while e for:** utilizamos o conhecimento sobre a entrada de dados e aplicamos o conceito de laços de repetição para calcular a média das avaliações dos filmes. While é um laço de repetição que faz uso de uma expressão lógica para executar por um determinado número de vezes uma tarefa específica, essa expressão lógica deve retornar: true até que toda a tarefa seja finalizada, ou seja, enquanto a expressão lógica for verdadeira, execute as determinadas instruções. For é um laço de repetição que faz uso do incremento ou decremento aplicado a um contador de vezes, esse contador deverá em um momento específicado pela regra de negócio atingir o limite de vezes necesário para ter a execução completa das instruções.

**Jogo de Adivinhação:** 
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

