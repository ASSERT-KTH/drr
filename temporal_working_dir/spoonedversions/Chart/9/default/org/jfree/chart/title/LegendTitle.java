

package org.jfree.chart.title;


public class LegendTitle extends org.jfree.chart.title.Title implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 2644010518533854633L;

	public static final java.awt.Font DEFAULT_ITEM_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12);

	public static final java.awt.Paint DEFAULT_ITEM_PAINT = java.awt.Color.black;

	private org.jfree.chart.LegendItemSource[] sources;

	private transient java.awt.Paint backgroundPaint;

	private org.jfree.chart.util.RectangleEdge legendItemGraphicEdge;

	private org.jfree.chart.util.RectangleAnchor legendItemGraphicAnchor;

	private org.jfree.chart.util.RectangleAnchor legendItemGraphicLocation;

	private org.jfree.chart.util.RectangleInsets legendItemGraphicPadding;

	private java.awt.Font itemFont;

	private transient java.awt.Paint itemPaint;

	private org.jfree.chart.util.RectangleInsets itemLabelPadding;

	private org.jfree.chart.block.BlockContainer items;

	private org.jfree.chart.block.Arrangement hLayout;

	private org.jfree.chart.block.Arrangement vLayout;

	private org.jfree.chart.block.BlockContainer wrapper;

	public LegendTitle(org.jfree.chart.LegendItemSource source) {
		this(source, new org.jfree.chart.block.FlowArrangement(), new org.jfree.chart.block.ColumnArrangement());
	}

	public LegendTitle(org.jfree.chart.LegendItemSource source, org.jfree.chart.block.Arrangement hLayout, org.jfree.chart.block.Arrangement vLayout) {
		org.jfree.chart.title.LegendTitle.this.sources = new org.jfree.chart.LegendItemSource[]{ source };
		org.jfree.chart.title.LegendTitle.this.items = new org.jfree.chart.block.BlockContainer(hLayout);
		org.jfree.chart.title.LegendTitle.this.hLayout = hLayout;
		org.jfree.chart.title.LegendTitle.this.vLayout = vLayout;
		org.jfree.chart.title.LegendTitle.this.backgroundPaint = null;
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicEdge = org.jfree.chart.util.RectangleEdge.LEFT;
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicAnchor = org.jfree.chart.util.RectangleAnchor.CENTER;
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicLocation = org.jfree.chart.util.RectangleAnchor.CENTER;
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicPadding = new org.jfree.chart.util.RectangleInsets(2.0, 2.0, 2.0, 2.0);
		org.jfree.chart.title.LegendTitle.this.itemFont = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_FONT;
		org.jfree.chart.title.LegendTitle.this.itemPaint = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
		org.jfree.chart.title.LegendTitle.this.itemLabelPadding = new org.jfree.chart.util.RectangleInsets(2.0, 2.0, 2.0, 2.0);
	}

	public org.jfree.chart.LegendItemSource[] getSources() {
		return org.jfree.chart.title.LegendTitle.this.sources;
	}

	public void setSources(org.jfree.chart.LegendItemSource[] sources) {
		if (sources == null) {
			throw new java.lang.IllegalArgumentException("Null 'sources' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.sources = sources;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.title.LegendTitle.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.title.LegendTitle.this.backgroundPaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public org.jfree.chart.util.RectangleEdge getLegendItemGraphicEdge() {
		return org.jfree.chart.title.LegendTitle.this.legendItemGraphicEdge;
	}

	public void setLegendItemGraphicEdge(org.jfree.chart.util.RectangleEdge edge) {
		if (edge == null) {
			throw new java.lang.IllegalArgumentException("Null 'edge' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicEdge = edge;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public org.jfree.chart.util.RectangleAnchor getLegendItemGraphicAnchor() {
		return org.jfree.chart.title.LegendTitle.this.legendItemGraphicAnchor;
	}

	public void setLegendItemGraphicAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' point.");
		}
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicAnchor = anchor;
	}

	public org.jfree.chart.util.RectangleAnchor getLegendItemGraphicLocation() {
		return org.jfree.chart.title.LegendTitle.this.legendItemGraphicLocation;
	}

	public void setLegendItemGraphicLocation(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicLocation = anchor;
	}

	public org.jfree.chart.util.RectangleInsets getLegendItemGraphicPadding() {
		return org.jfree.chart.title.LegendTitle.this.legendItemGraphicPadding;
	}

	public void setLegendItemGraphicPadding(org.jfree.chart.util.RectangleInsets padding) {
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.legendItemGraphicPadding = padding;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public java.awt.Font getItemFont() {
		return org.jfree.chart.title.LegendTitle.this.itemFont;
	}

	public void setItemFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.itemFont = font;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public java.awt.Paint getItemPaint() {
		return org.jfree.chart.title.LegendTitle.this.itemPaint;
	}

	public void setItemPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.itemPaint = paint;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	public org.jfree.chart.util.RectangleInsets getItemLabelPadding() {
		return org.jfree.chart.title.LegendTitle.this.itemLabelPadding;
	}

	public void setItemLabelPadding(org.jfree.chart.util.RectangleInsets padding) {
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		org.jfree.chart.title.LegendTitle.this.itemLabelPadding = padding;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.LegendTitle.this));
	}

	protected void fetchLegendItems() {
		org.jfree.chart.title.LegendTitle.this.items.clear();
		org.jfree.chart.util.RectangleEdge p = getPosition();
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(p)) {
			org.jfree.chart.title.LegendTitle.this.items.setArrangement(org.jfree.chart.title.LegendTitle.this.hLayout);
		}else {
			org.jfree.chart.title.LegendTitle.this.items.setArrangement(org.jfree.chart.title.LegendTitle.this.vLayout);
		}
		for (int s = 0; s < (org.jfree.chart.title.LegendTitle.this.sources.length); s++) {
			org.jfree.chart.LegendItemCollection legendItems = org.jfree.chart.title.LegendTitle.this.sources[s].getLegendItems();
			if (legendItems != null) {
				for (int i = 0; i < (legendItems.getItemCount()); i++) {
					org.jfree.chart.LegendItem item = legendItems.get(i);
					org.jfree.chart.block.Block block = createLegendItemBlock(item);
					org.jfree.chart.title.LegendTitle.this.items.add(block);
				}
			}
		}
	}

	protected org.jfree.chart.block.Block createLegendItemBlock(org.jfree.chart.LegendItem item) {
		org.jfree.chart.block.BlockContainer result = null;
		org.jfree.chart.title.LegendGraphic lg = new org.jfree.chart.title.LegendGraphic(item.getShape(), item.getFillPaint());
		lg.setFillPaintTransformer(item.getFillPaintTransformer());
		lg.setShapeFilled(item.isShapeFilled());
		lg.setLine(item.getLine());
		lg.setLineStroke(item.getLineStroke());
		lg.setLinePaint(item.getLinePaint());
		lg.setLineVisible(item.isLineVisible());
		lg.setShapeVisible(item.isShapeVisible());
		lg.setShapeOutlineVisible(item.isShapeOutlineVisible());
		lg.setOutlinePaint(item.getOutlinePaint());
		lg.setOutlineStroke(item.getOutlineStroke());
		lg.setPadding(org.jfree.chart.title.LegendTitle.this.legendItemGraphicPadding);
		org.jfree.chart.title.LegendItemBlockContainer legendItem = new org.jfree.chart.title.LegendItemBlockContainer(new org.jfree.chart.block.BorderArrangement(), item.getDataset(), item.getSeriesKey());
		lg.setShapeAnchor(getLegendItemGraphicAnchor());
		lg.setShapeLocation(getLegendItemGraphicLocation());
		legendItem.add(lg, org.jfree.chart.title.LegendTitle.this.legendItemGraphicEdge);
		org.jfree.chart.block.LabelBlock labelBlock = new org.jfree.chart.block.LabelBlock(item.getLabel(), org.jfree.chart.title.LegendTitle.this.itemFont, org.jfree.chart.title.LegendTitle.this.itemPaint);
		labelBlock.setPadding(org.jfree.chart.title.LegendTitle.this.itemLabelPadding);
		legendItem.add(labelBlock);
		legendItem.setToolTipText(item.getToolTipText());
		legendItem.setURLText(item.getURLText());
		result = new org.jfree.chart.block.BlockContainer(new org.jfree.chart.block.CenterArrangement());
		result.add(legendItem);
		return result;
	}

	public org.jfree.chart.block.BlockContainer getItemContainer() {
		return org.jfree.chart.title.LegendTitle.this.items;
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D result = new org.jfree.chart.util.Size2D();
		fetchLegendItems();
		if (org.jfree.chart.title.LegendTitle.this.items.isEmpty()) {
			return result;
		}
		org.jfree.chart.block.BlockContainer container = org.jfree.chart.title.LegendTitle.this.wrapper;
		if (container == null) {
			container = org.jfree.chart.title.LegendTitle.this.items;
		}
		org.jfree.chart.block.RectangleConstraint c = toContentConstraint(constraint);
		org.jfree.chart.util.Size2D size = container.arrange(g2, c);
		result.height = calculateTotalHeight(size.height);
		result.width = calculateTotalWidth(size.width);
		return result;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		java.awt.geom.Rectangle2D target = ((java.awt.geom.Rectangle2D) (area.clone()));
		target = trimMargin(target);
		if ((org.jfree.chart.title.LegendTitle.this.backgroundPaint) != null) {
			g2.setPaint(org.jfree.chart.title.LegendTitle.this.backgroundPaint);
			g2.fill(target);
		}
		org.jfree.chart.block.BlockFrame border = getFrame();
		border.draw(g2, target);
		border.getInsets().trim(target);
		org.jfree.chart.block.BlockContainer container = org.jfree.chart.title.LegendTitle.this.wrapper;
		if (container == null) {
			container = org.jfree.chart.title.LegendTitle.this.items;
		}
		target = trimPadding(target);
		return container.draw(g2, target, params);
	}

	public void setWrapper(org.jfree.chart.block.BlockContainer wrapper) {
		org.jfree.chart.title.LegendTitle.this.wrapper = wrapper;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.title.LegendTitle.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.title.LegendTitle)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.title.LegendTitle that = ((org.jfree.chart.title.LegendTitle) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.title.LegendTitle.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if ((org.jfree.chart.title.LegendTitle.this.legendItemGraphicEdge) != (that.legendItemGraphicEdge)) {
			return false;
		}
		if ((org.jfree.chart.title.LegendTitle.this.legendItemGraphicAnchor) != (that.legendItemGraphicAnchor)) {
			return false;
		}
		if ((org.jfree.chart.title.LegendTitle.this.legendItemGraphicLocation) != (that.legendItemGraphicLocation)) {
			return false;
		}
		if (!(org.jfree.chart.title.LegendTitle.this.itemFont.equals(that.itemFont))) {
			return false;
		}
		if (!(org.jfree.chart.title.LegendTitle.this.itemPaint.equals(that.itemPaint))) {
			return false;
		}
		if (!(org.jfree.chart.title.LegendTitle.this.hLayout.equals(that.hLayout))) {
			return false;
		}
		if (!(org.jfree.chart.title.LegendTitle.this.vLayout.equals(that.vLayout))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.LegendTitle.this.backgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.title.LegendTitle.this.itemPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.LegendTitle.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.title.LegendTitle.this.itemPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

