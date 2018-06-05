

package com.google.javascript.jscomp.jsonml;


public enum TagAttr {
BODY("body"), DIRECTIVE("directive"), END_COLUMN("endColumn"), END_LINE("endLine"), FLAGS("flags"), IS_PREFIX("isPrefix"), LABEL("label"), NAME("name"), OP("op"), OPAQUE_POSITION("opaque_position"), SOURCE("source"), START_COLUMN("startColumn"), START_LINE("startLine"), TYPE("type"), VALUE("value");
	private final java.lang.String name;

	private static final java.util.Map<java.lang.String, com.google.javascript.jscomp.jsonml.TagAttr> lookup = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.jsonml.TagAttr>();

	static {
		for (com.google.javascript.jscomp.jsonml.TagAttr t : com.google.javascript.jscomp.jsonml.TagAttr.values()) {
			com.google.javascript.jscomp.jsonml.TagAttr.lookup.put(t.getName(), t);
		}
	}

	private java.lang.String getName() {
		return name;
	}

	private TagAttr(java.lang.String name) {
		this.name = name;
	}

	public static com.google.javascript.jscomp.jsonml.TagAttr get(java.lang.String name) {
		return com.google.javascript.jscomp.jsonml.TagAttr.lookup.get(name);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name;
	}
}

