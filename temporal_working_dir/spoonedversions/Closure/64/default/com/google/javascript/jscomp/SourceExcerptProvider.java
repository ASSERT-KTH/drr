

package com.google.javascript.jscomp;


public interface SourceExcerptProvider {
	enum SourceExcerpt {
LINE {
			@java.lang.Override
			public java.lang.String get(com.google.javascript.jscomp.SourceExcerptProvider source, java.lang.String sourceName, int lineNumber, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter formatter) {
				return formatter.formatLine(source.getSourceLine(sourceName, lineNumber), lineNumber);
			}
		}, REGION {
			@java.lang.Override
			public java.lang.String get(com.google.javascript.jscomp.SourceExcerptProvider source, java.lang.String sourceName, int lineNumber, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter formatter) {
				return formatter.formatRegion(source.getSourceRegion(sourceName, lineNumber));
			}
		};
		public abstract java.lang.String get(com.google.javascript.jscomp.SourceExcerptProvider source, java.lang.String sourceName, int lineNumber, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter formatter);
	}

	java.lang.String getSourceLine(java.lang.String sourceName, int lineNumber);

	com.google.javascript.jscomp.Region getSourceRegion(java.lang.String sourceName, int lineNumber);

	interface ExcerptFormatter {
		java.lang.String formatLine(java.lang.String line, int lineNumber);

		java.lang.String formatRegion(com.google.javascript.jscomp.Region region);
	}
}

