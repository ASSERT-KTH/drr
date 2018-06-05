

package org.apache.commons.math.linear;


public class DenseRealMatrix extends org.apache.commons.math.linear.AbstractRealMatrix implements java.io.Serializable {
	private static final long serialVersionUID = 4991895511313664478L;

	public static final int BLOCK_SIZE = 52;

	private final double[][] blocks;

	private final int rows;

	private final int columns;

	private final int blockRows;

	private final int blockColumns;

	public DenseRealMatrix(final int rows, final int columns) throws java.lang.IllegalArgumentException {
		super(rows, columns);
		this.rows = rows;
		this.columns = columns;
		blockRows = ((rows + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		blockColumns = ((columns + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		blocks = org.apache.commons.math.linear.DenseRealMatrix.createBlocksLayout(rows, columns);
	}

	public DenseRealMatrix(final double[][] rawData) throws java.lang.IllegalArgumentException {
		this(rawData.length, rawData[0].length, org.apache.commons.math.linear.DenseRealMatrix.toBlocksLayout(rawData), false);
	}

	public DenseRealMatrix(final int rows, final int columns, final double[][] blockData, final boolean copyArray) throws java.lang.IllegalArgumentException {
		super(rows, columns);
		this.rows = rows;
		this.columns = columns;
		blockRows = ((rows + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		blockColumns = ((columns + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		if (copyArray) {
			blocks = new double[(blockRows) * (blockColumns)][];
		}else {
			blocks = blockData;
		}
		int index = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock , ++index) {
				if ((blockData[index].length) != (iHeight * (blockWidth(jBlock)))) {
					throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("wrong array shape (block length = {0}, expected {1})", blockData[index].length, (iHeight * (blockWidth(jBlock))));
				}
				if (copyArray) {
					blocks[index] = blockData[index].clone();
				}
			}
		}
	}

	public static double[][] toBlocksLayout(final double[][] rawData) throws java.lang.IllegalArgumentException {
		final int rows = rawData.length;
		final int columns = rawData[0].length;
		final int blockRows = ((rows + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockColumns = ((columns + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		for (int i = 0; i < (rawData.length); ++i) {
			final int length = rawData[i].length;
			if (length != columns) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some rows have length {0} while others have length {1}", columns, length);
			}
		}
		final double[][] blocks = new double[blockRows * blockColumns][];
		for (int iBlock = 0, blockIndex = 0; iBlock < blockRows; ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			final int iHeight = pEnd - pStart;
			for (int jBlock = 0; jBlock < blockColumns; ++jBlock , ++blockIndex) {
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				final int jWidth = qEnd - qStart;
				final double[] block = new double[iHeight * jWidth];
				blocks[blockIndex] = block;
				for (int p = pStart, index = 0; p < pEnd; ++p , index += jWidth) {
					java.lang.System.arraycopy(rawData[p], qStart, block, index, jWidth);
				}
			}
		}
		return blocks;
	}

	public static double[][] createBlocksLayout(final int rows, final int columns) {
		final int blockRows = ((rows + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockColumns = ((columns + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final double[][] blocks = new double[blockRows * blockColumns][];
		for (int iBlock = 0, blockIndex = 0; iBlock < blockRows; ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			final int iHeight = pEnd - pStart;
			for (int jBlock = 0; jBlock < blockColumns; ++jBlock , ++blockIndex) {
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				final int jWidth = qEnd - qStart;
				blocks[blockIndex] = new double[iHeight * jWidth];
			}
		}
		return blocks;
	}

	public org.apache.commons.math.linear.RealMatrix createMatrix(final int rowDimension, final int columnDimension) throws java.lang.IllegalArgumentException {
		return new org.apache.commons.math.linear.DenseRealMatrix(rowDimension, columnDimension);
	}

	public org.apache.commons.math.linear.RealMatrix copy() {
		org.apache.commons.math.linear.DenseRealMatrix copied = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
		for (int i = 0; i < (blocks.length); ++i) {
			java.lang.System.arraycopy(blocks[i], 0, copied.blocks[i], 0, blocks[i].length);
		}
		return copied;
	}

	public org.apache.commons.math.linear.RealMatrix add(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return add(((org.apache.commons.math.linear.DenseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			checkAdditionCompatible(m);
			final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final double[] outBlock = out.blocks[blockIndex];
					final double[] tBlock = blocks[blockIndex];
					final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
					final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
					for (int p = pStart, k = 0; p < pEnd; ++p) {
						for (int q = qStart; q < qEnd; ++q , ++k) {
							outBlock[k] = (tBlock[k]) + (m.getEntry(p, q));
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math.linear.DenseRealMatrix add(final org.apache.commons.math.linear.DenseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkAdditionCompatible(m);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			final double[] mBlock = m.blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) + (mBlock[k]);
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix subtract(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return subtract(((org.apache.commons.math.linear.DenseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			checkSubtractionCompatible(m);
			final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final double[] outBlock = out.blocks[blockIndex];
					final double[] tBlock = blocks[blockIndex];
					final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
					final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
					for (int p = pStart, k = 0; p < pEnd; ++p) {
						for (int q = qStart; q < qEnd; ++q , ++k) {
							outBlock[k] = (tBlock[k]) - (m.getEntry(p, q));
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math.linear.DenseRealMatrix subtract(final org.apache.commons.math.linear.DenseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkSubtractionCompatible(m);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			final double[] mBlock = m.blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) - (mBlock[k]);
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix scalarAdd(final double d) throws java.lang.IllegalArgumentException {
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) + d;
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix scalarMultiply(final double d) throws java.lang.IllegalArgumentException {
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) * d;
			}
		}
		return out;
	}

	public org.apache.commons.math.linear.RealMatrix multiply(final org.apache.commons.math.linear.RealMatrix m) throws java.lang.IllegalArgumentException {
		try {
			return multiply(((org.apache.commons.math.linear.DenseRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			checkMultiplicationCompatible(m);
			final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, m.getColumnDimension());
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), m.getColumnDimension());
					final double[] outBlock = out.blocks[blockIndex];
					for (int kBlock = 0; kBlock < (blockColumns); ++kBlock) {
						final int kWidth = blockWidth(kBlock);
						final double[] tBlock = blocks[((iBlock * (blockColumns)) + kBlock)];
						final int rStart = kBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
						for (int p = pStart, k = 0; p < pEnd; ++p) {
							final int lStart = (p - pStart) * kWidth;
							final int lEnd = lStart + kWidth;
							for (int q = qStart; q < qEnd; ++q) {
								double sum = 0;
								for (int l = lStart, r = rStart; l < lEnd; ++l , ++r) {
									sum += (tBlock[l]) * (m.getEntry(r, q));
								}
								outBlock[(k++)] += sum;
							}
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math.linear.DenseRealMatrix multiply(org.apache.commons.math.linear.DenseRealMatrix m) throws java.lang.IllegalArgumentException {
		checkMultiplicationCompatible(m);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, m.columns);
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
				final int jWidth = out.blockWidth(jBlock);
				final int jWidth2 = jWidth + jWidth;
				final int jWidth3 = jWidth2 + jWidth;
				final int jWidth4 = jWidth3 + jWidth;
				final double[] outBlock = out.blocks[blockIndex];
				for (int kBlock = 0; kBlock < (blockColumns); ++kBlock) {
					final int kWidth = blockWidth(kBlock);
					final double[] tBlock = blocks[((iBlock * (blockColumns)) + kBlock)];
					final double[] mBlock = m.blocks[((kBlock * (m.blockColumns)) + jBlock)];
					for (int p = pStart, k = 0; p < pEnd; ++p) {
						final int lStart = (p - pStart) * kWidth;
						final int lEnd = lStart + kWidth;
						for (int nStart = 0; nStart < jWidth; ++nStart) {
							double sum = 0;
							int l = lStart;
							int n = nStart;
							while (l < (lEnd - 3)) {
								sum += ((((tBlock[l]) * (mBlock[n])) + ((tBlock[(l + 1)]) * (mBlock[(n + jWidth)]))) + ((tBlock[(l + 2)]) * (mBlock[(n + jWidth2)]))) + ((tBlock[(l + 3)]) * (mBlock[(n + jWidth3)]));
								l += 4;
								n += jWidth4;
							} 
							while (l < lEnd) {
								sum += (tBlock[(l++)]) * (mBlock[n]);
								n += jWidth;
							} 
							outBlock[(k++)] += sum;
						}
					}
				}
				++blockIndex;
			}
		}
		return out;
	}

	public double[][] getData() {
		final double[][] data = new double[getRowDimension()][getColumnDimension()];
		final int lastColumns = (columns) - (((blockColumns) - 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			int regularPos = 0;
			int lastPos = 0;
			for (int p = pStart; p < pEnd; ++p) {
				final double[] dataP = data[p];
				int blockIndex = iBlock * (blockColumns);
				int dataPos = 0;
				for (int jBlock = 0; jBlock < ((blockColumns) - 1); ++jBlock) {
					java.lang.System.arraycopy(blocks[(blockIndex++)], regularPos, dataP, dataPos, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					dataPos += org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE;
				}
				java.lang.System.arraycopy(blocks[blockIndex], lastPos, dataP, dataPos, lastColumns);
				regularPos += org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE;
				lastPos += lastColumns;
			}
		}
		return data;
	}

	public double getNorm() {
		final double[] colSums = new double[org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE];
		double maxColSum = 0;
		for (int jBlock = 0; jBlock < (blockColumns); jBlock++) {
			final int jWidth = blockWidth(jBlock);
			java.util.Arrays.fill(colSums, 0, jWidth, 0.0);
			for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
				final int iHeight = blockHeight(iBlock);
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int j = 0; j < jWidth; ++j) {
					double sum = 0;
					for (int i = 0; i < iHeight; ++i) {
						sum += java.lang.Math.abs(block[((i * jWidth) + j)]);
					}
					colSums[j] += sum;
				}
			}
			for (int j = 0; j < jWidth; ++j) {
				maxColSum = java.lang.Math.max(maxColSum, colSums[j]);
			}
		}
		return maxColSum;
	}

	public double getFrobeniusNorm() {
		double sum2 = 0;
		for (int blockIndex = 0; blockIndex < (blocks.length); ++blockIndex) {
			for (final double entry : blocks[blockIndex]) {
				sum2 += entry * entry;
			}
		}
		return java.lang.Math.sqrt(sum2);
	}

	public org.apache.commons.math.linear.RealMatrix getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math.linear.MatrixIndexException {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		final int blockStartRow = startRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int rowsShift = startRow % (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockStartColumn = startColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int columnsShift = startColumn % (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		for (int iBlock = 0, pBlock = blockStartRow; iBlock < (out.blockRows); ++iBlock , ++pBlock) {
			final int iHeight = out.blockHeight(iBlock);
			for (int jBlock = 0, qBlock = blockStartColumn; jBlock < (out.blockColumns); ++jBlock , ++qBlock) {
				final int jWidth = out.blockWidth(jBlock);
				final int outIndex = (iBlock * (out.blockColumns)) + jBlock;
				final double[] outBlock = out.blocks[outIndex];
				final int index = (pBlock * (blockColumns)) + qBlock;
				final int width = blockWidth(qBlock);
				final int heightExcess = (iHeight + rowsShift) - (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int widthExcess = (jWidth + columnsShift) - (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				if (heightExcess > 0) {
					if (widthExcess > 0) {
						final int width2 = blockWidth((qBlock + 1));
						copyBlockPart(blocks[index], width, rowsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, columnsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + 1)], width2, rowsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, 0, widthExcess, outBlock, jWidth, 0, (jWidth - widthExcess));
						copyBlockPart(blocks[(index + (blockColumns))], width, 0, heightExcess, columnsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, outBlock, jWidth, (iHeight - heightExcess), 0);
						copyBlockPart(blocks[((index + (blockColumns)) + 1)], width2, 0, heightExcess, 0, widthExcess, outBlock, jWidth, (iHeight - heightExcess), (jWidth - widthExcess));
					}else {
						copyBlockPart(blocks[index], width, rowsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, columnsShift, (jWidth + columnsShift), outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + (blockColumns))], width, 0, heightExcess, columnsShift, (jWidth + columnsShift), outBlock, jWidth, (iHeight - heightExcess), 0);
					}
				}else {
					if (widthExcess > 0) {
						final int width2 = blockWidth((qBlock + 1));
						copyBlockPart(blocks[index], width, rowsShift, (iHeight + rowsShift), columnsShift, org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE, outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + 1)], width2, rowsShift, (iHeight + rowsShift), 0, widthExcess, outBlock, jWidth, 0, (jWidth - widthExcess));
					}else {
						copyBlockPart(blocks[index], width, rowsShift, (iHeight + rowsShift), columnsShift, (jWidth + columnsShift), outBlock, jWidth, 0, 0);
					}
				}
			}
		}
		return out;
	}

	private void copyBlockPart(final double[] srcBlock, final int srcWidth, final int srcStartRow, final int srcEndRow, final int srcStartColumn, final int srcEndColumn, final double[] dstBlock, final int dstWidth, final int dstStartRow, final int dstStartColumn) {
		final int length = srcEndColumn - srcStartColumn;
		int srcPos = (srcStartRow * srcWidth) + srcStartColumn;
		int dstPos = (dstStartRow * dstWidth) + dstStartColumn;
		for (int srcRow = srcStartRow; srcRow < srcEndRow; ++srcRow) {
			java.lang.System.arraycopy(srcBlock, srcPos, dstBlock, dstPos, length);
			srcPos += srcWidth;
			dstPos += dstWidth;
		}
	}

	public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws org.apache.commons.math.linear.MatrixIndexException {
		final int refLength = subMatrix[0].length;
		if (refLength < 1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("matrix must have at least one column");
		}
		final int endRow = (row + (subMatrix.length)) - 1;
		final int endColumn = (column + refLength) - 1;
		checkSubMatrixIndex(row, endRow, column, endColumn);
		for (final double[] subRow : subMatrix) {
			if ((subRow.length) != refLength) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("some rows have length {0} while others have length {1}", refLength, subRow.length);
			}
		}
		final int blockStartRow = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockEndRow = (endRow + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockStartColumn = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int blockEndColumn = (endColumn + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		for (int iBlock = blockStartRow; iBlock < blockEndRow; ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final int firstRow = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int iStart = java.lang.Math.max(row, firstRow);
			final int iEnd = java.lang.Math.min((endRow + 1), (firstRow + iHeight));
			for (int jBlock = blockStartColumn; jBlock < blockEndColumn; ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int firstColumn = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int jStart = java.lang.Math.max(column, firstColumn);
				final int jEnd = java.lang.Math.min((endColumn + 1), (firstColumn + jWidth));
				final int jLength = jEnd - jStart;
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int i = iStart; i < iEnd; ++i) {
					java.lang.System.arraycopy(subMatrix[(i - row)], (jStart - column), block, (((i - firstRow) * jWidth) + (jStart - firstColumn)), jLength);
				}
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getRowMatrix(final int row) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(1, columns);
		final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		int outBlockIndex = 0;
		int outIndex = 0;
		double[] outBlock = out.blocks[outBlockIndex];
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			final int available = (outBlock.length) - outIndex;
			if (jWidth > available) {
				java.lang.System.arraycopy(block, (iRow * jWidth), outBlock, outIndex, available);
				outBlock = out.blocks[(++outBlockIndex)];
				java.lang.System.arraycopy(block, (iRow * jWidth), outBlock, 0, (jWidth - available));
				outIndex = jWidth - available;
			}else {
				java.lang.System.arraycopy(block, (iRow * jWidth), outBlock, outIndex, jWidth);
				outIndex += jWidth;
			}
		}
		return out;
	}

	public void setRowMatrix(final int row, final org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		try {
			setRowMatrix(row, ((org.apache.commons.math.linear.DenseRealMatrix) (matrix)));
		} catch (java.lang.ClassCastException cce) {
			super.setRowMatrix(row, matrix);
		}
	}

	public void setRowMatrix(final int row, final org.apache.commons.math.linear.DenseRealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		if (((matrix.getRowDimension()) != 1) || ((matrix.getColumnDimension()) != nCols)) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", matrix.getRowDimension(), matrix.getColumnDimension(), 1, nCols);
		}
		final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		int mBlockIndex = 0;
		int mIndex = 0;
		double[] mBlock = matrix.blocks[mBlockIndex];
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			final int available = (mBlock.length) - mIndex;
			if (jWidth > available) {
				java.lang.System.arraycopy(mBlock, mIndex, block, (iRow * jWidth), available);
				mBlock = matrix.blocks[(++mBlockIndex)];
				java.lang.System.arraycopy(mBlock, 0, block, (iRow * jWidth), (jWidth - available));
				mIndex = jWidth - available;
			}else {
				java.lang.System.arraycopy(mBlock, mIndex, block, (iRow * jWidth), jWidth);
				mIndex += jWidth;
			}
		}
	}

	public org.apache.commons.math.linear.RealMatrix getColumnMatrix(final int column) throws org.apache.commons.math.linear.MatrixIndexException {
		checkColumnIndex(column);
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(rows, 1);
		final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int outBlockIndex = 0;
		int outIndex = 0;
		double[] outBlock = out.blocks[outBlockIndex];
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				if (outIndex >= (outBlock.length)) {
					outBlock = out.blocks[(++outBlockIndex)];
					outIndex = 0;
				}
				outBlock[(outIndex++)] = block[((i * jWidth) + jColumn)];
			}
		}
		return out;
	}

	public void setColumnMatrix(final int column, final org.apache.commons.math.linear.RealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		try {
			setColumnMatrix(column, ((org.apache.commons.math.linear.DenseRealMatrix) (matrix)));
		} catch (java.lang.ClassCastException cce) {
			super.setColumnMatrix(column, matrix);
		}
	}

	void setColumnMatrix(final int column, final org.apache.commons.math.linear.DenseRealMatrix matrix) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		if (((matrix.getRowDimension()) != nRows) || ((matrix.getColumnDimension()) != 1)) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", matrix.getRowDimension(), matrix.getColumnDimension(), nRows, 1);
		}
		final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int mBlockIndex = 0;
		int mIndex = 0;
		double[] mBlock = matrix.blocks[mBlockIndex];
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				if (mIndex >= (mBlock.length)) {
					mBlock = matrix.blocks[(++mBlockIndex)];
					mIndex = 0;
				}
				block[((i * jWidth) + jColumn)] = mBlock[(mIndex++)];
			}
		}
	}

	public org.apache.commons.math.linear.RealVector getRowVector(final int row) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		final double[] outData = new double[columns];
		final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(block, (iRow * jWidth), outData, outIndex, jWidth);
			outIndex += jWidth;
		}
		return new org.apache.commons.math.linear.RealVectorImpl(outData, false);
	}

	public void setRowVector(final int row, final org.apache.commons.math.linear.RealVector vector) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		try {
			setRow(row, ((org.apache.commons.math.linear.RealVectorImpl) (vector)).getDataRef());
		} catch (java.lang.ClassCastException cce) {
			super.setRowVector(row, vector);
		}
	}

	public org.apache.commons.math.linear.RealVector getColumnVector(final int column) throws org.apache.commons.math.linear.MatrixIndexException {
		checkColumnIndex(column);
		final double[] outData = new double[rows];
		final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int outIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				outData[(outIndex++)] = block[((i * jWidth) + jColumn)];
			}
		}
		return new org.apache.commons.math.linear.RealVectorImpl(outData, false);
	}

	public void setColumnVector(final int column, final org.apache.commons.math.linear.RealVector vector) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		try {
			setColumn(column, ((org.apache.commons.math.linear.RealVectorImpl) (vector)).getDataRef());
		} catch (java.lang.ClassCastException cce) {
			super.setColumnVector(column, vector);
		}
	}

	public double[] getRow(final int row) throws org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		final double[] out = new double[columns];
		final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(block, (iRow * jWidth), out, outIndex, jWidth);
			outIndex += jWidth;
		}
		return out;
	}

	public void setRow(final int row, final double[] array) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		checkRowIndex(row);
		final int nCols = getColumnDimension();
		if ((array.length) != nCols) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", 1, array.length, 1, nCols);
		}
		final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(array, outIndex, block, (iRow * jWidth), jWidth);
			outIndex += jWidth;
		}
	}

	public double[] getColumn(final int column) throws org.apache.commons.math.linear.MatrixIndexException {
		checkColumnIndex(column);
		final double[] out = new double[rows];
		final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int outIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				out[(outIndex++)] = block[((i * jWidth) + jColumn)];
			}
		}
		return out;
	}

	public void setColumn(final int column, final double[] array) throws org.apache.commons.math.linear.InvalidMatrixException, org.apache.commons.math.linear.MatrixIndexException {
		checkColumnIndex(column);
		final int nRows = getRowDimension();
		if ((array.length) != nRows) {
			throw new org.apache.commons.math.linear.InvalidMatrixException("dimensions mismatch: got {0}x{1} but expected {2}x{3}", array.length, 1, nRows, 1);
		}
		final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int outIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				block[((i * jWidth) + jColumn)] = array[(outIndex++)];
			}
		}
	}

	public double getEntry(final int row, final int column) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int k = ((row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)));
			return blocks[((iBlock * (blockColumns)) + jBlock)][k];
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("no entry at indices ({0}, {1}) in a {2}x{3} matrix", row, column, getRowDimension(), getColumnDimension());
		}
	}

	public void setEntry(final int row, final int column, final double value) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int k = ((row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)));
			blocks[((iBlock * (blockColumns)) + jBlock)][k] = value;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("no entry at indices ({0}, {1}) in a {2}x{3} matrix", row, column, getRowDimension(), getColumnDimension());
		}
	}

	public void addToEntry(final int row, final int column, final double increment) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int k = ((row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)));
			blocks[((iBlock * (blockColumns)) + jBlock)][k] += increment;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("no entry at indices ({0}, {1}) in a {2}x{3} matrix", row, column, getRowDimension(), getColumnDimension());
		}
	}

	public void multiplyEntry(final int row, final int column, final double factor) throws org.apache.commons.math.linear.MatrixIndexException {
		try {
			final int iBlock = row / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int jBlock = column / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int k = ((row - (iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)));
			blocks[((iBlock * (blockColumns)) + jBlock)][k] *= factor;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			throw new org.apache.commons.math.linear.MatrixIndexException("no entry at indices ({0}, {1}) in a {2}x{3} matrix", row, column, getRowDimension(), getColumnDimension());
		}
	}

	public org.apache.commons.math.linear.RealMatrix transpose() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final org.apache.commons.math.linear.DenseRealMatrix out = new org.apache.commons.math.linear.DenseRealMatrix(nCols, nRows);
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (blockColumns); ++iBlock) {
			for (int jBlock = 0; jBlock < (blockRows); ++jBlock) {
				final double[] outBlock = out.blocks[blockIndex];
				final double[] tBlock = blocks[((jBlock * (blockColumns)) + iBlock)];
				final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
				for (int p = pStart, k = 0; p < pEnd; ++p) {
					final int lInc = pEnd - pStart;
					for (int q = qStart, l = p - pStart; q < qEnd; ++q , l += lInc) {
						outBlock[(k++)] = tBlock[l];
					}
				}
				++blockIndex;
			}
		}
		return out;
	}

	public int getRowDimension() {
		return rows;
	}

	public int getColumnDimension() {
		return columns;
	}

	public double[] operate(final double[] v) throws java.lang.IllegalArgumentException {
		if ((v.length) != (columns)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", v.length, columns);
		}
		final double[] out = new double[rows];
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				for (int p = pStart, k = 0; p < pEnd; ++p) {
					double sum = 0;
					int q = qStart;
					while (q < (qEnd - 3)) {
						sum += ((((block[k]) * (v[q])) + ((block[(k + 1)]) * (v[(q + 1)]))) + ((block[(k + 2)]) * (v[(q + 2)]))) + ((block[(k + 3)]) * (v[(q + 3)]));
						k += 4;
						q += 4;
					} 
					while (q < qEnd) {
						sum += (block[(k++)]) * (v[(q++)]);
					} 
					out[p] += sum;
				}
			}
		}
		return out;
	}

	public double[] preMultiply(final double[] v) throws java.lang.IllegalArgumentException {
		if ((v.length) != (rows)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", v.length, rows);
		}
		final double[] out = new double[columns];
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final int jWidth2 = jWidth + jWidth;
			final int jWidth3 = jWidth2 + jWidth;
			final int jWidth4 = jWidth3 + jWidth;
			final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
			for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
				for (int q = qStart; q < qEnd; ++q) {
					int k = q - qStart;
					double sum = 0;
					int p = pStart;
					while (p < (pEnd - 3)) {
						sum += ((((block[k]) * (v[p])) + ((block[(k + jWidth)]) * (v[(p + 1)]))) + ((block[(k + jWidth2)]) * (v[(p + 2)]))) + ((block[(k + jWidth3)]) * (v[(p + 3)]));
						k += jWidth4;
						p += 4;
					} 
					while (p < pEnd) {
						sum += (block[k]) * (v[(p++)]);
						k += jWidth;
					} 
					out[q] += sum;
				}
			}
		}
		return out;
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor) throws org.apache.commons.math.linear.MatrixVisitorException {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					for (int q = qStart, k = (p - pStart) * jWidth; q < qEnd; ++q , ++k) {
						block[k] = visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor) throws org.apache.commons.math.linear.MatrixVisitorException {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					for (int q = qStart, k = (p - pStart) * jWidth; q < qEnd; ++q , ++k) {
						visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math.linear.MatrixIndexException, org.apache.commons.math.linear.MatrixVisitorException {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pStart = java.lang.Math.max(startRow, p0);
			final int pEnd = java.lang.Math.min(((iBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = startColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int q0 = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qStart = java.lang.Math.max(startColumn, q0);
					final int qEnd = java.lang.Math.min(((jBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endColumn));
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					for (int q = qStart, k = (((p - p0) * jWidth) + qStart) - q0; q < qEnd; ++q , ++k) {
						block[k] = visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInRowOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math.linear.MatrixIndexException, org.apache.commons.math.linear.MatrixVisitorException {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pStart = java.lang.Math.max(startRow, p0);
			final int pEnd = java.lang.Math.min(((iBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = startColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int q0 = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
					final int qStart = java.lang.Math.max(startColumn, q0);
					final int qEnd = java.lang.Math.min(((jBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endColumn));
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					for (int q = qStart, k = (((p - p0) * jWidth) + qStart) - q0; q < qEnd; ++q , ++k) {
						visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor) throws org.apache.commons.math.linear.MatrixVisitorException {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0, blockIndex = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock , ++blockIndex) {
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				final double[] block = blocks[blockIndex];
				for (int p = pStart, k = 0; p < pEnd; ++p) {
					for (int q = qStart; q < qEnd; ++q , ++k) {
						block[k] = visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor) throws org.apache.commons.math.linear.MatrixVisitorException {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0, blockIndex = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pEnd = java.lang.Math.min((pStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock , ++blockIndex) {
				final int qStart = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qEnd = java.lang.Math.min((qStart + (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), columns);
				final double[] block = blocks[blockIndex];
				for (int p = pStart, k = 0; p < pEnd; ++p) {
					for (int q = qStart; q < qEnd; ++q , ++k) {
						visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math.linear.MatrixIndexException, org.apache.commons.math.linear.MatrixVisitorException {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pStart = java.lang.Math.max(startRow, p0);
			final int pEnd = java.lang.Math.min(((iBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int jBlock = startColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int q0 = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qStart = java.lang.Math.max(startColumn, q0);
				final int qEnd = java.lang.Math.min(((jBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endColumn));
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int p = pStart; p < pEnd; ++p) {
					for (int q = qStart, k = (((p - p0) * jWidth) + qStart) - q0; q < qEnd; ++q , ++k) {
						block[k] = visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math.linear.MatrixIndexException, org.apache.commons.math.linear.MatrixVisitorException {
		checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
			final int pStart = java.lang.Math.max(startRow, p0);
			final int pEnd = java.lang.Math.min(((iBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int jBlock = startColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE))); ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int q0 = jBlock * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE);
				final int qStart = java.lang.Math.max(startColumn, q0);
				final int qEnd = java.lang.Math.min(((jBlock + 1) * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)), (1 + endColumn));
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int p = pStart; p < pEnd; ++p) {
					for (int q = qStart, k = (((p - p0) * jWidth) + qStart) - q0; q < qEnd; ++q , ++k) {
						visitor.visit(p, q, block[k]);
					}
				}
			}
		}
		return visitor.end();
	}

	private int blockHeight(final int blockRow) {
		return blockRow == ((blockRows) - 1) ? (rows) - (blockRow * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) : org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE;
	}

	private int blockWidth(final int blockColumn) {
		return blockColumn == ((blockColumns) - 1) ? (columns) - (blockColumn * (org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE)) : org.apache.commons.math.linear.DenseRealMatrix.BLOCK_SIZE;
	}
}

