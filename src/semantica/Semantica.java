package semantica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import semantica.PortugolParser.AddContext;
import semantica.PortugolParser.AndContext;
import semantica.PortugolParser.ArgumentsContext;
import semantica.PortugolParser.AssignmentContext;
import semantica.PortugolParser.BranchContext;
import semantica.PortugolParser.DecIdsContext;
import semantica.PortugolParser.DiffContext;
import semantica.PortugolParser.DivContext;
import semantica.PortugolParser.EnquantoContext;
import semantica.PortugolParser.EqContext;
import semantica.PortugolParser.ExprCallFunctionContext;
import semantica.PortugolParser.FactorUnaryContext;
import semantica.PortugolParser.FuncaoContext;
import semantica.PortugolParser.GeContext;
import semantica.PortugolParser.GtContext;
import semantica.PortugolParser.ImprimeContext;
import semantica.PortugolParser.LeContext;
import semantica.PortugolParser.LeiaContext;
import semantica.PortugolParser.LtContext;
import semantica.PortugolParser.MinusUnaryContext;
import semantica.PortugolParser.MultiContext;
import semantica.PortugolParser.NotUnaryContext;
import semantica.PortugolParser.OrContext;
import semantica.PortugolParser.ParaContext;
import semantica.PortugolParser.ParamDeclarationContext;
import semantica.PortugolParser.ProgramContext;
import semantica.PortugolParser.RepitaContext;
import semantica.PortugolParser.SubContext;
import semantica.PortugolParser.VarDeclarationContext;

public class Semantica extends PortugolBaseListener{
	private Map<String, Variavel> variaveisGlobais = new HashMap<>();
	private Map<String, Variavel> variaveisLocais = new HashMap<>();
	private Map<String, String> funcoes = new HashMap<>();
	private List<String> erros = new ArrayList<String>();
	private List<String> palavrasReservadas = new ArrayList<String>();
	public PrintWriter salvar;
	public FileWriter codigo;

	public Semantica(FileWriter codigo) {
		this.codigo = codigo;
		salvar = new PrintWriter(codigo);
	}

	@Override
	public void enterParamDeclaration(ParamDeclarationContext ctx) {
		String tipo = ctx.type().t;
		if(variaveisGlobais.get(ctx.IDENTIFIER.getText())  != null){
			erros.add("Parametro ou variavel local já declarada anteriormente: " + ctx.IDENTIFIER.getText());
		}else{
			variaveisGlobais.put(ctx.IDENTIFIER.getText(), new Variavel(variaveisGlobais.size(), tipo));
			declaraVariavelEmJasmin(tipo, variaveisGlobais.size());
		}
	}

	@Override
	public void enterVarDeclaration(VarDeclarationContext ctx) {
		String tipo = ctx.type().t;
		boolean reservada = false;
		for (String string : palavrasReservadas) {
			if (ctx.IDENTIFIER.getText().equals(string)) {
				reservada = true;
			}
		}
		if (reservada == true) {
			erros.add("O identificador "+ctx.IDENTIFIER.getText()+" é uma palavra reservada da linguagem");
		}else if(variaveisGlobais.get(ctx.IDENTIFIER.getText())  != null){
			erros.add("Identificador já declarado anteriormente: " + ctx.IDENTIFIER.getText());
		}else{
			variaveisGlobais.put(ctx.IDENTIFIER.getText(), new Variavel(variaveisGlobais.size(), tipo));
			declaraVariavelEmJasmin(tipo, variaveisGlobais.size());
		}
	}

	@Override
	public void enterDecIds(DecIdsContext ctx) {
		String tipo = ctx.t;
		if(variaveisGlobais.get(ctx.IDENTIFIER.getText()) != null){
			erros.add("Identificador já declarado anteriormente: " + ctx.IDENTIFIER.getText());
		}else{
			variaveisGlobais.put(ctx.IDENTIFIER.getText(), new Variavel(variaveisGlobais.size(), tipo));
			declaraVariavelEmJasmin(tipo, variaveisGlobais.get(ctx.IDENTIFIER.getText()).getEnredeco());
		}
	}

