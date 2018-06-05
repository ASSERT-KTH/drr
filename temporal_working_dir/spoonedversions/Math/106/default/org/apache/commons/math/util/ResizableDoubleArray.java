

package org.apache.commons.math.util;


public class ResizableDoubleArray implements java.io.Serializable , org.apache.commons.math.util.DoubleArray {
	private static final long serialVersionUID = -3485529955529426875L;

	public static final int ADDITIVE_MODE = 1;

	public static final int MULTIPLICATIVE_MODE = 0;

	protected float contractionCriteria = 2.5F;

	protected float expansionFactor = 2.0F;

	protected int expansionMode = org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE;

	protected int initialCapacity = 16;

	protected double[] internalArray;

	protected int numElements = 0;

	protected int startIndex = 0;

	public ResizableDoubleArray() {
		internalArray = new double[initialCapacity];
	}

	public ResizableDoubleArray(int initialCapacity) {
		setInitialCapacity(initialCapacity);
		internalArray = new double[org.apache.commons.math.util.ResizableDoubleArray.this.initialCapacity];
	}

	public ResizableDoubleArray(int initialCapacity, float expansionFactor) {
		org.apache.commons.math.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
		setInitialCapacity(initialCapacity);
		internalArray = new double[initialCapacity];
		setContractionCriteria((expansionFactor + 0.5F));
	}

