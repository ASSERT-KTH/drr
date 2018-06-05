

package com.google.javascript.jscomp;


class SimpleDefinitionFinder implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.DefinitionProvider {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.DefinitionSite> definitionSiteMap;

	private final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.DefinitionsRemover.Definition> nameDefinitionMultimap;

	private final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.UseSite> nameUseSiteMultimap;

	public SimpleDefinitionFinder(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.definitionSiteMap = com.google.common.collect.Maps.newLinkedHashMap();
		this.nameDefinitionMultimap = com.google.common.collect.LinkedHashMultimap.create();
		this.nameUseSiteMultimap = com.google.common.collect.LinkedHashMultimap.create();
	}

	public java.util.Collection<com.google.javascript.jscomp.DefinitionSite> getDefinitionSites() {
		return definitionSiteMap.values();
	}

	private com.google.javascript.jscomp.DefinitionSite getDefinitionAt(com.google.javascript.rhino.Node node) {
		return definitionSiteMap.get(node);
	}

	com.google.javascript.jscomp.DefinitionSite getDefinitionForFunction(com.google.javascript.rhino.Node function) {
		com.google.common.base.Preconditions.checkState(function.isFunction());
		return getDefinitionAt(com.google.javascript.jscomp.SimpleDefinitionFinder.getNameNodeFromFunctionNode(function));
	}

