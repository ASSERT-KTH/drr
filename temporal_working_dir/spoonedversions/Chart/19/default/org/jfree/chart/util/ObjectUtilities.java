

package org.jfree.chart.util;


public final class ObjectUtilities {
	public static final java.lang.String THREAD_CONTEXT = "ThreadContext";

	public static final java.lang.String CLASS_CONTEXT = "ClassContext";

	private static java.lang.String classLoaderSource = org.jfree.chart.util.ObjectUtilities.THREAD_CONTEXT;

	private static java.lang.ClassLoader classLoader;

	private ObjectUtilities() {
	}

	public static java.lang.String getClassLoaderSource() {
		return org.jfree.chart.util.ObjectUtilities.classLoaderSource;
	}

	public static void setClassLoaderSource(final java.lang.String classLoaderSource) {
		org.jfree.chart.util.ObjectUtilities.classLoaderSource = classLoaderSource;
	}

	public static boolean equal(final java.lang.Object o1, final java.lang.Object o2) {
		if (o1 == o2) {
			return true;
		}
		if (o1 != null) {
			return o1.equals(o2);
		}else {
			return false;
		}
	}

	public static int hashCode(final java.lang.Object object) {
		int result = 0;
		if (object != null) {
			result = object.hashCode();
		}
		return result;
	}

	public static java.lang.Object clone(final java.lang.Object object) throws java.lang.CloneNotSupportedException {
		if (object == null) {
			throw new java.lang.IllegalArgumentException("Null 'object' argument.");
		}
		if (object instanceof org.jfree.chart.util.PublicCloneable) {
			final org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (object));
			return pc.clone();
		}else {
			try {
				final java.lang.reflect.Method method = object.getClass().getMethod("clone", ((java.lang.Class[]) (null)));
				if (java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
					return method.invoke(object, ((java.lang.Object[]) (null)));
				}
			} catch (java.lang.NoSuchMethodException e) {
				e.printStackTrace();
			} catch (java.lang.IllegalAccessException e) {
				e.printStackTrace();
			} catch (java.lang.reflect.InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		throw new java.lang.CloneNotSupportedException("Failed to clone.");
	}

	public static java.util.Collection deepClone(final java.util.Collection collection) throws java.lang.CloneNotSupportedException {
		if (collection == null) {
			throw new java.lang.IllegalArgumentException("Null 'collection' argument.");
		}
		final java.util.Collection result = ((java.util.Collection) (org.jfree.chart.util.ObjectUtilities.clone(collection)));
		result.clear();
		final java.util.Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			final java.lang.Object item = iterator.next();
			if (item != null) {
				result.add(org.jfree.chart.util.ObjectUtilities.clone(item));
			}else {
				result.add(null);
			}
		} 
		return result;
	}

	public static synchronized void setClassLoader(final java.lang.ClassLoader classLoader) {
		org.jfree.chart.util.ObjectUtilities.classLoader = classLoader;
	}

	public static java.lang.ClassLoader getClassLoader() {
		return org.jfree.chart.util.ObjectUtilities.classLoader;
	}

	public static synchronized java.lang.ClassLoader getClassLoader(final java.lang.Class c) {
		if ((org.jfree.chart.util.ObjectUtilities.classLoader) != null) {
			return org.jfree.chart.util.ObjectUtilities.classLoader;
		}
		if ("ThreadContext".equals(org.jfree.chart.util.ObjectUtilities.classLoaderSource)) {
			final java.lang.ClassLoader threadLoader = java.lang.Thread.currentThread().getContextClassLoader();
			if (threadLoader != null) {
				return threadLoader;
			}
		}
		final java.lang.ClassLoader applicationCL = c.getClassLoader();
		if (applicationCL == null) {
			return java.lang.ClassLoader.getSystemClassLoader();
		}else {
			return applicationCL;
		}
	}

	public static java.net.URL getResource(final java.lang.String name, final java.lang.Class c) {
		final java.lang.ClassLoader cl = org.jfree.chart.util.ObjectUtilities.getClassLoader(c);
		if (cl == null) {
			return null;
		}
		return cl.getResource(name);
	}

