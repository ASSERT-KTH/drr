



package org.jfree.chart;


public class JFreeChart implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.Drawable , org.jfree.chart.event.PlotChangeListener , org.jfree.chart.event.TitleChangeListener {
	private static final long serialVersionUID = -3470703747817429120L;

	public static final org.jfree.chart.ui.ProjectInfo INFO = new org.jfree.chart.JFreeChartInfo();

	public static final java.awt.Font DEFAULT_TITLE_FONT = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 18);

	public static final java.awt.Paint DEFAULT_BACKGROUND_PAINT = java.awt.Color.WHITE;

	public static final java.awt.Image DEFAULT_BACKGROUND_IMAGE = null;

	public static final int DEFAULT_BACKGROUND_IMAGE_ALIGNMENT = org.jfree.chart.util.Align.FIT;

	public static final float DEFAULT_BACKGROUND_IMAGE_ALPHA = 0.5F;

	private transient java.awt.RenderingHints renderingHints;

	private boolean borderVisible;

	private transient java.awt.Stroke borderStroke;

	private transient java.awt.Paint borderPaint;

	private org.jfree.chart.util.RectangleInsets padding;

	private org.jfree.chart.title.TextTitle title;

	private java.util.List subtitles;

	private org.jfree.chart.plot.Plot plot;

	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Image backgroundImage;

	private int backgroundImageAlignment = org.jfree.chart.util.Align.FIT;

	private float backgroundImageAlpha = 0.5F;

	private transient javax.swing.event.EventListenerList changeListeners;

	private transient javax.swing.event.EventListenerList progressListeners;

	private boolean notify;

	public JFreeChart(org.jfree.chart.plot.Plot plot) {
		this(null, null, plot, true);
	}

	public JFreeChart(java.lang.String title, org.jfree.chart.plot.Plot plot) {
		this(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, true);
	}

	public JFreeChart(java.lang.String title, java.awt.Font titleFont, org.jfree.chart.plot.Plot plot, boolean createLegend) {
		if (plot == null) {
			throw new java.lang.NullPointerException("Null 'plot' argument.");
		}
		org.jfree.chart.JFreeChart.this.progressListeners = new javax.swing.event.EventListenerList();
		org.jfree.chart.JFreeChart.this.changeListeners = new javax.swing.event.EventListenerList();
		org.jfree.chart.JFreeChart.this.notify = true;
		org.jfree.chart.JFreeChart.this.renderingHints = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
		org.jfree.chart.JFreeChart.this.borderVisible = false;
		org.jfree.chart.JFreeChart.this.borderStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.JFreeChart.this.borderPaint = java.awt.Color.black;
		org.jfree.chart.JFreeChart.this.padding = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
		org.jfree.chart.JFreeChart.this.plot = plot;
		plot.addChangeListener(org.jfree.chart.JFreeChart.this);
		org.jfree.chart.JFreeChart.this.subtitles = new java.util.ArrayList();
		if (createLegend) {
			org.jfree.chart.title.LegendTitle legend = new org.jfree.chart.title.LegendTitle(org.jfree.chart.JFreeChart.this.plot);
			legend.setMargin(new org.jfree.chart.util.RectangleInsets(1.0, 1.0, 1.0, 1.0));
			legend.setFrame(new org.jfree.chart.block.LineBorder());
			legend.setBackgroundPaint(java.awt.Color.white);
			legend.setPosition(org.jfree.chart.util.RectangleEdge.BOTTOM);
			org.jfree.chart.JFreeChart.this.subtitles.add(legend);
			legend.addChangeListener(org.jfree.chart.JFreeChart.this);
		}
		if (title != null) {
			if (titleFont == null) {
				titleFont = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
			}
			org.jfree.chart.JFreeChart.this.title = new org.jfree.chart.title.TextTitle(title, titleFont);
			org.jfree.chart.JFreeChart.this.title.addChangeListener(org.jfree.chart.JFreeChart.this);
		}
		org.jfree.chart.JFreeChart.this.backgroundPaint = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
		org.jfree.chart.JFreeChart.this.backgroundImage = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE;
		org.jfree.chart.JFreeChart.this.backgroundImageAlignment = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALIGNMENT;
		org.jfree.chart.JFreeChart.this.backgroundImageAlpha = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_IMAGE_ALPHA;
	}

	public java.awt.RenderingHints getRenderingHints() {
		return org.jfree.chart.JFreeChart.this.renderingHints;
	}

	public void setRenderingHints(java.awt.RenderingHints renderingHints) {
		if (renderingHints == null) {
			throw new java.lang.NullPointerException("RenderingHints given are null");
		}
		org.jfree.chart.JFreeChart.this.renderingHints = renderingHints;
		fireChartChanged();
	}

	public boolean isBorderVisible() {
		return org.jfree.chart.JFreeChart.this.borderVisible;
	}

	public void setBorderVisible(boolean visible) {
		org.jfree.chart.JFreeChart.this.borderVisible = visible;
		fireChartChanged();
	}

	public java.awt.Stroke getBorderStroke() {
		return org.jfree.chart.JFreeChart.this.borderStroke;
	}

	public void setBorderStroke(java.awt.Stroke stroke) {
		org.jfree.chart.JFreeChart.this.borderStroke = stroke;
		fireChartChanged();
	}

	public java.awt.Paint getBorderPaint() {
		return org.jfree.chart.JFreeChart.this.borderPaint;
	}

	public void setBorderPaint(java.awt.Paint paint) {
		org.jfree.chart.JFreeChart.this.borderPaint = paint;
		fireChartChanged();
	}

	public org.jfree.chart.util.RectangleInsets getPadding() {
		return org.jfree.chart.JFreeChart.this.padding;
	}

	public void setPadding(org.jfree.chart.util.RectangleInsets padding) {
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		org.jfree.chart.JFreeChart.this.padding = padding;
		notifyListeners(new org.jfree.chart.event.ChartChangeEvent(org.jfree.chart.JFreeChart.this));
	}

	public org.jfree.chart.title.TextTitle getTitle() {
		return org.jfree.chart.JFreeChart.this.title;
	}

	public void setTitle(org.jfree.chart.title.TextTitle title) {
		if ((org.jfree.chart.JFreeChart.this.title) != null) {
			org.jfree.chart.JFreeChart.this.title.removeChangeListener(org.jfree.chart.JFreeChart.this);
		}
		org.jfree.chart.JFreeChart.this.title = title;
		if (title != null) {
			title.addChangeListener(org.jfree.chart.JFreeChart.this);
		}
		fireChartChanged();
	}

	public void setTitle(java.lang.String text) {
		if (text != null) {
			if ((org.jfree.chart.JFreeChart.this.title) == null) {
				setTitle(new org.jfree.chart.title.TextTitle(text, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT));
			}else {
				org.jfree.chart.JFreeChart.this.title.setText(text);
			}
		}else {
			setTitle(((org.jfree.chart.title.TextTitle) (null)));
		}
	}

	public void addLegend(org.jfree.chart.title.LegendTitle legend) {
		addSubtitle(legend);
	}

	public org.jfree.chart.title.LegendTitle getLegend() {
		return getLegend(0);
	}

	public org.jfree.chart.title.LegendTitle getLegend(int index) {
		int seen = 0;
		java.util.Iterator iterator = org.jfree.chart.JFreeChart.this.subtitles.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.title.Title subtitle = ((org.jfree.chart.title.Title) (iterator.next()));
			if (subtitle instanceof org.jfree.chart.title.LegendTitle) {
				if (seen == index) {
					return ((org.jfree.chart.title.LegendTitle) (subtitle));
				}else {
					seen++;
				}
			}
		} 
		return null;
	}

	public void removeLegend() {
		removeSubtitle(getLegend());
	}

	public java.util.List getSubtitles() {
		return new java.util.ArrayList(org.jfree.chart.JFreeChart.this.subtitles);
	}

	public void setSubtitles(java.util.List subtitles) {
		if (subtitles == null) {
			throw new java.lang.NullPointerException("Null 'subtitles' argument.");
		}
		setNotify(false);
		clearSubtitles();
		java.util.Iterator iterator = subtitles.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.title.Title t = ((org.jfree.chart.title.Title) (iterator.next()));
			if (t != null) {
				addSubtitle(t);
			}
		} 
		setNotify(true);
	}

	public int getSubtitleCount() {
		return org.jfree.chart.JFreeChart.this.subtitles.size();
	}

	public org.jfree.chart.title.Title getSubtitle(int index) {
		if ((index < 0) || (index >= (getSubtitleCount()))) {
			throw new java.lang.IllegalArgumentException("Index out of range.");
		}
		return ((org.jfree.chart.title.Title) (org.jfree.chart.JFreeChart.this.subtitles.get(index)));
	}

	public void addSubtitle(org.jfree.chart.title.Title subtitle) {
		if (subtitle == null) {
			throw new java.lang.IllegalArgumentException("Null 'subtitle' argument.");
		}
		org.jfree.chart.JFreeChart.this.subtitles.add(subtitle);
		subtitle.addChangeListener(org.jfree.chart.JFreeChart.this);
		fireChartChanged();
	}

	public void addSubtitle(int index, org.jfree.chart.title.Title subtitle) {
		if ((index < 0) || (index > (getSubtitleCount()))) {
			throw new java.lang.IllegalArgumentException("The 'index' argument is out of range.");
		}
		if (subtitle == null) {
			throw new java.lang.IllegalArgumentException("Null 'subtitle' argument.");
		}
		org.jfree.chart.JFreeChart.this.subtitles.add(index, subtitle);
		subtitle.addChangeListener(org.jfree.chart.JFreeChart.this);
		fireChartChanged();
	}

	public void clearSubtitles() {
		java.util.Iterator iterator = org.jfree.chart.JFreeChart.this.subtitles.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.title.Title t = ((org.jfree.chart.title.Title) (iterator.next()));
			t.removeChangeListener(org.jfree.chart.JFreeChart.this);
		} 
		org.jfree.chart.JFreeChart.this.subtitles.clear();
		fireChartChanged();
	}

	public void removeSubtitle(org.jfree.chart.title.Title title) {
		org.jfree.chart.JFreeChart.this.subtitles.remove(title);
		fireChartChanged();
	}

	public org.jfree.chart.plot.Plot getPlot() {
		return org.jfree.chart.JFreeChart.this.plot;
	}

	public org.jfree.chart.plot.CategoryPlot getCategoryPlot() {
		return ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.JFreeChart.this.plot));
	}

	public org.jfree.chart.plot.XYPlot getXYPlot() {
		return ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.JFreeChart.this.plot));
	}

	public boolean getAntiAlias() {
		java.lang.Object val = org.jfree.chart.JFreeChart.this.renderingHints.get(java.awt.RenderingHints.KEY_ANTIALIASING);
		return java.awt.RenderingHints.VALUE_ANTIALIAS_ON.equals(val);
	}

	public void setAntiAlias(boolean flag) {
		java.lang.Object val = org.jfree.chart.JFreeChart.this.renderingHints.get(java.awt.RenderingHints.KEY_ANTIALIASING);
		if (val == null) {
			val = java.awt.RenderingHints.VALUE_ANTIALIAS_DEFAULT;
		}
		if (((!flag) && (java.awt.RenderingHints.VALUE_ANTIALIAS_OFF.equals(val))) || (flag && (java.awt.RenderingHints.VALUE_ANTIALIAS_ON.equals(val)))) {
			return ;
		}
		if (flag) {
			org.jfree.chart.JFreeChart.this.renderingHints.put(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
		}else {
			org.jfree.chart.JFreeChart.this.renderingHints.put(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_OFF);
		}
		fireChartChanged();
	}

	public java.lang.Object getTextAntiAlias() {
		return org.jfree.chart.JFreeChart.this.renderingHints.get(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING);
	}

	public void setTextAntiAlias(boolean flag) {
		if (flag) {
			setTextAntiAlias(java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}else {
			setTextAntiAlias(java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
		}
	}

	public void setTextAntiAlias(java.lang.Object val) {
		org.jfree.chart.JFreeChart.this.renderingHints.put(java.awt.RenderingHints.KEY_TEXT_ANTIALIASING, val);
		notifyListeners(new org.jfree.chart.event.ChartChangeEvent(org.jfree.chart.JFreeChart.this));
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.JFreeChart.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		if ((org.jfree.chart.JFreeChart.this.backgroundPaint) != null) {
			if (!(org.jfree.chart.JFreeChart.this.backgroundPaint.equals(paint))) {
				org.jfree.chart.JFreeChart.this.backgroundPaint = paint;
				fireChartChanged();
			}
		}else {
			if (paint != null) {
				org.jfree.chart.JFreeChart.this.backgroundPaint = paint;
				fireChartChanged();
			}
		}
	}

	public java.awt.Image getBackgroundImage() {
		return org.jfree.chart.JFreeChart.this.backgroundImage;
	}

	public void setBackgroundImage(java.awt.Image image) {
		if ((org.jfree.chart.JFreeChart.this.backgroundImage) != null) {
			if (!(org.jfree.chart.JFreeChart.this.backgroundImage.equals(image))) {
				org.jfree.chart.JFreeChart.this.backgroundImage = image;
				fireChartChanged();
			}
		}else {
			if (image != null) {
				org.jfree.chart.JFreeChart.this.backgroundImage = image;
				fireChartChanged();
			}
		}
	}

	public int getBackgroundImageAlignment() {
		return org.jfree.chart.JFreeChart.this.backgroundImageAlignment;
	}

	public void setBackgroundImageAlignment(int alignment) {
		if ((org.jfree.chart.JFreeChart.this.backgroundImageAlignment) != alignment) {
			org.jfree.chart.JFreeChart.this.backgroundImageAlignment = alignment;
			fireChartChanged();
		}
	}

	public float getBackgroundImageAlpha() {
		return org.jfree.chart.JFreeChart.this.backgroundImageAlpha;
	}

	public void setBackgroundImageAlpha(float alpha) {
		if ((org.jfree.chart.JFreeChart.this.backgroundImageAlpha) != alpha) {
			org.jfree.chart.JFreeChart.this.backgroundImageAlpha = alpha;
			fireChartChanged();
		}
	}

	public boolean isNotify() {
		return org.jfree.chart.JFreeChart.this.notify;
	}

	public void setNotify(boolean notify) {
		org.jfree.chart.JFreeChart.this.notify = notify;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.ChartChangeEvent(org.jfree.chart.JFreeChart.this));
		}
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null, null);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, org.jfree.chart.ChartRenderingInfo info) {
		draw(g2, area, null, info);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D chartArea, java.awt.geom.Point2D anchor, org.jfree.chart.ChartRenderingInfo info) {
		notifyListeners(new org.jfree.chart.event.ChartProgressEvent(org.jfree.chart.JFreeChart.this, org.jfree.chart.JFreeChart.this, org.jfree.chart.event.ChartProgressEvent.DRAWING_STARTED, 0));
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			info.clear();
			info.setChartArea(chartArea);
			entities = info.getEntityCollection();
		}
		if (entities != null) {
			entities.add(new org.jfree.chart.entity.JFreeChartEntity(((java.awt.geom.Rectangle2D) (chartArea.clone())), org.jfree.chart.JFreeChart.this));
		}
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(chartArea);
		g2.addRenderingHints(org.jfree.chart.JFreeChart.this.renderingHints);
		if ((org.jfree.chart.JFreeChart.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.JFreeChart.this.backgroundPaint);
			g2.fill(chartArea);
		}
		if ((org.jfree.chart.JFreeChart.this.backgroundImage) != null) {
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, org.jfree.chart.JFreeChart.this.backgroundImageAlpha));
			java.awt.geom.Rectangle2D dest = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, org.jfree.chart.JFreeChart.this.backgroundImage.getWidth(null), org.jfree.chart.JFreeChart.this.backgroundImage.getHeight(null));
			org.jfree.chart.util.Align.align(dest, chartArea, org.jfree.chart.JFreeChart.this.backgroundImageAlignment);
			g2.drawImage(org.jfree.chart.JFreeChart.this.backgroundImage, ((int) (dest.getX())), ((int) (dest.getY())), ((int) (dest.getWidth())), ((int) (dest.getHeight())), null);
			g2.setComposite(originalComposite);
		}
		if (isBorderVisible()) {
			java.awt.Paint paint = getBorderPaint();
			java.awt.Stroke stroke = getBorderStroke();
			if ((paint != null) && (stroke != null)) {
				java.awt.geom.Rectangle2D borderArea = new java.awt.geom.Rectangle2D.Double(chartArea.getX(), chartArea.getY(), ((chartArea.getWidth()) - 1.0), ((chartArea.getHeight()) - 1.0));
				g2.setPaint(paint);
				g2.setStroke(stroke);
				g2.draw(borderArea);
			}
		}
		java.awt.geom.Rectangle2D nonTitleArea = new java.awt.geom.Rectangle2D.Double();
		nonTitleArea.setRect(chartArea);
		org.jfree.chart.JFreeChart.this.padding.trim(nonTitleArea);
		if (((org.jfree.chart.JFreeChart.this.title) != null) && (org.jfree.chart.JFreeChart.this.title.isVisible())) {
			org.jfree.chart.entity.EntityCollection e = drawTitle(org.jfree.chart.JFreeChart.this.title, g2, nonTitleArea, (entities != null));
			if (e != null) {
				entities.addAll(e);
			}
		}
		java.util.Iterator iterator = org.jfree.chart.JFreeChart.this.subtitles.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.title.Title currentTitle = ((org.jfree.chart.title.Title) (iterator.next()));
			if (currentTitle.isVisible()) {
				org.jfree.chart.entity.EntityCollection e = drawTitle(currentTitle, g2, nonTitleArea, (entities != null));
				if (e != null) {
					entities.addAll(e);
				}
			}
		} 
		java.awt.geom.Rectangle2D plotArea = nonTitleArea;
		org.jfree.chart.plot.PlotRenderingInfo plotInfo = null;
		if (info != null) {
			plotInfo = info.getPlotInfo();
		}
		org.jfree.chart.JFreeChart.this.plot.draw(g2, plotArea, anchor, null, plotInfo);
		g2.setClip(savedClip);
		notifyListeners(new org.jfree.chart.event.ChartProgressEvent(org.jfree.chart.JFreeChart.this, org.jfree.chart.JFreeChart.this, org.jfree.chart.event.ChartProgressEvent.DRAWING_FINISHED, 100));
	}

	private java.awt.geom.Rectangle2D createAlignedRectangle2D(org.jfree.chart.util.Size2D dimensions, java.awt.geom.Rectangle2D frame, org.jfree.chart.util.HorizontalAlignment hAlign, org.jfree.chart.util.VerticalAlignment vAlign) {
		double x = java.lang.Double.NaN;
		double y = java.lang.Double.NaN;
		if (hAlign == (org.jfree.chart.util.HorizontalAlignment.LEFT)) {
			x = frame.getX();
		}else
			if (hAlign == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
				x = (frame.getCenterX()) - ((dimensions.width) / 2.0);
			}else
				if (hAlign == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
					x = (frame.getMaxX()) - (dimensions.width);
				}
			
		
		if (vAlign == (org.jfree.chart.util.VerticalAlignment.TOP)) {
			y = frame.getY();
		}else
			if (vAlign == (org.jfree.chart.util.VerticalAlignment.CENTER)) {
				y = (frame.getCenterY()) - ((dimensions.height) / 2.0);
			}else
				if (vAlign == (org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
					y = (frame.getMaxY()) - (dimensions.height);
				}
			
		
		return new java.awt.geom.Rectangle2D.Double(x, y, dimensions.width, dimensions.height);
	}

	protected org.jfree.chart.entity.EntityCollection drawTitle(org.jfree.chart.title.Title t, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, boolean entities) {
		if (t == null) {
			throw new java.lang.IllegalArgumentException("Null 't' argument.");
		}
		if (area == null) {
			throw new java.lang.IllegalArgumentException("Null 'area' argument.");
		}
		java.awt.geom.Rectangle2D titleArea;
		org.jfree.chart.util.RectangleEdge position = t.getPosition();
		double ww = area.getWidth();
		if (ww <= 0.0) {
			return null;
		}
		double hh = area.getHeight();
		if (hh <= 0.0) {
			return null;
		}
		org.jfree.chart.block.RectangleConstraint constraint = new org.jfree.chart.block.RectangleConstraint(ww, new org.jfree.data.Range(0.0, ww), org.jfree.chart.block.LengthConstraintType.RANGE, hh, new org.jfree.data.Range(0.0, hh), org.jfree.chart.block.LengthConstraintType.RANGE);
		java.lang.Object retValue = null;
		org.jfree.chart.block.BlockParams p = new org.jfree.chart.block.BlockParams();
		p.setGenerateEntities(entities);
		if (position == (org.jfree.chart.util.RectangleEdge.TOP)) {
			org.jfree.chart.util.Size2D size = t.arrange(g2, constraint);
			titleArea = createAlignedRectangle2D(size, area, t.getHorizontalAlignment(), org.jfree.chart.util.VerticalAlignment.TOP);
			retValue = t.draw(g2, titleArea, p);
			area.setRect(area.getX(), java.lang.Math.min(((area.getY()) + (size.height)), area.getMaxY()), area.getWidth(), java.lang.Math.max(((area.getHeight()) - (size.height)), 0));
		}else
			if (position == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				org.jfree.chart.util.Size2D size = t.arrange(g2, constraint);
				titleArea = createAlignedRectangle2D(size, area, t.getHorizontalAlignment(), org.jfree.chart.util.VerticalAlignment.BOTTOM);
				retValue = t.draw(g2, titleArea, p);
				area.setRect(area.getX(), area.getY(), area.getWidth(), ((area.getHeight()) - (size.height)));
			}else
				if (position == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
					org.jfree.chart.util.Size2D size = t.arrange(g2, constraint);
					titleArea = createAlignedRectangle2D(size, area, org.jfree.chart.util.HorizontalAlignment.RIGHT, t.getVerticalAlignment());
					retValue = t.draw(g2, titleArea, p);
					area.setRect(area.getX(), area.getY(), ((area.getWidth()) - (size.width)), area.getHeight());
				}else
					if (position == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						org.jfree.chart.util.Size2D size = t.arrange(g2, constraint);
						titleArea = createAlignedRectangle2D(size, area, org.jfree.chart.util.HorizontalAlignment.LEFT, t.getVerticalAlignment());
						retValue = t.draw(g2, titleArea, p);
						area.setRect(((area.getX()) + (size.width)), area.getY(), ((area.getWidth()) - (size.width)), area.getHeight());
					}else {
						throw new java.lang.RuntimeException("Unrecognised title position.");
					}
				
			
		
		org.jfree.chart.entity.EntityCollection result = null;
		if (retValue instanceof org.jfree.chart.block.EntityBlockResult) {
			org.jfree.chart.block.EntityBlockResult ebr = ((org.jfree.chart.block.EntityBlockResult) (retValue));
			result = ebr.getEntityCollection();
		}
		return result;
	}

	public java.awt.image.BufferedImage createBufferedImage(int width, int height) {
		return createBufferedImage(width, height, null);
	}

	public java.awt.image.BufferedImage createBufferedImage(int width, int height, org.jfree.chart.ChartRenderingInfo info) {
		return createBufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB, info);
	}

	public java.awt.image.BufferedImage createBufferedImage(int width, int height, int imageType, org.jfree.chart.ChartRenderingInfo info) {
		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(width, height, imageType);
		if (info != null) {
			info.setRenderingSource(new org.jfree.chart.BufferedImageRenderingSource(image));
		}
		java.awt.Graphics2D g2 = image.createGraphics();
		draw(g2, new java.awt.geom.Rectangle2D.Double(0, 0, width, height), null, info);
		g2.dispose();
		return image;
	}

	public java.awt.image.BufferedImage createBufferedImage(int imageWidth, int imageHeight, double drawWidth, double drawHeight, org.jfree.chart.ChartRenderingInfo info) {
		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(imageWidth, imageHeight, java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D g2 = image.createGraphics();
		double scaleX = imageWidth / drawWidth;
		double scaleY = imageHeight / drawHeight;
		java.awt.geom.AffineTransform st = java.awt.geom.AffineTransform.getScaleInstance(scaleX, scaleY);
		g2.transform(st);
		draw(g2, new java.awt.geom.Rectangle2D.Double(0, 0, drawWidth, drawHeight), null, info);
		g2.dispose();
		return image;
	}

	public void handleClick(int x, int y, org.jfree.chart.ChartRenderingInfo info) {
		org.jfree.chart.JFreeChart.this.plot.handleClick(x, y, info.getPlotInfo());
	}

	public void addChangeListener(org.jfree.chart.event.ChartChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.JFreeChart.this.changeListeners.add(org.jfree.chart.event.ChartChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.ChartChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.JFreeChart.this.changeListeners.remove(org.jfree.chart.event.ChartChangeListener.class, listener);
	}

	public void fireChartChanged() {
		org.jfree.chart.event.ChartChangeEvent event = new org.jfree.chart.event.ChartChangeEvent(org.jfree.chart.JFreeChart.this);
		notifyListeners(event);
	}

	protected void notifyListeners(org.jfree.chart.event.ChartChangeEvent event) {
		if (org.jfree.chart.JFreeChart.this.notify) {
			java.lang.Object[] listeners = org.jfree.chart.JFreeChart.this.changeListeners.getListenerList();
			for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
				if ((listeners[i]) == (org.jfree.chart.event.ChartChangeListener.class)) {
					((org.jfree.chart.event.ChartChangeListener) (listeners[(i + 1)])).chartChanged(event);
				}
			}
		}
	}

	public void addProgressListener(org.jfree.chart.event.ChartProgressListener listener) {
		org.jfree.chart.JFreeChart.this.progressListeners.add(org.jfree.chart.event.ChartProgressListener.class, listener);
	}

	public void removeProgressListener(org.jfree.chart.event.ChartProgressListener listener) {
		org.jfree.chart.JFreeChart.this.progressListeners.remove(org.jfree.chart.event.ChartProgressListener.class, listener);
	}

	protected void notifyListeners(org.jfree.chart.event.ChartProgressEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.JFreeChart.this.progressListeners.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.ChartProgressListener.class)) {
				((org.jfree.chart.event.ChartProgressListener) (listeners[(i + 1)])).chartProgress(event);
			}
		}
	}

	public void titleChanged(org.jfree.chart.event.TitleChangeEvent event) {
		event.setChart(org.jfree.chart.JFreeChart.this);
		notifyListeners(event);
	}

	public void plotChanged(org.jfree.chart.event.PlotChangeEvent event) {
		event.setChart(org.jfree.chart.JFreeChart.this);
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.JFreeChart.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.JFreeChart)) {
			return false;
		}
		org.jfree.chart.JFreeChart that = ((org.jfree.chart.JFreeChart) (obj));
		if (!(org.jfree.chart.JFreeChart.this.renderingHints.equals(that.renderingHints))) {
			return false;
		}
		if ((org.jfree.chart.JFreeChart.this.borderVisible) != (that.borderVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.JFreeChart.this.borderStroke, that.borderStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.JFreeChart.this.borderPaint, that.borderPaint))) {
			return false;
		}
		if (!(org.jfree.chart.JFreeChart.this.padding.equals(that.padding))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.JFreeChart.this.title, that.title))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.JFreeChart.this.subtitles, that.subtitles))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.JFreeChart.this.plot, that.plot))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.JFreeChart.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.JFreeChart.this.backgroundImage, that.backgroundImage))) {
			return false;
		}
		if ((org.jfree.chart.JFreeChart.this.backgroundImageAlignment) != (that.backgroundImageAlignment)) {
			return false;
		}
		if ((org.jfree.chart.JFreeChart.this.backgroundImageAlpha) != (that.backgroundImageAlpha)) {
			return false;
		}
		if ((org.jfree.chart.JFreeChart.this.notify) != (that.notify)) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.JFreeChart.this.borderStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.JFreeChart.this.borderPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.JFreeChart.this.backgroundPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.JFreeChart.this.borderStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.JFreeChart.this.borderPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.JFreeChart.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.JFreeChart.this.progressListeners = new javax.swing.event.EventListenerList();
		org.jfree.chart.JFreeChart.this.changeListeners = new javax.swing.event.EventListenerList();
		org.jfree.chart.JFreeChart.this.renderingHints = new java.awt.RenderingHints(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
		if ((org.jfree.chart.JFreeChart.this.title) != null) {
			org.jfree.chart.JFreeChart.this.title.addChangeListener(org.jfree.chart.JFreeChart.this);
		}
		for (int i = 0; i < (getSubtitleCount()); i++) {
			getSubtitle(i).addChangeListener(org.jfree.chart.JFreeChart.this);
		}
		org.jfree.chart.JFreeChart.this.plot.addChangeListener(org.jfree.chart.JFreeChart.this);
	}

	public static void main(java.lang.String[] args) {
		java.lang.System.out.println(org.jfree.chart.JFreeChart.INFO.toString());
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.JFreeChart chart = ((org.jfree.chart.JFreeChart) (super.clone()));
		chart.renderingHints = ((java.awt.RenderingHints) (org.jfree.chart.JFreeChart.this.renderingHints.clone()));
		if ((org.jfree.chart.JFreeChart.this.title) != null) {
			chart.title = ((org.jfree.chart.title.TextTitle) (org.jfree.chart.JFreeChart.this.title.clone()));
			chart.title.addChangeListener(chart);
		}
		chart.subtitles = new java.util.ArrayList();
		for (int i = 0; i < (getSubtitleCount()); i++) {
			org.jfree.chart.title.Title subtitle = ((org.jfree.chart.title.Title) (getSubtitle(i).clone()));
			chart.subtitles.add(subtitle);
			subtitle.addChangeListener(chart);
		}
		if ((org.jfree.chart.JFreeChart.this.plot) != null) {
			chart.plot = ((org.jfree.chart.plot.Plot) (org.jfree.chart.JFreeChart.this.plot.clone()));
			chart.plot.addChangeListener(chart);
		}
		chart.progressListeners = new javax.swing.event.EventListenerList();
		chart.changeListeners = new javax.swing.event.EventListenerList();
		return chart;
	}
}

