

package com.google.javascript.jscomp;


class InlineVariables implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	enum Mode {
CONSTANTS_ONLY, LOCALS_ONLY, ALL;	}

	private final com.google.javascript.jscomp.InlineVariables.Mode mode;

	private final boolean inlineAllStrings;

	private final com.google.javascript.jscomp.InlineVariables.IdentifyConstants identifyConstants = new com.google.javascript.jscomp.InlineVariables.IdentifyConstants();

	InlineVariables(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.InlineVariables.Mode mode, boolean inlineAllStrings) {
		this.compiler = compiler;
		this.mode = mode;
		this.inlineAllStrings = inlineAllStrings;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, new com.google.javascript.jscomp.InlineVariables.InliningBehavior(), getFilterForMode());
		callback.process(externs, root);
	}

	private com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> getFilterForMode() {
		switch (mode) {
			case ALL :
				return com.google.common.base.Predicates.<com.google.javascript.jscomp.Scope.Var>alwaysTrue();
			case LOCALS_ONLY :
				return new com.google.javascript.jscomp.InlineVariables.IdentifyLocals();
			case CONSTANTS_ONLY :
				return new com.google.javascript.jscomp.InlineVariables.IdentifyConstants();
			default :
				throw new java.lang.IllegalStateException();
		}
	}

	private class IdentifyConstants implements com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> {
		@java.lang.Override
		public boolean apply(com.google.javascript.jscomp.Scope.Var var) {
			return var.isConst();
		}
	}

	private class IdentifyLocals implements com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> {
		@java.lang.Override
		public boolean apply(com.google.javascript.jscomp.Scope.Var var) {
			return var.scope.isLocal();
		}
	}

	private static class AliasCandidate {
		private final com.google.javascript.jscomp.Scope.Var alias;

		private final com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection refInfo;

		AliasCandidate(com.google.javascript.jscomp.Scope.Var alias, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection refInfo) {
			this.alias = alias;
			this.refInfo = refInfo;
		}
	}

	private class InliningBehavior implements com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior {
		private final java.util.Set<com.google.javascript.jscomp.Scope.Var> staleVars = com.google.common.collect.Sets.newHashSet();

		final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineVariables.AliasCandidate> aliasCandidates = com.google.common.collect.Maps.newHashMap();

		@java.lang.Override
		public void afterExitScope(com.google.javascript.jscomp.NodeTraversal t, java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
			collectAliasCandidates(t, referenceMap);
			doInlinesForScope(t, referenceMap);
		}

		private void collectAliasCandidates(com.google.javascript.jscomp.NodeTraversal t, java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
			if ((mode) != (com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY)) {
				for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars(); it.hasNext();) {
					com.google.javascript.jscomp.Scope.Var v = it.next();
					com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo = referenceMap.get(v);
					if ((((referenceInfo != null) && ((referenceInfo.references.size()) >= 2)) && (referenceInfo.isWellDefined())) && (referenceInfo.isAssignedOnceInLifetime())) {
						com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = referenceInfo.getInitializingReference();
						com.google.javascript.rhino.Node value = init.getAssignedValue();
						if ((value != null) && ((value.getType()) == (com.google.javascript.rhino.Token.NAME))) {
							aliasCandidates.put(value, new com.google.javascript.jscomp.InlineVariables.AliasCandidate(v, referenceInfo));
						}
					}
				}
			}
		}

		private void doInlinesForScope(com.google.javascript.jscomp.NodeTraversal t, java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
			boolean maybeModifiedArguments = maybeEscapedOrModifiedArguments(t.getScope(), referenceMap);
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars(); it.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v = it.next();
				com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo = referenceMap.get(v);
				if ((referenceInfo == null) || (isVarInlineForbidden(v))) {
					continue;
				}else
					if (isInlineableDeclaredConstant(v, referenceInfo)) {
						com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = referenceInfo.getInitializingReferenceForConstants();
						com.google.javascript.rhino.Node value = init.getAssignedValue();
						inlineDeclaredConstant(v, value, referenceInfo.references);
						staleVars.add(v);
					}else
						if ((mode) == (com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY)) {
							continue;
						}else {
							inlineNonConstants(v, referenceInfo, maybeModifiedArguments);
						}
					
				
			}
		}

		private boolean maybeEscapedOrModifiedArguments(com.google.javascript.jscomp.Scope scope, java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
			if (scope.isLocal()) {
				com.google.javascript.jscomp.Scope.Var arguments = scope.getArgumentsVar();
				com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection refs = referenceMap.get(arguments);
				if ((refs != null) && (!(refs.references.isEmpty()))) {
					for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : refs.references) {
						com.google.javascript.rhino.Node refNode = ref.getNameNode();
						com.google.javascript.rhino.Node refParent = ref.getParent();
						if (!(((com.google.javascript.jscomp.NodeUtil.isGet(refParent)) && (refNode == (ref.getParent().getFirstChild()))) && (!(isLValue(refParent))))) {
							return true;
						}
					}
				}
			}
			return false;
		}

		private boolean isLValue(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			return (((parent.getType()) == (com.google.javascript.rhino.Token.INC)) || ((parent.getType()) == (com.google.javascript.rhino.Token.DEC))) || ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == n));
		}

		private void inlineNonConstants(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo, boolean maybeModifiedArguments) {
			int refCount = referenceInfo.references.size();
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration = referenceInfo.references.get(0);
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = referenceInfo.getInitializingReference();
			int firstRefAfterInit = declaration == init ? 2 : 3;
			if ((refCount > 1) && (isImmutableAndWellDefinedVariable(v, referenceInfo))) {
				com.google.javascript.rhino.Node value;
				if (init != null) {
					value = init.getAssignedValue();
				}else {
					com.google.javascript.rhino.Node srcLocation = declaration.getNameNode();
					value = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation);
				}
				com.google.common.base.Preconditions.checkNotNull(value);
				inlineWellDefinedVariable(v, value, referenceInfo.references);
				staleVars.add(v);
			}else
				if (refCount == firstRefAfterInit) {
					com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference = referenceInfo.references.get((firstRefAfterInit - 1));
					if (canInline(declaration, init, reference)) {
						inline(v, declaration, init, reference);
						staleVars.add(v);
					}
				}else
					if ((declaration != init) && (refCount == 2)) {
						if ((isValidDeclaration(declaration)) && (isValidInitialization(init))) {
							com.google.javascript.rhino.Node value = init.getAssignedValue();
							com.google.common.base.Preconditions.checkNotNull(value);
							inlineWellDefinedVariable(v, value, referenceInfo.references);
							staleVars.add(v);
						}
					}
				
			
			if ((((!maybeModifiedArguments) && (!(staleVars.contains(v)))) && (referenceInfo.isWellDefined())) && (referenceInfo.isAssignedOnceInLifetime())) {
				java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refs = referenceInfo.references;
				for (int i = 1; i < (refs.size()); i++) {
					com.google.javascript.rhino.Node nameNode = refs.get(i).getNameNode();
					if (aliasCandidates.containsKey(nameNode)) {
						com.google.javascript.jscomp.InlineVariables.AliasCandidate candidate = aliasCandidates.get(nameNode);
						if ((!(staleVars.contains(candidate.alias))) && (!(isVarInlineForbidden(candidate.alias)))) {
							com.google.javascript.jscomp.ReferenceCollectingCallback.Reference aliasInit;
							aliasInit = candidate.refInfo.getInitializingReference();
							com.google.javascript.rhino.Node value = aliasInit.getAssignedValue();
							com.google.common.base.Preconditions.checkNotNull(value);
							inlineWellDefinedVariable(candidate.alias, value, candidate.refInfo.references);
							staleVars.add(candidate.alias);
						}
					}
				}
			}
		}

		private void blacklistVarReferencesInTree(com.google.javascript.rhino.Node root, com.google.javascript.jscomp.Scope scope) {
			for (com.google.javascript.rhino.Node c = root.getFirstChild(); c != null; c = c.getNext()) {
				blacklistVarReferencesInTree(c, scope);
			}
			if ((root.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				staleVars.add(scope.getVar(root.getString()));
			}
		}

		private boolean isVarInlineForbidden(com.google.javascript.jscomp.Scope.Var var) {
			return ((compiler.getCodingConvention().isExported(var.name)) || (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(var.name))) || (staleVars.contains(var));
		}

		private void inline(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference) {
			com.google.javascript.rhino.Node value = init.getAssignedValue();
			com.google.common.base.Preconditions.checkState((value != null));
			boolean isFunctionDeclaration = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(value);
			inlineValue(v, reference, value.detachFromParent());
			if (declaration != init) {
				com.google.javascript.rhino.Node expressRoot = init.getGrandparent();
				com.google.common.base.Preconditions.checkState(((expressRoot.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)));
				com.google.javascript.jscomp.NodeUtil.removeChild(expressRoot.getParent(), expressRoot);
			}
			if (!isFunctionDeclaration) {
				removeDeclaration(declaration);
			}else {
				compiler.reportCodeChange();
			}
		}

		private void inlineWellDefinedVariable(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.rhino.Node value, java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refSet) {
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference decl = refSet.get(0);
			for (int i = 1; i < (refSet.size()); i++) {
				inlineValue(v, refSet.get(i), value.cloneTree());
			}
			removeDeclaration(decl);
		}

		private void inlineDeclaredConstant(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.rhino.Node value, java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refSet) {
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference decl = null;
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference r : refSet) {
				if ((r.getNameNode()) == (v.getNameNode())) {
					decl = r;
				}else {
					inlineValue(v, r, value.cloneTree());
				}
			}
			removeDeclaration(decl);
		}

		private void removeDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration) {
			com.google.javascript.rhino.Node varNode = declaration.getParent();
			varNode.removeChild(declaration.getNameNode());
			if (!(varNode.hasChildren())) {
				com.google.common.base.Preconditions.checkState(((varNode.getType()) == (com.google.javascript.rhino.Token.VAR)));
				com.google.javascript.rhino.Node grandparent = declaration.getGrandparent();
				com.google.javascript.jscomp.NodeUtil.removeChild(grandparent, varNode);
			}
			compiler.reportCodeChange();
		}

		private void inlineValue(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref, com.google.javascript.rhino.Node value) {
			if (ref.isSimpleAssignmentToName()) {
				ref.getGrandparent().replaceChild(ref.getParent(), value);
			}else {
				ref.getParent().replaceChild(ref.getNameNode(), value);
			}
			blacklistVarReferencesInTree(value, v.scope);
			compiler.reportCodeChange();
		}

		private boolean isInlineableDeclaredConstant(com.google.javascript.jscomp.Scope.Var var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection refInfo) {
			if (!(identifyConstants.apply(var))) {
				return false;
			}
			if (!(refInfo.isAssignedOnceInLifetime())) {
				return false;
			}
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = refInfo.getInitializingReferenceForConstants();
			if (init == null) {
				return false;
			}
			com.google.javascript.rhino.Node value = init.getAssignedValue();
			if (value == null) {
				return false;
			}
			if (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(value))) {
				return false;
			}
			return ((value.getType()) != (com.google.javascript.rhino.Token.STRING)) || (isStringWorthInlining(var, refInfo.references));
		}

		private boolean isStringWorthInlining(com.google.javascript.jscomp.Scope.Var var, java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refs) {
			if ((!(inlineAllStrings)) && (!(var.isDefine()))) {
				int len = (var.getInitialValue().getString().length()) + ("''".length());
				int noInlineBytes = (("var xx=;".length()) + len) + (4 * ((refs.size()) - 1));
				int inlineBytes = (len - 1) * ((refs.size()) - 1);
				return noInlineBytes >= inlineBytes;
			}
			return true;
		}

		private boolean canInline(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference initialization, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference) {
			if (((!(isValidDeclaration(declaration))) || (!(isValidInitialization(initialization)))) || (!(isValidReference(reference)))) {
				return false;
			}
			if ((declaration != initialization) && ((initialization.getGrandparent().getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT))) {
				return false;
			}
			if (((declaration.getBasicBlock()) != (initialization.getBasicBlock())) || ((declaration.getBasicBlock()) != (reference.getBasicBlock()))) {
				return false;
			}
			com.google.javascript.rhino.Node value = initialization.getAssignedValue();
			com.google.common.base.Preconditions.checkState((value != null));
			if ((((value.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && ((reference.getParent().getType()) == (com.google.javascript.rhino.Token.CALL))) && ((reference.getParent().getFirstChild()) == (reference.getNameNode()))) {
				return false;
			}
			if ((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				com.google.javascript.rhino.Node callNode = reference.getParent();
				if ((reference.getParent().getType()) == (com.google.javascript.rhino.Token.CALL)) {
					com.google.javascript.jscomp.CodingConvention.SubclassRelationship relationship = compiler.getCodingConvention().getClassesDefinedByCall(callNode);
					if (relationship != null) {
						return false;
					}
				}
			}
			return (canMoveAggressively(value)) || (canMoveModerately(initialization, reference));
		}

		private boolean canMoveAggressively(com.google.javascript.rhino.Node value) {
			return (com.google.javascript.jscomp.NodeUtil.isLiteralValue(value, true)) || ((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION));
		}

		private boolean canMoveModerately(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference initialization, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference) {
			java.util.Iterator<com.google.javascript.rhino.Node> it;
			if ((initialization.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) {
				it = com.google.javascript.jscomp.NodeIterators.LocalVarMotion.forVar(initialization.getNameNode(), initialization.getParent(), initialization.getGrandparent());
			}else
				if ((initialization.getParent().getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
					com.google.common.base.Preconditions.checkState(((initialization.getGrandparent().getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)));
					it = com.google.javascript.jscomp.NodeIterators.LocalVarMotion.forAssign(initialization.getNameNode(), initialization.getParent(), initialization.getGrandparent(), initialization.getGrandparent().getParent());
				}else {
					throw new java.lang.IllegalStateException(("Unexpected initialization parent " + (initialization.getParent().toStringTree())));
				}
			
			com.google.javascript.rhino.Node targetName = reference.getNameNode();
			while (it.hasNext()) {
				com.google.javascript.rhino.Node curNode = it.next();
				if (curNode == targetName) {
					return true;
				}
			} 
			return false;
		}

		private boolean isValidDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration) {
			return (((declaration.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) && ((declaration.getGrandparent().getType()) != (com.google.javascript.rhino.Token.FOR))) || (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(declaration.getParent()));
		}

		private boolean isValidInitialization(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference initialization) {
			if (initialization == null) {
				return false;
			}else
				if (initialization.isDeclaration()) {
					return (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(initialization.getParent())) || ((initialization.getNameNode().getFirstChild()) != null);
				}else {
					com.google.javascript.rhino.Node parent = initialization.getParent();
					com.google.common.base.Preconditions.checkState((((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == (initialization.getNameNode()))));
					return true;
				}
			
		}

		private boolean isValidReference(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference) {
			return (!(reference.isDeclaration())) && (!(reference.isLvalue()));
		}

		private boolean isImmutableAndWellDefinedVariable(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection refInfo) {
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refSet = refInfo.references;
			int startingReadRef = 1;
			com.google.javascript.jscomp.ReferenceCollectingCallback.Reference refDecl = refSet.get(0);
			if (!(isValidDeclaration(refDecl))) {
				return false;
			}
			boolean isNeverAssigned = refInfo.isNeverAssigned();
			if (!isNeverAssigned) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.Reference refInit = refInfo.getInitializingReference();
				if (!(isValidInitialization(refInit))) {
					return false;
				}
				if (refDecl != refInit) {
					com.google.common.base.Preconditions.checkState((refInit == (refSet.get(1))));
					startingReadRef = 2;
				}
				if (!(refInfo.isWellDefined())) {
					return false;
				}
				com.google.javascript.rhino.Node value = refInit.getAssignedValue();
				com.google.common.base.Preconditions.checkNotNull(value);
				boolean isImmutableValueWorthInlining = (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value)) && (((value.getType()) != (com.google.javascript.rhino.Token.STRING)) || (isStringWorthInlining(v, refInfo.references)));
				boolean isInlinableThisAlias = ((value.getType()) == (com.google.javascript.rhino.Token.THIS)) && (!(refInfo.isEscaped()));
				if ((!isImmutableValueWorthInlining) && (!isInlinableThisAlias)) {
					return false;
				}
			}
			for (int i = startingReadRef; i < (refSet.size()); i++) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref = refSet.get(i);
				if (!(isValidReference(ref))) {
					return false;
				}
			}
			return true;
		}
	}
}

