

package org.apache.commons.lang.enum;


public abstract class Enum implements java.io.Serializable , java.lang.Comparable {
	private static final long serialVersionUID = -487045951170455942L;

	private static final java.util.Map EMPTY_MAP = java.util.Collections.unmodifiableMap(new java.util.HashMap(0));

	private static java.util.Map cEnumClasses = new java.util.WeakHashMap();

	private final java.lang.String iName;

	private final transient int iHashCode;

	protected transient java.lang.String iToString = null;

	private static class Entry {
		final java.util.Map map = new java.util.HashMap();

		final java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(map);

		final java.util.List list = new java.util.ArrayList(25);

		final java.util.List unmodifiableList = java.util.Collections.unmodifiableList(list);

		protected Entry() {
			super();
		}
	}

	protected Enum(java.lang.String name) {
		super();
		init(name);
		iName = name;
		iHashCode = (7 + (getEnumClass().hashCode())) + (3 * (name.hashCode()));
	}

	private void init(java.lang.String name) {
		if (org.apache.commons.lang.StringUtils.isEmpty(name)) {
			throw new java.lang.IllegalArgumentException("The Enum name must not be empty or null");
		}
		java.lang.Class enumClass = getEnumClass();
		if (enumClass == null) {
			throw new java.lang.IllegalArgumentException("getEnumClass() must not be null");
		}
		java.lang.Class cls = getClass();
		boolean ok = false;
		while (((cls != null) && (cls != (org.apache.commons.lang.enum.Enum.class))) && (cls != (org.apache.commons.lang.enum.ValuedEnum.class))) {
			if (cls == enumClass) {
				ok = true;
				break;
			}
			cls = cls.getSuperclass();
		} 
		if (ok == false) {
			throw new java.lang.IllegalArgumentException("getEnumClass() must return a superclass of this class");
		}
		org.apache.commons.lang.enum.Enum.Entry entry;
		synchronized(org.apache.commons.lang.enum.Enum.class) {
			entry = ((org.apache.commons.lang.enum.Enum.Entry) (org.apache.commons.lang.enum.Enum.cEnumClasses.get(enumClass)));
			if (entry == null) {
				entry = org.apache.commons.lang.enum.Enum.createEntry(enumClass);
				java.util.Map myMap = new java.util.WeakHashMap();
				myMap.putAll(org.apache.commons.lang.enum.Enum.cEnumClasses);
				myMap.put(enumClass, entry);
				org.apache.commons.lang.enum.Enum.cEnumClasses = myMap;
			}
		}
		if (entry.map.containsKey(name)) {
			throw new java.lang.IllegalArgumentException((("The Enum name must be unique, '" + name) + "' has already been added"));
		}
		entry.map.put(name, org.apache.commons.lang.enum.Enum.this);
		entry.list.add(org.apache.commons.lang.enum.Enum.this);
	}

	protected java.lang.Object readResolve() {
		org.apache.commons.lang.enum.Enum.Entry entry = ((org.apache.commons.lang.enum.Enum.Entry) (org.apache.commons.lang.enum.Enum.cEnumClasses.get(getEnumClass())));
		if (entry == null) {
			return null;
		}
		return entry.map.get(getName());
	}

