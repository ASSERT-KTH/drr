

package org.jfree.chart.labels;


public class StandardPieToolTipGenerator extends org.jfree.chart.labels.AbstractPieItemLabelGenerator implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.labels.PieToolTipGenerator , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 2995304200445733779L;

	public static final java.lang.String DEFAULT_TOOLTIP_FORMAT = "{0}: ({1}, {2})";

	public static final java.lang.String DEFAULT_SECTION_LABEL_FORMAT = "{0} = {1}";

	public StandardPieToolTipGenerator() {
		this(org.jfree.chart.labels.StandardPieToolTipGenerator.DEFAULT_SECTION_LABEL_FORMAT, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getPercentInstance());
	}

	public StandardPieToolTipGenerator(java.lang.String labelFormat) {
		this(labelFormat, java.text.NumberFormat.getNumberInstance(), java.text.NumberFormat.getPercentInstance());
	}

	public StandardPieToolTipGenerator(java.lang.String labelFormat, java.text.NumberFormat numberFormat, java.text.NumberFormat percentFormat) {
		super(labelFormat, numberFormat, percentFormat);
	}

	public java.lang.String generateToolTip(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key) {
		return generateSectionLabel(dataset, key);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

