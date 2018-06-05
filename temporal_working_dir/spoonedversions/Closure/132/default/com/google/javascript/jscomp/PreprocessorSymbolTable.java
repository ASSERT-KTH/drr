

package com.google.javascript.jscomp;


final class PreprocessorSymbolTable implements com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> , com.google.javascript.rhino.jstype.StaticSymbolTable<com.google.javascript.rhino.jstype.SimpleSlot, com.google.javascript.jscomp.PreprocessorSymbolTable.Reference> {
	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.SimpleSlot> symbols = com.google.common.collect.Maps.newHashMap();

	private final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.PreprocessorSymbolTable.Reference> refs = com.google.common.collect.ArrayListMultimap.create();

	private final com.google.javascript.rhino.Node root;

	PreprocessorSymbolTable(com.google.javascript.rhino.Node root) {
		this.root = root;
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getRootNode() {
		return root;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getTypeOfThis() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getParentScope() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.SimpleSlot getSlot(java.lang.String name) {
		return symbols.get(name);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.SimpleSlot getOwnSlot(java.lang.String name) {
		return getSlot(name);
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.PreprocessorSymbolTable.Reference> getReferences(com.google.javascript.rhino.jstype.SimpleSlot symbol) {
		return java.util.Collections.unmodifiableCollection(refs.get(symbol.getName()));
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.rhino.jstype.SimpleSlot> getAllSymbols() {
		return java.util.Collections.unmodifiableCollection(symbols.values());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getScope(com.google.javascript.rhino.jstype.SimpleSlot slot) {
		return com.google.javascript.jscomp.PreprocessorSymbolTable.this;
	}

	void addReference(com.google.javascript.rhino.Node node) {
		java.lang.String name = node.getQualifiedName();
		com.google.common.base.Preconditions.checkNotNull(name);
		if (!(symbols.containsKey(name))) {
			symbols.put(name, new com.google.javascript.rhino.jstype.SimpleSlot(name, null, true));
		}
		refs.put(name, new com.google.javascript.jscomp.PreprocessorSymbolTable.Reference(symbols.get(name), node));
	}

	static final class Reference extends com.google.javascript.rhino.jstype.SimpleReference<com.google.javascript.rhino.jstype.SimpleSlot> {
		Reference(com.google.javascript.rhino.jstype.SimpleSlot symbol, com.google.javascript.rhino.Node node) {
			super(symbol, node);
		}
	}
}

