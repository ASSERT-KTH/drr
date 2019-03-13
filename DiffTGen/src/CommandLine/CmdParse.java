package CommandLine;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CmdParse {
	 private static Options options;
	 
	 static {
			options = new Options();
			options.addOption("bugid", true, "Bug ID");
			options.addOption("repairtool", true, "Repair Tool");
			options.addOption("difftgendpath", true, "DiffTGen directory");
			options.addOption("scriptrootdpath", true, "Script root directory");
			options.addOption("d4jprojdpath", true, "Defects4J project directory");
			options.addOption("evosuitejpath", true, "EvoSuite jar file path");
			options.addOption("dependjpath", true, "Dependency jar file path");
			options.addOption("outputdpath", true, "Output Directory");
			options.addOption("inputfpath", true, "Input File Containing Syntactic Deltas");
			options.addOption("oracleinputfpath", true, "Oracle Input File Containing Oracle Methods to be Instrumented");
			options.addOption("evosuitetrials", true, "# of EvoSuite Trials");
			options.addOption("evosuitetimeout", true, "EvoSuite Running Timeout in Seconds");
			options.addOption("forcecompile", false, "Force to compile all files");
			options.addOption("runparallel", false, "Run in parallel");
			options.addOption("simpletarget", false, "Use simple target");
			options.addOption("stopifoverfittingfound", false, "Stop running when an overfitting-indicative test case is found");
			options.addOption("runevosuite", false, "Run EvoSuite to generate test inputs");
		    }

	public static CommandLine cmdParse(String[] cmdStr) {
		CommandLineParser clparser = new DefaultParser();
		CommandLine cmdLine = null;
		try { 
			cmdLine = clparser.parse(options, cmdStr); 
		}catch (ParseException exp) {
		    System.err.println("CommandLine Parsing Failed: " + exp);
		}
		return cmdLine;
	}
}
