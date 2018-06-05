

package com.google.javascript.jscomp;


public abstract class BasicErrorManager implements com.google.javascript.jscomp.ErrorManager {
	private final java.util.SortedSet<com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel> messages = com.google.common.collect.Sets.newTreeSet(new com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator());

	private int errorCount = 0;

	private int warningCount = 0;

	private double typedPercent = 0.0;

	public void report(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error) {
		if (messages.add(new com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel(error, level))) {
			if (level == (com.google.javascript.jscomp.CheckLevel.ERROR)) {
				(errorCount)++;
			}else
				if (level == (com.google.javascript.jscomp.CheckLevel.WARNING)) {
					(warningCount)++;
				}
			
		}
	}

	public void generateReport() {
		for (com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel message : messages) {
			println(message.level, message.error);
		}
		printSummary();
	}

	public abstract void println(com.google.javascript.jscomp.CheckLevel level, com.google.javascript.jscomp.JSError error);

	protected abstract void printSummary();

	public int getErrorCount() {
		return errorCount;
	}

	public int getWarningCount() {
		return warningCount;
	}

	public com.google.javascript.jscomp.JSError[] getErrors() {
		return toArray(com.google.javascript.jscomp.CheckLevel.ERROR);
	}

	public com.google.javascript.jscomp.JSError[] getWarnings() {
		return toArray(com.google.javascript.jscomp.CheckLevel.WARNING);
	}

	public void setTypedPercent(double typedPercent) {
		com.google.javascript.jscomp.BasicErrorManager.this.typedPercent = typedPercent;
	}

	public double getTypedPercent() {
		return typedPercent;
	}

	private com.google.javascript.jscomp.JSError[] toArray(com.google.javascript.jscomp.CheckLevel level) {
		java.util.List<com.google.javascript.jscomp.JSError> errors = new java.util.ArrayList<com.google.javascript.jscomp.JSError>(messages.size());
		for (com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel p : messages) {
			if ((p.level) == level) {
				errors.add(p.error);
			}
		}
		return errors.toArray(new com.google.javascript.jscomp.JSError[errors.size()]);
	}

	static final class LeveledJSErrorComparator implements java.util.Comparator<com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel> {
		private static final int P1_LT_P2 = -1;

		private static final int P1_GT_P2 = 1;

		public int compare(com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel p1, com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel p2) {
			if (p2 == null) {
				if (p1 == null) {
					return 0;
				}else {
					return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_GT_P2;
				}
			}
			if ((p1.level) != (p2.level)) {
				return p2.level.compareTo(p1.level);
			}
			java.lang.String source1 = p1.error.sourceName;
			java.lang.String source2 = p2.error.sourceName;
			if ((source1 != null) && (source2 != null)) {
				int sourceCompare = source1.compareTo(source2);
				if (sourceCompare != 0) {
					return sourceCompare;
				}
			}else
				if ((source1 == null) && (source2 != null)) {
					return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_LT_P2;
				}else
					if ((source1 != null) && (source2 == null)) {
						return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_GT_P2;
					}
				
			
			int lineno1 = p1.error.lineNumber;
			int lineno2 = p2.error.lineNumber;
			if (lineno1 != lineno2) {
				return lineno1 - lineno2;
			}else
				if ((lineno1 < 0) && (0 <= lineno2)) {
					return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_LT_P2;
				}else
					if ((0 <= lineno1) && (lineno2 < 0)) {
						return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_GT_P2;
					}
				
			
			int charno1 = p1.error.getCharno();
			int charno2 = p2.error.getCharno();
			if (charno1 != charno2) {
				return charno1 - charno2;
			}else
				if ((charno1 < 0) && (0 <= charno2)) {
					return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_LT_P2;
				}else
					if ((0 <= charno1) && (charno2 < 0)) {
						return com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.P1_GT_P2;
					}
				
			
			return p1.error.description.compareTo(p2.error.description);
		}
	}

	static class ErrorWithLevel {
		final com.google.javascript.jscomp.JSError error;

		final com.google.javascript.jscomp.CheckLevel level;

		ErrorWithLevel(com.google.javascript.jscomp.JSError error, com.google.javascript.jscomp.CheckLevel level) {
			this.error = error;
			this.level = level;
		}
	}
}

