// Generated from Portugol.g4 by ANTLR 4.4

   package semantica;
<<<<<<< HEAD
   import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
=======
   //import tabelas.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import tabelas.Funcao;
import tabelas.Simbolo;
>>>>>>> origin/master

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, IMPRIME=44, IDENTIFIER=45, 
		NUMBER=46, REAL=47, WS=48, RETURN=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'ENTAO'", "'SAIR'", "'LEIA'", "'REPITA'", 
		"';'", "'REAL'", "'='", "'<='", "'\"'", "'&'", "'('", "'*'", "'FACA'", 
		"','", "'FIM'", "'PASSO'", "'STRING'", "'\n'", "'SE'", "'PROG'", "'\r'", 
		"'ATE'", "'FUNCAO'", "'FALSE'", "'FIM.'", "':'", "'PARA'", "'>='", "'<'", 
		"'=='", "'|'", "'INTEIRO'", "'ENQUANTO'", "'>'", "'!'", "')'", "'+'", 
		"'SENAO'", "'TRUE'", "'-'", "'BOOLEANO'", "'IMPRIMA'", "IDENTIFIER", "NUMBER", 
		"REAL", "WS", "'RETORNE'"
	};
	public static final int
<<<<<<< HEAD
		RULE_program = 0, RULE_statement = 1, RULE_statementWBreak = 2, RULE_returnFunc = 3, 
		RULE_breakLoop = 4, RULE_branch = 5, RULE_branchWBreak = 6, RULE_block = 7, 
		RULE_blockWBreak = 8, RULE_expression = 9, RULE_bool = 10, RULE_join = 11, 
		RULE_equality = 12, RULE_rel = 13, RULE_expr = 14, RULE_term = 15, RULE_unary = 16, 
		RULE_factor = 17, RULE_varDeclaration = 18, RULE_decIds = 19, RULE_assignment = 20, 
		RULE_para = 21, RULE_enquanto = 22, RULE_repita = 23, RULE_functionDeclarations = 24, 
		RULE_funcao = 25, RULE_callFunction = 26, RULE_arguments = 27, RULE_paramDeclarations = 28, 
		RULE_paramDeclaration = 29, RULE_paramIds = 30, RULE_ids = 31, RULE_string = 32, 
		RULE_stringOrExpr = 33, RULE_type = 34;
	public static final String[] ruleNames = {
		"program", "statement", "statementWBreak", "returnFunc", "breakLoop", 
		"branch", "branchWBreak", "block", "blockWBreak", "expression", "bool", 
		"join", "equality", "rel", "expr", "term", "unary", "factor", "varDeclaration", 
		"decIds", "assignment", "para", "enquanto", "repita", "functionDeclarations", 
		"funcao", "callFunction", "arguments", "paramDeclarations", "paramDeclaration", 
		"paramIds", "ids", "string", "stringOrExpr", "type"
=======
		RULE_programa = 0, RULE_declaraVariavies = 1, RULE_cabecalho = 2, RULE_decVars = 3, 
		RULE_decParams = 4, RULE_tipo = 5, RULE_listaIDs = 6, RULE_decFunc = 7, 
		RULE_comandos = 8, RULE_chamadaFunc = 9, RULE_seEntao = 10, RULE_senao = 11, 
		RULE_para = 12, RULE_enquanto = 13, RULE_repita = 14, RULE_atribuicao = 15, 
		RULE_leitura = 16, RULE_sair = 17, RULE_impressao = 18, RULE_expr = 19, 
		RULE_term1 = 20, RULE_term2 = 21, RULE_term3 = 22, RULE_term4 = 23, RULE_term5 = 24, 
		RULE_term6 = 25, RULE_fator = 26, RULE_op_n7 = 27, RULE_op_n6 = 28, RULE_op_n5 = 29, 
		RULE_op_n4 = 30, RULE_op_n3 = 31, RULE_op_n2 = 32, RULE_op_n1 = 33, RULE_listaExprs = 34, 
		RULE_retorno = 35;
	public static final String[] ruleNames = {
		"programa", "declaraVariavies", "cabecalho", "decVars", "decParams", "tipo", 
		"listaIDs", "decFunc", "comandos", "chamadaFunc", "seEntao", "senao", 
		"para", "enquanto", "repita", "atribuicao", "leitura", "sair", "impressao", 
		"expr", "term1", "term2", "term3", "term4", "term5", "term6", "fator", 
		"op_n7", "op_n6", "op_n5", "op_n4", "op_n3", "op_n2", "op_n1", "listaExprs", 
		"retorno"
>>>>>>> origin/master
	};

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, String> functionTypes = new HashMap<String, String>();
	    Map<String, String> varTypes = new HashMap<String, String>();
	    
	    String realOrInteger(String a, String b){    
	        if(!a.equals("bool")&&!a.equals("string")&&
	            !b.equals("bool")&&!b.equals("string")){
	            if(a.equals(b)){
	                return a;
	            }else{
	                return "real";
	            }
	        }else{
	            int line = _ctx.getStart().getLine();
	            int column = _ctx.getStart().getCharPositionInLine();
	            throw new RuntimeException(line+":"+column+" wrong type in expression");
	        }
	    }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
<<<<<<< HEAD
	public static class ProgramContext extends ParserRuleContext {
		public Token programName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
=======
	public static class ProgramaContext extends ParserRuleContext {
		public DecFuncContext decFunc(int i) {
			return getRuleContext(DecFuncContext.class,i);
>>>>>>> origin/master
		}
		public FunctionDeclarationsContext functionDeclarations() {
			return getRuleContext(FunctionDeclarationsContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
<<<<<<< HEAD
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
=======
		public DeclaraVariaviesContext declaraVariavies() {
			return getRuleContext(DeclaraVariaviesContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
>>>>>>> origin/master
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(70); match(T__21);
			setState(71); ((ProgramContext)_localctx).programName = match(IDENTIFIER);
			setState(72); match(T__36);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__24) | (1L << T__9) | (1L << T__0))) != 0)) {
				{
				{
				setState(73); varDeclaration();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); functionDeclarations();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(80); statement();
				}
				}
				setState(85);
=======
			setState(72); cabecalho();
			setState(73); match(T__32);
			setState(74); declaraVariavies();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(75); decFunc();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); comandos();
				}
				}
				setState(84); 
>>>>>>> origin/master
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0) );
			setState(86); match(T__23);
			setState(87); match(T__20);
			}
<<<<<<< HEAD
			setState(86); match(T__16);
=======
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraVariaviesContext extends ParserRuleContext {
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DeclaraVariaviesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVariavies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDeclaraVariavies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDeclaraVariavies(this);
		}
	}

	public final DeclaraVariaviesContext declaraVariavies() throws RecognitionException {
		DeclaraVariaviesContext _localctx = new DeclaraVariaviesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraVariavies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				{
				setState(89); decVars();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public RepitaContext repita() {
			return getRuleContext(RepitaContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitStatement(this);
		}
	}

<<<<<<< HEAD
	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); para();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); enquanto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); repita();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92); branch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93); returnFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94); callFunction();
				setState(95); match(T__36);
				}
				break;
=======
	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__17);
			setState(96); match(ID);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWBreakContext extends ParserRuleContext {
		public RepitaContext repita() {
			return getRuleContext(RepitaContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public BreakLoopContext breakLoop() {
			return getRuleContext(BreakLoopContext.class,0);
		}
		public BranchWBreakContext branchWBreak() {
			return getRuleContext(BranchWBreakContext.class,0);
		}
		public StatementWBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterStatementWBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitStatementWBreak(this);
		}
	}

<<<<<<< HEAD
	public final StatementWBreakContext statementWBreak() throws RecognitionException {
		StatementWBreakContext _localctx = new StatementWBreakContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementWBreak);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); para();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); enquanto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); repita();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102); assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103); branchWBreak();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104); returnFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105); callFunction();
				setState(106); match(T__36);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108); breakLoop();
				}
				break;
=======
	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); tipo();
			setState(99); listaIDs();
			setState(100); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnFuncContext extends ParserRuleContext {
		public StringOrExprContext stringOrExpr() {
			return getRuleContext(StringOrExprContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterReturnFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitReturnFunc(this);
		}
	}

<<<<<<< HEAD
	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(RETURN);
			setState(112); stringOrExpr();
			setState(113); match(T__36);
=======
	public final DecParamsContext decParams() throws RecognitionException {
		DecParamsContext _localctx = new DecParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); tipo();
			setState(103); listaIDs();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(104); match(T__32);
				setState(105); tipo();
				setState(106); listaIDs();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakLoopContext extends ParserRuleContext {
		public BreakLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBreakLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBreakLoop(this);
		}
	}

