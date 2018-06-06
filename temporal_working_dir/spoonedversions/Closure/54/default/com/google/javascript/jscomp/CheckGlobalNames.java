

package com.google.javascript.jscomp;


class CheckGlobalNames implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel level;

	private com.google.javascript.jscomp.GlobalNamespace namespace = null;

	static final com.google.javascript.jscomp.DiagnosticType UNDEFINED_NAME_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNDEFINED_NAME", "{0} is never defined");

	static final com.google.javascript.jscomp.DiagnosticType NAME_DEFINED_LATE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_NAME_DEFINED_LATE", "{0} defined before its owner. {1} is defined at {2}:{3}");

	static final com.google.javascript.jscomp.DiagnosticType STRICT_MODULE_DEP_QNAME = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_STRICT_MODULE_DEP_QNAME", ("module {0} cannot reference {2}, defined in " + "module {1}"));

	CheckGlobalNames(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel level) {
		this.compiler = compiler;
		this.level = level;
	}

	com.google.javascript.jscomp.CheckGlobalNames injectNamespace(com.google.javascript.jscomp.GlobalNamespace namespace) {
		com.google.javascript.jscomp.CheckGlobalNames.this.namespace = namespace;
		return com.google.javascript.jscomp.CheckGlobalNames.this;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if ((namespace) == null) {
			namespace = new com.google.javascript.jscomp.GlobalNamespace(compiler, root);
		}
		for (com.google.javascript.jscomp.GlobalNamespace.Name name : namespace.getNameForest()) {
			checkDescendantNames(name, (((name.globalSets) + (name.localSets)) > 0));
		}
	}

	private void checkDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name name, boolean nameIsDefined) {
		if ((name.props) != null) {
			for (com.google.javascript.jscomp.GlobalNamespace.Name prop : name.props) {
				boolean propIsDefined = false;
				if (nameIsDefined) {
					propIsDefined = (!(com.google.javascript.jscomp.CheckGlobalNames.propertyMustBeInitializedByFullName(prop))) || (((prop.globalSets) + (prop.localSets)) > 0);
				}
				validateName(prop, propIsDefined);
				checkDescendantNames(prop, propIsDefined);
			}
		}
	}

	private void validateName(com.google.javascript.jscomp.GlobalNamespace.Name name, boolean isDefined) {
		com.google.javascript.jscomp.GlobalNamespace.Ref declaration = name.getDeclaration();
		com.google.javascript.jscomp.GlobalNamespace.Name parent = name.parent;
		boolean singleGlobalParentDecl = ((parent != null) && ((parent.getDeclaration()) != null)) && ((parent.localSets) == 0);
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.getRefs()) {
			if ((!isDefined) && (!(isTypedef(ref)))) {
				reportRefToUndefinedName(name, ref);
			}else
				if (((declaration != null) && ((ref.getModule()) != (declaration.getModule()))) && (!(moduleGraph.dependsOn(ref.getModule(), declaration.getModule())))) {
					reportBadModuleReference(name, ref);
				}else
					if (((ref.scope.isGlobal()) && singleGlobalParentDecl) && ((parent.getDeclaration().preOrderIndex) > (ref.preOrderIndex))) {
						compiler.report(com.google.javascript.jscomp.JSError.make(ref.source.getName(), ref.node, com.google.javascript.jscomp.CheckGlobalNames.NAME_DEFINED_LATE_WARNING, name.getFullName(), parent.getFullName(), parent.getDeclaration().source.getName(), java.lang.String.valueOf(parent.getDeclaration().node.getLineno())));
					}
				
			
		}
	}

	private boolean isTypedef(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
		com.google.javascript.rhino.Node parent = ref.node.getParent();
		if ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
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

	private static boolean propertyMustBeInitializedByFullName(com.google.javascript.jscomp.GlobalNamespace.Name name) {
		return (((name.parent) != null) && ((name.parent.aliasingGets) == 0)) && ((name.parent.type) == (com.google.javascript.jscomp.GlobalNamespace.Name.Type.OBJECTLIT));
	}
}

