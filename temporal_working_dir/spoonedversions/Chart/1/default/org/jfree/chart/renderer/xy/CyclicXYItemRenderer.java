

package org.jfree.chart.renderer.xy;


public class CyclicXYItemRenderer extends org.jfree.chart.renderer.xy.StandardXYItemRenderer implements java.io.Serializable {
	private static final long serialVersionUID = 4035912243303764892L;

	public CyclicXYItemRenderer() {
		super();
	}

	public CyclicXYItemRenderer(int type) {
		super(type);
	}

	public CyclicXYItemRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator labelGenerator) {
		super(type, labelGenerator);
	}

	public CyclicXYItemRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator labelGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super(type, labelGenerator, urlGenerator);
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		if (((!(getPlotLines())) || ((!(domainAxis instanceof org.jfree.chart.axis.CyclicNumberAxis)) && (!(rangeAxis instanceof org.jfree.chart.axis.CyclicNumberAxis)))) || (item <= 0)) {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, series, item, selected, pass);
			return ;
		}
		double xn = dataset.getXValue(series, (item - 1));
		double yn = dataset.getYValue(series, (item - 1));
		if (java.lang.Double.isNaN(yn)) {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, series, item, selected, pass);
			return ;
		}
		double[] x = new double[2];
		double[] y = new double[2];
		x[0] = xn;
		y[0] = yn;
		xn = dataset.getXValue(series, item);
		yn = dataset.getYValue(series, item);
		if (java.lang.Double.isNaN(yn)) {
			return ;
		}
		x[1] = xn;
		y[1] = yn;
		double xcycleBound = java.lang.Double.NaN;
		double ycycleBound = java.lang.Double.NaN;
		boolean xBoundMapping = false;
		boolean yBoundMapping = false;
		org.jfree.chart.axis.CyclicNumberAxis cnax = null;
		org.jfree.chart.axis.CyclicNumberAxis cnay = null;
		if (domainAxis instanceof org.jfree.chart.axis.CyclicNumberAxis) {
			cnax = ((org.jfree.chart.axis.CyclicNumberAxis) (domainAxis));
			xcycleBound = cnax.getCycleBound();
			xBoundMapping = cnax.isBoundMappedToLastCycle();
			if (((x[0]) != (x[1])) && (((xcycleBound >= (x[0])) && (xcycleBound <= (x[1]))) || ((xcycleBound >= (x[1])) && (xcycleBound <= (x[0]))))) {
				double[] nx = new double[3];
				double[] ny = new double[3];
				nx[0] = x[0];
				nx[2] = x[1];
				ny[0] = y[0];
				ny[2] = y[1];
				nx[1] = xcycleBound;
				ny[1] = ((((y[1]) - (y[0])) * (xcycleBound - (x[0]))) / ((x[1]) - (x[0]))) + (y[0]);
				x = nx;
				y = ny;
			}
		}
		if (rangeAxis instanceof org.jfree.chart.axis.CyclicNumberAxis) {
			cnay = ((org.jfree.chart.axis.CyclicNumberAxis) (rangeAxis));
			ycycleBound = cnay.getCycleBound();
			yBoundMapping = cnay.isBoundMappedToLastCycle();
			if (((y[0]) != (y[1])) && (((ycycleBound >= (y[0])) && (ycycleBound <= (y[1]))) || ((ycycleBound >= (y[1])) && (ycycleBound <= (y[0]))))) {
				double[] nx = new double[(x.length) + 1];
				double[] ny = new double[(y.length) + 1];
				nx[0] = x[0];
				nx[2] = x[1];
				ny[0] = y[0];
				ny[2] = y[1];
				ny[1] = ycycleBound;
				nx[1] = ((((x[1]) - (x[0])) * (ycycleBound - (y[0]))) / ((y[1]) - (y[0]))) + (x[0]);
				if ((x.length) == 3) {
					nx[3] = x[2];
					ny[3] = y[2];
				}
				x = nx;
				y = ny;
			}else
				if ((((x.length) == 3) && ((y[1]) != (y[2]))) && (((ycycleBound >= (y[1])) && (ycycleBound <= (y[2]))) || ((ycycleBound >= (y[2])) && (ycycleBound <= (y[1]))))) {
					double[] nx = new double[4];
					double[] ny = new double[4];
					nx[0] = x[0];
					nx[1] = x[1];
					nx[3] = x[2];
					ny[0] = y[0];
					ny[1] = y[1];
					ny[3] = y[2];
					ny[2] = ycycleBound;
					nx[2] = ((((x[2]) - (x[1])) * (ycycleBound - (y[1]))) / ((y[2]) - (y[1]))) + (x[1]);
					x = nx;
					y = ny;
				}
			
		}
		if ((x.length) == 2) {
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, series, item, selected, pass);
			return ;
		}
		org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet newset = new org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet(x, y, dataset);
		if (cnax != null) {
			if (xcycleBound == (x[0])) {
				cnax.setBoundMappedToLastCycle(((x[1]) <= xcycleBound));
			}
			if (xcycleBound == (x[1])) {
				cnax.setBoundMappedToLastCycle(((x[0]) <= xcycleBound));
			}
		}
		if (cnay != null) {
			if (ycycleBound == (y[0])) {
				cnay.setBoundMappedToLastCycle(((y[1]) <= ycycleBound));
			}
			if (ycycleBound == (y[1])) {
				cnay.setBoundMappedToLastCycle(((y[0]) <= ycycleBound));
			}
		}
		super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, newset, series, 1, selected, pass);
		if (cnax != null) {
			if (xcycleBound == (x[1])) {
				cnax.setBoundMappedToLastCycle(((x[2]) <= xcycleBound));
			}
			if (xcycleBound == (x[2])) {
				cnax.setBoundMappedToLastCycle(((x[1]) <= xcycleBound));
			}
		}
		if (cnay != null) {
			if (ycycleBound == (y[1])) {
				cnay.setBoundMappedToLastCycle(((y[2]) <= ycycleBound));
			}
			if (ycycleBound == (y[2])) {
				cnay.setBoundMappedToLastCycle(((y[1]) <= ycycleBound));
			}
		}
		super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, newset, series, 2, selected, pass);
		if ((x.length) == 4) {
			if (cnax != null) {
				if (xcycleBound == (x[2])) {
					cnax.setBoundMappedToLastCycle(((x[3]) <= xcycleBound));
				}
				if (xcycleBound == (x[3])) {
					cnax.setBoundMappedToLastCycle(((x[2]) <= xcycleBound));
				}
			}
			if (cnay != null) {
				if (ycycleBound == (y[2])) {
					cnay.setBoundMappedToLastCycle(((y[3]) <= ycycleBound));
				}
				if (ycycleBound == (y[3])) {
					cnay.setBoundMappedToLastCycle(((y[2]) <= ycycleBound));
				}
			}
			super.drawItem(g2, state, dataArea, plot, domainAxis, rangeAxis, newset, series, 3, selected, pass);
		}
		if (cnax != null) {
			cnax.setBoundMappedToLastCycle(xBoundMapping);
		}
		if (cnay != null) {
			cnay.setBoundMappedToLastCycle(yBoundMapping);
		}
	}

	protected static class OverwriteDataSet implements org.jfree.data.xy.XYDataset {
		protected org.jfree.data.xy.XYDataset delegateSet;

		java.lang.Double[] x;

		java.lang.Double[] y;

		public OverwriteDataSet(double[] x, double[] y, org.jfree.data.xy.XYDataset delegateSet) {
			org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.delegateSet = delegateSet;
			org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.x = new java.lang.Double[x.length];
			org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.y = new java.lang.Double[y.length];
			for (int i = 0; i < (x.length); ++i) {
				org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.x[i] = new java.lang.Double(x[i]);
				org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.y[i] = new java.lang.Double(y[i]);
			}
		}

		public org.jfree.data.DomainOrder getDomainOrder() {
			return org.jfree.data.DomainOrder.NONE;
		}

		public int getItemCount(int series) {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.x.length;
		}

		public java.lang.Number getX(int series, int item) {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.x[item];
		}

		public double getXValue(int series, int item) {
			double result = java.lang.Double.NaN;
			java.lang.Number x = getX(series, item);
			if (x != null) {
				result = x.doubleValue();
			}
			return result;
		}

		public java.lang.Number getY(int series, int item) {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.y[item];
		}

		public double getYValue(int series, int item) {
			double result = java.lang.Double.NaN;
			java.lang.Number y = getY(series, item);
			if (y != null) {
				result = y.doubleValue();
			}
			return result;
		}

		public int getSeriesCount() {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.delegateSet.getSeriesCount();
		}

		public java.lang.Comparable getSeriesKey(int series) {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.delegateSet.getSeriesKey(series);
		}

		public int indexOf(java.lang.Comparable seriesName) {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.delegateSet.indexOf(seriesName);
		}

		public void addChangeListener(org.jfree.data.event.DatasetChangeListener listener) {
		}

		public void removeChangeListener(org.jfree.data.event.DatasetChangeListener listener) {
		}

		public org.jfree.data.general.DatasetGroup getGroup() {
			return org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.this.delegateSet.getGroup();
		}

		public void setGroup(org.jfree.data.general.DatasetGroup group) {
		}
	}
}

