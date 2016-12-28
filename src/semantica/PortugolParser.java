// Generated from Portugol.g4 by ANTLR 4.4

   package semantica;
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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, ID=41, NUM=42, STRING=43, WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'IMPRIMA'", "'!='", "'ENTAO'", "'SAIR'", "'LEIA'", 
		"'REPITA'", "';'", "'REAL'", "'='", "'<='", "'&'", "'('", "'*'", "'FACA'", 
		"','", "'FIM'", "'RETORNE'", "'PASSO'", "'.'", "'STRING'", "'SE'", "'PROG'", 
		"'ATE'", "'FUNCAO'", "':'", "'>='", "'PARA'", "'=='", "'<'", "'|'", "'>'", 
		"'ENQUANTO'", "'INTEIRO'", "'!'", "')'", "'+'", "'SENAO'", "'-'", "'BOOLEANO'", 
		"ID", "NUM", "STRING", "WS"
	};
	public static final int
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


		public Map<String, Simbolo> tabelaDeSimbolos = new HashMap<String, Simbolo>();
		public Map<String, Funcao> tabelaDeFuncoes = new HashMap<String, Funcao>();

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DecFuncContext decFunc(int i) {
			return getRuleContext(DecFuncContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DecFuncContext> decFunc() {
			return getRuleContexts(DecFuncContext.class);
		}
		public DeclaraVariaviesContext declaraVariavies() {
			return getRuleContext(DeclaraVariaviesContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0) );
			setState(86); match(T__23);
			setState(87); match(T__20);
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

	public static class CabecalhoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitCabecalho(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__17);
			setState(96); match(ID);
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

	public static class DecVarsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public DecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecVars(this);
		}
	}

	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); tipo();
			setState(99); listaIDs();
			setState(100); match(T__32);
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

	public static class DecParamsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public ListaIDsContext listaIDs(int i) {
			return getRuleContext(ListaIDsContext.class,i);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<ListaIDsContext> listaIDs() {
			return getRuleContexts(ListaIDsContext.class);
		}
		public DecParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecParams(this);
		}
	}

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

	public static class TipoContext extends ParserRuleContext {
		public int tip;
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTipo(this);
		}
	}

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

	public static class ListaIDsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(124); match(T__24);
				setState(125); match(ID);
				}
				}
				setState(130);
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

	public static class DecFuncContext extends ParserRuleContext {
		public DecParamsContext decParams() {
			return getRuleContext(DecParamsContext.class,0);
		}
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
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecFunc(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			_la = _input.LA(1);
			if (_la==T__14) {
				{
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

	public static class ComandosContext extends ParserRuleContext {
		public ChamadaFuncContext chamadaFunc() {
			return getRuleContext(ChamadaFuncContext.class,0);
		}
		public RepitaContext repita() {
			return getRuleContext(RepitaContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public SairContext sair() {
			return getRuleContext(SairContext.class,0);
		}
		public SeEntaoContext seEntao() {
			return getRuleContext(SeEntaoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ImpressaoContext impressao() {
			return getRuleContext(ImpressaoContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitComandos(this);
		}
	}

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
				}
				break;
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

	public static class ChamadaFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ListaExprsContext listaExprs() {
			return getRuleContext(ListaExprsContext.class,0);
		}
		public ChamadaFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterChamadaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitChamadaFunc(this);
		}
	}

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
				}
				break;
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

	public static class SeEntaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeEntaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seEntao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSeEntao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSeEntao(this);
		}
	}

	public final SeEntaoContext seEntao() throws RecognitionException {
		SeEntaoContext _localctx = new SeEntaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seEntao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(189); senao();
				}
			}

			setState(192); match(T__23);
			setState(193); match(T__32);
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

	public static class SenaoContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_senao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
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

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(T__23);
			setState(220); match(T__32);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
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
				{
				{
				setState(227); comandos();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(T__23);
			setState(234); match(T__32);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
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

	public final RepitaContext repita() throws RecognitionException {
		RepitaContext _localctx = new RepitaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243); match(T__16);
			setState(244); match(T__27);
			setState(245); expr(0);
			setState(246); match(T__4);
			setState(247); match(T__32);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(ID);
			setState(250); match(T__30);
			setState(251); expr(0);
			setState(252); match(T__32);
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

	public static class LeituraContext extends ParserRuleContext {
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLeitura(this);
		}
	}

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

	public static class SairContext extends ParserRuleContext {
		public SairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSair(this);
		}
	}

	public final SairContext sair() throws RecognitionException {
		SairContext _localctx = new SairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(T__35);
			setState(261); match(T__32);
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

	public static class ImpressaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitImpressao(this);
		}
	}

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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_n7Context op_n7() {
			return getRuleContext(Op_n7Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExpr(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term1Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Op_n6Context op_n6() {
			return getRuleContext(Op_n6Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm1(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term2Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Op_n5Context op_n5() {
			return getRuleContext(Op_n5Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm2(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term3Context extends ParserRuleContext {
		public Op_n4Context op_n4() {
			return getRuleContext(Op_n4Context.class,0);
		}
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm3(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term4Context extends ParserRuleContext {
		public Op_n3Context op_n3() {
			return getRuleContext(Op_n3Context.class,0);
		}
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Term4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm4(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term5Context extends ParserRuleContext {
		public Op_n2Context op_n2() {
			return getRuleContext(Op_n2Context.class,0);
		}
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Term5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm5(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Term6Context extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Op_n1Context op_n1() {
			return getRuleContext(Op_n1Context.class,0);
		}
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public Term6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm6(this);
		}
	}

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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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
					{
					{
					_localctx = new Term6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term6);
					setState(344);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(345); op_n1();
					setState(346); fator();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public ChamadaFuncContext chamadaFunc() {
			return getRuleContext(ChamadaFuncContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PortugolParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(PortugolParser.STRING, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFator(this);
		}
	}

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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(359); chamadaFunc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360); match(STRING);
				}
				break;
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
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_n6Context extends ParserRuleContext {
		public Op_n6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n6(this);
		}
	}

	public final Op_n6Context op_n6() throws RecognitionException {
		Op_n6Context _localctx = new Op_n6Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_n6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(T__28);
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

	public static class Op_n5Context extends ParserRuleContext {
		public Op_n5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n5(this);
		}
	}

	public final Op_n5Context op_n5() throws RecognitionException {
		Op_n5Context _localctx = new Op_n5Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_n5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__13) | (1L << T__10) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n4Context extends ParserRuleContext {
		public Op_n4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n4(this);
		}
	}

	public final Op_n4Context op_n4() throws RecognitionException {
		Op_n4Context _localctx = new Op_n4Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_n4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n3Context extends ParserRuleContext {
		public Op_n3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n3(this);
		}
	}

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

	public static class Op_n2Context extends ParserRuleContext {
		public Op_n2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n2(this);
		}
	}

	public final Op_n2Context op_n2() throws RecognitionException {
		Op_n2Context _localctx = new Op_n2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_n2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n1Context extends ParserRuleContext {
		public Op_n1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n1(this);
		}
	}

	public final Op_n1Context op_n1() throws RecognitionException {
		Op_n1Context _localctx = new Op_n1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_n1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(T__5);
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

	public static class ListaExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListaExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterListaExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitListaExprs(this);
		}
	}

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
				}
				}
				setState(384);
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

	public static class RetornoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitRetorno(this);
		}
	}

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
		}
		return true;
	}
	private boolean term1_sempred(Term1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term6_sempred(Term6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term4_sempred(Term4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term5_sempred(Term5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}