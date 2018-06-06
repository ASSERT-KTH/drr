

package org.jfree.chart.plot;


public class ThermometerPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.ValueAxisPlot , org.jfree.chart.plot.Zoomable {
	private static final long serialVersionUID = 4087093313147984390L;

	public static final int UNITS_NONE = 0;

	public static final int UNITS_FAHRENHEIT = 1;

	public static final int UNITS_CELCIUS = 2;

	public static final int UNITS_KELVIN = 3;

	public static final int NONE = 0;

	public static final int RIGHT = 1;

	public static final int LEFT = 2;

	public static final int BULB = 3;

	public static final int NORMAL = 0;

	public static final int WARNING = 1;

	public static final int CRITICAL = 2;

	protected static final int BULB_RADIUS = 40;

	protected static final int BULB_DIAMETER = (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS) * 2;

	protected static final int COLUMN_RADIUS = 20;

	protected static final int COLUMN_DIAMETER = (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS) * 2;

	protected static final int GAP_RADIUS = 5;

	protected static final int GAP_DIAMETER = (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS) * 2;

	protected static final int AXIS_GAP = 10;

	protected static final java.lang.String[] UNITS = new java.lang.String[]{ "" , "\u00b0F" , "\u00b0C" , "\u00b0K" };

	protected static final int RANGE_LOW = 0;

	protected static final int RANGE_HIGH = 1;

	protected static final int DISPLAY_LOW = 2;

	protected static final int DISPLAY_HIGH = 3;

	protected static final double DEFAULT_LOWER_BOUND = 0.0;

	protected static final double DEFAULT_UPPER_BOUND = 100.0;

	private org.jfree.data.general.ValueDataset dataset;

	private org.jfree.chart.axis.ValueAxis rangeAxis;

	private double lowerBound = org.jfree.chart.plot.ThermometerPlot.DEFAULT_LOWER_BOUND;

	private double upperBound = org.jfree.chart.plot.ThermometerPlot.DEFAULT_UPPER_BOUND;

	private org.jfree.chart.util.RectangleInsets padding;

	private transient java.awt.Stroke thermometerStroke = new java.awt.BasicStroke(1.0F);

	private transient java.awt.Paint thermometerPaint = java.awt.Color.black;

	private int units = org.jfree.chart.plot.ThermometerPlot.UNITS_CELCIUS;

	private int valueLocation = org.jfree.chart.plot.ThermometerPlot.BULB;

	private int axisLocation = org.jfree.chart.plot.ThermometerPlot.LEFT;

	private java.awt.Font valueFont = new java.awt.Font("SansSerif", java.awt.Font.BOLD, 16);

	private transient java.awt.Paint valuePaint = java.awt.Color.white;

	private java.text.NumberFormat valueFormat = new java.text.DecimalFormat();

	private transient java.awt.Paint mercuryPaint = java.awt.Color.lightGray;

	private int subrange = -1;

	private double[][] subrangeInfo = new double[][]{ new double[]{ 0.0 , 50.0 , 0.0 , 50.0 } , new double[]{ 50.0 , 75.0 , 50.0 , 75.0 } , new double[]{ 75.0 , 100.0 , 75.0 , 100.0 } };

	private boolean followDataInSubranges = false;

	private boolean useSubrangePaint = true;

	private transient java.awt.Paint[] subrangePaint = new java.awt.Paint[]{ java.awt.Color.green , java.awt.Color.orange , java.awt.Color.red };

	private boolean subrangeIndicatorsVisible = true;

	private transient java.awt.Stroke subrangeIndicatorStroke = new java.awt.BasicStroke(2.0F);

	private transient java.awt.Stroke rangeIndicatorStroke = new java.awt.BasicStroke(3.0F);

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.plot.LocalizationBundle");

	public ThermometerPlot() {
		this(new org.jfree.data.general.DefaultValueDataset());
	}

