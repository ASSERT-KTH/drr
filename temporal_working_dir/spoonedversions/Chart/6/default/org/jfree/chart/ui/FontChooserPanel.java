

package org.jfree.chart.ui;


public class FontChooserPanel extends javax.swing.JPanel {
	public static final java.lang.String[] SIZES = new java.lang.String[]{ "9" , "10" , "11" , "12" , "14" , "16" , "18" , "20" , "22" , "24" , "28" , "36" , "48" , "72" };

	private javax.swing.JList fontlist;

	private javax.swing.JList sizelist;

	private javax.swing.JCheckBox bold;

	private javax.swing.JCheckBox italic;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.ui.LocalizationBundle");

	public FontChooserPanel(java.awt.Font font) {
		java.awt.GraphicsEnvironment g = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
		java.lang.String[] fonts = g.getAvailableFontFamilyNames();
		setLayout(new java.awt.BorderLayout());
		javax.swing.JPanel right = new javax.swing.JPanel(new java.awt.BorderLayout());
		javax.swing.JPanel fontPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
		fontPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.ui.FontChooserPanel.localizationResources.getString("Font")));
		org.jfree.chart.ui.FontChooserPanel.this.fontlist = new javax.swing.JList(fonts);
		javax.swing.JScrollPane fontpane = new javax.swing.JScrollPane(org.jfree.chart.ui.FontChooserPanel.this.fontlist);
		fontpane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		fontPanel.add(fontpane);
		add(fontPanel);
		javax.swing.JPanel sizePanel = new javax.swing.JPanel(new java.awt.BorderLayout());
		sizePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.ui.FontChooserPanel.localizationResources.getString("Size")));
		org.jfree.chart.ui.FontChooserPanel.this.sizelist = new javax.swing.JList(org.jfree.chart.ui.FontChooserPanel.SIZES);
		javax.swing.JScrollPane sizepane = new javax.swing.JScrollPane(org.jfree.chart.ui.FontChooserPanel.this.sizelist);
		sizepane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		sizePanel.add(sizepane);
		javax.swing.JPanel attributes = new javax.swing.JPanel(new java.awt.GridLayout(1, 2));
		org.jfree.chart.ui.FontChooserPanel.this.bold = new javax.swing.JCheckBox(org.jfree.chart.ui.FontChooserPanel.localizationResources.getString("Bold"));
		org.jfree.chart.ui.FontChooserPanel.this.italic = new javax.swing.JCheckBox(org.jfree.chart.ui.FontChooserPanel.localizationResources.getString("Italic"));
		attributes.add(org.jfree.chart.ui.FontChooserPanel.this.bold);
		attributes.add(org.jfree.chart.ui.FontChooserPanel.this.italic);
		attributes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.ui.FontChooserPanel.localizationResources.getString("Attributes")));
		right.add(sizePanel, java.awt.BorderLayout.CENTER);
		right.add(attributes, java.awt.BorderLayout.SOUTH);
		add(right, java.awt.BorderLayout.EAST);
		setSelectedFont(font);
	}

	public java.awt.Font getSelectedFont() {
		return new java.awt.Font(getSelectedName(), getSelectedStyle(), getSelectedSize());
	}

	public java.lang.String getSelectedName() {
		return ((java.lang.String) (org.jfree.chart.ui.FontChooserPanel.this.fontlist.getSelectedValue()));
	}

	public int getSelectedStyle() {
		if ((org.jfree.chart.ui.FontChooserPanel.this.bold.isSelected()) && (org.jfree.chart.ui.FontChooserPanel.this.italic.isSelected())) {
			return (java.awt.Font.BOLD) + (java.awt.Font.ITALIC);
		}
		if (org.jfree.chart.ui.FontChooserPanel.this.bold.isSelected()) {
			return java.awt.Font.BOLD;
		}
		if (org.jfree.chart.ui.FontChooserPanel.this.italic.isSelected()) {
			return java.awt.Font.ITALIC;
		}else {
			return java.awt.Font.PLAIN;
		}
	}

	public int getSelectedSize() {
		java.lang.String selected = ((java.lang.String) (org.jfree.chart.ui.FontChooserPanel.this.sizelist.getSelectedValue()));
		if (selected != null) {
			return java.lang.Integer.parseInt(selected);
		}else {
			return 10;
		}
	}

	public void setSelectedFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.NullPointerException();
		}
		org.jfree.chart.ui.FontChooserPanel.this.bold.setSelected(font.isBold());
		org.jfree.chart.ui.FontChooserPanel.this.italic.setSelected(font.isItalic());
		java.lang.String fontName = font.getName();
		javax.swing.ListModel model = org.jfree.chart.ui.FontChooserPanel.this.fontlist.getModel();
		org.jfree.chart.ui.FontChooserPanel.this.fontlist.clearSelection();
		for (int i = 0; i < (model.getSize()); i++) {
			if (fontName.equals(model.getElementAt(i))) {
				org.jfree.chart.ui.FontChooserPanel.this.fontlist.setSelectedIndex(i);
				break;
			}
		}
		java.lang.String fontSize = java.lang.String.valueOf(font.getSize());
		model = org.jfree.chart.ui.FontChooserPanel.this.sizelist.getModel();
		org.jfree.chart.ui.FontChooserPanel.this.sizelist.clearSelection();
		for (int i = 0; i < (model.getSize()); i++) {
			if (fontSize.equals(model.getElementAt(i))) {
				org.jfree.chart.ui.FontChooserPanel.this.sizelist.setSelectedIndex(i);
				break;
			}
		}
	}
}

