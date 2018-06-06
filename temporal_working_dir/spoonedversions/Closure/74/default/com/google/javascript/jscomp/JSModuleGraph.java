

package com.google.javascript.jscomp;


public class JSModuleGraph {
	private java.util.Set<com.google.javascript.jscomp.JSModule> modules;

	private java.util.List<java.util.List<com.google.javascript.jscomp.JSModule>> modulesByDepth;

	private java.util.Map<com.google.javascript.jscomp.JSModule, java.util.Set<com.google.javascript.jscomp.JSModule>> dependencyMap = com.google.common.collect.Maps.newHashMap();

	public JSModuleGraph(com.google.javascript.jscomp.JSModule[] modulesInDepOrder) {
		this(com.google.common.collect.Lists.<com.google.javascript.jscomp.JSModule>newArrayList(modulesInDepOrder));
	}

	public JSModuleGraph(java.util.List<com.google.javascript.jscomp.JSModule> modulesInDepOrder) {
		modules = com.google.common.collect.Sets.newHashSetWithExpectedSize(modulesInDepOrder.size());
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
			modules.add(module);
			if (depth == (modulesByDepth.size())) {
				modulesByDepth.add(new java.util.ArrayList<com.google.javascript.jscomp.JSModule>());
			}
			modulesByDepth.get(depth).add(module);
		}
	}

	java.lang.Iterable<com.google.javascript.jscomp.JSModule> getAllModules() {
		return modules;
	}

	java.lang.Iterable<com.google.javascript.jscomp.JSModule> getAllModulesInDependencyOrder() {
		java.util.List<com.google.javascript.jscomp.JSModule> modules = com.google.common.collect.Lists.newArrayList(getAllModules());
		java.util.Collections.sort(modules, new com.google.javascript.jscomp.JSModuleGraph.DepthComparator());
		return modules;
	}

	int getModuleCount() {
		return modules.size();
	}

	com.google.javascript.jscomp.JSModule getRootModule() {
		return com.google.common.collect.Iterables.getOnlyElement(modulesByDepth.get(0));
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

	java.util.List<com.google.javascript.jscomp.CompilerInput> manageDependencies(java.util.List<java.lang.String> entryPoints, java.util.List<com.google.javascript.jscomp.CompilerInput> inputs) throws com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException, com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException {
		com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput> sorter = new com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput>(inputs);
		java.util.Set<com.google.javascript.jscomp.CompilerInput> entryPointInputs = com.google.common.collect.Sets.newLinkedHashSet(sorter.getInputsWithoutProvides());
		for (java.lang.String entryPoint : entryPoints) {
			entryPointInputs.add(sorter.getInputProviding(entryPoint));
		}
		java.util.List<com.google.javascript.jscomp.CompilerInput> absoluteOrder = sorter.getSortedDependenciesOf(inputs);
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
			java.util.List<com.google.javascript.jscomp.CompilerInput> transitiveClosure = sorter.getSortedDependenciesOf(entryPointInputsPerModule.get(module));
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
		for (com.google.javascript.jscomp.JSModule module : getAllModulesInDependencyOrder()) {
			result.addAll(module.getInputs());
		}
		return result;
	}

	private class DepthComparator implements java.util.Comparator<com.google.javascript.jscomp.JSModule> {
		public int compare(com.google.javascript.jscomp.JSModule m1, com.google.javascript.jscomp.JSModule m2) {
			return depthCompare(m1, m2);
		}
	}

	private class InverseDepthComparator implements java.util.Comparator<com.google.javascript.jscomp.JSModule> {
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
}

