

package com.google.javascript.jscomp.deps;


public class SimpleDependencyInfo implements com.google.javascript.jscomp.deps.DependencyInfo {
	private final java.util.List<java.lang.String> provides;

	private final java.util.List<java.lang.String> requires;

	private final java.lang.String srcPathRelativeToClosure;

	private final java.lang.String pathOfDefiningFile;

	public SimpleDependencyInfo(java.lang.String srcPathRelativeToClosure, java.lang.String pathOfDefiningFile, java.util.List<java.lang.String> provides, java.util.List<java.lang.String> requires) {
		this.srcPathRelativeToClosure = srcPathRelativeToClosure;
		this.pathOfDefiningFile = pathOfDefiningFile;
		this.provides = provides;
		this.requires = requires;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return pathOfDefiningFile;
	}

	@java.lang.Override
	public java.lang.String getPathRelativeToClosureBase() {
		return srcPathRelativeToClosure;
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getProvides() {
		return java.util.Collections.<java.lang.String>unmodifiableList(provides);
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getRequires() {
		return java.util.Collections.<java.lang.String>unmodifiableList(requires);
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof com.google.javascript.jscomp.deps.SimpleDependencyInfo)) {
			return false;
		}
		com.google.javascript.jscomp.deps.SimpleDependencyInfo other = ((com.google.javascript.jscomp.deps.SimpleDependencyInfo) (obj));
		return (((com.google.common.base.Objects.equal(other.srcPathRelativeToClosure, srcPathRelativeToClosure)) && (com.google.common.base.Objects.equal(other.pathOfDefiningFile, pathOfDefiningFile))) && (com.google.common.base.Objects.equal(other.requires, com.google.javascript.jscomp.deps.SimpleDependencyInfo.this.requires))) && (com.google.common.base.Objects.equal(other.provides, com.google.javascript.jscomp.deps.SimpleDependencyInfo.this.provides));
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format(("DependencyInfo(relativePath='%1$s', path='%2$s', " + "provides=%3$s, requires=%4$s)"), srcPathRelativeToClosure, pathOfDefiningFile, provides, requires);
	}
}

