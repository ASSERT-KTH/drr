

package com.google.javascript.jscomp;


class InlineObjectLiterals implements com.google.javascript.jscomp.CompilerPass {
	public static final java.lang.String VAR_PREFIX = "JSCompiler_object_inline_";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier;

	InlineObjectLiterals(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier) {
		this.compiler = compiler;
		this.safeNameIdSupplier = safeNameIdSupplier;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, new com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior());
		callback.process(externs, root);
	}

	private class InliningBehavior implements com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior {
		private final java.util.Set<com.google.javascript.jscomp.Scope.Var> staleVars = com.google.common.collect.Sets.newHashSet();

		@java.lang.Override
		public void afterExitScope(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap) {
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars(); it.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v = it.next();
				if (isVarInlineForbidden(v)) {
					continue;
				}
				com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo = referenceMap.getReferences(v);
				if (isInlinableObject(referenceInfo.references)) {
					staleVars.add(v);
					com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration = referenceInfo.references.get(0);
					com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init = referenceInfo.getInitializingReference();
					splitObject(v, declaration, init, referenceInfo);
				}
			}
		}

		private void blacklistVarReferencesInTree(com.google.javascript.rhino.Node root, final com.google.javascript.jscomp.Scope scope) {
			com.google.javascript.jscomp.NodeUtil.visitPreOrder(root, new com.google.javascript.jscomp.NodeUtil.Visitor() {
				@java.lang.Override
				public void visit(com.google.javascript.rhino.Node node) {
					if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						staleVars.add(scope.getVar(node.getString()));
					}
				}
			}, com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION);
		}

		private boolean isVarInlineForbidden(com.google.javascript.jscomp.Scope.Var var) {
			return ((((var.isGlobal()) || (var.isExtern())) || (compiler.getCodingConvention().isExported(var.name))) || (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(var.name))) || (staleVars.contains(var));
		}

		private boolean isInlinableObject(java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refs) {
			boolean ret = false;
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : refs) {
				com.google.javascript.rhino.Node name = ref.getNode();
				com.google.javascript.rhino.Node parent = ref.getParent();
				com.google.javascript.rhino.Node gramps = ref.getGrandparent();
				if ((parent.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
					com.google.common.base.Preconditions.checkState(((parent.getFirstChild()) == name));
					if (((gramps.getType()) == (com.google.javascript.rhino.Token.CALL)) && ((gramps.getFirstChild()) == parent)) {
						return false;
					}
					continue;
				}
				if (!(isVarOrAssignExprLhs(name))) {
					return false;
				}
				com.google.javascript.rhino.Node val = ref.getAssignedValue();
				if (val == null) {
					continue;
				}
				if ((val.getType()) != (com.google.javascript.rhino.Token.OBJECTLIT)) {
					return false;
				}
				for (com.google.javascript.rhino.Node child = val.getFirstChild(); child != null; child = child.getNext()) {
					if (((child.getType()) == (com.google.javascript.rhino.Token.GET)) || ((child.getType()) == (com.google.javascript.rhino.Token.SET))) {
						return false;
					}
					com.google.javascript.rhino.Node childVal = child.getFirstChild();
					for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference t : refs) {
						com.google.javascript.rhino.Node refNode = t.getParent();
						while (!(com.google.javascript.jscomp.NodeUtil.isStatementBlock(refNode))) {
							if (refNode == childVal) {
								return false;
							}
							refNode = refNode.getParent();
						} 
					}
				}
				ret = true;
			}
			return ret;
		}

		private boolean isVarOrAssignExprLhs(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			return ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) && ((parent.getParent().getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)));
		}

		private java.util.Map<java.lang.String, java.lang.String> computeVarList(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo) {
			java.util.Map<java.lang.String, java.lang.String> varmap = com.google.common.collect.Maps.newLinkedHashMap();
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : referenceInfo.references) {
				if ((ref.isLvalue()) || (ref.isInitializingDeclaration())) {
					com.google.javascript.rhino.Node val = ref.getAssignedValue();
					if (val != null) {
						com.google.common.base.Preconditions.checkState(((val.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)));
						for (com.google.javascript.rhino.Node child = val.getFirstChild(); child != null; child = child.getNext()) {
							java.lang.String varname = child.getString();
							if (varmap.containsKey(varname)) {
								continue;
							}
							java.lang.String var = (((com.google.javascript.jscomp.InlineObjectLiterals.VAR_PREFIX) + varname) + "_") + (safeNameIdSupplier.get());
							varmap.put(varname, var);
						}
					}
				}else
					if ((ref.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) {
					}else {
						com.google.javascript.rhino.Node getprop = ref.getParent();
						com.google.common.base.Preconditions.checkState(((getprop.getType()) == (com.google.javascript.rhino.Token.GETPROP)));
						java.lang.String varname = getprop.getLastChild().getString();
						if (varmap.containsKey(varname)) {
							continue;
						}
						java.lang.String var = (((com.google.javascript.jscomp.InlineObjectLiterals.VAR_PREFIX) + varname) + "_") + (safeNameIdSupplier.get());
						varmap.put(varname, var);
					}
				
			}
			return varmap;
		}

		private void fillInitialValues(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> initvals) {
			com.google.javascript.rhino.Node object = init.getAssignedValue();
			com.google.common.base.Preconditions.checkState(((object.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)));
			for (com.google.javascript.rhino.Node key = object.getFirstChild(); key != null; key = key.getNext()) {
				initvals.put(key.getString(), key.removeFirstChild());
			}
		}

		private void replaceAssignmentExpression(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref, java.util.Map<java.lang.String, java.lang.String> varmap) {
			java.util.List<com.google.javascript.rhino.Node> nodes = com.google.common.collect.Lists.newArrayList();
			com.google.javascript.rhino.Node val = ref.getAssignedValue();
			blacklistVarReferencesInTree(val, v.scope);
			com.google.common.base.Preconditions.checkState(((val.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)));
			java.util.Set<java.lang.String> all = com.google.common.collect.Sets.newLinkedHashSet(varmap.keySet());
			for (com.google.javascript.rhino.Node key = val.getFirstChild(); key != null; key = key.getNext()) {
				java.lang.String var = key.getString();
				com.google.javascript.rhino.Node value = key.removeFirstChild();
				nodes.add(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, varmap.get(var)), value));
				all.remove(var);
			}
			for (java.lang.String var : all) {
				nodes.add(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, varmap.get(var)), com.google.javascript.jscomp.NodeUtil.newUndefinedNode(null)));
			}
			nodes.add(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRUE));
			nodes = com.google.common.collect.Lists.reverse(nodes);
			com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA);
			com.google.javascript.rhino.Node cur = replacement;
			int i;
			for (i = 0; i < ((nodes.size()) - 2); i++) {
				cur.addChildToFront(nodes.get(i));
				com.google.javascript.rhino.Node t = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA);
				cur.addChildToFront(t);
				cur = t;
			}
			cur.addChildToFront(nodes.get(i));
			cur.addChildToFront(nodes.get((i + 1)));
			com.google.javascript.rhino.Node replace = ref.getParent();
			replacement.copyInformationFromForTree(replace);
			if ((replace.getType()) == (com.google.javascript.rhino.Token.VAR)) {
				replace.getParent().replaceChild(replace, com.google.javascript.jscomp.NodeUtil.newExpr(replacement));
			}else {
				replace.getParent().replaceChild(replace, replacement);
			}
		}

		private void splitObject(com.google.javascript.jscomp.Scope.Var v, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference declaration, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference init, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceInfo) {
			java.util.Map<java.lang.String, java.lang.String> varmap = computeVarList(v, referenceInfo);
			java.util.Map<java.lang.String, com.google.javascript.rhino.Node> initvals = com.google.common.collect.Maps.newHashMap();
			com.google.javascript.rhino.Node vnode;
			boolean defined = (referenceInfo.isWellDefined()) && ((init.getParent().getType()) == (com.google.javascript.rhino.Token.VAR));
			if (defined) {
				vnode = init.getParent();
				fillInitialValues(init, initvals);
			}else {
				vnode = v.getScope().getRootNode().getLastChild().getFirstChild();
			}
			for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : varmap.entrySet()) {
				com.google.javascript.rhino.Node val = initvals.get(entry.getKey());
				com.google.javascript.rhino.Node varnode = com.google.javascript.jscomp.NodeUtil.newVarNode(entry.getValue(), val);
				if (val == null) {
					varnode.copyInformationFromForTree(vnode);
				}else {
					blacklistVarReferencesInTree(val, v.scope);
				}
				vnode.getParent().addChildBefore(varnode, vnode);
			}
			if (defined) {
				vnode.getParent().removeChild(vnode);
			}
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : referenceInfo.references) {
				if (defined && (ref == init))
					continue;
				
				if (ref.isLvalue()) {
					replaceAssignmentExpression(v, ref, varmap);
				}else
					if ((ref.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) {
						ref.getGrandparent().removeChild(ref.getParent());
					}else {
						com.google.javascript.rhino.Node getprop = ref.getParent();
						com.google.common.base.Preconditions.checkState(((getprop.getType()) == (com.google.javascript.rhino.Token.GETPROP)));
						java.lang.String var = getprop.getChildAtIndex(1).getString();
						com.google.common.base.Preconditions.checkState(varmap.containsKey(var));
						com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, varmap.get(var));
						replacement.copyInformationFrom(getprop);
						ref.getGrandparent().replaceChild(ref.getParent(), replacement);
					}
				
			}
			compiler.reportCodeChange();
		}
	}
}