	public static java.net.URL getResourceRelative(final java.lang.String name, final java.lang.Class c) {
		final java.lang.ClassLoader cl = org.jfree.chart.util.ObjectUtilities.getClassLoader(c);
		final java.lang.String cname = org.jfree.chart.util.ObjectUtilities.convertName(name, c);
		if (cl == null) {
			return null;
		}
		return cl.getResource(cname);
	}

	private static java.lang.String convertName(final java.lang.String name, java.lang.Class c) {
		if (name.startsWith("/")) {
			return name.substring(1);
		}
		while (c.isArray()) {
			c = c.getComponentType();
		} 
		final java.lang.String baseName = c.getName();
		final int index = baseName.lastIndexOf('.');
		if (index == (-1)) {
			return name;
		}
		final java.lang.String pkgName = baseName.substring(0, index);
		return ((pkgName.replace('.', '/')) + "/") + name;
	}

	public static java.io.InputStream getResourceAsStream(final java.lang.String name, final java.lang.Class context) {
		final java.net.URL url = org.jfree.chart.util.ObjectUtilities.getResource(name, context);
		if (url == null) {
			return null;
		}
		try {
			return url.openStream();
		} catch (java.io.IOException e) {
			return null;
		}
	}

	public static java.io.InputStream getResourceRelativeAsStream(final java.lang.String name, final java.lang.Class context) {
		final java.net.URL url = org.jfree.chart.util.ObjectUtilities.getResourceRelative(name, context);
		if (url == null) {
			return null;
		}
		try {
			return url.openStream();
		} catch (java.io.IOException e) {
			return null;
		}
	}

	public static java.lang.Object loadAndInstantiate(final java.lang.String className, final java.lang.Class source) {
		try {
			final java.lang.ClassLoader loader = org.jfree.chart.util.ObjectUtilities.getClassLoader(source);
			final java.lang.Class c = loader.loadClass(className);
			return c.newInstance();
		} catch (java.lang.Exception e) {
			return null;
		}
	}

	public static java.lang.Object loadAndInstantiate(java.lang.String className, java.lang.Class source, java.lang.Class type) {
		try {
			java.lang.ClassLoader loader = org.jfree.chart.util.ObjectUtilities.getClassLoader(source);
			java.lang.Class c = loader.loadClass(className);
			if (type.isAssignableFrom(c)) {
				return c.newInstance();
			}
		} catch (java.lang.Exception e) {
			return null;
		}
		return null;
	}

	public static boolean isJDK14() {
		java.lang.ClassLoader loader = org.jfree.chart.util.ObjectUtilities.getClassLoader(org.jfree.chart.util.ObjectUtilities.class);
		if (loader != null) {
			try {
				loader.loadClass("java.util.RandomAccess");
				return true;
			} catch (java.lang.ClassNotFoundException e) {
				return false;
			} catch (java.lang.Exception e) {
			}
		}
		try {
			java.lang.String version = java.lang.System.getProperty("java.vm.specification.version");
			if (version == null) {
				return false;
			}
			java.lang.String[] versions = org.jfree.chart.util.ObjectUtilities.parseVersions(version);
			java.lang.String[] target = new java.lang.String[]{ "1" , "4" };
			return (org.jfree.chart.util.ArrayUtilities.compareVersionArrays(versions, target)) >= 0;
		} catch (java.lang.Exception e) {
			return false;
		}
	}

	private static java.lang.String[] parseVersions(java.lang.String version) {
		if (version == null) {
			return new java.lang.String[0];
		}
		java.util.ArrayList versions = new java.util.ArrayList();
		java.util.StringTokenizer strtok = new java.util.StringTokenizer(version, ".");
		while (strtok.hasMoreTokens()) {
			versions.add(strtok.nextToken());
		} 
		return ((java.lang.String[]) (versions.toArray(new java.lang.String[versions.size()])));
	}
}

