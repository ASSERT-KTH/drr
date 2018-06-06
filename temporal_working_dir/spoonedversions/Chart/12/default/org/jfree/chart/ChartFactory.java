

package org.jfree.chart;


public abstract class ChartFactory {
	public static org.jfree.chart.JFreeChart createPieChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, java.util.Locale locale) {
		org.jfree.chart.plot.PiePlot plot = new org.jfree.chart.plot.PiePlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator(locale));
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator(locale));
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createPieChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.plot.PiePlot plot = new org.jfree.chart.plot.PiePlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator());
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator());
		}
		if (urls) {
			plot.setURLGenerator(new org.jfree.chart.urls.StandardPieURLGenerator());
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createPieChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, org.jfree.data.general.PieDataset previousDataset, int percentDiffForMaxScale, boolean greenForIncrease, boolean legend, boolean tooltips, java.util.Locale locale, boolean subTitle, boolean showDifference) {
		org.jfree.chart.plot.PiePlot plot = new org.jfree.chart.plot.PiePlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator(locale));
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator(locale));
		}
		java.util.List keys = dataset.getKeys();
		org.jfree.data.general.DefaultPieDataset series = null;
		if (showDifference) {
			series = new org.jfree.data.general.DefaultPieDataset();
		}
		double colorPerPercent = 255.0 / percentDiffForMaxScale;
		for (java.util.Iterator it = keys.iterator(); it.hasNext();) {
			java.lang.Comparable key = ((java.lang.Comparable) (it.next()));
			java.lang.Number newValue = dataset.getValue(key);
			java.lang.Number oldValue = previousDataset.getValue(key);
			if (oldValue == null) {
				if (greenForIncrease) {
					plot.setSectionPaint(key, java.awt.Color.green);
				}else {
					plot.setSectionPaint(key, java.awt.Color.red);
				}
				if (showDifference) {
					series.setValue((key + " (+100%)"), newValue);
				}
			}else {
				double percentChange = (((newValue.doubleValue()) / (oldValue.doubleValue())) - 1.0) * 100.0;
				double shade = (java.lang.Math.abs(percentChange)) >= percentDiffForMaxScale ? 255 : (java.lang.Math.abs(percentChange)) * colorPerPercent;
				if ((greenForIncrease && ((newValue.doubleValue()) > (oldValue.doubleValue()))) || ((!greenForIncrease) && ((newValue.doubleValue()) < (oldValue.doubleValue())))) {
					plot.setSectionPaint(key, new java.awt.Color(0, ((int) (shade)), 0));
				}else {
					plot.setSectionPaint(key, new java.awt.Color(((int) (shade)), 0, 0));
				}
				if (showDifference) {
					series.setValue(((((key + " (") + (percentChange >= 0 ? "+" : "")) + (java.text.NumberFormat.getPercentInstance().format((percentChange / 100.0)))) + ")"), newValue);
				}
			}
		}
		if (showDifference) {
			plot.setDataset(series);
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		if (subTitle) {
			org.jfree.chart.title.TextTitle subtitle = null;
			subtitle = new org.jfree.chart.title.TextTitle((((((((("Bright " + (greenForIncrease ? "red" : "green")) + "=change >=-") + percentDiffForMaxScale) + "%, Bright ") + (!greenForIncrease ? "red" : "green")) + "=change >=+") + percentDiffForMaxScale) + "%"), new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10));
			chart.addSubtitle(subtitle);
		}
		return chart;
	}

	public static org.jfree.chart.JFreeChart createPieChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, org.jfree.data.general.PieDataset previousDataset, int percentDiffForMaxScale, boolean greenForIncrease, boolean legend, boolean tooltips, boolean urls, boolean subTitle, boolean showDifference) {
		org.jfree.chart.plot.PiePlot plot = new org.jfree.chart.plot.PiePlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator());
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator());
		}
		if (urls) {
			plot.setURLGenerator(new org.jfree.chart.urls.StandardPieURLGenerator());
		}
		java.util.List keys = dataset.getKeys();
		org.jfree.data.general.DefaultPieDataset series = null;
		if (showDifference) {
			series = new org.jfree.data.general.DefaultPieDataset();
		}
		double colorPerPercent = 255.0 / percentDiffForMaxScale;
		for (java.util.Iterator it = keys.iterator(); it.hasNext();) {
			java.lang.Comparable key = ((java.lang.Comparable) (it.next()));
			java.lang.Number newValue = dataset.getValue(key);
			java.lang.Number oldValue = previousDataset.getValue(key);
			if (oldValue == null) {
				if (greenForIncrease) {
					plot.setSectionPaint(key, java.awt.Color.green);
				}else {
					plot.setSectionPaint(key, java.awt.Color.red);
				}
				if (showDifference) {
					series.setValue((key + " (+100%)"), newValue);
				}
			}else {
				double percentChange = (((newValue.doubleValue()) / (oldValue.doubleValue())) - 1.0) * 100.0;
				double shade = (java.lang.Math.abs(percentChange)) >= percentDiffForMaxScale ? 255 : (java.lang.Math.abs(percentChange)) * colorPerPercent;
				if ((greenForIncrease && ((newValue.doubleValue()) > (oldValue.doubleValue()))) || ((!greenForIncrease) && ((newValue.doubleValue()) < (oldValue.doubleValue())))) {
					plot.setSectionPaint(key, new java.awt.Color(0, ((int) (shade)), 0));
				}else {
					plot.setSectionPaint(key, new java.awt.Color(((int) (shade)), 0, 0));
				}
				if (showDifference) {
					series.setValue(((((key + " (") + (percentChange >= 0 ? "+" : "")) + (java.text.NumberFormat.getPercentInstance().format((percentChange / 100.0)))) + ")"), newValue);
				}
			}
		}
		if (showDifference) {
			plot.setDataset(series);
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		if (subTitle) {
			org.jfree.chart.title.TextTitle subtitle = null;
			subtitle = new org.jfree.chart.title.TextTitle((((((((("Bright " + (greenForIncrease ? "red" : "green")) + "=change >=-") + percentDiffForMaxScale) + "%, Bright ") + (!greenForIncrease ? "red" : "green")) + "=change >=+") + percentDiffForMaxScale) + "%"), new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10));
			chart.addSubtitle(subtitle);
		}
		return chart;
	}

	public static org.jfree.chart.JFreeChart createRingChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, java.util.Locale locale) {
		org.jfree.chart.plot.RingPlot plot = new org.jfree.chart.plot.RingPlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator(locale));
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator(locale));
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createRingChart(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.plot.RingPlot plot = new org.jfree.chart.plot.RingPlot(dataset);
		plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator());
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator());
		}
		if (urls) {
			plot.setURLGenerator(new org.jfree.chart.urls.StandardPieURLGenerator());
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createMultiplePieChart(java.lang.String title, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.util.TableOrder order, boolean legend, boolean tooltips, boolean urls) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.MultiplePiePlot plot = new org.jfree.chart.plot.MultiplePiePlot(dataset);
		plot.setDataExtractOrder(order);
		plot.setBackgroundPaint(null);
		plot.setOutlineStroke(null);
		if (tooltips) {
			org.jfree.chart.labels.PieToolTipGenerator tooltipGenerator = new org.jfree.chart.labels.StandardPieToolTipGenerator();
			org.jfree.chart.plot.PiePlot pp = ((org.jfree.chart.plot.PiePlot) (plot.getPieChart().getPlot()));
			pp.setToolTipGenerator(tooltipGenerator);
		}
		if (urls) {
			org.jfree.chart.urls.PieURLGenerator urlGenerator = new org.jfree.chart.urls.StandardPieURLGenerator();
			org.jfree.chart.plot.PiePlot pp = ((org.jfree.chart.plot.PiePlot) (plot.getPieChart().getPlot()));
			pp.setURLGenerator(urlGenerator);
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createPieChart3D(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, java.util.Locale locale) {
		org.jfree.chart.plot.PiePlot3D plot = new org.jfree.chart.plot.PiePlot3D(dataset);
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator(locale));
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createPieChart3D(java.lang.String title, org.jfree.data.general.PieDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.plot.PiePlot3D plot = new org.jfree.chart.plot.PiePlot3D(dataset);
		plot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 5.0, 5.0, 5.0));
		if (tooltips) {
			plot.setToolTipGenerator(new org.jfree.chart.labels.StandardPieToolTipGenerator());
		}
		if (urls) {
			plot.setURLGenerator(new org.jfree.chart.urls.StandardPieURLGenerator());
		}
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createMultiplePieChart3D(java.lang.String title, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.util.TableOrder order, boolean legend, boolean tooltips, boolean urls) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.MultiplePiePlot plot = new org.jfree.chart.plot.MultiplePiePlot(dataset);
		plot.setDataExtractOrder(order);
		plot.setBackgroundPaint(null);
		plot.setOutlineStroke(null);
		org.jfree.chart.JFreeChart pieChart = new org.jfree.chart.JFreeChart(new org.jfree.chart.plot.PiePlot3D(null));
		org.jfree.chart.title.TextTitle seriesTitle = new org.jfree.chart.title.TextTitle("Series Title", new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12));
		seriesTitle.setPosition(org.jfree.chart.util.RectangleEdge.BOTTOM);
		pieChart.setTitle(seriesTitle);
		pieChart.removeLegend();
		pieChart.setBackgroundPaint(null);
		plot.setPieChart(pieChart);
		if (tooltips) {
			org.jfree.chart.labels.PieToolTipGenerator tooltipGenerator = new org.jfree.chart.labels.StandardPieToolTipGenerator();
			org.jfree.chart.plot.PiePlot pp = ((org.jfree.chart.plot.PiePlot) (plot.getPieChart().getPlot()));
			pp.setToolTipGenerator(tooltipGenerator);
		}
		if (urls) {
			org.jfree.chart.urls.PieURLGenerator urlGenerator = new org.jfree.chart.urls.StandardPieURLGenerator();
			org.jfree.chart.plot.PiePlot pp = ((org.jfree.chart.plot.PiePlot) (plot.getPieChart().getPlot()));
			pp.setURLGenerator(urlGenerator);
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createBarChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.category.BarRenderer renderer = new org.jfree.chart.renderer.category.BarRenderer();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			org.jfree.chart.labels.ItemLabelPosition position1 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3, org.jfree.chart.text.TextAnchor.CENTER_LEFT);
			renderer.setBasePositiveItemLabelPosition(position1);
			org.jfree.chart.labels.ItemLabelPosition position2 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9, org.jfree.chart.text.TextAnchor.CENTER_RIGHT);
			renderer.setBaseNegativeItemLabelPosition(position2);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.labels.ItemLabelPosition position1 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12, org.jfree.chart.text.TextAnchor.BOTTOM_CENTER);
				renderer.setBasePositiveItemLabelPosition(position1);
				org.jfree.chart.labels.ItemLabelPosition position2 = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6, org.jfree.chart.text.TextAnchor.TOP_CENTER);
				renderer.setBaseNegativeItemLabelPosition(position2);
			}
		
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createStackedBarChart(java.lang.String title, java.lang.String domainAxisLabel, java.lang.String rangeAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(domainAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(rangeAxisLabel);
		org.jfree.chart.renderer.category.StackedBarRenderer renderer = new org.jfree.chart.renderer.category.StackedBarRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createBarChart3D(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis3D(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis3D(valueAxisLabel);
		org.jfree.chart.renderer.category.BarRenderer3D renderer = new org.jfree.chart.renderer.category.BarRenderer3D();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			plot.setRowRenderingOrder(org.jfree.chart.util.SortOrder.DESCENDING);
			plot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder.DESCENDING);
		}
		plot.setForegroundAlpha(0.75F);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createStackedBarChart3D(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis3D(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis3D(valueAxisLabel);
		org.jfree.chart.renderer.category.CategoryItemRenderer renderer = new org.jfree.chart.renderer.category.StackedBarRenderer3D();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			plot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder.DESCENDING);
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createAreaChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		categoryAxis.setCategoryMargin(0.0);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.category.AreaRenderer renderer = new org.jfree.chart.renderer.category.AreaRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createStackedAreaChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.category.StackedAreaRenderer renderer = new org.jfree.chart.renderer.category.StackedAreaRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createLineChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.category.LineAndShapeRenderer renderer = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, false);
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createLineChart3D(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis3D(categoryAxisLabel);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis3D(valueAxisLabel);
		org.jfree.chart.renderer.category.LineRenderer3D renderer = new org.jfree.chart.renderer.category.LineRenderer3D();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardCategoryToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createGanttChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String dateAxisLabel, org.jfree.data.category.IntervalCategoryDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		org.jfree.chart.axis.DateAxis dateAxis = new org.jfree.chart.axis.DateAxis(dateAxisLabel);
		org.jfree.chart.renderer.category.CategoryItemRenderer renderer = new org.jfree.chart.renderer.category.GanttRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("{3} - {4}", java.text.DateFormat.getDateInstance()));
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, dateAxis, renderer);
		plot.setOrientation(org.jfree.chart.plot.PlotOrientation.HORIZONTAL);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createWaterfallChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		categoryAxis.setCategoryMargin(0.0);
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.category.WaterfallBarRenderer renderer = new org.jfree.chart.renderer.category.WaterfallBarRenderer();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			org.jfree.chart.labels.ItemLabelPosition position = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, ((java.lang.Math.PI) / 2.0));
			renderer.setBasePositiveItemLabelPosition(position);
			renderer.setBaseNegativeItemLabelPosition(position);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.labels.ItemLabelPosition position = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0);
				renderer.setBasePositiveItemLabelPosition(position);
				renderer.setBaseNegativeItemLabelPosition(position);
			}
		
		if (tooltips) {
			org.jfree.chart.labels.StandardCategoryToolTipGenerator generator = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
			renderer.setBaseToolTipGenerator(generator);
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardCategoryURLGenerator());
		}
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		plot.clearRangeMarkers();
		org.jfree.chart.plot.Marker baseline = new org.jfree.chart.plot.ValueMarker(0.0);
		baseline.setPaint(java.awt.Color.black);
		plot.addRangeMarker(baseline, org.jfree.chart.util.Layer.FOREGROUND);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createPolarChart(java.lang.String title, org.jfree.data.xy.XYDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.plot.PolarPlot plot = new org.jfree.chart.plot.PolarPlot();
		plot.setDataset(dataset);
		org.jfree.chart.axis.NumberAxis rangeAxis = new org.jfree.chart.axis.NumberAxis();
		rangeAxis.setAxisLineVisible(false);
		rangeAxis.setTickMarksVisible(false);
		rangeAxis.setTickLabelInsets(new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0));
		plot.setAxis(rangeAxis);
		plot.setRenderer(new org.jfree.chart.renderer.DefaultPolarItemRenderer());
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createScatterPlot(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		yAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, null);
		org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator = null;
		if (tooltips) {
			toolTipGenerator = new org.jfree.chart.labels.StandardXYToolTipGenerator();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer(false, true);
		renderer.setBaseToolTipGenerator(toolTipGenerator);
		renderer.setBaseURLGenerator(urlGenerator);
		plot.setRenderer(renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createXYBarChart(java.lang.String title, java.lang.String xAxisLabel, boolean dateAxis, java.lang.String yAxisLabel, org.jfree.data.xy.IntervalXYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.ValueAxis domainAxis = null;
		if (dateAxis) {
			domainAxis = new org.jfree.chart.axis.DateAxis(xAxisLabel);
		}else {
			org.jfree.chart.axis.NumberAxis axis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
			axis.setAutoRangeIncludesZero(false);
			domainAxis = axis;
		}
		org.jfree.chart.axis.ValueAxis valueAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.renderer.xy.XYBarRenderer renderer = new org.jfree.chart.renderer.xy.XYBarRenderer();
		if (tooltips) {
			org.jfree.chart.labels.XYToolTipGenerator tt;
			if (dateAxis) {
				tt = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
			}else {
				tt = new org.jfree.chart.labels.StandardXYToolTipGenerator();
			}
			renderer.setBaseToolTipGenerator(tt);
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardXYURLGenerator());
		}
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, domainAxis, valueAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createXYAreaChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, null);
		plot.setOrientation(orientation);
		plot.setForegroundAlpha(0.5F);
		org.jfree.chart.labels.XYToolTipGenerator tipGenerator = null;
		if (tooltips) {
			tipGenerator = new org.jfree.chart.labels.StandardXYToolTipGenerator();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		plot.setRenderer(new org.jfree.chart.renderer.xy.XYAreaRenderer(org.jfree.chart.renderer.xy.XYAreaRenderer.AREA, tipGenerator, urlGenerator));
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createStackedXYAreaChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.TableXYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		xAxis.setLowerMargin(0.0);
		xAxis.setUpperMargin(0.0);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator = null;
		if (tooltips) {
			toolTipGenerator = new org.jfree.chart.labels.StandardXYToolTipGenerator();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer2 renderer = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer2(toolTipGenerator, urlGenerator);
		renderer.setOutline(true);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, renderer);
		plot.setOrientation(orientation);
		plot.setRangeAxis(yAxis);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createXYLineChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer(true, false);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, renderer);
		plot.setOrientation(orientation);
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardXYToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardXYURLGenerator());
		}
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createXYStepChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.DateAxis xAxis = new org.jfree.chart.axis.DateAxis(xAxisLabel);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		yAxis.setStandardTickUnits(org.jfree.chart.axis.NumberAxis.createIntegerTickUnits());
		org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator = null;
		if (tooltips) {
			toolTipGenerator = new org.jfree.chart.labels.StandardXYToolTipGenerator();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYStepRenderer(toolTipGenerator, urlGenerator);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, null);
		plot.setRenderer(renderer);
		plot.setOrientation(orientation);
		plot.setDomainCrosshairVisible(false);
		plot.setRangeCrosshairVisible(false);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createXYStepAreaChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator = null;
		if (tooltips) {
			toolTipGenerator = new org.jfree.chart.labels.StandardXYToolTipGenerator();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYStepAreaRenderer(org.jfree.chart.renderer.xy.XYStepAreaRenderer.AREA_AND_SHAPES, toolTipGenerator, urlGenerator);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, null);
		plot.setRenderer(renderer);
		plot.setOrientation(orientation);
		plot.setDomainCrosshairVisible(false);
		plot.setRangeCrosshairVisible(false);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createTimeSeriesChart(java.lang.String title, java.lang.String timeAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.xy.XYDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.axis.ValueAxis timeAxis = new org.jfree.chart.axis.DateAxis(timeAxisLabel);
		timeAxis.setLowerMargin(0.02);
		timeAxis.setUpperMargin(0.02);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		valueAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, timeAxis, valueAxis, null);
		org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator = null;
		if (tooltips) {
			toolTipGenerator = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
		}
		org.jfree.chart.urls.XYURLGenerator urlGenerator = null;
		if (urls) {
			urlGenerator = new org.jfree.chart.urls.StandardXYURLGenerator();
		}
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer(true, false);
		renderer.setBaseToolTipGenerator(toolTipGenerator);
		renderer.setBaseURLGenerator(urlGenerator);
		plot.setRenderer(renderer);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createCandlestickChart(java.lang.String title, java.lang.String timeAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.xy.OHLCDataset dataset, boolean legend) {
		org.jfree.chart.axis.ValueAxis timeAxis = new org.jfree.chart.axis.DateAxis(timeAxisLabel);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, timeAxis, valueAxis, null);
		plot.setRenderer(new org.jfree.chart.renderer.xy.CandlestickRenderer());
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createHighLowChart(java.lang.String title, java.lang.String timeAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.xy.OHLCDataset dataset, boolean legend) {
		org.jfree.chart.axis.ValueAxis timeAxis = new org.jfree.chart.axis.DateAxis(timeAxisLabel);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.xy.HighLowRenderer renderer = new org.jfree.chart.renderer.xy.HighLowRenderer();
		renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.HighLowItemLabelGenerator());
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, timeAxis, valueAxis, renderer);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createHighLowChart(java.lang.String title, java.lang.String timeAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.xy.OHLCDataset dataset, org.jfree.chart.axis.Timeline timeline, boolean legend) {
		org.jfree.chart.axis.DateAxis timeAxis = new org.jfree.chart.axis.DateAxis(timeAxisLabel);
		timeAxis.setTimeline(timeline);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		org.jfree.chart.renderer.xy.HighLowRenderer renderer = new org.jfree.chart.renderer.xy.HighLowRenderer();
		renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.HighLowItemLabelGenerator());
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, timeAxis, valueAxis, renderer);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createBubbleChart(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.XYZDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.NumberAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		yAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, null);
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYBubbleRenderer(org.jfree.chart.renderer.xy.XYBubbleRenderer.SCALE_ON_RANGE_AXIS);
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardXYZToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardXYZURLGenerator());
		}
		plot.setRenderer(renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createHistogram(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.IntervalXYDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.axis.NumberAxis xAxis = new org.jfree.chart.axis.NumberAxis(xAxisLabel);
		xAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.axis.ValueAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		org.jfree.chart.renderer.xy.XYItemRenderer renderer = new org.jfree.chart.renderer.xy.XYBarRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardXYToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardXYURLGenerator());
		}
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, renderer);
		plot.setOrientation(orientation);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createBoxAndWhiskerChart(java.lang.String title, java.lang.String categoryAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.statistics.BoxAndWhiskerCategoryDataset dataset, boolean legend) {
		org.jfree.chart.axis.CategoryAxis categoryAxis = new org.jfree.chart.axis.CategoryAxis(categoryAxisLabel);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		valueAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer renderer = new org.jfree.chart.renderer.category.BoxAndWhiskerRenderer();
		renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator());
		org.jfree.chart.plot.CategoryPlot plot = new org.jfree.chart.plot.CategoryPlot(dataset, categoryAxis, valueAxis, renderer);
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createBoxAndWhiskerChart(java.lang.String title, java.lang.String timeAxisLabel, java.lang.String valueAxisLabel, org.jfree.data.statistics.BoxAndWhiskerXYDataset dataset, boolean legend) {
		org.jfree.chart.axis.ValueAxis timeAxis = new org.jfree.chart.axis.DateAxis(timeAxisLabel);
		org.jfree.chart.axis.NumberAxis valueAxis = new org.jfree.chart.axis.NumberAxis(valueAxisLabel);
		valueAxis.setAutoRangeIncludesZero(false);
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer renderer = new org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer(10.0);
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, timeAxis, valueAxis, renderer);
		return new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
	}

	public static org.jfree.chart.JFreeChart createWindPlot(java.lang.String title, java.lang.String xAxisLabel, java.lang.String yAxisLabel, org.jfree.data.xy.WindDataset dataset, boolean legend, boolean tooltips, boolean urls) {
		org.jfree.chart.axis.ValueAxis xAxis = new org.jfree.chart.axis.DateAxis(xAxisLabel);
		org.jfree.chart.axis.ValueAxis yAxis = new org.jfree.chart.axis.NumberAxis(yAxisLabel);
		yAxis.setRange((-12.0), 12.0);
		org.jfree.chart.renderer.xy.WindItemRenderer renderer = new org.jfree.chart.renderer.xy.WindItemRenderer();
		if (tooltips) {
			renderer.setBaseToolTipGenerator(new org.jfree.chart.labels.StandardXYToolTipGenerator());
		}
		if (urls) {
			renderer.setBaseURLGenerator(new org.jfree.chart.urls.StandardXYURLGenerator());
		}
		org.jfree.chart.plot.XYPlot plot = new org.jfree.chart.plot.XYPlot(dataset, xAxis, yAxis, renderer);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}

	public static org.jfree.chart.JFreeChart createWaferMapChart(java.lang.String title, org.jfree.data.general.WaferMapDataset dataset, org.jfree.chart.plot.PlotOrientation orientation, boolean legend, boolean tooltips, boolean urls) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.plot.WaferMapPlot plot = new org.jfree.chart.plot.WaferMapPlot(dataset);
		org.jfree.chart.renderer.WaferMapRenderer renderer = new org.jfree.chart.renderer.WaferMapRenderer();
		plot.setRenderer(renderer);
		org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(title, org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT, plot, legend);
		return chart;
	}
}

