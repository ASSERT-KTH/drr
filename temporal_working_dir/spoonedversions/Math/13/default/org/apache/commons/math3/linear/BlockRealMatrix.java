

package org.apache.commons.math3.linear;


public class BlockRealMatrix extends org.apache.commons.math3.linear.AbstractRealMatrix implements java.io.Serializable {
	public static final int BLOCK_SIZE = 52;

	private static final long serialVersionUID = 4991895511313664478L;

	private final double[][] blocks;

	private final int rows;

	private final int columns;

	private final int blockRows;

	private final int blockColumns;

	public BlockRealMatrix(final int rows, final int columns) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rows, columns);
		this.rows = rows;
		this.columns = columns;
		blockRows = ((rows + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		blockColumns = ((columns + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		blocks = org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(rows, columns);
	}

	public BlockRealMatrix(final double[][] rawData) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		this(rawData.length, rawData[0].length, org.apache.commons.math3.linear.BlockRealMatrix.toBlocksLayout(rawData), false);
	}

	public BlockRealMatrix(final int rows, final int columns, final double[][] blockData, final boolean copyArray) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NotStrictlyPositiveException {
		super(rows, columns);
		this.rows = rows;
		this.columns = columns;
		blockRows = ((rows + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		blockColumns = ((columns + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
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
					throw new org.apache.commons.math3.exception.DimensionMismatchException(blockData[index].length, (iHeight * (blockWidth(jBlock))));
				}
				if (copyArray) {
					blocks[index] = blockData[index].clone();
				}
			}
		}
	}

	public static double[][] toBlocksLayout(final double[][] rawData) throws org.apache.commons.math3.exception.DimensionMismatchException {
		final int rows = rawData.length;
		final int columns = rawData[0].length;
		final int blockRows = ((rows + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockColumns = ((columns + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		for (int i = 0; i < (rawData.length); ++i) {
			final int length = rawData[i].length;
			if (length != columns) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(columns, length);
			}
		}
		final double[][] blocks = new double[blockRows * blockColumns][];
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			final int iHeight = pEnd - pStart;
			for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				final int jWidth = qEnd - qStart;
				final double[] block = new double[iHeight * jWidth];
				blocks[blockIndex] = block;
				int index = 0;
				for (int p = pStart; p < pEnd; ++p) {
					java.lang.System.arraycopy(rawData[p], qStart, block, index, jWidth);
					index += jWidth;
				}
				++blockIndex;
			}
		}
		return blocks;
	}

	public static double[][] createBlocksLayout(final int rows, final int columns) {
		final int blockRows = ((rows + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockColumns = ((columns + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) - 1) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final double[][] blocks = new double[blockRows * blockColumns][];
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			final int iHeight = pEnd - pStart;
			for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				final int jWidth = qEnd - qStart;
				blocks[blockIndex] = new double[iHeight * jWidth];
				++blockIndex;
			}
		}
		return blocks;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix createMatrix(final int rowDimension, final int columnDimension) throws org.apache.commons.math3.exception.NotStrictlyPositiveException {
		return new org.apache.commons.math3.linear.BlockRealMatrix(rowDimension, columnDimension);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix copy() {
		org.apache.commons.math3.linear.BlockRealMatrix copied = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
		for (int i = 0; i < (blocks.length); ++i) {
			java.lang.System.arraycopy(blocks[i], 0, copied.blocks[i], 0, blocks[i].length);
		}
		return copied;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix add(final org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			return add(((org.apache.commons.math3.linear.BlockRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
			final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final double[] outBlock = out.blocks[blockIndex];
					final double[] tBlock = blocks[blockIndex];
					final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
					final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
					int k = 0;
					for (int p = pStart; p < pEnd; ++p) {
						for (int q = qStart; q < qEnd; ++q) {
							outBlock[k] = (tBlock[k]) + (m.getEntry(p, q));
							++k;
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math3.linear.BlockRealMatrix add(final org.apache.commons.math3.linear.BlockRealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
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

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix subtract(final org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			return subtract(((org.apache.commons.math3.linear.BlockRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
			final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final double[] outBlock = out.blocks[blockIndex];
					final double[] tBlock = blocks[blockIndex];
					final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
					final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
					int k = 0;
					for (int p = pStart; p < pEnd; ++p) {
						for (int q = qStart; q < qEnd; ++q) {
							outBlock[k] = (tBlock[k]) - (m.getEntry(p, q));
							++k;
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math3.linear.BlockRealMatrix subtract(final org.apache.commons.math3.linear.BlockRealMatrix m) throws org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
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

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix scalarAdd(final double d) {
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) + d;
			}
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix scalarMultiply(final double d) {
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, columns);
		for (int blockIndex = 0; blockIndex < (out.blocks.length); ++blockIndex) {
			final double[] outBlock = out.blocks[blockIndex];
			final double[] tBlock = blocks[blockIndex];
			for (int k = 0; k < (outBlock.length); ++k) {
				outBlock[k] = (tBlock[k]) * d;
			}
		}
		return out;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix multiply(final org.apache.commons.math3.linear.RealMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException {
		try {
			return multiply(((org.apache.commons.math3.linear.BlockRealMatrix) (m)));
		} catch (java.lang.ClassCastException cce) {
			org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
			final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, m.getColumnDimension());
			int blockIndex = 0;
			for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
				final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
				for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
					final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), m.getColumnDimension());
					final double[] outBlock = out.blocks[blockIndex];
					for (int kBlock = 0; kBlock < (blockColumns); ++kBlock) {
						final int kWidth = blockWidth(kBlock);
						final double[] tBlock = blocks[((iBlock * (blockColumns)) + kBlock)];
						final int rStart = kBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
						int k = 0;
						for (int p = pStart; p < pEnd; ++p) {
							final int lStart = (p - pStart) * kWidth;
							final int lEnd = lStart + kWidth;
							for (int q = qStart; q < qEnd; ++q) {
								double sum = 0;
								int r = rStart;
								for (int l = lStart; l < lEnd; ++l) {
									sum += (tBlock[l]) * (m.getEntry(r, q));
									++r;
								}
								outBlock[k] += sum;
								++k;
							}
						}
					}
					++blockIndex;
				}
			}
			return out;
		}
	}

	public org.apache.commons.math3.linear.BlockRealMatrix multiply(org.apache.commons.math3.linear.BlockRealMatrix m) throws org.apache.commons.math3.exception.DimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.BlockRealMatrix.this, m);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, m.columns);
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
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
					int k = 0;
					for (int p = pStart; p < pEnd; ++p) {
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
							outBlock[k] += sum;
							++k;
						}
					}
				}
				++blockIndex;
			}
		}
		return out;
	}

	@java.lang.Override
	public double[][] getData() {
		final double[][] data = new double[getRowDimension()][getColumnDimension()];
		final int lastColumns = (columns) - (((blockColumns) - 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			int regularPos = 0;
			int lastPos = 0;
			for (int p = pStart; p < pEnd; ++p) {
				final double[] dataP = data[p];
				int blockIndex = iBlock * (blockColumns);
				int dataPos = 0;
				for (int jBlock = 0; jBlock < ((blockColumns) - 1); ++jBlock) {
					java.lang.System.arraycopy(blocks[(blockIndex++)], regularPos, dataP, dataPos, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					dataPos += org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE;
				}
				java.lang.System.arraycopy(blocks[blockIndex], lastPos, dataP, dataPos, lastColumns);
				regularPos += org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE;
				lastPos += lastColumns;
			}
		}
		return data;
	}

	@java.lang.Override
	public double getNorm() {
		final double[] colSums = new double[org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE];
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
						sum += org.apache.commons.math3.util.FastMath.abs(block[((i * jWidth) + j)]);
					}
					colSums[j] += sum;
				}
			}
			for (int j = 0; j < jWidth; ++j) {
				maxColSum = org.apache.commons.math3.util.FastMath.max(maxColSum, colSums[j]);
			}
		}
		return maxColSum;
	}

	@java.lang.Override
	public double getFrobeniusNorm() {
		double sum2 = 0;
		for (int blockIndex = 0; blockIndex < (blocks.length); ++blockIndex) {
			for (final double entry : blocks[blockIndex]) {
				sum2 += entry * entry;
			}
		}
		return org.apache.commons.math3.util.FastMath.sqrt(sum2);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix getSubMatrix(final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, startRow, endRow, startColumn, endColumn);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(((endRow - startRow) + 1), ((endColumn - startColumn) + 1));
		final int blockStartRow = startRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int rowsShift = startRow % (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockStartColumn = startColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int columnsShift = startColumn % (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		int pBlock = blockStartRow;
		for (int iBlock = 0; iBlock < (out.blockRows); ++iBlock) {
			final int iHeight = out.blockHeight(iBlock);
			int qBlock = blockStartColumn;
			for (int jBlock = 0; jBlock < (out.blockColumns); ++jBlock) {
				final int jWidth = out.blockWidth(jBlock);
				final int outIndex = (iBlock * (out.blockColumns)) + jBlock;
				final double[] outBlock = out.blocks[outIndex];
				final int index = (pBlock * (blockColumns)) + qBlock;
				final int width = blockWidth(qBlock);
				final int heightExcess = (iHeight + rowsShift) - (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int widthExcess = (jWidth + columnsShift) - (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				if (heightExcess > 0) {
					if (widthExcess > 0) {
						final int width2 = blockWidth((qBlock + 1));
						copyBlockPart(blocks[index], width, rowsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, columnsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + 1)], width2, rowsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, 0, widthExcess, outBlock, jWidth, 0, (jWidth - widthExcess));
						copyBlockPart(blocks[(index + (blockColumns))], width, 0, heightExcess, columnsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, outBlock, jWidth, (iHeight - heightExcess), 0);
						copyBlockPart(blocks[((index + (blockColumns)) + 1)], width2, 0, heightExcess, 0, widthExcess, outBlock, jWidth, (iHeight - heightExcess), (jWidth - widthExcess));
					}else {
						copyBlockPart(blocks[index], width, rowsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, columnsShift, (jWidth + columnsShift), outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + (blockColumns))], width, 0, heightExcess, columnsShift, (jWidth + columnsShift), outBlock, jWidth, (iHeight - heightExcess), 0);
					}
				}else {
					if (widthExcess > 0) {
						final int width2 = blockWidth((qBlock + 1));
						copyBlockPart(blocks[index], width, rowsShift, (iHeight + rowsShift), columnsShift, org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE, outBlock, jWidth, 0, 0);
						copyBlockPart(blocks[(index + 1)], width2, rowsShift, (iHeight + rowsShift), 0, widthExcess, outBlock, jWidth, 0, (jWidth - widthExcess));
					}else {
						copyBlockPart(blocks[index], width, rowsShift, (iHeight + rowsShift), columnsShift, (jWidth + columnsShift), outBlock, jWidth, 0, 0);
					}
				}
				++qBlock;
			}
			++pBlock;
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

	@java.lang.Override
	public void setSubMatrix(final double[][] subMatrix, final int row, final int column) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NoDataException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(subMatrix);
		final int refLength = subMatrix[0].length;
		if (refLength == 0) {
			throw new org.apache.commons.math3.exception.NoDataException(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN);
		}
		final int endRow = (row + (subMatrix.length)) - 1;
		final int endColumn = (column + refLength) - 1;
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row, endRow, column, endColumn);
		for (final double[] subRow : subMatrix) {
			if ((subRow.length) != refLength) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(refLength, subRow.length);
			}
		}
		final int blockStartRow = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockEndRow = (endRow + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockStartColumn = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int blockEndColumn = (endColumn + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		for (int iBlock = blockStartRow; iBlock < blockEndRow; ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final int firstRow = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int iStart = org.apache.commons.math3.util.FastMath.max(row, firstRow);
			final int iEnd = org.apache.commons.math3.util.FastMath.min((endRow + 1), (firstRow + iHeight));
			for (int jBlock = blockStartColumn; jBlock < blockEndColumn; ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int firstColumn = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int jStart = org.apache.commons.math3.util.FastMath.max(column, firstColumn);
				final int jEnd = org.apache.commons.math3.util.FastMath.min((endColumn + 1), (firstColumn + jWidth));
				final int jLength = jEnd - jStart;
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int i = iStart; i < iEnd; ++i) {
					java.lang.System.arraycopy(subMatrix[(i - row)], (jStart - column), block, (((i - firstRow) * jWidth) + (jStart - firstColumn)), jLength);
				}
			}
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix getRowMatrix(final int row) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(1, columns);
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public void setRowMatrix(final int row, final org.apache.commons.math3.linear.RealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			setRowMatrix(row, ((org.apache.commons.math3.linear.BlockRealMatrix) (matrix)));
		} catch (java.lang.ClassCastException cce) {
			super.setRowMatrix(row, matrix);
		}
	}

	public void setRowMatrix(final int row, final org.apache.commons.math3.linear.BlockRealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row);
		final int nCols = getColumnDimension();
		if (((matrix.getRowDimension()) != 1) || ((matrix.getColumnDimension()) != nCols)) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), 1, nCols);
		}
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix getColumnMatrix(final int column) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, column);
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(rows, 1);
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public void setColumnMatrix(final int column, final org.apache.commons.math3.linear.RealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			setColumnMatrix(column, ((org.apache.commons.math3.linear.BlockRealMatrix) (matrix)));
		} catch (java.lang.ClassCastException cce) {
			super.setColumnMatrix(column, matrix);
		}
	}

	void setColumnMatrix(final int column, final org.apache.commons.math3.linear.BlockRealMatrix matrix) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, column);
		final int nRows = getRowDimension();
		if (((matrix.getRowDimension()) != nRows) || ((matrix.getColumnDimension()) != 1)) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(matrix.getRowDimension(), matrix.getColumnDimension(), nRows, 1);
		}
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getRowVector(final int row) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row);
		final double[] outData = new double[columns];
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(block, (iRow * jWidth), outData, outIndex, jWidth);
			outIndex += jWidth;
		}
		return new org.apache.commons.math3.linear.ArrayRealVector(outData, false);
	}

	@java.lang.Override
	public void setRowVector(final int row, final org.apache.commons.math3.linear.RealVector vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			setRow(row, ((org.apache.commons.math3.linear.ArrayRealVector) (vector)).getDataRef());
		} catch (java.lang.ClassCastException cce) {
			super.setRowVector(row, vector);
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getColumnVector(final int column) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, column);
		final double[] outData = new double[rows];
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
		final int jWidth = blockWidth(jBlock);
		int outIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int iHeight = blockHeight(iBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			for (int i = 0; i < iHeight; ++i) {
				outData[(outIndex++)] = block[((i * jWidth) + jColumn)];
			}
		}
		return new org.apache.commons.math3.linear.ArrayRealVector(outData, false);
	}

	@java.lang.Override
	public void setColumnVector(final int column, final org.apache.commons.math3.linear.RealVector vector) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		try {
			setColumn(column, ((org.apache.commons.math3.linear.ArrayRealVector) (vector)).getDataRef());
		} catch (java.lang.ClassCastException cce) {
			super.setColumnVector(column, vector);
		}
	}

	@java.lang.Override
	public double[] getRow(final int row) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row);
		final double[] out = new double[columns];
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(block, (iRow * jWidth), out, outIndex, jWidth);
			outIndex += jWidth;
		}
		return out;
	}

	@java.lang.Override
	public void setRow(final int row, final double[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row);
		final int nCols = getColumnDimension();
		if ((array.length) != nCols) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(1, array.length, 1, nCols);
		}
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int iRow = row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
		int outIndex = 0;
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
			java.lang.System.arraycopy(array, outIndex, block, (iRow * jWidth), jWidth);
			outIndex += jWidth;
		}
	}

	@java.lang.Override
	public double[] getColumn(final int column) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, column);
		final double[] out = new double[rows];
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public void setColumn(final int column, final double[] array) throws org.apache.commons.math3.exception.OutOfRangeException, org.apache.commons.math3.linear.MatrixDimensionMismatchException {
		org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, column);
		final int nRows = getRowDimension();
		if ((array.length) != nRows) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(array.length, 1, nRows, 1);
		}
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jColumn = column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE));
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

	@java.lang.Override
	public double getEntry(final int row, final int column) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row, column);
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int k = ((row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)));
		return blocks[((iBlock * (blockColumns)) + jBlock)][k];
	}

	@java.lang.Override
	public void setEntry(final int row, final int column, final double value) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row, column);
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int k = ((row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)));
		blocks[((iBlock * (blockColumns)) + jBlock)][k] = value;
	}

	@java.lang.Override
	public void addToEntry(final int row, final int column, final double increment) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row, column);
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int k = ((row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)));
		blocks[((iBlock * (blockColumns)) + jBlock)][k] += increment;
	}

	@java.lang.Override
	public void multiplyEntry(final int row, final int column, final double factor) throws org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, row, column);
		final int iBlock = row / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int jBlock = column / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
		final int k = ((row - (iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))) * (blockWidth(jBlock))) + (column - (jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)));
		blocks[((iBlock * (blockColumns)) + jBlock)][k] *= factor;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.BlockRealMatrix transpose() {
		final int nRows = getRowDimension();
		final int nCols = getColumnDimension();
		final org.apache.commons.math3.linear.BlockRealMatrix out = new org.apache.commons.math3.linear.BlockRealMatrix(nCols, nRows);
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (blockColumns); ++iBlock) {
			for (int jBlock = 0; jBlock < (blockRows); ++jBlock) {
				final double[] outBlock = out.blocks[blockIndex];
				final double[] tBlock = blocks[((jBlock * (blockColumns)) + iBlock)];
				final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
				int k = 0;
				for (int p = pStart; p < pEnd; ++p) {
					final int lInc = pEnd - pStart;
					int l = p - pStart;
					for (int q = qStart; q < qEnd; ++q) {
						outBlock[k] = tBlock[l];
						++k;
						l += lInc;
					}
				}
				++blockIndex;
			}
		}
		return out;
	}

	@java.lang.Override
	public int getRowDimension() {
		return rows;
	}

	@java.lang.Override
	public int getColumnDimension() {
		return columns;
	}

	@java.lang.Override
	public double[] operate(final double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((v.length) != (columns)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, columns);
		}
		final double[] out = new double[rows];
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				int k = 0;
				for (int p = pStart; p < pEnd; ++p) {
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

	@java.lang.Override
	public double[] preMultiply(final double[] v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((v.length) != (rows)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(v.length, rows);
		}
		final double[] out = new double[columns];
		for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
			final int jWidth = blockWidth(jBlock);
			final int jWidth2 = jWidth + jWidth;
			final int jWidth3 = jWidth2 + jWidth;
			final int jWidth4 = jWidth3 + jWidth;
			final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
			for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
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

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					int k = (p - pStart) * jWidth;
					for (int q = qStart; q < qEnd; ++q) {
						block[k] = visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					int k = (p - pStart) * jWidth;
					for (int q = qStart; q < qEnd; ++q) {
						visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pStart = org.apache.commons.math3.util.FastMath.max(startRow, p0);
			final int pEnd = org.apache.commons.math3.util.FastMath.min(((iBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = startColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int q0 = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qStart = org.apache.commons.math3.util.FastMath.max(startColumn, q0);
					final int qEnd = org.apache.commons.math3.util.FastMath.min(((jBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endColumn));
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					int k = (((p - p0) * jWidth) + qStart) - q0;
					for (int q = qStart; q < qEnd; ++q) {
						block[k] = visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInRowOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pStart = org.apache.commons.math3.util.FastMath.max(startRow, p0);
			final int pEnd = org.apache.commons.math3.util.FastMath.min(((iBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int p = pStart; p < pEnd; ++p) {
				for (int jBlock = startColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++jBlock) {
					final int jWidth = blockWidth(jBlock);
					final int q0 = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
					final int qStart = org.apache.commons.math3.util.FastMath.max(startColumn, q0);
					final int qEnd = org.apache.commons.math3.util.FastMath.min(((jBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endColumn));
					final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
					int k = (((p - p0) * jWidth) + qStart) - q0;
					for (int q = qStart; q < qEnd; ++q) {
						visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor) {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				final double[] block = blocks[blockIndex];
				int k = 0;
				for (int p = pStart; p < pEnd; ++p) {
					for (int q = qStart; q < qEnd; ++q) {
						block[k] = visitor.visit(p, q, block[k]);
						++k;
					}
				}
				++blockIndex;
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor) {
		visitor.start(rows, columns, 0, ((rows) - 1), 0, ((columns) - 1));
		int blockIndex = 0;
		for (int iBlock = 0; iBlock < (blockRows); ++iBlock) {
			final int pStart = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pEnd = org.apache.commons.math3.util.FastMath.min((pStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), rows);
			for (int jBlock = 0; jBlock < (blockColumns); ++jBlock) {
				final int qStart = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qEnd = org.apache.commons.math3.util.FastMath.min((qStart + (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), columns);
				final double[] block = blocks[blockIndex];
				int k = 0;
				for (int p = pStart; p < pEnd; ++p) {
					for (int q = qStart; q < qEnd; ++q) {
						visitor.visit(p, q, block[k]);
						++k;
					}
				}
				++blockIndex;
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealMatrixChangingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pStart = org.apache.commons.math3.util.FastMath.max(startRow, p0);
			final int pEnd = org.apache.commons.math3.util.FastMath.min(((iBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int jBlock = startColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int q0 = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qStart = org.apache.commons.math3.util.FastMath.max(startColumn, q0);
				final int qEnd = org.apache.commons.math3.util.FastMath.min(((jBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endColumn));
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int p = pStart; p < pEnd; ++p) {
					int k = (((p - p0) * jWidth) + qStart) - q0;
					for (int q = qStart; q < qEnd; ++q) {
						block[k] = visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealMatrixPreservingVisitor visitor, final int startRow, final int endRow, final int startColumn, final int endColumn) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.BlockRealMatrix.this, startRow, endRow, startColumn, endColumn);
		visitor.start(rows, columns, startRow, endRow, startColumn, endColumn);
		for (int iBlock = startRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); iBlock < (1 + (endRow / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++iBlock) {
			final int p0 = iBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
			final int pStart = org.apache.commons.math3.util.FastMath.max(startRow, p0);
			final int pEnd = org.apache.commons.math3.util.FastMath.min(((iBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endRow));
			for (int jBlock = startColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE); jBlock < (1 + (endColumn / (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE))); ++jBlock) {
				final int jWidth = blockWidth(jBlock);
				final int q0 = jBlock * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE);
				final int qStart = org.apache.commons.math3.util.FastMath.max(startColumn, q0);
				final int qEnd = org.apache.commons.math3.util.FastMath.min(((jBlock + 1) * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)), (1 + endColumn));
				final double[] block = blocks[((iBlock * (blockColumns)) + jBlock)];
				for (int p = pStart; p < pEnd; ++p) {
					int k = (((p - p0) * jWidth) + qStart) - q0;
					for (int q = qStart; q < qEnd; ++q) {
						visitor.visit(p, q, block[k]);
						++k;
					}
				}
			}
		}
		return visitor.end();
	}

	private int blockHeight(final int blockRow) {
		return blockRow == ((blockRows) - 1) ? (rows) - (blockRow * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) : org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE;
	}

	private int blockWidth(final int blockColumn) {
		return blockColumn == ((blockColumns) - 1) ? (columns) - (blockColumn * (org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE)) : org.apache.commons.math3.linear.BlockRealMatrix.BLOCK_SIZE;
	}
}

