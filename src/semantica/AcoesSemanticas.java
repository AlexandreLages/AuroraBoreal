package semantica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import semantica.PortugolParser.AtribuicaoContext;
import semantica.PortugolParser.CabecalhoContext;
import semantica.PortugolParser.ChamadaFuncContext;
import semantica.PortugolParser.ComandosContext;
import semantica.PortugolParser.DecFuncContext;
import semantica.PortugolParser.DecParamsContext;
import semantica.PortugolParser.DecVarsContext;
import semantica.PortugolParser.EnquantoContext;
import semantica.PortugolParser.ExprContext;
import semantica.PortugolParser.FatorContext;
import semantica.PortugolParser.ImpressaoContext;
import semantica.PortugolParser.LeituraContext;
import semantica.PortugolParser.ListaExprsContext;
import semantica.PortugolParser.ListaIDsContext;
import semantica.PortugolParser.Op_n1Context;
import semantica.PortugolParser.Op_n2Context;
import semantica.PortugolParser.Op_n3Context;
import semantica.PortugolParser.Op_n4Context;
import semantica.PortugolParser.Op_n5Context;
import semantica.PortugolParser.Op_n6Context;
import semantica.PortugolParser.Op_n7Context;
import semantica.PortugolParser.ParaContext;
import semantica.PortugolParser.ProgramaContext;
import semantica.PortugolParser.RepitaContext;
import semantica.PortugolParser.RetornoContext;
import semantica.PortugolParser.SairContext;
import semantica.PortugolParser.SeEntaoContext;
import semantica.PortugolParser.SenaoContext;
import semantica.PortugolParser.Term1Context;
import semantica.PortugolParser.Term2Context;
import semantica.PortugolParser.Term3Context;
import semantica.PortugolParser.Term4Context;
import semantica.PortugolParser.Term5Context;
import semantica.PortugolParser.Term6Context;
import semantica.PortugolParser.TipoContext;
import tabelas.Categoria;
import tabelas.Funcao;
import tabelas.Simbolo;

public class AcoesSemanticas extends PortugolBaseListener{
	public PortugolParser parser;
	public List<String> mensagensDeErro = new ArrayList<String>();
	public List<String> mensagensDeSaida = new ArrayList<String>();
	PrintWriter salvar;
	FileWriter codigoDeMaquina;
	
	public AcoesSemanticas(PortugolParser parser, FileWriter codigoDeMaquina){
		this.parser = parser;
		this.codigoDeMaquina = codigoDeMaquina;
		salvar = new PrintWriter(codigoDeMaquina);
	}

	@Override
	public void enterDecParams(DecParamsContext ctx) {
		// TODO Auto-generated method stub
		super.enterDecParams(ctx);
	}

	@Override
	public void exitDecParams(DecParamsContext ctx) {
		// TODO Auto-generated method stub
		super.exitDecParams(ctx);
	}

	@Override
	public void enterTipo(TipoContext ctx) {
		// TODO Auto-generated method stub
		super.enterTipo(ctx);
	}

	@Override
	public void exitTipo(TipoContext ctx) {
		// TODO Auto-generated method stub
		super.exitTipo(ctx);
	}

	@Override
	public void enterSair(SairContext ctx) {
		// TODO Auto-generated method stub
		super.enterSair(ctx);
	}

	@Override
	public void exitSair(SairContext ctx) {
		// TODO Auto-generated method stub
		super.exitSair(ctx);
	}

	@Override
	public void enterEnquanto(EnquantoContext ctx) {
		// TODO Auto-generated method stub
		super.enterEnquanto(ctx);
	}

	@Override
	public void exitEnquanto(EnquantoContext ctx) {
		// TODO Auto-generated method stub
		super.exitEnquanto(ctx);
	}

	@Override
	public void enterPrograma(ProgramaContext ctx) {
	}

