

package com.google.javascript.jscomp;


class TypeInference extends com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis<com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope> {
	static final com.google.javascript.jscomp.DiagnosticType TEMPLATE_TYPE_NOT_OBJECT_TYPE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TEMPLATE_TYPE_NOT_OBJECT_TYPE", "The template type must be an object type.\nActual: {0}");

	static final com.google.javascript.jscomp.DiagnosticType TEMPLATE_TYPE_OF_THIS_EXPECTED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_TEMPLATE_TYPE_OF_THIS_EXPECTED", ("A function type with the template type as the type of this must be a " + "parameter type"));

	static final com.google.javascript.jscomp.DiagnosticType FUNCTION_LITERAL_UNDEFINED_THIS = com.google.javascript.jscomp.DiagnosticType.warning("JSC_FUNCTION_LITERAL_UNDEFINED_THIS", "Function literal argument refers to undefined this argument");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseInterpreter;

	private final com.google.javascript.jscomp.Scope syntacticScope;

	private final com.google.javascript.jscomp.type.FlowScope functionScope;

	private final com.google.javascript.jscomp.type.FlowScope bottomScope;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionsMap;

	TypeInference(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseInterpreter, com.google.javascript.jscomp.Scope functionScope, java.util.Map<java.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionsMap) {
		super(cfg, new com.google.javascript.jscomp.LinkedFlowScope.FlowScopeJoinOp());
		this.compiler = compiler;
		this.registry = compiler.getTypeRegistry();
		this.reverseInterpreter = reverseInterpreter;
		this.syntacticScope = functionScope;
		this.functionScope = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(functionScope);
		this.assertionFunctionsMap = assertionFunctionsMap;
		java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varIt = functionScope.getDeclarativelyUnboundVarsWithoutTypes();
		while (varIt.hasNext()) {
			com.google.javascript.jscomp.Scope.Var var = varIt.next();
			if (isUnflowable(var)) {
				continue;
			}
			com.google.javascript.jscomp.TypeInference.this.functionScope.inferSlotType(var.getName(), getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		} 
		this.bottomScope = com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(new com.google.javascript.jscomp.Scope(functionScope.getRootNode(), functionScope.getTypeOfThis()));
	}

	@java.lang.Override
	com.google.javascript.jscomp.type.FlowScope createInitialEstimateLattice() {
		return bottomScope;
	}

	@java.lang.Override
	com.google.javascript.jscomp.type.FlowScope createEntryLattice() {
		return functionScope;
	}

	@java.lang.Override
	com.google.javascript.jscomp.type.FlowScope flowThrough(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope input) {
		if (input == (bottomScope)) {
			return input;
		}
		com.google.javascript.jscomp.type.FlowScope output = input.createChildFlowScope();
		output = traverse(n, output);
		return output;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings(value = "fallthrough")
	java.util.List<com.google.javascript.jscomp.type.FlowScope> branchedFlowThrough(com.google.javascript.rhino.Node source, com.google.javascript.jscomp.type.FlowScope input) {
		com.google.javascript.jscomp.type.FlowScope output = flowThrough(source, input);
		com.google.javascript.rhino.Node condition = null;
		com.google.javascript.jscomp.type.FlowScope conditionFlowScope = null;
		com.google.javascript.jscomp.TypeInference.BooleanOutcomePair conditionOutcomes = null;
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> branchEdges = getCfg().getOutEdges(source);
		java.util.List<com.google.javascript.jscomp.type.FlowScope> result = com.google.common.collect.Lists.newArrayListWithCapacity(branchEdges.size());
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> branchEdge : branchEdges) {
			com.google.javascript.jscomp.ControlFlowGraph.Branch branch = branchEdge.getValue();
			com.google.javascript.jscomp.type.FlowScope newScope = output;
			switch (branch) {
				case ON_TRUE :
					if (com.google.javascript.jscomp.NodeUtil.isForIn(source)) {
						com.google.javascript.rhino.Node item = source.getFirstChild();
						com.google.javascript.rhino.Node obj = item.getNext();
						com.google.javascript.jscomp.type.FlowScope informed = traverse(obj, output.createChildFlowScope());
						if (item.isVar()) {
							item = item.getFirstChild();
						}
						if (item.isName()) {
							com.google.javascript.rhino.jstype.JSType iterKeyType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
							com.google.javascript.rhino.jstype.ObjectType objType = getJSType(obj).dereference();
							com.google.javascript.rhino.jstype.JSType objIndexType = objType == null ? null : objType.getIndexType();
							if ((objIndexType != null) && (!(objIndexType.isUnknownType()))) {
								com.google.javascript.rhino.jstype.JSType narrowedKeyType = iterKeyType.getGreatestSubtype(objIndexType);
								if (!(narrowedKeyType.isEmptyType())) {
									iterKeyType = narrowedKeyType;
								}
							}
							redeclareSimpleVar(informed, item, iterKeyType);
						}
						newScope = informed;
						break;
					}
				case ON_FALSE :
					if (condition == null) {
						condition = com.google.javascript.jscomp.NodeUtil.getConditionExpression(source);
						if ((condition == null) && (source.isCase())) {
							condition = source;
							if (conditionFlowScope == null) {
								conditionFlowScope = traverse(condition.getFirstChild(), output.createChildFlowScope());
							}
						}
					}
					if (condition != null) {
						if ((condition.isAnd()) || (condition.isOr())) {
							if (conditionOutcomes == null) {
								conditionOutcomes = (condition.isAnd()) ? traverseAnd(condition, output.createChildFlowScope()) : traverseOr(condition, output.createChildFlowScope());
							}
							newScope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(condition, conditionOutcomes.getOutcomeFlowScope(condition.getType(), (branch == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE))), (branch == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE)));
						}else {
							if (conditionFlowScope == null) {
								conditionFlowScope = traverse(condition, output.createChildFlowScope());
							}
							newScope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(condition, conditionFlowScope, (branch == (com.google.javascript.jscomp.ControlFlowGraph.Branch.ON_TRUE)));
						}
					}
					break;
			}
			result.add(newScope.optimize());
		}
		return result;
	}

	private com.google.javascript.jscomp.type.FlowScope traverse(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
				scope = traverseAssign(n, scope);
				break;
			case com.google.javascript.rhino.Token.NAME :
				scope = traverseName(n, scope);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				scope = traverseGetProp(n, scope);
				break;
			case com.google.javascript.rhino.Token.AND :
				scope = traverseAnd(n, scope).getJoinedFlowScope().createChildFlowScope();
				break;
			case com.google.javascript.rhino.Token.OR :
				scope = traverseOr(n, scope).getJoinedFlowScope().createChildFlowScope();
				break;
			case com.google.javascript.rhino.Token.HOOK :
				scope = traverseHook(n, scope);
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				scope = traverseObjectLiteral(n, scope);
				break;
			case com.google.javascript.rhino.Token.CALL :
				scope = traverseCall(n, scope);
				break;
			case com.google.javascript.rhino.Token.NEW :
				scope = traverseNew(n, scope);
				break;
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ADD :
				scope = traverseAdd(n, scope);
				break;
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
				scope = traverse(n.getFirstChild(), scope);
				n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				scope = traverseArrayLiteral(n, scope);
				break;
			case com.google.javascript.rhino.Token.THIS :
				n.setJSType(scope.getTypeOfThis());
				break;
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.BITNOT :
				scope = traverseChildren(n, scope);
				n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
				break;
			case com.google.javascript.rhino.Token.PARAM_LIST :
				scope = traverse(n.getFirstChild(), scope);
				n.setJSType(getJSType(n.getFirstChild()));
				break;
			case com.google.javascript.rhino.Token.COMMA :
				scope = traverseChildren(n, scope);
				n.setJSType(getJSType(n.getLastChild()));
				break;
			case com.google.javascript.rhino.Token.TYPEOF :
				scope = traverseChildren(n, scope);
				n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
				break;
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.IN :
				scope = traverseChildren(n, scope);
				n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE));
				break;
			case com.google.javascript.rhino.Token.GETELEM :
				scope = traverseGetElem(n, scope);
				break;
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				scope = traverseChildren(n, scope);
				if (n.getFirstChild().isGetProp()) {
					ensurePropertyDeclared(n.getFirstChild());
				}
				break;
			case com.google.javascript.rhino.Token.SWITCH :
				scope = traverse(n.getFirstChild(), scope);
				break;
			case com.google.javascript.rhino.Token.RETURN :
				scope = traverseReturn(n, scope);
				break;
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.THROW :
				scope = traverseChildren(n, scope);
				break;
			case com.google.javascript.rhino.Token.CATCH :
				scope = traverseCatch(n, scope);
				break;
		}
		if (!(n.isFunction())) {
			com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
			if ((info != null) && (info.hasType())) {
				com.google.javascript.rhino.jstype.JSType castType = info.getType().evaluate(syntacticScope, registry);
				if ((n.isQualifiedName()) && (n.getParent().isExprResult())) {
					updateScopeForTypeChange(scope, n, n.getJSType(), castType);
				}
				n.setJSType(castType);
			}
		}
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseReturn(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		scope = traverseChildren(n, scope);
		com.google.javascript.rhino.Node retValue = n.getFirstChild();
		if (retValue != null) {
			com.google.javascript.rhino.jstype.JSType type = functionScope.getRootNode().getJSType();
			if (type != null) {
				com.google.javascript.rhino.jstype.FunctionType fnType = type.toMaybeFunctionType();
				if (fnType != null) {
					inferPropertyTypesToMatchConstraint(retValue.getJSType(), fnType.getReturnType());
				}
			}
		}
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseCatch(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node name = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		name.setJSType(type);
		redeclareSimpleVar(scope, name, type);
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseAssign(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = n.getLastChild();
		scope = traverseChildren(n, scope);
		com.google.javascript.rhino.jstype.JSType leftType = left.getJSType();
		com.google.javascript.rhino.jstype.JSType rightType = getJSType(right);
		n.setJSType(rightType);
		updateScopeForTypeChange(scope, left, leftType, rightType);
		return scope;
	}

	private void updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope scope, com.google.javascript.rhino.Node left, com.google.javascript.rhino.jstype.JSType leftType, com.google.javascript.rhino.jstype.JSType resultType) {
		com.google.common.base.Preconditions.checkNotNull(resultType);
		switch (left.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String varName = left.getString();
				com.google.javascript.jscomp.Scope.Var var = syntacticScope.getVar(varName);
				boolean isVarDeclaration = left.hasChildren();
				if (((!isVarDeclaration) || (var == null)) || (var.isTypeInferred())) {
					redeclareSimpleVar(scope, left, resultType);
				}
				left.setJSType((isVarDeclaration || (leftType == null) ? resultType : null));
				if ((var != null) && (var.isTypeInferred())) {
					com.google.javascript.rhino.jstype.JSType oldType = var.getType();
					var.setType((oldType == null ? resultType : oldType.getLeastSupertype(resultType)));
				}
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				java.lang.String qualifiedName = left.getQualifiedName();
				if (qualifiedName != null) {
					scope.inferQualifiedSlot(left, qualifiedName, (leftType == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : leftType), resultType);
				}
				left.setJSType(resultType);
				ensurePropertyDefined(left, resultType);
				break;
		}
	}

	private void ensurePropertyDefined(com.google.javascript.rhino.Node getprop, com.google.javascript.rhino.jstype.JSType rightType) {
		java.lang.String propName = getprop.getLastChild().getString();
		com.google.javascript.rhino.jstype.JSType nodeType = getJSType(getprop.getFirstChild());
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(nodeType.restrictByNotNullOrUndefined());
		if (objectType == null) {
			registry.registerPropertyOnType(propName, nodeType);
		}else {
			if (ensurePropertyDeclaredHelper(getprop, objectType)) {
				return ;
			}
			if (!(objectType.isPropertyTypeDeclared(propName))) {
				if ((objectType.hasProperty(propName)) || (!(objectType.isInstanceType()))) {
					if ("prototype".equals(propName)) {
						objectType.defineDeclaredProperty(propName, rightType, getprop);
					}else {
						objectType.defineInferredProperty(propName, rightType, getprop);
					}
				}else {
					if ((getprop.getFirstChild().isThis()) && (getJSType(syntacticScope.getRootNode()).isConstructor())) {
						objectType.defineInferredProperty(propName, rightType, getprop);
					}else {
						registry.registerPropertyOnType(propName, objectType);
					}
				}
			}
		}
	}

	private void ensurePropertyDeclared(com.google.javascript.rhino.Node getprop) {
		com.google.javascript.rhino.jstype.ObjectType ownerType = com.google.javascript.rhino.jstype.ObjectType.cast(getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined());
		if (ownerType != null) {
			ensurePropertyDeclaredHelper(getprop, ownerType);
		}
	}

	private boolean ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node getprop, com.google.javascript.rhino.jstype.ObjectType objectType) {
		java.lang.String propName = getprop.getLastChild().getString();
		java.lang.String qName = getprop.getQualifiedName();
		if (qName != null) {
			com.google.javascript.jscomp.Scope.Var var = syntacticScope.getVar(qName);
			if ((var != null) && (!(var.isTypeInferred()))) {
				if ((propName.equals("prototype")) || ((!(objectType.hasOwnProperty(propName))) && ((!(objectType.isInstanceType())) || ((var.isExtern()) && (!(objectType.isNativeObjectType())))))) {
					return objectType.defineDeclaredProperty(propName, var.getType(), getprop);
				}
			}
		}
		return false;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseName(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		java.lang.String varName = n.getString();
		com.google.javascript.rhino.Node value = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (value != null) {
			scope = traverse(value, scope);
			updateScopeForTypeChange(scope, n, n.getJSType(), getJSType(value));
			return scope;
		}else {
			com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> var = scope.getSlot(varName);
			if (var != null) {
				boolean isInferred = var.isTypeInferred();
				boolean unflowable = isInferred && (isUnflowable(syntacticScope.getVar(varName)));
				boolean nonLocalInferredSlot = (isInferred && ((syntacticScope.getParent()) != null)) && (var == (syntacticScope.getParent().getSlot(varName)));
				if ((!unflowable) && (!nonLocalInferredSlot)) {
					type = var.getType();
					if (type == null) {
						type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}
				}
			}
		}
		n.setJSType(type);
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseArrayLiteral(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		scope = traverseChildren(n, scope);
		n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE));
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseObjectLiteral(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		com.google.common.base.Preconditions.checkNotNull(type);
		for (com.google.javascript.rhino.Node name = n.getFirstChild(); name != null; name = name.getNext()) {
			scope = traverse(name.getFirstChild(), scope);
		}
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		if (objectType == null) {
			return scope;
		}
		boolean hasLendsName = ((n.getJSDocInfo()) != null) && ((n.getJSDocInfo().getLendsName()) != null);
		if ((objectType.hasReferenceName()) && (!hasLendsName)) {
			return scope;
		}
		java.lang.String qObjName = com.google.javascript.jscomp.NodeUtil.getBestLValueName(com.google.javascript.jscomp.NodeUtil.getBestLValue(n));
		for (com.google.javascript.rhino.Node name = n.getFirstChild(); name != null; name = name.getNext()) {
			com.google.javascript.rhino.Node value = name.getFirstChild();
			java.lang.String memberName = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(name);
			if (memberName != null) {
				com.google.javascript.rhino.jstype.JSType rawValueType = name.getFirstChild().getJSType();
				com.google.javascript.rhino.jstype.JSType valueType = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(name, rawValueType);
				if (valueType == null) {
					valueType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}
				objectType.defineInferredProperty(memberName, valueType, name);
				if ((qObjName != null) && (name.isString())) {
					java.lang.String qKeyName = (qObjName + ".") + memberName;
					com.google.javascript.jscomp.Scope.Var var = syntacticScope.getVar(qKeyName);
					com.google.javascript.rhino.jstype.JSType oldType = var == null ? null : var.getType();
					if ((var != null) && (var.isTypeInferred())) {
						var.setType((oldType == null ? valueType : oldType.getLeastSupertype(oldType)));
					}
					scope.inferQualifiedSlot(name, qKeyName, (oldType == null ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : oldType), valueType);
				}
			}else {
				n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
			}
		}
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseAdd(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = left.getNext();
		scope = traverseChildren(n, scope);
		com.google.javascript.rhino.jstype.JSType leftType = left.getJSType();
		com.google.javascript.rhino.jstype.JSType rightType = right.getJSType();
		com.google.javascript.rhino.jstype.JSType type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		if ((leftType != null) && (rightType != null)) {
			boolean leftIsUnknown = leftType.isUnknownType();
			boolean rightIsUnknown = rightType.isUnknownType();
			if (leftIsUnknown && rightIsUnknown) {
				type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}else
				if (((!leftIsUnknown) && (leftType.isString())) || ((!rightIsUnknown) && (rightType.isString()))) {
					type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
				}else
					if (leftIsUnknown || rightIsUnknown) {
						type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
					}else
						if ((isAddedAsNumber(leftType)) && (isAddedAsNumber(rightType))) {
							type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
						}else {
							type = registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
						}
					
				
			
		}
		n.setJSType(type);
		if (n.isAssignAdd()) {
			updateScopeForTypeChange(scope, left, leftType, type);
		}
		return scope;
	}

	private boolean isAddedAsNumber(com.google.javascript.rhino.jstype.JSType type) {
		return type.isSubtype(registry.createUnionType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE, com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE));
	}

	private com.google.javascript.jscomp.type.FlowScope traverseHook(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node condition = n.getFirstChild();
		com.google.javascript.rhino.Node trueNode = condition.getNext();
		com.google.javascript.rhino.Node falseNode = n.getLastChild();
		scope = traverse(condition, scope);
		com.google.javascript.jscomp.type.FlowScope trueScope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, true);
		com.google.javascript.jscomp.type.FlowScope falseScope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(condition, scope, false);
		traverse(trueNode, trueScope.createChildFlowScope());
		traverse(falseNode, falseScope.createChildFlowScope());
		com.google.javascript.rhino.jstype.JSType trueType = trueNode.getJSType();
		com.google.javascript.rhino.jstype.JSType falseType = falseNode.getJSType();
		if ((trueType != null) && (falseType != null)) {
			n.setJSType(trueType.getLeastSupertype(falseType));
		}else {
			n.setJSType(null);
		}
		return scope.createChildFlowScope();
	}

	private com.google.javascript.jscomp.type.FlowScope traverseCall(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		scope = traverseChildren(n, scope);
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.jstype.JSType functionType = getJSType(left).restrictByNotNullOrUndefined();
		if (functionType != null) {
			if (functionType.isFunctionType()) {
				com.google.javascript.rhino.jstype.FunctionType fnType = functionType.toMaybeFunctionType();
				n.setJSType(fnType.getReturnType());
				backwardsInferenceFromCallSite(n, fnType);
			}else
				if (functionType.equals(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE))) {
					n.setJSType(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE));
				}
			
		}
		scope = tightenTypesAfterAssertions(scope, n);
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope scope, com.google.javascript.rhino.Node callNode) {
		com.google.javascript.rhino.Node left = callNode.getFirstChild();
		com.google.javascript.rhino.Node firstParam = left.getNext();
		com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec = assertionFunctionsMap.get(left.getQualifiedName());
		if ((assertionFunctionSpec == null) || (firstParam == null)) {
			return scope;
		}
		com.google.javascript.rhino.Node assertedNode = assertionFunctionSpec.getAssertedParam(firstParam);
		if (assertedNode == null) {
			return scope;
		}
		com.google.javascript.rhino.jstype.JSTypeNative assertedType = assertionFunctionSpec.getAssertedType();
		java.lang.String assertedNodeName = assertedNode.getQualifiedName();
		if (assertedType == null) {
			if (assertedNodeName != null) {
				com.google.javascript.rhino.jstype.JSType type = getJSType(assertedNode);
				com.google.javascript.rhino.jstype.JSType narrowed = type.restrictByNotNullOrUndefined();
				if (type != narrowed) {
					scope = narrowScope(scope, assertedNode, narrowed);
					callNode.setJSType(narrowed);
				}
			}else
				if ((assertedNode.isAnd()) || (assertedNode.isOr())) {
					com.google.javascript.jscomp.TypeInference.BooleanOutcomePair conditionOutcomes = traverseWithinShortCircuitingBinOp(assertedNode, scope);
					scope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(assertedNode, conditionOutcomes.getOutcomeFlowScope(assertedNode.getType(), true), true);
				}
			
		}else
			if (assertedNodeName != null) {
				com.google.javascript.rhino.jstype.JSType type = getJSType(assertedNode);
				com.google.javascript.rhino.jstype.JSType narrowed = type.getGreatestSubtype(getNativeType(assertedType));
				if (type != narrowed) {
					scope = narrowScope(scope, assertedNode, narrowed);
					callNode.setJSType(narrowed);
				}
			}
		
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope narrowScope(com.google.javascript.jscomp.type.FlowScope scope, com.google.javascript.rhino.Node node, com.google.javascript.rhino.jstype.JSType narrowed) {
		scope = scope.createChildFlowScope();
		if (node.isGetProp()) {
			scope.inferQualifiedSlot(node, node.getQualifiedName(), getJSType(node), narrowed);
		}else {
			redeclareSimpleVar(scope, node, narrowed);
		}
		return scope;
	}

	private void backwardsInferenceFromCallSite(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType fnType) {
		updateTypeOfParameters(n, fnType);
		updateTypeOfThisOnClosure(n, fnType);
		updateBind(n, fnType);
	}

	private void updateBind(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType fnType) {
		com.google.javascript.rhino.Node calledFn = n.getFirstChild();
		boolean looksLikeBind = (calledFn.isGetProp()) && (calledFn.getLastChild().getString().equals("bind"));
		if (!looksLikeBind) {
			return ;
		}
		com.google.javascript.rhino.Node callTarget = calledFn.getFirstChild();
		com.google.javascript.rhino.jstype.FunctionType callTargetFn = getJSType(callTarget).restrictByNotNullOrUndefined().toMaybeFunctionType();
		if (callTargetFn == null) {
			return ;
		}
		n.setJSType(callTargetFn.getBindReturnType(((n.getChildCount()) - 1)));
	}

	private void updateTypeOfParameters(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType fnType) {
		int i = 0;
		int childCount = n.getChildCount();
		for (com.google.javascript.rhino.Node iParameter : fnType.getParameters()) {
			if ((i + 1) >= childCount) {
				return ;
			}
			com.google.javascript.rhino.jstype.JSType iParameterType = getJSType(iParameter);
			com.google.javascript.rhino.Node iArgument = n.getChildAtIndex((i + 1));
			com.google.javascript.rhino.jstype.JSType iArgumentType = getJSType(iArgument);
			inferPropertyTypesToMatchConstraint(iArgumentType, iParameterType);
			if (iParameterType.isFunctionType()) {
				com.google.javascript.rhino.jstype.FunctionType iParameterFnType = iParameterType.toMaybeFunctionType();
				if (((iArgument.isFunction()) && (iArgumentType.isFunctionType())) && ((iArgument.getJSDocInfo()) == null)) {
					iArgument.setJSType(iParameterFnType);
				}
			}
			i++;
		}
	}

	private void updateTypeOfThisOnClosure(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.FunctionType fnType) {
		if ((fnType.getTemplateTypeName()) == null) {
			return ;
		}
		int i = 0;
		int childCount = n.getChildCount();
		for (com.google.javascript.rhino.Node iParameter : fnType.getParameters()) {
			com.google.javascript.rhino.jstype.JSType iParameterType = getJSType(iParameter).restrictByNotNullOrUndefined();
			if (iParameterType.isTemplateType()) {
				com.google.javascript.rhino.jstype.ObjectType iArgumentType = null;
				if ((i + 1) < childCount) {
					com.google.javascript.rhino.Node iArgument = n.getChildAtIndex((i + 1));
					iArgumentType = getJSType(iArgument).restrictByNotNullOrUndefined().collapseUnion().toObjectType();
					if (iArgumentType == null) {
						compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(iArgument), iArgument, com.google.javascript.jscomp.TypeInference.TEMPLATE_TYPE_NOT_OBJECT_TYPE, getJSType(iArgument).toString()));
						return ;
					}
				}
				boolean foundTemplateTypeOfThisParameter = false;
				int j = 0;
				for (com.google.javascript.rhino.Node jParameter : fnType.getParameters()) {
					com.google.javascript.rhino.jstype.JSType jParameterType = getJSType(jParameter).restrictByNotNullOrUndefined();
					if (jParameterType.isFunctionType()) {
						com.google.javascript.rhino.jstype.FunctionType jParameterFnType = jParameterType.toMaybeFunctionType();
						if (jParameterFnType.getTypeOfThis().equals(iParameterType)) {
							foundTemplateTypeOfThisParameter = true;
							if ((j + 1) >= childCount) {
								return ;
							}
							com.google.javascript.rhino.Node jArgument = n.getChildAtIndex((j + 1));
							com.google.javascript.rhino.jstype.JSType jArgumentType = getJSType(jArgument);
							if ((jArgument.isFunction()) && (jArgumentType.isFunctionType())) {
								if ((iArgumentType != null) && (!(iArgumentType.isNoType()))) {
									com.google.javascript.rhino.jstype.FunctionType jArgumentFnType = jArgumentType.toMaybeFunctionType();
									if (jArgumentFnType.getTypeOfThis().isUnknownType()) {
										jArgument.setJSType(registry.createFunctionTypeWithNewThisType(jArgumentFnType, iArgumentType));
									}
								}else {
									if (com.google.javascript.jscomp.NodeUtil.referencesThis(com.google.javascript.jscomp.NodeUtil.getFunctionBody(jArgument))) {
										compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(n), n, com.google.javascript.jscomp.TypeInference.FUNCTION_LITERAL_UNDEFINED_THIS));
									}
								}
							}
						}
					}
					j++;
				}
				if (!foundTemplateTypeOfThisParameter) {
					compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(n), n, com.google.javascript.jscomp.TypeInference.TEMPLATE_TYPE_OF_THIS_EXPECTED));
					return ;
				}
			}
			i++;
		}
	}

	private com.google.javascript.jscomp.type.FlowScope traverseNew(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node constructor = n.getFirstChild();
		scope = traverse(constructor, scope);
		com.google.javascript.rhino.jstype.JSType constructorType = constructor.getJSType();
		com.google.javascript.rhino.jstype.JSType type = null;
		if (constructorType != null) {
			constructorType = constructorType.restrictByNotNullOrUndefined();
			if (constructorType.isUnknownType()) {
				type = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}else {
				com.google.javascript.rhino.jstype.FunctionType ct = constructorType.toMaybeFunctionType();
				if ((ct == null) && (constructorType instanceof com.google.javascript.rhino.jstype.FunctionType)) {
					ct = ((com.google.javascript.rhino.jstype.FunctionType) (constructorType));
				}
				if ((ct != null) && (ct.isConstructor())) {
					type = ct.getInstanceType();
				}
			}
		}
		n.setJSType(type);
		for (com.google.javascript.rhino.Node arg = constructor.getNext(); arg != null; arg = arg.getNext()) {
			scope = traverse(arg, scope);
		}
		return scope;
	}

	private com.google.javascript.jscomp.TypeInference.BooleanOutcomePair traverseAnd(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		return traverseShortCircuitingBinOp(n, scope, true);
	}

	private com.google.javascript.jscomp.type.FlowScope traverseChildren(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		for (com.google.javascript.rhino.Node el = n.getFirstChild(); el != null; el = el.getNext()) {
			scope = traverse(el, scope);
		}
		return scope;
	}

	private com.google.javascript.jscomp.type.FlowScope traverseGetElem(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		scope = traverseChildren(n, scope);
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(getJSType(n.getFirstChild()).restrictByNotNullOrUndefined());
		if (objType != null) {
			com.google.javascript.rhino.jstype.JSType type = objType.getParameterType();
			if (type != null) {
				n.setJSType(type);
			}
		}
		return dereferencePointer(n.getFirstChild(), scope);
	}

	private com.google.javascript.jscomp.type.FlowScope traverseGetProp(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		com.google.javascript.rhino.Node objNode = n.getFirstChild();
		com.google.javascript.rhino.Node property = n.getLastChild();
		scope = traverseChildren(n, scope);
		n.setJSType(getPropertyType(objNode.getJSType(), property.getString(), n, scope));
		return dereferencePointer(n.getFirstChild(), scope);
	}

	private void inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.JSType constraint) {
		if ((type == null) || (constraint == null)) {
			return ;
		}
		com.google.javascript.rhino.jstype.ObjectType constraintObj = com.google.javascript.rhino.jstype.ObjectType.cast(constraint.restrictByNotNullOrUndefined());
		if (constraintObj != null) {
			type.matchConstraint(constraintObj);
		}
	}

	private com.google.javascript.jscomp.type.FlowScope dereferencePointer(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		if (n.isQualifiedName()) {
			com.google.javascript.rhino.jstype.JSType type = getJSType(n);
			com.google.javascript.rhino.jstype.JSType narrowed = type.restrictByNotNullOrUndefined();
			if (type != narrowed) {
				scope = narrowScope(scope, n, narrowed);
			}
		}
		return scope;
	}

	private com.google.javascript.rhino.jstype.JSType getPropertyType(com.google.javascript.rhino.jstype.JSType objType, java.lang.String propName, com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		java.lang.String qualifiedName = n.getQualifiedName();
		com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> var = scope.getSlot(qualifiedName);
		if (var != null) {
			com.google.javascript.rhino.jstype.JSType varType = var.getType();
			if (varType != null) {
				if ((varType.equals(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE))) && (var != (syntacticScope.getSlot(qualifiedName)))) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE);
				}else {
					return varType;
				}
			}
		}
		com.google.javascript.rhino.jstype.JSType propertyType = null;
		if (objType != null) {
			propertyType = objType.findPropertyType(propName);
		}
		if (((propertyType == null) || (propertyType.isUnknownType())) && (qualifiedName != null)) {
			com.google.javascript.rhino.jstype.ObjectType regType = com.google.javascript.rhino.jstype.ObjectType.cast(registry.getType(qualifiedName));
			if (regType != null) {
				propertyType = regType.getConstructor();
			}
		}
		return propertyType;
	}

	private com.google.javascript.jscomp.TypeInference.BooleanOutcomePair traverseOr(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		return traverseShortCircuitingBinOp(n, scope, false);
	}

	private com.google.javascript.jscomp.TypeInference.BooleanOutcomePair traverseShortCircuitingBinOp(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope, boolean condition) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node right = n.getLastChild();
		com.google.javascript.jscomp.TypeInference.BooleanOutcomePair leftLiterals = traverseWithinShortCircuitingBinOp(left, scope.createChildFlowScope());
		com.google.javascript.rhino.jstype.JSType leftType = left.getJSType();
		com.google.javascript.jscomp.type.FlowScope rightScope = reverseInterpreter.getPreciserScopeKnowingConditionOutcome(left, leftLiterals.getOutcomeFlowScope(left.getType(), condition), condition);
		com.google.javascript.jscomp.TypeInference.BooleanOutcomePair rightLiterals = traverseWithinShortCircuitingBinOp(right, rightScope.createChildFlowScope());
		com.google.javascript.rhino.jstype.JSType rightType = right.getJSType();
		com.google.javascript.rhino.jstype.JSType type;
		com.google.javascript.jscomp.TypeInference.BooleanOutcomePair literals;
		if ((leftType != null) && (rightType != null)) {
			leftType = leftType.getRestrictedTypeGivenToBooleanOutcome((!condition));
			if ((leftLiterals.toBooleanOutcomes) == (com.google.javascript.rhino.jstype.BooleanLiteralSet.get((!condition)))) {
				type = leftType;
				literals = leftLiterals;
			}else {
				type = leftType.getLeastSupertype(rightType);
				literals = getBooleanOutcomePair(leftLiterals, rightLiterals, condition);
			}
			if (((literals.booleanValues) == (com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY)) && (getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE).isSubtype(type))) {
				if (type.isUnionType()) {
					type = type.toMaybeUnionType().getRestrictedUnion(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE));
				}
			}
		}else {
			type = null;
			literals = new com.google.javascript.jscomp.TypeInference.BooleanOutcomePair(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH, com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH, leftLiterals.getJoinedFlowScope(), rightLiterals.getJoinedFlowScope());
		}
		n.setJSType(type);
		return literals;
	}

	private com.google.javascript.jscomp.TypeInference.BooleanOutcomePair traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.type.FlowScope scope) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.AND :
				return traverseAnd(n, scope);
			case com.google.javascript.rhino.Token.OR :
				return traverseOr(n, scope);
			default :
				scope = traverse(n, scope);
				return newBooleanOutcomePair(n.getJSType(), scope);
		}
	}

	com.google.javascript.jscomp.TypeInference.BooleanOutcomePair getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair left, com.google.javascript.jscomp.TypeInference.BooleanOutcomePair right, boolean condition) {
		return new com.google.javascript.jscomp.TypeInference.BooleanOutcomePair(com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition), com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(left.booleanValues, right.booleanValues, condition), left.getJoinedFlowScope(), right.getJoinedFlowScope());
	}

	static com.google.javascript.rhino.jstype.BooleanLiteralSet getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet left, com.google.javascript.rhino.jstype.BooleanLiteralSet right, boolean condition) {
		return right.union(left.intersection(com.google.javascript.rhino.jstype.BooleanLiteralSet.get((!condition))));
	}

	private final class BooleanOutcomePair {
		final com.google.javascript.rhino.jstype.BooleanLiteralSet toBooleanOutcomes;

		final com.google.javascript.rhino.jstype.BooleanLiteralSet booleanValues;

		final com.google.javascript.jscomp.type.FlowScope leftScope;

		final com.google.javascript.jscomp.type.FlowScope rightScope;

		com.google.javascript.jscomp.type.FlowScope joinedScope = null;

		BooleanOutcomePair(com.google.javascript.rhino.jstype.BooleanLiteralSet toBooleanOutcomes, com.google.javascript.rhino.jstype.BooleanLiteralSet booleanValues, com.google.javascript.jscomp.type.FlowScope leftScope, com.google.javascript.jscomp.type.FlowScope rightScope) {
			this.toBooleanOutcomes = toBooleanOutcomes;
			this.booleanValues = booleanValues;
			this.leftScope = leftScope;
			this.rightScope = rightScope;
		}

		com.google.javascript.jscomp.type.FlowScope getJoinedFlowScope() {
			if ((joinedScope) == null) {
				if ((leftScope) == (rightScope)) {
					joinedScope = rightScope;
				}else {
					joinedScope = join(leftScope, rightScope);
				}
			}
			return joinedScope;
		}

		com.google.javascript.jscomp.type.FlowScope getOutcomeFlowScope(int nodeType, boolean outcome) {
			if (((nodeType == (com.google.javascript.rhino.Token.AND)) && outcome) || ((nodeType == (com.google.javascript.rhino.Token.OR)) && (!outcome))) {
				return rightScope;
			}else {
				return getJoinedFlowScope();
			}
		}
	}

	private com.google.javascript.jscomp.TypeInference.BooleanOutcomePair newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType jsType, com.google.javascript.jscomp.type.FlowScope flowScope) {
		if (jsType == null) {
			return new com.google.javascript.jscomp.TypeInference.BooleanOutcomePair(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH, com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH, flowScope, flowScope);
		}
		return new com.google.javascript.jscomp.TypeInference.BooleanOutcomePair(jsType.getPossibleToBooleanOutcomes(), (registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE).isSubtype(jsType) ? com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH : com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY), flowScope, flowScope);
	}

	private void redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope scope, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.jstype.JSType varType) {
		com.google.common.base.Preconditions.checkState(nameNode.isName());
		java.lang.String varName = nameNode.getString();
		if (varType == null) {
			varType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}
		if (isUnflowable(syntacticScope.getVar(varName))) {
			return ;
		}
		scope.inferSlotType(varName, varType);
	}

	private boolean isUnflowable(com.google.javascript.jscomp.Scope.Var v) {
		return (((v != null) && (v.isLocal())) && (v.isMarkedEscaped())) && ((v.getScope()) == (syntacticScope));
	}

	private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType jsType = n.getJSType();
		if (jsType == null) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}else {
			return jsType;
		}
	}

	private com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return registry.getNativeType(typeId);
	}
}

