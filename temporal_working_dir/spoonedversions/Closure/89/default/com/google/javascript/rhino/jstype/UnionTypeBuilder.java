

package com.google.javascript.rhino.jstype;


class UnionTypeBuilder implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private static final int MAX_UNION_SIZE = 20;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final java.util.List<com.google.javascript.rhino.jstype.JSType> alternates = com.google.common.collect.Lists.newArrayList();

	private boolean isAllType = false;

	private boolean isNativeUnknownType = false;

	private boolean areAllUnknownsChecked = true;

	private com.google.javascript.rhino.jstype.JSType result = null;

	UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	com.google.javascript.rhino.jstype.UnionTypeBuilder addAlternate(com.google.javascript.rhino.jstype.JSType alternate) {
		if (alternate.isNoType()) {
			return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
		}
		isAllType = (isAllType) || (alternate.isAllType());
		boolean isAlternateUnknown = alternate instanceof com.google.javascript.rhino.jstype.UnknownType;
		isNativeUnknownType = (isNativeUnknownType) || isAlternateUnknown;
		if (isAlternateUnknown) {
			areAllUnknownsChecked = (areAllUnknownsChecked) && (alternate.isCheckedUnknownType());
		}
		if ((!(isAllType)) && (!(isNativeUnknownType))) {
			if (alternate instanceof com.google.javascript.rhino.jstype.UnionType) {
				com.google.javascript.rhino.jstype.UnionType union = ((com.google.javascript.rhino.jstype.UnionType) (alternate));
				for (com.google.javascript.rhino.jstype.JSType unionAlt : union.getAlternates()) {
					addAlternate(unionAlt);
				}
			}else {
				if ((alternates.size()) > (com.google.javascript.rhino.jstype.UnionTypeBuilder.MAX_UNION_SIZE)) {
					return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
				}
				java.util.Iterator<com.google.javascript.rhino.jstype.JSType> it = alternates.iterator();
				while (it.hasNext()) {
					com.google.javascript.rhino.jstype.JSType current = it.next();
					if ((alternate.isUnknownType()) || (current.isUnknownType())) {
						if (alternate.isEquivalentTo(current)) {
							return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
						}
					}else {
						if (alternate.isSubtype(current)) {
							return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
						}else
							if (current.isSubtype(alternate)) {
								it.remove();
							}
						
					}
				} 
				alternates.add(alternate);
				result = null;
			}
		}else {
			result = null;
		}
		return com.google.javascript.rhino.jstype.UnionTypeBuilder.this;
	}

	com.google.javascript.rhino.jstype.JSType build() {
		if ((result) == null) {
			if (isAllType) {
				result = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
			}else
				if (isNativeUnknownType) {
					if (areAllUnknownsChecked) {
						result = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE);
					}else {
						result = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}
				}else {
					int size = alternates.size();
					if (size > (com.google.javascript.rhino.jstype.UnionTypeBuilder.MAX_UNION_SIZE)) {
						result = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}else {
						if (size > 1) {
							result = new com.google.javascript.rhino.jstype.UnionType(registry, getAlternateListCopy());
						}else
							if (size == 1) {
								result = alternates.iterator().next();
							}else {
								result = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
							}
						
					}
				}
			
		}
		return result;
	}

	private static final java.util.Comparator<com.google.javascript.rhino.jstype.JSType> typeSorter = new java.util.Comparator<com.google.javascript.rhino.jstype.JSType>() {
		@java.lang.Override
		public int compare(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
			return (b.hashCode()) - (a.hashCode());
		}
	};

	private java.util.Collection<com.google.javascript.rhino.jstype.JSType> getAlternateListCopy() {
		java.util.Collections.sort(alternates, com.google.javascript.rhino.jstype.UnionTypeBuilder.typeSorter);
		return com.google.common.collect.ImmutableList.copyOf(alternates);
	}
}