	public ThermometerPlot(org.jfree.data.general.ValueDataset dataset) {
		super();
		org.jfree.chart.plot.ThermometerPlot.this.padding = new org.jfree.chart.util.RectangleInsets(org.jfree.chart.util.UnitType.RELATIVE, 0.05, 0.05, 0.05, 0.05);
		org.jfree.chart.plot.ThermometerPlot.this.dataset = dataset;
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		}
		org.jfree.chart.axis.NumberAxis axis = new org.jfree.chart.axis.NumberAxis(null);
		axis.setStandardTickUnits(org.jfree.chart.axis.NumberAxis.createIntegerTickUnits());
		axis.setAxisLineVisible(false);
		axis.setPlot(org.jfree.chart.plot.ThermometerPlot.this);
		axis.addChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		org.jfree.chart.plot.ThermometerPlot.this.rangeAxis = axis;
		setAxisRange();
	}

	public org.jfree.data.general.ValueDataset getDataset() {
		return org.jfree.chart.plot.ThermometerPlot.this.dataset;
	}

	public void setDataset(org.jfree.data.general.ValueDataset dataset) {
		org.jfree.data.general.ValueDataset existing = org.jfree.chart.plot.ThermometerPlot.this.dataset;
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		}
		org.jfree.chart.plot.ThermometerPlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.ThermometerPlot.this, dataset);
		datasetChanged(event);
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis() {
		return org.jfree.chart.plot.ThermometerPlot.this.rangeAxis;
	}

	public void setRangeAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.removeChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		axis.setPlot(org.jfree.chart.plot.ThermometerPlot.this);
		axis.addChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		org.jfree.chart.plot.ThermometerPlot.this.rangeAxis = axis;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public double getLowerBound() {
		return org.jfree.chart.plot.ThermometerPlot.this.lowerBound;
	}

	public void setLowerBound(double lower) {
		org.jfree.chart.plot.ThermometerPlot.this.lowerBound = lower;
		setAxisRange();
	}

	public double getUpperBound() {
		return org.jfree.chart.plot.ThermometerPlot.this.upperBound;
	}

	public void setUpperBound(double upper) {
		org.jfree.chart.plot.ThermometerPlot.this.upperBound = upper;
		setAxisRange();
	}

	public void setRange(double lower, double upper) {
		org.jfree.chart.plot.ThermometerPlot.this.lowerBound = lower;
		org.jfree.chart.plot.ThermometerPlot.this.upperBound = upper;
		setAxisRange();
	}

	public org.jfree.chart.util.RectangleInsets getPadding() {
		return org.jfree.chart.plot.ThermometerPlot.this.padding;
	}

	public void setPadding(org.jfree.chart.util.RectangleInsets padding) {
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		org.jfree.chart.plot.ThermometerPlot.this.padding = padding;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public java.awt.Stroke getThermometerStroke() {
		return org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke;
	}

	public void setThermometerStroke(java.awt.Stroke s) {
		if (s != null) {
			org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke = s;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public java.awt.Paint getThermometerPaint() {
		return org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint;
	}

	public void setThermometerPaint(java.awt.Paint paint) {
		if (paint != null) {
			org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint = paint;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public int getUnits() {
		return org.jfree.chart.plot.ThermometerPlot.this.units;
	}

	public void setUnits(int u) {
		if ((u >= 0) && (u < (org.jfree.chart.plot.ThermometerPlot.UNITS.length))) {
			if ((org.jfree.chart.plot.ThermometerPlot.this.units) != u) {
				org.jfree.chart.plot.ThermometerPlot.this.units = u;
				notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
			}
		}
	}

	public int getValueLocation() {
		return org.jfree.chart.plot.ThermometerPlot.this.valueLocation;
	}

	public void setValueLocation(int location) {
		if ((location >= 0) && (location < 4)) {
			org.jfree.chart.plot.ThermometerPlot.this.valueLocation = location;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}else {
			throw new java.lang.IllegalArgumentException("Location not recognised.");
		}
	}

	public int getAxisLocation() {
		return org.jfree.chart.plot.ThermometerPlot.this.axisLocation;
	}

	public void setAxisLocation(int location) {
		if ((location >= 0) && (location < 3)) {
			org.jfree.chart.plot.ThermometerPlot.this.axisLocation = location;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}else {
			throw new java.lang.IllegalArgumentException("Location not recognised.");
		}
	}

	public java.awt.Font getValueFont() {
		return org.jfree.chart.plot.ThermometerPlot.this.valueFont;
	}

	public void setValueFont(java.awt.Font f) {
		if (f == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (!(org.jfree.chart.plot.ThermometerPlot.this.valueFont.equals(f))) {
			org.jfree.chart.plot.ThermometerPlot.this.valueFont = f;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public java.awt.Paint getValuePaint() {
		return org.jfree.chart.plot.ThermometerPlot.this.valuePaint;
	}

	public void setValuePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (!(org.jfree.chart.plot.ThermometerPlot.this.valuePaint.equals(paint))) {
			org.jfree.chart.plot.ThermometerPlot.this.valuePaint = paint;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public void setValueFormat(java.text.NumberFormat formatter) {
		if (formatter == null) {
			throw new java.lang.IllegalArgumentException("Null 'formatter' argument.");
		}
		org.jfree.chart.plot.ThermometerPlot.this.valueFormat = formatter;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public java.awt.Paint getMercuryPaint() {
		return org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint;
	}

	public void setMercuryPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public void setSubrangeInfo(int range, double low, double hi) {
		setSubrangeInfo(range, low, hi, low, hi);
	}

	public void setSubrangeInfo(int range, double rangeLow, double rangeHigh, double displayLow, double displayHigh) {
		if ((range >= 0) && (range < 3)) {
			setSubrange(range, rangeLow, rangeHigh);
			setDisplayRange(range, displayLow, displayHigh);
			setAxisRange();
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public void setSubrange(int range, double low, double high) {
		if ((range >= 0) && (range < 3)) {
			org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.RANGE_HIGH] = high;
			org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.RANGE_LOW] = low;
		}
	}

	public void setDisplayRange(int range, double low, double high) {
		if ((((range >= 0) && (range < (org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo.length))) && (org.jfree.chart.plot.ThermometerPlot.isValidNumber(high))) && (org.jfree.chart.plot.ThermometerPlot.isValidNumber(low))) {
			if (high > low) {
				org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.DISPLAY_HIGH] = high;
				org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.DISPLAY_LOW] = low;
			}else {
				org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.DISPLAY_HIGH] = low;
				org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[range][org.jfree.chart.plot.ThermometerPlot.DISPLAY_LOW] = high;
			}
		}
	}

	public java.awt.Paint getSubrangePaint(int range) {
		if ((range >= 0) && (range < (org.jfree.chart.plot.ThermometerPlot.this.subrangePaint.length))) {
			return org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[range];
		}else {
			return org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint;
		}
	}

	public void setSubrangePaint(int range, java.awt.Paint paint) {
		if (((range >= 0) && (range < (org.jfree.chart.plot.ThermometerPlot.this.subrangePaint.length))) && (paint != null)) {
			org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[range] = paint;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
		}
	}

	public boolean getFollowDataInSubranges() {
		return org.jfree.chart.plot.ThermometerPlot.this.followDataInSubranges;
	}

	public void setFollowDataInSubranges(boolean flag) {
		org.jfree.chart.plot.ThermometerPlot.this.followDataInSubranges = flag;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public boolean getUseSubrangePaint() {
		return org.jfree.chart.plot.ThermometerPlot.this.useSubrangePaint;
	}

	public void setUseSubrangePaint(boolean flag) {
		org.jfree.chart.plot.ThermometerPlot.this.useSubrangePaint = flag;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.ThermometerPlot.this));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.RoundRectangle2D outerStem = new java.awt.geom.RoundRectangle2D.Double();
		java.awt.geom.RoundRectangle2D innerStem = new java.awt.geom.RoundRectangle2D.Double();
		java.awt.geom.RoundRectangle2D mercuryStem = new java.awt.geom.RoundRectangle2D.Double();
		java.awt.geom.Ellipse2D outerBulb = new java.awt.geom.Ellipse2D.Double();
		java.awt.geom.Ellipse2D innerBulb = new java.awt.geom.Ellipse2D.Double();
		java.lang.String temp = null;
		java.awt.FontMetrics metrics = null;
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		drawBackground(g2, area);
		java.awt.geom.Rectangle2D interior = ((java.awt.geom.Rectangle2D) (area.clone()));
		org.jfree.chart.plot.ThermometerPlot.this.padding.trim(interior);
		int midX = ((int) ((interior.getX()) + ((interior.getWidth()) / 2)));
		int midY = ((int) ((interior.getY()) + ((interior.getHeight()) / 2)));
		int stemTop = ((int) ((interior.getMinY()) + (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS)));
		int stemBottom = ((int) ((interior.getMaxY()) - (org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER)));
		java.awt.geom.Rectangle2D dataArea = new java.awt.geom.Rectangle2D.Double((midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)), stemTop, org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS, (stemBottom - stemTop));
		outerBulb.setFrame((midX - (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS)), stemBottom, org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER, org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER);
		outerStem.setRoundRect((midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)), interior.getMinY(), org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER, ((stemBottom + (org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER)) - stemTop), org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER, org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER);
		java.awt.geom.Area outerThermometer = new java.awt.geom.Area(outerBulb);
		java.awt.geom.Area tempArea = new java.awt.geom.Area(outerStem);
		outerThermometer.add(tempArea);
		innerBulb.setFrame(((midX - (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS)) + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)), (stemBottom + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)), ((org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)), ((org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)));
		innerStem.setRoundRect(((midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)), ((interior.getMinY()) + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)), ((org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)), (((stemBottom + (org.jfree.chart.plot.ThermometerPlot.BULB_DIAMETER)) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)) - stemTop), ((org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)), ((org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)));
		java.awt.geom.Area innerThermometer = new java.awt.geom.Area(innerBulb);
		tempArea = new java.awt.geom.Area(innerStem);
		innerThermometer.add(tempArea);
		if (((org.jfree.chart.plot.ThermometerPlot.this.dataset) != null) && ((org.jfree.chart.plot.ThermometerPlot.this.dataset.getValue()) != null)) {
			double current = org.jfree.chart.plot.ThermometerPlot.this.dataset.getValue().doubleValue();
			double ds = org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.valueToJava2D(current, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
			int i = (org.jfree.chart.plot.ThermometerPlot.COLUMN_DIAMETER) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER);
			int j = (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS) - (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS);
			int l = i / 2;
			int k = ((int) (java.lang.Math.round(ds)));
			if (k < ((org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS) + (interior.getMinY()))) {
				k = ((int) ((org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS) + (interior.getMinY())));
				l = org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS;
			}
			java.awt.geom.Area mercury = new java.awt.geom.Area(innerBulb);
			if (k < (stemBottom + (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS))) {
				mercuryStem.setRoundRect((midX - j), k, i, ((stemBottom + (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS)) - k), l, l);
				tempArea = new java.awt.geom.Area(mercuryStem);
				mercury.add(tempArea);
			}
			g2.setPaint(getCurrentPaint());
			g2.fill(mercury);
			if (org.jfree.chart.plot.ThermometerPlot.this.subrangeIndicatorsVisible) {
				g2.setStroke(org.jfree.chart.plot.ThermometerPlot.this.subrangeIndicatorStroke);
				org.jfree.data.Range range = org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.getRange();
				double value = org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[org.jfree.chart.plot.ThermometerPlot.NORMAL][org.jfree.chart.plot.ThermometerPlot.RANGE_LOW];
				if (range.contains(value)) {
					double x = (midX + (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) + 2;
					double y = org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
					java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(x, y, (x + 10), y);
					g2.setPaint(org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.NORMAL]);
					g2.draw(line);
				}
				value = org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[org.jfree.chart.plot.ThermometerPlot.WARNING][org.jfree.chart.plot.ThermometerPlot.RANGE_LOW];
				if (range.contains(value)) {
					double x = (midX + (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) + 2;
					double y = org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
					java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(x, y, (x + 10), y);
					g2.setPaint(org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.WARNING]);
					g2.draw(line);
				}
				value = org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[org.jfree.chart.plot.ThermometerPlot.CRITICAL][org.jfree.chart.plot.ThermometerPlot.RANGE_LOW];
				if (range.contains(value)) {
					double x = (midX + (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) + 2;
					double y = org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
					java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(x, y, (x + 10), y);
					g2.setPaint(org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.CRITICAL]);
					g2.draw(line);
				}
			}
			if (((org.jfree.chart.plot.ThermometerPlot.this.rangeAxis) != null) && ((org.jfree.chart.plot.ThermometerPlot.this.axisLocation) != (org.jfree.chart.plot.ThermometerPlot.NONE))) {
				int drawWidth = org.jfree.chart.plot.ThermometerPlot.AXIS_GAP;
				java.awt.geom.Rectangle2D drawArea;
				double cursor = 0;
				switch (org.jfree.chart.plot.ThermometerPlot.this.axisLocation) {
					case org.jfree.chart.plot.ThermometerPlot.RIGHT :
						cursor = midX + (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS);
						drawArea = new java.awt.geom.Rectangle2D.Double(cursor, stemTop, drawWidth, ((stemBottom - stemTop) + 1));
						org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.draw(g2, cursor, area, drawArea, org.jfree.chart.util.RectangleEdge.RIGHT, null);
						break;
					case org.jfree.chart.plot.ThermometerPlot.LEFT :
					default :
						cursor = midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS);
						drawArea = new java.awt.geom.Rectangle2D.Double(cursor, stemTop, drawWidth, ((stemBottom - stemTop) + 1));
						org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.draw(g2, cursor, area, drawArea, org.jfree.chart.util.RectangleEdge.LEFT, null);
						break;
				}
			}
			g2.setFont(org.jfree.chart.plot.ThermometerPlot.this.valueFont);
			g2.setPaint(org.jfree.chart.plot.ThermometerPlot.this.valuePaint);
			metrics = g2.getFontMetrics();
			switch (org.jfree.chart.plot.ThermometerPlot.this.valueLocation) {
				case org.jfree.chart.plot.ThermometerPlot.RIGHT :
					g2.drawString(org.jfree.chart.plot.ThermometerPlot.this.valueFormat.format(current), ((midX + (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)), midY);
					break;
				case org.jfree.chart.plot.ThermometerPlot.LEFT :
					java.lang.String valueString = org.jfree.chart.plot.ThermometerPlot.this.valueFormat.format(current);
					int stringWidth = metrics.stringWidth(valueString);
					g2.drawString(valueString, (((midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) - (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)) - stringWidth), midY);
					break;
				case org.jfree.chart.plot.ThermometerPlot.BULB :
					temp = org.jfree.chart.plot.ThermometerPlot.this.valueFormat.format(current);
					i = (metrics.stringWidth(temp)) / 2;
					g2.drawString(temp, (midX - i), ((stemBottom + (org.jfree.chart.plot.ThermometerPlot.BULB_RADIUS)) + (org.jfree.chart.plot.ThermometerPlot.GAP_RADIUS)));
					break;
				default :
			}
		}
		g2.setPaint(org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint);
		g2.setFont(org.jfree.chart.plot.ThermometerPlot.this.valueFont);
		metrics = g2.getFontMetrics();
		int tickX1 = ((midX - (org.jfree.chart.plot.ThermometerPlot.COLUMN_RADIUS)) - (org.jfree.chart.plot.ThermometerPlot.GAP_DIAMETER)) - (metrics.stringWidth(org.jfree.chart.plot.ThermometerPlot.UNITS[org.jfree.chart.plot.ThermometerPlot.this.units]));
		if (tickX1 > (area.getMinX())) {
			g2.drawString(org.jfree.chart.plot.ThermometerPlot.UNITS[org.jfree.chart.plot.ThermometerPlot.this.units], tickX1, ((int) ((area.getMinY()) + 20)));
		}
		g2.setStroke(org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke);
		g2.draw(outerThermometer);
		g2.draw(innerThermometer);
		drawOutline(g2, area);
	}

	public void zoom(double percent) {
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.ThermometerPlot.localizationResources.getString("Thermometer_Plot");
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent event) {
		if ((org.jfree.chart.plot.ThermometerPlot.this.dataset) != null) {
			java.lang.Number vn = org.jfree.chart.plot.ThermometerPlot.this.dataset.getValue();
			if (vn != null) {
				double value = vn.doubleValue();
				if (inSubrange(org.jfree.chart.plot.ThermometerPlot.NORMAL, value)) {
					org.jfree.chart.plot.ThermometerPlot.this.subrange = org.jfree.chart.plot.ThermometerPlot.NORMAL;
				}else
					if (inSubrange(org.jfree.chart.plot.ThermometerPlot.WARNING, value)) {
						org.jfree.chart.plot.ThermometerPlot.this.subrange = org.jfree.chart.plot.ThermometerPlot.WARNING;
					}else
						if (inSubrange(org.jfree.chart.plot.ThermometerPlot.CRITICAL, value)) {
							org.jfree.chart.plot.ThermometerPlot.this.subrange = org.jfree.chart.plot.ThermometerPlot.CRITICAL;
						}else {
							org.jfree.chart.plot.ThermometerPlot.this.subrange = -1;
						}
					
				
				setAxisRange();
			}
		}
		super.datasetChanged(event);
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		return new org.jfree.data.Range(org.jfree.chart.plot.ThermometerPlot.this.lowerBound, org.jfree.chart.plot.ThermometerPlot.this.upperBound);
	}

	protected void setAxisRange() {
		if (((org.jfree.chart.plot.ThermometerPlot.this.subrange) >= 0) && (org.jfree.chart.plot.ThermometerPlot.this.followDataInSubranges)) {
			org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.setRange(new org.jfree.data.Range(org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[org.jfree.chart.plot.ThermometerPlot.this.subrange][org.jfree.chart.plot.ThermometerPlot.DISPLAY_LOW], org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[org.jfree.chart.plot.ThermometerPlot.this.subrange][org.jfree.chart.plot.ThermometerPlot.DISPLAY_HIGH]));
		}else {
			org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.setRange(org.jfree.chart.plot.ThermometerPlot.this.lowerBound, org.jfree.chart.plot.ThermometerPlot.this.upperBound);
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		return null;
	}

	public org.jfree.chart.plot.PlotOrientation getOrientation() {
		return org.jfree.chart.plot.PlotOrientation.VERTICAL;
	}

	protected static boolean isValidNumber(double d) {
		return !((java.lang.Double.isNaN(d)) || (java.lang.Double.isInfinite(d)));
	}

	private boolean inSubrange(int subrange, double value) {
		return (value > (org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[subrange][org.jfree.chart.plot.ThermometerPlot.RANGE_LOW])) && (value <= (org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo[subrange][org.jfree.chart.plot.ThermometerPlot.RANGE_HIGH]));
	}

	private java.awt.Paint getCurrentPaint() {
		java.awt.Paint result = org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint;
		if (org.jfree.chart.plot.ThermometerPlot.this.useSubrangePaint) {
			double value = org.jfree.chart.plot.ThermometerPlot.this.dataset.getValue().doubleValue();
			if (inSubrange(org.jfree.chart.plot.ThermometerPlot.NORMAL, value)) {
				result = org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.NORMAL];
			}else
				if (inSubrange(org.jfree.chart.plot.ThermometerPlot.WARNING, value)) {
					result = org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.WARNING];
				}else
					if (inSubrange(org.jfree.chart.plot.ThermometerPlot.CRITICAL, value)) {
						result = org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[org.jfree.chart.plot.ThermometerPlot.CRITICAL];
					}
				
			
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.ThermometerPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.ThermometerPlot)) {
			return false;
		}
		org.jfree.chart.plot.ThermometerPlot that = ((org.jfree.chart.plot.ThermometerPlot) (obj));
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.rangeAxis, that.rangeAxis))) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.axisLocation) != (that.axisLocation)) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.lowerBound) != (that.lowerBound)) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.upperBound) != (that.upperBound)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.padding, that.padding))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke, that.thermometerStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint, that.thermometerPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.units) != (that.units)) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.valueLocation) != (that.valueLocation)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.valueFont, that.valueFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.valuePaint, that.valuePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.valueFormat, that.valueFormat))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint, that.mercuryPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.subrange) != (that.subrange)) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.followDataInSubranges) != (that.followDataInSubranges)) {
			return false;
		}
		if (!(org.jfree.chart.plot.ThermometerPlot.equal(org.jfree.chart.plot.ThermometerPlot.this.subrangeInfo, that.subrangeInfo))) {
			return false;
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.useSubrangePaint) != (that.useSubrangePaint)) {
			return false;
		}
		for (int i = 0; i < (org.jfree.chart.plot.ThermometerPlot.this.subrangePaint.length); i++) {
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[i], that.subrangePaint[i]))) {
				return false;
			}
		}
		return true;
	}

	private static boolean equal(double[][] array1, double[][] array2) {
		if (array1 == null) {
			return array2 == null;
		}
		if (array2 == null) {
			return false;
		}
		if ((array1.length) != (array2.length)) {
			return false;
		}
		for (int i = 0; i < (array1.length); i++) {
			if (!(java.util.Arrays.equals(array1[i], array2[i]))) {
				return false;
			}
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.ThermometerPlot clone = ((org.jfree.chart.plot.ThermometerPlot) (super.clone()));
		if ((clone.dataset) != null) {
			clone.dataset.addChangeListener(clone);
		}
		clone.rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.ThermometerPlot.this.rangeAxis)));
		if ((clone.rangeAxis) != null) {
			clone.rangeAxis.setPlot(clone);
			clone.rangeAxis.addChangeListener(clone);
		}
		clone.valueFormat = ((java.text.NumberFormat) (org.jfree.chart.plot.ThermometerPlot.this.valueFormat.clone()));
		clone.subrangePaint = ((java.awt.Paint[]) (org.jfree.chart.plot.ThermometerPlot.this.subrangePaint.clone()));
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.ThermometerPlot.this.valuePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.ThermometerPlot.this.subrangeIndicatorStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.ThermometerPlot.this.rangeIndicatorStroke, stream);
		for (int i = 0; i < 3; i++) {
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[i], stream);
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.ThermometerPlot.this.thermometerStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.ThermometerPlot.this.thermometerPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.ThermometerPlot.this.valuePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.ThermometerPlot.this.mercuryPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.ThermometerPlot.this.subrangeIndicatorStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.ThermometerPlot.this.rangeIndicatorStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.ThermometerPlot.this.subrangePaint = new java.awt.Paint[3];
		for (int i = 0; i < 3; i++) {
			org.jfree.chart.plot.ThermometerPlot.this.subrangePaint[i] = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
		if ((org.jfree.chart.plot.ThermometerPlot.this.rangeAxis) != null) {
			org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.addChangeListener(org.jfree.chart.plot.ThermometerPlot.this);
		}
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.resizeRange(factor);
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.ThermometerPlot.this.rangeAxis.zoomRange(lowerPercent, upperPercent);
	}

	public boolean isDomainZoomable() {
		return false;
	}

	public boolean isRangeZoomable() {
		return true;
	}
}

