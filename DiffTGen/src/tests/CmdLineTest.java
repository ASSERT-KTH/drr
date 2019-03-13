package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.cli.CommandLine;
import org.junit.Test;

import CommandLine.CmdLineCheck;
import CommandLine.CmdParse;

public class CmdLineTest {
	
	@Test
	public void paramParseSucc() {
		String cmdString = "run.py -bugid bug1 -repairtool repairtool";
		String[] cmdlist = cmdString.split(" ");
		CommandLine 	cmdLine = CmdParse.cmdParse(cmdlist);
		assert(cmdLine.hasOption("bugid"));
		assertEquals("bug1",cmdLine.getOptionValue("bugid"));
	}
	
	@Test
	public void checkEmptyParams() {
	try {
		String cmdString = "run.py -bugid bug1 -repairtool repairtool";
		String[] cmdlist = cmdString.split(" ");
		CommandLine 	cmdLine = CmdParse.cmdParse(cmdlist);
		CmdLineCheck.verifyEmpty(cmdLine);
	}catch(Exception ex){
        assertTrue(ex instanceof RuntimeException);
        assertTrue(ex.getMessage().contains(" is Mandatory!"));
	}
   }
	
	@Test
	public void checkEmptyParamsSucc() {
	try {
		String cmdString = "run.py -bugid bug1 -repairtool repairtool -difftgendpath difftgendpath -scriptrootdpath scriptrootdpath -d4jprojdpath d4jprojdpath -evosuitejpath evosuitejpath";
		String[] cmdlist = cmdString.split(" ");
		CommandLine 	cmdLine = CmdParse.cmdParse(cmdlist);
		CmdLineCheck.verifyEmpty(cmdLine);
	}catch(Exception ex){
        fail("No exception should be thrown.");
	}
   }
	

}
