

package org.jfree.chart.plot.dial;


public abstract class DialPointer extends org.jfree.chart.plot.dial.AbstractDialLayer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.dial.DialLayer , org.jfree.chart.util.PublicCloneable {
	double radius;

	int datasetIndex;

	protected DialPointer() {
		this(0);
	}

	protected DialPointer(int datasetIndex) {
		org.jfree.chart.plot.dial.DialPointer.this.radius = 0.9;
		org.jfree.chart.plot.dial.DialPointer.this.datasetIndex = datasetIndex;
	}

	public int getDatasetIndex() {
		return org.jfree.chart.plot.dial.DialPointer.this.datasetIndex;
	}

	public void setDatasetIndex(int index) {
		org.jfree.chart.plot.dial.DialPointer.this.datasetIndex = index;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.this));
	}

	public double getRadius() {
		return org.jfree.chart.plot.dial.DialPointer.this.radius;
	}

	public void setRadius(double radius) {
		org.jfree.chart.plot.dial.DialPointer.this.radius = radius;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.this));
	}

	public boolean isClippedToWindow() {
		return true;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialPointer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialPointer)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialPointer that = ((org.jfree.chart.plot.dial.DialPointer) (obj));
		if ((org.jfree.chart.plot.dial.DialPointer.this.datasetIndex) != (that.datasetIndex)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialPointer.this.radius) != (that.radius)) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 23;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.this.radius);
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public static class Pin extends org.jfree.chart.plot.dial.DialPointer {
		static final long serialVersionUID = -8445860485367689750L;

		private transient java.awt.Paint paint;

		private transient java.awt.Stroke stroke;

		public Pin() {
			this(0);
		}

		public Pin(int datasetIndex) {
			super(datasetIndex);
			org.jfree.chart.plot.dial.DialPointer.Pin.this.paint = java.awt.Color.red;
			org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke = new java.awt.BasicStroke(3.0F, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_BEVEL);
		}

		public java.awt.Paint getPaint() {
			return org.jfree.chart.plot.dial.DialPointer.Pin.this.paint;
		}

		public void setPaint(java.awt.Paint paint) {
			if (paint == null) {
				throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
			}
			org.jfree.chart.plot.dial.DialPointer.Pin.this.paint = paint;
			notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.Pin.this));
		}

		public java.awt.Stroke getStroke() {
			return org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke;
		}

		public void setStroke(java.awt.Stroke stroke) {
			if (stroke == null) {
				throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
			}
			org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke = stroke;
			notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.Pin.this));
		}

		public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
			g2.setPaint(org.jfree.chart.plot.dial.DialPointer.Pin.this.paint);
			g2.setStroke(org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke);
			java.awt.geom.Rectangle2D arcRect = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialPointer.Pin.this.radius, org.jfree.chart.plot.dial.DialPointer.Pin.this.radius);
			double value = plot.getValue(org.jfree.chart.plot.dial.DialPointer.Pin.this.datasetIndex);
			org.jfree.chart.plot.dial.DialScale scale = plot.getScaleForDataset(org.jfree.chart.plot.dial.DialPointer.Pin.this.datasetIndex);
			double angle = scale.valueToAngle(value);
			java.awt.geom.Arc2D arc = new java.awt.geom.Arc2D.Double(arcRect, angle, 0, java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt = arc.getEndPoint();
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(frame.getCenterX(), frame.getCenterY(), pt.getX(), pt.getY());
			g2.draw(line);
		}

		public boolean equals(java.lang.Object obj) {
			if (obj == (org.jfree.chart.plot.dial.DialPointer.Pin.this)) {
				return true;
			}
			if (!(obj instanceof org.jfree.chart.plot.dial.DialPointer.Pin)) {
				return false;
			}
			org.jfree.chart.plot.dial.DialPointer.Pin that = ((org.jfree.chart.plot.dial.DialPointer.Pin) (obj));
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialPointer.Pin.this.paint, that.paint))) {
				return false;
			}
			if (!(org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke.equals(that.stroke))) {
				return false;
			}
			return super.equals(obj);
		}

		public int hashCode() {
			int result = super.hashCode();
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.Pin.this.paint);
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke);
			return result;
		}

		private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
			stream.defaultWriteObject();
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialPointer.Pin.this.paint, stream);
			org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke, stream);
		}

		private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
			stream.defaultReadObject();
			org.jfree.chart.plot.dial.DialPointer.Pin.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
			org.jfree.chart.plot.dial.DialPointer.Pin.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		}
	}

	public static class Pointer extends org.jfree.chart.plot.dial.DialPointer {
		static final long serialVersionUID = -4180500011963176960L;

		private double widthRadius;

		private transient java.awt.Paint fillPaint;

		private transient java.awt.Paint outlinePaint;

		public Pointer() {
			this(0);
		}

		public Pointer(int datasetIndex) {
			super(datasetIndex);
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius = 0.05;
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint = java.awt.Color.gray;
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint = java.awt.Color.black;
		}

		public double getWidthRadius() {
			return org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius;
		}

		public void setWidthRadius(double radius) {
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius = radius;
			notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.Pointer.this));
		}

		public java.awt.Paint getFillPaint() {
			return org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint;
		}

		public void setFillPaint(java.awt.Paint paint) {
			if (paint == null) {
				throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
			}
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint = paint;
			notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.Pointer.this));
		}

		public java.awt.Paint getOutlinePaint() {
			return org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint;
		}

		public void setOutlinePaint(java.awt.Paint paint) {
			if (paint == null) {
				throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
			}
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint = paint;
			notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.DialPointer.Pointer.this));
		}

		public void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.dial.DialPlot plot, java.awt.geom.Rectangle2D frame, java.awt.geom.Rectangle2D view) {
			g2.setPaint(java.awt.Color.blue);
			g2.setStroke(new java.awt.BasicStroke(1.0F));
			java.awt.geom.Rectangle2D lengthRect = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialPointer.Pointer.this.radius, org.jfree.chart.plot.dial.DialPointer.Pointer.this.radius);
			java.awt.geom.Rectangle2D widthRect = org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(frame, org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius, org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius);
			double value = plot.getValue(org.jfree.chart.plot.dial.DialPointer.Pointer.this.datasetIndex);
			org.jfree.chart.plot.dial.DialScale scale = plot.getScaleForDataset(org.jfree.chart.plot.dial.DialPointer.Pointer.this.datasetIndex);
			double angle = scale.valueToAngle(value);
			java.awt.geom.Arc2D arc1 = new java.awt.geom.Arc2D.Double(lengthRect, angle, 0, java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt1 = arc1.getEndPoint();
			java.awt.geom.Arc2D arc2 = new java.awt.geom.Arc2D.Double(widthRect, (angle - 90.0), 180.0, java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt2 = arc2.getStartPoint();
			java.awt.geom.Point2D pt3 = arc2.getEndPoint();
			java.awt.geom.Arc2D arc3 = new java.awt.geom.Arc2D.Double(widthRect, (angle - 180.0), 0.0, java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D pt4 = arc3.getStartPoint();
			java.awt.geom.GeneralPath gp = new java.awt.geom.GeneralPath();
			gp.moveTo(((float) (pt1.getX())), ((float) (pt1.getY())));
			gp.lineTo(((float) (pt2.getX())), ((float) (pt2.getY())));
			gp.lineTo(((float) (pt4.getX())), ((float) (pt4.getY())));
			gp.lineTo(((float) (pt3.getX())), ((float) (pt3.getY())));
			gp.closePath();
			g2.setPaint(org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint);
			g2.fill(gp);
			g2.setPaint(org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint);
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(frame.getCenterX(), frame.getCenterY(), pt1.getX(), pt1.getY());
			g2.draw(line);
			line.setLine(pt2, pt3);
			g2.draw(line);
			line.setLine(pt3, pt1);
			g2.draw(line);
			line.setLine(pt2, pt1);
			g2.draw(line);
			line.setLine(pt2, pt4);
			g2.draw(line);
			line.setLine(pt3, pt4);
			g2.draw(line);
		}

		public boolean equals(java.lang.Object obj) {
			if (obj == (org.jfree.chart.plot.dial.DialPointer.Pointer.this)) {
				return true;
			}
			if (!(obj instanceof org.jfree.chart.plot.dial.DialPointer.Pointer)) {
				return false;
			}
			org.jfree.chart.plot.dial.DialPointer.Pointer that = ((org.jfree.chart.plot.dial.DialPointer.Pointer) (obj));
			if ((org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius) != (that.widthRadius)) {
				return false;
			}
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint, that.fillPaint))) {
				return false;
			}
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint, that.outlinePaint))) {
				return false;
			}
			return super.equals(obj);
		}

		public int hashCode() {
			int result = super.hashCode();
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.Pointer.this.widthRadius);
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint);
			result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint);
			return result;
		}

		private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
			stream.defaultWriteObject();
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint, stream);
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint, stream);
		}

		private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
			stream.defaultReadObject();
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
			org.jfree.chart.plot.dial.DialPointer.Pointer.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
	}
}

