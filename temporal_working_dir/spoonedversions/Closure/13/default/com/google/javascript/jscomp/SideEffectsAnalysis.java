

package com.google.javascript.jscomp;


class SideEffectsAnalysis implements com.google.javascript.jscomp.CompilerPass {
	enum LocationAbstractionMode {
DEGENERATE, VISIBILITY_BASED;	}

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> NOT_FUNCTION_PREDICATE = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node input) {
			return !(input.isFunction());
		}
	};

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction locationAbstraction;

	private final com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode locationAbstractionIdentifier;

	public SideEffectsAnalysis(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode locationAbstractionMode) {
		com.google.javascript.jscomp.SideEffectsAnalysis.this.compiler = compiler;
		this.locationAbstractionIdentifier = locationAbstractionMode;
	}

	public SideEffectsAnalysis(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstractionMode.DEGENERATE);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		switch (locationAbstractionIdentifier) {
			case DEGENERATE :
				locationAbstraction = new com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction();
				break;
			case VISIBILITY_BASED :
				locationAbstraction = createVisibilityAbstraction(externs, root);
				break;
			default :
				throw new java.lang.IllegalStateException((("Unrecognized location abstraction " + "identifier: ") + (locationAbstractionIdentifier)));
		}
	}

	private com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction createVisibilityAbstraction(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.VariableVisibilityAnalysis variableVisibility = new com.google.javascript.jscomp.VariableVisibilityAnalysis(compiler);
		variableVisibility.process(externs, root);
		com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap variableMap = new com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap(compiler);
		variableMap.mapUses(root);
		return new com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction(compiler, variableVisibility, variableMap);
	}

	public boolean safeToMoveBefore(com.google.javascript.rhino.Node source, com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment environment, com.google.javascript.rhino.Node destination) {
		com.google.common.base.Preconditions.checkNotNull(locationAbstraction);
		com.google.common.base.Preconditions.checkArgument((!(com.google.javascript.jscomp.SideEffectsAnalysis.nodeHasAncestor(destination, source))));
		if (isPure(source)) {
			return true;
		}
		if (nodeHasCall(source)) {
			return false;
		}
		com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary sourceLocationSummary = locationAbstraction.calculateLocationSummary(source);
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation sourceModSet = sourceLocationSummary.getModSet();
		if ((!(sourceModSet.isEmpty())) && (!(com.google.javascript.jscomp.SideEffectsAnalysis.nodesHaveSameControlFlow(source, destination)))) {
			return false;
		}
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation sourceRefSet = sourceLocationSummary.getRefSet();
		java.util.Set<com.google.javascript.rhino.Node> environmentNodes = environment.calculateEnvironment();
		for (com.google.javascript.rhino.Node environmentNode : environmentNodes) {
			if (nodeHasCall(environmentNode)) {
				return false;
			}
		}
		com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary environmentLocationSummary = locationAbstraction.calculateLocationSummary(environmentNodes);
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation environmentModSet = environmentLocationSummary.getModSet();
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation environmentRefSet = environmentLocationSummary.getRefSet();
		if (((!(environmentModSet.intersectsLocation(sourceRefSet))) && (!(environmentRefSet.intersectsLocation(sourceModSet)))) && (!(environmentModSet.intersectsLocation(sourceModSet)))) {
			return true;
		}
		return false;
	}

	private boolean isPure(com.google.javascript.rhino.Node node) {
		return false;
	}

	private static boolean nodesHaveSameControlFlow(com.google.javascript.rhino.Node node1, com.google.javascript.rhino.Node node2) {
		com.google.javascript.rhino.Node node1DeepestControlDependentBlock = com.google.javascript.jscomp.SideEffectsAnalysis.closestControlDependentAncestor(node1);
		com.google.javascript.rhino.Node node2DeepestControlDependentBlock = com.google.javascript.jscomp.SideEffectsAnalysis.closestControlDependentAncestor(node2);
		if (node1DeepestControlDependentBlock == node2DeepestControlDependentBlock) {
			if (node2DeepestControlDependentBlock != null) {
				if (node2DeepestControlDependentBlock.isCase()) {
					return false;
				}
				com.google.common.base.Predicate<com.google.javascript.rhino.Node> isEarlyExitPredicate = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
					@java.lang.Override
					public boolean apply(com.google.javascript.rhino.Node input) {
						int nodeType = input.getType();
						return ((nodeType == (com.google.javascript.rhino.Token.RETURN)) || (nodeType == (com.google.javascript.rhino.Token.BREAK))) || (nodeType == (com.google.javascript.rhino.Token.CONTINUE));
					}
				};
				return !(com.google.javascript.jscomp.NodeUtil.has(node2DeepestControlDependentBlock, isEarlyExitPredicate, com.google.javascript.jscomp.SideEffectsAnalysis.NOT_FUNCTION_PREDICATE));
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

	private static boolean isControlDependentChild(com.google.javascript.rhino.Node child) {
		com.google.javascript.rhino.Node parent = child.getParent();
		if (parent == null) {
			return false;
		}
		java.util.ArrayList<com.google.javascript.rhino.Node> siblings = com.google.common.collect.Lists.newArrayList(parent.children());
		int indexOfChildInParent = siblings.indexOf(child);
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.HOOK :
				return (indexOfChildInParent == 1) || (indexOfChildInParent == 2);
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
				return true;
			case com.google.javascript.rhino.Token.FOR :
				return indexOfChildInParent != 0;
			case com.google.javascript.rhino.Token.SWITCH :
				return indexOfChildInParent > 0;
			case com.google.javascript.rhino.Token.AND :
				return true;
			case com.google.javascript.rhino.Token.OR :
				return true;
			case com.google.javascript.rhino.Token.FUNCTION :
				return true;
			default :
				return false;
		}
	}

	private static com.google.javascript.rhino.Node closestControlDependentAncestor(com.google.javascript.rhino.Node node) {
		if (com.google.javascript.jscomp.SideEffectsAnalysis.isControlDependentChild(node)) {
			return node;
		}
		for (com.google.javascript.rhino.Node ancestor : node.getAncestors()) {
			if (com.google.javascript.jscomp.SideEffectsAnalysis.isControlDependentChild(ancestor)) {
				return ancestor;
			}
		}
		return null;
	}

	private static boolean nodeHasAncestor(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node possibleAncestor) {
		for (com.google.javascript.rhino.Node ancestor : node.getAncestors()) {
			if (ancestor == possibleAncestor) {
				return true;
			}
		}
		return false;
	}

	private boolean nodeHasCall(com.google.javascript.rhino.Node node) {
		return com.google.javascript.jscomp.NodeUtil.has(node, new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node input) {
				return (input.isCall()) || (input.isNew());
			}
		}, com.google.javascript.jscomp.SideEffectsAnalysis.NOT_FUNCTION_PREDICATE);
	}

	public abstract static class AbstractMotionEnvironment {
		public abstract java.util.Set<com.google.javascript.rhino.Node> calculateEnvironment();
	}

	public static class IntraproceduralMotionEnvironment extends com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment {
		public IntraproceduralMotionEnvironment(com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> controlFlowGraph, com.google.javascript.rhino.Node cfgSource, com.google.javascript.rhino.Node cfgDestination) {
		}

		@java.lang.Override
		public java.util.Set<com.google.javascript.rhino.Node> calculateEnvironment() {
			return null;
		}
	}

	public static class CrossModuleMotionEnvironment extends com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment {
		public CrossModuleMotionEnvironment(com.google.javascript.rhino.Node sourceNode, com.google.javascript.jscomp.JSModule sourceModule, com.google.javascript.rhino.Node destinationNode, com.google.javascript.jscomp.JSModule destinationModule, com.google.javascript.jscomp.JSModuleGraph moduleGraph) {
		}

		@java.lang.Override
		public java.util.Set<com.google.javascript.rhino.Node> calculateEnvironment() {
			return null;
		}
	}

	public static class RawMotionEnvironment extends com.google.javascript.jscomp.SideEffectsAnalysis.AbstractMotionEnvironment {
		java.util.Set<com.google.javascript.rhino.Node> environment;

		public RawMotionEnvironment(java.util.Set<com.google.javascript.rhino.Node> environment) {
			com.google.javascript.jscomp.SideEffectsAnalysis.RawMotionEnvironment.this.environment = environment;
		}

		@java.lang.Override
		public java.util.Set<com.google.javascript.rhino.Node> calculateEnvironment() {
			return environment;
		}
	}

	private static class LocationSummary {
		private com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation modSet;

		private com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation refSet;

		public LocationSummary(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation modSet, com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation refSet) {
			com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary.this.modSet = modSet;
			com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary.this.refSet = refSet;
		}

		public com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation getModSet() {
			return modSet;
		}

		public com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation getRefSet() {
			return refSet;
		}
	}

	private static interface EffectLocation {
		public boolean intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation);

		public com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation);

		public boolean isEmpty();
	}

	private abstract static class LocationAbstraction {
		abstract com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary calculateLocationSummary(com.google.javascript.rhino.Node node);

		abstract com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation getBottomLocation();

		public com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary calculateLocationSummary(java.util.Set<com.google.javascript.rhino.Node> nodes) {
			com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation modAccumulator = getBottomLocation();
			com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation refAccumulator = getBottomLocation();
			for (com.google.javascript.rhino.Node node : nodes) {
				com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary nodeLocationSummary = calculateLocationSummary(node);
				modAccumulator = modAccumulator.join(nodeLocationSummary.getModSet());
				refAccumulator = refAccumulator.join(nodeLocationSummary.getRefSet());
			}
			return new com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary(modAccumulator, refAccumulator);
		}
	}

	private static class DegenerateLocationAbstraction extends com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction {
		private static final com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation EVERY_LOCATION = new com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation();

		private static final com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation NO_LOCATION = new com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation();

		@java.lang.Override
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation getBottomLocation() {
			return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.NO_LOCATION;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary calculateLocationSummary(com.google.javascript.rhino.Node node) {
			return new com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary(calculateModSet(node), calculateRefSet(node));
		}

		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation calculateRefSet(com.google.javascript.rhino.Node node) {
			if (com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node)) {
				return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.EVERY_LOCATION;
			}else {
				return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.NO_LOCATION;
			}
		}

		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation calculateModSet(com.google.javascript.rhino.Node node) {
			if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node)) {
				return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.EVERY_LOCATION;
			}else {
				return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.NO_LOCATION;
			}
		}

		private static class DegenerateEffectLocation implements com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation {
			@java.lang.Override
			public com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation) {
				if (otherLocation == (com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.EVERY_LOCATION)) {
					return otherLocation;
				}else {
					return com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.this;
				}
			}

			@java.lang.Override
			public boolean intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation) {
				return ((com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.this) == (com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.EVERY_LOCATION)) && (otherLocation == (com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.EVERY_LOCATION));
			}

			@java.lang.Override
			public boolean isEmpty() {
				return (com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation.this) == (com.google.javascript.jscomp.SideEffectsAnalysis.DegenerateLocationAbstraction.NO_LOCATION);
			}
		}
	}

	private static class VisibilityLocationAbstraction extends com.google.javascript.jscomp.SideEffectsAnalysis.LocationAbstraction {
		private static final int VISIBILITY_LOCATION_NONE = 0;

		private static final int UNKNOWN_LOCATION_MASK = -1;

		private static final int LOCAL_VARIABLE_LOCATION_MASK = 1 << 1;

		private static final int CAPTURED_LOCAL_VARIABLE_LOCATION_MASK = 1 << 2;

		private static final int GLOBAL_VARIABLE_LOCATION_MASK = 1 << 3;

		private static final int HEAP_LOCATION_MASK = 1 << 4;

		com.google.javascript.jscomp.AbstractCompiler compiler;

		com.google.javascript.jscomp.VariableVisibilityAnalysis variableVisibilityAnalysis;

		com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap variableUseMap;

		private VisibilityLocationAbstraction(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.VariableVisibilityAnalysis variableVisibilityAnalysis, com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap variableUseMap) {
			com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.this.compiler = compiler;
			com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.this.variableVisibilityAnalysis = variableVisibilityAnalysis;
			com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.this.variableUseMap = variableUseMap;
		}

		@java.lang.Override
		com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary calculateLocationSummary(com.google.javascript.rhino.Node node) {
			int visibilityRefLocations = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE;
			int visibilityModLocations = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE;
			for (com.google.javascript.rhino.Node reference : findStorageLocationReferences(node)) {
				int effectMask;
				if (reference.isName()) {
					effectMask = effectMaskForVariableReference(reference);
				}else {
					effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.HEAP_LOCATION_MASK;
				}
				if (com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.storageNodeIsLValue(reference)) {
					visibilityModLocations |= effectMask;
				}
				if (com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.storageNodeIsRValue(reference)) {
					visibilityRefLocations |= effectMask;
				}
			}
			com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation modSet = new com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation(visibilityModLocations);
			com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation refSet = new com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation(visibilityRefLocations);
			return new com.google.javascript.jscomp.SideEffectsAnalysis.LocationSummary(modSet, refSet);
		}

		private java.util.Set<com.google.javascript.rhino.Node> findStorageLocationReferences(com.google.javascript.rhino.Node root) {
			final java.util.Set<com.google.javascript.rhino.Node> references = com.google.common.collect.Sets.newHashSet();
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback() {
				@java.lang.Override
				public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
					if ((com.google.javascript.jscomp.NodeUtil.isGet(n)) || ((n.isName()) && (!(parent.isFunction())))) {
						references.add(n);
					}
				}
			});
			return references;
		}

		private int effectMaskForVariableReference(com.google.javascript.rhino.Node variableReference) {
			com.google.common.base.Preconditions.checkArgument(variableReference.isName());
			int effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE;
			com.google.javascript.rhino.Node declaringNameNode = variableUseMap.findDeclaringNameNodeForUse(variableReference);
			if (declaringNameNode != null) {
				com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibility visibility = variableVisibilityAnalysis.getVariableVisibility(declaringNameNode);
				switch (visibility) {
					case LOCAL :
						effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.LOCAL_VARIABLE_LOCATION_MASK;
						break;
					case CAPTURED_LOCAL :
						effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.CAPTURED_LOCAL_VARIABLE_LOCATION_MASK;
						break;
					case PARAMETER :
						effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.HEAP_LOCATION_MASK;
						break;
					case GLOBAL :
						effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.GLOBAL_VARIABLE_LOCATION_MASK;
						break;
					default :
						throw new java.lang.IllegalStateException((("Unrecognized variable" + " visibility: ") + visibility));
				}
			}else {
				effectMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.UNKNOWN_LOCATION_MASK;
			}
			return effectMask;
		}

		@java.lang.Override
		com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation getBottomLocation() {
			return new com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation(com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE);
		}

		private static boolean isStorageNode(com.google.javascript.rhino.Node node) {
			return (node.isName()) || (com.google.javascript.jscomp.NodeUtil.isGet(node));
		}

		private static boolean storageNodeIsRValue(com.google.javascript.rhino.Node node) {
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.isStorageNode(node));
			com.google.javascript.rhino.Node parent = node.getParent();
			if (com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.storageNodeIsLValue(node)) {
				boolean nonSimpleAssign = (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && (!(parent.isAssign()));
				return (nonSimpleAssign || (parent.isDec())) || (parent.isInc());
			}
			return true;
		}

		private static boolean storageNodeIsLValue(com.google.javascript.rhino.Node node) {
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.isStorageNode(node));
			return com.google.javascript.jscomp.NodeUtil.isLValue(node);
		}

		private static class VisibilityBasedEffectLocation implements com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation {
			int visibilityMask = com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE;

			public VisibilityBasedEffectLocation(int visibilityMask) {
				com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation.this.visibilityMask = visibilityMask;
			}

			@java.lang.Override
			public boolean intersectsLocation(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation) {
				com.google.common.base.Preconditions.checkArgument((otherLocation instanceof com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation));
				int otherMask = ((com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation) (otherLocation)).visibilityMask;
				return ((visibilityMask) & otherMask) > 0;
			}

			@java.lang.Override
			public boolean isEmpty() {
				return (visibilityMask) == (com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VISIBILITY_LOCATION_NONE);
			}

			@java.lang.Override
			public com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation join(com.google.javascript.jscomp.SideEffectsAnalysis.EffectLocation otherLocation) {
				com.google.common.base.Preconditions.checkArgument((otherLocation instanceof com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation));
				int otherMask = ((com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation) (otherLocation)).visibilityMask;
				int joinedMask = (visibilityMask) | otherMask;
				return new com.google.javascript.jscomp.SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation(joinedMask);
			}
		}
	}

	private static class VariableUseDeclarationMap {
		private com.google.javascript.jscomp.AbstractCompiler compiler;

		private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> referencesByNameNode;

		public VariableUseDeclarationMap(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.SideEffectsAnalysis.VariableUseDeclarationMap.this.compiler = compiler;
		}

		public void mapUses(com.google.javascript.rhino.Node root) {
			referencesByNameNode = com.google.common.collect.Maps.newHashMap();
			com.google.javascript.jscomp.ReferenceCollectingCallback callback = new com.google.javascript.jscomp.ReferenceCollectingCallback(compiler, com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, callback);
			for (com.google.javascript.jscomp.Scope.Var variable : callback.getAllSymbols()) {
				com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection = callback.getReferences(variable);
				for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference : referenceCollection.references) {
					com.google.javascript.rhino.Node referenceNameNode = reference.getNode();
					referencesByNameNode.put(referenceNameNode, variable.getNameNode());
				}
			}
		}

		public com.google.javascript.rhino.Node findDeclaringNameNodeForUse(com.google.javascript.rhino.Node usingNameNode) {
			com.google.common.base.Preconditions.checkArgument(usingNameNode.isName());
			return referencesByNameNode.get(usingNameNode);
		}
	}
}

