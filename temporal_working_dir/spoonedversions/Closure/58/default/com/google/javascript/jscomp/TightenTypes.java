

package com.google.javascript.jscomp;


class TightenTypes implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.ConcreteType.Factory {
	public static final java.lang.String NON_HALTING_ERROR_MSG = "TightenTypes pass appears to be stuck in an infinite loop.";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType> functionFromDeclaration = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType> functionFromJSType = com.google.common.collect.Maps.newIdentityHashMap();

	private final java.util.Map<com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType> instanceFromJSType = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair, com.google.javascript.jscomp.ConcreteType> typeIntersectionMemos = com.google.common.collect.Maps.newHashMap();

	private com.google.javascript.jscomp.TightenTypes.ConcreteScope topScope;

	TightenTypes(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	com.google.javascript.jscomp.TightenTypes.ConcreteScope getTopScope() {
		return topScope;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSTypeRegistry getTypeRegistry() {
		return compiler.getTypeRegistry();
	}

	private java.util.Set<com.google.javascript.jscomp.ConcreteType> allInstantiatedTypes = com.google.common.collect.Sets.newHashSet();

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externRoot, com.google.javascript.rhino.Node jsRoot) {
		topScope = new com.google.javascript.jscomp.TightenTypes.ConcreteScope(null);
		topScope.initForExternRoot(externRoot);
		topScope.initForScopeRoot(jsRoot);
		long maxIterations = 1000;
		long iterations = 0;
		java.util.Set<com.google.javascript.jscomp.TightenTypes.ConcreteScope> workSet = com.google.common.collect.Sets.newHashSet(topScope);
		java.util.List<com.google.javascript.jscomp.TightenTypes.ConcreteScope> workList = com.google.common.collect.Lists.newArrayList(topScope);
		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < (workList.size()); ++i) {
				com.google.javascript.jscomp.TightenTypes.ConcreteScope scope = workList.get(i);
				for (com.google.javascript.jscomp.TightenTypes.Action action : scope.getActions()) {
					for (com.google.javascript.jscomp.TightenTypes.Assignment assign : action.getAssignments(scope)) {
						if (assign.slot.addConcreteType(assign.type)) {
							changed = true;
							com.google.javascript.jscomp.TightenTypes.ConcreteScope varScope = assign.slot.getScope();
							if ((varScope != scope) && (!(workSet.contains(varScope)))) {
								workSet.add(varScope);
								workList.add(varScope);
							}
						}
					}
				}
			}
			com.google.common.base.Preconditions.checkState(((++iterations) != maxIterations), com.google.javascript.jscomp.TightenTypes.NON_HALTING_ERROR_MSG);
		} while (changed );
	}

	class ConcreteScope implements com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> {
		private final com.google.javascript.jscomp.TightenTypes.ConcreteScope parent;

		private final java.util.Map<java.lang.String, com.google.javascript.jscomp.TightenTypes.ConcreteSlot> slots;

		private final java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions;

		ConcreteScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope parent) {
			this.parent = parent;
			this.slots = com.google.common.collect.Maps.newHashMap();
			this.actions = com.google.common.collect.Lists.newArrayList();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getRootNode() {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> getParentScope() {
			return parent;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getOwnSlot(java.lang.String name) {
			return slots.get(name);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> getSlot(java.lang.String name) {
			com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> var = getOwnSlot(name);
			if (var != null) {
				return var;
			}else
				if ((parent) != null) {
					return parent.getSlot(name);
				}else {
					return null;
				}
			
		}

		java.util.Collection<com.google.javascript.jscomp.TightenTypes.ConcreteSlot> getSlots() {
			return slots.values();
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType getTypeOfThis() {
			com.google.javascript.jscomp.TightenTypes.ConcreteSlot thisVar = slots.get(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.THIS_SLOT_NAME);
			return thisVar != null ? thisVar.getType() : com.google.javascript.jscomp.ConcreteType.NONE;
		}

		void declareSlot(java.lang.String name, com.google.javascript.rhino.Node declaration) {
			slots.put(name, new com.google.javascript.jscomp.TightenTypes.ConcreteSlot(com.google.javascript.jscomp.TightenTypes.ConcreteScope.this, name));
		}

		void declareSlot(java.lang.String name, com.google.javascript.rhino.Node declaration, com.google.javascript.jscomp.ConcreteType type) {
			com.google.javascript.jscomp.TightenTypes.ConcreteSlot var = new com.google.javascript.jscomp.TightenTypes.ConcreteSlot(com.google.javascript.jscomp.TightenTypes.ConcreteScope.this, name);
			var.addConcreteType(type);
			slots.put(name, var);
		}

		java.util.List<com.google.javascript.jscomp.TightenTypes.Action> getActions() {
			return actions;
		}

		void initForScopeRoot(com.google.javascript.rhino.Node decl) {
			com.google.common.base.Preconditions.checkNotNull(decl);
			if ((decl.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				decl = decl.getLastChild();
			}
			com.google.common.base.Preconditions.checkArgument(((decl.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, decl, new com.google.javascript.jscomp.TightenTypes.CreateScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope.this, false));
		}

		void initForExternRoot(com.google.javascript.rhino.Node decl) {
			com.google.common.base.Preconditions.checkNotNull(decl);
			com.google.common.base.Preconditions.checkArgument(((decl.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, decl, new com.google.javascript.jscomp.TightenTypes.CreateScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope.this, true));
		}

		void addAction(com.google.javascript.jscomp.TightenTypes.Action action) {
			actions.add(action);
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((getTypeOfThis().toString()) + " ") + (getSlots());
		}
	}

	static class ConcreteSlot implements com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> {
		private final com.google.javascript.jscomp.TightenTypes.ConcreteScope scope;

		private final java.lang.String name;

		private com.google.javascript.jscomp.ConcreteType type;

		ConcreteSlot(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope, java.lang.String name) {
			this.scope = scope;
			this.name = name;
			com.google.javascript.jscomp.TightenTypes.ConcreteSlot.this.type = com.google.javascript.jscomp.ConcreteType.NONE;
		}

		com.google.javascript.jscomp.TightenTypes.ConcreteScope getScope() {
			return scope;
		}

		@java.lang.Override
		public java.lang.String getName() {
			return name;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ConcreteType getType() {
			return type;
		}

		@java.lang.Override
		public boolean isTypeInferred() {
			return true;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.StaticReference<com.google.javascript.jscomp.ConcreteType> getDeclaration() {
			return null;
		}

		boolean addConcreteType(com.google.javascript.jscomp.ConcreteType type) {
			com.google.javascript.jscomp.ConcreteType origType = com.google.javascript.jscomp.TightenTypes.ConcreteSlot.this.type;
			com.google.javascript.jscomp.TightenTypes.ConcreteSlot.this.type = origType.unionWith(type);
			return !(com.google.javascript.jscomp.TightenTypes.ConcreteSlot.this.type.equals(origType));
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((getName()) + ": ") + (getType());
		}
	}

	private static interface Action {
		java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope);
	}

	private static class Assignment {
		private final com.google.javascript.jscomp.TightenTypes.ConcreteSlot slot;

		private final com.google.javascript.jscomp.ConcreteType type;

		Assignment(com.google.javascript.jscomp.TightenTypes.ConcreteSlot slot, com.google.javascript.jscomp.ConcreteType type) {
			this.slot = slot;
			this.type = type;
			com.google.common.base.Preconditions.checkNotNull(slot);
			com.google.common.base.Preconditions.checkNotNull(type);
		}
	}

	private class VariableAssignAction implements com.google.javascript.jscomp.TightenTypes.Action {
		private final com.google.javascript.jscomp.TightenTypes.ConcreteSlot slot;

		private final com.google.javascript.rhino.Node expression;

		VariableAssignAction(com.google.javascript.jscomp.TightenTypes.ConcreteSlot slot, com.google.javascript.rhino.Node expr) {
			this.slot = slot;
			this.expression = expr;
			com.google.common.base.Preconditions.checkNotNull(slot);
			com.google.common.base.Preconditions.checkNotNull(expr);
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
			return com.google.common.collect.Lists.newArrayList(new com.google.javascript.jscomp.TightenTypes.Assignment(slot, inferConcreteType(scope, expression)));
		}
	}

	private class PropertyAssignAction implements com.google.javascript.jscomp.TightenTypes.Action {
		private final com.google.javascript.rhino.Node receiver;

		private final java.lang.String propName;

		private final com.google.javascript.rhino.Node expression;

		PropertyAssignAction(com.google.javascript.rhino.Node receiver, com.google.javascript.rhino.Node expr) {
			this.receiver = receiver;
			this.propName = receiver.getNext().getString();
			this.expression = expr;
			com.google.common.base.Preconditions.checkNotNull(receiver);
			com.google.common.base.Preconditions.checkNotNull(propName);
			com.google.common.base.Preconditions.checkNotNull(expr);
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
			com.google.javascript.jscomp.ConcreteType recvType = inferConcreteType(scope, receiver);
			com.google.javascript.jscomp.ConcreteType exprType = inferConcreteType(scope, expression);
			java.util.List<com.google.javascript.jscomp.TightenTypes.Assignment> assigns = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> prop : recvType.getPropertySlots(propName)) {
				assigns.add(new com.google.javascript.jscomp.TightenTypes.Assignment(((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (prop)), exprType));
			}
			return assigns;
		}
	}

	private class FunctionCallBuilder {
		private boolean isNewCall = false;

		private boolean isCallFunction = false;

		private final com.google.javascript.rhino.Node receiver;

		private final com.google.javascript.rhino.Node firstArgument;

		private java.lang.String propName = null;

		FunctionCallBuilder(com.google.javascript.rhino.Node receiver, com.google.javascript.rhino.Node firstArgument) {
			this.receiver = receiver;
			this.firstArgument = firstArgument;
		}

		com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder setPropName(java.lang.String propName) {
			com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.this.propName = propName;
			return com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.this;
		}

		com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder setIsNewCall(boolean isNew) {
			com.google.common.base.Preconditions.checkState((!((isCallFunction) && isNew)), "A function call cannot be of the form: new Object.call()");
			isNewCall = isNew;
			return com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.this;
		}

		com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder setIsCallFunction() {
			com.google.common.base.Preconditions.checkState((!(isNewCall)), "A function call cannot be of the form: new Object.call()");
			isCallFunction = true;
			return com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder.this;
		}

		com.google.javascript.jscomp.TightenTypes.Action build() {
			if (isCallFunction) {
				return new com.google.javascript.jscomp.TightenTypes.NativeCallFunctionCall(receiver, propName, firstArgument);
			}else {
				return new com.google.javascript.jscomp.TightenTypes.FunctionCall(isNewCall, receiver, propName, firstArgument);
			}
		}
	}

	private java.util.List<com.google.javascript.jscomp.TightenTypes.Assignment> getFunctionCallAssignments(com.google.javascript.jscomp.ConcreteType recvType, com.google.javascript.jscomp.ConcreteType thisType, java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes) {
		java.util.List<com.google.javascript.jscomp.TightenTypes.Assignment> assigns = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType fType : recvType.getFunctions()) {
			assigns.add(new com.google.javascript.jscomp.TightenTypes.Assignment(((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (fType.getCallSlot())), fType));
			assigns.add(new com.google.javascript.jscomp.TightenTypes.Assignment(((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (fType.getThisSlot())), thisType));
			for (int i = 0; i < (argTypes.size()); ++i) {
				com.google.javascript.jscomp.TightenTypes.ConcreteSlot variable = ((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (fType.getParameterSlot(i)));
				if (variable != null) {
					assigns.add(new com.google.javascript.jscomp.TightenTypes.Assignment(variable, argTypes.get(i)));
				}
			}
		}
		return assigns;
	}

	private class ExternFunctionCall implements com.google.javascript.jscomp.TightenTypes.Action {
		private com.google.javascript.rhino.Node receiver;

		private com.google.javascript.jscomp.ConcreteType thisType;

		private java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes;

		ExternFunctionCall(com.google.javascript.rhino.Node receiver, com.google.javascript.jscomp.ConcreteType thisType, java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes) {
			com.google.javascript.jscomp.TightenTypes.ExternFunctionCall.this.receiver = receiver;
			com.google.javascript.jscomp.TightenTypes.ExternFunctionCall.this.thisType = thisType;
			com.google.javascript.jscomp.TightenTypes.ExternFunctionCall.this.argTypes = argTypes;
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
			return getFunctionCallAssignments(inferConcreteType(scope, receiver), thisType, argTypes);
		}
	}

	private class FunctionCall implements com.google.javascript.jscomp.TightenTypes.Action {
		private final boolean isNewCall;

		private final com.google.javascript.rhino.Node receiver;

		private final java.lang.String propName;

		private final com.google.javascript.rhino.Node firstArgument;

		FunctionCall(boolean isNewCall, com.google.javascript.rhino.Node receiver, java.lang.String propName, com.google.javascript.rhino.Node firstArgument) {
			this.isNewCall = isNewCall;
			this.receiver = receiver;
			this.propName = propName;
			this.firstArgument = firstArgument;
			com.google.common.base.Preconditions.checkNotNull(receiver);
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
			com.google.javascript.jscomp.ConcreteType thisType = com.google.javascript.jscomp.ConcreteType.NONE;
			com.google.javascript.jscomp.ConcreteType recvType = inferConcreteType(scope, receiver);
			if ((propName) != null) {
				thisType = recvType;
				recvType = thisType.getPropertyType(propName);
			}
			if (recvType.isAll()) {
				throw new java.lang.AssertionError("Found call on all type, which makes tighten types useless.");
			}
			if (isNewCall) {
				thisType = com.google.javascript.jscomp.ConcreteType.NONE;
				for (com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instType : recvType.getFunctionInstanceTypes()) {
					thisType = thisType.unionWith(instType);
				}
				boolean added = allInstantiatedTypes.add(thisType);
				if (added) {
					typeIntersectionMemos.clear();
				}
			}
			java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.rhino.Node arg = firstArgument; arg != null; arg = arg.getNext()) {
				argTypes.add(inferConcreteType(scope, arg));
			}
			return getFunctionCallAssignments(recvType, thisType, argTypes);
		}
	}

	private class NativeCallFunctionCall implements com.google.javascript.jscomp.TightenTypes.Action {
		private final com.google.javascript.rhino.Node receiver;

		private final java.lang.String propName;

		private final com.google.javascript.rhino.Node firstArgument;

		NativeCallFunctionCall(com.google.javascript.rhino.Node receiver, java.lang.String propName, com.google.javascript.rhino.Node firstArgument) {
			this.receiver = receiver;
			this.propName = propName;
			this.firstArgument = firstArgument;
			com.google.common.base.Preconditions.checkNotNull(receiver);
		}

		@java.lang.Override
		public java.util.Collection<com.google.javascript.jscomp.TightenTypes.Assignment> getAssignments(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
			com.google.javascript.jscomp.ConcreteType thisType = (firstArgument) != null ? inferConcreteType(scope, firstArgument) : getTopScope().getTypeOfThis();
			com.google.javascript.jscomp.ConcreteType recvType = inferConcreteType(scope, receiver);
			if ((recvType instanceof com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType) && (((com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType) (recvType)).isFunctionPrototype())) {
				recvType = thisType.getPropertyType(propName);
			}
			java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.rhino.Node arg = firstArgument.getNext(); arg != null; arg = arg.getNext()) {
				argTypes.add(inferConcreteType(scope, arg));
			}
			return getFunctionCallAssignments(recvType, thisType, argTypes);
		}
	}

	private class CreateScope extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		private final com.google.javascript.jscomp.TightenTypes.ConcreteScope scope;

		private final boolean inExterns;

		CreateScope(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope, boolean inExterns) {
			this.scope = scope;
			this.inExterns = inExterns;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					com.google.javascript.rhino.Node name;
					for (name = n.getFirstChild(); name != null; name = name.getNext()) {
						if (inExterns) {
							scope.declareSlot(name.getString(), n, createType(name, scope));
						}else {
							scope.declareSlot(name.getString(), n);
							if ((name.getFirstChild()) != null) {
								addActions(createAssignmentActions(name, name.getFirstChild(), n));
							}
						}
					}
					break;
				case com.google.javascript.rhino.Token.GETPROP :
					if (inExterns) {
						com.google.javascript.jscomp.ConcreteType type = inferConcreteType(getTopScope(), n);
						if (type.isNone()) {
							com.google.javascript.jscomp.TightenTypes.ConcreteScope scope = ((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (inferConcreteType(getTopScope(), n.getFirstChild()).getScope()));
							if (scope != null) {
								type = createType(n.getJSType());
								if ((type.isNone()) || (type.isAll())) {
									break;
								}
								type = createUnionWithSubTypes(type);
								com.google.javascript.rhino.Node nameNode = n.getLastChild();
								scope.declareSlot(nameNode.getString(), n, type);
							}
						}
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
						if (!(n.getJSType().isNoObjectType())) {
							com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType type = createConcreteFunction(n, scope);
							scope.declareSlot(n.getFirstChild().getString(), n, type);
							if ((inExterns) && ((type.getInstanceType()) != null)) {
								allInstantiatedTypes.add(type.getInstanceType());
							}
						}
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					if (inExterns) {
						com.google.javascript.jscomp.TightenTypes.ConcreteScope scope;
						if ((lhs.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
							com.google.javascript.jscomp.ConcreteType type = inferConcreteType(getTopScope(), lhs.getFirstChild());
							scope = ((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (type.getScope()));
						}else {
							scope = getTopScope();
						}
						if (scope == null)
							break;
						
						com.google.javascript.jscomp.ConcreteType type = inferConcreteType(getTopScope(), n);
						if ((type.isNone()) || (type.isAll())) {
							break;
						}
						if (type.isFunction()) {
							if (((lhs.getJSType()) == null) || (!((lhs.getJSType()) instanceof com.google.javascript.rhino.jstype.FunctionType))) {
								break;
							}
							com.google.javascript.jscomp.ConcreteType retType = createType(((com.google.javascript.rhino.jstype.FunctionType) (lhs.getJSType().restrictByNotNullOrUndefined())).getReturnType());
							retType = createUnionWithSubTypes(retType);
							com.google.javascript.jscomp.ConcreteType newret = type.toFunction().getReturnSlot().getType().unionWith(retType);
							((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (type.getScope())).declareSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.RETURN_SLOT_NAME, n, newret);
						}
						scope.declareSlot(lhs.getLastChild().getString(), n, type);
					}else {
						addActions(createAssignmentActions(lhs, n.getLastChild(), n));
					}
					break;
				case com.google.javascript.rhino.Token.NEW :
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node receiver = n.getFirstChild();
					if ((receiver.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
						com.google.javascript.rhino.Node first = receiver.getFirstChild();
						if ("call".equals(first.getNext().getString())) {
							if ((first.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
								addAction(new com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder(first, receiver.getNext()).setPropName(first.getFirstChild().getNext().getString()).setIsCallFunction().build());
							}else {
								addAction(new com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder(first, receiver.getNext()).setIsCallFunction().build());
							}
						}else {
							addAction(new com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder(first, receiver.getNext()).setPropName(first.getNext().getString()).build());
						}
					}else {
						addAction(new com.google.javascript.jscomp.TightenTypes.FunctionCallBuilder(receiver, receiver.getNext()).setIsNewCall(((n.getType()) == (com.google.javascript.rhino.Token.NEW))).build());
					}
					break;
				case com.google.javascript.rhino.Token.NAME :
					if (((parent.getType()) == (com.google.javascript.rhino.Token.CATCH)) && ((parent.getFirstChild()) == n)) {
						scope.declareSlot(n.getString(), n, createUnionWithSubTypes(createType(getTypeRegistry().getType("Error")).toInstance()));
					}
					break;
				case com.google.javascript.rhino.Token.RETURN :
					if ((n.getFirstChild()) != null) {
						addAction(new com.google.javascript.jscomp.TightenTypes.VariableAssignAction(((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (scope.getOwnSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.RETURN_SLOT_NAME))), n.getFirstChild()));
					}
					break;
			}
			java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> actions = getImplicitActions(n);
			if (actions != null) {
				for (com.google.javascript.jscomp.TightenTypes.Action action : actions) {
					addAction(action);
				}
			}
		}

		private void addAction(com.google.javascript.jscomp.TightenTypes.Action action) {
			com.google.common.base.Preconditions.checkState((!(inExterns)), "Unexpected action in externs.");
			scope.addAction(action);
		}

		private void addActions(java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions) {
			com.google.common.base.Preconditions.checkState((!(inExterns)), "Unexpected action in externs.");
			for (com.google.javascript.jscomp.TightenTypes.Action action : actions) {
				scope.addAction(action);
			}
		}

		private java.util.List<com.google.javascript.jscomp.TightenTypes.Action> createAssignmentActions(com.google.javascript.rhino.Node lhs, com.google.javascript.rhino.Node rhs, com.google.javascript.rhino.Node parent) {
			switch (lhs.getType()) {
				case com.google.javascript.rhino.Token.NAME :
					com.google.javascript.jscomp.TightenTypes.ConcreteSlot var = ((com.google.javascript.jscomp.TightenTypes.ConcreteSlot) (scope.getSlot(lhs.getString())));
					com.google.common.base.Preconditions.checkState((var != null), "Type tightener could not find variable with name %s", lhs.getString());
					return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList(new com.google.javascript.jscomp.TightenTypes.VariableAssignAction(var, rhs));
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node receiver = lhs.getFirstChild();
					return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList(new com.google.javascript.jscomp.TightenTypes.PropertyAssignAction(receiver, rhs));
				case com.google.javascript.rhino.Token.GETELEM :
					return com.google.common.collect.Lists.newArrayList();
				case com.google.javascript.rhino.Token.GET_REF :
					if ((lhs.getFirstChild().getType()) == (com.google.javascript.rhino.Token.REF_SPECIAL)) {
						return com.google.common.collect.Lists.newArrayList();
					}else {
						throw new java.lang.AssertionError(("Bad LHS for getref: " + (parent.toStringTree())));
					}
				default :
					throw new java.lang.AssertionError(("Bad LHS for assignment: " + (parent.toStringTree())));
			}
		}

		private com.google.javascript.jscomp.TightenTypes.ExternFunctionCall createExternFunctionCall(com.google.javascript.rhino.Node receiver, com.google.javascript.rhino.jstype.JSType jsThisType, com.google.javascript.rhino.jstype.FunctionType fun) {
			java.util.List<com.google.javascript.jscomp.ConcreteType> argTypes = com.google.common.collect.Lists.newArrayList();
			com.google.javascript.jscomp.ConcreteType thisType;
			if (fun != null) {
				thisType = createType(jsThisType);
				for (com.google.javascript.rhino.Node arg : fun.getParameters()) {
					argTypes.add(createType(arg, scope));
				}
			}else {
				thisType = com.google.javascript.jscomp.ConcreteType.NONE;
			}
			return new com.google.javascript.jscomp.TightenTypes.ExternFunctionCall(receiver, thisType, argTypes);
		}

		private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
			if ((n.getJSType()) != null) {
				return n.getJSType();
			}else {
				return getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
		}

		private java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> getImplicitActions(com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node receiver = n.getFirstChild();
					if ((!(inExterns)) && ((receiver.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
						return getImplicitActionsFromCall(n, receiver.getJSType());
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					if ((!(inExterns)) && ((lhs.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
						return getImplicitActionsFromProp(lhs.getFirstChild().getJSType(), lhs.getLastChild().getString(), n.getLastChild());
					}
					break;
			}
			return null;
		}

		private java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> getImplicitActionsFromCall(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType recvType) {
			com.google.javascript.rhino.Node receiver = n.getFirstChild();
			if (recvType instanceof com.google.javascript.rhino.jstype.UnionType) {
				java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.jstype.JSType alt : ((com.google.javascript.rhino.jstype.UnionType) (recvType)).getAlternates()) {
					actions.addAll(getImplicitActionsFromCall(n, alt));
				}
				return actions;
			}else
				if (!(recvType instanceof com.google.javascript.rhino.jstype.FunctionType)) {
					return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList();
				}
			
			com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(getJSType(receiver.getFirstChild()).restrictByNotNullOrUndefined());
			java.lang.String prop = receiver.getLastChild().getString();
			if (((objType != null) && (objType.isPropertyInExterns(prop))) && ((((com.google.javascript.rhino.jstype.FunctionType) (recvType)).getParameters()) != null)) {
				java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions = com.google.common.collect.Lists.newArrayList();
				java.util.Iterator<com.google.javascript.rhino.Node> paramIter = ((com.google.javascript.rhino.jstype.FunctionType) (recvType)).getParameters().iterator();
				java.util.Iterator<com.google.javascript.rhino.Node> argumentIter = n.children().iterator();
				argumentIter.next();
				while ((paramIter.hasNext()) && (argumentIter.hasNext())) {
					com.google.javascript.rhino.Node arg = argumentIter.next();
					com.google.javascript.rhino.Node param = paramIter.next();
					if ((arg.getJSType()) instanceof com.google.javascript.rhino.jstype.FunctionType) {
						actions.addAll(getImplicitActionsFromArgument(arg, ((com.google.javascript.rhino.jstype.FunctionType) (arg.getJSType())).getTypeOfThis(), param.getJSType()));
					}
				} 
				return actions;
			}
			return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList();
		}

		private java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> getImplicitActionsFromArgument(com.google.javascript.rhino.Node arg, com.google.javascript.rhino.jstype.ObjectType thisType, com.google.javascript.rhino.jstype.JSType paramType) {
			if (paramType instanceof com.google.javascript.rhino.jstype.UnionType) {
				java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions = com.google.common.collect.Lists.newArrayList();
				for (com.google.javascript.rhino.jstype.JSType paramAlt : ((com.google.javascript.rhino.jstype.UnionType) (paramType)).getAlternates()) {
					actions.addAll(getImplicitActionsFromArgument(arg, thisType, paramAlt));
				}
				return actions;
			}else
				if (paramType instanceof com.google.javascript.rhino.jstype.FunctionType) {
					return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList(createExternFunctionCall(arg, thisType, ((com.google.javascript.rhino.jstype.FunctionType) (paramType))));
				}else {
					return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList(createExternFunctionCall(arg, thisType, null));
				}
			
		}

		private java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> getImplicitActionsFromProp(com.google.javascript.rhino.jstype.JSType jsType, java.lang.String prop, com.google.javascript.rhino.Node fnNode) {
			java.util.List<com.google.javascript.jscomp.TightenTypes.Action> actions = com.google.common.collect.Lists.newArrayList();
			if (jsType instanceof com.google.javascript.rhino.jstype.UnionType) {
				boolean found = false;
				for (com.google.javascript.rhino.jstype.JSType alt : ((com.google.javascript.rhino.jstype.UnionType) (jsType)).getAlternates()) {
					com.google.javascript.rhino.jstype.ObjectType altObj = com.google.javascript.rhino.jstype.ObjectType.cast(alt);
					if (altObj != null) {
						actions.addAll(getImplicitActionsFromPropNonUnion(altObj, prop, fnNode));
						if (altObj.hasProperty(prop)) {
							found = true;
						}
					}
				}
				if (found) {
					return actions;
				}
			}else {
				com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(jsType);
				if (((objType != null) && (!(objType.isUnknownType()))) && (objType.hasProperty(prop))) {
					return getImplicitActionsFromPropNonUnion(objType, prop, fnNode);
				}
			}
			for (com.google.javascript.rhino.jstype.ObjectType type : getTypeRegistry().getEachReferenceTypeWithProperty(prop)) {
				actions.addAll(getImplicitActionsFromPropNonUnion(type, prop, fnNode));
			}
			return actions;
		}

		private java.util.Collection<com.google.javascript.jscomp.TightenTypes.Action> getImplicitActionsFromPropNonUnion(com.google.javascript.rhino.jstype.ObjectType jsType, java.lang.String prop, com.google.javascript.rhino.Node fnNode) {
			com.google.javascript.rhino.jstype.JSType propType = jsType.getPropertyType(prop).restrictByNotNullOrUndefined();
			if ((jsType.isPropertyInExterns(prop)) && (propType.isFunctionType())) {
				com.google.javascript.rhino.jstype.ObjectType thisType = jsType;
				if (jsType instanceof com.google.javascript.rhino.jstype.FunctionPrototypeType) {
					thisType = ((com.google.javascript.rhino.jstype.FunctionPrototypeType) (jsType)).getOwnerFunction().getInstanceType();
				}
				com.google.javascript.rhino.jstype.FunctionType callType = null;
				if (propType instanceof com.google.javascript.rhino.jstype.FunctionType) {
					callType = ((com.google.javascript.rhino.jstype.FunctionType) (propType));
				}
				com.google.javascript.jscomp.TightenTypes.Action action = createExternFunctionCall(fnNode, thisType, callType);
				return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList(action);
			}
			return com.google.common.collect.Lists.<com.google.javascript.jscomp.TightenTypes.Action>newArrayList();
		}
	}

	private com.google.javascript.jscomp.ConcreteType createType(com.google.javascript.rhino.Node name, com.google.javascript.jscomp.TightenTypes.ConcreteScope scope) {
		com.google.common.base.Preconditions.checkNotNull(name);
		com.google.common.base.Preconditions.checkArgument(((name.getType()) == (com.google.javascript.rhino.Token.NAME)));
		if ((name.getJSType()) == null) {
			return com.google.javascript.jscomp.ConcreteType.ALL;
		}
		if (((name.getFirstChild()) != null) && ((name.getFirstChild().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
			return createConcreteFunction(name.getFirstChild(), scope);
		}
		return createType(name.getJSType());
	}

	private com.google.javascript.jscomp.ConcreteType createType(com.google.javascript.rhino.jstype.JSType jsType) {
		if ((jsType.isUnknownType()) || (jsType.isEmptyType())) {
			return com.google.javascript.jscomp.ConcreteType.ALL;
		}
		if (jsType.isUnionType()) {
			com.google.javascript.jscomp.ConcreteType type = com.google.javascript.jscomp.ConcreteType.NONE;
			for (com.google.javascript.rhino.jstype.JSType alt : ((com.google.javascript.rhino.jstype.UnionType) (jsType)).getAlternates()) {
				type = type.unionWith(createType(alt));
			}
			return type;
		}
		if (jsType.isFunctionType()) {
			if ((getConcreteFunction(((com.google.javascript.rhino.jstype.FunctionType) (jsType)))) != null) {
				return getConcreteFunction(((com.google.javascript.rhino.jstype.FunctionType) (jsType)));
			}
			return com.google.javascript.jscomp.ConcreteType.ALL;
		}
		if (jsType.isObject()) {
			return createConcreteInstance(jsType.toObjectType());
		}
		return com.google.javascript.jscomp.ConcreteType.NONE;
	}

	private com.google.javascript.jscomp.ConcreteType createTypeWithSubTypes(com.google.javascript.rhino.jstype.JSType jsType) {
		com.google.javascript.jscomp.ConcreteType ret = com.google.javascript.jscomp.ConcreteType.NONE;
		if (jsType instanceof com.google.javascript.rhino.jstype.UnionType) {
			for (com.google.javascript.rhino.jstype.JSType alt : ((com.google.javascript.rhino.jstype.UnionType) (jsType)).getAlternates()) {
				ret = ret.unionWith(createTypeWithSubTypes(alt));
			}
		}else {
			com.google.javascript.rhino.jstype.ObjectType instType = com.google.javascript.rhino.jstype.ObjectType.cast(jsType);
			if (((instType != null) && ((instType.getConstructor()) != null)) && (instType.getConstructor().isInterface())) {
				java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> implementors = getTypeRegistry().getDirectImplementors(instType);
				for (com.google.javascript.rhino.jstype.FunctionType implementor : implementors) {
					ret = ret.unionWith(createTypeWithSubTypes(implementor.getInstanceType()));
				}
			}else {
				ret = ret.unionWith(createUnionWithSubTypes(createType(jsType)));
			}
		}
		return ret;
	}

	com.google.javascript.jscomp.ConcreteType inferConcreteType(com.google.javascript.jscomp.TightenTypes.ConcreteScope scope, com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkNotNull(scope);
		com.google.common.base.Preconditions.checkNotNull(expr);
		com.google.javascript.jscomp.ConcreteType ret;
		switch (expr.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.jscomp.ConcreteType> slot = scope.getSlot(expr.getString());
				if (slot != null) {
					ret = slot.getType();
				}else {
					ret = com.google.javascript.jscomp.ConcreteType.ALL;
				}
				break;
			case com.google.javascript.rhino.Token.THIS :
				ret = scope.getTypeOfThis();
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				ret = inferConcreteType(scope, expr.getLastChild());
				break;
			case com.google.javascript.rhino.Token.COMMA :
				ret = inferConcreteType(scope, expr.getLastChild());
				break;
			case com.google.javascript.rhino.Token.AND :
				ret = inferConcreteType(scope, expr.getLastChild());
				break;
			case com.google.javascript.rhino.Token.OR :
				ret = inferConcreteType(scope, expr.getFirstChild()).unionWith(inferConcreteType(scope, expr.getLastChild()));
				break;
			case com.google.javascript.rhino.Token.HOOK :
				ret = inferConcreteType(scope, expr.getFirstChild().getNext()).unionWith(inferConcreteType(scope, expr.getLastChild()));
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				com.google.javascript.jscomp.ConcreteType recvType = inferConcreteType(scope, expr.getFirstChild());
				if (recvType.isAll()) {
					ret = recvType;
					break;
				}
				com.google.javascript.rhino.Node prop = expr.getLastChild();
				java.lang.String propName = prop.getString();
				com.google.javascript.jscomp.ConcreteType type = recvType.getPropertyType(propName);
				if ("prototype".equals(propName)) {
					for (com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType funType : recvType.getFunctions()) {
						type = type.unionWith(funType.getPrototypeType());
					}
				}else
					if (compiler.getCodingConvention().isSuperClassReference(propName)) {
						for (com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType superType : recvType.getSuperclassTypes()) {
							type = type.unionWith(superType.getPrototypeType());
						}
					}else
						if ("call".equals(propName)) {
							type = recvType;
						}
					
				
				ret = type;
				break;
			case com.google.javascript.rhino.Token.GETELEM :
				ret = com.google.javascript.jscomp.ConcreteType.ALL;
				break;
			case com.google.javascript.rhino.Token.CALL :
				com.google.javascript.jscomp.ConcreteType targetType = inferConcreteType(scope, expr.getFirstChild());
				if (targetType.isAll()) {
					ret = targetType;
					break;
				}
				ret = com.google.javascript.jscomp.ConcreteType.NONE;
				for (com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType funType : targetType.getFunctions()) {
					ret = ret.unionWith(funType.getReturnSlot().getType());
				}
				break;
			case com.google.javascript.rhino.Token.NEW :
				com.google.javascript.jscomp.ConcreteType constructorType = inferConcreteType(scope, expr.getFirstChild());
				if (constructorType.isAll()) {
					throw new java.lang.AssertionError("Attempted new call on all type!");
				}
				ret = com.google.javascript.jscomp.ConcreteType.NONE;
				for (com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instType : constructorType.getFunctionInstanceTypes()) {
					ret = ret.unionWith(instType);
				}
				allInstantiatedTypes.add(ret);
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				ret = createConcreteFunction(expr, scope);
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				if (((expr.getJSType()) != null) && (!(expr.getJSType().isUnknownType()))) {
					com.google.javascript.rhino.jstype.JSType exprType = expr.getJSType().restrictByNotNullOrUndefined();
					com.google.javascript.jscomp.ConcreteType inst = createConcreteInstance(exprType.toObjectType());
					allInstantiatedTypes.add(inst);
					ret = inst;
				}else {
					ret = com.google.javascript.jscomp.ConcreteType.ALL;
				}
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				com.google.javascript.rhino.jstype.ObjectType arrayType = ((com.google.javascript.rhino.jstype.ObjectType) (getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE)));
				com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType inst = createConcreteInstance(arrayType);
				allInstantiatedTypes.add(inst);
				ret = inst;
				break;
			default :
				ret = com.google.javascript.jscomp.ConcreteType.NONE;
		}
		return createTypeIntersection(ret, expr.getJSType());
	}

	private com.google.javascript.jscomp.ConcreteType createTypeIntersection(com.google.javascript.jscomp.ConcreteType concreteType, com.google.javascript.rhino.jstype.JSType jsType) {
		com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair key = new com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair(concreteType, jsType);
		com.google.javascript.jscomp.ConcreteType ret = typeIntersectionMemos.get(key);
		if (ret != null) {
			return ret;
		}
		if (((jsType == null) || (jsType.isUnknownType())) || (concreteType.isNone())) {
			ret = concreteType;
		}else
			if ((concreteType.isUnion()) || (concreteType.isSingleton())) {
				ret = concreteType.intersectWith(createTypeWithSubTypes(jsType));
			}else {
				com.google.common.base.Preconditions.checkState(concreteType.isAll());
				ret = createTypeWithSubTypes(jsType);
			}
		
		ret = ret.intersectWith(com.google.javascript.jscomp.ConcreteType.createForTypes(allInstantiatedTypes));
		for (com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType functionType : concreteType.getFunctions()) {
			ret = ret.unionWith(functionType);
		}
		for (com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType prototype : concreteType.getPrototypeTypes()) {
			ret = ret.unionWith(prototype);
		}
		for (com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instance : concreteType.getInstances()) {
			if ((!(instance.instanceType.isInstanceType())) && (!(instance.isFunctionPrototype()))) {
				ret = ret.unionWith(instance);
			}
		}
		typeIntersectionMemos.put(key, ret);
		return ret;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType createConcreteFunction(com.google.javascript.rhino.Node decl, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parent) {
		com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType funType = functionFromDeclaration.get(decl);
		if (funType == null) {
			functionFromDeclaration.put(decl, (funType = new com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType(com.google.javascript.jscomp.TightenTypes.this, decl, parent)));
			if ((decl.getJSType()) != null) {
				functionFromJSType.put(((com.google.javascript.rhino.jstype.FunctionType) (decl.getJSType())), funType);
			}
		}
		return funType;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType createConcreteInstance(com.google.javascript.rhino.jstype.ObjectType instanceType) {
		com.google.common.base.Preconditions.checkArgument(((!(instanceType.isFunctionType())) || (instanceType == (getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE)))));
		com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType instType = instanceFromJSType.get(instanceType);
		if (instType == null) {
			instanceFromJSType.put(instanceType, (instType = new com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType(com.google.javascript.jscomp.TightenTypes.this, instanceType)));
		}
		return instType;
	}

	com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType getConcreteFunction(com.google.javascript.rhino.Node decl) {
		return functionFromDeclaration.get(decl);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType getConcreteFunction(com.google.javascript.rhino.jstype.FunctionType functionType) {
		return functionFromJSType.get(functionType);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType getConcreteInstance(com.google.javascript.rhino.jstype.ObjectType instanceType) {
		return instanceFromJSType.get(instanceType);
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> createFunctionScope(com.google.javascript.rhino.Node decl, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> parent) {
		com.google.javascript.jscomp.TightenTypes.ConcreteScope scope = new com.google.javascript.jscomp.TightenTypes.ConcreteScope(((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (parent)));
		scope.declareSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.CALL_SLOT_NAME, decl);
		scope.declareSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.THIS_SLOT_NAME, decl);
		scope.declareSlot(com.google.javascript.jscomp.ConcreteType.ConcreteFunctionType.RETURN_SLOT_NAME, decl);
		for (com.google.javascript.rhino.Node n = decl.getFirstChild().getNext().getFirstChild(); n != null; n = n.getNext()) {
			scope.declareSlot(n.getString(), n);
		}
		scope.initForScopeRoot(decl.getLastChild());
		return scope;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.jscomp.ConcreteType> createInstanceScope(com.google.javascript.rhino.jstype.ObjectType instanceType) {
		com.google.javascript.jscomp.TightenTypes.ConcreteScope parentScope = null;
		com.google.javascript.rhino.jstype.ObjectType implicitProto = instanceType.getImplicitPrototype();
		if ((implicitProto != null) && (!(implicitProto.isUnknownType()))) {
			com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType prototype = createConcreteInstance(implicitProto);
			parentScope = ((com.google.javascript.jscomp.TightenTypes.ConcreteScope) (prototype.getScope()));
		}
		com.google.javascript.jscomp.TightenTypes.ConcreteScope scope = new com.google.javascript.jscomp.TightenTypes.ConcreteScope(parentScope);
		for (java.lang.String propName : instanceType.getOwnPropertyNames()) {
			scope.declareSlot(propName, null);
		}
		return scope;
	}

	com.google.javascript.jscomp.ConcreteType createUnionWithSubTypes(com.google.javascript.jscomp.ConcreteType type) {
		java.util.Set<com.google.javascript.jscomp.ConcreteType> set = null;
		if (type.isInstance()) {
			set = getSubTypes(type.toInstance());
		}
		return com.google.javascript.jscomp.ConcreteType.createForTypes(set).unionWith(type);
	}

	private java.util.Set<com.google.javascript.jscomp.ConcreteType> getSubTypes(com.google.javascript.jscomp.ConcreteType.ConcreteInstanceType type) {
		if ((type.getConstructorType()) == null) {
			return null;
		}
		java.util.Set<com.google.javascript.jscomp.ConcreteType> set = com.google.common.collect.Sets.newHashSet();
		getSubTypes(type.getConstructorType().getJSType(), set);
		return set;
	}

	private boolean getSubTypes(com.google.javascript.rhino.jstype.FunctionType type, java.util.Set<com.google.javascript.jscomp.ConcreteType> set) {
		if ((type.getSubTypes()) != null) {
			for (com.google.javascript.rhino.jstype.FunctionType sub : type.getSubTypes()) {
				com.google.javascript.jscomp.ConcreteType concrete = createType(sub);
				if ((concrete.isFunction()) && ((concrete.toFunction().getInstanceType()) != null)) {
					concrete = concrete.toFunction().getInstanceType();
					if (!(set.contains(concrete))) {
						set.add(concrete);
						if (!(getSubTypes(sub, set))) {
							return false;
						}
					}
				}else {
					set.clear();
					set.add(com.google.javascript.jscomp.ConcreteType.ALL);
					return false;
				}
			}
		}
		return true;
	}

	static class ConcreteJSTypePair {
		final com.google.javascript.jscomp.ConcreteType concrete;

		final com.google.javascript.rhino.jstype.JSType jstype;

		final int hashcode;

		ConcreteJSTypePair(com.google.javascript.jscomp.ConcreteType concrete, com.google.javascript.rhino.jstype.JSType jstype) {
			this.concrete = concrete;
			this.jstype = jstype;
			this.hashcode = (concrete.hashCode()) + (getJSTypeHashCode());
		}

		private int getJSTypeHashCode() {
			return (jstype) != null ? jstype.hashCode() : 0;
		}

		private boolean equalsJSType(com.google.javascript.rhino.jstype.JSType jsType) {
			if ((jsType == null) || ((jstype) == null)) {
				return (jstype) == jsType;
			}else {
				return jsType.equals(com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.this.jstype);
			}
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			if (o instanceof com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair) {
				com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair pair = ((com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair) (o));
				if ((pair.concrete.equals(com.google.javascript.jscomp.TightenTypes.ConcreteJSTypePair.this.concrete)) && (equalsJSType(pair.jstype))) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			return hashcode;
		}
	}
}

