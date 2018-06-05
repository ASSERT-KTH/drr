

package com.google.javascript.rhino.jstype;


class PropertyMap implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private static final com.google.javascript.rhino.jstype.PropertyMap EMPTY_MAP = new com.google.javascript.rhino.jstype.PropertyMap(com.google.common.collect.ImmutableMap.<java.lang.String, com.google.javascript.rhino.jstype.Property>of());

	private static final com.google.common.base.Function<com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.PropertyMap> PROP_MAP_FROM_TYPE = new com.google.common.base.Function<com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.PropertyMap>() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.PropertyMap apply(com.google.javascript.rhino.jstype.ObjectType t) {
			return t.getPropertyMap();
		}
	};

	private com.google.javascript.rhino.jstype.ObjectType parentSource = null;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.Property> properties;

	PropertyMap() {
		this(com.google.common.collect.Maps.<java.lang.String, com.google.javascript.rhino.jstype.Property>newTreeMap());
	}

	private PropertyMap(java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.Property> underlyingMap) {
		this.properties = underlyingMap;
	}

	static com.google.javascript.rhino.jstype.PropertyMap immutableEmptyMap() {
		return com.google.javascript.rhino.jstype.PropertyMap.EMPTY_MAP;
	}

	void setParentSource(com.google.javascript.rhino.jstype.ObjectType ownerType) {
		if ((com.google.javascript.rhino.jstype.PropertyMap.this) != (com.google.javascript.rhino.jstype.PropertyMap.EMPTY_MAP)) {
			com.google.javascript.rhino.jstype.PropertyMap.this.parentSource = ownerType;
		}
	}

	com.google.javascript.rhino.jstype.PropertyMap getPrimaryParent() {
		if ((parentSource) == null) {
			return null;
		}
		com.google.javascript.rhino.jstype.ObjectType iProto = parentSource.getImplicitPrototype();
		return iProto == null ? null : iProto.getPropertyMap();
	}

	java.lang.Iterable<com.google.javascript.rhino.jstype.PropertyMap> getSecondaryParents() {
		if ((parentSource) == null) {
			return com.google.common.collect.ImmutableList.of();
		}
		java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> extendedInterfaces = parentSource.getCtorExtendedInterfaces();
		if (com.google.common.collect.Iterables.isEmpty(extendedInterfaces)) {
			return com.google.common.collect.ImmutableList.of();
		}
		return com.google.common.collect.Iterables.transform(extendedInterfaces, com.google.javascript.rhino.jstype.PropertyMap.PROP_MAP_FROM_TYPE);
	}

	com.google.javascript.rhino.jstype.Property getSlot(java.lang.String name) {
		if (properties.containsKey(name)) {
			return properties.get(name);
		}
		com.google.javascript.rhino.jstype.PropertyMap primaryParent = getPrimaryParent();
		if (primaryParent != null) {
			com.google.javascript.rhino.jstype.Property prop = primaryParent.getSlot(name);
			if (prop != null) {
				return prop;
			}
		}
		for (com.google.javascript.rhino.jstype.PropertyMap p : getSecondaryParents()) {
			if (p != null) {
				com.google.javascript.rhino.jstype.Property prop = p.getSlot(name);
				if (prop != null) {
					return prop;
				}
			}
		}
		return null;
	}

	com.google.javascript.rhino.jstype.Property getOwnProperty(java.lang.String propertyName) {
		return properties.get(propertyName);
	}

	int getPropertiesCount() {
		com.google.javascript.rhino.jstype.PropertyMap primaryParent = getPrimaryParent();
		if (primaryParent == null) {
			return com.google.javascript.rhino.jstype.PropertyMap.this.properties.size();
		}
		java.util.Set<java.lang.String> props = com.google.common.collect.Sets.newHashSet();
		collectPropertyNames(props);
		return props.size();
	}

	boolean hasOwnProperty(java.lang.String propertyName) {
		return (properties.get(propertyName)) != null;
	}

	boolean hasProperty(java.lang.String propertyName) {
		return (getSlot(propertyName)) != null;
	}

	java.util.Set<java.lang.String> getOwnPropertyNames() {
		return properties.keySet();
	}

	void collectPropertyNames(java.util.Set<java.lang.String> props) {
		for (java.lang.String prop : properties.keySet()) {
			props.add(prop);
		}
		com.google.javascript.rhino.jstype.PropertyMap primaryParent = getPrimaryParent();
		if (primaryParent != null) {
			primaryParent.collectPropertyNames(props);
		}
		for (com.google.javascript.rhino.jstype.PropertyMap p : getSecondaryParents()) {
			if (p != null) {
				p.collectPropertyNames(props);
			}
		}
	}

	boolean removeProperty(java.lang.String name) {
		return (properties.remove(name)) != null;
	}

	void putProperty(java.lang.String name, com.google.javascript.rhino.jstype.Property newProp) {
		com.google.javascript.rhino.jstype.Property oldProp = properties.get(name);
		if (oldProp != null) {
			newProp.setJSDocInfo(oldProp.getJSDocInfo());
		}
		properties.put(name, newProp);
	}

	java.lang.Iterable<com.google.javascript.rhino.jstype.Property> values() {
		return properties.values();
	}
}