	@Override
	public void exitPrograma(ProgramaContext ctx) {
		// TODO Auto-generated method stub
		super.exitPrograma(ctx);
		salvar.printf("\treturn\n");
		salvar.printf(".end method");
		try {
			codigoDeMaquina.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void enterListaExprs(ListaExprsContext ctx) {
		// TODO Auto-generated method stub
		super.enterListaExprs(ctx);
	}

	@Override
	public void exitListaExprs(ListaExprsContext ctx) {
		// TODO Auto-generated method stub
		super.exitListaExprs(ctx);
	}

	@Override
	public void enterSenao(SenaoContext ctx) {
		// TODO Auto-generated method stub
		super.enterSenao(ctx);
	}

	@Override
	public void exitSenao(SenaoContext ctx) {
		// TODO Auto-generated method stub
		super.exitSenao(ctx);
	}

	@Override
	public void enterPara(ParaContext ctx) {
		// TODO Auto-generated method stub
		super.enterPara(ctx);
	}

	@Override
	public void exitPara(ParaContext ctx) {
		// TODO Auto-generated method stub
		super.exitPara(ctx);
	}

	@Override
	public void enterTerm2(Term2Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm2(ctx);
	}

	@Override
	public void exitTerm2(Term2Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm2(ctx);
	}

	@Override
	public void enterRepita(RepitaContext ctx) {
		// TODO Auto-generated method stub
		super.enterRepita(ctx);
	}

	@Override
	public void exitRepita(RepitaContext ctx) {
		// TODO Auto-generated method stub
		super.exitRepita(ctx);
	}

	@Override
	public void enterTerm3(Term3Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm3(ctx);
	}

	@Override
	public void exitTerm3(Term3Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm3(ctx);
	}

	@Override
	public void enterTerm1(Term1Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm1(ctx);
	}

	@Override
	public void exitTerm1(Term1Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm1(ctx);
	}

	@Override
	public void enterTerm6(Term6Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm6(ctx);
	}

	@Override
	public void exitTerm6(Term6Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm6(ctx);
	}

	@Override
	public void enterExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		super.enterExpr(ctx);
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		super.exitExpr(ctx);
	}

	@Override
	public void enterTerm4(Term4Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm4(ctx);
	}

	@Override
	public void exitTerm4(Term4Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm4(ctx);
	}

	@Override
	public void enterTerm5(Term5Context ctx) {
		// TODO Auto-generated method stub
		super.enterTerm5(ctx);
	}

	@Override
	public void exitTerm5(Term5Context ctx) {
		// TODO Auto-generated method stub
		super.exitTerm5(ctx);
	}

	@Override
	public void enterSeEntao(SeEntaoContext ctx) {
		// TODO Auto-generated method stub
		super.enterSeEntao(ctx);
	}

	@Override
	public void exitSeEntao(SeEntaoContext ctx) {
		// TODO Auto-generated method stub
		super.exitSeEntao(ctx);
	}

	@Override
	public void enterAtribuicao(AtribuicaoContext ctx) {
		// TODO Auto-generated method stub
		super.enterAtribuicao(ctx);
	}

	@Override
	public void exitAtribuicao(AtribuicaoContext ctx) {
		// TODO Auto-generated method stub
		super.exitAtribuicao(ctx);
	}

	@Override
	public void enterComandos(ComandosContext ctx) {
		// TODO Auto-generated method stub
		super.enterComandos(ctx);
	}

	@Override
	public void exitComandos(ComandosContext ctx) {
		// TODO Auto-generated method stub
		super.exitComandos(ctx);
	}

	@Override
	public void enterDecVars(DecVarsContext ctx) {
		// TODO Auto-generated method stub
		super.enterDecVars(ctx);
		for(int i = 0; i < ctx.listaIDs().ID().size(); i++){
			if(!parser.tabelaDeSimbolos.containsKey(ctx.listaIDs().ID(i).getText())){
				if(ctx.tipo().tip == 1) {
					parser.tabelaDeSimbolos.put(ctx.listaIDs().ID(i).getText(), new Simbolo(Categoria.VARIAVEL, ctx.tipo().tip, "0", parser.tabelaDeSimbolos.size()-1));
					salvar.printf("\t\tildc " + 0 + "\n");
					salvar.printf("\t\tistore " + parser.tabelaDeSimbolos.size() + "\n");
				}
				if(ctx.tipo().tip == 2) {
					parser.tabelaDeSimbolos.put(ctx.listaIDs().ID(i).getText(), new Simbolo(Categoria.VARIAVEL, ctx.tipo().tip, "0.0", parser.tabelaDeSimbolos.size()-1));
					salvar.printf("\t\tfldc " + 0.0 + "\n");
					salvar.printf("\t\tfstore " + parser.tabelaDeSimbolos.size() + "\n");
				}
				if(ctx.tipo().tip == 3) {
					parser.tabelaDeSimbolos.put(ctx.listaIDs().ID(i).getText(), new Simbolo(Categoria.VARIAVEL, ctx.tipo().tip, "", parser.tabelaDeSimbolos.size()-1));
				}
				if(ctx.tipo().tip == 4) {
					parser.tabelaDeSimbolos.put(ctx.listaIDs().ID(i).getText(), new Simbolo(Categoria.VARIAVEL, ctx.tipo().tip, "FALSO", parser.tabelaDeSimbolos.size()-1));
					salvar.printf("\t\tldc " + "\"FALSE\"" + "\n");
					salvar.printf("\t\tstore " + parser.tabelaDeSimbolos.size() + "\n");
				}
			}
			else{
				mensagensDeErro.add("ERROR: identificador ja declarado anteriormente: " + ctx.listaIDs().ID(i).getText());
				System.err.println("\nERROR: identificador ja declarado anteriormente: " + ctx.listaIDs().ID(i).getText());
			}
		}
	}

	@Override
	public void exitDecVars(DecVarsContext ctx) {
		// TODO Auto-generated method stub
		super.exitDecVars(ctx);
	}

	@Override
	public void enterListaIDs(ListaIDsContext ctx) {
		// TODO Auto-generated method stub
		super.enterListaIDs(ctx);
	}

	@Override
	public void exitListaIDs(ListaIDsContext ctx) {
		// TODO Auto-generated method stub
		super.exitListaIDs(ctx);
	}

	@Override
	public void enterCabecalho(CabecalhoContext ctx) {
		super.enterCabecalho(ctx);
		salvar.printf(".class public " + ctx.ID().getText() + "\n");
		salvar.printf(".super java/lang/Object\n");
		salvar.printf(".method public static main([Ljava/lang/String;)V\n");
		salvar.printf("\t.limit stack 100\n");
		salvar.printf("\t.limit locals 2\n");
	}

	@Override
	public void exitCabecalho(CabecalhoContext ctx) {
		// TODO Auto-generated method stub
		super.exitCabecalho(ctx);
	}

	@Override
	public void enterOp_n1(Op_n1Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n1(ctx);
	}

	@Override
	public void exitOp_n1(Op_n1Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n1(ctx);
	}

	@Override
	public void enterOp_n2(Op_n2Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n2(ctx);
	}

	@Override
	public void exitOp_n2(Op_n2Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n2(ctx);
	}

	@Override
	public void enterOp_n3(Op_n3Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n3(ctx);
	}

	@Override
	public void exitOp_n3(Op_n3Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n3(ctx);
	}

	@Override
	public void enterRetorno(RetornoContext ctx) {
		// TODO Auto-generated method stub
		super.enterRetorno(ctx);
	}

	@Override
	public void exitRetorno(RetornoContext ctx) {
		// TODO Auto-generated method stub
		super.exitRetorno(ctx);
	}

	@Override
	public void enterImpressao(ImpressaoContext ctx) {
		// TODO Auto-generated method stub
		super.enterImpressao(ctx);
	}

	@Override
	public void exitImpressao(ImpressaoContext ctx) {
		// TODO Auto-generated method stub
		super.exitImpressao(ctx);
	}

	@Override
	public void enterOp_n4(Op_n4Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n4(ctx);
	}

	@Override
	public void exitOp_n4(Op_n4Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n4(ctx);
	}

	@Override
	public void enterOp_n5(Op_n5Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n5(ctx);
	}

	@Override
	public void exitOp_n5(Op_n5Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n5(ctx);
	}

	@Override
	public void enterOp_n6(Op_n6Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n6(ctx);
	}

	@Override
	public void exitOp_n6(Op_n6Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n6(ctx);
	}

	@Override
	public void enterFator(FatorContext ctx) {
		// TODO Auto-generated method stub
		super.enterFator(ctx);
	}

	@Override
	public void exitFator(FatorContext ctx) {
		// TODO Auto-generated method stub
		super.exitFator(ctx);
	}

	@Override
	public void enterOp_n7(Op_n7Context ctx) {
		// TODO Auto-generated method stub
		super.enterOp_n7(ctx);
	}

	@Override
	public void exitOp_n7(Op_n7Context ctx) {
		// TODO Auto-generated method stub
		super.exitOp_n7(ctx);
	}

	@Override
	public void enterLeitura(LeituraContext ctx) {
		// TODO Auto-generated method stub
		super.enterLeitura(ctx);
	}

	@Override
	public void exitLeitura(LeituraContext ctx) {
		// TODO Auto-generated method stub
		super.exitLeitura(ctx);
	}

	@Override
	public void enterDecFunc(DecFuncContext ctx) {
		// TODO Auto-generated method stub
		super.enterDecFunc(ctx);
		if(!parser.tabelaDeFuncoes.containsKey(ctx.ID().getText()) && !parser.tabelaDeSimbolos.containsKey(ctx.ID().getText())){
			Funcao funcao = new Funcao();
			parser.tabelaDeFuncoes.put(ctx.ID().getText(), funcao);
		}else{
			mensagensDeErro.add("ERROR - Funcoes repetidas");
		}
	}

	@Override
	public void exitDecFunc(DecFuncContext ctx) {
		// TODO Auto-generated method stub
		super.exitDecFunc(ctx);
	}

	@Override
	public void enterChamadaFunc(ChamadaFuncContext ctx) {
		// TODO Auto-generated method stub
		super.enterChamadaFunc(ctx);
	}

	@Override
	public void exitChamadaFunc(ChamadaFuncContext ctx) {
		// TODO Auto-generated method stub
		super.exitChamadaFunc(ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}