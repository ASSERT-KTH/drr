

package org.apache.commons.lang3.event;


public class EventListenerSupport<L> {
	private final java.util.List<L> listeners = new java.util.concurrent.CopyOnWriteArrayList<L>();

	private final L proxy;

	public static <T> org.apache.commons.lang3.event.EventListenerSupport<T> create(java.lang.Class<T> listenerInterface) {
		return new org.apache.commons.lang3.event.EventListenerSupport<T>(listenerInterface);
	}

	public EventListenerSupport(java.lang.Class<L> listenerInterface) {
		this(listenerInterface, java.lang.Thread.currentThread().getContextClassLoader());
	}

	public EventListenerSupport(java.lang.Class<L> listenerInterface, java.lang.ClassLoader classLoader) {
		org.apache.commons.lang3.Validate.notNull(listenerInterface, "Listener interface cannot be null.");
		org.apache.commons.lang3.Validate.notNull(classLoader, "ClassLoader cannot be null.");
		org.apache.commons.lang3.Validate.isTrue(listenerInterface.isInterface(), "Class {0} is not an interface", listenerInterface.getName());
		proxy = listenerInterface.cast(java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{ listenerInterface }, new ProxyInvocationHandler()));
	}

	public L fire() {
		return proxy;
	}

	public void addListener(L listener) {
		org.apache.commons.lang3.Validate.notNull(listener, "Listener object cannot be null.");
		listeners.add(listener);
	}

	int getListenerCount() {
		return listeners.size();
	}

	public void removeListener(L listener) {
		org.apache.commons.lang3.Validate.notNull(listener, "Listener object cannot be null.");
		listeners.remove(listener);
	}

	private class ProxyInvocationHandler implements java.lang.reflect.InvocationHandler {
		public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) throws java.lang.Throwable {
			for (L listener : listeners) {
				method.invoke(listener, args);
			}
			return null;
		}
	}
}

