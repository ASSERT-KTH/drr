

package org.jfree.chart.entity;


public class TitleEntity extends org.jfree.chart.entity.ChartEntity {
	private static final long serialVersionUID = -4445994133561919083L;

	private org.jfree.chart.title.Title title;

	public TitleEntity(java.awt.Shape area, org.jfree.chart.title.Title title) {
		this(area, title, null);
	}

	public TitleEntity(java.awt.Shape area, org.jfree.chart.title.Title title, java.lang.String toolTipText) {
		this(area, title, toolTipText, null);
	}

	public TitleEntity(java.awt.Shape area, org.jfree.chart.title.Title title, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		if (title == null) {
			throw new java.lang.IllegalArgumentException("Null 'title' argument.");
		}
		org.jfree.chart.entity.TitleEntity.this.title = title;
	}

	public org.jfree.chart.title.Title getTitle() {
		return org.jfree.chart.entity.TitleEntity.this.title;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("TitleEntity: ");
		buf.append("tooltip = ");
		buf.append(getToolTipText());
		return buf.toString();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.TitleEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.TitleEntity)) {
			return false;
		}
		org.jfree.chart.entity.TitleEntity that = ((org.jfree.chart.entity.TitleEntity) (obj));
		if (!(getArea().equals(that.getArea()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getToolTipText(), that.getToolTipText()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getURLText(), that.getURLText()))) {
			return false;
		}
		if (!(org.jfree.chart.entity.TitleEntity.this.title.equals(that.title))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 41;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, getToolTipText());
		result = org.jfree.chart.util.HashUtilities.hashCode(result, getURLText());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(getArea(), stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		setArea(org.jfree.chart.util.SerialUtilities.readShape(stream));
	}
}

