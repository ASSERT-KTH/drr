

package org.apache.commons.math.optimization.linear;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVectorTest;
import org.junit.Assert;
import org.apache.commons.math.optimization.GoalType;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.SparseRealVectorTest;
import org.junit.Test;

public class SimplexTableau_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-896.40799));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-3090.2391013), (-1555));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.9092974268256817);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.6931471805599453, relationship0, doubleArray0, 4183.048);
        linkedList0.push(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY, (-4537));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        Integer integer0 = new Integer(32);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, ((double) (integer0)), 32);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -2911.843;
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (sparseRealVectorTest_SparseRealVectorTestImpl0)), 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2911.843), 4);
        boolean boolean0 = simplexTableau0.isOptimal();
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 1.7976931348623157E308;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2989.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 3846.98439);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-346.527467));
        simplexTableau0.dropPhase1Objective();
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[18];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 5.430386085740008);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY, 165);
        simplexTableau0.initializeColumnLabels();
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, 1);
        simplexTableau0.setEntry(0, 0, 0.0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-658.403825496151));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-658.403825496151), 16);
        List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        Assert.assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[18];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 5.430386085740008);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY, 165);
        int int0 = simplexTableau0.getWidth();
        Assert.assertEquals(21, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2408.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.1), 2279);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-2408.0), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-896.40799));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-3090.2391013), (-1555));
        int int0 = simplexTableau0.getSlackVariableOffset();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.25432955845838645);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.25432955845838645, (-294));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 6.0);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 6.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-2537.4414), relationship0, doubleArray0, (-2537.4414));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2561.3604);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[2];
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (sparseRealVectorTest_SparseRealVectorTestImpl0)), 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2911.843));
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1465.263721, 2751);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(9, int0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-658.403825496151));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-658.403825496151), 16);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[0];
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -2911.843;
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        Assert.assertEquals(2911.843, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -676.64304722;
        ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (arrayRealVectorTest_RealVectorTestImpl0.mapMultiply((-676.64304722))));
        double double0 = SimplexTableau.getInvertedCoefficientSum(arrayRealVector0);
        Assert.assertEquals((-457845.81335116713), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.25432955845838645);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.25432955845838645, (-294));
        int int0 = simplexTableau0.getHeight();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-4942.625));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0, 0);
        double double0 = simplexTableau0.getEntry(0, 0);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.7853981633974483);
        Integer integer0 = simplexTableau0.getBasicRow(2);
        Assert.assertNull(integer0);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.662337662337662);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, 0);
        Integer integer0 = simplexTableau0.getBasicRow(0);
        Assert.assertEquals(0, ((int) (integer0)));
        Assert.assertNotNull(integer0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.25432955845838645);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.25432955845838645, (-294));
        int int0 = simplexTableau0.getArtificialVariableOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-896.40799));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-3090.2391013), (-1555));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (simplexTableau0.createTableau(true)));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 2064.49091);
        linkedList0.push(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 4176.421115373114);
        List<LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        Assert.assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        Integer integer0 = new Integer(1495);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, ((double) (integer0)), 1495);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        Integer integer0 = Integer.valueOf(1495);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, ((double) (integer0)), 32);
        simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[3];
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-838.98850580421));
        ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (arrayRealVectorTest_RealVectorTestImpl0.mapMultiply((-676.6430472))));
        Integer integer0 = new Integer(32);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (arrayRealVector0)), (-676.6430472));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        linkedList0.push(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, ((double) (integer0)), 32);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-2408.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.1), 2279);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1103.4592602357152));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        Integer integer0 = new Integer(32);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        boolean boolean0 = simplexTableau0.equals(integer0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 511.4);
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1495.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1154.7172199733);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2458.97, (-1879048190));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2989.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-346.527467));
        simplexTableau0.divideRow(0, (-890.106900663));
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1465.263721, 2751);
        boolean boolean0 = simplexTableau0.isOptimal();
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-658.403825496151));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-658.403825496151), 16);
        simplexTableau0.dropPhase1Objective();
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 1.7976931348623157E308;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2989.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-346.527467));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(2989.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 5.430386085740008);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.6931471805599453, relationship0, doubleArray0, 4183.048);
        linkedList0.push(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY, (-4537));
        simplexTableau0.dropPhase1Objective();
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 5.430386085740008);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.6931471805599453, relationship0, doubleArray0, 4183.048);
        linkedList0.push(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY, (-4537));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-838.98850580421));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        linkedList0.addFirst(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1465.263721, 2751);
        simplexTableau0.subtractRow(0, 0, (-838.98850580421));
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-658.403825496151));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-658.403825496151), 16);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 6.0);
        int int0 = simplexTableau0.getRhsOffset();
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-838.98850580421));
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1495, 1495);
        double[][] doubleArray1 = simplexTableau0.getData();
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 1.0;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-4942.625));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0, 0);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(-4942.625, realPointValuePair0.getValue(), 0.01);
    }
}

