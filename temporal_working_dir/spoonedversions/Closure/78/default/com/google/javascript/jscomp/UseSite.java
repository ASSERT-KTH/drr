

package com.google.javascript.jscomp;


class UseSite {
	final com.google.javascript.rhino.Node node;

	final com.google.javascript.jscomp.JSModule module;

	UseSite(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module) {
		this.node = node;
		this.module = module;
	}

	@java.lang.Override
	public int hashCode() {
		return com.google.javascript.jscomp.UseSite.this.node.hashCode();
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		return (o instanceof com.google.javascript.jscomp.UseSite) && (((com.google.javascript.jscomp.UseSite) (o)).node.equals(com.google.javascript.jscomp.UseSite.this.node));
	}
}

