package br.ufpi.easii.controller;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import semantica.AcoesSemanticas;
import semantica.PortugolLexer;
import semantica.PortugolParser;
import tabelas.Funcao;
import tabelas.Simbolo;



public class Compilador {
	
	/**
	 * Metodo que recebe um path de um arquivo e realiza sua compilacao
	 * @param path
	 * @return
	 * @throws IOException 
	 */
	public static String compilar(String path) throws IOException{
		
			InputStream input = new FileInputStream(path);
	        ANTLRInputStream stream = new ANTLRInputStream(input);
			
	        PortugolLexer lexer = new PortugolLexer(stream);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        
	        PortugolParser parser = new PortugolParser(tokens);
	        ParseTree tree = parser.programa();
	        
	        FileWriter codigoDeMaquina = new FileWriter(path + ".j");
	        
	        ParseTreeWalker walker = new ParseTreeWalker();
	        AcoesSemanticas acoes = new AcoesSemanticas(parser, codigoDeMaquina);
	        walker.walk(acoes, tree);
	        
	        Map<String, Simbolo> simbolos = acoes.parser.tabelaDeSimbolos;
	        for(Map.Entry<String, Simbolo> aux : simbolos.entrySet()){
	        	System.out.println(aux.getValue().getTipo()+" / "+aux.getKey() +" / "+aux.getValue().getValor());
	        }
	        
	        Map<String, Funcao> funcoes = acoes.parser.tabelaDeFuncoes;
	        for(Map.Entry<String, Funcao> aux : funcoes.entrySet()){
	        	System.out.println(aux.getKey());
	        }
	        
	        List<String> erros = acoes.mensagensDeErro;
	        String console = "";
	        for(String aux:erros){
	        	console = console + aux+" \n";
	        }
	        
	        
		return console;
	}
}
