

package com.google.javascript.jscomp;


public class CallGraph implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.CallGraph.Callsite> callsitesByNode;

	private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.CallGraph.Function> functionsByNode;

	private boolean computeBackwardGraph;

	private boolean computeForwardGraph;

	private boolean useNameReferenceGraph = false;

	private boolean alreadyRun = false;

	@com.google.common.annotations.VisibleForTesting
	public static final java.lang.String MAIN_FUNCTION_NAME = "{main}";

	private com.google.javascript.jscomp.CallGraph.Function mainFunction;

	public CallGraph(com.google.javascript.jscomp.AbstractCompiler compiler, boolean computeForwardGraph, boolean computeBackwardGraph) {
		com.google.common.base.Preconditions.checkArgument((computeForwardGraph || computeBackwardGraph));
		com.google.javascript.jscomp.CallGraph.this.compiler = compiler;
		com.google.javascript.jscomp.CallGraph.this.computeForwardGraph = computeForwardGraph;
		com.google.javascript.jscomp.CallGraph.this.computeBackwardGraph = computeBackwardGraph;
		callsitesByNode = com.google.common.collect.Maps.newLinkedHashMap();
		functionsByNode = com.google.common.collect.Maps.newLinkedHashMap();
	}

	public CallGraph(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, true, true);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node jsRoot) {
		com.google.common.base.Preconditions.checkState(((alreadyRun) == false));
		com.google.javascript.jscomp.DefinitionProvider definitionProvider = constructDefinitionProvider(externsRoot, jsRoot);
		createFunctionsAndCallsites(jsRoot, definitionProvider);
		fillInFunctionInformation(definitionProvider);
		alreadyRun = true;
	}

	public com.google.javascript.jscomp.CallGraph.Function getFunctionForAstNode(com.google.javascript.rhino.Node functionNode) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(functionNode));
		return functionsByNode.get(functionNode);
	}

	public com.google.javascript.jscomp.CallGraph.Function getMainFunction() {
		return mainFunction;
	}

	public java.util.Collection<com.google.javascript.jscomp.CallGraph.Function> getAllFunctions() {
		return functionsByNode.values();
	}

	@com.google.common.annotations.VisibleForTesting
	public com.google.javascript.jscomp.CallGraph.Function getUniqueFunctionWithName(final java.lang.String desiredName) {
		java.util.Collection<com.google.javascript.jscomp.CallGraph.Function> functions = com.google.common.collect.Collections2.<com.google.javascript.jscomp.CallGraph.Function>filter(getAllFunctions(), new com.google.common.base.Predicate<com.google.javascript.jscomp.CallGraph.Function>() {
			public boolean apply(com.google.javascript.jscomp.CallGraph.Function function) {
				java.lang.String functionName = function.getName();
				if ((functionName != null) && (desiredName != null)) {
					return desiredName.equals(functionName);
				}else {
					return desiredName == functionName;
				}
			}
		});
		if ((functions.size()) == 1) {
			return functions.iterator().next();
		}else {
			throw new java.lang.IllegalStateException(((("Found " + (functions.size())) + " functions with name ") + desiredName));
		}
	}

	public com.google.javascript.jscomp.CallGraph.Callsite getCallsiteForAstNode(com.google.javascript.rhino.Node callsiteNode) {
		com.google.common.base.Preconditions.checkArgument((((callsiteNode.getType()) == (com.google.javascript.rhino.Token.CALL)) || ((callsiteNode.getType()) == (com.google.javascript.rhino.Token.NEW))));
		return callsitesByNode.get(callsiteNode);
	}

	public java.util.Collection<com.google.javascript.jscomp.CallGraph.Callsite> getAllCallsites() {
		return callsitesByNode.values();
	}

	private void createFunctionsAndCallsites(com.google.javascript.rhino.Node jsRoot, final com.google.javascript.jscomp.DefinitionProvider provider) {
		mainFunction = createFunction(jsRoot);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, jsRoot, new com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback() {
			@java.lang.Override
			public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
				int nodeType = n.getType();
				if ((nodeType == (com.google.javascript.rhino.Token.CALL)) || (nodeType == (com.google.javascript.rhino.Token.NEW))) {
					com.google.javascript.jscomp.CallGraph.Callsite callsite = createCallsite(n);
					com.google.javascript.rhino.Node containingFunctionNode = t.getScopeRoot();
					com.google.javascript.jscomp.CallGraph.Function containingFunction = functionsByNode.get(containingFunctionNode);
					if (containingFunction == null) {
						containingFunction = createFunction(containingFunctionNode);
					}
					callsite.containingFunction = containingFunction;
					containingFunction.addCallsiteInFunction(callsite);
					connectCallsiteToTargets(callsite, provider);
				}else
					if (com.google.javascript.jscomp.NodeUtil.isFunction(n)) {
						if (!(functionsByNode.containsKey(n))) {
							createFunction(n);
						}
					}
				
			}
		});
	}

	private com.google.javascript.jscomp.CallGraph.Function createFunction(com.google.javascript.rhino.Node functionNode) {
		com.google.javascript.jscomp.CallGraph.Function function = new com.google.javascript.jscomp.CallGraph.Function(functionNode);
		functionsByNode.put(functionNode, function);
		return function;
	}

	private com.google.javascript.jscomp.CallGraph.Callsite createCallsite(com.google.javascript.rhino.Node callsiteNode) {
		com.google.javascript.jscomp.CallGraph.Callsite callsite = new com.google.javascript.jscomp.CallGraph.Callsite(callsiteNode);
		callsitesByNode.put(callsiteNode, callsite);
		return callsite;
	}

	private void connectCallsiteToTargets(com.google.javascript.jscomp.CallGraph.Callsite callsite, com.google.javascript.jscomp.DefinitionProvider definitionProvider) {
		java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> definitions = lookupDefinitionsForTargetsOfCall(callsite.getAstNode(), definitionProvider);
		if (definitions == null) {
			callsite.hasUnknownTarget = true;
		}else {
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition definition : definitions) {
				if (definition.isExtern()) {
					callsite.hasExternTarget = true;
				}else {
					com.google.javascript.rhino.Node target = definition.getRValue();
					if ((target != null) && (com.google.javascript.jscomp.NodeUtil.isFunction(target))) {
						com.google.javascript.jscomp.CallGraph.Function targetFunction = functionsByNode.get(target);
						if (targetFunction == null) {
							targetFunction = createFunction(target);
						}
						if (computeForwardGraph) {
							callsite.addPossibleTarget(targetFunction);
						}
						if (computeBackwardGraph) {
							targetFunction.addCallsitePossiblyTargetingFunction(callsite);
						}
					}else {
						callsite.hasUnknownTarget = true;
					}
				}
			}
		}
	}

	private void fillInFunctionInformation(com.google.javascript.jscomp.DefinitionProvider provider) {
		if (useNameReferenceGraph) {
			com.google.javascript.jscomp.NameReferenceGraph referenceGraph = ((com.google.javascript.jscomp.NameReferenceGraph) (provider));
			for (com.google.javascript.jscomp.CallGraph.Function function : getAllFunctions()) {
				if (!(function.isMain())) {
					java.lang.String functionName = function.getName();
					if (functionName != null) {
						com.google.javascript.jscomp.NameReferenceGraph.Name symbol = referenceGraph.getSymbol(functionName);
						updateFunctionForName(function, symbol);
					}
				}
			}
		}else {
			com.google.javascript.jscomp.SimpleDefinitionFinder finder = ((com.google.javascript.jscomp.SimpleDefinitionFinder) (provider));
			for (com.google.javascript.jscomp.DefinitionSite definitionSite : finder.getDefinitionSites()) {
				com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
				com.google.javascript.jscomp.CallGraph.Function function = lookupFunctionForDefinition(definition);
				if (function != null) {
					for (com.google.javascript.jscomp.UseSite useSite : finder.getUseSites(definition)) {
						updateFunctionForUse(function, useSite.node);
					}
				}
			}
		}
	}

	private void updateFunctionForName(com.google.javascript.jscomp.CallGraph.Function function, com.google.javascript.jscomp.NameReferenceGraph.Name name) {
		if (name.isAliased()) {
			function.isAliased = true;
		}
		if (name.exposedToCallOrApply()) {
			function.isExposedToCallOrApply = true;
		}
	}

	private void updateFunctionForUse(com.google.javascript.jscomp.CallGraph.Function function, com.google.javascript.rhino.Node useNode) {
		com.google.javascript.rhino.Node useParent = useNode.getParent();
		int parentType = useParent.getType();
		if (((parentType == (com.google.javascript.rhino.Token.CALL)) || (parentType == (com.google.javascript.rhino.Token.NEW))) && ((useParent.getFirstChild()) == useNode)) {
		}else
			if (com.google.javascript.jscomp.NodeUtil.isGet(useParent)) {
				if (com.google.javascript.jscomp.NodeUtil.isGetProp(useParent)) {
					com.google.javascript.rhino.Node gramps = useParent.getParent();
					if ((com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(gramps)) || (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(gramps))) {
						function.isExposedToCallOrApply = true;
					}
				}
			}else {
				function.isAliased = true;
			}
		
	}

	private com.google.javascript.jscomp.CallGraph.Function lookupFunctionForDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition definition) {
		if ((definition != null) && (!(definition.isExtern()))) {
			com.google.javascript.rhino.Node rValue = definition.getRValue();
			if ((rValue != null) && (com.google.javascript.jscomp.NodeUtil.isFunction(rValue))) {
				com.google.javascript.jscomp.CallGraph.Function function = functionsByNode.get(rValue);
				com.google.common.base.Preconditions.checkNotNull(function);
				return function;
			}
		}
		return null;
	}

	public com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite> getForwardDirectedGraph() {
		return constructDirectedGraph(true);
	}

	public com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite> getBackwardDirectedGraph() {
		return constructDirectedGraph(false);
	}

	private static void digraphConnect(com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite> digraph, com.google.javascript.jscomp.CallGraph.Function caller, com.google.javascript.jscomp.CallGraph.Callsite callsite, com.google.javascript.jscomp.CallGraph.Function callee, boolean forward) {
		com.google.javascript.jscomp.CallGraph.Function source;
		com.google.javascript.jscomp.CallGraph.Function destination;
		if (forward) {
			source = caller;
			destination = callee;
		}else {
			source = callee;
			destination = caller;
		}
		digraph.connect(source, callsite, destination);
	}

	private com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite> constructDirectedGraph(boolean forward) {
		com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite> digraph = new com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite>();
		for (com.google.javascript.jscomp.CallGraph.Function function : getAllFunctions()) {
			digraph.createNode(function);
		}
		if (computeForwardGraph) {
			for (com.google.javascript.jscomp.CallGraph.Function caller : getAllFunctions()) {
				for (com.google.javascript.jscomp.CallGraph.Callsite callsite : caller.getCallsitesInFunction()) {
					for (com.google.javascript.jscomp.CallGraph.Function callee : callsite.getPossibleTargets()) {
						com.google.javascript.jscomp.CallGraph.digraphConnect(digraph, caller, callsite, callee, forward);
					}
				}
			}
		}else {
			for (com.google.javascript.jscomp.CallGraph.Function callee : getAllFunctions()) {
				for (com.google.javascript.jscomp.CallGraph.Callsite callsite : callee.getCallsitesPossiblyTargetingFunction()) {
					com.google.javascript.jscomp.CallGraph.Function caller = callsite.getContainingFunction();
					com.google.javascript.jscomp.CallGraph.digraphConnect(digraph, caller, callsite, callee, forward);
				}
			}
		}
		return digraph;
	}

	private com.google.javascript.jscomp.DefinitionProvider constructDefinitionProvider(com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node jsRoot) {
		if (useNameReferenceGraph) {
			com.google.javascript.jscomp.NameReferenceGraphConstruction graphConstruction = new com.google.javascript.jscomp.NameReferenceGraphConstruction(compiler);
			graphConstruction.process(externsRoot, jsRoot);
			return graphConstruction.getNameReferenceGraph();
		}else {
			com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
			defFinder.process(externsRoot, jsRoot);
			return defFinder;
		}
	}

	private java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> lookupDefinitionsForTargetsOfCall(com.google.javascript.rhino.Node callsite, com.google.javascript.jscomp.DefinitionProvider definitionProvider) {
		com.google.common.base.Preconditions.checkArgument((((callsite.getType()) == (com.google.javascript.rhino.Token.CALL)) || ((callsite.getType()) == (com.google.javascript.rhino.Token.NEW))));
		com.google.javascript.rhino.Node targetExpression = callsite.getFirstChild();
		if ((!(useNameReferenceGraph)) || ((com.google.javascript.jscomp.NodeUtil.isGetProp(targetExpression)) || (com.google.javascript.jscomp.NodeUtil.isName(targetExpression)))) {
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> definitions = definitionProvider.getDefinitionsReferencedAt(targetExpression);
			if ((definitions != null) && (!(definitions.isEmpty()))) {
				return definitions;
			}
		}
		return null;
	}

	public class Function {
		private com.google.javascript.rhino.Node astNode;

		private boolean isAliased = false;

		private boolean isExposedToCallOrApply = false;

		private java.util.Collection<com.google.javascript.jscomp.CallGraph.Callsite> callsitesInFunction;

		private java.util.Collection<com.google.javascript.jscomp.CallGraph.Callsite> callsitesPossiblyTargetingFunction;

		private Function(com.google.javascript.rhino.Node functionAstNode) {
			astNode = functionAstNode;
		}

		public boolean isMain() {
			return (com.google.javascript.jscomp.CallGraph.Function.this) == (com.google.javascript.jscomp.CallGraph.this.mainFunction);
		}

		public com.google.javascript.rhino.Node getAstNode() {
			return astNode;
		}

		public com.google.javascript.rhino.Node getBodyNode() {
			if (isMain()) {
				return astNode;
			}else {
				return com.google.javascript.jscomp.NodeUtil.getFunctionBody(astNode);
			}
		}

		public java.lang.String getName() {
			if (isMain()) {
				return com.google.javascript.jscomp.CallGraph.MAIN_FUNCTION_NAME;
			}else {
				return com.google.javascript.jscomp.NodeUtil.getFunctionName(astNode);
			}
		}

		public java.util.Collection<com.google.javascript.jscomp.CallGraph.Callsite> getCallsitesInFunction() {
			if ((callsitesInFunction) != null) {
				return callsitesInFunction;
			}else {
				return com.google.common.collect.ImmutableList.of();
			}
		}

		private void addCallsiteInFunction(com.google.javascript.jscomp.CallGraph.Callsite callsite) {
			if ((callsitesInFunction) == null) {
				callsitesInFunction = new java.util.LinkedList<com.google.javascript.jscomp.CallGraph.Callsite>();
			}
			callsitesInFunction.add(callsite);
		}

		public java.util.Collection<com.google.javascript.jscomp.CallGraph.Callsite> getCallsitesPossiblyTargetingFunction() {
			if (computeBackwardGraph) {
				if ((callsitesPossiblyTargetingFunction) != null) {
					return callsitesPossiblyTargetingFunction;
				}else {
					return com.google.common.collect.ImmutableList.of();
				}
			}else {
				throw new java.lang.UnsupportedOperationException(("Cannot call " + ("getCallsitesPossiblyTargetingFunction() on a Function " + "from a non-backward CallGraph")));
			}
		}

		private void addCallsitePossiblyTargetingFunction(com.google.javascript.jscomp.CallGraph.Callsite callsite) {
			com.google.common.base.Preconditions.checkState(computeBackwardGraph);
			if ((callsitesPossiblyTargetingFunction) == null) {
				callsitesPossiblyTargetingFunction = new java.util.LinkedList<com.google.javascript.jscomp.CallGraph.Callsite>();
			}
			callsitesPossiblyTargetingFunction.add(callsite);
		}

		public boolean isAliased() {
			return isAliased;
		}

		public boolean isExposedToCallOrApply() {
			return isExposedToCallOrApply;
		}
	}

	public class Callsite {
		private com.google.javascript.rhino.Node astNode;

		private boolean hasUnknownTarget = false;

		private boolean hasExternTarget = false;

		private com.google.javascript.jscomp.CallGraph.Function containingFunction = null;

		private java.util.Collection<com.google.javascript.jscomp.CallGraph.Function> possibleTargets;

		private Callsite(com.google.javascript.rhino.Node callsiteAstNode) {
			astNode = callsiteAstNode;
		}

		public com.google.javascript.rhino.Node getAstNode() {
			return astNode;
		}

		public com.google.javascript.jscomp.CallGraph.Function getContainingFunction() {
			return containingFunction;
		}

		public java.util.Collection<com.google.javascript.jscomp.CallGraph.Function> getPossibleTargets() {
			if (computeForwardGraph) {
				if ((possibleTargets) != null) {
					return possibleTargets;
				}else {
					return com.google.common.collect.ImmutableList.of();
				}
			}else {
				throw new java.lang.UnsupportedOperationException(("Cannot call " + ("getPossibleTargets() on a Callsite from a non-forward " + "CallGraph")));
			}
		}

		private void addPossibleTarget(com.google.javascript.jscomp.CallGraph.Function target) {
			com.google.common.base.Preconditions.checkState(computeForwardGraph);
			if ((possibleTargets) == null) {
				possibleTargets = new java.util.LinkedList<com.google.javascript.jscomp.CallGraph.Function>();
			}
			possibleTargets.add(target);
		}

		public boolean hasUnknownTarget() {
			return hasUnknownTarget;
		}

		public boolean hasExternTarget() {
			return hasExternTarget;
		}
	}
}

