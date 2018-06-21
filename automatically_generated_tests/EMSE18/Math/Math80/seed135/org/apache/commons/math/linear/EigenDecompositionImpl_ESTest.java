

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[3] = 3338.8775230189;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        doubleArray0[7] = 3074.3157038;
        doubleArray0[8] = 0.9999999999999998;
        double[] doubleArray1 = new double[8];
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = 0.9999999999999998;
        doubleArray0[8] = 0.9999999999999998;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-406.1862354797518));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 821.49968814572;
        doubleArray0[4] = 821.49968814572;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 821.49968814572;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(821.49968814572, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 821.49968814572;
        doubleArray1[3] = 3834.2431410844;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals((-821.49968814572), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getEigenvector(3);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 3338.8775230189;
        doubleArray0[1] = 1183.55;
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = 1183.55;
        doubleArray1[3] = 3338.8775230189;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(37.26204954080005, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 821.49968814572;
        doubleArray0[1] = 1183.55;
        doubleArray0[4] = 3834.2431410844;
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = 1183.55;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-5.222120411548206E15), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -9.1621712280462682E17;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = -9.1621712280462682E17;
        doubleArray1[2] = -9.1621712280462682E17;
        doubleArray1[3] = 2.2737367544323206E-12;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.017235887862144292);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 2345.0);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 1189.84;
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1189.84);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(1189.84, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = 821.49968814572;
        doubleArray1[2] = 1183.55;
        doubleArray1[3] = 1.3642420526593924E-12;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.9999999999999998;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (1974));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1030.6032;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        doubleArray1[5] = 0.9999999999999998;
        doubleArray1[6] = ((double) (1974));
        doubleArray1[7] = 1598.065679;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(1.9038357395132872E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.9999999999999998;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        doubleArray1[5] = 0.9999999999999998;
        doubleArray1[6] = ((double) (2143904508));
        doubleArray1[7] = 1598.065679;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        doubleArray0[3] = ((double) (41));
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.9999999999999998;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3074.3157038;
        doubleArray0[1] = ((double) (2143904508));
        doubleArray0[4] = ((double) (41));
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1030.6032;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 821.49968814572;
        doubleArray1[1] = 821.49968814572;
        doubleArray1[2] = 1183.55;
        doubleArray1[3] = 1.3642420526593924E-12;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        doubleArray0[2] = 1.23;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1030.6032;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 0.9999999999999998;
        doubleArray1[3] = -682.02827;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-406.1862354797518));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        doubleArray0[3] = ((double) (41));
        doubleArray0[4] = ((double) (41));
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1.23;
        doubleArray0[3] = ((double) (41));
        doubleArray0[4] = ((double) (41));
        doubleArray0[5] = 0.9999999999999998;
        doubleArray0[6] = 3074.3157038;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.9999999999999998;
        doubleArray1[1] = ((double) (41));
        doubleArray1[6] = ((double) (2143904508));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1030.6032;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 0.9999999999999998;
        doubleArray1[3] = -682.02827;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-406.1862354797518));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-406.1862354797518));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1189.84);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertTrue(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1189.84);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-406.1862354797518));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.017235887862144292);
        eigenDecompositionImpl0.getImagEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double) (2143904508));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1030.6032;
        doubleArray1[1] = ((double) (41));
        doubleArray1[2] = 2908.03949;
        doubleArray1[3] = -682.02827;
        doubleArray1[4] = -1900.7565213105;
        doubleArray1[5] = 0.9999999999999998;
        doubleArray1[6] = ((double) (2143904508));
        doubleArray1[7] = 1598.065679;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-403.25441652133));
        Assert.assertEquals(7.11255470889006E31, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

