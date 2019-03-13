package tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;

import org.junit.Test;

import testgen.CompileTestTargets;
import testgen.Global;
import testgen.MethodToBeInstrumented;
import testgen.Modification;
import testgen.OracleParser;
import testgen.SynDeltaParser;
import util.ReadInputs;

public class CompileTestTargetsTest {

	@Test
	public void compileTest() {		
		File directory = new File(""); 
		Global.testID="51_mocktool";
		Global.difftgendpath=directory.getAbsolutePath();
		Global.dependjpath=directory.getAbsolutePath()+"/tmp/lang_51_buggy/target/classes/";
		String inputfpath = directory.getAbsolutePath()+"/examples/lang51nopol_delta0.txt";
		String outpath = directory.getAbsolutePath()+"/mock_test/compile";		
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);		
		String oracleinputfpath = directory.getAbsolutePath()+"/examples/lang51nopol_oracle.txt";
		List<String> oracles = ReadInputs.readLine(oracleinputfpath);
		List<MethodToBeInstrumented> oracleMedInstruList = OracleParser.parse(oracles);		
		Boolean state = CompileTestTargets.compile(modList,oracleMedInstruList,outpath);
		assertTrue(state);
	}
}
