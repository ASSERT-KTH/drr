

package com.google.javascript.jscomp;


class GlobalNamespace {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.Node root;

	private final com.google.javascript.rhino.Node externsRoot;

	private boolean inExterns;

	private com.google.javascript.jscomp.Scope externsScope;

	private boolean generated = false;

	private int currentPreOrderIndex = 0;

	private java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> globalNames = new java.util.ArrayList<com.google.javascript.jscomp.GlobalNamespace.Name>();

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name> nameMap = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name>();

	GlobalNamespace(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node root) {
		this(compiler, null, root);
	}

	GlobalNamespace(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node externsRoot, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.GlobalNamespace.this.compiler = compiler;
		this.externsRoot = externsRoot;
		this.root = root;
	}

	java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> getNameForest() {
		if (!(generated)) {
			process();
		}
		return globalNames;
	}

	java.util.Map<java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name> getNameIndex() {
		if (!(generated)) {
			process();
		}
		return nameMap;
	}

	void scanNewNodes(com.google.javascript.jscomp.Scope scope, java.util.Set<com.google.javascript.rhino.Node> newNodes) {
		com.google.javascript.jscomp.NodeTraversal t = new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace(new com.google.javascript.jscomp.GlobalNamespace.NodeFilter(newNodes)));
		t.traverseAtScope(scope);
	}

	private static class NodeFilter implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		private final java.util.Set<com.google.javascript.rhino.Node> newNodes;

		NodeFilter(java.util.Set<com.google.javascript.rhino.Node> newNodes) {
			this.newNodes = newNodes;
		}

		public boolean apply(com.google.javascript.rhino.Node n) {
			if (!(n.isQualifiedName())) {
				return false;
			}
			com.google.javascript.rhino.Node current;
			for (current = n; (current.getType()) == (com.google.javascript.rhino.Token.GETPROP); current = current.getFirstChild()) {
				if (newNodes.contains(current)) {
					return true;
				}
			}
			return ((current.getType()) == (com.google.javascript.rhino.Token.NAME)) && (newNodes.contains(current));
		}
	}

	private void process() {
		if ((externsRoot) != null) {
			inExterns = true;
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externsRoot, new com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace());
		}
		inExterns = false;
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace());
		generated = true;
	}

	private boolean isGlobalNameReference(java.lang.String name, com.google.javascript.jscomp.Scope s) {
		java.lang.String topVarName = getTopVarName(name);
		return isGlobalVarReference(topVarName, s);
	}

	private java.lang.String getTopVarName(java.lang.String name) {
		int firstDotIndex = name.indexOf('.');
		return firstDotIndex == (-1) ? name : name.substring(0, firstDotIndex);
	}

	private boolean isGlobalVarReference(java.lang.String name, com.google.javascript.jscomp.Scope s) {
		com.google.javascript.jscomp.Scope.Var v = s.getVar(name);
		if ((v == null) && ((externsScope) != null)) {
			v = externsScope.getVar(name);
		}
		return (v != null) && (!(v.isLocal()));
	}

	private boolean isGlobalScope(com.google.javascript.jscomp.Scope s) {
		return (s.getParent()) == null;
	}

	private class BuildGlobalNamespace implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodeFilter;

		BuildGlobalNamespace() {
			this(null);
		}

		BuildGlobalNamespace(com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodeFilter) {
			this.nodeFilter = nodeFilter;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			collect(t, n, parent);
			return true;
		}

		public void collect(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((nodeFilter) != null) && (!(nodeFilter.apply(n)))) {
				return ;
			}
			if (((externsRoot) != null) && (n == (externsRoot))) {
				externsScope = t.getScope();
			}
			java.lang.String name;
			boolean isSet = false;
			com.google.javascript.jscomp.GlobalNamespace.Name.Type type = com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER;
			boolean isPropAssign = false;
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GET :
				case com.google.javascript.rhino.Token.SET :
				case com.google.javascript.rhino.Token.STRING :
					name = null;
					if ((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT))) {
						name = getNameForObjLitKey(n);
					}
					if (name == null)
						return ;
					
					isSet = true;
					switch (n.getType()) {
						case com.google.javascript.rhino.Token.STRING :
							type = getValueType(n.getFirstChild());
							break;
						case com.google.javascript.rhino.Token.GET :
							type = com.google.javascript.jscomp.GlobalNamespace.Name.Type.GET;
							break;
						case com.google.javascript.rhino.Token.SET :
							type = com.google.javascript.jscomp.GlobalNamespace.Name.Type.SET;
							break;
						default :
							throw new java.lang.IllegalStateException(("unexpected:" + n));
					}
					break;
				case com.google.javascript.rhino.Token.NAME :
					if (parent != null) {
						switch (parent.getType()) {
							case com.google.javascript.rhino.Token.VAR :
								isSet = true;
								com.google.javascript.rhino.Node rvalue = n.getFirstChild();
								type = (rvalue == null) ? com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER : getValueType(rvalue);
								break;
							case com.google.javascript.rhino.Token.ASSIGN :
								if ((parent.getFirstChild()) == n) {
									isSet = true;
									type = getValueType(n.getNext());
								}
								break;
							case com.google.javascript.rhino.Token.GETPROP :
								return ;
							case com.google.javascript.rhino.Token.FUNCTION :
								com.google.javascript.rhino.Node gramps = parent.getParent();
								if ((gramps == null) || (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(parent)))
									return ;
								
								isSet = true;
								type = com.google.javascript.jscomp.GlobalNamespace.Name.Type.FUNCTION;
								break;
						}
					}
					name = n.getString();
					break;
				case com.google.javascript.rhino.Token.GETPROP :
					if (parent != null) {
						switch (parent.getType()) {
							case com.google.javascript.rhino.Token.ASSIGN :
								if ((parent.getFirstChild()) == n) {
									isSet = true;
									type = getValueType(n.getNext());
									isPropAssign = true;
								}
								break;
							case com.google.javascript.rhino.Token.GETPROP :
								return ;
						}
					}
					name = n.getQualifiedName();
					if (name == null)
						return ;
					
					break;
				default :
					return ;
			}
			com.google.javascript.jscomp.Scope scope = t.getScope();
			if (!(isGlobalNameReference(name, scope))) {
				return ;
			}
			if (isSet) {
				if (isGlobalScope(scope)) {
					handleSetFromGlobal(t, n, parent, name, isPropAssign, type);
				}else {
					handleSetFromLocal(t, n, parent, name);
				}
			}else {
				handleGet(t, n, parent, name);
			}
		}

		java.lang.String getNameForObjLitKey(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			com.google.common.base.Preconditions.checkState(((parent.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)));
			com.google.javascript.rhino.Node gramps = parent.getParent();
			if (gramps == null) {
				return null;
			}
			com.google.javascript.rhino.Node greatGramps = gramps.getParent();
			java.lang.String name;
			switch (gramps.getType()) {
				case com.google.javascript.rhino.Token.NAME :
					if ((greatGramps == null) || ((greatGramps.getType()) != (com.google.javascript.rhino.Token.VAR))) {
						return null;
					}
					name = gramps.getString();
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node lvalue = gramps.getFirstChild();
					name = lvalue.getQualifiedName();
					break;
				case com.google.javascript.rhino.Token.STRING :
					if ((greatGramps != null) && ((greatGramps.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT))) {
						name = getNameForObjLitKey(gramps);
					}else {
						return null;
					}
					break;
				default :
					return null;
			}
			if (name != null) {
				java.lang.String key = n.getString();
				if (com.google.javascript.rhino.TokenStream.isJSIdentifier(key)) {
					return (name + '.') + key;
				}
			}
			return null;
		}

		com.google.javascript.jscomp.GlobalNamespace.Name.Type getValueType(com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.OBJECTLIT :
					return com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT;
				case com.google.javascript.rhino.Token.FUNCTION :
					return com.google.javascript.jscomp.GlobalNamespace.Name.Type.FUNCTION;
				case com.google.javascript.rhino.Token.OR :
					return getValueType(n.getLastChild());
				case com.google.javascript.rhino.Token.HOOK :
					com.google.javascript.rhino.Node second = n.getFirstChild().getNext();
					com.google.javascript.jscomp.GlobalNamespace.Name.Type t = getValueType(second);
					if (t != (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER))
						return t;
					
					com.google.javascript.rhino.Node third = second.getNext();
					return getValueType(third);
			}
			return com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER;
		}

		void handleSetFromGlobal(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String name, boolean isPropAssign, com.google.javascript.jscomp.GlobalNamespace.Name.Type type) {
			if (maybeHandlePrototypePrefix(t, n, parent, name))
				return ;
			
			com.google.javascript.jscomp.GlobalNamespace.Name nameObj = getOrCreateName(name);
			nameObj.type = type;
			com.google.javascript.jscomp.GlobalNamespace.Ref set = new com.google.javascript.jscomp.GlobalNamespace.Ref(t, n, com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL, ((currentPreOrderIndex)++));
			nameObj.addRef(set);
			if (isNestedAssign(parent)) {
				com.google.javascript.jscomp.GlobalNamespace.Ref get = new com.google.javascript.jscomp.GlobalNamespace.Ref(t, n, com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET, ((currentPreOrderIndex)++));
				nameObj.addRef(get);
				com.google.javascript.jscomp.GlobalNamespace.Ref.markTwins(set, get);
			}else
				if (isConstructorOrEnumDeclaration(n, parent)) {
					nameObj.setIsClassOrEnum();
				}
			
		}

		private boolean isConstructorOrEnumDeclaration(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.JSDocInfo info;
			int valueNodeType;
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.ASSIGN :
					info = parent.getJSDocInfo();
					valueNodeType = n.getNext().getType();
					break;
				case com.google.javascript.rhino.Token.VAR :
					info = n.getJSDocInfo();
					if (info == null) {
						info = parent.getJSDocInfo();
					}
					com.google.javascript.rhino.Node valueNode = n.getFirstChild();
					valueNodeType = (valueNode != null) ? valueNode.getType() : com.google.javascript.rhino.Token.VOID;
					break;
				default :
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(parent)) {
						info = parent.getJSDocInfo();
						valueNodeType = com.google.javascript.rhino.Token.FUNCTION;
						break;
					}
					return false;
			}
			return (info != null) && (((info.isConstructor()) && (valueNodeType == (com.google.javascript.rhino.Token.FUNCTION))) || ((info.hasEnumParameterType()) && (valueNodeType == (com.google.javascript.rhino.Token.OBJECTLIT))));
		}

		void handleSetFromLocal(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String name) {
			if (maybeHandlePrototypePrefix(t, n, parent, name))
				return ;
			
			com.google.javascript.jscomp.GlobalNamespace.Name node = getOrCreateName(name);
			com.google.javascript.jscomp.GlobalNamespace.Ref set = new com.google.javascript.jscomp.GlobalNamespace.Ref(t, n, com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_LOCAL, ((currentPreOrderIndex)++));
			node.addRef(set);
			if (isNestedAssign(parent)) {
				com.google.javascript.jscomp.GlobalNamespace.Ref get = new com.google.javascript.jscomp.GlobalNamespace.Ref(t, n, com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET, ((currentPreOrderIndex)++));
				node.addRef(get);
				com.google.javascript.jscomp.GlobalNamespace.Ref.markTwins(set, get);
			}
		}

		void handleGet(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String name) {
			if (maybeHandlePrototypePrefix(t, n, parent, name))
				return ;
			
			com.google.javascript.jscomp.GlobalNamespace.Ref.Type type = com.google.javascript.jscomp.GlobalNamespace.Ref.Type.DIRECT_GET;
			if (parent != null) {
				switch (parent.getType()) {
					case com.google.javascript.rhino.Token.IF :
					case com.google.javascript.rhino.Token.TYPEOF :
					case com.google.javascript.rhino.Token.VOID :
					case com.google.javascript.rhino.Token.NOT :
					case com.google.javascript.rhino.Token.BITNOT :
					case com.google.javascript.rhino.Token.POS :
					case com.google.javascript.rhino.Token.NEG :
						break;
					case com.google.javascript.rhino.Token.CALL :
						type = (n == (parent.getFirstChild())) ? com.google.javascript.jscomp.GlobalNamespace.Ref.Type.CALL_GET : com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						break;
					case com.google.javascript.rhino.Token.NEW :
						type = (n == (parent.getFirstChild())) ? com.google.javascript.jscomp.GlobalNamespace.Ref.Type.DIRECT_GET : com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						break;
					case com.google.javascript.rhino.Token.OR :
					case com.google.javascript.rhino.Token.AND :
						type = determineGetTypeForHookOrBooleanExpr(t, parent, name);
						break;
					case com.google.javascript.rhino.Token.HOOK :
						if (n != (parent.getFirstChild())) {
							type = determineGetTypeForHookOrBooleanExpr(t, parent, name);
						}
						break;
					default :
						type = com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						break;
				}
			}
			handleGet(t, n, parent, name, type);
		}

		com.google.javascript.jscomp.GlobalNamespace.Ref.Type determineGetTypeForHookOrBooleanExpr(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node parent, java.lang.String name) {
			com.google.javascript.rhino.Node prev = parent;
			for (com.google.javascript.rhino.Node anc : parent.getAncestors()) {
				switch (anc.getType()) {
					case com.google.javascript.rhino.Token.EXPR_RESULT :
					case com.google.javascript.rhino.Token.VAR :
					case com.google.javascript.rhino.Token.IF :
					case com.google.javascript.rhino.Token.WHILE :
					case com.google.javascript.rhino.Token.FOR :
					case com.google.javascript.rhino.Token.TYPEOF :
					case com.google.javascript.rhino.Token.VOID :
					case com.google.javascript.rhino.Token.NOT :
					case com.google.javascript.rhino.Token.BITNOT :
					case com.google.javascript.rhino.Token.POS :
					case com.google.javascript.rhino.Token.NEG :
						return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.DIRECT_GET;
					case com.google.javascript.rhino.Token.HOOK :
						if ((anc.getFirstChild()) == prev) {
							return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.DIRECT_GET;
						}
						break;
					case com.google.javascript.rhino.Token.ASSIGN :
						if (!(name.equals(anc.getFirstChild().getQualifiedName()))) {
							return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						}
						break;
					case com.google.javascript.rhino.Token.NAME :
						if (!(name.equals(anc.getString()))) {
							return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						}
						break;
					case com.google.javascript.rhino.Token.CALL :
						if ((anc.getFirstChild()) != prev) {
							return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
						}
						break;
				}
				prev = anc;
			}
			return com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET;
		}

		void handleGet(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String name, com.google.javascript.jscomp.GlobalNamespace.Ref.Type type) {
			com.google.javascript.jscomp.GlobalNamespace.Name node = getOrCreateName(name);
			node.addRef(new com.google.javascript.jscomp.GlobalNamespace.Ref(t, n, type, ((currentPreOrderIndex)++)));
		}

		boolean maybeHandlePrototypePrefix(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String name) {
			int numLevelsToRemove;
			java.lang.String prefix;
			if (name.endsWith(".prototype")) {
				numLevelsToRemove = 1;
				prefix = name.substring(0, ((name.length()) - 10));
			}else {
				int i = name.indexOf(".prototype.");
				if (i == (-1)) {
					return false;
				}
				prefix = name.substring(0, i);
				numLevelsToRemove = 2;
				i = name.indexOf('.', (i + 11));
				while (i >= 0) {
					numLevelsToRemove++;
					i = name.indexOf('.', (i + 1));
				} 
			}
			if ((parent != null) && (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent))) {
				return true;
			}
			for (int i = 0; i < numLevelsToRemove; i++) {
				parent = n;
				n = n.getFirstChild();
			}
			handleGet(t, n, parent, prefix, com.google.javascript.jscomp.GlobalNamespace.Ref.Type.PROTOTYPE_GET);
			return true;
		}

		boolean isNestedAssign(com.google.javascript.rhino.Node parent) {
			return ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && (!(com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent.getParent())));
		}

		com.google.javascript.jscomp.GlobalNamespace.Name getOrCreateName(java.lang.String name) {
			com.google.javascript.jscomp.GlobalNamespace.Name node = nameMap.get(name);
			if (node == null) {
				int i = name.lastIndexOf('.');
				if (i >= 0) {
					java.lang.String parentName = name.substring(0, i);
					com.google.javascript.jscomp.GlobalNamespace.Name parent = getOrCreateName(parentName);
					node = parent.addProperty(name.substring((i + 1)), inExterns);
				}else {
					node = new com.google.javascript.jscomp.GlobalNamespace.Name(name, null, inExterns);
					globalNames.add(node);
				}
				nameMap.put(name, node);
			}
			return node;
		}
	}

	static class Name {
		enum Type {
OBJECTLIT, FUNCTION, GET, SET, OTHER;		}

		final java.lang.String name;

		final com.google.javascript.jscomp.GlobalNamespace.Name parent;

		java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> props;

		com.google.javascript.jscomp.GlobalNamespace.Ref declaration;

		private java.util.List<com.google.javascript.jscomp.GlobalNamespace.Ref> refs;

		com.google.javascript.jscomp.GlobalNamespace.Name.Type type;

		private boolean isClassOrEnum = false;

		private boolean hasClassOrEnumDescendant = false;

		int globalSets = 0;

		int localSets = 0;

		int aliasingGets = 0;

		int totalGets = 0;

		int callGets = 0;

		boolean inExterns;

		com.google.javascript.rhino.JSDocInfo docInfo = null;

		Name(java.lang.String name, com.google.javascript.jscomp.GlobalNamespace.Name parent, boolean inExterns) {
			this.name = name;
			this.parent = parent;
			com.google.javascript.jscomp.GlobalNamespace.Name.this.type = com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER;
			com.google.javascript.jscomp.GlobalNamespace.Name.this.inExterns = inExterns;
		}

		com.google.javascript.jscomp.GlobalNamespace.Name addProperty(java.lang.String name, boolean inExterns) {
			if ((props) == null) {
				props = new java.util.ArrayList<com.google.javascript.jscomp.GlobalNamespace.Name>();
			}
			com.google.javascript.jscomp.GlobalNamespace.Name node = new com.google.javascript.jscomp.GlobalNamespace.Name(name, com.google.javascript.jscomp.GlobalNamespace.Name.this, inExterns);
			props.add(node);
			return node;
		}

		void addRef(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
			switch (ref.type) {
				case SET_FROM_GLOBAL :
					if ((declaration) == null) {
						declaration = ref;
						docInfo = com.google.javascript.jscomp.GlobalNamespace.Name.getDocInfoForDeclaration(ref);
					}
					addRefInternal(ref);
					(globalSets)++;
					break;
				case SET_FROM_LOCAL :
					addRefInternal(ref);
					(localSets)++;
					break;
				case PROTOTYPE_GET :
				case DIRECT_GET :
					addRefInternal(ref);
					(totalGets)++;
					break;
				case ALIASING_GET :
					addRefInternal(ref);
					(aliasingGets)++;
					(totalGets)++;
					break;
				case CALL_GET :
					addRefInternal(ref);
					(callGets)++;
					(totalGets)++;
					break;
				default :
					throw new java.lang.IllegalStateException();
			}
		}

		void removeRef(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
			if (((refs) != null) && (refs.remove(ref))) {
				if (ref == (declaration)) {
					declaration = null;
					if ((refs) != null) {
						for (com.google.javascript.jscomp.GlobalNamespace.Ref maybeNewDecl : refs) {
							if ((maybeNewDecl.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL)) {
								declaration = maybeNewDecl;
								break;
							}
						}
					}
				}
				switch (ref.type) {
					case SET_FROM_GLOBAL :
						(globalSets)--;
						break;
					case SET_FROM_LOCAL :
						(localSets)--;
						break;
					case PROTOTYPE_GET :
					case DIRECT_GET :
						(totalGets)--;
						break;
					case ALIASING_GET :
						(aliasingGets)--;
						(totalGets)--;
						break;
					case CALL_GET :
						(callGets)--;
						(totalGets)--;
						break;
					default :
						throw new java.lang.IllegalStateException();
				}
			}
		}

		java.util.List<com.google.javascript.jscomp.GlobalNamespace.Ref> getRefs() {
			return (refs) == null ? com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.GlobalNamespace.Ref>of() : refs;
		}

		void addRefInternal(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
			if ((refs) == null) {
				refs = com.google.common.collect.Lists.newArrayList();
			}
			refs.add(ref);
		}

		boolean canEliminate() {
			if ((!(canCollapseUnannotatedChildNames())) || ((totalGets) > 0)) {
				return false;
			}
			if ((props) != null) {
				for (com.google.javascript.jscomp.GlobalNamespace.Name n : props) {
					if (!(n.canCollapse())) {
						return false;
					}
				}
			}
			return true;
		}

		boolean isSimpleStubDeclaration() {
			if ((getRefs().size()) == 1) {
				com.google.javascript.jscomp.GlobalNamespace.Ref ref = refs.get(0);
				com.google.javascript.rhino.JSDocInfo info = ref.node.getJSDocInfo();
				if (((ref.node.getParent()) != null) && ((ref.node.getParent().getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT))) {
					return true;
				}
			}
			return false;
		}

		boolean canCollapse() {
			return ((!(inExterns)) && (!(isGetOrSetDefinition()))) && ((isClassOrEnum) || ((((parent) == null) || (parent.canCollapseUnannotatedChildNames())) && (((globalSets) > 0) || ((localSets) > 0))));
		}

		boolean isGetOrSetDefinition() {
			return ((com.google.javascript.jscomp.GlobalNamespace.Name.this.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.GET)) || ((com.google.javascript.jscomp.GlobalNamespace.Name.this.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.SET));
		}

		boolean canCollapseUnannotatedChildNames() {
			if (((((type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OTHER)) || (isGetOrSetDefinition())) || ((globalSets) != 1)) || ((localSets) != 0)) {
				return false;
			}
			com.google.common.base.Preconditions.checkNotNull(declaration);
			if ((declaration.getTwin()) != null) {
				return false;
			}
			if (isClassOrEnum) {
				return true;
			}
			if (((parent) != null) && (parent.shouldKeepKeys())) {
				return false;
			}
			if ((aliasingGets) > 0) {
				return false;
			}
			return ((parent) == null) || (parent.canCollapseUnannotatedChildNames());
		}

		boolean shouldKeepKeys() {
			return ((type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT)) && ((aliasingGets) > 0);
		}

		boolean needsToBeStubbed() {
			return ((globalSets) == 0) && ((localSets) > 0);
		}

		void setIsClassOrEnum() {
			isClassOrEnum = true;
			for (com.google.javascript.jscomp.GlobalNamespace.Name ancestor = parent; ancestor != null; ancestor = ancestor.parent) {
				ancestor.hasClassOrEnumDescendant = true;
			}
		}

		boolean isNamespace() {
			return (hasClassOrEnumDescendant) && ((type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT));
		}

		boolean isSimpleName() {
			return (parent) == null;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((((((((((((fullName()) + " (") + (type)) + "): globalSets=") + (globalSets)) + ", localSets=") + (localSets)) + ", totalGets=") + (totalGets)) + ", aliasingGets=") + (aliasingGets)) + ", callGets=") + (callGets);
		}

		java.lang.String fullName() {
			return (parent) == null ? name : ((parent.fullName()) + '.') + (name);
		}

		private static com.google.javascript.rhino.JSDocInfo getDocInfoForDeclaration(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
			if ((ref.node) != null) {
				com.google.javascript.rhino.Node refParent = ref.node.getParent();
				switch (refParent.getType()) {
					case com.google.javascript.rhino.Token.FUNCTION :
					case com.google.javascript.rhino.Token.ASSIGN :
						return refParent.getJSDocInfo();
					case com.google.javascript.rhino.Token.VAR :
						return (ref.node) == (refParent.getFirstChild()) ? refParent.getJSDocInfo() : ref.node.getJSDocInfo();
				}
			}
			return null;
		}
	}

	static class Ref {
		enum Type {
SET_FROM_GLOBAL, SET_FROM_LOCAL, PROTOTYPE_GET, ALIASING_GET, DIRECT_GET, CALL_GET;		}

		com.google.javascript.rhino.Node node;

		final com.google.javascript.jscomp.GlobalNamespace.Ref.Type type;

		final com.google.javascript.jscomp.CompilerInput source;

		final com.google.javascript.jscomp.Scope scope;

		final int preOrderIndex;

		private com.google.javascript.jscomp.GlobalNamespace.Ref twin = null;

		Ref(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node name, com.google.javascript.jscomp.GlobalNamespace.Ref.Type type, int index) {
			com.google.javascript.jscomp.GlobalNamespace.Ref.this.node = name;
			this.source = t.getInput();
			this.type = type;
			this.scope = t.getScope();
			this.preOrderIndex = index;
		}

		private Ref(com.google.javascript.jscomp.GlobalNamespace.Ref original, com.google.javascript.jscomp.GlobalNamespace.Ref.Type type, int index) {
			com.google.javascript.jscomp.GlobalNamespace.Ref.this.node = original.node;
			this.source = original.source;
			this.type = type;
			this.scope = original.scope;
			this.preOrderIndex = index;
		}

		private Ref(com.google.javascript.jscomp.GlobalNamespace.Ref.Type type, int index) {
			this.type = type;
			this.source = null;
			this.scope = null;
			this.preOrderIndex = index;
		}

		com.google.javascript.jscomp.JSModule getModule() {
			return (source) == null ? null : source.getModule();
		}

		java.lang.String getSourceName() {
			return (source) == null ? "" : source.getName();
		}

		com.google.javascript.jscomp.GlobalNamespace.Ref getTwin() {
			return twin;
		}

		boolean isSet() {
			return ((type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL)) || ((type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_LOCAL));
		}

		static void markTwins(com.google.javascript.jscomp.GlobalNamespace.Ref a, com.google.javascript.jscomp.GlobalNamespace.Ref b) {
			com.google.common.base.Preconditions.checkArgument(((((a.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET)) || ((b.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET))) && (((((a.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL)) || ((a.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_LOCAL))) || ((b.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL))) || ((b.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_LOCAL)))));
			a.twin = b;
			b.twin = a;
		}

		com.google.javascript.jscomp.GlobalNamespace.Ref cloneAndReclassify(com.google.javascript.jscomp.GlobalNamespace.Ref.Type type) {
			return new com.google.javascript.jscomp.GlobalNamespace.Ref(com.google.javascript.jscomp.GlobalNamespace.Ref.this, type, com.google.javascript.jscomp.GlobalNamespace.Ref.this.preOrderIndex);
		}

		static com.google.javascript.jscomp.GlobalNamespace.Ref createRefForTesting(com.google.javascript.jscomp.GlobalNamespace.Ref.Type type) {
			return new com.google.javascript.jscomp.GlobalNamespace.Ref(type, (-1));
		}
	}
}

