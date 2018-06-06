

package org.jfree.chart.util;


public class PaintMap implements java.io.Serializable , java.lang.Cloneable {
	static final long serialVersionUID = -4639833772123069274L;

	private transient java.util.Map store;

	public PaintMap() {
		org.jfree.chart.util.PaintMap.this.store = new java.util.HashMap();
	}

	public java.awt.Paint getPaint(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		return ((java.awt.Paint) (org.jfree.chart.util.PaintMap.this.store.get(key)));
	}

	public boolean containsKey(java.lang.Comparable key) {
		return org.jfree.chart.util.PaintMap.this.store.containsKey(key);
	}

	public void put(java.lang.Comparable key, java.awt.Paint paint) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.chart.util.PaintMap.this.store.put(key, paint);
	}

	public void clear() {
		org.jfree.chart.util.PaintMap.this.store.clear();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.PaintMap.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.PaintMap)) {
			return false;
		}
		org.jfree.chart.util.PaintMap that = ((org.jfree.chart.util.PaintMap) (obj));
		if ((org.jfree.chart.util.PaintMap.this.store.size()) != (that.store.size())) {
			return false;
		}
		java.util.Set keys = org.jfree.chart.util.PaintMap.this.store.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			java.awt.Paint p1 = getPaint(key);
			java.awt.Paint p2 = that.getPaint(key);
			if (!(org.jfree.chart.util.PaintUtilities.equal(p1, p2))) {
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
		stream.writeInt(org.jfree.chart.util.PaintMap.this.store.size());
		java.util.Set keys = org.jfree.chart.util.PaintMap.this.store.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			stream.writeObject(key);
			java.awt.Paint paint = getPaint(key);
			org.jfree.chart.util.SerialUtilities.writePaint(paint, stream);
		} 
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.util.PaintMap.this.store = new java.util.HashMap();
		int keyCount = stream.readInt();
		for (int i = 0; i < keyCount; i++) {
			java.lang.Comparable key = ((java.lang.Comparable) (stream.readObject()));
			java.awt.Paint paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
			org.jfree.chart.util.PaintMap.this.store.put(key, paint);
		}
	}
}

