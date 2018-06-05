

package com.google.javascript.jscomp;


public class Scope implements com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> {
	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.Scope.Var> vars = new java.util.LinkedHashMap<java.lang.String, com.google.javascript.jscomp.Scope.Var>();

	private final com.google.javascript.jscomp.Scope parent;

	private final int depth;

	private final com.google.javascript.rhino.Node rootNode;

	private final com.google.javascript.rhino.jstype.ObjectType thisType;

	private final boolean isBottom;

	public static class Var implements com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> {
		final java.lang.String name;

		final com.google.javascript.rhino.Node nameNode;

		private com.google.javascript.rhino.jstype.JSType type;

		private final com.google.javascript.rhino.JSDocInfo info;

		private final boolean typeInferred;

		final com.google.javascript.jscomp.CompilerInput input;

		final boolean isDefine;

		final int index;

		final com.google.javascript.jscomp.Scope scope;

		private Var(boolean inferred, java.lang.String name, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.Scope scope, int index, com.google.javascript.jscomp.CompilerInput input, boolean isDefine, com.google.javascript.rhino.JSDocInfo info) {
			this.name = name;
			this.nameNode = nameNode;
			com.google.javascript.jscomp.Scope.Var.this.type = type;
			this.scope = scope;
			this.index = index;
			this.input = input;
			this.isDefine = isDefine;
			this.info = info;
			this.typeInferred = inferred;
		}

		public java.lang.String getName() {
			return name;
		}

		public com.google.javascript.rhino.Node getParentNode() {
			return (nameNode) == null ? null : nameNode.getParent();
		}

		public boolean isBleedingFunction() {
			return com.google.javascript.jscomp.NodeUtil.isFunctionExpression(getParentNode());
		}

		com.google.javascript.jscomp.Scope getScope() {
			return scope;
		}

		public boolean isGlobal() {
			return scope.isGlobal();
		}

		public boolean isLocal() {
			return scope.isLocal();
		}

		boolean isExtern() {
			return ((input) == null) || (input.isExtern());
		}

		public boolean isConst() {
			return com.google.javascript.jscomp.NodeUtil.isConstantName(nameNode);
		}

		public boolean isDefine() {
			return isDefine;
		}

		public com.google.javascript.rhino.Node getInitialValue() {
			com.google.javascript.rhino.Node parent = getParentNode();
			int pType = parent.getType();
			if (pType == (com.google.javascript.rhino.Token.FUNCTION)) {
				return parent;
			}else
				if (pType == (com.google.javascript.rhino.Token.ASSIGN)) {
					return parent.getLastChild();
				}else
					if (pType == (com.google.javascript.rhino.Token.VAR)) {
						return nameNode.getFirstChild();
					}else {
						return null;
					}
				
			
		}

		public com.google.javascript.rhino.jstype.JSType getType() {
			return type;
		}

		public com.google.javascript.rhino.Node getNameNode() {
			return nameNode;
		}

		public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
			return info;
		}

		void setType(com.google.javascript.rhino.jstype.JSType type) {
			com.google.common.base.Preconditions.checkState(isTypeInferred());
			com.google.javascript.jscomp.Scope.Var.this.type = type;
		}

		void resolveType(com.google.javascript.rhino.ErrorReporter errorReporter) {
			if ((type) != null) {
				type = type.resolve(errorReporter, scope);
			}
		}

		public boolean isTypeInferred() {
			return typeInferred;
		}

		public java.lang.String getInputName() {
			if ((input) == null)
				return "<non-file>";
			else
				return input.getName();
			
		}

		public boolean isNoShadow() {
			if (((info) != null) && (info.isNoShadow())) {
				return true;
			}else {
				return false;
			}
		}

		@java.lang.Override
		public boolean equals(java.lang.Object other) {
			if (!(other instanceof com.google.javascript.jscomp.Scope.Var)) {
				return false;
			}
			com.google.javascript.jscomp.Scope.Var otherVar = ((com.google.javascript.jscomp.Scope.Var) (other));
			return (otherVar.nameNode) == (nameNode);
		}

