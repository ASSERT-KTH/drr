

package org.jfree.data.event;


public class SeriesChangeEvent extends java.util.EventObject implements java.io.Serializable {
	private static final long serialVersionUID = 1593866085210089052L;

	private org.jfree.data.general.SeriesChangeInfo summary;

	public SeriesChangeEvent(java.lang.Object source) {
		this(source, null);
	}

	public SeriesChangeEvent(java.lang.Object source, org.jfree.data.general.SeriesChangeInfo summary) {
		super(source);
		org.jfree.data.event.SeriesChangeEvent.this.summary = summary;
	}

	public org.jfree.data.general.SeriesChangeInfo getSummary() {
		return org.jfree.data.event.SeriesChangeEvent.this.summary;
	}

	public void setSummary(org.jfree.data.general.SeriesChangeInfo summary) {
		org.jfree.data.event.SeriesChangeEvent.this.summary = summary;
	}
}

