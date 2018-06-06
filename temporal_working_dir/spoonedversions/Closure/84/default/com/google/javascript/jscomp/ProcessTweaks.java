

package com.google.javascript.jscomp;


class ProcessTweaks implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean stripTweaks;

	private final java.util.SortedMap<java.lang.String, com.google.javascript.rhino.Node> compilerDefaultValueOverrides;

	private static final com.google.common.base.CharMatcher ID_MATCHER = com.google.common.base.CharMatcher.inRange('a', 'z').or(com.google.common.base.CharMatcher.inRange('A', 'Z')).or(com.google.common.base.CharMatcher.anyOf("0123456789_."));

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_TWEAK_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_TWEAK_WARNING", "no tweak registered with ID {0}");

	static final com.google.javascript.jscomp.DiagnosticType TWEAK_MULTIPLY_REGISTERED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_TWEAK_MULTIPLY_REGISTERED_ERROR", "Tweak {0} has already been registered.");

	static final com.google.javascript.jscomp.DiagnosticType NON_LITERAL_TWEAK_ID_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_LITERAL_TWEAK_ID_ERROR", "tweak ID must be a string literal");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_TWEAK_DEFAULT_VALUE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_TWEAK_DEFAULT_VALUE_ERROR", ("tweak registered with {0} must have a default value that is a " + "literal of type {0}"));

	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_TWEAK_INIT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_TWEAK_INIT_ERROR", "tweak declaration {0} must occur in the global scope");

	static final com.google.javascript.jscomp.DiagnosticType TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR", ("Cannot override the default value of tweak {0} after it has been " + "registered"));

	static final com.google.javascript.jscomp.DiagnosticType TWEAK_WRONG_GETTER_TYPE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TWEAK_WRONG_GETTER_TYPE_WARNING", "tweak getter function {0} used for tweak registered using {0}");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_TWEAK_ID_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_TWEAK_ID_ERROR", ("tweak ID contains illegal characters. Only letters, numbers, _ " + "and . are allowed"));

	private static enum TweakFunction {
REGISTER_BOOLEAN("goog.tweak.registerBoolean","boolean",com.google.javascript.rhino.Token.TRUE,com.google.javascript.rhino.Token.FALSE), REGISTER_NUMBER("goog.tweak.registerNumber","number",com.google.javascript.rhino.Token.NUMBER), REGISTER_STRING("goog.tweak.registerString","string",com.google.javascript.rhino.Token.STRING), OVERRIDE_DEFAULT_VALUE("goog.tweak.overrideDefaultValue"), GET_COMPILER_OVERRIDES("goog.tweak.getCompilerOverrides_"), GET_BOOLEAN("goog.tweak.getBoolean",com.google.javascript.jscomp.ProcessTweaks.TweakFunction.REGISTER_BOOLEAN), GET_NUMBER("goog.tweak.getNumber",com.google.javascript.jscomp.ProcessTweaks.TweakFunction.REGISTER_NUMBER), GET_STRING("goog.tweak.getString",com.google.javascript.jscomp.ProcessTweaks.TweakFunction.REGISTER_STRING);
		final java.lang.String name;

		final java.lang.String expectedTypeName;

		final int validNodeTypeA;

		final int validNodeTypeB;

		final com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunction;

		TweakFunction(java.lang.String name) {
			this(name, null, com.google.javascript.rhino.Token.ERROR, com.google.javascript.rhino.Token.ERROR, null);
		}

		TweakFunction(java.lang.String name, java.lang.String expectedTypeName, int validNodeTypeA) {
			this(name, expectedTypeName, validNodeTypeA, com.google.javascript.rhino.Token.ERROR, null);
		}

		TweakFunction(java.lang.String name, java.lang.String expectedTypeName, int validNodeTypeA, int validNodeTypeB) {
			this(name, expectedTypeName, validNodeTypeA, validNodeTypeB, null);
		}

		TweakFunction(java.lang.String name, com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunction) {
			this(name, null, com.google.javascript.rhino.Token.ERROR, com.google.javascript.rhino.Token.ERROR, registerFunction);
		}

		TweakFunction(java.lang.String name, java.lang.String expectedTypeName, int validNodeTypeA, int validNodeTypeB, com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunction) {
			this.name = name;
			this.expectedTypeName = expectedTypeName;
			this.validNodeTypeA = validNodeTypeA;
			this.validNodeTypeB = validNodeTypeB;
			this.registerFunction = registerFunction;
		}

		boolean isValidNodeType(int type) {
			return (type == (validNodeTypeA)) || (type == (validNodeTypeB));
		}

		boolean isCorrectRegisterFunction(com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunction) {
			com.google.common.base.Preconditions.checkNotNull(registerFunction);
			return (com.google.javascript.jscomp.ProcessTweaks.TweakFunction.this.registerFunction) == registerFunction;
		}

		boolean isGetterFunction() {
			return (registerFunction) != null;
		}

		java.lang.String getName() {
			return name;
		}

		java.lang.String getExpectedTypeName() {
			return expectedTypeName;
		}

		com.google.javascript.rhino.Node createDefaultValueNode() {
			switch (com.google.javascript.jscomp.ProcessTweaks.TweakFunction.this) {
				case REGISTER_BOOLEAN :
					return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FALSE);
				case REGISTER_NUMBER :
					return com.google.javascript.rhino.Node.newNumber(0);
				case REGISTER_STRING :
					return com.google.javascript.rhino.Node.newString("");
			}
			throw new java.lang.IllegalStateException();
		}
	}

	private static final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction> TWEAK_FUNCTIONS_MAP;

	static {
		TWEAK_FUNCTIONS_MAP = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.ProcessTweaks.TweakFunction func : com.google.javascript.jscomp.ProcessTweaks.TweakFunction.values()) {
			com.google.javascript.jscomp.ProcessTweaks.TWEAK_FUNCTIONS_MAP.put(func.getName(), func);
		}
	}

	ProcessTweaks(com.google.javascript.jscomp.AbstractCompiler compiler, boolean stripTweaks, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> compilerDefaultValueOverrides) {
		this.compiler = compiler;
		this.stripTweaks = stripTweaks;
		this.compilerDefaultValueOverrides = com.google.common.collect.Maps.newTreeMap();
		com.google.javascript.jscomp.ProcessTweaks.this.compilerDefaultValueOverrides.putAll(compilerDefaultValueOverrides);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ProcessTweaks.CollectTweaksResult result = collectTweaks(root);
		applyCompilerDefaultValueOverrides(result.tweakInfos);
		boolean changed = false;
		if (stripTweaks) {
			changed = stripAllCalls(result.tweakInfos);
		}else
			if (!(compilerDefaultValueOverrides.isEmpty())) {
				changed = replaceGetCompilerOverridesCalls(result.getOverridesCalls);
			}
		
		if (changed) {
			compiler.reportCodeChange();
		}
	}

	private boolean replaceGetCompilerOverridesCalls(java.util.List<com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall> calls) {
		for (com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall call : calls) {
			com.google.javascript.rhino.Node callNode = call.callNode;
			com.google.javascript.rhino.Node objNode = createCompilerDefaultValueOverridesVarNode(callNode);
			callNode.getParent().replaceChild(callNode, objNode);
		}
		return !(calls.isEmpty());
	}

	private boolean stripAllCalls(java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> tweakInfos) {
		for (com.google.javascript.jscomp.ProcessTweaks.TweakInfo tweakInfo : tweakInfos.values()) {
			boolean isRegistered = tweakInfo.isRegistered();
			for (com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall functionCall : tweakInfo.functionCalls) {
				com.google.javascript.rhino.Node callNode = functionCall.callNode;
				com.google.javascript.rhino.Node parent = callNode.getParent();
				if (functionCall.tweakFunc.isGetterFunction()) {
					com.google.javascript.rhino.Node newValue;
					if (isRegistered) {
						newValue = tweakInfo.getDefaultValueNode().cloneNode();
					}else {
						com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunction = functionCall.tweakFunc.registerFunction;
						newValue = registerFunction.createDefaultValueNode();
					}
					parent.replaceChild(callNode, newValue);
				}else {
					com.google.javascript.rhino.Node voidZeroNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID).copyInformationFrom(callNode);
					voidZeroNode.addChildToBack(com.google.javascript.rhino.Node.newNumber(0).copyInformationFrom(callNode));
					parent.replaceChild(callNode, voidZeroNode);
				}
			}
		}
		return !(tweakInfos.isEmpty());
	}

	private com.google.javascript.rhino.Node createCompilerDefaultValueOverridesVarNode(com.google.javascript.rhino.Node sourceInformationNode) {
		com.google.javascript.rhino.Node objNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT).copyInformationFrom(sourceInformationNode);
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node> entry : compilerDefaultValueOverrides.entrySet()) {
			com.google.javascript.rhino.Node objKeyNode = com.google.javascript.rhino.Node.newString(entry.getKey()).copyInformationFrom(sourceInformationNode);
			com.google.javascript.rhino.Node objValueNode = entry.getValue().cloneNode().copyInformationFrom(sourceInformationNode);
			objKeyNode.addChildToBack(objValueNode);
			objNode.addChildToBack(objKeyNode);
		}
		return objNode;
	}

	private void applyCompilerDefaultValueOverrides(java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> tweakInfos) {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node> entry : compilerDefaultValueOverrides.entrySet()) {
			java.lang.String tweakId = entry.getKey();
			com.google.javascript.jscomp.ProcessTweaks.TweakInfo tweakInfo = tweakInfos.get(tweakId);
			if (tweakInfo == null) {
				compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.ProcessTweaks.UNKNOWN_TWEAK_WARNING, tweakId));
			}else {
				tweakInfo.defaultValueNode = entry.getValue();
			}
		}
	}

	private com.google.javascript.jscomp.ProcessTweaks.CollectTweaksResult collectTweaks(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ProcessTweaks.CollectTweaks pass = new com.google.javascript.jscomp.ProcessTweaks.CollectTweaks();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, pass);
		java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> tweakInfos = pass.allTweaks;
		for (com.google.javascript.jscomp.ProcessTweaks.TweakInfo tweakInfo : tweakInfos.values()) {
			tweakInfo.emitAllWarnings();
		}
		return new com.google.javascript.jscomp.ProcessTweaks.CollectTweaksResult(tweakInfos, pass.getOverridesCalls);
	}

	private static final class CollectTweaksResult {
		final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> tweakInfos;

		final java.util.List<com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall> getOverridesCalls;

		CollectTweaksResult(java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> tweakInfos, java.util.List<com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall> getOverridesCalls) {
			this.tweakInfos = tweakInfos;
			this.getOverridesCalls = getOverridesCalls;
		}
	}

	private final class CollectTweaks extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo> allTweaks = com.google.common.collect.Maps.newHashMap();

		final java.util.List<com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall> getOverridesCalls = com.google.common.collect.Lists.newArrayList();

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.CALL)) {
				return ;
			}
			java.lang.String callName = n.getFirstChild().getQualifiedName();
			com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc = com.google.javascript.jscomp.ProcessTweaks.TWEAK_FUNCTIONS_MAP.get(callName);
			if (tweakFunc == null) {
				return ;
			}
			if (tweakFunc == (com.google.javascript.jscomp.ProcessTweaks.TweakFunction.GET_COMPILER_OVERRIDES)) {
				getOverridesCalls.add(new com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall(t.getSourceName(), tweakFunc, n));
				return ;
			}
			com.google.javascript.rhino.Node tweakIdNode = n.getFirstChild().getNext();
			if ((tweakIdNode.getType()) != (com.google.javascript.rhino.Token.STRING)) {
				compiler.report(t.makeError(tweakIdNode, com.google.javascript.jscomp.ProcessTweaks.NON_LITERAL_TWEAK_ID_ERROR));
				return ;
			}
			java.lang.String tweakId = tweakIdNode.getString();
			com.google.javascript.jscomp.ProcessTweaks.TweakInfo tweakInfo = allTweaks.get(tweakId);
			if (tweakInfo == null) {
				tweakInfo = new com.google.javascript.jscomp.ProcessTweaks.TweakInfo(tweakId);
				allTweaks.put(tweakId, tweakInfo);
			}
			switch (tweakFunc) {
				case REGISTER_BOOLEAN :
				case REGISTER_NUMBER :
				case REGISTER_STRING :
					if (!(com.google.javascript.jscomp.ProcessTweaks.ID_MATCHER.matchesAllOf(tweakId))) {
						compiler.report(t.makeError(tweakIdNode, com.google.javascript.jscomp.ProcessTweaks.INVALID_TWEAK_ID_ERROR));
					}
					if (!(t.inGlobalScope())) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessTweaks.NON_GLOBAL_TWEAK_INIT_ERROR, tweakId));
						break;
					}
					if (tweakInfo.isRegistered()) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessTweaks.TWEAK_MULTIPLY_REGISTERED_ERROR, tweakId));
						break;
					}
					com.google.javascript.rhino.Node tweakDefaultValueNode = tweakIdNode.getNext().getNext();
					tweakInfo.addRegisterCall(t.getSourceName(), tweakFunc, n, tweakDefaultValueNode);
					break;
				case OVERRIDE_DEFAULT_VALUE :
					if (!(t.inGlobalScope())) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessTweaks.NON_GLOBAL_TWEAK_INIT_ERROR, tweakId));
						break;
					}
					if (tweakInfo.isRegistered()) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessTweaks.TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR, tweakId));
						break;
					}
					tweakDefaultValueNode = tweakIdNode.getNext();
					tweakInfo.addOverrideDefaultValueCall(t.getSourceName(), tweakFunc, n, tweakDefaultValueNode);
					break;
				case GET_BOOLEAN :
				case GET_NUMBER :
				case GET_STRING :
					tweakInfo.addGetterCall(t.getSourceName(), tweakFunc, n);
			}
		}
	}

	private static final class TweakFunctionCall {
		final java.lang.String sourceName;

		final com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc;

		final com.google.javascript.rhino.Node callNode;

		final com.google.javascript.rhino.Node valueNode;

		TweakFunctionCall(java.lang.String sourceName, com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc, com.google.javascript.rhino.Node callNode) {
			this(sourceName, tweakFunc, callNode, null);
		}

		TweakFunctionCall(java.lang.String sourceName, com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node valueNode) {
			this.sourceName = sourceName;
			this.callNode = callNode;
			this.tweakFunc = tweakFunc;
			this.valueNode = valueNode;
		}

		com.google.javascript.rhino.Node getIdNode() {
			return callNode.getFirstChild().getNext();
		}
	}

	private final class TweakInfo {
		final java.lang.String tweakId;

		final java.util.List<com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall> functionCalls;

		com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall registerCall;

		com.google.javascript.rhino.Node defaultValueNode;

		TweakInfo(java.lang.String tweakId) {
			this.tweakId = tweakId;
			functionCalls = com.google.common.collect.Lists.newArrayList();
		}

		void emitAllWarnings() {
			if (isRegistered()) {
				emitAllTypeWarnings();
			}else {
				emitUnknownTweakErrors();
			}
		}

		void emitAllTypeWarnings() {
			for (com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall call : functionCalls) {
				com.google.javascript.rhino.Node valueNode = call.valueNode;
				com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc = call.tweakFunc;
				com.google.javascript.jscomp.ProcessTweaks.TweakFunction registerFunc = registerCall.tweakFunc;
				if (valueNode != null) {
					if (!(registerFunc.isValidNodeType(valueNode.getType()))) {
						compiler.report(com.google.javascript.jscomp.JSError.make(call.sourceName, valueNode, com.google.javascript.jscomp.ProcessTweaks.INVALID_TWEAK_DEFAULT_VALUE_ERROR, registerFunc.getName(), registerFunc.getExpectedTypeName()));
					}
				}else
					if (tweakFunc.isGetterFunction()) {
						if (!(tweakFunc.isCorrectRegisterFunction(registerFunc))) {
							compiler.report(com.google.javascript.jscomp.JSError.make(call.sourceName, call.callNode, com.google.javascript.jscomp.ProcessTweaks.TWEAK_WRONG_GETTER_TYPE_WARNING, tweakFunc.getName(), registerFunc.getName()));
						}
					}
				
			}
		}

		void emitUnknownTweakErrors() {
			for (com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall call : functionCalls) {
				compiler.report(com.google.javascript.jscomp.JSError.make(call.sourceName, call.getIdNode(), com.google.javascript.jscomp.ProcessTweaks.UNKNOWN_TWEAK_WARNING, tweakId));
			}
		}

		void addRegisterCall(java.lang.String sourceName, com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node defaultValueNode) {
			registerCall = new com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall(sourceName, tweakFunc, callNode, defaultValueNode);
			functionCalls.add(registerCall);
		}

		void addOverrideDefaultValueCall(java.lang.String sourceName, com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc, com.google.javascript.rhino.Node callNode, com.google.javascript.rhino.Node defaultValueNode) {
			functionCalls.add(new com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall(sourceName, tweakFunc, callNode, defaultValueNode));
			com.google.javascript.jscomp.ProcessTweaks.TweakInfo.this.defaultValueNode = defaultValueNode;
		}

		void addGetterCall(java.lang.String sourceName, com.google.javascript.jscomp.ProcessTweaks.TweakFunction tweakFunc, com.google.javascript.rhino.Node callNode) {
			functionCalls.add(new com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall(sourceName, tweakFunc, callNode));
		}

		boolean isRegistered() {
			return (registerCall) != null;
		}

		com.google.javascript.rhino.Node getDefaultValueNode() {
			com.google.common.base.Preconditions.checkState(isRegistered());
			if ((defaultValueNode) != null) {
				return defaultValueNode;
			}
			if ((registerCall.valueNode) != null) {
				return registerCall.valueNode;
			}
			return registerCall.tweakFunc.createDefaultValueNode();
		}
	}
}

