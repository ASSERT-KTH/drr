

package com.google.javascript.jscomp;


class ShadowVariables implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.common.collect.Multimap<com.google.javascript.rhino.Node, java.lang.String> scopeUpRefMap = com.google.common.collect.HashMultimap.create();

	private final com.google.common.collect.Multimap<com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node> varToNameUsage = com.google.common.collect.HashMultimap.create();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.SortedSet<com.google.javascript.jscomp.RenameVars.Assignment> varsByFrequency;

	private final java.util.SortedMap<java.lang.String, com.google.javascript.jscomp.RenameVars.Assignment> assignments;

	private final java.util.Map<com.google.javascript.rhino.Node, java.lang.String> pseudoNameMap;

	ShadowVariables(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.SortedMap<java.lang.String, com.google.javascript.jscomp.RenameVars.Assignment> assignments, java.util.SortedSet<com.google.javascript.jscomp.RenameVars.Assignment> varsByFrequency, java.util.Map<com.google.javascript.rhino.Node, java.lang.String> pseudoNameMap) {
		this.compiler = compiler;
		this.assignments = assignments;
		this.varsByFrequency = varsByFrequency;
		this.pseudoNameMap = pseudoNameMap;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ShadowVariables.GatherReferenceInfo());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ShadowVariables.DoShadowVariables());
	}

	private class GatherReferenceInfo extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(com.google.javascript.jscomp.NodeUtil.isReferenceName(n))) {
				return ;
			}
			if (t.inGlobalScope()) {
				return ;
			}
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
			if (var == null) {
				return ;
			}
			if (var.getScope().isGlobal()) {
				return ;
			}
			if ((var.getScope()) != (t.getScope())) {
				for (com.google.javascript.jscomp.Scope s = t.getScope(); (s != (var.getScope())) && (s.isLocal()); s = s.getParent()) {
					scopeUpRefMap.put(s.getRootNode(), var.name);
				}
			}
			if ((var.getScope()) == (t.getScope())) {
				scopeUpRefMap.put(t.getScopeRoot(), var.name);
			}
			varToNameUsage.put(var, n);
		}
	}

	private class DoShadowVariables extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.Scope s = t.getScope();
			if (!(s.isLocal())) {
				return ;
			}
			if (s.getParent().isGlobal()) {
				return ;
			}
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> vars = s.getVars(); vars.hasNext();) {
				com.google.javascript.jscomp.Scope.Var var = vars.next();
				if (var.isBleedingFunction()) {
					continue;
				}
				com.google.javascript.jscomp.RenameVars.Assignment bestShadow = findBestShadow(s, var);
				if (bestShadow == null) {
					continue;
				}
				com.google.javascript.jscomp.RenameVars.Assignment localAssignment = assignments.get(var.getName());
				if ((bestShadow.count) < (localAssignment.count)) {
					continue;
				}
				doShadow(localAssignment, bestShadow, var);
				if ((pseudoNameMap) != null) {
					java.lang.String targetPseudoName = pseudoNameMap.get(s.getVar(bestShadow.oldName).nameNode);
					for (com.google.javascript.rhino.Node use : varToNameUsage.get(var)) {
						pseudoNameMap.put(use, targetPseudoName);
					}
				}
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}

		private com.google.javascript.jscomp.RenameVars.Assignment findBestShadow(com.google.javascript.jscomp.Scope curScope, com.google.javascript.jscomp.Scope.Var candidate) {
			TARGET : for (com.google.javascript.jscomp.RenameVars.Assignment assignment : varsByFrequency) {
				if (assignment.oldName.startsWith(com.google.javascript.jscomp.RenameVars.LOCAL_VAR_PREFIX)) {
					if (!(scopeUpRefMap.get(curScope.getRootNode()).contains(assignment.oldName))) {
						if (curScope.isDeclared(assignment.oldName, true)) {
							return assignment;
						}
					}
				}
			}
			return null;
		}

		private void doShadow(com.google.javascript.jscomp.RenameVars.Assignment original, com.google.javascript.jscomp.RenameVars.Assignment toShadow, com.google.javascript.jscomp.Scope.Var var) {
			com.google.javascript.jscomp.Scope s = var.getScope();
			java.util.Collection<com.google.javascript.rhino.Node> references = varToNameUsage.get(var);
			varsByFrequency.remove(original);
			varsByFrequency.remove(toShadow);
			original.count -= references.size();
			toShadow.count += references.size();
			varsByFrequency.add(original);
			varsByFrequency.add(toShadow);
			com.google.javascript.jscomp.Scope.Var shadowed = s.getVar(toShadow.oldName);
			if (shadowed != null) {
				for (com.google.javascript.jscomp.Scope curScope = s; curScope != (shadowed.scope); curScope = curScope.getParent()) {
					scopeUpRefMap.put(curScope.getRootNode(), toShadow.oldName);
				}
			}
			for (com.google.javascript.rhino.Node n : references) {
				n.setString(toShadow.oldName);
				com.google.javascript.rhino.Node cur = n;
				while (cur != (s.getRootNode())) {
					cur = cur.getParent();
					if (com.google.javascript.jscomp.NodeUtil.isFunction(cur)) {
						scopeUpRefMap.put(cur, toShadow.oldName);
					}
				} 
			}
		}
	}
}

