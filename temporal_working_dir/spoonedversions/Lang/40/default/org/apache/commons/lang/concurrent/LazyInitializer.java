

package org.apache.commons.lang.concurrent;


public abstract class LazyInitializer<T> {
	private volatile T object;

	public T get() {
		T result = object;
		if (result == null) {
			synchronized(org.apache.commons.lang.concurrent.LazyInitializer.this) {
				result = object;
				if (result == null) {
					object = result = initialize();
				}
			}
		}
		return result;
	}

	protected abstract T initialize();
}

