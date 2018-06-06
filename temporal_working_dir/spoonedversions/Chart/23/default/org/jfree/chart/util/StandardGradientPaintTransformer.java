

package org.jfree.chart.util;


public class StandardGradientPaintTransformer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.GradientPaintTransformer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8155025776964678320L;

	private org.jfree.chart.util.GradientPaintTransformType type;

	public StandardGradientPaintTransformer() {
		this(org.jfree.chart.util.GradientPaintTransformType.VERTICAL);
	}

	public StandardGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformType type) {
		if (type == null) {
			throw new java.lang.IllegalArgumentException("Null 'type' argument.");
		}
		org.jfree.chart.util.StandardGradientPaintTransformer.this.type = type;
	}

	public org.jfree.chart.util.GradientPaintTransformType getType() {
		return org.jfree.chart.util.StandardGradientPaintTransformer.this.type;
	}

	public java.awt.GradientPaint transform(java.awt.GradientPaint paint, java.awt.Shape target) {
		java.awt.GradientPaint result = paint;
		java.awt.geom.Rectangle2D bounds = target.getBounds2D();
		if (org.jfree.chart.util.StandardGradientPaintTransformer.this.type.equals(org.jfree.chart.util.GradientPaintTransformType.VERTICAL)) {
			result = new java.awt.GradientPaint(((float) (bounds.getCenterX())), ((float) (bounds.getMinY())), paint.getColor1(), ((float) (bounds.getCenterX())), ((float) (bounds.getMaxY())), paint.getColor2());
		}else
			if (org.jfree.chart.util.StandardGradientPaintTransformer.this.type.equals(org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL)) {
				result = new java.awt.GradientPaint(((float) (bounds.getMinX())), ((float) (bounds.getCenterY())), paint.getColor1(), ((float) (bounds.getMaxX())), ((float) (bounds.getCenterY())), paint.getColor2());
			}else
				if (org.jfree.chart.util.StandardGradientPaintTransformer.this.type.equals(org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL)) {
					result = new java.awt.GradientPaint(((float) (bounds.getCenterX())), ((float) (bounds.getCenterY())), paint.getColor2(), ((float) (bounds.getMaxX())), ((float) (bounds.getCenterY())), paint.getColor1(), true);
				}else
					if (org.jfree.chart.util.StandardGradientPaintTransformer.this.type.equals(org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL)) {
						result = new java.awt.GradientPaint(((float) (bounds.getCenterX())), ((float) (bounds.getMinY())), paint.getColor1(), ((float) (bounds.getCenterX())), ((float) (bounds.getCenterY())), paint.getColor2(), true);
					}
				
			
		
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.util.StandardGradientPaintTransformer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.util.StandardGradientPaintTransformer)) {
			return false;
		}
		org.jfree.chart.util.StandardGradientPaintTransformer that = ((org.jfree.chart.util.StandardGradientPaintTransformer) (obj));
		if ((org.jfree.chart.util.StandardGradientPaintTransformer.this.type) != (that.type)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public int hashCode() {
		return (org.jfree.chart.util.StandardGradientPaintTransformer.this.type) != null ? org.jfree.chart.util.StandardGradientPaintTransformer.this.type.hashCode() : 0;
	}
}

