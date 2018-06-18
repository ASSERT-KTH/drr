

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2727.3919442957;
        doubleArray0[1] = -2727.3919442957;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -2727.3919442957;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1788.286784027761;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2235.947183810736;
        doubleArray1[2] = -24.53014493987213;
        doubleArray1[3] = 3719.0985;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6320985011686746);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1788.286784027761;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2238.13333359;
        doubleArray1[2] = 2.220446049250313E-16;
        doubleArray1[3] = 10.06766199577777;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1788.286784027761;
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(1788.286784027761, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2238.13333359;
        doubleArray1[3] = 3719.0985;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-1788.286784027761), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.3302639922987167);
        eigenDecompositionImpl0.getImagEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1229.3619994416692);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(2, arrayRealVector0.getDimension());
        Assert.assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -0.4161468365471424;
        doubleArray0[1] = -0.4161468365471424;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = 10.964552555569096;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 10.964552555569096);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-120.2214127438368), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1240.895858);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1792.148);
        eigenDecompositionImpl1.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        try {
            double[] doubleArray0 = new double[7];
            double[] doubleArray1 = new double[6];
            doubleArray1[1] = -2238.13333359;
            doubleArray1[2] = 2.220446049250313E-16;
            doubleArray1[3] = 10.06766199577777;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2238.13333359;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1.09861228866811;
        doubleArray0[1] = 1.09861228866811;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1229.3619994416692);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(1.2069489608125827, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1788.286784027761;
        doubleArray0[5] = 10.06766199577777;
        doubleArray0[6] = 10.06766199577777;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2238.13333359;
        doubleArray1[2] = 1788.286784027761;
        doubleArray1[3] = 3719.0985;
        doubleArray1[4] = 3719.0985;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1788.286784027761;
        doubleArray0[2] = 10.0;
        doubleArray0[5] = 10.06766199577777;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2235.947183810736;
        doubleArray1[2] = -24.53014493987213;
        doubleArray1[3] = 3719.0985;
        doubleArray1[4] = 3310.1546722651947;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.6320985011686746);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1788.286784027761;
        doubleArray0[5] = 1304.36667020747;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1304.36667020747;
        doubleArray1[2] = -24.53014493987213;
        doubleArray1[3] = 3719.0985;
        doubleArray1[4] = 1304.36667020747;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 1788.286784027761;
        doubleArray1[3] = 3719.0985;
        doubleArray1[4] = 3719.0985;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1788.286784027761;
        doubleArray1[2] = 10.0;
        doubleArray1[3] = 3719.965942081856;
        doubleArray1[4] = 2.7284841053187847E-12;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2237.506504096719;
        doubleArray1[2] = 32.0;
        doubleArray1[3] = 3719.965942081856;
        doubleArray1[4] = 2.7284841053187847E-12;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2727.3919442957;
        doubleArray0[1] = -2727.3919442957;
        doubleArray0[3] = 1292.5469142232903;
        doubleArray0[4] = -1000.38429;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -2727.3919442957;
        doubleArray1[1] = -2238.13333359;
        doubleArray1[2] = -1000.38429;
        doubleArray1[3] = 3719.0985;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 10.0178749274099;
        doubleArray1[4] = 1304.36667020747;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1788.286784027761;
        doubleArray0[5] = 1304.36667020747;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2238.13333359;
        doubleArray1[2] = -24.53014493987213;
        doubleArray1[3] = 1304.36667020747;
        doubleArray1[4] = 1304.36667020747;
        doubleArray1[5] = 1788.286784027761;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 0.013622022585667384;
        doubleArray1[4] = 0.013622022585667384;
        doubleArray1[5] = 1775.473712584922;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -0.4161468365471424;
        doubleArray0[3] = 1292.5469142232903;
        doubleArray0[5] = 1292.5469142232903;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.4161468365471424;
        doubleArray1[1] = -2238.13333359;
        doubleArray1[2] = -1000.38429;
        doubleArray1[3] = 3719.0985;
        doubleArray1[4] = 1292.5469142232903;
        doubleArray1[5] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals(4.993293112915333E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -2728.566807652035;
        doubleArray1[1] = -2238.13333359;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1240.895858);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0986123);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1240.895858);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1229.3619994416692);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.9);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

