

package com.google.javascript.rhino.jstype;


public interface Visitor<T> {
	T caseNoType();

	T caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType type);

	T caseAllType();

	T caseBooleanType();

	T caseNoObjectType();

	T caseFunctionType(com.google.javascript.rhino.jstype.FunctionType type);

	T caseObjectType(com.google.javascript.rhino.jstype.ObjectType type);

	T caseUnknownType();

	T caseNullType();

	T caseNumberType();

	T caseStringType();

	T caseVoidType();

	T caseUnionType(com.google.javascript.rhino.jstype.UnionType type);

	T caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType type);

	T caseTemplateType(com.google.javascript.rhino.jstype.TemplateType templateType);
}

