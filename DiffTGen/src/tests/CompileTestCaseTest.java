package tests;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import testgen.CompileTestCase;
import testgen.Global;

public class CompileTestCaseTest {
	@Test
	public void compileTest() {
		File directory = new File(""); 
		Global.difftgendpath=directory.getAbsolutePath();
		Global.dependjpath=directory.getAbsolutePath()+"/tmp/lang_51_buggy/target/classes/";
		String projectRootPath=directory.getAbsolutePath()+"/mock_test/compile/51_mocktool";
		Boolean state = CompileTestCase.compile(projectRootPath);
		assertTrue(state);
	}

}
