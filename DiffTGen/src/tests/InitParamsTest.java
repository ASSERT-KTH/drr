package tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import testgen.Global;
import testgen.InitialParams;
import testgen.MethodToBeInstrumented;
import testgen.Modification;
import testgen.OracleParser;
import testgen.SynDeltaParser;
import util.ReadInputs;

public class InitParamsTest {
	@Test
	public void test() {
		String inputfpath = "./examples/lang51nopol_delta0.txt";
		String oracleinputfpath = "./examples/lang51nopol_oracle.txt";
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<String> oracles = ReadInputs.readLine(oracleinputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);
		List<MethodToBeInstrumented> oracleMedInstruList = OracleParser.parse(oracles);

		String outputRootdPath = "./mock_test";
		Boolean state = InitialParams.init("bug1", "testTool", modList, oracleMedInstruList, Global.evosuitetrials,
				Global.evosuitetimeout, outputRootdPath);
		assertEquals(true, state);
	}
}