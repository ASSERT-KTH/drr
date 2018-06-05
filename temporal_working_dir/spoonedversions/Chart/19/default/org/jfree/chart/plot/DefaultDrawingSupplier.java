

package org.jfree.chart.plot;


public class DefaultDrawingSupplier implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.DrawingSupplier , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7339847061039422538L;

	public static final java.awt.Paint[] DEFAULT_PAINT_SEQUENCE = org.jfree.chart.ChartColor.createDefaultPaintArray();

	public static final java.awt.Paint[] DEFAULT_OUTLINE_PAINT_SEQUENCE = new java.awt.Paint[]{ java.awt.Color.lightGray };

	public static final java.awt.Paint[] DEFAULT_FILL_PAINT_SEQUENCE = new java.awt.Paint[]{ java.awt.Color.white };

	public static final java.awt.Stroke[] DEFAULT_STROKE_SEQUENCE = new java.awt.Stroke[]{ new java.awt.BasicStroke(1.0F, java.awt.BasicStroke.CAP_SQUARE, java.awt.BasicStroke.JOIN_BEVEL) };

	public static final java.awt.Stroke[] DEFAULT_OUTLINE_STROKE_SEQUENCE = new java.awt.Stroke[]{ new java.awt.BasicStroke(1.0F, java.awt.BasicStroke.CAP_SQUARE, java.awt.BasicStroke.JOIN_BEVEL) };

	public static final java.awt.Shape[] DEFAULT_SHAPE_SEQUENCE = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();

	private transient java.awt.Paint[] paintSequence;

	private int paintIndex;

	private transient java.awt.Paint[] outlinePaintSequence;

	private int outlinePaintIndex;

	private transient java.awt.Paint[] fillPaintSequence;

	private int fillPaintIndex;

	private transient java.awt.Stroke[] strokeSequence;

	private int strokeIndex;

	private transient java.awt.Stroke[] outlineStrokeSequence;

	private int outlineStrokeIndex;

	private transient java.awt.Shape[] shapeSequence;

	private int shapeIndex;

	public DefaultDrawingSupplier() {
		this(org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE);
	}

	public DefaultDrawingSupplier(java.awt.Paint[] paintSequence, java.awt.Paint[] outlinePaintSequence, java.awt.Stroke[] strokeSequence, java.awt.Stroke[] outlineStrokeSequence, java.awt.Shape[] shapeSequence) {
		org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence = paintSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintSequence = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence = outlinePaintSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence = strokeSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence = outlineStrokeSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence = shapeSequence;
	}

	public DefaultDrawingSupplier(java.awt.Paint[] paintSequence, java.awt.Paint[] fillPaintSequence, java.awt.Paint[] outlinePaintSequence, java.awt.Stroke[] strokeSequence, java.awt.Stroke[] outlineStrokeSequence, java.awt.Shape[] shapeSequence) {
		org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence = paintSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintSequence = fillPaintSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence = outlinePaintSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence = strokeSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence = outlineStrokeSequence;
		org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence = shapeSequence;
	}

	public java.awt.Paint getNextPaint() {
		java.awt.Paint result = org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.paintIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.paintIndex)++;
		return result;
	}

	public java.awt.Paint getNextOutlinePaint() {
		java.awt.Paint result = org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintIndex)++;
		return result;
	}

	public java.awt.Paint getNextFillPaint() {
		java.awt.Paint result = org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.fillPaintIndex)++;
		return result;
	}

	public java.awt.Stroke getNextStroke() {
		java.awt.Stroke result = org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeIndex)++;
		return result;
	}

	public java.awt.Stroke getNextOutlineStroke() {
		java.awt.Stroke result = org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeIndex)++;
		return result;
	}

	public java.awt.Shape getNextShape() {
		java.awt.Shape result = org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence[((org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeIndex) % (org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence.length))];
		(org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeIndex)++;
		return result;
	}

	public static java.awt.Shape[] createStandardSeriesShapes() {
		java.awt.Shape[] result = new java.awt.Shape[10];
		double size = 6.0;
		double delta = size / 2.0;
		int[] xpoints = null;
		int[] ypoints = null;
		result[0] = new java.awt.geom.Rectangle2D.Double((-delta), (-delta), size, size);
		result[1] = new java.awt.geom.Ellipse2D.Double((-delta), (-delta), size, size);
		xpoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray(0.0, delta, (-delta));
		ypoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), delta, delta);
		result[2] = new java.awt.Polygon(xpoints, ypoints, 3);
		xpoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray(0.0, delta, 0.0, (-delta));
		ypoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), 0.0, delta, 0.0);
		result[3] = new java.awt.Polygon(xpoints, ypoints, 4);
		result[4] = new java.awt.geom.Rectangle2D.Double((-delta), ((-delta) / 2), size, (size / 2));
		xpoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), (+delta), 0.0);
		ypoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), (-delta), delta);
		result[5] = new java.awt.Polygon(xpoints, ypoints, 3);
		result[6] = new java.awt.geom.Ellipse2D.Double((-delta), ((-delta) / 2), size, (size / 2));
		xpoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), delta, (-delta));
		ypoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), 0.0, delta);
		result[7] = new java.awt.Polygon(xpoints, ypoints, 3);
		result[8] = new java.awt.geom.Rectangle2D.Double(((-delta) / 2), (-delta), (size / 2), size);
		xpoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray((-delta), delta, delta);
		ypoints = org.jfree.chart.plot.DefaultDrawingSupplier.intArray(0.0, (-delta), (+delta));
		result[9] = new java.awt.Polygon(xpoints, ypoints, 3);
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.DefaultDrawingSupplier.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.DefaultDrawingSupplier)) {
			return false;
		}
		org.jfree.chart.plot.DefaultDrawingSupplier that = ((org.jfree.chart.plot.DefaultDrawingSupplier) (obj));
		if (!(java.util.Arrays.equals(org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence, that.paintSequence))) {
			return false;
		}
		if ((org.jfree.chart.plot.DefaultDrawingSupplier.this.paintIndex) != (that.paintIndex)) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence, that.outlinePaintSequence))) {
			return false;
		}
		if ((org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintIndex) != (that.outlinePaintIndex)) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence, that.strokeSequence))) {
			return false;
		}
		if ((org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeIndex) != (that.strokeIndex)) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence, that.outlineStrokeSequence))) {
			return false;
		}
		if ((org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeIndex) != (that.outlineStrokeIndex)) {
			return false;
		}
		if (!(equalShapes(org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence, that.shapeSequence))) {
			return false;
		}
		if ((org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeIndex) != (that.shapeIndex)) {
			return false;
		}
		return true;
	}

	private boolean equalShapes(java.awt.Shape[] s1, java.awt.Shape[] s2) {
		if (s1 == null) {
			return s2 == null;
		}
		if (s2 == null) {
			return false;
		}
		if ((s1.length) != (s2.length)) {
			return false;
		}
		for (int i = 0; i < (s1.length); i++) {
			if (!(org.jfree.chart.util.ShapeUtilities.equal(s1[i], s2[i]))) {
				return false;
			}
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		int paintCount = org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence.length;
		stream.writeInt(paintCount);
		for (int i = 0; i < paintCount; i++) {
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence[i], stream);
		}
		int outlinePaintCount = org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence.length;
		stream.writeInt(outlinePaintCount);
		for (int i = 0; i < outlinePaintCount; i++) {
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence[i], stream);
		}
		int strokeCount = org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence.length;
		stream.writeInt(strokeCount);
		for (int i = 0; i < strokeCount; i++) {
			org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence[i], stream);
		}
		int outlineStrokeCount = org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence.length;
		stream.writeInt(outlineStrokeCount);
		for (int i = 0; i < outlineStrokeCount; i++) {
			org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence[i], stream);
		}
		int shapeCount = org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence.length;
		stream.writeInt(shapeCount);
		for (int i = 0; i < shapeCount; i++) {
			org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence[i], stream);
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		int paintCount = stream.readInt();
		org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence = new java.awt.Paint[paintCount];
		for (int i = 0; i < paintCount; i++) {
			org.jfree.chart.plot.DefaultDrawingSupplier.this.paintSequence[i] = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
		int outlinePaintCount = stream.readInt();
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence = new java.awt.Paint[outlinePaintCount];
		for (int i = 0; i < outlinePaintCount; i++) {
			org.jfree.chart.plot.DefaultDrawingSupplier.this.outlinePaintSequence[i] = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
		int strokeCount = stream.readInt();
		org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence = new java.awt.Stroke[strokeCount];
		for (int i = 0; i < strokeCount; i++) {
			org.jfree.chart.plot.DefaultDrawingSupplier.this.strokeSequence[i] = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		}
		int outlineStrokeCount = stream.readInt();
		org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence = new java.awt.Stroke[outlineStrokeCount];
		for (int i = 0; i < outlineStrokeCount; i++) {
			org.jfree.chart.plot.DefaultDrawingSupplier.this.outlineStrokeSequence[i] = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		}
		int shapeCount = stream.readInt();
		org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence = new java.awt.Shape[shapeCount];
		for (int i = 0; i < shapeCount; i++) {
			org.jfree.chart.plot.DefaultDrawingSupplier.this.shapeSequence[i] = org.jfree.chart.util.SerialUtilities.readShape(stream);
		}
	}

	private static int[] intArray(double a, double b, double c) {
		return new int[]{ ((int) (a)) , ((int) (b)) , ((int) (c)) };
	}

	private static int[] intArray(double a, double b, double c, double d) {
		return new int[]{ ((int) (a)) , ((int) (b)) , ((int) (c)) , ((int) (d)) };
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.DefaultDrawingSupplier clone = ((org.jfree.chart.plot.DefaultDrawingSupplier) (super.clone()));
		return clone;
	}
}

