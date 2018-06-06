

package com.google.javascript.jscomp;


public final class SymbolTable implements com.google.javascript.rhino.jstype.StaticSymbolTable<com.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.jscomp.SymbolTable.Reference> {
	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.Symbol> symbols = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope> scopes = com.google.common.collect.Maps.newHashMap();

	SymbolTable() {
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Reference> getReferences(com.google.javascript.jscomp.SymbolTable.Symbol symbol) {
		return java.util.Collections.unmodifiableCollection(symbol.references.values());
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbols() {
		return java.util.Collections.unmodifiableCollection(symbols.values());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getScope(com.google.javascript.jscomp.SymbolTable.Symbol slot) {
		return slot.scope;
	}

	<S extends com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>, R extends com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType>> void addSymbolsFrom(com.google.javascript.rhino.jstype.StaticSymbolTable<S, R> otherSymbolTable) {
		for (S otherSymbol : otherSymbolTable.getAllSymbols()) {
			com.google.javascript.jscomp.SymbolTable.SymbolScope myScope = createScopeFrom(otherSymbolTable.getScope(otherSymbol));
			com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> decl = otherSymbol.getDeclaration();
			if (decl == null) {
				continue;
			}
			com.google.javascript.rhino.Node declNode = decl.getNode();
			com.google.javascript.jscomp.SymbolTable.Symbol mySymbol = symbols.get(declNode);
			if (mySymbol == null) {
				mySymbol = new com.google.javascript.jscomp.SymbolTable.Symbol(otherSymbol.getName(), otherSymbol.getType(), otherSymbol.isTypeInferred(), myScope);
				symbols.put(declNode, mySymbol);
				myScope.ownSymbols.put(mySymbol.getName(), mySymbol);
				mySymbol.setDeclaration(new com.google.javascript.jscomp.SymbolTable.Reference(mySymbol, declNode));
			}
			for (R otherRef : otherSymbolTable.getReferences(otherSymbol)) {
				com.google.javascript.rhino.Node otherRefNode = otherRef.getNode();
				if (!(mySymbol.references.containsKey(otherRefNode))) {
					mySymbol.references.put(otherRefNode, new com.google.javascript.jscomp.SymbolTable.Reference(mySymbol, otherRefNode));
				}
			}
		}
	}

	private com.google.javascript.jscomp.SymbolTable.SymbolScope createScopeFrom(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> otherScope) {
		com.google.javascript.rhino.Node otherScopeRoot = otherScope.getRootNode();
		com.google.javascript.jscomp.SymbolTable.SymbolScope myScope = scopes.get(otherScopeRoot);
		if (myScope == null) {
			com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> otherScopeParent = otherScope.getParentScope();
			if (otherScopeParent == null) {
				com.google.common.base.Preconditions.checkState(scopes.isEmpty());
			}
			myScope = new com.google.javascript.jscomp.SymbolTable.SymbolScope(otherScopeRoot, (otherScopeParent == null ? null : createScopeFrom(otherScopeParent)), otherScope.getTypeOfThis());
			scopes.put(otherScopeRoot, myScope);
		}
		return myScope;
	}

	public static final class Symbol extends com.google.javascript.rhino.jstype.SimpleSlot {
		private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.Reference> references = com.google.common.collect.Maps.newLinkedHashMap();

		private final com.google.javascript.jscomp.SymbolTable.SymbolScope scope;

		private com.google.javascript.jscomp.SymbolTable.Reference declaration = null;

		Symbol(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
			super(name, type, inferred);
			this.scope = scope;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.Reference getDeclaration() {
			return declaration;
		}

		void setDeclaration(com.google.javascript.jscomp.SymbolTable.Reference ref) {
			com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration) == null));
			com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration = ref;
			references.put(ref.getNode(), ref);
		}
	}

	public static final class Reference implements com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> {
		private final com.google.javascript.jscomp.SymbolTable.Symbol symbol;

		private final com.google.javascript.rhino.Node node;

		Reference(com.google.javascript.jscomp.SymbolTable.Symbol symbol, com.google.javascript.rhino.Node node) {
			this.symbol = symbol;
			this.node = node;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.Symbol getSymbol() {
			return symbol;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getNode() {
			return node;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile() {
			return node.getStaticSourceFile();
		}
	}

	public static final class SymbolScope implements com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> {
		private final com.google.javascript.rhino.Node rootNode;

		private final com.google.javascript.jscomp.SymbolTable.SymbolScope parent;

		private final com.google.javascript.rhino.jstype.JSType typeOfThis;

		private final java.util.Map<java.lang.String, com.google.javascript.jscomp.SymbolTable.Symbol> ownSymbols = com.google.common.collect.Maps.newHashMap();

		SymbolScope(com.google.javascript.rhino.Node rootNode, @javax.annotation.Nullable
		com.google.javascript.jscomp.SymbolTable.SymbolScope parent, com.google.javascript.rhino.jstype.JSType typeOfThis) {
			this.rootNode = rootNode;
			this.parent = parent;
			this.typeOfThis = typeOfThis;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRootNode() {
			return rootNode;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.SymbolScope getParentScope() {
			return parent;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.Symbol getSlot(java.lang.String name) {
			com.google.javascript.jscomp.SymbolTable.Symbol own = getOwnSlot(name);
			if (own != null) {
				return own;
			}
			return (parent) == null ? null : parent.getSlot(name);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.Symbol getOwnSlot(java.lang.String name) {
			return ownSymbols.get(name);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType getTypeOfThis() {
			return typeOfThis;
		}
	}
}

