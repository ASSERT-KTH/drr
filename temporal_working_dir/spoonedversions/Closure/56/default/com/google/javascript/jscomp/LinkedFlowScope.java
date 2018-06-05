

package com.google.javascript.jscomp;


class LinkedFlowScope implements com.google.javascript.jscomp.FlowScope {
	private final com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache cache;

	private final com.google.javascript.jscomp.LinkedFlowScope parent;

	private int depth;

	static final int MAX_DEPTH = 250;

	private com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache flattened;

	private boolean frozen = false;

	private com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot lastSlot;

	private LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache cache, com.google.javascript.jscomp.LinkedFlowScope directParent) {
		this.cache = cache;
		if (directParent == null) {
			com.google.javascript.jscomp.LinkedFlowScope.this.lastSlot = null;
			com.google.javascript.jscomp.LinkedFlowScope.this.depth = 0;
			this.parent = cache.linkedEquivalent;
		}else {
			com.google.javascript.jscomp.LinkedFlowScope.this.lastSlot = directParent.lastSlot;
			com.google.javascript.jscomp.LinkedFlowScope.this.depth = (directParent.depth) + 1;
			this.parent = directParent;
		}
	}

	LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache cache) {
		this(cache, null);
	}

	LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope directParent) {
		this(directParent.cache, directParent);
	}

	private com.google.javascript.jscomp.Scope getFunctionScope() {
		return cache.functionScope;
	}

	private boolean flowsFromBottom() {
		return getFunctionScope().isBottom();
	}

	public static com.google.javascript.jscomp.LinkedFlowScope createEntryLattice(com.google.javascript.jscomp.Scope scope) {
		return new com.google.javascript.jscomp.LinkedFlowScope(new com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache(scope));
	}

	@java.lang.Override
	public void inferSlotType(java.lang.String symbol, com.google.javascript.rhino.jstype.JSType type) {
		com.google.common.base.Preconditions.checkState((!(frozen)));
		lastSlot = new com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot(symbol, type, lastSlot);
		(depth)++;
		cache.dirtySymbols.add(symbol);
	}

	@java.lang.Override
	public void inferQualifiedSlot(java.lang.String symbol, com.google.javascript.rhino.jstype.JSType bottomType, com.google.javascript.rhino.jstype.JSType inferredType) {
		com.google.javascript.jscomp.Scope functionScope = getFunctionScope();
		if (functionScope.isLocal()) {
			if (((functionScope.getVar(symbol)) == null) && (!(functionScope.isBottom()))) {
				functionScope.declare(symbol, null, bottomType, null);
			}
			inferSlotType(symbol, inferredType);
		}
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getTypeOfThis() {
		return cache.functionScope.getTypeOfThis();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getRootNode() {
		return getFunctionScope().getRootNode();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> getParentScope() {
		return getFunctionScope().getParentScope();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSlot(java.lang.String name) {
		if (cache.dirtySymbols.contains(name)) {
			for (com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot slot = lastSlot; slot != null; slot = slot.parent) {
				if (slot.getName().equals(name)) {
					return slot;
				}
			}
		}
		return cache.getSlot(name);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getOwnSlot(java.lang.String name) {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public com.google.javascript.jscomp.FlowScope createChildFlowScope() {
		frozen = true;
		if ((depth) > (com.google.javascript.jscomp.LinkedFlowScope.MAX_DEPTH)) {
			if ((flattened) == null) {
				flattened = new com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache(com.google.javascript.jscomp.LinkedFlowScope.this);
			}
			return new com.google.javascript.jscomp.LinkedFlowScope(flattened);
		}
		return new com.google.javascript.jscomp.LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope.this);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> findUniqueRefinedSlot(com.google.javascript.jscomp.FlowScope blindScope) {
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> result = null;
		for (com.google.javascript.jscomp.LinkedFlowScope currentScope = com.google.javascript.jscomp.LinkedFlowScope.this; currentScope != blindScope; currentScope = currentScope.parent) {
			for (com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot currentSlot = currentScope.lastSlot; (currentSlot != null) && (((currentScope.parent) == null) || ((currentScope.parent.lastSlot) != currentSlot)); currentSlot = currentSlot.parent) {
				if (result == null) {
					result = currentSlot;
				}else
					if (!(currentSlot.getName().equals(result.getName()))) {
						return null;
					}
				
			}
		}
		return result;
	}

	@java.lang.Override
	public void completeScope(com.google.javascript.jscomp.Scope scope) {
		for (java.util.Iterator<com.google.javascript.jscomp.Scope.Var> it = scope.getVars(); it.hasNext();) {
			com.google.javascript.jscomp.Scope.Var var = it.next();
			if (var.isTypeInferred()) {
				com.google.javascript.rhino.jstype.JSType type = var.getType();
				if ((type == null) || (type.isUnknownType())) {
					com.google.javascript.rhino.jstype.JSType flowType = getSlot(var.getName()).getType();
					var.setType(flowType);
				}
			}
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.LinkedFlowScope optimize() {
		com.google.javascript.jscomp.LinkedFlowScope current;
		for (current = com.google.javascript.jscomp.LinkedFlowScope.this; ((current.parent) != null) && ((current.lastSlot) == (current.parent.lastSlot)); current = current.parent) {
		}
		return current;
	}

	static class FlowScopeJoinOp extends com.google.javascript.jscomp.JoinOp.BinaryJoinOp<com.google.javascript.jscomp.FlowScope> {
		@java.lang.SuppressWarnings(value = "unchecked")
		@java.lang.Override
		public com.google.javascript.jscomp.FlowScope apply(com.google.javascript.jscomp.FlowScope a, com.google.javascript.jscomp.FlowScope b) {
			com.google.javascript.jscomp.LinkedFlowScope linkedA = ((com.google.javascript.jscomp.LinkedFlowScope) (a));
			com.google.javascript.jscomp.LinkedFlowScope linkedB = ((com.google.javascript.jscomp.LinkedFlowScope) (b));
			linkedA.frozen = true;
			linkedB.frozen = true;
			if ((linkedA.optimize()) == (linkedB.optimize())) {
				return linkedA.createChildFlowScope();
			}
			return new com.google.javascript.jscomp.LinkedFlowScope(new com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache(linkedA, linkedB));
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if (other instanceof com.google.javascript.jscomp.LinkedFlowScope) {
			com.google.javascript.jscomp.LinkedFlowScope that = ((com.google.javascript.jscomp.LinkedFlowScope) (other));
			if ((com.google.javascript.jscomp.LinkedFlowScope.this.optimize()) == (that.optimize())) {
				return true;
			}
			if ((com.google.javascript.jscomp.LinkedFlowScope.this.getFunctionScope()) != (that.getFunctionScope())) {
				return false;
			}
			if ((cache) == (that.cache)) {
				for (java.lang.String name : cache.dirtySymbols) {
					if (diffSlots(getSlot(name), that.getSlot(name))) {
						return false;
					}
				}
				return true;
			}
			java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> myFlowSlots = allFlowSlots();
			java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> otherFlowSlots = that.allFlowSlots();
			for (com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot : myFlowSlots.values()) {
				if (diffSlots(slot, otherFlowSlots.get(slot.getName()))) {
					return false;
				}
				otherFlowSlots.remove(slot.getName());
			}
			for (com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slot : otherFlowSlots.values()) {
				if (diffSlots(slot, myFlowSlots.get(slot.getName()))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private boolean diffSlots(com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slotA, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slotB) {
		boolean aIsNull = (slotA == null) || ((slotA.getType()) == null);
		boolean bIsNull = (slotB == null) || ((slotB.getType()) == null);
		if (aIsNull && bIsNull) {
			return false;
		}else
			if (aIsNull ^ bIsNull) {
				return true;
			}
		
		return slotA.getType().differsFrom(slotB.getType());
	}

	private java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> allFlowSlots() {
		java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> slots = com.google.common.collect.Maps.newHashMap();
		for (com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot slot = lastSlot; slot != null; slot = slot.parent) {
			if (!(slots.containsKey(slot.getName()))) {
				slots.put(slot.getName(), slot);
			}
		}
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> symbolEntry : cache.symbols.entrySet()) {
			if (!(slots.containsKey(symbolEntry.getKey()))) {
				slots.put(symbolEntry.getKey(), symbolEntry.getValue());
			}
		}
		return slots;
	}

	private static class LinkedFlowSlot extends com.google.javascript.rhino.jstype.SimpleSlot {
		final com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot parent;

		LinkedFlowSlot(java.lang.String name, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot parent) {
			super(name, type, true);
			this.parent = parent;
		}
	}

	private static class FlatFlowScopeCache {
		private final com.google.javascript.jscomp.Scope functionScope;

		private final com.google.javascript.jscomp.LinkedFlowScope linkedEquivalent;

		private java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> symbols = com.google.common.collect.Maps.newHashMap();

		final java.util.Set<java.lang.String> dirtySymbols = com.google.common.collect.Sets.newHashSet();

		FlatFlowScopeCache(com.google.javascript.jscomp.Scope functionScope) {
			this.functionScope = functionScope;
			symbols = com.google.common.collect.ImmutableMap.of();
			linkedEquivalent = null;
		}

		FlatFlowScopeCache(com.google.javascript.jscomp.LinkedFlowScope directParent) {
			com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache cache = directParent.cache;
			functionScope = cache.functionScope;
			symbols = directParent.allFlowSlots();
			linkedEquivalent = directParent;
		}

		FlatFlowScopeCache(com.google.javascript.jscomp.LinkedFlowScope joinedScopeA, com.google.javascript.jscomp.LinkedFlowScope joinedScopeB) {
			linkedEquivalent = null;
			functionScope = (joinedScopeA.flowsFromBottom()) ? joinedScopeB.getFunctionScope() : joinedScopeA.getFunctionScope();
			java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> slotsA = joinedScopeA.allFlowSlots();
			java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType>> slotsB = joinedScopeB.allFlowSlots();
			symbols = slotsA;
			java.util.Set<java.lang.String> symbolNames = com.google.common.collect.Sets.newHashSet(symbols.keySet());
			symbolNames.addAll(slotsB.keySet());
			for (java.lang.String name : symbolNames) {
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slotA = slotsA.get(name);
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> slotB = slotsB.get(name);
				com.google.javascript.rhino.jstype.JSType joinedType = null;
				if ((slotB == null) || ((slotB.getType()) == null)) {
					com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> fnSlot = joinedScopeB.getFunctionScope().getSlot(name);
					com.google.javascript.rhino.jstype.JSType fnSlotType = fnSlot == null ? null : fnSlot.getType();
					if (fnSlotType == null) {
					}else {
						joinedType = slotA.getType().getLeastSupertype(fnSlotType);
					}
				}else
					if ((slotA == null) || ((slotA.getType()) == null)) {
						com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> fnSlot = joinedScopeA.getFunctionScope().getSlot(name);
						com.google.javascript.rhino.jstype.JSType fnSlotType = fnSlot == null ? null : fnSlot.getType();
						if (fnSlotType == null) {
							symbols.put(name, slotB);
						}else {
							joinedType = slotB.getType().getLeastSupertype(fnSlotType);
						}
					}else {
						joinedType = slotA.getType().getLeastSupertype(slotB.getType());
					}
				
				if (joinedType != null) {
					symbols.put(name, new com.google.javascript.rhino.jstype.SimpleSlot(name, joinedType, true));
				}
			}
		}

		public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> getSlot(java.lang.String name) {
			if (symbols.containsKey(name)) {
				return symbols.get(name);
			}else {
				return functionScope.getSlot(name);
			}
		}
	}
}