	protected static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class enumClass, java.lang.String name) {
		org.apache.commons.lang.enum.Enum.Entry entry = org.apache.commons.lang.enum.Enum.getEntry(enumClass);
		if (entry == null) {
			return null;
		}
		return ((org.apache.commons.lang.enum.Enum) (entry.map.get(name)));
	}

	protected static java.util.Map getEnumMap(java.lang.Class enumClass) {
		org.apache.commons.lang.enum.Enum.Entry entry = org.apache.commons.lang.enum.Enum.getEntry(enumClass);
		if (entry == null) {
			return org.apache.commons.lang.enum.Enum.EMPTY_MAP;
		}
		return entry.unmodifiableMap;
	}

	protected static java.util.List getEnumList(java.lang.Class enumClass) {
		org.apache.commons.lang.enum.Enum.Entry entry = org.apache.commons.lang.enum.Enum.getEntry(enumClass);
		if (entry == null) {
			return java.util.Collections.EMPTY_LIST;
		}
		return entry.unmodifiableList;
	}

	protected static java.util.Iterator iterator(java.lang.Class enumClass) {
		return org.apache.commons.lang.enum.Enum.getEnumList(enumClass).iterator();
	}

	private static org.apache.commons.lang.enum.Enum.Entry getEntry(java.lang.Class enumClass) {
		if (enumClass == null) {
			throw new java.lang.IllegalArgumentException("The Enum Class must not be null");
		}
		if ((org.apache.commons.lang.enum.Enum.class.isAssignableFrom(enumClass)) == false) {
			throw new java.lang.IllegalArgumentException("The Class must be a subclass of Enum");
		}
		org.apache.commons.lang.enum.Enum.Entry entry = ((org.apache.commons.lang.enum.Enum.Entry) (org.apache.commons.lang.enum.Enum.cEnumClasses.get(enumClass)));
		return entry;
	}

	private static org.apache.commons.lang.enum.Enum.Entry createEntry(java.lang.Class enumClass) {
		org.apache.commons.lang.enum.Enum.Entry entry = new org.apache.commons.lang.enum.Enum.Entry();
		java.lang.Class cls = enumClass.getSuperclass();
		while (((cls != null) && (cls != (org.apache.commons.lang.enum.Enum.class))) && (cls != (org.apache.commons.lang.enum.ValuedEnum.class))) {
			org.apache.commons.lang.enum.Enum.Entry loopEntry = ((org.apache.commons.lang.enum.Enum.Entry) (org.apache.commons.lang.enum.Enum.cEnumClasses.get(cls)));
			if (loopEntry != null) {
				entry.list.addAll(loopEntry.list);
				entry.map.putAll(loopEntry.map);
				break;
			}
			cls = cls.getSuperclass();
		} 
		return entry;
	}

	public final java.lang.String getName() {
		return iName;
	}

	public java.lang.Class getEnumClass() {
		return getClass();
	}

	public final boolean equals(java.lang.Object other) {
		if (other == (org.apache.commons.lang.enum.Enum.this)) {
			return true;
		}else
			if (other == null) {
				return false;
			}else
				if ((other.getClass()) == (org.apache.commons.lang.enum.Enum.this.getClass())) {
					return iName.equals(((org.apache.commons.lang.enum.Enum) (other)).iName);
				}else {
					if ((other.getClass().getName().equals(org.apache.commons.lang.enum.Enum.this.getClass().getName())) == false) {
						return false;
					}
					return iName.equals(getNameInOtherClassLoader(other));
				}
			
		
	}

	public final int hashCode() {
		return iHashCode;
	}

	public int compareTo(java.lang.Object other) {
		if (other == (org.apache.commons.lang.enum.Enum.this)) {
			return 0;
		}
		if ((other.getClass()) != (org.apache.commons.lang.enum.Enum.this.getClass())) {
			if (other.getClass().getName().equals(org.apache.commons.lang.enum.Enum.this.getClass().getName())) {
				return iName.compareTo(getNameInOtherClassLoader(other));
			}
			throw new java.lang.ClassCastException((("Different enum class '" + (org.apache.commons.lang.ClassUtils.getShortClassName(other.getClass()))) + "'"));
		}
		return iName.compareTo(((org.apache.commons.lang.enum.Enum) (other)).iName);
	}

	private java.lang.String getNameInOtherClassLoader(java.lang.Object other) {
		try {
			java.lang.reflect.Method mth = other.getClass().getMethod("getName", null);
			java.lang.String name = ((java.lang.String) (mth.invoke(other, null)));
			return name;
		} catch (java.lang.NoSuchMethodException e) {
		} catch (java.lang.IllegalAccessException e) {
		} catch (java.lang.reflect.InvocationTargetException e) {
		}
		throw new java.lang.IllegalStateException("This should not happen");
	}

	public java.lang.String toString() {
		if ((iToString) == null) {
			java.lang.String shortName = org.apache.commons.lang.ClassUtils.getShortClassName(getEnumClass());
			iToString = ((shortName + "[") + (getName())) + "]";
		}
		return iToString;
	}
}

