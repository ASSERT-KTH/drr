

package com.google.javascript.jscomp;


abstract class ConcreteType implements com.google.javascript.jscomp.LatticeElement {
	static final com.google.javascript.jscomp.ConcreteType NONE = new com.google.javascript.jscomp.ConcreteType.ConcreteNoneType();

	static final com.google.javascript.jscomp.ConcreteType ALL = new com.google.javascript.jscomp.ConcreteType.ConcreteAll();

	private static final java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType> NO_FUNCTIONS = com.google.common.collect.Lists.<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType>newArrayList();

	private static final java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType> NO_INSTANCES = com.google.common.collect.Lists.<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType>newArrayList();

	private static final java.util.List<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>> NO_SLOTS = com.google.common.collect.Lists.<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>>newArrayList();

	protected static com.google.javascript.jscomp.ConcreteType createForTypes(java.util.Collection<com.google.javascript.jscomp.ConcreteType> types) {
		if ((types == null) || ((types.size()) == 0)) {
			return com.google.javascript.jscomp.ConcreteType.NONE;
		}else
			if ((types.size()) == 1) {
				return types.iterator().next();
			}else {
				return new com.google.javascript.jscomp.ConcreteType.ConcreteUnionType(com.google.common.collect.Sets.newHashSet(types));
			}
		
	}

	boolean isNone() {
		return false;
	}

	boolean isFunction() {
		return false;
	}

	boolean isInstance() {
		return false;
	}

	boolean isUnion() {
		return false;
	}

	boolean isAll() {
		return false;
	}

	boolean isSingleton() {
		return ((!(isNone())) && (!(isUnion()))) && (!(isAll()));
	}

	com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType toFunction() {
		return null;
	}

	com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType toInstance() {
		return null;
	}

	com.google.javascript.jscomp.ConcreteType.ConcreteUnionType toUnion() {
		return null;
	}

	com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getScope() {
		return null;
	}

