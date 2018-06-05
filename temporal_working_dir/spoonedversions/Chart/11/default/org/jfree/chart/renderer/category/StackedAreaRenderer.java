

package org.jfree.chart.renderer.category;


public class StackedAreaRenderer extends org.jfree.chart.renderer.category.AreaRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3595635038460823663L;

	private boolean renderAsPercentages;

	public StackedAreaRenderer() {
		this(false);
	}

	public StackedAreaRenderer(boolean renderAsPercentages) {
		super();
		org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages = renderAsPercentages;
	}

	public boolean getRenderAsPercentages() {
		return org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages;
	}

	public void setRenderAsPercentages(boolean asPercentages) {
		org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages = asPercentages;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.StackedAreaRenderer.this));
	}

	public int getPassCount() {
		return 2;
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages) {
			return new org.jfree.data.Range(0.0, 1.0);
		}else {
			return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, int pass) {
		java.awt.Shape entityArea = null;
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		double y1 = 0.0;
		java.lang.Number n = dataset.getValue(row, column);
		if (n != null) {
			y1 = n.doubleValue();
		}
		double[] stack1 = getStackValues(dataset, row, column);
		double xx1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double y0 = 0.0;
		n = dataset.getValue(row, java.lang.Math.max((column - 1), 0));
		if (n != null) {
			y0 = n.doubleValue();
		}
		double[] stack0 = getStackValues(dataset, row, java.lang.Math.max((column - 1), 0));
		double xx0 = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		int itemCount = dataset.getColumnCount();
		double y2 = 0.0;
		n = dataset.getValue(row, java.lang.Math.min((column + 1), (itemCount - 1)));
		if (n != null) {
			y2 = n.doubleValue();
		}
		double[] stack2 = getStackValues(dataset, row, java.lang.Math.min((column + 1), (itemCount - 1)));
		double xx2 = domainAxis.getCategoryEnd(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double xxLeft = xx0;
		double xxRight = xx2;
		double[] stackLeft = averageStackValues(stack0, stack1);
		double[] stackRight = averageStackValues(stack1, stack2);
		double[] adjStackLeft = adjustedStackValues(stack0, stack1);
		double[] adjStackRight = adjustedStackValues(stack1, stack2);
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
				left.moveTo(((float) (xx1)), transY1);
				left.lineTo(((float) (xx1)), transStack1);
				left.lineTo(((float) (xxLeft)), transStackLeft);
				left.lineTo(((float) (xxLeft)), transYLeft);
				left.closePath();
			}else {
				left.moveTo(((float) (xx1)), transStack1);
				left.lineTo(((float) (xx1)), transY1);
				left.lineTo(((float) (xxLeft)), transStackLeft);
				left.closePath();
			}
			float transStackRight = ((float) (rangeAxis.valueToJava2D(adjStackRight[1], dataArea, edge1)));
			if (y2 >= 0.0) {
				double yright = ((y1 + y2) / 2.0) + (stackRight[1]);
				float transYRight = ((float) (rangeAxis.valueToJava2D(yright, dataArea, edge1)));
				right.moveTo(((float) (xx1)), transStack1);
				right.lineTo(((float) (xx1)), transY1);
				right.lineTo(((float) (xxRight)), transYRight);
				right.lineTo(((float) (xxRight)), transStackRight);
				right.closePath();
			}else {
				right.moveTo(((float) (xx1)), transStack1);
				right.lineTo(((float) (xx1)), transY1);
				right.lineTo(((float) (xxRight)), transStackRight);
				right.closePath();
			}
		}else {
			transY1 = ((float) (rangeAxis.valueToJava2D((y1 + (stack1[0])), dataArea, edge1)));
			float transStack1 = ((float) (rangeAxis.valueToJava2D(stack1[0], dataArea, edge1)));
			float transStackLeft = ((float) (rangeAxis.valueToJava2D(adjStackLeft[0], dataArea, edge1)));
			if (y0 >= 0.0) {
				left.moveTo(((float) (xx1)), transStack1);
				left.lineTo(((float) (xx1)), transY1);
				left.lineTo(((float) (xxLeft)), transStackLeft);
				left.clone();
			}else {
				double yleft = ((y0 + y1) / 2.0) + (stackLeft[0]);
				float transYLeft = ((float) (rangeAxis.valueToJava2D(yleft, dataArea, edge1)));
				left.moveTo(((float) (xx1)), transY1);
				left.lineTo(((float) (xx1)), transStack1);
				left.lineTo(((float) (xxLeft)), transStackLeft);
				left.lineTo(((float) (xxLeft)), transYLeft);
				left.closePath();
			}
			float transStackRight = ((float) (rangeAxis.valueToJava2D(adjStackRight[0], dataArea, edge1)));
			if (y2 >= 0.0) {
				right.moveTo(((float) (xx1)), transStack1);
				right.lineTo(((float) (xx1)), transY1);
				right.lineTo(((float) (xxRight)), transStackRight);
				right.closePath();
			}else {
				double yright = ((y1 + y2) / 2.0) + (stackRight[0]);
				float transYRight = ((float) (rangeAxis.valueToJava2D(yright, dataArea, edge1)));
				right.moveTo(((float) (xx1)), transStack1);
				right.lineTo(((float) (xx1)), transY1);
				right.lineTo(((float) (xxRight)), transYRight);
				right.lineTo(((float) (xxRight)), transStackRight);
				right.closePath();
			}
		}
		g2.setPaint(getItemPaint(row, column));
		g2.setStroke(getItemStroke(row, column));
		java.awt.Paint itemPaint = getItemPaint(row, column);
		if (pass == 0) {
			g2.setPaint(itemPaint);
			g2.fill(left);
			g2.fill(right);
		}
		if (entities != null) {
			java.awt.geom.GeneralPath gp = new java.awt.geom.GeneralPath(left);
			gp.append(right, false);
			entityArea = gp;
			addItemEntity(entities, dataset, row, column, entityArea);
		}
	}

	protected double getPreviousHeight(org.jfree.data.category.CategoryDataset dataset, int series, int category) {
		double result = 0.0;
		java.lang.Number n;
		double total = 0.0;
		if (org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages) {
			total = org.jfree.data.DataUtilities.calculateColumnTotal(dataset, category);
		}
		for (int i = 0; i < series; i++) {
			n = dataset.getValue(i, category);
			if (n != null) {
				double v = n.doubleValue();
				if (org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages) {
					v = v / total;
				}
				result += v;
			}
		}
		return result;
	}

	protected double[] getStackValues(org.jfree.data.category.CategoryDataset dataset, int series, int index) {
		double[] result = new double[2];
		for (int i = 0; i < series; i++) {
			if (isSeriesVisible(i)) {
				double v = 0.0;
				java.lang.Number n = dataset.getValue(i, index);
				if (n != null) {
					v = n.doubleValue();
				}
				if (!(java.lang.Double.isNaN(v))) {
					if (v >= 0.0) {
						result[1] += v;
					}else {
						result[0] += v;
					}
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
		if (obj == (org.jfree.chart.renderer.category.StackedAreaRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StackedAreaRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.StackedAreaRenderer that = ((org.jfree.chart.renderer.category.StackedAreaRenderer) (obj));
		if ((org.jfree.chart.renderer.category.StackedAreaRenderer.this.renderAsPercentages) != (that.renderAsPercentages)) {
			return false;
		}
		return super.equals(obj);
	}
}

