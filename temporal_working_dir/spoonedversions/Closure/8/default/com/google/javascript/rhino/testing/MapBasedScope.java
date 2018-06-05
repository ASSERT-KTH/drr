

package com.google.javascript.rhino.testing;


public class MapBasedScope extends com.google.javascript.rhino.testing.AbstractStaticScope<com.google.javascript.rhino.jstype.JSType> {
	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> slots = com.google.common.collect.Maps.newHashMap();

	public MapBasedScope(java.util.Map<java.lang.String, ? extends com.google.javascript.rhino.jstype.JSType> namesToTypes) {
		for (java.util.Map.Entry<java.lang.String, ? extends com.google.javascript.rhino.jstype.JSType> entry : namesToTypes.entrySet()) {
			slots.put(entry.getKey(), new com.google.javascript.rhino.jstype.SimpleSlot(entry.getKey(), entry.getValue(), false));
		}
	}

	public static com.google.javascript.rhino.testing.MapBasedScope emptyScope() {
		return new com.google.javascript.rhino.testing.MapBasedScope(com.google.common.collect.ImmutableMap.<java.lang.String, com.google.javascript.rhino.jstype.JSType>of());
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSlot(java.lang.String name) {
		return slots.get(name);
	}
}