	@java.lang.Override
	public java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> getDefinitionsReferencedAt(com.google.javascript.rhino.Node useSite) {
		if (definitionSiteMap.containsKey(useSite)) {
			return null;
		}
		if (useSite.isGetProp()) {
			java.lang.String propName = useSite.getLastChild().getString();
			if ((propName.equals("apply")) || (propName.equals("call"))) {
				useSite = useSite.getFirstChild();
			}
		}
		java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(useSite);
		if (name != null) {
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = nameDefinitionMultimap.get(name);
			if (!(defs.isEmpty())) {
				return defs;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node source) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback(true));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, source, new com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback(false));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, source, new com.google.javascript.jscomp.SimpleDefinitionFinder.UseSiteGatheringCallback());
	}

	java.util.Collection<com.google.javascript.jscomp.UseSite> getUseSites(com.google.javascript.jscomp.DefinitionsRemover.Definition definition) {
		java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(definition.getLValue());
		return nameUseSiteMultimap.get(name);
	}

	private static java.lang.String getSimplifiedName(com.google.javascript.rhino.Node node) {
		if (node.isName()) {
			java.lang.String name = node.getString();
			if ((name != null) && (!(name.isEmpty()))) {
				return name;
			}else {
				return null;
			}
		}else
			if (node.isGetProp()) {
				return "this." + (node.getLastChild().getString());
			}
		
		return null;
	}

	private class DefinitionGatheringCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private boolean inExterns;

		DefinitionGatheringCallback(boolean inExterns) {
			com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.this.inExterns = inExterns;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (((inExterns) && (node.isName())) && (parent.isParamList())) {
				return ;
			}
			com.google.javascript.jscomp.DefinitionsRemover.Definition def = com.google.javascript.jscomp.DefinitionsRemover.getDefinition(node, inExterns);
			if (def != null) {
				java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(def.getLValue());
				if (name != null) {
					com.google.javascript.rhino.Node rValue = def.getRValue();
					if (((rValue != null) && (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(rValue)))) && (!(rValue.isFunction()))) {
						com.google.javascript.jscomp.DefinitionsRemover.Definition unknownDef = new com.google.javascript.jscomp.DefinitionsRemover.UnknownDefinition(def.getLValue(), inExterns);
						def = unknownDef;
					}
					if (inExterns) {
						java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> stubsToRemove = com.google.common.collect.Lists.newArrayList();
						java.lang.String qualifiedName = node.getQualifiedName();
						if (qualifiedName != null) {
							for (com.google.javascript.jscomp.DefinitionsRemover.Definition prevDef : nameDefinitionMultimap.get(name)) {
								if ((prevDef instanceof com.google.javascript.jscomp.DefinitionsRemover.ExternalNameOnlyDefinition) && (!(jsdocContainsDeclarations(node)))) {
									java.lang.String prevName = prevDef.getLValue().getQualifiedName();
									if (qualifiedName.equals(prevName)) {
										stubsToRemove.add(prevDef);
									}
								}
							}
							for (com.google.javascript.jscomp.DefinitionsRemover.Definition prevDef : stubsToRemove) {
								nameDefinitionMultimap.remove(name, prevDef);
							}
						}
					}
					nameDefinitionMultimap.put(name, def);
					definitionSiteMap.put(node, new com.google.javascript.jscomp.DefinitionSite(node, def, traversal.getModule(), traversal.inGlobalScope(), inExterns));
				}
			}
			if (((inExterns) && (parent != null)) && (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent))) {
				java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(node);
				if (name != null) {
					boolean dropStub = false;
					if (!(jsdocContainsDeclarations(node))) {
						java.lang.String qualifiedName = node.getQualifiedName();
						if (qualifiedName != null) {
							for (com.google.javascript.jscomp.DefinitionsRemover.Definition prevDef : nameDefinitionMultimap.get(name)) {
								java.lang.String prevName = prevDef.getLValue().getQualifiedName();
								if (qualifiedName.equals(prevName)) {
									dropStub = true;
									break;
								}
							}
						}
					}
					if (!dropStub) {
						com.google.javascript.jscomp.DefinitionsRemover.Definition definition = new com.google.javascript.jscomp.DefinitionsRemover.ExternalNameOnlyDefinition(node);
						nameDefinitionMultimap.put(name, definition);
						definitionSiteMap.put(node, new com.google.javascript.jscomp.DefinitionSite(node, definition, traversal.getModule(), traversal.inGlobalScope(), inExterns));
					}
				}
			}
		}

		private boolean jsdocContainsDeclarations(com.google.javascript.rhino.Node node) {
			com.google.javascript.rhino.JSDocInfo info = node.getJSDocInfo();
			return (info != null) && (info.containsDeclaration());
		}
	}

	private class UseSiteGatheringCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = getDefinitionsReferencedAt(node);
			if (defs == null) {
				return ;
			}
			com.google.javascript.jscomp.DefinitionsRemover.Definition first = defs.iterator().next();
			java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(first.getLValue());
			com.google.common.base.Preconditions.checkNotNull(name);
			nameUseSiteMultimap.put(name, new com.google.javascript.jscomp.UseSite(node, traversal.getScope(), traversal.getModule()));
		}
	}

	static boolean isCallOrNewSite(com.google.javascript.jscomp.UseSite use) {
		com.google.javascript.rhino.Node call = use.node.getParent();
		if (call == null) {
			return false;
		}
		return (com.google.javascript.jscomp.NodeUtil.isCallOrNew(call)) && ((call.getFirstChild()) == (use.node));
	}

	boolean canModifyDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition definition) {
		if (isExported(definition)) {
			return false;
		}
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = getUseSites(definition);
		if (useSites.isEmpty()) {
			return false;
		}
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.javascript.rhino.Node nameNode = site.node;
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> singleSiteDefinitions = getDefinitionsReferencedAt(nameNode);
			if ((singleSiteDefinitions.size()) > 1) {
				return false;
			}
			com.google.common.base.Preconditions.checkState((!(singleSiteDefinitions.isEmpty())));
			com.google.common.base.Preconditions.checkState(singleSiteDefinitions.contains(definition));
		}
		return true;
	}

	private boolean isExported(com.google.javascript.jscomp.DefinitionsRemover.Definition definition) {
		com.google.javascript.rhino.Node lValue = definition.getLValue();
		if (lValue == null) {
			return true;
		}
		java.lang.String partialName;
		if (lValue.isGetProp()) {
			partialName = lValue.getLastChild().getString();
		}else
			if (lValue.isName()) {
				partialName = lValue.getString();
			}else {
				return true;
			}
		
		com.google.javascript.jscomp.CodingConvention codingConvention = compiler.getCodingConvention();
		if (codingConvention.isExported(partialName)) {
			return true;
		}
		return false;
	}

	static boolean isSimpleFunctionDeclaration(com.google.javascript.rhino.Node fn) {
		com.google.javascript.rhino.Node parent = fn.getParent();
		com.google.javascript.rhino.Node gramps = parent.getParent();
		com.google.javascript.rhino.Node nameNode = com.google.javascript.jscomp.SimpleDefinitionFinder.getNameNodeFromFunctionNode(fn);
		if ((nameNode != null) && (nameNode.isName())) {
			java.lang.String name = nameNode.getString();
			if ((name.equals(com.google.javascript.jscomp.NodeUtil.JSC_PROPERTY_NAME_FN)) || (name.equals(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING))) {
				return false;
			}
		}
		if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(fn)) {
			return true;
		}
		if ((fn.getFirstChild().getString().isEmpty()) && ((com.google.javascript.jscomp.NodeUtil.isExprAssign(gramps)) || (parent.isName()))) {
			return true;
		}
		return false;
	}

	static com.google.javascript.rhino.Node getNameNodeFromFunctionNode(com.google.javascript.rhino.Node function) {
		com.google.common.base.Preconditions.checkState(function.isFunction());
		if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(function)) {
			return function.getFirstChild();
		}else {
			com.google.javascript.rhino.Node parent = function.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(parent)) {
				return parent;
			}else
				if (parent.isAssign()) {
					return parent.getFirstChild();
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, parent.getParent())) {
						return parent;
					}
				
			
		}
		return null;
	}

	void removeReferences(com.google.javascript.rhino.Node node) {
		if (com.google.javascript.jscomp.DefinitionsRemover.isDefinitionNode(node)) {
			com.google.javascript.jscomp.DefinitionSite defSite = definitionSiteMap.get(node);
			if (defSite != null) {
				com.google.javascript.jscomp.DefinitionsRemover.Definition def = defSite.definition;
				java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(def.getLValue());
				if (name != null) {
					com.google.javascript.jscomp.SimpleDefinitionFinder.this.definitionSiteMap.remove(node);
					com.google.javascript.jscomp.SimpleDefinitionFinder.this.nameDefinitionMultimap.remove(name, node);
				}
			}
		}else {
			com.google.javascript.rhino.Node useSite = node;
			if (useSite.isGetProp()) {
				java.lang.String propName = useSite.getLastChild().getString();
				if ((propName.equals("apply")) || (propName.equals("call"))) {
					useSite = useSite.getFirstChild();
				}
			}
			java.lang.String name = com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(useSite);
			if (name != null) {
				com.google.javascript.jscomp.SimpleDefinitionFinder.this.nameUseSiteMultimap.remove(name, new com.google.javascript.jscomp.UseSite(useSite, null, null));
			}
		}
		for (com.google.javascript.rhino.Node child : node.children()) {
			removeReferences(child);
		}
	}
}

