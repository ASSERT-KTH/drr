

package com.google.javascript.jscomp;


public class JSModuleGraph {
	private java.util.List<com.google.javascript.jscomp.JSModule> modules;

	private java.util.List<java.util.List<com.google.javascript.jscomp.JSModule>> modulesByDepth;

	private java.util.Map<com.google.javascript.jscomp.JSModule, java.util.Set<com.google.javascript.jscomp.JSModule>> dependencyMap = com.google.common.collect.Maps.newHashMap();

	public JSModuleGraph(com.google.javascript.jscomp.JSModule[] modulesInDepOrder) {
		this(com.google.common.collect.ImmutableList.copyOf(modulesInDepOrder));
	}

	public JSModuleGraph(java.util.List<com.google.javascript.jscomp.JSModule> modulesInDepOrder) {
		com.google.common.base.Preconditions.checkState(((modulesInDepOrder.size()) == (com.google.common.collect.Sets.newHashSet(modulesInDepOrder).size())), "Found duplicate modules");
		modules = com.google.common.collect.ImmutableList.copyOf(modulesInDepOrder);
		modulesByDepth = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.JSModule module : modulesInDepOrder) {
			int depth = 0;
			for (com.google.javascript.jscomp.JSModule dep : module.getDependencies()) {
				int depDepth = dep.getDepth();
				if (depDepth < 0) {
					throw new com.google.javascript.jscomp.JSModuleGraph.ModuleDependenceException(java.lang.String.format("Modules not in dependency order: %s preceded %s", module.getName(), dep.getName()), module, dep);
				}
				depth = java.lang.Math.max(depth, (depDepth + 1));
			}
			module.setDepth(depth);
			if (depth == (modulesByDepth.size())) {
				modulesByDepth.add(new java.util.ArrayList<com.google.javascript.jscomp.JSModule>());
			}
			modulesByDepth.get(depth).add(module);
		}
	}

	java.lang.Iterable<com.google.javascript.jscomp.JSModule> getAllModules() {
		return modules;
	}

	java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> getModulesByName() {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> result = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.JSModule m : modules) {
			result.put(m.getName(), m);
		}
		return result;
	}

	int getModuleCount() {
		return modules.size();
	}

	com.google.javascript.jscomp.JSModule getRootModule() {
		return com.google.common.collect.Iterables.getOnlyElement(modulesByDepth.get(0));
	}

	org.json.JSONArray toJson() {
		org.json.JSONArray modules = new org.json.JSONArray();
		for (com.google.javascript.jscomp.JSModule module : getAllModules()) {
			org.json.JSONObject node = new org.json.JSONObject();
			try {
				node.put("name", module.getName());
				org.json.JSONArray deps = new org.json.JSONArray();
				node.put("dependencies", deps);
				for (com.google.javascript.jscomp.JSModule m : module.getDependencies()) {
					deps.put(m.getName());
				}
				org.json.JSONArray transitiveDeps = new org.json.JSONArray();
				node.put("transitive-dependencies", transitiveDeps);
				for (com.google.javascript.jscomp.JSModule m : getTransitiveDepsDeepestFirst(module)) {
					transitiveDeps.put(m.getName());
				}
				org.json.JSONArray inputs = new org.json.JSONArray();
				node.put("inputs", inputs);
				for (com.google.javascript.jscomp.CompilerInput input : module.getInputs()) {
					inputs.put(input.getSourceFile().getOriginalPath());
				}
				modules.put(node);
			} catch (org.json.JSONException e) {
				com.google.common.base.Throwables.propagate(e);
			}
		}
		return modules;
	}

	public boolean dependsOn(com.google.javascript.jscomp.JSModule src, com.google.javascript.jscomp.JSModule m) {
		java.util.Set<com.google.javascript.jscomp.JSModule> deps = dependencyMap.get(src);
		if (deps == null) {
			deps = getTransitiveDepsDeepestFirst(src);
			dependencyMap.put(src, deps);
		}
		return deps.contains(m);
	}

	com.google.javascript.jscomp.JSModule getDeepestCommonDependency(com.google.javascript.jscomp.JSModule m1, com.google.javascript.jscomp.JSModule m2) {
		int m1Depth = m1.getDepth();
		int m2Depth = m2.getDepth();
		for (int depth = (java.lang.Math.min(m1Depth, m2Depth)) - 1; depth >= 0; depth--) {
			java.util.List<com.google.javascript.jscomp.JSModule> modulesAtDepth = modulesByDepth.get(depth);
			for (int i = (modulesAtDepth.size()) - 1; i >= 0; i--) {
				com.google.javascript.jscomp.JSModule m = modulesAtDepth.get(i);
				if ((dependsOn(m1, m)) && (dependsOn(m2, m))) {
					return m;
				}
			}
		}
		return null;
	}

	public com.google.javascript.jscomp.JSModule getDeepestCommonDependencyInclusive(com.google.javascript.jscomp.JSModule m1, com.google.javascript.jscomp.JSModule m2) {
		if ((m2 == m1) || (dependsOn(m2, m1))) {
			return m1;
		}else
			if (dependsOn(m1, m2)) {
				return m2;
			}
		
		return getDeepestCommonDependency(m1, m2);
	}

	public com.google.javascript.jscomp.JSModule getDeepestCommonDependencyInclusive(java.util.Collection<com.google.javascript.jscomp.JSModule> modules) {
		java.util.Iterator<com.google.javascript.jscomp.JSModule> iter = modules.iterator();
		com.google.javascript.jscomp.JSModule dep = iter.next();
		while (iter.hasNext()) {
			dep = getDeepestCommonDependencyInclusive(dep, iter.next());
		} 
		return dep;
	}

	java.util.Set<com.google.javascript.jscomp.JSModule> getTransitiveDepsDeepestFirst(com.google.javascript.jscomp.JSModule m) {
		java.util.Set<com.google.javascript.jscomp.JSModule> deps = dependencyMap.get(m);
		if (deps != null) {
			return deps;
		}
		deps = new java.util.TreeSet<com.google.javascript.jscomp.JSModule>(new com.google.javascript.jscomp.JSModuleGraph.InverseDepthComparator());
		addDeps(deps, m);
		dependencyMap.put(m, deps);
		return deps;
	}

	private void addDeps(java.util.Set<com.google.javascript.jscomp.JSModule> deps, com.google.javascript.jscomp.JSModule m) {
		for (com.google.javascript.jscomp.JSModule dep : m.getDependencies()) {
			deps.add(dep);
			addDeps(deps, dep);
		}
	}

	public void coalesceDuplicateFiles() {
		com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.JSModule> fileRefs = com.google.common.collect.LinkedHashMultimap.create();
		for (com.google.javascript.jscomp.JSModule module : modules) {
			for (com.google.javascript.jscomp.CompilerInput jsFile : module.getInputs()) {
				fileRefs.put(jsFile.getName(), module);
			}
		}
		for (java.lang.String path : fileRefs.keySet()) {
			java.util.Collection<com.google.javascript.jscomp.JSModule> refModules = fileRefs.get(path);
			if ((refModules.size()) > 1) {
				com.google.javascript.jscomp.JSModule depModule = getDeepestCommonDependencyInclusive(refModules);
				com.google.javascript.jscomp.CompilerInput file = refModules.iterator().next().getByName(path);
				for (com.google.javascript.jscomp.JSModule module : refModules) {
					if (module != depModule) {
						module.removeByName(path);
					}
				}
				if (!(refModules.contains(depModule))) {
					depModule.add(file);
				}
			}
		}
	}

	public java.util.List<com.google.javascript.jscomp.CompilerInput> manageDependencies(java.util.List<java.lang.String> entryPoints, java.util.List<com.google.javascript.jscomp.CompilerInput> inputs) throws com.google.javascript.jscomp.JSModuleGraph.MissingModuleException, com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException, com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException {
		com.google.javascript.jscomp.DependencyOptions depOptions = new com.google.javascript.jscomp.DependencyOptions();
		depOptions.setDependencySorting(true);
		depOptions.setDependencyPruning(true);
		depOptions.setEntryPoints(entryPoints);
		return manageDependencies(depOptions, inputs);
	}

	public java.util.List<com.google.javascript.jscomp.CompilerInput> manageDependencies(com.google.javascript.jscomp.DependencyOptions depOptions, java.util.List<com.google.javascript.jscomp.CompilerInput> inputs) throws com.google.javascript.jscomp.JSModuleGraph.MissingModuleException, com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException, com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException {
		com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput> sorter = new com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput>(inputs);
		java.lang.Iterable<com.google.javascript.jscomp.CompilerInput> entryPointInputs = createEntryPointInputs(depOptions, inputs, sorter);
		java.util.List<com.google.javascript.jscomp.CompilerInput> absoluteOrder = sorter.getDependenciesOf(inputs, depOptions.shouldSortDependencies());
		com.google.common.collect.ListMultimap<com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.CompilerInput> entryPointInputsPerModule = com.google.common.collect.LinkedListMultimap.create();
		for (com.google.javascript.jscomp.CompilerInput input : entryPointInputs) {
			com.google.javascript.jscomp.JSModule module = input.getModule();
			com.google.common.base.Preconditions.checkNotNull(module);
			entryPointInputsPerModule.put(module, input);
		}
		for (com.google.javascript.jscomp.JSModule module : getAllModules()) {
			module.removeAll();
		}
		for (com.google.javascript.jscomp.JSModule module : entryPointInputsPerModule.keySet()) {
			java.util.List<com.google.javascript.jscomp.CompilerInput> transitiveClosure = sorter.getDependenciesOf(entryPointInputsPerModule.get(module), depOptions.shouldSortDependencies());
			for (com.google.javascript.jscomp.CompilerInput input : transitiveClosure) {
				com.google.javascript.jscomp.JSModule oldModule = input.getModule();
				if (oldModule == null) {
					input.setModule(module);
				}else {
					input.setModule(null);
					input.setModule(getDeepestCommonDependencyInclusive(oldModule, module));
				}
			}
		}
		for (com.google.javascript.jscomp.CompilerInput input : absoluteOrder) {
			com.google.javascript.jscomp.JSModule module = input.getModule();
			if (module != null) {
				module.add(input);
			}
		}
		java.util.List<com.google.javascript.jscomp.CompilerInput> result = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.JSModule module : getAllModules()) {
			result.addAll(module.getInputs());
		}
		return result;
	}

	private java.util.Collection<com.google.javascript.jscomp.CompilerInput> createEntryPointInputs(com.google.javascript.jscomp.DependencyOptions depOptions, java.util.List<com.google.javascript.jscomp.CompilerInput> inputs, com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput> sorter) throws com.google.javascript.jscomp.JSModuleGraph.MissingModuleException, com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException {
		java.util.Set<com.google.javascript.jscomp.CompilerInput> entryPointInputs = com.google.common.collect.Sets.newLinkedHashSet();
		java.util.Map<java.lang.String, com.google.javascript.jscomp.JSModule> modulesByName = getModulesByName();
		if (depOptions.shouldPruneDependencies()) {
			if (!(depOptions.shouldDropMoochers())) {
				entryPointInputs.addAll(sorter.getInputsWithoutProvides());
			}
			for (java.lang.String entryPoint : depOptions.getEntryPoints()) {
				java.lang.String inputName = entryPoint;
				int splitPoint = entryPoint.indexOf(':');
				com.google.javascript.jscomp.CompilerInput entryPointInput = null;
				if (splitPoint != (-1)) {
					java.lang.String moduleName = entryPoint.substring(0, splitPoint);
					inputName = entryPoint.substring(java.lang.Math.min((splitPoint + 1), ((entryPoint.length()) - 1)));
					com.google.javascript.jscomp.JSModule module = modulesByName.get(moduleName);
					if (module == null) {
						throw new com.google.javascript.jscomp.JSModuleGraph.MissingModuleException(moduleName);
					}else {
						entryPointInput = sorter.getInputProviding(inputName);
						entryPointInput.overrideModule(module);
					}
				}else {
					entryPointInput = sorter.getInputProviding(inputName);
				}
				entryPointInputs.add(entryPointInput);
			}
			com.google.javascript.jscomp.CompilerInput baseJs = sorter.maybeGetInputProviding("goog");
			if (baseJs != null) {
				entryPointInputs.add(baseJs);
			}
		}else {
			entryPointInputs.addAll(inputs);
		}
		return entryPointInputs;
	}

	com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.JSModule, java.lang.String> toGraphvizGraph() {
		com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.JSModule, java.lang.String> graphViz = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
		for (com.google.javascript.jscomp.JSModule module : getAllModules()) {
			graphViz.createNode(module);
			for (com.google.javascript.jscomp.JSModule dep : module.getDependencies()) {
				graphViz.createNode(dep);
				graphViz.connect(module, "->", dep);
			}
		}
		return graphViz;
	}

	private class InverseDepthComparator implements java.util.Comparator<com.google.javascript.jscomp.JSModule> {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.JSModule m1, com.google.javascript.jscomp.JSModule m2) {
			return depthCompare(m2, m1);
		}
	}

	private int depthCompare(com.google.javascript.jscomp.JSModule m1, com.google.javascript.jscomp.JSModule m2) {
		if (m1 == m2) {
			return 0;
		}
		int d1 = m1.getDepth();
		int d2 = m2.getDepth();
		return d1 < d2 ? -1 : d2 == d1 ? m1.getName().compareTo(m2.getName()) : 1;
	}

	protected static class ModuleDependenceException extends java.lang.IllegalArgumentException {
		private static final long serialVersionUID = 1;

		private final com.google.javascript.jscomp.JSModule module;

		private final com.google.javascript.jscomp.JSModule dependentModule;

		protected ModuleDependenceException(java.lang.String message, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.JSModule dependentModule) {
			super(message);
			this.module = module;
			this.dependentModule = dependentModule;
		}

		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}

		public com.google.javascript.jscomp.JSModule getDependentModule() {
			return dependentModule;
		}
	}

	public static class MissingModuleException extends java.lang.Exception {
		MissingModuleException(java.lang.String moduleName) {
			super(moduleName);
		}
	}
}

