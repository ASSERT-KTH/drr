

package com.google.javascript.rhino.jstype;


public class RecordTypeBuilder {
	private boolean isEmpty = true;

	private com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.javascript.rhino.jstype.JSType> properties = com.google.common.collect.ImmutableMap.builder();

	public RecordTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		com.google.javascript.rhino.jstype.RecordTypeBuilder.this.registry = registry;
	}

	public com.google.javascript.rhino.jstype.RecordTypeBuilder addProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type) {
		isEmpty = false;
		properties.put(name, type);
		return com.google.javascript.rhino.jstype.RecordTypeBuilder.this;
	}

	public com.google.javascript.rhino.jstype.JSType build() {
		if (isEmpty) {
			return registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		}
		return registry.createRecordType(properties.build());
	}
}

