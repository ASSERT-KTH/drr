

package org.jfree.chart.renderer.xy;


public class StackedXYAreaRenderer2 extends org.jfree.chart.renderer.xy.XYAreaRenderer2 implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 7752676509764539182L;

	private boolean roundXCoordinates;

	public StackedXYAreaRenderer2() {
		this(null, null);
	}

	public StackedXYAreaRenderer2(org.jfree.chart.labels.XYToolTipGenerator labelGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super(labelGenerator, urlGenerator);
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this.roundXCoordinates = true;
	}

	public boolean getRoundXCoordinates() {
		return org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this.roundXCoordinates;
	}

	public void setRoundXCoordinates(boolean round) {
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this.roundXCoordinates = round;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			return null;
		}
		double min = java.lang.Double.POSITIVE_INFINITY;
		double max = java.lang.Double.NEGATIVE_INFINITY;
		org.jfree.data.xy.TableXYDataset d = ((org.jfree.data.xy.TableXYDataset) (dataset));
		int itemCount = d.getItemCount();
		for (int i = 0; i < itemCount; i++) {
			double[] stackValues = getStackValues(((org.jfree.data.xy.TableXYDataset) (dataset)), d.getSeriesCount(), i);
			min = java.lang.Math.min(min, stackValues[0]);
			max = java.lang.Math.max(max, stackValues[1]);
		}
		if (min == (java.lang.Double.POSITIVE_INFINITY)) {
			return null;
		}
		return new org.jfree.data.Range(min, max);
	}

	public int getPassCount() {
		return 1;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		java.awt.Shape entityArea = null;
		org.jfree.chart.entity.EntityCollection entities = null;
		if ((state.getInfo()) != null) {
			entities = state.getInfo().getOwner().getEntityCollection();
		}
		org.jfree.data.xy.TableXYDataset tdataset = ((org.jfree.data.xy.TableXYDataset) (dataset));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if (java.lang.Double.isNaN(y1)) {
			y1 = 0.0;
		}
		double[] stack1 = getStackValues(tdataset, series, item);
		double x0 = dataset.getXValue(series, java.lang.Math.max((item - 1), 0));
		double y0 = dataset.getYValue(series, java.lang.Math.max((item - 1), 0));
		if (java.lang.Double.isNaN(y0)) {
			y0 = 0.0;
		}
		double[] stack0 = getStackValues(tdataset, series, java.lang.Math.max((item - 1), 0));
		int itemCount = dataset.getItemCount(series);
		double x2 = dataset.getXValue(series, java.lang.Math.min((item + 1), (itemCount - 1)));
		double y2 = dataset.getYValue(series, java.lang.Math.min((item + 1), (itemCount - 1)));
		if (java.lang.Double.isNaN(y2)) {
			y2 = 0.0;
		}
		double[] stack2 = getStackValues(tdataset, series, java.lang.Math.min((item + 1), (itemCount - 1)));
		double xleft = (x0 + x1) / 2.0;
		double xright = (x1 + x2) / 2.0;
		double[] stackLeft = averageStackValues(stack0, stack1);
		double[] stackRight = averageStackValues(stack1, stack2);
		double[] adjStackLeft = adjustedStackValues(stack0, stack1);
		double[] adjStackRight = adjustedStackValues(stack1, stack2);
		org.jfree.chart.util.RectangleEdge edge0 = plot.getDomainAxisEdge();
		float transX1 = ((float) (domainAxis.valueToJava2D(x1, dataArea, edge0)));
		float transXLeft = ((float) (domainAxis.valueToJava2D(xleft, dataArea, edge0)));
		float transXRight = ((float) (domainAxis.valueToJava2D(xright, dataArea, edge0)));
		if (org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this.roundXCoordinates) {
			transX1 = java.lang.Math.round(transX1);
			transXLeft = java.lang.Math.round(transXLeft);
			transXRight = java.lang.Math.round(transXRight);
		}
		float transY1;
		org.jfree.chart.util.RectangleEdge edge1 = plot.getRangeAxisEdge();
		java.awt.geom.GeneralPath left = new java.awt.geom.GeneralPath();
		java.awt.geom.GeneralPath right = new java.awt.geom.GeneralPath();
		if (y1 >= 0.0) {
			transY1 = ((float) (rangeAxis.valueToJava2D((y1 + (stack1[1])), dataArea, edge1)));
			float transStack1 = ((float) (rangeAxis.valueToJava2D(stack1[1], dataArea, edge1)));
			float transStackLeft = ((float) (rangeAxis.valueToJava2D(adjStackLeft[1], dataArea, edge1)));
			if (y0 >= 0.0) {
				double yleft = ((y0 + y1) / 2.0) + (stackLeft[1]);
				float transYLeft = ((float) (rangeAxis.valueToJava2D(yleft, dataArea, edge1)));
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					left.moveTo(transX1, transY1);
					left.lineTo(transX1, transStack1);
					left.lineTo(transXLeft, transStackLeft);
					left.lineTo(transXLeft, transYLeft);
				}else {
					left.moveTo(transY1, transX1);
					left.lineTo(transStack1, transX1);
					left.lineTo(transStackLeft, transXLeft);
					left.lineTo(transYLeft, transXLeft);
				}
				left.closePath();
			}else {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					left.moveTo(transX1, transStack1);
					left.lineTo(transX1, transY1);
					left.lineTo(transXLeft, transStackLeft);
				}else {
					left.moveTo(transStack1, transX1);
					left.lineTo(transY1, transX1);
					left.lineTo(transStackLeft, transXLeft);
				}
				left.closePath();
			}
			float transStackRight = ((float) (rangeAxis.valueToJava2D(adjStackRight[1], dataArea, edge1)));
			if (y2 >= 0.0) {
				double yright = ((y1 + y2) / 2.0) + (stackRight[1]);
				float transYRight = ((float) (rangeAxis.valueToJava2D(yright, dataArea, edge1)));
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					right.moveTo(transX1, transStack1);
					right.lineTo(transX1, transY1);
					right.lineTo(transXRight, transYRight);
					right.lineTo(transXRight, transStackRight);
				}else {
					right.moveTo(transStack1, transX1);
					right.lineTo(transY1, transX1);
					right.lineTo(transYRight, transXRight);
					right.lineTo(transStackRight, transXRight);
				}
				right.closePath();
			}else {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					right.moveTo(transX1, transStack1);
					right.lineTo(transX1, transY1);
					right.lineTo(transXRight, transStackRight);
				}else {
					right.moveTo(transStack1, transX1);
					right.lineTo(transY1, transX1);
					right.lineTo(transStackRight, transXRight);
				}
				right.closePath();
			}
		}else {
			transY1 = ((float) (rangeAxis.valueToJava2D((y1 + (stack1[0])), dataArea, edge1)));
			float transStack1 = ((float) (rangeAxis.valueToJava2D(stack1[0], dataArea, edge1)));
			float transStackLeft = ((float) (rangeAxis.valueToJava2D(adjStackLeft[0], dataArea, edge1)));
			if (y0 >= 0.0) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					left.moveTo(transX1, transStack1);
					left.lineTo(transX1, transY1);
					left.lineTo(transXLeft, transStackLeft);
				}else {
					left.moveTo(transStack1, transX1);
					left.lineTo(transY1, transX1);
					left.lineTo(transStackLeft, transXLeft);
				}
				left.clone();
			}else {
				double yleft = ((y0 + y1) / 2.0) + (stackLeft[0]);
				float transYLeft = ((float) (rangeAxis.valueToJava2D(yleft, dataArea, edge1)));
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					left.moveTo(transX1, transY1);
					left.lineTo(transX1, transStack1);
					left.lineTo(transXLeft, transStackLeft);
					left.lineTo(transXLeft, transYLeft);
				}else {
					left.moveTo(transY1, transX1);
					left.lineTo(transStack1, transX1);
					left.lineTo(transStackLeft, transXLeft);
					left.lineTo(transYLeft, transXLeft);
				}
				left.closePath();
			}
			float transStackRight = ((float) (rangeAxis.valueToJava2D(adjStackRight[0], dataArea, edge1)));
			if (y2 >= 0.0) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					right.moveTo(transX1, transStack1);
					right.lineTo(transX1, transY1);
					right.lineTo(transXRight, transStackRight);
				}else {
					right.moveTo(transStack1, transX1);
					right.lineTo(transY1, transX1);
					right.lineTo(transStackRight, transXRight);
				}
				right.closePath();
			}else {
				double yright = ((y1 + y2) / 2.0) + (stackRight[0]);
				float transYRight = ((float) (rangeAxis.valueToJava2D(yright, dataArea, edge1)));
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					right.moveTo(transX1, transStack1);
					right.lineTo(transX1, transY1);
					right.lineTo(transXRight, transYRight);
					right.lineTo(transXRight, transStackRight);
				}else {
					right.moveTo(transStack1, transX1);
					right.lineTo(transY1, transX1);
					right.lineTo(transYRight, transXRight);
					right.lineTo(transStackRight, transXRight);
				}
				right.closePath();
			}
		}
		java.awt.Paint itemPaint = getItemPaint(series, item, selected);
		if (pass == 0) {
			g2.setPaint(itemPaint);
			g2.fill(left);
			g2.fill(right);
		}
		if (entities != null) {
			java.awt.geom.GeneralPath gp = new java.awt.geom.GeneralPath(left);
			gp.append(right, false);
			entityArea = gp;
			addEntity(entities, entityArea, dataset, series, item, selected, transX1, transY1);
		}
	}

	private double[] getStackValues(org.jfree.data.xy.TableXYDataset dataset, int series, int index) {
		double[] result = new double[2];
		for (int i = 0; i < series; i++) {
			double v = dataset.getYValue(i, index);
			if (!(java.lang.Double.isNaN(v))) {
				if (v >= 0.0) {
					result[1] += v;
				}else {
					result[0] += v;
				}
			}
		}
		return result;
	}

	private double[] averageStackValues(double[] stack1, double[] stack2) {
		double[] result = new double[2];
		result[0] = ((stack1[0]) + (stack2[0])) / 2.0;
		result[1] = ((stack1[1]) + (stack2[1])) / 2.0;
		return result;
	}

	private double[] adjustedStackValues(double[] stack1, double[] stack2) {
		double[] result = new double[2];
		if (((stack1[0]) == 0.0) || ((stack2[0]) == 0.0)) {
			result[0] = 0.0;
		}else {
			result[0] = ((stack1[0]) + (stack2[0])) / 2.0;
		}
		if (((stack1[1]) == 0.0) || ((stack2[1]) == 0.0)) {
			result[1] = 0.0;
		}else {
			result[1] = ((stack1[1]) + (stack2[1])) / 2.0;
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.StackedXYAreaRenderer2)) {
			return false;
		}
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer2 that = ((org.jfree.chart.renderer.xy.StackedXYAreaRenderer2) (obj));
		if ((org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.this.roundXCoordinates) != (that.roundXCoordinates)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

