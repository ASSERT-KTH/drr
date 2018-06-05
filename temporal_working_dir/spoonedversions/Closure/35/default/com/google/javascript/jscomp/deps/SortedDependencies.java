

package com.google.javascript.jscomp.deps;


public class SortedDependencies<INPUT extends com.google.javascript.jscomp.deps.DependencyInfo> {
	private final java.util.List<INPUT> inputs;

	private final java.util.List<INPUT> sortedList;

	private final java.util.List<INPUT> noProvides;

	private final java.util.Map<java.lang.String, INPUT> provideMap = com.google.common.collect.Maps.newHashMap();

	public SortedDependencies(java.util.List<INPUT> inputs) throws com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException {
		this.inputs = com.google.common.collect.Lists.newArrayList(inputs);
		noProvides = com.google.common.collect.Lists.newArrayList();
		for (INPUT input : inputs) {
			java.util.Collection<java.lang.String> currentProvides = input.getProvides();
			if (currentProvides.isEmpty()) {
				noProvides.add(input);
			}
			for (java.lang.String provide : currentProvides) {
				provideMap.put(provide, input);
			}
		}
		final com.google.common.collect.Multimap<INPUT, INPUT> deps = com.google.common.collect.HashMultimap.create();
		for (INPUT input : inputs) {
			for (java.lang.String req : input.getRequires()) {
				INPUT dep = provideMap.get(req);
				if (dep != null) {
					deps.put(input, dep);
				}
			}
		}
		sortedList = com.google.javascript.jscomp.deps.SortedDependencies.topologicalStableSort(inputs, deps);
		if ((sortedList.size()) < (inputs.size())) {
			java.util.List<INPUT> subGraph = com.google.common.collect.Lists.newArrayList(inputs);
			subGraph.removeAll(sortedList);
			throw new com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException(cycleToString(findCycle(subGraph, deps)));
		}
	}

	public INPUT getInputProviding(java.lang.String symbol) throws com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException {
		if (provideMap.containsKey(symbol)) {
			return provideMap.get(symbol);
		}
		throw new com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException(symbol);
	}

	private java.util.List<INPUT> findCycle(java.util.List<INPUT> subGraph, com.google.common.collect.Multimap<INPUT, INPUT> deps) {
		return findCycle(subGraph.get(0), com.google.common.collect.Sets.<INPUT>newHashSet(subGraph), deps, com.google.common.collect.Sets.<INPUT>newHashSet());
	}

	private java.util.List<INPUT> findCycle(INPUT current, java.util.Set<INPUT> subGraph, com.google.common.collect.Multimap<INPUT, INPUT> deps, java.util.Set<INPUT> covered) {
		if (covered.add(current)) {
			java.util.List<INPUT> cycle = findCycle(findRequireInSubGraphOrFail(current, subGraph), subGraph, deps, covered);
			if ((cycle.get(0)) != (cycle.get(((cycle.size()) - 1)))) {
				cycle.add(current);
			}
			return cycle;
		}else {
			java.util.List<INPUT> cycle = com.google.common.collect.Lists.<INPUT>newArrayList();
			cycle.add(current);
			return cycle;
		}
	}

	private INPUT findRequireInSubGraphOrFail(INPUT input, java.util.Set<INPUT> subGraph) {
		for (java.lang.String symbol : input.getRequires()) {
			INPUT candidate = provideMap.get(symbol);
			if (subGraph.contains(candidate)) {
				return candidate;
			}
		}
		throw new java.lang.IllegalStateException("no require found in subgraph");
	}

	private java.lang.String cycleToString(java.util.List<INPUT> cycle) {
		java.util.List<java.lang.String> symbols = com.google.common.collect.Lists.newArrayList();
		for (int i = (cycle.size()) - 1; i >= 0; i--) {
			symbols.add(cycle.get(i).getProvides().iterator().next());
		}
		symbols.add(symbols.get(0));
		return com.google.common.base.Joiner.on(" -> ").join(symbols);
	}

	public java.util.List<INPUT> getSortedList() {
		return java.util.Collections.<INPUT>unmodifiableList(sortedList);
	}

	public java.util.List<INPUT> getSortedDependenciesOf(java.util.List<INPUT> roots) {
		return getDependenciesOf(roots, true);
	}

	public java.util.List<INPUT> getDependenciesOf(java.util.List<INPUT> roots, boolean sorted) {
		com.google.common.base.Preconditions.checkArgument(inputs.containsAll(roots));
		java.util.Set<INPUT> included = com.google.common.collect.Sets.newHashSet();
		java.util.Deque<INPUT> worklist = new java.util.ArrayDeque<INPUT>(roots);
		while (!(worklist.isEmpty())) {
			INPUT current = worklist.pop();
			if (included.add(current)) {
				for (java.lang.String req : current.getRequires()) {
					INPUT dep = provideMap.get(req);
					if (dep != null) {
						worklist.add(dep);
					}
				}
			}
		} 
		com.google.common.collect.ImmutableList.Builder<INPUT> builder = com.google.common.collect.ImmutableList.builder();
		for (INPUT current : sorted ? sortedList : inputs) {
			if (included.contains(current)) {
				builder.add(current);
			}
		}
		return builder.build();
	}

	public java.util.List<INPUT> getInputsWithoutProvides() {
		return java.util.Collections.<INPUT>unmodifiableList(noProvides);
	}

	private static <T> java.util.List<T> topologicalStableSort(java.util.List<T> items, com.google.common.collect.Multimap<T, T> deps) {
		if ((items.size()) == 0) {
			return com.google.common.collect.Lists.newArrayList();
		}
		final java.util.Map<T, java.lang.Integer> originalIndex = com.google.common.collect.Maps.newHashMap();
		for (int i = 0; i < (items.size()); i++) {
			originalIndex.put(items.get(i), i);
		}
		java.util.PriorityQueue<T> inDegreeZero = new java.util.PriorityQueue<T>(items.size(), new java.util.Comparator<T>() {
			@java.lang.Override
			public int compare(T a, T b) {
				return (originalIndex.get(a).intValue()) - (originalIndex.get(b).intValue());
			}
		});
		java.util.List<T> result = com.google.common.collect.Lists.newArrayList();
		com.google.common.collect.Multiset<T> inDegree = com.google.common.collect.HashMultiset.create();
		com.google.common.collect.Multimap<T, T> reverseDeps = com.google.common.collect.ArrayListMultimap.create();
		com.google.common.collect.Multimaps.invertFrom(deps, reverseDeps);
		for (T item : items) {
			java.util.Collection<T> itemDeps = deps.get(item);
			inDegree.add(item, itemDeps.size());
			if (itemDeps.isEmpty()) {
				inDegreeZero.add(item);
			}
		}
		while (!(inDegreeZero.isEmpty())) {
			T item = inDegreeZero.remove();
			result.add(item);
			for (T inWaiting : reverseDeps.get(item)) {
				inDegree.remove(inWaiting, 1);
				if ((inDegree.count(inWaiting)) == 0) {
					inDegreeZero.add(inWaiting);
				}
			}
		} 
		return result;
	}

	public static class CircularDependencyException extends java.lang.Exception {
		CircularDependencyException(java.lang.String message) {
			super(message);
		}
	}

	public static class MissingProvideException extends java.lang.Exception {
		MissingProvideException(java.lang.String provide) {
			super(provide);
		}
	}
}

