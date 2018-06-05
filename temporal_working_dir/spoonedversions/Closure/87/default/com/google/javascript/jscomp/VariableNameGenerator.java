

package com.google.javascript.jscomp;


class VariableNameGenerator {
	private final com.google.javascript.jscomp.NameGenerator names;

	VariableNameGenerator(com.google.javascript.jscomp.Scope scope) {
		java.util.Set<java.lang.String> usedNames = com.google.common.collect.Sets.newHashSet();
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> i = scope.getVars(); i.hasNext();) {
			usedNames.add(i.next().getName());
		}
		names = new com.google.javascript.jscomp.NameGenerator(usedNames, "", null);
	}

	java.lang.String getNameNewName() {
		return names.generateNextName();
	}
}

