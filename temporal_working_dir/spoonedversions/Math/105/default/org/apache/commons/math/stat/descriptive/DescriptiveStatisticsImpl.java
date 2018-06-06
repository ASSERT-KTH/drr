

package org.apache.commons.math.stat.descriptive;


public class DescriptiveStatisticsImpl extends org.apache.commons.math.stat.descriptive.DescriptiveStatistics implements java.io.Serializable {
	private static final long serialVersionUID = -1868088725461221010L;

	protected int windowSize;

	protected org.apache.commons.math.util.ResizableDoubleArray eDA;

	public DescriptiveStatisticsImpl() {
		this(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW);
	}

	public DescriptiveStatisticsImpl(int window) {
		super();
		eDA = new org.apache.commons.math.util.ResizableDoubleArray();
		setWindowSize(window);
	}

	public int getWindowSize() {
		return windowSize;
	}

	public double[] getValues() {
		double[] copiedArray = new double[eDA.getNumElements()];
		java.lang.System.arraycopy(eDA.getElements(), 0, copiedArray, 0, eDA.getNumElements());
		return copiedArray;
	}

	public double getElement(int index) {
		return eDA.getElement(index);
	}

	public long getN() {
		return eDA.getNumElements();
	}

	public void addValue(double v) {
		if ((windowSize) != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) {
			if ((getN()) == (windowSize)) {
				eDA.addElementRolling(v);
			}else
				if ((getN()) < (windowSize)) {
					eDA.addElement(v);
				}
			
		}else {
			eDA.addElement(v);
		}
	}

	public void clear() {
		eDA.clear();
	}

	public void setWindowSize(int windowSize) {
		if (windowSize < 1) {
			if (windowSize != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) {
				throw new java.lang.IllegalArgumentException("window size must be positive.");
			}
		}
		org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl.this.windowSize = windowSize;
		if ((windowSize != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) && (windowSize < (eDA.getNumElements()))) {
			eDA.discardFrontElements(((eDA.getNumElements()) - windowSize));
		}
	}

	public double apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic stat) {
		return stat.evaluate(eDA.getValues(), eDA.start(), eDA.getNumElements());
	}
}

