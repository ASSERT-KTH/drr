

package org.jfree.chart.labels;


public class StandardPieSectionLabelGenerator extends org.jfree.chart.labels.AbstractPieItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.PieSectionLabelGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 3064190563760203668L;

	public static final java.lang.String DEFAULT_SECTION_LABEL_FORMAT = "{0}";

	private org.jfree.chart.util.ObjectList attributedLabels;

	public StandardPieSectionLabelGenerator() {
		this(org.jfree.chart.labels.StandardPieSectionLabelGenerator.DEFAULT_SECTION_LABEL_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getPercentInstance());
	}

	public StandardPieSectionLabelGenerator(java.util.Locale locale) {
		this(org.jfree.chart.labels.StandardPieSectionLabelGenerator.DEFAULT_SECTION_LABEL_FORMAT, locale);
	}

	public StandardPieSectionLabelGenerator(java.lang.String labelFormat) {
		this(labelFormat, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getPercentInstance());
	}

	public StandardPieSectionLabelGenerator(java.lang.String labelFormat, java.util.Locale locale) {
		this(labelFormat, java.text.NumberFormat.getNumberInstance(locale), java.text.NumberFormat.getPercentInstance(locale));
	}

	public StandardPieSectionLabelGenerator(java.lang.String labelFormat, java.text.NumberFormat numberFormat, java.text.NumberFormat percentFormat) {
		super(labelFormat, numberFormat, percentFormat);
		org.jfree.chart.labels.StandardPieSectionLabelGenerator.this.attributedLabels = new org.jfree.chart.util.ObjectList();
	}

	public java.text.AttributedString getAttributedLabel(int section) {
		return ((java.text.AttributedString) (org.jfree.chart.labels.StandardPieSectionLabelGenerator.this.attributedLabels.get(section)));
	}

	public void setAttributedLabel(int section, java.text.AttributedString label) {
		org.jfree.chart.labels.StandardPieSectionLabelGenerator.this.attributedLabels.set(section, label);
	}

	public java.lang.String generateSectionLabel(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key) {
		return super.generateSectionLabel(dataset, key);
	}

	public java.text.AttributedString generateAttributedSectionLabel(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key) {
		return getAttributedLabel(dataset.getIndex(key));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.StandardPieSectionLabelGenerator.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.StandardPieSectionLabelGenerator)) {
			return false;
		}
		org.jfree.chart.labels.StandardPieSectionLabelGenerator that = ((org.jfree.chart.labels.StandardPieSectionLabelGenerator) (obj));
		if (!(org.jfree.chart.labels.StandardPieSectionLabelGenerator.this.attributedLabels.equals(that.attributedLabels))) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

