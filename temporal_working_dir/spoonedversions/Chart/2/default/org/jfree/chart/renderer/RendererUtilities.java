

package org.jfree.chart.renderer;


public class RendererUtilities {
	public static int findLiveItemsLowerBound(org.jfree.data.xy.XYDataset dataset, int series, double xLow, double xHigh) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (xLow >= xHigh) {
			throw new java.lang.IllegalArgumentException("Requires xLow < xHigh.");
		}
		int itemCount = dataset.getItemCount(series);
		if (itemCount <= 1) {
			return 0;
		}
		if ((dataset.getDomainOrder()) == (org.jfree.data.DomainOrder.ASCENDING)) {
			int low = 0;
			int high = itemCount - 1;
			double lowValue = dataset.getXValue(series, low);
			if (lowValue >= xLow) {
				return low;
			}
			double highValue = dataset.getXValue(series, high);
			if (highValue < xLow) {
				return high;
			}
			while ((high - low) > 1) {
				int mid = (low + high) / 2;
				double midV = dataset.getXValue(series, mid);
				if (midV >= xLow) {
					high = mid;
				}else {
					low = mid;
				}
			} 
			return high;
		}else
			if ((dataset.getDomainOrder()) == (org.jfree.data.DomainOrder.DESCENDING)) {
				int low = 0;
				int high = itemCount - 1;
				double lowValue = dataset.getXValue(series, low);
				if (lowValue <= xHigh) {
					return low;
				}
				double highValue = dataset.getXValue(series, high);
				if (highValue > xHigh) {
					return high;
				}
				while ((high - low) > 1) {
					int mid = (low + high) / 2;
					double midV = dataset.getXValue(series, mid);
					if (midV > xHigh) {
						low = mid;
					}else {
						high = mid;
					}
					mid = (low + high) / 2;
				} 
				return high;
			}else {
				int index = 0;
				double x = dataset.getXValue(series, index);
				while ((index < itemCount) && ((x < xLow) || (x > xHigh))) {
					index++;
					if (index < itemCount) {
						x = dataset.getXValue(series, index);
					}
				} 
				return java.lang.Math.min(java.lang.Math.max(0, index), (itemCount - 1));
			}
		
	}

	public static int findLiveItemsUpperBound(org.jfree.data.xy.XYDataset dataset, int series, double xLow, double xHigh) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		if (xLow >= xHigh) {
			throw new java.lang.IllegalArgumentException("Requires xLow < xHigh.");
		}
		int itemCount = dataset.getItemCount(series);
		if (itemCount <= 1) {
			return 0;
		}
		if ((dataset.getDomainOrder()) == (org.jfree.data.DomainOrder.ASCENDING)) {
			int low = 0;
			int high = itemCount - 1;
			double lowValue = dataset.getXValue(series, low);
			if (lowValue > xHigh) {
				return low;
			}
			double highValue = dataset.getXValue(series, high);
			if (highValue <= xHigh) {
				return high;
			}
			int mid = (low + high) / 2;
			while ((high - low) > 1) {
				double midV = dataset.getXValue(series, mid);
				if (midV <= xHigh) {
					low = mid;
				}else {
					high = mid;
				}
				mid = (low + high) / 2;
			} 
			return mid;
		}else
			if ((dataset.getDomainOrder()) == (org.jfree.data.DomainOrder.DESCENDING)) {
				int low = 0;
				int high = itemCount - 1;
				int mid = (low + high) / 2;
				double lowValue = dataset.getXValue(series, low);
				if (lowValue < xLow) {
					return low;
				}
				double highValue = dataset.getXValue(series, high);
				if (highValue >= xLow) {
					return high;
				}
				while ((high - low) > 1) {
					double midV = dataset.getXValue(series, mid);
					if (midV >= xLow) {
						low = mid;
					}else {
						high = mid;
					}
					mid = (low + high) / 2;
				} 
				return mid;
			}else {
				int index = itemCount - 1;
				double x = dataset.getXValue(series, index);
				while ((index >= 0) && ((x < xLow) || (x > xHigh))) {
					index--;
					if (index >= 0) {
						x = dataset.getXValue(series, index);
					}
				} 
				return java.lang.Math.max(index, 0);
			}
		
	}

	public static int[] findLiveItems(org.jfree.data.xy.XYDataset dataset, int series, double xLow, double xHigh) {
		int i0 = org.jfree.chart.renderer.RendererUtilities.findLiveItemsLowerBound(dataset, series, xLow, xHigh);
		int i1 = org.jfree.chart.renderer.RendererUtilities.findLiveItemsUpperBound(dataset, series, xLow, xHigh);
		if (i0 > i1) {
			i0 = i1;
		}
		return new int[]{ i0 , i1 };
	}
}

