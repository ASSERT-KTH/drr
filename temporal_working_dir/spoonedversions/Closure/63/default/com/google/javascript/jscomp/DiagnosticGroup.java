

package com.google.javascript.jscomp;


public class DiagnosticGroup implements java.io.Serializable {
	private static final long serialVersionUID = 1;

	private final java.util.Set<com.google.javascript.jscomp.DiagnosticType> types;

	private final java.lang.String name;

	DiagnosticGroup(java.lang.String name, com.google.javascript.jscomp.DiagnosticType... types) {
		this.name = name;
		this.types = com.google.common.collect.ImmutableSet.copyOf(java.util.Arrays.asList(types));
	}

	public DiagnosticGroup(com.google.javascript.jscomp.DiagnosticType... types) {
		this(null, types);
	}

	private DiagnosticGroup(com.google.javascript.jscomp.DiagnosticType type) {
		this.name = null;
		this.types = com.google.common.collect.ImmutableSet.of(type);
	}

	private static final java.util.Map<com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.DiagnosticGroup> singletons = com.google.common.collect.Maps.newHashMap();

	static com.google.javascript.jscomp.DiagnosticGroup forType(com.google.javascript.jscomp.DiagnosticType type) {
		if (!(com.google.javascript.jscomp.DiagnosticGroup.singletons.containsKey(type))) {
			com.google.javascript.jscomp.DiagnosticGroup.singletons.put(type, new com.google.javascript.jscomp.DiagnosticGroup(type));
		}
		return com.google.javascript.jscomp.DiagnosticGroup.singletons.get(type);
	}

	public DiagnosticGroup(com.google.javascript.jscomp.DiagnosticGroup... groups) {
		this(null, groups);
	}

	public DiagnosticGroup(java.lang.String name, com.google.javascript.jscomp.DiagnosticGroup... groups) {
		java.util.Set<com.google.javascript.jscomp.DiagnosticType> set = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.jscomp.DiagnosticGroup group : groups) {
			set.addAll(group.types);
		}
		this.name = name;
		this.types = com.google.common.collect.ImmutableSet.copyOf(set);
	}

	public boolean matches(com.google.javascript.jscomp.JSError error) {
		return matches(error.getType());
	}

	public boolean matches(com.google.javascript.jscomp.DiagnosticType type) {
		return types.contains(type);
	}

	boolean isSubGroup(com.google.javascript.jscomp.DiagnosticGroup group) {
		for (com.google.javascript.jscomp.DiagnosticType type : group.types) {
			if (!(matches(type))) {
				return false;
			}
		}
		return true;
	}

	java.util.Collection<com.google.javascript.jscomp.DiagnosticType> getTypes() {
		return types;
	}

	public java.lang.String toString() {
		return (name) == null ? super.toString() : ("DiagnosticGroup<" + (name)) + ">";
	}
}

