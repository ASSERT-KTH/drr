

package org.apache.commons.lang;


public class ClassUtils {
	public static final char PACKAGE_SEPARATOR_CHAR = '.';

	public static final java.lang.String PACKAGE_SEPARATOR = java.lang.String.valueOf(org.apache.commons.lang.ClassUtils.PACKAGE_SEPARATOR_CHAR);

	public static final char INNER_CLASS_SEPARATOR_CHAR = '$';

	public static final java.lang.String INNER_CLASS_SEPARATOR = java.lang.String.valueOf(org.apache.commons.lang.ClassUtils.INNER_CLASS_SEPARATOR_CHAR);

	private static java.util.Map primitiveWrapperMap = new java.util.HashMap();

	static {
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Byte.TYPE, java.lang.Byte.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Character.TYPE, java.lang.Character.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Short.TYPE, java.lang.Short.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Integer.TYPE, java.lang.Integer.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Long.TYPE, java.lang.Long.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Double.TYPE, java.lang.Double.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Float.TYPE, java.lang.Float.class);
		org.apache.commons.lang.ClassUtils.primitiveWrapperMap.put(java.lang.Void.TYPE, java.lang.Void.TYPE);
	}

	private static java.util.Map wrapperPrimitiveMap = new java.util.HashMap();

	static {
		for (java.util.Iterator it = org.apache.commons.lang.ClassUtils.primitiveWrapperMap.keySet().iterator(); it.hasNext();) {
			java.lang.Class primitiveClass = ((java.lang.Class) (it.next()));
			java.lang.Class wrapperClass = ((java.lang.Class) (org.apache.commons.lang.ClassUtils.primitiveWrapperMap.get(primitiveClass)));
			if (!(primitiveClass.equals(wrapperClass))) {
				org.apache.commons.lang.ClassUtils.wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
			}
		}
	}

	private static java.util.Map abbreviationMap = new java.util.HashMap();

	private static java.util.Map reverseAbbreviationMap = new java.util.HashMap();

	private static void addAbbreviation(java.lang.String primitive, java.lang.String abbreviation) {
		org.apache.commons.lang.ClassUtils.abbreviationMap.put(primitive, abbreviation);
		org.apache.commons.lang.ClassUtils.reverseAbbreviationMap.put(abbreviation, primitive);
	}

	static {
		org.apache.commons.lang.ClassUtils.addAbbreviation("int", "I");
		org.apache.commons.lang.ClassUtils.addAbbreviation("boolean", "Z");
		org.apache.commons.lang.ClassUtils.addAbbreviation("float", "F");
		org.apache.commons.lang.ClassUtils.addAbbreviation("long", "J");
		org.apache.commons.lang.ClassUtils.addAbbreviation("short", "S");
		org.apache.commons.lang.ClassUtils.addAbbreviation("byte", "B");
		org.apache.commons.lang.ClassUtils.addAbbreviation("double", "D");
		org.apache.commons.lang.ClassUtils.addAbbreviation("char", "C");
	}

	public ClassUtils() {
		super();
	}

	public static java.lang.String getShortClassName(java.lang.Object object, java.lang.String valueIfNull) {
		if (object == null) {
			return valueIfNull;
		}
		return org.apache.commons.lang.ClassUtils.getShortClassName(object.getClass().getName());
	}

	public static java.lang.String getShortClassName(java.lang.Class cls) {
		if (cls == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return org.apache.commons.lang.ClassUtils.getShortClassName(cls.getName());
	}

	public static java.lang.String getShortClassName(java.lang.String className) {
		if (className == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		if ((className.length()) == 0) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int lastDotIdx = className.lastIndexOf(org.apache.commons.lang.ClassUtils.PACKAGE_SEPARATOR_CHAR);
		int innerIdx = className.indexOf(org.apache.commons.lang.ClassUtils.INNER_CLASS_SEPARATOR_CHAR, (lastDotIdx == (-1) ? 0 : lastDotIdx + 1));
		java.lang.String out = className.substring((lastDotIdx + 1));
		if (innerIdx != (-1)) {
			out = out.replace(org.apache.commons.lang.ClassUtils.INNER_CLASS_SEPARATOR_CHAR, org.apache.commons.lang.ClassUtils.PACKAGE_SEPARATOR_CHAR);
		}
		return out;
	}

	public static java.lang.String getPackageName(java.lang.Object object, java.lang.String valueIfNull) {
		if (object == null) {
			return valueIfNull;
		}
		return org.apache.commons.lang.ClassUtils.getPackageName(object.getClass().getName());
	}

	public static java.lang.String getPackageName(java.lang.Class cls) {
		if (cls == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return org.apache.commons.lang.ClassUtils.getPackageName(cls.getName());
	}

	public static java.lang.String getPackageName(java.lang.String className) {
		if (className == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		int i = className.lastIndexOf(org.apache.commons.lang.ClassUtils.PACKAGE_SEPARATOR_CHAR);
		if (i == (-1)) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return className.substring(0, i);
	}

	public static java.util.List getAllSuperclasses(java.lang.Class cls) {
		if (cls == null) {
			return null;
		}
		java.util.List classes = new java.util.ArrayList();
		java.lang.Class superclass = cls.getSuperclass();
		while (superclass != null) {
			classes.add(superclass);
			superclass = superclass.getSuperclass();
		} 
		return classes;
	}

	public static java.util.List getAllInterfaces(java.lang.Class cls) {
		if (cls == null) {
			return null;
		}
		java.util.List list = new java.util.ArrayList();
		while (cls != null) {
			java.lang.Class[] interfaces = cls.getInterfaces();
			for (int i = 0; i < (interfaces.length); i++) {
				if ((list.contains(interfaces[i])) == false) {
					list.add(interfaces[i]);
				}
				java.util.List superInterfaces = org.apache.commons.lang.ClassUtils.getAllInterfaces(interfaces[i]);
				for (java.util.Iterator it = superInterfaces.iterator(); it.hasNext();) {
					java.lang.Class intface = ((java.lang.Class) (it.next()));
					if ((list.contains(intface)) == false) {
						list.add(intface);
					}
				}
			}
			cls = cls.getSuperclass();
		} 
		return list;
	}

	public static java.util.List convertClassNamesToClasses(java.util.List classNames) {
		if (classNames == null) {
			return null;
		}
		java.util.List classes = new java.util.ArrayList(classNames.size());
		for (java.util.Iterator it = classNames.iterator(); it.hasNext();) {
			java.lang.String className = ((java.lang.String) (it.next()));
			try {
				classes.add(java.lang.Class.forName(className));
			} catch (java.lang.Exception ex) {
				classes.add(null);
			}
		}
		return classes;
	}

	public static java.util.List convertClassesToClassNames(java.util.List classes) {
		if (classes == null) {
			return null;
		}
		java.util.List classNames = new java.util.ArrayList(classes.size());
		for (java.util.Iterator it = classes.iterator(); it.hasNext();) {
			java.lang.Class cls = ((java.lang.Class) (it.next()));
			if (cls == null) {
				classNames.add(null);
			}else {
				classNames.add(cls.getName());
			}
		}
		return classNames;
	}

	public static boolean isAssignable(java.lang.Class[] classArray, java.lang.Class[] toClassArray) {
		if ((org.apache.commons.lang.ArrayUtils.isSameLength(classArray, toClassArray)) == false) {
			return false;
		}
		if (classArray == null) {
			classArray = org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		if (toClassArray == null) {
			toClassArray = org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY;
		}
		for (int i = 0; i < (classArray.length); i++) {
			if ((org.apache.commons.lang.ClassUtils.isAssignable(classArray[i], toClassArray[i])) == false) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAssignable(java.lang.Class cls, java.lang.Class toClass) {
		if (toClass == null) {
			return false;
		}
		if (cls == null) {
			return !(toClass.isPrimitive());
		}
		if (cls.equals(toClass)) {
			return true;
		}
		if (cls.isPrimitive()) {
			if ((toClass.isPrimitive()) == false) {
				return false;
			}
			if (java.lang.Integer.TYPE.equals(cls)) {
				return ((java.lang.Long.TYPE.equals(toClass)) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass));
			}
			if (java.lang.Long.TYPE.equals(cls)) {
				return (java.lang.Float.TYPE.equals(toClass)) || (java.lang.Double.TYPE.equals(toClass));
			}
			if (java.lang.Boolean.TYPE.equals(cls)) {
				return false;
			}
			if (java.lang.Double.TYPE.equals(cls)) {
				return false;
			}
			if (java.lang.Float.TYPE.equals(cls)) {
				return java.lang.Double.TYPE.equals(toClass);
			}
			if (java.lang.Character.TYPE.equals(cls)) {
				return (((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass));
			}
			if (java.lang.Short.TYPE.equals(cls)) {
				return (((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass));
			}
			if (java.lang.Byte.TYPE.equals(cls)) {
				return ((((java.lang.Short.TYPE.equals(toClass)) || (java.lang.Integer.TYPE.equals(toClass))) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass));
			}
			return false;
		}
		return toClass.isAssignableFrom(cls);
	}

	public static java.lang.Class primitiveToWrapper(java.lang.Class cls) {
		java.lang.Class convertedClass = cls;
		if ((cls != null) && (cls.isPrimitive())) {
			convertedClass = ((java.lang.Class) (org.apache.commons.lang.ClassUtils.primitiveWrapperMap.get(cls)));
		}
		return convertedClass;
	}

	public static java.lang.Class[] primitivesToWrappers(java.lang.Class[] classes) {
		if (classes == null) {
			return null;
		}
		if ((classes.length) == 0) {
			return classes;
		}
		java.lang.Class[] convertedClasses = new java.lang.Class[classes.length];
		for (int i = 0; i < (classes.length); i++) {
			convertedClasses[i] = org.apache.commons.lang.ClassUtils.primitiveToWrapper(classes[i]);
		}
		return convertedClasses;
	}

	public static java.lang.Class wrapperToPrimitive(java.lang.Class cls) {
		return ((java.lang.Class) (org.apache.commons.lang.ClassUtils.wrapperPrimitiveMap.get(cls)));
	}

	public static java.lang.Class[] wrappersToPrimitives(java.lang.Class[] classes) {
		if (classes == null) {
			return null;
		}
		if ((classes.length) == 0) {
			return classes;
		}
		java.lang.Class[] convertedClasses = new java.lang.Class[classes.length];
		for (int i = 0; i < (classes.length); i++) {
			convertedClasses[i] = org.apache.commons.lang.ClassUtils.wrapperToPrimitive(classes[i]);
		}
		return convertedClasses;
	}

	public static boolean isInnerClass(java.lang.Class cls) {
		if (cls == null) {
			return false;
		}
		return (cls.getName().indexOf(org.apache.commons.lang.ClassUtils.INNER_CLASS_SEPARATOR_CHAR)) >= 0;
	}

	public static java.lang.Class getClass(java.lang.ClassLoader classLoader, java.lang.String className, boolean initialize) throws java.lang.ClassNotFoundException {
		java.lang.Class clazz;
		if (org.apache.commons.lang.ClassUtils.abbreviationMap.containsKey(className)) {
			java.lang.String clsName = "[" + (org.apache.commons.lang.ClassUtils.abbreviationMap.get(className));
			clazz = java.lang.Class.forName(clsName, initialize, classLoader).getComponentType();
		}else {
			clazz = java.lang.Class.forName(org.apache.commons.lang.ClassUtils.toCanonicalName(className), initialize, classLoader);
		}
		return clazz;
	}

	public static java.lang.Class getClass(java.lang.ClassLoader classLoader, java.lang.String className) throws java.lang.ClassNotFoundException {
		return org.apache.commons.lang.ClassUtils.getClass(classLoader, className, true);
	}

	public static java.lang.Class getClass(java.lang.String className) throws java.lang.ClassNotFoundException {
		return org.apache.commons.lang.ClassUtils.getClass(className, true);
	}

	public static java.lang.Class getClass(java.lang.String className, boolean initialize) throws java.lang.ClassNotFoundException {
		java.lang.ClassLoader contextCL = java.lang.Thread.currentThread().getContextClassLoader();
		java.lang.ClassLoader loader = contextCL == null ? org.apache.commons.lang.ClassUtils.class.getClassLoader() : contextCL;
		return org.apache.commons.lang.ClassUtils.getClass(loader, className, initialize);
	}

	public static java.lang.reflect.Method getPublicMethod(java.lang.Class cls, java.lang.String methodName, java.lang.Class[] parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
		java.lang.reflect.Method declaredMethod = cls.getMethod(methodName, parameterTypes);
		if (java.lang.reflect.Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers())) {
			return declaredMethod;
		}
		java.util.List candidateClasses = new java.util.ArrayList();
		candidateClasses.addAll(org.apache.commons.lang.ClassUtils.getAllInterfaces(cls));
		candidateClasses.addAll(org.apache.commons.lang.ClassUtils.getAllSuperclasses(cls));
		for (java.util.Iterator it = candidateClasses.iterator(); it.hasNext();) {
			java.lang.Class candidateClass = ((java.lang.Class) (it.next()));
			if (!(java.lang.reflect.Modifier.isPublic(candidateClass.getModifiers()))) {
				continue;
			}
			java.lang.reflect.Method candidateMethod;
			try {
				candidateMethod = candidateClass.getMethod(methodName, parameterTypes);
			} catch (java.lang.NoSuchMethodException ex) {
				continue;
			}
			if (java.lang.reflect.Modifier.isPublic(candidateMethod.getDeclaringClass().getModifiers())) {
				return candidateMethod;
			}
		}
		throw new java.lang.NoSuchMethodException(((("Can't find a public method for " + methodName) + " ") + (org.apache.commons.lang.ArrayUtils.toString(parameterTypes))));
	}

	private static java.lang.String toCanonicalName(java.lang.String className) {
		className = org.apache.commons.lang.StringUtils.deleteWhitespace(className);
		if (className == null) {
			throw new org.apache.commons.lang.NullArgumentException("className");
		}else
			if (className.endsWith("[]")) {
				java.lang.StringBuffer classNameBuffer = new java.lang.StringBuffer();
				while (className.endsWith("[]")) {
					className = className.substring(0, ((className.length()) - 2));
					classNameBuffer.append("[");
				} 
				java.lang.String abbreviation = ((java.lang.String) (org.apache.commons.lang.ClassUtils.abbreviationMap.get(className)));
				if (abbreviation != null) {
					classNameBuffer.append(abbreviation);
				}else {
					classNameBuffer.append("L").append(className).append(";");
				}
				className = classNameBuffer.toString();
			}
		
		return className;
	}

	public static java.lang.Class[] toClass(java.lang.Object[] array) {
		if (array == null) {
			return null;
		}else
			if ((array.length) == 0) {
				return org.apache.commons.lang.ArrayUtils.EMPTY_CLASS_ARRAY;
			}
		
		java.lang.Class[] classes = new java.lang.Class[array.length];
		for (int i = 0; i < (array.length); i++) {
			classes[i] = array[i].getClass();
		}
		return classes;
	}

	public static java.lang.String getShortCanonicalName(java.lang.Object object, java.lang.String valueIfNull) {
		if (object == null) {
			return valueIfNull;
		}
		return org.apache.commons.lang.ClassUtils.getShortCanonicalName(object.getClass().getName());
	}

	public static java.lang.String getShortCanonicalName(java.lang.Class cls) {
		if (cls == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return org.apache.commons.lang.ClassUtils.getShortCanonicalName(cls.getName());
	}

	public static java.lang.String getShortCanonicalName(java.lang.String canonicalName) {
		return org.apache.commons.lang.ClassUtils.getShortClassName(org.apache.commons.lang.ClassUtils.getCanonicalName(canonicalName));
	}

	public static java.lang.String getPackageCanonicalName(java.lang.Object object, java.lang.String valueIfNull) {
		if (object == null) {
			return valueIfNull;
		}
		return org.apache.commons.lang.ClassUtils.getPackageCanonicalName(object.getClass().getName());
	}

	public static java.lang.String getPackageCanonicalName(java.lang.Class cls) {
		if (cls == null) {
			return org.apache.commons.lang.StringUtils.EMPTY;
		}
		return org.apache.commons.lang.ClassUtils.getPackageCanonicalName(cls.getName());
	}

	public static java.lang.String getPackageCanonicalName(java.lang.String canonicalName) {
		return org.apache.commons.lang.ClassUtils.getPackageName(org.apache.commons.lang.ClassUtils.getCanonicalName(canonicalName));
	}

	private static java.lang.String getCanonicalName(java.lang.String className) {
		className = org.apache.commons.lang.StringUtils.deleteWhitespace(className);
		if (className == null) {
			return null;
		}else {
			int dim = 0;
			while (className.startsWith("[")) {
				dim++;
				className = className.substring(1);
			} 
			if (dim < 1) {
				return className;
			}else {
				if (className.startsWith("L")) {
					className = className.substring(1, (className.endsWith(";") ? (className.length()) - 1 : className.length()));
				}else {
					if ((className.length()) > 0) {
						className = ((java.lang.String) (org.apache.commons.lang.ClassUtils.reverseAbbreviationMap.get(className.substring(0, 1))));
					}
				}
				java.lang.StringBuffer canonicalClassNameBuffer = new java.lang.StringBuffer(className);
				for (int i = 0; i < dim; i++) {
					canonicalClassNameBuffer.append("[]");
				}
				return canonicalClassNameBuffer.toString();
			}
		}
	}
}

