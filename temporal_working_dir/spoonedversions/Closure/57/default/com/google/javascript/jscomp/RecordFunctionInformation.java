

package com.google.javascript.jscomp;


class RecordFunctionInformation extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.Compiler compiler;

	private final com.google.javascript.jscomp.FunctionNames functionNames;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private final com.google.javascript.jscomp.FunctionInformationMap.Builder mapBuilder;

	RecordFunctionInformation(com.google.javascript.jscomp.Compiler compiler, com.google.javascript.jscomp.FunctionNames functionNames) {
		this.compiler = compiler;
		this.moduleGraph = compiler.getModuleGraph();
		this.functionNames = functionNames;
		this.mapBuilder = com.google.javascript.jscomp.FunctionInformationMap.newBuilder();
	}

	com.google.javascript.jscomp.FunctionInformationMap getMap() {
		return mapBuilder.build();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.RecordFunctionInformation.this);
		if ((moduleGraph) == null) {
			addModuleInformation(null);
		}else {
			java.util.TreeSet<com.google.javascript.jscomp.JSModule> modules = com.google.common.collect.Sets.newTreeSet(new java.util.Comparator<com.google.javascript.jscomp.JSModule>() {
				@java.lang.Override
				public int compare(com.google.javascript.jscomp.JSModule o1, com.google.javascript.jscomp.JSModule o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			com.google.common.collect.Iterables.addAll(modules, moduleGraph.getAllModules());
			for (com.google.javascript.jscomp.JSModule m : modules) {
				addModuleInformation(m);
			}
		}
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
			return ;
		}
		int id = functionNames.getFunctionId(n);
		if (id < 0) {
			return ;
		}
		java.lang.String compiledSource = compiler.toSource(n);
		com.google.javascript.jscomp.JSModule module = t.getModule();
		mapBuilder.addEntry(com.google.javascript.jscomp.FunctionInformationMap.Entry.newBuilder().setId(id).setSourceName(com.google.javascript.jscomp.NodeUtil.getSourceName(n)).setLineNumber(n.getLineno()).setModuleName(((moduleGraph) == null ? "" : module.getName())).setSize(compiledSource.length()).setName(functionNames.getFunctionName(n)).setCompiledSource(compiledSource).build());
	}

	private void addModuleInformation(com.google.javascript.jscomp.JSModule module) {
		java.lang.String name;
		java.lang.String source;
		if (module != null) {
			name = module.getName();
			source = compiler.toSource(module);
		}else {
			name = "";
			source = compiler.toSource();
		}
		mapBuilder.addModule(com.google.javascript.jscomp.FunctionInformationMap.Module.newBuilder().setName(name).setCompiledSource(source).build());
	}
}

