

package com.google.javascript.jscomp;


class DefinitionsRemover {
	static com.google.javascript.jscomp.DefinitionsRemover.Definition getDefinition(com.google.javascript.rhino.Node n, boolean isExtern) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if (parent == null) {
			return null;
		}
		if ((com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) && (n.hasChildren())) {
			return new com.google.javascript.jscomp.DefinitionsRemover.VarDefinition(n, isExtern);
		}else
			if ((com.google.javascript.jscomp.NodeUtil.isFunction(parent)) && ((parent.getFirstChild()) == n)) {
				if (!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(parent))) {
					return new com.google.javascript.jscomp.DefinitionsRemover.NamedFunctionDefinition(parent, isExtern);
				}else
					if (!(n.getString().equals(""))) {
						return new com.google.javascript.jscomp.DefinitionsRemover.FunctionExpressionDefinition(parent, isExtern);
					}
				
			}else
				if ((com.google.javascript.jscomp.NodeUtil.isAssign(parent)) && ((parent.getFirstChild()) == n)) {
					return new com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition(parent, isExtern);
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)) {
						return new com.google.javascript.jscomp.DefinitionsRemover.ObjectLiteralPropertyDefinition(parent, n, n.getFirstChild(), isExtern);
					}else
						if ((parent.getType()) == (com.google.javascript.rhino.Token.LP)) {
							com.google.javascript.rhino.Node function = parent.getParent();
							return new com.google.javascript.jscomp.DefinitionsRemover.FunctionArgumentDefinition(function, n, isExtern);
						}
					
				
			
		
		return null;
	}

	static boolean isDefinitionNode(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if (parent == null) {
			return false;
		}
		if ((com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) && (n.hasChildren())) {
			return true;
		}else
			if ((com.google.javascript.jscomp.NodeUtil.isFunction(parent)) && ((parent.getFirstChild()) == n)) {
				if (!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(parent))) {
					return true;
				}else
					if (!(n.getString().equals(""))) {
						return true;
					}
				
			}else
				if ((com.google.javascript.jscomp.NodeUtil.isAssign(parent)) && ((parent.getFirstChild()) == n)) {
					return true;
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)) {
						return true;
					}else
						if ((parent.getType()) == (com.google.javascript.rhino.Token.LP)) {
							return true;
						}
					
				
			
		
		return false;
	}

	abstract static class Definition {
		private final boolean isExtern;

		Definition(boolean isExtern) {
			this.isExtern = isExtern;
		}

		public void remove() {
			if (!(isExtern)) {
				performRemove();
			}else {
				throw new java.lang.IllegalStateException(("Attempt to remove() an extern" + " definition."));
			}
		}

		protected abstract void performRemove();

		public abstract com.google.javascript.rhino.Node getLValue();

		public abstract com.google.javascript.rhino.Node getRValue();

		public boolean isExtern() {
			return isExtern;
		}
	}

	abstract static class IncompleteDefinition extends com.google.javascript.jscomp.DefinitionsRemover.Definition {
		private static final java.util.Set<java.lang.Integer> ALLOWED_TYPES = com.google.common.collect.ImmutableSet.of(com.google.javascript.rhino.Token.NAME, com.google.javascript.rhino.Token.GETPROP, com.google.javascript.rhino.Token.GETELEM);

		private final com.google.javascript.rhino.Node lValue;

		IncompleteDefinition(com.google.javascript.rhino.Node lValue, boolean inExterns) {
			super(inExterns);
			com.google.common.base.Preconditions.checkNotNull(lValue);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition.ALLOWED_TYPES.contains(lValue.getType()), ("Unexpected lValue type " + (com.google.javascript.rhino.Token.name(lValue.getType()))));
			this.lValue = lValue;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getLValue() {
			return lValue;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRValue() {
			return null;
		}
	}

	static final class UnknownDefinition extends com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition {
		UnknownDefinition(com.google.javascript.rhino.Node lValue, boolean inExterns) {
			super(lValue, inExterns);
		}

		@java.lang.Override
		public void performRemove() {
			throw new java.lang.IllegalArgumentException("Can't remove an UnknownDefinition");
		}
	}

	static final class ExternalNameOnlyDefinition extends com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition {
		ExternalNameOnlyDefinition(com.google.javascript.rhino.Node lValue) {
			super(lValue, true);
		}

		@java.lang.Override
		public void performRemove() {
			throw new java.lang.IllegalArgumentException("Can't remove external name-only definition");
		}
	}

	static final class FunctionArgumentDefinition extends com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition {
		FunctionArgumentDefinition(com.google.javascript.rhino.Node function, com.google.javascript.rhino.Node argumentName, boolean inExterns) {
			super(argumentName, inExterns);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(function));
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isName(argumentName));
		}

		@java.lang.Override
		public void performRemove() {
			throw new java.lang.IllegalArgumentException("Can't remove a FunctionArgumentDefinition");
		}
	}

	abstract static class FunctionDefinition extends com.google.javascript.jscomp.DefinitionsRemover.Definition {
		protected final com.google.javascript.rhino.Node function;

		FunctionDefinition(com.google.javascript.rhino.Node node, boolean inExterns) {
			super(inExterns);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(node));
			function = node;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getLValue() {
			return function.getFirstChild();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRValue() {
			return function;
		}
	}

	static final class NamedFunctionDefinition extends com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition {
		NamedFunctionDefinition(com.google.javascript.rhino.Node node, boolean inExterns) {
			super(node, inExterns);
		}

		@java.lang.Override
		public void performRemove() {
			function.detachFromParent();
		}
	}

	static final class FunctionExpressionDefinition extends com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition {
		FunctionExpressionDefinition(com.google.javascript.rhino.Node node, boolean inExterns) {
			super(node, inExterns);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node));
		}

		@java.lang.Override
		public void performRemove() {
			function.replaceChild(function.getFirstChild(), com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, ""));
		}
	}

	static final class AssignmentDefinition extends com.google.javascript.jscomp.DefinitionsRemover.Definition {
		private final com.google.javascript.rhino.Node assignment;

		AssignmentDefinition(com.google.javascript.rhino.Node node, boolean inExterns) {
			super(inExterns);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isAssign(node));
			assignment = node;
		}

		@java.lang.Override
		public void performRemove() {
			com.google.javascript.rhino.Node parent = assignment.getParent();
			com.google.javascript.rhino.Node last = assignment.getLastChild();
			assignment.removeChild(last);
			parent.replaceChild(assignment, last);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getLValue() {
			return assignment.getFirstChild();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRValue() {
			return assignment.getLastChild();
		}
	}

	static final class ObjectLiteralPropertyDefinition extends com.google.javascript.jscomp.DefinitionsRemover.Definition {
		private final com.google.javascript.rhino.Node literal;

		private final com.google.javascript.rhino.Node name;

		private final com.google.javascript.rhino.Node value;

		ObjectLiteralPropertyDefinition(com.google.javascript.rhino.Node lit, com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node value, boolean isExtern) {
			super(isExtern);
			this.literal = lit;
			this.name = name;
			this.value = value;
		}

		@java.lang.Override
		public void performRemove() {
			literal.removeChild(name);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getLValue() {
			switch (name.getType()) {
				case com.google.javascript.rhino.Token.STRING :
					return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT), name.cloneNode());
				case com.google.javascript.rhino.Token.NUMBER :
					return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETELEM, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT), name.cloneNode());
				case com.google.javascript.rhino.Token.SET :
				case com.google.javascript.rhino.Token.GET :
					throw new java.lang.IllegalStateException("not yet implemented");
				default :
					throw new java.lang.IllegalStateException("unexpected");
			}
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRValue() {
			return value;
		}
	}

	static final class VarDefinition extends com.google.javascript.jscomp.DefinitionsRemover.Definition {
		private final com.google.javascript.rhino.Node name;

		VarDefinition(com.google.javascript.rhino.Node node, boolean inExterns) {
			super(inExterns);
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node));
			com.google.common.base.Preconditions.checkArgument(node.hasChildren(), (("VAR Declaration of " + (node.getString())) + "should be assigned a value."));
			name = node;
		}

		@java.lang.Override
		public void performRemove() {
			com.google.javascript.rhino.Node var = name.getParent();
			com.google.common.base.Preconditions.checkState(((var.getFirstChild()) == (var.getLastChild())), "AST should be normalized first");
			com.google.javascript.rhino.Node parent = var.getParent();
			com.google.javascript.rhino.Node rValue = name.removeFirstChild();
			com.google.common.base.Preconditions.checkState(((parent.getType()) != (com.google.javascript.rhino.Token.FOR)));
			parent.replaceChild(var, com.google.javascript.jscomp.NodeUtil.newExpr(rValue));
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getLValue() {
			return name;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRValue() {
			return name.getFirstChild();
		}
	}
}

