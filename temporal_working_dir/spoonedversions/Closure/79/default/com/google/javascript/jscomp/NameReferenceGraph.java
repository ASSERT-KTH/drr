

package com.google.javascript.jscomp;


class NameReferenceGraph extends com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> implements com.google.javascript.jscomp.DefinitionProvider {
	private final com.google.common.collect.Multimap<com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameReferenceGraph.Name> referenceMap = com.google.common.collect.HashMultimap.create();

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.NameReferenceGraph.Name> nameMap = com.google.common.collect.Maps.newHashMap();

	final com.google.javascript.jscomp.NameReferenceGraph.Name UNKNOWN;

	final com.google.javascript.jscomp.NameReferenceGraph.Name MAIN;

	final com.google.javascript.jscomp.NameReferenceGraph.Name WINDOW;

	final com.google.javascript.jscomp.AbstractCompiler compiler;

	public NameReferenceGraph(com.google.javascript.jscomp.AbstractCompiler compiler) {
		super(true, true);
		this.compiler = compiler;
		UNKNOWN = new com.google.javascript.jscomp.NameReferenceGraph.Name("{UNKNOWN}", true);
		UNKNOWN.isAliased = true;
		UNKNOWN.type = compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		com.google.javascript.jscomp.NameReferenceGraph.this.createNode(UNKNOWN);
		MAIN = new com.google.javascript.jscomp.NameReferenceGraph.Name("{Global Main}", true);
		com.google.javascript.jscomp.NameReferenceGraph.this.createNode(MAIN);
		WINDOW = new com.google.javascript.jscomp.NameReferenceGraph.Name("window", true);
		com.google.javascript.jscomp.NameReferenceGraph.this.createNode(WINDOW);
	}

	public com.google.javascript.jscomp.NameReferenceGraph.Name defineNameIfNotExists(java.lang.String name, boolean isExtern) {
		com.google.javascript.jscomp.NameReferenceGraph.Name symbol = null;
		if (nameMap.containsKey(name)) {
			symbol = nameMap.get(name);
		}else {
			symbol = new com.google.javascript.jscomp.NameReferenceGraph.Name(name, isExtern);
			nameMap.put(name, symbol);
			createNode(symbol);
		}
		return symbol;
	}

	public java.util.List<com.google.javascript.jscomp.NameReferenceGraph.Name> getReferencesAt(com.google.javascript.rhino.Node site) {
		com.google.common.base.Preconditions.checkArgument(((com.google.javascript.jscomp.NodeUtil.isGetProp(site)) || (com.google.javascript.jscomp.NodeUtil.isName(site))));
		java.util.List<com.google.javascript.jscomp.NameReferenceGraph.Name> result = new java.util.ArrayList<com.google.javascript.jscomp.NameReferenceGraph.Name>();
		for (com.google.javascript.jscomp.NameReferenceGraph.Name target : referenceMap.get(site)) {
			result.add(target);
		}
		return result;
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> getDefinitionsReferencedAt(com.google.javascript.rhino.Node useSite) {
		java.util.List<com.google.javascript.jscomp.NameReferenceGraph.Name> nameRefs = getReferencesAt(useSite);
		if (nameRefs.isEmpty()) {
			return null;
		}
		java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> result = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.NameReferenceGraph.Name nameRef : nameRefs) {
			java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> decls = nameRef.getDeclarations();
			if (!(decls.isEmpty())) {
				result.addAll(decls);
			}
		}
		if (!(result.isEmpty())) {
			return result;
		}else {
			return null;
		}
	}

