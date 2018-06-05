

package org.jfree.chart.axis;


public class TickUnits implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.axis.TickUnitSource {
	private static final long serialVersionUID = 1134174035901467545L;

	private java.util.List tickUnits;

	public TickUnits() {
		org.jfree.chart.axis.TickUnits.this.tickUnits = new java.util.ArrayList();
	}

	public void add(org.jfree.chart.axis.TickUnit unit) {
		if (unit == null) {
			throw new java.lang.NullPointerException("Null 'unit' argument.");
		}
		org.jfree.chart.axis.TickUnits.this.tickUnits.add(unit);
		java.util.Collections.sort(org.jfree.chart.axis.TickUnits.this.tickUnits);
	}

	public int size() {
		return org.jfree.chart.axis.TickUnits.this.tickUnits.size();
	}

	public org.jfree.chart.axis.TickUnit get(int pos) {
		return ((org.jfree.chart.axis.TickUnit) (org.jfree.chart.axis.TickUnits.this.tickUnits.get(pos)));
	}

	public org.jfree.chart.axis.TickUnit getLargerTickUnit(org.jfree.chart.axis.TickUnit unit) {
		int index = java.util.Collections.binarySearch(org.jfree.chart.axis.TickUnits.this.tickUnits, unit);
		if (index >= 0) {
			index = index + 1;
		}else {
			index = -index;
		}
		return ((org.jfree.chart.axis.TickUnit) (org.jfree.chart.axis.TickUnits.this.tickUnits.get(java.lang.Math.min(index, ((org.jfree.chart.axis.TickUnits.this.tickUnits.size()) - 1)))));
	}

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(org.jfree.chart.axis.TickUnit unit) {
		int index = java.util.Collections.binarySearch(org.jfree.chart.axis.TickUnits.this.tickUnits, unit);
		if (index >= 0) {
			return ((org.jfree.chart.axis.TickUnit) (org.jfree.chart.axis.TickUnits.this.tickUnits.get(index)));
		}else {
			index = -(index + 1);
			return ((org.jfree.chart.axis.TickUnit) (org.jfree.chart.axis.TickUnits.this.tickUnits.get(java.lang.Math.min(index, ((org.jfree.chart.axis.TickUnits.this.tickUnits.size()) - 1)))));
		}
	}

	public org.jfree.chart.axis.TickUnit getCeilingTickUnit(double size) {
		return getCeilingTickUnit(new org.jfree.chart.axis.NumberTickUnit(size, java.text.NumberFormat.getInstance()));
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.TickUnits clone = ((org.jfree.chart.axis.TickUnits) (super.clone()));
		clone.tickUnits = new java.util.ArrayList(org.jfree.chart.axis.TickUnits.this.tickUnits);
		return clone;
	}

	public boolean equals(java.lang.Object object) {
		if (object == null) {
			return false;
		}
		if (object == (org.jfree.chart.axis.TickUnits.this)) {
			return true;
		}
		if (object instanceof org.jfree.chart.axis.TickUnits) {
			org.jfree.chart.axis.TickUnits tu = ((org.jfree.chart.axis.TickUnits) (object));
			return tu.tickUnits.equals(org.jfree.chart.axis.TickUnits.this.tickUnits);
		}
		return false;
	}
}

