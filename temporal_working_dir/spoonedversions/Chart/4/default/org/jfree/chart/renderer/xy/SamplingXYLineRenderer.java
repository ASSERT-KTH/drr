

package org.jfree.chart.renderer.xy;


public class SamplingXYLineRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private transient java.awt.Shape legendLine;

	public SamplingXYLineRenderer() {
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine = new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0);
		setBaseLegendShape(org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine);
		setTreatLegendShapeAsLine(true);
	}

	public int getPassCount() {
		return 1;
	}

	public static class State extends org.jfree.chart.renderer.xy.XYItemRendererState {
		java.awt.geom.GeneralPath seriesPath;

		java.awt.geom.GeneralPath intervalPath;

		double dX = 1.0;

		double lastX;

		double openY = 0.0;

		double highY = 0.0;

		double lowY = 0.0;

		double closeY = 0.0;

		boolean lastPointGood;

		public State(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
		}

		public void startSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
			org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State.this.seriesPath.reset();
			org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State.this.intervalPath.reset();
			org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State.this.lastPointGood = false;
			super.startSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
		}
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		double dpi = 72;
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State state = new org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State(info);
		state.seriesPath = new java.awt.geom.GeneralPath();
		state.intervalPath = new java.awt.geom.GeneralPath();
		state.dX = 72.0 / dpi;
		return state;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State s = ((org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State) (state));
		if ((!(java.lang.Double.isNaN(transX1))) && (!(java.lang.Double.isNaN(transY1)))) {
			float x = ((float) (transX1));
			float y = ((float) (transY1));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				x = ((float) (transY1));
				y = ((float) (transX1));
			}
			if (s.lastPointGood) {
				if ((java.lang.Math.abs((x - (s.lastX)))) > (s.dX)) {
					s.seriesPath.lineTo(x, y);
					if ((s.lowY) < (s.highY)) {
						s.intervalPath.moveTo(((float) (s.lastX)), ((float) (s.lowY)));
						s.intervalPath.lineTo(((float) (s.lastX)), ((float) (s.highY)));
					}
					s.lastX = x;
					s.openY = y;
					s.highY = y;
					s.lowY = y;
					s.closeY = y;
				}else {
					s.highY = java.lang.Math.max(s.highY, y);
					s.lowY = java.lang.Math.min(s.lowY, y);
					s.closeY = y;
				}
			}else {
				s.seriesPath.moveTo(x, y);
				s.lastX = x;
				s.openY = y;
				s.highY = y;
				s.lowY = y;
				s.closeY = y;
			}
			s.lastPointGood = true;
		}else {
			s.lastPointGood = false;
		}
		if (item == (s.getLastItemIndex())) {
			java.awt.geom.PathIterator pi = s.seriesPath.getPathIterator(null);
			int count = 0;
			while (!(pi.isDone())) {
				count++;
				pi.next();
			} 
			g2.setStroke(getItemStroke(series, item, selected));
			g2.setPaint(getItemPaint(series, item, selected));
			g2.draw(s.seriesPath);
			g2.draw(s.intervalPath);
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer clone = ((org.jfree.chart.renderer.xy.SamplingXYLineRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine) != null) {
			clone.legendLine = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine);
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.SamplingXYLineRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer that = ((org.jfree.chart.renderer.xy.SamplingXYLineRenderer) (obj));
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine, that.legendLine))) {
			return false;
		}
		return true;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.SamplingXYLineRenderer.this.legendLine, stream);
	}
}

