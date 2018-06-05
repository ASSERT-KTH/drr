

package org.jfree.chart.renderer.xy;


public class CandlestickRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 50390395841817121L;

	public static final int WIDTHMETHOD_AVERAGE = 0;

	public static final int WIDTHMETHOD_SMALLEST = 1;

	public static final int WIDTHMETHOD_INTERVALDATA = 2;

	private int autoWidthMethod = org.jfree.chart.renderer.xy.CandlestickRenderer.WIDTHMETHOD_AVERAGE;

	private double autoWidthFactor = 4.5 / 7;

	private double autoWidthGap = 0.0;

	private double candleWidth;

	private double maxCandleWidthInMilliseconds = ((1000.0 * 60.0) * 60.0) * 20.0;

	private double maxCandleWidth;

	private transient java.awt.Paint upPaint;

	private transient java.awt.Paint downPaint;

	private boolean drawVolume;

	private transient java.awt.Paint volumePaint;

	private transient double maxVolume;

	private boolean useOutlinePaint;

	public CandlestickRenderer() {
		this((-1.0));
	}

	public CandlestickRenderer(double candleWidth) {
		this(candleWidth, true, new org.jfree.chart.labels.HighLowItemLabelGenerator());
	}

	public CandlestickRenderer(double candleWidth, boolean drawVolume, org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator) {
		super();
		setBaseToolTipGenerator(toolTipGenerator);
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth = candleWidth;
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume = drawVolume;
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint = java.awt.Color.gray;
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint = java.awt.Color.green;
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint = java.awt.Color.red;
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint = false;
	}

	public double getCandleWidth() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth;
	}

	public void setCandleWidth(double width) {
		if (width != (org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth)) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth = width;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
		}
	}

	public double getMaxCandleWidthInMilliseconds() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidthInMilliseconds;
	}

	public void setMaxCandleWidthInMilliseconds(double millis) {
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidthInMilliseconds = millis;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
	}

	public int getAutoWidthMethod() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthMethod;
	}

	public void setAutoWidthMethod(int autoWidthMethod) {
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthMethod) != autoWidthMethod) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthMethod = autoWidthMethod;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
		}
	}

	public double getAutoWidthFactor() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthFactor;
	}

	public void setAutoWidthFactor(double autoWidthFactor) {
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthFactor) != autoWidthFactor) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthFactor = autoWidthFactor;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
		}
	}

	public double getAutoWidthGap() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthGap;
	}

	public void setAutoWidthGap(double autoWidthGap) {
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthGap) != autoWidthGap) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthGap = autoWidthGap;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
		}
	}

	public java.awt.Paint getUpPaint() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint;
	}

	public void setUpPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
	}

	public java.awt.Paint getDownPaint() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint;
	}

	public void setDownPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
	}

	public boolean getDrawVolume() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume;
	}

	public void setDrawVolume(boolean flag) {
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume) != flag) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume = flag;
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
		}
	}

	public java.awt.Paint getVolumePaint() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint;
	}

	public void setVolumePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint = paint;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.CandlestickRenderer.this));
	}

	public boolean getUseOutlinePaint() {
		return org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint;
	}

	public void setUseOutlinePaint(boolean use) {
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint) != use) {
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint = use;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.axis.ValueAxis axis = plot.getDomainAxis();
		double x1 = axis.getLowerBound();
		double x2 = x1 + (org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidthInMilliseconds);
		org.jfree.chart.util.RectangleEdge edge = plot.getDomainAxisEdge();
		double xx1 = axis.valueToJava2D(x1, dataArea, edge);
		double xx2 = axis.valueToJava2D(x2, dataArea, edge);
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidth = java.lang.Math.abs((xx2 - xx1));
		if (org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume) {
			org.jfree.data.xy.OHLCDataset highLowDataset = ((org.jfree.data.xy.OHLCDataset) (dataset));
			org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxVolume = 0.0;
			for (int series = 0; series < (highLowDataset.getSeriesCount()); series++) {
				for (int item = 0; item < (highLowDataset.getItemCount(series)); item++) {
					double volume = highLowDataset.getVolumeValue(series, item);
					if (volume > (org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxVolume)) {
						org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxVolume = volume;
					}
				}
			}
		}
		return new org.jfree.chart.renderer.xy.XYItemRendererState(info);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		boolean horiz;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			horiz = true;
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				horiz = false;
			}else {
				return ;
			}
		
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			entities = info.getOwner().getEntityCollection();
		}
		org.jfree.data.xy.OHLCDataset highLowData = ((org.jfree.data.xy.OHLCDataset) (dataset));
		double x = highLowData.getXValue(series, item);
		double yHigh = highLowData.getHighValue(series, item);
		double yLow = highLowData.getLowValue(series, item);
		double yOpen = highLowData.getOpenValue(series, item);
		double yClose = highLowData.getCloseValue(series, item);
		org.jfree.chart.util.RectangleEdge domainEdge = plot.getDomainAxisEdge();
		double xx = domainAxis.valueToJava2D(x, dataArea, domainEdge);
		org.jfree.chart.util.RectangleEdge edge = plot.getRangeAxisEdge();
		double yyHigh = rangeAxis.valueToJava2D(yHigh, dataArea, edge);
		double yyLow = rangeAxis.valueToJava2D(yLow, dataArea, edge);
		double yyOpen = rangeAxis.valueToJava2D(yOpen, dataArea, edge);
		double yyClose = rangeAxis.valueToJava2D(yClose, dataArea, edge);
		double volumeWidth;
		double stickWidth;
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth) > 0) {
			volumeWidth = org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth;
			stickWidth = org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth;
		}else {
			double xxWidth = 0;
			int itemCount;
			switch (org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthMethod) {
				case org.jfree.chart.renderer.xy.CandlestickRenderer.WIDTHMETHOD_AVERAGE :
					itemCount = highLowData.getItemCount(series);
					if (horiz) {
						xxWidth = (dataArea.getHeight()) / itemCount;
					}else {
						xxWidth = (dataArea.getWidth()) / itemCount;
					}
					break;
				case org.jfree.chart.renderer.xy.CandlestickRenderer.WIDTHMETHOD_SMALLEST :
					itemCount = highLowData.getItemCount(series);
					double lastPos = -1;
					xxWidth = dataArea.getWidth();
					for (int i = 0; i < itemCount; i++) {
						double pos = domainAxis.valueToJava2D(highLowData.getXValue(series, i), dataArea, domainEdge);
						if (lastPos != (-1)) {
							xxWidth = java.lang.Math.min(xxWidth, java.lang.Math.abs((pos - lastPos)));
						}
						lastPos = pos;
					}
					break;
				case org.jfree.chart.renderer.xy.CandlestickRenderer.WIDTHMETHOD_INTERVALDATA :
					org.jfree.data.xy.IntervalXYDataset intervalXYData = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
					double startPos = domainAxis.valueToJava2D(intervalXYData.getStartXValue(series, item), dataArea, plot.getDomainAxisEdge());
					double endPos = domainAxis.valueToJava2D(intervalXYData.getEndXValue(series, item), dataArea, plot.getDomainAxisEdge());
					xxWidth = java.lang.Math.abs((endPos - startPos));
					break;
			}
			xxWidth -= 2 * (org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthGap);
			xxWidth *= org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthFactor;
			xxWidth = java.lang.Math.min(xxWidth, org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidth);
			volumeWidth = java.lang.Math.max(java.lang.Math.min(1, org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidth), xxWidth);
			stickWidth = java.lang.Math.max(java.lang.Math.min(3, org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidth), xxWidth);
		}
		java.awt.Paint p = getItemPaint(series, item);
		java.awt.Paint outlinePaint = null;
		if (org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint) {
			outlinePaint = getItemOutlinePaint(series, item);
		}
		java.awt.Stroke s = getItemStroke(series, item);
		g2.setStroke(s);
		if (org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume) {
			int volume = ((int) (highLowData.getVolumeValue(series, item)));
			double volumeHeight = volume / (org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxVolume);
			double min;
			double max;
			if (horiz) {
				min = dataArea.getMinX();
				max = dataArea.getMaxX();
			}else {
				min = dataArea.getMinY();
				max = dataArea.getMaxY();
			}
			double zzVolume = volumeHeight * (max - min);
			g2.setPaint(getVolumePaint());
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 0.3F));
			if (horiz) {
				g2.fill(new java.awt.geom.Rectangle2D.Double(min, (xx - (volumeWidth / 2)), zzVolume, volumeWidth));
			}else {
				g2.fill(new java.awt.geom.Rectangle2D.Double((xx - (volumeWidth / 2)), (max - zzVolume), volumeWidth, zzVolume));
			}
			g2.setComposite(originalComposite);
		}
		if (org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint) {
			g2.setPaint(outlinePaint);
		}else {
			g2.setPaint(p);
		}
		double yyMaxOpenClose = java.lang.Math.max(yyOpen, yyClose);
		double yyMinOpenClose = java.lang.Math.min(yyOpen, yyClose);
		double maxOpenClose = java.lang.Math.max(yOpen, yClose);
		double minOpenClose = java.lang.Math.min(yOpen, yClose);
		if (yHigh > maxOpenClose) {
			if (horiz) {
				g2.draw(new java.awt.geom.Line2D.Double(yyHigh, xx, yyMaxOpenClose, xx));
			}else {
				g2.draw(new java.awt.geom.Line2D.Double(xx, yyHigh, xx, yyMaxOpenClose));
			}
		}
		if (yLow < minOpenClose) {
			if (horiz) {
				g2.draw(new java.awt.geom.Line2D.Double(yyLow, xx, yyMinOpenClose, xx));
			}else {
				g2.draw(new java.awt.geom.Line2D.Double(xx, yyLow, xx, yyMinOpenClose));
			}
		}
		java.awt.Shape body = null;
		if (horiz) {
			body = new java.awt.geom.Rectangle2D.Double(yyMinOpenClose, (xx - (stickWidth / 2)), (yyMaxOpenClose - yyMinOpenClose), stickWidth);
		}else {
			body = new java.awt.geom.Rectangle2D.Double((xx - (stickWidth / 2)), yyMinOpenClose, stickWidth, (yyMaxOpenClose - yyMinOpenClose));
		}
		if (yClose > yOpen) {
			if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint) != null) {
				g2.setPaint(org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint);
			}else {
				g2.setPaint(p);
			}
			g2.fill(body);
		}else {
			if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint) != null) {
				g2.setPaint(org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint);
			}else {
				g2.setPaint(p);
			}
			g2.fill(body);
		}
		if (org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint) {
			g2.setPaint(outlinePaint);
		}else {
			g2.setPaint(p);
		}
		g2.draw(body);
		addEntity(entities, body, dataset, series, item, 0.0, 0.0);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.CandlestickRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.CandlestickRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.CandlestickRenderer that = ((org.jfree.chart.renderer.xy.CandlestickRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.candleWidth) != (that.candleWidth)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint, that.upPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint, that.downPaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.drawVolume) != (that.drawVolume)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.maxCandleWidthInMilliseconds) != (that.maxCandleWidthInMilliseconds)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthMethod) != (that.autoWidthMethod)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthFactor) != (that.autoWidthFactor)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.autoWidthGap) != (that.autoWidthGap)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.CandlestickRenderer.this.useOutlinePaint) != (that.useOutlinePaint)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint, that.volumePaint))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.upPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.downPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.CandlestickRenderer.this.volumePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

