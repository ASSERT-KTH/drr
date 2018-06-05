

package com.google.javascript.jscomp;


public final class SymbolTable implements com.google.javascript.rhino.jstype.StaticSymbolTable<com.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.jscomp.SymbolTable.Reference> {
	private final com.google.common.collect.Table<com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.SymbolTable.Symbol> symbols = com.google.common.collect.HashBasedTable.create();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope> scopes = com.google.common.collect.Maps.newHashMap();

	private com.google.javascript.jscomp.SymbolTable.SymbolScope globalScope = null;

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
	public com.google.javascript.jscomp.SymbolTable.SymbolScope getScope(com.google.javascript.jscomp.SymbolTable.Symbol slot) {
		return slot.scope;
	}

	public com.google.javascript.jscomp.SymbolTable.SymbolScope getEnclosingScope(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node current = n.getParent();
		if (((n.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((n.getParent().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			current = current.getParent();
		}
		for (; current != null; current = current.getParent()) {
			if (scopes.containsKey(current)) {
				return scopes.get(current);
			}
		}
		return null;
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForScope(com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		com.google.javascript.rhino.Node rootNode = scope.getRootNode();
		if ((rootNode.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
			return null;
		}
		java.lang.String name = com.google.javascript.jscomp.NodeUtil.getBestLValueName(com.google.javascript.jscomp.NodeUtil.getBestLValue(rootNode));
		return name == null ? null : scope.getParentScope().getSlot(name);
	}

	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbolsForTypeOf(com.google.javascript.jscomp.SymbolTable.Symbol sym) {
		return getAllSymbolsForType(sym.getType(), sym.scope);
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolDeclaredBy(com.google.javascript.rhino.jstype.FunctionType fn) {
		com.google.common.base.Preconditions.checkState(((fn.isConstructor()) || (fn.isInterface())));
		com.google.javascript.rhino.jstype.ObjectType instanceType = fn.getInstanceType();
		java.lang.String name = instanceType.getReferenceName();
		if ((name == null) || ((globalScope) == null)) {
			return null;
		}
		com.google.javascript.rhino.Node source = fn.getSource();
		return (source == null ? globalScope : getEnclosingScope(source)).getSlot(name);
	}

	private java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbolsForType(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		if (type == null) {
			return com.google.common.collect.ImmutableList.of();
		}
		com.google.javascript.rhino.jstype.UnionType unionType = type.toMaybeUnionType();
		if (unionType != null) {
			java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> result = com.google.common.collect.Lists.newArrayListWithExpectedSize(2);
			for (com.google.javascript.rhino.jstype.JSType alt : unionType.getAlternates()) {
				result.addAll(getAllSymbolsForType(alt, scope));
			}
			return result;
		}
		com.google.javascript.rhino.jstype.FunctionType fnType = type.toMaybeFunctionType();
		if (fnType != null) {
			com.google.javascript.jscomp.SymbolTable.Symbol result = globalScope.getSlot("Function");
			return result == null ? com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.SymbolTable.Symbol>of() : com.google.common.collect.ImmutableList.of(result);
		}
		com.google.javascript.rhino.jstype.ObjectType objType = type.toObjectType();
		if (objType != null) {
			java.lang.String name = objType.getReferenceName();
			com.google.javascript.jscomp.SymbolTable.Symbol result = scope.getSlot(((name == null) || (!(objType.isInstanceType())) ? "Object" : name));
			return result == null ? com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.SymbolTable.Symbol>of() : com.google.common.collect.ImmutableList.of(result);
		}
		return com.google.common.collect.ImmutableList.of();
	}

	public java.lang.String toDebugString() {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		for (com.google.javascript.jscomp.SymbolTable.Symbol symbol : getAllSymbols()) {
			toDebugString(builder, symbol);
		}
		return builder.toString();
	}

	private void toDebugString(java.lang.StringBuilder builder, com.google.javascript.jscomp.SymbolTable.Symbol symbol) {
		com.google.javascript.jscomp.SymbolTable.SymbolScope scope = symbol.scope;
		if (scope.isGlobalScope()) {
			builder.append(java.lang.String.format("\'%s\' : in global scope:\n", symbol.getName()));
		}else {
			builder.append(java.lang.String.format("\'%s\' : in scope %s:%d\n", symbol.getName(), scope.getRootNode().getSourceFileName(), scope.getRootNode().getLineno()));
		}
		int refCount = 0;
		for (com.google.javascript.jscomp.SymbolTable.Reference ref : getReferences(symbol)) {
			builder.append(java.lang.String.format("  Ref %d: %s:%d\n", refCount, ref.getNode().getSourceFileName(), ref.getNode().getLineno()));
			refCount++;
		}
	}

	<S extends com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>, R extends com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType>> void addSymbolsFrom(com.google.javascript.rhino.jstype.StaticSymbolTable<S, R> otherSymbolTable) {
		for (S otherSymbol : otherSymbolTable.getAllSymbols()) {
			java.lang.String name = otherSymbol.getName();
			com.google.javascript.jscomp.SymbolTable.SymbolScope myScope = createScopeFrom(otherSymbolTable.getScope(otherSymbol));
			com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.rhino.jstype.JSType> decl = otherSymbol.getDeclaration();
			com.google.javascript.rhino.Node declNode = decl == null ? null : decl.getNode();
			com.google.javascript.jscomp.SymbolTable.Symbol mySymbol = null;
			if ((declNode != null) && ((declNode.getStaticSourceFile()) != null)) {
				mySymbol = symbols.get(declNode, name);
				if (mySymbol == null) {
					mySymbol = new com.google.javascript.jscomp.SymbolTable.Symbol(name, otherSymbol.getType(), otherSymbol.isTypeInferred(), myScope);
					symbols.put(declNode, name, mySymbol);
					myScope.ownSymbols.put(name, mySymbol);
					mySymbol.setDeclaration(new com.google.javascript.jscomp.SymbolTable.Reference(mySymbol, declNode));
				}
			}else {
				mySymbol = myScope.getOwnSlot(name);
			}
			if (mySymbol != null) {
				for (R otherRef : otherSymbolTable.getReferences(otherSymbol)) {
					mySymbol.defineReferenceAt(otherRef.getNode());
				}
			}
		}
	}

	void fillNamespaceReferences() {
		for (com.google.javascript.jscomp.SymbolTable.Symbol symbol : getAllSymbols()) {
			for (com.google.javascript.jscomp.SymbolTable.Reference ref : getReferences(symbol)) {
				com.google.javascript.rhino.Node currentNode = ref.getNode();
				while ((currentNode.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
					currentNode = currentNode.getFirstChild();
					java.lang.String name = currentNode.getQualifiedName();
					if (name != null) {
						com.google.javascript.jscomp.SymbolTable.Symbol namespace = symbol.scope.getSlot(name);
						if (namespace != null) {
							namespace.defineReferenceAt(currentNode);
						}
					}
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
				com.google.common.base.Preconditions.checkState(((globalScope) == null), "Global scopes found at different roots");
			}
			myScope = new com.google.javascript.jscomp.SymbolTable.SymbolScope(otherScopeRoot, (otherScopeParent == null ? null : createScopeFrom(otherScopeParent)), otherScope.getTypeOfThis());
			scopes.put(otherScopeRoot, myScope);
			if (myScope.isGlobalScope()) {
				globalScope = myScope;
			}
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

		void defineReferenceAt(com.google.javascript.rhino.Node n) {
			if (!(references.containsKey(n))) {
				references.put(n, new com.google.javascript.jscomp.SymbolTable.Reference(com.google.javascript.jscomp.SymbolTable.Symbol.this, n));
			}
		}

		void setDeclaration(com.google.javascript.jscomp.SymbolTable.Reference ref) {
			com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration) == null));
			com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration = ref;
			references.put(ref.getNode(), ref);
		}

		public boolean inGlobalScope() {
			return scope.isGlobalScope();
		}

		public boolean inExterns() {
			com.google.javascript.rhino.Node n = getDeclarationNode();
			return n == null ? false : n.isFromExterns();
		}

		public com.google.javascript.rhino.Node getDeclarationNode() {
			return (declaration) == null ? null : declaration.getNode();
		}

		public java.lang.String getSourceFileName() {
			com.google.javascript.rhino.Node n = getDeclarationNode();
			return n == null ? null : n.getSourceFileName();
		}

		@java.lang.Override
		public java.lang.String toString() {
			com.google.javascript.rhino.Node n = getDeclarationNode();
			int lineNo = n == null ? -1 : n.getLineno();
			return ((((getName()) + "@") + (getSourceFileName())) + ":") + lineNo;
		}
	}

	public static final class Reference extends com.google.javascript.rhino.jstype.SimpleReference<com.google.javascript.jscomp.SymbolTable.Symbol> {
		Reference(com.google.javascript.jscomp.SymbolTable.Symbol symbol, com.google.javascript.rhino.Node node) {
			super(symbol, node);
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

		public boolean isGlobalScope() {
			return (getParentScope()) == null;
		}
	}
}

