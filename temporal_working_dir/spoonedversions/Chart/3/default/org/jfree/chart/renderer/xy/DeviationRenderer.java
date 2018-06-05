

package org.jfree.chart.renderer.xy;


public class DeviationRenderer extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer {
	public static class State extends org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State {
		public java.util.List upperCoordinates;

		public java.util.List lowerCoordinates;

		public State(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
			org.jfree.chart.renderer.xy.DeviationRenderer.State.this.lowerCoordinates = new java.util.ArrayList();
			org.jfree.chart.renderer.xy.DeviationRenderer.State.this.upperCoordinates = new java.util.ArrayList();
		}
	}

	private float alpha;

	public DeviationRenderer() {
		this(true, true);
	}

	public DeviationRenderer(boolean lines, boolean shapes) {
		super(lines, shapes);
		super.setDrawSeriesLineAsPath(true);
		org.jfree.chart.renderer.xy.DeviationRenderer.this.alpha = 0.5F;
	}

	public float getAlpha() {
		return org.jfree.chart.renderer.xy.DeviationRenderer.this.alpha;
	}

	public void setAlpha(float alpha) {
		if ((alpha < 0.0F) || (alpha > 1.0F)) {
			throw new java.lang.IllegalArgumentException("Requires 'alpha' in the range 0.0 to 1.0.");
		}
		org.jfree.chart.renderer.xy.DeviationRenderer.this.alpha = alpha;
		fireChangeEvent();
	}

	public void setDrawSeriesLineAsPath(boolean flag) {
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.DeviationRenderer.State state = new org.jfree.chart.renderer.xy.DeviationRenderer.State(info);
		state.seriesPath = new java.awt.geom.GeneralPath();
		state.setProcessVisibleItemsOnly(false);
		return state;
	}

	public int getPassCount() {
		return 3;
	}

	protected boolean isItemPass(int pass) {
		return pass == 2;
	}

	protected boolean isLinePass(int pass) {
		return pass == 1;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		if (pass == 0) {
			org.jfree.data.xy.IntervalXYDataset intervalDataset = ((org.jfree.data.xy.IntervalXYDataset) (dataset));
			org.jfree.chart.renderer.xy.DeviationRenderer.State drState = ((org.jfree.chart.renderer.xy.DeviationRenderer.State) (state));
			double x = intervalDataset.getXValue(series, item);
			double yLow = intervalDataset.getStartYValue(series, item);
			double yHigh = intervalDataset.getEndYValue(series, item);
			org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
			org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
			double xx = domainAxis.valueToJava2D(x, dataArea, xAxisLocation);
			double yyLow = rangeAxis.valueToJava2D(yLow, dataArea, yAxisLocation);
			double yyHigh = rangeAxis.valueToJava2D(yHigh, dataArea, yAxisLocation);
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				drState.lowerCoordinates.add(new double[]{ yyLow , xx });
				drState.upperCoordinates.add(new double[]{ yyHigh , xx });
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					drState.lowerCoordinates.add(new double[]{ xx , yyLow });
					drState.upperCoordinates.add(new double[]{ xx , yyHigh });
				}
			
			if (item == ((dataset.getItemCount(series)) - 1)) {
				java.awt.Composite originalComposite = g2.getComposite();
				g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, org.jfree.chart.renderer.xy.DeviationRenderer.this.alpha));
				g2.setPaint(getItemFillPaint(series, item, selected));
				java.awt.geom.GeneralPath area = new java.awt.geom.GeneralPath();
				double[] coords = ((double[]) (drState.lowerCoordinates.get(0)));
				area.moveTo(((float) (coords[0])), ((float) (coords[1])));
				for (int i = 1; i < (drState.lowerCoordinates.size()); i++) {
					coords = ((double[]) (drState.lowerCoordinates.get(i)));
					area.lineTo(((float) (coords[0])), ((float) (coords[1])));
				}
				int count = drState.upperCoordinates.size();
				coords = ((double[]) (drState.upperCoordinates.get((count - 1))));
				area.lineTo(((float) (coords[0])), ((float) (coords[1])));
				for (int i = count - 2; i >= 0; i--) {
					coords = ((double[]) (drState.upperCoordinates.get(i)));
					area.lineTo(((float) (coords[0])), ((float) (coords[1])));
				}
				area.closePath();
				g2.fill(area);
				g2.setComposite(originalComposite);
				drState.lowerCoordinates.clear();
				drState.upperCoordinates.clear();
			}
		}
		if (isLinePass(pass)) {
			if (item == 0) {
				org.jfree.chart.renderer.xy.DeviationRenderer.State s = ((org.jfree.chart.renderer.xy.DeviationRenderer.State) (state));
				s.seriesPath.reset();
				s.setLastPointGood(false);
			}
			if (getItemLineVisible(series, item)) {
				drawPrimaryLineAsPath(state, g2, plot, dataset, pass, series, item, selected, domainAxis, rangeAxis, dataArea);
			}
		}else
			if (isItemPass(pass)) {
				org.jfree.chart.entity.EntityCollection entities = null;
				if ((state.getInfo()) != null) {
					entities = state.getInfo().getOwner().getEntityCollection();
				}
				drawShape2(g2, dataArea, plot, dataset, pass, series, item, selected, domainAxis, rangeAxis, null, entities);
			}
		
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.DeviationRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.DeviationRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.DeviationRenderer that = ((org.jfree.chart.renderer.xy.DeviationRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.DeviationRenderer.this.alpha) != (that.alpha)) {
			return false;
		}
		return super.equals(obj);
	}
}