	@Override
	public void enterFuncao(FuncaoContext ctx) {
		variaveisLocais = variaveisGlobais;
		variaveisGlobais = new HashMap<>(); 
		if(variaveisGlobais.get(ctx.IDENTIFIER.getText()) != null){
			erros.add("Variável já declarada anteriormente com mesmo identificador: " + ctx.IDENTIFIER.getText());

		}
		if(funcoes.get(ctx.IDENTIFIER.getText()) != null){
			erros.add("Função já declarada anteriormente com mesmo identificador: " + ctx.IDENTIFIER.getText());
		}

		if(ctx.type != null){
			funcoes.put(ctx.IDENTIFIER.getText(), ctx.type().t);
		}else{
			funcoes.put(ctx.IDENTIFIER.getText(), null);
		}
	}



	@Override
	public void exitFuncao(FuncaoContext ctx) {
		if(ctx.type == null){
			if(ctx.RETURN() != null){
				erros.add("Função " + ctx.IDENTIFIER.getText() + " é void, porém está com retorno");
			}
		}
		variaveisGlobais = variaveisLocais;
		variaveisLocais = new HashMap<>();
	}

	@Override
	public void enterPara(ParaContext ctx) {
		String identificador = ctx.mainVar.getText();
		if(variaveisLocais.get(identificador) != null){
			if(!variaveisLocais.get(identificador).getTipo().equals("int")){
				erros.add("Contador " + identificador + " não declarado como inteiro localmente");
			}
		}else if(variaveisGlobais.get(identificador) != null){
			if(!variaveisGlobais.get(identificador).getTipo().equals("int")){
				erros.add("Contador " + identificador + " não declarado como inteiro globalmente");
			}
		}else{
			erros.add("Contador " + identificador + " não declarado anteriormente");
		}
	}

	@Override
	public void enterBranch(BranchContext ctx) {
		String tipo = ctx.bool().t;
		if(!tipo.equals("bool")){
			erros.add("Tipo da expressão não retorna um booleano");
		}
	}

	@Override
	public void enterEnquanto(EnquantoContext ctx) {
		String tipo = ctx.bool().t;
		if(!tipo.equals("bool")){
			erros.add("Tipo da expressão não retorna um booleano");
		}
	}

	@Override
	public void enterRepita(RepitaContext ctx) {
		String tipo = ctx.bool().t;
		if(!tipo.equals("bool")){
			erros.add("Tipo da expressão não retorna um booleano");
		}
	}

	@Override
	public void enterOr(OrContext ctx) {
		String bool = ctx.bool().t;
		String join = ctx.join().t;
		if(!bool.equals("bool")){
			erros.add("Um dos operandos da expressão não retorna um booleano");
		}else if(!join.equals("bool")){
			erros.add("Um dos operandos da expressão não retorna um booleano");
		}
	}

	@Override
	public void enterAnd(AndContext ctx) {
		String join = ctx.join().t;
		String equality = ctx.equality().t;
		if(!join.equals("bool")){
			erros.add("Um dos operandos da expressão não retorna um booleano");
		}else if(!equality.equals("bool")){
			erros.add("Um dos operandos da expressão não retorna um booleano");
		}
	}

