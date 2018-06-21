

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = -1075.80066194259;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1075.80066194259));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(1.5, double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 27.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-177.0), double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(1)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 27.0;
        doubleArray0[2] = 165862.8481090568;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[4] = 27.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(8.760448999024492E15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[4] = 27.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-4.401452313813917E9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9999999999999998);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -177.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9999999999999998);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 27.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 27.0;
        doubleArray1[3] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -1075.80066194259;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1075.80066194259));
        Assert.assertEquals((-3.013767511275557E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        Assert.assertEquals((-3.0137675109655615E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 2494.33136269;
        doubleArray1[3] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.5);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 27.0;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = 27.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        Assert.assertEquals((-1.8983385221102467E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -177.0;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = 165862.8481090568;
        doubleArray1[4] = 27.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.0));
        Assert.assertEquals((-1.8983385399257977E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[5] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -1075.80066194259;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        Assert.assertEquals((-2.3900610739000528E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 165862.8481090568;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = 27.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        Assert.assertEquals(3.4905543822463174E17, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 2494.33136269;
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1059.2579836708874;
        doubleArray1[2] = 3772.953;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1059.2579836708874));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[4] = -177.0;
        doubleArray0[5] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        Assert.assertEquals((-1.2795290855147478E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -10.518041618286837;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        Assert.assertEquals((-1.481825276307127E14), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -1075.80066194259;
        doubleArray0[4] = -177.0;
        doubleArray0[5] = -0.3159877098721481;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[2] = 2494.33136269;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-177.0));
        Assert.assertEquals(4.0273128409349225E14, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertEquals(4.0273128409376575E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -1075.80066194259;
        doubleArray1[3] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1075.80066194259));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1075.80066194259));
        eigenDecompositionImpl0.getVT();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1059.2579836708874));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-177.0));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getVT()));
        Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2213.8);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = -1075.80066194259;
        doubleArray0[4] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-177.0));
        Assert.assertEquals(3.0137675109655903E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

