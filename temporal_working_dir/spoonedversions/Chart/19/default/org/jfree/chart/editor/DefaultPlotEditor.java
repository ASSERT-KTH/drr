

package org.jfree.chart.editor;


class DefaultPlotEditor extends javax.swing.JPanel implements java.awt.event.ActionListener {
	private static final java.lang.String[] orientationNames = new java.lang.String[]{ "Vertical" , "Horizontal" };

	private static final int ORIENTATION_VERTICAL = 0;

	private static final int ORIENTATION_HORIZONTAL = 1;

	private org.jfree.chart.ui.PaintSample backgroundPaintSample;

	private org.jfree.chart.ui.StrokeSample outlineStrokeSample;

	private org.jfree.chart.ui.PaintSample outlinePaintSample;

	private org.jfree.chart.editor.DefaultAxisEditor domainAxisPropertyPanel;

	private org.jfree.chart.editor.DefaultAxisEditor rangeAxisPropertyPanel;

	private org.jfree.chart.ui.StrokeSample[] availableStrokeSamples;

	private org.jfree.chart.util.RectangleInsets plotInsets;

	private org.jfree.chart.plot.PlotOrientation plotOrientation;

	private javax.swing.JComboBox orientationCombo;

	private java.lang.Boolean drawLines;

	private javax.swing.JCheckBox drawLinesCheckBox;

	private java.lang.Boolean drawShapes;

	private javax.swing.JCheckBox drawShapesCheckBox;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.editor.LocalizationBundle");

	public DefaultPlotEditor(org.jfree.chart.plot.Plot plot) {
		org.jfree.chart.editor.DefaultPlotEditor.this.plotInsets = plot.getInsets();
		org.jfree.chart.editor.DefaultPlotEditor.this.backgroundPaintSample = new org.jfree.chart.ui.PaintSample(plot.getBackgroundPaint());
		org.jfree.chart.editor.DefaultPlotEditor.this.outlineStrokeSample = new org.jfree.chart.ui.StrokeSample(plot.getOutlineStroke());
		org.jfree.chart.editor.DefaultPlotEditor.this.outlinePaintSample = new org.jfree.chart.ui.PaintSample(plot.getOutlinePaint());
		if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
			org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation = ((org.jfree.chart.plot.CategoryPlot) (plot)).getOrientation();
		}else
			if (plot instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation = ((org.jfree.chart.plot.XYPlot) (plot)).getOrientation();
			}
		
