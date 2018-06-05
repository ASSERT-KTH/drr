

package com.google.javascript.jscomp.regex;


final class CharRanges {
	private final int[] ranges;

	public static final com.google.javascript.jscomp.regex.CharRanges EMPTY = new com.google.javascript.jscomp.regex.CharRanges(new int[0]);

	public static final com.google.javascript.jscomp.regex.CharRanges ALL_CODE_UNITS = new com.google.javascript.jscomp.regex.CharRanges(new int[]{ 0 , 65536 });

	public static com.google.javascript.jscomp.regex.CharRanges inclusive(int start, int end) {
		if (start > end) {
			throw new java.lang.IndexOutOfBoundsException(((start + " > ") + end));
		}
		return new com.google.javascript.jscomp.regex.CharRanges(new int[]{ start , end + 1 });
	}

	public static com.google.javascript.jscomp.regex.CharRanges withMembers(int... members) {
		return new com.google.javascript.jscomp.regex.CharRanges(com.google.javascript.jscomp.regex.CharRanges.intArrayToRanges(members.clone()));
	}

	public static com.google.javascript.jscomp.regex.CharRanges withRanges(int... ranges) {
		ranges = ranges.clone();
		if (((ranges.length) & 1) != 0) {
			throw new java.lang.IllegalArgumentException();
		}
		for (int i = 1; i < (ranges.length); ++i) {
			if ((ranges[i]) <= (ranges[(i - 1)])) {
				throw new java.lang.IllegalArgumentException((((ranges[i]) + " > ") + (ranges[(i - 1)])));
			}
		}
		return new com.google.javascript.jscomp.regex.CharRanges(ranges);
	}

	private CharRanges(int[] ranges) {
		this.ranges = ranges;
	}

	private static int[] intArrayToRanges(int[] members) {
		int nMembers = members.length;
		if (nMembers == 0) {
			return new int[0];
		}
		java.util.Arrays.sort(members);
		int nRuns = 1;
		for (int i = 1; i < nMembers; ++i) {
			int current = members[i];
			int last = members[(i - 1)];
			if (current == last) {
				continue;
			}
			if (current != (last + 1)) {
				++nRuns;
			}
		}
		int[] ranges = new int[nRuns * 2];
		ranges[0] = members[0];
		int k = 0;
		for (int i = 1; (k + 2) < (ranges.length); ++i) {
			int current = members[i];
			int last = members[(i - 1)];
			if (current == last) {
				continue;
			}
			if (current != (last + 1)) {
				ranges[(++k)] = last + 1;
				ranges[(++k)] = current;
			}
		}
		ranges[(++k)] = (members[(nMembers - 1)]) + 1;
		return ranges;
	}

	public boolean contains(int bit) {
		return ((java.util.Arrays.binarySearch(ranges, bit)) & 1) == 0;
	}

	public int minSetBit() {
		return (ranges.length) >= 0 ? ranges[0] : java.lang.Integer.MIN_VALUE;
	}

	public boolean isEmpty() {
		return (ranges.length) == 0;
	}

	public int getNumRanges() {
		return (ranges.length) >> 1;
	}

	public int start(int i) {
		return ranges[(i << 1)];
	}

	public int end(int i) {
		return ranges[((i << 1) | 1)];
	}

