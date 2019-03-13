package tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import testgen.CreateTestTargets;
import testgen.Global;
import testgen.Modification;
import testgen.SynDeltaParser;
import testgen.TestTarget;
import util.ReadInputs;

public class CreateTestTargetsTest {
	@Test
	public void testTargetTest() {
		Global.testID="51_mocktool";
		String inputfpath = "./examples/lang51nopol_delta0.txt";
		String outpath = "./mock_test/compile";
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);
		List<TestTarget> result = CreateTestTargets.create(modList, outpath);
		assertEquals(1,result.size());
	}

}
