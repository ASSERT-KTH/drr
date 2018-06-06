

package org.jfree.chart.editor;


class DefaultNumberAxisEditor extends org.jfree.chart.editor.DefaultAxisEditor implements java.awt.event.FocusListener {
	private boolean autoRange;

	private double minimumValue;

	private double maximumValue;

	private javax.swing.JCheckBox autoRangeCheckBox;

	private javax.swing.JTextField minimumRangeValue;

	private javax.swing.JTextField maximumRangeValue;

	private org.jfree.chart.ui.PaintSample gridPaintSample;

	private org.jfree.chart.ui.StrokeSample gridStrokeSample;

	private org.jfree.chart.ui.StrokeSample[] availableStrokeSamples;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle");

	public DefaultNumberAxisEditor(org.jfree.chart.axis.NumberAxis axis) {
		super(axis);
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange = axis.isAutoRange();
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue = axis.getLowerBound();
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue = axis.getUpperBound();
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.gridPaintSample = new org.jfree.chart.ui.PaintSample(java.awt.Color.blue);
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.gridStrokeSample = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(1.0F));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.availableStrokeSamples = new org.jfree.chart.ui.StrokeSample[3];
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.availableStrokeSamples[0] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(1.0F));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.availableStrokeSamples[1] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(2.0F));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.availableStrokeSamples[2] = new org.jfree.chart.ui.StrokeSample(new java.awt.BasicStroke(3.0F));
		javax.swing.JTabbedPane other = getOtherTabs();
		javax.swing.JPanel range = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(3));
		range.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
		range.add(new javax.swing.JPanel());
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRangeCheckBox = new javax.swing.JCheckBox(org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Auto-adjust_range"), org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange);
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRangeCheckBox.setActionCommand("AutoRangeOnOff");
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRangeCheckBox.addActionListener(org.jfree.chart.editor.DefaultNumberAxisEditor.this);
		range.add(org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRangeCheckBox);
		range.add(new javax.swing.JPanel());
		range.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Minimum_range_value")));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue = new javax.swing.JTextField(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setEnabled((!(org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange)));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setActionCommand("MinimumRange");
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.addActionListener(org.jfree.chart.editor.DefaultNumberAxisEditor.this);
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.addFocusListener(org.jfree.chart.editor.DefaultNumberAxisEditor.this);
		range.add(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue);
		range.add(new javax.swing.JPanel());
		range.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Maximum_range_value")));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue = new javax.swing.JTextField(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setEnabled((!(org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange)));
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setActionCommand("MaximumRange");
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.addActionListener(org.jfree.chart.editor.DefaultNumberAxisEditor.this);
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.addFocusListener(org.jfree.chart.editor.DefaultNumberAxisEditor.this);
		range.add(org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue);
		range.add(new javax.swing.JPanel());
		other.add(org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Range"), range);
	}

	public boolean isAutoRange() {
		return org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange;
	}

	public double getMinimumValue() {
		return org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue;
	}

	public double getMaximumValue() {
		return org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue;
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals("GridStroke")) {
			attemptGridStrokeSelection();
		}else
			if (command.equals("GridPaint")) {
				attemptGridPaintSelection();
			}else
				if (command.equals("AutoRangeOnOff")) {
					toggleAutoRange();
				}else
					if (command.equals("MinimumRange")) {
						validateMinimum();
					}else
						if (command.equals("MaximumRange")) {
							validateMaximum();
						}else {
							super.actionPerformed(event);
						}
					
				
			
		
	}

	private void attemptGridStrokeSelection() {
		org.jfree.chart.ui.StrokeChooserPanel panel = new org.jfree.chart.ui.StrokeChooserPanel(org.jfree.chart.editor.DefaultNumberAxisEditor.this.gridStrokeSample, org.jfree.chart.editor.DefaultNumberAxisEditor.this.availableStrokeSamples);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.editor.DefaultNumberAxisEditor.this, panel, org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Stroke_Selection"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.gridStrokeSample.setStroke(panel.getSelectedStroke());
		}
	}

	private void attemptGridPaintSelection() {
		java.awt.Color c;
		c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultNumberAxisEditor.this, org.jfree.chart.editor.DefaultNumberAxisEditor.localizationResources.getString("Grid_Color"), java.awt.Color.blue);
		if (c != null) {
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.gridPaintSample.setPaint(c);
		}
	}

	public void focusGained(java.awt.event.FocusEvent event) {
	}

	public void focusLost(java.awt.event.FocusEvent event) {
		if ((event.getSource()) == (org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue)) {
			validateMinimum();
		}else
			if ((event.getSource()) == (org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue)) {
				validateMaximum();
			}
		
	}

	public void toggleAutoRange() {
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange = org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRangeCheckBox.isSelected();
		if (org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange) {
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setText(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue));
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setEnabled(false);
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setText(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue));
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setEnabled(false);
		}else {
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setEnabled(true);
			org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setEnabled(true);
		}
	}

	public void validateMinimum() {
		double newMin;
		try {
			newMin = java.lang.Double.parseDouble(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.getText());
			if (newMin >= (org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue)) {
				newMin = org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue;
			}
		} catch (java.lang.NumberFormatException e) {
			newMin = org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue;
		}
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue = newMin;
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumRangeValue.setText(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue));
	}

	public void validateMaximum() {
		double newMax;
		try {
			newMax = java.lang.Double.parseDouble(org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.getText());
			if (newMax <= (org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue)) {
				newMax = org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue;
			}
		} catch (java.lang.NumberFormatException e) {
			newMax = org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue;
		}
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue = newMax;
		org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumRangeValue.setText(java.lang.Double.toString(org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue));
	}

	public void setAxisProperties(org.jfree.chart.axis.Axis axis) {
		super.setAxisProperties(axis);
		org.jfree.chart.axis.NumberAxis numberAxis = ((org.jfree.chart.axis.NumberAxis) (axis));
		numberAxis.setAutoRange(org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange);
		if (!(org.jfree.chart.editor.DefaultNumberAxisEditor.this.autoRange)) {
			numberAxis.setRange(org.jfree.chart.editor.DefaultNumberAxisEditor.this.minimumValue, org.jfree.chart.editor.DefaultNumberAxisEditor.this.maximumValue);
		}
	}
}

