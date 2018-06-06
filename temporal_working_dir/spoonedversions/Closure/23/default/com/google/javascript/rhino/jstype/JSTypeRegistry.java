

package com.google.javascript.rhino.jstype;


public class JSTypeRegistry implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private static final int PROPERTY_CHECKING_UNION_SIZE = 3000;

	private final transient com.google.javascript.rhino.ErrorReporter reporter;

	private final com.google.javascript.rhino.jstype.JSType[] nativeTypes;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.JSType> namesToTypes;

	private final java.util.Set<java.lang.String> namespaces = new java.util.HashSet<java.lang.String>();

	private final java.util.Set<java.lang.String> nonNullableTypeNames = new java.util.HashSet<java.lang.String>();

	private final java.util.Set<java.lang.String> forwardDeclaredTypes = new java.util.HashSet<java.lang.String>();

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.UnionTypeBuilder> typesIndexedByProperty = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.ObjectType>> eachRefTypeIndexedByProperty = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.JSType> greatestSubtypeByProperty = com.google.common.collect.Maps.newHashMap();

	private final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.rhino.jstype.FunctionType> interfaceToImplementors = com.google.common.collect.LinkedHashMultimap.create();

	private final com.google.common.collect.Multimap<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>, com.google.javascript.rhino.jstype.NamedType> unresolvedNamedTypes = com.google.common.collect.ArrayListMultimap.create();

	private final com.google.common.collect.Multimap<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>, com.google.javascript.rhino.jstype.NamedType> resolvedNamedTypes = com.google.common.collect.ArrayListMultimap.create();

	private boolean lastGeneration = true;

	private java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.TemplateType> templateTypes = com.google.common.collect.Maps.newHashMap();

	private final boolean tolerateUndefinedValues;

	public static enum ResolveMode {
LAZY_EXPRESSIONS, LAZY_NAMES, IMMEDIATE;	}

	private com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;

	public JSTypeRegistry(com.google.javascript.rhino.ErrorReporter reporter) {
		this(reporter, false);
	}

	public JSTypeRegistry(com.google.javascript.rhino.ErrorReporter reporter, boolean tolerateUndefinedValues) {
		this.reporter = reporter;
		nativeTypes = new com.google.javascript.rhino.jstype.JSType[com.google.javascript.rhino.jstype.JSTypeNative.values().length];
		namesToTypes = new java.util.HashMap<java.lang.String, com.google.javascript.rhino.jstype.JSType>();
		resetForTypeCheck();
		this.tolerateUndefinedValues = tolerateUndefinedValues;
	}

	public void setResolveMode(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode mode) {
		com.google.javascript.rhino.jstype.JSTypeRegistry.this.resolveMode = mode;
	}

	com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode getResolveMode() {
		return resolveMode;
	}

	public com.google.javascript.rhino.ErrorReporter getErrorReporter() {
		return reporter;
	}

	public boolean shouldTolerateUndefinedValues() {
		return tolerateUndefinedValues;
	}

	public void resetForTypeCheck() {
		typesIndexedByProperty.clear();
		eachRefTypeIndexedByProperty.clear();
		initializeBuiltInTypes();
		namesToTypes.clear();
		namespaces.clear();
		initializeRegistry();
	}

	private void initializeBuiltInTypes() {
		com.google.javascript.rhino.jstype.BooleanType BOOLEAN_TYPE = new com.google.javascript.rhino.jstype.BooleanType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE, BOOLEAN_TYPE);
		com.google.javascript.rhino.jstype.NullType NULL_TYPE = new com.google.javascript.rhino.jstype.NullType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE, NULL_TYPE);
		com.google.javascript.rhino.jstype.NumberType NUMBER_TYPE = new com.google.javascript.rhino.jstype.NumberType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE, NUMBER_TYPE);
		com.google.javascript.rhino.jstype.StringType STRING_TYPE = new com.google.javascript.rhino.jstype.StringType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE, STRING_TYPE);
		com.google.javascript.rhino.jstype.UnknownType UNKNOWN_TYPE = new com.google.javascript.rhino.jstype.UnknownType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, false);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE, UNKNOWN_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE, new com.google.javascript.rhino.jstype.UnknownType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, true));
		com.google.javascript.rhino.jstype.VoidType VOID_TYPE = new com.google.javascript.rhino.jstype.VoidType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE, VOID_TYPE);
		com.google.javascript.rhino.jstype.AllType ALL_TYPE = new com.google.javascript.rhino.jstype.AllType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE, ALL_TYPE);
		com.google.javascript.rhino.jstype.PrototypeObjectType TOP_LEVEL_PROTOTYPE = new com.google.javascript.rhino.jstype.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, null, null, true);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TOP_LEVEL_PROTOTYPE, TOP_LEVEL_PROTOTYPE);
		com.google.javascript.rhino.jstype.FunctionType OBJECT_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Object", null, createArrowType(createOptionalParameters(ALL_TYPE), UNKNOWN_TYPE), null, null, true, true);
		OBJECT_FUNCTION_TYPE.setPrototype(TOP_LEVEL_PROTOTYPE, null);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE, OBJECT_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType OBJECT_TYPE = OBJECT_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE, OBJECT_TYPE);
		com.google.javascript.rhino.jstype.ObjectType OBJECT_PROTOTYPE = OBJECT_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE, OBJECT_PROTOTYPE);
		com.google.javascript.rhino.jstype.FunctionType FUNCTION_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Function", null, createArrowType(createParametersWithVarArgs(ALL_TYPE), UNKNOWN_TYPE), null, null, true, true);
		FUNCTION_FUNCTION_TYPE.setPrototypeBasedOn(OBJECT_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE, FUNCTION_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType FUNCTION_PROTOTYPE = FUNCTION_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE, FUNCTION_PROTOTYPE);
		com.google.javascript.rhino.jstype.NoType NO_TYPE = new com.google.javascript.rhino.jstype.NoType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE, NO_TYPE);
		com.google.javascript.rhino.jstype.NoObjectType NO_OBJECT_TYPE = new com.google.javascript.rhino.jstype.NoObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE, NO_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.NoObjectType NO_RESOLVED_TYPE = new com.google.javascript.rhino.jstype.NoResolvedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE, NO_RESOLVED_TYPE);
		com.google.javascript.rhino.jstype.FunctionType ARRAY_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Array", null, createArrowType(createParametersWithVarArgs(ALL_TYPE), null), null, null, true, true);
		ARRAY_FUNCTION_TYPE.getInternalArrowType().returnType = ARRAY_FUNCTION_TYPE.getInstanceType();
		com.google.javascript.rhino.jstype.ObjectType arrayPrototype = ARRAY_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE, ARRAY_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType ARRAY_TYPE = ARRAY_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE, ARRAY_TYPE);
		com.google.javascript.rhino.jstype.FunctionType BOOLEAN_OBJECT_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Boolean", null, createArrowType(createParameters(false, ALL_TYPE), BOOLEAN_TYPE), null, null, true, true);
		com.google.javascript.rhino.jstype.ObjectType booleanPrototype = BOOLEAN_OBJECT_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE, BOOLEAN_OBJECT_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType BOOLEAN_OBJECT_TYPE = BOOLEAN_OBJECT_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE, BOOLEAN_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.FunctionType DATE_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Date", null, createArrowType(createOptionalParameters(UNKNOWN_TYPE, UNKNOWN_TYPE, UNKNOWN_TYPE, UNKNOWN_TYPE, UNKNOWN_TYPE, UNKNOWN_TYPE, UNKNOWN_TYPE), STRING_TYPE), null, null, true, true);
		com.google.javascript.rhino.jstype.ObjectType datePrototype = DATE_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_FUNCTION_TYPE, DATE_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType DATE_TYPE = DATE_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE, DATE_TYPE);
		com.google.javascript.rhino.jstype.FunctionType ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Error");
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE, ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType ERROR_TYPE = ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_TYPE, ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType EVAL_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "EvalError");
		EVAL_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE, EVAL_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType EVAL_ERROR_TYPE = EVAL_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE, EVAL_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType RANGE_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "RangeError");
		RANGE_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_FUNCTION_TYPE, RANGE_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType RANGE_ERROR_TYPE = RANGE_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE, RANGE_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType REFERENCE_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "ReferenceError");
		REFERENCE_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE, REFERENCE_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType REFERENCE_ERROR_TYPE = REFERENCE_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_TYPE, REFERENCE_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType SYNTAX_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "SyntaxError");
		SYNTAX_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_FUNCTION_TYPE, SYNTAX_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType SYNTAX_ERROR_TYPE = SYNTAX_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE, SYNTAX_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType TYPE_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "TypeError");
		TYPE_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_FUNCTION_TYPE, TYPE_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType TYPE_ERROR_TYPE = TYPE_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE, TYPE_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType URI_ERROR_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.ErrorFunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "URIError");
		URI_ERROR_FUNCTION_TYPE.setPrototypeBasedOn(ERROR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_FUNCTION_TYPE, URI_ERROR_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType URI_ERROR_TYPE = URI_ERROR_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_TYPE, URI_ERROR_TYPE);
		com.google.javascript.rhino.jstype.FunctionType NUMBER_OBJECT_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Number", null, createArrowType(createParameters(false, ALL_TYPE), NUMBER_TYPE), null, null, true, true);
		com.google.javascript.rhino.jstype.ObjectType numberPrototype = NUMBER_OBJECT_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE, NUMBER_OBJECT_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType NUMBER_OBJECT_TYPE = NUMBER_OBJECT_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE, NUMBER_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.FunctionType REGEXP_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "RegExp", null, createArrowType(createOptionalParameters(ALL_TYPE, ALL_TYPE)), null, null, true, true);
		REGEXP_FUNCTION_TYPE.getInternalArrowType().returnType = REGEXP_FUNCTION_TYPE.getInstanceType();
		com.google.javascript.rhino.jstype.ObjectType regexpPrototype = REGEXP_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE, REGEXP_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType REGEXP_TYPE = REGEXP_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE, REGEXP_TYPE);
		com.google.javascript.rhino.jstype.FunctionType STRING_OBJECT_FUNCTION_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "String", null, createArrowType(createParameters(false, ALL_TYPE), STRING_TYPE), null, null, true, true);
		com.google.javascript.rhino.jstype.ObjectType stringPrototype = STRING_OBJECT_FUNCTION_TYPE.getPrototype();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_FUNCTION_TYPE, STRING_OBJECT_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.ObjectType STRING_OBJECT_TYPE = STRING_OBJECT_FUNCTION_TYPE.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE, STRING_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.JSType OBJECT_NUMBER_STRING = createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING, OBJECT_NUMBER_STRING);
		com.google.javascript.rhino.jstype.JSType OBJECT_NUMBER_STRING_BOOLEAN = createUnionType(OBJECT_TYPE, NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN, OBJECT_NUMBER_STRING_BOOLEAN);
		com.google.javascript.rhino.jstype.JSType NUMBER_STRING_BOOLEAN = createUnionType(NUMBER_TYPE, STRING_TYPE, BOOLEAN_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN, NUMBER_STRING_BOOLEAN);
		com.google.javascript.rhino.jstype.JSType NUMBER_STRING = createUnionType(NUMBER_TYPE, STRING_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING, NUMBER_STRING);
		com.google.javascript.rhino.jstype.JSType STRING_VALUE_OR_OBJECT_TYPE = createUnionType(STRING_OBJECT_TYPE, STRING_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE, STRING_VALUE_OR_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.JSType NUMBER_VALUE_OR_OBJECT_TYPE = createUnionType(NUMBER_OBJECT_TYPE, NUMBER_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.FunctionType U2U_FUNCTION_TYPE = createFunctionType(UNKNOWN_TYPE, true, UNKNOWN_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_FUNCTION_TYPE, U2U_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.FunctionType U2U_CONSTRUCTOR_TYPE = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "Function", null, createArrowType(createParametersWithVarArgs(UNKNOWN_TYPE), UNKNOWN_TYPE), NO_OBJECT_TYPE, null, true, true) {
			private static final long serialVersionUID = 1L;

			@java.lang.Override
			public com.google.javascript.rhino.jstype.FunctionType getConstructor() {
				return registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE);
			}
		};
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE, U2U_CONSTRUCTOR_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE, U2U_CONSTRUCTOR_TYPE);
		FUNCTION_FUNCTION_TYPE.setInstanceType(U2U_CONSTRUCTOR_TYPE);
		U2U_CONSTRUCTOR_TYPE.setImplicitPrototype(FUNCTION_PROTOTYPE);
		com.google.javascript.rhino.jstype.FunctionType LEAST_FUNCTION_TYPE = createFunctionType(NO_TYPE, true, ALL_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.LEAST_FUNCTION_TYPE, LEAST_FUNCTION_TYPE);
		com.google.javascript.rhino.jstype.FunctionType GLOBAL_THIS_CTOR = new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, "global this", null, createArrowType(createParameters(false, ALL_TYPE), NUMBER_TYPE), null, null, true, true);
		com.google.javascript.rhino.jstype.ObjectType GLOBAL_THIS = GLOBAL_THIS_CTOR.getInstanceType();
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS, GLOBAL_THIS);
		com.google.javascript.rhino.jstype.FunctionType GREATEST_FUNCTION_TYPE = createFunctionType(ALL_TYPE, true, NO_TYPE);
		registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE, GREATEST_FUNCTION_TYPE);
		registerPropertyOnType("prototype", OBJECT_FUNCTION_TYPE);
	}

	private void initializeRegistry() {
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE), "Null");
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), "Undefined");
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), "void");
		register(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), "Function");
	}

	private void register(com.google.javascript.rhino.jstype.JSType type) {
		register(type, type.toString());
	}

	private void register(com.google.javascript.rhino.jstype.JSType type, java.lang.String name) {
		namesToTypes.put(name, type);
		while ((name.indexOf('.')) > 0) {
			name = name.substring(0, name.lastIndexOf('.'));
			namespaces.add(name);
		} 
	}

	private void registerNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId, com.google.javascript.rhino.jstype.JSType type) {
		nativeTypes[typeId.ordinal()] = type;
	}

	public void registerPropertyOnType(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder typeSet = typesIndexedByProperty.get(propertyName);
		if (typeSet == null) {
			typeSet = new com.google.javascript.rhino.jstype.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this, com.google.javascript.rhino.jstype.JSTypeRegistry.PROPERTY_CHECKING_UNION_SIZE);
			typesIndexedByProperty.put(propertyName, typeSet);
		}
		typeSet.addAlternate(type);
		addReferenceTypeIndexedByProperty(propertyName, type);
		greatestSubtypeByProperty.remove(propertyName);
	}

	private void addReferenceTypeIndexedByProperty(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type) {
		if ((type instanceof com.google.javascript.rhino.jstype.ObjectType) && (((com.google.javascript.rhino.jstype.ObjectType) (type)).hasReferenceName())) {
			java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> typeSet = eachRefTypeIndexedByProperty.get(propertyName);
			if (typeSet == null) {
				typeSet = com.google.common.collect.Maps.newHashMap();
				eachRefTypeIndexedByProperty.put(propertyName, typeSet);
			}
			com.google.javascript.rhino.jstype.ObjectType objType = ((com.google.javascript.rhino.jstype.ObjectType) (type));
			typeSet.put(objType.getReferenceName(), objType);
		}else
			if (type instanceof com.google.javascript.rhino.jstype.NamedType) {
				addReferenceTypeIndexedByProperty(propertyName, ((com.google.javascript.rhino.jstype.NamedType) (type)).getReferencedType());
			}else
				if (type.isUnionType()) {
					for (com.google.javascript.rhino.jstype.JSType alternate : type.toMaybeUnionType().getAlternates()) {
						addReferenceTypeIndexedByProperty(propertyName, alternate);
					}
				}
			
		
	}

	public void unregisterPropertyOnType(java.lang.String propertyName, com.google.javascript.rhino.jstype.JSType type) {
		java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.ObjectType> typeSet = eachRefTypeIndexedByProperty.get(propertyName);
		if (typeSet != null) {
			typeSet.remove(type.toObjectType().getReferenceName());
		}
	}

	public com.google.javascript.rhino.jstype.JSType getGreatestSubtypeWithProperty(com.google.javascript.rhino.jstype.JSType type, java.lang.String propertyName) {
		if (greatestSubtypeByProperty.containsKey(propertyName)) {
			return greatestSubtypeByProperty.get(propertyName).getGreatestSubtype(type);
		}
		if (typesIndexedByProperty.containsKey(propertyName)) {
			com.google.javascript.rhino.jstype.JSType built = typesIndexedByProperty.get(propertyName).build();
			greatestSubtypeByProperty.put(propertyName, built);
			return built.getGreatestSubtype(type);
		}
		return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
	}

	public boolean canPropertyBeDefined(com.google.javascript.rhino.jstype.JSType type, java.lang.String propertyName) {
		if (typesIndexedByProperty.containsKey(propertyName)) {
			for (com.google.javascript.rhino.jstype.JSType alt : typesIndexedByProperty.get(propertyName).getAlternates()) {
				com.google.javascript.rhino.jstype.JSType greatestSubtype = alt.getGreatestSubtype(type);
				if (!(greatestSubtype.isEmptyType())) {
					com.google.javascript.rhino.jstype.RecordType maybeRecordType = greatestSubtype.toMaybeRecordType();
					if ((maybeRecordType != null) && (maybeRecordType.isSynthetic())) {
						continue;
					}
					return true;
				}
			}
		}
		return false;
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> getTypesWithProperty(java.lang.String propertyName) {
		if (typesIndexedByProperty.containsKey(propertyName)) {
			return typesIndexedByProperty.get(propertyName).getAlternates();
		}else {
			return com.google.common.collect.ImmutableList.of();
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> getEachReferenceTypeWithProperty(java.lang.String propertyName) {
		if (eachRefTypeIndexedByProperty.containsKey(propertyName)) {
			return eachRefTypeIndexedByProperty.get(propertyName).values();
		}else {
			return com.google.common.collect.ImmutableList.of();
		}
	}

	com.google.javascript.rhino.jstype.ObjectType findCommonSuperObject(com.google.javascript.rhino.jstype.ObjectType a, com.google.javascript.rhino.jstype.ObjectType b) {
		java.util.List<com.google.javascript.rhino.jstype.ObjectType> stackA = com.google.javascript.rhino.jstype.JSTypeRegistry.getSuperStack(a);
		java.util.List<com.google.javascript.rhino.jstype.ObjectType> stackB = com.google.javascript.rhino.jstype.JSTypeRegistry.getSuperStack(b);
		com.google.javascript.rhino.jstype.ObjectType result = getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		while ((!(stackA.isEmpty())) && (!(stackB.isEmpty()))) {
			com.google.javascript.rhino.jstype.ObjectType currentA = stackA.remove(((stackA.size()) - 1));
			com.google.javascript.rhino.jstype.ObjectType currentB = stackB.remove(((stackB.size()) - 1));
			if (currentA.isEquivalentTo(currentB)) {
				result = currentA;
			}else {
				return result;
			}
		} 
		return result;
	}

	private static java.util.List<com.google.javascript.rhino.jstype.ObjectType> getSuperStack(com.google.javascript.rhino.jstype.ObjectType a) {
		java.util.List<com.google.javascript.rhino.jstype.ObjectType> stack = com.google.common.collect.Lists.newArrayListWithExpectedSize(5);
		for (com.google.javascript.rhino.jstype.ObjectType current = a; current != null; current = current.getImplicitPrototype()) {
			stack.add(current);
		}
		return stack;
	}

	public void incrementGeneration() {
		for (com.google.javascript.rhino.jstype.NamedType type : resolvedNamedTypes.values()) {
			type.clearResolved();
		}
		unresolvedNamedTypes.putAll(resolvedNamedTypes);
		resolvedNamedTypes.clear();
	}

	boolean isLastGeneration() {
		return lastGeneration;
	}

	public void setLastGeneration(boolean lastGeneration) {
		com.google.javascript.rhino.jstype.JSTypeRegistry.this.lastGeneration = lastGeneration;
	}

	void registerTypeImplementingInterface(com.google.javascript.rhino.jstype.FunctionType type, com.google.javascript.rhino.jstype.ObjectType interfaceInstance) {
		interfaceToImplementors.put(interfaceInstance.getReferenceName(), type);
	}

	public java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> getDirectImplementors(com.google.javascript.rhino.jstype.ObjectType interfaceInstance) {
		return interfaceToImplementors.get(interfaceInstance.getReferenceName());
	}

	public boolean declareType(java.lang.String name, com.google.javascript.rhino.jstype.JSType t) {
		if (namesToTypes.containsKey(name)) {
			return false;
		}
		register(t, name);
		return true;
	}

	public void overwriteDeclaredType(java.lang.String name, com.google.javascript.rhino.jstype.JSType t) {
		com.google.common.base.Preconditions.checkState(namesToTypes.containsKey(name));
		register(t, name);
	}

	public void forwardDeclareType(java.lang.String name) {
		forwardDeclaredTypes.add(name);
	}

	public boolean isForwardDeclaredType(java.lang.String name) {
		return forwardDeclaredTypes.contains(name);
	}

	public boolean hasNamespace(java.lang.String name) {
		return namespaces.contains(name);
	}

	public com.google.javascript.rhino.jstype.JSType getType(java.lang.String jsTypeName) {
		com.google.javascript.rhino.jstype.TemplateType templateType = templateTypes.get(jsTypeName);
		if (templateType != null) {
			return templateType;
		}
		return namesToTypes.get(jsTypeName);
	}

	public com.google.javascript.rhino.jstype.JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return nativeTypes[typeId.ordinal()];
	}

	public com.google.javascript.rhino.jstype.ObjectType getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return ((com.google.javascript.rhino.jstype.ObjectType) (getNativeType(typeId)));
	}

	public com.google.javascript.rhino.jstype.FunctionType getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
		return ((com.google.javascript.rhino.jstype.FunctionType) (getNativeType(typeId)));
	}

	public com.google.javascript.rhino.jstype.JSType getType(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope, java.lang.String jsTypeName, java.lang.String sourceName, int lineno, int charno) {
		com.google.javascript.rhino.jstype.JSType type = getType(jsTypeName);
		if (type == null) {
			com.google.javascript.rhino.jstype.NamedType namedType = new com.google.javascript.rhino.jstype.NamedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, jsTypeName, sourceName, lineno, charno);
			unresolvedNamedTypes.put(scope, namedType);
			type = namedType;
		}
		return type;
	}

	public void clearNamedTypes() {
		resolvedNamedTypes.clear();
		unresolvedNamedTypes.clear();
	}

	public void resolveTypesInScope(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		for (com.google.javascript.rhino.jstype.NamedType type : unresolvedNamedTypes.get(scope)) {
			type.resolve(reporter, scope);
		}
		resolvedNamedTypes.putAll(scope, unresolvedNamedTypes.removeAll(scope));
		if ((scope != null) && ((scope.getParentScope()) == null)) {
			com.google.javascript.rhino.jstype.PrototypeObjectType globalThis = ((com.google.javascript.rhino.jstype.PrototypeObjectType) (getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS)));
			com.google.javascript.rhino.jstype.JSType windowType = getType("Window");
			if (globalThis.isUnknownType()) {
				com.google.javascript.rhino.jstype.ObjectType windowObjType = com.google.javascript.rhino.jstype.ObjectType.cast(windowType);
				if (windowObjType != null) {
					globalThis.setImplicitPrototype(windowObjType);
				}else {
					globalThis.setImplicitPrototype(getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
				}
			}
		}
	}

	public com.google.javascript.rhino.jstype.JSType createOptionalType(com.google.javascript.rhino.jstype.JSType type) {
		if ((type instanceof com.google.javascript.rhino.jstype.UnknownType) || (type.isAllType())) {
			return type;
		}else {
			return createUnionType(type, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE));
		}
	}

	public com.google.javascript.rhino.jstype.JSType createDefaultObjectUnion(com.google.javascript.rhino.jstype.JSType type) {
		return shouldTolerateUndefinedValues() ? createOptionalNullableType(type) : createNullableType(type);
	}

	public com.google.javascript.rhino.jstype.JSType createNullableType(com.google.javascript.rhino.jstype.JSType type) {
		return createUnionType(type, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
	}

	public com.google.javascript.rhino.jstype.JSType createOptionalNullableType(com.google.javascript.rhino.jstype.JSType type) {
		return createUnionType(type, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE));
	}

	public com.google.javascript.rhino.jstype.JSType createUnionType(com.google.javascript.rhino.jstype.JSType... variants) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		for (com.google.javascript.rhino.jstype.JSType type : variants) {
			builder.addAlternate(type);
		}
		return builder.build();
	}

	public com.google.javascript.rhino.jstype.JSType createUnionType(com.google.javascript.rhino.jstype.JSTypeNative... variants) {
		com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		for (com.google.javascript.rhino.jstype.JSTypeNative typeId : variants) {
			builder.addAlternate(getNativeType(typeId));
		}
		return builder.build();
	}

	public com.google.javascript.rhino.jstype.EnumType createEnumType(java.lang.String name, com.google.javascript.rhino.Node source, com.google.javascript.rhino.jstype.JSType elementsType) {
		return new com.google.javascript.rhino.jstype.EnumType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, name, source, elementsType);
	}

	com.google.javascript.rhino.jstype.ArrowType createArrowType(com.google.javascript.rhino.Node parametersNode, com.google.javascript.rhino.jstype.JSType returnType) {
		return new com.google.javascript.rhino.jstype.ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, parametersNode, returnType);
	}

	com.google.javascript.rhino.jstype.ArrowType createArrowType(com.google.javascript.rhino.Node parametersNode) {
		return new com.google.javascript.rhino.jstype.ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, parametersNode, null);
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionType(com.google.javascript.rhino.jstype.JSType returnType, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createFunctionType(returnType, createParameters(parameterTypes));
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType returnType, java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return createFunctionType(returnType, createParametersWithVarArgs(parameterTypes));
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionType(com.google.javascript.rhino.jstype.JSType returnType, java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return createFunctionType(returnType, createParameters(parameterTypes));
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType returnType, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createFunctionType(returnType, createParametersWithVarArgs(parameterTypes));
	}

	public com.google.javascript.rhino.jstype.FunctionType createConstructorType(com.google.javascript.rhino.jstype.JSType returnType, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createConstructorType(null, null, createParameters(parameterTypes), returnType);
	}

	public com.google.javascript.rhino.jstype.FunctionType createConstructorTypeWithVarArgs(com.google.javascript.rhino.jstype.JSType returnType, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createConstructorType(null, null, createParametersWithVarArgs(parameterTypes), returnType);
	}

	public com.google.javascript.rhino.jstype.JSType createFunctionType(com.google.javascript.rhino.jstype.ObjectType instanceType, com.google.javascript.rhino.jstype.JSType returnType, java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).withParamsNode(createParameters(parameterTypes)).withReturnType(returnType).withTypeOfThis(instanceType).build();
	}

	public com.google.javascript.rhino.jstype.JSType createFunctionTypeWithVarArgs(com.google.javascript.rhino.jstype.ObjectType instanceType, com.google.javascript.rhino.jstype.JSType returnType, java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).withParamsNode(createParametersWithVarArgs(parameterTypes)).withReturnType(returnType).withTypeOfThis(instanceType).build();
	}

	public com.google.javascript.rhino.Node createParameters(java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return createParameters(parameterTypes.toArray(new com.google.javascript.rhino.jstype.JSType[parameterTypes.size()]));
	}

	public com.google.javascript.rhino.Node createParametersWithVarArgs(java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes) {
		return createParametersWithVarArgs(parameterTypes.toArray(new com.google.javascript.rhino.jstype.JSType[parameterTypes.size()]));
	}

	public com.google.javascript.rhino.Node createParameters(com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createParameters(false, parameterTypes);
	}

	public com.google.javascript.rhino.Node createParametersWithVarArgs(com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		return createParameters(true, parameterTypes);
	}

	public com.google.javascript.rhino.Node createOptionalParameters(com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		com.google.javascript.rhino.jstype.FunctionParamBuilder builder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		builder.addOptionalParams(parameterTypes);
		return builder.build();
	}

	private com.google.javascript.rhino.Node createParameters(boolean lastVarArgs, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		com.google.javascript.rhino.jstype.FunctionParamBuilder builder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		int max = (parameterTypes.length) - 1;
		for (int i = 0; i <= max; i++) {
			if (lastVarArgs && (i == max)) {
				builder.addVarArgs(parameterTypes[i]);
			}else {
				builder.addRequiredParams(parameterTypes[i]);
			}
		}
		return builder.build();
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionType(com.google.javascript.rhino.jstype.JSType returnType, boolean lastVarArgs, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		if (lastVarArgs) {
			return createFunctionTypeWithVarArgs(returnType, parameterTypes);
		}else {
			return createFunctionType(returnType, parameterTypes);
		}
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionTypeWithNewReturnType(com.google.javascript.rhino.jstype.FunctionType existingFunctionType, com.google.javascript.rhino.jstype.JSType returnType) {
		return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).copyFromOtherFunction(existingFunctionType).withReturnType(returnType).build();
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionTypeWithNewThisType(com.google.javascript.rhino.jstype.FunctionType existingFunctionType, com.google.javascript.rhino.jstype.ObjectType thisType) {
		return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).copyFromOtherFunction(existingFunctionType).withTypeOfThis(thisType).build();
	}

	public com.google.javascript.rhino.jstype.FunctionType createFunctionType(com.google.javascript.rhino.jstype.JSType returnType, com.google.javascript.rhino.Node parameters) {
		return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).withParamsNode(parameters).withReturnType(returnType).build();
	}

	public com.google.javascript.rhino.jstype.FunctionType createConstructorType(com.google.javascript.rhino.jstype.JSType returnType, boolean lastVarArgs, com.google.javascript.rhino.jstype.JSType... parameterTypes) {
		if (lastVarArgs) {
			return createConstructorTypeWithVarArgs(returnType, parameterTypes);
		}else {
			return createConstructorType(returnType, parameterTypes);
		}
	}

	public com.google.javascript.rhino.jstype.ObjectType createObjectType(com.google.javascript.rhino.jstype.ObjectType implicitPrototype) {
		return createObjectType(null, null, implicitPrototype);
	}

	public com.google.javascript.rhino.jstype.RecordType createRecordType(java.util.Map<java.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty> properties) {
		return new com.google.javascript.rhino.jstype.RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, properties);
	}

	public com.google.javascript.rhino.jstype.ObjectType createObjectType(java.lang.String name, com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.ObjectType implicitPrototype) {
		return new com.google.javascript.rhino.jstype.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, name, implicitPrototype);
	}

	public com.google.javascript.rhino.jstype.ObjectType createAnonymousObjectType() {
		com.google.javascript.rhino.jstype.PrototypeObjectType type = new com.google.javascript.rhino.jstype.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, null, null);
		type.setPrettyPrint(true);
		return type;
	}

	public boolean resetImplicitPrototype(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.ObjectType newImplicitProto) {
		if (type instanceof com.google.javascript.rhino.jstype.PrototypeObjectType) {
			com.google.javascript.rhino.jstype.PrototypeObjectType poType = ((com.google.javascript.rhino.jstype.PrototypeObjectType) (type));
			poType.clearCachedValues();
			poType.setImplicitPrototype(newImplicitProto);
			return true;
		}
		return false;
	}

	com.google.javascript.rhino.jstype.ObjectType createNativeAnonymousObjectType() {
		com.google.javascript.rhino.jstype.PrototypeObjectType type = new com.google.javascript.rhino.jstype.PrototypeObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, null, null, true);
		type.setPrettyPrint(true);
		return type;
	}

	public com.google.javascript.rhino.jstype.FunctionType createConstructorType(java.lang.String name, com.google.javascript.rhino.Node source, com.google.javascript.rhino.Node parameters, com.google.javascript.rhino.jstype.JSType returnType) {
		return new com.google.javascript.rhino.jstype.FunctionType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, name, source, createArrowType(parameters, returnType), null, null, true, false);
	}

	public com.google.javascript.rhino.jstype.FunctionType createInterfaceType(java.lang.String name, com.google.javascript.rhino.Node source) {
		return com.google.javascript.rhino.jstype.FunctionType.forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry.this, name, source);
	}

	public com.google.javascript.rhino.jstype.ParameterizedType createParameterizedType(com.google.javascript.rhino.jstype.ObjectType objectType, com.google.javascript.rhino.jstype.JSType parameterType) {
		return new com.google.javascript.rhino.jstype.ParameterizedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, objectType, parameterType);
	}

	@com.google.common.annotations.VisibleForTesting
	public com.google.javascript.rhino.jstype.JSType createNamedType(java.lang.String reference, java.lang.String sourceName, int lineno, int charno) {
		return new com.google.javascript.rhino.jstype.NamedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, reference, sourceName, lineno, charno);
	}

	public void identifyNonNullableName(java.lang.String name) {
		com.google.common.base.Preconditions.checkNotNull(name);
		nonNullableTypeNames.add(name);
	}

	public com.google.javascript.rhino.jstype.JSType createFromTypeNodes(com.google.javascript.rhino.Node n, java.lang.String sourceName, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		if ((resolveMode) == (com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS)) {
			boolean hasNames = hasTypeName(n);
			if (hasNames) {
				return new com.google.javascript.rhino.jstype.UnresolvedTypeExpression(com.google.javascript.rhino.jstype.JSTypeRegistry.this, n, sourceName);
			}
		}
		return createFromTypeNodesInternal(n, sourceName, scope);
	}

	private boolean hasTypeName(com.google.javascript.rhino.Node n) {
		if ((n.getType()) == (com.google.javascript.rhino.Token.STRING)) {
			return true;
		}
		for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
			if (hasTypeName(child)) {
				return true;
			}
		}
		return false;
	}

	private com.google.javascript.rhino.jstype.JSType createFromTypeNodesInternal(com.google.javascript.rhino.Node n, java.lang.String sourceName, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.LC :
				return createRecordTypeFromNodes(n.getFirstChild(), sourceName, scope);
			case com.google.javascript.rhino.Token.BANG :
				return createFromTypeNodesInternal(n.getFirstChild(), sourceName, scope).restrictByNotNullOrUndefined();
			case com.google.javascript.rhino.Token.QMARK :
				com.google.javascript.rhino.Node firstChild = n.getFirstChild();
				if (firstChild == null) {
					return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
				}
				return createDefaultObjectUnion(createFromTypeNodesInternal(firstChild, sourceName, scope));
			case com.google.javascript.rhino.Token.EQUALS :
				return createOptionalType(createFromTypeNodesInternal(n.getFirstChild(), sourceName, scope));
			case com.google.javascript.rhino.Token.ELLIPSIS :
				return createOptionalType(createFromTypeNodesInternal(n.getFirstChild(), sourceName, scope));
			case com.google.javascript.rhino.Token.STAR :
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
			case com.google.javascript.rhino.Token.LB :
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
			case com.google.javascript.rhino.Token.PIPE :
				com.google.javascript.rhino.jstype.UnionTypeBuilder builder = new com.google.javascript.rhino.jstype.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
					builder.addAlternate(createFromTypeNodesInternal(child, sourceName, scope));
				}
				return builder.build();
			case com.google.javascript.rhino.Token.EMPTY :
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			case com.google.javascript.rhino.Token.VOID :
				return getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
			case com.google.javascript.rhino.Token.STRING :
				com.google.javascript.rhino.jstype.JSType namedType = getType(scope, n.getString(), sourceName, n.getLineno(), n.getCharno());
				if ((resolveMode) != (com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES)) {
					namedType = namedType.resolveInternal(reporter, scope);
				}
				if ((namedType instanceof com.google.javascript.rhino.jstype.ObjectType) && (!(nonNullableTypeNames.contains(n.getString())))) {
					com.google.javascript.rhino.Node typeList = n.getFirstChild();
					if ((typeList != null) && (("Array".equals(n.getString())) || ("Object".equals(n.getString())))) {
						com.google.javascript.rhino.jstype.JSType parameterType = createFromTypeNodesInternal(typeList.getLastChild(), sourceName, scope);
						namedType = new com.google.javascript.rhino.jstype.ParameterizedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, ((com.google.javascript.rhino.jstype.ObjectType) (namedType)), parameterType);
						if (typeList.hasMoreThanOneChild()) {
							com.google.javascript.rhino.jstype.JSType indexType = createFromTypeNodesInternal(typeList.getFirstChild(), sourceName, scope);
							namedType = new com.google.javascript.rhino.jstype.IndexedType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, ((com.google.javascript.rhino.jstype.ObjectType) (namedType)), indexType);
						}
					}
					return createDefaultObjectUnion(namedType);
				}else {
					return namedType;
				}
			case com.google.javascript.rhino.Token.FUNCTION :
				com.google.javascript.rhino.jstype.ObjectType thisType = null;
				boolean isConstructor = false;
				com.google.javascript.rhino.Node current = n.getFirstChild();
				if (((current.getType()) == (com.google.javascript.rhino.Token.THIS)) || ((current.getType()) == (com.google.javascript.rhino.Token.NEW))) {
					com.google.javascript.rhino.Node contextNode = current.getFirstChild();
					thisType = com.google.javascript.rhino.jstype.ObjectType.cast(createFromTypeNodesInternal(contextNode, sourceName, scope).restrictByNotNullOrUndefined());
					if (thisType == null) {
						reporter.warning(com.google.javascript.rhino.ScriptRuntime.getMessage0(((current.getType()) == (com.google.javascript.rhino.Token.THIS) ? "msg.jsdoc.function.thisnotobject" : "msg.jsdoc.function.newnotobject")), sourceName, contextNode.getLineno(), contextNode.getCharno());
					}
					isConstructor = (current.getType()) == (com.google.javascript.rhino.Token.NEW);
					current = current.getNext();
				}
				com.google.javascript.rhino.jstype.FunctionParamBuilder paramBuilder = new com.google.javascript.rhino.jstype.FunctionParamBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
				if ((current.getType()) == (com.google.javascript.rhino.Token.PARAM_LIST)) {
					com.google.javascript.rhino.Node args = current.getFirstChild();
					for (com.google.javascript.rhino.Node arg = current.getFirstChild(); arg != null; arg = arg.getNext()) {
						if ((arg.getType()) == (com.google.javascript.rhino.Token.ELLIPSIS)) {
							if ((arg.getChildCount()) == 0) {
								paramBuilder.addVarArgs(getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
							}else {
								paramBuilder.addVarArgs(createFromTypeNodesInternal(arg.getFirstChild(), sourceName, scope));
							}
						}else {
							com.google.javascript.rhino.jstype.JSType type = createFromTypeNodesInternal(arg, sourceName, scope);
							if ((arg.getType()) == (com.google.javascript.rhino.Token.EQUALS)) {
								boolean addSuccess = paramBuilder.addOptionalParams(type);
								if (!addSuccess) {
									reporter.warning(com.google.javascript.rhino.ScriptRuntime.getMessage0("msg.jsdoc.function.varargs"), sourceName, arg.getLineno(), arg.getCharno());
								}
							}else {
								paramBuilder.addRequiredParams(type);
							}
						}
					}
					current = current.getNext();
				}
				com.google.javascript.rhino.jstype.JSType returnType = createFromTypeNodesInternal(current, sourceName, scope);
				return new com.google.javascript.rhino.jstype.FunctionBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this).withParams(paramBuilder).withReturnType(returnType).withTypeOfThis(thisType).setIsConstructor(isConstructor).build();
		}
		throw new java.lang.IllegalStateException(("Unexpected node in type expression: " + (n.toString())));
	}

	private com.google.javascript.rhino.jstype.JSType createRecordTypeFromNodes(com.google.javascript.rhino.Node n, java.lang.String sourceName, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		com.google.javascript.rhino.jstype.RecordTypeBuilder builder = new com.google.javascript.rhino.jstype.RecordTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry.this);
		for (com.google.javascript.rhino.Node fieldTypeNode = n.getFirstChild(); fieldTypeNode != null; fieldTypeNode = fieldTypeNode.getNext()) {
			com.google.javascript.rhino.Node fieldNameNode = fieldTypeNode;
			boolean hasType = false;
			if ((fieldTypeNode.getType()) == (com.google.javascript.rhino.Token.COLON)) {
				fieldNameNode = fieldTypeNode.getFirstChild();
				hasType = true;
			}
			java.lang.String fieldName = fieldNameNode.getString();
			if ((fieldName.startsWith("'")) || (fieldName.startsWith("\""))) {
				fieldName = fieldName.substring(1, ((fieldName.length()) - 1));
			}
			com.google.javascript.rhino.jstype.JSType fieldType = null;
			if (hasType) {
				fieldType = createFromTypeNodesInternal(fieldTypeNode.getLastChild(), sourceName, scope);
			}else {
				fieldType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
			if ((builder.addProperty(fieldName, fieldType, fieldNameNode)) == null) {
				reporter.warning(("Duplicate record field " + fieldName), sourceName, n.getLineno(), fieldNameNode.getCharno());
			}
		}
		return builder.build();
	}

	public void setTemplateTypeNames(java.util.List<java.lang.String> names) {
		com.google.common.base.Preconditions.checkNotNull(names);
		for (java.lang.String name : names) {
			templateTypes.put(name, new com.google.javascript.rhino.jstype.TemplateType(com.google.javascript.rhino.jstype.JSTypeRegistry.this, name));
		}
	}

	public void clearTemplateTypeNames() {
		templateTypes.clear();
	}
}