	public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria) {
		org.apache.commons.math.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
		setContractionCriteria(contractionCriteria);
		setInitialCapacity(initialCapacity);
		internalArray = new double[initialCapacity];
	}

	public ResizableDoubleArray(int initialCapacity, float expansionFactor, float contractionCriteria, int expansionMode) {
		org.apache.commons.math.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
		setContractionCriteria(contractionCriteria);
		setInitialCapacity(initialCapacity);
		setExpansionMode(expansionMode);
		internalArray = new double[initialCapacity];
	}

	public synchronized void addElement(double value) {
		(numElements)++;
		if (((startIndex) + (numElements)) > (internalArray.length)) {
			expand();
		}
		internalArray[((startIndex) + ((numElements) - 1))] = value;
		if (shouldContract()) {
			contract();
		}
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

	protected void checkContractExpand(float contractionCritera, float expansionFactor) {
		if (contractionCritera < expansionFactor) {
			java.lang.String msg = "Contraction criteria can never be smaller than " + ((("the expansion factor.  This would lead to a never " + "ending loop of expansion and contraction as a newly ") + "expanded internal storage array would immediately ") + "satisfy the criteria for contraction");
			throw new java.lang.IllegalArgumentException(msg);
		}
		if ((contractionCriteria) <= 1.0) {
			java.lang.String msg = "The contraction criteria must be a number larger " + ((("than one.  If the contractionCriteria is less than or " + "equal to one an endless loop of contraction and ") + "expansion would ensue as an internalArray.length ") + "== numElements would satisfy the contraction criteria");
			throw new java.lang.IllegalArgumentException(msg);
		}
		if (expansionFactor <= 1.0) {
			java.lang.String msg = "The expansion factor must be a number greater than 1.0";
			throw new java.lang.IllegalArgumentException(msg);
		}
	}

	public synchronized void clear() {
		numElements = 0;
		internalArray = new double[initialCapacity];
	}

	public synchronized void contract() {
		double[] tempArray = new double[(numElements) + 1];
		java.lang.System.arraycopy(internalArray, startIndex, tempArray, 0, numElements);
		internalArray = tempArray;
		startIndex = 0;
	}

	public synchronized void discardFrontElements(int i) {
		if (i > (numElements)) {
			java.lang.String msg = "Cannot discard more elements than are" + "contained in this array.";
			throw new java.lang.IllegalArgumentException(msg);
		}else
			if (i < 0) {
				java.lang.String msg = "Cannot discard a negative number of elements.";
				throw new java.lang.IllegalArgumentException(msg);
			}else {
				numElements -= i;
				startIndex += i;
			}
		
		if (shouldContract()) {
			contract();
		}
	}

	protected synchronized void expand() {
		int newSize = 0;
		if ((expansionMode) == (org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE)) {
			newSize = ((int) (java.lang.Math.ceil(((internalArray.length) * (expansionFactor)))));
		}else {
			newSize = (internalArray.length) + (java.lang.Math.round(expansionFactor));
		}
		double[] tempArray = new double[newSize];
		java.lang.System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
		internalArray = tempArray;
	}

	private synchronized void expandTo(int size) {
		double[] tempArray = new double[size];
		java.lang.System.arraycopy(internalArray, 0, tempArray, 0, internalArray.length);
		internalArray = tempArray;
	}

	public float getContractionCriteria() {
		return contractionCriteria;
	}

	public synchronized double getElement(int index) {
		if (index >= (numElements)) {
			java.lang.String msg = ("The index specified: " + index) + " is larger than the current number of elements";
			throw new java.lang.ArrayIndexOutOfBoundsException(msg);
		}else
			if (index >= 0) {
				return internalArray[((startIndex) + index)];
			}else {
				java.lang.String msg = "Elements cannot be retrieved from a negative array index";
				throw new java.lang.ArrayIndexOutOfBoundsException(msg);
			}
		
	}

	public synchronized double[] getElements() {
		double[] elementArray = new double[numElements];
		java.lang.System.arraycopy(internalArray, startIndex, elementArray, 0, numElements);
		return elementArray;
	}

	public float getExpansionFactor() {
		return expansionFactor;
	}

	public int getExpansionMode() {
		return expansionMode;
	}

	synchronized int getInternalLength() {
		return internalArray.length;
	}

	public synchronized int getNumElements() {
		return numElements;
	}

	public synchronized double[] getValues() {
		return internalArray;
	}

	public void setContractionCriteria(float contractionCriteria) {
		checkContractExpand(contractionCriteria, getExpansionFactor());
		org.apache.commons.math.util.ResizableDoubleArray.this.contractionCriteria = contractionCriteria;
	}

	public synchronized void setElement(int index, double value) {
		if (index < 0) {
			java.lang.String msg = "Cannot set an element at a negative index";
			throw new java.lang.ArrayIndexOutOfBoundsException(msg);
		}
		if ((index + 1) > (numElements)) {
			numElements = index + 1;
		}
		if (((startIndex) + index) >= (internalArray.length)) {
			expandTo(((startIndex) + (index + 1)));
		}
		internalArray[((startIndex) + index)] = value;
	}

	public void setExpansionFactor(float expansionFactor) {
		checkContractExpand(getContractionCriteria(), expansionFactor);
		org.apache.commons.math.util.ResizableDoubleArray.this.expansionFactor = expansionFactor;
	}

	public void setExpansionMode(int expansionMode) {
		if ((expansionMode != (org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE)) && (expansionMode != (org.apache.commons.math.util.ResizableDoubleArray.ADDITIVE_MODE))) {
			throw new java.lang.IllegalArgumentException("Illegal expansionMode setting.");
		}
		org.apache.commons.math.util.ResizableDoubleArray.this.expansionMode = expansionMode;
	}

	protected void setInitialCapacity(int initialCapacity) {
		if (initialCapacity > 0) {
			org.apache.commons.math.util.ResizableDoubleArray.this.initialCapacity = initialCapacity;
		}else {
			java.lang.String msg = ("The initial capacity supplied: " + initialCapacity) + "must be a positive integer";
			throw new java.lang.IllegalArgumentException(msg);
		}
	}

	public synchronized void setNumElements(int i) {
		if (i < 0) {
			java.lang.String msg = "Number of elements must be zero or a positive " + "integer";
			throw new java.lang.IllegalArgumentException(msg);
		}
		if (((startIndex) + i) > (internalArray.length)) {
			expandTo(((startIndex) + i));
		}
		numElements = i;
	}

	private synchronized boolean shouldContract() {
		if ((expansionMode) == (org.apache.commons.math.util.ResizableDoubleArray.MULTIPLICATIVE_MODE)) {
			return ((internalArray.length) / (numElements)) > (contractionCriteria);
		}else {
			return ((internalArray.length) - (numElements)) > (contractionCriteria);
		}
	}

	public synchronized int start() {
		return startIndex;
	}
}

