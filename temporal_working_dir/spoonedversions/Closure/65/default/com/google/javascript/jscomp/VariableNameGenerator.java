

package com.google.javascript.jscomp;


class VariableNameGenerator {
	private final com.google.javascript.jscomp.NameGenerator names;

	private final com.google.javascript.jscomp.Scope scope;

	VariableNameGenerator(com.google.javascript.jscomp.Scope scope) {
		this.scope = scope;
		java.util.Set<java.lang.String> usedNames = com.google.common.collect.Sets.newHashSet();
		names = new com.google.javascript.jscomp.NameGenerator(usedNames, "", null);
	}

	java.lang.String getNextNewName() {
		java.lang.String name = null;
		while (scope.isDeclared((name = names.generateNextName()), true)) {
		} 
		return name;
	}
}

