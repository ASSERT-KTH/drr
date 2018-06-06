

package com.google.javascript.rhino.testing;


public class Asserts {
	private Asserts() {
	}

	public static com.google.javascript.rhino.jstype.JSType assertResolvesToSame(com.google.javascript.rhino.jstype.JSType type) {
		junit.framework.Assert.assertSame(type, com.google.javascript.rhino.testing.Asserts.assertValidResolve(type));
		return type;
	}

	public static com.google.javascript.rhino.jstype.JSType assertValidResolve(com.google.javascript.rhino.jstype.JSType type) {
		return com.google.javascript.rhino.testing.Asserts.assertValidResolve(type, new com.google.javascript.rhino.testing.EmptyScope());
	}

	public static com.google.javascript.rhino.jstype.JSType assertValidResolve(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope) {
		com.google.javascript.rhino.ErrorReporter t = com.google.javascript.rhino.testing.TestErrorReporter.forNoExpectedReports();
		com.google.javascript.rhino.jstype.JSType resolvedType = type.resolve(t, scope);
		com.google.javascript.rhino.testing.Asserts.assertTypeEquals("JSType#resolve should not affect object equality", type, resolvedType);
		junit.framework.Assert.assertEquals("JSType#resolve should not affect hash codes", type.hashCode(), resolvedType.hashCode());
		return resolvedType;
	}

	public static void assertTypeNotEquals(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeNotEquals("", a, b);
	}

	public static void assertTypeNotEquals(java.lang.String message, com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		junit.framework.Assert.assertFalse(((((message + (message.isEmpty() ? "" : "\n")) + "Type: ") + b) + "\n"), a.isEquivalentTo(b));
		junit.framework.Assert.assertFalse(((((message + " Equals is not symmetric.\n") + "Type: ") + b) + "\n"), b.isEquivalentTo(a));
	}

	public static void assertTypeEquals(com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		com.google.javascript.rhino.testing.Asserts.assertTypeEquals("", a, b);
	}

	public static void assertTypeEquals(java.lang.String message, com.google.javascript.rhino.jstype.JSType a, com.google.javascript.rhino.jstype.JSType b) {
		junit.framework.Assert.assertTrue(((((((message + (message.isEmpty() ? "" : "\n")) + "Expected: ") + a) + "\n") + "Actual  : ") + b), a.isEquivalentTo(b));
		junit.framework.Assert.assertTrue(((((((message + " Equals is not symmetric.\n") + "Expected: ") + b) + "\n") + "Actual  : ") + a), b.isEquivalentTo(a));
	}
}

