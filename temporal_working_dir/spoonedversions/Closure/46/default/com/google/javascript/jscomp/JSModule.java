

package com.google.javascript.jscomp;


public class JSModule implements com.google.javascript.jscomp.deps.DependencyInfo , java.io.Serializable {
	private static final long serialVersionUID = 1;

	static final com.google.javascript.jscomp.DiagnosticType CIRCULAR_DEPENDENCY_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_CIRCULAR_DEP", "Circular dependency detected: {0}");

	private final java.lang.String name;

	private final java.util.List<com.google.javascript.jscomp.CompilerInput> inputs = new java.util.ArrayList<com.google.javascript.jscomp.CompilerInput>();

	private final java.util.List<com.google.javascript.jscomp.JSModule> deps = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();

	private int depth;

	public JSModule(java.lang.String name) {
		this.name = name;
		com.google.javascript.jscomp.JSModule.this.depth = -1;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return name;
	}

	@java.lang.Override
	public java.util.List<java.lang.String> getProvides() {
		return com.google.common.collect.ImmutableList.<java.lang.String>of(name);
	}

	@java.lang.Override
	public java.util.List<java.lang.String> getRequires() {
		com.google.common.collect.ImmutableList.Builder<java.lang.String> builder = com.google.common.collect.ImmutableList.builder();
		for (com.google.javascript.jscomp.JSModule m : deps) {
			builder.add(m.getName());
		}
		return builder.build();
	}

	@java.lang.Override
	public java.lang.String getPathRelativeToClosureBase() {
		throw new java.lang.UnsupportedOperationException();
	}

	public void add(com.google.javascript.jscomp.JSSourceFile file) {
		add(new com.google.javascript.jscomp.CompilerInput(file));
	}

	public void addFirst(com.google.javascript.jscomp.JSSourceFile file) {
		addFirst(new com.google.javascript.jscomp.CompilerInput(file));
	}

	public void add(com.google.javascript.jscomp.CompilerInput input) {
		inputs.add(input);
		input.setModule(com.google.javascript.jscomp.JSModule.this);
	}

	public void addFirst(com.google.javascript.jscomp.CompilerInput input) {
		inputs.add(0, input);
		input.setModule(com.google.javascript.jscomp.JSModule.this);
	}

	public void addAfter(com.google.javascript.jscomp.CompilerInput input, com.google.javascript.jscomp.CompilerInput other) {
		com.google.common.base.Preconditions.checkState(inputs.contains(other));
		inputs.add(inputs.indexOf(other), input);
		input.setModule(com.google.javascript.jscomp.JSModule.this);
	}

	public void addDependency(com.google.javascript.jscomp.JSModule dep) {
		com.google.common.base.Preconditions.checkState((dep != (com.google.javascript.jscomp.JSModule.this)));
		deps.add(dep);
	}

	public void remove(com.google.javascript.jscomp.CompilerInput input) {
		input.setModule(null);
		inputs.remove(input);
	}

	public void removeAll() {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			input.setModule(null);
		}
		inputs.clear();
	}

	public java.util.List<com.google.javascript.jscomp.JSModule> getDependencies() {
		return deps;
	}

	java.util.List<java.lang.String> getSortedDependencyNames() {
		java.util.List<java.lang.String> names = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.JSModule module : getDependencies()) {
			names.add(module.getName());
		}
		java.util.Collections.sort(names);
		return names;
	}

	public java.util.Set<com.google.javascript.jscomp.JSModule> getAllDependencies() {
		java.util.Set<com.google.javascript.jscomp.JSModule> allDeps = com.google.common.collect.Sets.newHashSet(deps);
		java.util.List<com.google.javascript.jscomp.JSModule> workList = com.google.common.collect.Lists.newArrayList(deps);
		while ((workList.size()) > 0) {
			com.google.javascript.jscomp.JSModule module = workList.remove(((workList.size()) - 1));
			for (com.google.javascript.jscomp.JSModule dep : module.getDependencies()) {
				if (allDeps.add(dep)) {
					workList.add(dep);
				}
			}
		} 
		return allDeps;
	}

	public java.util.Set<com.google.javascript.jscomp.JSModule> getThisAndAllDependencies() {
		java.util.Set<com.google.javascript.jscomp.JSModule> deps = getAllDependencies();
		deps.add(com.google.javascript.jscomp.JSModule.this);
		return deps;
	}

	public java.util.List<com.google.javascript.jscomp.CompilerInput> getInputs() {
		return inputs;
	}

	public com.google.javascript.jscomp.CompilerInput getByName(java.lang.String name) {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			if (name.equals(input.getName())) {
				return input;
			}
		}
		return null;
	}

	public boolean removeByName(java.lang.String name) {
		boolean found = false;
		java.util.Iterator<com.google.javascript.jscomp.CompilerInput> iter = inputs.iterator();
		while (iter.hasNext()) {
			com.google.javascript.jscomp.CompilerInput file = iter.next();
			if (name.equals(file.getName())) {
				iter.remove();
				file.setModule(null);
				found = true;
			}
		} 
		return found;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name;
	}

	public void clearAsts() {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			input.clearAst();
		}
	}

	public void sortInputsByDeps(com.google.javascript.jscomp.Compiler compiler) {
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			input.setCompiler(compiler);
		}
		try {
			java.util.List<com.google.javascript.jscomp.CompilerInput> sortedList = new com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.CompilerInput>(java.util.Collections.<com.google.javascript.jscomp.CompilerInput>unmodifiableList(inputs)).getSortedList();
			inputs.clear();
			inputs.addAll(sortedList);
		} catch (com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.JSModule.CIRCULAR_DEPENDENCY_ERROR, e.getMessage()));
		}
	}

	public static com.google.javascript.jscomp.JSModule[] sortJsModules(java.util.Collection<com.google.javascript.jscomp.JSModule> modules) throws com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException {
		java.util.List<com.google.javascript.jscomp.JSModule> sortedList = new com.google.javascript.jscomp.deps.SortedDependencies<com.google.javascript.jscomp.JSModule>(com.google.common.collect.Lists.newArrayList(modules)).getSortedList();
		return sortedList.toArray(new com.google.javascript.jscomp.JSModule[sortedList.size()]);
	}

	public void setDepth(int dep) {
		com.google.javascript.jscomp.JSModule.this.depth = dep;
	}

	public int getDepth() {
		return depth;
	}
}

