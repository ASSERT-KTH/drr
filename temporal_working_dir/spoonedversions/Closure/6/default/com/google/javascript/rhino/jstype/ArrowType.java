

package com.google.javascript.rhino.jstype;


final class ArrowType extends com.google.javascript.rhino.jstype.JSType {
	private static final long serialVersionUID = 1L;

	final com.google.javascript.rhino.Node parameters;

	com.google.javascript.rhino.jstype.JSType returnType;

	final boolean returnTypeInferred;

	ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.Node parameters, com.google.javascript.rhino.jstype.JSType returnType) {
		this(registry, parameters, returnType, false);
	}

	ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.Node parameters, com.google.javascript.rhino.jstype.JSType returnType, boolean returnTypeInferred) {
		super(registry);
		this.parameters = (parameters == null) ? registry.createParametersWithVarArgs(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE)) : parameters;
		com.google.javascript.rhino.jstype.ArrowType.this.returnType = (returnType == null) ? getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE) : returnType;
		this.returnTypeInferred = returnTypeInferred;
	}

	@java.lang.Override
	public boolean isSubtype(com.google.javascript.rhino.jstype.JSType other) {
		if (!(other instanceof com.google.javascript.rhino.jstype.ArrowType)) {
			return false;
		}
		com.google.javascript.rhino.jstype.ArrowType that = ((com.google.javascript.rhino.jstype.ArrowType) (other));
		if (!(com.google.javascript.rhino.jstype.ArrowType.this.returnType.isSubtype(that.returnType))) {
			return false;
		}
		com.google.javascript.rhino.Node thisParam = parameters.getFirstChild();
		com.google.javascript.rhino.Node thatParam = that.parameters.getFirstChild();
		while ((thisParam != null) && (thatParam != null)) {
			com.google.javascript.rhino.jstype.JSType thisParamType = thisParam.getJSType();
			com.google.javascript.rhino.jstype.JSType thatParamType = thatParam.getJSType();
			if (thisParamType != null) {
				if ((thatParamType == null) || (!(thatParamType.isSubtype(thisParamType)))) {
					return false;
				}
			}
			boolean thisIsVarArgs = thisParam.isVarArgs();
			boolean thatIsVarArgs = thatParam.isVarArgs();
			boolean thisIsOptional = thisIsVarArgs || (thisParam.isOptionalArg());
			boolean thatIsOptional = thatIsVarArgs || (thatParam.isOptionalArg());
			if ((!thisIsOptional) && thatIsOptional) {
				boolean isTopFunction = thatIsVarArgs && (((thatParamType == null) || (thatParamType.isUnknownType())) || (thatParamType.isNoType()));
				if (!isTopFunction) {
					return false;
				}
			}
			if (!thisIsVarArgs) {
				thisParam = thisParam.getNext();
			}
			if (!thatIsVarArgs) {
				thatParam = thatParam.getNext();
			}
			if (thisIsVarArgs && thatIsVarArgs) {
				thisParam = null;
				thatParam = null;
			}
		} 
		if ((((thisParam != null) && (!(thisParam.isOptionalArg()))) && (!(thisParam.isVarArgs()))) && (thatParam == null)) {
			return false;
		}
		return true;
	}

	boolean hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		com.google.javascript.rhino.Node thisParam = parameters.getFirstChild();
		com.google.javascript.rhino.Node otherParam = that.parameters.getFirstChild();
		while ((thisParam != null) && (otherParam != null)) {
			com.google.javascript.rhino.jstype.JSType thisParamType = thisParam.getJSType();
			com.google.javascript.rhino.jstype.JSType otherParamType = otherParam.getJSType();
			if (thisParamType != null) {
				if ((otherParamType != null) && (!(thisParamType.checkEquivalenceHelper(otherParamType, eqMethod)))) {
					return false;
				}
			}else {
				if (otherParamType != null) {
					return false;
				}
			}
			if ((thisParam.isOptionalArg()) != (otherParam.isOptionalArg())) {
				return false;
			}
			if ((thisParam.isVarArgs()) != (otherParam.isVarArgs())) {
				return false;
			}
			thisParam = thisParam.getNext();
			otherParam = otherParam.getNext();
		} 
		return thisParam == otherParam;
	}

	boolean checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType that, com.google.javascript.rhino.jstype.EquivalenceMethod eqMethod) {
		if (!(returnType.checkEquivalenceHelper(that.returnType, eqMethod))) {
			return false;
		}
		return hasEqualParameters(that, eqMethod);
	}

	@java.lang.Override
	public int hashCode() {
		int hashCode = 0;
		if ((returnType) != null) {
			hashCode += returnType.hashCode();
		}
		if (returnTypeInferred) {
			hashCode += 1;
		}
		if ((parameters) != null) {
			com.google.javascript.rhino.Node param = parameters.getFirstChild();
			while (param != null) {
				com.google.javascript.rhino.jstype.JSType paramType = param.getJSType();
				if (paramType != null) {
					hashCode += paramType.hashCode();
				}
				param = param.getNext();
			} 
		}
		return hashCode;
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getLeastSupertype(com.google.javascript.rhino.jstype.JSType that) {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.JSType getGreatestSubtype(com.google.javascript.rhino.jstype.JSType that) {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.TernaryValue testForEquality(com.google.javascript.rhino.jstype.JSType that) {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public <T> T visit(com.google.javascript.rhino.jstype.Visitor<T> visitor) {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public com.google.javascript.rhino.jstype.BooleanLiteralSet getPossibleToBooleanOutcomes() {
		return com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
	}

	@java.lang.Override
	com.google.javascript.rhino.jstype.JSType resolveInternal(com.google.javascript.rhino.ErrorReporter t, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		returnType = com.google.javascript.rhino.jstype.JSType.safeResolve(returnType, t, scope);
		if ((parameters) != null) {
			for (com.google.javascript.rhino.Node paramNode = parameters.getFirstChild(); paramNode != null; paramNode = paramNode.getNext()) {
				paramNode.setJSType(paramNode.getJSType().resolve(t, scope));
			}
		}
		return com.google.javascript.rhino.jstype.ArrowType.this;
	}

	boolean hasUnknownParamsOrReturn() {
		if ((parameters) != null) {
			for (com.google.javascript.rhino.Node paramNode = parameters.getFirstChild(); paramNode != null; paramNode = paramNode.getNext()) {
				com.google.javascript.rhino.jstype.JSType type = paramNode.getJSType();
				if ((type == null) || (type.isUnknownType())) {
					return true;
				}
			}
		}
		return ((returnType) == null) || (returnType.isUnknownType());
	}

	@java.lang.Override
	java.lang.String toStringHelper(boolean forAnnotations) {
		return "[ArrowType]";
	}

	@java.lang.Override
	public boolean hasAnyTemplateTypesInternal() {
		return (returnType.hasAnyTemplateTypes()) || (hasTemplatedParameterType());
	}

	private boolean hasTemplatedParameterType() {
		if ((parameters) != null) {
			for (com.google.javascript.rhino.Node paramNode = parameters.getFirstChild(); paramNode != null; paramNode = paramNode.getNext()) {
				com.google.javascript.rhino.jstype.JSType type = paramNode.getJSType();
				if ((type != null) && (type.hasAnyTemplateTypes())) {
					return true;
				}
			}
		}
		return false;
	}
}

