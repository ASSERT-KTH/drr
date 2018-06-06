

package com.google.javascript.jscomp;


public enum ErrorFormat {
LEGACY {
		@java.lang.Override
		public com.google.javascript.jscomp.MessageFormatter toFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, boolean colorize) {
			com.google.javascript.jscomp.VerboseMessageFormatter formatter = new com.google.javascript.jscomp.VerboseMessageFormatter(source);
			formatter.setColorize(colorize);
			return formatter;
		}
	}, SINGLELINE {
		@java.lang.Override
		public com.google.javascript.jscomp.MessageFormatter toFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, boolean colorize) {
			com.google.javascript.jscomp.LightweightMessageFormatter formatter = new com.google.javascript.jscomp.LightweightMessageFormatter(source);
			formatter.setColorize(colorize);
			return formatter;
		}
	}, MULTILINE {
		@java.lang.Override
		public com.google.javascript.jscomp.MessageFormatter toFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, boolean colorize) {
			com.google.javascript.jscomp.LightweightMessageFormatter formatter = new com.google.javascript.jscomp.LightweightMessageFormatter(source, com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.REGION);
			formatter.setColorize(colorize);
			return formatter;
		}
	}, SOURCELESS {
		@java.lang.Override
		public com.google.javascript.jscomp.MessageFormatter toFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, boolean colorize) {
			com.google.javascript.jscomp.LightweightMessageFormatter formatter = com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource();
			formatter.setColorize(colorize);
			return formatter;
		}
	};
	public abstract com.google.javascript.jscomp.MessageFormatter toFormatter(com.google.javascript.jscomp.SourceExcerptProvider source, boolean colorize);
}

