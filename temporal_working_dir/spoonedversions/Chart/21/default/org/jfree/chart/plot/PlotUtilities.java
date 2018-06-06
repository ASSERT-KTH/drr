

package org.jfree.chart.plot;


public class PlotUtilities {
	public static boolean isEmptyOrNull(org.jfree.chart.plot.XYPlot plot) {
		if (plot != null) {
			for (int i = 0, n = plot.getDatasetCount(); i < n; i++) {
				final org.jfree.data.xy.XYDataset dataset = plot.getDataset(i);
				if (!(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(dataset))) {
					return false;
				}
			}
		}
		return true;
	}
}

