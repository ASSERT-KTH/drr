

package org.jfree.chart.editor;


class DefaultAxisEditor extends javax.swing.JPanel implements java.awt.event.ActionListener {
	private javax.swing.JTextField label;

	private java.awt.Font labelFont;

	private org.jfree.chart.ui.PaintSample labelPaintSample;

	private javax.swing.JTextField labelFontField;

	private java.awt.Font tickLabelFont;

	private javax.swing.JTextField tickLabelFontField;

	private org.jfree.chart.ui.PaintSample tickLabelPaintSample;

	private javax.swing.JPanel slot1;

	private javax.swing.JPanel slot2;

	private javax.swing.JCheckBox showTickLabelsCheckBox;

	private javax.swing.JCheckBox showTickMarksCheckBox;

	private org.jfree.chart.util.RectangleInsets tickLabelInsets;

	private org.jfree.chart.util.RectangleInsets labelInsets;

	private javax.swing.JTabbedPane otherTabs;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle");

	public static org.jfree.chart.editor.DefaultAxisEditor getInstance(org.jfree.chart.axis.Axis axis) {
		if (axis != null) {
			if (axis instanceof org.jfree.chart.axis.NumberAxis) {
				return new org.jfree.chart.editor.DefaultNumberAxisEditor(((org.jfree.chart.axis.NumberAxis) (axis)));
			}else {
				return new org.jfree.chart.editor.DefaultAxisEditor(axis);
			}
		}else {
			return null;
		}
	}