	@Override
	public void enterEq(EqContext ctx) {
		String equality = ctx.equality().t;
		String rel = ctx.rel().t;
		if(!equality.equals(rel)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterDiff(DiffContext ctx) {
		String equality = ctx.equality().t;
		String rel = ctx.rel().t;
		if(!equality.equals(rel)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterLt(LtContext ctx) {
		String expr1 = ctx.expr(0).t;
		String expr2 = ctx.expr(1).t;
		if(!expr1.equals(expr2)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterLe(LeContext ctx) {
		String expr1 = ctx.expr(0).t;
		String expr2 = ctx.expr(1).t;
		if(!expr1.equals(expr2)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterGe(GeContext ctx) {
		String expr1 = ctx.expr(0).t;
		String expr2 = ctx.expr(1).t;
		if(!expr1.equals(expr2)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterGt(GtContext ctx) {
		String expr1 = ctx.expr(0).t;
		String expr2 = ctx.expr(1).t;
		if(!expr1.equals(expr2)){
			erros.add("Comparação de tipos diferentes");
		}
	}

	@Override
	public void enterAdd(AddContext ctx) {

	}

	@Override
	public void enterSub(SubContext ctx) {

	}

	@Override
	public void enterDiv(DivContext ctx) {

	}

	@Override
	public void enterExprCallFunction(ExprCallFunctionContext ctx) {

	}

	@Override
	public void enterMulti(MultiContext ctx) {
	}

	@Override
	public void enterNotUnary(NotUnaryContext ctx) {
		String tipo = ctx.unary().t;
		if(!tipo.equals("bool")){
			erros.add("Tentativa de utilizar o minus booleano para uma variável não booleana");
		}
	}

	@Override
	public void enterFactorUnary(FactorUnaryContext ctx) {
	}



	@Override
	public void enterMinusUnary(MinusUnaryContext ctx) {
		String tipo = ctx.unary().t;
		if(!tipo.equals("int") && !tipo.equals("real")){
			erros.add("Tentativa de utilizar o minus aritmetico para uma variável não inteira ou não real");
		}
	}

	@Override
	public void enterArguments(ArgumentsContext ctx) {
		if(ctx.isEmpty()){
			erros.add("Chamada de funcoes sem argumentos");
		}
	}

	@Override
	public void enterAssignment(AssignmentContext ctx) {
		String identificador = ctx.IDENTIFIER().getText();
		if(variaveisGlobais.get(identificador) != null){
			if(!variaveisGlobais.get(identificador).getTipo().equals(ctx.stringOrExpr().a.t)){
				erros.add("A variável " + identificador + " não foi declarada para o tipo que está sendo atribuída");
			}
		}else{
			erros.add("A variável " + identificador + " não foi declarada anteriormente para ser utilizada");
		}
	}

	private void declaraVariavelEmJasmin(String tipo, int endereco){
		switch(tipo){
		case "int":
			salvar.printf("\t\tldc " + 0 + "\n");
			salvar.printf("\t\tistore " + endereco + "\n");
			break;
		case "real":
			salvar.printf("\t\tldc " + 0 + "\n");
			salvar.printf("\t\tfstore " + endereco + "\n");
			break;
		case "bool":
			salvar.printf("\t\tldc " + "\"FALSO\"" + "\n");
			salvar.printf("\t\tastore " + endereco + "\n");
			break;
		case "string":
			salvar.printf("\t\tldc " + "\"\"" + "\n");
			salvar.printf("\t\tastore " + endereco + "\n");
			break;
		}
	}

	private void ldc(String tipo, String valor){
		switch(tipo){
		case "int":
			salvar.printf("\t\tldc " + valor + "\n");
			break;
		case "real":
			salvar.printf("\t\tldc " + valor + "\n");
			break;
		case "bool":
			salvar.printf("\t\tldc " + valor + "\n");
			break;
		case "string":
			salvar.printf("\t\tldc " + valor + "\n");
			break;
		}
	}

	private String tipoEmJasmin(String type){
		switch(type){
		case "int": return "I";
		case "real": return "F";
		case "bool": return "I"; 
		case "string": return "Ljava/lang/String;"; 
		case "void": return "";
		}
		return "";
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	public Map<String, Variavel> getVariaveisGlobais() {
		return variaveisGlobais;
	}

	public void setVariaveisGlobais(Map<String, Variavel> variaveisGlobais) {
		this.variaveisGlobais = variaveisGlobais;
	}

	public Map<String, Variavel> getVariaveisLocais() {
		return variaveisLocais;
	}

	public void setVariaveisLocais(Map<String, Variavel> variaveisLocais) {
		this.variaveisLocais = variaveisLocais;
	}

	public Map<String, String> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(Map<String, String> funcoes) {
		this.funcoes = funcoes;
	}

	public List<String> getPalavrasReservadas() {
		return palavrasReservadas;
	}

	public void setPalavrasReservadas(List<String> palavrasReservadas) {
		this.palavrasReservadas = palavrasReservadas;
	}
}