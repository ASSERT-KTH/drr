

package org.apache.commons.math3.geometry.partitioning;


public interface SubHyperplane<S extends org.apache.commons.math3.geometry.Space> {
	org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> copySelf();

	org.apache.commons.math3.geometry.partitioning.Hyperplane<S> getHyperplane();

	boolean isEmpty();

	double getSize();

	org.apache.commons.math3.geometry.partitioning.Side side(org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane);

	org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split(org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane);

	org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> reunite(org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> other);

	public static class SplitSubHyperplane<U extends org.apache.commons.math3.geometry.Space> {
		private final org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> plus;

		private final org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> minus;

		public SplitSubHyperplane(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> plus, final org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> minus) {
			this.plus = plus;
			this.minus = minus;
		}

		public org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> getPlus() {
			return plus;
		}

		public org.apache.commons.math3.geometry.partitioning.SubHyperplane<U> getMinus() {
			return minus;
		}
	}
}

