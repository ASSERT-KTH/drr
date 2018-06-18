

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = -25.510436566192915;
        doubleArray0[2] = 1552.4723743371756;
        doubleArray0[3] = -1988.02;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -25.510436566192915;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -892.855842204;
        doubleArray0[3] = -1988.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 0.25;
        doubleArray1[1] = 0.25;
        doubleArray1[2] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals((-61112.866208983614), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 0.19652832274338977;
        doubleArray0[2] = 0.19652832274338977;
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 3.5256711994335888E-9);
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -892.855842204;
        double[] doubleArray1 = new double[3];
        doubleArray1[2] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals((-892.855842204), double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -892.855842204;
        doubleArray0[1] = 0.25;
        double[] doubleArray1 = new double[3];
        doubleArray1[2] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(1.7794428429994392E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = 0.25;
        doubleArray0[3] = 0.25;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 0.25;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-0.00390625), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        doubleArray0[2] = 0.2162048275653954;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -892.855842204;
        doubleArray0[2] = 1551.981287154585;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -892.855842204;
        doubleArray1[1] = -892.855842204;
        doubleArray1[2] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(6.355143752960577E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = 19.085536923187668;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        doubleArray1[6] = 19.085536923187668;
        doubleArray1[7] = -1.9075005615736715;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        doubleArray1[6] = 19.085536923187668;
        doubleArray1[7] = -1.9075005615736715;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -5520.06840784;
        doubleArray1[1] = -19.92988501306485;
        doubleArray1[2] = 2.0463630789890885E-12;
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        doubleArray0[2] = 0.2162048275653954;
        doubleArray0[3] = 19.085537;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -5520.06840784;
        doubleArray1[3] = 19.085537;
        doubleArray1[4] = -19.9299;
        doubleArray1[5] = -998.6;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = -892.856;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -892.856;
        doubleArray1[1] = 1552.4723743371756;
        doubleArray1[2] = -1988.02;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(3.1506803274188984E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -5520.06840784;
        doubleArray1[1] = -19.92988501306485;
        doubleArray1[2] = 4182.575;
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        doubleArray1[6] = 4182.575;
        doubleArray1[7] = -1.9075005615736715;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals(6.466759553073695E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -5520.06840784;
        doubleArray1[1] = -19.9299;
        doubleArray1[2] = 2.0463630789890885E-12;
        doubleArray1[3] = 19.085537;
        doubleArray1[4] = -19.9299;
        doubleArray1[5] = -998.6;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 0.25;
        doubleArray0[2] = 0.25;
        doubleArray0[3] = 0.25;
        double[] doubleArray1 = new double[3];
        doubleArray0[0] = 0.25;
        doubleArray1[1] = 0.25;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        doubleArray0[2] = 0.2162048275653954;
        doubleArray0[3] = 28.668557166525186;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -998.6;
        doubleArray1[3] = 28.668557166525186;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        doubleArray1[6] = 2.0463630789890885E-12;
        doubleArray1[7] = -1.9075005615736715;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals(6.42943270971442E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        doubleArray0[2] = 0.2162048275653954;
        doubleArray0[3] = 28.668557166525186;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -998.6;
        doubleArray1[3] = 28.668557166525186;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1.9075005615736715;
        doubleArray0[2] = 0.2162048275653954;
        doubleArray0[3] = 19.085536923187668;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -19.92988501306485;
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = -998.6;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -892.855842204;
        doubleArray0[1] = -892.855842204;
        doubleArray0[2] = -892.855842204;
        double[] doubleArray1 = new double[3];
        doubleArray0[3] = -892.855842204;
        doubleArray1[2] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-892.855842204));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 19.085536923187668;
        doubleArray0[6] = ((double) (9));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -5520.06840784;
        doubleArray1[1] = -19.92988501306485;
        doubleArray1[2] = 0.2162048275653954;
        doubleArray1[3] = 19.085536923187668;
        doubleArray1[4] = 0.2162048275653954;
        doubleArray1[5] = 19.085536923187668;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = 1540.4814910795087;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 1.546140993013978E-11;
        doubleArray1[1] = 1.546140993013978E-11;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = 0.25;
        doubleArray0[3] = -1988.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 0.25;
        doubleArray1[1] = -1988.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(31.060896272628884, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -892.855842204;
        doubleArray1[1] = -892.855842204;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.9075005615736715));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-892.855842204));
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.25);
        eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 0.25;
        doubleArray0[2] = 0.25;
        doubleArray0[3] = -1988.02;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 0.25;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2266.891518));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(31.062812500000007, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(-0.15450849718747373, double0, 0.01);
    }
}

