grammar mal;

//comentario
Comentario:
    '[' ~( '\r'|']'|'[')* '\r'? ']' { skip(); };
WhiteSpace:
    (' ' | '\t' | '\r' | '\n') { skip(); };

delimitador: ':';

//terminais
NUM: [0-9]+;
NOME: ([A-Z] | [0-9]) ([a-zA-Z] | [0-9] | ' ' | '-')*;

//nota e quantidade de episodios
nota: NUM;
qtdEps: NUM;

//palavras reservadas para tipo, genero e publico alvo de animes
tipo_anime: 'TV' | 'Filme' | 'OVA' | 'Especial';
genero: 'Acao' | 'Aventura' | 'Drama' | 'Comedia' | 'Terror' |
        'Fantasia' | 'Scifi' | 'Romance' | 'Misterio' | 
        'SliceOfLife' | 'Sobrenatural' | 'Suspense' | 'Musical' |
        'Esporte';

publico_alvo: 'Livre' | 'Shounen' | 'Seinen' | 'Shoujo' | 'R18';

//nome do anime
nome_anime: NOME;

//estruturas da declaracao + avaliacao
declare_nome: nome_anime;
program: corpo; 
corpo: (declare_anime)+ (declare_avaliacao)* ;
declare_anime:
    'inicio'
        'Nome' ':' declare_nome
        'Tipo' ':' tipo_anime
        'Genero' ':' genero
        'Quantidade_Eps' ':' total_eps
        'Publico_Alvo' ':' publico_alvo
	'fim';

//quantidade de episodios totais
total_eps: qtdEps;

declare_avaliacao:
    'comeco_avaliacao'
        'Nome' ':' cmdAddNome
        'Nota' ':' cmdAddNota
        'Status' ':' cmdAddStatus
        cmdAddEps?
        cmdAddComentario?
    'fim_avaliacao';

//comandos para avaliar animes
cmdAddNome: nome_anime;
cmdAddNota: nota;

//palavras reservadas para status
cmdAddStatus: 'Completo' |'Assistindo' |'Abandonado';

//quantidade de episodios assistidos
cmdAddEps: qtdEps;

//comentario de avaliacao
cmdAddComentario:'"' .*? '"';


//comentario nao fechado
ErroComentarioCodigo: 
    '{'
    { File.AddString("                    <div id=\"erros\">" + 
                    "Comentario de Código não Fechado.</div>\n");
    File.gravaArquivo(); };

//simbolos nao identificados
ANY: 
    .
    { File.AddString("                    <div id=\"erros\">" + 
                    "Símbolo não identificado</div>\n");
    File.gravaArquivo(); };