

package com.google.javascript.jscomp;


public class DependencyOptions implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private boolean sortDependencies = false;

	private boolean pruneDependencies = false;

	private boolean dropMoochers = false;

	private final java.util.Set<java.lang.String> entryPoints = com.google.common.collect.Sets.newHashSet();

	public com.google.javascript.jscomp.DependencyOptions setDependencySorting(boolean enabled) {
		com.google.javascript.jscomp.DependencyOptions.this.sortDependencies = enabled;
		return com.google.javascript.jscomp.DependencyOptions.this;
	}

	public com.google.javascript.jscomp.DependencyOptions setDependencyPruning(boolean enabled) {
		com.google.javascript.jscomp.DependencyOptions.this.pruneDependencies = enabled;
		return com.google.javascript.jscomp.DependencyOptions.this;
	}

	public com.google.javascript.jscomp.DependencyOptions setMoocherDropping(boolean enabled) {
		com.google.javascript.jscomp.DependencyOptions.this.dropMoochers = enabled;
		return com.google.javascript.jscomp.DependencyOptions.this;
	}

	public void setEntryPoints(java.util.Collection<java.lang.String> symbols) {
		entryPoints.clear();
		entryPoints.addAll(symbols);
	}

	boolean needsManagement() {
		return (sortDependencies) || (pruneDependencies);
	}

	boolean shouldSortDependencies() {
		return sortDependencies;
	}

	boolean shouldPruneDependencies() {
		return pruneDependencies;
	}

	boolean shouldDropMoochers() {
		return (pruneDependencies) && (dropMoochers);
	}

	java.util.Collection<java.lang.String> getEntryPoints() {
		return entryPoints;
	}
}

