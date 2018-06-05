

package org.jfree.chart.renderer.xy;


public class XYSplineAndShapeRenderer extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer {
	private java.util.Vector points;

	private int precision;

	public XYSplineAndShapeRenderer() {
		this(5);
	}

	public XYSplineAndShapeRenderer(int precision) {
		super();
		if (precision <= 0) {
			throw new java.lang.IllegalArgumentException("Requires precision > 0.");
		}
		org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision = precision;
	}

	public int getPrecision() {
		return org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision;
	}

	public void setPrecision(int p) {
		if (p <= 0) {
			throw new java.lang.IllegalArgumentException("Requires p > 0.");
		}
		org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision = p;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this));
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State state = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State) (super.initialise(g2, dataArea, plot, data, info)));
		state.setProcessVisibleItemsOnly(false);
		org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points = new java.util.Vector();
		setDrawSeriesLineAsPath(true);
		return state;
	}

	protected void drawPrimaryLineAsPath(org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, int pass, int series, int item, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, java.awt.geom.Rectangle2D dataArea) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		if ((!(java.lang.Double.isNaN(transX1))) && (!(java.lang.Double.isNaN(transY1)))) {
			org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.add(new org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint(((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL) ? ((float) (transY1)) : ((float) (transX1))), ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL) ? ((float) (transX1)) : ((float) (transY1)))));
		}
		if (item == ((dataset.getItemCount(series)) - 1)) {
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State s = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State) (state));
			if ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.size()) > 1) {
				org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint cp0 = ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint) (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.get(0)));
				s.seriesPath.moveTo(cp0.x, cp0.y);
				if ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.size()) == 2) {
					org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint cp1 = ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint) (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.get(1)));
					s.seriesPath.lineTo(cp1.x, cp1.y);
				}else {
					int np = org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.size();
					float[] d = new float[np];
					float[] x = new float[np];
					float y;
					float t;
					float oldy = 0;
					float oldt = 0;
					float[] a = new float[np];
					float t1;
					float t2;
					float[] h = new float[np];
					for (int i = 0; i < np; i++) {
						org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint cpi = ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint) (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points.get(i)));
						x[i] = cpi.x;
						d[i] = cpi.y;
					}
					for (int i = 1; i <= (np - 1); i++) {
						h[i] = (x[i]) - (x[(i - 1)]);
					}
					float[] sub = new float[np - 1];
					float[] diag = new float[np - 1];
					float[] sup = new float[np - 1];
					for (int i = 1; i <= (np - 2); i++) {
						diag[i] = ((h[i]) + (h[(i + 1)])) / 3;
						sup[i] = (h[(i + 1)]) / 6;
						sub[i] = (h[i]) / 6;
						a[i] = (((d[(i + 1)]) - (d[i])) / (h[(i + 1)])) - (((d[i]) - (d[(i - 1)])) / (h[i]));
					}
					solveTridiag(sub, diag, sup, a, (np - 2));
					oldt = x[0];
					oldy = d[0];
					s.seriesPath.moveTo(oldt, oldy);
					for (int i = 1; i <= (np - 1); i++) {
						for (int j = 1; j <= (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision); j++) {
							t1 = ((h[i]) * j) / (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision);
							t2 = (h[i]) - t1;
							y = (((((((-(a[(i - 1)])) / 6) * (t2 + (h[i]))) * t1) + (d[(i - 1)])) * t2) + ((((((-(a[i])) / 6) * (t1 + (h[i]))) * t2) + (d[i])) * t1)) / (h[i]);
							t = (x[(i - 1)]) + t1;
							s.seriesPath.lineTo(t, y);
							oldt = t;
							oldy = y;
						}
					}
				}
				drawFirstPassShape(g2, pass, series, item, s.seriesPath);
			}
			org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.points = new java.util.Vector();
		}
	}

	private void solveTridiag(float[] sub, float[] diag, float[] sup, float[] b, int n) {
		int i;
		for (i = 2; i <= n; i++) {
			sub[i] = (sub[i]) / (diag[(i - 1)]);
			diag[i] = (diag[i]) - ((sub[i]) * (sup[(i - 1)]));
			b[i] = (b[i]) - ((sub[i]) * (b[(i - 1)]));
		}
		b[n] = (b[n]) / (diag[n]);
		for (i = n - 1; i >= 1; i--) {
			b[i] = ((b[i]) - ((sup[i]) * (b[(i + 1)]))) / (diag[i]);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer that = ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.this.precision) != (that.precision)) {
			return false;
		}
		return super.equals(obj);
	}

	class ControlPoint {
		public float x;

		public float y;

		public ControlPoint(float x, float y) {
			org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint.this.x = x;
			org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer.ControlPoint.this.y = y;
		}
	}
}

