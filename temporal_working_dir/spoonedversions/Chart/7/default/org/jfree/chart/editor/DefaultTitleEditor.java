

package org.jfree.chart.editor;


class DefaultTitleEditor extends javax.swing.JPanel implements java.awt.event.ActionListener {
	private boolean showTitle;

	private javax.swing.JCheckBox showTitleCheckBox;

	private javax.swing.JTextField titleField;

	private java.awt.Font titleFont;

	private javax.swing.JTextField fontfield;

	private javax.swing.JButton selectFontButton;

	private org.jfree.chart.ui.PaintSample titlePaint;

	private javax.swing.JButton selectPaintButton;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.editor.LocalizationBundle");

	public DefaultTitleEditor(org.jfree.chart.title.Title title) {
		org.jfree.chart.title.TextTitle t = title != null ? ((org.jfree.chart.title.TextTitle) (title)) : new org.jfree.chart.title.TextTitle(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Title"));
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitle = title != null;
		org.jfree.chart.editor.DefaultTitleEditor.this.titleFont = t.getFont();
		org.jfree.chart.editor.DefaultTitleEditor.this.titleField = new javax.swing.JTextField(t.getText());
		org.jfree.chart.editor.DefaultTitleEditor.this.titlePaint = new org.jfree.chart.ui.PaintSample(t.getPaint());
		setLayout(new java.awt.BorderLayout());
		javax.swing.JPanel general = new javax.swing.JPanel(new java.awt.BorderLayout());
		general.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("General")));
		javax.swing.JPanel interior = new javax.swing.JPanel(new org.jfree.chart.ui.LCBLayout(4));
		interior.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
		interior.add(new javax.swing.JLabel(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Show_Title")));
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox = new javax.swing.JCheckBox();
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox.setSelected(org.jfree.chart.editor.DefaultTitleEditor.this.showTitle);
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox.setActionCommand("ShowTitle");
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox.addActionListener(org.jfree.chart.editor.DefaultTitleEditor.this);
		interior.add(new javax.swing.JPanel());
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox);
		javax.swing.JLabel titleLabel = new javax.swing.JLabel(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Text"));
		interior.add(titleLabel);
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.titleField);
		interior.add(new javax.swing.JPanel());
		javax.swing.JLabel fontLabel = new javax.swing.JLabel(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Font"));
		org.jfree.chart.editor.DefaultTitleEditor.this.fontfield = new org.jfree.chart.ui.FontDisplayField(org.jfree.chart.editor.DefaultTitleEditor.this.titleFont);
		org.jfree.chart.editor.DefaultTitleEditor.this.selectFontButton = new javax.swing.JButton(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Select..."));
		org.jfree.chart.editor.DefaultTitleEditor.this.selectFontButton.setActionCommand("SelectFont");
		org.jfree.chart.editor.DefaultTitleEditor.this.selectFontButton.addActionListener(org.jfree.chart.editor.DefaultTitleEditor.this);
		interior.add(fontLabel);
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.fontfield);
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.selectFontButton);
		javax.swing.JLabel colorLabel = new javax.swing.JLabel(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Color"));
		org.jfree.chart.editor.DefaultTitleEditor.this.selectPaintButton = new javax.swing.JButton(org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Select..."));
		org.jfree.chart.editor.DefaultTitleEditor.this.selectPaintButton.setActionCommand("SelectPaint");
		org.jfree.chart.editor.DefaultTitleEditor.this.selectPaintButton.addActionListener(org.jfree.chart.editor.DefaultTitleEditor.this);
		interior.add(colorLabel);
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.titlePaint);
		interior.add(org.jfree.chart.editor.DefaultTitleEditor.this.selectPaintButton);
		org.jfree.chart.editor.DefaultTitleEditor.this.enableOrDisableControls();
		general.add(interior);
		add(general, java.awt.BorderLayout.NORTH);
	}

	public java.lang.String getTitleText() {
		return org.jfree.chart.editor.DefaultTitleEditor.this.titleField.getText();
	}

	public java.awt.Font getTitleFont() {
		return org.jfree.chart.editor.DefaultTitleEditor.this.titleFont;
	}

	public java.awt.Paint getTitlePaint() {
		return org.jfree.chart.editor.DefaultTitleEditor.this.titlePaint.getPaint();
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		if (command.equals("SelectFont")) {
			attemptFontSelection();
		}else
			if (command.equals("SelectPaint")) {
				attemptPaintSelection();
			}else
				if (command.equals("ShowTitle")) {
					attemptModifyShowTitle();
				}
			
		
	}

	public void attemptFontSelection() {
		org.jfree.chart.ui.FontChooserPanel panel = new org.jfree.chart.ui.FontChooserPanel(org.jfree.chart.editor.DefaultTitleEditor.this.titleFont);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.editor.DefaultTitleEditor.this, panel, org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Font_Selection"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			org.jfree.chart.editor.DefaultTitleEditor.this.titleFont = panel.getSelectedFont();
			org.jfree.chart.editor.DefaultTitleEditor.this.fontfield.setText((((org.jfree.chart.editor.DefaultTitleEditor.this.titleFont.getFontName()) + " ") + (org.jfree.chart.editor.DefaultTitleEditor.this.titleFont.getSize())));
		}
	}

	public void attemptPaintSelection() {
		java.awt.Paint p = org.jfree.chart.editor.DefaultTitleEditor.this.titlePaint.getPaint();
		java.awt.Color defaultColor = p instanceof java.awt.Color ? ((java.awt.Color) (p)) : java.awt.Color.blue;
		java.awt.Color c = javax.swing.JColorChooser.showDialog(org.jfree.chart.editor.DefaultTitleEditor.this, org.jfree.chart.editor.DefaultTitleEditor.localizationResources.getString("Title_Color"), defaultColor);
		if (c != null) {
			org.jfree.chart.editor.DefaultTitleEditor.this.titlePaint.setPaint(c);
		}
	}

	private void attemptModifyShowTitle() {
		org.jfree.chart.editor.DefaultTitleEditor.this.showTitle = org.jfree.chart.editor.DefaultTitleEditor.this.showTitleCheckBox.isSelected();
		org.jfree.chart.editor.DefaultTitleEditor.this.enableOrDisableControls();
	}

	private void enableOrDisableControls() {
		boolean enabled = (org.jfree.chart.editor.DefaultTitleEditor.this.showTitle) == true;
		org.jfree.chart.editor.DefaultTitleEditor.this.titleField.setEnabled(enabled);
		org.jfree.chart.editor.DefaultTitleEditor.this.selectFontButton.setEnabled(enabled);
		org.jfree.chart.editor.DefaultTitleEditor.this.selectPaintButton.setEnabled(enabled);
	}

	public void setTitleProperties(org.jfree.chart.JFreeChart chart) {
		if (org.jfree.chart.editor.DefaultTitleEditor.this.showTitle) {
			org.jfree.chart.title.TextTitle title = chart.getTitle();
			if (title == null) {
				title = new org.jfree.chart.title.TextTitle();
				chart.setTitle(title);
			}
			title.setText(getTitleText());
			title.setFont(getTitleFont());
			title.setPaint(getTitlePaint());
		}else {
			chart.setTitle(((org.jfree.chart.title.TextTitle) (null)));
		}
	}
}

