

package org.apache.commons.math3.ode;

import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.junit.Assert;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import java.util.Collection;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest;
import org.junit.Test;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.StepProblem;

public class AbstractIntegrator_ESTest  {
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2127.0));
        classicalRungeKuttaIntegrator0.setMaxEvaluations(1);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3043.0, 710.3, 3615.6752974336, 3043.0);
        StepProblem stepProblem0 = new StepProblem(0.0, 409.941262, 0.0);
        double[] doubleArray0 = new double[1];
        double double0 = dormandPrince853Integrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), 0.0, doubleArray0, 1591.7092432848863, doubleArray0);
        Assert.assertEquals(1591.7092432848863, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3043.0, 710.3, 3615.6752974336, 3043.0);
        StepProblem stepProblem0 = new StepProblem(0.0, 409.941262, 0.0);
        double[] doubleArray0 = new double[1];
        double double0 = dormandPrince853Integrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), 0.0, doubleArray0, (-1504.234767648), doubleArray0);
        Assert.assertEquals((-1504.234767648), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.044807672696074), (-3097.7709269), (-1327.63943), (-3097.7709269));
        TestProblem5 testProblem5_0 = new TestProblem5();
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(((FirstOrderDifferentialEquations) (testProblem5_0)));
        expandableStatefulODE0.setTime((-1414.966));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 546.50726688);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        Assert.assertEquals(65, int0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2548.427111760849), 0.0, doubleArray0, doubleArray0);
        double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
        highamHall54Integrator0.setMaxEvaluations((-861));
        Assert.assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(129.5);
        StepNormalizerOutputTest stepNormalizerOutputTest0 = new StepNormalizerOutputTest();
        StepNormalizer stepNormalizer0 = new StepNormalizer(2.4, ((FixedStepHandler) (stepNormalizerOutputTest0)));
        classicalRungeKuttaIntegrator0.addStepHandler(stepNormalizer0);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 1.0, 1.0, 1.0);
        StepProblem stepProblem0 = new StepProblem(1000.0, (-6517.318), (-6517.318));
        BrentSolver brentSolver0 = new BrentSolver(1000.0, (-6517.318), 0.0);
        highamHall54Integrator0.addEventHandler(((EventHandler) (stepProblem0)), (-6517.318), 1000.0, 223, ((UnivariateSolver) (brentSolver0)));
        Assert.assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2127.0));
        classicalRungeKuttaIntegrator0.clearEventHandlers();
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[1];
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.044807672696074), (-3097.7709269), (-1327.63943), (-3097.7709269));
        try {
            graggBulirschStoerIntegrator0.computeDerivatives((-0.044807672696074), doubleArray0, doubleArray0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.0), (-1.0), 0.0, 0.0);
        dormandPrince54Integrator0.setMaxEvaluations(0);
        Assert.assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
        StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-637.0));
        highamHall54Integrator0.addEventHandler(((EventHandler) (stepProblem0)), (-609.0), 0.0, (-861));
        Collection<EventHandler> collection0 = highamHall54Integrator0.getEventHandlers();
        Assert.assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1987.56017891, 1987.56017891, 1987.56017891, 0.042716404881747105);
        String string0 = dormandPrince853Integrator0.getName();
        Assert.assertEquals("Dormand-Prince 8 (5, 3)", string0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        GillIntegrator gillIntegrator0 = new GillIntegrator(6450.115);
        gillIntegrator0.getStepHandlers();
        Assert.assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2127.0));
        double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2127.0));
        int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.044807672696074), (-3097.7709269), (-1327.63943), (-3097.7709269));
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1574.5998), 667.130116812063, (-1574.5998), 667.130116812063);
        double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
        Assert.assertEquals(1024.9209474424117, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1504.234767648), 3324.1281361572, 3324.1281361572, 0.0);
        graggBulirschStoerIntegrator0.clearStepHandlers();
        Assert.assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.044807672696074), (-3097.7709269), (-1327.63943), (-3097.7709269));
        StepProblem stepProblem0 = new StepProblem((-3073.42), (-3073.42), 419.97191316824);
        graggBulirschStoerIntegrator0.addEventHandler(((EventHandler) (stepProblem0)), (-1295.877463551), (-0.044807672696074), 5);
        TestProblem5 testProblem5_0 = new TestProblem5();
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(((FirstOrderDifferentialEquations) (testProblem5_0)));
        expandableStatefulODE0.setTime((-1414.966));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 546.50726688);
        Assert.assertEquals(65, testProblem5_0.getCalls());
    }
}