<<<<<<< HEAD
	public final BreakLoopContext breakLoop() throws RecognitionException {
		BreakLoopContext _localctx = new BreakLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_breakLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(T__39);
			setState(116); match(T__36);
=======
	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(T__6);
				((TipoContext)_localctx).tip = 1;
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(T__31);
				((TipoContext)_localctx).tip = 2;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); match(T__0);
				((TipoContext)_localctx).tip = 3;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(T__19);
				((TipoContext)_localctx).tip = 4;
				}
				break;
			default:
				throw new NoViableAltException(this);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchContext extends ParserRuleContext {
		public BoolContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBranch(this);
		}
	}

<<<<<<< HEAD
	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
=======
	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaIDs);
>>>>>>> origin/master
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(118); match(T__22);
			setState(119); match(T__30);
			setState(120); ((BranchContext)_localctx).condition = bool(0);
			setState(121); match(T__5);
			setState(122); match(T__40);
			setState(123); ((BranchContext)_localctx).onTrue = block();
			setState(126);
=======
			setState(123); match(ID);
			setState(128);
			_errHandler.sync(this);
>>>>>>> origin/master
			_la = _input.LA(1);
			if (_la==T__3) {
				{
<<<<<<< HEAD
				setState(124); match(T__3);
				setState(125); ((BranchContext)_localctx).onFalse = block();
				}
=======
				setState(124); match(T__24);
				setState(125); match(ID);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
>>>>>>> origin/master
			}

			setState(128); match(T__26);
			setState(129); match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchWBreakContext extends ParserRuleContext {
		public BoolContext condition;
		public BlockWBreakContext onTrue;
		public BlockWBreakContext onFalse;
		public BlockWBreakContext blockWBreak(int i) {
			return getRuleContext(BlockWBreakContext.class,i);
		}
<<<<<<< HEAD
		public List<BlockWBreakContext> blockWBreak() {
			return getRuleContexts(BlockWBreakContext.class);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BranchWBreakContext(ParserRuleContext parent, int invokingState) {
=======
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public DeclaraVariaviesContext declaraVariavies() {
			return getRuleContext(DeclaraVariaviesContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public DecFuncContext(ParserRuleContext parent, int invokingState) {
>>>>>>> origin/master
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchWBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBranchWBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBranchWBreak(this);
		}
	}

<<<<<<< HEAD
	public final BranchWBreakContext branchWBreak() throws RecognitionException {
		BranchWBreakContext _localctx = new BranchWBreakContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_branchWBreak);
=======
	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decFunc);
>>>>>>> origin/master
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(131); match(T__22);
			setState(132); match(T__30);
			setState(133); ((BranchWBreakContext)_localctx).condition = bool(0);
			setState(134); match(T__5);
			setState(135); match(T__40);
			setState(136); ((BranchWBreakContext)_localctx).onTrue = blockWBreak();
			setState(139);
=======
			setState(131); match(T__15);
			setState(132); match(ID);
			setState(133); match(T__27);
			setState(135);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				setState(134); decParams();
				}
			}

			setState(137); match(T__4);
			setState(140);
>>>>>>> origin/master
			_la = _input.LA(1);
			if (_la==T__3) {
				{
<<<<<<< HEAD
				setState(137); match(T__3);
				setState(138); ((BranchWBreakContext)_localctx).onFalse = blockWBreak();
				}
			}

			setState(141); match(T__26);
			setState(142); match(T__36);
=======
				setState(138); match(T__14);
				setState(139); tipo();
				}
			}

			setState(142); match(T__32);
			setState(143); declaraVariavies();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(144); comandos();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(T__23);
			setState(151); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBlock(this);
		}
	}

<<<<<<< HEAD
	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(144); statement();
				}
=======
	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandos);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); leitura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); impressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156); seEntao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157); para();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158); enquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159); repita();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160); sair();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161); retorno();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162); chamadaFunc();
>>>>>>> origin/master
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockWBreakContext extends ParserRuleContext {
		public List<StatementWBreakContext> statementWBreak() {
			return getRuleContexts(StatementWBreakContext.class);
		}
		public StatementWBreakContext statementWBreak(int i) {
			return getRuleContext(StatementWBreakContext.class,i);
		}
		public BlockWBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockWBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBlockWBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBlockWBreak(this);
		}
	}

<<<<<<< HEAD
	public final BlockWBreakContext blockWBreak() throws RecognitionException {
		BlockWBreakContext _localctx = new BlockWBreakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockWBreak);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(150); statementWBreak();
=======
	public final ChamadaFuncContext chamadaFunc() throws RecognitionException {
		ChamadaFuncContext _localctx = new ChamadaFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chamadaFunc);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); match(ID);
				setState(166); match(T__27);
				setState(167); listaExprs();
				setState(168); match(T__4);
				setState(169); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(ID);
				setState(172); match(T__27);
				setState(173); listaExprs();
				setState(174); match(T__4);
>>>>>>> origin/master
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public String t;
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class OrContext extends BoolContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OrContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOr(this);
		}
	}
	public static class BoolJoinContext extends BoolContext {
		public JoinContext a;
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public BoolJoinContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolJoin(this);
		}
	}

<<<<<<< HEAD
	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bool, _p);
=======
	public final SeEntaoContext seEntao() throws RecognitionException {
		SeEntaoContext _localctx = new SeEntaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seEntao);
		int _la;
>>>>>>> origin/master
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			{
			_localctx = new BoolJoinContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(159); ((BoolJoinContext)_localctx).a = join(0);
			((BoolJoinContext)_localctx).t =  ((BoolJoinContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(new BoolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163); match(T__10);
					setState(164); join(0);
					((OrContext)_localctx).t =  "bool";
					}
					} 
				}
				setState(171);
=======
			setState(178); match(T__18);
			setState(179); match(T__27);
			setState(180); expr(0);
			setState(181); match(T__4);
			setState(182); match(T__36);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(183); comandos();
				}
				}
				setState(188);
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
<<<<<<< HEAD
=======
			setState(190);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(189); senao();
				}
			}

			setState(192); match(T__23);
			setState(193); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public String t;
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
	 
		public JoinContext() { }
		public void copyFrom(JoinContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class AndContext extends JoinContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public AndContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAnd(this);
		}
	}
	public static class BoolEqualityContext extends JoinContext {
		public EqualityContext a;
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public BoolEqualityContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolEquality(this);
		}
	}

<<<<<<< HEAD
	public final JoinContext join() throws RecognitionException {
		return join(0);
	}

	private JoinContext join(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JoinContext _localctx = new JoinContext(_ctx, _parentState);
		JoinContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_join, _p);
=======
	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_senao);
		int _la;
>>>>>>> origin/master
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			{
			_localctx = new BoolEqualityContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(173); ((BoolEqualityContext)_localctx).a = equality(0);
			((BoolEqualityContext)_localctx).t =  ((BoolEqualityContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new JoinContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_join);
					setState(176);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(177); match(T__31);
					setState(178); equality(0);
					((AndContext)_localctx).t =  "bool";
					}
					} 
				}
				setState(185);
=======
			setState(195); match(T__2);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(196); comandos();
				}
				}
				setState(201);
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public String t;
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class DiffContext extends EqualityContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public DiffContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDiff(this);
		}
	}
	public static class BoolRelContext extends EqualityContext {
		public RelContext a;
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public BoolRelContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolRel(this);
		}
	}
	public static class EqContext extends EqualityContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public EqContext(EqualityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEq(this);
		}
	}

<<<<<<< HEAD
	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_equality, _p);
=======
	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_para);
		int _la;
>>>>>>> origin/master
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			{
			_localctx = new BoolRelContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(187); ((BoolRelContext)_localctx).a = rel();
			((BoolRelContext)_localctx).t =  ((BoolRelContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new EqContext(new EqualityContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191); match(T__11);
						setState(192); rel();
						((EqContext)_localctx).t =  "bool";
						}
						break;
					case 2:
						{
						_localctx = new DiffContext(new EqualityContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196); match(T__41);
						setState(197); rel();
						((DiffContext)_localctx).t =  "bool";
						}
						break;
					}
					} 
				}
				setState(204);
=======
			setState(202); match(T__12);
			setState(203); match(ID);
			setState(204); match(T__30);
			setState(205); expr(0);
			setState(206); match(T__16);
			setState(207); expr(0);
			setState(210);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(208); match(T__21);
				setState(209); expr(0);
				}
			}

			setState(212); match(T__25);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(213); comandos();
				}
				}
				setState(218);
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
<<<<<<< HEAD
=======
			setState(219); match(T__23);
			setState(220); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelContext extends ParserRuleContext {
		public String t;
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
	 
		public RelContext() { }
		public void copyFrom(RelContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class BoolExprContext extends RelContext {
		public ExprContext a;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolExpr(this);
		}
	}
	public static class LtContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLt(this);
		}
	}
	public static class LeContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLe(this);
		}
	}
	public static class GtContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitGt(this);
		}
	}
	public static class GeContext extends RelContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeContext(RelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitGe(this);
		}
	}

