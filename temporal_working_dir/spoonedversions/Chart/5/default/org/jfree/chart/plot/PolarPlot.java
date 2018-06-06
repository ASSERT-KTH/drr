

package org.jfree.chart.plot;


public class PolarPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.event.RendererChangeListener , org.jfree.chart.plot.ValueAxisPlot , org.jfree.chart.plot.Zoomable {
	private static final long serialVersionUID = 3794383185924179525L;

	private static final int MARGIN = 20;

	private static final double ANNOTATION_MARGIN = 7.0;

	public static final double DEFAULT_ANGLE_TICK_UNIT_SIZE = 45.0;

	public static final java.awt.Stroke DEFAULT_GRIDLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_BEVEL, 0.0F, new float[]{ 2.0F , 2.0F }, 0.0F);

	public static final java.awt.Paint DEFAULT_GRIDLINE_PAINT = java.awt.Color.gray;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.plot.LocalizationBundle");

	private java.util.List angleTicks;

	private org.jfree.chart.axis.ValueAxis axis;

	private org.jfree.data.xy.XYDataset dataset;

	private org.jfree.chart.renderer.PolarItemRenderer renderer;

	private org.jfree.chart.axis.TickUnit angleTickUnit;

	private boolean angleLabelsVisible = true;

	private java.awt.Font angleLabelFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12);

	private transient java.awt.Paint angleLabelPaint = java.awt.Color.black;

	private boolean angleGridlinesVisible;

	private transient java.awt.Stroke angleGridlineStroke;

	private transient java.awt.Paint angleGridlinePaint;

	private boolean radiusGridlinesVisible;

	private transient java.awt.Stroke radiusGridlineStroke;

	private transient java.awt.Paint radiusGridlinePaint;

	private java.util.List cornerTextItems = new java.util.ArrayList();

	public PolarPlot() {
		this(null, null, null);
	}

	public PolarPlot(org.jfree.data.xy.XYDataset dataset, org.jfree.chart.axis.ValueAxis radiusAxis, org.jfree.chart.renderer.PolarItemRenderer renderer) {
		super();
		org.jfree.chart.plot.PolarPlot.this.dataset = dataset;
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			org.jfree.chart.plot.PolarPlot.this.dataset.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.angleTickUnit = new org.jfree.chart.axis.NumberTickUnit(org.jfree.chart.plot.PolarPlot.DEFAULT_ANGLE_TICK_UNIT_SIZE);
		org.jfree.chart.plot.PolarPlot.this.axis = radiusAxis;
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			org.jfree.chart.plot.PolarPlot.this.axis.setPlot(org.jfree.chart.plot.PolarPlot.this);
			org.jfree.chart.plot.PolarPlot.this.axis.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.renderer = renderer;
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
			org.jfree.chart.plot.PolarPlot.this.renderer.setPlot(org.jfree.chart.plot.PolarPlot.this);
			org.jfree.chart.plot.PolarPlot.this.renderer.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.angleGridlinesVisible = true;
		org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.PolarPlot.this.radiusGridlinesVisible = true;
		org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
	}

	public void addCornerTextItem(java.lang.String text) {
		if (text == null) {
			throw new java.lang.IllegalArgumentException("Null 'text' argument.");
		}
		org.jfree.chart.plot.PolarPlot.this.cornerTextItems.add(text);
		fireChangeEvent();
	}

	public void removeCornerTextItem(java.lang.String text) {
		boolean removed = org.jfree.chart.plot.PolarPlot.this.cornerTextItems.remove(text);
		if (removed) {
			fireChangeEvent();
		}
	}

	public void clearCornerTextItems() {
		if ((org.jfree.chart.plot.PolarPlot.this.cornerTextItems.size()) > 0) {
			org.jfree.chart.plot.PolarPlot.this.cornerTextItems.clear();
			fireChangeEvent();
		}
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.PolarPlot.localizationResources.getString("Polar_Plot");
	}

	public org.jfree.chart.axis.ValueAxis getAxis() {
		return org.jfree.chart.plot.PolarPlot.this.axis;
	}

	public void setAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.PolarPlot.this);
		}
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			org.jfree.chart.plot.PolarPlot.this.axis.removeChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.axis = axis;
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			org.jfree.chart.plot.PolarPlot.this.axis.configure();
			org.jfree.chart.plot.PolarPlot.this.axis.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		fireChangeEvent();
	}

	public org.jfree.data.xy.XYDataset getDataset() {
		return org.jfree.chart.plot.PolarPlot.this.dataset;
	}

	public void setDataset(org.jfree.data.xy.XYDataset dataset) {
		org.jfree.data.xy.XYDataset existing = org.jfree.chart.plot.PolarPlot.this.dataset;
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.dataset = dataset;
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			setDatasetGroup(org.jfree.chart.plot.PolarPlot.this.dataset.getGroup());
			org.jfree.chart.plot.PolarPlot.this.dataset.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.PolarPlot.this, org.jfree.chart.plot.PolarPlot.this.dataset);
		datasetChanged(event);
	}

	public org.jfree.chart.renderer.PolarItemRenderer getRenderer() {
		return org.jfree.chart.plot.PolarPlot.this.renderer;
	}

	public void setRenderer(org.jfree.chart.renderer.PolarItemRenderer renderer) {
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
			org.jfree.chart.plot.PolarPlot.this.renderer.removeChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		org.jfree.chart.plot.PolarPlot.this.renderer = renderer;
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
			org.jfree.chart.plot.PolarPlot.this.renderer.setPlot(org.jfree.chart.plot.PolarPlot.this);
		}
		fireChangeEvent();
	}

	public org.jfree.chart.axis.TickUnit getAngleTickUnit() {
		return org.jfree.chart.plot.PolarPlot.this.angleTickUnit;
	}

	public void setAngleTickUnit(org.jfree.chart.axis.TickUnit unit) {
		if (unit == null) {
			throw new java.lang.IllegalArgumentException("Null 'unit' argument.");
		}
		org.jfree.chart.plot.PolarPlot.this.angleTickUnit = unit;
		fireChangeEvent();
	}

	public boolean isAngleLabelsVisible() {
		return org.jfree.chart.plot.PolarPlot.this.angleLabelsVisible;
	}

	public void setAngleLabelsVisible(boolean visible) {
		if ((org.jfree.chart.plot.PolarPlot.this.angleLabelsVisible) != visible) {
			org.jfree.chart.plot.PolarPlot.this.angleLabelsVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Font getAngleLabelFont() {
		return org.jfree.chart.plot.PolarPlot.this.angleLabelFont;
	}

	public void setAngleLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.PolarPlot.this.angleLabelFont = font;
		fireChangeEvent();
	}

	public java.awt.Paint getAngleLabelPaint() {
		return org.jfree.chart.plot.PolarPlot.this.angleLabelPaint;
	}

	public void setAngleLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PolarPlot.this.angleLabelPaint = paint;
		fireChangeEvent();
	}

	public boolean isAngleGridlinesVisible() {
		return org.jfree.chart.plot.PolarPlot.this.angleGridlinesVisible;
	}

	public void setAngleGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.PolarPlot.this.angleGridlinesVisible) != visible) {
			org.jfree.chart.plot.PolarPlot.this.angleGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getAngleGridlineStroke() {
		return org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke;
	}

	public void setAngleGridlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getAngleGridlinePaint() {
		return org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint;
	}

	public void setAngleGridlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRadiusGridlinesVisible() {
		return org.jfree.chart.plot.PolarPlot.this.radiusGridlinesVisible;
	}

	public void setRadiusGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.PolarPlot.this.radiusGridlinesVisible) != visible) {
			org.jfree.chart.plot.PolarPlot.this.radiusGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRadiusGridlineStroke() {
		return org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke;
	}

	public void setRadiusGridlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRadiusGridlinePaint() {
		return org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint;
	}

	public void setRadiusGridlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint = paint;
		fireChangeEvent();
	}

	protected java.util.List refreshAngleTicks() {
		java.util.List ticks = new java.util.ArrayList();
		for (double currentTickVal = 0.0; currentTickVal < 360.0; currentTickVal += org.jfree.chart.plot.PolarPlot.this.angleTickUnit.getSize()) {
			org.jfree.chart.axis.NumberTick tick = new org.jfree.chart.axis.NumberTick(new java.lang.Double(currentTickVal), org.jfree.chart.plot.PolarPlot.this.angleTickUnit.valueToString(currentTickVal), org.jfree.chart.text.TextAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0);
			ticks.add(tick);
		}
		return ticks;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		boolean b1 = (area.getWidth()) <= (org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
		boolean b2 = (area.getHeight()) <= (org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
		if (b1 || b2) {
			return ;
		}
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		java.awt.geom.Rectangle2D dataArea = area;
		if (info != null) {
			info.setDataArea(dataArea);
		}
		drawBackground(g2, dataArea);
		double h = (java.lang.Math.min(((dataArea.getWidth()) / 2.0), ((dataArea.getHeight()) / 2.0))) - (org.jfree.chart.plot.PolarPlot.MARGIN);
		java.awt.geom.Rectangle2D quadrant = new java.awt.geom.Rectangle2D.Double(dataArea.getCenterX(), dataArea.getCenterY(), h, h);
		org.jfree.chart.axis.AxisState state = drawAxis(g2, area, quadrant);
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
			java.awt.Shape originalClip = g2.getClip();
			java.awt.Composite originalComposite = g2.getComposite();
			g2.clip(dataArea);
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
			org.jfree.chart.plot.PolarPlot.this.angleTicks = refreshAngleTicks();
			drawGridlines(g2, dataArea, org.jfree.chart.plot.PolarPlot.this.angleTicks, state.getTicks());
			render(g2, dataArea, info);
			g2.setClip(originalClip);
			g2.setComposite(originalComposite);
		}
		drawOutline(g2, dataArea);
		drawCornerTextItems(g2, dataArea);
	}

	protected void drawCornerTextItems(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if (org.jfree.chart.plot.PolarPlot.this.cornerTextItems.isEmpty()) {
			return ;
		}
		g2.setColor(java.awt.Color.black);
		double width = 0.0;
		double height = 0.0;
		for (java.util.Iterator it = org.jfree.chart.plot.PolarPlot.this.cornerTextItems.iterator(); it.hasNext();) {
			java.lang.String msg = ((java.lang.String) (it.next()));
			java.awt.FontMetrics fm = g2.getFontMetrics();
			java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(msg, g2, fm);
			width = java.lang.Math.max(width, bounds.getWidth());
			height += bounds.getHeight();
		}
		double xadj = (org.jfree.chart.plot.PolarPlot.ANNOTATION_MARGIN) * 2.0;
		double yadj = org.jfree.chart.plot.PolarPlot.ANNOTATION_MARGIN;
		width += xadj;
		height += yadj;
		double x = (area.getMaxX()) - width;
		double y = (area.getMaxY()) - height;
		g2.drawRect(((int) (x)), ((int) (y)), ((int) (width)), ((int) (height)));
		x += org.jfree.chart.plot.PolarPlot.ANNOTATION_MARGIN;
		for (java.util.Iterator it = org.jfree.chart.plot.PolarPlot.this.cornerTextItems.iterator(); it.hasNext();) {
			java.lang.String msg = ((java.lang.String) (it.next()));
			java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(msg, g2, g2.getFontMetrics());
			y += bounds.getHeight();
			g2.drawString(msg, ((int) (x)), ((int) (y)));
		}
	}

	protected org.jfree.chart.axis.AxisState drawAxis(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea) {
		return org.jfree.chart.plot.PolarPlot.this.axis.draw(g2, dataArea.getMinY(), plotArea, dataArea, org.jfree.chart.util.RectangleEdge.TOP, null);
	}

	protected void render(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info) {
		if (!(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.chart.plot.PolarPlot.this.dataset))) {
			int seriesCount = org.jfree.chart.plot.PolarPlot.this.dataset.getSeriesCount();
			for (int series = 0; series < seriesCount; series++) {
				org.jfree.chart.plot.PolarPlot.this.renderer.drawSeries(g2, dataArea, info, org.jfree.chart.plot.PolarPlot.this, org.jfree.chart.plot.PolarPlot.this.dataset, series);
			}
		}else {
			drawNoDataMessage(g2, dataArea);
		}
	}

	protected void drawGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List angularTicks, java.util.List radialTicks) {
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) == null) {
			return ;
		}
		if (isAngleGridlinesVisible()) {
			java.awt.Stroke gridStroke = getAngleGridlineStroke();
			java.awt.Paint gridPaint = getAngleGridlinePaint();
			if ((gridStroke != null) && (gridPaint != null)) {
				org.jfree.chart.plot.PolarPlot.this.renderer.drawAngularGridLines(g2, org.jfree.chart.plot.PolarPlot.this, angularTicks, dataArea);
			}
		}
		if (isRadiusGridlinesVisible()) {
			java.awt.Stroke gridStroke = getRadiusGridlineStroke();
			java.awt.Paint gridPaint = getRadiusGridlinePaint();
			if ((gridStroke != null) && (gridPaint != null)) {
				org.jfree.chart.plot.PolarPlot.this.renderer.drawRadialGridLines(g2, org.jfree.chart.plot.PolarPlot.this, org.jfree.chart.plot.PolarPlot.this.axis, radialTicks, dataArea);
			}
		}
	}

	public void zoom(double percent) {
		if (percent > 0.0) {
			double radius = getMaxRadius();
			double scaledRadius = radius * percent;
			org.jfree.chart.plot.PolarPlot.this.axis.setUpperBound(scaledRadius);
			getAxis().setAutoRange(false);
		}else {
			getAxis().setAutoRange(true);
		}
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			result = org.jfree.data.Range.combine(result, org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.chart.plot.PolarPlot.this.dataset));
		}
		return result;
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent event) {
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			org.jfree.chart.plot.PolarPlot.this.axis.configure();
		}
		if ((getParent()) != null) {
			getParent().datasetChanged(event);
		}else {
			super.datasetChanged(event);
		}
	}

	public void rendererChanged(org.jfree.chart.event.RendererChangeEvent event) {
		fireChangeEvent();
	}

	public int getSeriesCount() {
		int result = 0;
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			result = org.jfree.chart.plot.PolarPlot.this.dataset.getSeriesCount();
		}
		return result;
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
				int seriesCount = org.jfree.chart.plot.PolarPlot.this.dataset.getSeriesCount();
				for (int i = 0; i < seriesCount; i++) {
					org.jfree.chart.LegendItem item = org.jfree.chart.plot.PolarPlot.this.renderer.getLegendItem(i);
					result.add(item);
				}
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.PolarPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PolarPlot)) {
			return false;
		}
		org.jfree.chart.plot.PolarPlot that = ((org.jfree.chart.plot.PolarPlot) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PolarPlot.this.axis, that.axis))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PolarPlot.this.renderer, that.renderer))) {
			return false;
		}
		if (!(org.jfree.chart.plot.PolarPlot.this.angleTickUnit.equals(that.angleTickUnit))) {
			return false;
		}
		if ((org.jfree.chart.plot.PolarPlot.this.angleGridlinesVisible) != (that.angleGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.PolarPlot.this.angleLabelsVisible) != (that.angleLabelsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.plot.PolarPlot.this.angleLabelFont.equals(that.angleLabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PolarPlot.this.angleLabelPaint, that.angleLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke, that.angleGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint, that.angleGridlinePaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.PolarPlot.this.radiusGridlinesVisible) != (that.radiusGridlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke, that.radiusGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint, that.radiusGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.PolarPlot.this.cornerTextItems.equals(that.cornerTextItems))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.PolarPlot clone = ((org.jfree.chart.plot.PolarPlot) (super.clone()));
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			clone.axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PolarPlot.this.axis)));
			clone.axis.setPlot(clone);
			clone.axis.addChangeListener(clone);
		}
		if ((clone.dataset) != null) {
			clone.dataset.addChangeListener(clone);
		}
		if ((org.jfree.chart.plot.PolarPlot.this.renderer) != null) {
			clone.renderer = ((org.jfree.chart.renderer.PolarItemRenderer) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PolarPlot.this.renderer)));
		}
		clone.cornerTextItems = new java.util.ArrayList(org.jfree.chart.plot.PolarPlot.this.cornerTextItems);
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PolarPlot.this.angleLabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.PolarPlot.this.angleGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.PolarPlot.this.angleGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PolarPlot.this.radiusGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.PolarPlot.this.radiusGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PolarPlot.this.angleLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		if ((org.jfree.chart.plot.PolarPlot.this.axis) != null) {
			org.jfree.chart.plot.PolarPlot.this.axis.setPlot(org.jfree.chart.plot.PolarPlot.this);
			org.jfree.chart.plot.PolarPlot.this.axis.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
		if ((org.jfree.chart.plot.PolarPlot.this.dataset) != null) {
			org.jfree.chart.plot.PolarPlot.this.dataset.addChangeListener(org.jfree.chart.plot.PolarPlot.this);
		}
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source, boolean useAnchor) {
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		zoom(factor);
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
		if (useAnchor) {
			double sourceX = source.getX();
			double anchorX = org.jfree.chart.plot.PolarPlot.this.axis.java2DToValue(sourceX, info.getDataArea(), org.jfree.chart.util.RectangleEdge.BOTTOM);
			org.jfree.chart.plot.PolarPlot.this.axis.resizeRange(factor, anchorX);
		}else {
			org.jfree.chart.plot.PolarPlot.this.axis.resizeRange(factor);
		}
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		zoom(((upperPercent + lowerPercent) / 2.0));
	}

	public boolean isDomainZoomable() {
		return false;
	}

	public boolean isRangeZoomable() {
		return true;
	}

	public org.jfree.chart.plot.PlotOrientation getOrientation() {
		return org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
	}

	public double getMaxRadius() {
		return org.jfree.chart.plot.PolarPlot.this.axis.getUpperBound();
	}

	public java.awt.Point translateValueThetaRadiusToJava2D(double angleDegrees, double radius, java.awt.geom.Rectangle2D dataArea) {
		double radians = java.lang.Math.toRadians((angleDegrees - 90.0));
		double minx = (dataArea.getMinX()) + (org.jfree.chart.plot.PolarPlot.MARGIN);
		double maxx = (dataArea.getMaxX()) - (org.jfree.chart.plot.PolarPlot.MARGIN);
		double miny = (dataArea.getMinY()) + (org.jfree.chart.plot.PolarPlot.MARGIN);
		double maxy = (dataArea.getMaxY()) - (org.jfree.chart.plot.PolarPlot.MARGIN);
		double lengthX = maxx - minx;
		double lengthY = maxy - miny;
		double length = java.lang.Math.min(lengthX, lengthY);
		double midX = minx + (lengthX / 2.0);
		double midY = miny + (lengthY / 2.0);
		double axisMin = org.jfree.chart.plot.PolarPlot.this.axis.getLowerBound();
		double axisMax = getMaxRadius();
		double adjustedRadius = java.lang.Math.max(radius, axisMin);
		double xv = (length / 2.0) * (java.lang.Math.cos(radians));
		double yv = (length / 2.0) * (java.lang.Math.sin(radians));
		float x = ((float) (midX + ((xv * (adjustedRadius - axisMin)) / (axisMax - axisMin))));
		float y = ((float) (midY + ((yv * (adjustedRadius - axisMin)) / (axisMax - axisMin))));
		int ix = java.lang.Math.round(x);
		int iy = java.lang.Math.round(y);
		java.awt.Point p = new java.awt.Point(ix, iy);
		return p;
	}
}

