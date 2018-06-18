

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        try {
            double[] doubleArray0 = new double[8];
            doubleArray0[0] = -3304.7932;
            doubleArray0[2] = -3304.7932;
            doubleArray0[1] = -3304.7932;
            double[] doubleArray1 = new double[7];
            doubleArray1[1] = -3304.7932;
            doubleArray1[2] = 2.2250738585072014E-308;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
            eigenDecompositionImpl0.getV();
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        try {
            double[] doubleArray0 = new double[8];
            doubleArray0[0] = -3304.7932;
            doubleArray0[2] = -3304.7932;
            doubleArray0[1] = -3304.7932;
            double[] doubleArray1 = new double[7];
            doubleArray1[1] = -3304.7932;
            doubleArray1[2] = 2.2250738585072014E-308;
            doubleArray1[4] = 49.8014015728657;
            doubleArray1[5] = -3304.7932;
            doubleArray1[6] = -3304.7932;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[2] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.15885495038741);
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 49.8014015728657;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(0.15885495038741, double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getImagEigenvalue(6);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(7.079492617844133E15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.1470798210374195E-6), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 240.3334255097641);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 6.428401320590638E-6;
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6.428401320590638E-6);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[2] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double) (-5451));
        doubleArray0[5] = ((double) (-5451));
        double[] doubleArray1 = new double[7];
        doubleArray0[2] = -3304.7932;
        doubleArray1[1] = ((double) (-5451));
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double) (-5451));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double) (-5448));
        doubleArray0[4] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        doubleArray0[7] = -5448.0;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = -5448.0;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(1.0616069563868612E30, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[4] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[2] = -0.8891123146020142;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[1] = 49.8014015728657;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 0.15885495038741;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(7.079497796714639E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double) (-35));
        doubleArray0[5] = ((double) (-35));
        doubleArray0[6] = ((double) (-35));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double) (-35));
        doubleArray1[2] = -19.59374856783727;
        doubleArray1[3] = ((double) (-35));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(2.9808533489293008E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -0.19479450034474333;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[2] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = -0.19479450034474333;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = -0.19479450034474333;
        doubleArray1[1] = -0.19479450034474333;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double) (-5448));
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[4] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals((-2.6294986033962253E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double) (-5448));
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        doubleArray0[7] = 3.5834549549463;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = 2.2250738585072014E-308;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[5] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(7.080053204344238E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -3304.7932;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 2.2250738585072014E-308;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, ((double) (4)));
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getVT();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 2438.13720703125);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getVT()));
        Assert.assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, ((double) (4)));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertFalse(doubleArray2.equals(((Object) (doubleArray1))));
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double) (-5448));
        doubleArray0[1] = 3.5834549549463;
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double) (-5448));
        doubleArray0[6] = ((double) (-5448));
        doubleArray0[7] = 3.5834549549463;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(2.8201888696292008E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = -5448.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(-2.173227187421978E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[6] = ((double) (-5448));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[3] = 0.15885495038741;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(-5.915029685255531E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double) (-5448));
        doubleArray0[1] = 3.5834549549463;
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double) (-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double) (-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(1.8454415004017196E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double) (-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = ((double) (-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = -5448.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3304.7932));
        Assert.assertEquals(-4.22282533198804E25, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