class JFreeChartInfo extends org.jfree.chart.ui.ProjectInfo {
	public JFreeChartInfo() {
		java.lang.String baseResourceClass = "org.jfree.chart.resources.JFreeChartResources";
		java.util.ResourceBundle resources = org.jfree.chart.util.ResourceBundleWrapper.getBundle(baseResourceClass);
		setName(resources.getString("project.name"));
		setVersion(resources.getString("project.version"));
		setInfo(resources.getString("project.info"));
		setCopyright(resources.getString("project.copyright"));
		setLogo(null);
		setLicenceName("LGPL");
		setLicenceText(org.jfree.chart.ui.Licences.getInstance().getLGPL());
		setContributors(java.util.Arrays.asList(new org.jfree.chart.ui.Contributor[]{ new org.jfree.chart.ui.Contributor("Eric Alexander", "-") , new org.jfree.chart.ui.Contributor("Richard Atkinson", "richard_c_atkinson@ntlworld.com") , new org.jfree.chart.ui.Contributor("David Basten", "-") , new org.jfree.chart.ui.Contributor("David Berry", "-") , new org.jfree.chart.ui.Contributor("Chris Boek", "-") , new org.jfree.chart.ui.Contributor("Zoheb Borbora", "-") , new org.jfree.chart.ui.Contributor("Anthony Boulestreau", "-") , new org.jfree.chart.ui.Contributor("Jeremy Bowman", "-") , new org.jfree.chart.ui.Contributor("Nicolas Brodu", "-") , new org.jfree.chart.ui.Contributor("Jody Brownell", "-") , new org.jfree.chart.ui.Contributor("David Browning", "-") , new org.jfree.chart.ui.Contributor("Soren Caspersen", "-") , new org.jfree.chart.ui.Contributor("Chuanhao Chiu", "-") , new org.jfree.chart.ui.Contributor("Brian Cole", "-") , new org.jfree.chart.ui.Contributor("Pascal Collet", "-") , new org.jfree.chart.ui.Contributor("Martin Cordova", "-") , new org.jfree.chart.ui.Contributor("Paolo Cova", "-") , new org.jfree.chart.ui.Contributor("Greg Darke", "-") , new org.jfree.chart.ui.Contributor("Mike Duffy", "-") , new org.jfree.chart.ui.Contributor("Don Elliott", "-") , new org.jfree.chart.ui.Contributor("David Forslund", "-") , new org.jfree.chart.ui.Contributor("Jonathan Gabbai", "-") , new org.jfree.chart.ui.Contributor("David Gilbert", "david.gilbert@object-refinery.com") , new org.jfree.chart.ui.Contributor("Serge V. Grachov", "-") , new org.jfree.chart.ui.Contributor("Daniel Gredler", "-") , new org.jfree.chart.ui.Contributor("Hans-Jurgen Greiner", "-") , new org.jfree.chart.ui.Contributor("Joao Guilherme Del Valle", "-") , new org.jfree.chart.ui.Contributor("Aiman Han", "-") , new org.jfree.chart.ui.Contributor("Cameron Hayne", "-") , new org.jfree.chart.ui.Contributor("Martin Hoeller", "-") , new org.jfree.chart.ui.Contributor("Jon Iles", "-") , new org.jfree.chart.ui.Contributor("Wolfgang Irler", "-") , new org.jfree.chart.ui.Contributor("Sergei Ivanov", "-") , new org.jfree.chart.ui.Contributor("Adriaan Joubert", "-") , new org.jfree.chart.ui.Contributor("Darren Jung", "-") , new org.jfree.chart.ui.Contributor("Xun Kang", "-") , new org.jfree.chart.ui.Contributor("Bill Kelemen", "-") , new org.jfree.chart.ui.Contributor("Norbert Kiesel", "-") , new org.jfree.chart.ui.Contributor("Peter Kolb", "-") , new org.jfree.chart.ui.Contributor("Gideon Krause", "-") , new org.jfree.chart.ui.Contributor("Pierre-Marie Le Biot", "-") , new org.jfree.chart.ui.Contributor("Arnaud Lelievre", "-") , new org.jfree.chart.ui.Contributor("Wolfgang Lenhard", "-") , new org.jfree.chart.ui.Contributor("David Li", "-") , new org.jfree.chart.ui.Contributor("Yan Liu", "-") , new org.jfree.chart.ui.Contributor("Tin Luu", "-") , new org.jfree.chart.ui.Contributor("Craig MacFarlane", "-") , new org.jfree.chart.ui.Contributor("Achilleus Mantzios", "-") , new org.jfree.chart.ui.Contributor("Thomas Meier", "-") , new org.jfree.chart.ui.Contributor("Jim Moore", "-") , new org.jfree.chart.ui.Contributor("Jonathan Nash", "-") , new org.jfree.chart.ui.Contributor("Barak Naveh", "-") , new org.jfree.chart.ui.Contributor("David M. O'Donnell", "-") , new org.jfree.chart.ui.Contributor("Krzysztof Paz", "-") , new org.jfree.chart.ui.Contributor("Eric Penfold", "-") , new org.jfree.chart.ui.Contributor("Tomer Peretz", "-") , new org.jfree.chart.ui.Contributor("Diego Pierangeli", "-") , new org.jfree.chart.ui.Contributor("Xavier Poinsard", "-") , new org.jfree.chart.ui.Contributor("Andrzej Porebski", "-") , new org.jfree.chart.ui.Contributor("Viktor Rajewski", "-") , new org.jfree.chart.ui.Contributor("Eduardo Ramalho", "-") , new org.jfree.chart.ui.Contributor("Michael Rauch", "-") , new org.jfree.chart.ui.Contributor("Cameron Riley", "-") , new org.jfree.chart.ui.Contributor("Klaus Rheinwald", "-") , new org.jfree.chart.ui.Contributor("Dan Rivett", "d.rivett@ukonline.co.uk") , new org.jfree.chart.ui.Contributor("Scott Sams", "-") , new org.jfree.chart.ui.Contributor("Michel Santos", "-") , new org.jfree.chart.ui.Contributor("Thierry Saura", "-") , new org.jfree.chart.ui.Contributor("Andreas Schneider", "-") , new org.jfree.chart.ui.Contributor("Jean-Luc SCHWAB", "-") , new org.jfree.chart.ui.Contributor("Bryan Scott", "-") , new org.jfree.chart.ui.Contributor("Tobias Selb", "-") , new org.jfree.chart.ui.Contributor("Darshan Shah", "-") , new org.jfree.chart.ui.Contributor("Mofeed Shahin", "-") , new org.jfree.chart.ui.Contributor("Michael Siemer", "-") , new org.jfree.chart.ui.Contributor("Pady Srinivasan", "-") , new org.jfree.chart.ui.Contributor("Greg Steckman", "-") , new org.jfree.chart.ui.Contributor("Gerald Struck", "-") , new org.jfree.chart.ui.Contributor("Roger Studner", "-") , new org.jfree.chart.ui.Contributor("Irv Thomae", "-") , new org.jfree.chart.ui.Contributor("Eric Thomas", "-") , new org.jfree.chart.ui.Contributor("Jess Thrysoee", "-") , new org.jfree.chart.ui.Contributor("Rich Unger", "-") , new org.jfree.chart.ui.Contributor("Daniel van Enckevort", "-") , new org.jfree.chart.ui.Contributor("Laurence Vanhelsuwe", "-") , new org.jfree.chart.ui.Contributor("Sylvain Vieujot", "-") , new org.jfree.chart.ui.Contributor("Ulrich Voigt", "-") , new org.jfree.chart.ui.Contributor("Jelai Wang", "-") , new org.jfree.chart.ui.Contributor("Mark Watson", "www.markwatson.com") , new org.jfree.chart.ui.Contributor("Alex Weber", "-") , new org.jfree.chart.ui.Contributor("Matthew Wright", "-") , new org.jfree.chart.ui.Contributor("Benoit Xhenseval", "-") , new org.jfree.chart.ui.Contributor("Christian W. Zuckschwerdt", "Christian.Zuckschwerdt@Informatik.Uni-Oldenburg.de") , new org.jfree.chart.ui.Contributor("Hari", "-") , new org.jfree.chart.ui.Contributor("Sam (oldman)", "-") }));
	}

	public java.awt.Image getLogo() {
		java.awt.Image logo = super.getLogo();
		if (logo == null) {
			java.net.URL imageURL = org.jfree.chart.JFreeChartInfo.this.getClass().getClassLoader().getResource("org/jfree/chart/gorilla.jpg");
			if (imageURL != null) {
				javax.swing.ImageIcon temp = new javax.swing.ImageIcon(imageURL);
				logo = temp.getImage();
				setLogo(logo);
			}
		}
		return logo;
	}
}

