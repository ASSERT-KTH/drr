

package org.apache.commons.lang3.concurrent;


public class ConstantInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
	private static final java.lang.String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";

	private final T object;

	public ConstantInitializer(T obj) {
		object = obj;
	}

	public final T getObject() {
		return object;
	}

	public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
		return getObject();
	}

	@java.lang.Override
	public int hashCode() {
		return (getObject()) != null ? getObject().hashCode() : 0;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((org.apache.commons.lang3.concurrent.ConstantInitializer.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.apache.commons.lang3.concurrent.ConstantInitializer<?>)) {
			return false;
		}
		org.apache.commons.lang3.concurrent.ConstantInitializer<?> c = ((org.apache.commons.lang3.concurrent.ConstantInitializer<?>) (obj));
		return org.apache.commons.lang3.ObjectUtils.equals(getObject(), c.getObject());
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format(org.apache.commons.lang3.concurrent.ConstantInitializer.FMT_TO_STRING, java.lang.System.identityHashCode(org.apache.commons.lang3.concurrent.ConstantInitializer.this), java.lang.String.valueOf(getObject()));
	}
}