	public com.google.javascript.jscomp.regex.CharRanges union(com.google.javascript.jscomp.regex.CharRanges other) {
		int[] q = com.google.javascript.jscomp.regex.CharRanges.this.ranges;
		int[] r = other.ranges;
		int m = q.length;
		int n = r.length;
		if (m == 0) {
			return other;
		}
		if (n == 0) {
			return com.google.javascript.jscomp.regex.CharRanges.this;
		}
		int[] out = new int[m + n];
		int i = 0;
		int j = 0;
		int k = 0;
		while ((i < m) && (j < n)) {
			int a0 = q[i];
			int a1 = q[(i + 1)];
			int b0 = r[j];
			int b1 = r[(j + 1)];
			if (a1 < b0) {
				out[(k++)] = a0;
				out[(k++)] = a1;
				i += 2;
			}else
				if (b1 < a0) {
					out[(k++)] = b0;
					out[(k++)] = b1;
					j += 2;
				}else {
					int start = java.lang.Math.min(a0, b0);
					int end = java.lang.Math.max(a1, b1);
					i += 2;
					j += 2;
					while ((i < m) || (j < n)) {
						if ((i < m) && ((q[i]) <= end)) {
							end = java.lang.Math.max(end, q[(i + 1)]);
							i += 2;
						}else
							if ((j < n) && ((r[j]) <= end)) {
								end = java.lang.Math.max(end, r[(j + 1)]);
								j += 2;
							}else {
								break;
							}
						
					} 
					out[(k++)] = start;
					out[(k++)] = end;
				}
			
		} 
		if (i < m) {
			java.lang.System.arraycopy(q, i, out, k, (m - i));
			k += m - i;
		}else
			if (j < n) {
				java.lang.System.arraycopy(r, j, out, k, (n - j));
				k += n - j;
			}
		
		if (k != (out.length)) {
			int[] clipped = new int[k];
			java.lang.System.arraycopy(out, 0, clipped, 0, k);
			out = clipped;
		}
		return new com.google.javascript.jscomp.regex.CharRanges(out);
	}

	public com.google.javascript.jscomp.regex.CharRanges intersection(com.google.javascript.jscomp.regex.CharRanges other) {
		int[] aRanges = ranges;
		int[] bRanges = other.ranges;
		int aLen = aRanges.length;
		int bLen = bRanges.length;
		if (aLen == 0) {
			return com.google.javascript.jscomp.regex.CharRanges.this;
		}
		if (bLen == 0) {
			return other;
		}
		int aIdx = 0;
		int bIdx = 0;
		int[] intersection = new int[java.lang.Math.min(aLen, bLen)];
		int intersectionIdx = 0;
		int pos = java.lang.Math.min(aRanges[0], bRanges[0]);
		while ((aIdx < aLen) && (bIdx < bLen)) {
			if ((aRanges[(aIdx + 1)]) <= pos) {
				aIdx += 2;
			}else
				if ((bRanges[(bIdx + 1)]) <= pos) {
					bIdx += 2;
				}else {
					int start = java.lang.Math.max(aRanges[aIdx], bRanges[bIdx]);
					if (pos < start) {
						pos = start;
					}else {
						int end = java.lang.Math.min(aRanges[(aIdx + 1)], bRanges[(bIdx + 1)]);
						if ((intersectionIdx != 0) && (pos == (intersection[(intersectionIdx - 1)]))) {
							intersection[(intersectionIdx - 1)] = end;
						}else {
							if (intersectionIdx == (intersection.length)) {
								int[] newArr = new int[intersectionIdx * 2];
								java.lang.System.arraycopy(intersection, 0, newArr, 0, intersectionIdx);
								intersection = newArr;
							}
							intersection[(intersectionIdx++)] = pos;
							intersection[(intersectionIdx++)] = end;
						}
						pos = end;
					}
				}
			
		} 
		if (intersectionIdx != (intersection.length)) {
			int[] newArr = new int[intersectionIdx];
			java.lang.System.arraycopy(intersection, 0, newArr, 0, intersectionIdx);
			intersection = newArr;
		}
		return new com.google.javascript.jscomp.regex.CharRanges(intersection);
	}

