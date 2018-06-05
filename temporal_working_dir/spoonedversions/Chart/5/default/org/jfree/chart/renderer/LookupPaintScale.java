

package org.jfree.chart.renderer;


public class LookupPaintScale implements java.io.Serializable , org.jfree.chart.renderer.PaintScale , org.jfree.chart.util.PublicCloneable {
	class PaintItem implements java.io.Serializable , java.lang.Comparable {
		static final long serialVersionUID = 698920578512361570L;

		double value;

		transient java.awt.Paint paint;

		public PaintItem(double value, java.awt.Paint paint) {
			org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.value = value;
			org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.paint = paint;
		}

		public int compareTo(java.lang.Object obj) {
			org.jfree.chart.renderer.LookupPaintScale.PaintItem that = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (obj));
			double d1 = org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.value;
			double d2 = that.value;
			if (d1 > d2) {
				return 1;
			}
			if (d1 < d2) {
				return -1;
			}
			return 0;
		}

		public boolean equals(java.lang.Object obj) {
			if (obj == (org.jfree.chart.renderer.LookupPaintScale.PaintItem.this)) {
				return true;
			}
			if (!(obj instanceof org.jfree.chart.renderer.LookupPaintScale.PaintItem)) {
				return false;
			}
			org.jfree.chart.renderer.LookupPaintScale.PaintItem that = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (obj));
			if ((org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.value) != (that.value)) {
				return false;
			}
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.paint, that.paint))) {
				return false;
			}
			return true;
		}

		private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
			stream.defaultWriteObject();
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.paint, stream);
		}

		private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
			stream.defaultReadObject();
			org.jfree.chart.renderer.LookupPaintScale.PaintItem.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
	}

	static final long serialVersionUID = -5239384246251042006L;

	private double lowerBound;

	private double upperBound;

	private transient java.awt.Paint defaultPaint;

	private java.util.List lookupTable;

	public LookupPaintScale() {
		this(0.0, 1.0, java.awt.Color.lightGray);
	}

	public LookupPaintScale(double lowerBound, double upperBound, java.awt.Paint defaultPaint) {
		if (lowerBound >= upperBound) {
			throw new java.lang.IllegalArgumentException("Requires lowerBound < upperBound.");
		}
		if (defaultPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.LookupPaintScale.this.lowerBound = lowerBound;
		org.jfree.chart.renderer.LookupPaintScale.this.upperBound = upperBound;
		org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint = defaultPaint;
		org.jfree.chart.renderer.LookupPaintScale.this.lookupTable = new java.util.ArrayList();
	}

	public java.awt.Paint getDefaultPaint() {
		return org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
	}

	public double getLowerBound() {
		return org.jfree.chart.renderer.LookupPaintScale.this.lowerBound;
	}

	public double getUpperBound() {
		return org.jfree.chart.renderer.LookupPaintScale.this.upperBound;
	}

	public void add(double value, java.awt.Paint paint) {
		org.jfree.chart.renderer.LookupPaintScale.PaintItem item = new org.jfree.chart.renderer.LookupPaintScale.PaintItem(value, paint);
		int index = java.util.Collections.binarySearch(org.jfree.chart.renderer.LookupPaintScale.this.lookupTable, item);
		if (index >= 0) {
			org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.set(index, item);
		}else {
			org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.add((-(index + 1)), item);
		}
	}

	public java.awt.Paint getPaint(double value) {
		if (value < (org.jfree.chart.renderer.LookupPaintScale.this.lowerBound)) {
			return org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
		}
		if (value > (org.jfree.chart.renderer.LookupPaintScale.this.upperBound)) {
			return org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
		}
		int count = org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.size();
		if (count == 0) {
			return org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
		}
		org.jfree.chart.renderer.LookupPaintScale.PaintItem item = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.get(0)));
		if (value < (item.value)) {
			return org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
		}
		int low = 0;
		int high = (org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.size()) - 1;
		while ((high - low) > 1) {
			int current = (low + high) / 2;
			item = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.get(current)));
			if (value >= (item.value)) {
				low = current;
			}else {
				high = current;
			}
		} 
		if (high > low) {
			item = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.get(high)));
			if (value < (item.value)) {
				item = ((org.jfree.chart.renderer.LookupPaintScale.PaintItem) (org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.get(low)));
			}
		}
		return item != null ? item.paint : org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.LookupPaintScale.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.LookupPaintScale)) {
			return false;
		}
		org.jfree.chart.renderer.LookupPaintScale that = ((org.jfree.chart.renderer.LookupPaintScale) (obj));
		if ((org.jfree.chart.renderer.LookupPaintScale.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.chart.renderer.LookupPaintScale.this.upperBound) != (that.upperBound)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint, that.defaultPaint))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.LookupPaintScale.this.lookupTable.equals(that.lookupTable))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.LookupPaintScale clone = ((org.jfree.chart.renderer.LookupPaintScale) (super.clone()));
		clone.lookupTable = new java.util.ArrayList(org.jfree.chart.renderer.LookupPaintScale.this.lookupTable);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.LookupPaintScale.this.defaultPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

