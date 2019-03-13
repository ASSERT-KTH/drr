package tests;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;
import testgen.CreateInstrumentedFiles;
import testgen.MethodToBeInstrumented;
import testgen.Modification;
import testgen.OracleParser;
import testgen.SynDeltaParser;
import util.ReadInputs;

public class CreateInstrumentedFilesTest {
	@Test
	public void createInstrumentedFilesTest() {

		String outputRootdPath = "./mock_test";
		String inputfpath = "./examples/lang51nopol_delta0.txt";
		String oracleinputfpath = "./examples/lang51nopol_oracle.txt";
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<String> oracles = ReadInputs.readLine(oracleinputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);
		List<MethodToBeInstrumented> oracleMedInstruList = OracleParser.parse(oracles);

		Boolean state = CreateInstrumentedFiles.createInstrumentedFiles("51", "mocktool", modList, oracleMedInstruList,
				outputRootdPath);
		assertTrue(state);
	}

}