<<<<<<< HEAD
	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rel);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 1);
=======
	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(T__7);
			setState(223); match(T__27);
			setState(224); expr(0);
			setState(225); match(T__4);
			setState(226); match(T__25);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
>>>>>>> origin/master
				{
				setState(205); expr(0);
				setState(206); match(T__12);
				setState(207); expr(0);
				((LtContext)_localctx).t =  "bool";
				}
				break;
			case 2:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(210); expr(0);
				setState(211); match(T__33);
				setState(212); expr(0);
				((LeContext)_localctx).t =  "bool";
=======
				setState(227); comandos();
>>>>>>> origin/master
				}
				break;
			case 3:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215); expr(0);
				setState(216); match(T__13);
				setState(217); expr(0);
				((GeContext)_localctx).t =  "bool";
				}
<<<<<<< HEAD
				break;
			case 4:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220); expr(0);
				setState(221); match(T__7);
				setState(222); expr(0);
				((GtContext)_localctx).t =  "bool";
				}
				break;
			case 5:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225); ((BoolExprContext)_localctx).a = expr(0);
				((BoolExprContext)_localctx).t =  ((BoolExprContext)_localctx).a.t;
				}
				break;
=======
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(T__23);
			setState(234); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public String t;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class AddContext extends ExprContext {
		public ExprContext a;
		public TermContext b;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends ExprContext {
		public ExprContext a;
		public TermContext b;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSub(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext a;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExprTerm(this);
		}
	}

<<<<<<< HEAD
	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
=======
	public final RepitaContext repita() throws RecognitionException {
		RepitaContext _localctx = new RepitaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repita);
		int _la;
>>>>>>> origin/master
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			{
			_localctx = new ExprTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(231); ((ExprTermContext)_localctx).a = term(0);
			((ExprTermContext)_localctx).t =  ((ExprTermContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						((AddContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235); match(T__4);
						setState(236); ((AddContext)_localctx).b = term(0);
						((AddContext)_localctx).t =  realOrInteger(((AddContext)_localctx).a.t,((AddContext)_localctx).b.t);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						((SubContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240); match(T__1);
						setState(241); ((SubContext)_localctx).b = term(0);
						((SubContext)_localctx).t =  realOrInteger(((SubContext)_localctx).a.t,((SubContext)_localctx).b.t);
						}
						break;
					}
					} 
				}
				setState(248);
=======
			setState(236); match(T__33);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(237); comandos();
				}
				}
				setState(242);
>>>>>>> origin/master
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
<<<<<<< HEAD
=======
			setState(243); match(T__16);
			setState(244); match(T__27);
			setState(245); expr(0);
			setState(246); match(T__4);
			setState(247); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public String t;
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class TermUnaryContext extends TermContext {
		public UnaryContext a;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TermUnaryContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTermUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTermUnary(this);
		}
	}
	public static class DivContext extends TermContext {
		public TermContext a;
		public UnaryContext b;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public DivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDiv(this);
		}
	}
	public static class MultiContext extends TermContext {
		public TermContext a;
		public UnaryContext b;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MultiContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitMulti(this);
		}
	}

<<<<<<< HEAD
	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
=======
	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao);
>>>>>>> origin/master
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			{
			_localctx = new TermUnaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(250); ((TermUnaryContext)_localctx).a = unary();
			((TermUnaryContext)_localctx).t =  ((TermUnaryContext)_localctx).a.t;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiContext(new TermContext(_parentctx, _parentState));
						((MultiContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(254); match(T__29);
						setState(255); ((MultiContext)_localctx).b = unary();
						((MultiContext)_localctx).t =  realOrInteger(((MultiContext)_localctx).a.t,((MultiContext)_localctx).b.t);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new TermContext(_parentctx, _parentState));
						((DivContext)_localctx).a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(259); match(T__42);
						setState(260); ((DivContext)_localctx).b = unary();
						((DivContext)_localctx).t =  realOrInteger(((DivContext)_localctx).a.t,((DivContext)_localctx).b.t);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
=======
			setState(249); match(ID);
			setState(250); match(T__30);
			setState(251); expr(0);
			setState(252); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public String t;
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class FactorUnaryContext extends UnaryContext {
		public FactorContext a;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorUnaryContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFactorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFactorUnary(this);
		}
	}
	public static class NotUnaryContext extends UnaryContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public NotUnaryContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterNotUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitNotUnary(this);
		}
	}
	public static class MinusUnaryContext extends UnaryContext {
		public UnaryContext a;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MinusUnaryContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterMinusUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitMinusUnary(this);
		}
	}

<<<<<<< HEAD
	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unary);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new NotUnaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(T__6);
				setState(269); unary();
				((NotUnaryContext)_localctx).t =  "bool";
				}
				break;
			case T__1:
				_localctx = new MinusUnaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272); match(T__1);
				setState(273); ((MinusUnaryContext)_localctx).a = unary();
				((MinusUnaryContext)_localctx).t =  ((MinusUnaryContext)_localctx).a.t;
				}
				break;
			case T__38:
			case T__30:
			case T__17:
			case T__2:
			case IMPRIME:
			case IDENTIFIER:
			case NUMBER:
			case REAL:
				_localctx = new FactorUnaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276); ((FactorUnaryContext)_localctx).a = factor();
				((FactorUnaryContext)_localctx).t =  ((FactorUnaryContext)_localctx).a.t;
				}
				break;
			default:
				throw new NoViableAltException(this);
=======
	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(T__34);
			setState(255); match(T__27);
			setState(256); listaIDs();
			setState(257); match(T__4);
			setState(258); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public String t;
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class VariableContext extends FactorContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public VariableContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitVariable(this);
		}
	}
	public static class NumberContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(PortugolParser.NUMBER, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitNumber(this);
		}
	}
	public static class ParentesisContext extends FactorContext {
		public BoolContext a;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ParentesisContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitParentesis(this);
		}
	}
	public static class BoolFalseContext extends FactorContext {
		public BoolFalseContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolFalse(this);
		}
	}
	public static class RealContext extends FactorContext {
		public TerminalNode REAL() { return getToken(PortugolParser.REAL, 0); }
		public RealContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitReal(this);
		}
	}
	public static class BoolTrueContext extends FactorContext {
		public BoolTrueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBoolTrue(this);
		}
	}
	public static class ExprCallFunctionContext extends FactorContext {
		public CallFunctionContext a;
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ExprCallFunctionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExprCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExprCallFunction(this);
		}
	}

<<<<<<< HEAD
	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(T__30);
				setState(282); ((ParentesisContext)_localctx).a = bool(0);
				setState(283); match(T__5);
				((ParentesisContext)_localctx).t =  ((ParentesisContext)_localctx).a.t;
				}
				break;
			case 2:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286); ((VariableContext)_localctx).varName = match(IDENTIFIER);
				((VariableContext)_localctx).t =  varTypes.get((((VariableContext)_localctx).varName!=null?((VariableContext)_localctx).varName.getText():null));
				}
				break;
			case 3:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288); match(NUMBER);
				((NumberContext)_localctx).t =  "int";
				}
				break;
			case 4:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(290); match(REAL);
				((RealContext)_localctx).t =  "real";
				}
				break;
			case 5:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(292); match(T__2);
				((BoolTrueContext)_localctx).t =  "bool";
				}
				break;
			case 6:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(294); match(T__17);
				((BoolFalseContext)_localctx).t =  "bool";
				}
				break;
			case 7:
				_localctx = new ExprCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(296); ((ExprCallFunctionContext)_localctx).a = callFunction();
				((ExprCallFunctionContext)_localctx).t =  ((ExprCallFunctionContext)_localctx).a.t;
				}
				break;
