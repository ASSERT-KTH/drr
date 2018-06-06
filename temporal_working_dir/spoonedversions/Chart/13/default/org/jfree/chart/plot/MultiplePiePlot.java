

package org.jfree.chart.plot;


public class MultiplePiePlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -355377800470807389L;

	private org.jfree.chart.JFreeChart pieChart;

	private org.jfree.data.category.CategoryDataset dataset;

	private org.jfree.chart.util.TableOrder dataExtractOrder;

	private double limit = 0.0;

	private java.lang.Comparable aggregatedItemsKey;

	private transient java.awt.Paint aggregatedItemsPaint;

	private transient java.util.Map sectionPaints;

	public MultiplePiePlot() {
		this(null);
	}

	public MultiplePiePlot(org.jfree.data.category.CategoryDataset dataset) {
		super();
		org.jfree.chart.plot.MultiplePiePlot.this.dataset = dataset;
		org.jfree.chart.plot.PiePlot piePlot = new org.jfree.chart.plot.PiePlot(null);
		org.jfree.chart.plot.MultiplePiePlot.this.pieChart = new org.jfree.chart.JFreeChart(piePlot);
		org.jfree.chart.plot.MultiplePiePlot.this.pieChart.removeLegend();
		org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder = org.jfree.chart.util.TableOrder.BY_COLUMN;
		org.jfree.chart.plot.MultiplePiePlot.this.pieChart.setBackgroundPaint(null);
		org.jfree.chart.title.TextTitle seriesTitle = new org.jfree.chart.title.TextTitle("Series Title", new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12));
		seriesTitle.setPosition(org.jfree.chart.util.RectangleEdge.BOTTOM);
		org.jfree.chart.plot.MultiplePiePlot.this.pieChart.setTitle(seriesTitle);
		org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey = "Other";
		org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint = java.awt.Color.lightGray;
		org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints = new java.util.HashMap();
	}

	public org.jfree.data.category.CategoryDataset getDataset() {
		return org.jfree.chart.plot.MultiplePiePlot.this.dataset;
	}

	public void setDataset(org.jfree.data.category.CategoryDataset dataset) {
		if ((org.jfree.chart.plot.MultiplePiePlot.this.dataset) != null) {
			org.jfree.chart.plot.MultiplePiePlot.this.dataset.removeChangeListener(org.jfree.chart.plot.MultiplePiePlot.this);
		}
		org.jfree.chart.plot.MultiplePiePlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.MultiplePiePlot.this);
		}
		datasetChanged(new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.MultiplePiePlot.this, dataset));
	}

	public org.jfree.chart.JFreeChart getPieChart() {
		return org.jfree.chart.plot.MultiplePiePlot.this.pieChart;
	}

	public void setPieChart(org.jfree.chart.JFreeChart pieChart) {
		if (pieChart == null) {
			throw new java.lang.IllegalArgumentException("Null 'pieChart' argument.");
		}
		if (!((pieChart.getPlot()) instanceof org.jfree.chart.plot.PiePlot)) {
			throw new java.lang.IllegalArgumentException(("The 'pieChart' argument must " + "be a chart based on a PiePlot."));
		}
		org.jfree.chart.plot.MultiplePiePlot.this.pieChart = pieChart;
		fireChangeEvent();
	}

	public org.jfree.chart.util.TableOrder getDataExtractOrder() {
		return org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder;
	}

	public void setDataExtractOrder(org.jfree.chart.util.TableOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument");
		}
		org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder = order;
		fireChangeEvent();
	}

	public double getLimit() {
		return org.jfree.chart.plot.MultiplePiePlot.this.limit;
	}

	public void setLimit(double limit) {
		org.jfree.chart.plot.MultiplePiePlot.this.limit = limit;
		fireChangeEvent();
	}

	public java.lang.Comparable getAggregatedItemsKey() {
		return org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey;
	}

	public void setAggregatedItemsKey(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey = key;
		fireChangeEvent();
	}

	public java.awt.Paint getAggregatedItemsPaint() {
		return org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint;
	}

	public void setAggregatedItemsPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint = paint;
		fireChangeEvent();
	}

	public java.lang.String getPlotType() {
		return "Multiple Pie Plot";
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		drawBackground(g2, area);
		drawOutline(g2, area);
		if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.chart.plot.MultiplePiePlot.this.dataset)) {
			drawNoDataMessage(g2, area);
			return ;
		}
		int pieCount = 0;
		if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			pieCount = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getRowCount();
		}else {
			pieCount = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getColumnCount();
		}
		int displayCols = ((int) (java.lang.Math.ceil(java.lang.Math.sqrt(pieCount))));
		int displayRows = ((int) (java.lang.Math.ceil((((double) (pieCount)) / ((double) (displayCols))))));
		if ((displayCols > displayRows) && ((area.getWidth()) < (area.getHeight()))) {
			int temp = displayCols;
			displayCols = displayRows;
			displayRows = temp;
		}
		prefetchSectionPaints();
		int x = ((int) (area.getX()));
		int y = ((int) (area.getY()));
		int width = ((int) (area.getWidth())) / displayCols;
		int height = ((int) (area.getHeight())) / displayRows;
		int row = 0;
		int column = 0;
		int diff = (displayRows * displayCols) - pieCount;
		int xoffset = 0;
		java.awt.Rectangle rect = new java.awt.Rectangle();
		for (int pieIndex = 0; pieIndex < pieCount; pieIndex++) {
			rect.setBounds(((x + xoffset) + (width * column)), (y + (height * row)), width, height);
			java.lang.String title = null;
			if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				title = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getRowKey(pieIndex).toString();
			}else {
				title = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getColumnKey(pieIndex).toString();
			}
			org.jfree.chart.plot.MultiplePiePlot.this.pieChart.setTitle(title);
			org.jfree.data.general.PieDataset piedataset = null;
			org.jfree.data.general.PieDataset dd = new org.jfree.data.category.CategoryToPieDataset(org.jfree.chart.plot.MultiplePiePlot.this.dataset, org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder, pieIndex);
			if ((org.jfree.chart.plot.MultiplePiePlot.this.limit) > 0.0) {
				piedataset = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(dd, org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey, org.jfree.chart.plot.MultiplePiePlot.this.limit);
			}else {
				piedataset = dd;
			}
			org.jfree.chart.plot.PiePlot piePlot = ((org.jfree.chart.plot.PiePlot) (org.jfree.chart.plot.MultiplePiePlot.this.pieChart.getPlot()));
			piePlot.setDataset(piedataset);
			piePlot.setPieIndex(pieIndex);
			for (int i = 0; i < (piedataset.getItemCount()); i++) {
				java.lang.Comparable key = piedataset.getKey(i);
				java.awt.Paint p;
				if (key.equals(org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey)) {
					p = org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint;
				}else {
					p = ((java.awt.Paint) (org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.get(key)));
				}
				piePlot.setSectionPaint(key, p);
			}
			org.jfree.chart.ChartRenderingInfo subinfo = null;
			if (info != null) {
				subinfo = new org.jfree.chart.ChartRenderingInfo();
			}
			org.jfree.chart.plot.MultiplePiePlot.this.pieChart.draw(g2, rect, subinfo);
			if (info != null) {
				info.getOwner().getEntityCollection().addAll(subinfo.getEntityCollection());
				info.addSubplotInfo(subinfo.getPlotInfo());
			}
			++column;
			if (column == displayCols) {
				column = 0;
				++row;
				if ((row == (displayRows - 1)) && (diff != 0)) {
					xoffset = (diff * width) / 2;
				}
			}
		}
	}

	private void prefetchSectionPaints() {
		org.jfree.chart.plot.PiePlot piePlot = ((org.jfree.chart.plot.PiePlot) (getPieChart().getPlot()));
		if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			for (int c = 0; c < (org.jfree.chart.plot.MultiplePiePlot.this.dataset.getColumnCount()); c++) {
				java.lang.Comparable key = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getColumnKey(c);
				java.awt.Paint p = piePlot.getSectionPaint(key);
				if (p == null) {
					p = ((java.awt.Paint) (org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.get(key)));
					if (p == null) {
						p = getDrawingSupplier().getNextPaint();
					}
				}
				org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.put(key, p);
			}
		}else {
			for (int r = 0; r < (org.jfree.chart.plot.MultiplePiePlot.this.dataset.getRowCount()); r++) {
				java.lang.Comparable key = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getRowKey(r);
				java.awt.Paint p = piePlot.getSectionPaint(key);
				if (p == null) {
					p = ((java.awt.Paint) (org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.get(key)));
					if (p == null) {
						p = getDrawingSupplier().getNextPaint();
					}
				}
				org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.put(key, p);
			}
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		if ((org.jfree.chart.plot.MultiplePiePlot.this.dataset) != null) {
			java.util.List keys = null;
			prefetchSectionPaints();
			if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				keys = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getColumnKeys();
			}else
				if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
					keys = org.jfree.chart.plot.MultiplePiePlot.this.dataset.getRowKeys();
				}
			
			if (keys != null) {
				int section = 0;
				java.util.Iterator iterator = keys.iterator();
				while (iterator.hasNext()) {
					java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
					java.lang.String label = key.toString();
					java.lang.String description = label;
					java.awt.Paint paint = ((java.awt.Paint) (org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints.get(key)));
					org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(label, description, null, null, org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE, paint, org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE, paint);
					item.setDataset(getDataset());
					result.add(item);
					section++;
				} 
			}
			if ((org.jfree.chart.plot.MultiplePiePlot.this.limit) > 0.0) {
				result.add(new org.jfree.chart.LegendItem(org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey.toString(), org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey.toString(), null, null, org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE, org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint, org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE, org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint));
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.MultiplePiePlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.MultiplePiePlot)) {
			return false;
		}
		org.jfree.chart.plot.MultiplePiePlot that = ((org.jfree.chart.plot.MultiplePiePlot) (obj));
		if ((org.jfree.chart.plot.MultiplePiePlot.this.dataExtractOrder) != (that.dataExtractOrder)) {
			return false;
		}
		if ((org.jfree.chart.plot.MultiplePiePlot.this.limit) != (that.limit)) {
			return false;
		}
		if (!(org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsKey.equals(that.aggregatedItemsKey))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint, that.aggregatedItemsPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MultiplePiePlot.this.pieChart, that.pieChart))) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.MultiplePiePlot.this.aggregatedItemsPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MultiplePiePlot.this.sectionPaints = new java.util.HashMap();
	}
}

