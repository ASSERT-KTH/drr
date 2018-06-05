

package com.google.javascript.jscomp;


public class DiagnosticGroups {
	public DiagnosticGroups() {
	}

	private static final java.util.Map<java.lang.String, com.google.javascript.jscomp.DiagnosticGroup> groupsByName = com.google.common.collect.Maps.newHashMap();

	static com.google.javascript.jscomp.DiagnosticGroup registerGroup(java.lang.String name, com.google.javascript.jscomp.DiagnosticGroup group) {
		com.google.javascript.jscomp.DiagnosticGroups.groupsByName.put(name, group);
		return group;
	}

	static com.google.javascript.jscomp.DiagnosticGroup registerGroup(java.lang.String name, com.google.javascript.jscomp.DiagnosticType... types) {
		com.google.javascript.jscomp.DiagnosticGroup group = new com.google.javascript.jscomp.DiagnosticGroup(name, types);
		com.google.javascript.jscomp.DiagnosticGroups.groupsByName.put(name, group);
		return group;
	}

	static com.google.javascript.jscomp.DiagnosticGroup registerGroup(java.lang.String name, com.google.javascript.jscomp.DiagnosticGroup... groups) {
		com.google.javascript.jscomp.DiagnosticGroup group = new com.google.javascript.jscomp.DiagnosticGroup(name, groups);
		com.google.javascript.jscomp.DiagnosticGroups.groupsByName.put(name, group);
		return group;
	}

	protected java.util.Map<java.lang.String, com.google.javascript.jscomp.DiagnosticGroup> getRegisteredGroups() {
		return com.google.common.collect.ImmutableMap.copyOf(com.google.javascript.jscomp.DiagnosticGroups.groupsByName);
	}

	protected com.google.javascript.jscomp.DiagnosticGroup forName(java.lang.String name) {
		return com.google.javascript.jscomp.DiagnosticGroups.groupsByName.get(name);
	}

	static final java.lang.String DIAGNOSTIC_GROUP_NAMES = "accessControls, ambiguousFunctionDecl, checkRegExp, " + (((((("checkTypes, checkVars, constantProperty, deprecated, " + "duplicateMessage, ") + "es5Strict, externsValidation, fileoverviewTags, globalThis, ") + "internetExplorerChecks, invalidCasts, missingProperties, ") + "nonStandardJsDocs, strictModuleDepCheck, typeInvalidation, ") + "undefinedVars, unknownDefines, uselessCode, ") + "visibility");

	public static com.google.javascript.jscomp.DiagnosticGroup GLOBAL_THIS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("globalThis", com.google.javascript.jscomp.CheckGlobalThis.GLOBAL_THIS);

	public static com.google.javascript.jscomp.DiagnosticGroup DEPRECATED = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("deprecated", com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_NAME, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_NAME_REASON, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_PROP, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_PROP_REASON, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_CLASS, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_CLASS_REASON);

	public static com.google.javascript.jscomp.DiagnosticGroup VISIBILITY = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("visibility", com.google.javascript.jscomp.CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS, com.google.javascript.jscomp.CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS, com.google.javascript.jscomp.CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS, com.google.javascript.jscomp.CheckAccessControls.PRIVATE_OVERRIDE, com.google.javascript.jscomp.CheckAccessControls.VISIBILITY_MISMATCH);

	public static com.google.javascript.jscomp.DiagnosticGroup CONSTANT_PROPERTY = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("constantProperty", com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_DELETED, com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);

	public static com.google.javascript.jscomp.DiagnosticGroup NON_STANDARD_JSDOC = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("nonStandardJsDocs", com.google.javascript.jscomp.RhinoErrorReporter.BAD_JSDOC_ANNOTATION);

	public static com.google.javascript.jscomp.DiagnosticGroup ACCESS_CONTROLS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("accessControls", com.google.javascript.jscomp.DiagnosticGroups.DEPRECATED, com.google.javascript.jscomp.DiagnosticGroups.VISIBILITY);

	public static com.google.javascript.jscomp.DiagnosticGroup INVALID_CASTS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("invalidCasts", com.google.javascript.jscomp.TypeValidator.INVALID_CAST);

	public static com.google.javascript.jscomp.DiagnosticGroup FILEOVERVIEW_JSDOC = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("fileoverviewTags", com.google.javascript.jscomp.RhinoErrorReporter.EXTRA_FILEOVERVIEW);

	public static com.google.javascript.jscomp.DiagnosticGroup STRICT_MODULE_DEP_CHECK = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("strictModuleDepCheck", com.google.javascript.jscomp.VarCheck.STRICT_MODULE_DEP_ERROR, com.google.javascript.jscomp.CheckGlobalNames.STRICT_MODULE_DEP_QNAME);

	public static com.google.javascript.jscomp.DiagnosticGroup EXTERNS_VALIDATION = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("externsValidation", com.google.javascript.jscomp.VarCheck.NAME_REFERENCE_IN_EXTERNS_ERROR, com.google.javascript.jscomp.VarCheck.UNDEFINED_EXTERN_VAR_ERROR);

