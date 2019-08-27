

package org.apache.commons.math.optimization.linear;

import org.apache.commons.math.optimization.GoalType;
import org.junit.Assert;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.SparseRealVectorTest;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.linear.RealVectorImplTest;

public class SimplexTableau_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[22];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1457.3769));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 28.633090164);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 10.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.718281828459045);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-8.88621489922));
        simplexTableau1.numArtificialVariables = 771;
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply(0.0)));
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImpl0)), 352.202);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(((RealVector) (realVectorImpl0)), 0.0, relationship0, ((RealVector) (realVectorImplTest_RealVectorTestImpl0)), 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-207.2529));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-207.2529));
        simplexTableau0.divideRow(0, 310.479351625);
        Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -748.3869907168722;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        double[] doubleArray1 = new double[9];
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 565.89847, relationship0, doubleArray1, 197.43804915336);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 358.7072083382527);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 358.7072083382527);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.numArtificialVariables = 3240;
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.subtractRow(0, 0, (-2403.0985959061168));
        Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 28.633090164);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        simplexTableau0.setEntry(0, 0, 4782.652675);
        Assert.assertEquals(8, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 920.77028897372);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 920.77028897372);
        boolean boolean0 = simplexTableau0.equals(goalType0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getWidth();
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1473.416));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1473.416));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-1473.416), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1459.573783374162));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-3149.717139832));
        int int0 = simplexTableau0.getSlackVariableOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        int int0 = simplexTableau0.getRhsOffset();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply(0.0)));
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImpl0)), 352.202);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3197.629584);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1473.416));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 758.45465271265, relationship0, doubleArray0, (-1014.1178));
        linkedList0.push(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1473.416));
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1459.573783374162));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-3149.717139832));
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1459.573783374162));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-3149.717139832));
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply(0.0)));
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImpl0)), 352.202);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 1903.178922);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply(0.0)));
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImpl0)), 352.202);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 1903.178922);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3197.629584);
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -512.915508;
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        Assert.assertEquals(512.915508, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 30.600523772755743;
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals((-30.600523772755743), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        int int0 = simplexTableau0.getHeight();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 28.633090164);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        double double0 = simplexTableau0.getEntry(0, 1);
        Assert.assertEquals((-0.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1.718281828459045;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        double double0 = simplexTableau0.getEntry(0, 1);
        Assert.assertEquals((-1.718281828459045), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1459.573783374162));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-3149.717139832));
        int int0 = simplexTableau0.getArtificialVariableOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2268.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        double[][] doubleArray1 = simplexTableau0.createTableau(true);
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 248.815733660874);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getWidth();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 278.621091972009);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 426.36034);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getRhsOffset();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.divideRow(4276, (-912.0));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new SimplexTableau(((LinearObjectiveFunction) (null)), ((Collection<LinearConstraint>) (null)), goalType0, false, 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray1 = new double[6];
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray1);
        OpenMapRealVector openMapRealVector0 = ((OpenMapRealVector) (sparseRealVectorTest_SparseRealVectorTestImpl0.mapMultiply(0.0)));
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(((RealVector) (openMapRealVector0)), (-774.0939), relationship0, ((RealVector) (sparseRealVectorTest_SparseRealVectorTestImpl0)), 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3197.629584);
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 3197.629584);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2.078393476550531E7));
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 28.633090164);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        simplexTableau0.numArtificialVariables = 1516;
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.3010299956639812);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1792.0352672781612));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-8.88621489922));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply(0.0)));
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImpl0)), 352.202);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 3197.629584);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2268.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.3010299956639812);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -1792.0352672781612;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1457.3769));
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(1.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        double[] doubleArray0 = new double[22];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1457.3769));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2403.0985959061168));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        double[] doubleArray0 = new double[22];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1021.044007717263);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(22, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        double[] doubleArray0 = new double[22];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1792.0352672781612));
        double[][] doubleArray1 = simplexTableau0.getData();
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1.718281828459045;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 28.633090164);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1.0));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1459.573783374162));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(28.633090164, realPointValuePair0.getValue(), 0.01);
    }
}

