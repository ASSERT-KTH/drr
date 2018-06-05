

package com.google.javascript.jscomp;


class CrossModuleMethodMotion implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType NULL_COMMON_MODULE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INTERNAL_ERROR_MODULE_DEPEND", "null deepest common module");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator;

	private final com.google.javascript.jscomp.AnalyzePrototypeProperties analyzer;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	static final java.lang.String STUB_METHOD_NAME = "JSCompiler_stubMethod";

	static final java.lang.String UNSTUB_METHOD_NAME = "JSCompiler_unstubMethod";

	static final java.lang.String STUB_DECLARATIONS = "var JSCompiler_stubMap = [];" + (((((((((("function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {" + "  return function() {") + "    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(") + "        this, arguments);") + "  };") + "}") + "function JSCompiler_unstubMethod(") + "    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {") + "  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] = ") + "      JSCompiler_unstubMethod_body;") + "}");

	CrossModuleMethodMotion(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator idGenerator, boolean canModifyExterns) {
		this.compiler = compiler;
		this.idGenerator = idGenerator;
		this.moduleGraph = compiler.getModuleGraph();
		this.analyzer = new com.google.javascript.jscomp.AnalyzePrototypeProperties(compiler, moduleGraph, canModifyExterns, false);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externRoot, com.google.javascript.rhino.Node root) {
		if (((moduleGraph) != null) && ((moduleGraph.getModuleCount()) > 1)) {
			analyzer.process(externRoot, root);
			moveMethods(analyzer.getAllNameInfo());
		}
	}

	private void moveMethods(java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> allNameInfo) {
		boolean hasStubDeclaration = idGenerator.hasGeneratedAnyIds();
		for (com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo : allNameInfo) {
			if (!(nameInfo.isReferenced())) {
				continue;
			}
			if (nameInfo.readsClosureVariables()) {
				continue;
			}
			com.google.javascript.jscomp.JSModule deepestCommonModuleRef = nameInfo.getDeepestCommonModuleRef();
			if (deepestCommonModuleRef == null) {
				compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.CrossModuleMethodMotion.NULL_COMMON_MODULE_ERROR));
				continue;
			}
			java.util.Iterator<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> declarations = nameInfo.getDeclarations().descendingIterator();
			while (declarations.hasNext()) {
				com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol symbol = declarations.next();
				if (!(symbol instanceof com.google.javascript.jscomp.AnalyzePrototypeProperties.Property)) {
					continue;
				}
				com.google.javascript.jscomp.AnalyzePrototypeProperties.Property prop = ((com.google.javascript.jscomp.AnalyzePrototypeProperties.Property) (symbol));
				if (!(((prop.getRootVar()) != null) && (prop.getRootVar().isGlobal()))) {
					continue;
				}
				com.google.javascript.rhino.Node value = prop.getValue();
				if ((moduleGraph.dependsOn(deepestCommonModuleRef, prop.getModule())) && (value.isFunction())) {
					com.google.javascript.rhino.Node valueParent = value.getParent();
					if ((valueParent.isGetterDef()) || (valueParent.isSetterDef())) {
						continue;
					}
					com.google.javascript.rhino.Node proto = prop.getPrototype();
					int stubId = idGenerator.newId();
					com.google.javascript.rhino.Node stubCall = com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.CrossModuleMethodMotion.STUB_METHOD_NAME), com.google.javascript.rhino.IR.number(stubId)).copyInformationFromForTree(value);
					stubCall.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
					valueParent.replaceChild(value, stubCall);
					com.google.javascript.rhino.Node unstubParent = compiler.getNodeForCodeInsertion(deepestCommonModuleRef);
					com.google.javascript.rhino.Node unstubCall = com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.CrossModuleMethodMotion.UNSTUB_METHOD_NAME), com.google.javascript.rhino.IR.number(stubId), value);
					unstubCall.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
					unstubParent.addChildToFront(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.getprop(proto.cloneTree(), com.google.javascript.rhino.IR.string(nameInfo.name)), unstubCall)).copyInformationFromForTree(value));
					compiler.reportCodeChange();
				}
			} 
		}
		if ((!hasStubDeclaration) && (idGenerator.hasGeneratedAnyIds())) {
			com.google.javascript.rhino.Node declarations = compiler.parseSyntheticCode(com.google.javascript.jscomp.CrossModuleMethodMotion.STUB_DECLARATIONS);
			compiler.getNodeForCodeInsertion(null).addChildrenToFront(declarations.removeChildren());
		}
	}

	static class IdGenerator implements java.io.Serializable {
		private static final long serialVersionUID = 0L;

		private int currentId = 0;

		boolean hasGeneratedAnyIds() {
			return (currentId) != 0;
		}

		int newId() {
			return (currentId)++;
		}
	}
}

