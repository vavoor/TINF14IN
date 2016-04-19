// Generated from FSM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FSMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Name=7, WS=8;
	public static final int
		RULE_fsm = 0, RULE_stateDef = 1, RULE_transition = 2;
	public static final String[] ruleNames = {
		"fsm", "stateDef", "transition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'start'", "'state'", "':'", "'do'", "'on'", "'goto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Name", "WS"
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
	public String getGrammarFileName() { return "FSM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FSMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FsmContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(FSMParser.Name, 0); }
		public List<StateDefContext> stateDef() {
			return getRuleContexts(StateDefContext.class);
		}
		public StateDefContext stateDef(int i) {
			return getRuleContext(StateDefContext.class,i);
		}
		public FsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fsm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FSMVisitor ) return ((FSMVisitor<? extends T>)visitor).visitFsm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FsmContext fsm() throws RecognitionException {
		FsmContext _localctx = new FsmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fsm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(T__0);
			setState(7);
			match(Name);
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(8);
				stateDef();
				}
				}
				setState(13);
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

	public static class StateDefContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(FSMParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(FSMParser.Name, i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public StateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FSMVisitor ) return ((FSMVisitor<? extends T>)visitor).visitStateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__1);
			setState(15);
			match(Name);
			setState(16);
			match(T__2);
			setState(19);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(17);
				match(T__3);
				setState(18);
				match(Name);
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(21);
				transition();
				}
				}
				setState(26);
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

	public static class TransitionContext extends ParserRuleContext {
		public List<TerminalNode> Name() { return getTokens(FSMParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(FSMParser.Name, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FSMVisitor ) return ((FSMVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__4);
			setState(28);
			match(Name);
			setState(29);
			match(T__5);
			setState(30);
			match(Name);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\26\n\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\2"+
		"\2\5\2\4\6\2\2\"\2\b\3\2\2\2\4\20\3\2\2\2\6\35\3\2\2\2\b\t\7\3\2\2\t\r"+
		"\7\t\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2"+
		"\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21\7\4\2\2\21\22\7\t\2\2\22\25\7\5\2\2"+
		"\23\24\7\6\2\2\24\26\7\t\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\32\3\2\2\2"+
		"\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\5\3\2\2\2\34\32\3\2\2\2\35\36\7\7\2\2\36\37\7\t\2\2\37 \7\b\2\2 !"+
		"\7\t\2\2!\7\3\2\2\2\5\r\25\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}