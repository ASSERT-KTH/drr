package testgen;

import java.util.List;

public class AutomaticTestsGeneration {
	
	public static void generateTest(Timer timer, List<TestTarget> testTargetList,String projectRootPath) {
	boolean overfitting_break = Global.stopifoverfittingfound;
	TestCaseGenerator testCaseGenerator = new TestCaseGenerator();
	TestCase regressionTestCase = null, repairTestCase = null, defectiveTestCase = null;
	for (int i=0; i<testTargetList.size(); i++) {
	    TestTarget tt = testTargetList.get(i);
	    System.out.println("Working on Test Target No."+i+" for Test Case Generation.");
	    List<TestCase> testCaseList = testCaseGenerator.generateTestCases(i+"", tt);
	    for (TestCase tc : testCaseList) {
		if (regressionTestCase == null && tc.isRegressionIndicative()) {
		    regressionTestCase = tc;
		}
		if (repairTestCase == null && tc.isRepairIndicative()) {
		    repairTestCase = tc;
		}
		if (defectiveTestCase == null && tc.isDefectiveIndicative()) {
		    defectiveTestCase = tc;
		}
	    }
	    if ((overfitting_break && (regressionTestCase!=null || defectiveTestCase!=null)) ||
	        (regressionTestCase!=null && repairTestCase!=null && defectiveTestCase!=null)) {
	    	checkTimer(timer);
		break;
	    }
	}

	checkTimer(timer);

	if (regressionTestCase==null && repairTestCase==null && defectiveTestCase==null) {
	    System.out.println("Found Nothing.");
	    return;
	}
	writeTests(regressionTestCase,projectRootPath);
	writeTests(repairTestCase,projectRootPath);
	writeTests(defectiveTestCase,projectRootPath);
	
}
	
	
	private static void writeTests(TestCase testCase,String projectRootPath) {
		if (testCase != null) {
		    boolean write_tc = WriteTestCaseToFile.writetests(testCase, projectRootPath);
		    if (!write_tc) { System.out.println(testCase.getTestCaseFullName()+"Write Test Case Failure."); }
		}		
	}

	private static void checkTimer(Timer timer){
		if (!timer.isReset()) {
		    timer.end();
		    System.out.println("Total execution time: " + timer.getDurationInMillis());
		    timer.reset();
		}
	}
}
