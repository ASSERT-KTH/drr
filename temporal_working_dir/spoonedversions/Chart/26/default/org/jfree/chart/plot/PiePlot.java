

package org.jfree.chart.plot;


public class PiePlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -795612466005590431L;

	public static final double DEFAULT_INTERIOR_GAP = 0.25;

	public static final double MAX_INTERIOR_GAP = 0.4;

	public static final double DEFAULT_START_ANGLE = 90.0;

	public static final java.awt.Font DEFAULT_LABEL_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_LABEL_PAINT = java.awt.Color.black;

	public static final java.awt.Paint DEFAULT_LABEL_BACKGROUND_PAINT = new java.awt.Color(255, 255, 192);

	public static final java.awt.Paint DEFAULT_LABEL_OUTLINE_PAINT = java.awt.Color.black;

	public static final java.awt.Stroke DEFAULT_LABEL_OUTLINE_STROKE = new java.awt.BasicStroke(0.5F);

	public static final java.awt.Paint DEFAULT_LABEL_SHADOW_PAINT = java.awt.Color.lightGray;

	public static final double DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW = 1.0E-5;

	private org.jfree.data.general.PieDataset dataset;

	private int pieIndex;

	private double interiorGap;

	private boolean circular;

	private double startAngle;

	private org.jfree.chart.util.Rotation direction;

	private org.jfree.chart.PaintMap sectionPaintMap;

	private transient java.awt.Paint baseSectionPaint;

	private boolean sectionOutlinesVisible;

	private org.jfree.chart.PaintMap sectionOutlinePaintMap;

	private transient java.awt.Paint baseSectionOutlinePaint;

	private org.jfree.chart.StrokeMap sectionOutlineStrokeMap;

	private transient java.awt.Stroke baseSectionOutlineStroke;

	private transient java.awt.Paint shadowPaint = java.awt.Color.gray;

	private double shadowXOffset = 4.0F;

	private double shadowYOffset = 4.0F;

	private java.util.Map explodePercentages;

	private org.jfree.chart.labels.PieSectionLabelGenerator labelGenerator;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private transient java.awt.Paint labelBackgroundPaint;

	private transient java.awt.Paint labelOutlinePaint;

	private transient java.awt.Stroke labelOutlineStroke;

	private transient java.awt.Paint labelShadowPaint;

	private double maximumLabelWidth = 0.2;

	private double labelGap = 0.05;

	private boolean labelLinksVisible;

	private double labelLinkMargin = 0.05;

	private transient java.awt.Paint labelLinkPaint = java.awt.Color.black;

	private transient java.awt.Stroke labelLinkStroke = new java.awt.BasicStroke(0.5F);

	private org.jfree.chart.plot.AbstractPieLabelDistributor labelDistributor;

	private org.jfree.chart.labels.PieToolTipGenerator toolTipGenerator;

	private org.jfree.chart.urls.PieURLGenerator urlGenerator;

	private org.jfree.chart.labels.PieSectionLabelGenerator legendLabelGenerator;

	private org.jfree.chart.labels.PieSectionLabelGenerator legendLabelToolTipGenerator;

	private org.jfree.chart.urls.PieURLGenerator legendLabelURLGenerator;

	private boolean ignoreNullValues;

	private boolean ignoreZeroValues;

	private transient java.awt.Shape legendItemShape;

	private double minimumArcAngleToDraw;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.plot.LocalizationBundle");

	public PiePlot() {
		this(null);
	}

	public PiePlot(org.jfree.data.general.PieDataset dataset) {
		super();
		org.jfree.chart.plot.PiePlot.this.dataset = dataset;
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.PiePlot.this);
		}
		org.jfree.chart.plot.PiePlot.this.pieIndex = 0;
		org.jfree.chart.plot.PiePlot.this.interiorGap = org.jfree.chart.plot.PiePlot.DEFAULT_INTERIOR_GAP;
		org.jfree.chart.plot.PiePlot.this.circular = true;
		org.jfree.chart.plot.PiePlot.this.startAngle = org.jfree.chart.plot.PiePlot.DEFAULT_START_ANGLE;
		org.jfree.chart.plot.PiePlot.this.direction = org.jfree.chart.util.Rotation.CLOCKWISE;
		org.jfree.chart.plot.PiePlot.this.minimumArcAngleToDraw = org.jfree.chart.plot.PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW;
		org.jfree.chart.plot.PiePlot.this.sectionPaintMap = new org.jfree.chart.PaintMap();
		org.jfree.chart.plot.PiePlot.this.baseSectionPaint = java.awt.Color.gray;
		org.jfree.chart.plot.PiePlot.this.sectionOutlinesVisible = true;
		org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap = new org.jfree.chart.PaintMap();
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
		org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap = new org.jfree.chart.StrokeMap();
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
		org.jfree.chart.plot.PiePlot.this.explodePercentages = new java.util.TreeMap();
		org.jfree.chart.plot.PiePlot.this.labelGenerator = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
		org.jfree.chart.plot.PiePlot.this.labelFont = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
		org.jfree.chart.plot.PiePlot.this.labelPaint = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
		org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
		org.jfree.chart.plot.PiePlot.this.labelOutlinePaint = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
		org.jfree.chart.plot.PiePlot.this.labelOutlineStroke = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_STROKE;
		org.jfree.chart.plot.PiePlot.this.labelShadowPaint = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
		org.jfree.chart.plot.PiePlot.this.labelLinksVisible = true;
		org.jfree.chart.plot.PiePlot.this.labelDistributor = new org.jfree.chart.plot.PieLabelDistributor(0);
		org.jfree.chart.plot.PiePlot.this.toolTipGenerator = null;
		org.jfree.chart.plot.PiePlot.this.urlGenerator = null;
		org.jfree.chart.plot.PiePlot.this.legendLabelGenerator = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
		org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator = null;
		org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator = null;
		org.jfree.chart.plot.PiePlot.this.legendItemShape = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
		org.jfree.chart.plot.PiePlot.this.ignoreNullValues = false;
		org.jfree.chart.plot.PiePlot.this.ignoreZeroValues = false;
	}

	public org.jfree.data.general.PieDataset getDataset() {
		return org.jfree.chart.plot.PiePlot.this.dataset;
	}

	public void setDataset(org.jfree.data.general.PieDataset dataset) {
		org.jfree.data.general.PieDataset existing = org.jfree.chart.plot.PiePlot.this.dataset;
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.PiePlot.this);
		}
		org.jfree.chart.plot.PiePlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.PiePlot.this);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.PiePlot.this, dataset);
		datasetChanged(event);
	}

	public int getPieIndex() {
		return org.jfree.chart.plot.PiePlot.this.pieIndex;
	}

	public void setPieIndex(int index) {
		org.jfree.chart.plot.PiePlot.this.pieIndex = index;
	}

	public double getStartAngle() {
		return org.jfree.chart.plot.PiePlot.this.startAngle;
	}

	public void setStartAngle(double angle) {
		org.jfree.chart.plot.PiePlot.this.startAngle = angle;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.util.Rotation getDirection() {
		return org.jfree.chart.plot.PiePlot.this.direction;
	}

	public void setDirection(org.jfree.chart.util.Rotation direction) {
		if (direction == null) {
			throw new java.lang.IllegalArgumentException("Null 'direction' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.direction = direction;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getInteriorGap() {
		return org.jfree.chart.plot.PiePlot.this.interiorGap;
	}

	public void setInteriorGap(double percent) {
		if ((percent < 0.0) || (percent > (org.jfree.chart.plot.PiePlot.MAX_INTERIOR_GAP))) {
			throw new java.lang.IllegalArgumentException((("Invalid 'percent' (" + percent) + ") argument."));
		}
		if ((org.jfree.chart.plot.PiePlot.this.interiorGap) != percent) {
			org.jfree.chart.plot.PiePlot.this.interiorGap = percent;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
		}
	}

	public boolean isCircular() {
		return org.jfree.chart.plot.PiePlot.this.circular;
	}

	public void setCircular(boolean flag) {
		setCircular(flag, true);
	}

	public void setCircular(boolean circular, boolean notify) {
		org.jfree.chart.plot.PiePlot.this.circular = circular;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
		}
	}

	public boolean getIgnoreNullValues() {
		return org.jfree.chart.plot.PiePlot.this.ignoreNullValues;
	}

	public void setIgnoreNullValues(boolean flag) {
		org.jfree.chart.plot.PiePlot.this.ignoreNullValues = flag;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public boolean getIgnoreZeroValues() {
		return org.jfree.chart.plot.PiePlot.this.ignoreZeroValues;
	}

	public void setIgnoreZeroValues(boolean flag) {
		org.jfree.chart.plot.PiePlot.this.ignoreZeroValues = flag;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	protected java.awt.Paint lookupSectionPaint(java.lang.Comparable key) {
		return lookupSectionPaint(key, false);
	}

	protected java.awt.Paint lookupSectionPaint(java.lang.Comparable key, boolean autoPopulate) {
		java.awt.Paint result = null;
		result = org.jfree.chart.plot.PiePlot.this.sectionPaintMap.getPaint(key);
		if (result != null) {
			return result;
		}
		if (autoPopulate) {
			org.jfree.chart.plot.DrawingSupplier ds = getDrawingSupplier();
			if (ds != null) {
				result = ds.getNextPaint();
				org.jfree.chart.plot.PiePlot.this.sectionPaintMap.put(key, result);
			}else {
				result = org.jfree.chart.plot.PiePlot.this.baseSectionPaint;
			}
		}else {
			result = org.jfree.chart.plot.PiePlot.this.baseSectionPaint;
		}
		return result;
	}

	protected java.lang.Comparable getSectionKey(int section) {
		java.lang.Comparable key = null;
		if ((org.jfree.chart.plot.PiePlot.this.dataset) != null) {
			if ((section >= 0) && (section < (org.jfree.chart.plot.PiePlot.this.dataset.getItemCount()))) {
				key = org.jfree.chart.plot.PiePlot.this.dataset.getKey(section);
			}
		}
		if (key == null) {
			key = new java.lang.Integer(section);
		}
		return key;
	}

	public java.awt.Paint getSectionPaint(java.lang.Comparable key) {
		return org.jfree.chart.plot.PiePlot.this.sectionPaintMap.getPaint(key);
	}

	public void setSectionPaint(java.lang.Comparable key, java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.sectionPaintMap.put(key, paint);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getBaseSectionPaint() {
		return org.jfree.chart.plot.PiePlot.this.baseSectionPaint;
	}

	public void setBaseSectionPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.baseSectionPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public boolean getSectionOutlinesVisible() {
		return org.jfree.chart.plot.PiePlot.this.sectionOutlinesVisible;
	}

	public void setSectionOutlinesVisible(boolean visible) {
		org.jfree.chart.plot.PiePlot.this.sectionOutlinesVisible = visible;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	protected java.awt.Paint lookupSectionOutlinePaint(java.lang.Comparable key) {
		return lookupSectionOutlinePaint(key, false);
	}

	protected java.awt.Paint lookupSectionOutlinePaint(java.lang.Comparable key, boolean autoPopulate) {
		java.awt.Paint result = null;
		result = org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap.getPaint(key);
		if (result != null) {
			return result;
		}
		if (autoPopulate) {
			org.jfree.chart.plot.DrawingSupplier ds = getDrawingSupplier();
			if (ds != null) {
				result = ds.getNextOutlinePaint();
				org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap.put(key, result);
			}else {
				result = org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint;
			}
		}else {
			result = org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint;
		}
		return result;
	}

	public java.awt.Paint getSectionOutlinePaint(java.lang.Comparable key) {
		return org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap.getPaint(key);
	}

	public void setSectionOutlinePaint(java.lang.Comparable key, java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap.put(key, paint);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getBaseSectionOutlinePaint() {
		return org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint;
	}

	public void setBaseSectionOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	protected java.awt.Stroke lookupSectionOutlineStroke(java.lang.Comparable key) {
		return lookupSectionOutlineStroke(key, false);
	}

	protected java.awt.Stroke lookupSectionOutlineStroke(java.lang.Comparable key, boolean autoPopulate) {
		java.awt.Stroke result = null;
		result = org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap.getStroke(key);
		if (result != null) {
			return result;
		}
		if (autoPopulate) {
			org.jfree.chart.plot.DrawingSupplier ds = getDrawingSupplier();
			if (ds != null) {
				result = ds.getNextOutlineStroke();
				org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap.put(key, result);
			}else {
				result = org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke;
			}
		}else {
			result = org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke;
		}
		return result;
	}

	public java.awt.Stroke getSectionOutlineStroke(java.lang.Comparable key) {
		return org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap.getStroke(key);
	}

	public void setSectionOutlineStroke(java.lang.Comparable key, java.awt.Stroke stroke) {
		org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap.put(key, stroke);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Stroke getBaseSectionOutlineStroke() {
		return org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke;
	}

	public void setBaseSectionOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getShadowPaint() {
		return org.jfree.chart.plot.PiePlot.this.shadowPaint;
	}

	public void setShadowPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.shadowPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getShadowXOffset() {
		return org.jfree.chart.plot.PiePlot.this.shadowXOffset;
	}

	public void setShadowXOffset(double offset) {
		org.jfree.chart.plot.PiePlot.this.shadowXOffset = offset;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getShadowYOffset() {
		return org.jfree.chart.plot.PiePlot.this.shadowYOffset;
	}

	public void setShadowYOffset(double offset) {
		org.jfree.chart.plot.PiePlot.this.shadowYOffset = offset;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getExplodePercent(java.lang.Comparable key) {
		double result = 0.0;
		if ((org.jfree.chart.plot.PiePlot.this.explodePercentages) != null) {
			java.lang.Number percent = ((java.lang.Number) (org.jfree.chart.plot.PiePlot.this.explodePercentages.get(key)));
			if (percent != null) {
				result = percent.doubleValue();
			}
		}
		return result;
	}

	public void setExplodePercent(java.lang.Comparable key, double percent) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		if ((org.jfree.chart.plot.PiePlot.this.explodePercentages) == null) {
			org.jfree.chart.plot.PiePlot.this.explodePercentages = new java.util.TreeMap();
		}
		org.jfree.chart.plot.PiePlot.this.explodePercentages.put(key, new java.lang.Double(percent));
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getMaximumExplodePercent() {
		double result = 0.0;
		java.util.Iterator iterator = org.jfree.chart.plot.PiePlot.this.dataset.getKeys().iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			java.lang.Number explode = ((java.lang.Number) (org.jfree.chart.plot.PiePlot.this.explodePercentages.get(key)));
			if (explode != null) {
				result = java.lang.Math.max(result, explode.doubleValue());
			}
		} 
		return result;
	}

	public org.jfree.chart.labels.PieSectionLabelGenerator getLabelGenerator() {
		return org.jfree.chart.plot.PiePlot.this.labelGenerator;
	}

	public void setLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator generator) {
		org.jfree.chart.plot.PiePlot.this.labelGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getLabelGap() {
		return org.jfree.chart.plot.PiePlot.this.labelGap;
	}

	public void setLabelGap(double gap) {
		org.jfree.chart.plot.PiePlot.this.labelGap = gap;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getMaximumLabelWidth() {
		return org.jfree.chart.plot.PiePlot.this.maximumLabelWidth;
	}

	public void setMaximumLabelWidth(double width) {
		org.jfree.chart.plot.PiePlot.this.maximumLabelWidth = width;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public boolean getLabelLinksVisible() {
		return org.jfree.chart.plot.PiePlot.this.labelLinksVisible;
	}

	public void setLabelLinksVisible(boolean visible) {
		org.jfree.chart.plot.PiePlot.this.labelLinksVisible = visible;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getLabelLinkMargin() {
		return org.jfree.chart.plot.PiePlot.this.labelLinkMargin;
	}

	public void setLabelLinkMargin(double margin) {
		org.jfree.chart.plot.PiePlot.this.labelLinkMargin = margin;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getLabelLinkPaint() {
		return org.jfree.chart.plot.PiePlot.this.labelLinkPaint;
	}

	public void setLabelLinkPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.labelLinkPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Stroke getLabelLinkStroke() {
		return org.jfree.chart.plot.PiePlot.this.labelLinkStroke;
	}

	public void setLabelLinkStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.labelLinkStroke = stroke;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.plot.PiePlot.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.labelFont = font;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.plot.PiePlot.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.labelPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getLabelBackgroundPaint() {
		return org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint;
	}

	public void setLabelBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getLabelOutlinePaint() {
		return org.jfree.chart.plot.PiePlot.this.labelOutlinePaint;
	}

	public void setLabelOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.labelOutlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Stroke getLabelOutlineStroke() {
		return org.jfree.chart.plot.PiePlot.this.labelOutlineStroke;
	}

	public void setLabelOutlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.plot.PiePlot.this.labelOutlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public java.awt.Paint getLabelShadowPaint() {
		return org.jfree.chart.plot.PiePlot.this.labelShadowPaint;
	}

	public void setLabelShadowPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.PiePlot.this.labelShadowPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.plot.AbstractPieLabelDistributor getLabelDistributor() {
		return org.jfree.chart.plot.PiePlot.this.labelDistributor;
	}

	public void setLabelDistributor(org.jfree.chart.plot.AbstractPieLabelDistributor distributor) {
		if (distributor == null) {
			throw new java.lang.IllegalArgumentException("Null 'distributor' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.labelDistributor = distributor;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.labels.PieToolTipGenerator getToolTipGenerator() {
		return org.jfree.chart.plot.PiePlot.this.toolTipGenerator;
	}

	public void setToolTipGenerator(org.jfree.chart.labels.PieToolTipGenerator generator) {
		org.jfree.chart.plot.PiePlot.this.toolTipGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.urls.PieURLGenerator getURLGenerator() {
		return org.jfree.chart.plot.PiePlot.this.urlGenerator;
	}

	public void setURLGenerator(org.jfree.chart.urls.PieURLGenerator generator) {
		org.jfree.chart.plot.PiePlot.this.urlGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public double getMinimumArcAngleToDraw() {
		return org.jfree.chart.plot.PiePlot.this.minimumArcAngleToDraw;
	}

	public void setMinimumArcAngleToDraw(double angle) {
		org.jfree.chart.plot.PiePlot.this.minimumArcAngleToDraw = angle;
	}

	public java.awt.Shape getLegendItemShape() {
		return org.jfree.chart.plot.PiePlot.this.legendItemShape;
	}

	public void setLegendItemShape(java.awt.Shape shape) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.legendItemShape = shape;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.labels.PieSectionLabelGenerator getLegendLabelGenerator() {
		return org.jfree.chart.plot.PiePlot.this.legendLabelGenerator;
	}

	public void setLegendLabelGenerator(org.jfree.chart.labels.PieSectionLabelGenerator generator) {
		if (generator == null) {
			throw new java.lang.IllegalArgumentException("Null 'generator' argument.");
		}
		org.jfree.chart.plot.PiePlot.this.legendLabelGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.labels.PieSectionLabelGenerator getLegendLabelToolTipGenerator() {
		return org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator;
	}

	public void setLegendLabelToolTipGenerator(org.jfree.chart.labels.PieSectionLabelGenerator generator) {
		org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.urls.PieURLGenerator getLegendLabelURLGenerator() {
		return org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator;
	}

	public void setLegendLabelURLGenerator(org.jfree.chart.urls.PieURLGenerator generator) {
		org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator = generator;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot.this));
	}

	public org.jfree.chart.plot.PiePlotState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.plot.PiePlot plot, java.lang.Integer index, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PiePlotState state = new org.jfree.chart.plot.PiePlotState(info);
		state.setPassesRequired(2);
		state.setTotal(org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(plot.getDataset()));
		state.setLatestAngle(plot.getStartAngle());
		return state;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		if (info != null) {
			info.setPlotArea(area);
			info.setDataArea(area);
		}
		drawBackground(g2, area);
		drawOutline(g2, area);
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(area);
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		if (!(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.chart.plot.PiePlot.this.dataset))) {
			drawPie(g2, area, info);
		}else {
			drawNoDataMessage(g2, area);
		}
		g2.setClip(savedClip);
		g2.setComposite(originalComposite);
		drawOutline(g2, area);
	}

	protected void drawPie(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PiePlotState state = initialise(g2, plotArea, org.jfree.chart.plot.PiePlot.this, null, info);
		double labelWidth = 0.0;
		if ((org.jfree.chart.plot.PiePlot.this.labelGenerator) != null) {
			labelWidth = ((org.jfree.chart.plot.PiePlot.this.labelGap) + (org.jfree.chart.plot.PiePlot.this.maximumLabelWidth)) + (org.jfree.chart.plot.PiePlot.this.labelLinkMargin);
		}
		double gapHorizontal = (plotArea.getWidth()) * ((org.jfree.chart.plot.PiePlot.this.interiorGap) + labelWidth);
		double gapVertical = (plotArea.getHeight()) * (org.jfree.chart.plot.PiePlot.this.interiorGap);
		double linkX = (plotArea.getX()) + (gapHorizontal / 2);
		double linkY = (plotArea.getY()) + (gapVertical / 2);
		double linkW = (plotArea.getWidth()) - gapHorizontal;
		double linkH = (plotArea.getHeight()) - gapVertical;
		if (org.jfree.chart.plot.PiePlot.this.circular) {
			double min = (java.lang.Math.min(linkW, linkH)) / 2;
			linkX = (((linkX + linkX) + linkW) / 2) - min;
			linkY = (((linkY + linkY) + linkH) / 2) - min;
			linkW = 2 * min;
			linkH = 2 * min;
		}
		java.awt.geom.Rectangle2D linkArea = new java.awt.geom.Rectangle2D.Double(linkX, linkY, linkW, linkH);
		state.setLinkArea(linkArea);
		double hh = (linkArea.getWidth()) * (org.jfree.chart.plot.PiePlot.this.labelLinkMargin);
		double vv = (linkArea.getHeight()) * (org.jfree.chart.plot.PiePlot.this.labelLinkMargin);
		java.awt.geom.Rectangle2D explodeArea = new java.awt.geom.Rectangle2D.Double((linkX + (hh / 2.0)), (linkY + (vv / 2.0)), (linkW - hh), (linkH - vv));
		state.setExplodedPieArea(explodeArea);
		double maximumExplodePercent = getMaximumExplodePercent();
		double percent = maximumExplodePercent / (1.0 + maximumExplodePercent);
		double h1 = (explodeArea.getWidth()) * percent;
		double v1 = (explodeArea.getHeight()) * percent;
		java.awt.geom.Rectangle2D pieArea = new java.awt.geom.Rectangle2D.Double(((explodeArea.getX()) + (h1 / 2.0)), ((explodeArea.getY()) + (v1 / 2.0)), ((explodeArea.getWidth()) - h1), ((explodeArea.getHeight()) - v1));
		state.setPieArea(pieArea);
		state.setPieCenterX(pieArea.getCenterX());
		state.setPieCenterY(pieArea.getCenterY());
		state.setPieWRadius(((pieArea.getWidth()) / 2.0));
		state.setPieHRadius(((pieArea.getHeight()) / 2.0));
		if (((org.jfree.chart.plot.PiePlot.this.dataset) != null) && ((org.jfree.chart.plot.PiePlot.this.dataset.getKeys().size()) > 0)) {
			java.util.List keys = org.jfree.chart.plot.PiePlot.this.dataset.getKeys();
			double totalValue = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.chart.plot.PiePlot.this.dataset);
			int passesRequired = state.getPassesRequired();
			for (int pass = 0; pass < passesRequired; pass++) {
				double runningTotal = 0.0;
				for (int section = 0; section < (keys.size()); section++) {
					java.lang.Number n = org.jfree.chart.plot.PiePlot.this.dataset.getValue(section);
					if (n != null) {
						double value = n.doubleValue();
						if (value > 0.0) {
							runningTotal += value;
							drawItem(g2, section, explodeArea, state, pass);
						}
					}
				}
			}
			drawLabels(g2, keys, totalValue, plotArea, linkArea, state);
		}else {
			drawNoDataMessage(g2, plotArea);
		}
	}

	protected void drawItem(java.awt.Graphics2D g2, int section, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PiePlotState state, int currentPass) {
		java.lang.Number n = org.jfree.chart.plot.PiePlot.this.dataset.getValue(section);
		if (n == null) {
			return ;
		}
		double value = n.doubleValue();
		double angle1 = 0.0;
		double angle2 = 0.0;
		if ((org.jfree.chart.plot.PiePlot.this.direction) == (org.jfree.chart.util.Rotation.CLOCKWISE)) {
			angle1 = state.getLatestAngle();
			angle2 = angle1 - ((value / (state.getTotal())) * 360.0);
		}else
			if ((org.jfree.chart.plot.PiePlot.this.direction) == (org.jfree.chart.util.Rotation.ANTICLOCKWISE)) {
				angle1 = state.getLatestAngle();
				angle2 = angle1 + ((value / (state.getTotal())) * 360.0);
			}else {
				throw new java.lang.IllegalStateException("Rotation type not recognised.");
			}
		
		double angle = angle2 - angle1;
		if ((java.lang.Math.abs(angle)) > (getMinimumArcAngleToDraw())) {
			double ep = 0.0;
			double mep = getMaximumExplodePercent();
			if (mep > 0.0) {
				ep = (getExplodePercent(getSectionKey(section))) / mep;
			}
			java.awt.geom.Rectangle2D arcBounds = getArcBounds(state.getPieArea(), state.getExplodedPieArea(), angle1, angle, ep);
			java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(arcBounds, angle1, angle, java.awt.geom.Arc2D.PIE);
			if (currentPass == 0) {
				if ((org.jfree.chart.plot.PiePlot.this.shadowPaint) != null) {
					java.awt.Shape shadowArc = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(arc, ((float) (org.jfree.chart.plot.PiePlot.this.shadowXOffset)), ((float) (org.jfree.chart.plot.PiePlot.this.shadowYOffset)));
					g2.setPaint(org.jfree.chart.plot.PiePlot.this.shadowPaint);
					g2.fill(shadowArc);
				}
			}else
				if (currentPass == 1) {
					java.lang.Comparable key = getSectionKey(section);
					java.awt.Paint paint = lookupSectionPaint(key, true);
					g2.setPaint(paint);
					g2.fill(arc);
					java.awt.Paint outlinePaint = lookupSectionOutlinePaint(key);
					java.awt.Stroke outlineStroke = lookupSectionOutlineStroke(key);
					if (org.jfree.chart.plot.PiePlot.this.sectionOutlinesVisible) {
						g2.setPaint(outlinePaint);
						g2.setStroke(outlineStroke);
						g2.draw(arc);
					}
					if ((state.getInfo()) != null) {
						org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
						if (entities != null) {
							java.lang.String tip = null;
							if ((org.jfree.chart.plot.PiePlot.this.toolTipGenerator) != null) {
								tip = org.jfree.chart.plot.PiePlot.this.toolTipGenerator.generateToolTip(org.jfree.chart.plot.PiePlot.this.dataset, key);
							}
							java.lang.String url = null;
							if ((org.jfree.chart.plot.PiePlot.this.urlGenerator) != null) {
								url = org.jfree.chart.plot.PiePlot.this.urlGenerator.generateURL(org.jfree.chart.plot.PiePlot.this.dataset, key, org.jfree.chart.plot.PiePlot.this.pieIndex);
							}
							org.jfree.chart.entity.PieSectionEntity entity = new org.jfree.chart.entity.PieSectionEntity(arc, org.jfree.chart.plot.PiePlot.this.dataset, org.jfree.chart.plot.PiePlot.this.pieIndex, section, key, tip, url);
							entities.add(entity);
						}
					}
				}
			
		}
		state.setLatestAngle(angle2);
	}

	protected void drawLabels(java.awt.Graphics2D g2, java.util.List keys, double totalValue, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D linkArea, org.jfree.chart.plot.PiePlotState state) {
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 1.0F));
		org.jfree.data.DefaultKeyedValues leftKeys = new org.jfree.data.DefaultKeyedValues();
		org.jfree.data.DefaultKeyedValues rightKeys = new org.jfree.data.DefaultKeyedValues();
		double runningTotal1 = 0.0;
		java.util.Iterator iterator1 = keys.iterator();
		while (iterator1.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator1.next()));
			boolean include = true;
			double v = 0.0;
			java.lang.Number n = org.jfree.chart.plot.PiePlot.this.dataset.getValue(key);
			if (n == null) {
				include = !(org.jfree.chart.plot.PiePlot.this.ignoreNullValues);
			}else {
				v = n.doubleValue();
				include = (org.jfree.chart.plot.PiePlot.this.ignoreZeroValues) ? v > 0.0 : v >= 0.0;
			}
			if (include) {
				runningTotal1 = runningTotal1 + v;
				double mid = (org.jfree.chart.plot.PiePlot.this.startAngle) + (((org.jfree.chart.plot.PiePlot.this.direction.getFactor()) * ((runningTotal1 - (v / 2.0)) * 360)) / totalValue);
				if ((java.lang.Math.cos(java.lang.Math.toRadians(mid))) < 0.0) {
					leftKeys.addValue(key, new java.lang.Double(mid));
				}else {
					rightKeys.addValue(key, new java.lang.Double(mid));
				}
			}
		} 
		g2.setFont(getLabelFont());
		float maxLabelWidth = ((float) ((getMaximumLabelWidth()) * (plotArea.getWidth())));
		if ((org.jfree.chart.plot.PiePlot.this.labelGenerator) != null) {
			drawLeftLabels(leftKeys, g2, plotArea, linkArea, maxLabelWidth, state);
			drawRightLabels(rightKeys, g2, plotArea, linkArea, maxLabelWidth, state);
		}
		g2.setComposite(originalComposite);
	}

	protected void drawLeftLabels(org.jfree.data.KeyedValues leftKeys, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D linkArea, float maxLabelWidth, org.jfree.chart.plot.PiePlotState state) {
		org.jfree.chart.plot.PiePlot.this.labelDistributor.clear();
		double lGap = (plotArea.getWidth()) * (org.jfree.chart.plot.PiePlot.this.labelGap);
		double verticalLinkRadius = (state.getLinkArea().getHeight()) / 2.0;
		for (int i = 0; i < (leftKeys.getItemCount()); i++) {
			java.lang.String label = org.jfree.chart.plot.PiePlot.this.labelGenerator.generateSectionLabel(org.jfree.chart.plot.PiePlot.this.dataset, leftKeys.getKey(i));
			if (label != null) {
				org.jfree.chart.text.TextBlock block = org.jfree.chart.text.TextUtilities.createTextBlock(label, org.jfree.chart.plot.PiePlot.this.labelFont, org.jfree.chart.plot.PiePlot.this.labelPaint, maxLabelWidth, new org.jfree.chart.text.G2TextMeasurer(g2));
				org.jfree.chart.text.TextBox labelBox = new org.jfree.chart.text.TextBox(block);
				labelBox.setBackgroundPaint(org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint);
				labelBox.setOutlinePaint(org.jfree.chart.plot.PiePlot.this.labelOutlinePaint);
				labelBox.setOutlineStroke(org.jfree.chart.plot.PiePlot.this.labelOutlineStroke);
				labelBox.setShadowPaint(org.jfree.chart.plot.PiePlot.this.labelShadowPaint);
				double theta = java.lang.Math.toRadians(leftKeys.getValue(i).doubleValue());
				double baseY = (state.getPieCenterY()) - ((java.lang.Math.sin(theta)) * verticalLinkRadius);
				double hh = labelBox.getHeight(g2);
				org.jfree.chart.plot.PiePlot.this.labelDistributor.addPieLabelRecord(new org.jfree.chart.plot.PieLabelRecord(leftKeys.getKey(i), theta, baseY, labelBox, hh, ((lGap / 2.0) + ((lGap / 2.0) * (-(java.lang.Math.cos(theta))))), (0.9 + (getExplodePercent(leftKeys.getKey(i))))));
			}
		}
		org.jfree.chart.plot.PiePlot.this.labelDistributor.distributeLabels(plotArea.getMinY(), plotArea.getHeight());
		for (int i = 0; i < (org.jfree.chart.plot.PiePlot.this.labelDistributor.getItemCount()); i++) {
			drawLeftLabel(g2, state, org.jfree.chart.plot.PiePlot.this.labelDistributor.getPieLabelRecord(i));
		}
	}

	protected void drawRightLabels(org.jfree.data.KeyedValues keys, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D linkArea, float maxLabelWidth, org.jfree.chart.plot.PiePlotState state) {
		org.jfree.chart.plot.PiePlot.this.labelDistributor.clear();
		double lGap = (plotArea.getWidth()) * (org.jfree.chart.plot.PiePlot.this.labelGap);
		double verticalLinkRadius = (state.getLinkArea().getHeight()) / 2.0;
		for (int i = 0; i < (keys.getItemCount()); i++) {
			java.lang.String label = org.jfree.chart.plot.PiePlot.this.labelGenerator.generateSectionLabel(org.jfree.chart.plot.PiePlot.this.dataset, keys.getKey(i));
			if (label != null) {
				org.jfree.chart.text.TextBlock block = org.jfree.chart.text.TextUtilities.createTextBlock(label, org.jfree.chart.plot.PiePlot.this.labelFont, org.jfree.chart.plot.PiePlot.this.labelPaint, maxLabelWidth, new org.jfree.chart.text.G2TextMeasurer(g2));
				org.jfree.chart.text.TextBox labelBox = new org.jfree.chart.text.TextBox(block);
				labelBox.setBackgroundPaint(org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint);
				labelBox.setOutlinePaint(org.jfree.chart.plot.PiePlot.this.labelOutlinePaint);
				labelBox.setOutlineStroke(org.jfree.chart.plot.PiePlot.this.labelOutlineStroke);
				labelBox.setShadowPaint(org.jfree.chart.plot.PiePlot.this.labelShadowPaint);
				double theta = java.lang.Math.toRadians(keys.getValue(i).doubleValue());
				double baseY = (state.getPieCenterY()) - ((java.lang.Math.sin(theta)) * verticalLinkRadius);
				double hh = labelBox.getHeight(g2);
				org.jfree.chart.plot.PiePlot.this.labelDistributor.addPieLabelRecord(new org.jfree.chart.plot.PieLabelRecord(keys.getKey(i), theta, baseY, labelBox, hh, ((lGap / 2.0) + ((lGap / 2.0) * (java.lang.Math.cos(theta)))), (0.9 + (getExplodePercent(keys.getKey(i))))));
			}
		}
		org.jfree.chart.plot.PiePlot.this.labelDistributor.distributeLabels(plotArea.getMinY(), plotArea.getHeight());
		for (int i = 0; i < (org.jfree.chart.plot.PiePlot.this.labelDistributor.getItemCount()); i++) {
			drawRightLabel(g2, state, org.jfree.chart.plot.PiePlot.this.labelDistributor.getPieLabelRecord(i));
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		if ((org.jfree.chart.plot.PiePlot.this.dataset) == null) {
			return result;
		}
		java.util.List keys = org.jfree.chart.plot.PiePlot.this.dataset.getKeys();
		int section = 0;
		java.awt.Shape shape = getLegendItemShape();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			java.lang.Number n = org.jfree.chart.plot.PiePlot.this.dataset.getValue(key);
			boolean include = true;
			if (n == null) {
				include = !(org.jfree.chart.plot.PiePlot.this.ignoreNullValues);
			}else {
				double v = n.doubleValue();
				if (v == 0.0) {
					include = !(org.jfree.chart.plot.PiePlot.this.ignoreZeroValues);
				}else {
					include = v > 0.0;
				}
			}
			if (include) {
				java.lang.String label = org.jfree.chart.plot.PiePlot.this.legendLabelGenerator.generateSectionLabel(org.jfree.chart.plot.PiePlot.this.dataset, key);
				if (label != null) {
					java.lang.String description = label;
					java.lang.String toolTipText = null;
					if ((org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator) != null) {
						toolTipText = org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator.generateSectionLabel(org.jfree.chart.plot.PiePlot.this.dataset, key);
					}
					java.lang.String urlText = null;
					if ((org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator) != null) {
						urlText = org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator.generateURL(org.jfree.chart.plot.PiePlot.this.dataset, key, org.jfree.chart.plot.PiePlot.this.pieIndex);
					}
					java.awt.Paint paint = lookupSectionPaint(key, true);
					java.awt.Paint outlinePaint = lookupSectionOutlinePaint(key);
					java.awt.Stroke outlineStroke = lookupSectionOutlineStroke(key);
					org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, true, shape, true, paint, true, outlinePaint, outlineStroke, false, new java.awt.geom.Line2D.Float(), new java.awt.BasicStroke(), java.awt.Color.black);
					item.setDataset(getDataset());
					result.add(item);
				}
				section++;
			}else {
				section++;
			}
		} 
		return result;
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.PiePlot.localizationResources.getString("Pie_Plot");
	}

	protected java.awt.geom.Rectangle2D getArcBounds(java.awt.geom.Rectangle2D unexploded, java.awt.geom.Rectangle2D exploded, double angle, double extent, double explodePercent) {
		if (explodePercent == 0.0) {
			return unexploded;
		}else {
			java.awt.geom.Arc2D arc1 = new java.awt.geom.Arc2D.Double(unexploded, angle, (extent / 2), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D point1 = arc1.getEndPoint();
			java.awt.geom.Arc2D.Double arc2 = new java.awt.geom.Arc2D.Double(exploded, angle, (extent / 2), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.Point2D point2 = arc2.getEndPoint();
			double deltaX = ((point1.getX()) - (point2.getX())) * explodePercent;
			double deltaY = ((point1.getY()) - (point2.getY())) * explodePercent;
			return new java.awt.geom.Rectangle2D.Double(((unexploded.getX()) - deltaX), ((unexploded.getY()) - deltaY), unexploded.getWidth(), unexploded.getHeight());
		}
	}

	protected void drawLeftLabel(java.awt.Graphics2D g2, org.jfree.chart.plot.PiePlotState state, org.jfree.chart.plot.PieLabelRecord record) {
		double anchorX = state.getLinkArea().getMinX();
		double targetX = anchorX - (record.getGap());
		double targetY = record.getAllocatedY();
		if (org.jfree.chart.plot.PiePlot.this.labelLinksVisible) {
			double theta = record.getAngle();
			double linkX = (state.getPieCenterX()) + (((java.lang.Math.cos(theta)) * (state.getPieWRadius())) * (record.getLinkPercent()));
			double linkY = (state.getPieCenterY()) - (((java.lang.Math.sin(theta)) * (state.getPieHRadius())) * (record.getLinkPercent()));
			double elbowX = (state.getPieCenterX()) + (((java.lang.Math.cos(theta)) * (state.getLinkArea().getWidth())) / 2.0);
			double elbowY = (state.getPieCenterY()) - (((java.lang.Math.sin(theta)) * (state.getLinkArea().getHeight())) / 2.0);
			double anchorY = elbowY;
			g2.setPaint(org.jfree.chart.plot.PiePlot.this.labelLinkPaint);
			g2.setStroke(org.jfree.chart.plot.PiePlot.this.labelLinkStroke);
			g2.draw(new java.awt.geom.Line2D.Double(linkX, linkY, elbowX, elbowY));
			g2.draw(new java.awt.geom.Line2D.Double(anchorX, anchorY, elbowX, elbowY));
			g2.draw(new java.awt.geom.Line2D.Double(anchorX, anchorY, targetX, targetY));
		}
		org.jfree.chart.text.TextBox tb = record.getLabel();
		tb.draw(g2, ((float) (targetX)), ((float) (targetY)), org.jfree.chart.util.RectangleAnchor.RIGHT);
	}

	protected void drawRightLabel(java.awt.Graphics2D g2, org.jfree.chart.plot.PiePlotState state, org.jfree.chart.plot.PieLabelRecord record) {
		double anchorX = state.getLinkArea().getMaxX();
		double targetX = anchorX + (record.getGap());
		double targetY = record.getAllocatedY();
		if (org.jfree.chart.plot.PiePlot.this.labelLinksVisible) {
			double theta = record.getAngle();
			double linkX = (state.getPieCenterX()) + (((java.lang.Math.cos(theta)) * (state.getPieWRadius())) * (record.getLinkPercent()));
			double linkY = (state.getPieCenterY()) - (((java.lang.Math.sin(theta)) * (state.getPieHRadius())) * (record.getLinkPercent()));
			double elbowX = (state.getPieCenterX()) + (((java.lang.Math.cos(theta)) * (state.getLinkArea().getWidth())) / 2.0);
			double elbowY = (state.getPieCenterY()) - (((java.lang.Math.sin(theta)) * (state.getLinkArea().getHeight())) / 2.0);
			double anchorY = elbowY;
			g2.setPaint(org.jfree.chart.plot.PiePlot.this.labelLinkPaint);
			g2.setStroke(org.jfree.chart.plot.PiePlot.this.labelLinkStroke);
			g2.draw(new java.awt.geom.Line2D.Double(linkX, linkY, elbowX, elbowY));
			g2.draw(new java.awt.geom.Line2D.Double(anchorX, anchorY, elbowX, elbowY));
			g2.draw(new java.awt.geom.Line2D.Double(anchorX, anchorY, targetX, targetY));
		}
		org.jfree.chart.text.TextBox tb = record.getLabel();
		tb.draw(g2, ((float) (targetX)), ((float) (targetY)), org.jfree.chart.util.RectangleAnchor.LEFT);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.PiePlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PiePlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.PiePlot that = ((org.jfree.chart.plot.PiePlot) (obj));
		if ((org.jfree.chart.plot.PiePlot.this.pieIndex) != (that.pieIndex)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.interiorGap) != (that.interiorGap)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.circular) != (that.circular)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.startAngle) != (that.startAngle)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.direction) != (that.direction)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.ignoreZeroValues) != (that.ignoreZeroValues)) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.ignoreNullValues) != (that.ignoreNullValues)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.sectionPaintMap, that.sectionPaintMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.baseSectionPaint, that.baseSectionPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.sectionOutlinesVisible) != (that.sectionOutlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.sectionOutlinePaintMap, that.sectionOutlinePaintMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint, that.baseSectionOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.sectionOutlineStrokeMap, that.sectionOutlineStrokeMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke, that.baseSectionOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.shadowPaint, that.shadowPaint))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.shadowXOffset) == (that.shadowXOffset))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.shadowYOffset) == (that.shadowYOffset))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.explodePercentages, that.explodePercentages))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelGenerator, that.labelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelFont, that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelPaint, that.labelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint, that.labelBackgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelOutlinePaint, that.labelOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelOutlineStroke, that.labelOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelShadowPaint, that.labelShadowPaint))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.maximumLabelWidth) == (that.maximumLabelWidth))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.labelGap) == (that.labelGap))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.labelLinkMargin) == (that.labelLinkMargin))) {
			return false;
		}
		if ((org.jfree.chart.plot.PiePlot.this.labelLinksVisible) != (that.labelLinksVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelLinkPaint, that.labelLinkPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.labelLinkStroke, that.labelLinkStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.toolTipGenerator, that.toolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.urlGenerator, that.urlGenerator))) {
			return false;
		}
		if (!((org.jfree.chart.plot.PiePlot.this.minimumArcAngleToDraw) == (that.minimumArcAngleToDraw))) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.plot.PiePlot.this.legendItemShape, that.legendItemShape))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.legendLabelGenerator, that.legendLabelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator, that.legendLabelToolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator, that.legendLabelURLGenerator))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.PiePlot clone = ((org.jfree.chart.plot.PiePlot) (super.clone()));
		if ((clone.dataset) != null) {
			clone.dataset.addChangeListener(clone);
		}
		if ((org.jfree.chart.plot.PiePlot.this.urlGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.urlGenerator = ((org.jfree.chart.urls.PieURLGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PiePlot.this.urlGenerator)));
		}
		clone.legendItemShape = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.plot.PiePlot.this.legendItemShape);
		if ((org.jfree.chart.plot.PiePlot.this.legendLabelGenerator) != null) {
			clone.legendLabelGenerator = ((org.jfree.chart.labels.PieSectionLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PiePlot.this.legendLabelGenerator)));
		}
		if ((org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator) != null) {
			clone.legendLabelToolTipGenerator = ((org.jfree.chart.labels.PieSectionLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PiePlot.this.legendLabelToolTipGenerator)));
		}
		if ((org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendLabelURLGenerator = ((org.jfree.chart.urls.PieURLGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.PiePlot.this.legendLabelURLGenerator)));
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.baseSectionPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.shadowPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.labelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.labelOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.PiePlot.this.labelOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.labelShadowPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.PiePlot.this.labelLinkPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.PiePlot.this.labelLinkStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.plot.PiePlot.this.legendItemShape, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.PiePlot.this.baseSectionPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.baseSectionOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.PiePlot.this.shadowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.PiePlot.this.labelShadowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelLinkPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.PiePlot.this.labelLinkStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.PiePlot.this.legendItemShape = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}
}

