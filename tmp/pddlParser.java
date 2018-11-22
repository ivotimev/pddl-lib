// Generated from pddl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pddlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, REQUIRE_KEY=68, NAME=69, VARIABLE=70, NUMBER=71, LINE_COMMENT=72, 
		WHITESPACE=73, DOMAIN=74, DOMAIN_NAME=75, REQUIREMENTS=76, TYPES=77, EITHER_TYPE=78, 
		CONSTANTS=79, FUNCTIONS=80, PREDICATES=81, ACTION=82, DURATIVE_ACTION=83, 
		PROBLEM=84, PROBLEM_NAME=85, PROBLEM_DOMAIN=86, OBJECTS=87, INIT=88, FUNC_HEAD=89, 
		PRECONDITION=90, EFFECT=91, AND_GD=92, OR_GD=93, NOT_GD=94, IMPLY_GD=95, 
		EXISTS_GD=96, FORALL_GD=97, COMPARISON_GD=98, AND_EFFECT=99, FORALL_EFFECT=100, 
		WHEN_EFFECT=101, ASSIGN_EFFECT=102, NOT_EFFECT=103, PRED_HEAD=104, GOAL=105, 
		BINARY_OP=106, UNARY_MINUS=107, INIT_EQ=108, INIT_AT=109, NOT_PRED_INIT=110, 
		PRED_INST=111, PROBLEM_CONSTRAINT=112, PROBLEM_METRIC=113;
	public static final int
		RULE_pddlDoc = 0, RULE_domain = 1, RULE_domainName = 2, RULE_requireDef = 3, 
		RULE_typesDef = 4, RULE_typedNameList = 5, RULE_singleTypeNameList = 6, 
		RULE_r_type = 7, RULE_primType = 8, RULE_functionsDef = 9, RULE_functionList = 10, 
		RULE_atomicFunctionSkeleton = 11, RULE_functionSymbol = 12, RULE_functionType = 13, 
		RULE_constantsDef = 14, RULE_predicatesDef = 15, RULE_atomicFormulaSkeleton = 16, 
		RULE_predicate = 17, RULE_typedVariableList = 18, RULE_singleTypeVarList = 19, 
		RULE_constraints = 20, RULE_structureDef = 21, RULE_actionDef = 22, RULE_actionSymbol = 23, 
		RULE_actionDefBody = 24, RULE_precondition = 25, RULE_goalDesc = 26, RULE_fComp = 27, 
		RULE_atomicTermFormula = 28, RULE_term = 29, RULE_durativeActionDef = 30, 
		RULE_daDefBody = 31, RULE_daGD = 32, RULE_prefTimedGD = 33, RULE_timedGD = 34, 
		RULE_timeSpecifier = 35, RULE_interval = 36, RULE_derivedDef = 37, RULE_fExp = 38, 
		RULE_fExp2 = 39, RULE_fHead = 40, RULE_effect = 41, RULE_cEffect = 42, 
		RULE_pEffect = 43, RULE_condEffect = 44, RULE_binaryOp = 45, RULE_binaryComp = 46, 
		RULE_assignOp = 47, RULE_durationConstraint = 48, RULE_simpleDurationConstraint = 49, 
		RULE_durOp = 50, RULE_durValue = 51, RULE_daEffect = 52, RULE_timedEffect = 53, 
		RULE_fAssignDA = 54, RULE_fExpDA = 55, RULE_assignOpT = 56, RULE_problem = 57, 
		RULE_problemDecl = 58, RULE_problemDomain = 59, RULE_objectDecl = 60, 
		RULE_init = 61, RULE_initEl = 62, RULE_nameLiteral = 63, RULE_atomicNameFormula = 64, 
		RULE_goal = 65, RULE_probConstraints = 66, RULE_prefConGD = 67, RULE_metricSpec = 68, 
		RULE_optimization = 69, RULE_metricFExp = 70, RULE_conGD = 71, RULE_name = 72;
	public static final String[] ruleNames = {
		"pddlDoc", "domain", "domainName", "requireDef", "typesDef", "typedNameList", 
		"singleTypeNameList", "r_type", "primType", "functionsDef", "functionList", 
		"atomicFunctionSkeleton", "functionSymbol", "functionType", "constantsDef", 
		"predicatesDef", "atomicFormulaSkeleton", "predicate", "typedVariableList", 
		"singleTypeVarList", "constraints", "structureDef", "actionDef", "actionSymbol", 
		"actionDefBody", "precondition", "goalDesc", "fComp", "atomicTermFormula", 
		"term", "durativeActionDef", "daDefBody", "daGD", "prefTimedGD", "timedGD", 
		"timeSpecifier", "interval", "derivedDef", "fExp", "fExp2", "fHead", "effect", 
		"cEffect", "pEffect", "condEffect", "binaryOp", "binaryComp", "assignOp", 
		"durationConstraint", "simpleDurationConstraint", "durOp", "durValue", 
		"daEffect", "timedEffect", "fAssignDA", "fExpDA", "assignOpT", "problem", 
		"problemDecl", "problemDomain", "objectDecl", "init", "initEl", "nameLiteral", 
		"atomicNameFormula", "goal", "probConstraints", "prefConGD", "metricSpec", 
		"optimization", "metricFExp", "conGD", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'define'", "')'", "'domain'", "':requirements'", "':types'", 
		"'-'", "'either'", "':functions'", "'number'", "':constants'", "':predicates'", 
		"':constraints'", "':action'", "':parameters'", "':precondition'", "':effect'", 
		"'and'", "'or'", "'not'", "'imply'", "'exists'", "'forall'", "':durative-action'", 
		"':duration'", "':condition'", "'preference'", "'at'", "'over'", "'start'", 
		"'end'", "'all'", "':derived'", "'when'", "'*'", "'+'", "'/'", "'>'", 
		"'<'", "'='", "'>='", "'<='", "'assign'", "'scale-up'", "'scale-down'", 
		"'increase'", "'decrease'", "'?duration'", "'problem'", "':domain'", "':objects'", 
		"':init'", "':goal'", "':metric'", "'minimize'", "'maximize'", "'total-time'", 
		"'is-violated'", "'always'", "'sometime'", "'within'", "'at-most-once'", 
		"'sometime-after'", "'sometime-before'", "'always-within'", "'hold-during'", 
		"'hold-after'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "REQUIRE_KEY", "NAME", 
		"VARIABLE", "NUMBER", "LINE_COMMENT", "WHITESPACE", "DOMAIN", "DOMAIN_NAME", 
		"REQUIREMENTS", "TYPES", "EITHER_TYPE", "CONSTANTS", "FUNCTIONS", "PREDICATES", 
		"ACTION", "DURATIVE_ACTION", "PROBLEM", "PROBLEM_NAME", "PROBLEM_DOMAIN", 
		"OBJECTS", "INIT", "FUNC_HEAD", "PRECONDITION", "EFFECT", "AND_GD", "OR_GD", 
		"NOT_GD", "IMPLY_GD", "EXISTS_GD", "FORALL_GD", "COMPARISON_GD", "AND_EFFECT", 
		"FORALL_EFFECT", "WHEN_EFFECT", "ASSIGN_EFFECT", "NOT_EFFECT", "PRED_HEAD", 
		"GOAL", "BINARY_OP", "UNARY_MINUS", "INIT_EQ", "INIT_AT", "NOT_PRED_INIT", 
		"PRED_INST", "PROBLEM_CONSTRAINT", "PROBLEM_METRIC"
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
	public String getGrammarFileName() { return "pddl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pddlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PddlDocContext extends ParserRuleContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public ProblemContext problem() {
			return getRuleContext(ProblemContext.class,0);
		}
		public PddlDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pddlDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPddlDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPddlDoc(this);
		}
	}

	public final PddlDocContext pddlDoc() throws RecognitionException {
		PddlDocContext _localctx = new PddlDocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pddlDoc);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				domain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				problem();
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

	public static class DomainContext extends ParserRuleContext {
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public RequireDefContext requireDef() {
			return getRuleContext(RequireDefContext.class,0);
		}
		public TypesDefContext typesDef() {
			return getRuleContext(TypesDefContext.class,0);
		}
		public ConstantsDefContext constantsDef() {
			return getRuleContext(ConstantsDefContext.class,0);
		}
		public PredicatesDefContext predicatesDef() {
			return getRuleContext(PredicatesDefContext.class,0);
		}
		public FunctionsDefContext functionsDef() {
			return getRuleContext(FunctionsDefContext.class,0);
		}
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public List<StructureDefContext> structureDef() {
			return getRuleContexts(StructureDefContext.class);
		}
		public StructureDefContext structureDef(int i) {
			return getRuleContext(StructureDefContext.class,i);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDomain(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_domain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__0);
			setState(151);
			match(T__1);
			setState(152);
			domainName();
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(153);
				requireDef();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(156);
				typesDef();
				}
				break;
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(159);
				constantsDef();
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(162);
				predicatesDef();
				}
				break;
			}
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(165);
				functionsDef();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(168);
				constraints();
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(171);
				structureDef();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__2);
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

	public static class DomainNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDomainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDomainName(this);
		}
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__0);
			setState(180);
			match(T__3);
			setState(181);
			name();
			setState(182);
			match(T__2);
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

	public static class RequireDefContext extends ParserRuleContext {
		public List<TerminalNode> REQUIRE_KEY() { return getTokens(pddlParser.REQUIRE_KEY); }
		public TerminalNode REQUIRE_KEY(int i) {
			return getToken(pddlParser.REQUIRE_KEY, i);
		}
		public RequireDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterRequireDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitRequireDef(this);
		}
	}

	public final RequireDefContext requireDef() throws RecognitionException {
		RequireDefContext _localctx = new RequireDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_requireDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__0);
			setState(185);
			match(T__4);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(REQUIRE_KEY);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==REQUIRE_KEY );
			setState(191);
			match(T__2);
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

	public static class TypesDefContext extends ParserRuleContext {
		public TypedNameListContext typedNameList() {
			return getRuleContext(TypedNameListContext.class,0);
		}
		public TypesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTypesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTypesDef(this);
		}
	}

	public final TypesDefContext typesDef() throws RecognitionException {
		TypesDefContext _localctx = new TypesDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typesDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__0);
			setState(194);
			match(T__5);
			setState(195);
			typedNameList();
			setState(196);
			match(T__2);
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

	public static class TypedNameListContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<SingleTypeNameListContext> singleTypeNameList() {
			return getRuleContexts(SingleTypeNameListContext.class);
		}
		public SingleTypeNameListContext singleTypeNameList(int i) {
			return getRuleContext(SingleTypeNameListContext.class,i);
		}
		public TypedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTypedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTypedNameList(this);
		}
	}

	public final TypedNameListContext typedNameList() throws RecognitionException {
		TypedNameListContext _localctx = new TypedNameListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedNameList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
					{
					{
					setState(198);
					name();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(204);
						singleTypeNameList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
					{
					{
					setState(209);
					name();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class SingleTypeNameListContext extends ParserRuleContext {
		public R_typeContext t;
		public R_typeContext r_type() {
			return getRuleContext(R_typeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public SingleTypeNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterSingleTypeNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitSingleTypeNameList(this);
		}
	}

	public final SingleTypeNameListContext singleTypeNameList() throws RecognitionException {
		SingleTypeNameListContext _localctx = new SingleTypeNameListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTypeNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				name();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0) );
			setState(222);
			match(T__6);
			setState(223);
			((SingleTypeNameListContext)_localctx).t = r_type();
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

	public static class R_typeContext extends ParserRuleContext {
		public List<PrimTypeContext> primType() {
			return getRuleContexts(PrimTypeContext.class);
		}
		public PrimTypeContext primType(int i) {
			return getRuleContext(PrimTypeContext.class,i);
		}
		public R_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterR_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitR_type(this);
		}
	}

	public final R_typeContext r_type() throws RecognitionException {
		R_typeContext _localctx = new R_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r_type);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(225);
				match(T__0);
				setState(226);
				match(T__7);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					primType();
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0) );
				setState(232);
				match(T__2);
				}
				}
				break;
			case T__27:
			case T__28:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				primType();
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

	public static class PrimTypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPrimType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPrimType(this);
		}
	}

	public final PrimTypeContext primType() throws RecognitionException {
		PrimTypeContext _localctx = new PrimTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			name();
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

	public static class FunctionsDefContext extends ParserRuleContext {
		public FunctionListContext functionList() {
			return getRuleContext(FunctionListContext.class,0);
		}
		public FunctionsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFunctionsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFunctionsDef(this);
		}
	}

	public final FunctionsDefContext functionsDef() throws RecognitionException {
		FunctionsDefContext _localctx = new FunctionsDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionsDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__0);
			setState(240);
			match(T__8);
			setState(241);
			functionList();
			setState(242);
			match(T__2);
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

	public static class FunctionListContext extends ParserRuleContext {
		public List<AtomicFunctionSkeletonContext> atomicFunctionSkeleton() {
			return getRuleContexts(AtomicFunctionSkeletonContext.class);
		}
		public AtomicFunctionSkeletonContext atomicFunctionSkeleton(int i) {
			return getRuleContext(AtomicFunctionSkeletonContext.class,i);
		}
		public List<FunctionTypeContext> functionType() {
			return getRuleContexts(FunctionTypeContext.class);
		}
		public FunctionTypeContext functionType(int i) {
			return getRuleContext(FunctionTypeContext.class,i);
		}
		public FunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFunctionList(this);
		}
	}

	public final FunctionListContext functionList() throws RecognitionException {
		FunctionListContext _localctx = new FunctionListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(244);
						atomicFunctionSkeleton();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(249);
					match(T__6);
					setState(250);
					functionType();
					}
				}

				}
				}
				setState(257);
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

	public static class AtomicFunctionSkeletonContext extends ParserRuleContext {
		public FunctionSymbolContext functionSymbol() {
			return getRuleContext(FunctionSymbolContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public AtomicFunctionSkeletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicFunctionSkeleton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAtomicFunctionSkeleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAtomicFunctionSkeleton(this);
		}
	}

	public final AtomicFunctionSkeletonContext atomicFunctionSkeleton() throws RecognitionException {
		AtomicFunctionSkeletonContext _localctx = new AtomicFunctionSkeletonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomicFunctionSkeleton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__0);
			setState(259);
			functionSymbol();
			setState(260);
			typedVariableList();
			setState(261);
			match(T__2);
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

	public static class FunctionSymbolContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFunctionSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFunctionSymbol(this);
		}
	}

	public final FunctionSymbolContext functionSymbol() throws RecognitionException {
		FunctionSymbolContext _localctx = new FunctionSymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			name();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__9);
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

	public static class ConstantsDefContext extends ParserRuleContext {
		public TypedNameListContext typedNameList() {
			return getRuleContext(TypedNameListContext.class,0);
		}
		public ConstantsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterConstantsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitConstantsDef(this);
		}
	}

	public final ConstantsDefContext constantsDef() throws RecognitionException {
		ConstantsDefContext _localctx = new ConstantsDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantsDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__0);
			setState(268);
			match(T__10);
			setState(269);
			typedNameList();
			setState(270);
			match(T__2);
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

	public static class PredicatesDefContext extends ParserRuleContext {
		public List<AtomicFormulaSkeletonContext> atomicFormulaSkeleton() {
			return getRuleContexts(AtomicFormulaSkeletonContext.class);
		}
		public AtomicFormulaSkeletonContext atomicFormulaSkeleton(int i) {
			return getRuleContext(AtomicFormulaSkeletonContext.class,i);
		}
		public PredicatesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicatesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPredicatesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPredicatesDef(this);
		}
	}

	public final PredicatesDefContext predicatesDef() throws RecognitionException {
		PredicatesDefContext _localctx = new PredicatesDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_predicatesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__0);
			setState(273);
			match(T__11);
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				atomicFormulaSkeleton();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(279);
			match(T__2);
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

	public static class AtomicFormulaSkeletonContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public AtomicFormulaSkeletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicFormulaSkeleton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAtomicFormulaSkeleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAtomicFormulaSkeleton(this);
		}
	}

	public final AtomicFormulaSkeletonContext atomicFormulaSkeleton() throws RecognitionException {
		AtomicFormulaSkeletonContext _localctx = new AtomicFormulaSkeletonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atomicFormulaSkeleton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__0);
			setState(282);
			predicate();
			setState(283);
			typedVariableList();
			setState(284);
			match(T__2);
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

	public static class PredicateContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			name();
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

	public static class TypedVariableListContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(pddlParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(pddlParser.VARIABLE, i);
		}
		public List<SingleTypeVarListContext> singleTypeVarList() {
			return getRuleContexts(SingleTypeVarListContext.class);
		}
		public SingleTypeVarListContext singleTypeVarList(int i) {
			return getRuleContext(SingleTypeVarListContext.class,i);
		}
		public TypedVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTypedVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTypedVariableList(this);
		}
	}

	public final TypedVariableListContext typedVariableList() throws RecognitionException {
		TypedVariableListContext _localctx = new TypedVariableListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typedVariableList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VARIABLE) {
					{
					{
					setState(288);
					match(VARIABLE);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(295); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(294);
						singleTypeVarList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(297); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VARIABLE) {
					{
					{
					setState(299);
					match(VARIABLE);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class SingleTypeVarListContext extends ParserRuleContext {
		public R_typeContext t;
		public R_typeContext r_type() {
			return getRuleContext(R_typeContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(pddlParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(pddlParser.VARIABLE, i);
		}
		public SingleTypeVarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeVarList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterSingleTypeVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitSingleTypeVarList(this);
		}
	}

	public final SingleTypeVarListContext singleTypeVarList() throws RecognitionException {
		SingleTypeVarListContext _localctx = new SingleTypeVarListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_singleTypeVarList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				match(VARIABLE);
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(312);
			match(T__6);
			setState(313);
			((SingleTypeVarListContext)_localctx).t = r_type();
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

	public static class ConstraintsContext extends ParserRuleContext {
		public ConGDContext conGD() {
			return getRuleContext(ConGDContext.class,0);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitConstraints(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constraints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__0);
			setState(316);
			match(T__12);
			setState(317);
			conGD();
			setState(318);
			match(T__2);
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

	public static class StructureDefContext extends ParserRuleContext {
		public ActionDefContext actionDef() {
			return getRuleContext(ActionDefContext.class,0);
		}
		public DurativeActionDefContext durativeActionDef() {
			return getRuleContext(DurativeActionDefContext.class,0);
		}
		public DerivedDefContext derivedDef() {
			return getRuleContext(DerivedDefContext.class,0);
		}
		public StructureDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterStructureDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitStructureDef(this);
		}
	}

	public final StructureDefContext structureDef() throws RecognitionException {
		StructureDefContext _localctx = new StructureDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structureDef);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				actionDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				durativeActionDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				derivedDef();
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

	public static class ActionDefContext extends ParserRuleContext {
		public ActionSymbolContext actionSymbol() {
			return getRuleContext(ActionSymbolContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public ActionDefBodyContext actionDefBody() {
			return getRuleContext(ActionDefBodyContext.class,0);
		}
		public ActionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterActionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitActionDef(this);
		}
	}

	public final ActionDefContext actionDef() throws RecognitionException {
		ActionDefContext _localctx = new ActionDefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_actionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__0);
			setState(326);
			match(T__13);
			setState(327);
			actionSymbol();
			setState(328);
			match(T__14);
			setState(329);
			match(T__0);
			setState(330);
			typedVariableList();
			setState(331);
			match(T__2);
			setState(332);
			actionDefBody();
			setState(333);
			match(T__2);
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

	public static class ActionSymbolContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ActionSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterActionSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitActionSymbol(this);
		}
	}

	public final ActionSymbolContext actionSymbol() throws RecognitionException {
		ActionSymbolContext _localctx = new ActionSymbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_actionSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			name();
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

	public static class ActionDefBodyContext extends ParserRuleContext {
		public PreconditionContext precondition() {
			return getRuleContext(PreconditionContext.class,0);
		}
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public ActionDefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDefBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterActionDefBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitActionDefBody(this);
		}
	}

	public final ActionDefBodyContext actionDefBody() throws RecognitionException {
		ActionDefBodyContext _localctx = new ActionDefBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_actionDefBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(337);
				match(T__15);
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					{
					setState(338);
					match(T__0);
					setState(339);
					match(T__2);
					}
					}
					break;
				case 2:
					{
					setState(340);
					precondition();
					}
					break;
				}
				}
			}

			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(345);
				match(T__16);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					{
					setState(346);
					match(T__0);
					setState(347);
					match(T__2);
					}
					}
					break;
				case 2:
					{
					setState(348);
					effect();
					}
					break;
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

	public static class PreconditionContext extends ParserRuleContext {
		public GoalDescContext goalDesc() {
			return getRuleContext(GoalDescContext.class,0);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPrecondition(this);
		}
	}

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_precondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			goalDesc();
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

	public static class GoalDescContext extends ParserRuleContext {
		public AtomicTermFormulaContext atomicTermFormula() {
			return getRuleContext(AtomicTermFormulaContext.class,0);
		}
		public List<GoalDescContext> goalDesc() {
			return getRuleContexts(GoalDescContext.class);
		}
		public GoalDescContext goalDesc(int i) {
			return getRuleContext(GoalDescContext.class,i);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public FCompContext fComp() {
			return getRuleContext(FCompContext.class,0);
		}
		public GoalDescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalDesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterGoalDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitGoalDesc(this);
		}
	}

	public final GoalDescContext goalDesc() throws RecognitionException {
		GoalDescContext _localctx = new GoalDescContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_goalDesc);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				atomicTermFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(T__0);
				setState(357);
				match(T__17);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(358);
					goalDesc();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(T__0);
				setState(366);
				match(T__18);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(367);
					goalDesc();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				match(T__0);
				setState(375);
				match(T__19);
				setState(376);
				goalDesc();
				setState(377);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(T__0);
				setState(380);
				match(T__20);
				setState(381);
				goalDesc();
				setState(382);
				goalDesc();
				setState(383);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				match(T__0);
				setState(386);
				match(T__21);
				setState(387);
				match(T__0);
				setState(388);
				typedVariableList();
				setState(389);
				match(T__2);
				setState(390);
				goalDesc();
				setState(391);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				match(T__0);
				setState(394);
				match(T__22);
				setState(395);
				match(T__0);
				setState(396);
				typedVariableList();
				setState(397);
				match(T__2);
				setState(398);
				goalDesc();
				setState(399);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				fComp();
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

	public static class FCompContext extends ParserRuleContext {
		public BinaryCompContext binaryComp() {
			return getRuleContext(BinaryCompContext.class,0);
		}
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public FCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFComp(this);
		}
	}

	public final FCompContext fComp() throws RecognitionException {
		FCompContext _localctx = new FCompContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__0);
			setState(405);
			binaryComp();
			setState(406);
			fExp();
			setState(407);
			fExp();
			setState(408);
			match(T__2);
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

	public static class AtomicTermFormulaContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AtomicTermFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTermFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAtomicTermFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAtomicTermFormula(this);
		}
	}

	public final AtomicTermFormulaContext atomicTermFormula() throws RecognitionException {
		AtomicTermFormulaContext _localctx = new AtomicTermFormulaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atomicTermFormula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__0);
			setState(411);
			predicate();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)) | (1L << (VARIABLE - 28)))) != 0)) {
				{
				{
				setState(412);
				term();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(T__2);
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

	public static class TermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(pddlParser.VARIABLE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				name();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(VARIABLE);
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

	public static class DurativeActionDefContext extends ParserRuleContext {
		public ActionSymbolContext actionSymbol() {
			return getRuleContext(ActionSymbolContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public DaDefBodyContext daDefBody() {
			return getRuleContext(DaDefBodyContext.class,0);
		}
		public DurativeActionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durativeActionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDurativeActionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDurativeActionDef(this);
		}
	}

	public final DurativeActionDefContext durativeActionDef() throws RecognitionException {
		DurativeActionDefContext _localctx = new DurativeActionDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_durativeActionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__0);
			setState(425);
			match(T__23);
			setState(426);
			actionSymbol();
			setState(427);
			match(T__14);
			setState(428);
			match(T__0);
			setState(429);
			typedVariableList();
			setState(430);
			match(T__2);
			setState(431);
			daDefBody();
			setState(432);
			match(T__2);
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

	public static class DaDefBodyContext extends ParserRuleContext {
		public DurationConstraintContext durationConstraint() {
			return getRuleContext(DurationConstraintContext.class,0);
		}
		public DaGDContext daGD() {
			return getRuleContext(DaGDContext.class,0);
		}
		public DaEffectContext daEffect() {
			return getRuleContext(DaEffectContext.class,0);
		}
		public DaDefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daDefBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDaDefBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDaDefBody(this);
		}
	}

	public final DaDefBodyContext daDefBody() throws RecognitionException {
		DaDefBodyContext _localctx = new DaDefBodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_daDefBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__24);
			setState(435);
			durationConstraint();
			setState(436);
			match(T__25);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				{
				setState(437);
				match(T__0);
				setState(438);
				match(T__2);
				}
				}
				break;
			case 2:
				{
				setState(439);
				daGD();
				}
				break;
			}
			setState(442);
			match(T__16);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				{
				setState(443);
				match(T__0);
				setState(444);
				match(T__2);
				}
				}
				break;
			case 2:
				{
				setState(445);
				daEffect();
				}
				break;
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

	public static class DaGDContext extends ParserRuleContext {
		public PrefTimedGDContext prefTimedGD() {
			return getRuleContext(PrefTimedGDContext.class,0);
		}
		public List<DaGDContext> daGD() {
			return getRuleContexts(DaGDContext.class);
		}
		public DaGDContext daGD(int i) {
			return getRuleContext(DaGDContext.class,i);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public DaGDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daGD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDaGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDaGD(this);
		}
	}

	public final DaGDContext daGD() throws RecognitionException {
		DaGDContext _localctx = new DaGDContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_daGD);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				prefTimedGD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(T__0);
				setState(450);
				match(T__17);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(451);
					daGD();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(T__0);
				setState(459);
				match(T__22);
				setState(460);
				match(T__0);
				setState(461);
				typedVariableList();
				setState(462);
				match(T__2);
				setState(463);
				daGD();
				setState(464);
				match(T__2);
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

	public static class PrefTimedGDContext extends ParserRuleContext {
		public TimedGDContext timedGD() {
			return getRuleContext(TimedGDContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrefTimedGDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefTimedGD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPrefTimedGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPrefTimedGD(this);
		}
	}

	public final PrefTimedGDContext prefTimedGD() throws RecognitionException {
		PrefTimedGDContext _localctx = new PrefTimedGDContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_prefTimedGD);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				timedGD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(T__0);
				setState(470);
				match(T__26);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
					{
					setState(471);
					name();
					}
				}

				setState(474);
				timedGD();
				setState(475);
				match(T__2);
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

	public static class TimedGDContext extends ParserRuleContext {
		public TimeSpecifierContext timeSpecifier() {
			return getRuleContext(TimeSpecifierContext.class,0);
		}
		public GoalDescContext goalDesc() {
			return getRuleContext(GoalDescContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimedGDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedGD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTimedGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTimedGD(this);
		}
	}

	public final TimedGDContext timedGD() throws RecognitionException {
		TimedGDContext _localctx = new TimedGDContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_timedGD);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(T__0);
				setState(480);
				match(T__27);
				setState(481);
				timeSpecifier();
				setState(482);
				goalDesc();
				setState(483);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(T__0);
				setState(486);
				match(T__28);
				setState(487);
				interval();
				setState(488);
				goalDesc();
				setState(489);
				match(T__2);
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

	public static class TimeSpecifierContext extends ParserRuleContext {
		public TimeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTimeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTimeSpecifier(this);
		}
	}

	public final TimeSpecifierContext timeSpecifier() throws RecognitionException {
		TimeSpecifierContext _localctx = new TimeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_timeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IntervalContext extends ParserRuleContext {
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__31);
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

	public static class DerivedDefContext extends ParserRuleContext {
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public GoalDescContext goalDesc() {
			return getRuleContext(GoalDescContext.class,0);
		}
		public DerivedDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDerivedDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDerivedDef(this);
		}
	}

	public final DerivedDefContext derivedDef() throws RecognitionException {
		DerivedDefContext _localctx = new DerivedDefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_derivedDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__0);
			setState(498);
			match(T__32);
			setState(499);
			typedVariableList();
			setState(500);
			goalDesc();
			setState(501);
			match(T__2);
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

	public static class FExpContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pddlParser.NUMBER, 0); }
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public FExp2Context fExp2() {
			return getRuleContext(FExp2Context.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public FExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFExp(this);
		}
	}

	public final FExpContext fExp() throws RecognitionException {
		FExpContext _localctx = new FExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fExp);
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(T__0);
				setState(505);
				binaryOp();
				setState(506);
				fExp();
				setState(507);
				fExp2();
				setState(508);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(T__0);
				setState(511);
				match(T__6);
				setState(512);
				fExp();
				setState(513);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				fHead();
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

	public static class FExp2Context extends ParserRuleContext {
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public FExp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fExp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFExp2(this);
		}
	}

	public final FExp2Context fExp2() throws RecognitionException {
		FExp2Context _localctx = new FExp2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_fExp2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			fExp();
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

	public static class FHeadContext extends ParserRuleContext {
		public FunctionSymbolContext functionSymbol() {
			return getRuleContext(FunctionSymbolContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public FHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFHead(this);
		}
	}

	public final FHeadContext fHead() throws RecognitionException {
		FHeadContext _localctx = new FHeadContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fHead);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(T__0);
				setState(521);
				functionSymbol();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)) | (1L << (VARIABLE - 28)))) != 0)) {
					{
					{
					setState(522);
					term();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				match(T__2);
				}
				break;
			case T__27:
			case T__28:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				functionSymbol();
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

	public static class EffectContext extends ParserRuleContext {
		public List<CEffectContext> cEffect() {
			return getRuleContexts(CEffectContext.class);
		}
		public CEffectContext cEffect(int i) {
			return getRuleContext(CEffectContext.class,i);
		}
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitEffect(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_effect);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(T__0);
				setState(534);
				match(T__17);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(535);
					cEffect();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				cEffect();
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

	public static class CEffectContext extends ParserRuleContext {
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public GoalDescContext goalDesc() {
			return getRuleContext(GoalDescContext.class,0);
		}
		public CondEffectContext condEffect() {
			return getRuleContext(CondEffectContext.class,0);
		}
		public PEffectContext pEffect() {
			return getRuleContext(PEffectContext.class,0);
		}
		public CEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterCEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitCEffect(this);
		}
	}

	public final CEffectContext cEffect() throws RecognitionException {
		CEffectContext _localctx = new CEffectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cEffect);
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(T__0);
				setState(546);
				match(T__22);
				setState(547);
				match(T__0);
				setState(548);
				typedVariableList();
				setState(549);
				match(T__2);
				setState(550);
				effect();
				setState(551);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(T__0);
				setState(554);
				match(T__33);
				setState(555);
				goalDesc();
				setState(556);
				condEffect();
				setState(557);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				pEffect();
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

	public static class PEffectContext extends ParserRuleContext {
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public AtomicTermFormulaContext atomicTermFormula() {
			return getRuleContext(AtomicTermFormulaContext.class,0);
		}
		public PEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPEffect(this);
		}
	}

	public final PEffectContext pEffect() throws RecognitionException {
		PEffectContext _localctx = new PEffectContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pEffect);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(T__0);
				setState(563);
				assignOp();
				setState(564);
				fHead();
				setState(565);
				fExp();
				setState(566);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(T__0);
				setState(569);
				match(T__19);
				setState(570);
				atomicTermFormula();
				setState(571);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				atomicTermFormula();
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

	public static class CondEffectContext extends ParserRuleContext {
		public List<PEffectContext> pEffect() {
			return getRuleContexts(PEffectContext.class);
		}
		public PEffectContext pEffect(int i) {
			return getRuleContext(PEffectContext.class,i);
		}
		public CondEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterCondEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitCondEffect(this);
		}
	}

	public final CondEffectContext condEffect() throws RecognitionException {
		CondEffectContext _localctx = new CondEffectContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_condEffect);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(T__0);
				setState(577);
				match(T__17);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(578);
					pEffect();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				pEffect();
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

	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitBinaryOp(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinaryCompContext extends ParserRuleContext {
		public BinaryCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterBinaryComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitBinaryComp(this);
		}
	}

	public final BinaryCompContext binaryComp() throws RecognitionException {
		BinaryCompContext _localctx = new BinaryCompContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_binaryComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AssignOpContext extends ParserRuleContext {
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DurationConstraintContext extends ParserRuleContext {
		public List<SimpleDurationConstraintContext> simpleDurationConstraint() {
			return getRuleContexts(SimpleDurationConstraintContext.class);
		}
		public SimpleDurationConstraintContext simpleDurationConstraint(int i) {
			return getRuleContext(SimpleDurationConstraintContext.class,i);
		}
		public DurationConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDurationConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDurationConstraint(this);
		}
	}

	public final DurationConstraintContext durationConstraint() throws RecognitionException {
		DurationConstraintContext _localctx = new DurationConstraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_durationConstraint);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(T__0);
				setState(595);
				match(T__17);
				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(596);
					simpleDurationConstraint();
					}
					}
					setState(599); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(601);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(T__0);
				setState(604);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				simpleDurationConstraint();
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

	public static class SimpleDurationConstraintContext extends ParserRuleContext {
		public DurOpContext durOp() {
			return getRuleContext(DurOpContext.class,0);
		}
		public DurValueContext durValue() {
			return getRuleContext(DurValueContext.class,0);
		}
		public TimeSpecifierContext timeSpecifier() {
			return getRuleContext(TimeSpecifierContext.class,0);
		}
		public SimpleDurationConstraintContext simpleDurationConstraint() {
			return getRuleContext(SimpleDurationConstraintContext.class,0);
		}
		public SimpleDurationConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDurationConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterSimpleDurationConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitSimpleDurationConstraint(this);
		}
	}

	public final SimpleDurationConstraintContext simpleDurationConstraint() throws RecognitionException {
		SimpleDurationConstraintContext _localctx = new SimpleDurationConstraintContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleDurationConstraint);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(T__0);
				setState(609);
				durOp();
				setState(610);
				match(T__47);
				setState(611);
				durValue();
				setState(612);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T__0);
				setState(615);
				match(T__27);
				setState(616);
				timeSpecifier();
				setState(617);
				simpleDurationConstraint();
				setState(618);
				match(T__2);
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

	public static class DurOpContext extends ParserRuleContext {
		public DurOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDurOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDurOp(this);
		}
	}

	public final DurOpContext durOp() throws RecognitionException {
		DurOpContext _localctx = new DurOpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_durOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DurValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pddlParser.NUMBER, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public DurValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDurValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDurValue(this);
		}
	}

	public final DurValueContext durValue() throws RecognitionException {
		DurValueContext _localctx = new DurValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_durValue);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				fExp();
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

	public static class DaEffectContext extends ParserRuleContext {
		public List<DaEffectContext> daEffect() {
			return getRuleContexts(DaEffectContext.class);
		}
		public DaEffectContext daEffect(int i) {
			return getRuleContext(DaEffectContext.class,i);
		}
		public TimedEffectContext timedEffect() {
			return getRuleContext(TimedEffectContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public DaGDContext daGD() {
			return getRuleContext(DaGDContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public FExpDAContext fExpDA() {
			return getRuleContext(FExpDAContext.class,0);
		}
		public DaEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterDaEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitDaEffect(this);
		}
	}

	public final DaEffectContext daEffect() throws RecognitionException {
		DaEffectContext _localctx = new DaEffectContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_daEffect);
		int _la;
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(T__0);
				setState(629);
				match(T__17);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(630);
					daEffect();
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				timedEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(T__0);
				setState(639);
				match(T__22);
				setState(640);
				match(T__0);
				setState(641);
				typedVariableList();
				setState(642);
				match(T__2);
				setState(643);
				daEffect();
				setState(644);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				match(T__0);
				setState(647);
				match(T__33);
				setState(648);
				daGD();
				setState(649);
				timedEffect();
				setState(650);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				match(T__0);
				setState(653);
				assignOp();
				setState(654);
				fHead();
				setState(655);
				fExpDA();
				setState(656);
				match(T__2);
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

	public static class TimedEffectContext extends ParserRuleContext {
		public TimeSpecifierContext timeSpecifier() {
			return getRuleContext(TimeSpecifierContext.class,0);
		}
		public CEffectContext cEffect() {
			return getRuleContext(CEffectContext.class,0);
		}
		public FAssignDAContext fAssignDA() {
			return getRuleContext(FAssignDAContext.class,0);
		}
		public AssignOpTContext assignOpT() {
			return getRuleContext(AssignOpTContext.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TimedEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timedEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterTimedEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitTimedEffect(this);
		}
	}

	public final TimedEffectContext timedEffect() throws RecognitionException {
		TimedEffectContext _localctx = new TimedEffectContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_timedEffect);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				match(T__0);
				setState(661);
				match(T__27);
				setState(662);
				timeSpecifier();
				setState(663);
				cEffect();
				setState(664);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(T__0);
				setState(667);
				match(T__27);
				setState(668);
				timeSpecifier();
				setState(669);
				fAssignDA();
				setState(670);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(T__0);
				setState(673);
				assignOpT();
				setState(674);
				fHead();
				setState(675);
				fExp();
				setState(676);
				match(T__2);
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

	public static class FAssignDAContext extends ParserRuleContext {
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public FExpDAContext fExpDA() {
			return getRuleContext(FExpDAContext.class,0);
		}
		public FAssignDAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAssignDA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFAssignDA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFAssignDA(this);
		}
	}

	public final FAssignDAContext fAssignDA() throws RecognitionException {
		FAssignDAContext _localctx = new FAssignDAContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fAssignDA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(T__0);
			setState(681);
			assignOp();
			setState(682);
			fHead();
			setState(683);
			fExpDA();
			setState(684);
			match(T__2);
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

	public static class FExpDAContext extends ParserRuleContext {
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public List<FExpDAContext> fExpDA() {
			return getRuleContexts(FExpDAContext.class);
		}
		public FExpDAContext fExpDA(int i) {
			return getRuleContext(FExpDAContext.class,i);
		}
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public FExpDAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fExpDA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterFExpDA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitFExpDA(this);
		}
	}

	public final FExpDAContext fExpDA() throws RecognitionException {
		FExpDAContext _localctx = new FExpDAContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_fExpDA);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(T__0);
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					{
					setState(687);
					binaryOp();
					setState(688);
					fExpDA();
					setState(689);
					fExpDA();
					}
					}
					break;
				case 2:
					{
					{
					setState(691);
					match(T__6);
					setState(692);
					fExpDA();
					}
					}
					break;
				}
				setState(695);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				fExp();
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

	public static class AssignOpTContext extends ParserRuleContext {
		public AssignOpTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOpT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAssignOpT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAssignOpT(this);
		}
	}

	public final AssignOpTContext assignOpT() throws RecognitionException {
		AssignOpTContext _localctx = new AssignOpTContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignOpT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProblemContext extends ParserRuleContext {
		public ProblemDeclContext problemDecl() {
			return getRuleContext(ProblemDeclContext.class,0);
		}
		public ProblemDomainContext problemDomain() {
			return getRuleContext(ProblemDomainContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public GoalContext goal() {
			return getRuleContext(GoalContext.class,0);
		}
		public RequireDefContext requireDef() {
			return getRuleContext(RequireDefContext.class,0);
		}
		public ObjectDeclContext objectDecl() {
			return getRuleContext(ObjectDeclContext.class,0);
		}
		public ProbConstraintsContext probConstraints() {
			return getRuleContext(ProbConstraintsContext.class,0);
		}
		public MetricSpecContext metricSpec() {
			return getRuleContext(MetricSpecContext.class,0);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitProblem(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_problem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__0);
			setState(704);
			match(T__1);
			setState(705);
			problemDecl();
			setState(706);
			problemDomain();
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(707);
				requireDef();
				}
				break;
			}
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(710);
				objectDecl();
				}
				break;
			}
			setState(713);
			init();
			setState(714);
			goal();
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(715);
				probConstraints();
				}
				break;
			}
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(718);
				metricSpec();
				}
			}

			setState(721);
			match(T__2);
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

	public static class ProblemDeclContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ProblemDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterProblemDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitProblemDecl(this);
		}
	}

	public final ProblemDeclContext problemDecl() throws RecognitionException {
		ProblemDeclContext _localctx = new ProblemDeclContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_problemDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__0);
			setState(724);
			match(T__48);
			setState(725);
			name();
			setState(726);
			match(T__2);
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

	public static class ProblemDomainContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ProblemDomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemDomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterProblemDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitProblemDomain(this);
		}
	}

	public final ProblemDomainContext problemDomain() throws RecognitionException {
		ProblemDomainContext _localctx = new ProblemDomainContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_problemDomain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T__0);
			setState(729);
			match(T__49);
			setState(730);
			name();
			setState(731);
			match(T__2);
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

	public static class ObjectDeclContext extends ParserRuleContext {
		public TypedNameListContext typedNameList() {
			return getRuleContext(TypedNameListContext.class,0);
		}
		public ObjectDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterObjectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitObjectDecl(this);
		}
	}

	public final ObjectDeclContext objectDecl() throws RecognitionException {
		ObjectDeclContext _localctx = new ObjectDeclContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_objectDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(T__0);
			setState(734);
			match(T__50);
			setState(735);
			typedNameList();
			setState(736);
			match(T__2);
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

	public static class InitContext extends ParserRuleContext {
		public List<InitElContext> initEl() {
			return getRuleContexts(InitElContext.class);
		}
		public InitElContext initEl(int i) {
			return getRuleContext(InitElContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__0);
			setState(739);
			match(T__51);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(740);
				initEl();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746);
			match(T__2);
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

	public static class InitElContext extends ParserRuleContext {
		public NameLiteralContext nameLiteral() {
			return getRuleContext(NameLiteralContext.class,0);
		}
		public FHeadContext fHead() {
			return getRuleContext(FHeadContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(pddlParser.NUMBER, 0); }
		public InitElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initEl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterInitEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitInitEl(this);
		}
	}

	public final InitElContext initEl() throws RecognitionException {
		InitElContext _localctx = new InitElContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_initEl);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				nameLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(T__0);
				setState(750);
				match(T__39);
				setState(751);
				fHead();
				setState(752);
				match(NUMBER);
				setState(753);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				match(T__0);
				setState(756);
				match(T__27);
				setState(757);
				match(NUMBER);
				setState(758);
				nameLiteral();
				setState(759);
				match(T__2);
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

	public static class NameLiteralContext extends ParserRuleContext {
		public AtomicNameFormulaContext atomicNameFormula() {
			return getRuleContext(AtomicNameFormulaContext.class,0);
		}
		public NameLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterNameLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitNameLiteral(this);
		}
	}

	public final NameLiteralContext nameLiteral() throws RecognitionException {
		NameLiteralContext _localctx = new NameLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nameLiteral);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				atomicNameFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(T__0);
				setState(765);
				match(T__19);
				setState(766);
				atomicNameFormula();
				setState(767);
				match(T__2);
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

	public static class AtomicNameFormulaContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public AtomicNameFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicNameFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterAtomicNameFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitAtomicNameFormula(this);
		}
	}

	public final AtomicNameFormulaContext atomicNameFormula() throws RecognitionException {
		AtomicNameFormulaContext _localctx = new AtomicNameFormulaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_atomicNameFormula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__0);
			setState(772);
			predicate();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
				{
				{
				setState(773);
				name();
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
			match(T__2);
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

	public static class GoalContext extends ParserRuleContext {
		public GoalDescContext goalDesc() {
			return getRuleContext(GoalDescContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(T__0);
			setState(782);
			match(T__52);
			setState(783);
			goalDesc();
			setState(784);
			match(T__2);
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

	public static class ProbConstraintsContext extends ParserRuleContext {
		public PrefConGDContext prefConGD() {
			return getRuleContext(PrefConGDContext.class,0);
		}
		public ProbConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterProbConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitProbConstraints(this);
		}
	}

	public final ProbConstraintsContext probConstraints() throws RecognitionException {
		ProbConstraintsContext _localctx = new ProbConstraintsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_probConstraints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__0);
			setState(787);
			match(T__12);
			setState(788);
			prefConGD();
			setState(789);
			match(T__2);
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

	public static class PrefConGDContext extends ParserRuleContext {
		public List<PrefConGDContext> prefConGD() {
			return getRuleContexts(PrefConGDContext.class);
		}
		public PrefConGDContext prefConGD(int i) {
			return getRuleContext(PrefConGDContext.class,i);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public ConGDContext conGD() {
			return getRuleContext(ConGDContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrefConGDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefConGD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterPrefConGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitPrefConGD(this);
		}
	}

	public final PrefConGDContext prefConGD() throws RecognitionException {
		PrefConGDContext _localctx = new PrefConGDContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_prefConGD);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(T__0);
				setState(792);
				match(T__17);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(793);
					prefConGD();
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(799);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				match(T__0);
				setState(801);
				match(T__22);
				setState(802);
				match(T__0);
				setState(803);
				typedVariableList();
				setState(804);
				match(T__2);
				setState(805);
				prefConGD();
				setState(806);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(T__0);
				setState(809);
				match(T__26);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
					{
					setState(810);
					name();
					}
				}

				setState(813);
				conGD();
				setState(814);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
				conGD();
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

	public static class MetricSpecContext extends ParserRuleContext {
		public OptimizationContext optimization() {
			return getRuleContext(OptimizationContext.class,0);
		}
		public MetricFExpContext metricFExp() {
			return getRuleContext(MetricFExpContext.class,0);
		}
		public MetricSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterMetricSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitMetricSpec(this);
		}
	}

	public final MetricSpecContext metricSpec() throws RecognitionException {
		MetricSpecContext _localctx = new MetricSpecContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_metricSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(T__0);
			setState(820);
			match(T__53);
			setState(821);
			optimization();
			setState(822);
			metricFExp();
			setState(823);
			match(T__2);
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

	public static class OptimizationContext extends ParserRuleContext {
		public OptimizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterOptimization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitOptimization(this);
		}
	}

	public final OptimizationContext optimization() throws RecognitionException {
		OptimizationContext _localctx = new OptimizationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_optimization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MetricFExpContext extends ParserRuleContext {
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public List<MetricFExpContext> metricFExp() {
			return getRuleContexts(MetricFExpContext.class);
		}
		public MetricFExpContext metricFExp(int i) {
			return getRuleContext(MetricFExpContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(pddlParser.NUMBER, 0); }
		public FunctionSymbolContext functionSymbol() {
			return getRuleContext(FunctionSymbolContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public MetricFExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metricFExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterMetricFExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitMetricFExp(this);
		}
	}

	public final MetricFExpContext metricFExp() throws RecognitionException {
		MetricFExpContext _localctx = new MetricFExpContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_metricFExp);
		int _la;
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				match(T__0);
				setState(828);
				binaryOp();
				setState(829);
				metricFExp();
				setState(830);
				metricFExp();
				setState(831);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(T__0);
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(835);
				metricFExp();
				setState(837); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(836);
					metricFExp();
					}
					}
					setState(839); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__27) | (1L << T__28) | (1L << T__56))) != 0) || _la==NAME || _la==NUMBER );
				setState(841);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(T__0);
				setState(844);
				match(T__6);
				setState(845);
				metricFExp();
				setState(846);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(848);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(849);
				match(T__0);
				setState(850);
				functionSymbol();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) {
					{
					{
					setState(851);
					name();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(857);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(859);
				functionSymbol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(860);
				match(T__56);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(861);
				match(T__0);
				setState(862);
				match(T__57);
				setState(863);
				name();
				setState(864);
				match(T__2);
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

	public static class ConGDContext extends ParserRuleContext {
		public List<ConGDContext> conGD() {
			return getRuleContexts(ConGDContext.class);
		}
		public ConGDContext conGD(int i) {
			return getRuleContext(ConGDContext.class,i);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public List<GoalDescContext> goalDesc() {
			return getRuleContexts(GoalDescContext.class);
		}
		public GoalDescContext goalDesc(int i) {
			return getRuleContext(GoalDescContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(pddlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pddlParser.NUMBER, i);
		}
		public ConGDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conGD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterConGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitConGD(this);
		}
	}

	public final ConGDContext conGD() throws RecognitionException {
		ConGDContext _localctx = new ConGDContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_conGD);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(T__0);
				setState(869);
				match(T__17);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(870);
					conGD();
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(876);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(T__0);
				setState(878);
				match(T__22);
				setState(879);
				match(T__0);
				setState(880);
				typedVariableList();
				setState(881);
				match(T__2);
				setState(882);
				conGD();
				setState(883);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				match(T__0);
				setState(886);
				match(T__27);
				setState(887);
				match(T__30);
				setState(888);
				goalDesc();
				setState(889);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				match(T__0);
				setState(892);
				match(T__58);
				setState(893);
				goalDesc();
				setState(894);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(T__0);
				setState(897);
				match(T__59);
				setState(898);
				goalDesc();
				setState(899);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(901);
				match(T__0);
				setState(902);
				match(T__60);
				setState(903);
				match(NUMBER);
				setState(904);
				goalDesc();
				setState(905);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(907);
				match(T__0);
				setState(908);
				match(T__61);
				setState(909);
				goalDesc();
				setState(910);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(912);
				match(T__0);
				setState(913);
				match(T__62);
				setState(914);
				goalDesc();
				setState(915);
				goalDesc();
				setState(916);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(918);
				match(T__0);
				setState(919);
				match(T__63);
				setState(920);
				goalDesc();
				setState(921);
				goalDesc();
				setState(922);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(924);
				match(T__0);
				setState(925);
				match(T__64);
				setState(926);
				match(NUMBER);
				setState(927);
				goalDesc();
				setState(928);
				goalDesc();
				setState(929);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(931);
				match(T__0);
				setState(932);
				match(T__65);
				setState(933);
				match(NUMBER);
				setState(934);
				match(NUMBER);
				setState(935);
				goalDesc();
				setState(936);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(938);
				match(T__0);
				setState(939);
				match(T__66);
				setState(940);
				match(NUMBER);
				setState(941);
				goalDesc();
				setState(942);
				match(T__2);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(pddlParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pddlListener ) ((pddlListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (NAME - 28)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u03b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\5\2\u0097\n\2\3\3\3\3\3\3\3\3\5\3\u009d\n\3\3\3\5\3"+
		"\u00a0\n\3\3\3\5\3\u00a3\n\3\3\3\5\3\u00a6\n\3\3\3\5\3\u00a9\n\3\3\3\5"+
		"\3\u00ac\n\3\3\3\7\3\u00af\n\3\f\3\16\3\u00b2\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\6\5\u00be\n\5\r\5\16\5\u00bf\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\7\7\u00ca\n\7\f\7\16\7\u00cd\13\7\3\7\6\7\u00d0\n\7\r\7\16"+
		"\7\u00d1\3\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\5\7\u00da\n\7\3\b\6\b\u00dd"+
		"\n\b\r\b\16\b\u00de\3\b\3\b\3\b\3\t\3\t\3\t\6\t\u00e7\n\t\r\t\16\t\u00e8"+
		"\3\t\3\t\3\t\5\t\u00ee\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u00f8"+
		"\n\f\r\f\16\f\u00f9\3\f\3\f\5\f\u00fe\n\f\7\f\u0100\n\f\f\f\16\f\u0103"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\6\21\u0116\n\21\r\21\16\21\u0117\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\7\24\u0124\n\24\f\24\16\24\u0127\13\24\3"+
		"\24\6\24\u012a\n\24\r\24\16\24\u012b\3\24\7\24\u012f\n\24\f\24\16\24\u0132"+
		"\13\24\5\24\u0134\n\24\3\25\6\25\u0137\n\25\r\25\16\25\u0138\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0146\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\5\32\u0158\n\32\5\32\u015a\n\32\3\32\3\32\3\32\3\32\5\32\u0160\n\32\5"+
		"\32\u0162\n\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u016a\n\34\f\34\16\34"+
		"\u016d\13\34\3\34\3\34\3\34\3\34\7\34\u0173\n\34\f\34\16\34\u0176\13\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0195\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36"+
		"\u01a0\n\36\f\36\16\36\u01a3\13\36\3\36\3\36\3\37\3\37\5\37\u01a9\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u01bb\n!\3!\3!\3!"+
		"\3!\5!\u01c1\n!\3\"\3\"\3\"\3\"\7\"\u01c7\n\"\f\"\16\"\u01ca\13\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01d5\n\"\3#\3#\3#\3#\5#\u01db\n"+
		"#\3#\3#\3#\5#\u01e0\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01ee\n"+
		"$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u0207\n(\3)\3)\3*\3*\3*\7*\u020e\n*\f*\16*\u0211\13*\3*\3*"+
		"\3*\5*\u0216\n*\3+\3+\3+\7+\u021b\n+\f+\16+\u021e\13+\3+\3+\5+\u0222\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0233\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0241\n-\3.\3.\3.\7.\u0246\n.\f.\16.\u0249"+
		"\13.\3.\3.\5.\u024d\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\6\62\u0258"+
		"\n\62\r\62\16\62\u0259\3\62\3\62\3\62\3\62\3\62\5\62\u0261\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u026f\n\63"+
		"\3\64\3\64\3\65\3\65\5\65\u0275\n\65\3\66\3\66\3\66\7\66\u027a\n\66\f"+
		"\66\16\66\u027d\13\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0295"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u02a9\n\67\38\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\59\u02b8\n9\39\39\39\39\59\u02be\n9\3:\3:\3;\3;\3;\3;\3;\5"+
		";\u02c7\n;\3;\5;\u02ca\n;\3;\3;\3;\5;\u02cf\n;\3;\5;\u02d2\n;\3;\3;\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\7?\u02e8\n?\f?\16"+
		"?\u02eb\13?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02fc\n@\3"+
		"A\3A\3A\3A\3A\3A\5A\u0304\nA\3B\3B\3B\7B\u0309\nB\fB\16B\u030c\13B\3B"+
		"\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\7E\u031d\nE\fE\16E\u0320\13"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u032e\nE\3E\3E\3E\3E\5E\u0334"+
		"\nE\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\6H\u0348\nH"+
		"\rH\16H\u0349\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0357\nH\fH\16H\u035a"+
		"\13H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0365\nH\3I\3I\3I\7I\u036a\nI\fI\16"+
		"I\u036d\13I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u03b3\nI\3J\3J\3J\2\2K\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2\13\3\2 !\4\2\t\t%\'"+
		"\3\2(,\3\2-\61\3\2*,\3\2\60\61\3\29:\4\2%%\'\'\4\2\36\37GG\2\u03de\2\u0096"+
		"\3\2\2\2\4\u0098\3\2\2\2\6\u00b5\3\2\2\2\b\u00ba\3\2\2\2\n\u00c3\3\2\2"+
		"\2\f\u00d9\3\2\2\2\16\u00dc\3\2\2\2\20\u00ed\3\2\2\2\22\u00ef\3\2\2\2"+
		"\24\u00f1\3\2\2\2\26\u0101\3\2\2\2\30\u0104\3\2\2\2\32\u0109\3\2\2\2\34"+
		"\u010b\3\2\2\2\36\u010d\3\2\2\2 \u0112\3\2\2\2\"\u011b\3\2\2\2$\u0120"+
		"\3\2\2\2&\u0133\3\2\2\2(\u0136\3\2\2\2*\u013d\3\2\2\2,\u0145\3\2\2\2."+
		"\u0147\3\2\2\2\60\u0151\3\2\2\2\62\u0159\3\2\2\2\64\u0163\3\2\2\2\66\u0194"+
		"\3\2\2\28\u0196\3\2\2\2:\u019c\3\2\2\2<\u01a8\3\2\2\2>\u01aa\3\2\2\2@"+
		"\u01b4\3\2\2\2B\u01d4\3\2\2\2D\u01df\3\2\2\2F\u01ed\3\2\2\2H\u01ef\3\2"+
		"\2\2J\u01f1\3\2\2\2L\u01f3\3\2\2\2N\u0206\3\2\2\2P\u0208\3\2\2\2R\u0215"+
		"\3\2\2\2T\u0221\3\2\2\2V\u0232\3\2\2\2X\u0240\3\2\2\2Z\u024c\3\2\2\2\\"+
		"\u024e\3\2\2\2^\u0250\3\2\2\2`\u0252\3\2\2\2b\u0260\3\2\2\2d\u026e\3\2"+
		"\2\2f\u0270\3\2\2\2h\u0274\3\2\2\2j\u0294\3\2\2\2l\u02a8\3\2\2\2n\u02aa"+
		"\3\2\2\2p\u02bd\3\2\2\2r\u02bf\3\2\2\2t\u02c1\3\2\2\2v\u02d5\3\2\2\2x"+
		"\u02da\3\2\2\2z\u02df\3\2\2\2|\u02e4\3\2\2\2~\u02fb\3\2\2\2\u0080\u0303"+
		"\3\2\2\2\u0082\u0305\3\2\2\2\u0084\u030f\3\2\2\2\u0086\u0314\3\2\2\2\u0088"+
		"\u0333\3\2\2\2\u008a\u0335\3\2\2\2\u008c\u033b\3\2\2\2\u008e\u0364\3\2"+
		"\2\2\u0090\u03b2\3\2\2\2\u0092\u03b4\3\2\2\2\u0094\u0097\5\4\3\2\u0095"+
		"\u0097\5t;\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\3\3\2\2\2\u0098"+
		"\u0099\7\3\2\2\u0099\u009a\7\4\2\2\u009a\u009c\5\6\4\2\u009b\u009d\5\b"+
		"\5\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\5\n\6\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u00a3\5\36\20\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5 \21\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5*\26\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\5,\27\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\5\2\2\u00b4"+
		"\5\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\5\u0092"+
		"J\2\u00b8\u00b9\7\5\2\2\u00b9\7\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bd"+
		"\7\7\2\2\u00bc\u00be\7F\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\5"+
		"\2\2\u00c2\t\3\2\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6"+
		"\5\f\7\2\u00c6\u00c7\7\5\2\2\u00c7\13\3\2\2\2\u00c8\u00ca\5\u0092J\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00da\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5\16\b\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\5\u0092J\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00cf\3\2\2\2\u00da"+
		"\r\3\2\2\2\u00db\u00dd\5\u0092J\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\u00e2\5\20\t\2\u00e2\17\3\2\2\2\u00e3\u00e4\7\3\2"+
		"\2\u00e4\u00e6\7\n\2\2\u00e5\u00e7\5\22\n\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\5\22\n\2\u00ed"+
		"\u00e3\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\21\3\2\2\2\u00ef\u00f0\5\u0092"+
		"J\2\u00f0\23\3\2\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4"+
		"\5\26\f\2\u00f4\u00f5\7\5\2\2\u00f5\25\3\2\2\2\u00f6\u00f8\5\30\r\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fc\7\t\2\2\u00fc\u00fe\5\34\17\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f7\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\27\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\3\2\2\u0105\u0106\5\32\16"+
		"\2\u0106\u0107\5&\24\2\u0107\u0108\7\5\2\2\u0108\31\3\2\2\2\u0109\u010a"+
		"\5\u0092J\2\u010a\33\3\2\2\2\u010b\u010c\7\f\2\2\u010c\35\3\2\2\2\u010d"+
		"\u010e\7\3\2\2\u010e\u010f\7\r\2\2\u010f\u0110\5\f\7\2\u0110\u0111\7\5"+
		"\2\2\u0111\37\3\2\2\2\u0112\u0113\7\3\2\2\u0113\u0115\7\16\2\2\u0114\u0116"+
		"\5\"\22\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\5\2\2\u011a!\3"+
		"\2\2\2\u011b\u011c\7\3\2\2\u011c\u011d\5$\23\2\u011d\u011e\5&\24\2\u011e"+
		"\u011f\7\5\2\2\u011f#\3\2\2\2\u0120\u0121\5\u0092J\2\u0121%\3\2\2\2\u0122"+
		"\u0124\7H\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0134\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u012a\5(\25\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u0130\3\2\2\2\u012d\u012f\7H\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0125\3\2\2\2\u0133"+
		"\u0129\3\2\2\2\u0134\'\3\2\2\2\u0135\u0137\7H\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\7\t\2\2\u013b\u013c\5\20\t\2\u013c)\3\2\2\2\u013d"+
		"\u013e\7\3\2\2\u013e\u013f\7\17\2\2\u013f\u0140\5\u0090I\2\u0140\u0141"+
		"\7\5\2\2\u0141+\3\2\2\2\u0142\u0146\5.\30\2\u0143\u0146\5> \2\u0144\u0146"+
		"\5L\'\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"-\3\2\2\2\u0147\u0148\7\3\2\2\u0148\u0149\7\20\2\2\u0149\u014a\5\60\31"+
		"\2\u014a\u014b\7\21\2\2\u014b\u014c\7\3\2\2\u014c\u014d\5&\24\2\u014d"+
		"\u014e\7\5\2\2\u014e\u014f\5\62\32\2\u014f\u0150\7\5\2\2\u0150/\3\2\2"+
		"\2\u0151\u0152\5\u0092J\2\u0152\61\3\2\2\2\u0153\u0157\7\22\2\2\u0154"+
		"\u0155\7\3\2\2\u0155\u0158\7\5\2\2\u0156\u0158\5\64\33\2\u0157\u0154\3"+
		"\2\2\2\u0157\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0161\3\2\2\2\u015b\u015f\7\23\2\2\u015c\u015d\7"+
		"\3\2\2\u015d\u0160\7\5\2\2\u015e\u0160\5T+\2\u015f\u015c\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\63\3\2\2\2\u0163\u0164\5\66\34\2\u0164\65\3\2\2\2\u0165\u0195"+
		"\5:\36\2\u0166\u0167\7\3\2\2\u0167\u016b\7\24\2\2\u0168\u016a\5\66\34"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0195\7\5\2\2\u016f"+
		"\u0170\7\3\2\2\u0170\u0174\7\25\2\2\u0171\u0173\5\66\34\2\u0172\u0171"+
		"\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0195\7\5\2\2\u0178\u0179\7\3"+
		"\2\2\u0179\u017a\7\26\2\2\u017a\u017b\5\66\34\2\u017b\u017c\7\5\2\2\u017c"+
		"\u0195\3\2\2\2\u017d\u017e\7\3\2\2\u017e\u017f\7\27\2\2\u017f\u0180\5"+
		"\66\34\2\u0180\u0181\5\66\34\2\u0181\u0182\7\5\2\2\u0182\u0195\3\2\2\2"+
		"\u0183\u0184\7\3\2\2\u0184\u0185\7\30\2\2\u0185\u0186\7\3\2\2\u0186\u0187"+
		"\5&\24\2\u0187\u0188\7\5\2\2\u0188\u0189\5\66\34\2\u0189\u018a\7\5\2\2"+
		"\u018a\u0195\3\2\2\2\u018b\u018c\7\3\2\2\u018c\u018d\7\31\2\2\u018d\u018e"+
		"\7\3\2\2\u018e\u018f\5&\24\2\u018f\u0190\7\5\2\2\u0190\u0191\5\66\34\2"+
		"\u0191\u0192\7\5\2\2\u0192\u0195\3\2\2\2\u0193\u0195\58\35\2\u0194\u0165"+
		"\3\2\2\2\u0194\u0166\3\2\2\2\u0194\u016f\3\2\2\2\u0194\u0178\3\2\2\2\u0194"+
		"\u017d\3\2\2\2\u0194\u0183\3\2\2\2\u0194\u018b\3\2\2\2\u0194\u0193\3\2"+
		"\2\2\u0195\67\3\2\2\2\u0196\u0197\7\3\2\2\u0197\u0198\5^\60\2\u0198\u0199"+
		"\5N(\2\u0199\u019a\5N(\2\u019a\u019b\7\5\2\2\u019b9\3\2\2\2\u019c\u019d"+
		"\7\3\2\2\u019d\u01a1\5$\23\2\u019e\u01a0\5<\37\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7\5\2\2\u01a5;\3\2\2\2\u01a6\u01a9"+
		"\5\u0092J\2\u01a7\u01a9\7H\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2"+
		"\u01a9=\3\2\2\2\u01aa\u01ab\7\3\2\2\u01ab\u01ac\7\32\2\2\u01ac\u01ad\5"+
		"\60\31\2\u01ad\u01ae\7\21\2\2\u01ae\u01af\7\3\2\2\u01af\u01b0\5&\24\2"+
		"\u01b0\u01b1\7\5\2\2\u01b1\u01b2\5@!\2\u01b2\u01b3\7\5\2\2\u01b3?\3\2"+
		"\2\2\u01b4\u01b5\7\33\2\2\u01b5\u01b6\5b\62\2\u01b6\u01ba\7\34\2\2\u01b7"+
		"\u01b8\7\3\2\2\u01b8\u01bb\7\5\2\2\u01b9\u01bb\5B\"\2\u01ba\u01b7\3\2"+
		"\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\7\23\2\2\u01bd"+
		"\u01be\7\3\2\2\u01be\u01c1\7\5\2\2\u01bf\u01c1\5j\66\2\u01c0\u01bd\3\2"+
		"\2\2\u01c0\u01bf\3\2\2\2\u01c1A\3\2\2\2\u01c2\u01d5\5D#\2\u01c3\u01c4"+
		"\7\3\2\2\u01c4\u01c8\7\24\2\2\u01c5\u01c7\5B\"\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01d5\7\5\2\2\u01cc\u01cd\7\3\2\2\u01cd"+
		"\u01ce\7\31\2\2\u01ce\u01cf\7\3\2\2\u01cf\u01d0\5&\24\2\u01d0\u01d1\7"+
		"\5\2\2\u01d1\u01d2\5B\"\2\u01d2\u01d3\7\5\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01c2\3\2\2\2\u01d4\u01c3\3\2\2\2\u01d4\u01cc\3\2\2\2\u01d5C\3\2\2\2"+
		"\u01d6\u01e0\5F$\2\u01d7\u01d8\7\3\2\2\u01d8\u01da\7\35\2\2\u01d9\u01db"+
		"\5\u0092J\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2"+
		"\2\u01dc\u01dd\5F$\2\u01dd\u01de\7\5\2\2\u01de\u01e0\3\2\2\2\u01df\u01d6"+
		"\3\2\2\2\u01df\u01d7\3\2\2\2\u01e0E\3\2\2\2\u01e1\u01e2\7\3\2\2\u01e2"+
		"\u01e3\7\36\2\2\u01e3\u01e4\5H%\2\u01e4\u01e5\5\66\34\2\u01e5\u01e6\7"+
		"\5\2\2\u01e6\u01ee\3\2\2\2\u01e7\u01e8\7\3\2\2\u01e8\u01e9\7\37\2\2\u01e9"+
		"\u01ea\5J&\2\u01ea\u01eb\5\66\34\2\u01eb\u01ec\7\5\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01e1\3\2\2\2\u01ed\u01e7\3\2\2\2\u01eeG\3\2\2\2\u01ef\u01f0"+
		"\t\2\2\2\u01f0I\3\2\2\2\u01f1\u01f2\7\"\2\2\u01f2K\3\2\2\2\u01f3\u01f4"+
		"\7\3\2\2\u01f4\u01f5\7#\2\2\u01f5\u01f6\5&\24\2\u01f6\u01f7\5\66\34\2"+
		"\u01f7\u01f8\7\5\2\2\u01f8M\3\2\2\2\u01f9\u0207\7I\2\2\u01fa\u01fb\7\3"+
		"\2\2\u01fb\u01fc\5\\/\2\u01fc\u01fd\5N(\2\u01fd\u01fe\5P)\2\u01fe\u01ff"+
		"\7\5\2\2\u01ff\u0207\3\2\2\2\u0200\u0201\7\3\2\2\u0201\u0202\7\t\2\2\u0202"+
		"\u0203\5N(\2\u0203\u0204\7\5\2\2\u0204\u0207\3\2\2\2\u0205\u0207\5R*\2"+
		"\u0206\u01f9\3\2\2\2\u0206\u01fa\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0207O\3\2\2\2\u0208\u0209\5N(\2\u0209Q\3\2\2\2\u020a\u020b\7"+
		"\3\2\2\u020b\u020f\5\32\16\2\u020c\u020e\5<\37\2\u020d\u020c\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\5\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0216\5\32\16\2\u0215\u020a\3\2\2\2\u0215\u0214\3\2\2\2\u0216S\3\2\2"+
		"\2\u0217\u0218\7\3\2\2\u0218\u021c\7\24\2\2\u0219\u021b\5V,\2\u021a\u0219"+
		"\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0222\7\5\2\2\u0220\u0222\5V"+
		",\2\u0221\u0217\3\2\2\2\u0221\u0220\3\2\2\2\u0222U\3\2\2\2\u0223\u0224"+
		"\7\3\2\2\u0224\u0225\7\31\2\2\u0225\u0226\7\3\2\2\u0226\u0227\5&\24\2"+
		"\u0227\u0228\7\5\2\2\u0228\u0229\5T+\2\u0229\u022a\7\5\2\2\u022a\u0233"+
		"\3\2\2\2\u022b\u022c\7\3\2\2\u022c\u022d\7$\2\2\u022d\u022e\5\66\34\2"+
		"\u022e\u022f\5Z.\2\u022f\u0230\7\5\2\2\u0230\u0233\3\2\2\2\u0231\u0233"+
		"\5X-\2\u0232\u0223\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u0231\3\2\2\2\u0233"+
		"W\3\2\2\2\u0234\u0235\7\3\2\2\u0235\u0236\5`\61\2\u0236\u0237\5R*\2\u0237"+
		"\u0238\5N(\2\u0238\u0239\7\5\2\2\u0239\u0241\3\2\2\2\u023a\u023b\7\3\2"+
		"\2\u023b\u023c\7\26\2\2\u023c\u023d\5:\36\2\u023d\u023e\7\5\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u0241\5:\36\2\u0240\u0234\3\2\2\2\u0240\u023a\3\2"+
		"\2\2\u0240\u023f\3\2\2\2\u0241Y\3\2\2\2\u0242\u0243\7\3\2\2\u0243\u0247"+
		"\7\24\2\2\u0244\u0246\5X-\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024d\7\5\2\2\u024b\u024d\5X-\2\u024c\u0242\3\2\2\2\u024c\u024b"+
		"\3\2\2\2\u024d[\3\2\2\2\u024e\u024f\t\3\2\2\u024f]\3\2\2\2\u0250\u0251"+
		"\t\4\2\2\u0251_\3\2\2\2\u0252\u0253\t\5\2\2\u0253a\3\2\2\2\u0254\u0255"+
		"\7\3\2\2\u0255\u0257\7\24\2\2\u0256\u0258\5d\63\2\u0257\u0256\3\2\2\2"+
		"\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\7\5\2\2\u025c\u0261\3\2\2\2\u025d\u025e\7\3\2\2\u025e"+
		"\u0261\7\5\2\2\u025f\u0261\5d\63\2\u0260\u0254\3\2\2\2\u0260\u025d\3\2"+
		"\2\2\u0260\u025f\3\2\2\2\u0261c\3\2\2\2\u0262\u0263\7\3\2\2\u0263\u0264"+
		"\5f\64\2\u0264\u0265\7\62\2\2\u0265\u0266\5h\65\2\u0266\u0267\7\5\2\2"+
		"\u0267\u026f\3\2\2\2\u0268\u0269\7\3\2\2\u0269\u026a\7\36\2\2\u026a\u026b"+
		"\5H%\2\u026b\u026c\5d\63\2\u026c\u026d\7\5\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u0262\3\2\2\2\u026e\u0268\3\2\2\2\u026fe\3\2\2\2\u0270\u0271\t\6\2\2"+
		"\u0271g\3\2\2\2\u0272\u0275\7I\2\2\u0273\u0275\5N(\2\u0274\u0272\3\2\2"+
		"\2\u0274\u0273\3\2\2\2\u0275i\3\2\2\2\u0276\u0277\7\3\2\2\u0277\u027b"+
		"\7\24\2\2\u0278\u027a\5j\66\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2"+
		"\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b"+
		"\3\2\2\2\u027e\u0295\7\5\2\2\u027f\u0295\5l\67\2\u0280\u0281\7\3\2\2\u0281"+
		"\u0282\7\31\2\2\u0282\u0283\7\3\2\2\u0283\u0284\5&\24\2\u0284\u0285\7"+
		"\5\2\2\u0285\u0286\5j\66\2\u0286\u0287\7\5\2\2\u0287\u0295\3\2\2\2\u0288"+
		"\u0289\7\3\2\2\u0289\u028a\7$\2\2\u028a\u028b\5B\"\2\u028b\u028c\5l\67"+
		"\2\u028c\u028d\7\5\2\2\u028d\u0295\3\2\2\2\u028e\u028f\7\3\2\2\u028f\u0290"+
		"\5`\61\2\u0290\u0291\5R*\2\u0291\u0292\5p9\2\u0292\u0293\7\5\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0276\3\2\2\2\u0294\u027f\3\2\2\2\u0294\u0280\3\2"+
		"\2\2\u0294\u0288\3\2\2\2\u0294\u028e\3\2\2\2\u0295k\3\2\2\2\u0296\u0297"+
		"\7\3\2\2\u0297\u0298\7\36\2\2\u0298\u0299\5H%\2\u0299\u029a\5V,\2\u029a"+
		"\u029b\7\5\2\2\u029b\u02a9\3\2\2\2\u029c\u029d\7\3\2\2\u029d\u029e\7\36"+
		"\2\2\u029e\u029f\5H%\2\u029f\u02a0\5n8\2\u02a0\u02a1\7\5\2\2\u02a1\u02a9"+
		"\3\2\2\2\u02a2\u02a3\7\3\2\2\u02a3\u02a4\5r:\2\u02a4\u02a5\5R*\2\u02a5"+
		"\u02a6\5N(\2\u02a6\u02a7\7\5\2\2\u02a7\u02a9\3\2\2\2\u02a8\u0296\3\2\2"+
		"\2\u02a8\u029c\3\2\2\2\u02a8\u02a2\3\2\2\2\u02a9m\3\2\2\2\u02aa\u02ab"+
		"\7\3\2\2\u02ab\u02ac\5`\61\2\u02ac\u02ad\5R*\2\u02ad\u02ae\5p9\2\u02ae"+
		"\u02af\7\5\2\2\u02afo\3\2\2\2\u02b0\u02b7\7\3\2\2\u02b1\u02b2\5\\/\2\u02b2"+
		"\u02b3\5p9\2\u02b3\u02b4\5p9\2\u02b4\u02b8\3\2\2\2\u02b5\u02b6\7\t\2\2"+
		"\u02b6\u02b8\5p9\2\u02b7\u02b1\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9\u02ba\7\5\2\2\u02ba\u02be\3\2\2\2\u02bb\u02be\7\62\2\2"+
		"\u02bc\u02be\5N(\2\u02bd\u02b0\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc"+
		"\3\2\2\2\u02beq\3\2\2\2\u02bf\u02c0\t\7\2\2\u02c0s\3\2\2\2\u02c1\u02c2"+
		"\7\3\2\2\u02c2\u02c3\7\4\2\2\u02c3\u02c4\5v<\2\u02c4\u02c6\5x=\2\u02c5"+
		"\u02c7\5\b\5\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2"+
		"\2\2\u02c8\u02ca\5z>\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\5|?\2\u02cc\u02ce\5\u0084C\2\u02cd\u02cf\5\u0086"+
		"D\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02d2\5\u008aF\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3\u02d4\7\5\2\2\u02d4u\3\2\2\2\u02d5\u02d6\7\3\2\2\u02d6"+
		"\u02d7\7\63\2\2\u02d7\u02d8\5\u0092J\2\u02d8\u02d9\7\5\2\2\u02d9w\3\2"+
		"\2\2\u02da\u02db\7\3\2\2\u02db\u02dc\7\64\2\2\u02dc\u02dd\5\u0092J\2\u02dd"+
		"\u02de\7\5\2\2\u02dey\3\2\2\2\u02df\u02e0\7\3\2\2\u02e0\u02e1\7\65\2\2"+
		"\u02e1\u02e2\5\f\7\2\u02e2\u02e3\7\5\2\2\u02e3{\3\2\2\2\u02e4\u02e5\7"+
		"\3\2\2\u02e5\u02e9\7\66\2\2\u02e6\u02e8\5~@\2\u02e7\u02e6\3\2\2\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7\5\2\2\u02ed}\3\2\2\2\u02ee\u02fc"+
		"\5\u0080A\2\u02ef\u02f0\7\3\2\2\u02f0\u02f1\7*\2\2\u02f1\u02f2\5R*\2\u02f2"+
		"\u02f3\7I\2\2\u02f3\u02f4\7\5\2\2\u02f4\u02fc\3\2\2\2\u02f5\u02f6\7\3"+
		"\2\2\u02f6\u02f7\7\36\2\2\u02f7\u02f8\7I\2\2\u02f8\u02f9\5\u0080A\2\u02f9"+
		"\u02fa\7\5\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02ee\3\2\2\2\u02fb\u02ef\3\2"+
		"\2\2\u02fb\u02f5\3\2\2\2\u02fc\177\3\2\2\2\u02fd\u0304\5\u0082B\2\u02fe"+
		"\u02ff\7\3\2\2\u02ff\u0300\7\26\2\2\u0300\u0301\5\u0082B\2\u0301\u0302"+
		"\7\5\2\2\u0302\u0304\3\2\2\2\u0303\u02fd\3\2\2\2\u0303\u02fe\3\2\2\2\u0304"+
		"\u0081\3\2\2\2\u0305\u0306\7\3\2\2\u0306\u030a\5$\23\2\u0307\u0309\5\u0092"+
		"J\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7\5"+
		"\2\2\u030e\u0083\3\2\2\2\u030f\u0310\7\3\2\2\u0310\u0311\7\67\2\2\u0311"+
		"\u0312\5\66\34\2\u0312\u0313\7\5\2\2\u0313\u0085\3\2\2\2\u0314\u0315\7"+
		"\3\2\2\u0315\u0316\7\17\2\2\u0316\u0317\5\u0088E\2\u0317\u0318\7\5\2\2"+
		"\u0318\u0087\3\2\2\2\u0319\u031a\7\3\2\2\u031a\u031e\7\24\2\2\u031b\u031d"+
		"\5\u0088E\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2"+
		"\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0334"+
		"\7\5\2\2\u0322\u0323\7\3\2\2\u0323\u0324\7\31\2\2\u0324\u0325\7\3\2\2"+
		"\u0325\u0326\5&\24\2\u0326\u0327\7\5\2\2\u0327\u0328\5\u0088E\2\u0328"+
		"\u0329\7\5\2\2\u0329\u0334\3\2\2\2\u032a\u032b\7\3\2\2\u032b\u032d\7\35"+
		"\2\2\u032c\u032e\5\u0092J\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0330\5\u0090I\2\u0330\u0331\7\5\2\2\u0331\u0334"+
		"\3\2\2\2\u0332\u0334\5\u0090I\2\u0333\u0319\3\2\2\2\u0333\u0322\3\2\2"+
		"\2\u0333\u032a\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0089\3\2\2\2\u0335\u0336"+
		"\7\3\2\2\u0336\u0337\78\2\2\u0337\u0338\5\u008cG\2\u0338\u0339\5\u008e"+
		"H\2\u0339\u033a\7\5\2\2\u033a\u008b\3\2\2\2\u033b\u033c\t\b\2\2\u033c"+
		"\u008d\3\2\2\2\u033d\u033e\7\3\2\2\u033e\u033f\5\\/\2\u033f\u0340\5\u008e"+
		"H\2\u0340\u0341\5\u008eH\2\u0341\u0342\7\5\2\2\u0342\u0365\3\2\2\2\u0343"+
		"\u0344\7\3\2\2\u0344\u0345\t\t\2\2\u0345\u0347\5\u008eH\2\u0346\u0348"+
		"\5\u008eH\2\u0347\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0347\3\2\2"+
		"\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\7\5\2\2\u034c\u0365"+
		"\3\2\2\2\u034d\u034e\7\3\2\2\u034e\u034f\7\t\2\2\u034f\u0350\5\u008eH"+
		"\2\u0350\u0351\7\5\2\2\u0351\u0365\3\2\2\2\u0352\u0365\7I\2\2\u0353\u0354"+
		"\7\3\2\2\u0354\u0358\5\32\16\2\u0355\u0357\5\u0092J\2\u0356\u0355\3\2"+
		"\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035b\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\7\5\2\2\u035c\u0365\3\2"+
		"\2\2\u035d\u0365\5\32\16\2\u035e\u0365\7;\2\2\u035f\u0360\7\3\2\2\u0360"+
		"\u0361\7<\2\2\u0361\u0362\5\u0092J\2\u0362\u0363\7\5\2\2\u0363\u0365\3"+
		"\2\2\2\u0364\u033d\3\2\2\2\u0364\u0343\3\2\2\2\u0364\u034d\3\2\2\2\u0364"+
		"\u0352\3\2\2\2\u0364\u0353\3\2\2\2\u0364\u035d\3\2\2\2\u0364\u035e\3\2"+
		"\2\2\u0364\u035f\3\2\2\2\u0365\u008f\3\2\2\2\u0366\u0367\7\3\2\2\u0367"+
		"\u036b\7\24\2\2\u0368\u036a\5\u0090I\2\u0369\u0368\3\2\2\2\u036a\u036d"+
		"\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036e\u03b3\7\5\2\2\u036f\u0370\7\3\2\2\u0370\u0371\7\31"+
		"\2\2\u0371\u0372\7\3\2\2\u0372\u0373\5&\24\2\u0373\u0374\7\5\2\2\u0374"+
		"\u0375\5\u0090I\2\u0375\u0376\7\5\2\2\u0376\u03b3\3\2\2\2\u0377\u0378"+
		"\7\3\2\2\u0378\u0379\7\36\2\2\u0379\u037a\7!\2\2\u037a\u037b\5\66\34\2"+
		"\u037b\u037c\7\5\2\2\u037c\u03b3\3\2\2\2\u037d\u037e\7\3\2\2\u037e\u037f"+
		"\7=\2\2\u037f\u0380\5\66\34\2\u0380\u0381\7\5\2\2\u0381\u03b3\3\2\2\2"+
		"\u0382\u0383\7\3\2\2\u0383\u0384\7>\2\2\u0384\u0385\5\66\34\2\u0385\u0386"+
		"\7\5\2\2\u0386\u03b3\3\2\2\2\u0387\u0388\7\3\2\2\u0388\u0389\7?\2\2\u0389"+
		"\u038a\7I\2\2\u038a\u038b\5\66\34\2\u038b\u038c\7\5\2\2\u038c\u03b3\3"+
		"\2\2\2\u038d\u038e\7\3\2\2\u038e\u038f\7@\2\2\u038f\u0390\5\66\34\2\u0390"+
		"\u0391\7\5\2\2\u0391\u03b3\3\2\2\2\u0392\u0393\7\3\2\2\u0393\u0394\7A"+
		"\2\2\u0394\u0395\5\66\34\2\u0395\u0396\5\66\34\2\u0396\u0397\7\5\2\2\u0397"+
		"\u03b3\3\2\2\2\u0398\u0399\7\3\2\2\u0399\u039a\7B\2\2\u039a\u039b\5\66"+
		"\34\2\u039b\u039c\5\66\34\2\u039c\u039d\7\5\2\2\u039d\u03b3\3\2\2\2\u039e"+
		"\u039f\7\3\2\2\u039f\u03a0\7C\2\2\u03a0\u03a1\7I\2\2\u03a1\u03a2\5\66"+
		"\34\2\u03a2\u03a3\5\66\34\2\u03a3\u03a4\7\5\2\2\u03a4\u03b3\3\2\2\2\u03a5"+
		"\u03a6\7\3\2\2\u03a6\u03a7\7D\2\2\u03a7\u03a8\7I\2\2\u03a8\u03a9\7I\2"+
		"\2\u03a9\u03aa\5\66\34\2\u03aa\u03ab\7\5\2\2\u03ab\u03b3\3\2\2\2\u03ac"+
		"\u03ad\7\3\2\2\u03ad\u03ae\7E\2\2\u03ae\u03af\7I\2\2\u03af\u03b0\5\66"+
		"\34\2\u03b0\u03b1\7\5\2\2\u03b1\u03b3\3\2\2\2\u03b2\u0366\3\2\2\2\u03b2"+
		"\u036f\3\2\2\2\u03b2\u0377\3\2\2\2\u03b2\u037d\3\2\2\2\u03b2\u0382\3\2"+
		"\2\2\u03b2\u0387\3\2\2\2\u03b2\u038d\3\2\2\2\u03b2\u0392\3\2\2\2\u03b2"+
		"\u0398\3\2\2\2\u03b2\u039e\3\2\2\2\u03b2\u03a5\3\2\2\2\u03b2\u03ac\3\2"+
		"\2\2\u03b3\u0091\3\2\2\2\u03b4\u03b5\t\n\2\2\u03b5\u0093\3\2\2\2N\u0096"+
		"\u009c\u009f\u00a2\u00a5\u00a8\u00ab\u00b0\u00bf\u00cb\u00d1\u00d6\u00d9"+
		"\u00de\u00e8\u00ed\u00f9\u00fd\u0101\u0117\u0125\u012b\u0130\u0133\u0138"+
		"\u0145\u0157\u0159\u015f\u0161\u016b\u0174\u0194\u01a1\u01a8\u01ba\u01c0"+
		"\u01c8\u01d4\u01da\u01df\u01ed\u0206\u020f\u0215\u021c\u0221\u0232\u0240"+
		"\u0247\u024c\u0259\u0260\u026e\u0274\u027b\u0294\u02a8\u02b7\u02bd\u02c6"+
		"\u02c9\u02ce\u02d1\u02e9\u02fb\u0303\u030a\u031e\u032d\u0333\u0349\u0358"+
		"\u0364\u036b\u03b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}