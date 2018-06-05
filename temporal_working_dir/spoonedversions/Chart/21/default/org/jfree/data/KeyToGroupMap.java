

package org.jfree.data;


public class KeyToGroupMap implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2228169345475318082L;

	private java.lang.Comparable defaultGroup;

	private java.util.List groups;

	private java.util.Map keyToGroupMap;

	public KeyToGroupMap() {
		this("Default Group");
	}

	public KeyToGroupMap(java.lang.Comparable defaultGroup) {
		if (defaultGroup == null) {
			throw new java.lang.IllegalArgumentException("Null 'defaultGroup' argument.");
		}
		org.jfree.data.KeyToGroupMap.this.defaultGroup = defaultGroup;
		org.jfree.data.KeyToGroupMap.this.groups = new java.util.ArrayList();
		org.jfree.data.KeyToGroupMap.this.keyToGroupMap = new java.util.HashMap();
	}

	public int getGroupCount() {
		return (org.jfree.data.KeyToGroupMap.this.groups.size()) + 1;
	}

	public java.util.List getGroups() {
		java.util.List result = new java.util.ArrayList();
		result.add(org.jfree.data.KeyToGroupMap.this.defaultGroup);
		java.util.Iterator iterator = org.jfree.data.KeyToGroupMap.this.groups.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable group = ((java.lang.Comparable) (iterator.next()));
			if (!(result.contains(group))) {
				result.add(group);
			}
		} 
		return result;
	}

	public int getGroupIndex(java.lang.Comparable group) {
		int result = org.jfree.data.KeyToGroupMap.this.groups.indexOf(group);
		if (result < 0) {
			if (org.jfree.data.KeyToGroupMap.this.defaultGroup.equals(group)) {
				result = 0;
			}
		}else {
			result = result + 1;
		}
		return result;
	}

	public java.lang.Comparable getGroup(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		java.lang.Comparable result = org.jfree.data.KeyToGroupMap.this.defaultGroup;
		java.lang.Comparable group = ((java.lang.Comparable) (org.jfree.data.KeyToGroupMap.this.keyToGroupMap.get(key)));
		if (group != null) {
			result = group;
		}
		return result;
	}

	public void mapKeyToGroup(java.lang.Comparable key, java.lang.Comparable group) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		java.lang.Comparable currentGroup = getGroup(key);
		if (!(currentGroup.equals(org.jfree.data.KeyToGroupMap.this.defaultGroup))) {
			if (!(currentGroup.equals(group))) {
				int count = getKeyCount(currentGroup);
				if (count == 1) {
					org.jfree.data.KeyToGroupMap.this.groups.remove(currentGroup);
				}
			}
		}
		if (group == null) {
			org.jfree.data.KeyToGroupMap.this.keyToGroupMap.remove(key);
		}else {
			if (!(org.jfree.data.KeyToGroupMap.this.groups.contains(group))) {
				if (!(org.jfree.data.KeyToGroupMap.this.defaultGroup.equals(group))) {
					org.jfree.data.KeyToGroupMap.this.groups.add(group);
				}
			}
			org.jfree.data.KeyToGroupMap.this.keyToGroupMap.put(key, group);
		}
	}

	public int getKeyCount(java.lang.Comparable group) {
		if (group == null) {
			throw new java.lang.IllegalArgumentException("Null 'group' argument.");
		}
		int result = 0;
		java.util.Iterator iterator = org.jfree.data.KeyToGroupMap.this.keyToGroupMap.values().iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable g = ((java.lang.Comparable) (iterator.next()));
			if (group.equals(g)) {
				result++;
			}
		} 
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.KeyToGroupMap.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.KeyToGroupMap)) {
			return false;
		}
		org.jfree.data.KeyToGroupMap that = ((org.jfree.data.KeyToGroupMap) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.data.KeyToGroupMap.this.defaultGroup, that.defaultGroup))) {
			return false;
		}
		if (!(org.jfree.data.KeyToGroupMap.this.keyToGroupMap.equals(that.keyToGroupMap))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.KeyToGroupMap result = ((org.jfree.data.KeyToGroupMap) (super.clone()));
		result.defaultGroup = ((java.lang.Comparable) (org.jfree.data.KeyToGroupMap.clone(org.jfree.data.KeyToGroupMap.this.defaultGroup)));
		result.groups = ((java.util.List) (org.jfree.data.KeyToGroupMap.clone(org.jfree.data.KeyToGroupMap.this.groups)));
		result.keyToGroupMap = ((java.util.Map) (org.jfree.data.KeyToGroupMap.clone(org.jfree.data.KeyToGroupMap.this.keyToGroupMap)));
		return result;
	}

	private static java.lang.Object clone(java.lang.Object object) {
		if (object == null) {
			return null;
		}
		java.lang.Class c = object.getClass();
		java.lang.Object result = null;
		try {
			java.lang.reflect.Method m = c.getMethod("clone", ((java.lang.Class[]) (null)));
			if (java.lang.reflect.Modifier.isPublic(m.getModifiers())) {
				try {
					result = m.invoke(object, ((java.lang.Object[]) (null)));
				} catch (java.lang.Exception e) {
					e.printStackTrace();
				}
			}
		} catch (java.lang.NoSuchMethodException e) {
			result = object;
		}
		return result;
	}

	private static java.util.Collection clone(java.util.Collection list) throws java.lang.CloneNotSupportedException {
		java.util.Collection result = null;
		if (list != null) {
			try {
				java.util.List clone = ((java.util.List) (list.getClass().newInstance()));
				java.util.Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					clone.add(org.jfree.data.KeyToGroupMap.clone(iterator.next()));
				} 
				result = clone;
			} catch (java.lang.Exception e) {
				throw new java.lang.CloneNotSupportedException("Exception.");
			}
		}
		return result;
	}
}