	public DefaultAxisEditor(org.jfree.chart.axis.Axis axis) {
		org.jfree.chart.editor.DefaultAxisEditor.this.labelFont = axis.getLabelFont();
		org.jfree.chart.editor.DefaultAxisEditor.this.labelPaintSample = new org.jfree.chart.ui.PaintSample(axis.getLabelPaint());
		org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont = axis.getTickLabelFont();
		org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelPaintSample = new org.jfree.chart.ui.PaintSample(axis.getTickLabelPaint());
		org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelInsets = axis.getTickLabelInsets();
		org.jfree.chart.editor.DefaultAxisEditor.this.labelInsets = axis.getLabelInsets();
		setLayout(new java.awt.BorderLayout());
		javax.swing.JPanel general = new javax.swing.JPanel(new java.awt.BorderLayout());
		general.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("General")));
		javax.swing.JPanel interior = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(5));
		interior.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Label")));
		org.jfree.chart.editor.DefaultAxisEditor.this.label = new javax.swing.JTextField(axis.getLabel());
		interior.add(org.jfree.chart.editor.DefaultAxisEditor.this.label);
		interior.add(new javax.swing.JPanel());
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Font")));
		org.jfree.chart.editor.DefaultAxisEditor.this.labelFontField = new org.jfree.chart.ui.FontDisplayField(org.jfree.chart.editor.DefaultAxisEditor.this.labelFont);
		interior.add(org.jfree.chart.editor.DefaultAxisEditor.this.labelFontField);
		javax.swing.JButton b = new javax.swing.JButton(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Select..."));
		b.setActionCommand("SelectLabelFont");
		b.addActionListener(org.jfree.chart.editor.DefaultAxisEditor.this);
		interior.add(b);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Paint")));
		interior.add(org.jfree.chart.editor.DefaultAxisEditor.this.labelPaintSample);
		b = new javax.swing.JButton(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Select..."));
		b.setActionCommand("SelectLabelPaint");
		b.addActionListener(org.jfree.chart.editor.DefaultAxisEditor.this);
		interior.add(b);
		general.add(interior);
		add(general, java.awt.BorderLayout.NORTH);
		org.jfree.chart.editor.DefaultAxisEditor.this.slot1 = new javax.swing.JPanel(new java.awt.BorderLayout());
		javax.swing.JPanel other = new javax.swing.JPanel(new java.awt.BorderLayout());
		other.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Other")));
		org.jfree.chart.editor.DefaultAxisEditor.this.otherTabs = new javax.swing.JTabbedPane();
		org.jfree.chart.editor.DefaultAxisEditor.this.otherTabs.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		javax.swing.JPanel ticks = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(3));
		ticks.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
		org.jfree.chart.editor.DefaultAxisEditor.this.showTickLabelsCheckBox = new javax.swing.JCheckBox(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Show_tick_labels"), axis.isTickLabelsVisible());
		ticks.add(org.jfree.chart.editor.DefaultAxisEditor.this.showTickLabelsCheckBox);
		ticks.add(new javax.swing.JPanel());
		ticks.add(new javax.swing.JPanel());
		ticks.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Tick_label_font")));
		org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFontField = new org.jfree.chart.ui.FontDisplayField(org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont);
		ticks.add(org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFontField);
		b = new javax.swing.JButton(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Select..."));
		b.setActionCommand("SelectTickLabelFont");
		b.addActionListener(org.jfree.chart.editor.DefaultAxisEditor.this);
		ticks.add(b);
		org.jfree.chart.editor.DefaultAxisEditor.this.showTickMarksCheckBox = new javax.swing.JCheckBox(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Show_tick_marks"), axis.isTickMarksVisible());
		ticks.add(org.jfree.chart.editor.DefaultAxisEditor.this.showTickMarksCheckBox);
		ticks.add(new javax.swing.JPanel());
		ticks.add(new javax.swing.JPanel());
		org.jfree.chart.editor.DefaultAxisEditor.this.otherTabs.add(org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Ticks"), ticks);
		other.add(org.jfree.chart.editor.DefaultAxisEditor.this.otherTabs);
		org.jfree.chart.editor.DefaultAxisEditor.this.slot1.add(other);
		org.jfree.chart.editor.DefaultAxisEditor.this.slot2 = new javax.swing.JPanel(new java.awt.BorderLayout());
		org.jfree.chart.editor.DefaultAxisEditor.this.slot2.add(org.jfree.chart.editor.DefaultAxisEditor.this.slot1, java.awt.BorderLayout.NORTH);
		add(org.jfree.chart.editor.DefaultAxisEditor.this.slot2);
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.label.getText();
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.labelFont;
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.labelPaintSample.getPaint();
	}

	public boolean isTickLabelsVisible() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.showTickLabelsCheckBox.isSelected();
	}

	public java.awt.Font getTickLabelFont() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont;
	}

	public java.awt.Paint getTickLabelPaint() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelPaintSample.getPaint();
	}

	public boolean isTickMarksVisible() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.showTickMarksCheckBox.isSelected();
	}

	public org.jfree.chart.util.RectangleInsets getTickLabelInsets() {
		return (org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelInsets) == null ? new org.jfree.chart.util.RectangleInsets(0, 0, 0, 0) : org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelInsets;
	}

	public org.jfree.chart.util.RectangleInsets getLabelInsets() {
		return (org.jfree.chart.editor.DefaultAxisEditor.this.labelInsets) == null ? new org.jfree.chart.util.RectangleInsets(0, 0, 0, 0) : org.jfree.chart.editor.DefaultAxisEditor.this.labelInsets;
	}

	public javax.swing.JTabbedPane getOtherTabs() {
		return org.jfree.chart.editor.DefaultAxisEditor.this.otherTabs;
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals("SelectLabelFont")) {
			attemptLabelFontSelection();
		}else
			if (command.equals("SelectLabelPaint")) {
				attemptModifyLabelPaint();
			}else
				if (command.equals("SelectTickLabelFont")) {
					attemptTickLabelFontSelection();
				}
			
		
	}

	private void attemptLabelFontSelection() {
		org.jfree.chart.ui.FontChooserPanel panel = new org.jfree.chart.ui.FontChooserPanel(org.jfree.chart.editor.DefaultAxisEditor.this.labelFont);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.editor.DefaultAxisEditor.this, panel, org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Font_Selection"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			org.jfree.chart.editor.DefaultAxisEditor.this.labelFont = panel.getSelectedFont();
			org.jfree.chart.editor.DefaultAxisEditor.this.labelFontField.setText((((org.jfree.chart.editor.DefaultAxisEditor.this.labelFont.getFontName()) + " ") + (org.jfree.chart.editor.DefaultAxisEditor.this.labelFont.getSize())));
		}
	}

	private void attemptModifyLabelPaint() {
		java.awt.Color c;
		c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultAxisEditor.this, org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Label_Color"), java.awt.Color.blue);
		if (c != null) {
			org.jfree.chart.editor.DefaultAxisEditor.this.labelPaintSample.setPaint(c);
		}
	}

	public void attemptTickLabelFontSelection() {
		org.jfree.chart.ui.FontChooserPanel panel = new org.jfree.chart.ui.FontChooserPanel(org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.editor.DefaultAxisEditor.this, panel, org.jfree.chart.editor.DefaultAxisEditor.localizationResources.getString("Font_Selection"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont = panel.getSelectedFont();
			org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFontField.setText((((org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont.getFontName()) + " ") + (org.jfree.chart.editor.DefaultAxisEditor.this.tickLabelFont.getSize())));
		}
	}

	public void setAxisProperties(org.jfree.chart.axis.Axis axis) {
		axis.setLabel(getLabel());
		axis.setLabelFont(getLabelFont());
		axis.setLabelPaint(getLabelPaint());
		axis.setTickMarksVisible(isTickMarksVisible());
		axis.setTickLabelsVisible(isTickLabelsVisible());
		axis.setTickLabelFont(getTickLabelFont());
		axis.setTickLabelPaint(getTickLabelPaint());
		axis.setTickLabelInsets(getTickLabelInsets());
		axis.setLabelInsets(getLabelInsets());
	}
}

