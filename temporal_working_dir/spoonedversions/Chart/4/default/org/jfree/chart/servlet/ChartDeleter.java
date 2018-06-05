

package org.jfree.chart.servlet;


public class ChartDeleter implements java.io.Serializable , javax.servlet.http.HttpSessionBindingListener {
	private java.util.List chartNames = new java.util.ArrayList();

	public ChartDeleter() {
		super();
	}

	public void addChart(java.lang.String filename) {
		org.jfree.chart.servlet.ChartDeleter.this.chartNames.add(filename);
	}

	public boolean isChartAvailable(java.lang.String filename) {
		return org.jfree.chart.servlet.ChartDeleter.this.chartNames.contains(filename);
	}

	public void valueBound(javax.servlet.http.HttpSessionBindingEvent event) {
		return ;
	}

	public void valueUnbound(javax.servlet.http.HttpSessionBindingEvent event) {
		java.util.Iterator iter = org.jfree.chart.servlet.ChartDeleter.this.chartNames.listIterator();
		while (iter.hasNext()) {
			java.lang.String filename = ((java.lang.String) (iter.next()));
			java.io.File file = new java.io.File(java.lang.System.getProperty("java.io.tmpdir"), filename);
			if (file.exists()) {
				file.delete();
			}
		} 
		return ;
	}
}

