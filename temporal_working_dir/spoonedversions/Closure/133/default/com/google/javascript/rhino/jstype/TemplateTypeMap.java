

package com.google.javascript.rhino.jstype;


public class TemplateTypeMap implements java.io.Serializable {
	private final com.google.common.collect.ImmutableList<java.lang.String> templateKeys;

	private final com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> templateValues;

	final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	TemplateTypeMap(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.common.collect.ImmutableList<java.lang.String> templateKeys, com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> templateValues) {
		com.google.common.base.Preconditions.checkNotNull(templateKeys);
		com.google.common.base.Preconditions.checkNotNull(templateValues);
		this.registry = registry;
		this.templateKeys = templateKeys;
		int nKeys = templateKeys.size();
		this.templateValues = ((templateValues.size()) > nKeys) ? templateValues.subList(0, nKeys) : templateValues;
	}

	public com.google.common.collect.ImmutableList<java.lang.String> getTemplateKeys() {
		return templateKeys;
	}

	public boolean hasTemplateKey(java.lang.String templateKey) {
		return templateKeys.contains(templateKey);
	}

	int numUnfilledTemplateKeys() {
		return (templateKeys.size()) - (templateValues.size());
	}

	com.google.common.collect.ImmutableList<java.lang.String> getUnfilledTemplateKeys() {
		return templateKeys.subList(templateValues.size(), templateKeys.size());
	}

	public boolean hasTemplateType(java.lang.String key) {
		return (getTemplateTypeInternal(key)) != null;
	}

	public com.google.javascript.rhino.jstype.JSType getTemplateType(java.lang.String key) {
		com.google.javascript.rhino.jstype.JSType templateType = getTemplateTypeInternal(key);
		return templateType == null ? registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : templateType;
	}

	private com.google.javascript.rhino.jstype.JSType getTemplateTypeInternal(java.lang.String key) {
		int index = templateKeys.indexOf(key);
		if ((index < 0) || (index >= (templateValues.size()))) {
			return null;
		}
		return templateValues.get(index);
	}

	public boolean checkEquivalenceHelper(com.google.javascript.rhino.jstype.TemplateTypeMap that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		int thisNumKeys = templateKeys.size();
		int thatNumKeys = that.getTemplateKeys().size();
		for (int i = 0; i < (java.lang.Math.min(thisNumKeys, thatNumKeys)); i++) {
			com.google.javascript.rhino.jstype.JSType thisTemplateType = getTemplateType(templateKeys.get(i));
			com.google.javascript.rhino.jstype.JSType thatTemplateType = that.getTemplateType(that.getTemplateKeys().get(i));
			if (!(thisTemplateType.checkEquivalenceHelper(thatTemplateType, eqMethod))) {
				return false;
			}
		}
		return (thisNumKeys == thatNumKeys) || (eqMethod == (com.google.javascript.rhino.jstype.EquivalenceMethod.INVARIANT));
	}

	com.google.javascript.rhino.jstype.TemplateTypeMap extendKeys(com.google.common.collect.ImmutableList<java.lang.String> newKeys) {
		return registry.createTemplateTypeMap(concatImmutableLists(templateKeys, newKeys), templateValues);
	}

	com.google.javascript.rhino.jstype.TemplateTypeMap extendValues(com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> newValues) {
		int numUnfilledKeys = numUnfilledTemplateKeys();
		if (numUnfilledKeys < (newValues.size())) {
			newValues = newValues.subList(0, numUnfilledKeys);
		}
		return registry.createTemplateTypeMap(templateKeys, concatImmutableLists(templateValues, newValues));
	}

	private <T> com.google.common.collect.ImmutableList<T> concatImmutableLists(com.google.common.collect.ImmutableList<T> first, com.google.common.collect.ImmutableList<T> second) {
		if (first.isEmpty()) {
			return second;
		}
		if (second.isEmpty()) {
			return first;
		}
		com.google.common.collect.ImmutableList.Builder<T> builder = com.google.common.collect.ImmutableList.builder();
		builder.addAll(first);
		builder.addAll(second);
		return builder.build();
	}

	boolean hasAnyTemplateTypesInternal() {
		for (com.google.javascript.rhino.jstype.JSType templateValue : templateValues) {
			if (templateValue.hasAnyTemplateTypes()) {
				return true;
			}
		}
		return false;
	}
}

