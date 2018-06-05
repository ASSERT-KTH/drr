

package org.jfree.chart.labels;


public interface PieSectionLabelGenerator {
	public java.lang.String generateSectionLabel(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key);

	public java.text.AttributedString generateAttributedSectionLabel(org.jfree.data.general.PieDataset dataset, java.lang.Comparable key);
}

