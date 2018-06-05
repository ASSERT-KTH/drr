

package com.google.javascript.jscomp;


public final class SymbolTable implements com.google.javascript.rhino.jstype.StaticSymbolTable<com.google.javascript.jscomp.SymbolTable.Symbol, com.google.javascript.jscomp.SymbolTable.Reference> {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.SymbolTable.class.getName());

	public static final java.lang.String GLOBAL_THIS = "*global*";

	private final com.google.common.collect.Table<com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.SymbolTable.Symbol> symbols = com.google.common.collect.HashBasedTable.create();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SymbolTable.SymbolScope> scopes = com.google.common.collect.Maps.newLinkedHashMap();

	private final java.util.List<com.google.javascript.rhino.JSDocInfo> docInfos = com.google.common.collect.Lists.newArrayList();

	private com.google.javascript.jscomp.SymbolTable.SymbolScope globalScope = null;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	SymbolTable(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Reference> getReferences(com.google.javascript.jscomp.SymbolTable.Symbol symbol) {
		return java.util.Collections.unmodifiableCollection(symbol.references.values());
	}

	public java.util.List<com.google.javascript.jscomp.SymbolTable.Reference> getReferenceList(com.google.javascript.jscomp.SymbolTable.Symbol symbol) {
		return com.google.common.collect.ImmutableList.copyOf(symbol.references.values());
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbols() {
		return java.util.Collections.unmodifiableCollection(symbols.values());
	}

	public com.google.common.collect.Ordering<com.google.javascript.jscomp.SymbolTable.Symbol> getNaturalSymbolOrdering() {
		return SYMBOL_ORDERING;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SymbolTable.SymbolScope getScope(com.google.javascript.jscomp.SymbolTable.Symbol slot) {
		return slot.scope;
	}

	public java.util.Collection<com.google.javascript.rhino.JSDocInfo> getAllJSDocInfo() {
		return java.util.Collections.unmodifiableList(docInfos);
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol declareInferredSymbol(com.google.javascript.jscomp.SymbolTable.SymbolScope scope, java.lang.String name, com.google.javascript.rhino.Node declNode) {
		return declareSymbol(name, null, true, scope, declNode, null);
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

	public com.google.javascript.jscomp.SymbolTable.Symbol getParameterInFunction(com.google.javascript.jscomp.SymbolTable.Symbol sym, java.lang.String paramName) {
		com.google.javascript.jscomp.SymbolTable.SymbolScope scope = getScopeInFunction(sym);
		if (scope != null) {
			com.google.javascript.jscomp.SymbolTable.Symbol param = scope.getSlot(paramName);
			if ((param != null) && ((param.scope) == scope)) {
				return param;
			}
		}
		return null;
	}

	private com.google.javascript.jscomp.SymbolTable.SymbolScope getScopeInFunction(com.google.javascript.jscomp.SymbolTable.Symbol sym) {
		com.google.javascript.rhino.jstype.FunctionType type = sym.getFunctionType();
		if (type == null) {
			return null;
		}
		com.google.javascript.rhino.Node functionNode = type.getSource();
		if (functionNode == null) {
			return null;
		}
		return scopes.get(functionNode);
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForScope(com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		if ((scope.getSymbolForScope()) == null) {
			scope.setSymbolForScope(findSymbolForScope(scope));
		}
		return scope.getSymbolForScope();
	}

	private com.google.javascript.jscomp.SymbolTable.Symbol findSymbolForScope(com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		com.google.javascript.rhino.Node rootNode = scope.getRootNode();
		if ((rootNode.getParent()) == null) {
			return globalScope.getSlot(com.google.javascript.jscomp.SymbolTable.GLOBAL_THIS);
		}
		if ((rootNode.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
			return null;
		}
		java.lang.String name = com.google.javascript.jscomp.NodeUtil.getBestLValueName(com.google.javascript.jscomp.NodeUtil.getBestLValue(rootNode));
		return name == null ? null : scope.getParentScope().getSlot(name);
	}

	public java.lang.Iterable<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbolsForTypeOf(com.google.javascript.jscomp.SymbolTable.Symbol sym) {
		return getAllSymbolsForType(sym.getType());
	}

	public com.google.javascript.jscomp.SymbolTable.SymbolScope getGlobalScope() {
		return globalScope;
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolDeclaredBy(com.google.javascript.rhino.jstype.FunctionType fn) {
		com.google.common.base.Preconditions.checkState(((fn.isConstructor()) || (fn.isInterface())));
		com.google.javascript.rhino.jstype.ObjectType instanceType = fn.getInstanceType();
		return getSymbolForName(fn.getSource(), instanceType.getReferenceName());
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForInstancesOf(com.google.javascript.jscomp.SymbolTable.Symbol sym) {
		com.google.javascript.rhino.jstype.FunctionType fn = sym.getFunctionType();
		if ((fn != null) && (fn.isNominalConstructor())) {
			return getSymbolForInstancesOf(fn);
		}
		return null;
	}

	public com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForInstancesOf(com.google.javascript.rhino.jstype.FunctionType fn) {
		com.google.common.base.Preconditions.checkState(((fn.isConstructor()) || (fn.isInterface())));
		com.google.javascript.rhino.jstype.ObjectType pType = fn.getPrototype();
		return getSymbolForName(fn.getSource(), pType.getReferenceName());
	}

	private com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForName(com.google.javascript.rhino.Node source, java.lang.String name) {
		if ((name == null) || ((globalScope) == null)) {
			return null;
		}
		com.google.javascript.jscomp.SymbolTable.SymbolScope scope = source == null ? globalScope : getEnclosingScope(source);
		return scope == null ? null : scope.getSlot(name);
	}

	public java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> getAllSymbolsForType(com.google.javascript.rhino.jstype.JSType type) {
		if (type == null) {
			return com.google.common.collect.ImmutableList.of();
		}
		com.google.javascript.rhino.jstype.UnionType unionType = type.toMaybeUnionType();
		if (unionType != null) {
			java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> result = com.google.common.collect.Lists.newArrayListWithExpectedSize(2);
			for (com.google.javascript.rhino.jstype.JSType alt : unionType.getAlternates()) {
				com.google.javascript.jscomp.SymbolTable.Symbol altSym = getSymbolForTypeHelper(alt, true);
				if (altSym != null) {
					result.add(altSym);
				}
			}
			return result;
		}
		com.google.javascript.jscomp.SymbolTable.Symbol result = getSymbolForTypeHelper(type, true);
		return result == null ? com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.SymbolTable.Symbol>of() : com.google.common.collect.ImmutableList.of(result);
	}

	private com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForTypeHelper(com.google.javascript.rhino.jstype.JSType type, boolean linkToCtor) {
		if (type == null) {
			return null;
		}
		if (type.isGlobalThisType()) {
			return globalScope.getSlot(com.google.javascript.jscomp.SymbolTable.GLOBAL_THIS);
		}else
			if (type.isNominalConstructor()) {
				return linkToCtor ? globalScope.getSlot("Function") : getSymbolDeclaredBy(type.toMaybeFunctionType());
			}else
				if (type.isFunctionPrototypeType()) {
					com.google.javascript.rhino.jstype.FunctionType ownerFn = ((com.google.javascript.rhino.jstype.ObjectType) (type)).getOwnerFunction();
					if ((!(ownerFn.isConstructor())) && (!(ownerFn.isInterface()))) {
						return null;
					}
					return linkToCtor ? getSymbolDeclaredBy(ownerFn) : getSymbolForInstancesOf(ownerFn);
				}else
					if (type.isInstanceType()) {
						com.google.javascript.rhino.jstype.FunctionType ownerFn = ((com.google.javascript.rhino.jstype.ObjectType) (type)).getConstructor();
						return linkToCtor ? getSymbolDeclaredBy(ownerFn) : getSymbolForInstancesOf(ownerFn);
					}else
						if (type.isFunctionType()) {
							return linkToCtor ? globalScope.getSlot("Function") : globalScope.getSlot("Function.prototype");
						}else
							if ((type.autoboxesTo()) != null) {
								return getSymbolForTypeHelper(type.autoboxesTo(), linkToCtor);
							}else {
								return null;
							}
						
					
				
			
		
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

	<S extends com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> void addScopes(java.util.Collection<S> scopes) {
		for (S scope : scopes) {
			createScopeFrom(scope);
		}
	}

	void findScopes(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), new com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback() {
			@java.lang.Override
			public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
				createScopeFrom(t.getScope());
			}

			@java.lang.Override
			public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node p) {
			}
		});
	}

	public java.util.Collection<com.google.javascript.jscomp.SymbolTable.SymbolScope> getAllScopes() {
		return java.util.Collections.unmodifiableCollection(scopes.values());
	}

	public void addAnonymousFunctions() {
		java.util.TreeSet<com.google.javascript.jscomp.SymbolTable.SymbolScope> scopes = com.google.common.collect.Sets.newTreeSet(LEXICAL_SCOPE_ORDERING);
		for (com.google.javascript.jscomp.SymbolTable.SymbolScope scope : getAllScopes()) {
			if (scope.isLexicalScope()) {
				scopes.add(scope);
			}
		}
		for (com.google.javascript.jscomp.SymbolTable.SymbolScope scope : scopes) {
			addAnonymousFunctionsInScope(scope);
		}
	}

	private void addAnonymousFunctionsInScope(com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		com.google.javascript.jscomp.SymbolTable.Symbol sym = getSymbolForScope(scope);
		if (sym == null) {
			if (((scope.isLexicalScope()) && (!(scope.isGlobalScope()))) && ((scope.getParentScope()) != null)) {
				com.google.javascript.jscomp.SymbolTable.SymbolScope parent = scope.getParentScope();
				int count = (parent.innerAnonFunctionsWithNames)++;
				java.lang.String innerName = "function%" + count;
				scope.setSymbolForScope(declareInferredSymbol(parent, innerName, scope.getRootNode()));
			}
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
					mySymbol = myScope.ownSymbols.get(otherSymbol.getName());
					if (mySymbol == null) {
						mySymbol = copySymbolTo(otherSymbol, myScope);
					}
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

	private com.google.javascript.jscomp.SymbolTable.Symbol copySymbolTo(com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> sym, com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
		return declareSymbol(sym.getName(), sym.getType(), sym.isTypeInferred(), scope, com.google.common.base.Preconditions.checkNotNull(sym.getDeclaration().getNode()), sym.getJSDocInfo());
	}

	private com.google.javascript.jscomp.SymbolTable.Symbol addSymbol(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.jscomp.SymbolTable.SymbolScope scope, com.google.javascript.rhino.Node declNode) {
		com.google.javascript.jscomp.SymbolTable.Symbol symbol = new com.google.javascript.jscomp.SymbolTable.Symbol(name, type, inferred, scope);
		com.google.javascript.jscomp.SymbolTable.Symbol replacedSymbol = symbols.put(declNode, name, symbol);
		com.google.common.base.Preconditions.checkState((replacedSymbol == null));
		replacedSymbol = scope.ownSymbols.put(name, symbol);
		com.google.common.base.Preconditions.checkState((replacedSymbol == null));
		return symbol;
	}

	private com.google.javascript.jscomp.SymbolTable.Symbol declareSymbol(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.jscomp.SymbolTable.SymbolScope scope, com.google.javascript.rhino.Node declNode, com.google.javascript.rhino.JSDocInfo info) {
		com.google.javascript.jscomp.SymbolTable.Symbol symbol = addSymbol(name, type, inferred, scope, declNode);
		symbol.setJSDocInfo(info);
		symbol.setDeclaration(symbol.defineReferenceAt(declNode));
		return symbol;
	}

	private void removeSymbol(com.google.javascript.jscomp.SymbolTable.Symbol s) {
		com.google.javascript.jscomp.SymbolTable.SymbolScope scope = getScope(s);
		if ((scope.ownSymbols.remove(s.getName())) != s) {
			throw new java.lang.IllegalStateException(("Symbol not found in scope " + s));
		}
		if ((symbols.remove(s.getDeclaration().getNode(), s.getName())) != s) {
			throw new java.lang.IllegalStateException(("Symbol not found in table " + s));
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

	void fillPropertyScopes() {
		java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> types = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.SymbolTable.Symbol sym : getAllSymbols()) {
			com.google.javascript.rhino.jstype.ObjectType type = com.google.javascript.rhino.jstype.ObjectType.cast(sym.getType());
			if ((type != null) && (((type.getReferenceName()) == null) || (sym.getName().equals(type.getReferenceName())))) {
				types.add(sym);
			}
		}
		java.util.Collections.sort(types, java.util.Collections.reverseOrder(getNaturalSymbolOrdering()));
		for (com.google.javascript.jscomp.SymbolTable.Symbol s : types) {
			createPropertyScopeFor(s);
		}
	}

	void fillPropertySymbols(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.SymbolTable.PropertyRefCollector(compiler).process(externs, root);
	}

	void fillJSDocInfo(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), new com.google.javascript.jscomp.SymbolTable.JSDocInfoCollector(compiler.getTypeRegistry()));
		for (com.google.javascript.jscomp.SymbolTable.Symbol sym : getAllSymbols()) {
			com.google.javascript.rhino.JSDocInfo info = sym.getJSDocInfo();
			if (info == null) {
				continue;
			}
			for (com.google.javascript.rhino.JSDocInfo.Marker marker : info.getMarkers()) {
				com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> pos = marker.getNameNode();
				if (pos == null) {
					continue;
				}
				com.google.javascript.rhino.Node paramNode = pos.getItem();
				com.google.javascript.jscomp.SymbolTable.Symbol param = getParameterInFunction(sym, paramNode.getString());
				if (param != null) {
					param.defineReferenceAt(paramNode);
				}
			}
		}
	}

	private void createPropertyScopeFor(com.google.javascript.jscomp.SymbolTable.Symbol s) {
		if ((s.propertyScope) != null) {
			return ;
		}
		com.google.javascript.jscomp.SymbolTable.SymbolScope parentPropertyScope = null;
		com.google.javascript.rhino.jstype.ObjectType type = (s.getType()) == null ? null : s.getType().toObjectType();
		if (type == null) {
			return ;
		}
		com.google.javascript.rhino.jstype.ObjectType proto = type.getParentScope();
		if (((proto != null) && (proto != type)) && ((proto.getConstructor()) != null)) {
			com.google.javascript.jscomp.SymbolTable.Symbol parentSymbol = getSymbolForInstancesOf(proto.getConstructor());
			if (parentSymbol != null) {
				createPropertyScopeFor(parentSymbol);
				parentPropertyScope = parentSymbol.getPropertyScope();
			}
		}
		com.google.javascript.rhino.jstype.ObjectType instanceType = type;
		java.lang.Iterable<java.lang.String> propNames = type.getOwnPropertyNames();
		if (instanceType.isFunctionPrototypeType()) {
			instanceType = instanceType.getOwnerFunction().getInstanceType();
			java.util.Set<java.lang.String> set = com.google.common.collect.Sets.newHashSet(propNames);
			com.google.common.collect.Iterables.addAll(set, instanceType.getOwnPropertyNames());
			propNames = set;
		}
		s.setPropertyScope(new com.google.javascript.jscomp.SymbolTable.SymbolScope(null, parentPropertyScope, type, s));
		for (java.lang.String propName : propNames) {
			com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> newProp = instanceType.getSlot(propName);
			if ((newProp.getDeclaration()) == null) {
				continue;
			}
			com.google.javascript.jscomp.SymbolTable.Symbol oldProp = symbols.get(newProp.getDeclaration().getNode(), (((s.getName()) + ".") + propName));
			if (oldProp != null) {
				removeSymbol(oldProp);
			}
			if ((symbols.get(newProp.getDeclaration().getNode(), newProp.getName())) != null) {
				com.google.javascript.jscomp.SymbolTable.logger.warning(("Found duplicate symbol " + newProp));
				continue;
			}
			com.google.javascript.jscomp.SymbolTable.Symbol newSym = copySymbolTo(newProp, s.propertyScope);
			if (oldProp != null) {
				if ((newSym.getJSDocInfo()) == null) {
					newSym.setJSDocInfo(oldProp.getJSDocInfo());
				}
				newSym.setPropertyScope(oldProp.propertyScope);
				for (com.google.javascript.jscomp.SymbolTable.Reference ref : oldProp.references.values()) {
					newSym.defineReferenceAt(ref.getNode());
				}
			}
		}
	}

	void fillThisReferences(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.SymbolTable.ThisRefCollector(compiler).process(externs, root);
	}

	private com.google.javascript.jscomp.SymbolTable.SymbolScope createScopeFrom(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> otherScope) {
		com.google.javascript.rhino.Node otherScopeRoot = otherScope.getRootNode();
		com.google.javascript.jscomp.SymbolTable.SymbolScope myScope = scopes.get(otherScopeRoot);
		if (myScope == null) {
			com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> otherScopeParent = otherScope.getParentScope();
			if (otherScopeParent == null) {
				com.google.common.base.Preconditions.checkState(((globalScope) == null), "Global scopes found at different roots");
			}
			myScope = new com.google.javascript.jscomp.SymbolTable.SymbolScope(otherScopeRoot, (otherScopeParent == null ? null : createScopeFrom(otherScopeParent)), otherScope.getTypeOfThis(), null);
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

		private com.google.javascript.jscomp.SymbolTable.SymbolScope propertyScope = null;

		private com.google.javascript.jscomp.SymbolTable.Reference declaration = null;

		private com.google.javascript.rhino.JSDocInfo docInfo = null;

		Symbol(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
			super(name, type, inferred);
			this.scope = scope;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SymbolTable.Reference getDeclaration() {
			return declaration;
		}

		public com.google.javascript.rhino.jstype.FunctionType getFunctionType() {
			return com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(getType());
		}

		public com.google.javascript.jscomp.SymbolTable.Reference defineReferenceAt(com.google.javascript.rhino.Node n) {
			com.google.javascript.jscomp.SymbolTable.Reference result = references.get(n);
			if (result == null) {
				result = new com.google.javascript.jscomp.SymbolTable.Reference(com.google.javascript.jscomp.SymbolTable.Symbol.this, n);
				references.put(n, result);
			}
			return result;
		}

		void setDeclaration(com.google.javascript.jscomp.SymbolTable.Reference ref) {
			com.google.common.base.Preconditions.checkState(((com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration) == null));
			com.google.javascript.jscomp.SymbolTable.Symbol.this.declaration = ref;
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

		public com.google.javascript.jscomp.SymbolTable.SymbolScope getPropertyScope() {
			return propertyScope;
		}

		void setPropertyScope(com.google.javascript.jscomp.SymbolTable.SymbolScope scope) {
			com.google.javascript.jscomp.SymbolTable.Symbol.this.propertyScope = scope;
			if (scope != null) {
				com.google.javascript.jscomp.SymbolTable.Symbol.this.propertyScope.setSymbolForScope(com.google.javascript.jscomp.SymbolTable.Symbol.this);
			}
		}

		@java.lang.Override
		public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
			return docInfo;
		}

		void setJSDocInfo(com.google.javascript.rhino.JSDocInfo info) {
			com.google.javascript.jscomp.SymbolTable.Symbol.this.docInfo = info;
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

		private final int scopeDepth;

		private int innerAnonFunctionsWithNames = 0;

		private com.google.javascript.jscomp.SymbolTable.Symbol mySymbol;

		SymbolScope(com.google.javascript.rhino.Node rootNode, @javax.annotation.Nullable
		com.google.javascript.jscomp.SymbolTable.SymbolScope parent, com.google.javascript.rhino.jstype.JSType typeOfThis, com.google.javascript.jscomp.SymbolTable.Symbol mySymbol) {
			this.rootNode = rootNode;
			this.parent = parent;
			this.typeOfThis = typeOfThis;
			this.scopeDepth = (parent == null) ? 0 : (parent.getScopeDepth()) + 1;
			com.google.javascript.jscomp.SymbolTable.SymbolScope.this.mySymbol = mySymbol;
		}

		com.google.javascript.jscomp.SymbolTable.Symbol getSymbolForScope() {
			return mySymbol;
		}

		void setSymbolForScope(com.google.javascript.jscomp.SymbolTable.Symbol sym) {
			com.google.javascript.jscomp.SymbolTable.SymbolScope.this.mySymbol = sym;
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
			com.google.javascript.jscomp.SymbolTable.Symbol ancestor = (parent) == null ? null : parent.getSlot(name);
			if (ancestor != null) {
				return ancestor;
			}
			int dot = name.lastIndexOf('.');
			if (dot != (-1)) {
				com.google.javascript.jscomp.SymbolTable.Symbol owner = getSlot(name.substring(0, dot));
				if ((owner != null) && ((owner.getPropertyScope()) != null)) {
					return owner.getPropertyScope().getSlot(name.substring((dot + 1)));
				}
			}
			return null;
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
			return ((getParentScope()) == null) && ((getRootNode()) != null);
		}

		public boolean isPropertyScope() {
			return (getRootNode()) == null;
		}

		public boolean isLexicalScope() {
			return (getRootNode()) != null;
		}

		public int getScopeDepth() {
			return scopeDepth;
		}

		@java.lang.Override
		public java.lang.String toString() {
			com.google.javascript.rhino.Node n = getRootNode();
			if (n != null) {
				return (("Scope@" + (n.getSourceFileName())) + ":") + (n.getLineno());
			}else {
				return "PropertyScope@" + (getSymbolForScope());
			}
		}
	}

	private class PropertyRefCollector extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		PropertyRefCollector(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), com.google.javascript.jscomp.SymbolTable.PropertyRefCollector.this);
		}

		private void maybeDefineReference(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.SymbolTable.Symbol ownerSymbol) {
			java.lang.String propName = n.getLastChild().getString();
			if ((ownerSymbol != null) && ((ownerSymbol.getPropertyScope()) != null)) {
				com.google.javascript.jscomp.SymbolTable.Symbol prop = ownerSymbol.getPropertyScope().getSlot(propName);
				if (prop != null) {
					prop.defineReferenceAt(n);
				}
			}
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				com.google.javascript.rhino.jstype.JSType owner = n.getFirstChild().getJSType();
				if (owner == null) {
					return ;
				}
				if (owner.isGlobalThisType()) {
					com.google.javascript.jscomp.SymbolTable.Symbol sym = globalScope.getSlot(n.getLastChild().getString());
					if (sym != null) {
						sym.defineReferenceAt(n);
					}
				}else
					if (owner.isNominalConstructor()) {
						maybeDefineReference(n, getSymbolDeclaredBy(owner.toMaybeFunctionType()));
					}else {
						for (com.google.javascript.jscomp.SymbolTable.Symbol ctor : getAllSymbolsForType(owner)) {
							maybeDefineReference(n, getSymbolForInstancesOf(ctor));
						}
					}
				
			}
		}
	}

	private class ThisRefCollector extends com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback implements com.google.javascript.jscomp.CompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final java.util.List<com.google.javascript.jscomp.SymbolTable.Symbol> thisStack = com.google.common.collect.Lists.newArrayList();

		ThisRefCollector(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
			com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), com.google.javascript.jscomp.SymbolTable.ThisRefCollector.this);
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.jscomp.SymbolTable.Symbol symbol = null;
			if (t.inGlobalScope()) {
				com.google.javascript.rhino.Node firstInputRoot = t.getScopeRoot().getLastChild().getFirstChild();
				if (firstInputRoot != null) {
					symbol = addSymbol(com.google.javascript.jscomp.SymbolTable.GLOBAL_THIS, registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS), false, globalScope, firstInputRoot);
					symbol.setDeclaration(new com.google.javascript.jscomp.SymbolTable.Reference(symbol, firstInputRoot));
				}
			}else {
				com.google.javascript.jscomp.SymbolTable.SymbolScope scope = scopes.get(t.getScopeRoot());
				com.google.common.base.Preconditions.checkNotNull(scope);
				com.google.javascript.jscomp.SymbolTable.Symbol scopeSymbol = getSymbolForScope(scope);
				if (scopeSymbol != null) {
					com.google.javascript.jscomp.SymbolTable.SymbolScope propScope = scopeSymbol.getPropertyScope();
					if (propScope != null) {
						symbol = propScope.getOwnSlot("this");
						if (symbol == null) {
							com.google.javascript.rhino.jstype.JSType rootType = t.getScopeRoot().getJSType();
							com.google.javascript.rhino.jstype.FunctionType fnType = rootType == null ? null : rootType.toMaybeFunctionType();
							com.google.javascript.rhino.jstype.JSType type = fnType == null ? null : fnType.getTypeOfThis();
							symbol = addSymbol("this", type, false, scope, t.getScopeRoot());
						}
					}
				}
			}
			thisStack.add(symbol);
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			thisStack.remove(((thisStack.size()) - 1));
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.THIS)) {
				return ;
			}
			com.google.javascript.jscomp.SymbolTable.Symbol symbol = thisStack.get(((thisStack.size()) - 1));
			if (symbol != null) {
				com.google.javascript.jscomp.SymbolTable.Reference ref = symbol.defineReferenceAt(n);
				if ((symbol.getDeclaration()) == null) {
					symbol.setDeclaration(ref);
				}
			}
		}
	}

	private class JSDocInfoCollector extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

		private JSDocInfoCollector(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
			this.registry = registry;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getJSDocInfo()) != null) {
				com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
				docInfos.add(info);
				for (com.google.javascript.rhino.Node typeAst : info.getTypeNodes()) {
					com.google.javascript.jscomp.SymbolTable.SymbolScope scope = scopes.get(t.getScopeRoot());
					visitTypeNode((scope == null ? globalScope : scope), typeAst);
				}
			}
		}

		public void visitTypeNode(com.google.javascript.jscomp.SymbolTable.SymbolScope scope, com.google.javascript.rhino.Node n) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				com.google.javascript.jscomp.SymbolTable.Symbol symbol = scope.getSlot(n.getString());
				if (symbol == null) {
					com.google.javascript.rhino.jstype.JSType type = registry.getType(n.getString());
					com.google.javascript.rhino.jstype.JSType autobox = type == null ? null : type.autoboxesTo();
					symbol = (autobox == null) ? null : getSymbolForTypeHelper(autobox, true);
				}
				if (symbol != null) {
					symbol.defineReferenceAt(n);
				}
			}
			for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
				visitTypeNode(scope, child);
			}
		}
	}

	private final com.google.common.collect.Ordering<java.lang.String> SOURCE_NAME_ORDERING = com.google.common.collect.Ordering.natural().nullsFirst();

	private final com.google.common.collect.Ordering<com.google.javascript.rhino.Node> NODE_ORDERING = new com.google.common.collect.Ordering<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public int compare(com.google.javascript.rhino.Node a, com.google.javascript.rhino.Node b) {
			int result = SOURCE_NAME_ORDERING.compare(a.getSourceFileName(), b.getSourceFileName());
			if (result != 0) {
				return result;
			}
			return (a.getSourcePosition()) - (b.getSourcePosition());
		}
	};

	private final com.google.common.collect.Ordering<com.google.javascript.jscomp.SymbolTable.SymbolScope> LEXICAL_SCOPE_ORDERING = new com.google.common.collect.Ordering<com.google.javascript.jscomp.SymbolTable.SymbolScope>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.SymbolTable.SymbolScope a, com.google.javascript.jscomp.SymbolTable.SymbolScope b) {
			com.google.common.base.Preconditions.checkState(((a.isLexicalScope()) && (b.isLexicalScope())), "We can only sort lexical scopes");
			return NODE_ORDERING.compare(a.getRootNode(), b.getRootNode());
		}
	};

	private final com.google.common.collect.Ordering<com.google.javascript.jscomp.SymbolTable.Symbol> SYMBOL_ORDERING = new com.google.common.collect.Ordering<com.google.javascript.jscomp.SymbolTable.Symbol>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.SymbolTable.Symbol a, com.google.javascript.jscomp.SymbolTable.Symbol b) {
			com.google.javascript.jscomp.SymbolTable.SymbolScope scopeA = getScope(a);
			com.google.javascript.jscomp.SymbolTable.SymbolScope scopeB = getScope(b);
			int result = (scopeA.getScopeDepth()) - (scopeB.getScopeDepth());
			if (result != 0) {
				return result;
			}
			if (((a.getDeclaration()) == null) && ((b.getDeclaration()) == null)) {
				return a.getName().compareTo(b.getName());
			}else
				if ((a.getDeclaration()) == null) {
					return -1;
				}else
					if ((b.getDeclaration()) == null) {
						return 1;
					}
				
			
			if ((b.getName().endsWith(".prototype")) && (b.getName().equals(((a.getName()) + ".prototype")))) {
				return -1;
			}else
				if ((a.getName().endsWith(".prototype")) && (a.getName().equals(((b.getName()) + ".prototype")))) {
					return 1;
				}
			
			return NODE_ORDERING.compare(a.getDeclaration().getNode(), b.getDeclaration().getNode());
		}
	};
}

