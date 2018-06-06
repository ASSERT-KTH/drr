

package com.google.javascript.jscomp;


public interface CssRenamingMap {
	public static enum Style {
BY_WHOLE, BY_PART;	}

	java.lang.String get(java.lang.String value);

	com.google.javascript.jscomp.CssRenamingMap.Style getStyle();

	public abstract static class ByPart implements com.google.javascript.jscomp.CssRenamingMap {
		public abstract java.lang.String get(java.lang.String value);

		public com.google.javascript.jscomp.CssRenamingMap.Style getStyle() {
			return com.google.javascript.jscomp.CssRenamingMap.Style.BY_PART;
		}
	}

	public abstract static class ByWhole implements com.google.javascript.jscomp.CssRenamingMap {
		public abstract java.lang.String get(java.lang.String value);

		public com.google.javascript.jscomp.CssRenamingMap.Style getStyle() {
			return com.google.javascript.jscomp.CssRenamingMap.Style.BY_WHOLE;
		}
	}
}

