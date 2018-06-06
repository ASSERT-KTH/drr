

package org.jfree.chart;


public class StandardChartTheme implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.ChartTheme , org.jfree.chart.util.PublicCloneable {
	private java.lang.String name;

	private java.awt.Font extraLargeFont;

	private java.awt.Font largeFont;

	private java.awt.Font regularFont;

	private java.awt.Font smallFont;

	private transient java.awt.Paint titlePaint;

	private transient java.awt.Paint subtitlePaint;

	private transient java.awt.Paint chartBackgroundPaint;

	private transient java.awt.Paint legendBackgroundPaint;

	private transient java.awt.Paint legendItemPaint;

	private org.jfree.chart.plot.DrawingSupplier drawingSupplier;

	private transient java.awt.Paint plotBackgroundPaint;

	private transient java.awt.Paint plotOutlinePaint;

	private org.jfree.chart.plot.PieLabelLinkStyle labelLinkStyle;

	private transient java.awt.Paint labelLinkPaint;

	private transient java.awt.Paint domainGridlinePaint;

	private transient java.awt.Paint rangeGridlinePaint;

	private transient java.awt.Paint crosshairPaint;

	private org.jfree.chart.util.RectangleInsets axisOffset;

	private transient java.awt.Paint axisLabelPaint;

	private transient java.awt.Paint tickLabelPaint;

	private transient java.awt.Paint itemLabelPaint;

	private boolean shadowVisible;

	private transient java.awt.Paint shadowPaint;

	private org.jfree.chart.renderer.category.BarPainter barPainter;

	private org.jfree.chart.renderer.xy.XYBarPainter xyBarPainter;

	private transient java.awt.Paint thermometerPaint;

	private transient java.awt.Paint wallPaint;

	private transient java.awt.Paint errorIndicatorPaint;

	private transient java.awt.Paint gridBandPaint = org.jfree.chart.axis.SymbolAxis.DEFAULT_GRID_BAND_PAINT;

	private transient java.awt.Paint gridBandAlternatePaint = org.jfree.chart.axis.SymbolAxis.DEFAULT_GRID_BAND_ALTERNATE_PAINT;

	public static org.jfree.chart.ChartTheme createJFreeTheme() {
		return new org.jfree.chart.StandardChartTheme("JFree");
	}

	public static org.jfree.chart.ChartTheme createDarknessTheme() {
		org.jfree.chart.StandardChartTheme theme = new org.jfree.chart.StandardChartTheme("Darkness");
		theme.titlePaint = java.awt.Color.white;
		theme.subtitlePaint = java.awt.Color.white;
		theme.legendBackgroundPaint = java.awt.Color.black;
		theme.legendItemPaint = java.awt.Color.white;
		theme.chartBackgroundPaint = java.awt.Color.black;
		theme.plotBackgroundPaint = java.awt.Color.black;
		theme.plotOutlinePaint = java.awt.Color.yellow;
		theme.crosshairPaint = java.awt.Color.red;
		theme.labelLinkPaint = java.awt.Color.lightGray;
		theme.tickLabelPaint = java.awt.Color.white;
		theme.axisLabelPaint = java.awt.Color.white;
		theme.shadowPaint = java.awt.Color.darkGray;
		theme.itemLabelPaint = java.awt.Color.white;
		theme.drawingSupplier = new org.jfree.chart.plot.DefaultDrawingSupplier(new java.awt.Paint[]{ java.awt.Color.decode("0xFFFF00") , java.awt.Color.decode("0x0036CC") , java.awt.Color.decode("0xFF0000") , java.awt.Color.decode("0xFFFF7F") , java.awt.Color.decode("0x6681CC") , java.awt.Color.decode("0xFF7F7F") , java.awt.Color.decode("0xFFFFBF") , java.awt.Color.decode("0x99A6CC") , java.awt.Color.decode("0xFFBFBF") , java.awt.Color.decode("0xA9A938") , java.awt.Color.decode("0x2D4587") }, new java.awt.Paint[]{ java.awt.Color.decode("0xFFFF00") , java.awt.Color.decode("0x0036CC") }, new java.awt.Stroke[]{ new java.awt.BasicStroke(2.0F) }, new java.awt.Stroke[]{ new java.awt.BasicStroke(0.5F) }, org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE);
		theme.wallPaint = java.awt.Color.darkGray;
		theme.errorIndicatorPaint = java.awt.Color.lightGray;
		theme.gridBandPaint = new java.awt.Color(255, 255, 255, 20);
		theme.gridBandAlternatePaint = new java.awt.Color(255, 255, 255, 40);
		return theme;
	}

