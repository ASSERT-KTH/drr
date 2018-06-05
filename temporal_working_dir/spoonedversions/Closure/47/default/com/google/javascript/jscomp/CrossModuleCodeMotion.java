

package com.google.javascript.jscomp;


class CrossModuleCodeMotion extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.CrossModuleCodeMotion.class.getName());

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.JSModuleGraph graph;

	private final java.util.Map<com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node> moduleVarParentMap = new java.util.HashMap<com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node>();

	private final java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo> namedInfo = new java.util.LinkedHashMap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo>();

	CrossModuleCodeMotion(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSModuleGraph graph) {
		this.compiler = compiler;
		this.graph = graph;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.CrossModuleCodeMotion.logger.info("Moving functions + variable into deeper modules");
		if (((graph) != null) && ((graph.getModuleCount()) > 1)) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CrossModuleCodeMotion.this);
			moveCode();
		}
	}

	private void moveCode() {
		for (com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo info : namedInfo.values()) {
			com.google.javascript.jscomp.JSModule deepestDependency = info.deepestModule;
			if ((info.allowMove) && (deepestDependency != null)) {
				java.util.Iterator<com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration> it = info.declarationIterator();
				com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
				while (it.hasNext()) {
					com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration decl = it.next();
					if (((decl.module) != null) && (moduleGraph.dependsOn(deepestDependency, decl.module))) {
						com.google.javascript.rhino.Node destParent = moduleVarParentMap.get(deepestDependency);
						if (destParent == null) {
							destParent = compiler.getNodeForCodeInsertion(deepestDependency);
							moduleVarParentMap.put(deepestDependency, destParent);
						}
						com.google.javascript.rhino.Node declParent = decl.node.getParent();
						com.google.common.base.Preconditions.checkState((((declParent.getType()) != (com.google.javascript.rhino.Token.VAR)) || (declParent.hasOneChild())), "AST not normalized.");
						declParent.detachFromParent();
						destParent.addChildToFront(declParent);
						compiler.reportCodeChange();
					}
				} 
			}
		}
	}

	private class NamedInfo {
		boolean allowMove = true;

		private com.google.javascript.jscomp.JSModule deepestModule = null;

		private com.google.javascript.jscomp.JSModule declModule = null;

		private final java.util.Deque<com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration> declarations = new java.util.ArrayDeque<com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration>();

		void addUsedModule(com.google.javascript.jscomp.JSModule m) {
			if (!(allowMove)) {
				return ;
			}
			if ((deepestModule) == null) {
				deepestModule = m;
			}else {
				deepestModule = graph.getDeepestCommonDependencyInclusive(m, deepestModule);
			}
		}

		boolean addDeclaration(com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration d) {
			if (((declModule) != null) && ((d.module) != (declModule))) {
				return false;
			}
			declarations.push(d);
			declModule = d.module;
			return true;
		}

		java.util.Iterator<com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration> declarationIterator() {
			return declarations.iterator();
		}
	}

	private class Declaration {
		final com.google.javascript.jscomp.JSModule module;

		final com.google.javascript.rhino.Node node;

		Declaration(com.google.javascript.jscomp.JSModule module, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			this.module = module;
			this.node = node;
		}
	}

	private boolean hasConditionalAncestor(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
			switch (ancestor.getType()) {
				case com.google.javascript.rhino.Token.DO :
				case com.google.javascript.rhino.Token.FOR :
				case com.google.javascript.rhino.Token.HOOK :
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.WHILE :
				case com.google.javascript.rhino.Token.FUNCTION :
					return true;
			}
		}
		return false;
	}

	private com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo getNamedInfo(com.google.javascript.jscomp.Scope.Var v) {
		com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo info = namedInfo.get(v);
		if (info == null) {
			info = new com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo();
			namedInfo.put(v, info);
		}
		return info;
	}

	private void processReference(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo info, java.lang.String name) {
		boolean recursive = false;
		com.google.javascript.rhino.Node rootNode = t.getScope().getRootNode();
		if (rootNode.isFunction()) {
			java.lang.String scopeFuncName = rootNode.getFirstChild().getString();
			com.google.javascript.rhino.Node scopeFuncParent = rootNode.getParent();
			if (scopeFuncName.equals(name)) {
				recursive = true;
			}else
				if ((scopeFuncParent.isName()) && (scopeFuncParent.getString().equals(name))) {
					recursive = true;
				}else {
					for (com.google.javascript.jscomp.Scope s = t.getScope(); (s.getParent()) != null; s = s.getParent()) {
						com.google.javascript.rhino.Node curRoot = s.getRootNode();
						if (curRoot.getParent().isAssign()) {
							com.google.javascript.rhino.Node owner = curRoot.getParent().getFirstChild();
							while (owner.isGetProp()) {
								owner = owner.getFirstChild();
							} 
							if ((owner.isName()) && (owner.getString().equals(name))) {
								recursive = true;
								break;
							}
						}
					}
				}
			
		}
		if (!recursive) {
			info.addUsedModule(t.getModule());
		}
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) != (com.google.javascript.rhino.Token.NAME)) {
			return ;
		}
		java.lang.String name = n.getString();
		if ((name.isEmpty()) || (compiler.getCodingConvention().isExported(name))) {
			return ;
		}
		com.google.javascript.jscomp.Scope.Var v = t.getScope().getVar(name);
		if ((v == null) || (!(v.isGlobal()))) {
			return ;
		}
		com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo info = getNamedInfo(v);
		if (info.allowMove) {
			if (maybeProcessDeclaration(t, n, parent, info)) {
				if (hasConditionalAncestor(parent.getParent())) {
					info.allowMove = false;
				}
			}else {
				processReference(t, info, name);
			}
		}
	}

	private boolean maybeProcessDeclaration(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo info) {
		com.google.javascript.rhino.Node gramps = parent.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.VAR :
				if (canMoveValue(name.getFirstChild())) {
					return info.addDeclaration(new com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration(t.getModule(), name, parent, gramps));
				}
				return false;
			case com.google.javascript.rhino.Token.FUNCTION :
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(parent)) {
					return info.addDeclaration(new com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration(t.getModule(), name, parent, gramps));
				}
				return false;
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.GETPROP :
				com.google.javascript.rhino.Node child = name;
				for (com.google.javascript.rhino.Node current : name.getAncestors()) {
					if (current.isGetProp()) {
					}else
						if ((current.isAssign()) && ((current.getFirstChild()) == child)) {
							com.google.javascript.rhino.Node currentParent = current.getParent();
							if ((com.google.javascript.jscomp.NodeUtil.isExpressionNode(currentParent)) && (canMoveValue(current.getLastChild()))) {
								return info.addDeclaration(new com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration(t.getModule(), current, currentParent, currentParent.getParent()));
							}
						}else {
							return false;
						}
					
					child = current;
				}
				return false;
			case com.google.javascript.rhino.Token.CALL :
				if (com.google.javascript.jscomp.NodeUtil.isExprCall(gramps)) {
					com.google.javascript.jscomp.CodingConvention.SubclassRelationship relationship = compiler.getCodingConvention().getClassesDefinedByCall(parent);
					if ((relationship != null) && (name.getString().equals(relationship.subclassName))) {
						return info.addDeclaration(new com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration(t.getModule(), parent, gramps, gramps.getParent()));
					}
				}
				return false;
			default :
				return false;
		}
	}

	private boolean canMoveValue(com.google.javascript.rhino.Node n) {
		if (((n == null) || (com.google.javascript.jscomp.NodeUtil.isLiteralValue(n, true))) || (n.isFunction())) {
			return true;
		}else
			if (n.isCall()) {
				com.google.javascript.rhino.Node functionName = n.getFirstChild();
				return (functionName.isName()) && ((functionName.getString().equals(com.google.javascript.jscomp.CrossModuleMethodMotion.STUB_METHOD_NAME)) || (functionName.getString().equals(com.google.javascript.jscomp.CrossModuleMethodMotion.UNSTUB_METHOD_NAME)));
			}else
				if (((n.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT)) || (n.isObjectLit())) {
					boolean isObjectLit = n.isObjectLit();
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						if (!(canMoveValue((isObjectLit ? child.getFirstChild() : child)))) {
							return false;
						}
					}
					return true;
				}
			
		
		return false;
	}
}

