

package org.jfree.chart.event;


public class TitleChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.title.Title title;

	public TitleChangeEvent(org.jfree.chart.title.Title title) {
		super(title);
		org.jfree.chart.event.TitleChangeEvent.this.title = title;
	}

	public org.jfree.chart.title.Title getTitle() {
		return org.jfree.chart.event.TitleChangeEvent.this.title;
	}
}

