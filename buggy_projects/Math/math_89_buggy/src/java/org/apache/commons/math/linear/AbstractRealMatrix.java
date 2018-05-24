/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math.linear;

import java.io.Serializable;

import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.decomposition.DecompositionSolver;
import org.apache.commons.math.linear.decomposition.LUDecomposition;
import org.apache.commons.math.linear.decomposition.LUDecompositionImpl;
import org.apache.commons.math.linear.decomposition.NonSquareMatrixException;
import org.apache.commons.math.util.MathUtils;

/**
 * Basic implementation of RealMatrix methods regardless of the underlying storage.
 * <p>All the methods implemented here use {@link #getEntry(int, int)} to access
 * matrix elements. Derived class can provide faster implementations. </p>
 *
 * @version $Revision$ $Date$
 * @since 2.0
 */
public abstract class AbstractRealMatrix implements RealMatrix, Serializable {
    
    /** Serializable version identifier. */
    private static final long serialVersionUID = -3665653040524315561L;

    /** Cached LU solver.
     * @deprecated as of release 2.0, since all methods using this are deprecated
     */
    @Deprecated
    private DecompositionSolver lu;

    /**
     * Creates a matrix with no data
     */
    protected AbstractRealMatrix() {
        lu = null;
    }

    /**
     * Create a new RealMatrix with the supplied row and column dimensions.
     *
     * @param rowDimension  the number of rows in the new matrix
     * @param columnDimension  the number of columns in the new matrix
     * @throws IllegalArgumentException if row or column dimension is not positive
     */
    protected AbstractRealMatrix(final int rowDimension, final int columnDimension)
        throws IllegalArgumentException {
        if (rowDimension <= 0 ) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "invalid row dimension {0} (must be positive)",
                    rowDimension);
        }
        if (columnDimension <= 0) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "invalid column dimension {0} (must be positive)",
                    columnDimension);
        }
        lu = null;
    }

    /** {@inheritDoc} */
    public abstract RealMatrix createMatrix(final int rowDimension, final int columnDimension)
        throws IllegalArgumentException;

    /** {@inheritDoc} */
    public abstract RealMatrix copy();

    /** {@inheritDoc} */
    public RealMatrix add(RealMatrix m) throws IllegalArgumentException {

        // safety check
        checkAdditionCompatible(m);

        final int rowCount    = getRowDimension();
        final int columnCount = getColumnDimension();
        final RealMatrix out = createMatrix(rowCount, columnCount);
        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < columnCount; ++col) {
                out.setEntry(row, col, getEntry(row, col) + m.getEntry(row, col));
            }  
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealMatrix subtract(final RealMatrix m) throws IllegalArgumentException {

        // safety check
        checkSubtractionCompatible(m);

        final int rowCount    = getRowDimension();
        final int columnCount = getColumnDimension();
        final RealMatrix out = createMatrix(rowCount, columnCount);
        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < columnCount; ++col) {
                out.setEntry(row, col, getEntry(row, col) - m.getEntry(row, col));
            }  
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealMatrix scalarAdd(final double d) {

        final int rowCount    = getRowDimension();
        final int columnCount = getColumnDimension();
        final RealMatrix out = createMatrix(rowCount, columnCount);
        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < columnCount; ++col) {
                out.setEntry(row, col, getEntry(row, col) + d);
            }
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealMatrix scalarMultiply(final double d) {

        final int rowCount    = getRowDimension();
        final int columnCount = getColumnDimension();
        final RealMatrix out = createMatrix(rowCount, columnCount);
        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < columnCount; ++col) {
                out.setEntry(row, col, getEntry(row, col) * d);
            }
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealMatrix multiply(final RealMatrix m)
        throws IllegalArgumentException {

        // safety check
        checkMultiplicationCompatible(m);

        final int nRows = getRowDimension();
        final int nCols = m.getColumnDimension();
        final int nSum  = getColumnDimension();
        final RealMatrix out = createMatrix(nRows, nCols);
        for (int row = 0; row < nRows; ++row) {
            for (int col = 0; col < nCols; ++col) {
                double sum = 0;
                for (int i = 0; i < nSum; ++i) {
                    sum += getEntry(row, i) * m.getEntry(i, col);
                }
                out.setEntry(row, col, sum);
            }
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealMatrix preMultiply(final RealMatrix m)
        throws IllegalArgumentException {
        return m.multiply(this);
    }

    /** {@inheritDoc} */
    public double[][] getData() {

        final double[][] data = new double[getRowDimension()][getColumnDimension()];

        for (int i = 0; i < data.length; ++i) {
            final double[] dataI = data[i];
            for (int j = 0; j < dataI.length; ++j) {
                dataI[j] = getEntry(i, j);
            }
        }

        return data;

    }

    /** {@inheritDoc} */
    public double getNorm() {
        return walkInColumnOrder(new RealMatrixPreservingVisitor() {

            /** Serializable version identifier */
            private static final long serialVersionUID = -2452270856202894168L;

            /** Last row index. */
            private double endRow;

            /** Sum of absolute values on one column. */
            private double columnSum;

            /** Maximal sum across all columns. */
            private double maxColSum;

            /** {@inheritDoc} */
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {
                this.endRow = endRow;
                columnSum   = 0;
                maxColSum   = 0;
            }

            /** {@inheritDoc} */
            public void visit(final int row, final int column, final double value) {
                columnSum += Math.abs(value);
                if (row == endRow) {
                    maxColSum = Math.max(maxColSum, columnSum);
                    columnSum = 0;
                }
            }

            /** {@inheritDoc} */
            public double end() {
                return maxColSum;
            }

        });
    }
    
    /** {@inheritDoc} */
    public double getFrobeniusNorm() {
        return walkInOptimizedOrder(new RealMatrixPreservingVisitor() {

            /** Serializable version identifier */
            private static final long serialVersionUID = -6065411033772300640L;

            /** Sum of squared entries. */
            private double sum;

            /** {@inheritDoc} */
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {
                sum = 0;
            }

            /** {@inheritDoc} */
            public void visit(final int row, final int column, final double value) {
                sum += value * value;
            }

            /** {@inheritDoc} */
            public double end() {
                return Math.sqrt(sum);
            }

        });
    }
    
    /** {@inheritDoc} */
    public RealMatrix getSubMatrix(final int startRow, final int endRow,
                                   final int startColumn, final int endColumn)
        throws MatrixIndexException {

        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);

        final RealMatrix subMatrix =
            createMatrix(endRow - startRow + 1, endColumn - startColumn + 1);
        for (int i = startRow; i <= endRow; ++i) {
            for (int j = startColumn; j <= endColumn; ++j) {
                subMatrix.setEntry(i - startRow, j - startColumn, getEntry(i, j));
            }
        }

        return subMatrix;

    }

    /** {@inheritDoc} */
    public RealMatrix getSubMatrix(final int[] selectedRows, final int[] selectedColumns)
        throws MatrixIndexException {

        // safety checks
        checkSubMatrixIndex(selectedRows, selectedColumns);

        // copy entries
        final RealMatrix subMatrix =
            createMatrix(selectedRows.length, selectedColumns.length);
        subMatrix.walkInOptimizedOrder(new DefaultRealMatrixChangingVisitor() {

            /** Serializable version identifier. */
            private static final long serialVersionUID = 4572851009041214720L;

            /** {@inheritDoc} */
            @Override
            public double visit(final int row, final int column, final double value) {
                return getEntry(selectedRows[row], selectedColumns[column]);
            }

        });

        return subMatrix;

    } 

    /** {@inheritDoc} */
    public void copySubMatrix(final int startRow, final int endRow,
                              final int startColumn, final int endColumn,
                              final double[][] destination)
        throws MatrixIndexException, IllegalArgumentException {

        // safety checks
        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        final int rowsCount    = endRow + 1 - startRow;
        final int columnsCount = endColumn + 1 - startColumn;
        if ((destination.length < rowsCount) || (destination[0].length < columnsCount)) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    destination.length, destination[0].length,
                    rowsCount, columnsCount);
        }

        // copy entries
        walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            /** Serializable version identifier. */
            private static final long serialVersionUID = -6302162622577015104L;

            /** Initial row index. */
            private int startRow;

            /** Initial column index. */
            private int startColumn;

            /** {@inheritDoc} */
            @Override
            public void start(final int rows, final int columns,
                              final int startRow, final int endRow,
                              final int startColumn, final int endColumn) {
                this.startRow    = startRow;
                this.startColumn = startColumn;
            }

            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final double value) {
                destination[row - startRow][column - startColumn] = value;
            }

        }, startRow, endRow, startColumn, endColumn);

    }

    /** {@inheritDoc} */
    public void copySubMatrix(int[] selectedRows, int[] selectedColumns, double[][] destination)
        throws MatrixIndexException, IllegalArgumentException {

        // safety checks
        checkSubMatrixIndex(selectedRows, selectedColumns);
        if ((destination.length < selectedRows.length) ||
            (destination[0].length < selectedColumns.length)) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    destination.length, destination[0].length,
                    selectedRows.length, selectedColumns.length);
        }

        // copy entries
        for (int i = 0; i < selectedRows.length; i++) {
            final double[] destinationI = destination[i];
            for (int j = 0; j < selectedColumns.length; j++) {
                destinationI[j] = getEntry(selectedRows[i], selectedColumns[j]);
            }
        }

    }

    /** {@inheritDoc} */
    public void setSubMatrix(final double[][] subMatrix, final int row, final int column) 
        throws MatrixIndexException {

        final int nRows = subMatrix.length;
        if (nRows == 0) {
            throw MathRuntimeException.createIllegalArgumentException("matrix must have at least one row"); 
        }

        final int nCols = subMatrix[0].length;
        if (nCols == 0) {
            throw MathRuntimeException.createIllegalArgumentException("matrix must have at least one column"); 
        }

        for (int r = 1; r < nRows; ++r) {
            if (subMatrix[r].length != nCols) {
                throw MathRuntimeException.createIllegalArgumentException(
                        "some rows have length {0} while others have length {1}",
                        nCols, subMatrix[r].length); 
            }
        }

        checkRowIndex(row);
        checkColumnIndex(column);
        checkRowIndex(nRows + row - 1);
        checkColumnIndex(nCols + column - 1);

        for (int i = 0; i < nRows; ++i) {
            for (int j = 0; j < nCols; ++j) {
                setEntry(row + i, column + j, subMatrix[i][j]);
            }
        } 

        lu = null;

    }

    /** {@inheritDoc} */
    public RealMatrix getRowMatrix(final int row)
        throws MatrixIndexException {

        checkRowIndex(row);
        final int nCols = getColumnDimension();
        final RealMatrix out = createMatrix(1, nCols);
        for (int i = 0; i < nCols; ++i) {
            out.setEntry(0, i, getEntry(row, i));
        }

        return out;

    }
    
    /** {@inheritDoc} */
    public void setRowMatrix(final int row, final RealMatrix matrix)
        throws MatrixIndexException, InvalidMatrixException {

        checkRowIndex(row);
        final int nCols = getColumnDimension();
        if ((matrix.getRowDimension() != 1) ||
            (matrix.getColumnDimension() != nCols)) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    matrix.getRowDimension(), matrix.getColumnDimension(), 1, nCols);
        }
        for (int i = 0; i < nCols; ++i) {
            setEntry(row, i, matrix.getEntry(0, i));
        }

    }
    
    /** {@inheritDoc} */
    public RealMatrix getColumnMatrix(final int column)
        throws MatrixIndexException {

        checkColumnIndex(column);
        final int nRows = getRowDimension();
        final RealMatrix out = createMatrix(nRows, 1);
        for (int i = 0; i < nRows; ++i) {
            out.setEntry(i, 0, getEntry(i, column));
        }

        return out;

    }

    /** {@inheritDoc} */
    public void setColumnMatrix(final int column, final RealMatrix matrix)
        throws MatrixIndexException, InvalidMatrixException {

        checkColumnIndex(column);
        final int nRows = getRowDimension();
        if ((matrix.getRowDimension() != nRows) ||
            (matrix.getColumnDimension() != 1)) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    matrix.getRowDimension(), matrix.getColumnDimension(), nRows, 1);
        }
        for (int i = 0; i < nRows; ++i) {
            setEntry(i, column, matrix.getEntry(i, 0));
        }

    }
    
    /** {@inheritDoc} */
    public RealVector getRowVector(final int row)
        throws MatrixIndexException {
        return new RealVectorImpl(getRow(row), false);
    }

    /** {@inheritDoc} */
    public void setRowVector(final int row, final RealVector vector)
        throws MatrixIndexException, InvalidMatrixException {

        checkRowIndex(row);
        final int nCols = getColumnDimension();
        if (vector.getDimension() != nCols) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    1, vector.getDimension(), 1, nCols);
        }
        for (int i = 0; i < nCols; ++i) {
            setEntry(row, i, vector.getEntry(i));
        }

    }
    
    /** {@inheritDoc} */
    public RealVector getColumnVector(final int column)
        throws MatrixIndexException {
        return new RealVectorImpl(getColumn(column), false);
    }

    /** {@inheritDoc} */
    public void setColumnVector(final int column, final RealVector vector)
        throws MatrixIndexException, InvalidMatrixException {

        checkColumnIndex(column);
        final int nRows = getRowDimension();
        if (vector.getDimension() != nRows) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    vector.getDimension(), 1, nRows, 1);
        }
        for (int i = 0; i < nRows; ++i) {
            setEntry(i, column, vector.getEntry(i));
        }

    }
    
    /** {@inheritDoc} */
    public double[] getRow(final int row)
        throws MatrixIndexException {

        checkRowIndex(row);
        final int nCols = getColumnDimension();
        final double[] out = new double[nCols];
        for (int i = 0; i < nCols; ++i) {
            out[i] = getEntry(row, i);
        }

        return out;

    }

    /** {@inheritDoc} */
    public void setRow(final int row, final double[] array)
        throws MatrixIndexException, InvalidMatrixException {

        checkRowIndex(row);
        final int nCols = getColumnDimension();
        if (array.length != nCols) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    1, array.length, 1, nCols);
        }
        for (int i = 0; i < nCols; ++i) {
            setEntry(row, i, array[i]);
        }

    }
    
    /** {@inheritDoc} */
    public double[] getColumn(final int column)
        throws MatrixIndexException {

        checkColumnIndex(column);
        final int nRows = getRowDimension();
        final double[] out = new double[nRows];
        for (int i = 0; i < nRows; ++i) {
            out[i] = getEntry(i, column);
        }

        return out;

    }

    /** {@inheritDoc} */
    public void setColumn(final int column, final double[] array)
        throws MatrixIndexException, InvalidMatrixException {

        checkColumnIndex(column);
        final int nRows = getRowDimension();
        if (array.length != nRows) {
            throw new InvalidMatrixException(
                    "dimensions mismatch: got {0}x{1} but expected {2}x{3}",
                    array.length, 1, nRows, 1);
        }
        for (int i = 0; i < nRows; ++i) {
            setEntry(i, column, array[i]);
        }

    }
    
    /** {@inheritDoc} */
    public abstract double getEntry(int row, int column)
        throws MatrixIndexException;

    /** {@inheritDoc} */
    public abstract void setEntry(int row, int column, double value)
        throws MatrixIndexException;

    /** {@inheritDoc} */
    public abstract void addToEntry(int row, int column, double increment)
        throws MatrixIndexException;

    /** {@inheritDoc} */
    public abstract void multiplyEntry(int row, int column, double factor)
        throws MatrixIndexException;

    /** {@inheritDoc} */
    public RealMatrix transpose() {

        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        final RealMatrix out = createMatrix(nCols, nRows);
        walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {

            /** Serializable version identifier. */
            private static final long serialVersionUID = 2482589609486637597L;

            /** {@inheritDoc} */
            @Override
            public void visit(final int row, final int column, final double value) {
                out.setEntry(column, row, value);
            }

        });

        return out;

    }

    /** {@inheritDoc} */
    @Deprecated
    public RealMatrix inverse()
        throws InvalidMatrixException {
        if (lu == null) {
            lu = new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getSolver();
        }
        return lu.getInverse();
    }

    /** {@inheritDoc} */
    @Deprecated
    public double getDeterminant()
        throws InvalidMatrixException {
        return new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getDeterminant();
    }

    /** {@inheritDoc} */
    public boolean isSquare() {
        return (getColumnDimension() == getRowDimension());
    }

    /** {@inheritDoc} */
    @Deprecated
    public boolean isSingular() {
        if (lu == null) {
            lu = new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getSolver();
       }
        return !lu.isNonSingular();
    }

    /** {@inheritDoc} */
    public abstract int getRowDimension();

    /** {@inheritDoc} */
    public abstract int getColumnDimension();

    /** {@inheritDoc} */
    public double getTrace()
        throws NonSquareMatrixException {
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        if (nRows != nCols) {
            throw new NonSquareMatrixException(nRows, nCols);
       }
        double trace = 0;
        for (int i = 0; i < nRows; ++i) {
            trace += getEntry(i, i);
        }
        return trace;
    }

    /** {@inheritDoc} */
    public double[] operate(final double[] v)
        throws IllegalArgumentException {

        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        if (v.length != nCols) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "vector length mismatch: got {0} but expected {1}",
                    v.length, nCols);
        }

        final double[] out = new double[nRows];
        for (int row = 0; row < nRows; ++row) {
            double sum = 0;
            for (int i = 0; i < nCols; ++i) {
                sum += getEntry(row, i) * v[i];
            }
            out[row] = sum;
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealVector operate(final RealVector v)
        throws IllegalArgumentException {
        try {
            return new RealVectorImpl(operate(((RealVectorImpl) v).getDataRef()), false);
        } catch (ClassCastException cce) {
            final int nRows = getRowDimension();
            final int nCols = getColumnDimension();
            if (v.getDimension() != nCols) {
                throw MathRuntimeException.createIllegalArgumentException(
                        "vector length mismatch: got {0} but expected {1}",
                        v.getDimension(), nCols);
            }

            final double[] out = new double[nRows];
            for (int row = 0; row < nRows; ++row) {
                double sum = 0;
                for (int i = 0; i < nCols; ++i) {
                    sum += getEntry(row, i) * v.getEntry(i);
                }
                out[row] = sum;
            }

            return new RealVectorImpl(out, false);
        }
    }

    /** {@inheritDoc} */
    public double[] preMultiply(final double[] v)
        throws IllegalArgumentException {

        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        if (v.length != nRows) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "vector length mismatch: got {0} but expected {1}",
                    v.length, nRows);
        }

        final double[] out = new double[nCols];
        for (int col = 0; col < nCols; ++col) {
            double sum = 0;
            for (int i = 0; i < nRows; ++i) {
                sum += getEntry(i, col) * v[i];
            }
            out[col] = sum;
        }

        return out;

    }

    /** {@inheritDoc} */
    public RealVector preMultiply(final RealVector v)
        throws IllegalArgumentException {
        try {
            return new RealVectorImpl(preMultiply(((RealVectorImpl) v).getDataRef()), false);
        } catch (ClassCastException cce) {

            final int nRows = getRowDimension();
            final int nCols = getColumnDimension();
            if (v.getDimension() != nRows) {
                throw MathRuntimeException.createIllegalArgumentException(
                        "vector length mismatch: got {0} but expected {1}",
                        v.getDimension(), nRows);
            }

            final double[] out = new double[nCols];
            for (int col = 0; col < nCols; ++col) {
                double sum = 0;
                for (int i = 0; i < nRows; ++i) {
                    sum += getEntry(i, col) * v.getEntry(i);
                }
                out[col] = sum;
            }

            return new RealVectorImpl(out);

        }
    }

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor)
        throws MatrixVisitorException {
        final int rows    = getRowDimension();
        final int columns = getColumnDimension();
        visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                final double oldValue = getEntry(row, column);
                final double newValue = visitor.visit(row, column, oldValue);
                setEntry(row, column, newValue);
            }
        }
        lu = null;
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor)
        throws MatrixVisitorException {
        final int rows    = getRowDimension();
        final int columns = getColumnDimension();
        visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                visitor.visit(row, column, getEntry(row, column));
            }
        }
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixChangingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws MatrixIndexException, MatrixVisitorException {
        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        for (int row = startRow; row <= endRow; ++row) {
            for (int column = startColumn; column <= endColumn; ++column) {
                final double oldValue = getEntry(row, column);
                final double newValue = visitor.visit(row, column, oldValue);
                setEntry(row, column, newValue);
            }
        }
        lu = null;
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInRowOrder(final RealMatrixPreservingVisitor visitor,
                                 final int startRow, final int endRow,
                                 final int startColumn, final int endColumn)
        throws MatrixIndexException, MatrixVisitorException {
        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        for (int row = startRow; row <= endRow; ++row) {
            for (int column = startColumn; column <= endColumn; ++column) {
                visitor.visit(row, column, getEntry(row, column));
            }
        }
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor)
        throws MatrixVisitorException {
        final int rows    = getRowDimension();
        final int columns = getColumnDimension();
        visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        for (int column = 0; column < columns; ++column) {
            for (int row = 0; row < rows; ++row) {
                final double oldValue = getEntry(row, column);
                final double newValue = visitor.visit(row, column, oldValue);
                setEntry(row, column, newValue);
            }
        }
        lu = null;
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor)
        throws MatrixVisitorException {
        final int rows    = getRowDimension();
        final int columns = getColumnDimension();
        visitor.start(rows, columns, 0, rows - 1, 0, columns - 1);
        for (int column = 0; column < columns; ++column) {
            for (int row = 0; row < rows; ++row) {
                visitor.visit(row, column, getEntry(row, column));
            }
        }
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixChangingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
    throws MatrixIndexException, MatrixVisitorException {
        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        for (int column = startColumn; column <= endColumn; ++column) {
            for (int row = startRow; row <= endRow; ++row) {
                final double oldValue = getEntry(row, column);
                final double newValue = visitor.visit(row, column, oldValue);
                setEntry(row, column, newValue);
            }
        }
        lu = null;
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInColumnOrder(final RealMatrixPreservingVisitor visitor,
                                    final int startRow, final int endRow,
                                    final int startColumn, final int endColumn)
    throws MatrixIndexException, MatrixVisitorException {
        checkSubMatrixIndex(startRow, endRow, startColumn, endColumn);
        visitor.start(getRowDimension(), getColumnDimension(),
                      startRow, endRow, startColumn, endColumn);
        for (int column = startColumn; column <= endColumn; ++column) {
            for (int row = startRow; row <= endRow; ++row) {
                visitor.visit(row, column, getEntry(row, column));
            }
        }
        return visitor.end();
    }

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor)
        throws MatrixVisitorException {
        return walkInRowOrder(visitor);
    }

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor)
        throws MatrixVisitorException {
        return walkInRowOrder(visitor);
    }

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixChangingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn, final int endColumn)
        throws MatrixIndexException, MatrixVisitorException {
        return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }

    /** {@inheritDoc} */
    public double walkInOptimizedOrder(final RealMatrixPreservingVisitor visitor,
                                       final int startRow, final int endRow,
                                       final int startColumn, final int endColumn)
        throws MatrixIndexException, MatrixVisitorException {
        return walkInRowOrder(visitor, startRow, endRow, startColumn, endColumn);
    }

    /** {@inheritDoc} */
    @Deprecated
    public double[] solve(final double[] b)
        throws IllegalArgumentException, InvalidMatrixException {
        if (lu == null) {
            lu = new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getSolver();
        }
        return lu.solve(b);
    }

    /** {@inheritDoc} */
    @Deprecated
    public RealMatrix solve(final RealMatrix b)
        throws IllegalArgumentException, InvalidMatrixException  {
        if (lu == null) {
            lu = new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getSolver();
        }
        return lu.solve(b);
    }

    /**
     * Computes a new
     * <a href="http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf">
     * LU decomposition</a> for this matrix, storing the result for use by other methods.
     * <p>
     * <strong>Implementation Note</strong>:<br>
     * Uses <a href="http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm">
     * Crout's algorithm</a>, with partial pivoting.</p>
     * <p>
     * <strong>Usage Note</strong>:<br>
     * This method should rarely be invoked directly. Its only use is
     * to force recomputation of the LU decomposition when changes have been
     * made to the underlying data using direct array references. Changes
     * made using setXxx methods will trigger recomputation when needed
     * automatically.</p>
     *
     * @throws InvalidMatrixException if the matrix is non-square or singular.
     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}
     */
    @Deprecated
    public void luDecompose()
        throws InvalidMatrixException {
        if (lu == null) {
            lu = new LUDecompositionImpl(this, MathUtils.SAFE_MIN).getSolver();
        }
    }

    /**
     * Get a string representation for this matrix.
     * @return a string representation for this matrix
     */
    @Override
    public String toString() {
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        final StringBuffer res = new StringBuffer();
        String fullClassName = getClass().getName();
        String shortClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        res.append(shortClassName).append("{");

        for (int i = 0; i < nRows; ++i) {
            if (i > 0) {
                res.append(",");
            }
            res.append("{");
            for (int j = 0; j < nCols; ++j) {
                if (j > 0) {
                    res.append(",");
                }
                res.append(getEntry(i, j));
            } 
            res.append("}");
        } 

        res.append("}");
        return res.toString();

    } 
    
    /**
     * Returns true iff <code>object</code> is a
     * <code>RealMatrix</code> instance with the same dimensions as this
     * and all corresponding matrix entries are equal.
     * 
     * @param object the object to test equality against.
     * @return true if object equals this
     */
    @Override
    public boolean equals(final Object object) {
        if (object == this ) {
            return true;
        }
        if (object instanceof RealMatrix == false) {
            return false;
        }
        RealMatrix m = (RealMatrix) object;
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        if (m.getColumnDimension() != nCols || m.getRowDimension() != nRows) {
            return false;
        }
        for (int row = 0; row < nRows; ++row) {
            for (int col = 0; col < nCols; ++col) {
                if (getEntry(row, col) != m.getEntry(row, col)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Computes a hashcode for the matrix.
     * 
     * @return hashcode for matrix
     */
    @Override
    public int hashCode() {
        int ret = 7;
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        ret = ret * 31 + nRows;
        ret = ret * 31 + nCols;
        for (int row = 0; row < nRows; ++row) {
            for (int col = 0; col < nCols; ++col) {
               ret = ret * 31 + (11 * (row+1) + 17 * (col+1)) * 
                   MathUtils.hash(getEntry(row, col));
           }
        }
        return ret;
    }

    /**
     * Check if a row index is valid.
     * @param row row index to check
     * @exception MatrixIndexException if index is not valid
     */
    protected void checkRowIndex(final int row) {
        if (row < 0 || row >= getRowDimension()) {
            throw new MatrixIndexException("row index {0} out of allowed range [{1}, {2}]",
                                           row, 0, getRowDimension() - 1);
        }
    }

    /**
     * Check if a column index is valid.
     * @param column column index to check
     * @exception MatrixIndexException if index is not valid
     */
    protected void checkColumnIndex(final int column)
        throws MatrixIndexException {
        if (column < 0 || column >= getColumnDimension()) {
            throw new MatrixIndexException("column index {0} out of allowed range [{1}, {2}]",
                                           column, 0, getColumnDimension() - 1);
        }
    }

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to n-1.
     *
     * @param startRow Initial row index
     * @param endRow Final row index
     * @param startColumn Initial column index
     * @param endColumn Final column index
     * @exception MatrixIndexException  if the indices are not valid
     */
    protected void checkSubMatrixIndex(final int startRow, final int endRow,
                                       final int startColumn, final int endColumn) {
        checkRowIndex(startRow);
        checkRowIndex(endRow);
        if (startRow > endRow) {
            throw new MatrixIndexException("initial row {0} after final row {1}",
                                           startRow, endRow);
        }

        checkColumnIndex(startColumn);
        checkColumnIndex(endColumn);
        if (startColumn > endColumn) {
            throw new MatrixIndexException("initial column {0} after final column {1}",
                                           startColumn, endColumn);
        }

    
    }

    /**
     * Check if submatrix ranges indices are valid.
     * Rows and columns are indicated counting from 0 to n-1.
     *
     * @param selectedRows Array of row indices.
     * @param selectedColumns Array of column indices.
     * @exception MatrixIndexException if row or column selections are not valid
     */
    protected void checkSubMatrixIndex(final int[] selectedRows, final int[] selectedColumns) {
        if (selectedRows.length * selectedColumns.length == 0) {
            if (selectedRows.length == 0) {
                throw new MatrixIndexException("empty selected row index array");
            }
            throw new MatrixIndexException("empty selected column index array");
        }

        for (final int row : selectedRows) {
            checkRowIndex(row);
        }
        for (final int column : selectedColumns) {
            checkColumnIndex(column);
        }
    }

    /**
     * Check if a matrix is addition compatible with the instance
     * @param m matrix to check
     * @exception IllegalArgumentException if matrix is not addition compatible with instance
     */
    protected void checkAdditionCompatible(final RealMatrix m) {
        if ((getRowDimension()    != m.getRowDimension()) ||
            (getColumnDimension() != m.getColumnDimension())) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "{0}x{1} and {2}x{3} matrices are not addition compatible",
                    getRowDimension(), getColumnDimension(),
                    m.getRowDimension(), m.getColumnDimension());
        }
    }

    /**
     * Check if a matrix is subtraction compatible with the instance
     * @param m matrix to check
     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance
     */
    protected void checkSubtractionCompatible(final RealMatrix m) {
        if ((getRowDimension()    != m.getRowDimension()) ||
            (getColumnDimension() != m.getColumnDimension())) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "{0}x{1} and {2}x{3} matrices are not subtraction compatible",
                    getRowDimension(), getColumnDimension(),
                    m.getRowDimension(), m.getColumnDimension());
        }
    }

    /**
     * Check if a matrix is multiplication compatible with the instance
     * @param m matrix to check
     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance
     */
    protected void checkMultiplicationCompatible(final RealMatrix m) {
        if (getColumnDimension() != m.getRowDimension()) {
            throw MathRuntimeException.createIllegalArgumentException(
                    "{0}x{1} and {2}x{3} matrices are not multiplication compatible",
                    getRowDimension(), getColumnDimension(),
                    m.getRowDimension(), m.getColumnDimension());
        }
    }

}
