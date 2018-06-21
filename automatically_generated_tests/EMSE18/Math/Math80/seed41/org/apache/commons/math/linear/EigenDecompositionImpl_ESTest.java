

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -225.0592184;
        doubleArray0[3] = 3.0;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 3.0;
        doubleArray1[1] = 3.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-225.0592184));
        Assert.assertEquals(6076.598896800003, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -225.0592184;
        doubleArray0[3] = -225.0592184;
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-225.0592184));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = -1684.8742576899738;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(1684.8742576899738, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 19.45583084183899;
        doubleArray1[1] = 19.45583084183899;
        doubleArray1[5] = 4.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-803.3674465979924));
        eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-225.0592184));
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -225.0592184;
        doubleArray0[3] = -225.0592184;
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = -1684.8742576899738;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.4378997312757382E11), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 431.1251555627617);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 6.38905609893065;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = -1665.0;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 237.99465747366412;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 28.871255544592508;
        doubleArray1[1] = 28.871255544592508;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 28.871255544592508;
        doubleArray1[5] = 237.99465747366412;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-1.7978479053295798E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 415.71292016776;
        doubleArray0[3] = 4.0;
        doubleArray0[5] = 4.0;
        doubleArray0[4] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-7.242389080758526E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -1665.0;
        doubleArray0[3] = 4.0;
        doubleArray0[5] = 4.0;
        doubleArray0[4] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-7.242389081356124E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = -1665.0;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -1665.0;
        doubleArray0[3] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -223.97319424312207;
        doubleArray0[3] = 12.566370614359172;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 12.566370614359172;
        doubleArray1[1] = 12.566370614359172;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-223.97319424312207));
        Assert.assertEquals(444452.78909905767, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -1665.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 415.71292016776;
        doubleArray0[5] = 4.0;
        doubleArray0[4] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -1340.07866;
        doubleArray0[3] = -1340.07866;
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 993.23639124;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-290.6681465880291));
        double double0 = eigenDecompositionImpl1.getDeterminant();
        Assert.assertEquals((-1.7716006433543696E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -1637.196293804141;
        doubleArray0[3] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 6.38905609893065;
        doubleArray0[4] = 4.0;
        doubleArray1[3] = 4.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -225.0592184;
        doubleArray0[2] = 993.23639124;
        doubleArray0[3] = -225.0592184;
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 993.23639124;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-290.6681465880291));
        Assert.assertEquals((-4.996879300624976E10), eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertEquals((-4.996879300624977E10), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(7, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-803.3674465979924));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 993.23639124);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -225.0592184;
        doubleArray0[3] = -225.0592184;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -225.0592184;
        doubleArray1[1] = -225.0592184;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-225.0592184));
        Assert.assertEquals(-2.565589828733154E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(2.2734317943256384E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -1665.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(-0.0012350525301361044, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -1665.0;
        doubleArray0[3] = 4.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(-3.234395011903899E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 6.38905609893065;
        doubleArray1[1] = 6.38905609893065;
        doubleArray1[2] = 4.0;
        doubleArray1[3] = 4.0;
        doubleArray1[4] = 6.38905609893065;
        doubleArray1[5] = -1665.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-796.5361331484846));
        Assert.assertEquals(2.2804374050040922E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

