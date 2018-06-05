

package com.google.javascript.jscomp;


public class Result {
	public final boolean success;

	public final com.google.javascript.jscomp.JSError[] errors;

	public final com.google.javascript.jscomp.JSError[] warnings;

	public final java.lang.String debugLog;

	public final com.google.javascript.jscomp.VariableMap variableMap;

	public final com.google.javascript.jscomp.VariableMap propertyMap;

	public final com.google.javascript.jscomp.VariableMap namedAnonFunctionMap;

	public final com.google.javascript.jscomp.VariableMap stringMap;

	public final com.google.javascript.jscomp.FunctionInformationMap functionInformationMap;

	public final com.google.javascript.jscomp.SourceMap sourceMap;

	public final java.util.Map<java.lang.String, java.lang.Integer> cssNames;

	public final java.lang.String externExport;

	public final java.lang.String idGeneratorMap;

	Result(com.google.javascript.jscomp.JSError[] errors, com.google.javascript.jscomp.JSError[] warnings, java.lang.String debugLog, com.google.javascript.jscomp.VariableMap variableMap, com.google.javascript.jscomp.VariableMap propertyMap, com.google.javascript.jscomp.VariableMap namedAnonFunctionMap, com.google.javascript.jscomp.VariableMap stringMap, com.google.javascript.jscomp.FunctionInformationMap functionInformationMap, com.google.javascript.jscomp.SourceMap sourceMap, java.lang.String externExport, java.util.Map<java.lang.String, java.lang.Integer> cssNames, java.lang.String idGeneratorMap) {
		this.success = (errors.length) == 0;
		this.errors = errors;
		this.warnings = warnings;
		this.debugLog = debugLog;
		this.variableMap = variableMap;
		this.propertyMap = propertyMap;
		this.namedAnonFunctionMap = namedAnonFunctionMap;
		this.stringMap = stringMap;
		this.functionInformationMap = functionInformationMap;
		this.sourceMap = sourceMap;
		this.externExport = externExport;
		this.cssNames = cssNames;
		this.idGeneratorMap = idGeneratorMap;
	}

	public Result(com.google.javascript.jscomp.JSError[] errors, com.google.javascript.jscomp.JSError[] warnings, java.lang.String debugLog, com.google.javascript.jscomp.VariableMap variableMap, com.google.javascript.jscomp.VariableMap propertyMap, com.google.javascript.jscomp.VariableMap namedAnonFunctionMap, com.google.javascript.jscomp.FunctionInformationMap functionInformationMap, com.google.javascript.jscomp.SourceMap sourceMap, java.lang.String externExport) {
		this(errors, warnings, debugLog, variableMap, propertyMap, namedAnonFunctionMap, null, functionInformationMap, sourceMap, externExport, null, null);
	}
}

