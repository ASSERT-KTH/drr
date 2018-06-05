

package org.jfree.chart.plot;


public class PieLabelDistributor extends org.jfree.chart.plot.AbstractPieLabelDistributor {
	private double minGap = 4.0;

	public PieLabelDistributor(int labelCount) {
		super();
	}

	public void distributeLabels(double minY, double height) {
		sort();
		if (isOverlap()) {
			adjustDownwards(minY, height);
		}
		if (isOverlap()) {
			adjustUpwards(minY, height);
		}
		if (isOverlap()) {
			spreadEvenly(minY, height);
		}
	}

	private boolean isOverlap() {
		double y = 0.0;
		for (int i = 0; i < (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()); i++) {
			org.jfree.chart.plot.PieLabelRecord plr = getPieLabelRecord(i);
			if (y > (plr.getLowerY())) {
				return true;
			}
			y = plr.getUpperY();
		}
		return false;
	}

	protected void adjustInwards() {
		int lower = 0;
		int upper = (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()) - 1;
		while (upper > lower) {
			if (lower < (upper - 1)) {
				org.jfree.chart.plot.PieLabelRecord r0 = getPieLabelRecord(lower);
				org.jfree.chart.plot.PieLabelRecord r1 = getPieLabelRecord((lower + 1));
				if ((r1.getLowerY()) < (r0.getUpperY())) {
					double adjust = ((r0.getUpperY()) - (r1.getLowerY())) + (org.jfree.chart.plot.PieLabelDistributor.this.minGap);
					r1.setAllocatedY(((r1.getAllocatedY()) + adjust));
				}
			}
			org.jfree.chart.plot.PieLabelRecord r2 = getPieLabelRecord((upper - 1));
			org.jfree.chart.plot.PieLabelRecord r3 = getPieLabelRecord(upper);
			if ((r2.getUpperY()) > (r3.getLowerY())) {
				double adjust = ((r2.getUpperY()) - (r3.getLowerY())) + (org.jfree.chart.plot.PieLabelDistributor.this.minGap);
				r3.setAllocatedY(((r3.getAllocatedY()) + adjust));
			}
			lower++;
			upper--;
		} 
	}

	protected void adjustDownwards(double minY, double height) {
		for (int i = 0; i < ((org.jfree.chart.plot.PieLabelDistributor.this.labels.size()) - 1); i++) {
			org.jfree.chart.plot.PieLabelRecord record0 = getPieLabelRecord(i);
			org.jfree.chart.plot.PieLabelRecord record1 = getPieLabelRecord((i + 1));
			if ((record1.getLowerY()) < (record0.getUpperY())) {
				record1.setAllocatedY(java.lang.Math.min(((minY + height) - ((record1.getLabelHeight()) / 2.0)), (((record0.getUpperY()) + (org.jfree.chart.plot.PieLabelDistributor.this.minGap)) + ((record1.getLabelHeight()) / 2.0))));
			}
		}
	}

	protected void adjustUpwards(double minY, double height) {
		for (int i = (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()) - 1; i > 0; i--) {
			org.jfree.chart.plot.PieLabelRecord record0 = getPieLabelRecord(i);
			org.jfree.chart.plot.PieLabelRecord record1 = getPieLabelRecord((i - 1));
			if ((record1.getUpperY()) > (record0.getLowerY())) {
				record1.setAllocatedY(java.lang.Math.max((minY + ((record1.getLabelHeight()) / 2.0)), (((record0.getLowerY()) - (org.jfree.chart.plot.PieLabelDistributor.this.minGap)) - ((record1.getLabelHeight()) / 2.0))));
			}
		}
	}

	protected void spreadEvenly(double minY, double height) {
		double y = minY;
		double sumOfLabelHeights = 0.0;
		for (int i = 0; i < (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()); i++) {
			sumOfLabelHeights += getPieLabelRecord(i).getLabelHeight();
		}
		double gap = height - sumOfLabelHeights;
		if ((org.jfree.chart.plot.PieLabelDistributor.this.labels.size()) > 1) {
			gap = gap / ((org.jfree.chart.plot.PieLabelDistributor.this.labels.size()) - 1);
		}
		for (int i = 0; i < (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()); i++) {
			org.jfree.chart.plot.PieLabelRecord record = getPieLabelRecord(i);
			y = y + ((record.getLabelHeight()) / 2.0);
			record.setAllocatedY(y);
			y = (y + ((record.getLabelHeight()) / 2.0)) + gap;
		}
	}

	public void sort() {
		java.util.Collections.sort(org.jfree.chart.plot.PieLabelDistributor.this.labels);
	}

	public java.lang.String toString() {
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		for (int i = 0; i < (org.jfree.chart.plot.PieLabelDistributor.this.labels.size()); i++) {
			result.append(getPieLabelRecord(i).toString()).append("\n");
		}
		return result.toString();
	}
}