	public static com.google.javascript.jscomp.DiagnosticGroup AMBIGUOUS_FUNCTION_DECL = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("ambiguousFunctionDecl", com.google.javascript.jscomp.VariableReferenceCheck.AMBIGUOUS_FUNCTION_DECL);

	public static com.google.javascript.jscomp.DiagnosticGroup UNKNOWN_DEFINES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("unknownDefines", com.google.javascript.jscomp.ProcessDefines.UNKNOWN_DEFINE_WARNING);

	public static com.google.javascript.jscomp.DiagnosticGroup TWEAKS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("tweakValidation", com.google.javascript.jscomp.ProcessTweaks.INVALID_TWEAK_DEFAULT_VALUE_WARNING, com.google.javascript.jscomp.ProcessTweaks.TWEAK_WRONG_GETTER_TYPE_WARNING, com.google.javascript.jscomp.ProcessTweaks.UNKNOWN_TWEAK_WARNING);

	public static com.google.javascript.jscomp.DiagnosticGroup MISSING_PROPERTIES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("missingProperties", com.google.javascript.jscomp.TypeCheck.INEXISTENT_PROPERTY);

	public static com.google.javascript.jscomp.DiagnosticGroup INTERNET_EXPLORER_CHECKS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("internetExplorerChecks", com.google.javascript.jscomp.RhinoErrorReporter.TRAILING_COMMA);

	public static com.google.javascript.jscomp.DiagnosticGroup UNDEFINED_VARIABLES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("undefinedVars", com.google.javascript.jscomp.VarCheck.UNDEFINED_VAR_ERROR);

	public static com.google.javascript.jscomp.DiagnosticGroup DEBUGGER_STATEMENT_PRESENT = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("checkDebuggerStatement", com.google.javascript.jscomp.CheckDebuggerStatement.DEBUGGER_STATEMENT_PRESENT);

	public static com.google.javascript.jscomp.DiagnosticGroup CHECK_REGEXP = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("checkRegExp", com.google.javascript.jscomp.CheckRegExp.REGEXP_REFERENCE, com.google.javascript.jscomp.CheckRegExp.MALFORMED_REGEXP);

	public static com.google.javascript.jscomp.DiagnosticGroup CHECK_TYPES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("checkTypes", com.google.javascript.jscomp.TypeValidator.ALL_DIAGNOSTICS, com.google.javascript.jscomp.TypeCheck.ALL_DIAGNOSTICS);

	public static com.google.javascript.jscomp.DiagnosticGroup CHECK_VARIABLES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("checkVars", com.google.javascript.jscomp.VarCheck.UNDEFINED_VAR_ERROR, com.google.javascript.jscomp.SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR);

	public static com.google.javascript.jscomp.DiagnosticGroup CHECK_USELESS_CODE = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("uselessCode", com.google.javascript.jscomp.CheckSideEffects.USELESS_CODE_ERROR, com.google.javascript.jscomp.CheckUnreachableCode.UNREACHABLE_CODE);

	public static com.google.javascript.jscomp.DiagnosticGroup CONST = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("const", com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_DELETED, com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE, com.google.javascript.jscomp.ConstCheck.CONST_REASSIGNED_VALUE_ERROR);

	public static com.google.javascript.jscomp.DiagnosticGroup TYPE_INVALIDATION = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("typeInvalidation", com.google.javascript.jscomp.DisambiguateProperties.Warnings.INVALIDATION);

	public static com.google.javascript.jscomp.DiagnosticGroup DUPLICATE_VARS = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("duplicate", com.google.javascript.jscomp.SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR, com.google.javascript.jscomp.TypeValidator.DUP_VAR_DECLARATION);

	public static com.google.javascript.jscomp.DiagnosticGroup ES5_STRICT = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("es5Strict", com.google.javascript.jscomp.ControlStructureCheck.USE_OF_WITH, com.google.javascript.jscomp.StrictModeCheck.UNKNOWN_VARIABLE, com.google.javascript.jscomp.StrictModeCheck.EVAL_DECLARATION, com.google.javascript.jscomp.StrictModeCheck.EVAL_ASSIGNMENT, com.google.javascript.jscomp.StrictModeCheck.ARGUMENTS_DECLARATION, com.google.javascript.jscomp.StrictModeCheck.ARGUMENTS_ASSIGNMENT, com.google.javascript.jscomp.StrictModeCheck.DELETE_VARIABLE, com.google.javascript.jscomp.StrictModeCheck.DUPLICATE_OBJECT_KEY);

	public static com.google.javascript.jscomp.DiagnosticGroup CHECK_PROVIDES = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("checkProvides", com.google.javascript.jscomp.CheckProvides.MISSING_PROVIDE_WARNING);

	public static com.google.javascript.jscomp.DiagnosticGroup DUPLICATE_MESSAGE = com.google.javascript.jscomp.DiagnosticGroups.registerGroup("duplicateMessage", com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_DUPLICATE_KEY);

	void setWarningLevel(com.google.javascript.jscomp.CompilerOptions options, java.lang.String name, com.google.javascript.jscomp.CheckLevel level) {
		com.google.javascript.jscomp.DiagnosticGroup group = forName(name);
		com.google.common.base.Preconditions.checkNotNull(group, "No warning class for name: %s", name);
		options.setWarningLevel(group, level);
	}
}

