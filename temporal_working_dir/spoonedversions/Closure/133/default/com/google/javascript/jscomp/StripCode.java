

package com.google.javascript.jscomp;


class StripCode implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Set<java.lang.String> stripTypes;

	private final java.util.Set<java.lang.String> stripNameSuffixes;

	private final java.util.Set<java.lang.String> stripTypePrefixes;

	private final java.util.Set<java.lang.String> stripNamePrefixes;

	private final java.util.Set<com.google.javascript.jscomp.Scope.Var> varsToRemove;

	static final com.google.javascript.jscomp.DiagnosticType STRIP_TYPE_INHERIT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_STRIP_TYPE_INHERIT_ERROR", "Non-strip type {0} cannot inherit from strip type {1}");

	static final com.google.javascript.jscomp.DiagnosticType STRIP_ASSIGNMENT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_STRIP_ASSIGNMENT_ERROR", "Unable to strip assignment to {0}");

	StripCode(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Set<java.lang.String> stripTypes, java.util.Set<java.lang.String> stripNameSuffixes, java.util.Set<java.lang.String> stripTypePrefixes, java.util.Set<java.lang.String> stripNamePrefixes) {
		this.compiler = compiler;
		this.stripTypes = com.google.common.collect.Sets.newHashSet(stripTypes);
		this.stripNameSuffixes = com.google.common.collect.Sets.newHashSet(stripNameSuffixes);
		this.stripTypePrefixes = com.google.common.collect.Sets.newHashSet(stripTypePrefixes);
		this.stripNamePrefixes = com.google.common.collect.Sets.newHashSet(stripNamePrefixes);
		this.varsToRemove = com.google.common.collect.Sets.newHashSet();
	}

	public void enableTweakStripping() {
		stripTypes.add("goog.tweak");
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.StripCode.Strip());
	}

	private class Strip extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					removeVarDeclarationsByNameOrRvalue(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.NAME :
					maybeRemoveReferenceToRemovedVariable(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
				case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				case com.google.javascript.rhino.Token.ASSIGN_LSH :
				case com.google.javascript.rhino.Token.ASSIGN_RSH :
				case com.google.javascript.rhino.Token.ASSIGN_URSH :
				case com.google.javascript.rhino.Token.ASSIGN_ADD :
				case com.google.javascript.rhino.Token.ASSIGN_SUB :
				case com.google.javascript.rhino.Token.ASSIGN_MUL :
				case com.google.javascript.rhino.Token.ASSIGN_DIV :
				case com.google.javascript.rhino.Token.ASSIGN_MOD :
					maybeEliminateAssignmentByLvalueName(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.CALL :
				case com.google.javascript.rhino.Token.NEW :
					maybeRemoveCall(t, n, parent);
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					eliminateKeysWithStripNamesFromObjLit(t, n);
					break;
				case com.google.javascript.rhino.Token.EXPR_RESULT :
					maybeEliminateExpressionByName(t, n, parent);
					break;
			}
		}

		void removeVarDeclarationsByNameOrRvalue(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			for (com.google.javascript.rhino.Node nameNode = n.getFirstChild(); nameNode != null; nameNode = nameNode.getNext()) {
				java.lang.String name = nameNode.getString();
				if ((isStripName(name)) || (isCallWhoseReturnValueShouldBeStripped(nameNode.getFirstChild()))) {
					com.google.javascript.jscomp.Scope scope = t.getScope();
					varsToRemove.add(scope.getVar(name));
					n.removeChild(nameNode);
					compiler.reportCodeChange();
				}
			}
			if (!(n.hasChildren())) {
				replaceWithEmpty(n, parent);
				compiler.reportCodeChange();
			}
		}

		void maybeRemoveReferenceToRemovedVariable(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					break;
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					if (((parent.getFirstChild()) == n) && (isReferenceToRemovedVar(t, n))) {
						replaceHighestNestedCallWithNull(parent, parent.getParent());
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
				case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				case com.google.javascript.rhino.Token.ASSIGN_LSH :
				case com.google.javascript.rhino.Token.ASSIGN_RSH :
				case com.google.javascript.rhino.Token.ASSIGN_URSH :
				case com.google.javascript.rhino.Token.ASSIGN_ADD :
				case com.google.javascript.rhino.Token.ASSIGN_SUB :
				case com.google.javascript.rhino.Token.ASSIGN_MUL :
				case com.google.javascript.rhino.Token.ASSIGN_DIV :
				case com.google.javascript.rhino.Token.ASSIGN_MOD :
					if (isReferenceToRemovedVar(t, n)) {
						if ((parent.getFirstChild()) == n) {
							com.google.javascript.rhino.Node gramps = parent.getParent();
							if (gramps.isExprResult()) {
								com.google.javascript.rhino.Node greatGramps = gramps.getParent();
								replaceWithEmpty(gramps, greatGramps);
								compiler.reportCodeChange();
							}else {
								com.google.javascript.rhino.Node rvalue = n.getNext();
								parent.removeChild(rvalue);
								gramps.replaceChild(parent, rvalue);
								compiler.reportCodeChange();
							}
						}else {
							replaceWithNull(n, parent);
							compiler.reportCodeChange();
						}
					}
					break;
				default :
					if (isReferenceToRemovedVar(t, n)) {
						replaceWithNull(n, parent);
						compiler.reportCodeChange();
					}
					break;
			}
		}

		void replaceHighestNestedCallWithNull(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node ancestor = parent;
			com.google.javascript.rhino.Node ancestorChild = node;
			while (true) {
				if ((ancestor.getFirstChild()) != ancestorChild) {
					replaceWithNull(ancestorChild, ancestor);
					break;
				}
				if (ancestor.isExprResult()) {
					com.google.javascript.rhino.Node ancParent = ancestor.getParent();
					replaceWithEmpty(ancestor, ancParent);
					break;
				}
				int type = ancestor.getType();
				if (((type != (com.google.javascript.rhino.Token.GETPROP)) && (type != (com.google.javascript.rhino.Token.GETELEM))) && (type != (com.google.javascript.rhino.Token.CALL))) {
					replaceWithNull(ancestorChild, ancestor);
					break;
				}
				ancestorChild = ancestor;
				ancestor = ancestor.getParent();
			} 
			compiler.reportCodeChange();
		}

		void maybeEliminateAssignmentByLvalueName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node lvalue = n.getFirstChild();
			if ((nameEndsWithFieldNameToStrip(lvalue)) || (qualifiedNameBeginsWithStripType(lvalue))) {
				if (parent.isExprResult()) {
					com.google.javascript.rhino.Node gramps = parent.getParent();
					replaceWithEmpty(parent, gramps);
					compiler.reportCodeChange();
				}else {
					t.report(n, com.google.javascript.jscomp.StripCode.STRIP_ASSIGNMENT_ERROR, lvalue.getQualifiedName());
				}
			}
		}

		void maybeEliminateExpressionByName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node expression = n.getFirstChild();
			if ((nameEndsWithFieldNameToStrip(expression)) || (qualifiedNameBeginsWithStripType(expression))) {
				if (parent.isExprResult()) {
					com.google.javascript.rhino.Node gramps = parent.getParent();
					replaceWithEmpty(parent, gramps);
				}else {
					replaceWithEmpty(n, parent);
				}
				compiler.reportCodeChange();
			}
		}

		void maybeRemoveCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isMethodOrCtorCallThatTriggersRemoval(t, n, parent)) {
				replaceHighestNestedCallWithNull(n, parent);
			}
		}

		void eliminateKeysWithStripNamesFromObjLit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node key = n.getFirstChild();
			while (key != null) {
				if (isStripName(key.getString())) {
					com.google.javascript.rhino.Node next = key.getNext();
					n.removeChild(key);
					key = next;
					compiler.reportCodeChange();
				}else {
					key = key.getNext();
				}
			} 
		}

		boolean isCallWhoseReturnValueShouldBeStripped(@javax.annotation.Nullable
		com.google.javascript.rhino.Node n) {
			return (((n != null) && ((n.isCall()) || (n.isNew()))) && (n.hasChildren())) && ((qualifiedNameBeginsWithStripType(n.getFirstChild())) || (nameEndsWithFieldNameToStrip(n.getFirstChild())));
		}

		boolean qualifiedNameBeginsWithStripType(com.google.javascript.rhino.Node n) {
			java.lang.String name = n.getQualifiedName();
			return qualifiedNameBeginsWithStripType(name);
		}

		boolean qualifiedNameBeginsWithStripType(java.lang.String name) {
			if (name != null) {
				for (java.lang.String type : stripTypes) {
					if ((name.equals(type)) || (name.startsWith((type + ".")))) {
						return true;
					}
				}
				for (java.lang.String type : stripTypePrefixes) {
					if (name.startsWith(type)) {
						return true;
					}
				}
			}
			return false;
		}

		boolean isReferenceToRemovedVar(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			java.lang.String name = n.getString();
			com.google.javascript.jscomp.Scope scope = t.getScope();
			com.google.javascript.jscomp.Scope.Var var = scope.getVar(name);
			return varsToRemove.contains(var);
		}

		boolean isMethodOrCtorCallThatTriggersRemoval(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node function = n.getFirstChild();
			if ((function == null) || (!(function.isGetProp()))) {
				return false;
			}
			if ((parent != null) && (parent.isName())) {
				com.google.javascript.rhino.Node gramps = parent.getParent();
				if ((gramps != null) && (gramps.isVar())) {
					return false;
				}
			}
			com.google.javascript.rhino.Node callee = function.getFirstChild();
			return (((nameEndsWithFieldNameToStrip(callee)) || (nameEndsWithFieldNameToStrip(function))) || (qualifiedNameBeginsWithStripType(function))) || (actsOnStripType(t, n));
		}

		boolean nameEndsWithFieldNameToStrip(@javax.annotation.Nullable
		com.google.javascript.rhino.Node n) {
			if ((n != null) && (n.isGetProp())) {
				com.google.javascript.rhino.Node propNode = n.getLastChild();
				return ((propNode != null) && (propNode.isString())) && (isStripName(propNode.getString()));
			}
			return false;
		}

		private boolean actsOnStripType(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode) {
			com.google.javascript.jscomp.CodingConvention.SubclassRelationship classes = compiler.getCodingConvention().getClassesDefinedByCall(callNode);
			if (classes != null) {
				if (qualifiedNameBeginsWithStripType(classes.subclassName)) {
					return true;
				}
				if (qualifiedNameBeginsWithStripType(classes.superclassName)) {
					t.report(callNode, com.google.javascript.jscomp.StripCode.STRIP_TYPE_INHERIT_ERROR, classes.subclassName, classes.superclassName);
				}
			}
			return false;
		}

		boolean isStripName(java.lang.String name) {
			if ((stripNameSuffixes.contains(name)) || (stripNamePrefixes.contains(name))) {
				return true;
			}
			if (((name.length()) == 0) || (java.lang.Character.isUpperCase(name.charAt(0)))) {
				return false;
			}
			java.lang.String lcName = name.toLowerCase();
			for (java.lang.String stripName : stripNamePrefixes) {
				if (lcName.startsWith(stripName.toLowerCase())) {
					return true;
				}
			}
			for (java.lang.String stripName : stripNameSuffixes) {
				if (lcName.endsWith(stripName.toLowerCase())) {
					return true;
				}
			}
			return false;
		}

		void replaceWithNull(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			parent.replaceChild(n, com.google.javascript.rhino.IR.nullNode());
		}

		void replaceWithEmpty(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.NodeUtil.removeChild(parent, n);
		}
	}
}

