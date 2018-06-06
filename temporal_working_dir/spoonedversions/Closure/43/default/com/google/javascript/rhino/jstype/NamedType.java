

package com.google.javascript.rhino.jstype;


class NamedType extends com.google.javascript.rhino.jstype.ProxyObjectType {
	private static final long serialVersionUID = 1L;

	private final java.lang.String reference;

	private final java.lang.String sourceName;

	private final int lineno;

	private final int charno;

	private com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> validator;

	private java.util.List<com.google.javascript.rhino.jstype.NamedType.PropertyContinuation> propertyContinuations = null;

	NamedType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, java.lang.String reference, java.lang.String sourceName, int lineno, int charno) {
		super(registry, registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		com.google.common.base.Preconditions.checkNotNull(reference);
		this.reference = reference;
		this.sourceName = sourceName;
		this.lineno = lineno;
		this.charno = charno;
	}

	@java.lang.Override
	boolean defineProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
		if (!(isResolved())) {
			if ((propertyContinuations) == null) {
				propertyContinuations = com.google.common.collect.Lists.newArrayList();
			}
			propertyContinuations.add(new com.google.javascript.rhino.jstype.NamedType.PropertyContinuation(propertyName, type, inferred, propertyNode));
			return true;
		}else {
			return super.defineProperty(propertyName, type, inferred, propertyNode);
		}
	}

	private void finishPropertyContinuations() {
		com.google.javascript.rhino.jstype.ObjectType referencedObjType = getReferencedObjTypeInternal();
		if ((referencedObjType != null) && (!(referencedObjType.isUnknownType()))) {
			if ((propertyContinuations) != null) {
				for (com.google.javascript.rhino.jstype.NamedType.PropertyContinuation c : propertyContinuations) {
					c.commit(com.google.javascript.rhino.jstype.NamedType.this);
				}
			}
		}
		propertyContinuations = null;
	}

	public com.google.javascript.rhino.jstype.JSType getReferencedType() {
		return getReferencedTypeInternal();
	}

	@java.lang.Override
	public java.lang.String getReferenceName() {
		return reference;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return reference;
	}

	@java.lang.Override
	public boolean hasReferenceName() {
		return true;
	}

	@java.lang.Override
	boolean isNamedType() {
		return true;
	}

	@java.lang.Override
	public boolean isNominalType() {
		return true;
	}

	@java.lang.Override
	public boolean isEquivalentTo(com.google.javascript.rhino.jstype.JSType that) {
		if ((com.google.javascript.rhino.jstype.NamedType.this) == that) {
			return true;
		}
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(that);
		if (objType != null) {
			return (objType.isNominalType()) && (reference.equals(objType.getReferenceName()));
		}
		return false;
	}

	@java.lang.Override
	public int hashCode() {
		return reference.hashCode();
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		boolean resolved = resolveViaRegistry(t, enclosing);
		if (detectImplicitPrototypeCycle()) {
			handleTypeCycle(t);
		}
		if (resolved) {
			super.resolveInternal(t, enclosing);
			finishPropertyContinuations();
			return registry.isLastGeneration() ? getReferencedType() : com.google.javascript.rhino.jstype.NamedType.this;
		}
		resolveViaProperties(t, enclosing);
		if (detectImplicitPrototypeCycle()) {
			handleTypeCycle(t);
		}
		super.resolveInternal(t, enclosing);
		if (isResolved()) {
			finishPropertyContinuations();
		}
		return registry.isLastGeneration() ? getReferencedType() : com.google.javascript.rhino.jstype.NamedType.this;
	}

	private boolean resolveViaRegistry(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		com.google.javascript.rhino.jstype.JSType type = registry.getType(reference);
		if (type != null) {
			setReferencedAndResolvedType(type, t, enclosing);
			return true;
		}
		return false;
	}

	private void resolveViaProperties(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		com.google.javascript.rhino.jstype.JSType value = lookupViaProperties(t, enclosing);
		if (((value != null) && (value.isFunctionType())) && ((value.isConstructor()) || (value.isInterface()))) {
			com.google.javascript.rhino.jstype.FunctionType functionType = value.toMaybeFunctionType();
			setReferencedAndResolvedType(functionType.getInstanceType(), t, enclosing);
		}else
			if ((value != null) && (value.isNoObjectType())) {
				setReferencedAndResolvedType(registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE).getInstanceType(), t, enclosing);
			}else
				if (value instanceof com.google.javascript.rhino.jstype.EnumType) {
					setReferencedAndResolvedType(((com.google.javascript.rhino.jstype.EnumType) (value)).getElementsType(), t, enclosing);
				}else {
					handleUnresolvedType(t, ((value == null) || (value.isUnknownType())));
				}
			
		
	}

	private com.google.javascript.rhino.jstype.JSType lookupViaProperties(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		java.lang.String[] componentNames = reference.split("\\.", (-1));
		if ((componentNames[0].length()) == 0) {
			return null;
		}
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot = enclosing.getSlot(componentNames[0]);
		if (slot == null) {
			return null;
		}
		com.google.javascript.rhino.jstype.JSType slotType = slot.getType();
		if (((slotType == null) || (slotType.isAllType())) || (slotType.isNoType())) {
			return null;
		}
		com.google.javascript.rhino.jstype.JSType value = getTypedefType(t, slot, componentNames[0]);
		if (value == null) {
			return null;
		}
		for (int i = 1; i < (componentNames.length); i++) {
			com.google.javascript.rhino.jstype.ObjectType parentClass = com.google.javascript.rhino.jstype.ObjectType.cast(value);
			if (parentClass == null) {
				return null;
			}
			if ((componentNames[i].length()) == 0) {
				return null;
			}
			value = parentClass.getPropertyType(componentNames[i]);
		}
		return value;
	}

	private void setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> enclosing) {
		if ((validator) != null) {
			validator.apply(type);
		}
		setReferencedType(type);
		checkEnumElementCycle(t);
		setResolvedTypeInternal(getReferencedType());
	}

	private void handleTypeCycle(com.google.javascript.rhino.ErrorReporter t) {
		setReferencedType(registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		t.warning(("Cycle detected in inheritance chain of type " + (reference)), sourceName, lineno, charno);
		setResolvedTypeInternal(getReferencedType());
	}

	private void checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter t) {
		com.google.javascript.rhino.jstype.JSType referencedType = getReferencedType();
		if ((referencedType instanceof com.google.javascript.rhino.jstype.EnumElementType) && ((((com.google.javascript.rhino.jstype.EnumElementType) (referencedType)).getPrimitiveType()) == (com.google.javascript.rhino.jstype.NamedType.this))) {
			handleTypeCycle(t);
		}
	}

	private void handleUnresolvedType(com.google.javascript.rhino.ErrorReporter t, boolean ignoreForwardReferencedTypes) {
		if (registry.isLastGeneration()) {
			boolean isForwardDeclared = ignoreForwardReferencedTypes && (registry.isForwardDeclaredType(reference));
			if ((!isForwardDeclared) && (registry.isLastGeneration())) {
				t.warning(("Bad type annotation. Unknown type " + (reference)), sourceName, lineno, charno);
			}else {
				setReferencedType(registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE));
				if ((registry.isLastGeneration()) && ((validator) != null)) {
					validator.apply(getReferencedType());
				}
			}
			setResolvedTypeInternal(getReferencedType());
		}else {
			setResolvedTypeInternal(com.google.javascript.rhino.jstype.NamedType.this);
		}
	}

	com.google.javascript.rhino.jstype.JSType getTypedefType(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot, java.lang.String name) {
		com.google.javascript.rhino.jstype.JSType type = slot.getType();
		if (type != null) {
			return type;
		}
		handleUnresolvedType(t, true);
		return null;
	}

	@java.lang.Override
	public boolean setValidator(com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> validator) {
		if (com.google.javascript.rhino.jstype.NamedType.this.isResolved()) {
			return super.setValidator(validator);
		}else {
			com.google.javascript.rhino.jstype.NamedType.this.validator = validator;
			return true;
		}
	}

	private static final class PropertyContinuation {
		private final java.lang.String propertyName;

		private final com.google.javascript.rhino.jstype.JSType type;

		private final boolean inferred;

		private final com.google.javascript.rhino.Node propertyNode;

		private PropertyContinuation(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type, boolean inferred, com.google.javascript.rhino.Node propertyNode) {
			this.propertyName = propertyName;
			this.type = type;
			this.inferred = inferred;
			this.propertyNode = propertyNode;
		}

		void commit(com.google.javascript.rhino.jstype.ObjectType target) {
			target.defineProperty(propertyName, type, inferred, propertyNode);
		}
	}
}

