

package com.google.javascript.jscomp;


class MakeDeclaredNamesUnique implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	public static final java.lang.String ARGUMENTS = "arguments";

	private java.util.Deque<com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer> nameStack = new java.util.ArrayDeque<com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer>();

	private final com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer rootRenamer;

	MakeDeclaredNamesUnique() {
		this(new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer());
	}

	MakeDeclaredNamesUnique(com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer) {
		this.rootRenamer = renamer;
	}

	static com.google.javascript.jscomp.CompilerPass getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter(compiler);
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node declarationRoot = t.getScopeRoot();
		com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer;
		if (nameStack.isEmpty()) {
			com.google.common.base.Preconditions.checkState((((declarationRoot.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) || (!((rootRenamer) instanceof com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer))));
			com.google.common.base.Preconditions.checkState(t.inGlobalScope());
			renamer = rootRenamer;
		}else {
			renamer = nameStack.peek().forChildScope();
		}
		if ((declarationRoot.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
			for (com.google.javascript.rhino.Node c = declarationRoot.getFirstChild().getNext().getFirstChild(); c != null; c = c.getNext()) {
				java.lang.String name = c.getString();
				renamer.addDeclaredName(name);
			}
			com.google.javascript.rhino.Node functionBody = declarationRoot.getLastChild();
			findDeclaredNames(functionBody, null, renamer);
		}else
			if ((declarationRoot.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
				findDeclaredNames(declarationRoot, null, renamer);
			}
		
		nameStack.push(renamer);
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		if (!(t.inGlobalScope())) {
			nameStack.pop();
		}
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				{
					com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer = nameStack.peek().forChildScope();
					java.lang.String name = n.getFirstChild().getString();
					if ((((name != null) && (!(name.isEmpty()))) && (parent != null)) && (!(com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)))) {
						renamer.addDeclaredName(name);
					}
					nameStack.push(renamer);
				}
				break;
			case com.google.javascript.rhino.Token.CATCH :
				{
					com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer = nameStack.peek().forChildScope();
					java.lang.String name = n.getFirstChild().getString();
					renamer.addDeclaredName(name);
					nameStack.push(renamer);
				}
				break;
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String newName = getReplacementName(n.getString());
				if (newName != null) {
					com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer = nameStack.peek();
					if (renamer.stripConstIfReplaced()) {
						n.removeProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
					}
					n.setString(newName);
					t.getCompiler().reportCodeChange();
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				nameStack.pop();
				break;
			case com.google.javascript.rhino.Token.CATCH :
				nameStack.pop();
				break;
		}
	}

	private java.lang.String getReplacementName(java.lang.String oldName) {
		for (com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer names : nameStack) {
			java.lang.String newName = names.getReplacementName(oldName);
			if (newName != null) {
				return newName;
			}
		}
		return null;
	}

	private void findDeclaredNames(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer) {
		if (((parent == null) || ((parent.getType()) != (com.google.javascript.rhino.Token.FUNCTION))) || (n == (parent.getFirstChild()))) {
			if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
				renamer.addDeclaredName(n.getString());
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					com.google.javascript.rhino.Node nameNode = n.getFirstChild();
					renamer.addDeclaredName(nameNode.getString());
				}
			
			for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
				findDeclaredNames(c, n, renamer);
			}
		}
	}

	interface Renamer {
		void addDeclaredName(java.lang.String name);

		java.lang.String getReplacementName(java.lang.String oldName);

		boolean stripConstIfReplaced();

		com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer forChildScope();
	}

	static class ContextualRenameInverter implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private java.util.Set<java.lang.String> referencedNames = com.google.common.collect.ImmutableSet.of();

		private java.util.Deque<java.util.Set<java.lang.String>> referenceStack = new java.util.ArrayDeque<java.util.Set<java.lang.String>>();

		private java.util.Map<java.lang.String, java.util.List<com.google.javascript.rhino.Node>> nameMap = com.google.common.collect.Maps.newHashMap();

		private ContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node js) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, js, com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.this);
		}

		public static java.lang.String getOrginalName(java.lang.String name) {
			int index = com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.indexOfSeparator(name);
			return index == (-1) ? name : name.substring(0, index);
		}

		private static int indexOfSeparator(java.lang.String name) {
			return name.lastIndexOf(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR);
		}

		private boolean containsSeparator(java.lang.String name) {
			return (name.indexOf(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) != (-1);
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope()) {
				return ;
			}
			referenceStack.push(referencedNames);
			referencedNames = com.google.common.collect.Sets.newHashSet();
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope()) {
				return ;
			}
			for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = t.getScope().getVars(); it.hasNext();) {
				com.google.javascript.jscomp.Scope.Var v = it.next();
				handleScopeVar(v);
			}
			java.util.Set<java.lang.String> current = referencedNames;
			referencedNames = referenceStack.pop();
			if (!(referenceStack.isEmpty())) {
				referencedNames.addAll(current);
			}
		}

		void handleScopeVar(com.google.javascript.jscomp.Scope.Var v) {
			java.lang.String name = v.getName();
			if ((containsSeparator(name)) && (!(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name).isEmpty()))) {
				java.lang.String newName = findReplacementName(name);
				referencedNames.remove(name);
				referencedNames.add(newName);
				java.util.List<com.google.javascript.rhino.Node> references = nameMap.get(name);
				com.google.common.base.Preconditions.checkState((references != null));
				for (com.google.javascript.rhino.Node n : references) {
					com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NAME)));
					n.setString(newName);
				}
				compiler.reportCodeChange();
				nameMap.remove(name);
			}
		}

		private java.lang.String findReplacementName(java.lang.String name) {
			java.lang.String original = com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name);
			java.lang.String newName = original;
			int i = 0;
			while (!(isValidName(newName))) {
				newName = (original + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (java.lang.String.valueOf((i++)));
			} 
			return newName;
		}

		private boolean isValidName(java.lang.String name) {
			if (((com.google.javascript.rhino.TokenStream.isJSIdentifier(name)) && (!(referencedNames.contains(name)))) && (!(name.equals(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ARGUMENTS)))) {
				return true;
			}
			return false;
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (t.inGlobalScope()) {
				return ;
			}
			if (com.google.javascript.jscomp.NodeUtil.isReferenceName(node)) {
				java.lang.String name = node.getString();
				referencedNames.add(name);
				if (containsSeparator(name)) {
					addCandidateNameReference(name, node);
				}
			}
		}

		private void addCandidateNameReference(java.lang.String name, com.google.javascript.rhino.Node n) {
			java.util.List<com.google.javascript.rhino.Node> nodes = nameMap.get(name);
			if (null == nodes) {
				nodes = com.google.common.collect.Lists.newLinkedList();
				nameMap.put(name, nodes);
			}
			nodes.add(n);
		}
	}

	static class ContextualRenamer implements com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer {
		private final com.google.common.collect.Multiset<java.lang.String> nameUsage;

		private final java.util.Map<java.lang.String, java.lang.String> declarations = com.google.common.collect.Maps.newHashMap();

		private final boolean global;

		static final java.lang.String UNIQUE_ID_SEPARATOR = "$$";

		ContextualRenamer() {
			this.global = true;
			nameUsage = com.google.common.collect.HashMultiset.create();
		}

		private ContextualRenamer(com.google.common.collect.Multiset<java.lang.String> nameUsage) {
			this.global = false;
			this.nameUsage = nameUsage;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer forChildScope() {
			return new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer(nameUsage);
		}

		@java.lang.Override
		public void addDeclaredName(java.lang.String name) {
			if (!(name.equals(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ARGUMENTS))) {
				if (global) {
					reserveName(name);
				}else {
					if (!(declarations.containsKey(name))) {
						int id = incrementNameCount(name);
						java.lang.String newName = null;
						if (id != 0) {
							newName = getUniqueName(name, id);
						}
						declarations.put(name, newName);
					}
				}
			}
		}

		@java.lang.Override
		public java.lang.String getReplacementName(java.lang.String oldName) {
			return declarations.get(oldName);
		}

		private java.lang.String getUniqueName(java.lang.String name, int id) {
			return (name + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + id;
		}

		private void reserveName(java.lang.String name) {
			nameUsage.setCount(name, 0, 1);
		}

		private int incrementNameCount(java.lang.String name) {
			return nameUsage.add(name, 1);
		}

		@java.lang.Override
		public boolean stripConstIfReplaced() {
			return false;
		}
	}

	static class InlineRenamer implements com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer {
		private final java.util.Map<java.lang.String, java.lang.String> declarations = com.google.common.collect.Maps.newHashMap();

		private final com.google.common.base.Supplier<java.lang.String> uniqueIdSupplier;

		private final java.lang.String idPrefix;

		private final boolean removeConstness;

		InlineRenamer(com.google.common.base.Supplier<java.lang.String> uniqueIdSupplier, java.lang.String idPrefix, boolean removeConstness) {
			this.uniqueIdSupplier = uniqueIdSupplier;
			com.google.common.base.Preconditions.checkArgument((!(idPrefix.isEmpty())));
			this.idPrefix = idPrefix;
			this.removeConstness = removeConstness;
		}

		@java.lang.Override
		public void addDeclaredName(java.lang.String name) {
			com.google.common.base.Preconditions.checkState((!(name.equals(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ARGUMENTS))));
			if (!(declarations.containsKey(name))) {
				declarations.put(name, getUniqueName(name));
			}
		}

		private java.lang.String getUniqueName(java.lang.String name) {
			if (name.isEmpty()) {
				return name;
			}
			if ((name.indexOf(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) != (-1)) {
				name = name.substring(0, name.lastIndexOf(com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR));
			}
			return ((name + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (idPrefix)) + (uniqueIdSupplier.get());
		}

		@java.lang.Override
		public java.lang.String getReplacementName(java.lang.String oldName) {
			return declarations.get(oldName);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer forChildScope() {
			return new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(uniqueIdSupplier, idPrefix, removeConstness);
		}

		@java.lang.Override
		public boolean stripConstIfReplaced() {
			return removeConstness;
		}
	}

	static class BoilerplateRenamer extends com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer {
		private final com.google.common.base.Supplier<java.lang.String> uniqueIdSupplier;

		private final java.lang.String idPrefix;

		BoilerplateRenamer(com.google.common.base.Supplier<java.lang.String> uniqueIdSupplier, java.lang.String idPrefix) {
			this.uniqueIdSupplier = uniqueIdSupplier;
			this.idPrefix = idPrefix;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer forChildScope() {
			return new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(uniqueIdSupplier, idPrefix, false);
		}
	}
}

