// Generated from pddl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pddlParser}.
 */
public interface pddlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pddlParser#pddlDoc}.
	 * @param ctx the parse tree
	 */
	void enterPddlDoc(pddlParser.PddlDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#pddlDoc}.
	 * @param ctx the parse tree
	 */
	void exitPddlDoc(pddlParser.PddlDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(pddlParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(pddlParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#domainName}.
	 * @param ctx the parse tree
	 */
	void enterDomainName(pddlParser.DomainNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#domainName}.
	 * @param ctx the parse tree
	 */
	void exitDomainName(pddlParser.DomainNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#requireDef}.
	 * @param ctx the parse tree
	 */
	void enterRequireDef(pddlParser.RequireDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#requireDef}.
	 * @param ctx the parse tree
	 */
	void exitRequireDef(pddlParser.RequireDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#typesDef}.
	 * @param ctx the parse tree
	 */
	void enterTypesDef(pddlParser.TypesDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#typesDef}.
	 * @param ctx the parse tree
	 */
	void exitTypesDef(pddlParser.TypesDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#typedNameList}.
	 * @param ctx the parse tree
	 */
	void enterTypedNameList(pddlParser.TypedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#typedNameList}.
	 * @param ctx the parse tree
	 */
	void exitTypedNameList(pddlParser.TypedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#singleTypeNameList}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeNameList(pddlParser.SingleTypeNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#singleTypeNameList}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeNameList(pddlParser.SingleTypeNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#r_type}.
	 * @param ctx the parse tree
	 */
	void enterR_type(pddlParser.R_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#r_type}.
	 * @param ctx the parse tree
	 */
	void exitR_type(pddlParser.R_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#primType}.
	 * @param ctx the parse tree
	 */
	void enterPrimType(pddlParser.PrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#primType}.
	 * @param ctx the parse tree
	 */
	void exitPrimType(pddlParser.PrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#functionsDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsDef(pddlParser.FunctionsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#functionsDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsDef(pddlParser.FunctionsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(pddlParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(pddlParser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#atomicFunctionSkeleton}.
	 * @param ctx the parse tree
	 */
	void enterAtomicFunctionSkeleton(pddlParser.AtomicFunctionSkeletonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#atomicFunctionSkeleton}.
	 * @param ctx the parse tree
	 */
	void exitAtomicFunctionSkeleton(pddlParser.AtomicFunctionSkeletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#functionSymbol}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSymbol(pddlParser.FunctionSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#functionSymbol}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSymbol(pddlParser.FunctionSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(pddlParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(pddlParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#constantsDef}.
	 * @param ctx the parse tree
	 */
	void enterConstantsDef(pddlParser.ConstantsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#constantsDef}.
	 * @param ctx the parse tree
	 */
	void exitConstantsDef(pddlParser.ConstantsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#predicatesDef}.
	 * @param ctx the parse tree
	 */
	void enterPredicatesDef(pddlParser.PredicatesDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#predicatesDef}.
	 * @param ctx the parse tree
	 */
	void exitPredicatesDef(pddlParser.PredicatesDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#atomicFormulaSkeleton}.
	 * @param ctx the parse tree
	 */
	void enterAtomicFormulaSkeleton(pddlParser.AtomicFormulaSkeletonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#atomicFormulaSkeleton}.
	 * @param ctx the parse tree
	 */
	void exitAtomicFormulaSkeleton(pddlParser.AtomicFormulaSkeletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(pddlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(pddlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#typedVariableList}.
	 * @param ctx the parse tree
	 */
	void enterTypedVariableList(pddlParser.TypedVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#typedVariableList}.
	 * @param ctx the parse tree
	 */
	void exitTypedVariableList(pddlParser.TypedVariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#singleTypeVarList}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeVarList(pddlParser.SingleTypeVarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#singleTypeVarList}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeVarList(pddlParser.SingleTypeVarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(pddlParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(pddlParser.ConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#structureDef}.
	 * @param ctx the parse tree
	 */
	void enterStructureDef(pddlParser.StructureDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#structureDef}.
	 * @param ctx the parse tree
	 */
	void exitStructureDef(pddlParser.StructureDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#actionDef}.
	 * @param ctx the parse tree
	 */
	void enterActionDef(pddlParser.ActionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#actionDef}.
	 * @param ctx the parse tree
	 */
	void exitActionDef(pddlParser.ActionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#actionSymbol}.
	 * @param ctx the parse tree
	 */
	void enterActionSymbol(pddlParser.ActionSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#actionSymbol}.
	 * @param ctx the parse tree
	 */
	void exitActionSymbol(pddlParser.ActionSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#actionDefBody}.
	 * @param ctx the parse tree
	 */
	void enterActionDefBody(pddlParser.ActionDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#actionDefBody}.
	 * @param ctx the parse tree
	 */
	void exitActionDefBody(pddlParser.ActionDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#precondition}.
	 * @param ctx the parse tree
	 */
	void enterPrecondition(pddlParser.PreconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#precondition}.
	 * @param ctx the parse tree
	 */
	void exitPrecondition(pddlParser.PreconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#goalDesc}.
	 * @param ctx the parse tree
	 */
	void enterGoalDesc(pddlParser.GoalDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#goalDesc}.
	 * @param ctx the parse tree
	 */
	void exitGoalDesc(pddlParser.GoalDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fComp}.
	 * @param ctx the parse tree
	 */
	void enterFComp(pddlParser.FCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fComp}.
	 * @param ctx the parse tree
	 */
	void exitFComp(pddlParser.FCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#atomicTermFormula}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTermFormula(pddlParser.AtomicTermFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#atomicTermFormula}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTermFormula(pddlParser.AtomicTermFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pddlParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pddlParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#durativeActionDef}.
	 * @param ctx the parse tree
	 */
	void enterDurativeActionDef(pddlParser.DurativeActionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#durativeActionDef}.
	 * @param ctx the parse tree
	 */
	void exitDurativeActionDef(pddlParser.DurativeActionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#daDefBody}.
	 * @param ctx the parse tree
	 */
	void enterDaDefBody(pddlParser.DaDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#daDefBody}.
	 * @param ctx the parse tree
	 */
	void exitDaDefBody(pddlParser.DaDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#daGD}.
	 * @param ctx the parse tree
	 */
	void enterDaGD(pddlParser.DaGDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#daGD}.
	 * @param ctx the parse tree
	 */
	void exitDaGD(pddlParser.DaGDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#prefTimedGD}.
	 * @param ctx the parse tree
	 */
	void enterPrefTimedGD(pddlParser.PrefTimedGDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#prefTimedGD}.
	 * @param ctx the parse tree
	 */
	void exitPrefTimedGD(pddlParser.PrefTimedGDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#timedGD}.
	 * @param ctx the parse tree
	 */
	void enterTimedGD(pddlParser.TimedGDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#timedGD}.
	 * @param ctx the parse tree
	 */
	void exitTimedGD(pddlParser.TimedGDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#timeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeSpecifier(pddlParser.TimeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#timeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeSpecifier(pddlParser.TimeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(pddlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(pddlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#derivedDef}.
	 * @param ctx the parse tree
	 */
	void enterDerivedDef(pddlParser.DerivedDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#derivedDef}.
	 * @param ctx the parse tree
	 */
	void exitDerivedDef(pddlParser.DerivedDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fExp}.
	 * @param ctx the parse tree
	 */
	void enterFExp(pddlParser.FExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fExp}.
	 * @param ctx the parse tree
	 */
	void exitFExp(pddlParser.FExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fExp2}.
	 * @param ctx the parse tree
	 */
	void enterFExp2(pddlParser.FExp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fExp2}.
	 * @param ctx the parse tree
	 */
	void exitFExp2(pddlParser.FExp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fHead}.
	 * @param ctx the parse tree
	 */
	void enterFHead(pddlParser.FHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fHead}.
	 * @param ctx the parse tree
	 */
	void exitFHead(pddlParser.FHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(pddlParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(pddlParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#cEffect}.
	 * @param ctx the parse tree
	 */
	void enterCEffect(pddlParser.CEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#cEffect}.
	 * @param ctx the parse tree
	 */
	void exitCEffect(pddlParser.CEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#pEffect}.
	 * @param ctx the parse tree
	 */
	void enterPEffect(pddlParser.PEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#pEffect}.
	 * @param ctx the parse tree
	 */
	void exitPEffect(pddlParser.PEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#condEffect}.
	 * @param ctx the parse tree
	 */
	void enterCondEffect(pddlParser.CondEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#condEffect}.
	 * @param ctx the parse tree
	 */
	void exitCondEffect(pddlParser.CondEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(pddlParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(pddlParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#binaryComp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComp(pddlParser.BinaryCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#binaryComp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComp(pddlParser.BinaryCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(pddlParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(pddlParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#durationConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDurationConstraint(pddlParser.DurationConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#durationConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDurationConstraint(pddlParser.DurationConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#simpleDurationConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDurationConstraint(pddlParser.SimpleDurationConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#simpleDurationConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDurationConstraint(pddlParser.SimpleDurationConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#durOp}.
	 * @param ctx the parse tree
	 */
	void enterDurOp(pddlParser.DurOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#durOp}.
	 * @param ctx the parse tree
	 */
	void exitDurOp(pddlParser.DurOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#durValue}.
	 * @param ctx the parse tree
	 */
	void enterDurValue(pddlParser.DurValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#durValue}.
	 * @param ctx the parse tree
	 */
	void exitDurValue(pddlParser.DurValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#daEffect}.
	 * @param ctx the parse tree
	 */
	void enterDaEffect(pddlParser.DaEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#daEffect}.
	 * @param ctx the parse tree
	 */
	void exitDaEffect(pddlParser.DaEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#timedEffect}.
	 * @param ctx the parse tree
	 */
	void enterTimedEffect(pddlParser.TimedEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#timedEffect}.
	 * @param ctx the parse tree
	 */
	void exitTimedEffect(pddlParser.TimedEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fAssignDA}.
	 * @param ctx the parse tree
	 */
	void enterFAssignDA(pddlParser.FAssignDAContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fAssignDA}.
	 * @param ctx the parse tree
	 */
	void exitFAssignDA(pddlParser.FAssignDAContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#fExpDA}.
	 * @param ctx the parse tree
	 */
	void enterFExpDA(pddlParser.FExpDAContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#fExpDA}.
	 * @param ctx the parse tree
	 */
	void exitFExpDA(pddlParser.FExpDAContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#assignOpT}.
	 * @param ctx the parse tree
	 */
	void enterAssignOpT(pddlParser.AssignOpTContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#assignOpT}.
	 * @param ctx the parse tree
	 */
	void exitAssignOpT(pddlParser.AssignOpTContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#problem}.
	 * @param ctx the parse tree
	 */
	void enterProblem(pddlParser.ProblemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#problem}.
	 * @param ctx the parse tree
	 */
	void exitProblem(pddlParser.ProblemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#problemDecl}.
	 * @param ctx the parse tree
	 */
	void enterProblemDecl(pddlParser.ProblemDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#problemDecl}.
	 * @param ctx the parse tree
	 */
	void exitProblemDecl(pddlParser.ProblemDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#problemDomain}.
	 * @param ctx the parse tree
	 */
	void enterProblemDomain(pddlParser.ProblemDomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#problemDomain}.
	 * @param ctx the parse tree
	 */
	void exitProblemDomain(pddlParser.ProblemDomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#objectDecl}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecl(pddlParser.ObjectDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#objectDecl}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecl(pddlParser.ObjectDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(pddlParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(pddlParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#initEl}.
	 * @param ctx the parse tree
	 */
	void enterInitEl(pddlParser.InitElContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#initEl}.
	 * @param ctx the parse tree
	 */
	void exitInitEl(pddlParser.InitElContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#nameLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNameLiteral(pddlParser.NameLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#nameLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNameLiteral(pddlParser.NameLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#atomicNameFormula}.
	 * @param ctx the parse tree
	 */
	void enterAtomicNameFormula(pddlParser.AtomicNameFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#atomicNameFormula}.
	 * @param ctx the parse tree
	 */
	void exitAtomicNameFormula(pddlParser.AtomicNameFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(pddlParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(pddlParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#probConstraints}.
	 * @param ctx the parse tree
	 */
	void enterProbConstraints(pddlParser.ProbConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#probConstraints}.
	 * @param ctx the parse tree
	 */
	void exitProbConstraints(pddlParser.ProbConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#prefConGD}.
	 * @param ctx the parse tree
	 */
	void enterPrefConGD(pddlParser.PrefConGDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#prefConGD}.
	 * @param ctx the parse tree
	 */
	void exitPrefConGD(pddlParser.PrefConGDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#metricSpec}.
	 * @param ctx the parse tree
	 */
	void enterMetricSpec(pddlParser.MetricSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#metricSpec}.
	 * @param ctx the parse tree
	 */
	void exitMetricSpec(pddlParser.MetricSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#optimization}.
	 * @param ctx the parse tree
	 */
	void enterOptimization(pddlParser.OptimizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#optimization}.
	 * @param ctx the parse tree
	 */
	void exitOptimization(pddlParser.OptimizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#metricFExp}.
	 * @param ctx the parse tree
	 */
	void enterMetricFExp(pddlParser.MetricFExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#metricFExp}.
	 * @param ctx the parse tree
	 */
	void exitMetricFExp(pddlParser.MetricFExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#conGD}.
	 * @param ctx the parse tree
	 */
	void enterConGD(pddlParser.ConGDContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#conGD}.
	 * @param ctx the parse tree
	 */
	void exitConGD(pddlParser.ConGDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pddlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(pddlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pddlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(pddlParser.NameContext ctx);
}