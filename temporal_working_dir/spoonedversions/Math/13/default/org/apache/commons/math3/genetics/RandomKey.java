

package org.apache.commons.math3.genetics;


public abstract class RandomKey<T> extends org.apache.commons.math3.genetics.AbstractListChromosome<java.lang.Double> implements org.apache.commons.math3.genetics.PermutationChromosome<T> {
	private final java.util.List<java.lang.Double> sortedRepresentation;

	private final java.util.List<java.lang.Integer> baseSeqPermutation;

	public RandomKey(final java.util.List<java.lang.Double> representation) throws org.apache.commons.math3.genetics.InvalidRepresentationException {
		super(representation);
		java.util.List<java.lang.Double> sortedRepr = new java.util.ArrayList<java.lang.Double>(getRepresentation());
		java.util.Collections.sort(sortedRepr);
		sortedRepresentation = java.util.Collections.unmodifiableList(sortedRepr);
		baseSeqPermutation = java.util.Collections.unmodifiableList(org.apache.commons.math3.genetics.RandomKey.decodeGeneric(org.apache.commons.math3.genetics.RandomKey.baseSequence(getLength()), getRepresentation(), sortedRepresentation));
	}

	public RandomKey(final java.lang.Double[] representation) throws org.apache.commons.math3.genetics.InvalidRepresentationException {
		this(java.util.Arrays.asList(representation));
	}

	public java.util.List<T> decode(final java.util.List<T> sequence) {
		return org.apache.commons.math3.genetics.RandomKey.decodeGeneric(sequence, getRepresentation(), sortedRepresentation);
	}

	private static <S> java.util.List<S> decodeGeneric(final java.util.List<S> sequence, java.util.List<java.lang.Double> representation, final java.util.List<java.lang.Double> sortedRepr) throws org.apache.commons.math3.exception.DimensionMismatchException {
		int l = sequence.size();
		if ((representation.size()) != l) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(representation.size(), l);
		}
		if ((sortedRepr.size()) != l) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(sortedRepr.size(), l);
		}
		java.util.List<java.lang.Double> reprCopy = new java.util.ArrayList<java.lang.Double>(representation);
		java.util.List<S> res = new java.util.ArrayList<S>(l);
		for (int i = 0; i < l; i++) {
			int index = reprCopy.indexOf(sortedRepr.get(i));
			res.add(sequence.get(index));
			reprCopy.set(index, null);
		}
		return res;
	}

	@java.lang.Override
	protected boolean isSame(final org.apache.commons.math3.genetics.Chromosome another) {
		if (!(another instanceof org.apache.commons.math3.genetics.RandomKey<?>)) {
			return false;
		}
		org.apache.commons.math3.genetics.RandomKey<?> anotherRk = ((org.apache.commons.math3.genetics.RandomKey<?>) (another));
		if ((getLength()) != (anotherRk.getLength())) {
			return false;
		}
		java.util.List<java.lang.Integer> thisPerm = org.apache.commons.math3.genetics.RandomKey.this.baseSeqPermutation;
		java.util.List<java.lang.Integer> anotherPerm = anotherRk.baseSeqPermutation;
		for (int i = 0; i < (getLength()); i++) {
			if ((thisPerm.get(i)) != (anotherPerm.get(i))) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	protected void checkValidity(final java.util.List<java.lang.Double> chromosomeRepresentation) throws org.apache.commons.math3.genetics.InvalidRepresentationException {
		for (double val : chromosomeRepresentation) {
			if ((val < 0) || (val > 1)) {
				throw new org.apache.commons.math3.genetics.InvalidRepresentationException(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_SIMPLE, val, 0, 1);
			}
		}
	}

	public static final java.util.List<java.lang.Double> randomPermutation(final int l) {
		java.util.List<java.lang.Double> repr = new java.util.ArrayList<java.lang.Double>(l);
		for (int i = 0; i < l; i++) {
			repr.add(org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator().nextDouble());
		}
		return repr;
	}

	public static final java.util.List<java.lang.Double> identityPermutation(final int l) {
		java.util.List<java.lang.Double> repr = new java.util.ArrayList<java.lang.Double>(l);
		for (int i = 0; i < l; i++) {
			repr.add((((double) (i)) / l));
		}
		return repr;
	}

	public static <S> java.util.List<java.lang.Double> comparatorPermutation(final java.util.List<S> data, final java.util.Comparator<S> comparator) {
		java.util.List<S> sortedData = new java.util.ArrayList<S>(data);
		java.util.Collections.sort(sortedData, comparator);
		return org.apache.commons.math3.genetics.RandomKey.inducedPermutation(data, sortedData);
	}

	public static <S> java.util.List<java.lang.Double> inducedPermutation(final java.util.List<S> originalData, final java.util.List<S> permutedData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathIllegalArgumentException {
		if ((originalData.size()) != (permutedData.size())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(permutedData.size(), originalData.size());
		}
		int l = originalData.size();
		java.util.List<S> origDataCopy = new java.util.ArrayList<S>(originalData);
		java.lang.Double[] res = new java.lang.Double[l];
		for (int i = 0; i < l; i++) {
			int index = origDataCopy.indexOf(permutedData.get(i));
			if (index == (-1)) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA);
			}
			res[index] = ((double) (i)) / l;
			origDataCopy.set(index, null);
		}
		return java.util.Arrays.asList(res);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format("(f=%s pi=(%s))", getFitness(), baseSeqPermutation);
	}

	private static java.util.List<java.lang.Integer> baseSequence(final int l) {
		java.util.List<java.lang.Integer> baseSequence = new java.util.ArrayList<java.lang.Integer>(l);
		for (int i = 0; i < l; i++) {
			baseSequence.add(i);
		}
		return baseSequence;
	}
}

