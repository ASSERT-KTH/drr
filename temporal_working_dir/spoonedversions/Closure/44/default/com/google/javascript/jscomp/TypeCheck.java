

package com.google.javascript.jscomp;


public class TypeCheck implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.Callback {
	static final com.google.javascript.jscomp.DiagnosticType UNEXPECTED_TOKEN = com.google.javascript.jscomp.DiagnosticType.error("JSC_INTERNAL_ERROR_UNEXPECTED_TOKEN", "Internal Error: Don't know how to handle {0}");

	static final com.google.javascript.jscomp.DiagnosticType BAD_DELETE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_BAD_DELETE_OPERAND", "delete operator needs a reference operand");

	protected static final java.lang.String OVERRIDING_PROTOTYPE_WITH_NON_OBJECT = "overriding prototype with non-object";

	static final com.google.javascript.jscomp.DiagnosticType DETERMINISTIC_TEST = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DETERMINISTIC_TEST", ("condition always evaluates to {2}\n" + ("left : {0}\n" + "right: {1}")));

	static final com.google.javascript.jscomp.DiagnosticType DETERMINISTIC_TEST_NO_RESULT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_DETERMINISTIC_TEST_NO_RESULT", ("condition always evaluates to the same value\n" + ("left : {0}\n" + "right: {1}")));

	static final com.google.javascript.jscomp.DiagnosticType INEXISTENT_ENUM_ELEMENT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INEXISTENT_ENUM_ELEMENT", "element {0} does not exist on this enum");

	static final com.google.javascript.jscomp.DiagnosticType INEXISTENT_PROPERTY = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_INEXISTENT_PROPERTY", "Property {0} never defined on {1}");

	protected static final com.google.javascript.jscomp.DiagnosticType NOT_A_CONSTRUCTOR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NOT_A_CONSTRUCTOR", "cannot instantiate non-constructor");

	static final com.google.javascript.jscomp.DiagnosticType BIT_OPERATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_BAD_TYPE_FOR_BIT_OPERATION", "operator {0} cannot be applied to {1}");

	static final com.google.javascript.jscomp.DiagnosticType NOT_CALLABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NOT_FUNCTION_TYPE", "{0} expressions are not callable");

