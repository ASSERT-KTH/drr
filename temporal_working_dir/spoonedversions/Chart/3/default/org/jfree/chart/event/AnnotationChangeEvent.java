

package org.jfree.chart.event;


public class AnnotationChangeEvent extends org.jfree.chart.event.ChartChangeEvent {
	private org.jfree.chart.annotations.Annotation annotation;

	public AnnotationChangeEvent(java.lang.Object source, org.jfree.chart.annotations.Annotation annotation) {
		super(source);
		org.jfree.chart.event.AnnotationChangeEvent.this.annotation = annotation;
	}

	public org.jfree.chart.annotations.Annotation getAnnotation() {
		return org.jfree.chart.event.AnnotationChangeEvent.this.annotation;
	}
}