=======
	public final SairContext sair() throws RecognitionException {
		SairContext _localctx = new SairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(T__35);
			setState(261); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token IDENTIFIER;
		public List<DecIdsContext> decIds() {
			return getRuleContexts(DecIdsContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public DecIdsContext decIds(int i) {
			return getRuleContext(DecIdsContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitVarDeclaration(this);
		}
	}

<<<<<<< HEAD
	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); ((VarDeclarationContext)_localctx).type = type();
			setState(302); ((VarDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(303); decIds(((VarDeclarationContext)_localctx).type.t);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309); match(T__36);
			varTypes.put((((VarDeclarationContext)_localctx).IDENTIFIER!=null?((VarDeclarationContext)_localctx).IDENTIFIER.getText():null), ((VarDeclarationContext)_localctx).type.t);
=======
	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_impressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(T__38);
			setState(264); match(T__27);
			setState(265); expr(0);
			setState(266); match(T__4);
			setState(267); match(T__32);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecIdsContext extends ParserRuleContext {
		public String t;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public DecIdsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DecIdsContext(ParserRuleContext parent, int invokingState, String t) {
			super(parent, invokingState);
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_decIds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecIds(this);
		}
	}

<<<<<<< HEAD
	public final DecIdsContext decIds(String t) throws RecognitionException {
		DecIdsContext _localctx = new DecIdsContext(_ctx, getState(), t);
		enterRule(_localctx, 38, RULE_decIds);
=======
	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(312); match(T__27);
			setState(313); ((DecIdsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			varTypes.put((((DecIdsContext)_localctx).IDENTIFIER!=null?((DecIdsContext)_localctx).IDENTIFIER.getText():null), _localctx.t);
=======
			{
			setState(270); term1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(272);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273); op_n7();
					setState(274); term1(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token varName;
		public StringOrExprContext stringOrExpr() {
			return getRuleContext(StringOrExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAssignment(this);
		}
	}

<<<<<<< HEAD
	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
=======
	public final Term1Context term1() throws RecognitionException {
		return term1(0);
	}

	private Term1Context term1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term1Context _localctx = new Term1Context(_ctx, _parentState);
		Term1Context _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_term1, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(316); ((AssignmentContext)_localctx).varName = match(IDENTIFIER);
			setState(317); match(T__34);
			setState(318); stringOrExpr();
			setState(319); match(T__36);
=======
			{
			setState(282); term2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term1);
					setState(284);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(285); op_n6();
					setState(286); term2(0);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public Token mainVar;
		public Token mainNum;
		public Token until;
		public Token step;
		public TerminalNode NUMBER(int i) {
			return getToken(PortugolParser.NUMBER, i);
		}
		public List<StatementWBreakContext> statementWBreak() {
			return getRuleContexts(StatementWBreakContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PortugolParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PortugolParser.NUMBER); }
		public StatementWBreakContext statementWBreak(int i) {
			return getRuleContext(StatementWBreakContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PortugolParser.IDENTIFIER); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPara(this);
		}
	}

<<<<<<< HEAD
	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_para);
		int _la;
=======
	public final Term2Context term2() throws RecognitionException {
		return term2(0);
	}

	private Term2Context term2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term2Context _localctx = new Term2Context(_ctx, _parentState);
		Term2Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term2, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(321); match(T__14);
			setState(322); ((ParaContext)_localctx).mainVar = match(IDENTIFIER);
			setState(323); match(T__34);
			setState(324); ((ParaContext)_localctx).mainNum = match(NUMBER);
			setState(325); match(T__19);
			setState(326);
			((ParaContext)_localctx).until = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
				((ParaContext)_localctx).until = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(329);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(327); match(T__25);
				setState(328); ((ParaContext)_localctx).step = match(NUMBER);
				}
			}

			setState(331); match(T__28);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(332); statementWBreak();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
=======
			{
			setState(294); term3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term2);
					setState(296);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(297); op_n5();
					setState(298); term3(0);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
>>>>>>> origin/master
			}
			setState(338); match(T__26);
			setState(339); match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public List<StatementWBreakContext> statementWBreak() {
			return getRuleContexts(StatementWBreakContext.class);
		}
		public StatementWBreakContext statementWBreak(int i) {
			return getRuleContext(StatementWBreakContext.class,i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEnquanto(this);
		}
	}

<<<<<<< HEAD
	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enquanto);
		int _la;
=======
	public final Term3Context term3() throws RecognitionException {
		return term3(0);
	}

	private Term3Context term3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term3Context _localctx = new Term3Context(_ctx, _parentState);
		Term3Context _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term3, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(341); match(T__8);
			setState(342); match(T__30);
			setState(343); bool(0);
			setState(344); match(T__5);
			setState(345); match(T__28);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(346); statementWBreak();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
=======
			{
			setState(306); term4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term3);
					setState(308);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(309); op_n4();
					setState(310); term4(0);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
>>>>>>> origin/master
			}
			setState(352); match(T__26);
			setState(353); match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepitaContext extends ParserRuleContext {
		public List<StatementWBreakContext> statementWBreak() {
			return getRuleContexts(StatementWBreakContext.class);
		}
		public StatementWBreakContext statementWBreak(int i) {
			return getRuleContext(StatementWBreakContext.class,i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public RepitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitRepita(this);
		}
	}

<<<<<<< HEAD
	public final RepitaContext repita() throws RecognitionException {
		RepitaContext _localctx = new RepitaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repita);
		int _la;
=======
	public final Term4Context term4() throws RecognitionException {
		return term4(0);
	}

	private Term4Context term4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term4Context _localctx = new Term4Context(_ctx, _parentState);
		Term4Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term4, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(355); match(T__37);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(356); statementWBreak();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
=======
			{
			setState(318); term5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term4);
					setState(320);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(321); op_n3();
					setState(322); term5(0);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
>>>>>>> origin/master
			}
			setState(362); match(T__19);
			setState(363); match(T__30);
			setState(364); bool(0);
			setState(365); match(T__5);
			setState(366); match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationsContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public FunctionDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFunctionDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFunctionDeclarations(this);
		}
	}

<<<<<<< HEAD
	public final FunctionDeclarationsContext functionDeclarations() throws RecognitionException {
		FunctionDeclarationsContext _localctx = new FunctionDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDeclarations);
		int _la;
=======
	public final Term5Context term5() throws RecognitionException {
		return term5(0);
	}

	private Term5Context term5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term5Context _localctx = new Term5Context(_ctx, _parentState);
		Term5Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_term5, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(368); funcao();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
=======
			{
			setState(330); term6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term5);
					setState(332);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(333); op_n2();
					setState(334); term6(0);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
>>>>>>> origin/master
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public TypeContext type;
		public List<TerminalNode> RETURN() { return getTokens(PortugolParser.RETURN); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode RETURN(int i) {
			return getToken(PortugolParser.RETURN, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public ParamDeclarationsContext paramDeclarations() {
			return getRuleContext(ParamDeclarationsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFuncao(this);
		}
	}

<<<<<<< HEAD
	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcao);
		int _la;
=======
	public final Term6Context term6() throws RecognitionException {
		return term6(0);
	}

	private Term6Context term6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term6Context _localctx = new Term6Context(_ctx, _parentState);
		Term6Context _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_term6, _p);
>>>>>>> origin/master
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(374); match(T__18);
			setState(375); ((FuncaoContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(376); match(T__30);
			setState(378);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__24) | (1L << T__9) | (1L << T__0))) != 0)) {
				{
				setState(377); paramDeclarations((((FuncaoContext)_localctx).IDENTIFIER!=null?((FuncaoContext)_localctx).IDENTIFIER.getText():null));
				}
			}

			setState(380); match(T__5);
			setState(383);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(381); match(T__15);
				setState(382); ((FuncaoContext)_localctx).type = type();
				}
			}

			setState(385); match(T__36);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__24) | (1L << T__9) | (1L << T__0))) != 0)) {
				{
				{
				setState(386); varDeclaration();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__37) | (1L << T__22) | (1L << T__14) | (1L << T__8) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << RETURN))) != 0)) {
				{
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
=======
			{
			setState(342); fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
>>>>>>> origin/master
					{
					setState(392); statement();
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(393); match(RETURN);
					setState(394); expression();
=======
					_localctx = new Term6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term6);
					setState(344);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(345); op_n1();
					setState(346); fator();
>>>>>>> origin/master
					}
					break;
				}
<<<<<<< HEAD
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
=======
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
>>>>>>> origin/master
			}
			setState(400); match(T__26);
			setState(401); match(T__36);
			if(((FuncaoContext)_localctx).type!=null)
			            functionTypes.put((((FuncaoContext)_localctx).IDENTIFIER!=null?((FuncaoContext)_localctx).IDENTIFIER.getText():null), ((FuncaoContext)_localctx).type.t);
			         else
			            functionTypes.put((((FuncaoContext)_localctx).IDENTIFIER!=null?((FuncaoContext)_localctx).IDENTIFIER.getText():null), "void");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFunctionContext extends ParserRuleContext {
		public String t;
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	 
		public CallFunctionContext() { }
		public void copyFrom(CallFunctionContext ctx) {
			super.copyFrom(ctx);
			this.t = ctx.t;
		}
	}
	public static class OtherFuncContext extends CallFunctionContext {
		public Token IDENTIFIER;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public OtherFuncContext(CallFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOtherFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOtherFunc(this);
		}
	}
	public static class LeiaContext extends CallFunctionContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PortugolParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PortugolParser.IDENTIFIER); }
		public LeiaContext(CallFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLeia(this);
		}
	}
	public static class ImprimeContext extends CallFunctionContext {
		public List<StringOrExprContext> stringOrExpr() {
			return getRuleContexts(StringOrExprContext.class);
		}
		public StringOrExprContext stringOrExpr(int i) {
			return getRuleContext(StringOrExprContext.class,i);
		}
		public ImprimeContext(CallFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitImprime(this);
		}
	}

