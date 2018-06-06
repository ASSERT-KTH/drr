

package com.google.javascript.rhino.jstype;


interface RelationshipVisitor<T> {
	T caseUnknownType(com.google.javascript.rhino.jstype.JSType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseNoType(com.google.javascript.rhino.jstype.JSType thatType);

	T caseNoObjectType(com.google.javascript.rhino.jstype.JSType thatType);

	T caseAllType(com.google.javascript.rhino.jstype.JSType thatType);

	T caseValueType(com.google.javascript.rhino.jstype.ValueType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseObjectType(com.google.javascript.rhino.jstype.ObjectType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseFunctionType(com.google.javascript.rhino.jstype.FunctionType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseUnionType(com.google.javascript.rhino.jstype.UnionType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseTemplateType(com.google.javascript.rhino.jstype.TemplateType thisType, com.google.javascript.rhino.jstype.JSType thatType);

	T caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType typeType, com.google.javascript.rhino.jstype.JSType thatType);
}

