

package com.google.javascript.rhino.jstype;


class CanCastToVisitor implements com.google.javascript.rhino.jstype.RelationshipVisitor<java.lang.Boolean> {
	@java.lang.Override
	public java.lang.Boolean caseUnknownType(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return true;
	}

	@java.lang.Override
	public java.lang.Boolean caseNoType(com.google.javascript.rhino.jstype.JSType thatType) {
		return true;
	}

	@java.lang.Override
	public java.lang.Boolean caseNoObjectType(com.google.javascript.rhino.jstype.JSType thatType) {
		return true;
	}

	@java.lang.Override
	public java.lang.Boolean caseAllType(com.google.javascript.rhino.jstype.JSType thatType) {
		return true;
	}

	boolean canCastToUnion(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.UnionType unionType) {
		for (com.google.javascript.rhino.jstype.JSType type : unionType.getAlternates()) {
			if (thisType.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, type)) {
				return true;
			}
		}
		return false;
	}

	boolean canCastToFunction(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.FunctionType functionType) {
		if (thisType.isFunctionType()) {
			return true;
		}else {
			return (thisType.isSubtype(functionType)) || (functionType.isSubtype(thisType));
		}
	}

	private boolean isInterface(com.google.javascript.rhino.jstype.JSType type) {
		com.google.javascript.rhino.jstype.ObjectType objType = type.toObjectType();
		if (objType != null) {
			com.google.javascript.rhino.jstype.JSType constructor = objType.getConstructor();
			return (constructor != null) && (constructor.isInterface());
		}
		return false;
	}

	java.lang.Boolean castCastToHelper(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		if ((((thatType.isUnknownType()) || (thatType.isAllType())) || (thatType.isNoObjectType())) || (thatType.isNoType())) {
			return true;
		}else
			if ((thisType.isRecordType()) || (thatType.isRecordType())) {
				return true;
			}else
				if ((isInterface(thisType)) || (isInterface(thatType))) {
					return true;
				}else
					if (thatType.isEnumElementType()) {
						return thisType.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType.toMaybeEnumElementType().getPrimitiveType());
					}else
						if (thatType.isUnionType()) {
							return canCastToUnion(thisType, thatType.toMaybeUnionType());
						}else
							if (thatType.isFunctionType()) {
								return canCastToFunction(thisType, thatType.toMaybeFunctionType());
							}else
								if (thatType.isParameterizedType()) {
									return thisType.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType.toMaybeParameterizedType().getReferencedTypeInternal());
								}
							
						
					
				
			
		
		return (thisType.isSubtype(thatType)) || (thatType.isSubtype(thisType));
	}

	@java.lang.Override
	public java.lang.Boolean caseValueType(com.google.javascript.rhino.jstype.ValueType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return castCastToHelper(thisType, thatType);
	}

	@java.lang.Override
	public java.lang.Boolean caseObjectType(com.google.javascript.rhino.jstype.ObjectType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return castCastToHelper(thisType, thatType);
	}

	@java.lang.Override
	public java.lang.Boolean caseFunctionType(com.google.javascript.rhino.jstype.FunctionType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return castCastToHelper(thisType, thatType);
	}

	@java.lang.Override
	public java.lang.Boolean caseUnionType(com.google.javascript.rhino.jstype.UnionType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		boolean visited = false;
		for (com.google.javascript.rhino.jstype.JSType type : thisType.getAlternates()) {
			if ((type.isVoidType()) || (type.isNullType())) {
			}else {
				visited = true;
				if (type.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType)) {
					return true;
				}
			}
		}
		if (!visited) {
			com.google.javascript.rhino.jstype.JSType NULL_TYPE = thisType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
			com.google.javascript.rhino.jstype.JSType VOID_TYPE = thisType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
			return (NULL_TYPE.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType)) || (VOID_TYPE.visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType));
		}
		return false;
	}

	@java.lang.Override
	public java.lang.Boolean caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return thisType.getReferencedTypeInternal().visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType);
	}

	@java.lang.Override
	public java.lang.Boolean caseTemplateType(com.google.javascript.rhino.jstype.TemplateType thisType, com.google.javascript.rhino.jstype.JSType thatType) {
		return true;
	}

	@java.lang.Override
	public java.lang.Boolean caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType typeType, com.google.javascript.rhino.jstype.JSType thatType) {
		return typeType.getPrimitiveType().visit(com.google.javascript.rhino.jstype.CanCastToVisitor.this, thatType);
	}
}