<<<<<<< HEAD
	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_callFunction);
		int _la;
		try {
			setState(434);
			switch (_input.LA(1)) {
			case IMPRIME:
				_localctx = new ImprimeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(404); match(IMPRIME);
				setState(405); match(T__30);
				setState(406); stringOrExpr();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(407); match(T__27);
					setState(408); stringOrExpr();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414); match(T__5);
=======
	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); match(T__27);
				setState(354); expr(0);
				setState(355); match(T__4);
>>>>>>> origin/master
				}
				break;
			case T__38:
				_localctx = new LeiaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(416); match(T__38);
				setState(417); match(T__30);
				setState(418); match(IDENTIFIER);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(419); match(T__27);
					setState(420); match(IDENTIFIER);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426); match(T__5);
=======
				setState(357); match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358); match(ID);
>>>>>>> origin/master
				}
				break;
			case IDENTIFIER:
				_localctx = new OtherFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(427); ((OtherFuncContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				setState(428); match(T__30);
				setState(430);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__32) | (1L << T__30) | (1L << T__17) | (1L << T__6) | (1L << T__2) | (1L << T__1) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << REAL))) != 0)) {
					{
					setState(429); arguments();
					}
				}

				setState(432); match(T__5);
				((OtherFuncContext)_localctx).t = functionTypes.get((((OtherFuncContext)_localctx).IDENTIFIER!=null?((OtherFuncContext)_localctx).IDENTIFIER.getText():null));
=======
				setState(359); chamadaFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360); match(STRING);
>>>>>>> origin/master
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

<<<<<<< HEAD
	public static class ArgumentsContext extends ParserRuleContext {
		public List<StringOrExprContext> stringOrExpr() {
			return getRuleContexts(StringOrExprContext.class);
=======
	public static class Op_n7Context extends ParserRuleContext {
		public Op_n7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n7(this);
		}
	}

	public final Op_n7Context op_n7() throws RecognitionException {
		Op_n7Context _localctx = new Op_n7Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_n7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
>>>>>>> origin/master
		}
		public StringOrExprContext stringOrExpr(int i) {
			return getRuleContext(StringOrExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitArguments(this);
		}
	}

<<<<<<< HEAD
	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); stringOrExpr();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(437); match(T__27);
				setState(438); stringOrExpr();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
=======
	public final Op_n6Context op_n6() throws RecognitionException {
		Op_n6Context _localctx = new Op_n6Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_n6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(T__28);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclarationsContext extends ParserRuleContext {
		public String funcName;
		public ParamDeclarationContext paramDeclaration(int i) {
			return getRuleContext(ParamDeclarationContext.class,i);
		}
		public List<ParamDeclarationContext> paramDeclaration() {
			return getRuleContexts(ParamDeclarationContext.class);
		}
		public ParamDeclarationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamDeclarationsContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
		}
		@Override public int getRuleIndex() { return RULE_paramDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterParamDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitParamDeclarations(this);
		}
	}

<<<<<<< HEAD
	public final ParamDeclarationsContext paramDeclarations(String funcName) throws RecognitionException {
		ParamDeclarationsContext _localctx = new ParamDeclarationsContext(_ctx, getState(), funcName);
		enterRule(_localctx, 56, RULE_paramDeclarations);
=======
	public final Op_n5Context op_n5() throws RecognitionException {
		Op_n5Context _localctx = new Op_n5Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_n5);
>>>>>>> origin/master
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(444); paramDeclaration(_localctx.funcName);
			setState(449);
			_errHandler.sync(this);
=======
			setState(367);
>>>>>>> origin/master
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(445); match(T__36);
				setState(446); paramDeclaration(_localctx.funcName);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclarationContext extends ParserRuleContext {
		public String funcName;
		public TypeContext type;
		public Token IDENTIFIER;
		public List<ParamIdsContext> paramIds() {
			return getRuleContexts(ParamIdsContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public ParamIdsContext paramIds(int i) {
			return getRuleContext(ParamIdsContext.class,i);
		}
		public ParamDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamDeclarationContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
		}
		@Override public int getRuleIndex() { return RULE_paramDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterParamDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitParamDeclaration(this);
		}
	}

<<<<<<< HEAD
	public final ParamDeclarationContext paramDeclaration(String funcName) throws RecognitionException {
		ParamDeclarationContext _localctx = new ParamDeclarationContext(_ctx, getState(), funcName);
		enterRule(_localctx, 58, RULE_paramDeclaration);
=======
	public final Op_n4Context op_n4() throws RecognitionException {
		Op_n4Context _localctx = new Op_n4Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_n4);
>>>>>>> origin/master
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(452); ((ParamDeclarationContext)_localctx).type = type();
			setState(453); ((ParamDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(457);
			_errHandler.sync(this);
=======
			setState(369);
>>>>>>> origin/master
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(454); paramIds(((ParamDeclarationContext)_localctx).type.t,_localctx.funcName);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			varTypes.put((((ParamDeclarationContext)_localctx).IDENTIFIER!=null?((ParamDeclarationContext)_localctx).IDENTIFIER.getText():null), ((ParamDeclarationContext)_localctx).type.t);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamIdsContext extends ParserRuleContext {
		public String t;
		public String funcName;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(PortugolParser.IDENTIFIER, 0); }
		public ParamIdsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamIdsContext(ParserRuleContext parent, int invokingState, String t, String funcName) {
			super(parent, invokingState);
			this.t = t;
			this.funcName = funcName;
		}
		@Override public int getRuleIndex() { return RULE_paramIds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterParamIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitParamIds(this);
		}
	}

<<<<<<< HEAD
	public final ParamIdsContext paramIds(String t,String funcName) throws RecognitionException {
		ParamIdsContext _localctx = new ParamIdsContext(_ctx, getState(), t, funcName);
		enterRule(_localctx, 60, RULE_paramIds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(T__27);
			setState(463); ((ParamIdsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			varTypes.put((((ParamIdsContext)_localctx).IDENTIFIER!=null?((ParamIdsContext)_localctx).IDENTIFIER.getText():null), _localctx.t);
=======
	public final Op_n3Context op_n3() throws RecognitionException {
		Op_n3Context _localctx = new Op_n3Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_n3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PortugolParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PortugolParser.IDENTIFIER); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitIds(this);
		}
	}

<<<<<<< HEAD
	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ids);
=======
	public final Op_n2Context op_n2() throws RecognitionException {
		Op_n2Context _localctx = new Op_n2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_n2);
>>>>>>> origin/master
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(466); match(IDENTIFIER);
			setState(471);
			_errHandler.sync(this);
=======
			setState(373);
>>>>>>> origin/master
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(467); match(T__27);
				setState(468); match(IDENTIFIER);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitString(this);
		}
	}

<<<<<<< HEAD
	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); match(T__32);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__37) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__31) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__26) | (1L << T__25) | (1L << T__24) | (1L << T__22) | (1L << T__21) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << IMPRIME) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << REAL) | (1L << WS) | (1L << RETURN))) != 0)) {
				{
				{
				setState(475);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__23) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481); match(T__32);
=======
	public final Op_n1Context op_n1() throws RecognitionException {
		Op_n1Context _localctx = new Op_n1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_n1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(T__5);
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringOrExprContext extends ParserRuleContext {
		public String t;
		public ExprContext a;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterStringOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitStringOrExpr(this);
		}
	}

<<<<<<< HEAD
	public final StringOrExprContext stringOrExpr() throws RecognitionException {
		StringOrExprContext _localctx = new StringOrExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringOrExpr);
		try {
			setState(489);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); string();
				((StringOrExprContext)_localctx).t =  "string";
=======
	public final ListaExprsContext listaExprs() throws RecognitionException {
		ListaExprsContext _localctx = new ListaExprsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); expr(0);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(378); match(T__24);
				setState(379); expr(0);
>>>>>>> origin/master
				}
				break;
			case T__38:
			case T__30:
			case T__17:
			case T__6:
			case T__2:
			case T__1:
			case IMPRIME:
			case IDENTIFIER:
			case NUMBER:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(486); ((StringOrExprContext)_localctx).a = expr(0);
				((StringOrExprContext)_localctx).t =  ((StringOrExprContext)_localctx).a.t;
				}
<<<<<<< HEAD
				break;
			default:
				throw new NoViableAltException(this);
=======
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String t;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitType(this);
		}
	}

<<<<<<< HEAD
	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(499);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); match(T__9);
				((TypeContext)_localctx).t =  "int";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); match(T__24);
				((TypeContext)_localctx).t =  "string";
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(495); match(T__35);
				((TypeContext)_localctx).t =  "real";
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(497); match(T__0);
				((TypeContext)_localctx).t =  "bool";
				}
				break;
			default:
				throw new NoViableAltException(this);
=======
	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_retorno);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(T__22);
			setState(386); expr(0);
			setState(387); match(T__32);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388); match(T__22);
					setState(389); expr(0);
					setState(390); match(T__32);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
