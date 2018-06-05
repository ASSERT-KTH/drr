

package org.jfree.chart.util;


public class StrokeMap implements java.io.Serializable , java.lang.Cloneable {
	static final long serialVersionUID = -8148916785963525169L;

	private transient java.util.Map store;

	public StrokeMap() {
		org.jfree.chart.util.StrokeMap.this.store = new java.util.TreeMap();
	}

	public java.awt.Stroke getStroke(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		return ((java.awt.Stroke) (org.jfree.chart.util.StrokeMap.this.store.get(key)));
	}

	public boolean containsKey(java.lang.Comparable key) {
		return org.jfree.chart.util.StrokeMap.this.store.containsKey(key);
	}

	public void put(java.lang.Comparable key, java.awt.Stroke stroke) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.chart.util.StrokeMap.this.store.put(key, stroke);
	}

	public void clear() {
		org.jfree.chart.util.StrokeMap.this.store.clear();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.StrokeMap.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.StrokeMap)) {
			return false;
		}
		org.jfree.chart.util.StrokeMap that = ((org.jfree.chart.util.StrokeMap) (obj));
		if ((org.jfree.chart.util.StrokeMap.this.store.size()) != (that.store.size())) {
			return false;
		}
		java.util.Set keys = org.jfree.chart.util.StrokeMap.this.store.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			java.awt.Stroke s1 = getStroke(key);
			java.awt.Stroke s2 = that.getStroke(key);
			if (!(org.jfree.chart.util.ObjectUtilities.equal(s1, s2))) {
				return false;
			}
		} 
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		stream.writeInt(org.jfree.chart.util.StrokeMap.this.store.size());
		java.util.Set keys = org.jfree.chart.util.StrokeMap.this.store.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			stream.writeObject(key);
			java.awt.Stroke stroke = getStroke(key);
			org.jfree.chart.util.SerialUtilities.writeStroke(stroke, stream);
		} 
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.util.StrokeMap.this.store = new java.util.TreeMap();
		int keyCount = stream.readInt();
		for (int i = 0; i < keyCount; i++) {
			java.lang.Comparable key = ((java.lang.Comparable) (stream.readObject()));
			java.awt.Stroke stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
			org.jfree.chart.util.StrokeMap.this.store.put(key, stroke);
		}
	}
}

