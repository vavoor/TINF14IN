// Generated from Pipifax.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipifaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, INT=30, DOUBLE=31, STRING=32, 
		COMMENT=33, WS=34;
	public static final int
		RULE_program = 0, RULE_var_decl = 1, RULE_func_def = 2, RULE_type = 3, 
		RULE_param_list = 4, RULE_param = 5, RULE_param_type = 6, RULE_block = 7, 
		RULE_block_decl = 8, RULE_statement = 9, RULE_if_stmt = 10, RULE_while_stmt = 11, 
		RULE_assigment = 12, RULE_func_stmt = 13, RULE_func_call = 14, RULE_expr_list = 15, 
		RULE_lvalue = 16, RULE_expr = 17;
	public static final String[] ruleNames = {
		"program", "var_decl", "func_def", "type", "param_list", "param", "param_type", 
		"block", "block_decl", "statement", "if_stmt", "while_stmt", "assigment", 
		"func_stmt", "func_call", "expr_list", "lvalue", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'func'", "'('", "')'", "'int'", "'double'", "'string'", 
		"'['", "']'", "','", "'*'", "'{'", "'}'", "'if'", "'else'", "'while'", 
		"'='", "'-'", "'/'", "'+'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ID", "INT", "DOUBLE", "STRING", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pipifax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PipifaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				setState(38);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(36);
					var_decl();
					}
					break;
				case T__1:
					{
					setState(37);
					func_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(45);
			type();
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__1);
			setState(48);
			match(ID);
			setState(49);
			match(T__2);
			setState(50);
			param_list();
			setState(51);
			match(T__3);
			setState(53);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(52);
				type();
				}
			}

			setState(55);
			block();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class String_typeContext extends TypeContext {
		public String_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitString_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_typeContext extends TypeContext {
		public Int_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitInt_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Double_typeContext extends TypeContext {
		public Double_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitDouble_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_typeContext extends TypeContext {
		public TerminalNode INT() { return getToken(PipifaxParser.INT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new Int_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new Double_typeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new String_typeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new Array_typeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(T__7);
				setState(61);
				match(INT);
				setState(62);
				match(T__8);
				setState(63);
				type();
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

	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(66);
				param();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(67);
					match(T__9);
					setState(68);
					param();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			param_type();
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

	public static class Param_typeContext extends ParserRuleContext {
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
	 
		public Param_typeContext() { }
		public void copyFrom(Param_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ref_to_array_typeContext extends Param_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Ref_to_array_typeContext(Param_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitRef_to_array_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pass_through_typeContext extends Param_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Pass_through_typeContext(Param_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitPass_through_type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Reference_typeContext extends Param_typeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Reference_typeContext(Param_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitReference_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_type);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Pass_through_typeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				type();
				}
				break;
			case 2:
				_localctx = new Reference_typeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__10);
				setState(81);
				type();
				}
				break;
			case 3:
				_localctx = new Ref_to_array_typeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__10);
				setState(83);
				match(T__7);
				setState(84);
				match(T__8);
				setState(85);
				type();
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

	public static class BlockContext extends ParserRuleContext {
		public List<Block_declContext> block_decl() {
			return getRuleContexts(Block_declContext.class);
		}
		public Block_declContext block_decl(int i) {
			return getRuleContext(Block_declContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__11);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__13) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				block_decl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__12);
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

	public static class Block_declContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Block_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitBlock_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_declContext block_decl() throws RecognitionException {
		Block_declContext _localctx = new Block_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_decl);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case T__13:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				var_decl();
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

	public static class StatementContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				while_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				assigment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				func_stmt();
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

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__13);
			setState(108);
			expr(0);
			setState(109);
			block();
			setState(112);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(110);
				match(T__14);
				setState(111);
				block();
				}
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__15);
			setState(115);
			expr(0);
			setState(116);
			block();
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

	public static class AssigmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			lvalue(0);
			setState(119);
			match(T__16);
			setState(120);
			expr(0);
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

	public static class Func_stmtContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFunc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			func_call();
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(T__2);
			setState(126);
			expr_list();
			setState(127);
			match(T__3);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__17) | (1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				setState(129);
				expr(0);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(130);
					match(T__9);
					setState(131);
					expr(0);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipifaxParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LvalueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					match(T__7);
					setState(144);
					expr(0);
					setState(145);
					match(T__8);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PipifaxParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PipifaxParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(PipifaxParser.STRING, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PipifaxVisitor ) return ((PipifaxVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(153);
				match(INT);
				}
				break;
			case 2:
				{
				setState(154);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				setState(155);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(156);
				lvalue(0);
				}
				break;
			case 5:
				{
				setState(157);
				func_call();
				}
				break;
			case 6:
				{
				setState(158);
				match(T__2);
				setState(159);
				expr(0);
				setState(160);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(162);
				match(T__17);
				setState(163);
				expr(15);
				}
				break;
			case 8:
				{
				setState(164);
				match(T__2);
				setState(165);
				match(T__4);
				setState(166);
				match(T__3);
				setState(167);
				expr(14);
				}
				break;
			case 9:
				{
				setState(168);
				match(T__2);
				setState(169);
				match(T__5);
				setState(170);
				match(T__3);
				setState(171);
				expr(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(175);
						match(T__10);
						setState(176);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(178);
						match(T__18);
						setState(179);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(181);
						match(T__19);
						setState(182);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						match(T__17);
						setState(185);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						match(T__20);
						setState(188);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						match(T__21);
						setState(191);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						match(T__22);
						setState(194);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						match(T__23);
						setState(197);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						match(T__24);
						setState(200);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(T__25);
						setState(203);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						match(T__26);
						setState(206);
						expr(3);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(208);
						match(T__27);
						setState(209);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6"+
		"\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\5\6M\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\3\t\3\n\3\n"+
		"\5\nf\n\n\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\f\5\fs\n\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u0087\n\21\f\21\16\21\u008a\13\21\5\21\u008c\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0096\n\22\f\22\16\22\u0099"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00af\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23\3\23\2\4\""+
		"$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2\u00ee\2*\3\2\2\2\4"+
		"-\3\2\2\2\6\61\3\2\2\2\bB\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16X\3\2\2\2\20"+
		"Z\3\2\2\2\22e\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30t\3\2\2\2\32x\3\2\2\2"+
		"\34|\3\2\2\2\36~\3\2\2\2 \u008b\3\2\2\2\"\u008d\3\2\2\2$\u00ae\3\2\2\2"+
		"&)\5\4\3\2\')\5\6\4\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+\3\3\2\2\2,*\3\2\2\2-.\7\3\2\2./\7\37\2\2/\60\5\b\5\2\60\5\3\2\2\2"+
		"\61\62\7\4\2\2\62\63\7\37\2\2\63\64\7\5\2\2\64\65\5\n\6\2\65\67\7\6\2"+
		"\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\20\t\2:\7\3\2\2"+
		"\2;C\7\7\2\2<C\7\b\2\2=C\7\t\2\2>?\7\n\2\2?@\7 \2\2@A\7\13\2\2AC\5\b\5"+
		"\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2C\t\3\2\2\2DI\5\f\7\2EF\7\f"+
		"\2\2FH\5\f\7\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2"+
		"\2\2LD\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\7\37\2\2OP\5\16\b\2P\r\3\2\2\2"+
		"QY\5\b\5\2RS\7\r\2\2SY\5\b\5\2TU\7\r\2\2UV\7\n\2\2VW\7\13\2\2WY\5\b\5"+
		"\2XQ\3\2\2\2XR\3\2\2\2XT\3\2\2\2Y\17\3\2\2\2Z^\7\16\2\2[]\5\22\n\2\\["+
		"\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\17\2\2"+
		"b\21\3\2\2\2cf\5\24\13\2df\5\4\3\2ec\3\2\2\2ed\3\2\2\2f\23\3\2\2\2gl\5"+
		"\26\f\2hl\5\30\r\2il\5\32\16\2jl\5\34\17\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2"+
		"\2kj\3\2\2\2l\25\3\2\2\2mn\7\20\2\2no\5$\23\2or\5\20\t\2pq\7\21\2\2qs"+
		"\5\20\t\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tu\7\22\2\2uv\5$\23\2vw\5\20"+
		"\t\2w\31\3\2\2\2xy\5\"\22\2yz\7\23\2\2z{\5$\23\2{\33\3\2\2\2|}\5\36\20"+
		"\2}\35\3\2\2\2~\177\7\37\2\2\177\u0080\7\5\2\2\u0080\u0081\5 \21\2\u0081"+
		"\u0082\7\6\2\2\u0082\37\3\2\2\2\u0083\u0088\5$\23\2\u0084\u0085\7\f\2"+
		"\2\u0085\u0087\5$\23\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c!\3\2\2\2\u008d\u008e\b\22\1\2"+
		"\u008e\u008f\7\37\2\2\u008f\u0097\3\2\2\2\u0090\u0091\f\3\2\2\u0091\u0092"+
		"\7\n\2\2\u0092\u0093\5$\23\2\u0093\u0094\7\13\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0090\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098#\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\23\1\2\u009b"+
		"\u00af\7 \2\2\u009c\u00af\7!\2\2\u009d\u00af\7\"\2\2\u009e\u00af\5\"\22"+
		"\2\u009f\u00af\5\36\20\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5$\23\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00af\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00af\5"+
		"$\23\21\u00a6\u00a7\7\5\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7\6\2\2\u00a9"+
		"\u00af\5$\23\20\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\7"+
		"\6\2\2\u00ad\u00af\5$\23\17\u00ae\u009a\3\2\2\2\u00ae\u009c\3\2\2\2\u00ae"+
		"\u009d\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u009f\3\2\2\2\u00ae\u00a0\3\2"+
		"\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af"+
		"\u00d6\3\2\2\2\u00b0\u00b1\f\16\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00d5\5"+
		"$\23\17\u00b3\u00b4\f\r\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00d5\5$\23\16"+
		"\u00b6\u00b7\f\f\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00d5\5$\23\r\u00b9\u00ba"+
		"\f\13\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00d5\5$\23\f\u00bc\u00bd\f\n\2\2"+
		"\u00bd\u00be\7\27\2\2\u00be\u00d5\5$\23\13\u00bf\u00c0\f\t\2\2\u00c0\u00c1"+
		"\7\30\2\2\u00c1\u00d5\5$\23\n\u00c2\u00c3\f\b\2\2\u00c3\u00c4\7\31\2\2"+
		"\u00c4\u00d5\5$\23\t\u00c5\u00c6\f\7\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00d5"+
		"\5$\23\b\u00c8\u00c9\f\6\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00d5\5$\23\7"+
		"\u00cb\u00cc\f\5\2\2\u00cc\u00cd\7\34\2\2\u00cd\u00d5\5$\23\6\u00ce\u00cf"+
		"\f\4\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d5\5$\23\5\u00d1\u00d2\f\3\2\2"+
		"\u00d2\u00d3\7\36\2\2\u00d3\u00d5\5$\23\4\u00d4\u00b0\3\2\2\2\u00d4\u00b3"+
		"\3\2\2\2\u00d4\u00b6\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4"+
		"\u00bf\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2"+
		"\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\23(*\67BILX^ekr\u0088\u008b\u0097\u00ae\u00d4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}