grammar mal;


delimitador: ':';

NUM: [0-9]+;
NOME: ([A-Z] | [0-9]) ([a-zA-Z] | [0-9] | ' ' | '-')*;

nota: NUM;
qtdEps: NUM;

tipo_anime: 'TV' | 'Filme' | 'OVA' | 'Especial';
genero: 'Acao' | 'Aventura' | 'Drama' | 'Comedia' | 'Terror' |
        'Fantasia' | 'Scifi' | 'Romance' | 'Misterio' | 
        'SliceOfLife' | 'Sobrenatural' | 'Suspense' | 'Musical' |
        'Esporte';

publico_alvo: 'Shounen' | 'Seinen' | 'Shoujo' | 'R18';

statusCompleto: 'Completo';
statusAssistindo: 'Assistindo';
statusAbandonado: 'Abandonado';

nome_anime: NOME;
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

total_eps: qtdEps;


declare_avaliacao:
    'comeco_avaliacao'
        'Nome' ':' cmdAddNome
        'Nota' ':' cmdAddNota
        'Status' ':' cmdAddStatus
        cmdAddEps?
        cmdAddComentario?
    'fim_avaliacao';

cmdAddNome: nome_anime;
cmdAddNota: nota;
cmdAddStatus: 'Completo' |'Assistindo' |'Abandonado';

cmdAddEps: qtdEps;
cmdAddComentario:
    '{'
        NOME ~( '{' | '}' )*
    '}';

//comentario
Comentario:
    '[' ~('n'|'\r'|']'|'[')* '\r'? ']' { skip(); };
WhiteSpace:
    (' ' | '\t' | '\r' | '\n') { skip(); };

//comentario nao fechado
ErroComentarioCodigo: 
    '{'
    { File.AddString("                    <div id=\"erros\">" + 
                    "Comentario de Código não Fechado.</div>\n");
    File.gravaArquivo(); };

ErroAddComentario:
    '[' 
    { File.AddString("                    <div id=\"erros\">" + 
                    "Comentario de Avaliação não Fechado.</div>\n");
    File.gravaArquivo(); };

ANY: 
    .
    { File.AddString("                    <div id=\"erros\">" + 
                    "Símbolo não identificado</div>\n");
    File.gravaArquivo(); };

//SIMBOLO_NAO_IDENTIFICADO: '~' | '$' | '@' | '|' | '`';
