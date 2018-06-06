

package org.jfree.chart.editor;


class DefaultChartEditor extends javax.swing.JPanel implements java.awt.event.ActionListener , org.jfree.chart.editor.ChartEditor {
	private org.jfree.chart.editor.DefaultTitleEditor titleEditor;

	private org.jfree.chart.editor.DefaultPlotEditor plotEditor;

	private javax.swing.JCheckBox antialias;

	private org.jfree.chart.ui.PaintSample background;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.editor.LocalizationBundle");

	public DefaultChartEditor(org.jfree.chart.JFreeChart chart) {
		setLayout(new java.awt.BorderLayout());
		javax.swing.JPanel other = new javax.swing.JPanel(new java.awt.BorderLayout());
		other.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
		javax.swing.JPanel general = new javax.swing.JPanel(new java.awt.BorderLayout());
		general.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("General")));
		javax.swing.JPanel interior = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(6));
		interior.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		org.jfree.chart.editor.DefaultChartEditor.this.antialias = new javax.swing.JCheckBox(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Draw_anti-aliased"));
		org.jfree.chart.editor.DefaultChartEditor.this.antialias.setSelected(chart.getAntiAlias());
		interior.add(org.jfree.chart.editor.DefaultChartEditor.this.antialias);
		interior.add(new javax.swing.JLabel(""));
		interior.add(new javax.swing.JLabel(""));
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Background_paint")));
		org.jfree.chart.editor.DefaultChartEditor.this.background = new org.jfree.chart.ui.PaintSample(chart.getBackgroundPaint());
		interior.add(org.jfree.chart.editor.DefaultChartEditor.this.background);
		javax.swing.JButton button = new javax.swing.JButton(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Select..."));
		button.setActionCommand("BackgroundPaint");
		button.addActionListener(org.jfree.chart.editor.DefaultChartEditor.this);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Series_Paint")));
		javax.swing.JTextField info = new javax.swing.JTextField(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("No_editor_implemented"));
		info.setEnabled(false);
		interior.add(info);
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Edit..."));
		button.setEnabled(false);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Series_Stroke")));
		info = new javax.swing.JTextField(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("No_editor_implemented"));
		info.setEnabled(false);
		interior.add(info);
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Edit..."));
		button.setEnabled(false);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Series_Outline_Paint")));
		info = new javax.swing.JTextField(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("No_editor_implemented"));
		info.setEnabled(false);
		interior.add(info);
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Edit..."));
		button.setEnabled(false);
		interior.add(button);
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Series_Outline_Stroke")));
		info = new javax.swing.JTextField(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("No_editor_implemented"));
		info.setEnabled(false);
		interior.add(info);
		button = new javax.swing.JButton(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Edit..."));
		button.setEnabled(false);
		interior.add(button);
		general.add(interior, java.awt.BorderLayout.NORTH);
		other.add(general, java.awt.BorderLayout.NORTH);
		javax.swing.JPanel parts = new javax.swing.JPanel(new java.awt.BorderLayout());
		org.jfree.chart.title.Title title = chart.getTitle();
		org.jfree.chart.plot.Plot plot = chart.getPlot();
		javax.swing.JTabbedPane tabs = new javax.swing.JTabbedPane();
		org.jfree.chart.editor.DefaultChartEditor.this.titleEditor = new org.jfree.chart.editor.DefaultTitleEditor(title);
		org.jfree.chart.editor.DefaultChartEditor.this.titleEditor.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
		tabs.addTab(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Title"), org.jfree.chart.editor.DefaultChartEditor.this.titleEditor);
		org.jfree.chart.editor.DefaultChartEditor.this.plotEditor = new org.jfree.chart.editor.DefaultPlotEditor(plot);
		org.jfree.chart.editor.DefaultChartEditor.this.plotEditor.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
		tabs.addTab(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Plot"), org.jfree.chart.editor.DefaultChartEditor.this.plotEditor);
		tabs.add(org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Other"), other);
		parts.add(tabs, java.awt.BorderLayout.NORTH);
		add(parts);
	}

	public org.jfree.chart.editor.DefaultTitleEditor getTitleEditor() {
		return org.jfree.chart.editor.DefaultChartEditor.this.titleEditor;
	}

	public org.jfree.chart.editor.DefaultPlotEditor getPlotEditor() {
		return org.jfree.chart.editor.DefaultChartEditor.this.plotEditor;
	}

	public boolean getAntiAlias() {
		return org.jfree.chart.editor.DefaultChartEditor.this.antialias.isSelected();
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.editor.DefaultChartEditor.this.background.getPaint();
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals("BackgroundPaint")) {
			attemptModifyBackgroundPaint();
		}
	}

	private void attemptModifyBackgroundPaint() {
		java.awt.Color c;
		c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultChartEditor.this, org.jfree.chart.editor.DefaultChartEditor.localizationResources.getString("Background_Color"), java.awt.Color.blue);
		if (c != null) {
			org.jfree.chart.editor.DefaultChartEditor.this.background.setPaint(c);
		}
	}

	public void updateChart(org.jfree.chart.JFreeChart chart) {
		org.jfree.chart.editor.DefaultChartEditor.this.titleEditor.setTitleProperties(chart);
		org.jfree.chart.editor.DefaultChartEditor.this.plotEditor.updatePlotProperties(chart.getPlot());
		chart.setAntiAlias(getAntiAlias());
		chart.setBackgroundPaint(getBackgroundPaint());
	}
}

