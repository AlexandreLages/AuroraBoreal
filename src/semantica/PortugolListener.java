// Generated from Portugol.g4 by ANTLR 4.4

   package semantica;
   import java.util.*;
   //import tabelas.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortugolParser}.
 */
public interface PortugolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortugolParser#decParams}.
	 * @param ctx the parse tree
	 */
	void enterDecParams(@NotNull PortugolParser.DecParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decParams}.
	 * @param ctx the parse tree
	 */
	void exitDecParams(@NotNull PortugolParser.DecParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull PortugolParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull PortugolParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#sair}.
	 * @param ctx the parse tree
	 */
	void enterSair(@NotNull PortugolParser.SairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#sair}.
	 * @param ctx the parse tree
	 */
	void exitSair(@NotNull PortugolParser.SairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull PortugolParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull PortugolParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull PortugolParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull PortugolParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#listaExprs}.
	 * @param ctx the parse tree
	 */
	void enterListaExprs(@NotNull PortugolParser.ListaExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#listaExprs}.
	 * @param ctx the parse tree
	 */
	void exitListaExprs(@NotNull PortugolParser.ListaExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(@NotNull PortugolParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(@NotNull PortugolParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(@NotNull PortugolParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(@NotNull PortugolParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(@NotNull PortugolParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(@NotNull PortugolParser.Term2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#repita}.
	 * @param ctx the parse tree
	 */
	void enterRepita(@NotNull PortugolParser.RepitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#repita}.
	 * @param ctx the parse tree
	 */
	void exitRepita(@NotNull PortugolParser.RepitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term3}.
	 * @param ctx the parse tree
	 */
	void enterTerm3(@NotNull PortugolParser.Term3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term3}.
	 * @param ctx the parse tree
	 */
	void exitTerm3(@NotNull PortugolParser.Term3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(@NotNull PortugolParser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(@NotNull PortugolParser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term6}.
	 * @param ctx the parse tree
	 */
	void enterTerm6(@NotNull PortugolParser.Term6Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term6}.
	 * @param ctx the parse tree
	 */
	void exitTerm6(@NotNull PortugolParser.Term6Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PortugolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PortugolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term4}.
	 * @param ctx the parse tree
	 */
	void enterTerm4(@NotNull PortugolParser.Term4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term4}.
	 * @param ctx the parse tree
	 */
	void exitTerm4(@NotNull PortugolParser.Term4Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#term5}.
	 * @param ctx the parse tree
	 */
	void enterTerm5(@NotNull PortugolParser.Term5Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#term5}.
	 * @param ctx the parse tree
	 */
	void exitTerm5(@NotNull PortugolParser.Term5Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#seEntao}.
	 * @param ctx the parse tree
	 */
	void enterSeEntao(@NotNull PortugolParser.SeEntaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#seEntao}.
	 * @param ctx the parse tree
	 */
	void exitSeEntao(@NotNull PortugolParser.SeEntaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull PortugolParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull PortugolParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull PortugolParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull PortugolParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#decVars}.
	 * @param ctx the parse tree
	 */
	void enterDecVars(@NotNull PortugolParser.DecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decVars}.
	 * @param ctx the parse tree
	 */
	void exitDecVars(@NotNull PortugolParser.DecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(@NotNull PortugolParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(@NotNull PortugolParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(@NotNull PortugolParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(@NotNull PortugolParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n1}.
	 * @param ctx the parse tree
	 */
	void enterOp_n1(@NotNull PortugolParser.Op_n1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n1}.
	 * @param ctx the parse tree
	 */
	void exitOp_n1(@NotNull PortugolParser.Op_n1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n2}.
	 * @param ctx the parse tree
	 */
	void enterOp_n2(@NotNull PortugolParser.Op_n2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n2}.
	 * @param ctx the parse tree
	 */
	void exitOp_n2(@NotNull PortugolParser.Op_n2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n3}.
	 * @param ctx the parse tree
	 */
	void enterOp_n3(@NotNull PortugolParser.Op_n3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n3}.
	 * @param ctx the parse tree
	 */
	void exitOp_n3(@NotNull PortugolParser.Op_n3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(@NotNull PortugolParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(@NotNull PortugolParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#impressao}.
	 * @param ctx the parse tree
	 */
	void enterImpressao(@NotNull PortugolParser.ImpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#impressao}.
	 * @param ctx the parse tree
	 */
	void exitImpressao(@NotNull PortugolParser.ImpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n4}.
	 * @param ctx the parse tree
	 */
	void enterOp_n4(@NotNull PortugolParser.Op_n4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n4}.
	 * @param ctx the parse tree
	 */
	void exitOp_n4(@NotNull PortugolParser.Op_n4Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n5}.
	 * @param ctx the parse tree
	 */
	void enterOp_n5(@NotNull PortugolParser.Op_n5Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n5}.
	 * @param ctx the parse tree
	 */
	void exitOp_n5(@NotNull PortugolParser.Op_n5Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n6}.
	 * @param ctx the parse tree
	 */
	void enterOp_n6(@NotNull PortugolParser.Op_n6Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n6}.
	 * @param ctx the parse tree
	 */
	void exitOp_n6(@NotNull PortugolParser.Op_n6Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull PortugolParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull PortugolParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#op_n7}.
	 * @param ctx the parse tree
	 */
	void enterOp_n7(@NotNull PortugolParser.Op_n7Context ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#op_n7}.
	 * @param ctx the parse tree
	 */
	void exitOp_n7(@NotNull PortugolParser.Op_n7Context ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(@NotNull PortugolParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(@NotNull PortugolParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#declaraVariavies}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraVariavies(@NotNull PortugolParser.DeclaraVariaviesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#declaraVariavies}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraVariavies(@NotNull PortugolParser.DeclaraVariaviesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void enterDecFunc(@NotNull PortugolParser.DecFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void exitDecFunc(@NotNull PortugolParser.DecFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#chamadaFunc}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFunc(@NotNull PortugolParser.ChamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#chamadaFunc}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFunc(@NotNull PortugolParser.ChamadaFuncContext ctx);
}