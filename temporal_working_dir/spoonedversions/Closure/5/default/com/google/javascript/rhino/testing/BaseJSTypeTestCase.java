

package com.google.javascript.rhino.testing;


public abstract class BaseJSTypeTestCase extends junit.framework.TestCase {
	protected com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	protected com.google.javascript.rhino.testing.TestErrorReporter errorReporter;

	protected com.google.javascript.rhino.jstype.JSType ALL_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType NO_OBJECT_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType NO_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType NO_RESOLVED_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType ARRAY_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType ARRAY_TYPE;

	protected com.google.javascript.rhino.jstype.JSType BOOLEAN_OBJECT_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType BOOLEAN_OBJECT_TYPE;

	protected com.google.javascript.rhino.jstype.JSType BOOLEAN_TYPE;

	protected com.google.javascript.rhino.jstype.JSType CHECKED_UNKNOWN_TYPE;

	protected com.google.javascript.rhino.jstype.JSType DATE_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType DATE_TYPE;

	protected com.google.javascript.rhino.jstype.JSType ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.JSType EVAL_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType EVAL_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType FUNCTION_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType FUNCTION_INSTANCE_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType FUNCTION_PROTOTYPE;

	protected com.google.javascript.rhino.jstype.JSType GREATEST_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.JSType LEAST_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.JSType MATH_TYPE;

	protected com.google.javascript.rhino.jstype.JSType NULL_TYPE;

	protected com.google.javascript.rhino.jstype.JSType NUMBER_OBJECT_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType NUMBER_OBJECT_TYPE;

	protected com.google.javascript.rhino.jstype.JSType NUMBER_STRING_BOOLEAN;

	protected com.google.javascript.rhino.jstype.JSType NUMBER_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType OBJECT_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.JSType NULL_VOID;

	protected com.google.javascript.rhino.jstype.JSType OBJECT_NUMBER_STRING;

	protected com.google.javascript.rhino.jstype.JSType OBJECT_NUMBER_STRING_BOOLEAN;

	protected com.google.javascript.rhino.jstype.JSType OBJECT_PROTOTYPE;

	protected com.google.javascript.rhino.jstype.ObjectType OBJECT_TYPE;

	protected com.google.javascript.rhino.jstype.JSType RANGE_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType RANGE_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.JSType REFERENCE_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType REFERENCE_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.JSType REGEXP_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType REGEXP_TYPE;

	protected com.google.javascript.rhino.jstype.JSType STRING_OBJECT_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType STRING_OBJECT_TYPE;

	protected com.google.javascript.rhino.jstype.JSType STRING_TYPE;

	protected com.google.javascript.rhino.jstype.JSType SYNTAX_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType SYNTAX_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.JSType TYPE_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType TYPE_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType U2U_CONSTRUCTOR_TYPE;

	protected com.google.javascript.rhino.jstype.FunctionType U2U_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType UNKNOWN_TYPE;

	protected com.google.javascript.rhino.jstype.JSType URI_ERROR_FUNCTION_TYPE;

	protected com.google.javascript.rhino.jstype.ObjectType URI_ERROR_TYPE;

	protected com.google.javascript.rhino.jstype.JSType VOID_TYPE;

	protected int NATIVE_PROPERTIES_COUNT;

