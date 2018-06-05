

package com.google.javascript.jscomp.deps;


public interface DependencyInfo {
	public java.lang.String getName();

	public java.lang.String getPathRelativeToClosureBase();

	public java.util.Collection<java.lang.String> getProvides();

	public java.util.Collection<java.lang.String> getRequires();
}

