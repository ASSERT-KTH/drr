

package com.google.javascript.rhino.jstype;


public enum TernaryValue {
FALSE {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue and(com.google.javascript.rhino.jstype.TernaryValue that) {
			return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue not() {
			return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue or(com.google.javascript.rhino.jstype.TernaryValue that) {
			return that;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue xor(com.google.javascript.rhino.jstype.TernaryValue that) {
			return that;
		}

		@java.lang.Override
		public boolean toBoolean(boolean unknown) {
			return false;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "false";
		}
	}, TRUE {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue and(com.google.javascript.rhino.jstype.TernaryValue that) {
			return that;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue not() {
			return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue or(com.google.javascript.rhino.jstype.TernaryValue that) {
			return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue xor(com.google.javascript.rhino.jstype.TernaryValue that) {
			return that.not();
		}

		@java.lang.Override
		public boolean toBoolean(boolean unknown) {
			return true;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "true";
		}
	}, UNKNOWN {
		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue and(com.google.javascript.rhino.jstype.TernaryValue that) {
			return com.google.javascript.rhino.jstype.TernaryValue.FALSE.equals(that) ? com.google.javascript.rhino.jstype.TernaryValue.FALSE : com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue not() {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue or(com.google.javascript.rhino.jstype.TernaryValue that) {
			return com.google.javascript.rhino.jstype.TernaryValue.TRUE.equals(that) ? com.google.javascript.rhino.jstype.TernaryValue.TRUE : com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}

		@java.lang.Override
		public com.google.javascript.rhino.jstype.TernaryValue xor(com.google.javascript.rhino.jstype.TernaryValue that) {
			return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
		}

		@java.lang.Override
		public boolean toBoolean(boolean unknown) {
			return unknown;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return "unknown";
		}
	};
	public abstract com.google.javascript.rhino.jstype.TernaryValue and(com.google.javascript.rhino.jstype.TernaryValue that);

	public abstract com.google.javascript.rhino.jstype.TernaryValue not();

	public abstract com.google.javascript.rhino.jstype.TernaryValue or(com.google.javascript.rhino.jstype.TernaryValue that);

	public abstract com.google.javascript.rhino.jstype.TernaryValue xor(com.google.javascript.rhino.jstype.TernaryValue that);

	public abstract boolean toBoolean(boolean unknown);

	public static com.google.javascript.rhino.jstype.TernaryValue forBoolean(boolean val) {
		return val ? com.google.javascript.rhino.jstype.TernaryValue.TRUE : com.google.javascript.rhino.jstype.TernaryValue.FALSE;
	}
}

