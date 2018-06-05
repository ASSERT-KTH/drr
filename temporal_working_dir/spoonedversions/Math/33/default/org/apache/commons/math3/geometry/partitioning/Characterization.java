

package org.apache.commons.math3.geometry.partitioning;


class Characterization<S extends org.apache.commons.math3.geometry.Space> {
	private org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> in;

	private org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> out;

	public Characterization() {
		in = null;
		out = null;
	}

	public boolean hasIn() {
		return ((in) != null) && (!(in.isEmpty()));
	}

	public org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> getIn() {
		return in;
	}

	public boolean hasOut() {
		return ((out) != null) && (!(out.isEmpty()));
	}

	public org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> getOut() {
		return out;
	}

	public void add(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub, final boolean inside) {
		if (inside) {
			if ((in) == null) {
				in = sub;
			}else {
				in = in.reunite(sub);
			}
		}else {
			if ((out) == null) {
				out = sub;
			}else {
				out = out.reunite(sub);
			}
		}
	}
}

