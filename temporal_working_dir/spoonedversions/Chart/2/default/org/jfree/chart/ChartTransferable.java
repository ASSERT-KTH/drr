

package org.jfree.chart;


public class ChartTransferable implements java.awt.datatransfer.Transferable {
	final java.awt.datatransfer.DataFlavor imageFlavor = new java.awt.datatransfer.DataFlavor("image/x-java-image; class=java.awt.Image", "Image");

	private org.jfree.chart.JFreeChart chart;

	private int width;

	private int height;

	private int minDrawWidth;

	private int minDrawHeight;

	private int maxDrawWidth;

	private int maxDrawHeight;

	public ChartTransferable(org.jfree.chart.JFreeChart chart, int width, int height) {
		this(chart, width, height, true);
	}

	public ChartTransferable(org.jfree.chart.JFreeChart chart, int width, int height, boolean cloneData) {
		this(chart, width, height, 0, 0, java.lang.Integer.MAX_VALUE, java.lang.Integer.MAX_VALUE, true);
	}

	public ChartTransferable(org.jfree.chart.JFreeChart chart, int width, int height, int minDrawW, int minDrawH, int maxDrawW, int maxDrawH, boolean cloneData) {
		try {
			org.jfree.chart.ChartTransferable.this.chart = ((org.jfree.chart.JFreeChart) (chart.clone()));
		} catch (java.lang.CloneNotSupportedException e) {
			org.jfree.chart.ChartTransferable.this.chart = chart;
		}
		org.jfree.chart.ChartTransferable.this.width = width;
		org.jfree.chart.ChartTransferable.this.height = height;
		org.jfree.chart.ChartTransferable.this.minDrawWidth = minDrawW;
		org.jfree.chart.ChartTransferable.this.minDrawHeight = minDrawH;
		org.jfree.chart.ChartTransferable.this.maxDrawWidth = maxDrawW;
		org.jfree.chart.ChartTransferable.this.maxDrawHeight = maxDrawH;
	}

	public java.awt.datatransfer.DataFlavor[] getTransferDataFlavors() {
		return new java.awt.datatransfer.DataFlavor[]{ org.jfree.chart.ChartTransferable.this.imageFlavor };
	}

	public boolean isDataFlavorSupported(java.awt.datatransfer.DataFlavor flavor) {
		return org.jfree.chart.ChartTransferable.this.imageFlavor.equals(flavor);
	}

	public java.lang.Object getTransferData(java.awt.datatransfer.DataFlavor flavor) throws java.awt.datatransfer.UnsupportedFlavorException, java.io.IOException {
		if (org.jfree.chart.ChartTransferable.this.imageFlavor.equals(flavor)) {
			return createBufferedImage(org.jfree.chart.ChartTransferable.this.chart, org.jfree.chart.ChartTransferable.this.width, org.jfree.chart.ChartTransferable.this.height, org.jfree.chart.ChartTransferable.this.minDrawWidth, org.jfree.chart.ChartTransferable.this.minDrawHeight, org.jfree.chart.ChartTransferable.this.maxDrawWidth, org.jfree.chart.ChartTransferable.this.maxDrawHeight);
		}else {
			throw new java.awt.datatransfer.UnsupportedFlavorException(flavor);
		}
	}

	private java.awt.image.BufferedImage createBufferedImage(org.jfree.chart.JFreeChart chart, int w, int h, int minDrawW, int minDrawH, int maxDrawW, int maxDrawH) {
		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D g2 = image.createGraphics();
		boolean scale = false;
		double drawWidth = w;
		double drawHeight = h;
		double scaleX = 1.0;
		double scaleY = 1.0;
		if (drawWidth < minDrawW) {
			scaleX = drawWidth / minDrawW;
			drawWidth = minDrawW;
			scale = true;
		}else
			if (drawWidth > maxDrawW) {
				scaleX = drawWidth / maxDrawW;
				drawWidth = maxDrawW;
				scale = true;
			}
		
		if (drawHeight < minDrawH) {
			scaleY = drawHeight / minDrawH;
			drawHeight = minDrawH;
			scale = true;
		}else
			if (drawHeight > maxDrawH) {
				scaleY = drawHeight / maxDrawH;
				drawHeight = maxDrawH;
				scale = true;
			}
		
		java.awt.geom.Rectangle2D chartArea = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, drawWidth, drawHeight);
		if (scale) {
			java.awt.geom.AffineTransform st = java.awt.geom.AffineTransform.getScaleInstance(scaleX, scaleY);
			g2.transform(st);
		}
		chart.draw(g2, chartArea, null, null);
		g2.dispose();
		return image;
	}
}