	static final com.google.javascript.jscomp.DiagnosticType CONSTRUCTOR_NOT_CALLABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CONSTRUCTOR_NOT_CALLABLE", "Constructor {0} should be called with the \"new\" keyword");

	static final com.google.javascript.jscomp.DiagnosticType FUNCTION_MASKS_VARIABLE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_FUNCTION_MASKS_VARIABLE", "function {0} masks variable (IE bug)");

	static final com.google.javascript.jscomp.DiagnosticType MULTIPLE_VAR_DEF = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MULTIPLE_VAR_DEF", "declaration of multiple variables with shared type information");

	static final com.google.javascript.jscomp.DiagnosticType ENUM_DUP = com.google.javascript.jscomp.DiagnosticType.error("JSC_ENUM_DUP", "enum element {0} already defined");

	static final com.google.javascript.jscomp.DiagnosticType ENUM_NOT_CONSTANT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ENUM_NOT_CONSTANT", "enum key {0} must be a syntactic constant");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_INTERFACE_MEMBER_DECLARATION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INVALID_INTERFACE_MEMBER_DECLARATION", ("interface members can only be empty property declarations," + " empty functions{0}"));

	static final com.google.javascript.jscomp.DiagnosticType INTERFACE_FUNCTION_NOT_EMPTY = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERFACE_FUNCTION_NOT_EMPTY", "interface member functions must have an empty body");

	static final com.google.javascript.jscomp.DiagnosticType CONFLICTING_EXTENDED_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CONFLICTING_EXTENDED_TYPE", ("{0} cannot extend this type; " + ("a constructor can only extend objects " + "and an interface can only extend interfaces")));

	static final com.google.javascript.jscomp.DiagnosticType CONFLICTING_IMPLEMENTED_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CONFLICTING_IMPLEMENTED_TYPE", ("{0} cannot implement this type; " + "an interface can only extend, but not implement interfaces"));

	static final com.google.javascript.jscomp.DiagnosticType BAD_IMPLEMENTED_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_IMPLEMENTS_NON_INTERFACE", "can only implement interfaces");

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_SUPERCLASS_PROPERTY = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_SUPERCLASS_PROPERTY", ("property {0} already defined on superclass {1}; " + "use @override to override it"));

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_INTERFACE_PROPERTY = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_INTERFACE_PROPERTY", ("property {0} already defined on interface {1}; " + "use @override to override it"));

	static final com.google.javascript.jscomp.DiagnosticType HIDDEN_SUPERCLASS_PROPERTY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.warning("JSC_HIDDEN_SUPERCLASS_PROPERTY_MISMATCH", ("mismatch of the {0} property type and the type " + (("of the property it overrides from superclass {1}\n" + "original: {2}\n") + "override: {3}")));

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_OVERRIDE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_OVERRIDE", "property {0} not defined on any superclass of {1}");

	static final com.google.javascript.jscomp.DiagnosticType INTERFACE_METHOD_OVERRIDE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INTERFACE_METHOD_OVERRIDE", "property {0} is already defined by the {1} extended interface");

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_EXPR_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_EXPR_TYPE", "could not determine the type of this expression");

	static final com.google.javascript.jscomp.DiagnosticType UNRESOLVED_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNRESOLVED_TYPE", "could not resolve the name {0} to a type");

	static final com.google.javascript.jscomp.DiagnosticType WRONG_ARGUMENT_COUNT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_WRONG_ARGUMENT_COUNT", ("Function {0}: called with {1} argument(s). " + "Function requires at least {2} argument(s){3}."));

	static final com.google.javascript.jscomp.DiagnosticType ILLEGAL_IMPLICIT_CAST = com.google.javascript.jscomp.DiagnosticType.warning("JSC_ILLEGAL_IMPLICIT_CAST", ("Illegal annotation on {0}. @implicitCast may only be used in " + "externs."));

	static final com.google.javascript.jscomp.DiagnosticType INCOMPATIBLE_EXTENDED_PROPERTY_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INCOMPATIBLE_EXTENDED_PROPERTY_TYPE", ("Interface {0} has a property {1} with incompatible types in " + "its super interfaces {2} and {3}"));

	static final com.google.javascript.jscomp.DiagnosticType EXPECTED_THIS_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_EXPECTED_THIS_TYPE", "\"{0}\" must be called with a \"this\" type");

	static final com.google.javascript.jscomp.DiagnosticGroup ALL_DIAGNOSTICS = new com.google.javascript.jscomp.DiagnosticGroup(com.google.javascript.jscomp.TypeCheck.DETERMINISTIC_TEST, com.google.javascript.jscomp.TypeCheck.DETERMINISTIC_TEST_NO_RESULT, com.google.javascript.jscomp.TypeCheck.INEXISTENT_ENUM_ELEMENT, com.google.javascript.jscomp.TypeCheck.INEXISTENT_PROPERTY, com.google.javascript.jscomp.TypeCheck.NOT_A_CONSTRUCTOR, com.google.javascript.jscomp.TypeCheck.BIT_OPERATION, com.google.javascript.jscomp.TypeCheck.NOT_CALLABLE, com.google.javascript.jscomp.TypeCheck.CONSTRUCTOR_NOT_CALLABLE, com.google.javascript.jscomp.TypeCheck.FUNCTION_MASKS_VARIABLE, com.google.javascript.jscomp.TypeCheck.MULTIPLE_VAR_DEF, com.google.javascript.jscomp.TypeCheck.ENUM_DUP, com.google.javascript.jscomp.TypeCheck.ENUM_NOT_CONSTANT, com.google.javascript.jscomp.TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION, com.google.javascript.jscomp.TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY, com.google.javascript.jscomp.TypeCheck.CONFLICTING_EXTENDED_TYPE, com.google.javascript.jscomp.TypeCheck.CONFLICTING_IMPLEMENTED_TYPE, com.google.javascript.jscomp.TypeCheck.BAD_IMPLEMENTED_TYPE, com.google.javascript.jscomp.TypeCheck.HIDDEN_SUPERCLASS_PROPERTY, com.google.javascript.jscomp.TypeCheck.HIDDEN_INTERFACE_PROPERTY, com.google.javascript.jscomp.TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH, com.google.javascript.jscomp.TypeCheck.UNKNOWN_OVERRIDE, com.google.javascript.jscomp.TypeCheck.INTERFACE_METHOD_OVERRIDE, com.google.javascript.jscomp.TypeCheck.UNKNOWN_EXPR_TYPE, com.google.javascript.jscomp.TypeCheck.UNRESOLVED_TYPE, com.google.javascript.jscomp.TypeCheck.WRONG_ARGUMENT_COUNT, com.google.javascript.jscomp.TypeCheck.ILLEGAL_IMPLICIT_CAST, com.google.javascript.jscomp.TypeCheck.INCOMPATIBLE_EXTENDED_PROPERTY_TYPE, com.google.javascript.jscomp.TypeCheck.EXPECTED_THIS_TYPE, com.google.javascript.jscomp.RhinoErrorReporter.TYPE_PARSE_ERROR, com.google.javascript.jscomp.TypedScopeCreator.UNKNOWN_LENDS, com.google.javascript.jscomp.TypedScopeCreator.LENDS_ON_NON_OBJECT, com.google.javascript.jscomp.TypedScopeCreator.CTOR_INITIALIZER, com.google.javascript.jscomp.TypedScopeCreator.IFACE_INITIALIZER, com.google.javascript.jscomp.FunctionTypeBuilder.THIS_TYPE_NON_OBJECT);

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.TypeValidator validator;

	private final com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry;

	private com.google.javascript.jscomp.Scope topScope;

	private com.google.javascript.jscomp.ScopeCreator scopeCreator;

	private final com.google.javascript.jscomp.CheckLevel reportMissingOverride;

	private final com.google.javascript.jscomp.CheckLevel reportUnknownTypes;

	private boolean reportMissingProperties = true;

	private com.google.javascript.jscomp.InferJSDocInfo inferJSDocInfo = null;

	private int typedCount = 0;

	private int nullCount = 0;

	private int unknownCount = 0;

	private boolean inExterns;

	private int noTypeCheckSection = 0;

	public TypeCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry, com.google.javascript.jscomp.Scope topScope, com.google.javascript.jscomp.ScopeCreator scopeCreator, com.google.javascript.jscomp.CheckLevel reportMissingOverride, com.google.javascript.jscomp.CheckLevel reportUnknownTypes) {
		this.compiler = compiler;
		this.validator = compiler.getTypeValidator();
		this.reverseInterpreter = reverseInterpreter;
		this.typeRegistry = typeRegistry;
		com.google.javascript.jscomp.TypeCheck.this.topScope = topScope;
		com.google.javascript.jscomp.TypeCheck.this.scopeCreator = scopeCreator;
		this.reportMissingOverride = reportMissingOverride;
		this.reportUnknownTypes = reportUnknownTypes;
		com.google.javascript.jscomp.TypeCheck.this.inferJSDocInfo = new com.google.javascript.jscomp.InferJSDocInfo(compiler);
	}

	public TypeCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry, com.google.javascript.jscomp.CheckLevel reportMissingOverride, com.google.javascript.jscomp.CheckLevel reportUnknownTypes) {
		this(compiler, reverseInterpreter, typeRegistry, null, null, reportMissingOverride, reportUnknownTypes);
	}

	TypeCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry) {
		this(compiler, reverseInterpreter, typeRegistry, null, null, com.google.javascript.jscomp.CheckLevel.WARNING, com.google.javascript.jscomp.CheckLevel.OFF);
	}

	com.google.javascript.jscomp.TypeCheck reportMissingProperties(boolean report) {
		reportMissingProperties = report;
		return com.google.javascript.jscomp.TypeCheck.this;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node jsRoot) {
		com.google.common.base.Preconditions.checkNotNull(scopeCreator);
		com.google.common.base.Preconditions.checkNotNull(topScope);
		com.google.javascript.rhino.Node externsAndJs = jsRoot.getParent();
		com.google.common.base.Preconditions.checkState((externsAndJs != null));
		com.google.common.base.Preconditions.checkState(((externsRoot == null) || (externsAndJs.hasChild(externsRoot))));
		if (externsRoot != null) {
			check(externsRoot, true);
		}
		check(jsRoot, false);
	}

	public com.google.javascript.jscomp.Scope processForTesting(com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node jsRoot) {
		com.google.common.base.Preconditions.checkState(((scopeCreator) == null));
		com.google.common.base.Preconditions.checkState(((topScope) == null));
		com.google.common.base.Preconditions.checkState(((jsRoot.getParent()) != null));
		com.google.javascript.rhino.Node externsAndJsRoot = jsRoot.getParent();
		scopeCreator = new com.google.javascript.jscomp.MemoizedScopeCreator(new com.google.javascript.jscomp.TypedScopeCreator(compiler));
		topScope = scopeCreator.createScope(externsAndJsRoot, null);
		com.google.javascript.jscomp.TypeInferencePass inference = new com.google.javascript.jscomp.TypeInferencePass(compiler, reverseInterpreter, topScope, scopeCreator);
		inference.process(externsRoot, jsRoot);
		process(externsRoot, jsRoot);
		return topScope;
	}

	public void check(com.google.javascript.rhino.Node node, boolean externs) {
		com.google.common.base.Preconditions.checkNotNull(node);
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.TypeCheck.this, scopeCreator);
		inExterns = externs;
		t.traverseWithScope(node, topScope);
		if (externs) {
			inferJSDocInfo.process(node, null);
		}else {
			inferJSDocInfo.process(null, node);
		}
	}

	private void checkNoTypeCheckSection(com.google.javascript.rhino.Node n, boolean enterSection) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.ASSIGN :
				com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
				if ((info != null) && (info.isNoTypeCheck())) {
					if (enterSection) {
						(noTypeCheckSection)++;
					}else {
						(noTypeCheckSection)--;
					}
				}
				validator.setShouldReport(((noTypeCheckSection) == 0));
				break;
		}
	}

	private void report(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.DiagnosticType diagnosticType, java.lang.String... arguments) {
		if ((noTypeCheckSection) == 0) {
			t.report(n, diagnosticType, arguments);
		}
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		checkNoTypeCheckSection(n, true);
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				final com.google.javascript.jscomp.Scope outerScope = t.getScope();
				final java.lang.String functionPrivateName = n.getFirstChild().getString();
				if ((((functionPrivateName != null) && ((functionPrivateName.length()) > 0)) && (outerScope.isDeclared(functionPrivateName, false))) && (!((outerScope.getVar(functionPrivateName).getType()) instanceof com.google.javascript.rhino.jstype.FunctionType))) {
					report(t, n, com.google.javascript.jscomp.TypeCheck.FUNCTION_MASKS_VARIABLE, functionPrivateName);
				}
				break;
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.jstype.JSType childType;
		com.google.javascript.rhino.jstype.JSType leftType;
		com.google.javascript.rhino.jstype.JSType rightType;
		com.google.javascript.rhino.Node left;
		com.google.javascript.rhino.Node right;
		boolean typeable = true;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				typeable = visitName(t, n, parent);
				break;
			case com.google.javascript.rhino.Token.PARAM_LIST :
				if (!(parent.isFunction())) {
					ensureTyped(t, n, getJSType(n.getFirstChild()));
				}else {
					typeable = false;
				}
				break;
			case com.google.javascript.rhino.Token.COMMA :
				ensureTyped(t, n, getJSType(n.getLastChild()));
				break;
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.THIS :
				ensureTyped(t, n, t.getScope().getTypeOfThis());
				break;
			case com.google.javascript.rhino.Token.NULL :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
				break;
			case com.google.javascript.rhino.Token.NUMBER :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
				break;
			case com.google.javascript.rhino.Token.STRING :
				if (!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, n.getParent()))) {
					ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
				}else {
					typeable = false;
				}
				break;
			case com.google.javascript.rhino.Token.GETTER_DEF :
			case com.google.javascript.rhino.Token.SETTER_DEF :
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
				break;
			case com.google.javascript.rhino.Token.REGEXP :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				visitGetProp(t, n, parent);
				typeable = !((parent.isAssign()) && ((parent.getFirstChild()) == n));
				break;
			case com.google.javascript.rhino.Token.GETELEM :
				visitGetElem(t, n);
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.VAR :
				visitVar(t, n);
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.NEW :
				visitNew(t, n);
				typeable = true;
				break;
			case com.google.javascript.rhino.Token.CALL :
				visitCall(t, n);
				typeable = !(com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent));
				break;
			case com.google.javascript.rhino.Token.RETURN :
				visitReturn(t, n);
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.INC :
				left = n.getFirstChild();
				validator.expectNumber(t, left, getJSType(left), "increment/decrement");
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
				break;
			case com.google.javascript.rhino.Token.NOT :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.VOID :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
				break;
			case com.google.javascript.rhino.Token.TYPEOF :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
				break;
			case com.google.javascript.rhino.Token.BITNOT :
				childType = getJSType(n.getFirstChild());
				if (!(childType.matchesInt32Context())) {
					report(t, n, com.google.javascript.jscomp.TypeCheck.BIT_OPERATION, com.google.javascript.jscomp.NodeUtil.opToStr(n.getType()), childType.toString());
				}
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
				break;
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
				left = n.getFirstChild();
				validator.expectNumber(t, left, getJSType(left), "sign operator");
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
				break;
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
				{
					leftType = getJSType(n.getFirstChild());
					rightType = getJSType(n.getLastChild());
					com.google.javascript.rhino.jstype.JSType leftTypeRestricted = leftType.restrictByNotNullOrUndefined();
					com.google.javascript.rhino.jstype.JSType rightTypeRestricted = rightType.restrictByNotNullOrUndefined();
					com.google.javascript.rhino.jstype.TernaryValue result = leftTypeRestricted.testForEquality(rightTypeRestricted);
					if (result != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
						if (n.isNE()) {
							result = result.not();
						}
						report(t, n, com.google.javascript.jscomp.TypeCheck.DETERMINISTIC_TEST, leftType.toString(), rightType.toString(), result.toString());
					}
					ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
					break;
				}
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
				{
					leftType = getJSType(n.getFirstChild());
					rightType = getJSType(n.getLastChild());
					com.google.javascript.rhino.jstype.JSType leftTypeRestricted = leftType.restrictByNotNullOrUndefined();
					com.google.javascript.rhino.jstype.JSType rightTypeRestricted = rightType.restrictByNotNullOrUndefined();
					if (!(leftTypeRestricted.canTestForShallowEqualityWith(rightTypeRestricted))) {
						report(t, n, com.google.javascript.jscomp.TypeCheck.DETERMINISTIC_TEST_NO_RESULT, leftType.toString(), rightType.toString());
					}
					ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
					break;
				}
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.GE :
				leftType = getJSType(n.getFirstChild());
				rightType = getJSType(n.getLastChild());
				if (rightType.isNumber()) {
					validator.expectNumber(t, n, leftType, "left side of numeric comparison");
				}else
					if (leftType.isNumber()) {
						validator.expectNumber(t, n, rightType, "right side of numeric comparison");
					}else
						if ((leftType.matchesNumberContext()) && (rightType.matchesNumberContext())) {
						}else {
							java.lang.String message = "left side of comparison";
							validator.expectString(t, n, leftType, message);
							validator.expectNotNullOrUndefined(t, n, leftType, message, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
							message = "right side of comparison";
							validator.expectString(t, n, rightType, message);
							validator.expectNotNullOrUndefined(t, n, rightType, message, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
						}
					
				
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.IN :
				left = n.getFirstChild();
				right = n.getLastChild();
				leftType = getJSType(left);
				rightType = getJSType(right);
				validator.expectObject(t, n, rightType, "'in' requires an object");
				validator.expectString(t, left, leftType, "left side of 'in'");
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.INSTANCEOF :
				left = n.getFirstChild();
				right = n.getLastChild();
				leftType = getJSType(left);
				rightType = getJSType(right).restrictByNotNullOrUndefined();
				validator.expectAnyObject(t, left, leftType, "deterministic instanceof yields false");
				validator.expectActualObject(t, right, rightType, "instanceof requires an object");
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				visitAssign(t, n);
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.ADD :
			case com.google.javascript.rhino.Token.MUL :
				visitBinaryOperator(n.getType(), t, n);
				break;
			case com.google.javascript.rhino.Token.DELPROP :
				ensureTyped(t, n, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
				break;
			case com.google.javascript.rhino.Token.CASE :
				com.google.javascript.rhino.jstype.JSType switchType = getJSType(parent.getFirstChild());
				com.google.javascript.rhino.jstype.JSType caseType = getJSType(n.getFirstChild());
				validator.expectSwitchMatchesCase(t, n, switchType, caseType);
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.WITH :
				{
					com.google.javascript.rhino.Node child = n.getFirstChild();
					childType = getJSType(child);
					validator.expectObject(t, child, childType, "with requires an object");
					typeable = false;
					break;
				}
			case com.google.javascript.rhino.Token.FUNCTION :
				visitFunction(t, n);
				break;
			case com.google.javascript.rhino.Token.LABEL :
			case com.google.javascript.rhino.Token.LABEL_NAME :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.BREAK :
			case com.google.javascript.rhino.Token.CATCH :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.EMPTY :
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
			case com.google.javascript.rhino.Token.CONTINUE :
			case com.google.javascript.rhino.Token.DEBUGGER :
			case com.google.javascript.rhino.Token.THROW :
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.WHILE :
				typeable = false;
				break;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.OBJECTLIT :
			case com.google.javascript.rhino.Token.OR :
				if ((n.getJSType()) != null) {
					ensureTyped(t, n);
				}else {
					if ((n.isObjectLit()) && ((parent.getJSType()) instanceof com.google.javascript.rhino.jstype.EnumType)) {
						ensureTyped(t, n, parent.getJSType());
					}else {
						ensureTyped(t, n);
					}
				}
				if (n.isObjectLit()) {
					for (com.google.javascript.rhino.Node key : n.children()) {
						visitObjLitKey(t, key, n);
					}
				}
				break;
			default :
				report(t, n, com.google.javascript.jscomp.TypeCheck.UNEXPECTED_TOKEN, com.google.javascript.rhino.Token.name(n.getType()));
				ensureTyped(t, n);
				break;
		}
		typeable = typeable && (!(inExterns));
		if (typeable) {
			doPercentTypedAccounting(t, n);
		}
		checkNoTypeCheckSection(n, false);
	}

	private void doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (type == null) {
			(nullCount)++;
		}else
			if (type.isUnknownType()) {
				if (reportUnknownTypes.isOn()) {
					compiler.report(t.makeError(n, reportUnknownTypes, com.google.javascript.jscomp.TypeCheck.UNKNOWN_EXPR_TYPE));
				}
				(unknownCount)++;
			}else {
				(typedCount)++;
			}
		
	}

	private void visitAssign(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node assign) {
		com.google.javascript.rhino.JSDocInfo info = assign.getJSDocInfo();
		com.google.javascript.rhino.Node lvalue = assign.getFirstChild();
		com.google.javascript.rhino.Node rvalue = assign.getLastChild();
		if (lvalue.isGetProp()) {
			com.google.javascript.rhino.Node object = lvalue.getFirstChild();
			com.google.javascript.rhino.jstype.JSType objectJsType = getJSType(object);
			java.lang.String property = lvalue.getLastChild().getString();
			if (object.isGetProp()) {
				com.google.javascript.rhino.jstype.JSType jsType = getJSType(object.getFirstChild());
				if ((jsType.isInterface()) && (object.getLastChild().getString().equals("prototype"))) {
					visitInterfaceGetprop(t, assign, object, property, lvalue, rvalue);
				}
			}
			if ((info != null) && (info.hasType())) {
				visitAnnotatedAssignGetprop(t, assign, info.getType().evaluate(t.getScope(), typeRegistry), object, property, rvalue);
				return ;
			}
			checkEnumAlias(t, info, rvalue);
			if (property.equals("prototype")) {
				if ((objectJsType != null) && (objectJsType.isFunctionType())) {
					com.google.javascript.rhino.jstype.FunctionType functionType = objectJsType.toMaybeFunctionType();
					if (functionType.isConstructor()) {
						com.google.javascript.rhino.jstype.JSType rvalueType = rvalue.getJSType();
						validator.expectObject(t, rvalue, rvalueType, com.google.javascript.jscomp.TypeCheck.OVERRIDING_PROTOTYPE_WITH_NON_OBJECT);
					}
				}else {
				}
				return ;
			}
			if (object.isGetProp()) {
				com.google.javascript.rhino.Node object2 = object.getFirstChild();
				java.lang.String property2 = com.google.javascript.jscomp.NodeUtil.getStringValue(object.getLastChild());
				if ("prototype".equals(property2)) {
					com.google.javascript.rhino.jstype.JSType jsType = getJSType(object2);
					if (jsType.isFunctionType()) {
						com.google.javascript.rhino.jstype.FunctionType functionType = jsType.toMaybeFunctionType();
						if ((functionType.isConstructor()) || (functionType.isInterface())) {
							checkDeclaredPropertyInheritance(t, assign, functionType, property, info, getJSType(rvalue));
						}
					}else {
					}
					return ;
				}
			}
			com.google.javascript.rhino.jstype.ObjectType type = com.google.javascript.rhino.jstype.ObjectType.cast(objectJsType.restrictByNotNullOrUndefined());
			if (type != null) {
				if (((type.hasProperty(property)) && (!(type.isPropertyTypeInferred(property)))) && (!(propertyIsImplicitCast(type, property)))) {
					validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type.getPropertyType(property), object, property);
				}
				return ;
			}
		}else
			if (lvalue.isName()) {
				com.google.javascript.rhino.jstype.JSType rvalueType = getJSType(assign.getLastChild());
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(lvalue.getString());
				if (var != null) {
					if (var.isTypeInferred()) {
						return ;
					}
				}
			}
		
		com.google.javascript.rhino.jstype.JSType leftType = getJSType(lvalue);
		com.google.javascript.rhino.Node rightChild = assign.getLastChild();
		com.google.javascript.rhino.jstype.JSType rightType = getJSType(rightChild);
		if (validator.expectCanAssignTo(t, assign, rightType, leftType, "assignment")) {
			ensureTyped(t, assign, rightType);
		}else {
			ensureTyped(t, assign);
		}
	}

	private void visitObjLitKey(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node key, com.google.javascript.rhino.Node objlit) {
		com.google.javascript.rhino.Node rvalue = key.getFirstChild();
		com.google.javascript.rhino.jstype.JSType rightType = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(key, getJSType(rvalue));
		if (rightType == null) {
			rightType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		com.google.javascript.rhino.Node owner = objlit;
		com.google.javascript.rhino.jstype.JSType keyType = getJSType(key);
		com.google.javascript.rhino.jstype.JSType allowedValueType = keyType;
		if (allowedValueType.isEnumElementType()) {
			allowedValueType = allowedValueType.toMaybeEnumElementType().getPrimitiveType();
		}
		boolean valid = validator.expectCanAssignToPropertyOf(t, key, rightType, allowedValueType, owner, com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(key));
		if (valid) {
			ensureTyped(t, key, rightType);
		}else {
			ensureTyped(t, key);
		}
		com.google.javascript.rhino.jstype.JSType objlitType = getJSType(objlit);
		com.google.javascript.rhino.jstype.ObjectType type = com.google.javascript.rhino.jstype.ObjectType.cast(objlitType.restrictByNotNullOrUndefined());
		if (type != null) {
			java.lang.String property = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(key);
			if (((type.hasProperty(property)) && (!(type.isPropertyTypeInferred(property)))) && (!(propertyIsImplicitCast(type, property)))) {
				validator.expectCanAssignToPropertyOf(t, key, keyType, type.getPropertyType(property), owner, property);
			}
			return ;
		}
	}

	private boolean propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType type, java.lang.String prop) {
		for (; type != null; type = type.getImplicitPrototype()) {
			com.google.javascript.rhino.JSDocInfo docInfo = type.getOwnPropertyJSDocInfo(prop);
			if ((docInfo != null) && (docInfo.isImplicitCast())) {
				return true;
			}
		}
		return false;
	}

	private void checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType ctorType, java.lang.String propertyName, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.jstype.JSType propertyType) {
		if (com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(ctorType)) {
			return ;
		}
		com.google.javascript.rhino.jstype.FunctionType superClass = ctorType.getSuperClassConstructor();
		boolean superClassHasProperty = (superClass != null) && (superClass.getPrototype().hasProperty(propertyName));
		boolean superInterfacesHasProperty = false;
		if (ctorType.isInterface()) {
			for (com.google.javascript.rhino.jstype.ObjectType interfaceType : ctorType.getExtendedInterfaces()) {
				superInterfacesHasProperty = superInterfacesHasProperty || (interfaceType.hasProperty(propertyName));
			}
		}
		boolean declaredOverride = (info != null) && (info.isOverride());
		boolean foundInterfaceProperty = false;
		if (ctorType.isConstructor()) {
			for (com.google.javascript.rhino.jstype.JSType implementedInterface : ctorType.getAllImplementedInterfaces()) {
				if ((implementedInterface.isUnknownType()) || (implementedInterface.isEmptyType())) {
					continue;
				}
				com.google.javascript.rhino.jstype.FunctionType interfaceType = implementedInterface.toObjectType().getConstructor();
				com.google.common.base.Preconditions.checkNotNull(interfaceType);
				boolean interfaceHasProperty = interfaceType.getPrototype().hasProperty(propertyName);
				foundInterfaceProperty = foundInterfaceProperty || interfaceHasProperty;
				if (((reportMissingOverride.isOn()) && (!declaredOverride)) && interfaceHasProperty) {
					compiler.report(t.makeError(n, reportMissingOverride, com.google.javascript.jscomp.TypeCheck.HIDDEN_INTERFACE_PROPERTY, propertyName, interfaceType.getTopMostDefiningType(propertyName).toString()));
				}
			}
		}
		if (((!declaredOverride) && (!superClassHasProperty)) && (!superInterfacesHasProperty)) {
			return ;
		}
		com.google.javascript.rhino.jstype.JSType topInstanceType = superClassHasProperty ? superClass.getTopMostDefiningType(propertyName) : null;
		if ((((reportMissingOverride.isOn()) && (ctorType.isConstructor())) && (!declaredOverride)) && superClassHasProperty) {
			compiler.report(t.makeError(n, reportMissingOverride, com.google.javascript.jscomp.TypeCheck.HIDDEN_SUPERCLASS_PROPERTY, propertyName, topInstanceType.toString()));
		}
		if (!declaredOverride) {
			return ;
		}
		if (superClassHasProperty) {
			com.google.javascript.rhino.jstype.JSType superClassPropType = superClass.getPrototype().getPropertyType(propertyName);
			if (!(propertyType.canAssignTo(superClassPropType))) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH, propertyName, topInstanceType.toString(), superClassPropType.toString(), propertyType.toString()));
			}
		}else
			if (superInterfacesHasProperty) {
				for (com.google.javascript.rhino.jstype.ObjectType interfaceType : ctorType.getExtendedInterfaces()) {
					if (interfaceType.hasProperty(propertyName)) {
						com.google.javascript.rhino.jstype.JSType superPropertyType = interfaceType.getPropertyType(propertyName);
						if (!(propertyType.canAssignTo(superPropertyType))) {
							topInstanceType = interfaceType.getConstructor().getTopMostDefiningType(propertyName);
							compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH, propertyName, topInstanceType.toString(), superPropertyType.toString(), propertyType.toString()));
						}
					}
				}
			}else
				if (!foundInterfaceProperty) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.UNKNOWN_OVERRIDE, propertyName, ctorType.getInstanceType().toString()));
				}
			
		
	}

	private static boolean hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType ctor) {
		com.google.common.base.Preconditions.checkArgument(((ctor.isConstructor()) || (ctor.isInterface())));
		com.google.common.base.Preconditions.checkArgument((!(ctor.isUnknownType())));
		while (true) {
			com.google.javascript.rhino.jstype.ObjectType maybeSuperInstanceType = ctor.getPrototype().getImplicitPrototype();
			if (maybeSuperInstanceType == null) {
				return false;
			}
			if ((maybeSuperInstanceType.isUnknownType()) || (maybeSuperInstanceType.isEmptyType())) {
				return true;
			}
			ctor = maybeSuperInstanceType.getConstructor();
			if (ctor == null) {
				return false;
			}
			com.google.common.base.Preconditions.checkState(((ctor.isConstructor()) || (ctor.isInterface())));
		} 
	}

	private void visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node assign, com.google.javascript.rhino.Node object, java.lang.String property, com.google.javascript.rhino.Node lvalue, com.google.javascript.rhino.Node rvalue) {
		com.google.javascript.rhino.jstype.JSType rvalueType = getJSType(rvalue);
		java.lang.String abstractMethodName = compiler.getCodingConvention().getAbstractMethodName();
		if ((!(rvalueType.isOrdinaryFunction())) && (!((rvalue.isQualifiedName()) && (rvalue.getQualifiedName().equals(abstractMethodName))))) {
			java.lang.String abstractMethodMessage = abstractMethodName != null ? ", or " + abstractMethodName : "";
			compiler.report(t.makeError(object, com.google.javascript.jscomp.TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION, abstractMethodMessage));
		}
		if ((assign.getLastChild().isFunction()) && (!(com.google.javascript.jscomp.NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())))) {
			compiler.report(t.makeError(object, com.google.javascript.jscomp.TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY, abstractMethodName));
		}
	}

	private void visitAnnotatedAssignGetprop(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node assign, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node object, java.lang.String property, com.google.javascript.rhino.Node rvalue) {
		validator.expectCanAssignToPropertyOf(t, assign, getJSType(rvalue), type, object, property);
	}

	boolean visitName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		int parentNodeType = parent.getType();
		if ((((parentNodeType == (com.google.javascript.rhino.Token.FUNCTION)) || (parentNodeType == (com.google.javascript.rhino.Token.CATCH))) || (parentNodeType == (com.google.javascript.rhino.Token.PARAM_LIST))) || (parentNodeType == (com.google.javascript.rhino.Token.VAR))) {
			return false;
		}
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (type == null) {
			type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
			if (var != null) {
				com.google.javascript.rhino.jstype.JSType varType = var.getType();
				if (varType != null) {
					type = varType;
				}
			}
		}
		ensureTyped(t, n, type);
		return true;
	}

	private void visitGetProp(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (((n.getJSType()) != null) && (parent.isAssign())) {
			return ;
		}
		com.google.javascript.rhino.Node property = n.getLastChild();
		com.google.javascript.rhino.Node objNode = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType childType = getJSType(objNode);
		if (!(validator.expectNotNullOrUndefined(t, n, childType, "No properties on this expression", getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)))) {
			ensureTyped(t, n);
			return ;
		}
		checkPropertyAccess(childType, property.getString(), t, n);
		ensureTyped(t, n);
	}

	private void checkPropertyAccess(com.google.javascript.rhino.jstype.JSType childType, java.lang.String propName, com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType propType = getJSType(n);
		if (propType.equals(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE))) {
			childType = childType.autobox();
			com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(childType);
			if (objectType != null) {
				if ((!(objectType.hasProperty(propName))) || (objectType.equals(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)))) {
					if (objectType instanceof com.google.javascript.rhino.jstype.EnumType) {
						report(t, n, com.google.javascript.jscomp.TypeCheck.INEXISTENT_ENUM_ELEMENT, propName);
					}else {
						checkPropertyAccessHelper(objectType, propName, t, n);
					}
				}
			}else {
				checkPropertyAccessHelper(childType, propName, t, n);
			}
		}
	}

	private void checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType objectType, java.lang.String propName, com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		if (((!(objectType.isEmptyType())) && (reportMissingProperties)) && (!(isPropertyTest(n)))) {
			if (!(typeRegistry.canPropertyBeDefined(objectType, propName))) {
				report(t, n, com.google.javascript.jscomp.TypeCheck.INEXISTENT_PROPERTY, propName, validator.getReadableJSTypeName(n.getFirstChild(), true));
			}
		}
	}

	private boolean isPropertyTest(com.google.javascript.rhino.Node getProp) {
		com.google.javascript.rhino.Node parent = getProp.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.CALL :
				return ((parent.getFirstChild()) != getProp) && (compiler.getCodingConvention().isPropertyTestFunction(parent));
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.FOR :
				return (com.google.javascript.jscomp.NodeUtil.getConditionExpression(parent)) == getProp;
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.TYPEOF :
				return true;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.HOOK :
				return (parent.getFirstChild()) == getProp;
			case com.google.javascript.rhino.Token.NOT :
				return (parent.getParent().isOr()) && ((parent.getParent().getFirstChild()) == parent);
		}
		return false;
	}

	private void visitGetElem(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = n.getLastChild();
		validator.expectIndexMatch(t, n, getJSType(left), getJSType(right));
		ensureTyped(t, n);
	}

	private void visitVar(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.JSDocInfo varInfo = n.hasOneChild() ? n.getJSDocInfo() : null;
		for (com.google.javascript.rhino.Node name : n.children()) {
			com.google.javascript.rhino.Node value = name.getFirstChild();
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name.getString());
			if (value != null) {
				com.google.javascript.rhino.jstype.JSType valueType = getJSType(value);
				com.google.javascript.rhino.jstype.JSType nameType = var.getType();
				nameType = (nameType == null) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : nameType;
				com.google.javascript.rhino.JSDocInfo info = name.getJSDocInfo();
				if (info == null) {
					info = varInfo;
				}
				checkEnumAlias(t, info, value);
				if (var.isTypeInferred()) {
					ensureTyped(t, name, valueType);
				}else {
					validator.expectCanAssignTo(t, value, valueType, nameType, "initializing variable");
				}
			}
		}
	}

	private void visitNew(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node constructor = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType type = getJSType(constructor).restrictByNotNullOrUndefined();
		if (((type.isConstructor()) || (type.isEmptyType())) || (type.isUnknownType())) {
			com.google.javascript.rhino.jstype.FunctionType fnType = type.toMaybeFunctionType();
			if (fnType != null) {
				visitParameterList(t, n, fnType);
				ensureTyped(t, n, fnType.getInstanceType());
			}else {
				ensureTyped(t, n);
			}
		}else {
			report(t, n, com.google.javascript.jscomp.TypeCheck.NOT_A_CONSTRUCTOR);
			ensureTyped(t, n);
		}
	}

	private void checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String functionName, java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> properties, java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> currentProperties, com.google.javascript.rhino.jstype.ObjectType interfaceType) {
		java.util.Set<java.lang.String> currentPropertyNames = interfaceType.getPropertyNames();
		for (java.lang.String name : currentPropertyNames) {
			com.google.javascript.rhino.jstype.ObjectType oType = properties.get(name);
			if (oType != null) {
				if (!(interfaceType.getPropertyType(name).isEquivalentTo(oType.getPropertyType(name)))) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.INCOMPATIBLE_EXTENDED_PROPERTY_TYPE, functionName, name, oType.toString(), interfaceType.toString()));
				}
			}
			currentProperties.put(name, interfaceType);
		}
		for (com.google.javascript.rhino.jstype.ObjectType iType : interfaceType.getCtorExtendedInterfaces()) {
			checkInterfaceConflictProperties(t, n, functionName, properties, currentProperties, iType);
		}
	}

	private void visitFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.FunctionType functionType = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(n.getJSType());
		java.lang.String functionPrivateName = n.getFirstChild().getString();
		if (functionType.isConstructor()) {
			com.google.javascript.rhino.jstype.FunctionType baseConstructor = functionType.getSuperClassConstructor();
			if (((baseConstructor != null) && (baseConstructor != (getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE)))) && ((baseConstructor.isInterface()) && (functionType.isConstructor()))) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.CONFLICTING_EXTENDED_TYPE, functionPrivateName));
			}else {
				for (com.google.javascript.rhino.jstype.JSType baseInterface : functionType.getImplementedInterfaces()) {
					boolean badImplementedType = false;
					com.google.javascript.rhino.jstype.ObjectType baseInterfaceObj = com.google.javascript.rhino.jstype.ObjectType.cast(baseInterface);
					if (baseInterfaceObj != null) {
						com.google.javascript.rhino.jstype.FunctionType interfaceConstructor = baseInterfaceObj.getConstructor();
						if ((interfaceConstructor != null) && (!(interfaceConstructor.isInterface()))) {
							badImplementedType = true;
						}
					}else {
						badImplementedType = true;
					}
					if (badImplementedType) {
						report(t, n, com.google.javascript.jscomp.TypeCheck.BAD_IMPLEMENTED_TYPE, functionPrivateName);
					}
				}
				validator.expectAllInterfaceProperties(t, n, functionType);
			}
		}else
			if (functionType.isInterface()) {
				for (com.google.javascript.rhino.jstype.ObjectType extInterface : functionType.getExtendedInterfaces()) {
					if (((extInterface.getConstructor()) != null) && (!(extInterface.getConstructor().isInterface()))) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.CONFLICTING_EXTENDED_TYPE, functionPrivateName));
					}
				}
				if (functionType.hasImplementedInterfaces()) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.CONFLICTING_IMPLEMENTED_TYPE, functionPrivateName));
				}
				if ((functionType.getExtendedInterfacesCount()) > 1) {
					java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> properties = new java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType>();
					java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> currentProperties = new java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.ObjectType>();
					for (com.google.javascript.rhino.jstype.ObjectType interfaceType : functionType.getExtendedInterfaces()) {
						currentProperties.clear();
						checkInterfaceConflictProperties(t, n, functionPrivateName, properties, currentProperties, interfaceType);
						properties.putAll(currentProperties);
					}
				}
			}
		
	}

	private void visitCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node child = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType childType = getJSType(child).restrictByNotNullOrUndefined();
		if (!(childType.canBeCalled())) {
			report(t, n, com.google.javascript.jscomp.TypeCheck.NOT_CALLABLE, childType.toString());
			ensureTyped(t, n);
			return ;
		}
		if (childType.isFunctionType()) {
			com.google.javascript.rhino.jstype.FunctionType functionType = childType.toMaybeFunctionType();
			boolean isExtern = false;
			com.google.javascript.rhino.JSDocInfo functionJSDocInfo = functionType.getJSDocInfo();
			if ((functionJSDocInfo != null) && ((functionJSDocInfo.getAssociatedNode()) != null)) {
				isExtern = functionJSDocInfo.getAssociatedNode().isFromExterns();
			}
			if (((functionType.isConstructor()) && (!(functionType.isNativeObjectType()))) && (((functionType.getReturnType().isUnknownType()) || (functionType.getReturnType().isVoidType())) || (!isExtern))) {
				report(t, n, com.google.javascript.jscomp.TypeCheck.CONSTRUCTOR_NOT_CALLABLE, childType.toString());
			}
			if ((((functionType.isOrdinaryFunction()) && (!(functionType.getTypeOfThis().isUnknownType()))) && (!(functionType.getTypeOfThis().isNativeObjectType()))) && (!((child.isGetElem()) || (child.isGetProp())))) {
				report(t, n, com.google.javascript.jscomp.TypeCheck.EXPECTED_THIS_TYPE, functionType.toString());
			}
			visitParameterList(t, n, functionType);
			ensureTyped(t, n, functionType.getReturnType());
		}else {
			ensureTyped(t, n);
		}
	}

	private void visitParameterList(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node call, com.google.javascript.rhino.jstype.FunctionType functionType) {
		java.util.Iterator<com.google.javascript.rhino.Node> arguments = call.children().iterator();
		arguments.next();
		java.util.Iterator<com.google.javascript.rhino.Node> parameters = functionType.getParameters().iterator();
		int ordinal = 0;
		com.google.javascript.rhino.Node parameter = null;
		com.google.javascript.rhino.Node argument = null;
		while ((arguments.hasNext()) && ((parameters.hasNext()) || ((parameter != null) && (parameter.isVarArgs())))) {
			if (parameters.hasNext()) {
				parameter = parameters.next();
			}
			argument = arguments.next();
			ordinal++;
			validator.expectArgumentMatchesParameter(t, argument, getJSType(argument), getJSType(parameter), call, ordinal);
		} 
		int numArgs = (call.getChildCount()) - 1;
		int minArgs = functionType.getMinArguments();
		int maxArgs = functionType.getMaxArguments();
		if ((minArgs > numArgs) || (maxArgs < numArgs)) {
			report(t, call, com.google.javascript.jscomp.TypeCheck.WRONG_ARGUMENT_COUNT, validator.getReadableJSTypeName(call.getFirstChild(), false), java.lang.String.valueOf(numArgs), java.lang.String.valueOf(minArgs), (maxArgs != (java.lang.Integer.MAX_VALUE) ? (" and no more than " + maxArgs) + " argument(s)" : ""));
		}
	}

	private void visitReturn(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node function = t.getEnclosingFunction();
		if (function == null) {
			return ;
		}
		com.google.javascript.rhino.jstype.JSType jsType = getJSType(function);
		if (jsType.isFunctionType()) {
			com.google.javascript.rhino.jstype.FunctionType functionType = jsType.toMaybeFunctionType();
			com.google.javascript.rhino.jstype.JSType returnType = functionType.getReturnType();
			if (returnType == null) {
				returnType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
			}
			com.google.javascript.rhino.Node valueNode = n.getFirstChild();
			com.google.javascript.rhino.jstype.JSType actualReturnType;
			if (valueNode == null) {
				actualReturnType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
				valueNode = n;
			}else {
				actualReturnType = getJSType(valueNode);
			}
			validator.expectCanAssignTo(t, valueNode, actualReturnType, returnType, "inconsistent return type");
		}
	}

	private void visitBinaryOperator(int op, com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType leftType = getJSType(left);
		com.google.javascript.rhino.Node right = n.getLastChild();
		com.google.javascript.rhino.jstype.JSType rightType = getJSType(right);
		switch (op) {
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.URSH :
				if (!(leftType.matchesInt32Context())) {
					report(t, left, com.google.javascript.jscomp.TypeCheck.BIT_OPERATION, com.google.javascript.jscomp.NodeUtil.opToStr(n.getType()), leftType.toString());
				}
				if (!(rightType.matchesUint32Context())) {
					report(t, right, com.google.javascript.jscomp.TypeCheck.BIT_OPERATION, com.google.javascript.jscomp.NodeUtil.opToStr(n.getType()), rightType.toString());
				}
				break;
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.SUB :
				validator.expectNumber(t, left, leftType, "left operand");
				validator.expectNumber(t, right, rightType, "right operand");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITOR :
				validator.expectBitwiseable(t, left, leftType, "bad left operand to bitwise operator");
				validator.expectBitwiseable(t, right, rightType, "bad right operand to bitwise operator");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ADD :
				break;
			default :
				report(t, n, com.google.javascript.jscomp.TypeCheck.UNEXPECTED_TOKEN, com.google.javascript.rhino.Token.name(op));
		}
		ensureTyped(t, n);
	}

	private void checkEnumAlias(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.JSDocInfo declInfo, com.google.javascript.rhino.Node value) {
		if ((declInfo == null) || (!(declInfo.hasEnumParameterType()))) {
			return ;
		}
		com.google.javascript.rhino.jstype.JSType valueType = getJSType(value);
		if (!(valueType.isEnumType())) {
			return ;
		}
		com.google.javascript.rhino.jstype.EnumType valueEnumType = valueType.toMaybeEnumType();
		com.google.javascript.rhino.jstype.JSType valueEnumPrimitiveType = valueEnumType.getElementsType().getPrimitiveType();
		validator.expectCanAssignTo(t, value, valueEnumPrimitiveType, declInfo.getEnumParameterType().evaluate(t.getScope(), typeRegistry), "incompatible enum element types");
	}

	private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType jsType = n.getJSType();
		if (jsType == null) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}else {
			return jsType;
		}
	}

	private void ensureTyped(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		ensureTyped(t, n, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
	}

	private void ensureTyped(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSTypeNative type) {
		ensureTyped(t, n, getNativeType(type));
	}

	private void ensureTyped(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type) {
		com.google.common.base.Preconditions.checkState((((!(n.isFunction())) || (type.isFunctionType())) || (type.isUnknownType())));
		com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
		if (info != null) {
			if (info.hasType()) {
				com.google.javascript.rhino.jstype.JSType infoType = info.getType().evaluate(t.getScope(), typeRegistry);
				validator.expectCanCast(t, n, infoType, type);
				type = infoType;
			}
			if ((info.isImplicitCast()) && (!(inExterns))) {
				java.lang.String propName = n.isGetProp() ? n.getLastChild().getString() : "(missing)";
				compiler.report(t.makeError(n, com.google.javascript.jscomp.TypeCheck.ILLEGAL_IMPLICIT_CAST, propName));
			}
		}
		if ((n.getJSType()) == null) {
			n.setJSType(type);
		}
	}

	double getTypedPercent() {
		int total = ((nullCount) + (unknownCount)) + (typedCount);
		if (total == 0) {
			return 0.0;
		}else {
			return (100.0 * (typedCount)) / total;
		}
	}

	private com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return typeRegistry.getNativeType(typeId);
	}
}