	public com.google.javascript.jscomp.regex.CharRanges difference(com.google.javascript.jscomp.regex.CharRanges subtrahendRanges) {
		int[] minuend = com.google.javascript.jscomp.regex.CharRanges.this.ranges;
		int[] subtrahend = subtrahendRanges.ranges;
		int mn = minuend.length;
		int sn = subtrahend.length;
		if ((mn == 0) || (sn == 0)) {
			return com.google.javascript.jscomp.regex.CharRanges.this;
		}
		int[] difference = new int[minuend.length];
		int mIdx = 0;
		int sIdx = 0;
		int dIdx = 0;
		int pos = minuend[0];
		while (mIdx < mn) {
			if (pos >= (minuend[(mIdx + 1)])) {
				mIdx += 2;
			}else
				if (pos < (minuend[mIdx])) {
					pos = minuend[mIdx];
				}else
					if ((sIdx < sn) && (pos >= (subtrahend[sIdx]))) {
						pos = subtrahend[(sIdx + 1)];
						sIdx += 2;
					}else {
						int end = sIdx < sn ? java.lang.Math.min(minuend[(mIdx + 1)], subtrahend[sIdx]) : minuend[(mIdx + 1)];
						if ((dIdx != 0) && ((difference[(dIdx - 1)]) == pos)) {
							difference[(dIdx - 1)] = pos;
						}else {
							if (dIdx == (difference.length)) {
								int[] newArr = new int[dIdx * 2];
								java.lang.System.arraycopy(difference, 0, newArr, 0, dIdx);
								difference = newArr;
							}
							difference[(dIdx++)] = pos;
							difference[(dIdx++)] = end;
						}
						pos = end;
					}
				
			
		} 
		if (dIdx != (difference.length)) {
			int[] newArr = new int[dIdx];
			java.lang.System.arraycopy(difference, 0, newArr, 0, dIdx);
			difference = newArr;
		}
		return new com.google.javascript.jscomp.regex.CharRanges(difference);
	}

	public boolean containsAll(com.google.javascript.jscomp.regex.CharRanges sub) {
		int[] superRanges = com.google.javascript.jscomp.regex.CharRanges.this.ranges;
		int[] subRanges = sub.ranges;
		int superIdx = 0;
		int subIdx = 0;
		int superLen = superRanges.length;
		int subLen = subRanges.length;
		while (subIdx < subLen) {
			if (superIdx == superLen) {
				return false;
			}
			if ((superRanges[(superIdx + 1)]) <= (subRanges[subIdx])) {
				superIdx += 2;
			}else
				if ((superRanges[superIdx]) > (subRanges[subIdx])) {
					return false;
				}else
					if ((superRanges[(superIdx + 1)]) >= (subRanges[(subIdx + 1)])) {
						subIdx += 2;
					}else {
						return false;
					}
				
			
		} 
		return subIdx == subLen;
	}

	public com.google.javascript.jscomp.regex.CharRanges shift(int delta) {
		int n = ranges.length;
		if ((delta == 0) || (n == 0)) {
			return com.google.javascript.jscomp.regex.CharRanges.this;
		}
		if (delta < 0) {
			long lmin = (ranges[0]) + delta;
			if (lmin < (java.lang.Integer.MIN_VALUE)) {
				throw new java.lang.IndexOutOfBoundsException();
			}
		}else {
			long lmax = (ranges[(n - 1)]) + delta;
			if (lmax > (java.lang.Integer.MAX_VALUE)) {
				throw new java.lang.IndexOutOfBoundsException();
			}
		}
		int[] shiftedRanges = new int[n];
		for (int i = n; (--i) >= 0;) {
			shiftedRanges[i] = (ranges[i]) + delta;
		}
		return new com.google.javascript.jscomp.regex.CharRanges(shiftedRanges);
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append('[');
		for (int i = 0; i < (ranges.length); ++i) {
			if (((i & 1) != 0) && ((ranges[i]) == ((ranges[(i - 1)]) + 1))) {
				continue;
			}
			if (i != 0) {
				sb.append(((i & 1) == 0 ? ' ' : '-'));
			}
			sb.append("0x").append(java.lang.Integer.toString(((ranges[i]) - (i & 1)), 16));
		}
		sb.append(']');
		return sb.toString();
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		if (!(o instanceof com.google.javascript.jscomp.regex.CharRanges)) {
			return false;
		}
		return java.util.Arrays.equals(com.google.javascript.jscomp.regex.CharRanges.this.ranges, ((com.google.javascript.jscomp.regex.CharRanges) (o)).ranges);
	}

	@java.lang.Override
	public int hashCode() {
		int hc = 0;
		for (int i = 0, n = java.lang.Math.min(16, ranges.length); i < n; ++i) {
			hc = (hc << 2) + (ranges[i]);
		}
		return hc;
	}
}

