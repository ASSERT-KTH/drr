

package com.google.javascript.jscomp;


class FunctionArgumentInjector {
	static final java.lang.String THIS_MARKER = "this";

	private FunctionArgumentInjector() {
	}

	static com.google.javascript.rhino.Node inject(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> replacements) {
		return com.google.javascript.jscomp.FunctionArgumentInjector.inject(compiler, node, parent, replacements, true);
	}

	static com.google.javascript.rhino.Node inject(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> replacements, boolean replaceThis) {
		if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			com.google.javascript.rhino.Node replacementTemplate = replacements.get(node.getString());
			if (replacementTemplate != null) {
				com.google.common.base.Preconditions.checkState(((((parent.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) || ((parent.getType()) != (com.google.javascript.rhino.Token.VAR))) || ((parent.getType()) != (com.google.javascript.rhino.Token.CATCH))));
				com.google.javascript.rhino.Node replacement = replacementTemplate.cloneTree();
				parent.replaceChild(node, replacement);
				return replacement;
			}
		}else
			if (replaceThis && ((node.getType()) == (com.google.javascript.rhino.Token.THIS))) {
				com.google.javascript.rhino.Node replacementTemplate = replacements.get(com.google.javascript.jscomp.FunctionArgumentInjector.THIS_MARKER);
				com.google.common.base.Preconditions.checkNotNull(replacementTemplate);
				if ((replacementTemplate.getType()) != (com.google.javascript.rhino.Token.THIS)) {
					com.google.javascript.rhino.Node replacement = replacementTemplate.cloneTree();
					parent.replaceChild(node, replacement);
					if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(replacementTemplate, compiler)) {
						replacements.remove(com.google.javascript.jscomp.FunctionArgumentInjector.THIS_MARKER);
					}
					return replacement;
				}
			}else
				if ((node.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
					replaceThis = false;
				}
			
		
		for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
			c = com.google.javascript.jscomp.FunctionArgumentInjector.inject(compiler, c, node, replacements, replaceThis);
		}
		return node;
	}

	static java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node> getFunctionCallParameterMap(com.google.javascript.rhino.Node fnNode, com.google.javascript.rhino.Node callNode, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier) {
		java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node> argMap = com.google.common.collect.Maps.newLinkedHashMap();
		com.google.javascript.rhino.Node cArg = callNode.getFirstChild().getNext();
		if ((cArg != null) && (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode))) {
			argMap.put(com.google.javascript.jscomp.FunctionArgumentInjector.THIS_MARKER, cArg);
			cArg = cArg.getNext();
		}else {
			com.google.common.base.Preconditions.checkState((!(com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(callNode))));
			argMap.put(com.google.javascript.jscomp.FunctionArgumentInjector.THIS_MARKER, com.google.javascript.jscomp.NodeUtil.newUndefinedNode(callNode));
		}
		for (com.google.javascript.rhino.Node fnArg : com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).children()) {
			if (cArg != null) {
				argMap.put(fnArg.getString(), cArg);
				cArg = cArg.getNext();
			}else {
				com.google.javascript.rhino.Node srcLocation = callNode;
				argMap.put(fnArg.getString(), com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation));
			}
		}
		int anonArg = 0;
		while (cArg != null) {
			java.lang.String uniquePlaceholder = com.google.javascript.jscomp.FunctionArgumentInjector.getUniqueAnonymousParameterName(safeNameIdSupplier);
			argMap.put(uniquePlaceholder, cArg);
			cArg = cArg.getNext();
		} 
		return argMap;
	}

	private static java.lang.String getUniqueAnonymousParameterName(com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier) {
		return "JSCompiler_inline_anon_param_" + (safeNameIdSupplier.get());
	}

	static java.util.Set<java.lang.String> findModifiedParameters(com.google.javascript.rhino.Node fnNode) {
		java.util.Set<java.lang.String> names = com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionParameterSet(fnNode);
		java.util.Set<java.lang.String> unsafeNames = com.google.common.collect.Sets.newHashSet();
		return com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(fnNode.getLastChild(), null, names, unsafeNames, false);
	}

	private static java.util.Set<java.lang.String> findModifiedParameters(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.util.Set<java.lang.String> names, java.util.Set<java.lang.String> unsafe, boolean inInnerFunction) {
		com.google.common.base.Preconditions.checkArgument((unsafe != null));
		if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			if (names.contains(n.getString())) {
				if (inInnerFunction || (com.google.javascript.jscomp.FunctionArgumentInjector.canNameValueChange(n, parent))) {
					unsafe.add(n.getString());
				}
			}
		}else
			if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				inInnerFunction = true;
			}
		
		for (com.google.javascript.rhino.Node c : n.children()) {
			com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(c, n, names, unsafe, inInnerFunction);
		}
		return unsafe;
	}

	private static boolean canNameValueChange(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		int type = parent.getType();
		return (((type == (com.google.javascript.rhino.Token.VAR)) || (type == (com.google.javascript.rhino.Token.INC))) || (type == (com.google.javascript.rhino.Token.DEC))) || ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == n));
	}

	static void maybeAddTempsForCallArguments(com.google.javascript.rhino.Node fnNode, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> argMap, java.util.Set<java.lang.String> namesNeedingTemps, com.google.javascript.jscomp.CodingConvention convention) {
		if (argMap.isEmpty()) {
			return ;
		}
		com.google.common.base.Preconditions.checkArgument(((fnNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		com.google.javascript.rhino.Node block = fnNode.getLastChild();
		java.util.Set<java.lang.String> parameters = argMap.keySet();
		java.util.Set<java.lang.String> namesAfterSideEffects = com.google.javascript.jscomp.FunctionArgumentInjector.findParametersReferencedAfterSideEffect(parameters, block);
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node> entry : argMap.entrySet()) {
			java.lang.String argName = entry.getKey();
			if (namesNeedingTemps.contains(argName)) {
				continue;
			}
			com.google.javascript.rhino.Node cArg = entry.getValue();
			boolean safe = true;
			int references = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(block, argName);
			if ((com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(cArg)) && (references > 0)) {
				safe = false;
			}else
				if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(cArg)) {
					safe = false;
				}else
					if ((com.google.javascript.jscomp.NodeUtil.canBeSideEffected(cArg)) && (namesAfterSideEffects.contains(argName))) {
						safe = false;
					}else
						if (references > 1) {
							switch (cArg.getType()) {
								case com.google.javascript.rhino.Token.NAME :
									java.lang.String name = cArg.getString();
									safe = !(convention.isExported(name));
									break;
								case com.google.javascript.rhino.Token.THIS :
									safe = true;
									break;
								case com.google.javascript.rhino.Token.STRING :
									safe = (cArg.getString().length()) < 2;
									break;
								default :
									safe = com.google.javascript.jscomp.NodeUtil.isImmutableValue(cArg);
									break;
							}
						}
					
				
			
			if (!safe) {
				namesNeedingTemps.add(argName);
			}
		}
	}

	private static java.util.Set<java.lang.String> findParametersReferencedAfterSideEffect(java.util.Set<java.lang.String> parameters, com.google.javascript.rhino.Node root) {
		java.util.Set<java.lang.String> locals = com.google.common.collect.Sets.newHashSet(parameters);
		com.google.javascript.jscomp.FunctionArgumentInjector.gatherLocalNames(root, locals);
		com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect collector = new com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect(parameters, locals);
		com.google.javascript.jscomp.NodeUtil.visitPostOrder(root, collector, collector);
		return collector.getResults();
	}

	private static class ReferencedAfterSideEffect implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> , com.google.javascript.jscomp.NodeUtil.Visitor {
		private final java.util.Set<java.lang.String> parameters;

		private final java.util.Set<java.lang.String> locals;

		private boolean sideEffectSeen = false;

		private java.util.Set<java.lang.String> parametersReferenced = com.google.common.collect.Sets.newHashSet();

		private int loopsEntered = 0;

		ReferencedAfterSideEffect(java.util.Set<java.lang.String> parameters, java.util.Set<java.lang.String> locals) {
			this.parameters = parameters;
			this.locals = locals;
		}

		java.util.Set<java.lang.String> getResults() {
			return parametersReferenced;
		}

		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node node) {
			if (com.google.javascript.jscomp.NodeUtil.isLoopStructure(node)) {
				(loopsEntered)++;
			}
			return !((sideEffectSeen) && ((parameters.size()) == (parametersReferenced.size())));
		}

		boolean inLoop() {
			return (loopsEntered) != 0;
		}

		@java.lang.Override
		public void visit(com.google.javascript.rhino.Node n) {
			if (com.google.javascript.jscomp.NodeUtil.isLoopStructure(n)) {
				(loopsEntered)--;
				if ((!(inLoop())) && (!(sideEffectSeen))) {
					parametersReferenced.clear();
				}
			}
			if (!(sideEffectSeen)) {
				if (hasNonLocalSideEffect(n)) {
					sideEffectSeen = true;
				}
			}
			if ((inLoop()) || (sideEffectSeen)) {
				if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
					java.lang.String name = n.getString();
					if (parameters.contains(name)) {
						parametersReferenced.add(name);
					}
				}else
					if ((n.getType()) == (com.google.javascript.rhino.Token.THIS)) {
						parametersReferenced.add(com.google.javascript.jscomp.FunctionArgumentInjector.THIS_MARKER);
					}
				
			}
		}

		private boolean hasNonLocalSideEffect(com.google.javascript.rhino.Node n) {
			boolean sideEffect = false;
			int type = n.getType();
			if (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) || (type == (com.google.javascript.rhino.Token.INC))) || (type == (com.google.javascript.rhino.Token.DEC))) {
				com.google.javascript.rhino.Node lhs = n.getFirstChild();
				if (!(isLocalName(lhs))) {
					sideEffect = true;
				}
			}else
				if (type == (com.google.javascript.rhino.Token.CALL)) {
					sideEffect = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(n);
				}else
					if (type == (com.google.javascript.rhino.Token.NEW)) {
						sideEffect = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(n);
					}else
						if (type == (com.google.javascript.rhino.Token.DELPROP)) {
							sideEffect = true;
						}
					
				
			
			return sideEffect;
		}

		private boolean isLocalName(com.google.javascript.rhino.Node node) {
			if (com.google.javascript.jscomp.NodeUtil.isName(node)) {
				java.lang.String name = node.getString();
				return locals.contains(name);
			}
			return false;
		}
	}

	private static void gatherLocalNames(com.google.javascript.rhino.Node n, java.util.Set<java.lang.String> names) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
				names.add(n.getFirstChild().getString());
			}
			return ;
		}else
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				switch (n.getParent().getType()) {
					case com.google.javascript.rhino.Token.VAR :
					case com.google.javascript.rhino.Token.CATCH :
						names.add(n.getString());
				}
			}
		
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			com.google.javascript.jscomp.FunctionArgumentInjector.gatherLocalNames(c, names);
		}
	}

	private static java.util.Set<java.lang.String> getFunctionParameterSet(com.google.javascript.rhino.Node fnNode) {
		java.util.Set<java.lang.String> set = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.rhino.Node n : com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).children()) {
			set.add(n.getString());
		}
		return set;
	}
}