	public com.google.javascript.jscomp.NameReferenceGraph.Name getSymbol(java.lang.String name) {
		return nameMap.get(name);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> createNode(com.google.javascript.jscomp.NameReferenceGraph.Name value) {
		nameMap.put(value.qName, value);
		return super.createNode(value);
	}

	@java.lang.Override
	public void connect(com.google.javascript.jscomp.NameReferenceGraph.Name src, com.google.javascript.jscomp.NameReferenceGraph.Reference ref, com.google.javascript.jscomp.NameReferenceGraph.Name dest) {
		super.connect(src, ref, dest);
		referenceMap.put(ref.site, dest);
	}

	class Name {
		private final java.lang.String qName;

		private com.google.javascript.rhino.jstype.JSType type;

		private java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> declarations = com.google.common.collect.Lists.newLinkedList();

		final boolean isExtern;

		private boolean isExported = false;

		private boolean isAliased = false;

		private boolean exposedToCallOrApply = false;

		public Name(java.lang.String qName, boolean isExtern) {
			this.qName = qName;
			this.isExtern = isExtern;
			int lastDot = qName.lastIndexOf('.');
			java.lang.String name = lastDot == (-1) ? qName : qName.substring((lastDot + 1));
			com.google.javascript.jscomp.NameReferenceGraph.Name.this.isExported = compiler.getCodingConvention().isExported(name);
			com.google.javascript.jscomp.NameReferenceGraph.Name.this.type = compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}

		public com.google.javascript.rhino.jstype.JSType getType() {
			return type;
		}

		public void setType(com.google.javascript.rhino.jstype.JSType type) {
			com.google.javascript.jscomp.NameReferenceGraph.Name.this.type = type;
		}

		public java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> getDeclarations() {
			return declarations;
		}

		public void addAssignmentDeclaration(com.google.javascript.rhino.Node node) {
			declarations.add(new com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition(node, isExtern));
		}

		public void addFunctionDeclaration(com.google.javascript.rhino.Node node) {
			declarations.add(new com.google.javascript.jscomp.DefinitionsRemover.NamedFunctionDefinition(node, isExtern));
		}

		public boolean isExtern() {
			return isExtern;
		}

		public void markExported() {
			com.google.javascript.jscomp.NameReferenceGraph.Name.this.isExported = true;
		}

		public boolean isExported() {
			return isExported;
		}

		public final void remove() {
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition declaration : getDeclarations()) {
				declaration.remove();
			}
		}

		public boolean isAliased() {
			return isAliased;
		}

		public void setAliased(boolean isAliased) {
			com.google.javascript.jscomp.NameReferenceGraph.Name.this.isAliased = isAliased;
		}

		public boolean hasSideEffect() {
			return isCallable();
		}

		public java.lang.String getQualifiedName() {
			return qName;
		}

		public java.lang.String getPropertyName() {
			int lastIndexOfDot = qName.lastIndexOf('.');
			if (lastIndexOfDot == (-1)) {
				return null;
			}else {
				return qName.substring((lastIndexOfDot + 1));
			}
		}

		public boolean isCallable() {
			return type.canBeCalled();
		}

		public boolean exposedToCallOrApply() {
			return exposedToCallOrApply;
		}

		public void markExposedToCallOrApply() {
			exposedToCallOrApply = true;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((qName) + " : ") + (type);
		}

		@java.lang.Override
		public int hashCode() {
			return qName.hashCode();
		}

		public boolean canChangeSignature() {
			return !((((((isExtern()) || (!(isCallable()))) || (isAliased())) || (isExported())) || (exposedToCallOrApply())) || (nameUsesArgumentsProperty()));
		}

		private boolean nameUsesArgumentsProperty() {
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition definition : getDeclarations()) {
				if (com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(definition.getRValue())) {
					return true;
				}
			}
			return false;
		}
	}

	static class Reference {
		public final com.google.javascript.rhino.Node site;

		public final com.google.javascript.rhino.Node parent;

		private com.google.javascript.jscomp.JSModule module = null;

		private boolean isUnknown = false;

		public Reference(com.google.javascript.rhino.Node site, com.google.javascript.rhino.Node parent) {
			this.site = site;
			this.parent = parent;
		}

		public boolean isUnknown() {
			return isUnknown;
		}

		public void setUnknown(boolean isUnknown) {
			com.google.javascript.jscomp.NameReferenceGraph.Reference.this.isUnknown = isUnknown;
		}

		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}

		public void setModule(com.google.javascript.jscomp.JSModule module) {
			com.google.javascript.jscomp.NameReferenceGraph.Reference.this.module = module;
		}

		boolean isCall() {
			return com.google.javascript.jscomp.NodeUtil.isCall(site);
		}

		public com.google.javascript.rhino.Node getSite() {
			return site;
		}
	}
}

