

package com.google.javascript.rhino.jstype;


public class RecordTypeBuilder {
	private boolean isEmpty = true;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> properties = com.google.common.collect.Maps.newHashMap();

	public RecordTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	public com.google.javascript.rhino.jstype.RecordTypeBuilder addProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node propertyNode) {
		isEmpty = false;
		if (properties.containsKey(name)) {
			return null;
		}
		properties.put(name, new com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty(type, propertyNode));
		return com.google.javascript.rhino.jstype.RecordTypeBuilder.this;
	}

	public com.google.javascript.rhino.jstype.JSType build() {
		if (isEmpty) {
			return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		}
		return registry.createRecordType(java.util.Collections.unmodifiableMap(properties));
	}

	static class RecordProperty {
		private final com.google.javascript.rhino.jstype.JSType type;

		private final com.google.javascript.rhino.Node propertyNode;

		RecordProperty(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node propertyNode) {
			this.type = type;
			this.propertyNode = propertyNode;
		}

		public com.google.javascript.rhino.jstype.JSType getType() {
			return type;
		}

		public com.google.javascript.rhino.Node getPropertyNode() {
			return propertyNode;
		}
	}
}

