

package org.jfree.chart.util;


public class StrokeList extends org.jfree.chart.util.AbstractObjectList {
	public StrokeList() {
		super();
	}

	public java.awt.Stroke getStroke(int index) {
		return ((java.awt.Stroke) (get(index)));
	}

	public void setStroke(int index, java.awt.Stroke stroke) {
		set(index, stroke);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.util.StrokeList.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.util.StrokeList) {
			return super.equals(obj);
		}
		return false;
	}

	public int hashCode() {
		return super.hashCode();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		int count = size();
		stream.writeInt(count);
		for (int i = 0; i < count; i++) {
			java.awt.Stroke stroke = getStroke(i);
			if (stroke != null) {
				stream.writeInt(i);
				org.jfree.chart.util.SerialUtilities.writeStroke(stroke, stream);
			}else {
				stream.writeInt((-1));
			}
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		int count = stream.readInt();
		for (int i = 0; i < count; i++) {
			int index = stream.readInt();
			if (index != (-1)) {
				setStroke(index, org.jfree.chart.util.SerialUtilities.readStroke(stream));
			}
		}
	}
}

