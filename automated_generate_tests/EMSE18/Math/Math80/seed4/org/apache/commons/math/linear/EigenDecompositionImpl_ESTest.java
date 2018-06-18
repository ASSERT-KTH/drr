

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 2053.58252079;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = Double.NEGATIVE_INFINITY;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.19));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        doubleArray0[2] = 8.0;
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        double[] doubleArray1 = new double[4];
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(8.0, double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -155.1905714467;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals((-155.1905714467), double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getEigenvector(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 0.5;
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 388.488163125);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2037.484324909273;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-3.0561002253072184E13), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 2053.58252079;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 2053.58252079;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 2053.58252079;
        doubleArray0[2] = 2053.58252079;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -155.1905714467;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 2053.58252079;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -155.1905714467;
        doubleArray1[1] = -155.1905714467;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(1.191169290494378E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 2053.58252079;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -2306.0;
        doubleArray1[1] = -2306.0;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -2306.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2306.0));
        Assert.assertEquals(107.74790009627392, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 2081.9429734338905;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -155.1905714467;
        doubleArray1[1] = -155.1905714467;
        doubleArray1[2] = 2081.9429734338905;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 2053.58252079;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = -155.1905714467;
        doubleArray0[4] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 2053.58252079;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[4] = 2053.58252079;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(3.6364545853369536E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -155.1905714467;
        doubleArray1[1] = -155.1905714467;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.046715122390445715, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -155.19;
        doubleArray1[1] = Double.NEGATIVE_INFINITY;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.19));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(5, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1.7292966643328046E-306);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2306.0));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 2053.58252079;
        doubleArray0[2] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -155.1905714467;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-155.1905714467));
        Assert.assertEquals(-3.7133394147983096E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

