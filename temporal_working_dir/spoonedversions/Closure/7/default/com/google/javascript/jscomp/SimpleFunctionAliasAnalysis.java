

package com.google.javascript.jscomp;


class SimpleFunctionAliasAnalysis {
	private java.util.Set<com.google.javascript.rhino.Node> aliasedFunctions;

	private java.util.Set<com.google.javascript.rhino.Node> functionsExposedToCallOrApply;

	public boolean isAliased(com.google.javascript.rhino.Node functionNode) {
		com.google.common.base.Preconditions.checkNotNull(aliasedFunctions);
		com.google.common.base.Preconditions.checkArgument(functionNode.isFunction());
		return aliasedFunctions.contains(functionNode);
	}

	public boolean isExposedToCallOrApply(com.google.javascript.rhino.Node functionNode) {
		com.google.common.base.Preconditions.checkNotNull(functionsExposedToCallOrApply);
		com.google.common.base.Preconditions.checkArgument(functionNode.isFunction());
		return functionsExposedToCallOrApply.contains(functionNode);
	}

	public void analyze(com.google.javascript.jscomp.SimpleDefinitionFinder finder) {
		com.google.common.base.Preconditions.checkState(((aliasedFunctions) == null));
		aliasedFunctions = com.google.common.collect.Sets.newHashSet();
		functionsExposedToCallOrApply = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.jscomp.DefinitionSite definitionSite : finder.getDefinitionSites()) {
			com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
			if (!(definition.isExtern())) {
				com.google.javascript.rhino.Node rValue = definition.getRValue();
				if ((rValue != null) && (rValue.isFunction())) {
					for (com.google.javascript.jscomp.UseSite useSite : finder.getUseSites(definition)) {
						updateFunctionForUse(rValue, useSite.node);
					}
				}
			}
		}
	}

	private void updateFunctionForUse(com.google.javascript.rhino.Node function, com.google.javascript.rhino.Node useNode) {
		com.google.javascript.rhino.Node useParent = useNode.getParent();
		int parentType = useParent.getType();
		if (((parentType == (com.google.javascript.rhino.Token.CALL)) || (parentType == (com.google.javascript.rhino.Token.NEW))) && ((useParent.getFirstChild()) == useNode)) {
		}else
			if (com.google.javascript.jscomp.NodeUtil.isGet(useParent)) {
				if (useParent.isGetProp()) {
					com.google.javascript.rhino.Node gramps = useParent.getParent();
					if ((com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(gramps)) || (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(gramps))) {
						functionsExposedToCallOrApply.add(function);
					}
				}
			}else {
				aliasedFunctions.add(function);
			}
		
	}
}

