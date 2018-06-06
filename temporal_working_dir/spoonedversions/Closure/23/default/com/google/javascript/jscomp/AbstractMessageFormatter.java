

package com.google.javascript.jscomp;


public abstract class AbstractMessageFormatter implements com.google.javascript.jscomp.MessageFormatter {
	private final com.google.javascript.jscomp.SourceExcerptProvider source;

	private boolean colorize;

	public AbstractMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider source) {
		this.source = source;
	}

	public void setColorize(boolean colorize) {
		com.google.javascript.jscomp.AbstractMessageFormatter.this.colorize = colorize;
	}

	protected final com.google.javascript.jscomp.SourceExcerptProvider getSource() {
		return source;
	}

	private static final java.util.Set<java.lang.String> SUPPORTED_COLOR_TERMINALS = com.google.common.collect.ImmutableSet.of("xterm", "xterm-color", "xterm-256color", "screen-bce");

	static boolean termSupportsColor(java.lang.String term) {
		return com.google.javascript.jscomp.AbstractMessageFormatter.SUPPORTED_COLOR_TERMINALS.contains(term);
	}

	private static enum Color {
ERROR("[31m"), WARNING("[35m"), RESET("[39m");
		private final java.lang.String controlCharacter;

		Color(java.lang.String controlCharacter) {
			this.controlCharacter = controlCharacter;
		}

		public java.lang.String getControlCharacter() {
			return controlCharacter;
		}
	}

	java.lang.String getLevelName(com.google.javascript.jscomp.CheckLevel level) {
		switch (level) {
			case ERROR :
				return maybeColorize("ERROR", com.google.javascript.jscomp.AbstractMessageFormatter.Color.ERROR);
			case WARNING :
				return maybeColorize("WARNING", com.google.javascript.jscomp.AbstractMessageFormatter.Color.WARNING);
			default :
				return level.toString();
		}
	}

	private java.lang.String maybeColorize(java.lang.String text, com.google.javascript.jscomp.AbstractMessageFormatter.Color color) {
		if (!(colorize))
			return text;
		
		return ((color.getControlCharacter()) + text) + (com.google.javascript.jscomp.AbstractMessageFormatter.Color.RESET.getControlCharacter());
	}
}

