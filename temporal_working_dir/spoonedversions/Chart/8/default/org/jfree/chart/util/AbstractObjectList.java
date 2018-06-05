

package org.jfree.chart.util;


public class AbstractObjectList implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 7789833772597351595L;

	public static final int DEFAULT_INITIAL_CAPACITY = 8;

	private transient java.lang.Object[] objects;

	private int size = 0;

	private int increment = org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY;

	protected AbstractObjectList() {
		this(org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY);
	}

	protected AbstractObjectList(int initialCapacity) {
		this(initialCapacity, initialCapacity);
	}

	protected AbstractObjectList(int initialCapacity, int increment) {
		org.jfree.chart.util.AbstractObjectList.this.objects = new java.lang.Object[initialCapacity];
		org.jfree.chart.util.AbstractObjectList.this.increment = increment;
	}

	protected java.lang.Object get(int index) {
		java.lang.Object result = null;
		if ((index >= 0) && (index < (org.jfree.chart.util.AbstractObjectList.this.size))) {
			result = org.jfree.chart.util.AbstractObjectList.this.objects[index];
		}
		return result;
	}

	protected void set(int index, java.lang.Object object) {
		if (index < 0) {
			throw new java.lang.IllegalArgumentException("Requires index >= 0.");
		}
		if (index >= (org.jfree.chart.util.AbstractObjectList.this.objects.length)) {
			java.lang.Object[] enlarged = new java.lang.Object[index + (org.jfree.chart.util.AbstractObjectList.this.increment)];
			java.lang.System.arraycopy(org.jfree.chart.util.AbstractObjectList.this.objects, 0, enlarged, 0, org.jfree.chart.util.AbstractObjectList.this.objects.length);
			org.jfree.chart.util.AbstractObjectList.this.objects = enlarged;
		}
		org.jfree.chart.util.AbstractObjectList.this.objects[index] = object;
		org.jfree.chart.util.AbstractObjectList.this.size = java.lang.Math.max(org.jfree.chart.util.AbstractObjectList.this.size, (index + 1));
	}

	public void clear() {
		java.util.Arrays.fill(org.jfree.chart.util.AbstractObjectList.this.objects, null);
		org.jfree.chart.util.AbstractObjectList.this.size = 0;
	}

	public int size() {
		return org.jfree.chart.util.AbstractObjectList.this.size;
	}

	protected int indexOf(java.lang.Object object) {
		for (int index = 0; index < (org.jfree.chart.util.AbstractObjectList.this.size); index++) {
			if ((org.jfree.chart.util.AbstractObjectList.this.objects[index]) == object) {
				return index;
			}
		}
		return -1;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.util.AbstractObjectList.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.AbstractObjectList)) {
			return false;
		}
		org.jfree.chart.util.AbstractObjectList other = ((org.jfree.chart.util.AbstractObjectList) (obj));
		int listSize = size();
		for (int i = 0; i < listSize; i++) {
			if (!(org.jfree.chart.util.ObjectUtilities.equal(get(i), other.get(i)))) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int result = 127;
		int size = size();
		result = org.jfree.chart.util.HashUtilities.hashCode(result, size());
		if (size > 0) {
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.util.AbstractObjectList.this.objects[0]);
			if (size > 1) {
				result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.util.AbstractObjectList.this.objects[(size - 1)]);
				if (size > 2) {
					result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.util.AbstractObjectList.this.objects[(size / 2)]);
				}
			}
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.util.AbstractObjectList clone = ((org.jfree.chart.util.AbstractObjectList) (super.clone()));
		if ((org.jfree.chart.util.AbstractObjectList.this.objects) != null) {
			clone.objects = new java.lang.Object[org.jfree.chart.util.AbstractObjectList.this.objects.length];
			java.lang.System.arraycopy(org.jfree.chart.util.AbstractObjectList.this.objects, 0, clone.objects, 0, org.jfree.chart.util.AbstractObjectList.this.objects.length);
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		int count = size();
		stream.writeInt(count);
		for (int i = 0; i < count; i++) {
			final java.lang.Object object = get(i);
			if ((object != null) && (object instanceof java.io.Serializable)) {
				stream.writeInt(i);
				stream.writeObject(object);
			}else {
				stream.writeInt((-1));
			}
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.util.AbstractObjectList.this.objects = new java.lang.Object[org.jfree.chart.util.AbstractObjectList.this.size];
		int count = stream.readInt();
		for (int i = 0; i < count; i++) {
			int index = stream.readInt();
			if (index != (-1)) {
				set(index, stream.readObject());
			}
		}
	}
}

