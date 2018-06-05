

package org.jfree.chart.plot;


public class CompassPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 6924382802125527395L;

	public static final java.awt.Font DEFAULT_LABEL_FONT = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 10);

	public static final int NO_LABELS = 0;

	public static final int VALUE_LABELS = 1;

	private int labelType;

	private java.awt.Font labelFont;

	private boolean drawBorder = false;

	private transient java.awt.Paint roseHighlightPaint = java.awt.Color.black;

	private transient java.awt.Paint rosePaint = java.awt.Color.yellow;

	private transient java.awt.Paint roseCenterPaint = java.awt.Color.white;

	private java.awt.Font compassFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);

	private transient java.awt.geom.Ellipse2D circle1;

	private transient java.awt.geom.Ellipse2D circle2;

	private transient java.awt.geom.Area a1;

	private transient java.awt.geom.Area a2;

	private transient java.awt.geom.Rectangle2D rect1;

	private org.jfree.data.general.ValueDataset[] datasets = new org.jfree.data.general.ValueDataset[1];

	private org.jfree.chart.needle.MeterNeedle[] seriesNeedle = new org.jfree.chart.needle.MeterNeedle[1];

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.plot.LocalizationBundle");

	protected double revolutionDistance = 360;

	public CompassPlot() {
		this(new org.jfree.data.general.DefaultValueDataset());
	}

	public CompassPlot(org.jfree.data.general.ValueDataset dataset) {
		super();
		if (dataset != null) {
			org.jfree.chart.plot.CompassPlot.this.datasets[0] = dataset;
			dataset.addChangeListener(org.jfree.chart.plot.CompassPlot.this);
		}
		org.jfree.chart.plot.CompassPlot.this.circle1 = new java.awt.geom.Ellipse2D.Double();
		org.jfree.chart.plot.CompassPlot.this.circle2 = new java.awt.geom.Ellipse2D.Double();
		org.jfree.chart.plot.CompassPlot.this.rect1 = new java.awt.geom.Rectangle2D.Double();
		setSeriesNeedle(0);
	}

	public int getLabelType() {
		return org.jfree.chart.plot.CompassPlot.this.labelType;
	}

	public void setLabelType(int type) {
		if ((type != (org.jfree.chart.plot.CompassPlot.NO_LABELS)) && (type != (org.jfree.chart.plot.CompassPlot.VALUE_LABELS))) {
			throw new java.lang.IllegalArgumentException("MeterPlot.setLabelType(int): unrecognised type.");
		}
		if ((org.jfree.chart.plot.CompassPlot.this.labelType) != type) {
			org.jfree.chart.plot.CompassPlot.this.labelType = type;
			fireChangeEvent();
		}
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.plot.CompassPlot.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' not allowed.");
		}
		org.jfree.chart.plot.CompassPlot.this.labelFont = font;
		fireChangeEvent();
	}

	public java.awt.Paint getRosePaint() {
		return org.jfree.chart.plot.CompassPlot.this.rosePaint;
	}

	public void setRosePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CompassPlot.this.rosePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getRoseCenterPaint() {
		return org.jfree.chart.plot.CompassPlot.this.roseCenterPaint;
	}

	public void setRoseCenterPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CompassPlot.this.roseCenterPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getRoseHighlightPaint() {
		return org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint;
	}

	public void setRoseHighlightPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint = paint;
		fireChangeEvent();
	}

	public boolean getDrawBorder() {
		return org.jfree.chart.plot.CompassPlot.this.drawBorder;
	}

	public void setDrawBorder(boolean status) {
		org.jfree.chart.plot.CompassPlot.this.drawBorder = status;
		fireChangeEvent();
	}

	public void setSeriesPaint(int series, java.awt.Paint paint) {
		if ((series >= 0) && (series < (org.jfree.chart.plot.CompassPlot.this.seriesNeedle.length))) {
			org.jfree.chart.plot.CompassPlot.this.seriesNeedle[series].setFillPaint(paint);
		}
	}

	public void setSeriesOutlinePaint(int series, java.awt.Paint p) {
		if ((series >= 0) && (series < (org.jfree.chart.plot.CompassPlot.this.seriesNeedle.length))) {
			org.jfree.chart.plot.CompassPlot.this.seriesNeedle[series].setOutlinePaint(p);
		}
	}

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke) {
		if ((series >= 0) && (series < (org.jfree.chart.plot.CompassPlot.this.seriesNeedle.length))) {
			org.jfree.chart.plot.CompassPlot.this.seriesNeedle[series].setOutlineStroke(stroke);
		}
	}

	public void setSeriesNeedle(int type) {
		setSeriesNeedle(0, type);
	}

	public void setSeriesNeedle(int index, int type) {
		switch (type) {
			case 0 :
				setSeriesNeedle(index, new org.jfree.chart.needle.ArrowNeedle(true));
				setSeriesPaint(index, java.awt.Color.red);
				org.jfree.chart.plot.CompassPlot.this.seriesNeedle[index].setHighlightPaint(java.awt.Color.white);
				break;
			case 1 :
				setSeriesNeedle(index, new org.jfree.chart.needle.LineNeedle());
				break;
			case 2 :
				org.jfree.chart.needle.MeterNeedle longNeedle = new org.jfree.chart.needle.LongNeedle();
				longNeedle.setRotateY(0.5);
				setSeriesNeedle(index, longNeedle);
				break;
			case 3 :
				setSeriesNeedle(index, new org.jfree.chart.needle.PinNeedle());
				break;
			case 4 :
				setSeriesNeedle(index, new org.jfree.chart.needle.PlumNeedle());
				break;
			case 5 :
				setSeriesNeedle(index, new org.jfree.chart.needle.PointerNeedle());
				break;
			case 6 :
				setSeriesPaint(index, null);
				setSeriesOutlineStroke(index, new java.awt.BasicStroke(3));
				setSeriesNeedle(index, new org.jfree.chart.needle.ShipNeedle());
				break;
			case 7 :
				setSeriesPaint(index, java.awt.Color.blue);
				setSeriesNeedle(index, new org.jfree.chart.needle.WindNeedle());
				break;
			case 8 :
				setSeriesNeedle(index, new org.jfree.chart.needle.ArrowNeedle(true));
				break;
			case 9 :
				setSeriesNeedle(index, new org.jfree.chart.needle.MiddlePinNeedle());
				break;
			default :
				throw new java.lang.IllegalArgumentException("Unrecognised type.");
		}
	}

	public void setSeriesNeedle(int index, org.jfree.chart.needle.MeterNeedle needle) {
		if ((needle != null) && (index < (org.jfree.chart.plot.CompassPlot.this.seriesNeedle.length))) {
			org.jfree.chart.plot.CompassPlot.this.seriesNeedle[index] = needle;
		}
		fireChangeEvent();
	}

	public org.jfree.data.general.ValueDataset[] getDatasets() {
		return org.jfree.chart.plot.CompassPlot.this.datasets;
	}

	public void addDataset(org.jfree.data.general.ValueDataset dataset) {
		addDataset(dataset, null);
	}

	public void addDataset(org.jfree.data.general.ValueDataset dataset, org.jfree.chart.needle.MeterNeedle needle) {
		if (dataset != null) {
			int i = (org.jfree.chart.plot.CompassPlot.this.datasets.length) + 1;
			org.jfree.data.general.ValueDataset[] t = new org.jfree.data.general.ValueDataset[i];
			org.jfree.chart.needle.MeterNeedle[] p = new org.jfree.chart.needle.MeterNeedle[i];
			i = i - 2;
			for (; i >= 0; --i) {
				t[i] = org.jfree.chart.plot.CompassPlot.this.datasets[i];
				p[i] = org.jfree.chart.plot.CompassPlot.this.seriesNeedle[i];
			}
			i = org.jfree.chart.plot.CompassPlot.this.datasets.length;
			t[i] = dataset;
			p[i] = (needle != null) ? needle : p[(i - 1)];
			org.jfree.data.general.ValueDataset[] a = org.jfree.chart.plot.CompassPlot.this.datasets;
			org.jfree.chart.needle.MeterNeedle[] b = org.jfree.chart.plot.CompassPlot.this.seriesNeedle;
			org.jfree.chart.plot.CompassPlot.this.datasets = t;
			org.jfree.chart.plot.CompassPlot.this.seriesNeedle = p;
			for (--i; i >= 0; --i) {
				a[i] = null;
				b[i] = null;
			}
			dataset.addChangeListener(org.jfree.chart.plot.CompassPlot.this);
		}
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		int outerRadius = 0;
		int innerRadius = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		double a;
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		if (org.jfree.chart.plot.CompassPlot.this.drawBorder) {
			drawBackground(g2, area);
		}
		int midX = ((int) ((area.getWidth()) / 2));
		int midY = ((int) ((area.getHeight()) / 2));
		int radius = midX;
		if (midY < midX) {
			radius = midY;
		}
		--radius;
		int diameter = 2 * radius;
		midX += ((int) (area.getMinX()));
		midY += ((int) (area.getMinY()));
		org.jfree.chart.plot.CompassPlot.this.circle1.setFrame((midX - radius), (midY - radius), diameter, diameter);
		org.jfree.chart.plot.CompassPlot.this.circle2.setFrame(((midX - radius) + 15), ((midY - radius) + 15), (diameter - 30), (diameter - 30));
		g2.setPaint(org.jfree.chart.plot.CompassPlot.this.rosePaint);
		org.jfree.chart.plot.CompassPlot.this.a1 = new java.awt.geom.Area(org.jfree.chart.plot.CompassPlot.this.circle1);
		org.jfree.chart.plot.CompassPlot.this.a2 = new java.awt.geom.Area(org.jfree.chart.plot.CompassPlot.this.circle2);
		org.jfree.chart.plot.CompassPlot.this.a1.subtract(org.jfree.chart.plot.CompassPlot.this.a2);
		g2.fill(org.jfree.chart.plot.CompassPlot.this.a1);
		g2.setPaint(org.jfree.chart.plot.CompassPlot.this.roseCenterPaint);
		x1 = diameter - 30;
		g2.fillOval(((midX - radius) + 15), ((midY - radius) + 15), x1, x1);
		g2.setPaint(org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint);
		g2.drawOval((midX - radius), (midY - radius), diameter, diameter);
		x1 = diameter - 20;
		g2.drawOval(((midX - radius) + 10), ((midY - radius) + 10), x1, x1);
		x1 = diameter - 30;
		g2.drawOval(((midX - radius) + 15), ((midY - radius) + 15), x1, x1);
		x1 = diameter - 80;
		g2.drawOval(((midX - radius) + 40), ((midY - radius) + 40), x1, x1);
		outerRadius = radius - 20;
		innerRadius = radius - 32;
		for (int w = 0; w < 360; w += 15) {
			a = java.lang.Math.toRadians(w);
			x1 = midX - ((int) ((java.lang.Math.sin(a)) * innerRadius));
			x2 = midX - ((int) ((java.lang.Math.sin(a)) * outerRadius));
			y1 = midY - ((int) ((java.lang.Math.cos(a)) * innerRadius));
			y2 = midY - ((int) ((java.lang.Math.cos(a)) * outerRadius));
			g2.drawLine(x1, y1, x2, y2);
		}
		g2.setPaint(org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint);
		innerRadius = radius - 26;
		outerRadius = 7;
		for (int w = 45; w < 360; w += 90) {
			a = java.lang.Math.toRadians(w);
			x1 = midX - ((int) ((java.lang.Math.sin(a)) * innerRadius));
			y1 = midY - ((int) ((java.lang.Math.cos(a)) * innerRadius));
			g2.fillOval((x1 - outerRadius), (y1 - outerRadius), (2 * outerRadius), (2 * outerRadius));
		}
		for (int w = 0; w < 360; w += 90) {
			a = java.lang.Math.toRadians(w);
			x1 = midX - ((int) ((java.lang.Math.sin(a)) * innerRadius));
			y1 = midY - ((int) ((java.lang.Math.cos(a)) * innerRadius));
			java.awt.Polygon p = new java.awt.Polygon();
			p.addPoint((x1 - outerRadius), y1);
			p.addPoint(x1, (y1 + outerRadius));
			p.addPoint((x1 + outerRadius), y1);
			p.addPoint(x1, (y1 - outerRadius));
			g2.fillPolygon(p);
		}
		innerRadius = radius - 42;
		java.awt.Font f = getCompassFont(radius);
		g2.setFont(f);
		g2.drawString("N", (midX - 5), ((midY - innerRadius) + (f.getSize())));
		g2.drawString("S", (midX - 5), ((midY + innerRadius) - 5));
		g2.drawString("W", ((midX - innerRadius) + 5), (midY + 5));
		g2.drawString("E", ((midX + innerRadius) - (f.getSize())), (midY + 5));
		y1 = radius / 2;
		x1 = radius / 6;
		java.awt.geom.Rectangle2D needleArea = new java.awt.geom.Rectangle2D.Double((midX - x1), (midY - y1), (2 * x1), (2 * y1));
		int x = org.jfree.chart.plot.CompassPlot.this.seriesNeedle.length;
		int current = 0;
		double value = 0;
		int i = (org.jfree.chart.plot.CompassPlot.this.datasets.length) - 1;
		for (; i >= 0; --i) {
			org.jfree.data.general.ValueDataset data = org.jfree.chart.plot.CompassPlot.this.datasets[i];
			if ((data != null) && ((data.getValue()) != null)) {
				value = (data.getValue().doubleValue()) % (org.jfree.chart.plot.CompassPlot.this.revolutionDistance);
				value = (value / (org.jfree.chart.plot.CompassPlot.this.revolutionDistance)) * 360;
				current = i % x;
				org.jfree.chart.plot.CompassPlot.this.seriesNeedle[current].draw(g2, needleArea, value);
			}
		}
		if (org.jfree.chart.plot.CompassPlot.this.drawBorder) {
			drawOutline(g2, area);
		}
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.CompassPlot.localizationResources.getString("Compass_Plot");
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		return null;
	}

	public void zoom(double percent) {
	}

	protected java.awt.Font getCompassFont(int radius) {
		float fontSize = radius / 10.0F;
		if (fontSize < 8) {
			fontSize = 8;
		}
		java.awt.Font newFont = org.jfree.chart.plot.CompassPlot.this.compassFont.deriveFont(fontSize);
		return newFont;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.CompassPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CompassPlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.CompassPlot that = ((org.jfree.chart.plot.CompassPlot) (obj));
		if ((org.jfree.chart.plot.CompassPlot.this.labelType) != (that.labelType)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CompassPlot.this.labelFont, that.labelFont))) {
			return false;
		}
		if ((org.jfree.chart.plot.CompassPlot.this.drawBorder) != (that.drawBorder)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint, that.roseHighlightPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CompassPlot.this.rosePaint, that.rosePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CompassPlot.this.roseCenterPaint, that.roseCenterPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CompassPlot.this.compassFont, that.compassFont))) {
			return false;
		}
		if (!(java.util.Arrays.equals(org.jfree.chart.plot.CompassPlot.this.seriesNeedle, that.seriesNeedle))) {
			return false;
		}
		if ((getRevolutionDistance()) != (that.getRevolutionDistance())) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CompassPlot clone = ((org.jfree.chart.plot.CompassPlot) (super.clone()));
		if ((org.jfree.chart.plot.CompassPlot.this.circle1) != null) {
			clone.circle1 = ((java.awt.geom.Ellipse2D) (org.jfree.chart.plot.CompassPlot.this.circle1.clone()));
		}
		if ((org.jfree.chart.plot.CompassPlot.this.circle2) != null) {
			clone.circle2 = ((java.awt.geom.Ellipse2D) (org.jfree.chart.plot.CompassPlot.this.circle2.clone()));
		}
		if ((org.jfree.chart.plot.CompassPlot.this.a1) != null) {
			clone.a1 = ((java.awt.geom.Area) (org.jfree.chart.plot.CompassPlot.this.a1.clone()));
		}
		if ((org.jfree.chart.plot.CompassPlot.this.a2) != null) {
			clone.a2 = ((java.awt.geom.Area) (org.jfree.chart.plot.CompassPlot.this.a2.clone()));
		}
		if ((org.jfree.chart.plot.CompassPlot.this.rect1) != null) {
			clone.rect1 = ((java.awt.geom.Rectangle2D) (org.jfree.chart.plot.CompassPlot.this.rect1.clone()));
		}
		clone.datasets = ((org.jfree.data.general.ValueDataset[]) (org.jfree.chart.plot.CompassPlot.this.datasets.clone()));
		clone.seriesNeedle = ((org.jfree.chart.needle.MeterNeedle[]) (org.jfree.chart.plot.CompassPlot.this.seriesNeedle.clone()));
		for (int i = 0; i < (org.jfree.chart.plot.CompassPlot.this.datasets.length); ++i) {
			if ((clone.datasets[i]) != null) {
				clone.datasets[i].addChangeListener(clone);
			}
		}
		return clone;
	}

	public void setRevolutionDistance(double size) {
		if (size > 0) {
			org.jfree.chart.plot.CompassPlot.this.revolutionDistance = size;
		}
	}

	public double getRevolutionDistance() {
		return org.jfree.chart.plot.CompassPlot.this.revolutionDistance;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CompassPlot.this.rosePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CompassPlot.this.roseCenterPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.CompassPlot.this.rosePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CompassPlot.this.roseCenterPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CompassPlot.this.roseHighlightPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

