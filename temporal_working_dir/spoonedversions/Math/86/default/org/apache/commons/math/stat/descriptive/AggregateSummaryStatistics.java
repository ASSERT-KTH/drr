

package org.apache.commons.math.stat.descriptive;


public class AggregateSummaryStatistics implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StatisticalSummary {
	private static final long serialVersionUID = -8207112444016386906L;

	private org.apache.commons.math.stat.descriptive.SummaryStatistics statisticsPrototype;

	private org.apache.commons.math.stat.descriptive.SummaryStatistics statistics;

	public AggregateSummaryStatistics() {
		this(new org.apache.commons.math.stat.descriptive.SummaryStatistics());
	}

	public AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics prototypeStatistics) {
		this(prototypeStatistics, (prototypeStatistics == null ? null : new org.apache.commons.math.stat.descriptive.SummaryStatistics(prototypeStatistics)));
	}

	public AggregateSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics prototypeStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics initialStatistics) {
		org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.this.statisticsPrototype = (prototypeStatistics == null) ? new org.apache.commons.math.stat.descriptive.SummaryStatistics() : prototypeStatistics;
		org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.this.statistics = (initialStatistics == null) ? new org.apache.commons.math.stat.descriptive.SummaryStatistics() : initialStatistics;
	}

	public double getMax() {
		return statistics.getMax();
	}

	public double getMean() {
		return statistics.getMean();
	}

	public double getMin() {
		return statistics.getMin();
	}

	public long getN() {
		return statistics.getN();
	}

	public double getStandardDeviation() {
		return statistics.getStandardDeviation();
	}

	public double getSum() {
		return statistics.getSum();
	}

	public double getVariance() {
		return statistics.getVariance();
	}

	public org.apache.commons.math.stat.descriptive.SummaryStatistics createContributingStatistics() {
		org.apache.commons.math.stat.descriptive.SummaryStatistics contributingStatistics = new org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics(statistics);
		org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(statisticsPrototype, contributingStatistics);
		return contributingStatistics;
	}

	private static class AggregatingSummaryStatistics extends org.apache.commons.math.stat.descriptive.SummaryStatistics {
		private static final long serialVersionUID = 1L;

		private org.apache.commons.math.stat.descriptive.SummaryStatistics aggregateStatistics;

		public AggregatingSummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics aggregateStatistics) {
			org.apache.commons.math.stat.descriptive.AggregateSummaryStatistics.AggregatingSummaryStatistics.this.aggregateStatistics = aggregateStatistics;
		}

		@java.lang.Override
		public void addValue(double value) {
			super.addValue(value);
			aggregateStatistics.addValue(value);
		}
	}
}

