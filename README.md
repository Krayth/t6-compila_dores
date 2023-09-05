# Trabalho 6 - Compiladores

## Alunos e RAs

- Bruno Matos de Souza - 769754
- Eduardo Minoru Takeda - 776857
- Fernando Eiji Hieda - 769768

## Vídeo de Apresentação
[link do vídeo aqui]

## Sobre

O objetivo deste projeto é criar um compilador para uma linguagem simples criada pelos alunos.

Requisitos Mínimos:
- Análise Léxica + Sintática
- Análise Semântica
- Geração de Código ou Interpretação


Os principais arquivos responsáveis pela conclusão do projeto são:

mal.g4 - Contém as regras para a gramática da linguagem, como estruturas, strings e palavras reservadas.

Semantico.java e SemanticoUtils.java - Realizam as checagens necessárias para identificar tanto a ocorrência quanto o tipo de erro semântico no código analisado.

TabelaDeSimbolos.java - Responsável pela criação e manipulação de tabelas de símbolos que serão utilizadas para a identificação de erros semânticos.

App.java - Contém a função principal do código que lê os arquivos de entrada.

File.java - Responsável por gerar o código em HTML + CSS.

## Descrição da Linguagem

A linguagem desenvolvida foi inspirada no site [MyAnimeList](https://myanimelist.net/), cuja principal atração é a listagem de animes que o usuário tem interesse. Algumas funções desse site são:
- Adicionar um anime do banco de dados à lista do usuário
- Dar uma nota (0-10) ao anime
- Classificar o anime como: Completo, Assistindo, Abandonado, Em Espera, Planejado
- Indicar quantos episódios foram assistidos
- Indicar data de início e término
- Escrever uma resenha na página do anime

Como o projeto não exige tanta complexidade a linguagem está restrita a poucas funções com pequenas modificações:
- Descrever o anime a ser inserido na lista
    - Nome
    - Tipo de mídia
    - Gênero (Limite de 1)
    - Quantidade de Episódios
    - Público Alvo
- Avaliar o anime
    - Dar uma nota (0-10)
    - Classificar como: Completo, Assistindo ou Abandonado
    - Indicar quantos episódios foram assistidos
    - Escrever um comentário sobre o anime revisado

O gerador irá criar uma página HTML com uma lista dos animes declarados e caixas com as avaliações do usuário.

## Pré-Requisitos

- Java 11
- ANTLR 4.11.1
- Maven 4.0.0

## Instalação de Dependências

Instalar JDK 11.0.18 de alguma fonte.

## Execução do programa

Para compilar o programa escreva o comando:
´´´
mvn package
´´´

Para executar o programa é necessário 3 endereços/caminhos de arquivos:
- Endereço para o arquivo de dependências .jar
- Endereço para o arquivo de entrada .txt
- Endereço para o arquivo de saida .html

Tendo esses três endereços use:
´´´
Java -jar [endereço do .jar] [endereço do .txt] [endereço do .html]
´´´

Exemplo:
´´´
Java -jar C:\User\Nome\Desktop\t6-compila_dores\mal\target\mal-1.0-SNAPSHOT-jar-with-dependencies.jar C:\User\Nome\Desktop\Entradas\teste1.txt C:\User\Nome\Desktop\Saidas\teste1.html
´´´