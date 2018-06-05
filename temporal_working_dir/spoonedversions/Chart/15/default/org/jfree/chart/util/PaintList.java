

package org.jfree.chart.util;


public class PaintList extends org.jfree.chart.util.AbstractObjectList {
	public PaintList() {
		super();
	}

	public java.awt.Paint getPaint(int index) {
		return ((java.awt.Paint) (get(index)));
	}

	public void setPaint(int index, java.awt.Paint paint) {
		set(index, paint);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.util.PaintList.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.util.PaintList) {
			org.jfree.chart.util.PaintList that = ((org.jfree.chart.util.PaintList) (obj));
			int listSize = size();
			for (int i = 0; i < listSize; i++) {
				if (!(org.jfree.chart.util.PaintUtilities.equal(getPaint(i), that.getPaint(i)))) {
					return false;
				}
			}
		}
		return true;
	}

	public int hashCode() {
		return super.hashCode();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		int count = size();
		stream.writeInt(count);
		for (int i = 0; i < count; i++) {
			java.awt.Paint paint = getPaint(i);
			if (paint != null) {
				stream.writeInt(i);
				org.jfree.chart.util.SerialUtilities.writePaint(paint, stream);
			}else {
				stream.writeInt((-1));
			}
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		int count = stream.readInt();
		for (int i = 0; i < count; i++) {
			final int index = stream.readInt();
			if (index != (-1)) {
				setPaint(index, org.jfree.chart.util.SerialUtilities.readPaint(stream));
			}
		}
	}
}

