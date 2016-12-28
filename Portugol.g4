grammar Portugol;

@lexer::header{
   package semantica;
}

@parser::header{
   package semantica;
   import java.util.*;
   //import tabelas.*;
}

@parser::members{
	public Map<String, Simbolo> tabelaDeSimbolos = new HashMap<String, Simbolo>();
	public Map<String, Funcao> tabelaDeFuncoes = new HashMap<String, Funcao>();
}

programa: cabecalho ';' declaraVariavies decFunc* comandos+ 'FIM' '.'
	;
declaraVariavies: decVars*
	;
cabecalho: 'PROG' ID
	;
decVars: tipo listaIDs ';'
	;
decParams: tipo listaIDs (';' tipo listaIDs)* 
	;
tipo returns [int tip]: 'INTEIRO' {$tip=1;} | 'REAL' {$tip=2;} | 'BOOLEANO' {$tip=3;} | 'STRING' {$tip=4;}
	;
listaIDs: ID (',' ID)*
	;
decFunc: 'FUNCAO' ID '(' decParams? ')' (':' tipo)? ';' declaraVariavies comandos* 'FIM' ';' //tirei o return final
	;
comandos: atribuicao | leitura | impressao | seEntao | para | enquanto | repita | sair | retorno | chamadaFunc 
	;
chamadaFunc: ID '(' listaExprs ')' ';'
	|  ID '(' listaExprs ')'
	;
seEntao: 'SE' '(' expr ')' 'ENTAO' comandos* senao? 'FIM' ';' 
	;
senao: 'SENAO' comandos* 
	;
para: 'PARA' ID '=' expr 'ATE' expr ('PASSO' expr)? 'FACA' comandos* 'FIM' ';' 
	;
enquanto: 'ENQUANTO' '(' expr ')' 'FACA' comandos* 'FIM' ';'
	;
repita: 'REPITA' comandos* 'ATE' '(' expr ')' ';'
	;
atribuicao: ID '=' expr ';'
	;
leitura: 'LEIA' '(' listaIDs ')' ';'
	;
sair: 'SAIR' ';'
	;
impressao: 'IMPRIMA' '(' expr ')' ';'
	;
expr:  expr op_n7 term1
	| term1 
	;
term1: term1 op_n6 term2
	| term2
	;
term2: term2 op_n5 term3
	| term3
	;
term3: term3 op_n4 term4
	| term4
	;
term4: term4 op_n3 term5
	| term5
	;
term5: term5 op_n2 term6
	| term6
	;
term6: term6 op_n1 fator
	| fator
	;
fator: '(' expr ')' 
	| NUM
	| ID
	| chamadaFunc
	| STRING
	;	
op_n7: '|'
	;
op_n6: '&'
	;	
op_n5: '>=' | '<=' | '>' | '<'
	;
op_n4: '==' | '!='
	;
op_n3: '+' | '-'
	;
op_n2: '*' | '/'
	;
op_n1: '!'
	;
listaExprs: expr (',' expr)*
	;
retorno: 'RETORNE' expr ';' ('RETORNE' expr ';')*
	;
ID: [a-zA-Z][a-zA-Z0-9]*	
	;
NUM: [0-9]+('.'[0-9]+)?
	;
STRING: '\"'[a-zA-Z0-9\t\n\r ]* (',' STRING)* '\"'
	;
WS: [ \t\r\n] -> skip
	;