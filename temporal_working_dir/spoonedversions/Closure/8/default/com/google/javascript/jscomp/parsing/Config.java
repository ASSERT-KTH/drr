

package com.google.javascript.jscomp.parsing;


public class Config {
	public enum LanguageMode {
ECMASCRIPT3, ECMASCRIPT5, ECMASCRIPT5_STRICT;	}

	final boolean parseJsDocDocumentation;

	final boolean isIdeMode;

	final java.util.Map<java.lang.String, com.google.javascript.jscomp.parsing.Annotation> annotationNames;

	final java.util.Set<java.lang.String> suppressionNames;

	final com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode;

	final boolean acceptConstKeyword;

	Config(java.util.Set<java.lang.String> annotationWhitelist, java.util.Set<java.lang.String> suppressionNames, boolean isIdeMode, com.google.javascript.jscomp.parsing.Config.LanguageMode languageMode, boolean acceptConstKeyword) {
		this.annotationNames = com.google.javascript.jscomp.parsing.Config.buildAnnotationNames(annotationWhitelist);
		this.parseJsDocDocumentation = isIdeMode;
		this.suppressionNames = suppressionNames;
		this.isIdeMode = isIdeMode;
		this.languageMode = languageMode;
		this.acceptConstKeyword = acceptConstKeyword;
	}

	private static java.util.Map<java.lang.String, com.google.javascript.jscomp.parsing.Annotation> buildAnnotationNames(java.util.Set<java.lang.String> annotationWhitelist) {
		com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.javascript.jscomp.parsing.Annotation> annotationBuilder = com.google.common.collect.ImmutableMap.builder();
		annotationBuilder.putAll(com.google.javascript.jscomp.parsing.Annotation.recognizedAnnotations);
		for (java.lang.String unrecognizedAnnotation : annotationWhitelist) {
			if (!(com.google.javascript.jscomp.parsing.Annotation.recognizedAnnotations.containsKey(unrecognizedAnnotation))) {
				annotationBuilder.put(unrecognizedAnnotation, com.google.javascript.jscomp.parsing.Annotation.NOT_IMPLEMENTED);
			}
		}
		return annotationBuilder.build();
	}
}

