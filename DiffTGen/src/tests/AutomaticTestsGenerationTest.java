package tests;

import java.io.File;
import java.util.List;

import org.junit.Test;

import testgen.AutomaticTestsGeneration;
import testgen.CreateTestTargets;
import testgen.Global;
import testgen.Modification;
import testgen.SynDeltaParser;
import testgen.TestTarget;
import util.ReadInputs;

public class AutomaticTestsGenerationTest {

	@Test
	public void testgenerateTC() {
		testgen.Timer timer = new testgen.Timer();
		timer.start();
		File directory = new File(""); 
		Global.difftgendpath=directory.getAbsolutePath();
		Global.bugid="51";
		Global.repairtool="mocktool";
		Global.outputdpath=directory.getAbsolutePath()+"/mock_test/compile";
		Global.dependjpath=directory.getAbsolutePath()+"/tmp/lang_51_buggy/target/classes";
		String inputfpath = directory.getAbsolutePath()+"/examples/lang51nopol_delta0.txt";
		String outpath = directory.getAbsolutePath()+"/mock_test/compile";		
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);
		List<TestTarget> testTargetList=CreateTestTargets.create(modList,outpath);;
		Global.testID="51_mocktool";
		String projectRootPath=outpath + "/" + Global.testID;
		AutomaticTestsGeneration.generateTest(timer, testTargetList, projectRootPath);
	}
}
