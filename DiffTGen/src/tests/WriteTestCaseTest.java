package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import testgen.TestCase;
import testgen.WriteTestCaseToFile;

public class WriteTestCaseTest {
	@Test
	public void test() {
		TestCase tc = new TestCase(10,"fullName","content");
		String projectRootPath="./mock_test";
		Boolean state = WriteTestCaseToFile.writetests(tc, projectRootPath);
		assertTrue(state);
	}
	
}
