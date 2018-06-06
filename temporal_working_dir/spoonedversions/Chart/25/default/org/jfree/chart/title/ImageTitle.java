

package org.jfree.chart.title;


public class ImageTitle extends org.jfree.chart.title.Title {
	private java.awt.Image image;

	public ImageTitle(java.awt.Image image) {
		this(image, image.getHeight(null), image.getWidth(null), org.jfree.chart.title.Title.DEFAULT_POSITION, org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	public ImageTitle(java.awt.Image image, org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment) {
		this(image, image.getHeight(null), image.getWidth(null), position, horizontalAlignment, verticalAlignment, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	public ImageTitle(java.awt.Image image, int height, int width, org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment, org.jfree.chart.util.RectangleInsets padding) {
		super(position, horizontalAlignment, verticalAlignment, padding);
		if (image == null) {
			throw new java.lang.NullPointerException("Null 'image' argument.");
		}
		org.jfree.chart.title.ImageTitle.this.image = image;
		setHeight(height);
		setWidth(width);
	}

	public java.awt.Image getImage() {
		return org.jfree.chart.title.ImageTitle.this.image;
	}

	public void setImage(java.awt.Image image) {
		if (image == null) {
			throw new java.lang.NullPointerException("Null 'image' argument.");
		}
		org.jfree.chart.title.ImageTitle.this.image = image;
		notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.ImageTitle.this));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D titleArea) {
		org.jfree.chart.util.RectangleEdge position = getPosition();
		if ((position == (org.jfree.chart.util.RectangleEdge.TOP)) || (position == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			drawHorizontal(g2, titleArea);
		}else
			if ((position == (org.jfree.chart.util.RectangleEdge.LEFT)) || (position == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				drawVertical(g2, titleArea);
			}else {
				throw new java.lang.RuntimeException("Invalid title position.");
			}
		
	}

	protected org.jfree.chart.util.Size2D drawHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D chartArea) {
		double startY = 0.0;
		double topSpace = 0.0;
		double bottomSpace = 0.0;
		double leftSpace = 0.0;
		double rightSpace = 0.0;
		double w = getWidth();
		double h = getHeight();
		org.jfree.chart.util.RectangleInsets padding = getPadding();
		topSpace = padding.calculateTopOutset(h);
		bottomSpace = padding.calculateBottomOutset(h);
		leftSpace = padding.calculateLeftOutset(w);
		rightSpace = padding.calculateRightOutset(w);
		if ((getPosition()) == (org.jfree.chart.util.RectangleEdge.TOP)) {
			startY = (chartArea.getY()) + topSpace;
		}else {
			startY = (((chartArea.getY()) + (chartArea.getHeight())) - bottomSpace) - h;
		}
		org.jfree.chart.util.HorizontalAlignment horizontalAlignment = getHorizontalAlignment();
		double startX = 0.0;
		if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
			startX = (((chartArea.getX()) + leftSpace) + ((chartArea.getWidth()) / 2.0)) - (w / 2.0);
		}else
			if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.LEFT)) {
				startX = (chartArea.getX()) + leftSpace;
			}else
				if (horizontalAlignment == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
					startX = (((chartArea.getX()) + (chartArea.getWidth())) - rightSpace) - w;
				}
			
		
		g2.drawImage(org.jfree.chart.title.ImageTitle.this.image, ((int) (startX)), ((int) (startY)), ((int) (w)), ((int) (h)), null);
		return new org.jfree.chart.util.Size2D((((chartArea.getWidth()) + leftSpace) + rightSpace), ((h + topSpace) + bottomSpace));
	}

	protected org.jfree.chart.util.Size2D drawVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D chartArea) {
		double startX = 0.0;
		double topSpace = 0.0;
		double bottomSpace = 0.0;
		double leftSpace = 0.0;
		double rightSpace = 0.0;
		double w = getWidth();
		double h = getHeight();
		org.jfree.chart.util.RectangleInsets padding = getPadding();
		if (padding != null) {
			topSpace = padding.calculateTopOutset(h);
			bottomSpace = padding.calculateBottomOutset(h);
			leftSpace = padding.calculateLeftOutset(w);
			rightSpace = padding.calculateRightOutset(w);
		}
		if ((getPosition()) == (org.jfree.chart.util.RectangleEdge.LEFT)) {
			startX = (chartArea.getX()) + leftSpace;
		}else {
			startX = ((chartArea.getMaxX()) - rightSpace) - w;
		}
		org.jfree.chart.util.VerticalAlignment alignment = getVerticalAlignment();
		double startY = 0.0;
		if (alignment == (org.jfree.chart.util.VerticalAlignment.CENTER)) {
			startY = (((chartArea.getMinY()) + topSpace) + ((chartArea.getHeight()) / 2.0)) - (h / 2.0);
		}else
			if (alignment == (org.jfree.chart.util.VerticalAlignment.TOP)) {
				startY = (chartArea.getMinY()) + topSpace;
			}else
				if (alignment == (org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
					startY = ((chartArea.getMaxY()) - bottomSpace) - h;
				}
			
		
		g2.drawImage(org.jfree.chart.title.ImageTitle.this.image, ((int) (startX)), ((int) (startY)), ((int) (w)), ((int) (h)), null);
		return new org.jfree.chart.util.Size2D((((chartArea.getWidth()) + leftSpace) + rightSpace), ((h + topSpace) + bottomSpace));
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		draw(g2, area);
		return null;
	}
}

