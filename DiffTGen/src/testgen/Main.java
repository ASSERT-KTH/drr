package testgen;

import util.*;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;

import CommandLine.CmdLineCheck;
import CommandLine.CmdParse;
import org.apache.commons.cli.CommandLine;


public class Main
{
	public static String projectRootPath;
   
    public static void main(String[] args) {

    	/**
    	 * parse the args to command line object
    	 */
    	CommandLine 	cmd_line = CmdParse.cmdParse(args);
	if (cmd_line == null) { 
		return; 
	}
	/**
	 * validate the parameters
	 */
	CmdLineCheck.verifyEmpty(cmd_line);
	
	Global.bugid = cmd_line.getOptionValue("bugid");
	String bugid = Global.bugid;
    Global.repairtool = cmd_line.getOptionValue("repairtool");;
    String repairtool = Global.repairtool;
    Global.difftgendpath = cmd_line.getOptionValue("difftgendpath");
    Global.evosuitejpath = cmd_line.getOptionValue("evosuitejpath");
    Global.inputfpath = cmd_line.getOptionValue("inputfpath");
    String inputfpath=Global.inputfpath;
    Global.outputdpath = cmd_line.getOptionValue("outputdpath");
    String outputdpath=Global.outputdpath;
    Global.dependjpath = cmd_line.getOptionValue("dependjpath");
    Global.oracleinputfpath = cmd_line.getOptionValue("oracleinputfpath");
    String oracleinputfpath = Global.oracleinputfpath;   
    int trials = Global.evosuitetrials;
    int timeout = Global.evosuitetimeout;
    Global.testID = bugid + "_" + repairtool.toLowerCase();
    projectRootPath=outputdpath + "/" + Global.testID;

	/**
	 * Read content from inputfpath and oracleinputfpath.
	 */
	List<String> inputDeltas = ReadInputs.readLine(inputfpath);
	List<String> oracles = ReadInputs.readLine(oracleinputfpath);
	

	List<Modification> modList = SynDeltaParser.parse(inputDeltas);
	List<MethodToBeInstrumented> oracleMedInstruList = OracleParser.parse(oracles);
	if (modList != null && !modList.isEmpty() &&
	    oracleMedInstruList != null && !oracleMedInstruList.isEmpty()) {
	    Main m = new Main();
	    m.testgen(bugid, repairtool, modList, oracleMedInstruList, trials, timeout, outputdpath);
	}
    }

   
    
    
    public void testgen(String bugid, String repair_tool, List<Modification> modList,
			List<MethodToBeInstrumented> oracleMedInstruList,
			int trials, int timeout, String outputPath) {

	Timer timer = Global.timer;
	timer.start();

	System.out.println("Initializing...");
	boolean status0 = InitialParams.init(bugid, repair_tool, modList, oracleMedInstruList, trials, timeout, outputPath);
	ValidateState.validate(status0, "Initialization");

	System.out.println("Creating Instrumented Files...");
	boolean status1 = CreateInstrumentedFiles.createInstrumentedFiles(bugid, repair_tool, modList, oracleMedInstruList, outputPath);
	ValidateState.validate(status1, "Creating Instrumented Files");

	System.out.println("Compiling Instrumented Files...");	
	boolean status2 = CompileInstrumentedFiles.compile(bugid, repair_tool, modList, oracleMedInstruList, outputPath);
	ValidateState.validate(status2, "Compiling Instrumented Files");

	System.out.println("Creating Test Target(s)...");
	List<TestTarget> testTargetList = CreateTestTargets.create(modList,outputPath);
	System.out.println("Creating Test Target(s) Done.");
		
	System.out.println("Compiling Test Target(s)...");
	boolean status3 = CompileTestTargets.compile(modList, oracleMedInstruList, outputPath);
	ValidateState.validate(status3, "Compiling Test Target(s)");

	System.out.println("Generating Test Case(s)...");
	AutomaticTestsGeneration.generateTest(timer, testTargetList, projectRootPath);
	System.out.println("Generating Test Case(s) Done");
	
	System.out.println("Compiling Test Case(s)...");
	boolean status4 = CompileTestCase.compile(projectRootPath);
	ValidateState.validate(status4, "Compiling Test Case(s)");
	
    }
}
