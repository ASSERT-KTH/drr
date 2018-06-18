

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 2297.37;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-72.49));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray0[3] = Double.NEGATIVE_INFINITY;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -72.49;
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(7);
        Assert.assertEquals((-72.49), double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(1)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -72.49;
        doubleArray0[1] = 3.0;
        doubleArray0[2] = 114.7738;
        doubleArray0[7] = -9.972753410301;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 2297.37;
        doubleArray1[5] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(3.8754515977277434E17, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -72.49;
        doubleArray0[7] = 543.1272776655;
        double[] doubleArray1 = new double[7];
        doubleArray0[0] = -72.49;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[4] = -72.49;
        doubleArray1[5] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-2.0050537815763965E11), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 6.283185307179586);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 114.7738;
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2695.782893498;
        doubleArray0[1] = 2695.782893498;
        doubleArray0[4] = 543.1272776655;
        doubleArray0[6] = 4046.0;
        doubleArray0[7] = -9.972753410301;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = 1854.5;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = 2695.782893498;
        doubleArray1[5] = 543.1272776655;
        doubleArray1[6] = 2297.37;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-5.425255258543603E32), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 543.1272776655;
        doubleArray0[6] = 4046.0;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = 2695.782893498;
        doubleArray1[5] = 543.1272776655;
        doubleArray1[6] = 2297.37;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = 3.0;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = -72.49;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 543.1272776655;
        doubleArray0[5] = 1854.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 543.1272776655;
        doubleArray1[4] = -72.49;
        doubleArray1[1] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -72.49;
        doubleArray0[1] = -72.49;
        doubleArray0[2] = 114.7738;
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 543.1272776655;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = -72.49;
        doubleArray1[2] = -72.49;
        doubleArray1[3] = 2297.37;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-72.49));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -72.49;
        doubleArray0[1] = 3.0;
        doubleArray0[4] = 3.0;
        doubleArray0[5] = -72.49;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -72.49;
        doubleArray1[1] = 3.0;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = -72.49;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = -72.49;
        doubleArray1[5] = -1577.7482380255326;
        doubleArray1[6] = -1577.7482380255326;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -72.49;
        doubleArray0[2] = 114.7738;
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 543.1272776655;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray0[6] = 2297.37;
        doubleArray1[4] = -72.49;
        doubleArray1[5] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-72.49));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = 543.1272776655;
        doubleArray0[3] = Double.NEGATIVE_INFINITY;
        doubleArray1[3] = 2297.37;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 3.0;
        doubleArray0[5] = -72.49;
        doubleArray0[6] = 3.0;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[6] = -9.972753410301;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 543.1272776655;
        doubleArray0[5] = 1854.5;
        doubleArray0[6] = 4046.0;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = 1854.5;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = -72.49;
        doubleArray1[5] = 543.1272776655;
        doubleArray1[6] = -9.972753410301;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-5.918063750000556E25), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2695.782893498;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = 1854.5;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = 2695.782893498;
        doubleArray1[5] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2695.782893498;
        doubleArray0[4] = 543.1272776655;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 1854.5;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[3] = 2297.37;
        doubleArray1[4] = 2695.782893498;
        doubleArray1[5] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -72.49;
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 543.1272776655;
        doubleArray0[5] = -72.49;
        doubleArray0[6] = -72.49;
        doubleArray0[7] = 2297.37;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-72.49));
        Assert.assertEquals(3.2210764719723184E20, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(3.22107647197232E20, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 543.1272776655;
        doubleArray1[1] = -72.49;
        doubleArray1[2] = 1.1102230246251565E-14;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        eigenDecompositionImpl0.getVT();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1417080.5153193993;
        doubleArray0[1] = 3.0;
        doubleArray0[3] = 2297.37;
        doubleArray0[4] = 543.1272776655;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 1854.5;
        doubleArray1[2] = -1418876.9703274022;
        doubleArray1[4] = 1417080.5153193993;
        doubleArray1[5] = 543.1272776655;
        doubleArray1[6] = -9.972753410301;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1418876.9703274022));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(-6.4755133665623334E38, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