		if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
			org.jfree.chart.renderer.category.CategoryItemRenderer renderer = ((org.jfree.chart.plot.CategoryPlot) (plot)).getRenderer();
			if (renderer instanceof org.jfree.chart.renderer.category.LineAndShapeRenderer) {
				org.jfree.chart.renderer.category.LineAndShapeRenderer r = ((org.jfree.chart.renderer.category.LineAndShapeRenderer) (renderer));
				org.jfree.chart.editor.DefaultPlotEditor.this.drawLines = java.lang.Boolean.valueOf(r.getBaseLinesVisible());
				org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes = java.lang.Boolean.valueOf(r.getBaseShapesVisible());
			}
		}else
			if (plot instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.renderer.xy.XYItemRenderer renderer = ((org.jfree.chart.plot.XYPlot) (plot)).getRenderer();
				if (renderer instanceof org.jfree.chart.renderer.xy.StandardXYItemRenderer) {
					org.jfree.chart.renderer.xy.StandardXYItemRenderer r = ((org.jfree.chart.renderer.xy.StandardXYItemRenderer) (renderer));
					org.jfree.chart.editor.DefaultPlotEditor.this.drawLines = java.lang.Boolean.valueOf(r.getPlotLines());
					org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes = java.lang.Boolean.valueOf(r.getBaseShapesVisible());
				}
			}
		
		setLayout(new java.awt.BorderLayout());
		org.jfree.chart.editor.DefaultPlotEditor.this.availableStrokeSamples = new org.jfree.chart.ui.StrokeSample[3];
		org.jfree.chart.editor.DefaultPlotEditor.this.availableStrokeSamples[0] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(1.0F));
		org.jfree.chart.editor.DefaultPlotEditor.this.availableStrokeSamples[1] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(2.0F));
		org.jfree.chart.editor.DefaultPlotEditor.this.availableStrokeSamples[2] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(3.0F));
		javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout());
		panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), ((plot.getPlotType()) + (org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString(":")))));
		javax.swing.JPanel general = new javax.swing.JPanel(new java.awt.BorderLayout());
		general.setBorder(javax.swing.BorderFactory.createTitledBorder(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("General")));
		javax.swing.JPanel interior = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(7));
		interior.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Outline_stroke")));
		javax.swing.JButton button = new javax.swing.JButton(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Select..."));
		button.setActionCommand("OutlineStroke");
		button.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
		interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.outlineStrokeSample);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Outline_Paint")));
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Select..."));
		button.setActionCommand("OutlinePaint");
		button.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
		interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.outlinePaintSample);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Background_paint")));
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Select..."));
		button.setActionCommand("BackgroundPaint");
		button.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
		interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.backgroundPaintSample);
		interior.add(button);
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation) != null) {
			boolean isVertical = org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation.equals(org.jfree.chart.plot.PlotOrientation.VERTICAL);
			int index = isVertical ? org.jfree.chart.editor.DefaultPlotEditor.ORIENTATION_VERTICAL : org.jfree.chart.editor.DefaultPlotEditor.ORIENTATION_HORIZONTAL;
			interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Orientation")));
			org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo = new javax.swing.JComboBox(org.jfree.chart.editor.DefaultPlotEditor.orientationNames);
			org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo.setSelectedIndex(index);
			org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo.setActionCommand("Orientation");
			org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
			interior.add(new javax.swing.JPanel());
			interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo);
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.drawLines) != null) {
			interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Draw_lines")));
			org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox = new javax.swing.JCheckBox();
			org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox.setSelected(org.jfree.chart.editor.DefaultPlotEditor.this.drawLines.booleanValue());
			org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox.setActionCommand("DrawLines");
			org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
			interior.add(new javax.swing.JPanel());
			interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox);
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes) != null) {
			interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Draw_shapes")));
			org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox = new javax.swing.JCheckBox();
			org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox.setSelected(org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes.booleanValue());
			org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox.setActionCommand("DrawShapes");
			org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox.addActionListener(org.jfree.chart.editor.DefaultPlotEditor.this);
			interior.add(new javax.swing.JPanel());
			interior.add(org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox);
		}
		general.add(interior, java.awt.BorderLayout.NORTH);
		javax.swing.JPanel appearance = new javax.swing.JPanel(new java.awt.BorderLayout());
		appearance.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
		appearance.add(general, java.awt.BorderLayout.NORTH);
		javax.swing.JTabbedPane tabs = new javax.swing.JTabbedPane();
		tabs.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		org.jfree.chart.axis.Axis domainAxis = null;
		if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
			domainAxis = ((org.jfree.chart.plot.CategoryPlot) (plot)).getDomainAxis();
		}else
			if (plot instanceof org.jfree.chart.plot.XYPlot) {
				domainAxis = ((org.jfree.chart.plot.XYPlot) (plot)).getDomainAxis();
			}
		
		org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel = org.jfree.chart.editor.DefaultAxisEditor.getInstance(domainAxis);
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel) != null) {
			org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
			tabs.add(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Domain_Axis"), org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel);
		}
		org.jfree.chart.axis.Axis rangeAxis = null;
		if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
			rangeAxis = ((org.jfree.chart.plot.CategoryPlot) (plot)).getRangeAxis();
		}else
			if (plot instanceof org.jfree.chart.plot.XYPlot) {
				rangeAxis = ((org.jfree.chart.plot.XYPlot) (plot)).getRangeAxis();
			}
		
		org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel = org.jfree.chart.editor.DefaultAxisEditor.getInstance(rangeAxis);
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel) != null) {
			org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
			tabs.add(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Range_Axis"), org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel);
		}
		tabs.add(org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Appearance"), appearance);
		panel.add(tabs);
		add(panel);
	}

	public org.jfree.chart.util.RectangleInsets getPlotInsets() {
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.plotInsets) == null) {
			org.jfree.chart.editor.DefaultPlotEditor.this.plotInsets = new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0);
		}
		return org.jfree.chart.editor.DefaultPlotEditor.this.plotInsets;
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.editor.DefaultPlotEditor.this.backgroundPaintSample.getPaint();
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.editor.DefaultPlotEditor.this.outlineStrokeSample.getStroke();
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.editor.DefaultPlotEditor.this.outlinePaintSample.getPaint();
	}

	public org.jfree.chart.editor.DefaultAxisEditor getDomainAxisPropertyEditPanel() {
		return org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel;
	}

	public org.jfree.chart.editor.DefaultAxisEditor getRangeAxisPropertyEditPanel() {
		return org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel;
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals("BackgroundPaint")) {
			attemptBackgroundPaintSelection();
		}else
			if (command.equals("OutlineStroke")) {
				attemptOutlineStrokeSelection();
			}else
				if (command.equals("OutlinePaint")) {
					attemptOutlinePaintSelection();
				}else
					if (command.equals("Orientation")) {
						attemptOrientationSelection();
					}else
						if (command.equals("DrawLines")) {
							attemptDrawLinesSelection();
						}else
							if (command.equals("DrawShapes")) {
								attemptDrawShapesSelection();
							}
						
					
				
			
		
	}

	private void attemptBackgroundPaintSelection() {
		java.awt.Color c;
		c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultPlotEditor.this, org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Background_Color"), java.awt.Color.blue);
		if (c != null) {
			org.jfree.chart.editor.DefaultPlotEditor.this.backgroundPaintSample.setPaint(c);
		}
	}

	private void attemptOutlineStrokeSelection() {
		org.jfree.chart.ui.StrokeChooserPanel panel = new org.jfree.chart.ui.StrokeChooserPanel(null, org.jfree.chart.editor.DefaultPlotEditor.this.availableStrokeSamples);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.editor.DefaultPlotEditor.this, panel, org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Stroke_Selection"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			org.jfree.chart.editor.DefaultPlotEditor.this.outlineStrokeSample.setStroke(panel.getSelectedStroke());
		}
	}

	private void attemptOutlinePaintSelection() {
		java.awt.Color c;
		c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultPlotEditor.this, org.jfree.chart.editor.DefaultPlotEditor.localizationResources.getString("Outline_Color"), java.awt.Color.blue);
		if (c != null) {
			org.jfree.chart.editor.DefaultPlotEditor.this.outlinePaintSample.setPaint(c);
		}
	}

	private void attemptOrientationSelection() {
		int index = org.jfree.chart.editor.DefaultPlotEditor.this.orientationCombo.getSelectedIndex();
		if (index == (org.jfree.chart.editor.DefaultPlotEditor.ORIENTATION_VERTICAL)) {
			org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation = org.jfree.chart.plot.PlotOrientation.VERTICAL;
		}else {
			org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
		}
	}

	private void attemptDrawLinesSelection() {
		org.jfree.chart.editor.DefaultPlotEditor.this.drawLines = java.lang.Boolean.valueOf(org.jfree.chart.editor.DefaultPlotEditor.this.drawLinesCheckBox.isSelected());
	}

	private void attemptDrawShapesSelection() {
		org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes = java.lang.Boolean.valueOf(org.jfree.chart.editor.DefaultPlotEditor.this.drawShapesCheckBox.isSelected());
	}

	public void updatePlotProperties(org.jfree.chart.plot.Plot plot) {
		plot.setOutlinePaint(getOutlinePaint());
		plot.setOutlineStroke(getOutlineStroke());
		plot.setBackgroundPaint(getBackgroundPaint());
		plot.setInsets(getPlotInsets());
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel) != null) {
			org.jfree.chart.axis.Axis domainAxis = null;
			if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (plot));
				domainAxis = p.getDomainAxis();
			}else
				if (plot instanceof org.jfree.chart.plot.XYPlot) {
					org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (plot));
					domainAxis = p.getDomainAxis();
				}
			
			if (domainAxis != null) {
				org.jfree.chart.editor.DefaultPlotEditor.this.domainAxisPropertyPanel.setAxisProperties(domainAxis);
			}
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel) != null) {
			org.jfree.chart.axis.Axis rangeAxis = null;
			if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (plot));
				rangeAxis = p.getRangeAxis();
			}else
				if (plot instanceof org.jfree.chart.plot.XYPlot) {
					org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (plot));
					rangeAxis = p.getRangeAxis();
				}
			
			if (rangeAxis != null) {
				org.jfree.chart.editor.DefaultPlotEditor.this.rangeAxisPropertyPanel.setAxisProperties(rangeAxis);
			}
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation) != null) {
			if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (plot));
				p.setOrientation(org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation);
			}else
				if (plot instanceof org.jfree.chart.plot.XYPlot) {
					org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (plot));
					p.setOrientation(org.jfree.chart.editor.DefaultPlotEditor.this.plotOrientation);
				}
			
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.drawLines) != null) {
			if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (plot));
				org.jfree.chart.renderer.category.CategoryItemRenderer r = p.getRenderer();
				if (r instanceof org.jfree.chart.renderer.category.LineAndShapeRenderer) {
					((org.jfree.chart.renderer.category.LineAndShapeRenderer) (r)).setBaseLinesVisible(org.jfree.chart.editor.DefaultPlotEditor.this.drawLines.booleanValue());
				}
			}else
				if (plot instanceof org.jfree.chart.plot.XYPlot) {
					org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (plot));
					org.jfree.chart.renderer.xy.XYItemRenderer r = p.getRenderer();
					if (r instanceof org.jfree.chart.renderer.xy.StandardXYItemRenderer) {
						((org.jfree.chart.renderer.xy.StandardXYItemRenderer) (r)).setPlotLines(org.jfree.chart.editor.DefaultPlotEditor.this.drawLines.booleanValue());
					}
				}
			
		}
		if ((org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes) != null) {
			if (plot instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (plot));
				org.jfree.chart.renderer.category.CategoryItemRenderer r = p.getRenderer();
				if (r instanceof org.jfree.chart.renderer.category.LineAndShapeRenderer) {
					((org.jfree.chart.renderer.category.LineAndShapeRenderer) (r)).setBaseShapesVisible(org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes.booleanValue());
				}
			}else
				if (plot instanceof org.jfree.chart.plot.XYPlot) {
					org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (plot));
					org.jfree.chart.renderer.xy.XYItemRenderer r = p.getRenderer();
					if (r instanceof org.jfree.chart.renderer.xy.StandardXYItemRenderer) {
						((org.jfree.chart.renderer.xy.StandardXYItemRenderer) (r)).setBaseShapesVisible(org.jfree.chart.editor.DefaultPlotEditor.this.drawShapes.booleanValue());
					}
				}
			
		}
	}
}

