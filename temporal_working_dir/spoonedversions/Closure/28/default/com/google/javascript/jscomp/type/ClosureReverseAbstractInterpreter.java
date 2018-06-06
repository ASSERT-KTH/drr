

package com.google.javascript.jscomp.type;


public class ClosureReverseAbstractInterpreter extends com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter {
	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictToArrayVisitor = new com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor() {
		@java.lang.Override
		protected com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType topType) {
			return topType;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			com.google.javascript.rhino.jstype.JSType arrayType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
			return arrayType.isSubtype(type) ? arrayType : null;
		}
	};

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictToNotArrayVisitor = new com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type.isSubtype(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE)) ? null : type;
		}
	};

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictToObjectVisitor = new com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor() {
		@java.lang.Override
		protected com.google.javascript.rhino.jstype.JSType caseTopType(com.google.javascript.rhino.jstype.JSType topType) {
			return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return type;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return type;
		}
	};

	private final com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> restrictToNotObjectVisitor = new com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor() {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseObjectType(com.google.javascript.rhino.jstype.ObjectType type) {
			return null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.JSType caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type) {
			return null;
		}
	};

	private java.util.Map<java.lang.String, com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>> restricters;

	public ClosureReverseAbstractInterpreter(com.google.javascript.jscomp.CodingConvention convention, final com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry) {
		super(convention, typeRegistry);
		com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.this.restricters = new com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>>().put("isDef", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				if (p.outcome) {
					return getRestrictedWithoutUndefined(p.type);
				}else {
					return null;
				}
			}
		}).put("isNull", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				if (p.outcome) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
				}else {
					return getRestrictedWithoutNull(p.type);
				}
			}
		}).put("isDefAndNotNull", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				if (p.outcome) {
					return getRestrictedWithoutUndefined(getRestrictedWithoutNull(p.type));
				}else {
					return null;
				}
			}
		}).put("isString", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				return getRestrictedByTypeOfResult(p.type, "string", p.outcome);
			}
		}).put("isBoolean", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				return getRestrictedByTypeOfResult(p.type, "boolean", p.outcome);
			}
		}).put("isNumber", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				return getRestrictedByTypeOfResult(p.type, "number", p.outcome);
			}
		}).put("isFunction", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				return getRestrictedByTypeOfResult(p.type, "function", p.outcome);
			}
		}).put("isArray", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				if ((p.type) == null) {
					return p.outcome ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE) : null;
				}
				com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> visitor = p.outcome ? restrictToArrayVisitor : restrictToNotArrayVisitor;
				return p.type.visit(visitor);
			}
		}).put("isObject", new com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType>() {
			@java.lang.Override
			public com.google.javascript.rhino.jstype.JSType apply(com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction p) {
				if ((p.type) == null) {
					return p.outcome ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE) : null;
				}
				com.google.javascript.rhino.jstype.Visitor<com.google.javascript.rhino.jstype.JSType> visitor = p.outcome ? restrictToObjectVisitor : restrictToNotObjectVisitor;
				return p.type.visit(visitor);
			}
		}).build();
	}

	@java.lang.Override
	public com.google.javascript.jscomp.type.FlowScope getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.type.FlowScope blindScope, boolean outcome) {
		if ((condition.isCall()) && ((condition.getChildCount()) == 2)) {
			com.google.javascript.rhino.Node callee = condition.getFirstChild();
			com.google.javascript.rhino.Node param = condition.getLastChild();
			if ((callee.isGetProp()) && (param.isQualifiedName())) {
				com.google.javascript.rhino.jstype.JSType paramType = getTypeIfRefinable(param, blindScope);
				com.google.javascript.rhino.Node left = callee.getFirstChild();
				com.google.javascript.rhino.Node right = callee.getLastChild();
				if (((left.isName()) && ("goog".equals(left.getString()))) && (right.isString())) {
					com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType> restricter = restricters.get(right.getString());
					if (restricter != null) {
						return restrictParameter(param, paramType, blindScope, restricter, outcome);
					}
				}
			}
		}
		return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);
	}

	private com.google.javascript.jscomp.type.FlowScope restrictParameter(com.google.javascript.rhino.Node parameter, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.jscomp.type.FlowScope blindScope, com.google.common.base.Function<com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction, com.google.javascript.rhino.jstype.JSType> restriction, boolean outcome) {
		type = restriction.apply(new com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.TypeRestriction(type, outcome));
		if (type != null) {
			com.google.javascript.jscomp.type.FlowScope informed = blindScope.createChildFlowScope();
			declareNameInScope(informed, parameter, type);
			return informed;
		}else {
			return blindScope;
		}
	}

	private static class TypeRestriction {
		private final com.google.javascript.rhino.jstype.JSType type;

		private final boolean outcome;

		private TypeRestriction(com.google.javascript.rhino.jstype.JSType type, boolean outcome) {
			this.type = type;
			this.outcome = outcome;
		}
	}
}

