

package com.google.javascript.jscomp;


interface JoinOp<L extends com.google.javascript.jscomp.graph.LatticeElement> extends com.google.common.base.Function<java.util.List<L>, L> {
	abstract static class BinaryJoinOp<L extends com.google.javascript.jscomp.graph.LatticeElement> implements com.google.javascript.jscomp.JoinOp<L> {
		@java.lang.Override
		public final L apply(java.util.List<L> values) {
			com.google.common.base.Preconditions.checkArgument((!(values.isEmpty())));
			int size = values.size();
			if (size == 1) {
				return values.get(0);
			}else
				if (size == 2) {
					return apply(values.get(0), values.get(1));
				}else {
					int mid = com.google.javascript.jscomp.JoinOp.BinaryJoinOp.computeMidPoint(size);
					return apply(apply(values.subList(0, mid)), apply(values.subList(mid, size)));
				}
			
		}

		abstract L apply(L latticeA, L latticeB);

		static int computeMidPoint(int size) {
			int midpoint = size >>> 1;
			if (size > 4) {
				midpoint &= -2;
			}
			return midpoint;
		}
	}
}

