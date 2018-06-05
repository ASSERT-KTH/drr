

package com.google.javascript.jscomp;


class CollapseProperties implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNSAFE_NAMESPACE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNSAFE_NAMESPACE", "incomplete alias created for namespace {0}");

	static final com.google.javascript.jscomp.DiagnosticType NAMESPACE_REDEFINED_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NAMESPACE_REDEFINED", "namespace {0} should not be redefined");

	static final com.google.javascript.jscomp.DiagnosticType UNSAFE_THIS = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNSAFE_THIS", "dangerous use of 'this' in static method {0}");

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> globalNames;

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name> nameMap;

	private final boolean collapsePropertiesOnExternTypes;

	private final boolean inlineAliases;

	CollapseProperties(com.google.javascript.jscomp.AbstractCompiler compiler, boolean collapsePropertiesOnExternTypes, boolean inlineAliases) {
		com.google.javascript.jscomp.CollapseProperties.this.compiler = compiler;
		this.collapsePropertiesOnExternTypes = collapsePropertiesOnExternTypes;
		this.inlineAliases = inlineAliases;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.GlobalNamespace namespace;
		if (collapsePropertiesOnExternTypes) {
			namespace = new com.google.javascript.jscomp.GlobalNamespace(compiler, externs, root);
		}else {
			namespace = new com.google.javascript.jscomp.GlobalNamespace(compiler, root);
		}
		if (inlineAliases) {
			inlineAliases(namespace);
		}
		nameMap = namespace.getNameIndex();
		globalNames = namespace.getNameForest();
		checkNamespaces();
		for (com.google.javascript.jscomp.GlobalNamespace.Name n : globalNames) {
			flattenReferencesToCollapsibleDescendantNames(n, n.getName());
		}
		for (com.google.javascript.jscomp.GlobalNamespace.Name n : globalNames) {
			collapseDeclarationOfNameAndDescendants(n, n.getName());
		}
	}

	private void inlineAliases(com.google.javascript.jscomp.GlobalNamespace namespace) {
		java.util.Deque<com.google.javascript.jscomp.GlobalNamespace.Name> workList = new java.util.ArrayDeque<com.google.javascript.jscomp.GlobalNamespace.Name>(namespace.getNameForest());
		while (!(workList.isEmpty())) {
			com.google.javascript.jscomp.GlobalNamespace.Name name = workList.pop();
			if (((name.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.GET)) || ((name.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.SET))) {
				continue;
			}
			if ((((name.globalSets) == 1) && ((name.localSets) == 0)) && ((name.aliasingGets) > 0)) {
				java.util.List<com.google.javascript.jscomp.GlobalNamespace.Ref> refs = com.google.common.collect.Lists.newArrayList(name.getRefs());
				for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : refs) {
					if (((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET)) && (ref.scope.isLocal())) {
						if (inlineAliasIfPossible(ref, namespace)) {
							name.removeRef(ref);
						}
					}
				}
			}
			if (((((name.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT)) || ((name.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.FUNCTION))) && ((name.aliasingGets) == 0)) && ((name.props) != null)) {
				workList.addAll(name.props);
			}
		} 
	}

	private boolean inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref alias, com.google.javascript.jscomp.GlobalNamespace namespace) {
		com.google.javascript.rhino.Node aliasParent = alias.node.getParent();
		if ((aliasParent.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			com.google.javascript.jscomp.Scope scope = alias.scope;
			com.google.javascript.jscomp.Scope.Var aliasVar = scope.getVar(aliasParent.getString());
			com.google.javascript.jscomp.ReferenceCollectingCallback collector = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR, com.google.common.base.Predicates.<com.google.javascript.jscomp.Scope.Var>equalTo(aliasVar));
			new com.google.javascript.jscomp.NodeTraversal(compiler, collector).traverseAtScope(scope);
			com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection aliasRefs = collector.getReferenceCollection(aliasVar);
			if (((aliasRefs.isWellDefined()) && (aliasRefs.firstReferenceIsAssigningDeclaration())) && (aliasRefs.isAssignedOnceInLifetime())) {
				int size = aliasRefs.references.size();
				java.util.Set<com.google.javascript.rhino.Node> newNodes = com.google.common.collect.Sets.newHashSetWithExpectedSize((size - 1));
				for (int i = 1; i < size; i++) {
					com.google.javascript.jscomp.ReferenceCollectingCallback.Reference aliasRef = aliasRefs.references.get(i);
					com.google.javascript.rhino.Node newNode = alias.node.cloneTree();
					aliasRef.getParent().replaceChild(aliasRef.getNode(), newNode);
					newNodes.add(newNode);
				}
				aliasParent.replaceChild(alias.node, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NULL));
				compiler.reportCodeChange();
				namespace.scanNewNodes(alias.scope, newNodes);
				return true;
			}
		}
		return false;
	}

	private void checkNamespaces() {
		for (com.google.javascript.jscomp.GlobalNamespace.Name name : nameMap.values()) {
			if ((name.isNamespace()) && ((((name.aliasingGets) > 0) || (((name.localSets) + (name.globalSets)) > 1)) || ((name.deleteProps) > 0))) {
				boolean initialized = (name.declaration) != null;
				for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.getRefs()) {
					if (ref == (name.declaration)) {
						continue;
					}
					if ((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.DELETE_PROP)) {
						if (initialized) {
							warnAboutNamespaceRedefinition(name, ref);
						}
					}else
						if (((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_GLOBAL)) || ((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.SET_FROM_LOCAL))) {
							if (initialized) {
								warnAboutNamespaceRedefinition(name, ref);
							}
							initialized = true;
						}else
							if ((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET)) {
								warnAboutNamespaceAliasing(name, ref);
							}
						
					
				}
			}
		}
	}

	private void warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace.Name nameObj, com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		compiler.report(com.google.javascript.jscomp.JSError.make(ref.getSourceName(), ref.node, com.google.javascript.jscomp.CollapseProperties.UNSAFE_NAMESPACE_WARNING, nameObj.fullName()));
	}

	private void warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace.Name nameObj, com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		compiler.report(com.google.javascript.jscomp.JSError.make(ref.getSourceName(), ref.node, com.google.javascript.jscomp.CollapseProperties.NAMESPACE_REDEFINED_WARNING, nameObj.fullName()));
	}

	private void flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias) {
		if ((n.props) == null)
			return ;
		
		for (com.google.javascript.jscomp.GlobalNamespace.Name p : n.props) {
			java.lang.String propAlias = com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(alias, p.getName());
			if (p.canCollapse()) {
				flattenReferencesTo(p, propAlias);
			}else
				if (p.isSimpleStubDeclaration()) {
					flattenSimpleStubDeclaration(p, propAlias);
				}
			
			flattenReferencesToCollapsibleDescendantNames(p, propAlias);
		}
	}

	private void flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name name, java.lang.String alias) {
		com.google.javascript.jscomp.GlobalNamespace.Ref ref = com.google.common.collect.Iterables.getOnlyElement(name.getRefs());
		com.google.javascript.rhino.Node nameNode = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), alias, ref.node, name.fullName());
		com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode).copyInformationFrom(nameNode);
		com.google.common.base.Preconditions.checkState(((ref.node.getParent().getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)));
		com.google.javascript.rhino.Node parent = ref.node.getParent();
		com.google.javascript.rhino.Node gramps = parent.getParent();
		gramps.replaceChild(parent, varNode);
		compiler.reportCodeChange();
	}

	private void flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias) {
		java.lang.String originalName = n.fullName();
		for (com.google.javascript.jscomp.GlobalNamespace.Ref r : n.getRefs()) {
			if (r == (n.declaration)) {
				continue;
			}
			com.google.javascript.rhino.Node rParent = r.node.getParent();
			if ((!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(r.node, rParent))) && (((r.getTwin()) == null) || (r.isSet()))) {
				flattenNameRef(alias, r.node, rParent, originalName);
			}
		}
		if ((n.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name p : n.props) {
				flattenPrefixes(alias, p, 1);
			}
		}
	}

	private void flattenPrefixes(java.lang.String alias, com.google.javascript.jscomp.GlobalNamespace.Name n, int depth) {
		java.lang.String originalName = n.fullName();
		if ((((n.declaration) != null) && ((n.declaration.node) != null)) && ((n.declaration.node.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
			flattenNameRefAtDepth(alias, n.declaration.node, depth, originalName);
		}
		for (com.google.javascript.jscomp.GlobalNamespace.Ref r : n.getRefs()) {
			if (r == (n.declaration)) {
				continue;
			}
			if (((r.getTwin()) == null) || (r.isSet())) {
				flattenNameRefAtDepth(alias, r.node, depth, originalName);
			}
		}
		if ((n.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name p : n.props) {
				flattenPrefixes(alias, p, (depth + 1));
			}
		}
	}

	private void flattenNameRefAtDepth(java.lang.String alias, com.google.javascript.rhino.Node n, int depth, java.lang.String originalName) {
		int nType = n.getType();
		boolean isQName = (nType == (com.google.javascript.rhino.Token.NAME)) || (nType == (com.google.javascript.rhino.Token.GETPROP));
		boolean isObjKey = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, n.getParent());
		com.google.common.base.Preconditions.checkState((isObjKey || isQName));
		if (isQName) {
			for (int i = 1; (i < depth) && (n.hasChildren()); i++) {
				n = n.getFirstChild();
			}
			if (n.hasChildren()) {
				flattenNameRef(alias, n.getFirstChild(), n, originalName);
			}
		}
	}

	private void flattenNameRef(java.lang.String alias, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, java.lang.String originalName) {
		com.google.javascript.rhino.Node ref = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), alias, n, originalName);
		com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(n.getLastChild(), ref);
		if (((parent.getType()) == (com.google.javascript.rhino.Token.CALL)) && (n == (parent.getFirstChild()))) {
			parent.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		}
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (type != null) {
			ref.setJSType(type);
		}
		parent.replaceChild(n, ref);
		compiler.reportCodeChange();
	}

	private void collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias) {
		boolean canCollapseChildNames = n.canCollapseUnannotatedChildNames();
		if (n.canCollapse()) {
			updateObjLitOrFunctionDeclaration(n, alias, canCollapseChildNames);
		}
		if ((n.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name p : n.props) {
				collapseDeclarationOfNameAndDescendants(p, com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(alias, p.getName()));
				if (((((((!(p.inExterns)) && canCollapseChildNames) && ((p.declaration) != null)) && (p.canCollapse())) && ((p.declaration.node) != null)) && ((p.declaration.node.getParent()) != null)) && ((p.declaration.node.getParent().getType()) == (com.google.javascript.rhino.Token.ASSIGN))) {
					updateSimpleDeclaration(com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(alias, p.getName()), p, p.declaration);
				}
			}
		}
	}

	private void updateSimpleDeclaration(java.lang.String alias, com.google.javascript.jscomp.GlobalNamespace.Name refName, com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		com.google.javascript.rhino.Node rvalue = ref.node.getNext();
		com.google.javascript.rhino.Node parent = ref.node.getParent();
		com.google.javascript.rhino.Node gramps = parent.getParent();
		com.google.javascript.rhino.Node greatGramps = gramps.getParent();
		com.google.javascript.rhino.Node greatGreatGramps = greatGramps.getParent();
		if ((rvalue != null) && ((rvalue.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			checkForHosedThisReferences(rvalue, refName.docInfo, refName);
		}
		com.google.javascript.rhino.Node nameNode = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), alias, gramps.getFirstChild(), refName.fullName());
		com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(ref.node.getLastChild(), nameNode);
		if ((gramps.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
			parent.removeChild(rvalue);
			nameNode.addChildToFront(rvalue);
			com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode);
			greatGramps.replaceChild(gramps, varNode);
		}else {
			com.google.common.base.Preconditions.checkNotNull(ref.getTwin());
			com.google.javascript.rhino.Node current = gramps;
			com.google.javascript.rhino.Node currentParent = gramps.getParent();
			for (; ((currentParent.getType()) != (com.google.javascript.rhino.Token.SCRIPT)) && ((currentParent.getType()) != (com.google.javascript.rhino.Token.BLOCK)); current = currentParent , currentParent = currentParent.getParent()) {
			}
			com.google.javascript.rhino.Node stubVar = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode.cloneTree()).copyInformationFrom(nameNode);
			currentParent.addChildBefore(stubVar, current);
			parent.replaceChild(ref.node, nameNode);
		}
		compiler.reportCodeChange();
	}

	private void updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias, boolean canCollapseChildNames) {
		if ((n.declaration) == null) {
			return ;
		}
		if ((n.declaration.getTwin()) != null) {
			return ;
		}
		switch (n.declaration.node.getParent().getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
				updateObjLitOrFunctionDeclarationAtAssignNode(n, alias, canCollapseChildNames);
				break;
			case com.google.javascript.rhino.Token.VAR :
				updateObjLitOrFunctionDeclarationAtVarNode(n, canCollapseChildNames);
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				updateFunctionDeclarationAtFunctionNode(n, canCollapseChildNames);
				break;
		}
	}

	private void updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias, boolean canCollapseChildNames) {
		com.google.javascript.jscomp.GlobalNamespace.Ref ref = n.declaration;
		com.google.javascript.rhino.Node rvalue = ref.node.getNext();
		com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR);
		com.google.javascript.rhino.Node varParent = ref.node.getAncestor(3);
		com.google.javascript.rhino.Node gramps = ref.node.getAncestor(2);
		boolean isObjLit = (rvalue.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT);
		boolean insertedVarNode = false;
		if (isObjLit && (n.canEliminate())) {
			varParent.replaceChild(gramps, varNode);
			ref.node = null;
			insertedVarNode = true;
		}else
			if (!(n.isSimpleName())) {
				if ((rvalue.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
					checkForHosedThisReferences(rvalue, n.docInfo, n);
				}
				ref.node.getParent().removeChild(rvalue);
				com.google.javascript.rhino.Node nameNode = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), alias, ref.node.getAncestor(2), n.fullName());
				com.google.javascript.rhino.JSDocInfo info = ref.node.getParent().getJSDocInfo();
				if ((ref.node.getLastChild().getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME)) || ((info != null) && (info.isConstant()))) {
					nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
				}
				varNode.addChildToBack(nameNode);
				nameNode.addChildToFront(rvalue);
				varParent.replaceChild(gramps, varNode);
				ref.node = nameNode;
				insertedVarNode = true;
			}
		
		if (canCollapseChildNames) {
			if (isObjLit) {
				declareVarsForObjLitValues(n, alias, rvalue, varNode, varParent.getChildBefore(varNode), varParent);
			}
			addStubsForUndeclaredProperties(n, alias, varParent, varNode);
		}
		if (insertedVarNode) {
			if (!(varNode.hasChildren())) {
				varParent.removeChild(varNode);
			}
			compiler.reportCodeChange();
		}
	}

	private void checkForHosedThisReferences(com.google.javascript.rhino.Node function, com.google.javascript.rhino.JSDocInfo docInfo, final com.google.javascript.jscomp.GlobalNamespace.Name name) {
		if ((docInfo == null) || ((!(docInfo.isConstructor())) && (!(docInfo.hasThisType())))) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, function.getLastChild(), new com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback() {
				public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
					if ((n.getType()) == (com.google.javascript.rhino.Token.THIS)) {
						compiler.report(com.google.javascript.jscomp.JSError.make(name.declaration.getSourceName(), n, com.google.javascript.jscomp.CollapseProperties.UNSAFE_THIS, name.fullName()));
					}
				}
			});
		}
	}

	private void updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name n, boolean canCollapseChildNames) {
		if (!canCollapseChildNames) {
			return ;
		}
		com.google.javascript.jscomp.GlobalNamespace.Ref ref = n.declaration;
		java.lang.String name = ref.node.getString();
		com.google.javascript.rhino.Node rvalue = ref.node.getFirstChild();
		com.google.javascript.rhino.Node varNode = ref.node.getParent();
		com.google.javascript.rhino.Node gramps = varNode.getParent();
		boolean isObjLit = (rvalue.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT);
		int numChanges = 0;
		if (isObjLit) {
			numChanges += declareVarsForObjLitValues(n, name, rvalue, varNode, gramps.getChildBefore(varNode), gramps);
		}
		numChanges += addStubsForUndeclaredProperties(n, name, gramps, varNode);
		if (isObjLit && (n.canEliminate())) {
			varNode.removeChild(ref.node);
			if (!(varNode.hasChildren())) {
				gramps.removeChild(varNode);
			}
			numChanges++;
			ref.node = null;
		}
		if (numChanges > 0) {
			compiler.reportCodeChange();
		}
	}

	private void updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name n, boolean canCollapseChildNames) {
		if (!canCollapseChildNames) {
			return ;
		}
		com.google.javascript.jscomp.GlobalNamespace.Ref ref = n.declaration;
		java.lang.String fnName = ref.node.getString();
		addStubsForUndeclaredProperties(n, fnName, ref.node.getAncestor(2), ref.node.getParent());
	}

	private int declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name objlitName, java.lang.String alias, com.google.javascript.rhino.Node objlit, com.google.javascript.rhino.Node varNode, com.google.javascript.rhino.Node nameToAddAfter, com.google.javascript.rhino.Node varParent) {
		int numVars = 0;
		int arbitraryNameCounter = 0;
		boolean discardKeys = !(objlitName.shouldKeepKeys());
		for (com.google.javascript.rhino.Node key = objlit.getFirstChild(), nextKey; key != null; key = nextKey) {
			com.google.javascript.rhino.Node value = key.getFirstChild();
			nextKey = key.getNext();
			if (((key.getType()) == (com.google.javascript.rhino.Token.GET)) || ((key.getType()) == (com.google.javascript.rhino.Token.SET))) {
				continue;
			}
			boolean isJsIdentifier = ((key.getType()) != (com.google.javascript.rhino.Token.NUMBER)) && (com.google.javascript.rhino.TokenStream.isJSIdentifier(key.getString()));
			java.lang.String propName = isJsIdentifier ? key.getString() : java.lang.String.valueOf((++arbitraryNameCounter));
			java.lang.String qName = ((objlitName.fullName()) + '.') + propName;
			com.google.javascript.jscomp.GlobalNamespace.Name p = nameMap.get(qName);
			if ((p != null) && (!(p.canCollapse()))) {
				continue;
			}
			java.lang.String propAlias = com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(alias, propName);
			com.google.javascript.rhino.Node refNode = null;
			if (discardKeys) {
				objlit.removeChild(key);
				value.detachFromParent();
			}else {
				refNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, propAlias);
				if (key.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME)) {
					refNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
				}
				key.replaceChild(value, refNode);
			}
			com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, propAlias);
			nameNode.addChildToFront(value);
			if (key.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME)) {
				nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
			}
			com.google.javascript.rhino.Node newVar = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode).copyInformationFromForTree(key);
			if (nameToAddAfter != null) {
				varParent.addChildAfter(newVar, nameToAddAfter);
			}else {
				varParent.addChildBefore(newVar, varNode);
			}
			compiler.reportCodeChange();
			nameToAddAfter = newVar;
			if (isJsIdentifier && (p != null)) {
				if (!discardKeys) {
					com.google.javascript.jscomp.GlobalNamespace.Ref newAlias = p.declaration.cloneAndReclassify(com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET);
					newAlias.node = refNode;
					p.addRef(newAlias);
				}
				p.declaration.node = nameNode;
				if ((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
					checkForHosedThisReferences(value, value.getJSDocInfo(), p);
				}
			}
			numVars++;
		}
		return numVars;
	}

	private int addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name n, java.lang.String alias, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node addAfter) {
		com.google.common.base.Preconditions.checkState(n.canCollapseUnannotatedChildNames());
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent));
		com.google.common.base.Preconditions.checkNotNull(addAfter);
		int numStubs = 0;
		if ((n.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name p : n.props) {
				if (p.needsToBeStubbed()) {
					java.lang.String propAlias = com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(alias, p.getName());
					com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, propAlias);
					com.google.javascript.rhino.Node newVar = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode).copyInformationFromForTree(addAfter);
					parent.addChildAfter(newVar, addAfter);
					addAfter = newVar;
					numStubs++;
					compiler.reportCodeChange();
					if (p.getRefs().get(0).node.getLastChild().getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME)) {
						nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
					}
				}
			}
		}
		return numStubs;
	}

	private static java.lang.String appendPropForAlias(java.lang.String root, java.lang.String prop) {
		if ((prop.indexOf('$')) != (-1)) {
			prop = prop.replaceAll("\\$", "\\$0");
		}
		return (root + '$') + prop;
	}
}