	@java.lang.Override
	protected void setUp() throws java.lang.Exception {
		super.setUp();
		errorReporter = new com.google.javascript.rhino.testing.TestErrorReporter(null, null);
		registry = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter);
		initTypes();
	}

	protected void initTypes() {
		ALL_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
		NO_OBJECT_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
		NO_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
		NO_RESOLVED_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE);
		ARRAY_FUNCTION_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE);
		ARRAY_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
		BOOLEAN_OBJECT_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE);
		BOOLEAN_OBJECT_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE);
		BOOLEAN_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		CHECKED_UNKNOWN_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE);
		DATE_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_FUNCTION_TYPE);
		DATE_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE);
		ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_FUNCTION_TYPE);
		ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.ERROR_TYPE);
		EVAL_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_FUNCTION_TYPE);
		EVAL_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.EVAL_ERROR_TYPE);
		FUNCTION_FUNCTION_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE);
		FUNCTION_INSTANCE_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE);
		FUNCTION_PROTOTYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE);
		GREATEST_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GREATEST_FUNCTION_TYPE);
		LEAST_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.LEAST_FUNCTION_TYPE);
		NULL_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
		NUMBER_OBJECT_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE);
		NUMBER_OBJECT_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE);
		NUMBER_STRING_BOOLEAN = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN);
		NUMBER_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		OBJECT_FUNCTION_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE);
		NULL_VOID = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_VOID);
		OBJECT_NUMBER_STRING = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING);
		OBJECT_NUMBER_STRING_BOOLEAN = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_NUMBER_STRING_BOOLEAN);
		OBJECT_PROTOTYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE);
		OBJECT_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		RANGE_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_FUNCTION_TYPE);
		RANGE_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.RANGE_ERROR_TYPE);
		REFERENCE_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE);
		REFERENCE_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.REFERENCE_ERROR_TYPE);
		REGEXP_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE);
		REGEXP_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE);
		STRING_OBJECT_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_FUNCTION_TYPE);
		STRING_OBJECT_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE);
		STRING_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		SYNTAX_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_FUNCTION_TYPE);
		SYNTAX_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.SYNTAX_ERROR_TYPE);
		TYPE_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_FUNCTION_TYPE);
		TYPE_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.TYPE_ERROR_TYPE);
		U2U_CONSTRUCTOR_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE);
		U2U_FUNCTION_TYPE = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_FUNCTION_TYPE);
		UNKNOWN_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		URI_ERROR_FUNCTION_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_FUNCTION_TYPE);
		URI_ERROR_TYPE = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.URI_ERROR_TYPE);
		VOID_TYPE = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addNativeProperties(registry);
		NATIVE_PROPERTIES_COUNT = OBJECT_TYPE.getPropertiesCount();
	}

	public static void addNativeProperties(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		com.google.javascript.rhino.jstype.JSType booleanType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE);
		com.google.javascript.rhino.jstype.JSType numberType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
		com.google.javascript.rhino.jstype.JSType stringType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
		com.google.javascript.rhino.jstype.JSType unknownType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		com.google.javascript.rhino.jstype.ObjectType objectType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
		com.google.javascript.rhino.jstype.ObjectType arrayType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
		com.google.javascript.rhino.jstype.ObjectType dateType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_TYPE);
		com.google.javascript.rhino.jstype.ObjectType regexpType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_TYPE);
		com.google.javascript.rhino.jstype.ObjectType booleanObjectType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.ObjectType numberObjectType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.ObjectType stringObjectType = registry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE);
		com.google.javascript.rhino.jstype.ObjectType objectPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "constructor", objectType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "toLocaleString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "valueOf", unknownType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "hasOwnProperty", booleanType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "isPrototypeOf", booleanType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, objectPrototype, "propertyIsEnumerable", booleanType);
		com.google.javascript.rhino.jstype.ObjectType arrayPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "constructor", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "toLocaleString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "concat", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "join", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "pop", unknownType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "push", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "reverse", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "shift", unknownType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "slice", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "sort", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "splice", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, arrayPrototype, "unshift", numberType);
		arrayType.defineDeclaredProperty("length", numberType, null);
		com.google.javascript.rhino.jstype.ObjectType booleanPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_OBJECT_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, booleanPrototype, "constructor", booleanObjectType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, booleanPrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, booleanPrototype, "valueOf", booleanType);
		com.google.javascript.rhino.jstype.ObjectType datePrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.DATE_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "constructor", dateType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toDateString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toTimeString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toLocaleString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toLocaleDateString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toLocaleTimeString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "valueOf", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getTime", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getFullYear", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCFullYear", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getMonth", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCMonth", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getDate", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCDate", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getDay", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCDay", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getHours", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCHours", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getMinutes", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCMinutes", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getSeconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCSeconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getMilliseconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getUTCMilliseconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "getTimezoneOffset", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setTime", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setMilliseconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCMilliseconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setSeconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCSeconds", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setMinutes", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCMinutes", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setHours", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCHours", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setDate", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCDate", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setMonth", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCMonth", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setFullYear", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "setUTCFullYear", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toUTCString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, datePrototype, "toGMTString", stringType);
		com.google.javascript.rhino.jstype.ObjectType numberPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "constructor", numberObjectType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "toLocaleString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "valueOf", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "toFixed", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "toExponential", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, numberPrototype, "toPrecision", stringType);
		com.google.javascript.rhino.jstype.ObjectType regexpPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.REGEXP_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, regexpPrototype, "constructor", regexpType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, regexpPrototype, "exec", registry.createNullableType(arrayType));
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, regexpPrototype, "test", booleanType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, regexpPrototype, "toString", stringType);
		regexpType.defineDeclaredProperty("source", stringType, null);
		regexpType.defineDeclaredProperty("global", booleanType, null);
		regexpType.defineDeclaredProperty("ignoreCase", booleanType, null);
		regexpType.defineDeclaredProperty("multiline", booleanType, null);
		regexpType.defineDeclaredProperty("lastIndex", numberType, null);
		com.google.javascript.rhino.jstype.ObjectType stringPrototype = registry.getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_FUNCTION_TYPE).getPrototype();
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "constructor", stringObjectType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "toString", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "valueOf", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "charAt", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "charCodeAt", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "concat", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "indexOf", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "lastIndexOf", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "localeCompare", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "match", registry.createNullableType(arrayType));
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "replace", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "search", numberType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "slice", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "split", arrayType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "substring", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "toLowerCase", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "toLocaleLowerCase", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "toUpperCase", stringType);
		com.google.javascript.rhino.testing.BaseJSTypeTestCase.addMethod(registry, stringPrototype, "toLocaleUpperCase", stringType);
		stringObjectType.defineDeclaredProperty("length", numberType, null);
	}

	private static void addMethod(com.google.javascript.rhino.jstype.JSTypeRegistry registry, com.google.javascript.rhino.jstype.ObjectType receivingType, java.lang.String methodName, com.google.javascript.rhino.jstype.JSType returnType) {
		receivingType.defineDeclaredProperty(methodName, new com.google.javascript.rhino.jstype.FunctionBuilder(registry).withReturnType(returnType).build(), null);
	}

	protected com.google.javascript.rhino.jstype.JSType createUnionType(com.google.javascript.rhino.jstype.JSType... variants) {
		return registry.createUnionType(variants);
	}

	protected com.google.javascript.rhino.jstype.RecordTypeBuilder createRecordTypeBuilder() {
		return new com.google.javascript.rhino.jstype.RecordTypeBuilder(registry);
	}

	protected com.google.javascript.rhino.jstype.JSType createNullableType(com.google.javascript.rhino.jstype.JSType type) {
		return registry.createNullableType(type);
	}

	protected com.google.javascript.rhino.jstype.JSType createOptionalType(com.google.javascript.rhino.jstype.JSType type) {
		return registry.createOptionalType(type);
	}

	protected com.google.javascript.rhino.jstype.JSType createTemplatizedType(com.google.javascript.rhino.jstype.JSType baseType, com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> templatizedTypes) {
		return registry.createTemplatizedType(baseType, templatizedTypes);
	}

	protected void assertTypeEquals(com.google.javascript.rhino.jstype.JSType expected, com.google.javascript.rhino.Node actual) {
		assertTypeEquals(expected, new com.google.javascript.rhino.JSTypeExpression(actual, ""));
	}

	protected void assertTypeEquals(com.google.javascript.rhino.jstype.JSType expected, com.google.javascript.rhino.JSTypeExpression actual) {
		junit.framework.Assert.assertEquals(expected, resolve(actual));
	}

	protected com.google.javascript.rhino.jstype.JSType resolve(com.google.javascript.rhino.JSTypeExpression n, java.lang.String... warnings) {
		errorReporter.setWarnings(warnings);
		return n.evaluate(null, registry);
	}

	public static final java.lang.String ALL_NATIVE_EXTERN_TYPES = "/**\n" + ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((" * @constructor\n" + " * @param {*=} opt_value\n") + " */\n") + "function Object(opt_value) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Object}\n") + " * @param {...*} var_args\n") + " */\n") + "\n") + "function Function(var_args) {}\n") + "/**\n") + " * @constructor\n") + " * @extends {Object}\n") + " * @param {...*} var_args\n") + " * @return {!Array}\n") + " */\n") + "function Array(var_args) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @param {*=} opt_value\n") + " * @return {boolean}\n") + " */\n") + "function Boolean(opt_value) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @param {*=} opt_value\n") + " * @return {number}\n") + " */\n") + "function Number(opt_value) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @param {?=} opt_yr_num\n") + " * @param {?=} opt_mo_num\n") + " * @param {?=} opt_day_num\n") + " * @param {?=} opt_hr_num\n") + " * @param {?=} opt_min_num\n") + " * @param {?=} opt_sec_num\n") + " * @param {?=} opt_ms_num\n") + " * @return {string}\n") + " */\n") + "function Date(opt_yr_num, opt_mo_num, opt_day_num, opt_hr_num,") + "    opt_min_num, opt_sec_num, opt_ms_num) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Object}\n") + " * @param {*=} opt_str\n") + " * @return {string}\n") + " */\n") + "function String(opt_str) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @param {*=} opt_pattern\n") + " * @param {*=} opt_flags\n") + " * @return {!RegExp}\n") + " */\n") + "function RegExp(opt_pattern, opt_flags) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!Error}\n") + " */\n") + "function Error(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!EvalError}\n") + " */\n") + "function EvalError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!RangeError}\n") + " */\n") + "function RangeError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!ReferenceError}\n") + " */\n") + "function ReferenceError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!SyntaxError}\n") + " */\n") + "function SyntaxError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!TypeError}\n") + " */\n") + "function TypeError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @constructor\n") + " * @extends {Error}\n") + " * @param {*=} opt_message\n") + " * @param {*=} opt_file\n") + " * @param {*=} opt_line\n") + " * @return {!URIError}\n") + " */\n") + "function URIError(opt_message, opt_file, opt_line) {}\n") + "\n") + "/**\n") + " * @param {string} progId\n") + " * @param {string=} opt_location\n") + " * @constructor\n") + " */\n") + "function ActiveXObject(progId, opt_location) {}\n");

	protected final void assertTypeEquals(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeEquals(a, b);
	}

	protected final void assertTypeEquals(java.lang.String msg, com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeEquals(msg, a, b);
	}

	protected final void assertTypeNotEquals(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeNotEquals(a, b);
	}

	protected final void assertTypeNotEquals(java.lang.String msg, com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeNotEquals(msg, a, b);
	}

	protected final com.google.javascript.rhino.jstype.ParameterizedType parameterize(com.google.javascript.rhino.jstype.ObjectType objType, com.google.javascript.rhino.jstype.JSType t) {
		return registry.createParameterizedType(objType, t);
	}
}

