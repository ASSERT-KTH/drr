

package org.apache.commons.lang3.concurrent;


public abstract class AtomicSafeInitializer<T> implements org.apache.commons.lang3.concurrent.ConcurrentInitializer<T> {
	private final java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>> factory = new java.util.concurrent.atomic.AtomicReference<org.apache.commons.lang3.concurrent.AtomicSafeInitializer<T>>();

	private final java.util.concurrent.atomic.AtomicReference<T> reference = new java.util.concurrent.atomic.AtomicReference<T>();

	public final T get() throws org.apache.commons.lang3.concurrent.ConcurrentException {
		T result;
		while ((result = reference.get()) == null) {
			if (factory.compareAndSet(null, org.apache.commons.lang3.concurrent.AtomicSafeInitializer.this)) {
				reference.set(initialize());
			}
		} 
		return result;
	}

	protected abstract T initialize() throws org.apache.commons.lang3.concurrent.ConcurrentException;
}