>>>>>>> origin/master
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
<<<<<<< HEAD
		case 10: return bool_sempred((BoolContext)_localctx, predIndex);
		case 11: return join_sempred((JoinContext)_localctx, predIndex);
		case 12: return equality_sempred((EqualityContext)_localctx, predIndex);
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		case 15: return term_sempred((TermContext)_localctx, predIndex);
=======
		case 19: return expr_sempred((ExprContext)_localctx, predIndex);
		case 20: return term1_sempred((Term1Context)_localctx, predIndex);
		case 21: return term2_sempred((Term2Context)_localctx, predIndex);
		case 22: return term3_sempred((Term3Context)_localctx, predIndex);
		case 23: return term4_sempred((Term4Context)_localctx, predIndex);
		case 24: return term5_sempred((Term5Context)_localctx, predIndex);
		case 25: return term6_sempred((Term6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean term2_sempred(Term2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term3_sempred(Term3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
>>>>>>> origin/master
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean join_sempred(JoinContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u01f8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\3"+
		"\2\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3d\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\b\3\b\3\b\3\t\7\t"+
		"\u0094\n\t\f\t\16\t\u0097\13\t\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r\u00bb"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00e7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f7\n\20\f\20\16\20\u00fa\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u010a\n\21\f\21\16\21\u010d\13\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u011a\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u012e\n\23\3\24\3\24\3\24\7\24\u0133\n\24\f\24\16\24\u0136\13\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u014c\n\27\3\27\3\27\7\27\u0150\n\27\f"+
		"\27\16\27\u0153\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u015e\n\30\f\30\16\30\u0161\13\30\3\30\3\30\3\30\3\31\3\31\7\31\u0168"+
		"\n\31\f\31\16\31\u016b\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\7\32\u0174"+
		"\n\32\f\32\16\32\u0177\13\32\3\33\3\33\3\33\3\33\5\33\u017d\n\33\3\33"+
		"\3\33\3\33\5\33\u0182\n\33\3\33\3\33\7\33\u0186\n\33\f\33\16\33\u0189"+
		"\13\33\3\33\3\33\3\33\7\33\u018e\n\33\f\33\16\33\u0191\13\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u019c\n\34\f\34\16\34\u019f\13"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01a8\n\34\f\34\16\34\u01ab"+
		"\13\34\3\34\3\34\3\34\3\34\5\34\u01b1\n\34\3\34\3\34\5\34\u01b5\n\34\3"+
		"\35\3\35\3\35\7\35\u01ba\n\35\f\35\16\35\u01bd\13\35\3\36\3\36\3\36\7"+
		"\36\u01c2\n\36\f\36\16\36\u01c5\13\36\3\37\3\37\3\37\7\37\u01ca\n\37\f"+
		"\37\16\37\u01cd\13\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\7!\u01d8\n!\f!\16"+
		"!\u01db\13!\3\"\3\"\7\"\u01df\n\"\f\"\16\"\u01e2\13\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u01ec\n#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01f6\n$\3$\2\7\26\30"+
		"\32\36 %\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDF\2\4\3\2/\60\5\2\r\r\26\26\31\31\u0214\2H\3\2\2\2\4c\3\2\2\2\6"+
		"o\3\2\2\2\bq\3\2\2\2\nu\3\2\2\2\fx\3\2\2\2\16\u0085\3\2\2\2\20\u0095\3"+
		"\2\2\2\22\u009b\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00ae\3\2"+
		"\2\2\32\u00bc\3\2\2\2\34\u00e6\3\2\2\2\36\u00e8\3\2\2\2 \u00fb\3\2\2\2"+
		"\"\u0119\3\2\2\2$\u012d\3\2\2\2&\u012f\3\2\2\2(\u013a\3\2\2\2*\u013e\3"+
		"\2\2\2,\u0143\3\2\2\2.\u0157\3\2\2\2\60\u0165\3\2\2\2\62\u0175\3\2\2\2"+
		"\64\u0178\3\2\2\2\66\u01b4\3\2\2\28\u01b6\3\2\2\2:\u01be\3\2\2\2<\u01c6"+
		"\3\2\2\2>\u01d0\3\2\2\2@\u01d4\3\2\2\2B\u01dc\3\2\2\2D\u01eb\3\2\2\2F"+
		"\u01f5\3\2\2\2HI\7\30\2\2IJ\7/\2\2JN\7\t\2\2KM\5&\24\2LK\3\2\2\2MP\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\5\62\32\2RT\5\4\3\2SR\3"+
		"\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\35\2\2Y\3"+
		"\3\2\2\2Zd\5,\27\2[d\5.\30\2\\d\5\60\31\2]d\5*\26\2^d\5\f\7\2_d\5\b\5"+
		"\2`a\5\66\34\2ab\7\t\2\2bd\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2\2c]\3"+
		"\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2d\5\3\2\2\2ep\5,\27\2fp\5.\30\2gp"+
		"\5\60\31\2hp\5*\26\2ip\5\16\b\2jp\5\b\5\2kl\5\66\34\2lm\7\t\2\2mp\3\2"+
		"\2\2np\5\n\6\2oe\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2"+
		"\2\2ok\3\2\2\2on\3\2\2\2p\7\3\2\2\2qr\7\63\2\2rs\5D#\2st\7\t\2\2t\t\3"+
		"\2\2\2uv\7\6\2\2vw\7\t\2\2w\13\3\2\2\2xy\7\27\2\2yz\7\17\2\2z{\5\26\f"+
		"\2{|\7(\2\2|}\7\5\2\2}\u0080\5\20\t\2~\177\7*\2\2\177\u0081\5\20\t\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\23\2\2"+
		"\u0083\u0084\7\t\2\2\u0084\r\3\2\2\2\u0085\u0086\7\27\2\2\u0086\u0087"+
		"\7\17\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7(\2\2\u0089\u008a\7\5\2\2"+
		"\u008a\u008d\5\22\n\2\u008b\u008c\7*\2\2\u008c\u008e\5\22\n\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\23\2\2"+
		"\u0090\u0091\7\t\2\2\u0091\17\3\2\2\2\u0092\u0094\5\4\3\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\21\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\6\4\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\23"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\36\20\2\u009f\25\3\2\2\2\u00a0"+
		"\u00a1\b\f\1\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\b\f\1\2\u00a3\u00ab\3"+
		"\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\5\30\r\2\u00a7"+
		"\u00a8\b\f\1\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\b\r\1\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\b\r\1\2"+
		"\u00b1\u00b9\3\2\2\2\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5"+
		"\5\32\16\2\u00b5\u00b6\b\r\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b2\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\b\16\1\2\u00bd\u00be\5\34\17"+
		"\2\u00be\u00bf\b\16\1\2\u00bf\u00cc\3\2\2\2\u00c0\u00c1\f\5\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\b\16\1\2\u00c4\u00cb"+
		"\3\2\2\2\u00c5\u00c6\f\4\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\34\17\2"+
		"\u00c8\u00c9\b\16\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c5"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\33\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\36\20\2\u00d0\u00d1\7!\2"+
		"\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\b\17\1\2\u00d3\u00e7\3\2\2\2\u00d4"+
		"\u00d5\5\36\20\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8"+
		"\b\17\1\2\u00d8\u00e7\3\2\2\2\u00d9\u00da\5\36\20\2\u00da\u00db\7 \2\2"+
		"\u00db\u00dc\5\36\20\2\u00dc\u00dd\b\17\1\2\u00dd\u00e7\3\2\2\2\u00de"+
		"\u00df\5\36\20\2\u00df\u00e0\7&\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2"+
		"\b\17\1\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\b\17\1"+
		"\2\u00e5\u00e7\3\2\2\2\u00e6\u00cf\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00d9"+
		"\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\35\3\2\2\2\u00e8"+
		"\u00e9\b\20\1\2\u00e9\u00ea\5 \21\2\u00ea\u00eb\b\20\1\2\u00eb\u00f8\3"+
		"\2\2\2\u00ec\u00ed\f\5\2\2\u00ed\u00ee\7)\2\2\u00ee\u00ef\5 \21\2\u00ef"+
		"\u00f0\b\20\1\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2\f\4\2\2\u00f2\u00f3\7"+
		",\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\b\20\1\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00ec\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc"+
		"\b\21\1\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe\b\21\1\2\u00fe\u010b\3\2\2"+
		"\2\u00ff\u0100\f\5\2\2\u0100\u0101\7\20\2\2\u0101\u0102\5\"\22\2\u0102"+
		"\u0103\b\21\1\2\u0103\u010a\3\2\2\2\u0104\u0105\f\4\2\2\u0105\u0106\7"+
		"\3\2\2\u0106\u0107\5\"\22\2\u0107\u0108\b\21\1\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00ff\3\2\2\2\u0109\u0104\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c!\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f"+
		"\7\'\2\2\u010f\u0110\5\"\22\2\u0110\u0111\b\22\1\2\u0111\u011a\3\2\2\2"+
		"\u0112\u0113\7,\2\2\u0113\u0114\5\"\22\2\u0114\u0115\b\22\1\2\u0115\u011a"+
		"\3\2\2\2\u0116\u0117\5$\23\2\u0117\u0118\b\22\1\2\u0118\u011a\3\2\2\2"+
		"\u0119\u010e\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0116\3\2\2\2\u011a#\3"+
		"\2\2\2\u011b\u011c\7\17\2\2\u011c\u011d\5\26\f\2\u011d\u011e\7(\2\2\u011e"+
		"\u011f\b\23\1\2\u011f\u012e\3\2\2\2\u0120\u0121\7/\2\2\u0121\u012e\b\23"+
		"\1\2\u0122\u0123\7\60\2\2\u0123\u012e\b\23\1\2\u0124\u0125\7\61\2\2\u0125"+
		"\u012e\b\23\1\2\u0126\u0127\7+\2\2\u0127\u012e\b\23\1\2\u0128\u0129\7"+
		"\34\2\2\u0129\u012e\b\23\1\2\u012a\u012b\5\66\34\2\u012b\u012c\b\23\1"+
		"\2\u012c\u012e\3\2\2\2\u012d\u011b\3\2\2\2\u012d\u0120\3\2\2\2\u012d\u0122"+
		"\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u0126\3\2\2\2\u012d\u0128\3\2\2\2\u012d"+
		"\u012a\3\2\2\2\u012e%\3\2\2\2\u012f\u0130\5F$\2\u0130\u0134\7/\2\2\u0131"+
		"\u0133\5(\25\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7\t\2\2\u0138\u0139\b\24\1\2\u0139\'\3\2\2\2\u013a\u013b\7\22\2"+
		"\2\u013b\u013c\7/\2\2\u013c\u013d\b\25\1\2\u013d)\3\2\2\2\u013e\u013f"+
		"\7/\2\2\u013f\u0140\7\13\2\2\u0140\u0141\5D#\2\u0141\u0142\7\t\2\2\u0142"+
		"+\3\2\2\2\u0143\u0144\7\37\2\2\u0144\u0145\7/\2\2\u0145\u0146\7\13\2\2"+
		"\u0146\u0147\7\60\2\2\u0147\u0148\7\32\2\2\u0148\u014b\t\2\2\2\u0149\u014a"+
		"\7\24\2\2\u014a\u014c\7\60\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u0151\7\21\2\2\u014e\u0150\5\6\4\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\23\2\2\u0155\u0156\7"+
		"\t\2\2\u0156-\3\2\2\2\u0157\u0158\7%\2\2\u0158\u0159\7\17\2\2\u0159\u015a"+
		"\5\26\f\2\u015a\u015b\7(\2\2\u015b\u015f\7\21\2\2\u015c\u015e\5\6\4\2"+
		"\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\23\2\2"+
		"\u0163\u0164\7\t\2\2\u0164/\3\2\2\2\u0165\u0169\7\b\2\2\u0166\u0168\5"+
		"\6\4\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\32"+
		"\2\2\u016d\u016e\7\17\2\2\u016e\u016f\5\26\f\2\u016f\u0170\7(\2\2\u0170"+
		"\u0171\7\t\2\2\u0171\61\3\2\2\2\u0172\u0174\5\64\33\2\u0173\u0172\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\63\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\33\2\2\u0179\u017a\7/\2"+
		"\2\u017a\u017c\7\17\2\2\u017b\u017d\5:\36\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\7(\2\2\u017f\u0180\7\36"+
		"\2\2\u0180\u0182\5F$\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0187\7\t\2\2\u0184\u0186\5&\24\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018f\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018e\5\4\3\2\u018b\u018c\7\63\2\2\u018c"+
		"\u018e\5\24\13\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0191\3"+
		"\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0193\7\23\2\2\u0193\u0194\7\t\2\2\u0194\u0195\b"+
		"\33\1\2\u0195\65\3\2\2\2\u0196\u0197\7.\2\2\u0197\u0198\7\17\2\2\u0198"+
		"\u019d\5D#\2\u0199\u019a\7\22\2\2\u019a\u019c\5D#\2\u019b\u0199\3\2\2"+
		"\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7(\2\2\u01a1\u01b5\3\2\2\2\u01a2"+
		"\u01a3\7\7\2\2\u01a3\u01a4\7\17\2\2\u01a4\u01a9\7/\2\2\u01a5\u01a6\7\22"+
		"\2\2\u01a6\u01a8\7/\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ac\u01b5\7(\2\2\u01ad\u01ae\7/\2\2\u01ae\u01b0\7\17\2\2\u01af"+
		"\u01b1\58\35\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b3\7(\2\2\u01b3\u01b5\b\34\1\2\u01b4\u0196\3\2\2\2\u01b4"+
		"\u01a2\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b5\67\3\2\2\2\u01b6\u01bb\5D#\2"+
		"\u01b7\u01b8\7\22\2\2\u01b8\u01ba\5D#\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc9\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c3\5<\37\2\u01bf\u01c0\7\t\2\2\u01c0\u01c2\5<"+
		"\37\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4;\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\5F$\2\u01c7"+
		"\u01cb\7/\2\2\u01c8\u01ca\5> \2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2"+
		"\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb"+
		"\3\2\2\2\u01ce\u01cf\b\37\1\2\u01cf=\3\2\2\2\u01d0\u01d1\7\22\2\2\u01d1"+
		"\u01d2\7/\2\2\u01d2\u01d3\b \1\2\u01d3?\3\2\2\2\u01d4\u01d9\7/\2\2\u01d5"+
		"\u01d6\7\22\2\2\u01d6\u01d8\7/\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01daA\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01e0\7\r\2\2\u01dd\u01df\n\3\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\r\2\2\u01e4C\3\2\2\2\u01e5\u01e6"+
		"\5B\"\2\u01e6\u01e7\b#\1\2\u01e7\u01ec\3\2\2\2\u01e8\u01e9\5\36\20\2\u01e9"+
		"\u01ea\b#\1\2\u01ea\u01ec\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e8\3\2"+
		"\2\2\u01ecE\3\2\2\2\u01ed\u01ee\7$\2\2\u01ee\u01f6\b$\1\2\u01ef\u01f0"+
		"\7\25\2\2\u01f0\u01f6\b$\1\2\u01f1\u01f2\7\n\2\2\u01f2\u01f6\b$\1\2\u01f3"+
		"\u01f4\7-\2\2\u01f4\u01f6\b$\1\2\u01f5\u01ed\3\2\2\2\u01f5\u01ef\3\2\2"+
		"\2\u01f5\u01f1\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6G\3\2\2\2+NUco\u0080\u008d"+
		"\u0095\u009b\u00ab\u00b9\u00ca\u00cc\u00e6\u00f6\u00f8\u0109\u010b\u0119"+
		"\u012d\u0134\u014b\u0151\u015f\u0169\u0175\u017c\u0181\u0187\u018d\u018f"+
		"\u019d\u01a9\u01b0\u01b4\u01bb\u01c3\u01cb\u01d9\u01e0\u01eb\u01f5";
=======
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2"+
		"\3\2\6\2U\n\2\r\2\16\2V\3\2\3\2\3\2\3\3\7\3]\n\3\f\3\16\3`\13\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\7\b\u0081\n\b\f"+
		"\b\16\b\u0084\13\b\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\5\t\u008f"+
		"\n\t\3\t\3\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\f\5\f\u00c1\n\f\3\f\3\f\3\f\3\r\3"+
		"\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00d5\n\16\3\16\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e7\n\17\f\17\16"+
		"\17\u00ea\13\17\3\17\3\17\3\17\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4"+
		"\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0117\n\25\f\25\16\25\u011a\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0123\n\26\f\26\16\26\u0126\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012f\n\27\f\27\16\27\u0132"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u013b\n\30\f\30\16\30\u013e"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0147\n\31\f\31\16\31\u014a"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0153\n\32\f\32\16\32\u0156"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u015f\n\33\f\33\16\33\u0162"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016c\n\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\7$\u017f\n"+
		"$\f$\16$\u0182\13$\3%\3%\3%\3%\3%\3%\3%\7%\u018b\n%\f%\16%\u018e\13%\3"+
		"%\2\t(*,.\60\62\64&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFH\2\6\6\2\r\r\35\35  \"\"\4\2\5\5\37\37\4\2\'\'))\4\2"+
		"\3\3\20\20\u0194\2J\3\2\2\2\4^\3\2\2\2\6a\3\2\2\2\bd\3\2\2\2\nh\3\2\2"+
		"\2\f{\3\2\2\2\16}\3\2\2\2\20\u0085\3\2\2\2\22\u00a5\3\2\2\2\24\u00b2\3"+
		"\2\2\2\26\u00b4\3\2\2\2\30\u00c5\3\2\2\2\32\u00cc\3\2\2\2\34\u00e0\3\2"+
		"\2\2\36\u00ee\3\2\2\2 \u00fb\3\2\2\2\"\u0100\3\2\2\2$\u0106\3\2\2\2&\u0109"+
		"\3\2\2\2(\u010f\3\2\2\2*\u011b\3\2\2\2,\u0127\3\2\2\2.\u0133\3\2\2\2\60"+
		"\u013f\3\2\2\2\62\u014b\3\2\2\2\64\u0157\3\2\2\2\66\u016b\3\2\2\28\u016d"+
		"\3\2\2\2:\u016f\3\2\2\2<\u0171\3\2\2\2>\u0173\3\2\2\2@\u0175\3\2\2\2B"+
		"\u0177\3\2\2\2D\u0179\3\2\2\2F\u017b\3\2\2\2H\u0183\3\2\2\2JK\5\6\4\2"+
		"KL\7\n\2\2LP\5\4\3\2MO\5\20\t\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2SU\5\22\n\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WX\3\2\2\2XY\7\23\2\2YZ\7\26\2\2Z\3\3\2\2\2[]\5\b\5\2\\[\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2\2\2`^\3\2\2\2ab\7\31\2\2bc\7+\2"+
		"\2c\7\3\2\2\2de\5\f\7\2ef\5\16\b\2fg\7\n\2\2g\t\3\2\2\2hi\5\f\7\2ip\5"+
		"\16\b\2jk\7\n\2\2kl\5\f\7\2lm\5\16\b\2mo\3\2\2\2nj\3\2\2\2or\3\2\2\2p"+
		"n\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2st\7$\2\2t|\b\7\1\2uv\7\13\2"+
		"\2v|\b\7\1\2wx\7*\2\2x|\b\7\1\2yz\7\27\2\2z|\b\7\1\2{s\3\2\2\2{u\3\2\2"+
		"\2{w\3\2\2\2{y\3\2\2\2|\r\3\2\2\2}\u0082\7+\2\2~\177\7\22\2\2\177\u0081"+
		"\7+\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u0087\7+\2\2\u0087\u0089\7\17\2\2\u0088\u008a\5\n\6\2\u0089\u0088\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\7&\2\2\u008c"+
		"\u008d\7\34\2\2\u008d\u008f\5\f\7\2\u008e\u008c\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0095\5\4\3\2\u0092"+
		"\u0094\5\22\n\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7\23\2\2\u0099\u009a\7\n\2\2\u009a\21\3\2\2\2\u009b\u00a6\5 \21"+
		"\2\u009c\u00a6\5\"\22\2\u009d\u00a6\5&\24\2\u009e\u00a6\5\26\f\2\u009f"+
		"\u00a6\5\32\16\2\u00a0\u00a6\5\34\17\2\u00a1\u00a6\5\36\20\2\u00a2\u00a6"+
		"\5$\23\2\u00a3\u00a6\5H%\2\u00a4\u00a6\5\24\13\2\u00a5\u009b\3\2\2\2\u00a5"+
		"\u009c\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2"+
		"\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7+\2\2"+
		"\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5F$\2\u00aa\u00ab\7&\2\2\u00ab\u00ac"+
		"\7\n\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\u00af\7\17\2\2\u00af"+
		"\u00b0\5F$\2\u00b0\u00b1\7&\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a7\3\2\2"+
		"\2\u00b2\u00ad\3\2\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6"+
		"\7\17\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7&\2\2\u00b8\u00bc\7\6\2\2\u00b9"+
		"\u00bb\5\22\n\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\7\n\2\2\u00c4\27\3\2\2\2\u00c5"+
		"\u00c9\7(\2\2\u00c6\u00c8\5\22\n\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00ce\7+\2\2\u00ce\u00cf\7\f\2\2\u00cf"+
		"\u00d0\5(\25\2\u00d0\u00d1\7\32\2\2\u00d1\u00d4\5(\25\2\u00d2\u00d3\7"+
		"\25\2\2\u00d3\u00d5\5(\25\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00da\7\21\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\7"+
		"\n\2\2\u00df\33\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7\17\2\2\u00e2"+
		"\u00e3\5(\25\2\u00e3\u00e4\7&\2\2\u00e4\u00e8\7\21\2\2\u00e5\u00e7\5\22"+
		"\n\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\23"+
		"\2\2\u00ec\u00ed\7\n\2\2\u00ed\35\3\2\2\2\u00ee\u00f2\7\t\2\2\u00ef\u00f1"+
		"\5\22\n\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6"+
		"\7\32\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\7&\2\2"+
		"\u00f9\u00fa\7\n\2\2\u00fa\37\3\2\2\2\u00fb\u00fc\7+\2\2\u00fc\u00fd\7"+
		"\f\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7\n\2\2\u00ff!\3\2\2\2\u0100\u0101"+
		"\7\b\2\2\u0101\u0102\7\17\2\2\u0102\u0103\5\16\b\2\u0103\u0104\7&\2\2"+
		"\u0104\u0105\7\n\2\2\u0105#\3\2\2\2\u0106\u0107\7\7\2\2\u0107\u0108\7"+
		"\n\2\2\u0108%\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7\17\2\2\u010b\u010c"+
		"\5(\25\2\u010c\u010d\7&\2\2\u010d\u010e\7\n\2\2\u010e\'\3\2\2\2\u010f"+
		"\u0110\b\25\1\2\u0110\u0111\5*\26\2\u0111\u0118\3\2\2\2\u0112\u0113\f"+
		"\4\2\2\u0113\u0114\58\35\2\u0114\u0115\5*\26\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119)\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\26\1\2\u011c\u011d"+
		"\5,\27\2\u011d\u0124\3\2\2\2\u011e\u011f\f\4\2\2\u011f\u0120\5:\36\2\u0120"+
		"\u0121\5,\27\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125+\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\b\27\1\2\u0128\u0129\5.\30\2\u0129\u0130\3\2\2\2"+
		"\u012a\u012b\f\4\2\2\u012b\u012c\5<\37\2\u012c\u012d\5.\30\2\u012d\u012f"+
		"\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131-\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\b\30\1\2"+
		"\u0134\u0135\5\60\31\2\u0135\u013c\3\2\2\2\u0136\u0137\f\4\2\2\u0137\u0138"+
		"\5> \2\u0138\u0139\5\60\31\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d/\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\b\31\1\2\u0140\u0141\5\62\32\2\u0141"+
		"\u0148\3\2\2\2\u0142\u0143\f\4\2\2\u0143\u0144\5@!\2\u0144\u0145\5\62"+
		"\32\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\61\3\2\2\2\u014a\u0148\3\2\2"+
		"\2\u014b\u014c\b\32\1\2\u014c\u014d\5\64\33\2\u014d\u0154\3\2\2\2\u014e"+
		"\u014f\f\4\2\2\u014f\u0150\5B\"\2\u0150\u0151\5\64\33\2\u0151\u0153\3"+
		"\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\63\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b\33\1"+
		"\2\u0158\u0159\5\66\34\2\u0159\u0160\3\2\2\2\u015a\u015b\f\4\2\2\u015b"+
		"\u015c\5D#\2\u015c\u015d\5\66\34\2\u015d\u015f\3\2\2\2\u015e\u015a\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\65\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\17\2\2\u0164\u0165\5(\25"+
		"\2\u0165\u0166\7&\2\2\u0166\u016c\3\2\2\2\u0167\u016c\7,\2\2\u0168\u016c"+
		"\7+\2\2\u0169\u016c\5\24\13\2\u016a\u016c\7-\2\2\u016b\u0163\3\2\2\2\u016b"+
		"\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c\67\3\2\2\2\u016d\u016e\7!\2\2\u016e9\3\2\2\2\u016f\u0170\7"+
		"\16\2\2\u0170;\3\2\2\2\u0171\u0172\t\2\2\2\u0172=\3\2\2\2\u0173\u0174"+
		"\t\3\2\2\u0174?\3\2\2\2\u0175\u0176\t\4\2\2\u0176A\3\2\2\2\u0177\u0178"+
		"\t\5\2\2\u0178C\3\2\2\2\u0179\u017a\7%\2\2\u017aE\3\2\2\2\u017b\u0180"+
		"\5(\25\2\u017c\u017d\7\22\2\2\u017d\u017f\5(\25\2\u017e\u017c\3\2\2\2"+
		"\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181G\3"+
		"\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\24\2\2\u0184\u0185\5(\25\2\u0185"+
		"\u018c\7\n\2\2\u0186\u0187\7\24\2\2\u0187\u0188\5(\25\2\u0188\u0189\7"+
		"\n\2\2\u0189\u018b\3\2\2\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dI\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\36PV^p{\u0082\u0089\u008e\u0095\u00a5\u00b2\u00bc\u00c0\u00c9\u00d4\u00da"+
		"\u00e8\u00f2\u0118\u0124\u0130\u013c\u0148\u0154\u0160\u016b\u0180\u018c";
>>>>>>> origin/master
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}