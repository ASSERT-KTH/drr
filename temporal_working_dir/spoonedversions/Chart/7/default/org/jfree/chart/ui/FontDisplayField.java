

package org.jfree.chart.ui;


public class FontDisplayField extends javax.swing.JTextField {
	private java.awt.Font displayFont;

	protected static final java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.ui.LocalizationBundle");

	public FontDisplayField(java.awt.Font font) {
		super("");
		setDisplayFont(font);
		setEnabled(false);
	}

	public java.awt.Font getDisplayFont() {
		return org.jfree.chart.ui.FontDisplayField.this.displayFont;
	}

	public void setDisplayFont(java.awt.Font font) {
		org.jfree.chart.ui.FontDisplayField.this.displayFont = font;
		setText(fontToString(org.jfree.chart.ui.FontDisplayField.this.displayFont));
	}

	private java.lang.String fontToString(java.awt.Font font) {
		if (font != null) {
			return ((font.getFontName()) + ", ") + (font.getSize());
		}else {
			return org.jfree.chart.ui.FontDisplayField.localizationResources.getString("No_Font_Selected");
		}
	}
}

