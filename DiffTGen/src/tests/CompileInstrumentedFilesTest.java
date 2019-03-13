package tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import testgen.CompileInstrumentedFiles;
import testgen.CreateInstrumentedFiles;
import testgen.Global;
import testgen.MethodToBeInstrumented;
import testgen.Modification;
import testgen.OracleParser;
import testgen.SynDeltaParser;
import util.ReadInputs;

public class CompileInstrumentedFilesTest {
	
	@Test
	public void buildTest() throws IOException {
		File directory = new File(""); 
		Global.difftgendpath=directory.getAbsolutePath();
		Global.dependjpath=directory.getAbsolutePath()+"/tmp/lang_51_buggy/target/classes";		
		String outputRootdPath = directory.getAbsolutePath()+"/mock_test/compile";
		String inputfpath = directory.getAbsolutePath()+"/examples/lang51nopol_delta0.txt";
		String oracleinputfpath = directory.getAbsolutePath()+"/examples/lang51nopol_oracle.txt";
		List<String> inputDeltas = ReadInputs.readLine(inputfpath);
		List<String> oracles = ReadInputs.readLine(oracleinputfpath);
		List<Modification> modList = SynDeltaParser.parse(inputDeltas);
		List<MethodToBeInstrumented> oracleMedInstruList = OracleParser.parse(oracles);
		CreateInstrumentedFiles.createInstrumentedFiles("51", "mocktool", modList, oracleMedInstruList,
				outputRootdPath);
		Boolean compile=CompileInstrumentedFiles.compile("51", "mocktool",modList, oracleMedInstruList,
				outputRootdPath);
		assertTrue(compile);
		
	}

}