	public static org.jfree.chart.ChartTheme createLegacyTheme() {
		org.jfree.chart.StandardChartTheme theme = new org.jfree.chart.StandardChartTheme("Legacy") {
			public void apply(org.jfree.chart.JFreeChart chart) {
			}
		};
		return theme;
	}

	public StandardChartTheme(java.lang.String name) {
		if (name == null) {
			throw new java.lang.IllegalArgumentException("Null 'name' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.name = name;
		org.jfree.chart.StandardChartTheme.this.extraLargeFont = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 20);
		org.jfree.chart.StandardChartTheme.this.largeFont = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14);
		org.jfree.chart.StandardChartTheme.this.regularFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12);
		org.jfree.chart.StandardChartTheme.this.smallFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);
		org.jfree.chart.StandardChartTheme.this.titlePaint = java.awt.Color.black;
		org.jfree.chart.StandardChartTheme.this.subtitlePaint = java.awt.Color.black;
		org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint = java.awt.Color.white;
		org.jfree.chart.StandardChartTheme.this.legendItemPaint = java.awt.Color.darkGray;
		org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint = java.awt.Color.white;
		org.jfree.chart.StandardChartTheme.this.drawingSupplier = new org.jfree.chart.plot.DefaultDrawingSupplier();
		org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint = java.awt.Color.lightGray;
		org.jfree.chart.StandardChartTheme.this.plotOutlinePaint = java.awt.Color.black;
		org.jfree.chart.StandardChartTheme.this.labelLinkPaint = java.awt.Color.black;
		org.jfree.chart.StandardChartTheme.this.labelLinkStyle = org.jfree.chart.plot.PieLabelLinkStyle.CUBIC_CURVE;
		org.jfree.chart.StandardChartTheme.this.axisOffset = new org.jfree.chart.util.RectangleInsets(4, 4, 4, 4);
		org.jfree.chart.StandardChartTheme.this.domainGridlinePaint = java.awt.Color.white;
		org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint = java.awt.Color.white;
		org.jfree.chart.StandardChartTheme.this.crosshairPaint = java.awt.Color.blue;
		org.jfree.chart.StandardChartTheme.this.axisLabelPaint = java.awt.Color.darkGray;
		org.jfree.chart.StandardChartTheme.this.tickLabelPaint = java.awt.Color.darkGray;
		org.jfree.chart.StandardChartTheme.this.barPainter = new org.jfree.chart.renderer.category.GradientBarPainter();
		org.jfree.chart.StandardChartTheme.this.xyBarPainter = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
		org.jfree.chart.StandardChartTheme.this.shadowVisible = true;
		org.jfree.chart.StandardChartTheme.this.shadowPaint = java.awt.Color.gray;
		org.jfree.chart.StandardChartTheme.this.itemLabelPaint = java.awt.Color.black;
		org.jfree.chart.StandardChartTheme.this.thermometerPaint = java.awt.Color.white;
		org.jfree.chart.StandardChartTheme.this.wallPaint = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
		org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint = java.awt.Color.black;
	}

	public java.awt.Font getExtraLargeFont() {
		return org.jfree.chart.StandardChartTheme.this.extraLargeFont;
	}

	public void setExtraLargeFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.extraLargeFont = font;
	}

	public java.awt.Font getLargeFont() {
		return org.jfree.chart.StandardChartTheme.this.largeFont;
	}

	public void setLargeFont(java.awt.Font font) {
		org.jfree.chart.StandardChartTheme.this.largeFont = font;
	}

	public java.awt.Font getRegularFont() {
		return org.jfree.chart.StandardChartTheme.this.regularFont;
	}

	public void setRegularFont(java.awt.Font font) {
		org.jfree.chart.StandardChartTheme.this.regularFont = font;
	}

	public java.awt.Paint getTitlePaint() {
		return org.jfree.chart.StandardChartTheme.this.titlePaint;
	}

	public void setTitlePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.titlePaint = paint;
	}

	public java.awt.Paint getSubtitlePaint() {
		return org.jfree.chart.StandardChartTheme.this.subtitlePaint;
	}

	public void setSubtitlePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.subtitlePaint = paint;
	}

	public java.awt.Paint getChartBackgroundPaint() {
		return org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint;
	}

	public void setChartBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint = paint;
	}

	public java.awt.Paint getLegendBackgroundPaint() {
		return org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint;
	}

	public void setLegendBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint = paint;
	}

	public java.awt.Paint getLegendItemPaint() {
		return org.jfree.chart.StandardChartTheme.this.legendItemPaint;
	}

	public void setLegendItemPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.legendItemPaint = paint;
	}

	public java.awt.Paint getPlotBackgroundPaint() {
		return org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint;
	}

	public void setPlotBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint = paint;
	}

	public java.awt.Paint getPlotOutlinePaint() {
		return org.jfree.chart.StandardChartTheme.this.plotOutlinePaint;
	}

	public void setPlotOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.plotOutlinePaint = paint;
	}

	public org.jfree.chart.plot.PieLabelLinkStyle getLabelLinkStyle() {
		return org.jfree.chart.StandardChartTheme.this.labelLinkStyle;
	}

	public void setLabelLinkStyle(org.jfree.chart.plot.PieLabelLinkStyle style) {
		if (style == null) {
			throw new java.lang.IllegalArgumentException("Null 'style' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.labelLinkStyle = style;
	}

	public java.awt.Paint getLabelLinkPaint() {
		return org.jfree.chart.StandardChartTheme.this.labelLinkPaint;
	}

	public void setLabelLinkPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.labelLinkPaint = paint;
	}

	public java.awt.Paint getDomainGridlinePaint() {
		return org.jfree.chart.StandardChartTheme.this.domainGridlinePaint;
	}

	public void setDomainGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.domainGridlinePaint = paint;
	}

	public java.awt.Paint getRangeGridlinePaint() {
		return org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint;
	}

	public void setRangeGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint = paint;
	}

	public java.awt.Paint getCrosshairPaint() {
		return org.jfree.chart.StandardChartTheme.this.crosshairPaint;
	}

	public void setCrosshairPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.crosshairPaint = paint;
	}

	public org.jfree.chart.util.RectangleInsets getAxisOffset() {
		return org.jfree.chart.StandardChartTheme.this.axisOffset;
	}

	public void setAxisOffset(org.jfree.chart.util.RectangleInsets offset) {
		if (offset == null) {
			throw new java.lang.IllegalArgumentException("Null 'offset' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.axisOffset = offset;
	}

	public java.awt.Paint getAxisLabelPaint() {
		return org.jfree.chart.StandardChartTheme.this.axisLabelPaint;
	}

	public void setAxisLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.axisLabelPaint = paint;
	}

	public java.awt.Paint getTickLabelPaint() {
		return org.jfree.chart.StandardChartTheme.this.tickLabelPaint;
	}

	public void setTickLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.tickLabelPaint = paint;
	}

	public java.awt.Paint getItemLabelPaint() {
		return org.jfree.chart.StandardChartTheme.this.itemLabelPaint;
	}

	public void setItemLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.itemLabelPaint = paint;
	}

	public boolean isShadowVisible() {
		return org.jfree.chart.StandardChartTheme.this.shadowVisible;
	}

	public void setShadowVisible(boolean visible) {
		org.jfree.chart.StandardChartTheme.this.shadowVisible = visible;
	}

	public java.awt.Paint getShadowPaint() {
		return org.jfree.chart.StandardChartTheme.this.shadowPaint;
	}

	public void setShadowPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.shadowPaint = paint;
	}

	public org.jfree.chart.renderer.category.BarPainter getBarPainter() {
		return org.jfree.chart.StandardChartTheme.this.barPainter;
	}

	public void setBarPainter(org.jfree.chart.renderer.category.BarPainter painter) {
		if (painter == null) {
			throw new java.lang.IllegalArgumentException("Null 'painter' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.barPainter = painter;
	}

	public org.jfree.chart.renderer.xy.XYBarPainter getXYBarPainter() {
		return org.jfree.chart.StandardChartTheme.this.xyBarPainter;
	}

	public void setXYBarPainter(org.jfree.chart.renderer.xy.XYBarPainter painter) {
		if (painter == null) {
			throw new java.lang.IllegalArgumentException("Null 'painter' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.xyBarPainter = painter;
	}

	public java.awt.Paint getThermometerPaint() {
		return org.jfree.chart.StandardChartTheme.this.thermometerPaint;
	}

	public void setThermometerPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.thermometerPaint = paint;
	}

	public java.awt.Paint getWallPaint() {
		return org.jfree.chart.StandardChartTheme.this.wallPaint;
	}

	public void setWallPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.wallPaint = paint;
	}

	public java.awt.Paint getErrorIndicatorPaint() {
		return org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint;
	}

	public void setErrorIndicatorPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint = paint;
	}

	public java.awt.Paint getGridBandPaint() {
		return org.jfree.chart.StandardChartTheme.this.gridBandPaint;
	}

	public void setGridBandPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.gridBandPaint = paint;
	}

	public java.awt.Paint getGridBandAlternatePaint() {
		return org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint;
	}

	public void setGridBandAlternatePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint = paint;
	}

	public java.lang.String getName() {
		return org.jfree.chart.StandardChartTheme.this.name;
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		if ((org.jfree.chart.StandardChartTheme.this.drawingSupplier) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.StandardChartTheme.this.drawingSupplier));
			try {
				result = ((org.jfree.chart.plot.DrawingSupplier) (pc.clone()));
			} catch (java.lang.CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public void setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier supplier) {
		if (supplier == null) {
			throw new java.lang.IllegalArgumentException("Null 'supplier' argument.");
		}
		org.jfree.chart.StandardChartTheme.this.drawingSupplier = supplier;
	}

	public void apply(org.jfree.chart.JFreeChart chart) {
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		org.jfree.chart.title.TextTitle title = chart.getTitle();
		if (title != null) {
			title.setFont(org.jfree.chart.StandardChartTheme.this.extraLargeFont);
			title.setPaint(org.jfree.chart.StandardChartTheme.this.titlePaint);
		}
		int subtitleCount = chart.getSubtitleCount();
		for (int i = 0; i < subtitleCount; i++) {
			applyToTitle(chart.getSubtitle(i));
		}
		chart.setBackgroundPaint(org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint);
		org.jfree.chart.plot.Plot plot = chart.getPlot();
		if (plot != null) {
			applyToPlot(plot);
		}
	}

	protected void applyToTitle(org.jfree.chart.title.Title title) {
		if (title instanceof org.jfree.chart.title.TextTitle) {
			org.jfree.chart.title.TextTitle tt = ((org.jfree.chart.title.TextTitle) (title));
			tt.setFont(org.jfree.chart.StandardChartTheme.this.largeFont);
			tt.setPaint(org.jfree.chart.StandardChartTheme.this.subtitlePaint);
		}else
			if (title instanceof org.jfree.chart.title.LegendTitle) {
				org.jfree.chart.title.LegendTitle lt = ((org.jfree.chart.title.LegendTitle) (title));
				if ((lt.getBackgroundPaint()) != null) {
					lt.setBackgroundPaint(org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint);
				}
				lt.setItemFont(org.jfree.chart.StandardChartTheme.this.regularFont);
				lt.setItemPaint(org.jfree.chart.StandardChartTheme.this.legendItemPaint);
				if ((lt.getWrapper()) != null) {
					applyToBlockContainer(lt.getWrapper());
				}
			}else
				if (title instanceof org.jfree.chart.title.PaintScaleLegend) {
					org.jfree.chart.title.PaintScaleLegend psl = ((org.jfree.chart.title.PaintScaleLegend) (title));
					psl.setBackgroundPaint(org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint);
					org.jfree.chart.axis.ValueAxis axis = psl.getAxis();
					if (axis != null) {
						applyToValueAxis(axis);
					}
				}else
					if (title instanceof org.jfree.chart.title.CompositeTitle) {
						org.jfree.chart.title.CompositeTitle ct = ((org.jfree.chart.title.CompositeTitle) (title));
						org.jfree.chart.block.BlockContainer bc = ct.getContainer();
						java.util.List blocks = bc.getBlocks();
						java.util.Iterator iterator = blocks.iterator();
						while (iterator.hasNext()) {
							org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (iterator.next()));
							if (b instanceof org.jfree.chart.title.Title) {
								applyToTitle(((org.jfree.chart.title.Title) (b)));
							}
						} 
					}
				
			
		
	}

	protected void applyToBlockContainer(org.jfree.chart.block.BlockContainer bc) {
		java.util.Iterator iterator = bc.getBlocks().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (iterator.next()));
			applyToBlock(b);
		} 
	}

	protected void applyToBlock(org.jfree.chart.block.Block b) {
		if (b instanceof org.jfree.chart.title.Title) {
			applyToTitle(((org.jfree.chart.title.Title) (b)));
		}else
			if (b instanceof org.jfree.chart.block.LabelBlock) {
				org.jfree.chart.block.LabelBlock lb = ((org.jfree.chart.block.LabelBlock) (b));
				lb.setFont(org.jfree.chart.StandardChartTheme.this.regularFont);
				lb.setPaint(org.jfree.chart.StandardChartTheme.this.legendItemPaint);
			}
		
	}

	protected void applyToPlot(org.jfree.chart.plot.Plot plot) {
		if (plot == null) {
			throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
		}
		if ((plot.getDrawingSupplier()) != null) {
			plot.setDrawingSupplier(getDrawingSupplier());
		}
		if ((plot.getBackgroundPaint()) != null) {
			plot.setBackgroundPaint(org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint);
		}
		plot.setOutlinePaint(org.jfree.chart.StandardChartTheme.this.plotOutlinePaint);
		if (plot instanceof org.jfree.chart.plot.PiePlot) {
			applyToPiePlot(((org.jfree.chart.plot.PiePlot) (plot)));
		}else
			if (plot instanceof org.jfree.chart.plot.MultiplePiePlot) {
				applyToMultiplePiePlot(((org.jfree.chart.plot.MultiplePiePlot) (plot)));
			}else
				if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
					applyToCategoryPlot(((org.jfree.chart.plot.CategoryPlot) (plot)));
				}else
					if (plot instanceof org.jfree.chart.plot.XYPlot) {
						applyToXYPlot(((org.jfree.chart.plot.XYPlot) (plot)));
					}else
						if (plot instanceof org.jfree.chart.plot.FastScatterPlot) {
							applyToFastScatterPlot(((org.jfree.chart.plot.FastScatterPlot) (plot)));
						}else
							if (plot instanceof org.jfree.chart.plot.MeterPlot) {
								applyToMeterPlot(((org.jfree.chart.plot.MeterPlot) (plot)));
							}else
								if (plot instanceof org.jfree.chart.plot.ThermometerPlot) {
									applyToThermometerPlot(((org.jfree.chart.plot.ThermometerPlot) (plot)));
								}else
									if (plot instanceof org.jfree.chart.plot.SpiderWebPlot) {
										applyToSpiderWebPlot(((org.jfree.chart.plot.SpiderWebPlot) (plot)));
									}else
										if (plot instanceof org.jfree.chart.plot.PolarPlot) {
											applyToPolarPlot(((org.jfree.chart.plot.PolarPlot) (plot)));
										}
									
								
							
						
					
				
			
		
	}

	protected void applyToPiePlot(org.jfree.chart.plot.PiePlot plot) {
		plot.setLabelLinkPaint(org.jfree.chart.StandardChartTheme.this.labelLinkPaint);
		plot.setLabelLinkStyle(org.jfree.chart.StandardChartTheme.this.labelLinkStyle);
		plot.setLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		if (plot.getAutoPopulateSectionPaint()) {
			plot.clearSectionPaints(false);
		}
		if (plot.getAutoPopulateSectionOutlinePaint()) {
			plot.clearSectionOutlinePaints(false);
		}
		if (plot.getAutoPopulateSectionOutlineStroke()) {
			plot.clearSectionOutlineStrokes(false);
		}
	}

	protected void applyToMultiplePiePlot(org.jfree.chart.plot.MultiplePiePlot plot) {
		apply(plot.getPieChart());
	}

	protected void applyToCategoryPlot(org.jfree.chart.plot.CategoryPlot plot) {
		plot.setAxisOffset(org.jfree.chart.StandardChartTheme.this.axisOffset);
		plot.setDomainGridlinePaint(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint);
		plot.setRangeGridlinePaint(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint);
		int domainAxisCount = plot.getDomainAxisCount();
		for (int i = 0; i < domainAxisCount; i++) {
			org.jfree.chart.axis.CategoryAxis axis = ((org.jfree.chart.axis.CategoryAxis) (plot.getDomainAxis(i)));
			if (axis != null) {
				applyToCategoryAxis(axis);
			}
		}
		int rangeAxisCount = plot.getRangeAxisCount();
		for (int i = 0; i < rangeAxisCount; i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (plot.getRangeAxis(i)));
			if (axis != null) {
				applyToValueAxis(axis);
			}
		}
		int rendererCount = plot.getRendererCount();
		for (int i = 0; i < rendererCount; i++) {
			org.jfree.chart.renderer.category.CategoryItemRenderer r = plot.getRenderer(i);
			if (r != null) {
				applyToCategoryItemRenderer(r);
			}
		}
		if (plot instanceof org.jfree.chart.plot.CombinedDomainCategoryPlot) {
			org.jfree.chart.plot.CombinedDomainCategoryPlot cp = ((org.jfree.chart.plot.CombinedDomainCategoryPlot) (plot));
			java.util.Iterator iterator = cp.getSubplots().iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.CategoryPlot subplot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				if (subplot != null) {
					applyToPlot(subplot);
				}
			} 
		}
		if (plot instanceof org.jfree.chart.plot.CombinedRangeCategoryPlot) {
			org.jfree.chart.plot.CombinedRangeCategoryPlot cp = ((org.jfree.chart.plot.CombinedRangeCategoryPlot) (plot));
			java.util.Iterator iterator = cp.getSubplots().iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.CategoryPlot subplot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				if (subplot != null) {
					applyToPlot(subplot);
				}
			} 
		}
	}

	protected void applyToXYPlot(org.jfree.chart.plot.XYPlot plot) {
		plot.setAxisOffset(org.jfree.chart.StandardChartTheme.this.axisOffset);
		plot.setDomainGridlinePaint(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint);
		plot.setRangeGridlinePaint(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint);
		plot.setDomainCrosshairPaint(org.jfree.chart.StandardChartTheme.this.crosshairPaint);
		plot.setRangeCrosshairPaint(org.jfree.chart.StandardChartTheme.this.crosshairPaint);
		int domainAxisCount = plot.getDomainAxisCount();
		for (int i = 0; i < domainAxisCount; i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (plot.getDomainAxis(i)));
			if (axis != null) {
				applyToValueAxis(axis);
			}
		}
		int rangeAxisCount = plot.getRangeAxisCount();
		for (int i = 0; i < rangeAxisCount; i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (plot.getRangeAxis(i)));
			if (axis != null) {
				applyToValueAxis(axis);
			}
		}
		int rendererCount = plot.getRendererCount();
		for (int i = 0; i < rendererCount; i++) {
			org.jfree.chart.renderer.xy.XYItemRenderer r = plot.getRenderer(i);
			if (r != null) {
				applyToXYItemRenderer(r);
			}
		}
		java.util.Iterator iter = plot.getAnnotations().iterator();
		while (iter.hasNext()) {
			org.jfree.chart.annotations.XYAnnotation a = ((org.jfree.chart.annotations.XYAnnotation) (iter.next()));
			applyToXYAnnotation(a);
		} 
		if (plot instanceof org.jfree.chart.plot.CombinedDomainXYPlot) {
			org.jfree.chart.plot.CombinedDomainXYPlot cp = ((org.jfree.chart.plot.CombinedDomainXYPlot) (plot));
			java.util.Iterator iterator = cp.getSubplots().iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				if (subplot != null) {
					applyToPlot(subplot);
				}
			} 
		}
		if (plot instanceof org.jfree.chart.plot.CombinedRangeXYPlot) {
			org.jfree.chart.plot.CombinedRangeXYPlot cp = ((org.jfree.chart.plot.CombinedRangeXYPlot) (plot));
			java.util.Iterator iterator = cp.getSubplots().iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				if (subplot != null) {
					applyToPlot(subplot);
				}
			} 
		}
	}

	protected void applyToFastScatterPlot(org.jfree.chart.plot.FastScatterPlot plot) {
		plot.setDomainGridlinePaint(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint);
		plot.setRangeGridlinePaint(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint);
		org.jfree.chart.axis.ValueAxis xAxis = plot.getDomainAxis();
		if (xAxis != null) {
			applyToValueAxis(xAxis);
		}
		org.jfree.chart.axis.ValueAxis yAxis = plot.getRangeAxis();
		if (yAxis != null) {
			applyToValueAxis(yAxis);
		}
	}

	protected void applyToPolarPlot(org.jfree.chart.plot.PolarPlot plot) {
		plot.setAngleLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		plot.setAngleLabelPaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint);
		plot.setAngleGridlinePaint(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint);
		plot.setRadiusGridlinePaint(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint);
		org.jfree.chart.axis.ValueAxis axis = plot.getAxis();
		if (axis != null) {
			applyToValueAxis(axis);
		}
	}

	protected void applyToSpiderWebPlot(org.jfree.chart.plot.SpiderWebPlot plot) {
		plot.setLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		plot.setLabelPaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint);
		plot.setAxisLinePaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint);
	}

	protected void applyToMeterPlot(org.jfree.chart.plot.MeterPlot plot) {
		plot.setDialBackgroundPaint(org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint);
		plot.setValueFont(org.jfree.chart.StandardChartTheme.this.largeFont);
		plot.setValuePaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint);
		plot.setDialOutlinePaint(org.jfree.chart.StandardChartTheme.this.plotOutlinePaint);
		plot.setNeedlePaint(org.jfree.chart.StandardChartTheme.this.thermometerPaint);
		plot.setTickLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		plot.setTickLabelPaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint);
	}

	protected void applyToThermometerPlot(org.jfree.chart.plot.ThermometerPlot plot) {
		plot.setValueFont(org.jfree.chart.StandardChartTheme.this.largeFont);
		plot.setThermometerPaint(org.jfree.chart.StandardChartTheme.this.thermometerPaint);
		org.jfree.chart.axis.ValueAxis axis = plot.getRangeAxis();
		if (axis != null) {
			applyToValueAxis(axis);
		}
	}

	protected void applyToCategoryAxis(org.jfree.chart.axis.CategoryAxis axis) {
		axis.setLabelFont(org.jfree.chart.StandardChartTheme.this.largeFont);
		axis.setLabelPaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint);
		axis.setTickLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		axis.setTickLabelPaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint);
		if (axis instanceof org.jfree.chart.axis.SubCategoryAxis) {
			org.jfree.chart.axis.SubCategoryAxis sca = ((org.jfree.chart.axis.SubCategoryAxis) (axis));
			sca.setSubLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
			sca.setSubLabelPaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint);
		}
	}

	protected void applyToValueAxis(org.jfree.chart.axis.ValueAxis axis) {
		axis.setLabelFont(org.jfree.chart.StandardChartTheme.this.largeFont);
		axis.setLabelPaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint);
		axis.setTickLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		axis.setTickLabelPaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint);
		if (axis instanceof org.jfree.chart.axis.SymbolAxis) {
			applyToSymbolAxis(((org.jfree.chart.axis.SymbolAxis) (axis)));
		}
		if (axis instanceof org.jfree.chart.axis.PeriodAxis) {
			applyToPeriodAxis(((org.jfree.chart.axis.PeriodAxis) (axis)));
		}
	}

	protected void applyToSymbolAxis(org.jfree.chart.axis.SymbolAxis axis) {
		axis.setGridBandPaint(org.jfree.chart.StandardChartTheme.this.gridBandPaint);
		axis.setGridBandAlternatePaint(org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint);
	}

	protected void applyToPeriodAxis(org.jfree.chart.axis.PeriodAxis axis) {
		org.jfree.chart.axis.PeriodAxisLabelInfo[] info = axis.getLabelInfo();
		for (int i = 0; i < (info.length); i++) {
			org.jfree.chart.axis.PeriodAxisLabelInfo e = info[i];
			org.jfree.chart.axis.PeriodAxisLabelInfo n = new org.jfree.chart.axis.PeriodAxisLabelInfo(e.getPeriodClass(), e.getDateFormat(), e.getPadding(), org.jfree.chart.StandardChartTheme.this.regularFont, org.jfree.chart.StandardChartTheme.this.tickLabelPaint, e.getDrawDividers(), e.getDividerStroke(), e.getDividerPaint());
			info[i] = n;
		}
		axis.setLabelInfo(info);
	}

	protected void applyToAbstractRenderer(org.jfree.chart.renderer.AbstractRenderer renderer) {
		if (renderer.getAutoPopulateSeriesPaint()) {
			renderer.clearSeriesPaints(false);
		}
		if (renderer.getAutoPopulateSeriesStroke()) {
			renderer.clearSeriesStrokes(false);
		}
	}

	protected void applyToCategoryItemRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer renderer) {
		if (renderer == null) {
			throw new java.lang.IllegalArgumentException("Null 'renderer' argument.");
		}
		if (renderer instanceof org.jfree.chart.renderer.AbstractRenderer) {
			applyToAbstractRenderer(((org.jfree.chart.renderer.AbstractRenderer) (renderer)));
		}
		renderer.setBaseItemLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		renderer.setBaseItemLabelPaint(org.jfree.chart.StandardChartTheme.this.itemLabelPaint);
		if (renderer instanceof org.jfree.chart.renderer.category.BarRenderer) {
			org.jfree.chart.renderer.category.BarRenderer br = ((org.jfree.chart.renderer.category.BarRenderer) (renderer));
			br.setBarPainter(org.jfree.chart.StandardChartTheme.this.barPainter);
			br.setShadowVisible(org.jfree.chart.StandardChartTheme.this.shadowVisible);
			br.setShadowPaint(org.jfree.chart.StandardChartTheme.this.shadowPaint);
		}
		if (renderer instanceof org.jfree.chart.renderer.category.BarRenderer3D) {
			org.jfree.chart.renderer.category.BarRenderer3D br3d = ((org.jfree.chart.renderer.category.BarRenderer3D) (renderer));
			br3d.setWallPaint(org.jfree.chart.StandardChartTheme.this.wallPaint);
		}
		if (renderer instanceof org.jfree.chart.renderer.category.LineRenderer3D) {
			org.jfree.chart.renderer.category.LineRenderer3D lr3d = ((org.jfree.chart.renderer.category.LineRenderer3D) (renderer));
			lr3d.setWallPaint(org.jfree.chart.StandardChartTheme.this.wallPaint);
		}
		if (renderer instanceof org.jfree.chart.renderer.category.StatisticalBarRenderer) {
			org.jfree.chart.renderer.category.StatisticalBarRenderer sbr = ((org.jfree.chart.renderer.category.StatisticalBarRenderer) (renderer));
			sbr.setErrorIndicatorPaint(org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint);
		}
		if (renderer instanceof org.jfree.chart.renderer.category.MinMaxCategoryRenderer) {
			org.jfree.chart.renderer.category.MinMaxCategoryRenderer mmcr = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer) (renderer));
			mmcr.setGroupPaint(org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint);
		}
	}

	protected void applyToXYItemRenderer(org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		if (renderer == null) {
			throw new java.lang.IllegalArgumentException("Null 'renderer' argument.");
		}
		if (renderer instanceof org.jfree.chart.renderer.AbstractRenderer) {
			applyToAbstractRenderer(((org.jfree.chart.renderer.AbstractRenderer) (renderer)));
		}
		renderer.setBaseItemLabelFont(org.jfree.chart.StandardChartTheme.this.regularFont);
		renderer.setBaseItemLabelPaint(org.jfree.chart.StandardChartTheme.this.itemLabelPaint);
		if (renderer instanceof org.jfree.chart.renderer.xy.XYBarRenderer) {
			org.jfree.chart.renderer.xy.XYBarRenderer br = ((org.jfree.chart.renderer.xy.XYBarRenderer) (renderer));
			br.setBarPainter(org.jfree.chart.StandardChartTheme.this.xyBarPainter);
			br.setShadowVisible(org.jfree.chart.StandardChartTheme.this.shadowVisible);
		}
	}

	protected void applyToXYAnnotation(org.jfree.chart.annotations.XYAnnotation annotation) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		if (annotation instanceof org.jfree.chart.annotations.XYTextAnnotation) {
			org.jfree.chart.annotations.XYTextAnnotation xyta = ((org.jfree.chart.annotations.XYTextAnnotation) (annotation));
			xyta.setFont(org.jfree.chart.StandardChartTheme.this.smallFont);
			xyta.setPaint(org.jfree.chart.StandardChartTheme.this.itemLabelPaint);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.StandardChartTheme.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.StandardChartTheme)) {
			return false;
		}
		org.jfree.chart.StandardChartTheme that = ((org.jfree.chart.StandardChartTheme) (obj));
		if (!(org.jfree.chart.StandardChartTheme.this.name.equals(that.name))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.extraLargeFont.equals(that.extraLargeFont))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.largeFont.equals(that.largeFont))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.regularFont.equals(that.regularFont))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.smallFont.equals(that.smallFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.titlePaint, that.titlePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.subtitlePaint, that.subtitlePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint, that.chartBackgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint, that.legendBackgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.legendItemPaint, that.legendItemPaint))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.drawingSupplier.equals(that.drawingSupplier))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint, that.plotBackgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.plotOutlinePaint, that.plotOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.labelLinkStyle.equals(that.labelLinkStyle))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.labelLinkPaint, that.labelLinkPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint, that.domainGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint, that.rangeGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.crosshairPaint, that.crosshairPaint))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.axisOffset.equals(that.axisOffset))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.axisLabelPaint, that.axisLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.tickLabelPaint, that.tickLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.itemLabelPaint, that.itemLabelPaint))) {
			return false;
		}
		if ((org.jfree.chart.StandardChartTheme.this.shadowVisible) != (that.shadowVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.shadowPaint, that.shadowPaint))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.barPainter.equals(that.barPainter))) {
			return false;
		}
		if (!(org.jfree.chart.StandardChartTheme.this.xyBarPainter.equals(that.xyBarPainter))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.thermometerPaint, that.thermometerPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.wallPaint, that.wallPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint, that.errorIndicatorPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.gridBandPaint, that.gridBandPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint, that.gridBandAlternatePaint))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.titlePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.subtitlePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.legendItemPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.plotOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.labelLinkPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.domainGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.crosshairPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.axisLabelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.tickLabelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.itemLabelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.shadowPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.thermometerPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.wallPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.gridBandPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.StandardChartTheme.this.titlePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.subtitlePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.chartBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.legendBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.legendItemPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.plotBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.plotOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.labelLinkPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.domainGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.rangeGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.crosshairPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.axisLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.tickLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.itemLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.shadowPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.thermometerPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.wallPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.errorIndicatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.gridBandPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.StandardChartTheme.this.gridBandAlternatePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

