

package org.apache.commons.math3.util;


public class ResizableDoubleArray implements java.io.Serializable , org.apache.commons.math3.util.DoubleArray {
	@java.lang.Deprecated
	public static final int ADDITIVE_MODE = 1;

	@java.lang.Deprecated
	public static final int MULTIPLICATIVE_MODE = 0;

	private static final long serialVersionUID = -3485529955529426875L;

	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	private static final double DEFAULT_EXPANSION_FACTOR = 2.0;

	private static final double DEFAULT_CONTRACTION_DELTA = 0.5;

	private double contractionCriterion = 2.5;

	private double expansionFactor = 2.0;

	private org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode expansionMode = org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE;

	private double[] internalArray;

	private int numElements = 0;

	private int startIndex = 0;

	public static enum ExpansionMode {
MULTIPLICATIVE, ADDITIVE;	}

	public ResizableDoubleArray() {
		this(org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_INITIAL_CAPACITY);
	}

	public ResizableDoubleArray(int initialCapacity) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_EXPANSION_FACTOR);
	}

	public ResizableDoubleArray(double[] initialArray) {
		this(org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_INITIAL_CAPACITY, org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_EXPANSION_FACTOR, ((org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_CONTRACTION_DELTA) + (org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_EXPANSION_FACTOR)), org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE, initialArray);
	}

	@java.lang.Deprecated
	public ResizableDoubleArray(int initialCapacity, float expansionFactor) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, ((double) (expansionFactor)));
	}

	public ResizableDoubleArray(int initialCapacity, double expansionFactor) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, expansionFactor, ((org.apache.commons.math3.util.ResizableDoubleArray.DEFAULT_CONTRACTION_DELTA) + expansionFactor));
	}

	@java.lang.Deprecated
	public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, ((double) (expansionFactor)), ((double) (contractionCriteria)));
	}

	public ResizableDoubleArray(int initialCapacity, double expansionFactor, double contractionCriterion) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, expansionFactor, contractionCriterion, org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE, null);
	}

	public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria, int expansionMode) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		this(initialCapacity, expansionFactor, contractionCriteria, (expansionMode == (org.apache.commons.math3.util.ResizableDoubleArray.ADDITIVE_MODE) ? org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.ADDITIVE : org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE), null);
		setExpansionMode(expansionMode);
	}

	public ResizableDoubleArray(int initialCapacity, double expansionFactor, double contractionCriterion, org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode expansionMode, double... data) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (initialCapacity <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_CAPACITY_NOT_POSITIVE, initialCapacity);
		}
		checkContractExpand(contractionCriterion, expansionFactor);
		org.apache.commons.math3.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
		org.apache.commons.math3.util.ResizableDoubleArray.this.contractionCriterion = contractionCriterion;
		org.apache.commons.math3.util.ResizableDoubleArray.this.expansionMode = expansionMode;
		internalArray = new double[initialCapacity];
		numElements = 0;
		startIndex = 0;
		if (data != null) {
			addElements(data);
		}
	}

	public ResizableDoubleArray(org.apache.commons.math3.util.ResizableDoubleArray original) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(original);
		org.apache.commons.math3.util.ResizableDoubleArray.copy(original, org.apache.commons.math3.util.ResizableDoubleArray.this);
	}

	public synchronized void addElement(double value) {
		if ((internalArray.length) <= ((startIndex) + (numElements))) {
			expand();
		}
		internalArray[((startIndex) + ((numElements)++))] = value;
	}

	public synchronized void addElements(double[] values) {
		final double[] tempArray = new double[((numElements) + (values.length)) + 1];
		java.lang.System.arraycopy(internalArray, startIndex, tempArray, 0, numElements);
		java.lang.System.arraycopy(values, 0, tempArray, numElements, values.length);
		internalArray = tempArray;
		startIndex = 0;
		numElements += values.length;
	}

	public synchronized double addElementRolling(double value) {
		double discarded = internalArray[startIndex];
		if (((startIndex) + ((numElements) + 1)) > (internalArray.length)) {
			expand();
		}
		startIndex += 1;
		internalArray[((startIndex) + ((numElements) - 1))] = value;
		if (shouldContract()) {
			contract();
		}
		return discarded;
	}

	public synchronized double substituteMostRecentElement(double value) throws org.apache.commons.math3.exception.MathIllegalStateException {
		if ((numElements) < 1) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_SUBSTITUTE_ELEMENT_FROM_EMPTY_ARRAY);
		}
		final int substIndex = (startIndex) + ((numElements) - 1);
		final double discarded = internalArray[substIndex];
		internalArray[substIndex] = value;
		return discarded;
	}

	protected void checkContractExpand(float contraction, float expansion) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		checkContractExpand(((double) (contraction)), ((double) (expansion)));
	}

	protected void checkContractExpand(double contraction, double expansion) throws org.apache.commons.math3.exception.NumberIsTooSmallException {
		if (contraction < expansion) {
			final org.apache.commons.math3.exception.NumberIsTooSmallException e = new org.apache.commons.math3.exception.NumberIsTooSmallException(contraction, 1, true);
			e.getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR, contraction, expansion);
			throw e;
		}
		if (contraction <= 1) {
			final org.apache.commons.math3.exception.NumberIsTooSmallException e = new org.apache.commons.math3.exception.NumberIsTooSmallException(contraction, 1, false);
			e.getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_ONE, contraction);
			throw e;
		}
		if (expansion <= 1) {
			final org.apache.commons.math3.exception.NumberIsTooSmallException e = new org.apache.commons.math3.exception.NumberIsTooSmallException(contraction, 1, false);
			e.getContext().addMessage(org.apache.commons.math3.exception.util.LocalizedFormats.EXPANSION_FACTOR_SMALLER_THAN_ONE, expansion);
			throw e;
		}
	}

	public synchronized void clear() {
		numElements = 0;
		startIndex = 0;
	}

	public synchronized void contract() {
		final double[] tempArray = new double[(numElements) + 1];
		java.lang.System.arraycopy(internalArray, startIndex, tempArray, 0, numElements);
		internalArray = tempArray;
		startIndex = 0;
	}

	public synchronized void discardFrontElements(int i) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		discardExtremeElements(i, true);
	}

	public synchronized void discardMostRecentElements(int i) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		discardExtremeElements(i, false);
	}

	private synchronized void discardExtremeElements(int i, boolean front) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (i > (numElements)) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY, i, numElements);
		}else
			if (i < 0) {
				throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_DISCARD_NEGATIVE_NUMBER_OF_ELEMENTS, i);
			}else {
				numElements -= i;
				if (front) {
					startIndex += i;
				}
			}
		
		if (shouldContract()) {
			contract();
		}
	}

	protected synchronized void expand() {
		int newSize = 0;
		if ((expansionMode) == (org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE)) {
			newSize = ((int) (org.apache.commons.math3.util.FastMath.ceil(((internalArray.length) * (expansionFactor)))));
		}else {
			newSize = ((int) ((internalArray.length) + (org.apache.commons.math3.util.FastMath.round(expansionFactor))));
		}
		final double[] tempArray = new double[newSize];
		java.lang.System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
		internalArray = tempArray;
	}

	private synchronized void expandTo(int size) {
		final double[] tempArray = new double[size];
		java.lang.System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
		internalArray = tempArray;
	}

	@java.lang.Deprecated
	public float getContractionCriteria() {
		return ((float) (getContractionCriterion()));
	}

	public double getContractionCriterion() {
		return contractionCriterion;
	}

	public synchronized double getElement(int index) {
		if (index >= (numElements)) {
			throw new java.lang.ArrayIndexOutOfBoundsException(index);
		}else
			if (index >= 0) {
				return internalArray[((startIndex) + index)];
			}else {
				throw new java.lang.ArrayIndexOutOfBoundsException(index);
			}
		
	}

	public synchronized double[] getElements() {
		final double[] elementArray = new double[numElements];
		java.lang.System.arraycopy(internalArray, startIndex, elementArray, 0, numElements);
		return elementArray;
	}

	@java.lang.Deprecated
	public float getExpansionFactor() {
		return ((float) (expansionFactor));
	}

	public int getExpansionMode() {
		switch (expansionMode) {
			case MULTIPLICATIVE :
				return org.apache.commons.math3.util.ResizableDoubleArray.MULTIPLICATIVE_MODE;
			case ADDITIVE :
				return org.apache.commons.math3.util.ResizableDoubleArray.ADDITIVE_MODE;
			default :
				throw new org.apache.commons.math3.exception.MathInternalError();
		}
	}

	@java.lang.Deprecated
	synchronized int getInternalLength() {
		return internalArray.length;
	}

	public int getCapacity() {
		return internalArray.length;
	}

	public synchronized int getNumElements() {
		return numElements;
	}

	@java.lang.Deprecated
	public synchronized double[] getInternalValues() {
		return internalArray;
	}

	protected double[] getArrayRef() {
		return internalArray;
	}

	protected int getStartIndex() {
		return startIndex;
	}

	@java.lang.Deprecated
	public void setContractionCriteria(float contractionCriteria) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		checkContractExpand(contractionCriteria, getExpansionFactor());
		synchronized(org.apache.commons.math3.util.ResizableDoubleArray.this) {
			org.apache.commons.math3.util.ResizableDoubleArray.this.contractionCriterion = contractionCriteria;
		}
	}

	public double compute(org.apache.commons.math3.util.MathArrays.Function f) {
		return f.evaluate(internalArray, startIndex, numElements);
	}

	public synchronized void setElement(int index, double value) {
		if (index < 0) {
			throw new java.lang.ArrayIndexOutOfBoundsException(index);
		}
		if ((index + 1) > (numElements)) {
			numElements = index + 1;
		}
		if (((startIndex) + index) >= (internalArray.length)) {
			expandTo(((startIndex) + (index + 1)));
		}
		internalArray[((startIndex) + index)] = value;
	}

	@java.lang.Deprecated
	public void setExpansionFactor(float expansionFactor) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		checkContractExpand(getContractionCriterion(), expansionFactor);
		synchronized(org.apache.commons.math3.util.ResizableDoubleArray.this) {
			org.apache.commons.math3.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
		}
	}

	@java.lang.Deprecated
	public void setExpansionMode(int expansionMode) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if ((expansionMode != (org.apache.commons.math3.util.ResizableDoubleArray.MULTIPLICATIVE_MODE)) && (expansionMode != (org.apache.commons.math3.util.ResizableDoubleArray.ADDITIVE_MODE))) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.UNSUPPORTED_EXPANSION_MODE, expansionMode, org.apache.commons.math3.util.ResizableDoubleArray.MULTIPLICATIVE_MODE, "MULTIPLICATIVE_MODE", org.apache.commons.math3.util.ResizableDoubleArray.ADDITIVE_MODE, "ADDITIVE_MODE");
		}
		synchronized(org.apache.commons.math3.util.ResizableDoubleArray.this) {
			if (expansionMode == (org.apache.commons.math3.util.ResizableDoubleArray.MULTIPLICATIVE_MODE)) {
				setExpansionMode(org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE);
			}else
				if (expansionMode == (org.apache.commons.math3.util.ResizableDoubleArray.ADDITIVE_MODE)) {
					setExpansionMode(org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.ADDITIVE);
				}
			
		}
	}

	@java.lang.Deprecated
	public void setExpansionMode(org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode expansionMode) {
		org.apache.commons.math3.util.ResizableDoubleArray.this.expansionMode = expansionMode;
	}

	@java.lang.Deprecated
	protected void setInitialCapacity(int initialCapacity) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
	}

	public synchronized void setNumElements(int i) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (i < 0) {
			throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_NOT_POSITIVE, i);
		}
		final int newSize = (startIndex) + i;
		if (newSize > (internalArray.length)) {
			expandTo(newSize);
		}
		numElements = i;
	}

	private synchronized boolean shouldContract() {
		if ((expansionMode) == (org.apache.commons.math3.util.ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE)) {
			return ((internalArray.length) / ((float) (numElements))) > (contractionCriterion);
		}else {
			return ((internalArray.length) - (numElements)) > (contractionCriterion);
		}
	}

	@java.lang.Deprecated
	public synchronized int start() {
		return startIndex;
	}

	public static void copy(org.apache.commons.math3.util.ResizableDoubleArray source, org.apache.commons.math3.util.ResizableDoubleArray dest) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(source);
		org.apache.commons.math3.util.MathUtils.checkNotNull(dest);
		synchronized(source) {
			synchronized(dest) {
				dest.contractionCriterion = source.contractionCriterion;
				dest.expansionFactor = source.expansionFactor;
				dest.expansionMode = source.expansionMode;
				dest.internalArray = new double[source.internalArray.length];
				java.lang.System.arraycopy(source.internalArray, 0, dest.internalArray, 0, dest.internalArray.length);
				dest.numElements = source.numElements;
				dest.startIndex = source.startIndex;
			}
		}
	}

	public synchronized org.apache.commons.math3.util.ResizableDoubleArray copy() {
		final org.apache.commons.math3.util.ResizableDoubleArray result = new org.apache.commons.math3.util.ResizableDoubleArray();
		org.apache.commons.math3.util.ResizableDoubleArray.copy(org.apache.commons.math3.util.ResizableDoubleArray.this, result);
		return result;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math3.util.ResizableDoubleArray.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math3.util.ResizableDoubleArray) == false) {
			return false;
		}
		synchronized(org.apache.commons.math3.util.ResizableDoubleArray.this) {
			synchronized(object) {
				boolean result = true;
				final org.apache.commons.math3.util.ResizableDoubleArray other = ((org.apache.commons.math3.util.ResizableDoubleArray) (object));
				result = result && ((other.contractionCriterion) == (contractionCriterion));
				result = result && ((other.expansionFactor) == (expansionFactor));
				result = result && ((other.expansionMode) == (expansionMode));
				result = result && ((other.numElements) == (numElements));
				result = result && ((other.startIndex) == (startIndex));
				if (!result) {
					return false;
				}else {
					return java.util.Arrays.equals(internalArray, other.internalArray);
				}
			}
		}
	}

	@java.lang.Override
	public synchronized int hashCode() {
		final int[] hashData = new int[6];
		hashData[0] = java.lang.Double.valueOf(expansionFactor).hashCode();
		hashData[1] = java.lang.Double.valueOf(contractionCriterion).hashCode();
		hashData[2] = expansionMode.hashCode();
		hashData[3] = java.util.Arrays.hashCode(internalArray);
		hashData[4] = numElements;
		hashData[5] = startIndex;
		return java.util.Arrays.hashCode(hashData);
	}
}

