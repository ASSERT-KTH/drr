

package com.google.javascript.jscomp;


class DisambiguateProperties<T> implements com.google.javascript.jscomp.CompilerPass {
	private static final int MAX_INVALDIATION_WARNINGS_PER_PROPERTY = 10;

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.DisambiguateProperties.class.getName());

	static class Warnings {
		static final com.google.javascript.jscomp.DiagnosticType INVALIDATION = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_INVALIDATION", ("Property disambiguator skipping all instances of property {0} " + "because of type {1} node {2}. {3}"));
	}

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.DisambiguateProperties.TypeSystem<T> typeSystem;

	private com.google.common.collect.Multimap<java.lang.Object, com.google.javascript.jscomp.JSError> invalidationMap;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertiesToErrorFor;

	private class Property {
		final java.lang.String name;

		private com.google.javascript.jscomp.graph.UnionFind<T> types;

		java.util.Set<T> typesToSkip = com.google.common.collect.Sets.newHashSet();

		boolean skipRenaming;

		java.util.Set<com.google.javascript.rhino.Node> renameNodes = com.google.common.collect.Sets.newHashSet();

		final java.util.Map<com.google.javascript.rhino.Node, T> rootTypes = com.google.common.collect.Maps.newHashMap();

		Property(java.lang.String name) {
			this.name = name;
		}

		com.google.javascript.jscomp.graph.UnionFind<T> getTypes() {
			if ((types) == null) {
				types = new com.google.javascript.jscomp.graph.StandardUnionFind<T>();
			}
			return types;
		}

		boolean addType(T type, T top, T relatedType) {
			com.google.common.base.Preconditions.checkState((!(skipRenaming)), "Attempt to record skipped property: %s", name);
			if (typeSystem.isInvalidatingType(top)) {
				invalidate();
				return false;
			}else {
				if (typeSystem.isTypeToSkip(top)) {
					addTypeToSkip(top);
				}
				if (relatedType == null) {
					getTypes().add(top);
				}else {
					getTypes().union(top, relatedType);
				}
				typeSystem.recordInterfaces(type, top, com.google.javascript.jscomp.DisambiguateProperties.Property.this);
				return true;
			}
		}

		void addTypeToSkip(T type) {
			for (T skipType : typeSystem.getTypesToSkipForType(type)) {
				typesToSkip.add(skipType);
				getTypes().union(skipType, type);
			}
		}

		void expandTypesToSkip() {
			if (shouldRename()) {
				int count = 0;
				while (true) {
					com.google.common.base.Preconditions.checkState(((++count) < 10), "Stuck in loop expanding types to skip.");
					java.util.Set<T> rootTypesToSkip = com.google.common.collect.Sets.newHashSet();
					for (T subType : typesToSkip) {
						rootTypesToSkip.add(types.find(subType));
					}
					typesToSkip.addAll(rootTypesToSkip);
					java.util.Set<T> newTypesToSkip = com.google.common.collect.Sets.newHashSet();
					java.util.Set<T> allTypes = types.elements();
					int originalTypesSize = allTypes.size();
					for (T subType : allTypes) {
						if ((!(typesToSkip.contains(subType))) && (typesToSkip.contains(types.find(subType)))) {
							newTypesToSkip.add(subType);
						}
					}
					for (T newType : newTypesToSkip) {
						addTypeToSkip(newType);
					}
					if ((types.elements().size()) == originalTypesSize) {
						break;
					}
				} 
			}
		}

		boolean shouldRename() {
			return ((!(skipRenaming)) && ((types) != null)) && ((types.allEquivalenceClasses().size()) > 1);
		}

		boolean shouldRename(T type) {
			return (!(skipRenaming)) && (!(typesToSkip.contains(type)));
		}

		boolean invalidate() {
			boolean changed = !(skipRenaming);
			skipRenaming = true;
			types = null;
			return changed;
		}

		boolean scheduleRenaming(com.google.javascript.rhino.Node node, T type) {
			if (!(skipRenaming)) {
				if (typeSystem.isInvalidatingType(type)) {
					invalidate();
					return false;
				}
				renameNodes.add(node);
				rootTypes.put(node, type);
			}
			return true;
		}
	}

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.DisambiguateProperties<T>.Property> properties = com.google.common.collect.Maps.newHashMap();

	static com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.rhino.jstype.JSType> forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertiesToErrorFor) {
		return new com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.rhino.jstype.JSType>(compiler, new com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem(compiler), propertiesToErrorFor);
	}

	static com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.jscomp.ConcreteType> forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.TightenTypes tt, java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertiesToErrorFor) {
		return new com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.jscomp.ConcreteType>(compiler, new com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem(tt, compiler.getCodingConvention()), propertiesToErrorFor);
	}

	private DisambiguateProperties(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.DisambiguateProperties.TypeSystem<T> typeSystem, java.util.Map<java.lang.String, com.google.javascript.jscomp.CheckLevel> propertiesToErrorFor) {
		this.compiler = compiler;
		this.typeSystem = typeSystem;
		this.propertiesToErrorFor = propertiesToErrorFor;
		if (!(com.google.javascript.jscomp.DisambiguateProperties.this.propertiesToErrorFor.isEmpty())) {
			com.google.javascript.jscomp.DisambiguateProperties.this.invalidationMap = com.google.common.collect.LinkedHashMultimap.create();
		}else {
			com.google.javascript.jscomp.DisambiguateProperties.this.invalidationMap = null;
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(((compiler.getLifeCycleStage()) == (com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED)));
		for (com.google.javascript.jscomp.TypeValidator.TypeMismatch mis : compiler.getTypeValidator().getMismatches()) {
			addInvalidatingType(mis.typeA, mis.src);
			addInvalidatingType(mis.typeB, mis.src);
		}
		com.google.javascript.rhino.jstype.StaticScope<T> scope = typeSystem.getRootScope();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new FindExternProperties());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new FindRenameableProperties());
		renameProperties();
	}

	private void recordInvalidationError(com.google.javascript.rhino.jstype.JSType t, com.google.javascript.jscomp.JSError error) {
		if (!(t.isObject())) {
			return ;
		}
		if ((invalidationMap) != null) {
			invalidationMap.put(t, error);
		}
	}

	private void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.JSError error) {
		type = type.restrictByNotNullOrUndefined();
		if (type.isUnionType()) {
			for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
				addInvalidatingType(alt, error);
			}
		}else
			if (type.isEnumElementType()) {
				addInvalidatingType(type.toMaybeEnumElementType().getPrimitiveType(), error);
			}else {
				typeSystem.addInvalidatingType(type);
				recordInvalidationError(type, error);
				com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
				if ((objType != null) && ((objType.getImplicitPrototype()) != null)) {
					typeSystem.addInvalidatingType(objType.getImplicitPrototype());
					recordInvalidationError(objType.getImplicitPrototype(), error);
				}
			}
		
	}

	protected com.google.javascript.jscomp.DisambiguateProperties<T>.Property getProperty(java.lang.String name) {
		if (!(properties.containsKey(name))) {
			properties.put(name, new Property(name));
		}
		return properties.get(name);
	}

	T getTypeWithProperty(java.lang.String field, T type) {
		return typeSystem.getTypeWithProperty(field, type);
	}

	private abstract class AbstractScopingCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		protected final java.util.Stack<com.google.javascript.rhino.jstype.StaticScope<T>> scopes = new java.util.Stack<com.google.javascript.rhino.jstype.StaticScope<T>>();

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (t.inGlobalScope()) {
				scopes.push(typeSystem.getRootScope());
			}else {
				scopes.push(typeSystem.getFunctionScope(t.getScopeRoot()));
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			scopes.pop();
		}

		protected com.google.javascript.rhino.jstype.StaticScope<T> getScope() {
			return scopes.peek();
		}
	}

	private class FindExternProperties extends com.google.javascript.jscomp.DisambiguateProperties<T>.AbstractScopingCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isGetProp()) {
				java.lang.String field = n.getLastChild().getString();
				T type = typeSystem.getType(getScope(), n.getFirstChild(), field);
				com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop = getProperty(field);
				if (typeSystem.isInvalidatingType(type)) {
					prop.invalidate();
				}else {
					prop.addTypeToSkip(type);
					if ((type = typeSystem.getInstanceFromPrototype(type)) != null) {
						prop.getTypes().add(type);
						prop.typesToSkip.add(type);
					}
				}
			}
		}
	}

	private class FindRenameableProperties extends com.google.javascript.jscomp.DisambiguateProperties<T>.AbstractScopingCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isGetProp()) {
				handleGetProp(t, n);
			}else
				if (n.isObjectLit()) {
					handleObjectLit(t, n);
				}
			
		}

		private void handleGetProp(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			java.lang.String name = n.getLastChild().getString();
			T type = typeSystem.getType(getScope(), n.getFirstChild(), name);
			com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop = getProperty(name);
			if (!(prop.scheduleRenaming(n.getLastChild(), processProperty(t, prop, type, null)))) {
				if (propertiesToErrorFor.containsKey(name)) {
					java.lang.String suggestion = "";
					if (type instanceof com.google.javascript.rhino.jstype.JSType) {
						com.google.javascript.rhino.jstype.JSType jsType = ((com.google.javascript.rhino.jstype.JSType) (type));
						if ((jsType.isAllType()) || (jsType.isUnknownType())) {
							if (n.getFirstChild().isThis()) {
								suggestion = "The \"this\" object is unknown in the function," + "consider using @this";
							}else {
								java.lang.String qName = n.getFirstChild().getQualifiedName();
								suggestion = ("Consider casting " + qName) + " if you know it's type.";
							}
						}else {
							java.util.List<java.lang.String> errors = com.google.common.collect.Lists.newArrayList();
							printErrorLocations(errors, jsType);
							if (!(errors.isEmpty())) {
								suggestion = "Consider fixing errors for the following types:\n";
								suggestion += com.google.common.base.Joiner.on("\n").join(errors);
							}
						}
					}
					compiler.report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), n, propertiesToErrorFor.get(name), com.google.javascript.jscomp.DisambiguateProperties.Warnings.INVALIDATION, name, (type == null ? "null" : type.toString()), n.toString(), suggestion));
				}
			}
		}

		private void handleObjectLit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node child = n.getFirstChild();
			while (child != null) {
				java.lang.String name = child.getString();
				T type = typeSystem.getType(getScope(), n, name);
				com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop = getProperty(name);
				if (!(prop.scheduleRenaming(child, processProperty(t, prop, type, null)))) {
					if (propertiesToErrorFor.containsKey(name)) {
						compiler.report(com.google.javascript.jscomp.JSError.make(t.getSourceName(), child, propertiesToErrorFor.get(name), com.google.javascript.jscomp.DisambiguateProperties.Warnings.INVALIDATION, name, (type == null ? "null" : type.toString()), n.toString(), ""));
					}
				}
				child = child.getNext();
			} 
		}

		private void printErrorLocations(java.util.List<java.lang.String> errors, com.google.javascript.rhino.jstype.JSType t) {
			if ((!(t.isObject())) || (t.isAllType())) {
				return ;
			}
			if (t.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : t.toMaybeUnionType().getAlternates()) {
					printErrorLocations(errors, alt);
				}
				return ;
			}
			for (com.google.javascript.jscomp.JSError error : invalidationMap.get(t)) {
				if ((errors.size()) > (com.google.javascript.jscomp.DisambiguateProperties.MAX_INVALDIATION_WARNINGS_PER_PROPERTY)) {
					return ;
				}
				errors.add((((((t.toString()) + " at ") + (error.sourceName)) + ":") + (error.lineNumber)));
			}
		}

		private T processProperty(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop, T type, T relatedType) {
			type = typeSystem.restrictByNotNullOrUndefined(type);
			if ((prop.skipRenaming) || (typeSystem.isInvalidatingType(type))) {
				return null;
			}
			java.lang.Iterable<T> alternatives = typeSystem.getTypeAlternatives(type);
			if (alternatives != null) {
				T firstType = relatedType;
				for (T subType : alternatives) {
					T lastType = processProperty(t, prop, subType, firstType);
					if (lastType != null) {
						firstType = (firstType == null) ? lastType : firstType;
					}
				}
				return firstType;
			}else {
				T topType = typeSystem.getTypeWithProperty(prop.name, type);
				if (typeSystem.isInvalidatingType(topType)) {
					return null;
				}
				prop.addType(type, topType, relatedType);
				return topType;
			}
		}
	}

	void renameProperties() {
		int propsRenamed = 0;
		int propsSkipped = 0;
		int instancesRenamed = 0;
		int instancesSkipped = 0;
		int singleTypeProps = 0;
		for (com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop : properties.values()) {
			if (prop.shouldRename()) {
				java.util.Map<T, java.lang.String> propNames = buildPropNames(prop.getTypes(), prop.name);
				++propsRenamed;
				prop.expandTypesToSkip();
				com.google.javascript.jscomp.graph.UnionFind<T> types = prop.getTypes();
				for (com.google.javascript.rhino.Node node : prop.renameNodes) {
					T rootType = prop.rootTypes.get(node);
					if (prop.shouldRename(rootType)) {
						java.lang.String newName = propNames.get(rootType);
						node.setString(newName);
						compiler.reportCodeChange();
						++instancesRenamed;
					}else {
						++instancesSkipped;
					}
				}
			}else {
				if (prop.skipRenaming) {
					++propsSkipped;
				}else {
					++singleTypeProps;
				}
			}
		}
		com.google.javascript.jscomp.DisambiguateProperties.logger.fine((((("Renamed " + instancesRenamed) + " instances of ") + propsRenamed) + " properties."));
		com.google.javascript.jscomp.DisambiguateProperties.logger.fine((((((((("Skipped renaming " + instancesSkipped) + " invalidated ") + "properties, ") + propsSkipped) + " instances of properties ") + "that were skipped for specific types and ") + singleTypeProps) + " properties that were referenced from only one type."));
	}

	private java.util.Map<T, java.lang.String> buildPropNames(com.google.javascript.jscomp.graph.UnionFind<T> types, java.lang.String name) {
		java.util.Map<T, java.lang.String> names = com.google.common.collect.Maps.newHashMap();
		for (java.util.Set<T> set : types.allEquivalenceClasses()) {
			com.google.common.base.Preconditions.checkState((!(set.isEmpty())));
			java.lang.String typeName = null;
			for (T type : set) {
				if ((typeName == null) || ((type.toString().compareTo(typeName)) < 0)) {
					typeName = type.toString();
				}
			}
			java.lang.String newName;
			if ("{...}".equals(typeName)) {
				newName = name;
			}else {
				newName = ((typeName.replaceAll("[^\\w$]", "_")) + "$") + name;
			}
			for (T type : set) {
				names.put(type, newName);
			}
		}
		return names;
	}

	com.google.common.collect.Multimap<java.lang.String, java.util.Collection<T>> getRenamedTypesForTesting() {
		com.google.common.collect.Multimap<java.lang.String, java.util.Collection<T>> ret = com.google.common.collect.HashMultimap.create();
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.DisambiguateProperties<T>.Property> entry : properties.entrySet()) {
			com.google.javascript.jscomp.DisambiguateProperties<T>.Property prop = entry.getValue();
			if (!(prop.skipRenaming)) {
				for (java.util.Collection<T> c : prop.getTypes().allEquivalenceClasses()) {
					if ((!(c.isEmpty())) && (!(prop.typesToSkip.contains(c.iterator().next())))) {
						ret.put(entry.getKey(), c);
					}
				}
			}
		}
		return ret;
	}

	private interface TypeSystem<T> {
		com.google.javascript.rhino.jstype.StaticScope<T> getRootScope();

		com.google.javascript.rhino.jstype.StaticScope<T> getFunctionScope(com.google.javascript.rhino.Node node);

		T getType(com.google.javascript.rhino.jstype.StaticScope<T> scope, com.google.javascript.rhino.Node node, java.lang.String prop);

		boolean isInvalidatingType(T type);

		void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type);

		com.google.common.collect.ImmutableSet<T> getTypesToSkipForType(T type);

		boolean isTypeToSkip(T type);

		T restrictByNotNullOrUndefined(T type);

		java.lang.Iterable<T> getTypeAlternatives(T type);

		T getTypeWithProperty(java.lang.String field, T type);

		T getInstanceFromPrototype(T type);

		void recordInterfaces(T type, T relatedType, com.google.javascript.jscomp.DisambiguateProperties<T>.Property p);
	}

	private static class JSTypeSystem implements com.google.javascript.jscomp.DisambiguateProperties.TypeSystem<com.google.javascript.rhino.jstype.JSType> {
		private final java.util.Set<com.google.javascript.rhino.jstype.JSType> invalidatingTypes;

		private com.google.javascript.rhino.jstype.JSTypeRegistry registry;

		public JSTypeSystem(com.google.javascript.jscomp.AbstractCompiler compiler) {
			registry = compiler.getTypeRegistry();
			invalidatingTypes = com.google.common.collect.Sets.newHashSet(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TOP_LEVEL_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		}

		@java.lang.Override
		public void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
			com.google.common.base.Preconditions.checkState((!(type.isUnionType())));
			invalidatingTypes.add(type);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getRootScope() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getFunctionScope(com.google.javascript.rhino.Node node) {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType getType(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope, com.google.javascript.rhino.Node node, java.lang.String prop) {
			if ((node.getJSType()) == null) {
				return registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
			return node.getJSType();
		}

		@java.lang.Override
		public boolean isInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
			if (((type == null) || (invalidatingTypes.contains(type))) || (type.isUnknownType())) {
				return true;
			}
			com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			return (objType != null) && (!(objType.hasReferenceName()));
		}

		@java.lang.Override
		public com.google.common.collect.ImmutableSet<com.google.javascript.rhino.jstype.JSType> getTypesToSkipForType(com.google.javascript.rhino.jstype.JSType type) {
			type = type.restrictByNotNullOrUndefined();
			if (type.isUnionType()) {
				java.util.Set<com.google.javascript.rhino.jstype.JSType> types = com.google.common.collect.Sets.newHashSet(type);
				for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
					types.addAll(getTypesToSkipForTypeNonUnion(type));
				}
				return com.google.common.collect.ImmutableSet.copyOf(types);
			}else
				if (type.isEnumElementType()) {
					return getTypesToSkipForType(type.toMaybeEnumElementType().getPrimitiveType());
				}
			
			return com.google.common.collect.ImmutableSet.copyOf(getTypesToSkipForTypeNonUnion(type));
		}

		private java.util.Set<com.google.javascript.rhino.jstype.JSType> getTypesToSkipForTypeNonUnion(com.google.javascript.rhino.jstype.JSType type) {
			java.util.Set<com.google.javascript.rhino.jstype.JSType> types = com.google.common.collect.Sets.newHashSet();
			com.google.javascript.rhino.jstype.JSType skipType = type;
			while (skipType != null) {
				types.add(skipType);
				com.google.javascript.rhino.jstype.ObjectType objSkipType = skipType.toObjectType();
				if (objSkipType != null) {
					skipType = objSkipType.getImplicitPrototype();
				}else {
					break;
				}
			} 
			return types;
		}

		@java.lang.Override
		public boolean isTypeToSkip(com.google.javascript.rhino.jstype.JSType type) {
			return (type.isEnumType()) || ((type.autoboxesTo()) != null);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType restrictByNotNullOrUndefined(com.google.javascript.rhino.jstype.JSType type) {
			return type.restrictByNotNullOrUndefined();
		}

		@java.lang.Override
		public java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> getTypeAlternatives(com.google.javascript.rhino.jstype.JSType type) {
			if (type.isUnionType()) {
				return type.toMaybeUnionType().getAlternates();
			}else {
				com.google.javascript.rhino.jstype.ObjectType objType = type.toObjectType();
				if (((objType != null) && ((objType.getConstructor()) != null)) && (objType.getConstructor().isInterface())) {
					java.util.List<com.google.javascript.rhino.jstype.JSType> list = com.google.common.collect.Lists.newArrayList();
					for (com.google.javascript.rhino.jstype.FunctionType impl : registry.getDirectImplementors(objType)) {
						list.add(impl.getInstanceType());
					}
					return list;
				}else {
					return null;
				}
			}
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.ObjectType getTypeWithProperty(java.lang.String field, com.google.javascript.rhino.jstype.JSType type) {
			if (type == null) {
				return null;
			}
			if (type.isEnumElementType()) {
				return getTypeWithProperty(field, type.toMaybeEnumElementType().getPrimitiveType());
			}
			if (!(type instanceof com.google.javascript.rhino.jstype.ObjectType)) {
				if ((type.autoboxesTo()) != null) {
					type = type.autoboxesTo();
				}else {
					return null;
				}
			}
			if ("prototype".equals(field)) {
				return null;
			}
			com.google.javascript.rhino.jstype.ObjectType foundType = null;
			com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			if (((objType != null) && ((objType.getConstructor()) != null)) && (objType.getConstructor().isInterface())) {
				com.google.javascript.rhino.jstype.ObjectType topInterface = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objType, field);
				if ((topInterface != null) && ((topInterface.getConstructor()) != null)) {
					foundType = topInterface.getConstructor().getPrototype();
				}
			}else {
				while ((objType != null) && ((objType.getImplicitPrototype()) != objType)) {
					if (objType.hasOwnProperty(field)) {
						foundType = objType;
					}
					objType = objType.getImplicitPrototype();
				} 
			}
			if (foundType == null) {
				com.google.javascript.rhino.jstype.ObjectType maybeType = com.google.javascript.rhino.jstype.ObjectType.cast(registry.getGreatestSubtypeWithProperty(type, field));
				if ((maybeType != null) && (maybeType.hasOwnProperty(field))) {
					foundType = maybeType;
				}
			}
			return foundType;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType getInstanceFromPrototype(com.google.javascript.rhino.jstype.JSType type) {
			if (type.isFunctionPrototypeType()) {
				com.google.javascript.rhino.jstype.ObjectType prototype = ((com.google.javascript.rhino.jstype.ObjectType) (type));
				com.google.javascript.rhino.jstype.FunctionType owner = prototype.getOwnerFunction();
				if ((owner.isConstructor()) || (owner.isInterface())) {
					return prototype.getOwnerFunction().getInstanceType();
				}
			}
			return null;
		}

		@java.lang.Override
		public void recordInterfaces(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.JSType relatedType, com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.rhino.jstype.JSType>.Property p) {
			com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
			if (objType != null) {
				com.google.javascript.rhino.jstype.FunctionType constructor;
				if (objType.isFunctionType()) {
					constructor = objType.toMaybeFunctionType();
				}else
					if (objType.isFunctionPrototypeType()) {
						constructor = objType.getOwnerFunction();
					}else {
						constructor = objType.getConstructor();
					}
				
				while (constructor != null) {
					for (com.google.javascript.rhino.jstype.ObjectType itype : constructor.getImplementedInterfaces()) {
						com.google.javascript.rhino.jstype.JSType top = getTypeWithProperty(p.name, itype);
						if (top != null) {
							p.addType(itype, top, relatedType);
						}else {
							recordInterfaces(itype, relatedType, p);
						}
						if (p.skipRenaming)
							return ;
						
					}
					if ((constructor.isInterface()) || (constructor.isConstructor())) {
						constructor = constructor.getSuperClassConstructor();
					}else {
						constructor = null;
					}
				} 
			}
		}
	}

	private static class ConcreteTypeSystem implements com.google.javascript.jscomp.DisambiguateProperties.TypeSystem<com.google.javascript.jscomp.ConcreteType> {
		private final com.google.javascript.jscomp.TightenTypes tt;

		private int nextUniqueId;

		private com.google.javascript.jscomp.CodingConvention codingConvention;

		private final java.util.Set<com.google.javascript.rhino.jstype.JSType> invalidatingTypes = com.google.common.collect.Sets.newHashSet();

		private static final com.google.javascript.rhino.jstype.JSTypeNative[] nativeTypes = new com.google.javascript.rhino.jstype.JSTypeNative[]{ com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE , com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE , com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE };

		public ConcreteTypeSystem(com.google.javascript.jscomp.TightenTypes tt, com.google.javascript.jscomp.CodingConvention convention) {
			this.tt = tt;
			com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.this.codingConvention = convention;
		}

		@java.lang.Override
		public void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
			com.google.common.base.Preconditions.checkState((!(type.isUnionType())));
			invalidatingTypes.add(type);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getRootScope() {
			return tt.getTopScope();
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getFunctionScope(com.google.javascript.rhino.Node decl) {
			com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType func = tt.getConcreteFunction(decl);
			return func != null ? func.getScope() : ((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType>) (null));
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType getType(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> scope, com.google.javascript.rhino.Node node, java.lang.String prop) {
			if (scope != null) {
				com.google.javascript.jscomp.ConcreteType c = tt.inferConcreteType(((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (scope)), node);
				return maybeAddAutoboxes(c, node, prop);
			}else {
				return null;
			}
		}

		private com.google.javascript.jscomp.ConcreteType maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType cType, com.google.javascript.rhino.Node node, java.lang.String prop) {
			com.google.javascript.rhino.jstype.JSType jsType = node.getJSType();
			if (jsType == null) {
				return cType;
			}else
				if (jsType.isUnknownType()) {
					for (com.google.javascript.rhino.jstype.JSTypeNative nativeType : com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.nativeTypes) {
						com.google.javascript.jscomp.ConcreteType concrete = tt.getConcreteInstance(tt.getTypeRegistry().getNativeObjectType(nativeType));
						if ((concrete != null) && (!(concrete.getPropertyType(prop).isNone()))) {
							cType = cType.unionWith(concrete);
						}
					}
					return cType;
				}
			
			return maybeAddAutoboxes(cType, jsType, prop);
		}

		private com.google.javascript.jscomp.ConcreteType maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType cType, com.google.javascript.rhino.jstype.JSType jsType, java.lang.String prop) {
			jsType = jsType.restrictByNotNullOrUndefined();
			if (jsType.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : jsType.toMaybeUnionType().getAlternates()) {
					cType = maybeAddAutoboxes(cType, alt, prop);
				}
				return cType;
			}else
				if (jsType.isEnumElementType()) {
					return maybeAddAutoboxes(cType, jsType.toMaybeEnumElementType().getPrimitiveType(), prop);
				}
			
			if ((jsType.autoboxesTo()) != null) {
				com.google.javascript.rhino.jstype.JSType autoboxed = jsType.autoboxesTo();
				return cType.unionWith(tt.getConcreteInstance(((com.google.javascript.rhino.jstype.ObjectType) (autoboxed))));
			}else
				if ((jsType.unboxesTo()) != null) {
					return cType.unionWith(tt.getConcreteInstance(((com.google.javascript.rhino.jstype.ObjectType) (jsType))));
				}
			
			return cType;
		}

		@java.lang.Override
		public boolean isInvalidatingType(com.google.javascript.jscomp.ConcreteType type) {
			return (((type == null) || (type.isAll())) || (type.isFunction())) || ((type.isInstance()) && (invalidatingTypes.contains(type.toInstance().instanceType)));
		}

		@java.lang.Override
		public com.google.common.collect.ImmutableSet<com.google.javascript.jscomp.ConcreteType> getTypesToSkipForType(com.google.javascript.jscomp.ConcreteType type) {
			return com.google.common.collect.ImmutableSet.of(type);
		}

		@java.lang.Override
		public boolean isTypeToSkip(com.google.javascript.jscomp.ConcreteType type) {
			return (type.isInstance()) && (!((type.toInstance().isFunctionPrototype()) || (type.toInstance().instanceType.isInstanceType())));
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType restrictByNotNullOrUndefined(com.google.javascript.jscomp.ConcreteType type) {
			return type;
		}

		@java.lang.Override
		public java.lang.Iterable<com.google.javascript.jscomp.ConcreteType> getTypeAlternatives(com.google.javascript.jscomp.ConcreteType type) {
			if (type.isUnion()) {
				return ((com.google.javascript.jscomp.ConcreteType.ConcreteUnionType) (type)).getAlternatives();
			}else {
				return null;
			}
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType getTypeWithProperty(java.lang.String field, com.google.javascript.jscomp.ConcreteType type) {
			if (type.isInstance()) {
				com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instanceType = ((com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType) (type));
				return instanceType.getInstanceTypeWithProperty(field);
			}else
				if (type.isFunction()) {
					if (("prototype".equals(field)) || (codingConvention.isSuperClassReference(field))) {
						return type;
					}
				}else
					if (type.isNone()) {
						return new com.google.javascript.jscomp.ConcreteType.ConcreteUniqueType((++(nextUniqueId)));
					}else
						if (type.isUnion()) {
							for (com.google.javascript.jscomp.ConcreteType t : ((com.google.javascript.jscomp.ConcreteType.ConcreteUnionType) (type)).getAlternatives()) {
								com.google.javascript.jscomp.ConcreteType ret = getTypeWithProperty(field, t);
								if (ret != null) {
									return ret;
								}
							}
						}
					
				
			
			return null;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType getInstanceFromPrototype(com.google.javascript.jscomp.ConcreteType type) {
			if (type.isInstance()) {
				com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instanceType = ((com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType) (type));
				if (instanceType.isFunctionPrototype()) {
					return instanceType.getConstructorType().getInstanceType();
				}
			}
			return null;
		}

		@java.lang.Override
		public void recordInterfaces(com.google.javascript.jscomp.ConcreteType type, com.google.javascript.jscomp.ConcreteType relatedType, com.google.javascript.jscomp.DisambiguateProperties<com.google.javascript.jscomp.ConcreteType>.Property p) {
		}
	}
}

