

package org.jfree.chart;


public class LegendItem implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -797214582948827144L;

	private org.jfree.data.general.Dataset dataset;

	private java.lang.Comparable seriesKey;

	private int datasetIndex;

	private int series;

	private java.lang.String label;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private transient java.text.AttributedString attributedLabel;

	private java.lang.String description;

	private java.lang.String toolTipText;

	private java.lang.String urlText;

	private boolean shapeVisible;

	private transient java.awt.Shape shape;

	private boolean shapeFilled;

	private transient java.awt.Paint fillPaint;

	private org.jfree.chart.util.GradientPaintTransformer fillPaintTransformer;

	private boolean shapeOutlineVisible;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	private boolean lineVisible;

	private transient java.awt.Shape line;

	private transient java.awt.Stroke lineStroke;

	private transient java.awt.Paint linePaint;

	private static final java.awt.Shape UNUSED_SHAPE = new java.awt.geom.Line2D.Float();

	private static final java.awt.Stroke UNUSED_STROKE = new java.awt.BasicStroke(0.0F);

	public LegendItem(java.lang.String label) {
		this(label, java.awt.Color.black);
	}

	public LegendItem(java.lang.String label, java.awt.Paint paint) {
		this(label, null, null, null, new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0), paint);
	}

	public LegendItem(java.lang.String label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape shape, java.awt.Paint fillPaint) {
		this(label, description, toolTipText, urlText, true, shape, true, fillPaint, false, java.awt.Color.black, org.jfree.chart.LegendItem.UNUSED_STROKE, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, org.jfree.chart.LegendItem.UNUSED_STROKE, java.awt.Color.black);
	}

	public LegendItem(java.lang.String label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape shape, java.awt.Paint fillPaint, java.awt.Stroke outlineStroke, java.awt.Paint outlinePaint) {
		this(label, description, toolTipText, urlText, true, shape, true, fillPaint, true, outlinePaint, outlineStroke, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, org.jfree.chart.LegendItem.UNUSED_STROKE, java.awt.Color.black);
	}

	public LegendItem(java.lang.String label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape line, java.awt.Stroke lineStroke, java.awt.Paint linePaint) {
		this(label, description, toolTipText, urlText, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, false, java.awt.Color.black, false, java.awt.Color.black, org.jfree.chart.LegendItem.UNUSED_STROKE, true, line, lineStroke, linePaint);
	}

	public LegendItem(java.lang.String label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, boolean shapeVisible, java.awt.Shape shape, boolean shapeFilled, java.awt.Paint fillPaint, boolean shapeOutlineVisible, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, boolean lineVisible, java.awt.Shape line, java.awt.Stroke lineStroke, java.awt.Paint linePaint) {
		if (label == null) {
			throw new java.lang.IllegalArgumentException("Null 'label' argument.");
		}
		if (fillPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'fillPaint' argument.");
		}
		if (lineStroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'lineStroke' argument.");
		}
		if (outlinePaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'outlinePaint' argument.");
		}
		if (outlineStroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'outlineStroke' argument.");
		}
		org.jfree.chart.LegendItem.this.label = label;
		org.jfree.chart.LegendItem.this.labelPaint = null;
		org.jfree.chart.LegendItem.this.attributedLabel = null;
		org.jfree.chart.LegendItem.this.description = description;
		org.jfree.chart.LegendItem.this.shapeVisible = shapeVisible;
		org.jfree.chart.LegendItem.this.shape = shape;
		org.jfree.chart.LegendItem.this.shapeFilled = shapeFilled;
		org.jfree.chart.LegendItem.this.fillPaint = fillPaint;
		org.jfree.chart.LegendItem.this.fillPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
		org.jfree.chart.LegendItem.this.shapeOutlineVisible = shapeOutlineVisible;
		org.jfree.chart.LegendItem.this.outlinePaint = outlinePaint;
		org.jfree.chart.LegendItem.this.outlineStroke = outlineStroke;
		org.jfree.chart.LegendItem.this.lineVisible = lineVisible;
		org.jfree.chart.LegendItem.this.line = line;
		org.jfree.chart.LegendItem.this.lineStroke = lineStroke;
		org.jfree.chart.LegendItem.this.linePaint = linePaint;
		org.jfree.chart.LegendItem.this.toolTipText = toolTipText;
		org.jfree.chart.LegendItem.this.urlText = urlText;
	}

	public LegendItem(java.text.AttributedString label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape shape, java.awt.Paint fillPaint) {
		this(label, description, toolTipText, urlText, true, shape, true, fillPaint, false, java.awt.Color.black, org.jfree.chart.LegendItem.UNUSED_STROKE, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, org.jfree.chart.LegendItem.UNUSED_STROKE, java.awt.Color.black);
	}

	public LegendItem(java.text.AttributedString label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape shape, java.awt.Paint fillPaint, java.awt.Stroke outlineStroke, java.awt.Paint outlinePaint) {
		this(label, description, toolTipText, urlText, true, shape, true, fillPaint, true, outlinePaint, outlineStroke, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, org.jfree.chart.LegendItem.UNUSED_STROKE, java.awt.Color.black);
	}

	public LegendItem(java.text.AttributedString label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, java.awt.Shape line, java.awt.Stroke lineStroke, java.awt.Paint linePaint) {
		this(label, description, toolTipText, urlText, false, org.jfree.chart.LegendItem.UNUSED_SHAPE, false, java.awt.Color.black, false, java.awt.Color.black, org.jfree.chart.LegendItem.UNUSED_STROKE, true, line, lineStroke, linePaint);
	}

	public LegendItem(java.text.AttributedString label, java.lang.String description, java.lang.String toolTipText, java.lang.String urlText, boolean shapeVisible, java.awt.Shape shape, boolean shapeFilled, java.awt.Paint fillPaint, boolean shapeOutlineVisible, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, boolean lineVisible, java.awt.Shape line, java.awt.Stroke lineStroke, java.awt.Paint linePaint) {
		if (label == null) {
			throw new java.lang.IllegalArgumentException("Null 'label' argument.");
		}
		if (fillPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'fillPaint' argument.");
		}
		if (lineStroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'lineStroke' argument.");
		}
		if (line == null) {
			throw new java.lang.IllegalArgumentException("Null 'line' argument.");
		}
		if (linePaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'linePaint' argument.");
		}
		if (outlinePaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'outlinePaint' argument.");
		}
		if (outlineStroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'outlineStroke' argument.");
		}
		org.jfree.chart.LegendItem.this.label = characterIteratorToString(label.getIterator());
		org.jfree.chart.LegendItem.this.attributedLabel = label;
		org.jfree.chart.LegendItem.this.description = description;
		org.jfree.chart.LegendItem.this.shapeVisible = shapeVisible;
		org.jfree.chart.LegendItem.this.shape = shape;
		org.jfree.chart.LegendItem.this.shapeFilled = shapeFilled;
		org.jfree.chart.LegendItem.this.fillPaint = fillPaint;
		org.jfree.chart.LegendItem.this.fillPaintTransformer = new org.jfree.chart.util.StandardGradientPaintTransformer();
		org.jfree.chart.LegendItem.this.shapeOutlineVisible = shapeOutlineVisible;
		org.jfree.chart.LegendItem.this.outlinePaint = outlinePaint;
		org.jfree.chart.LegendItem.this.outlineStroke = outlineStroke;
		org.jfree.chart.LegendItem.this.lineVisible = lineVisible;
		org.jfree.chart.LegendItem.this.line = line;
		org.jfree.chart.LegendItem.this.lineStroke = lineStroke;
		org.jfree.chart.LegendItem.this.linePaint = linePaint;
		org.jfree.chart.LegendItem.this.toolTipText = toolTipText;
		org.jfree.chart.LegendItem.this.urlText = urlText;
	}

	private java.lang.String characterIteratorToString(java.text.CharacterIterator iterator) {
		int endIndex = iterator.getEndIndex();
		int beginIndex = iterator.getBeginIndex();
		int count = endIndex - beginIndex;
		if (count <= 0) {
			return "";
		}
		char[] chars = new char[count];
		int i = 0;
		char c = iterator.first();
		while (c != (java.text.CharacterIterator.DONE)) {
			chars[i] = c;
			i++;
			c = iterator.next();
		} 
		return new java.lang.String(chars);
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.chart.LegendItem.this.dataset;
	}

	public void setDataset(org.jfree.data.general.Dataset dataset) {
		org.jfree.chart.LegendItem.this.dataset = dataset;
	}

	public int getDatasetIndex() {
		return org.jfree.chart.LegendItem.this.datasetIndex;
	}

	public void setDatasetIndex(int index) {
		org.jfree.chart.LegendItem.this.datasetIndex = index;
	}

	public java.lang.Comparable getSeriesKey() {
		return org.jfree.chart.LegendItem.this.seriesKey;
	}

	public void setSeriesKey(java.lang.Comparable key) {
		org.jfree.chart.LegendItem.this.seriesKey = key;
	}

	public int getSeriesIndex() {
		return org.jfree.chart.LegendItem.this.series;
	}

	public void setSeriesIndex(int index) {
		org.jfree.chart.LegendItem.this.series = index;
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.LegendItem.this.label;
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.LegendItem.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		org.jfree.chart.LegendItem.this.labelFont = font;
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.LegendItem.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		org.jfree.chart.LegendItem.this.labelPaint = paint;
	}

	public java.text.AttributedString getAttributedLabel() {
		return org.jfree.chart.LegendItem.this.attributedLabel;
	}

	public java.lang.String getDescription() {
		return org.jfree.chart.LegendItem.this.description;
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.LegendItem.this.toolTipText;
	}

	public java.lang.String getURLText() {
		return org.jfree.chart.LegendItem.this.urlText;
	}

	public boolean isShapeVisible() {
		return org.jfree.chart.LegendItem.this.shapeVisible;
	}

	public java.awt.Shape getShape() {
		return org.jfree.chart.LegendItem.this.shape;
	}

	public boolean isShapeFilled() {
		return org.jfree.chart.LegendItem.this.shapeFilled;
	}

	public java.awt.Paint getFillPaint() {
		return org.jfree.chart.LegendItem.this.fillPaint;
	}

	public void setFillPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.LegendItem.this.fillPaint = paint;
	}

	public boolean isShapeOutlineVisible() {
		return org.jfree.chart.LegendItem.this.shapeOutlineVisible;
	}

	public java.awt.Stroke getLineStroke() {
		return org.jfree.chart.LegendItem.this.lineStroke;
	}

	public java.awt.Paint getLinePaint() {
		return org.jfree.chart.LegendItem.this.linePaint;
	}

	public void setLinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.LegendItem.this.linePaint = paint;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.LegendItem.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.LegendItem.this.outlinePaint = paint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.LegendItem.this.outlineStroke;
	}

	public boolean isLineVisible() {
		return org.jfree.chart.LegendItem.this.lineVisible;
	}

	public java.awt.Shape getLine() {
		return org.jfree.chart.LegendItem.this.line;
	}

	public org.jfree.chart.util.GradientPaintTransformer getFillPaintTransformer() {
		return org.jfree.chart.LegendItem.this.fillPaintTransformer;
	}

	public void setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer transformer) {
		if (transformer == null) {
			throw new java.lang.IllegalArgumentException("Null 'transformer' attribute.");
		}
		org.jfree.chart.LegendItem.this.fillPaintTransformer = transformer;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.LegendItem.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.LegendItem)) {
			return false;
		}
		org.jfree.chart.LegendItem that = ((org.jfree.chart.LegendItem) (obj));
		if ((org.jfree.chart.LegendItem.this.datasetIndex) != (that.datasetIndex)) {
			return false;
		}
		if ((org.jfree.chart.LegendItem.this.series) != (that.series)) {
			return false;
		}
		if (!(org.jfree.chart.LegendItem.this.label.equals(that.label))) {
			return false;
		}
		if (!(org.jfree.chart.util.AttributedStringUtilities.equal(org.jfree.chart.LegendItem.this.attributedLabel, that.attributedLabel))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.LegendItem.this.description, that.description))) {
			return false;
		}
		if ((org.jfree.chart.LegendItem.this.shapeVisible) != (that.shapeVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.LegendItem.this.shape, that.shape))) {
			return false;
		}
		if ((org.jfree.chart.LegendItem.this.shapeFilled) != (that.shapeFilled)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.LegendItem.this.fillPaint, that.fillPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.LegendItem.this.fillPaintTransformer, that.fillPaintTransformer))) {
			return false;
		}
		if ((org.jfree.chart.LegendItem.this.shapeOutlineVisible) != (that.shapeOutlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.LegendItem.this.outlineStroke.equals(that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.LegendItem.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if ((!(org.jfree.chart.LegendItem.this.lineVisible)) == (that.lineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.LegendItem.this.line, that.line))) {
			return false;
		}
		if (!(org.jfree.chart.LegendItem.this.lineStroke.equals(that.lineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.LegendItem.this.linePaint, that.linePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.LegendItem.this.labelFont, that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.LegendItem.this.labelPaint, that.labelPaint))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.LegendItem clone = ((org.jfree.chart.LegendItem) (super.clone()));
		if ((org.jfree.chart.LegendItem.this.seriesKey) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.LegendItem.this.seriesKey));
			clone.seriesKey = ((java.lang.Comparable) (pc.clone()));
		}
		clone.shape = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.LegendItem.this.shape);
		if ((org.jfree.chart.LegendItem.this.fillPaintTransformer) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.LegendItem.this.fillPaintTransformer));
			clone.fillPaintTransformer = ((org.jfree.chart.util.GradientPaintTransformer) (pc.clone()));
		}
		clone.line = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.LegendItem.this.line);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeAttributedString(org.jfree.chart.LegendItem.this.attributedLabel, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.LegendItem.this.shape, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.LegendItem.this.fillPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.LegendItem.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.LegendItem.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.LegendItem.this.line, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.LegendItem.this.lineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.LegendItem.this.linePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.LegendItem.this.labelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.LegendItem.this.attributedLabel = org.jfree.chart.util.SerialUtilities.readAttributedString(stream);
		org.jfree.chart.LegendItem.this.shape = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.LegendItem.this.fillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.LegendItem.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.LegendItem.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.LegendItem.this.line = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.LegendItem.this.lineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.LegendItem.this.linePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.LegendItem.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

