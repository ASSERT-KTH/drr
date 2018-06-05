

package com.google.javascript.jscomp;


final class RenameVars implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.ArrayList<com.google.javascript.rhino.Node> globalNameNodes = new java.util.ArrayList<com.google.javascript.rhino.Node>();

	private final java.util.ArrayList<com.google.javascript.rhino.Node> localNameNodes = new java.util.ArrayList<com.google.javascript.rhino.Node>();

	private final java.util.Map<com.google.javascript.rhino.Node, java.lang.String> pseudoNameMap;

	private final java.util.Set<java.lang.String> externNames = new java.util.HashSet<java.lang.String>();

	private final java.util.Set<java.lang.String> reservedNames;

	private final java.util.Map<java.lang.String, java.lang.String> renameMap = new java.util.HashMap<java.lang.String, java.lang.String>();

	private final com.google.javascript.jscomp.VariableMap prevUsedRenameMap;

	private final java.lang.String prefix;

	private int assignmentCount = 0;

	private java.lang.StringBuilder assignmentLog;

	private java.util.Set<com.google.javascript.jscomp.Scope.Var> localBleedingFunctions = com.google.common.collect.Sets.newHashSet();

	private com.google.common.collect.ArrayListMultimap<com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.Scope.Var> localBleedingFunctionsPerScope = com.google.common.collect.ArrayListMultimap.create();

	class Assignment {
		final java.lang.String oldName;

		final int orderOfOccurrence;

		java.lang.String newName;

		int count;

		Assignment(java.lang.String name) {
			this.oldName = name;
			com.google.javascript.jscomp.RenameVars.Assignment.this.newName = null;
			com.google.javascript.jscomp.RenameVars.Assignment.this.count = 0;
			this.orderOfOccurrence = (assignmentCount)++;
		}

		void setNewName(java.lang.String newName) {
			com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.RenameVars.Assignment.this.newName) == null));
			com.google.javascript.jscomp.RenameVars.Assignment.this.newName = newName;
		}
	}

	private final java.util.SortedMap<java.lang.String, com.google.javascript.jscomp.RenameVars.Assignment> assignments = new java.util.TreeMap<java.lang.String, com.google.javascript.jscomp.RenameVars.Assignment>();

	private final boolean localRenamingOnly;

	private boolean preserveFunctionExpressionNames;

	private final boolean shouldShadow;

	private final char[] reservedCharacters;

	public static final java.lang.String LOCAL_VAR_PREFIX = "L ";

	RenameVars(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String prefix, boolean localRenamingOnly, boolean preserveFunctionExpressionNames, boolean generatePseudoNames, boolean shouldShadow, com.google.javascript.jscomp.VariableMap prevUsedRenameMap, @javax.annotation.Nullable
	char[] reservedCharacters, @javax.annotation.Nullable
	java.util.Set<java.lang.String> reservedNames) {
		this.compiler = compiler;
		this.prefix = (prefix == null) ? "" : prefix;
		this.localRenamingOnly = localRenamingOnly;
		com.google.javascript.jscomp.RenameVars.this.preserveFunctionExpressionNames = preserveFunctionExpressionNames;
		if (generatePseudoNames) {
			this.pseudoNameMap = com.google.common.collect.Maps.newHashMap();
		}else {
			this.pseudoNameMap = null;
		}
		this.prevUsedRenameMap = prevUsedRenameMap;
		this.reservedCharacters = reservedCharacters;
		this.shouldShadow = shouldShadow;
		if (reservedNames == null) {
			this.reservedNames = com.google.common.collect.Sets.newHashSet();
		}else {
			this.reservedNames = com.google.common.collect.Sets.newHashSet(reservedNames);
		}
	}

	class ProcessVars extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private final boolean isExternsPass_;

		ProcessVars(boolean isExterns) {
			isExternsPass_ = isExterns;
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope())
				return ;
			
			java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars();
			while (it.hasNext()) {
				com.google.javascript.jscomp.Scope.Var current = it.next();
				if (current.isBleedingFunction()) {
					localBleedingFunctions.add(current);
					localBleedingFunctionsPerScope.put(t.getScope().getParent(), current);
				}
			} 
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isName())) {
				return ;
			}
			java.lang.String name = n.getString();
			if ((name.length()) == 0) {
				return ;
			}
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
			boolean local = ((var != null) && (var.isLocal())) && ((!(var.scope.getParent().isGlobal())) || (!(var.isBleedingFunction())));
			if ((!local) && (localRenamingOnly)) {
				reservedNames.add(name);
				return ;
			}
			if (((preserveFunctionExpressionNames) && (var != null)) && (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(var.getParentNode()))) {
				reservedNames.add(name);
				return ;
			}
			if (!(okToRenameVar(name, local))) {
				if (local) {
					java.lang.String newName = com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name);
					if (!(newName.equals(name))) {
						n.setString(newName);
					}
				}
				return ;
			}
			if (isExternsPass_) {
				if (!local) {
					externNames.add(name);
				}
				return ;
			}
			if ((pseudoNameMap) != null) {
				recordPseudoName(n);
			}
			if (local) {
				java.lang.String tempName = (com.google.javascript.jscomp.RenameVars.LOCAL_VAR_PREFIX) + (getLocalVarIndex(var));
				incCount(tempName);
				localNameNodes.add(n);
				n.setString(tempName);
			}else
				if (var != null) {
					incCount(name);
					globalNameNodes.add(n);
				}
			
		}

		void incCount(java.lang.String name) {
			com.google.javascript.jscomp.RenameVars.Assignment s = assignments.get(name);
			if (s == null) {
				s = new com.google.javascript.jscomp.RenameVars.Assignment(name);
				assignments.put(name, s);
			}
			(s.count)++;
		}
	}

	private static final java.util.Comparator<com.google.javascript.jscomp.RenameVars.Assignment> FREQUENCY_COMPARATOR = new java.util.Comparator<com.google.javascript.jscomp.RenameVars.Assignment>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.RenameVars.Assignment a1, com.google.javascript.jscomp.RenameVars.Assignment a2) {
			if ((a1.count) != (a2.count)) {
				return (a2.count) - (a1.count);
			}
			return com.google.javascript.jscomp.RenameVars.ORDER_OF_OCCURRENCE_COMPARATOR.compare(a1, a2);
		}
	};

	private static final java.util.Comparator<com.google.javascript.jscomp.RenameVars.Assignment> ORDER_OF_OCCURRENCE_COMPARATOR = new java.util.Comparator<com.google.javascript.jscomp.RenameVars.Assignment>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.RenameVars.Assignment a1, com.google.javascript.jscomp.RenameVars.Assignment a2) {
			return (a1.orderOfOccurrence) - (a2.orderOfOccurrence);
		}
	};

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		assignmentLog = new java.lang.StringBuilder();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.RenameVars.ProcessVars(true));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RenameVars.ProcessVars(false));
		reservedNames.addAll(externNames);
		java.util.SortedSet<com.google.javascript.jscomp.RenameVars.Assignment> varsByFrequency = new java.util.TreeSet<com.google.javascript.jscomp.RenameVars.Assignment>(com.google.javascript.jscomp.RenameVars.FREQUENCY_COMPARATOR);
		varsByFrequency.addAll(assignments.values());
		if (shouldShadow) {
			new com.google.javascript.jscomp.ShadowVariables(compiler, assignments, varsByFrequency, pseudoNameMap).process(externs, root);
		}
		if ((prevUsedRenameMap) != null) {
			reusePreviouslyUsedVariableMap();
		}
		assignNames(varsByFrequency);
		boolean changed = false;
		for (com.google.javascript.rhino.Node n : globalNameNodes) {
			java.lang.String newName = getNewGlobalName(n);
			if (newName != null) {
				n.setString(newName);
				changed = true;
			}
		}
		int count = 0;
		for (com.google.javascript.rhino.Node n : localNameNodes) {
			java.lang.String newName = getNewLocalName(n);
			if (newName != null) {
				n.setString(newName);
				changed = true;
			}
			count++;
		}
		if (changed) {
			compiler.reportCodeChange();
		}
		compiler.addToDebugLog(("JS var assignments:\n" + (assignmentLog)));
		assignmentLog = null;
	}

	private java.lang.String getNewGlobalName(com.google.javascript.rhino.Node n) {
		java.lang.String oldName = n.getString();
		com.google.javascript.jscomp.RenameVars.Assignment a = assignments.get(oldName);
		if (((a.newName) != null) && (!(a.newName.equals(oldName)))) {
			if ((pseudoNameMap) != null) {
				return pseudoNameMap.get(n);
			}
			return a.newName;
		}else {
			return null;
		}
	}

	private java.lang.String getNewLocalName(com.google.javascript.rhino.Node n) {
		java.lang.String oldTempName = n.getString();
		com.google.javascript.jscomp.RenameVars.Assignment a = assignments.get(oldTempName);
		if (!(a.newName.equals(oldTempName))) {
			if ((pseudoNameMap) != null) {
				return pseudoNameMap.get(n);
			}
			return a.newName;
		}
		return null;
	}

	private void recordPseudoName(com.google.javascript.rhino.Node n) {
		pseudoNameMap.put(n, (('$' + (n.getString())) + "$$"));
	}

	private void reusePreviouslyUsedVariableMap() {
		for (com.google.javascript.jscomp.RenameVars.Assignment a : assignments.values()) {
			java.lang.String prevNewName = prevUsedRenameMap.lookupNewName(a.oldName);
			if ((prevNewName == null) || (reservedNames.contains(prevNewName))) {
				continue;
			}
			if ((a.oldName.startsWith(com.google.javascript.jscomp.RenameVars.LOCAL_VAR_PREFIX)) || ((!(externNames.contains(a.oldName))) && (prevNewName.startsWith(prefix)))) {
				reservedNames.add(prevNewName);
				finalizeNameAssignment(a, prevNewName);
			}
		}
	}

	private void assignNames(java.util.Set<com.google.javascript.jscomp.RenameVars.Assignment> varsToRename) {
		com.google.javascript.jscomp.NameGenerator globalNameGenerator = new com.google.javascript.jscomp.NameGenerator(reservedNames, prefix, reservedCharacters);
		com.google.javascript.jscomp.NameGenerator localNameGenerator = prefix.isEmpty() ? globalNameGenerator : new com.google.javascript.jscomp.NameGenerator(reservedNames, "", reservedCharacters);
		java.util.List<com.google.javascript.jscomp.RenameVars.Assignment> pendingAssignments = new java.util.ArrayList<com.google.javascript.jscomp.RenameVars.Assignment>();
		java.util.List<java.lang.String> generatedNamesForAssignments = new java.util.ArrayList<java.lang.String>();
		for (com.google.javascript.jscomp.RenameVars.Assignment a : varsToRename) {
			if ((a.newName) != null) {
				continue;
			}
			if (externNames.contains(a.oldName)) {
				continue;
			}
			java.lang.String newName;
			if (a.oldName.startsWith(com.google.javascript.jscomp.RenameVars.LOCAL_VAR_PREFIX)) {
				newName = localNameGenerator.generateNextName();
				finalizeNameAssignment(a, newName);
			}else {
				newName = globalNameGenerator.generateNextName();
				pendingAssignments.add(a);
				generatedNamesForAssignments.add(newName);
			}
			reservedNames.add(newName);
		}
		int numPendingAssignments = generatedNamesForAssignments.size();
		for (int i = 0; i < numPendingAssignments;) {
			java.util.SortedSet<com.google.javascript.jscomp.RenameVars.Assignment> varsByOrderOfOccurrence = new java.util.TreeSet<com.google.javascript.jscomp.RenameVars.Assignment>(com.google.javascript.jscomp.RenameVars.ORDER_OF_OCCURRENCE_COMPARATOR);
			int len = generatedNamesForAssignments.get(i).length();
			for (int j = i; (j < numPendingAssignments) && ((generatedNamesForAssignments.get(j).length()) == len); j++) {
				varsByOrderOfOccurrence.add(pendingAssignments.get(j));
			}
			for (com.google.javascript.jscomp.RenameVars.Assignment a : varsByOrderOfOccurrence) {
				finalizeNameAssignment(a, generatedNamesForAssignments.get(i));
				++i;
			}
		}
	}

	private void finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment a, java.lang.String newName) {
		a.setNewName(newName);
		renameMap.put(a.oldName, newName);
		assignmentLog.append(a.oldName).append(" => ").append(newName).append('\n');
	}

	com.google.javascript.jscomp.VariableMap getVariableMap() {
		return new com.google.javascript.jscomp.VariableMap(renameMap);
	}

	private boolean okToRenameVar(java.lang.String name, boolean isLocal) {
		return !(compiler.getCodingConvention().isExported(name, isLocal));
	}

	private int getLocalVarIndex(com.google.javascript.jscomp.Scope.Var v) {
		int num = v.index;
		com.google.javascript.jscomp.Scope s = v.scope.getParent();
		if (s == null) {
			throw new java.lang.IllegalArgumentException("Var is not local");
		}
		boolean isBleedingIntoScope = ((s.getParent()) != null) && (localBleedingFunctions.contains(v));
		while ((s.getParent()) != null) {
			if (isBleedingIntoScope) {
				num += (localBleedingFunctionsPerScope.get(s).indexOf(v)) + 1;
				isBleedingIntoScope = false;
			}else {
				num += localBleedingFunctionsPerScope.get(s).size();
			}
			num += s.getVarCount();
			s = s.getParent();
		} 
		return num;
	}
}

