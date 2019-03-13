package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import util.*;


public class TestCaseGenerator
{
    String bugid, repairtool, outputdpath, projdpath;
    int evosuite_trials, evosuite_timeout;
    boolean overfitting_break, run_evosuite, run_parallel;
    String difftgendpath, dependjpath;

    
    public TestCaseGenerator() {
	bugid = Global.bugid;
	repairtool = Global.repairtool;
	outputdpath = Global.outputdpath;
	projdpath = outputdpath + "/" + bugid + "_" + repairtool.toLowerCase();
	evosuite_trials = Global.evosuitetrials;
	evosuite_timeout = Global.evosuitetimeout;
	overfitting_break = Global.stopifoverfittingfound;
	run_evosuite = Global.runevosuite;
	run_parallel = Global.runparallel;
	difftgendpath = Global.difftgendpath;
	dependjpath = Global.dependjpath;
    }
    
    public List<TestCase> generateTestCases(String targetid, TestTarget target) {
	if (run_parallel) { return generateTestCaseInParallel(targetid, target); }
	else { return generateTestCaseInSequence(targetid, target); }
    }

    private List<TestCase> generateTestCaseInParallel(String targetid, TestTarget target) {
	int pe = 8;
	TestCase regression_tc = null;
	TestCase repair_tc = null;
	TestCase defective_tc = null;
	int regression_trialid = -1;
	int repair_trialid = -1;
	int defective_trialid = -1;
	Timer timer = Global.timer;
	
	for (int i=0; i<evosuite_trials; i+=pe) {
	    ExecutorService exe_service = Executors.newFixedThreadPool(pe);
	    List<Callable<List<TestCase>>> call_list = new ArrayList<Callable<List<TestCase>>>();
	    int j_upper_bound = (i+pe < evosuite_trials) ? (i+pe) : evosuite_trials;
	    for (int j=i; j<j_upper_bound; j++) {
		String trialid = j + "";
		TestCaseGeneratorTrial tcgt = new TestCaseGeneratorTrial(targetid, trialid, target, projdpath, evosuite_timeout, overfitting_break, run_evosuite, difftgendpath, dependjpath);
		call_list.add(tcgt);
	    }
	    List<Future<List<TestCase>>> tc_future_list = null;
	    try { tc_future_list = exe_service.invokeAll(call_list); }
	    catch (Throwable t) {
		System.err.println("Targetid "+targetid+" Test Case Generator Trial Error.");
		System.err.println(t);
		t.printStackTrace();
		exe_service.shutdownNow();
	    }
	    if (!exe_service.isShutdown()) {
		exe_service.shutdown();
	    }
	    
	    if (tc_future_list == null) { continue; }
	    int tc_future_list_size = tc_future_list.size();
	    for (int k=0; k<tc_future_list_size; k++) {
		Future<List<TestCase>> tc_future = tc_future_list.get(k);
		int trialid = k+i;
		if (tc_future == null) { continue; }
		List<TestCase> tc_list = null;
		try { tc_list = tc_future.get(); }
		catch (Throwable t) {
		    System.err.println("Targetid "+targetid+" Trialid "+trialid+" Failed getting a test case from a future.");
		    System.err.println(t);
		    t.printStackTrace();
		}
		if (tc_list == null) { continue; }
		
		for (TestCase tc : tc_list) {
		    if (tc == null) { continue; }
		    if (tc.isRegressionIndicative()) {
			if (regression_tc == null) {
			    regression_tc = tc;
			    regression_trialid = trialid;
			}
		    }
		    else if (tc.isRepairIndicative()) {
			if (repair_tc == null) {
			    repair_tc = tc;
			    repair_trialid = trialid;
			}
		    }
		    else if (tc.isDefectiveIndicative()) {
			if (defective_tc == null) {
			    defective_tc = tc;
			    defective_trialid = trialid;
			}
		    }
		}
	    }

	    if (regression_tc != null || defective_tc != null) { //overfitting found!
		if (!timer.isReset()) {
		    timer.end();
		    System.out.println("Total execution time: " + timer.getDurationInMillis());
		    timer.reset();
		}
	    }
	    if (overfitting_break && (regression_tc != null || defective_tc != null)) {
		break;
	    }
	    if (regression_tc != null && repair_tc != null && defective_tc != null) {
		break;
	    }
	}

	if (regression_tc != null) {
	    System.out.println("Regression-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + regression_trialid);
	}
	if (repair_tc != null) {
	    System.out.println("Repair-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + repair_trialid);
	}
	if (defective_tc != null) {
	    System.out.println("Defective-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + defective_trialid);
	}

	List<TestCase> rslt_tc_list = new ArrayList<TestCase>();
	if (regression_tc != null) { rslt_tc_list.add(regression_tc); }
	if (repair_tc != null) { rslt_tc_list.add(repair_tc); }
	if (defective_tc != null) { rslt_tc_list.add(defective_tc); }
	return rslt_tc_list;
    }

    private List<TestCase> generateTestCaseInSequence(String targetid, TestTarget target) {
	TestCase regression_tc = null; 
	TestCase repair_tc = null; 
	TestCase defective_tc = null; 
	int regression_trialid = -1;
	int repair_trialid = -1;
	int defective_trialid = -1;
	Timer timer = Global.timer;
	
	for (int i=0; i<evosuite_trials; i++) {
	    String trialid = i + "";
	    TestCaseGeneratorTrial tcgt = new TestCaseGeneratorTrial(targetid, trialid, target, projdpath, evosuite_timeout, overfitting_break, run_evosuite, difftgendpath, dependjpath);
	    List<TestCase> tc_list = tcgt.call();
	    for (TestCase tc : tc_list) {
		if (tc == null) { continue; }
		if (tc.isRegressionIndicative()) {
		    if (regression_tc == null) {
			regression_tc = tc;
			regression_trialid = i;
		    }
		}
		else if (tc.isRepairIndicative()) {
		    if (repair_tc == null) {
			repair_tc = tc;
			repair_trialid = i;
		    }
		}
		else if (tc.isDefectiveIndicative()) {
		    if (defective_tc == null) {
			defective_tc = tc;
			defective_trialid = i;
		    }
		}
	    }

	    if (regression_tc != null || defective_tc != null) { //overfitting found!
		if (!timer.isReset()) {
		    timer.end();
		    System.out.println("Total execution time: " + timer.getDurationInMillis());
		    timer.reset();
		}
	    }
	    
	    if (overfitting_break && (regression_tc != null || defective_tc != null)) {
		break;
	    }
	    if (regression_tc != null && repair_tc != null && defective_tc != null) {
		break;
	    }
	}

	if (regression_tc != null) {
	    System.out.println("Regression-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + regression_trialid);
	}
	if (repair_tc != null) {
	    System.out.println("Repair-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + repair_trialid);
	}
	if (defective_tc != null) {
	    System.out.println("Defective-indicative Test Case Found!");
	    System.out.println("Contributed by Target "+targetid+" Trial " + defective_trialid);
	}

	List<TestCase> rslt_tc_list = new ArrayList<TestCase>();
	if (regression_tc != null) { rslt_tc_list.add(regression_tc); }
	if (repair_tc != null) { rslt_tc_list.add(repair_tc); }
	if (defective_tc != null) { rslt_tc_list.add(defective_tc); }
	return rslt_tc_list;
    }
}

