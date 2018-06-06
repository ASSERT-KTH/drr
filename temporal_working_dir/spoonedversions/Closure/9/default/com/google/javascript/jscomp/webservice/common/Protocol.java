

package com.google.javascript.jscomp.webservice.common;


public class Protocol {
	private Protocol() {
	}

	public static interface ProtocolEnum {
		public java.lang.String getValue();
	}

	public static enum RequestKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
CODE_URL("code_url"), JS_CODE("js_code"), EXCLUDE_DEFAULT_EXTERNS("exclude_default_externs"), EXTERNS_URL("externs_url"), EXTERNS_CODE("js_externs"), COMPILATION_LEVEL("compilation_level"), OUTPUT_FORMAT("output_format"), OUTPUT_INFO("output_info"), OUTPUT_FILE_NAME("output_file_name"), OUTPUT_WRAPPER("output_wrapper"), API_KEY("api_key"), FORMATTING("formatting"), WARNING_LEVEL("warning_level"), USER_ID("uid"), USE_CLOSURE("use_closure_library"), BUILD_DEBUG("debug"), CHARSET("charset"), LANGUAGE("language"), RAWJS("rawjs"), BASE("base"), MODE("mode"), SCRIPT("script"), NOCACHE("nocache");
		private static final java.util.Set<java.lang.String> permittedKeys = com.google.javascript.jscomp.webservice.common.Protocol.RequestKey.getPermittedKeys();

		private static java.util.Set<java.lang.String> getPermittedKeys() {
			java.util.Set<java.lang.String> keys = com.google.common.collect.Sets.newHashSet();
			for (com.google.javascript.jscomp.webservice.common.Protocol.RequestKey key : com.google.javascript.jscomp.webservice.common.Protocol.RequestKey.values()) {
				keys.add(key.asGetParameter());
			}
			return keys;
		}

		private final java.lang.String asGetParameter;

		private RequestKey(java.lang.String asGetParameter) {
			this.asGetParameter = asGetParameter;
		}

		public java.lang.String asGetParameter() {
			return asGetParameter;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return asGetParameter;
		}

		public static boolean isKeyValid(java.lang.String key) {
			return com.google.javascript.jscomp.webservice.common.Protocol.RequestKey.permittedKeys.contains(key.toLowerCase());
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return asGetParameter;
		}
	}

	public static enum OutputInfoKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
VARIABLE_MAP("variable_map"), COMPILED_CODE("compiled_code"), WARNINGS("warnings"), ERRORS("errors"), STATISTICS("statistics");
		private final java.lang.String value;

		private OutputInfoKey(java.lang.String value) {
			this.value = value;
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return value;
		}
	}

	public static enum FormattingKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
PRETTY_PRINT("pretty_print"), PRINT_INPUT_DELIMITER("print_input_delimiter");
		private final java.lang.String value;

		private FormattingKey(java.lang.String value) {
			this.value = value;
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return value;
		}
	}

	public static enum CompilationLevelKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
WHITESPACE_ONLY("whitespace_only"), SIMPLE_OPTIMIZATIONS("simple_optimizations"), ADVANCED_OPTIMIZATIONS("advanced_optimizations");
		private final java.lang.String value;

		CompilationLevelKey(java.lang.String value) {
			this.value = value;
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return value;
		}
	}

	public static enum WarningLevelKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
QUIET("quiet"), DEFAULT("default"), VERBOSE("verbose");
		private final java.lang.String value;

		private WarningLevelKey(java.lang.String value) {
			this.value = value;
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return value;
		}
	}

	public static enum OutputFormatKey implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
TEXT("text"), XML("xml"), JSON("json");
		private final java.lang.String value;

		private OutputFormatKey(java.lang.String value) {
			this.value = value;
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return value;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return getValue();
		}
	}

	public static enum ApiKeyResponse implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
API_KEY("api_key");
		private final java.lang.String responseParam;

		ApiKeyResponse(java.lang.String responseParam) {
			this.responseParam = responseParam;
		}

		public java.lang.String getResponseParam() {
			return responseParam;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return getResponseParam();
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return getResponseParam();
		}
	}

	public static enum ResponseTag implements com.google.javascript.jscomp.webservice.common.Protocol.ProtocolEnum {
ROOT_TAG("compilationResult"), COMPILED_CODE_TAG("compiledCode"), WARNINGS_TAG("warnings"), WARNING_TAG("warning"), ERRORS_TAG("errors"), ERROR_TAG("error"), ERROR_LINE_NO_ATTR("lineno"), ERROR_LINE_ATTR("line"), ERROR_CHAR_ATTR("charno"), ERROR_FILE_ATTR("file"), ERROR_TYPE_ATTR("type"), STATS_TAG("statistics"), ORIGINAL_SIZE_TAG("originalSize"), ORIGINAL_GZIP_SIZE_TAG("originalGzipSize"), COMPRESSED_SIZE_TAG("compressedSize"), COMPRESSED_GZIP_SIZE_TAG("compressedGzipSize"), COMPILE_TIME_TAG("compileTime"), SERVER_ERRORS_TAG("serverErrors"), SERVER_ERROR_TAG("error"), SERVER_ERROR_CODE_ATTR("code"), VARIABLE_MAP("variableMap"), VARIABLE_MAP_ENTRY("variableMapEntry"), ORIGINAL_NAME_ATTR("originalName"), NEW_NAME_ATTR("newName"), OUTPUT_FILE_PATH("outputFilePath");
		private final java.lang.String responseTag;

		private ResponseTag(java.lang.String responseTag) {
			this.responseTag = responseTag;
		}

		public java.lang.String getResponseTag() {
			return responseTag;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return getResponseTag();
		}

		@java.lang.Override
		public java.lang.String getValue() {
			return getResponseTag();
		}
	}

	public static final java.lang.String MAX_INPUT_SIZE_KEY = "com.google.javascript.jscomp.webservice.maximumInputSize";

	public static final int FALLBACK_MAX_INPUT_SIZE = 500 * 1024;

	private static int maxInputSize;

	static {
		com.google.javascript.jscomp.webservice.common.Protocol.resetMaximumInputSize();
	}

	public static final int maximumInputSize() {
		return com.google.javascript.jscomp.webservice.common.Protocol.maxInputSize;
	}

	public static final void resetMaximumInputSize() {
		java.lang.String maxInputSizeStr = java.lang.System.getProperty(com.google.javascript.jscomp.webservice.common.Protocol.MAX_INPUT_SIZE_KEY);
		if (maxInputSizeStr == null) {
			com.google.javascript.jscomp.webservice.common.Protocol.maxInputSize = com.google.javascript.jscomp.webservice.common.Protocol.FALLBACK_MAX_INPUT_SIZE;
		}else {
			com.google.javascript.jscomp.webservice.common.Protocol.maxInputSize = java.lang.Integer.parseInt(maxInputSizeStr);
		}
	}
}

