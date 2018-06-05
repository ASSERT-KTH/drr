

package org.jfree.chart.renderer.xy;


public class XYLine3DRenderer extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer implements java.io.Serializable , org.jfree.chart.Effect3D {
	private static final long serialVersionUID = 588933208243446087L;

	public static final double DEFAULT_X_OFFSET = 12.0;

	public static final double DEFAULT_Y_OFFSET = 8.0;

	public static final java.awt.Paint DEFAULT_WALL_PAINT = new java.awt.Color(221, 221, 221);

	private double xOffset;

	private double yOffset;

	private transient java.awt.Paint wallPaint;

	public XYLine3DRenderer() {
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint = org.jfree.chart.renderer.xy.XYLine3DRenderer.DEFAULT_WALL_PAINT;
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.xOffset = org.jfree.chart.renderer.xy.XYLine3DRenderer.DEFAULT_X_OFFSET;
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.yOffset = org.jfree.chart.renderer.xy.XYLine3DRenderer.DEFAULT_Y_OFFSET;
	}

	public double getXOffset() {
		return org.jfree.chart.renderer.xy.XYLine3DRenderer.this.xOffset;
	}

	public double getYOffset() {
		return org.jfree.chart.renderer.xy.XYLine3DRenderer.this.yOffset;
	}

	public void setXOffset(double xOffset) {
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.xOffset = xOffset;
		fireChangeEvent();
	}

	public void setYOffset(double yOffset) {
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.yOffset = yOffset;
		fireChangeEvent();
	}

	public java.awt.Paint getWallPaint() {
		return org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint;
	}

	public void setWallPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint = paint;
		fireChangeEvent();
	}

	public int getPassCount() {
		return 3;
	}

	protected boolean isLinePass(int pass) {
		return (pass == 0) || (pass == 1);
	}

	protected boolean isItemPass(int pass) {
		return pass == 2;
	}

	protected boolean isShadowPass(int pass) {
		return pass == 0;
	}

	protected void drawFirstPassShape(java.awt.Graphics2D g2, int pass, int series, int item, java.awt.Shape shape) {
		if (isShadowPass(pass)) {
			if ((getWallPaint()) != null) {
				g2.setStroke(getItemStroke(series, item));
				g2.setPaint(getWallPaint());
				g2.translate(getXOffset(), getYOffset());
				g2.draw(shape);
				g2.translate((-(getXOffset())), (-(getYOffset())));
			}
		}else {
			super.drawFirstPassShape(g2, pass, series, item, shape);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYLine3DRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYLine3DRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYLine3DRenderer that = ((org.jfree.chart.renderer.xy.XYLine3DRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYLine3DRenderer.this.xOffset) != (that.xOffset)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLine3DRenderer.this.yOffset) != (that.yOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint, that.wallPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYLine3DRenderer.this.wallPaint, stream);
	}
}