	com.google.javascript.jscomp.ConcreteType unionWith(com.google.javascript.jscomp.ConcreteType other) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.ConcreteType.this.isSingleton());
		if (!(other.isSingleton())) {
			return other.unionWith(com.google.javascript.jscomp.ConcreteType.this);
		}else
			if (equals(other)) {
				return com.google.javascript.jscomp.ConcreteType.this;
			}else {
				return new com.google.javascript.jscomp.ConcreteType.ConcreteUnionType(com.google.javascript.jscomp.ConcreteType.this, other);
			}
		
	}

	com.google.javascript.jscomp.ConcreteType intersectWith(com.google.javascript.jscomp.ConcreteType other) {
		if (!(other.isSingleton())) {
			return other.intersectWith(com.google.javascript.jscomp.ConcreteType.this);
		}else
			if (equals(other)) {
				return com.google.javascript.jscomp.ConcreteType.this;
			}else {
				return com.google.javascript.jscomp.ConcreteType.NONE;
			}
		
	}

	private <C> java.util.List<C> getMatchingTypes(com.google.javascript.jscomp.ConcreteType.TypeFilter<C> filter) {
		C type = null;
		if (isUnion()) {
			java.util.List<C> list = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.jscomp.ConcreteType alt : toUnion().getAlternatives()) {
				if ((type = filter.filter(alt)) != null) {
					list.add(type);
				}
			}
			return list;
		}else
			if ((type = filter.filter(com.google.javascript.jscomp.ConcreteType.this)) != null) {
				java.util.List<C> list = com.google.common.collect.Lists.newArrayList();
				list.add(type);
				return list;
			}else {
				return filter.emptyList;
			}
		
	}

	abstract class TypeFilter<C> {
		final java.util.List<C> emptyList;

		TypeFilter(java.util.List<C> emptyList) {
			this.emptyList = emptyList;
		}

		protected abstract C filter(com.google.javascript.jscomp.ConcreteType type);
	}

	java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType> getFunctions() {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType>(com.google.javascript.jscomp.ConcreteType.NO_FUNCTIONS) {
			@java.lang.Override
			public com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType filter(com.google.javascript.jscomp.ConcreteType type) {
				return type.isFunction() ? type.toFunction() : null;
			}
		});
	}

	java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType> getInstances() {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType>(com.google.javascript.jscomp.ConcreteType.NO_INSTANCES) {
			@java.lang.Override
			public com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType filter(com.google.javascript.jscomp.ConcreteType type) {
				return type.isInstance() ? type.toInstance() : null;
			}
		});
	}

	java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType> getFunctionInstanceTypes() {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType>(com.google.javascript.jscomp.ConcreteType.NO_INSTANCES) {
			@java.lang.Override
			public com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType filter(com.google.javascript.jscomp.ConcreteType type) {
				if (type.isFunction()) {
					return type.toFunction().getInstanceType();
				}
				return null;
			}
		});
	}

	java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType> getPrototypeTypes() {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType>(com.google.javascript.jscomp.ConcreteType.NO_INSTANCES) {
			@java.lang.Override
			public com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType filter(com.google.javascript.jscomp.ConcreteType type) {
				if ((type.isInstance()) && (type.toInstance().isFunctionPrototype())) {
					return type.toInstance();
				}
				return null;
			}
		});
	}

	java.util.List<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType> getSuperclassTypes() {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType>(com.google.javascript.jscomp.ConcreteType.NO_FUNCTIONS) {
			@java.lang.Override
			public com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType filter(com.google.javascript.jscomp.ConcreteType type) {
				return (type.isFunction()) && ((type.toFunction().getSuperclassType()) != null) ? type.toFunction().getSuperclassType() : null;
			}
		});
	}

	java.util.List<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>> getParameterSlots(final int index) {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>>(com.google.javascript.jscomp.ConcreteType.NO_SLOTS) {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> filter(com.google.javascript.jscomp.ConcreteType type) {
				return (type.isFunction()) && ((toFunction().getParameterSlot(index)) != null) ? toFunction().getParameterSlot(index) : null;
			}
		});
	}

	java.util.List<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>> getPropertySlots(final java.lang.String name) {
		return getMatchingTypes(new com.google.javascript.jscomp.ConcreteType.TypeFilter<com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType>>(com.google.javascript.jscomp.ConcreteType.NO_SLOTS) {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> filter(com.google.javascript.jscomp.ConcreteType type) {
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> slot = null;
				if (type.isInstance()) {
					slot = type.toInstance().getPropertySlot(name);
				}
				return slot;
			}
		});
	}

	com.google.javascript.jscomp.ConcreteType getPropertyType(final java.lang.String name) {
		com.google.javascript.jscomp.ConcreteType ret = com.google.javascript.jscomp.ConcreteType.NONE;
		for (com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> slot : getPropertySlots(name)) {
			ret = ret.unionWith(slot.getType());
		}
		return ret;
	}

	private static class ConcreteNoneType extends com.google.javascript.jscomp.ConcreteType {
		@java.lang.Override
		boolean isNone() {
			return true;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType unionWith(com.google.javascript.jscomp.ConcreteType other) {
			return other;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType intersectWith(com.google.javascript.jscomp.ConcreteType other) {
			return com.google.javascript.jscomp.ConcreteType.NONE;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "()";
		}
	}

	static class ConcreteFunctionType extends com.google.javascript.jscomp.ConcreteType {
		static final java.lang.String CALL_SLOT_NAME = ":call";

		static final java.lang.String THIS_SLOT_NAME = ":this";

		static final java.lang.String RETURN_SLOT_NAME = ":return";

		private final com.google.javascript.jscomp.ConcreteType.Factory factory;

		private final com.google.javascript.rhino.Node declaration;

		private final com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parentScope;

		private com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> bodyScope;

		private com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instanceType;

		private com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType prototypeType;

		ConcreteFunctionType(com.google.javascript.jscomp.ConcreteType.Factory factory, com.google.javascript.rhino.Node declaration, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parentScope) {
			this.factory = factory;
			this.declaration = declaration;
			this.parentScope = parentScope;
			com.google.common.base.Preconditions.checkArgument(((declaration.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
			com.google.common.base.Preconditions.checkArgument(((declaration.getJSType()) != null));
			com.google.common.base.Preconditions.checkArgument(declaration.getJSType().isFunctionType());
		}

		@java.lang.Override
		boolean isFunction() {
			return true;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType toFunction() {
			return com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.this;
		}

		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getCallSlot() {
			return getScope().getOwnSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.CALL_SLOT_NAME);
		}

		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getThisSlot() {
			return getScope().getOwnSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.THIS_SLOT_NAME);
		}

		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getReturnSlot() {
			return getScope().getOwnSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.RETURN_SLOT_NAME);
		}

		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getParameterSlot(int index) {
			return getScope().getOwnSlot(getParameterName(index));
		}

		private java.lang.String getParameterName(int index) {
			int count = 0;
			for (com.google.javascript.rhino.Node n = getFirstParameter(); n != null; n = n.getNext()) {
				if ((count++) == index) {
					return n.getString();
				}
			}
			return null;
		}

		private com.google.javascript.rhino.Node getFirstParameter() {
			return declaration.getFirstChild().getNext().getFirstChild();
		}

		public com.google.javascript.rhino.jstype.FunctionType getJSType() {
			return com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(declaration.getJSType());
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getInstanceType() {
			if ((instanceType) == null) {
				if (getJSType().isConstructor()) {
					instanceType = factory.createConcreteInstance(getJSType().getInstanceType());
				}
			}
			return instanceType;
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getPrototypeType() {
			if ((prototypeType) == null) {
				prototypeType = factory.createConcreteInstance(getJSType().getPrototype());
			}
			return prototypeType;
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType getSuperclassType() {
			com.google.javascript.rhino.jstype.FunctionType superConstructor = getJSType().getSuperClassConstructor();
			return superConstructor != null ? factory.getConcreteFunction(superConstructor) : null;
		}

		@java.lang.Override
		com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getScope() {
			if ((bodyScope) == null) {
				bodyScope = factory.createFunctionScope(declaration, parentScope);
			}
			return bodyScope;
		}

		@java.lang.Override
		public java.lang.String toString() {
			java.lang.StringBuilder b = new java.lang.StringBuilder(32);
			b.append("function (");
			boolean hasKnownTypeOfThis = !(getThisSlot().getType().isNone());
			if (hasKnownTypeOfThis) {
				b.append("this:");
				b.append(getThisSlot().getType().toString());
			}
			com.google.javascript.rhino.Node n = getFirstParameter();
			if (hasKnownTypeOfThis && (n != null)) {
				b.append(", ");
			}
			for (int i = 0; n != null; ++i , n = n.getNext()) {
				java.lang.String paramName = n.getString();
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> var = getScope().getOwnSlot(paramName);
				b.append(var.getType());
				getParameterSlot(i).getType();
				if ((n.getNext()) != null) {
					b.append(", ");
				}
			}
			b.append(")");
			if ((getReturnSlot().getType()) != null) {
				b.append(": ");
				b.append(getReturnSlot().getType().toString());
			}
			return b.toString();
		}
	}

	static class ConcreteInstanceType extends com.google.javascript.jscomp.ConcreteType {
		private final com.google.javascript.jscomp.ConcreteType.Factory factory;

		public final com.google.javascript.rhino.jstype.ObjectType instanceType;

		private com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType prototype;

		private com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> scope;

		ConcreteInstanceType(com.google.javascript.jscomp.ConcreteType.Factory factory, com.google.javascript.rhino.jstype.ObjectType instanceType) {
			this.factory = factory;
			this.instanceType = instanceType;
			com.google.common.base.Preconditions.checkArgument((!(instanceType instanceof com.google.javascript.rhino.jstype.UnknownType)));
		}

		@java.lang.Override
		boolean isInstance() {
			return true;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType toInstance() {
			return com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.this;
		}

		boolean isFunctionPrototype() {
			return instanceType.isFunctionPrototypeType();
		}

		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getPropertySlot(java.lang.String propName) {
			return getScope().getSlot(propName);
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getInstanceTypeWithProperty(java.lang.String propName) {
			if ((getScope().getOwnSlot(propName)) != null) {
				if ((instanceType.getConstructor()) != null) {
					return getConstructorType().getPrototypeType();
				}
				return com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType.this;
			}else
				if ((getImplicitPrototype()) != null) {
					return getImplicitPrototype().getInstanceTypeWithProperty(propName);
				}else {
					return null;
				}
			
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getImplicitPrototype() {
			if (((prototype) == null) && ((instanceType.getImplicitPrototype()) != null)) {
				com.google.javascript.rhino.jstype.ObjectType proto = instanceType.getImplicitPrototype();
				if ((proto != (instanceType)) && (!(proto instanceof com.google.javascript.rhino.jstype.UnknownType))) {
					prototype = factory.createConcreteInstance(proto);
				}
			}
			return prototype;
		}

		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType getConstructorType() {
			if (instanceType.isFunctionPrototypeType()) {
				return factory.getConcreteFunction(instanceType.getOwnerFunction());
			}else {
				com.google.javascript.rhino.jstype.FunctionType constructor = instanceType.getConstructor();
				return constructor != null ? factory.getConcreteFunction(constructor) : null;
			}
		}

		@java.lang.Override
		com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getScope() {
			if ((scope) == null) {
				scope = factory.createInstanceScope(instanceType);
			}
			return scope;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return instanceType.toString();
		}
	}

	static class ConcreteUnionType extends com.google.javascript.jscomp.ConcreteType {
		private final java.util.Set<com.google.javascript.jscomp.ConcreteType> alternatives;

		ConcreteUnionType(com.google.javascript.jscomp.ConcreteType... alternatives) {
			this(com.google.common.collect.Sets.newHashSet(alternatives));
		}

		ConcreteUnionType(java.util.Set<com.google.javascript.jscomp.ConcreteType> alternatives) {
			com.google.common.base.Preconditions.checkArgument(((alternatives.size()) > 1));
			this.alternatives = alternatives;
		}

		@java.lang.Override
		boolean isUnion() {
			return true;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType.ConcreteUnionType toUnion() {
			return com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.this;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType unionWith(com.google.javascript.jscomp.ConcreteType other) {
			if (other.isSingleton()) {
				if (alternatives.contains(other)) {
					return com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.this;
				}else {
					java.util.Set<com.google.javascript.jscomp.ConcreteType> alts = com.google.common.collect.Sets.newHashSet(alternatives);
					alts.add(other);
					return new com.google.javascript.jscomp.ConcreteType.ConcreteUnionType(alts);
				}
			}else
				if (other.isUnion()) {
					com.google.javascript.jscomp.ConcreteType.ConcreteUnionType otherUnion = other.toUnion();
					if (alternatives.containsAll(otherUnion.alternatives)) {
						return com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.this;
					}else
						if (otherUnion.alternatives.containsAll(alternatives)) {
							return otherUnion;
						}else {
							java.util.Set<com.google.javascript.jscomp.ConcreteType> alts = com.google.common.collect.Sets.newHashSet(alternatives);
							alts.addAll(otherUnion.alternatives);
							return new com.google.javascript.jscomp.ConcreteType.ConcreteUnionType(alts);
						}
					
				}else {
					com.google.common.base.Preconditions.checkArgument(((other.isNone()) || (other.isAll())));
					return other.unionWith(com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.this);
				}
			
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType intersectWith(com.google.javascript.jscomp.ConcreteType other) {
			if (other.isSingleton()) {
				if (alternatives.contains(other)) {
					return other;
				}else {
					return com.google.javascript.jscomp.ConcreteType.NONE;
				}
			}else
				if (other.isUnion()) {
					java.util.Set<com.google.javascript.jscomp.ConcreteType> types = com.google.common.collect.Sets.newHashSet(alternatives);
					types.retainAll(other.toUnion().alternatives);
					return com.google.javascript.jscomp.ConcreteType.createForTypes(types);
				}else {
					com.google.common.base.Preconditions.checkArgument(((other.isNone()) || (other.isAll())));
					return other.intersectWith(com.google.javascript.jscomp.ConcreteType.ConcreteUnionType.this);
				}
			
		}

		java.util.Set<com.google.javascript.jscomp.ConcreteType> getAlternatives() {
			return alternatives;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object obj) {
			return (obj instanceof com.google.javascript.jscomp.ConcreteType.ConcreteUnionType) && (alternatives.equals(((com.google.javascript.jscomp.ConcreteType.ConcreteUnionType) (obj)).alternatives));
		}

		@java.lang.Override
		public int hashCode() {
			return (alternatives.hashCode()) ^ 1601076620;
		}

		@java.lang.Override
		public java.lang.String toString() {
			java.util.List<java.lang.String> names = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.jscomp.ConcreteType type : alternatives) {
				names.add(type.toString());
			}
			java.util.Collections.sort(names);
			return ("(" + (com.google.common.base.Joiner.on(",").join(names))) + ")";
		}
	}

	private static class ConcreteAll extends com.google.javascript.jscomp.ConcreteType {
		@java.lang.Override
		boolean isAll() {
			return true;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType unionWith(com.google.javascript.jscomp.ConcreteType other) {
			return com.google.javascript.jscomp.ConcreteType.ConcreteAll.this;
		}

		@java.lang.Override
		com.google.javascript.jscomp.ConcreteType intersectWith(com.google.javascript.jscomp.ConcreteType other) {
			return other;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "*";
		}
	}

	static class ConcreteUniqueType extends com.google.javascript.jscomp.ConcreteType {
		private final int id;

		ConcreteUniqueType(int id) {
			this.id = id;
			com.google.common.base.Preconditions.checkArgument((id >= 0));
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType) && ((id) == (((com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType) (o)).id));
		}

		@java.lang.Override
		public int hashCode() {
			return (com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType.class.hashCode()) ^ (id);
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "Unique$" + (id);
		}
	}

	interface Factory {
		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType createConcreteFunction(com.google.javascript.rhino.Node declaration, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parent);

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType createConcreteInstance(com.google.javascript.rhino.jstype.ObjectType instanceType);

		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType getConcreteFunction(com.google.javascript.rhino.jstype.FunctionType function);

		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getConcreteInstance(com.google.javascript.rhino.jstype.ObjectType instance);

		com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> createFunctionScope(com.google.javascript.rhino.Node declaration, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parent);

		com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> createInstanceScope(com.google.javascript.rhino.jstype.ObjectType instanceType);

		com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry();
	}
}

