package testgen;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class WriteTestCaseToFile {

	public static boolean writetests(TestCase tc, String projectRootPath) {
		String testCaseFullName = tc.getTestCaseFullName();
		String testCaseContent = tc.getTestCaseContent();
		if (testCaseContent == null) {
			return false;
		}
		// Write to file
		String testCaseName = null;
		int lastDotIndex = testCaseFullName.lastIndexOf(".");
		if (lastDotIndex == -1) {
			testCaseName = testCaseFullName;
		} else {
			testCaseName = testCaseFullName.substring(lastDotIndex + 1);
		}
		String testCasePath = projectRootPath + "/testcase/" + testCaseName + ".java";
		File testCaseFile = new File(testCasePath);
		try {
			FileUtils.writeStringToFile(testCaseFile, testCaseContent, (String) null);
		} catch (Throwable t) {
			t.printStackTrace();
			System.err.println(t);
			return false;
		}
		return true;
	}
}
