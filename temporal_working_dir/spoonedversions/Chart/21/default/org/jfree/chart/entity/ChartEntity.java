

package org.jfree.chart.entity;


public class ChartEntity implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -4445994133561919083L;

	private transient java.awt.Shape area;

	private java.lang.String toolTipText;

	private java.lang.String urlText;

	public ChartEntity(java.awt.Shape area) {
		this(area, null);
	}

	public ChartEntity(java.awt.Shape area, java.lang.String toolTipText) {
		this(area, toolTipText, null);
	}

	public ChartEntity(java.awt.Shape area, java.lang.String toolTipText, java.lang.String urlText) {
		if (area == null) {
			throw new java.lang.IllegalArgumentException("Null 'area' argument.");
		}
		org.jfree.chart.entity.ChartEntity.this.area = area;
		org.jfree.chart.entity.ChartEntity.this.toolTipText = toolTipText;
		org.jfree.chart.entity.ChartEntity.this.urlText = urlText;
	}

	public java.awt.Shape getArea() {
		return org.jfree.chart.entity.ChartEntity.this.area;
	}

	public void setArea(java.awt.Shape area) {
		if (area == null) {
			throw new java.lang.IllegalArgumentException("Null 'area' argument.");
		}
		org.jfree.chart.entity.ChartEntity.this.area = area;
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.entity.ChartEntity.this.toolTipText;
	}

	public void setToolTipText(java.lang.String text) {
		org.jfree.chart.entity.ChartEntity.this.toolTipText = text;
	}

	public java.lang.String getURLText() {
		return org.jfree.chart.entity.ChartEntity.this.urlText;
	}

	public void setURLText(java.lang.String text) {
		org.jfree.chart.entity.ChartEntity.this.urlText = text;
	}

	public java.lang.String getShapeType() {
		if ((org.jfree.chart.entity.ChartEntity.this.area) instanceof java.awt.geom.Rectangle2D) {
			return "rect";
		}else {
			return "poly";
		}
	}

	public java.lang.String getShapeCoords() {
		if ((org.jfree.chart.entity.ChartEntity.this.area) instanceof java.awt.geom.Rectangle2D) {
			return getRectCoords(((java.awt.geom.Rectangle2D) (org.jfree.chart.entity.ChartEntity.this.area)));
		}else {
			return getPolyCoords(org.jfree.chart.entity.ChartEntity.this.area);
		}
	}

	private java.lang.String getRectCoords(java.awt.geom.Rectangle2D rectangle) {
		if (rectangle == null) {
			throw new java.lang.IllegalArgumentException("Null 'rectangle' argument.");
		}
		int x1 = ((int) (rectangle.getX()));
		int y1 = ((int) (rectangle.getY()));
		int x2 = x1 + ((int) (rectangle.getWidth()));
		int y2 = y1 + ((int) (rectangle.getHeight()));
		if (x2 == x1) {
			x2++;
		}
		if (y2 == y1) {
			y2++;
		}
		return (((((x1 + ",") + y1) + ",") + x2) + ",") + y2;
	}

	private java.lang.String getPolyCoords(java.awt.Shape shape) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		boolean first = true;
		float[] coords = new float[6];
		java.awt.geom.PathIterator pi = shape.getPathIterator(null, 1.0);
		while (!(pi.isDone())) {
			pi.currentSegment(coords);
			if (first) {
				first = false;
				result.append(((int) (coords[0])));
				result.append(",").append(((int) (coords[1])));
			}else {
				result.append(",");
				result.append(((int) (coords[0])));
				result.append(",");
				result.append(((int) (coords[1])));
			}
			pi.next();
		} 
		return result.toString();
	}

	public java.lang.String getImageMapAreaTag(org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator urlTagFragmentGenerator) {
		java.lang.StringBuffer tag = new java.lang.StringBuffer();
		boolean hasURL = (org.jfree.chart.entity.ChartEntity.this.urlText) == null ? false : !(org.jfree.chart.entity.ChartEntity.this.urlText.equals(""));
		boolean hasToolTip = (org.jfree.chart.entity.ChartEntity.this.toolTipText) == null ? false : !(org.jfree.chart.entity.ChartEntity.this.toolTipText.equals(""));
		if (hasURL || hasToolTip) {
			tag.append(((((("<area shape=\"" + (getShapeType())) + "\"") + " coords=\"") + (getShapeCoords())) + "\""));
			if (hasToolTip) {
				tag.append(toolTipTagFragmentGenerator.generateToolTipFragment(org.jfree.chart.entity.ChartEntity.this.toolTipText));
			}
			if (hasURL) {
				tag.append(urlTagFragmentGenerator.generateURLFragment(org.jfree.chart.entity.ChartEntity.this.urlText));
			}
			if (!hasToolTip) {
				tag.append(" alt=\"\"");
			}
			tag.append("/>");
		}
		return tag.toString();
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("ChartEntity: ");
		buf.append("tooltip = ");
		buf.append(org.jfree.chart.entity.ChartEntity.this.toolTipText);
		return buf.toString();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.ChartEntity.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.entity.ChartEntity) {
			org.jfree.chart.entity.ChartEntity that = ((org.jfree.chart.entity.ChartEntity) (obj));
			if (!(org.jfree.chart.entity.ChartEntity.this.area.equals(that.area))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.ChartEntity.this.toolTipText, that.toolTipText))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.ChartEntity.this.urlText, that.urlText))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.entity.ChartEntity.this.area, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.entity.ChartEntity.this.area = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}
}

