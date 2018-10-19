

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 54.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 642.96;
        doubleArray0[1] = ((double) (2164));
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 545.407262484);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(642.96, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.0;
        doubleArray0[0] = -79.9111310225762;
        doubleArray0[3] = -1.0;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(6);
        Assert.assertEquals((-1.0), double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        eigenDecompositionImpl0.getImagEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 686.7974173388386;
        doubleArray1[2] = 686.7974173388386;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 545.407262484);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(2.224921093565064E11, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = ((double) (2164));
        doubleArray0[2] = ((double) (-51));
        doubleArray0[3] = 54.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-7163154.089996601), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = ((double) (-51));
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 54.0;
        doubleArray1[2] = 642.96;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 545.407262484);
        Assert.assertEquals((-2.8261454185130273E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 54.0);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getVT()));
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 0.333;
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 943.17643);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertTrue(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = ((double) (2190));
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 54.0;
        doubleArray1[2] = 2832.877828972965;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-51.0));
        Assert.assertEquals(2.3401473850981327E10, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -1.0;
        doubleArray1[3] = 0.3010299956639812;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[1] = -406.1850689574936;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.0;
        doubleArray0[3] = -1.0;
        doubleArray0[4] = -79.9111310225762;
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        doubleArray0[7] = 0.7853981633974483;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -1217.21;
        doubleArray1[2] = -1.0;
        doubleArray1[3] = -112.3;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[5] = 0.3010299956639812;
        doubleArray1[6] = -406.1850689574936;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = -1.0;
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -1.0;
        doubleArray1[3] = -112.3;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[5] = 0.3010299956639812;
        doubleArray1[6] = -406.1850689574936;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -79.9111310225762;
        doubleArray0[3] = -1.0;
        doubleArray0[4] = -79.9111310225762;
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        doubleArray0[7] = 0.7853981633974483;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -79.9111310225762;
        doubleArray1[1] = -1217.21;
        doubleArray1[2] = -1.0;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[6] = -406.1850689574936;
        doubleArray1[7] = -112.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals(3.1294127601809574E21, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -1.0;
        doubleArray1[3] = 0.3010299956639812;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[5] = 0.3010299956639812;
        doubleArray1[6] = -406.1850689574936;
        doubleArray1[7] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 2832.877828972965;
        doubleArray0[1] = ((double) (2164));
        doubleArray0[2] = ((double) (-51));
        doubleArray0[3] = 54.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 54.0;
        doubleArray1[2] = 642.96;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        Assert.assertEquals((-5.424170394064977E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -1217.21;
        doubleArray1[2] = -1.0;
        doubleArray1[3] = -112.3;
        doubleArray1[4] = -79.9111310225762;
        doubleArray1[5] = 0.3010299956639812;
        doubleArray1[6] = -406.1850689574936;
        doubleArray1[7] = -112.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-79.9111310225762));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = 642.96;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 2832.877829;
        doubleArray1[2] = 642.96;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.7416573867739413);
        Assert.assertEquals(1.2054672896255991E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -1.0;
        doubleArray1[3] = -112.3;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[5] = 0.3010299956639812;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 0.3010299956639812;
        doubleArray0[1] = -1.0;
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -1.0;
        doubleArray1[3] = 0.3010299956639812;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[1] = -406.1850689574936;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 659.9737474909451;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 54.0;
        doubleArray1[2] = 659.9737474909451;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        Assert.assertEquals(1.2701085529520187E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = ((double) (2164));
        doubleArray0[2] = ((double) (-51));
        doubleArray0[3] = 54.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double) (-51));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-4329.624));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = ((double) (2190));
        doubleArray0[2] = ((double) (-51));
        doubleArray0[3] = -51.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double) (-51));
        doubleArray1[2] = 2832.877828972965;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-51.0));
        Assert.assertEquals(2.0866771659895065E10, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 659.9737474909451;
        doubleArray0[2] = ((double) (-51));
        doubleArray0[3] = 54.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-1326.5722));
        Assert.assertEquals(8030663.999999995, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertEquals(8030664.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 54.0;
        doubleArray1[1] = 54.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 543.0265682974494);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        eigenDecompositionImpl0.getSolver();
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(6)));
        Assert.assertEquals(9, arrayRealVector0.getDimension());
        Assert.assertTrue(arrayRealVector0.isNaN());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 943.17643);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 943.17643);
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        eigenDecompositionImpl0.getRealEigenvalue(6);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1348.384736367855));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -79.9111310225762;
        doubleArray0[5] = 638.5055065925685;
        doubleArray0[6] = -1217.21;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -79.9111310225762;
        doubleArray1[1] = -1217.21;
        doubleArray1[2] = -1.0;
        doubleArray1[3] = -112.3;
        doubleArray1[4] = -1292.6468450490067;
        doubleArray1[5] = 0.3010299956639812;
        doubleArray1[6] = -406.1850689574936;
        doubleArray1[7] = -112.3;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1292.6468450490067));
        Assert.assertEquals(-1.4634988847961907E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

