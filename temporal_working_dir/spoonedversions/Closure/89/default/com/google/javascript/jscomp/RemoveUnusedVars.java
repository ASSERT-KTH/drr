

package com.google.javascript.jscomp;


class RemoveUnusedVars implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean removeGlobals;

	private boolean preserveFunctionExpressionNames;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> referenced = com.google.common.collect.Sets.newHashSet();

	private final java.util.List<com.google.javascript.jscomp.Scope.Var> maybeUnreferenced = com.google.common.collect.Lists.newArrayList();

	private final java.util.List<com.google.javascript.jscomp.Scope> allFunctionScopes = com.google.common.collect.Lists.newArrayList();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.RemoveUnusedVars.Assign> assignsByVar = com.google.common.collect.ArrayListMultimap.create();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.RemoveUnusedVars.Assign> assignsByNode = com.google.common.collect.Maps.newHashMap();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.RemoveUnusedVars.Continuation> continuations = com.google.common.collect.ArrayListMultimap.create();

	RemoveUnusedVars(com.google.javascript.jscomp.AbstractCompiler compiler, boolean removeGlobals, boolean preserveFunctionExpressionNames) {
		this.compiler = compiler;
		this.removeGlobals = removeGlobals;
		com.google.javascript.jscomp.RemoveUnusedVars.this.preserveFunctionExpressionNames = preserveFunctionExpressionNames;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		traverseAndRemoveUnusedReferences(root);
	}

	private void traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.Scope scope = new com.google.javascript.jscomp.SyntacticScopeCreator(compiler).createScope(root, null);
		traverseNode(root, null, scope);
		if (removeGlobals) {
			collectMaybeUnreferencedVars(scope);
		}
		interpretAssigns();
		removeUnreferencedVars();
		for (com.google.javascript.jscomp.Scope fnScope : allFunctionScopes) {
			removeUnreferencedFunctionArgs(fnScope);
		}
	}

	private void traverseNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.Scope scope) {
		int type = n.getType();
		com.google.javascript.jscomp.Scope.Var var = null;
		switch (type) {
			case com.google.javascript.rhino.Token.FUNCTION :
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					var = scope.getVar(n.getFirstChild().getString());
				}
				if ((var != null) && (isRemovableVar(var))) {
					continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
				}else {
					traverseFunction(n, scope);
				}
				return ;
			case com.google.javascript.rhino.Token.ASSIGN :
				com.google.javascript.jscomp.RemoveUnusedVars.Assign maybeAssign = com.google.javascript.jscomp.RemoveUnusedVars.Assign.maybeCreateAssign(n);
				if (maybeAssign != null) {
					var = scope.getVar(maybeAssign.nameNode.getString());
					if (var != null) {
						assignsByVar.put(var, maybeAssign);
						assignsByNode.put(maybeAssign.nameNode, maybeAssign);
						if ((isRemovableVar(var)) && (!(maybeAssign.mayHaveSecondarySideEffects))) {
							continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
							return ;
						}
					}
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				var = scope.getVar(n.getString());
				if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
					com.google.javascript.rhino.Node value = n.getFirstChild();
					if ((((value != null) && (var != null)) && (isRemovableVar(var))) && (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(value)))) {
						continuations.put(var, new com.google.javascript.jscomp.RemoveUnusedVars.Continuation(n, scope));
						return ;
					}
				}else {
					if (var != null) {
						if (isRemovableVar(var)) {
							if (!(assignsByNode.containsKey(n))) {
								markReferencedVar(var);
							}
						}else {
							markReferencedVar(var);
						}
					}
				}
				break;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			traverseNode(c, n, scope);
		}
	}

	private boolean isRemovableVar(com.google.javascript.jscomp.Scope.Var var) {
		if ((!(removeGlobals)) && (var.isGlobal())) {
			return false;
		}
		if (referenced.contains(var)) {
			return false;
		}
		if (compiler.getCodingConvention().isExported(var.getName())) {
			return false;
		}
		return true;
	}

	private void traverseFunction(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parentScope) {
		com.google.common.base.Preconditions.checkState(((n.getChildCount()) == 3));
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		final com.google.javascript.rhino.Node body = n.getLastChild();
		com.google.common.base.Preconditions.checkState((((body.getNext()) == null) && ((body.getType()) == (com.google.javascript.rhino.Token.BLOCK))));
		com.google.javascript.jscomp.Scope fnScope = new com.google.javascript.jscomp.SyntacticScopeCreator(compiler).createScope(n, parentScope);
		traverseNode(body, n, fnScope);
		collectMaybeUnreferencedVars(fnScope);
		allFunctionScopes.add(fnScope);
	}

	private void collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope scope) {
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = scope.getVars(); it.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = it.next();
			if (isRemovableVar(var)) {
				maybeUnreferenced.add(var);
			}
		}
	}

	private void removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope fnScope) {
		com.google.javascript.rhino.Node function = fnScope.getRootNode();
		com.google.common.base.Preconditions.checkState(((function.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		com.google.javascript.rhino.Node argList = function.getFirstChild().getNext();
		com.google.javascript.rhino.Node lastArg;
		while ((lastArg = argList.getLastChild()) != null) {
			com.google.javascript.jscomp.Scope.Var var = fnScope.getVar(lastArg.getString());
			if (!(referenced.contains(var))) {
				if (var == null) {
					throw new java.lang.IllegalStateException(("Function parameter not declared in scope: " + (lastArg.getString())));
				}
				argList.removeChild(lastArg);
				compiler.reportCodeChange();
			}else {
				break;
			}
		} 
	}

	private void interpretAssigns() {
		boolean changes = false;
		do {
			changes = false;
			for (int current = 0; current < (maybeUnreferenced.size()); current++) {
				com.google.javascript.jscomp.Scope.Var var = maybeUnreferenced.get(current);
				if (referenced.contains(var)) {
					maybeUnreferenced.remove(current);
					current--;
				}else {
					boolean assignedToUnknownValue = false;
					boolean hasPropertyAssign = false;
					if (((var.getParentNode().getType()) == (com.google.javascript.rhino.Token.VAR)) && (!(com.google.javascript.jscomp.NodeUtil.isForIn(var.getParentNode().getParent())))) {
						com.google.javascript.rhino.Node value = var.getInitialValue();
						assignedToUnknownValue = (value != null) && (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(value, true)));
					}else {
						assignedToUnknownValue = true;
					}
					for (com.google.javascript.jscomp.RemoveUnusedVars.Assign assign : assignsByVar.get(var)) {
						if (assign.isPropertyAssign) {
							hasPropertyAssign = true;
						}else
							if (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(assign.assignNode.getLastChild(), true))) {
								assignedToUnknownValue = true;
							}
						
					}
					if (assignedToUnknownValue && hasPropertyAssign) {
						changes = (markReferencedVar(var)) || changes;
						maybeUnreferenced.remove(current);
						current--;
					}
				}
			}
		} while (changes );
	}

	private void removeAllAssigns(com.google.javascript.jscomp.Scope.Var var) {
		for (com.google.javascript.jscomp.RemoveUnusedVars.Assign assign : assignsByVar.get(var)) {
			assign.remove();
			compiler.reportCodeChange();
		}
	}

	private boolean markReferencedVar(com.google.javascript.jscomp.Scope.Var var) {
		if (referenced.add(var)) {
			for (com.google.javascript.jscomp.RemoveUnusedVars.Continuation c : continuations.get(var)) {
				c.apply();
			}
			return true;
		}
		return false;
	}

	private void removeUnreferencedVars() {
		com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = maybeUnreferenced.iterator(); it.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = it.next();
			removeAllAssigns(var);
			compiler.addToDebugLog(("Unreferenced var: " + (var.name)));
			com.google.javascript.rhino.Node nameNode = var.nameNode;
			com.google.javascript.rhino.Node toRemove = nameNode.getParent();
			com.google.javascript.rhino.Node parent = toRemove.getParent();
			com.google.common.base.Preconditions.checkState(((((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) || ((toRemove.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) || (((toRemove.getType()) == (com.google.javascript.rhino.Token.LP)) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)))), "We should only declare vars and functions and function args");
			if (((toRemove.getType()) == (com.google.javascript.rhino.Token.LP)) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(toRemove)) {
					if (!(preserveFunctionExpressionNames)) {
						toRemove.getFirstChild().setString("");
						compiler.reportCodeChange();
					}
				}else
					if (((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.FOR))) && ((parent.getChildCount()) < 4)) {
					}else
						if ((((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) && (nameNode.hasChildren())) && (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(nameNode.getFirstChild()))) {
							if ((toRemove.getChildCount()) == 1) {
								parent.replaceChild(toRemove, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, nameNode.removeFirstChild()));
								compiler.reportCodeChange();
							}
						}else
							if (((toRemove.getType()) == (com.google.javascript.rhino.Token.VAR)) && ((toRemove.getChildCount()) > 1)) {
								toRemove.removeChild(nameNode);
								compiler.reportCodeChange();
							}else
								if (parent != null) {
									com.google.javascript.jscomp.NodeUtil.removeChild(parent, toRemove);
									compiler.reportCodeChange();
								}
							
						
					
				
			
		}
	}

	private class Continuation {
		private final com.google.javascript.rhino.Node node;

		private final com.google.javascript.jscomp.Scope scope;

		Continuation(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.Scope scope) {
			this.node = node;
			this.scope = scope;
		}

		void apply() {
			if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node)) {
				traverseFunction(node, scope);
			}else {
				for (com.google.javascript.rhino.Node child = node.getFirstChild(); child != null; child = child.getNext()) {
					traverseNode(child, node, scope);
				}
			}
		}
	}

	private static class Assign {
		final com.google.javascript.rhino.Node assignNode;

		final com.google.javascript.rhino.Node nameNode;

		final boolean isPropertyAssign;

		final boolean mayHaveSecondarySideEffects;

		Assign(com.google.javascript.rhino.Node assignNode, com.google.javascript.rhino.Node nameNode, boolean isPropertyAssign) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isAssignmentOp(assignNode));
			this.assignNode = assignNode;
			this.nameNode = nameNode;
			this.isPropertyAssign = isPropertyAssign;
			this.mayHaveSecondarySideEffects = (((assignNode.getParent().getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT)) || (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(assignNode.getFirstChild()))) || (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(assignNode.getLastChild()));
		}

		static com.google.javascript.jscomp.RemoveUnusedVars.Assign maybeCreateAssign(com.google.javascript.rhino.Node assignNode) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isAssignmentOp(assignNode));
			boolean isPropAssign = false;
			com.google.javascript.rhino.Node current = assignNode.getFirstChild();
			if (com.google.javascript.jscomp.NodeUtil.isGet(current)) {
				current = current.getFirstChild();
				isPropAssign = true;
				if (((current.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (current.getLastChild().getString().equals("prototype"))) {
					current = current.getFirstChild();
				}
			}
			if ((current.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				return new com.google.javascript.jscomp.RemoveUnusedVars.Assign(assignNode, current, isPropAssign);
			}
			return null;
		}

		void remove() {
			com.google.javascript.rhino.Node parent = assignNode.getParent();
			if (mayHaveSecondarySideEffects) {
				com.google.javascript.rhino.Node replacement = assignNode.getLastChild().detachFromParent();
				for (com.google.javascript.rhino.Node current = assignNode.getFirstChild(); (current.getType()) != (com.google.javascript.rhino.Token.NAME); current = current.getFirstChild()) {
					if ((current.getType()) == (com.google.javascript.rhino.Token.GETELEM)) {
						replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, current.getLastChild().detachFromParent(), replacement);
						replacement.copyInformationFrom(current);
					}
				}
				parent.replaceChild(assignNode, replacement);
			}else {
				com.google.javascript.rhino.Node gramps = parent.getParent();
				if ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					gramps.removeChild(parent);
				}else {
					parent.replaceChild(assignNode, assignNode.getLastChild().detachFromParent());
				}
			}
		}
	}
}

