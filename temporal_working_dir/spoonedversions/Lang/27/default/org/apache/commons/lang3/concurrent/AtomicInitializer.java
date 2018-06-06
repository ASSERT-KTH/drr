

package org.apache.commons.lang3.concurrent;


public abstract class AtomicInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
	private final java.util.concurrent.atomic.AtomicReference<T> reference = new java.util.concurrent.atomic.AtomicReference<T>();

	public T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
		T result = reference.get();
		if (result == null) {
			result = initialize();
			if (!(reference.compareAndSet(null, result))) {
				result = reference.get();
			}
		}
		return result;
	}

	protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}