		@java.lang.Override
		public int hashCode() {
			return nameNode.hashCode();
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "Scope.Var " + (name);
		}
	}

	Scope(com.google.javascript.jscomp.Scope parent, com.google.javascript.rhino.Node rootNode) {
		com.google.common.base.Preconditions.checkNotNull(parent);
		com.google.common.base.Preconditions.checkArgument((rootNode != (parent.rootNode)));
		this.parent = parent;
		this.rootNode = rootNode;
		com.google.javascript.rhino.jstype.JSType nodeType = rootNode.getJSType();
		if ((nodeType != null) && (nodeType instanceof com.google.javascript.rhino.jstype.FunctionType)) {
			thisType = ((com.google.javascript.rhino.jstype.FunctionType) (nodeType)).getTypeOfThis();
		}else {
			thisType = parent.thisType;
		}
		this.isBottom = false;
		this.depth = (parent.depth) + 1;
	}

	Scope(com.google.javascript.rhino.Node rootNode, com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.parent = null;
		this.rootNode = rootNode;
		thisType = compiler.getTypeRegistry().getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS);
		this.isBottom = false;
		this.depth = 0;
	}

	Scope(com.google.javascript.rhino.Node rootNode, com.google.javascript.rhino.jstype.ObjectType thisType) {
		this.parent = null;
		this.rootNode = rootNode;
		this.thisType = thisType;
		this.isBottom = true;
		this.depth = 0;
	}

	int getDepth() {
		return depth;
	}

	boolean isBottom() {
		return isBottom;
	}

	public com.google.javascript.rhino.Node getRootNode() {
		return rootNode;
	}

	public com.google.javascript.jscomp.Scope getParent() {
		return parent;
	}

	com.google.javascript.jscomp.Scope getGlobalScope() {
		com.google.javascript.jscomp.Scope result = com.google.javascript.jscomp.Scope.this;
		while ((result.getParent()) != null) {
			result = result.getParent();
		} 
		return result;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getParentScope() {
		return parent;
	}

	public com.google.javascript.rhino.jstype.ObjectType getTypeOfThis() {
		return thisType;
	}

	com.google.javascript.jscomp.Scope.Var declare(java.lang.String name, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.CompilerInput input) {
		return declare(name, nameNode, type, input, true);
	}

	com.google.javascript.jscomp.Scope.Var declare(java.lang.String name, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.CompilerInput input, boolean inferred) {
		com.google.common.base.Preconditions.checkState(((name != null) && ((name.length()) > 0)));
		com.google.common.base.Preconditions.checkState(((vars.get(name)) == null));
		com.google.javascript.rhino.JSDocInfo info = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(nameNode);
		com.google.javascript.jscomp.Scope.Var var = new com.google.javascript.jscomp.Scope.Var(inferred, name, nameNode, type, com.google.javascript.jscomp.Scope.this, vars.size(), input, ((info != null) && (info.isDefine())), info);
		vars.put(name, var);
		return var;
	}

	void undeclare(com.google.javascript.jscomp.Scope.Var var) {
		com.google.common.base.Preconditions.checkState(((var.scope) == (com.google.javascript.jscomp.Scope.this)));
		com.google.common.base.Preconditions.checkState(((vars.get(var.name)) == var));
		vars.remove(var.name);
	}

	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSlot(java.lang.String name) {
		return getVar(name);
	}

	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getOwnSlot(java.lang.String name) {
		return vars.get(name);
	}

	public com.google.javascript.jscomp.Scope.Var getVar(java.lang.String name) {
		com.google.javascript.jscomp.Scope.Var var = vars.get(name);
		if (var != null) {
			return var;
		}else
			if ((parent) != null) {
				return parent.getVar(name);
			}else {
				return null;
			}
		
	}

	public boolean isDeclared(java.lang.String name, boolean recurse) {
		com.google.javascript.jscomp.Scope scope = com.google.javascript.jscomp.Scope.this;
		if (scope.vars.containsKey(name))
			return true;
		
		if (((scope.parent) != null) && recurse) {
			return scope.parent.isDeclared(name, recurse);
		}
		return false;
	}

	public java.util.Iterator<com.google.javascript.jscomp.Scope.Var> getVars() {
		return vars.values().iterator();
	}

	public int getVarCount() {
		return vars.size();
	}

	public boolean isGlobal() {
		return (parent) == null;
	}

	public boolean isLocal() {
		return !(isGlobal());
	}
}

