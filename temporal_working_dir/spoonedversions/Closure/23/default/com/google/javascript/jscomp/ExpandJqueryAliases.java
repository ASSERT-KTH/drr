

package com.google.javascript.jscomp;


class ExpandJqueryAliases extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CodingConvention convention;

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.ExpandJqueryAliases.class.getName());

	static final com.google.javascript.jscomp.DiagnosticType JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_JQUERY_UNABLE_TO_EXPAND_INVALID_LIT", ("jQuery.expandedEach call cannot be expanded because the first " + ("argument must be an object literal or an array of strings " + "literal.")));

	static final com.google.javascript.jscomp.DiagnosticType JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_JQUERY_UNABLE_TO_EXPAND_INVALID_NAME", ("jQuery.expandedEach expansion would result in the invalid " + "property name \"{0}\"."));

	static final com.google.javascript.jscomp.DiagnosticType JQUERY_USELESS_EACH_EXPANSION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_JQUERY_USELESS_EACH_EXPANSION", ("jQuery.expandedEach was not expanded as no valid property " + "assignments were encountered. Consider using jQuery.each instead."));

	private static final java.util.Set<java.lang.String> JQUERY_EXTEND_NAMES = com.google.common.collect.ImmutableSet.of("jQuery.extend", "jQuery.fn.extend", "jQuery.prototype.extend");

	private static final java.lang.String JQUERY_EXPANDED_EACH_NAME = "jQuery.expandedEach";

	private final com.google.javascript.jscomp.PeepholeOptimizationsPass peepholePasses;

	ExpandJqueryAliases(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.convention = compiler.getCodingConvention();
		final boolean late = false;
		this.peepholePasses = new com.google.javascript.jscomp.PeepholeOptimizationsPass(compiler, new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(late), new com.google.javascript.jscomp.PeepholeReplaceKnownMethods(late), new com.google.javascript.jscomp.PeepholeRemoveDeadCode(), new com.google.javascript.jscomp.PeepholeFoldConstants(late), new com.google.javascript.jscomp.PeepholeCollectPropertyAssignments());
	}

	public static boolean isJqueryExtendCall(com.google.javascript.rhino.Node n, java.lang.String qname, com.google.javascript.jscomp.AbstractCompiler compiler) {
		if (com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_EXTEND_NAMES.contains(qname)) {
			com.google.javascript.rhino.Node firstArgument = n.getNext();
			if (firstArgument == null) {
				return false;
			}
			com.google.javascript.rhino.Node secondArgument = firstArgument.getNext();
			if (((firstArgument.isObjectLit()) && (secondArgument == null)) || ((firstArgument.isName()) || (((((com.google.javascript.jscomp.NodeUtil.isGet(firstArgument)) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(firstArgument, compiler)))) && (secondArgument != null)) && (secondArgument.isObjectLit())) && ((secondArgument.getNext()) == null)))) {
				return true;
			}
		}
		return false;
	}

	public boolean isJqueryExpandedEachCall(com.google.javascript.rhino.Node call, java.lang.String qName) {
		com.google.common.base.Preconditions.checkArgument(call.isCall());
		if (((call.getFirstChild()) != null) && (com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_EXPANDED_EACH_NAME.equals(qName))) {
			return true;
		}
		return false;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.isGetProp()) && (convention.isPrototypeAlias(n))) {
			maybeReplaceJqueryPrototypeAlias(n);
		}else
			if (n.isCall()) {
				com.google.javascript.rhino.Node callTarget = n.getFirstChild();
				java.lang.String qName = callTarget.getQualifiedName();
				if (com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExtendCall(callTarget, qName, com.google.javascript.jscomp.ExpandJqueryAliases.this.compiler)) {
					maybeExpandJqueryExtendCall(n);
				}else
					if (isJqueryExpandedEachCall(n, qName)) {
						maybeExpandJqueryEachCall(t, n);
					}
				
			}
		
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ExpandJqueryAliases.logger.fine("Expanding Jquery Aliases");
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ExpandJqueryAliases.this);
	}

	private void maybeReplaceJqueryPrototypeAlias(com.google.javascript.rhino.Node n) {
		if (com.google.javascript.jscomp.NodeUtil.isLValue(n)) {
			com.google.javascript.rhino.Node maybeAssign = n.getParent();
			while ((!(com.google.javascript.jscomp.NodeUtil.isStatement(maybeAssign))) && (!(maybeAssign.isAssign()))) {
				maybeAssign = maybeAssign.getParent();
			} 
			if (maybeAssign.isAssign()) {
				maybeAssign = maybeAssign.getParent();
				if (((maybeAssign.isBlock()) || (maybeAssign.isScript())) || (com.google.javascript.jscomp.NodeUtil.isStatement(maybeAssign))) {
					return ;
				}
			}
		}
		com.google.javascript.rhino.Node fn = n.getLastChild();
		if (fn != null) {
			n.replaceChild(fn, com.google.javascript.rhino.IR.string("prototype"));
			compiler.reportCodeChange();
		}
	}

	private void maybeExpandJqueryExtendCall(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		com.google.javascript.rhino.Node objectToExtend = callTarget.getNext();
		com.google.javascript.rhino.Node extendArg = objectToExtend.getNext();
		boolean ensureObjectDefined = true;
		if (extendArg == null) {
			extendArg = objectToExtend;
			objectToExtend = callTarget.getFirstChild();
			ensureObjectDefined = false;
		}else
			if ((objectToExtend.isGetProp()) && ((objectToExtend.getLastChild().getString().equals("prototype")) || (convention.isPrototypeAlias(objectToExtend)))) {
				ensureObjectDefined = false;
			}
		
		if (!(extendArg.hasChildren())) {
			return ;
		}
		com.google.javascript.rhino.Node fncBlock = com.google.javascript.rhino.IR.block().srcref(n);
		if (ensureObjectDefined) {
			com.google.javascript.rhino.Node assignVal = com.google.javascript.rhino.IR.or(objectToExtend.cloneTree(), com.google.javascript.rhino.IR.objectlit().srcref(n)).srcref(n);
			com.google.javascript.rhino.Node assign = com.google.javascript.rhino.IR.assign(objectToExtend.cloneTree(), assignVal).srcref(n);
			fncBlock.addChildrenToFront(com.google.javascript.rhino.IR.exprResult(assign).srcref(n));
		}
		while (extendArg.hasChildren()) {
			com.google.javascript.rhino.Node currentProp = extendArg.removeFirstChild();
			currentProp.setType(com.google.javascript.rhino.Token.STRING);
			com.google.javascript.rhino.Node propValue = currentProp.removeFirstChild();
			com.google.javascript.rhino.Node newProp;
			if (currentProp.isQuotedString()) {
				newProp = com.google.javascript.rhino.IR.getelem(objectToExtend.cloneTree(), currentProp).srcref(currentProp);
			}else {
				newProp = com.google.javascript.rhino.IR.getprop(objectToExtend.cloneTree(), currentProp).srcref(currentProp);
			}
			com.google.javascript.rhino.Node assignNode = com.google.javascript.rhino.IR.assign(newProp, propValue).srcref(currentProp);
			fncBlock.addChildToBack(com.google.javascript.rhino.IR.exprResult(assignNode).srcref(currentProp));
		} 
		if (n.getParent().isExprResult()) {
			com.google.javascript.rhino.Node parent = n.getParent();
			parent.getParent().replaceChild(parent, fncBlock);
		}else {
			com.google.javascript.rhino.Node targetVal;
			if ("jQuery.prototype".equals(objectToExtend.getQualifiedName())) {
				targetVal = objectToExtend.removeFirstChild();
			}else {
				targetVal = objectToExtend.detachFromParent();
			}
			fncBlock.addChildToBack(com.google.javascript.rhino.IR.returnNode(targetVal).srcref(targetVal));
			com.google.javascript.rhino.Node fnc = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name("").srcref(n), com.google.javascript.rhino.IR.paramList().srcref(n), fncBlock);
			n.replaceChild(callTarget, fnc);
			n.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			while ((fnc.getNext()) != null) {
				n.removeChildAfter(fnc);
			} 
		}
		compiler.reportCodeChange();
	}

	private void maybeExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node objectToLoopOver = n.getChildAtIndex(1);
		if (objectToLoopOver == null) {
			return ;
		}
		com.google.javascript.rhino.Node callbackFunction = objectToLoopOver.getNext();
		if ((callbackFunction == null) || (!(callbackFunction.isFunction()))) {
			return ;
		}
		peepholePasses.process(null, n.getChildAtIndex(1));
		com.google.javascript.rhino.Node nClone = n.cloneTree();
		objectToLoopOver = nClone.getChildAtIndex(1);
		if ((!(objectToLoopOver.isObjectLit())) && (!((objectToLoopOver.isArrayLit()) && (isArrayLitValidForExpansion(objectToLoopOver))))) {
			t.report(n, com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR, ((java.lang.String) (null)));
			return ;
		}
		java.util.List<com.google.javascript.rhino.Node> keyNodeReferences = com.google.common.collect.Lists.newArrayList();
		java.util.List<com.google.javascript.rhino.Node> valueNodeReferences = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, com.google.javascript.jscomp.NodeUtil.getFunctionBody(callbackFunction), new com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences(callbackFunction, keyNodeReferences, valueNodeReferences, objectToLoopOver.isArrayLit()));
		if ((keyNodeReferences.size()) == 0) {
			t.report(n, com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_USELESS_EACH_EXPANSION, ((java.lang.String) (null)));
			return ;
		}
		com.google.javascript.rhino.Node fncBlock = tryExpandJqueryEachCall(t, nClone, callbackFunction, keyNodeReferences, valueNodeReferences);
		if ((fncBlock != null) && (fncBlock.hasChildren())) {
			replaceOriginalJqueryEachCall(n, fncBlock);
		}else {
			t.report(n, com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_USELESS_EACH_EXPANSION, ((java.lang.String) (null)));
		}
	}

	private com.google.javascript.rhino.Node tryExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node callbackFunction, java.util.List<com.google.javascript.rhino.Node> keyNodes, java.util.List<com.google.javascript.rhino.Node> valueNodes) {
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		com.google.javascript.rhino.Node objectToLoopOver = callTarget.getNext();
		com.google.javascript.rhino.Node fncBlock = com.google.javascript.rhino.IR.block().srcref(callTarget);
		boolean isValidExpansion = true;
		com.google.javascript.rhino.Node key = objectToLoopOver.getFirstChild();
		com.google.javascript.rhino.Node val = null;
		for (int i = 0; key != null; key = key.getNext() , i++) {
			if (key != null) {
				if (objectToLoopOver.isArrayLit()) {
					val = com.google.javascript.rhino.IR.number(i).srcref(key);
				}else {
					val = key.getFirstChild();
				}
			}
			java.util.List<com.google.javascript.rhino.Node> newKeys = com.google.common.collect.Lists.newArrayList();
			java.util.List<com.google.javascript.rhino.Node> newValues = com.google.common.collect.Lists.newArrayList();
			java.util.List<com.google.javascript.rhino.Node> origGetElems = com.google.common.collect.Lists.newArrayList();
			java.util.List<com.google.javascript.rhino.Node> newGetProps = com.google.common.collect.Lists.newArrayList();
			for (int j = 0; j < (keyNodes.size()); j++) {
				com.google.javascript.rhino.Node origNode = keyNodes.get(j);
				com.google.javascript.rhino.Node ancestor = origNode.getParent();
				com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.IR.string(key.getString()).srcref(key);
				newKeys.add(newNode);
				ancestor.replaceChild(origNode, newNode);
				while (((ancestor != null) && (!(com.google.javascript.jscomp.NodeUtil.isStatement(ancestor)))) && (!(ancestor.isGetElem()))) {
					ancestor = ancestor.getParent();
				} 
				if ((ancestor != null) && (ancestor.isGetElem())) {
					com.google.javascript.rhino.Node propObject = ancestor;
					while ((propObject.isGetProp()) || (propObject.isGetElem())) {
						propObject = propObject.getFirstChild();
					} 
					com.google.javascript.rhino.Node ancestorClone = ancestor.cloneTree();
					peepholePasses.process(null, ancestorClone.getChildAtIndex(1));
					com.google.javascript.rhino.Node prop = ancestorClone.getChildAtIndex(1);
					if ((prop.isString()) && (com.google.javascript.jscomp.NodeUtil.isValidPropertyName(prop.getString()))) {
						com.google.javascript.rhino.Node target = ancestorClone.getFirstChild();
						com.google.javascript.rhino.Node newGetProp = com.google.javascript.rhino.IR.getprop(target.detachFromParent(), prop.detachFromParent());
						newGetProps.add(newGetProp);
						origGetElems.add(ancestor);
						ancestor.getParent().replaceChild(ancestor, newGetProp);
					}else {
						if ((prop.isString()) && (!(com.google.javascript.jscomp.NodeUtil.isValidPropertyName(prop.getString())))) {
							t.report(n, com.google.javascript.jscomp.ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR, prop.getString());
						}
						isValidExpansion = false;
					}
				}
			}
			if (isValidExpansion) {
				for (int j = 0; (val != null) && (j < (valueNodes.size())); j++) {
					com.google.javascript.rhino.Node origNode = valueNodes.get(j);
					com.google.javascript.rhino.Node newNode = val.cloneTree();
					newValues.add(newNode);
					origNode.getParent().replaceChild(origNode, newNode);
				}
				com.google.javascript.rhino.Node fnc = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name("").srcref(key), com.google.javascript.rhino.IR.paramList().srcref(key), callbackFunction.getChildAtIndex(2).cloneTree()).srcref(key);
				com.google.javascript.rhino.Node call = com.google.javascript.rhino.IR.call(fnc).srcref(key);
				call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
				fncBlock.addChildToBack(com.google.javascript.rhino.IR.exprResult(call).srcref(call));
			}
			for (int j = 0; j < (newGetProps.size()); j++) {
				newGetProps.get(j).getParent().replaceChild(newGetProps.get(j), origGetElems.get(j));
			}
			for (int j = 0; j < (newKeys.size()); j++) {
				newKeys.get(j).getParent().replaceChild(newKeys.get(j), keyNodes.get(j));
			}
			for (int j = 0; j < (newValues.size()); j++) {
				newValues.get(j).getParent().replaceChild(newValues.get(j), valueNodes.get(j));
			}
			if (!isValidExpansion) {
				return null;
			}
		}
		return fncBlock;
	}

	private void replaceOriginalJqueryEachCall(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node expandedBlock) {
		if (n.getParent().isExprResult()) {
			com.google.javascript.rhino.Node parent = n.getParent();
			com.google.javascript.rhino.Node grandparent = parent.getParent();
			com.google.javascript.rhino.Node insertAfter = parent;
			while (expandedBlock.hasChildren()) {
				com.google.javascript.rhino.Node child = expandedBlock.getFirstChild().detachFromParent();
				grandparent.addChildAfter(child, insertAfter);
				insertAfter = child;
			} 
			grandparent.removeChild(parent);
		}else {
			com.google.javascript.rhino.Node callTarget = n.getFirstChild();
			com.google.javascript.rhino.Node objectToLoopOver = callTarget.getNext();
			objectToLoopOver.detachFromParent();
			com.google.javascript.rhino.Node ret = com.google.javascript.rhino.IR.returnNode(objectToLoopOver).srcref(callTarget);
			expandedBlock.addChildToBack(ret);
			com.google.javascript.rhino.Node fnc = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name("").srcref(callTarget), com.google.javascript.rhino.IR.paramList().srcref(callTarget), expandedBlock);
			n.replaceChild(callTarget, fnc);
			n.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			while ((fnc.getNext()) != null) {
				n.removeChildAfter(fnc);
			} 
		}
		compiler.reportCodeChange();
	}

	private boolean isArrayLitValidForExpansion(com.google.javascript.rhino.Node n) {
		java.util.Iterator<com.google.javascript.rhino.Node> iter = n.children().iterator();
		while (iter.hasNext()) {
			com.google.javascript.rhino.Node child = iter.next();
			if (!(child.isString())) {
				return false;
			}
		} 
		return true;
	}

	class FindCallbackArgumentReferences extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private final java.lang.String keyName;

		private final java.lang.String valueName;

		private com.google.javascript.jscomp.Scope startingScope;

		private java.util.List<com.google.javascript.rhino.Node> keyReferences;

		private java.util.List<com.google.javascript.rhino.Node> valueReferences;

		FindCallbackArgumentReferences(com.google.javascript.rhino.Node functionRoot, java.util.List<com.google.javascript.rhino.Node> keyReferences, java.util.List<com.google.javascript.rhino.Node> valueReferences, boolean useArrayMode) {
			com.google.common.base.Preconditions.checkState(functionRoot.isFunction());
			java.lang.String keyString = null;
			java.lang.String valueString = null;
			com.google.javascript.rhino.Node callbackParams = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(functionRoot);
			com.google.javascript.rhino.Node param = callbackParams.getFirstChild();
			if (param != null) {
				com.google.common.base.Preconditions.checkState(param.isName());
				keyString = param.getString();
				param = param.getNext();
				if (param != null) {
					com.google.common.base.Preconditions.checkState(param.isName());
					valueString = param.getString();
				}
			}
			this.keyName = keyString;
			this.valueName = valueString;
			if (useArrayMode) {
				com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.keyReferences = valueReferences;
				com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.valueReferences = keyReferences;
			}else {
				com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.keyReferences = keyReferences;
				com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.valueReferences = valueReferences;
			}
			com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.startingScope = null;
		}

		private boolean isShadowed(java.lang.String name, com.google.javascript.jscomp.Scope scope) {
			com.google.javascript.jscomp.Scope.Var nameVar = scope.getVar(name);
			return (nameVar != null) && ((nameVar.getScope()) != (com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.startingScope));
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			boolean isThis = false;
			if ((t.getScope()) == (com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.startingScope)) {
				isThis = n.isThis();
			}
			if (isThis || ((n.isName()) && (!(isShadowed(n.getString(), t.getScope()))))) {
				java.lang.String nodeValue = isThis ? null : n.getString();
				if (((!isThis) && ((keyName) != null)) && (nodeValue.equals(keyName))) {
					keyReferences.add(n);
				}else
					if (isThis || (((valueName) != null) && (nodeValue.equals(valueName)))) {
						valueReferences.add(n);
					}
				
			}
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if ((com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.startingScope) == null) {
				com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.this.startingScope = t.getScope();
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}
	}
}

