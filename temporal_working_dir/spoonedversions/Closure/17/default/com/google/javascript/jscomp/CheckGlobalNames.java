

package com.google.javascript.jscomp;


class CheckGlobalNames implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CodingConvention convention;

	private final com.google.javascript.jscomp.CheckLevel level;

	private com.google.javascript.jscomp.GlobalNamespace namespace = null;

	private final java.util.Set<java.lang.String> objectPrototypeProps = com.google.common.collect.Sets.newHashSet();

	private final java.util.Set<java.lang.String> functionPrototypeProps = com.google.common.collect.Sets.newHashSet();

	static final com.google.javascript.jscomp.DiagnosticType UNDEFINED_NAME_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNDEFINED_NAME", "{0} is never defined");

	static final com.google.javascript.jscomp.DiagnosticType NAME_DEFINED_LATE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NAME_DEFINED_LATE", "{0} defined before its owner. {1} is defined at {2}:{3}");

	static final com.google.javascript.jscomp.DiagnosticType STRICT_MODULE_DEP_QNAME = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_STRICT_MODULE_DEP_QNAME", ("module {0} cannot reference {2}, defined in " + "module {1}"));

	CheckGlobalNames(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this.compiler = compiler;
		this.convention = compiler.getCodingConvention();
		this.level = level;
	}

	com.google.javascript.jscomp.CheckGlobalNames injectNamespace(com.google.javascript.jscomp.GlobalNamespace namespace) {
		com.google.common.base.Preconditions.checkArgument(namespace.hasExternsRoot());
		com.google.javascript.jscomp.CheckGlobalNames.this.namespace = namespace;
		return com.google.javascript.jscomp.CheckGlobalNames.this;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if ((namespace) == null) {
			namespace = new com.google.javascript.jscomp.GlobalNamespace(compiler, externs, root);
		}
		com.google.common.base.Preconditions.checkState(namespace.hasExternsRoot());
		findPrototypeProps("Object", objectPrototypeProps);
		findPrototypeProps("Function", functionPrototypeProps);
		objectPrototypeProps.addAll(convention.getIndirectlyDeclaredProperties());
		for (com.google.javascript.jscomp.GlobalNamespace.Name name : namespace.getNameForest()) {
			if (name.inExterns) {
				continue;
			}
			checkDescendantNames(name, (((name.globalSets) + (name.localSets)) > 0));
		}
	}

	private void findPrototypeProps(java.lang.String type, java.util.Set<java.lang.String> props) {
		com.google.javascript.jscomp.GlobalNamespace.Name slot = namespace.getSlot(type);
		if (slot != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : slot.getRefs()) {
				if ((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.PROTOTYPE_GET)) {
					com.google.javascript.rhino.Node fullName = ref.getNode().getParent().getParent();
					if (fullName.isGetProp()) {
						props.add(fullName.getLastChild().getString());
					}
				}
			}
		}
	}

	private void checkDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name name, boolean nameIsDefined) {
		if ((name.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name prop : name.props) {
				boolean propIsDefined = false;
				if (nameIsDefined) {
					propIsDefined = (!(propertyMustBeInitializedByFullName(prop))) || (((prop.globalSets) + (prop.localSets)) > 0);
				}
				validateName(prop, propIsDefined);
				checkDescendantNames(prop, propIsDefined);
			}
		}
	}

	private void validateName(com.google.javascript.jscomp.GlobalNamespace.Name name, boolean isDefined) {
		com.google.javascript.jscomp.GlobalNamespace.Ref declaration = name.getDeclaration();
		com.google.javascript.jscomp.GlobalNamespace.Name parent = name.parent;
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.getRefs()) {
			boolean isGlobalExpr = ref.getNode().getParent().isExprResult();
			if ((!isDefined) && (!(isTypedef(ref)))) {
				if (!isGlobalExpr) {
					reportRefToUndefinedName(name, ref);
				}
			}else
				if (((declaration != null) && ((ref.getModule()) != (declaration.getModule()))) && (!(moduleGraph.dependsOn(ref.getModule(), declaration.getModule())))) {
					reportBadModuleReference(name, ref);
				}else {
					if (ref.scope.isGlobal()) {
						boolean isPrototypeGet = (ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.PROTOTYPE_GET);
						com.google.javascript.jscomp.GlobalNamespace.Name owner = isPrototypeGet ? name : parent;
						boolean singleGlobalParentDecl = ((owner != null) && ((owner.getDeclaration()) != null)) && ((owner.localSets) == 0);
						if (singleGlobalParentDecl && ((owner.getDeclaration().preOrderIndex) > (ref.preOrderIndex))) {
							java.lang.String refName = isPrototypeGet ? (name.getFullName()) + ".prototype" : name.getFullName();
							compiler.report(com.google.javascript.jscomp.JSError.make(ref.source.getName(), ref.node, com.google.javascript.jscomp.CheckGlobalNames.NAME_DEFINED_LATE_WARNING, refName, owner.getFullName(), owner.getDeclaration().source.getName(), java.lang.String.valueOf(owner.getDeclaration().node.getLineno())));
						}
					}
				}
			
		}
	}

	private boolean isTypedef(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		com.google.javascript.rhino.Node parent = ref.node.getParent();
		if (parent.isExprResult()) {
			com.google.javascript.rhino.JSDocInfo info = ref.node.getJSDocInfo();
			if ((info != null) && (info.hasTypedefType())) {
				return true;
			}
		}
		return false;
	}

	private void reportBadModuleReference(com.google.javascript.jscomp.GlobalNamespace.Name name, com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		compiler.report(com.google.javascript.jscomp.JSError.make(ref.source.getName(), ref.node, com.google.javascript.jscomp.CheckGlobalNames.STRICT_MODULE_DEP_QNAME, ref.getModule().getName(), name.getDeclaration().getModule().getName(), name.getFullName()));
	}

	private void reportRefToUndefinedName(com.google.javascript.jscomp.GlobalNamespace.Name name, com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		while (((name.parent) != null) && (((name.parent.globalSets) + (name.parent.localSets)) == 0)) {
			name = name.parent;
		} 
		compiler.report(com.google.javascript.jscomp.JSError.make(ref.getSourceName(), ref.node, level, com.google.javascript.jscomp.CheckGlobalNames.UNDEFINED_NAME_WARNING, name.getFullName()));
	}

	private boolean propertyMustBeInitializedByFullName(com.google.javascript.jscomp.GlobalNamespace.Name name) {
		if ((name.parent) == null) {
			return false;
		}
		boolean parentIsAliased = false;
		if ((name.parent.aliasingGets) > 0) {
			for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.parent.getRefs()) {
				if ((ref.type) == (com.google.javascript.jscomp.GlobalNamespace.Ref.Type.ALIASING_GET)) {
					com.google.javascript.rhino.Node aliaser = ref.getNode().getParent();
					boolean isKnownAlias = (aliaser.isCall()) && (((convention.getClassesDefinedByCall(aliaser)) != null) || ((convention.getSingletonGetterClassName(aliaser)) != null));
					if (!isKnownAlias) {
						parentIsAliased = true;
					}
				}
			}
		}
		if (parentIsAliased) {
			return false;
		}
		if (objectPrototypeProps.contains(name.getBaseName())) {
			return false;
		}
		if ((name.parent.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT)) {
			return true;
		}
		if ((((name.parent.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.FUNCTION)) && (name.parent.isDeclaredType())) && (!(functionPrototypeProps.contains(name.getBaseName())))) {
			return true;
		}
		return false;
	}
}

