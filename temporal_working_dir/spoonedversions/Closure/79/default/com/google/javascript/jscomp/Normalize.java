

package com.google.javascript.jscomp;


class Normalize implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean assertOnChange;

	private static final boolean CONVERT_WHILE_TO_FOR = true;

	static final boolean MAKE_LOCAL_NAMES_UNIQUE = true;

	public static final com.google.javascript.jscomp.DiagnosticType CATCH_BLOCK_VAR_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_CATCH_BLOCK_VAR_ERROR", ("The use of scope variable {0} is not allowed within a catch block " + "with a catch exception of the same name."));

	Normalize(com.google.javascript.jscomp.AbstractCompiler compiler, boolean assertOnChange) {
		this.compiler = compiler;
		this.assertOnChange = assertOnChange;
	}

	static com.google.javascript.rhino.Node parseAndNormalizeSyntheticCode(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String code, java.lang.String prefix) {
		com.google.javascript.rhino.Node js = compiler.parseSyntheticCode(code);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, new com.google.javascript.jscomp.Normalize.NormalizeStatements(compiler, false));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, new com.google.javascript.jscomp.MakeDeclaredNamesUnique(new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(compiler.getUniqueNameIdSupplier(), prefix)));
		return js;
	}

	static com.google.javascript.rhino.Node parseAndNormalizeTestCode(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String code, java.lang.String prefix) {
		com.google.javascript.rhino.Node js = compiler.parseTestCode(code);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, new com.google.javascript.jscomp.Normalize.NormalizeStatements(compiler, false));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, new com.google.javascript.jscomp.MakeDeclaredNamesUnique());
		return js;
	}

	private void reportCodeChange(java.lang.String changeDescription) {
		if (assertOnChange) {
			throw new java.lang.IllegalStateException(("Normalize constraints violated:\n" + changeDescription));
		}
		compiler.reportCodeChange();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.Normalize.NormalizeStatements(compiler, assertOnChange)).traverse(root);
		if (com.google.javascript.jscomp.Normalize.MAKE_LOCAL_NAMES_UNIQUE) {
			com.google.javascript.jscomp.MakeDeclaredNamesUnique renamer = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
			com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, renamer);
			t.traverseRoots(externs, root);
		}
		removeDuplicateDeclarations(externs, root);
		new com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars(compiler, assertOnChange).process(externs, root);
		if (!(compiler.getLifeCycleStage().isNormalized())) {
			compiler.setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED);
		}
	}

	static class PropagateConstantAnnotationsOverVars extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final boolean assertOnChange;

		PropagateConstantAnnotationsOverVars(com.google.javascript.jscomp.AbstractCompiler compiler, boolean forbidChanges) {
			this.compiler = compiler;
			this.assertOnChange = forbidChanges;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.this).traverseRoots(externs, root);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				if (n.getString().isEmpty()) {
					return ;
				}
				com.google.javascript.rhino.JSDocInfo info = null;
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
				if (var != null) {
					info = var.getJSDocInfo();
				}
				boolean shouldBeConstant = ((info != null) && (info.isConstant())) || (com.google.javascript.jscomp.NodeUtil.isConstantByConvention(compiler.getCodingConvention(), n, parent));
				boolean isMarkedConstant = n.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
				if (shouldBeConstant && (!isMarkedConstant)) {
					if (assertOnChange) {
						java.lang.String name = n.getString();
						throw new java.lang.IllegalStateException(((((("Unexpected const change.\n" + "  name: ") + name) + "\n") + "  parent:") + (n.getParent().toStringTree())));
					}
					n.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
				}
			}
		}
	}

	static class VerifyConstants extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final boolean checkUserDeclarations;

		VerifyConstants(com.google.javascript.jscomp.AbstractCompiler compiler, boolean checkUserDeclarations) {
			this.compiler = compiler;
			this.checkUserDeclarations = checkUserDeclarations;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.rhino.Node externsAndJs = root.getParent();
			com.google.common.base.Preconditions.checkState((externsAndJs != null));
			com.google.common.base.Preconditions.checkState(externsAndJs.hasChild(externs));
			com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), com.google.javascript.jscomp.Normalize.VerifyConstants.this);
		}

		private java.util.Map<java.lang.String, java.lang.Boolean> constantMap = com.google.common.collect.Maps.newHashMap();

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				java.lang.String name = n.getString();
				if (n.getString().isEmpty()) {
					return ;
				}
				boolean isConst = n.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
				if (checkUserDeclarations) {
					boolean expectedConst = false;
					com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
					if ((com.google.javascript.jscomp.NodeUtil.isConstantName(n)) || (com.google.javascript.jscomp.NodeUtil.isConstantByConvention(convention, n, parent))) {
						expectedConst = true;
					}else {
						expectedConst = false;
						com.google.javascript.rhino.JSDocInfo info = null;
						com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
						if (var != null) {
							info = var.getJSDocInfo();
						}
						if ((info != null) && (info.isConstant())) {
							expectedConst = true;
						}else {
							expectedConst = false;
						}
					}
					if (expectedConst) {
						com.google.common.base.Preconditions.checkState((expectedConst == isConst), (("The name " + name) + " is not annotated as constant."));
					}else {
						com.google.common.base.Preconditions.checkState((expectedConst == isConst), (("The name " + name) + " should not be annotated as constant."));
					}
				}
				java.lang.Boolean value = constantMap.get(name);
				if (value == null) {
					constantMap.put(name, isConst);
				}else {
					com.google.common.base.Preconditions.checkState(((value.booleanValue()) == isConst), ((("The name " + name) + " is not consistently annotated as ") + "constant."));
				}
			}
		}
	}

	static class NormalizeStatements implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final boolean assertOnChange;

		NormalizeStatements(com.google.javascript.jscomp.AbstractCompiler compiler, boolean assertOnChange) {
			this.compiler = compiler;
			this.assertOnChange = assertOnChange;
		}

		private void reportCodeChange(java.lang.String changeDescription) {
			if (assertOnChange) {
				throw new java.lang.IllegalStateException(("Normalize constraints violated:\n" + changeDescription));
			}
			compiler.reportCodeChange();
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			doStatementNormalizations(t, n, parent);
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.WHILE :
					if (com.google.javascript.jscomp.Normalize.CONVERT_WHILE_TO_FOR) {
						com.google.javascript.rhino.Node expr = n.getFirstChild();
						n.setType(com.google.javascript.rhino.Token.FOR);
						com.google.javascript.rhino.Node empty = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY);
						empty.copyInformationFrom(n);
						n.addChildBefore(empty, expr);
						n.addChildAfter(empty.cloneNode(), expr);
						reportCodeChange("WHILE node");
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					normalizeFunctionDeclaration(n);
					break;
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.STRING :
				case com.google.javascript.rhino.Token.GET :
				case com.google.javascript.rhino.Token.SET :
					if (!(compiler.getLifeCycleStage().isNormalizedObfuscated())) {
						annotateConstantsByConvention(n, parent);
					}
					break;
			}
		}

		private void annotateConstantsByConvention(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.common.base.Preconditions.checkState((((((n.getType()) == (com.google.javascript.rhino.Token.NAME)) || ((n.getType()) == (com.google.javascript.rhino.Token.STRING))) || ((n.getType()) == (com.google.javascript.rhino.Token.GET))) || ((n.getType()) == (com.google.javascript.rhino.Token.SET))));
			boolean isObjLitKey = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent);
			boolean isProperty = isObjLitKey || (((parent.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && ((parent.getLastChild()) == n));
			if (((n.getType()) == (com.google.javascript.rhino.Token.NAME)) || isProperty) {
				boolean isMarkedConstant = n.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
				if ((!isMarkedConstant) && (com.google.javascript.jscomp.NodeUtil.isConstantByConvention(compiler.getCodingConvention(), n, parent))) {
					if (assertOnChange) {
						java.lang.String name = n.getString();
						throw new java.lang.IllegalStateException(((((("Unexpected const change.\n" + "  name: ") + name) + "\n") + "  parent:") + (n.getParent().toStringTree())));
					}
					n.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
				}
			}
		}

		private void normalizeFunctionDeclaration(com.google.javascript.rhino.Node n) {
			com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			if ((!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n))) && (!(com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(n)))) {
				rewriteFunctionDeclaration(n);
			}
		}

		private void rewriteFunctionDeclaration(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node oldNameNode = n.getFirstChild();
			com.google.javascript.rhino.Node fnNameNode = oldNameNode.cloneNode();
			com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, fnNameNode, n.getLineno(), n.getCharno());
			var.copyInformationFrom(n);
			oldNameNode.setString("");
			com.google.javascript.rhino.Node parent = n.getParent();
			parent.replaceChild(n, var);
			fnNameNode.addChildToFront(n);
			reportCodeChange("Function declaration");
		}

		private void doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.LABEL)) {
				normalizeLabels(n);
			}
			if ((com.google.javascript.jscomp.NodeUtil.isStatementBlock(n)) || ((n.getType()) == (com.google.javascript.rhino.Token.LABEL))) {
				extractForInitializer(n, null, null);
			}
			if (com.google.javascript.jscomp.NodeUtil.isStatementBlock(n)) {
				splitVarDeclarations(n);
			}
			if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				moveNamedFunctions(n.getLastChild());
			}
		}

		private void normalizeLabels(com.google.javascript.rhino.Node n) {
			com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.LABEL)));
			com.google.javascript.rhino.Node last = n.getLastChild();
			switch (last.getType()) {
				case com.google.javascript.rhino.Token.LABEL :
				case com.google.javascript.rhino.Token.BLOCK :
				case com.google.javascript.rhino.Token.FOR :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.DO :
					return ;
				default :
					com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
					block.copyInformationFrom(last);
					n.replaceChild(last, block);
					block.addChildToFront(last);
					reportCodeChange("LABEL normalization");
					return ;
			}
		}

		private void extractForInitializer(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node before, com.google.javascript.rhino.Node beforeParent) {
			for (com.google.javascript.rhino.Node next, c = n.getFirstChild(); c != null; c = next) {
				next = c.getNext();
				com.google.javascript.rhino.Node insertBefore = before == null ? c : before;
				com.google.javascript.rhino.Node insertBeforeParent = before == null ? n : beforeParent;
				switch (c.getType()) {
					case com.google.javascript.rhino.Token.LABEL :
						extractForInitializer(c, insertBefore, insertBeforeParent);
						break;
					case com.google.javascript.rhino.Token.FOR :
						if (com.google.javascript.jscomp.NodeUtil.isForIn(c)) {
							com.google.javascript.rhino.Node first = c.getFirstChild();
							if ((first.getType()) == (com.google.javascript.rhino.Token.VAR)) {
								com.google.javascript.rhino.Node newStatement = first.cloneTree();
								com.google.javascript.rhino.Node name = first.removeFirstChild();
								first.getParent().replaceChild(first, name);
								insertBeforeParent.addChildBefore(newStatement, insertBefore);
								reportCodeChange("FOR-IN var declaration");
							}
						}else
							if ((c.getFirstChild().getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
								com.google.javascript.rhino.Node init = c.getFirstChild();
								com.google.javascript.rhino.Node empty = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY);
								empty.copyInformationFrom(c);
								c.replaceChild(init, empty);
								com.google.javascript.rhino.Node newStatement;
								if ((init.getType()) == (com.google.javascript.rhino.Token.VAR)) {
									newStatement = init;
								}else {
									newStatement = com.google.javascript.jscomp.NodeUtil.newExpr(init);
								}
								insertBeforeParent.addChildBefore(newStatement, insertBefore);
								reportCodeChange("FOR initializer");
							}
						
						break;
				}
			}
		}

		private void splitVarDeclarations(com.google.javascript.rhino.Node n) {
			for (com.google.javascript.rhino.Node next, c = n.getFirstChild(); c != null; c = next) {
				next = c.getNext();
				if ((c.getType()) == (com.google.javascript.rhino.Token.VAR)) {
					if ((assertOnChange) && (!(c.hasChildren()))) {
						throw new java.lang.IllegalStateException("Empty VAR node.");
					}
					while ((c.getFirstChild()) != (c.getLastChild())) {
						com.google.javascript.rhino.Node name = c.getFirstChild();
						c.removeChild(name);
						com.google.javascript.rhino.Node newVar = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, name, n.getLineno(), n.getCharno());
						n.addChildBefore(newVar, c);
						reportCodeChange("VAR with multiple children");
					} 
				}
			}
		}

		private void moveNamedFunctions(com.google.javascript.rhino.Node functionBody) {
			com.google.common.base.Preconditions.checkState(((functionBody.getParent().getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			com.google.javascript.rhino.Node previous = null;
			com.google.javascript.rhino.Node current = functionBody.getFirstChild();
			while ((current != null) && (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(current))) {
				previous = current;
				current = current.getNext();
			} 
			com.google.javascript.rhino.Node insertAfter = previous;
			while (current != null) {
				com.google.javascript.rhino.Node next = current.getNext();
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(current)) {
					com.google.common.base.Preconditions.checkNotNull(previous);
					functionBody.removeChildAfter(previous);
					insertAfter = addToFront(functionBody, current, insertAfter);
					reportCodeChange("Move function declaration not at top of function");
				}else {
					previous = current;
				}
				current = next;
			} 
		}

		private com.google.javascript.rhino.Node addToFront(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node newChild, com.google.javascript.rhino.Node after) {
			if (after == null) {
				parent.addChildToFront(newChild);
			}else {
				parent.addChildAfter(newChild, after);
			}
			return newChild;
		}
	}

	private void removeDuplicateDeclarations(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.Callback tickler = new com.google.javascript.jscomp.Normalize.ScopeTicklingCallback();
		com.google.javascript.jscomp.ScopeCreator scopeCreator = new com.google.javascript.jscomp.SyntacticScopeCreator(compiler, new com.google.javascript.jscomp.Normalize.DuplicateDeclarationHandler());
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, tickler, scopeCreator);
		t.traverseRoots(externs, root);
	}

	private final class DuplicateDeclarationHandler implements com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler {
		private java.util.Set<com.google.javascript.jscomp.Scope.Var> hasOkDuplicateDeclaration = com.google.common.collect.Sets.newHashSet();

		@java.lang.Override
		public void onRedeclaration(com.google.javascript.jscomp.Scope s, java.lang.String name, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NAME)));
			com.google.javascript.rhino.Node parent = n.getParent();
			com.google.javascript.jscomp.Scope.Var v = s.getVar(name);
			if ((v != null) && (s.isGlobal())) {
				if ((v.isExtern()) && (!(input.isExtern()))) {
					if (hasOkDuplicateDeclaration.add(v)) {
						return ;
					}
				}
			}
			if ((v != null) && ((v.getParentNode().getType()) == (com.google.javascript.rhino.Token.CATCH))) {
				name = com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name);
				compiler.report(com.google.javascript.jscomp.JSError.make(input.getName(), n, com.google.javascript.jscomp.Normalize.CATCH_BLOCK_VAR_ERROR, name));
			}else
				if ((v != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
					if ((v.getParentNode().getType()) == (com.google.javascript.rhino.Token.VAR)) {
						s.undeclare(v);
						s.declare(name, n, n.getJSType(), v.input);
						replaceVarWithAssignment(v.getNameNode(), v.getParentNode(), v.getParentNode().getParent());
					}
				}else
					if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
						com.google.common.base.Preconditions.checkState(parent.hasOneChild());
						replaceVarWithAssignment(n, parent, parent.getParent());
					}
				
			
		}

		private void replaceVarWithAssignment(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			if (n.hasChildren()) {
				parent.removeChild(n);
				com.google.javascript.rhino.Node value = n.getFirstChild();
				n.removeChild(value);
				com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, n, value);
				replacement.copyInformationFrom(parent);
				gramps.replaceChild(parent, com.google.javascript.jscomp.NodeUtil.newExpr(replacement));
			}else {
				if (com.google.javascript.jscomp.NodeUtil.isStatementBlock(gramps)) {
					gramps.removeChild(parent);
				}else
					if ((gramps.getType()) == (com.google.javascript.rhino.Token.FOR)) {
						parent.removeChild(n);
						gramps.replaceChild(parent, n);
					}else {
						com.google.common.base.Preconditions.checkState(((gramps.getType()) == (com.google.javascript.rhino.Token.LABEL)));
						throw new java.lang.IllegalStateException("Unexpected LABEL");
					}
				
			}
			reportCodeChange("Duplicate VAR declaration");
		}
	}

	private final class ScopeTicklingCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			t.getScope();
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}
	}
}

