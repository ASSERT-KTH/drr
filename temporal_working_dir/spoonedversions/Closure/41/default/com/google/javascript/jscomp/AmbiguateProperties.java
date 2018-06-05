

package com.google.javascript.jscomp;


class AmbiguateProperties implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.AmbiguateProperties.class.getName());

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.List<com.google.javascript.rhino.Node> stringNodesToRename = com.google.common.collect.Lists.newArrayList();

	private final char[] reservedCharacters;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.AmbiguateProperties.Property> propertyMap = com.google.common.collect.Maps.newHashMap();

	private final java.util.Set<java.lang.String> externedNames = com.google.common.collect.Sets.newHashSet();

	private final java.util.Set<java.lang.String> quotedNames = com.google.common.collect.Sets.newHashSet();

	private final java.util.Map<java.lang.String, java.lang.String> renamingMap = com.google.common.collect.Maps.newHashMap();

	private static final java.util.Comparator<com.google.javascript.jscomp.AmbiguateProperties.Property> FREQUENCY_COMPARATOR = new java.util.Comparator<com.google.javascript.jscomp.AmbiguateProperties.Property>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.AmbiguateProperties.Property p1, com.google.javascript.jscomp.AmbiguateProperties.Property p2) {
			if ((p1.numOccurrences) != (p2.numOccurrences)) {
				return (p2.numOccurrences) - (p1.numOccurrences);
			}
			return p1.oldName.compareTo(p2.oldName);
		}
	};

	private com.google.common.collect.BiMap<com.google.javascript.rhino.jstype.JSType, java.lang.Integer> intForType = com.google.common.collect.HashBiMap.create();

	private java.util.Map<com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet> relatedBitsets = com.google.common.collect.Maps.newHashMap();

	private final java.util.Set<com.google.javascript.rhino.jstype.JSType> invalidatingTypes;

	static final java.lang.String SKIP_PREFIX = "JSAbstractCompiler";

	AmbiguateProperties(com.google.javascript.jscomp.AbstractCompiler compiler, char[] reservedCharacters) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		this.compiler = compiler;
		this.reservedCharacters = reservedCharacters;
		com.google.javascript.rhino.jstype.JSTypeRegistry r = compiler.getTypeRegistry();
		invalidatingTypes = com.google.common.collect.Sets.newHashSet(r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TOP_LEVEL_PROTOTYPE), r.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		for (com.google.javascript.jscomp.TypeValidator.TypeMismatch mis : compiler.getTypeValidator().getMismatches()) {
			addInvalidatingType(mis.typeA);
			addInvalidatingType(mis.typeB);
		}
	}

	private void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
		type = type.restrictByNotNullOrUndefined();
		if (type.isUnionType()) {
			for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
				addInvalidatingType(alt);
			}
		}
		invalidatingTypes.add(type);
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		if ((objType != null) && (objType.isInstanceType())) {
			invalidatingTypes.add(objType.getImplicitPrototype());
		}
	}

	java.util.Map<java.lang.String, java.lang.String> getRenamingMap() {
		return renamingMap;
	}

	private int getIntForType(com.google.javascript.rhino.jstype.JSType type) {
		if (intForType.containsKey(type)) {
			return intForType.get(type).intValue();
		}
		int newInt = (intForType.size()) + 1;
		intForType.put(type, newInt);
		return newInt;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.AmbiguateProperties.ProcessExterns());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.AmbiguateProperties.ProcessProperties());
		java.util.Set<java.lang.String> reservedNames = new java.util.HashSet<java.lang.String>(((externedNames.size()) + (quotedNames.size())));
		reservedNames.addAll(externedNames);
		reservedNames.addAll(quotedNames);
		int numRenamedPropertyNames = 0;
		int numSkippedPropertyNames = 0;
		java.util.Set<com.google.javascript.jscomp.AmbiguateProperties.Property> propsByFreq = new java.util.TreeSet<com.google.javascript.jscomp.AmbiguateProperties.Property>(com.google.javascript.jscomp.AmbiguateProperties.FREQUENCY_COMPARATOR);
		for (com.google.javascript.jscomp.AmbiguateProperties.Property p : propertyMap.values()) {
			if (!(p.skipAmbiguating)) {
				++numRenamedPropertyNames;
				propsByFreq.add(p);
			}else {
				++numSkippedPropertyNames;
				reservedNames.add(p.oldName);
			}
		}
		com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph graph = new com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph(com.google.common.collect.Lists.newLinkedList(propsByFreq));
		com.google.javascript.jscomp.graph.GraphColoring<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> coloring = new com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void>(graph, com.google.javascript.jscomp.AmbiguateProperties.FREQUENCY_COMPARATOR);
		int numNewPropertyNames = coloring.color();
		com.google.javascript.jscomp.NameGenerator nameGen = new com.google.javascript.jscomp.NameGenerator(reservedNames, "", reservedCharacters);
		java.util.Map<java.lang.Integer, java.lang.String> colorMap = com.google.common.collect.Maps.newHashMap();
		for (int i = 0; i < numNewPropertyNames; ++i) {
			colorMap.put(i, nameGen.generateNextName());
		}
		for (com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> node : graph.getNodes()) {
			node.getValue().newName = colorMap.get(node.getAnnotation().hashCode());
			renamingMap.put(node.getValue().oldName, node.getValue().newName);
		}
		for (com.google.javascript.rhino.Node n : stringNodesToRename) {
			java.lang.String oldName = n.getString();
			com.google.javascript.jscomp.AmbiguateProperties.Property p = propertyMap.get(oldName);
			if ((p != null) && ((p.newName) != null)) {
				com.google.common.base.Preconditions.checkState(oldName.equals(p.oldName));
				if (!(p.newName.equals(oldName))) {
					n.setString(p.newName);
					compiler.reportCodeChange();
				}
			}
		}
		com.google.javascript.jscomp.AmbiguateProperties.logger.fine((((((("Collapsed " + numRenamedPropertyNames) + " properties into ") + numNewPropertyNames) + " and skipped renaming ") + numSkippedPropertyNames) + " properties."));
	}

	private java.util.BitSet getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType type) {
		if (relatedBitsets.containsKey(type)) {
			return relatedBitsets.get(type);
		}else {
			throw new java.lang.RuntimeException(((("Related types should have been computed for" + " type: ") + type) + " but have not been."));
		}
	}

	private void computeRelatedTypes(com.google.javascript.rhino.jstype.JSType type) {
		if (type.isUnionType()) {
			type = type.restrictByNotNullOrUndefined();
			if (type.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
					computeRelatedTypes(alt);
				}
				return ;
			}
		}
		if (relatedBitsets.containsKey(type)) {
			return ;
		}
		com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet related = new com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet(intForType.size());
		relatedBitsets.put(type, related);
		related.set(getIntForType(type));
		if (type.isFunctionPrototypeType()) {
			addRelatedInstance(((com.google.javascript.rhino.jstype.ObjectType) (type)).getOwnerFunction(), related);
			return ;
		}
		com.google.javascript.rhino.jstype.FunctionType constructor = type.toObjectType().getConstructor();
		if ((constructor != null) && ((constructor.getSubTypes()) != null)) {
			for (com.google.javascript.rhino.jstype.FunctionType subType : constructor.getSubTypes()) {
				addRelatedInstance(subType, related);
			}
		}
		for (com.google.javascript.rhino.jstype.FunctionType implementor : compiler.getTypeRegistry().getDirectImplementors(type.toObjectType())) {
			addRelatedInstance(implementor, related);
		}
	}

	private void addRelatedInstance(com.google.javascript.rhino.jstype.FunctionType constructor, com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet related) {
		if (constructor.hasInstanceType()) {
			com.google.javascript.rhino.jstype.ObjectType instanceType = constructor.getInstanceType();
			related.set(getIntForType(instanceType.getImplicitPrototype()));
			computeRelatedTypes(instanceType);
			related.or(relatedBitsets.get(instanceType));
		}
	}

	class PropertyGraph implements com.google.javascript.jscomp.graph.AdjacencyGraph<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> {
		protected final java.util.Map<com.google.javascript.jscomp.AmbiguateProperties.Property, com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode> nodes = com.google.common.collect.Maps.newHashMap();

		PropertyGraph(java.util.Collection<com.google.javascript.jscomp.AmbiguateProperties.Property> props) {
			for (com.google.javascript.jscomp.AmbiguateProperties.Property prop : props) {
				nodes.put(prop, new com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode(prop));
			}
		}

		@java.lang.Override
		public java.util.List<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void>> getNodes() {
			return com.google.common.collect.Lists.<com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void>>newArrayList(nodes.values());
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> getNode(com.google.javascript.jscomp.AmbiguateProperties.Property property) {
			return nodes.get(property);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.graph.SubGraph<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> newSubGraph() {
			return new com.google.javascript.jscomp.AmbiguateProperties.PropertySubGraph();
		}

		@java.lang.Override
		public void clearNodeAnnotations() {
			for (com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode node : nodes.values()) {
				node.setAnnotation(null);
			}
		}

		@java.lang.Override
		public int getWeight(com.google.javascript.jscomp.AmbiguateProperties.Property value) {
			return value.numOccurrences;
		}
	}

	class PropertySubGraph implements com.google.javascript.jscomp.graph.SubGraph<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> {
		com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet relatedTypes = new com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet(intForType.size());

		@java.lang.Override
		public boolean isIndependentOf(com.google.javascript.jscomp.AmbiguateProperties.Property prop) {
			return !(relatedTypes.intersects(prop.relatedTypes));
		}

		@java.lang.Override
		public void addNode(com.google.javascript.jscomp.AmbiguateProperties.Property prop) {
			relatedTypes.or(prop.relatedTypes);
		}
	}

	class PropertyGraphNode implements com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void> {
		com.google.javascript.jscomp.AmbiguateProperties.Property property;

		protected com.google.javascript.jscomp.graph.Annotation annotation;

		PropertyGraphNode(com.google.javascript.jscomp.AmbiguateProperties.Property property) {
			com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode.this.property = property;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.AmbiguateProperties.Property getValue() {
			return property;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings(value = "unchecked")
		public <A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation() {
			return ((A) (annotation));
		}

		@java.lang.Override
		public void setAnnotation(com.google.javascript.jscomp.graph.Annotation data) {
			annotation = data;
		}
	}

	private class ProcessExterns extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					externedNames.add(dest.getString());
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						externedNames.add(child.getString());
					}
					break;
			}
		}
	}

	private class ProcessProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					{
						com.google.javascript.rhino.Node propNode = n.getFirstChild().getNext();
						com.google.javascript.rhino.jstype.JSType jstype = getJSType(n.getFirstChild());
						maybeMarkCandidate(propNode, jstype, t);
						break;
					}
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
						if (!(key.isQuotedString())) {
							com.google.javascript.rhino.jstype.JSType jstype = getJSType(n.getFirstChild());
							maybeMarkCandidate(key, jstype, t);
						}else {
							quotedNames.add(key.getString());
						}
					}
					break;
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node child = n.getLastChild();
					if (child.isString()) {
						quotedNames.add(child.getString());
					}
					break;
			}
		}

		private void maybeMarkCandidate(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.NodeTraversal t) {
			java.lang.String name = n.getString();
			if (!(externedNames.contains(name))) {
				stringNodesToRename.add(n);
				recordProperty(name, type);
			}
		}

		private com.google.javascript.jscomp.AmbiguateProperties.Property recordProperty(java.lang.String name, com.google.javascript.rhino.jstype.JSType type) {
			com.google.javascript.jscomp.AmbiguateProperties.Property prop = getProperty(name);
			prop.addType(type);
			return prop;
		}
	}

	private boolean isInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
		if (type.isUnionType()) {
			type = type.restrictByNotNullOrUndefined();
			if (type.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
					if (isInvalidatingType(alt)) {
						return true;
					}
				}
				return false;
			}
		}
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		return (((((objType == null) || (invalidatingTypes.contains(objType))) || (!(objType.hasReferenceName()))) || (objType.isUnknownType())) || (objType.isEnumType())) || ((objType.autoboxesTo()) != null);
	}

	private com.google.javascript.jscomp.AmbiguateProperties.Property getProperty(java.lang.String name) {
		com.google.javascript.jscomp.AmbiguateProperties.Property prop = propertyMap.get(name);
		if (prop == null) {
			prop = new com.google.javascript.jscomp.AmbiguateProperties.Property(name);
			propertyMap.put(name, prop);
		}
		return prop;
	}

	private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType jsType = n.getJSType();
		if (jsType == null) {
			return compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}else {
			return jsType;
		}
	}

	private class Property {
		final java.lang.String oldName;

		java.lang.String newName;

		int numOccurrences;

		boolean skipAmbiguating;

		com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet relatedTypes = new com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet(intForType.size());

		Property(java.lang.String name) {
			this.oldName = name;
			if (name.startsWith(com.google.javascript.jscomp.AmbiguateProperties.SKIP_PREFIX)) {
				skipAmbiguating = true;
			}
		}

		void addType(com.google.javascript.rhino.jstype.JSType newType) {
			if (skipAmbiguating) {
				return ;
			}
			++(numOccurrences);
			if (newType.isUnionType()) {
				newType = newType.restrictByNotNullOrUndefined();
				if (newType.isUnionType()) {
					for (com.google.javascript.rhino.jstype.JSType alt : newType.toMaybeUnionType().getAlternates()) {
						addNonUnionType(alt);
					}
					return ;
				}
			}
			addNonUnionType(newType);
		}

		private void addNonUnionType(com.google.javascript.rhino.jstype.JSType newType) {
			if ((skipAmbiguating) || (isInvalidatingType(newType))) {
				skipAmbiguating = true;
				return ;
			}
			if (!(relatedTypes.get(getIntForType(newType)))) {
				computeRelatedTypes(newType);
				relatedTypes.or(getRelatedTypesOnNonUnion(newType));
			}
		}
	}

	private class JSTypeBitSet extends java.util.BitSet {
		private static final long serialVersionUID = 1L;

		private JSTypeBitSet(int size) {
			super(size);
		}

		private JSTypeBitSet() {
			super();
		}

		@java.lang.Override
		public java.lang.String toString() {
			int from = 0;
			int current = 0;
			java.util.List<java.lang.String> types = com.google.common.collect.Lists.newArrayList();
			while ((-1) != (current = nextSetBit(from))) {
				types.add(intForType.inverse().get(current).toString());
				from = current + 1;
			} 
			return com.google.common.base.Joiner.on(" && ").join(types);
		}
	}
}

