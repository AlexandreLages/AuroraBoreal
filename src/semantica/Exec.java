package semantica;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Exec {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("C:\\Users\\Irvayne Matheus\\Documents\\main.txt");
        ANTLRInputStream stream = new ANTLRInputStream(input);
		
        PortugolLexer lexer = new PortugolLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        ErroSintaxeListener syntaxError = new ErroSintaxeListener();
        
        PortugolParser parser = new PortugolParser(tokens);
        parser.addErrorListener(syntaxError);
        
        ParseTree tree = parser.program();
        
        FileWriter codigo = new FileWriter("C:\\Users\\Irvayne Matheus\\Documents\\main.j");
        
        ParseTreeWalker walker = new ParseTreeWalker();
        Semantica semantica = new Semantica(codigo);
        walker.walk(semantica, tree);
        
        if(!syntaxError.getErroSintaxe().isEmpty()) {
            for(ErroSintaxeException erro: syntaxError.getErroSintaxe()) {
            	System.out.println(erro.toString());
            }                
        }
        
        System.out.println("\nErros encontrados\n");
        for(String erro : semantica.getErros()){
        	System.out.println(erro);
        }        
	}
}