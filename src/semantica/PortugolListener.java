// Generated from Portugol.g4 by ANTLR 4.4

   package semantica;
   import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortugolParser}.
 */
public interface PortugolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull PortugolParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull PortugolParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#statementWBreak}.
	 * @param ctx the parse tree
	 */
	void enterStatementWBreak(@NotNull PortugolParser.StatementWBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#statementWBreak}.
	 * @param ctx the parse tree
	 */
	void exitStatementWBreak(@NotNull PortugolParser.StatementWBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link PortugolParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull PortugolParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link PortugolParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull PortugolParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Diff}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterDiff(@NotNull PortugolParser.DiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Diff}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitDiff(@NotNull PortugolParser.DiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTerm}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(@NotNull PortugolParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTerm}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(@NotNull PortugolParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolEquality}
	 * labeled alternative in {@link PortugolParser#join}.
	 * @param ctx the parse tree
	 */
	void enterBoolEquality(@NotNull PortugolParser.BoolEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolEquality}
	 * labeled alternative in {@link PortugolParser#join}.
	 * @param ctx the parse tree
	 */
	void exitBoolEquality(@NotNull PortugolParser.BoolEqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PortugolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PortugolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PortugolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PortugolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(@NotNull PortugolParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(@NotNull PortugolParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterGt(@NotNull PortugolParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitGt(@NotNull PortugolParser.GtContext ctx);
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
	 * Enter a parse tree produced by {@link PortugolParser#breakLoop}.
	 * @param ctx the parse tree
	 */
	void enterBreakLoop(@NotNull PortugolParser.BreakLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#breakLoop}.
	 * @param ctx the parse tree
	 */
	void exitBreakLoop(@NotNull PortugolParser.BreakLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Real}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterReal(@NotNull PortugolParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitReal(@NotNull PortugolParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Le}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterLe(@NotNull PortugolParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Le}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitLe(@NotNull PortugolParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterFactorUnary(@NotNull PortugolParser.FactorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitFactorUnary(@NotNull PortugolParser.FactorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PortugolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PortugolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull PortugolParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link PortugolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull PortugolParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OtherFunc}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterOtherFunc(@NotNull PortugolParser.OtherFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OtherFunc}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitOtherFunc(@NotNull PortugolParser.OtherFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#stringOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringOrExpr(@NotNull PortugolParser.StringOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#stringOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringOrExpr(@NotNull PortugolParser.StringOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#paramDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclarations(@NotNull PortugolParser.ParamDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#paramDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclarations(@NotNull PortugolParser.ParamDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterLt(@NotNull PortugolParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitLt(@NotNull PortugolParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull PortugolParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull PortugolParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclaration(@NotNull PortugolParser.ParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclaration(@NotNull PortugolParser.ParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermUnary}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermUnary(@NotNull PortugolParser.TermUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermUnary}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermUnary(@NotNull PortugolParser.TermUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolJoin}
	 * labeled alternative in {@link PortugolParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolJoin(@NotNull PortugolParser.BoolJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolJoin}
	 * labeled alternative in {@link PortugolParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolJoin(@NotNull PortugolParser.BoolJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#decIds}.
	 * @param ctx the parse tree
	 */
	void enterDecIds(@NotNull PortugolParser.DecIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decIds}.
	 * @param ctx the parse tree
	 */
	void exitDecIds(@NotNull PortugolParser.DecIdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link PortugolParser#join}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull PortugolParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link PortugolParser#join}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull PortugolParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunc(@NotNull PortugolParser.ReturnFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunc(@NotNull PortugolParser.ReturnFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#paramIds}.
	 * @param ctx the parse tree
	 */
	void enterParamIds(@NotNull PortugolParser.ParamIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#paramIds}.
	 * @param ctx the parse tree
	 */
	void exitParamIds(@NotNull PortugolParser.ParamIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(@NotNull PortugolParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(@NotNull PortugolParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolRel}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterBoolRel(@NotNull PortugolParser.BoolRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolRel}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitBoolRel(@NotNull PortugolParser.BoolRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCallFunction}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExprCallFunction(@NotNull PortugolParser.ExprCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCallFunction}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExprCallFunction(@NotNull PortugolParser.ExprCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Imprime}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterImprime(@NotNull PortugolParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Imprime}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitImprime(@NotNull PortugolParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(@NotNull PortugolParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(@NotNull PortugolParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull PortugolParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull PortugolParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull PortugolParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull PortugolParser.VariableContext ctx);
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
	 * Enter a parse tree produced by {@link PortugolParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull PortugolParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull PortugolParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEq(@NotNull PortugolParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link PortugolParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEq(@NotNull PortugolParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull PortugolParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull PortugolParser.NumberContext ctx);
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
	 * Enter a parse tree produced by the {@code Leia}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterLeia(@NotNull PortugolParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leia}
	 * labeled alternative in {@link PortugolParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitLeia(@NotNull PortugolParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(@NotNull PortugolParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFalse}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(@NotNull PortugolParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PortugolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PortugolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#functionDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarations(@NotNull PortugolParser.FunctionDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#functionDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarations(@NotNull PortugolParser.FunctionDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(@NotNull PortugolParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTrue}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(@NotNull PortugolParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PortugolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PortugolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#blockWBreak}.
	 * @param ctx the parse tree
	 */
	void enterBlockWBreak(@NotNull PortugolParser.BlockWBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#blockWBreak}.
	 * @param ctx the parse tree
	 */
	void exitBlockWBreak(@NotNull PortugolParser.BlockWBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(@NotNull PortugolParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link PortugolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(@NotNull PortugolParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PortugolParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PortugolParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multi}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulti(@NotNull PortugolParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multi}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulti(@NotNull PortugolParser.MultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull PortugolParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link PortugolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull PortugolParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#branchWBreak}.
	 * @param ctx the parse tree
	 */
	void enterBranchWBreak(@NotNull PortugolParser.BranchWBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#branchWBreak}.
	 * @param ctx the parse tree
	 */
	void exitBranchWBreak(@NotNull PortugolParser.BranchWBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortugolParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull PortugolParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull PortugolParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterGe(@NotNull PortugolParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ge}
	 * labeled alternative in {@link PortugolParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitGe(@NotNull PortugolParser.GeContext ctx);
	/**
<<<<<<< HEAD
	 * Enter a parse tree produced by the {@code NotUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
=======
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
>>>>>>> origin/master
	 * @param ctx the parse tree
	 */
	void enterNotUnary(@NotNull PortugolParser.NotUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitNotUnary(@NotNull PortugolParser.NotUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterMinusUnary(@NotNull PortugolParser.MinusUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusUnary}
	 * labeled alternative in {@link PortugolParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitMinusUnary(@NotNull PortugolParser.MinusUnaryContext ctx);
}