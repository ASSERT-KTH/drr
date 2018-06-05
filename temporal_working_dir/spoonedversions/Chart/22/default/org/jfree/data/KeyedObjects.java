

package org.jfree.data;


public class KeyedObjects implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 1321582394193530984L;

	private java.util.List data;

	public KeyedObjects() {
		org.jfree.data.KeyedObjects.this.data = new java.util.ArrayList();
	}

	public int getItemCount() {
		return org.jfree.data.KeyedObjects.this.data.size();
	}

	public java.lang.Object getObject(int item) {
		java.lang.Object result = null;
		org.jfree.data.KeyedObject kobj = ((org.jfree.data.KeyedObject) (org.jfree.data.KeyedObjects.this.data.get(item)));
		if (kobj != null) {
			result = kobj.getObject();
		}
		return result;
	}

	public java.lang.Comparable getKey(int index) {
		java.lang.Comparable result = null;
		org.jfree.data.KeyedObject item = ((org.jfree.data.KeyedObject) (org.jfree.data.KeyedObjects.this.data.get(index)));
		if (item != null) {
			result = item.getKey();
		}
		return result;
	}

	public int getIndex(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int i = 0;
		java.util.Iterator iterator = org.jfree.data.KeyedObjects.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.KeyedObject ko = ((org.jfree.data.KeyedObject) (iterator.next()));
			if (ko.getKey().equals(key)) {
				return i;
			}
			i++;
		} 
		return -1;
	}

	public java.util.List getKeys() {
		java.util.List result = new java.util.ArrayList();
		java.util.Iterator iterator = org.jfree.data.KeyedObjects.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.KeyedObject ko = ((org.jfree.data.KeyedObject) (iterator.next()));
			result.add(ko.getKey());
		} 
		return result;
	}

	public java.lang.Object getObject(java.lang.Comparable key) {
		int index = getIndex(key);
		if (index < 0) {
			throw new org.jfree.data.UnknownKeyException((("The key (" + key) + ") is not recognised."));
		}
		return getObject(index);
	}

	public void addObject(java.lang.Comparable key, java.lang.Object object) {
		setObject(key, object);
	}

	public void setObject(java.lang.Comparable key, java.lang.Object object) {
		int keyIndex = getIndex(key);
		if (keyIndex >= 0) {
			org.jfree.data.KeyedObject ko = ((org.jfree.data.KeyedObject) (org.jfree.data.KeyedObjects.this.data.get(keyIndex)));
			ko.setObject(object);
		}else {
			org.jfree.data.KeyedObject ko = new org.jfree.data.KeyedObject(key, object);
			org.jfree.data.KeyedObjects.this.data.add(ko);
		}
	}

	public void insertValue(int position, java.lang.Comparable key, java.lang.Object value) {
		if ((position < 0) || (position > (org.jfree.data.KeyedObjects.this.data.size()))) {
			throw new java.lang.IllegalArgumentException("'position' out of bounds.");
		}
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		int pos = getIndex(key);
		if (pos >= 0) {
			org.jfree.data.KeyedObjects.this.data.remove(pos);
		}
		org.jfree.data.KeyedObject item = new org.jfree.data.KeyedObject(key, value);
		if (position <= (org.jfree.data.KeyedObjects.this.data.size())) {
			org.jfree.data.KeyedObjects.this.data.add(position, item);
		}else {
			org.jfree.data.KeyedObjects.this.data.add(item);
		}
	}

	public void removeValue(int index) {
		org.jfree.data.KeyedObjects.this.data.remove(index);
	}

	public void removeValue(java.lang.Comparable key) {
		int index = getIndex(key);
		if (index < 0) {
			throw new org.jfree.data.UnknownKeyException((("The key (" + (key.toString())) + ") is not recognised."));
		}
		removeValue(index);
	}

	public void clear() {
		org.jfree.data.KeyedObjects.this.data.clear();
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.KeyedObjects clone = ((org.jfree.data.KeyedObjects) (super.clone()));
		clone.data = new java.util.ArrayList();
		java.util.Iterator iterator = org.jfree.data.KeyedObjects.this.data.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.KeyedObject ko = ((org.jfree.data.KeyedObject) (iterator.next()));
			clone.data.add(ko.clone());
		} 
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.KeyedObjects.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.KeyedObjects)) {
			return false;
		}
		org.jfree.data.KeyedObjects that = ((org.jfree.data.KeyedObjects) (obj));
		int count = getItemCount();
		if (count != (that.getItemCount())) {
			return false;
		}
		for (int i = 0; i < count; i++) {
			java.lang.Comparable k1 = getKey(i);
			java.lang.Comparable k2 = that.getKey(i);
			if (!(k1.equals(k2))) {
				return false;
			}
			java.lang.Object o1 = getObject(i);
			java.lang.Object o2 = that.getObject(i);
			if (o1 == null) {
				if (o2 != null) {
					return false;
				}
			}else {
				if (!(o1.equals(o2))) {
					return false;
				}
			}
		}
		return true;
	}

	public int hashCode() {
		return (org.jfree.data.KeyedObjects.this.data) != null ? org.jfree.data.KeyedObjects.this.data.hashCode() : 0;
	}
}

