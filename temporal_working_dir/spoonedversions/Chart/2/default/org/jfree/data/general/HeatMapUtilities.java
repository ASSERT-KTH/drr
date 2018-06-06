

package org.jfree.data.general;


public abstract class HeatMapUtilities {
	public static org.jfree.data.xy.XYDataset extractRowFromHeatMapDataset(org.jfree.data.general.HeatMapDataset dataset, int row, java.lang.Comparable seriesName) {
		org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(seriesName);
		int cols = dataset.getXSampleCount();
		for (int c = 0; c < cols; c++) {
			series.add(dataset.getXValue(c), dataset.getZValue(c, row));
		}
		org.jfree.data.xy.XYSeriesCollection result = new org.jfree.data.xy.XYSeriesCollection(series);
		return result;
	}

	public static org.jfree.data.xy.XYDataset extractColumnFromHeatMapDataset(org.jfree.data.general.HeatMapDataset dataset, int column, java.lang.Comparable seriesName) {
		org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(seriesName);
		int rows = dataset.getYSampleCount();
		for (int r = 0; r < rows; r++) {
			series.add(dataset.getYValue(r), dataset.getZValue(column, r));
		}
		org.jfree.data.xy.XYSeriesCollection result = new org.jfree.data.xy.XYSeriesCollection(series);
		return result;
	}

	public static java.awt.image.BufferedImage createHeatMapImage(org.jfree.data.general.HeatMapDataset dataset, org.jfree.chart.renderer.PaintScale paintScale) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (paintScale == null) {
			throw new java.lang.IllegalArgumentException("Null 'paintScale' argument.");
		}
		int xCount = dataset.getXSampleCount();
		int yCount = dataset.getYSampleCount();
		java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(xCount, yCount, java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D g2 = image.createGraphics();
		for (int xIndex = 0; xIndex < xCount; xIndex++) {
			for (int yIndex = 0; yIndex < yCount; yIndex++) {
				double z = dataset.getZValue(xIndex, yIndex);
				java.awt.Paint p = paintScale.getPaint(z);
				g2.setPaint(p);
				g2.fillRect(xIndex, ((yCount - yIndex) - 1), 1, 1);
			}
		}
		return image;
	}
}

