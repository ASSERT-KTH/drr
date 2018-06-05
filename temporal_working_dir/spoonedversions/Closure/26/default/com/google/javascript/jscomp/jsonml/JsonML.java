

package com.google.javascript.jscomp.jsonml;


public class JsonML {
	private final com.google.javascript.jscomp.jsonml.TagType type;

	private java.util.Map<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object> attributes = new java.util.EnumMap<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object>(com.google.javascript.jscomp.jsonml.TagAttr.class);

	private java.util.List<com.google.javascript.jscomp.jsonml.JsonML> children = new java.util.ArrayList<com.google.javascript.jscomp.jsonml.JsonML>();

	public JsonML(com.google.javascript.jscomp.jsonml.TagType type) {
		this.type = type;
	}

	public JsonML(com.google.javascript.jscomp.jsonml.TagType type, com.google.javascript.jscomp.jsonml.JsonML... children) {
		this(type, java.util.Arrays.asList(children));
	}

	public JsonML(com.google.javascript.jscomp.jsonml.TagType type, java.util.List<? extends com.google.javascript.jscomp.jsonml.JsonML> children) {
		this(type, java.util.Collections.<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object>emptyMap(), children);
	}

	public JsonML(com.google.javascript.jscomp.jsonml.TagType type, java.util.Map<? extends com.google.javascript.jscomp.jsonml.TagAttr, ?> attributes) {
		this(type, attributes, java.util.Collections.<com.google.javascript.jscomp.jsonml.JsonML>emptyList());
	}

	public JsonML(com.google.javascript.jscomp.jsonml.TagType type, java.util.Map<? extends com.google.javascript.jscomp.jsonml.TagAttr, ?> attributes, java.util.List<? extends com.google.javascript.jscomp.jsonml.JsonML> children) {
		this.type = type;
		com.google.javascript.jscomp.jsonml.JsonML.this.attributes.putAll(attributes);
		appendChildren(children);
	}

	public void addChild(int index, com.google.javascript.jscomp.jsonml.JsonML element) {
		children.add(index, element);
	}

	public void appendChild(com.google.javascript.jscomp.jsonml.JsonML element) {
		children.add(element);
	}

	public void appendChildren(java.util.Collection<? extends com.google.javascript.jscomp.jsonml.JsonML> elements) {
		children.addAll(elements);
	}

	public int childrenSize() {
		return children.size();
	}

	public void clearChildren() {
		setChildren();
	}

	public java.lang.Object getAttribute(com.google.javascript.jscomp.jsonml.TagAttr name) {
		return attributes.get(name);
	}

	public java.util.Map<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object> getAttributes() {
		return attributes;
	}

	public com.google.javascript.jscomp.jsonml.JsonML getChild(int index) {
		return children.get(index);
	}

	public java.util.List<com.google.javascript.jscomp.jsonml.JsonML> getChildren() {
		return children;
	}

	public java.util.List<com.google.javascript.jscomp.jsonml.JsonML> getChildren(int fromIndex, int toIndex) {
		return children.subList(fromIndex, toIndex);
	}

	public com.google.javascript.jscomp.jsonml.TagType getType() {
		return type;
	}

	public boolean hasChildren() {
		return !(children.isEmpty());
	}

	public void setAttribute(com.google.javascript.jscomp.jsonml.TagAttr name, java.lang.Object value) {
		attributes.put(name, value);
	}

	public void setAttributes(java.util.Map<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object> attributes) {
		com.google.javascript.jscomp.jsonml.JsonML.this.attributes = attributes;
	}

	public void setChild(int index, com.google.javascript.jscomp.jsonml.JsonML element) {
		children.set(index, element);
	}

	public void setChildren(com.google.javascript.jscomp.jsonml.JsonML... children) {
		com.google.javascript.jscomp.jsonml.JsonML.this.children.clear();
		com.google.javascript.jscomp.jsonml.JsonML.this.children.addAll(java.util.Arrays.asList(children));
	}

	public void setChildren(java.util.List<com.google.javascript.jscomp.jsonml.JsonML> children) {
		com.google.javascript.jscomp.jsonml.JsonML.this.children = children;
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		toString(sb, true, true);
		return sb.toString();
	}

	private void toString(java.lang.StringBuilder sb, boolean printAttributes, boolean printChildren) {
		sb.append("[\"");
		com.google.javascript.jscomp.jsonml.JsonML.escapeStringOnto(type.name(), sb);
		sb.append('"');
		if (printAttributes) {
			sb.append(", {");
			boolean first = true;
			for (java.util.Map.Entry<com.google.javascript.jscomp.jsonml.TagAttr, java.lang.Object> entry : attributes.entrySet()) {
				if (first) {
					first = false;
				}else {
					sb.append(", ");
				}
				sb.append('"');
				com.google.javascript.jscomp.jsonml.JsonML.escapeStringOnto(entry.getKey().toString(), sb);
				sb.append("\": ");
				java.lang.Object value = entry.getValue();
				if (value == null) {
					sb.append("null");
				}else
					if (value instanceof java.lang.String) {
						sb.append('"');
						com.google.javascript.jscomp.jsonml.JsonML.escapeStringOnto(((java.lang.String) (value)), sb);
						sb.append('"');
					}else {
						sb.append(value);
					}
				
			}
			sb.append("}");
		}
		if (printChildren) {
			for (com.google.javascript.jscomp.jsonml.JsonML child : children) {
				sb.append(", ");
				sb.append(child.toString());
			}
		}
		sb.append(']');
	}

	private static void escapeStringOnto(java.lang.String s, java.lang.StringBuilder sb) {
		int pos = 0;
		int n = s.length();
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			switch (ch) {
				case '\r' :
				case '\n' :
				case '"' :
				case '\\' :
				case '\u2028' :
				case '\u2029' :
					java.lang.String hex = java.lang.Integer.toString(ch, 16);
					sb.append(s, pos, i).append("\\u").append("0000", hex.length(), 4).append(hex);
					pos = i + 1;
					break;
			}
		}
		sb.append(s, pos, n);
	}

	public java.lang.String toStringTree() {
		try {
			java.lang.StringBuilder s = new java.lang.StringBuilder();
			com.google.javascript.jscomp.jsonml.JsonML.toStringTreeHelper(com.google.javascript.jscomp.jsonml.JsonML.this, 0, s);
			return s.toString();
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(("Should not happen\n" + e));
		}
	}

	private static void toStringTreeHelper(com.google.javascript.jscomp.jsonml.JsonML element, int level, java.lang.StringBuilder sb) throws java.io.IOException {
		for (int i = 0; i < level; ++i) {
			sb.append("    ");
		}
		element.toString(sb, true, false);
		sb.append("\n");
		for (com.google.javascript.jscomp.jsonml.JsonML child : element.getChildren()) {
			com.google.javascript.jscomp.jsonml.JsonML.toStringTreeHelper(child, (level + 1), sb);
		}
	}
}

