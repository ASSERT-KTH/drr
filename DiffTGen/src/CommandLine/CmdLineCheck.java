package CommandLine;

import org.apache.commons.cli.CommandLine;

import testgen.Global;

public class CmdLineCheck {
	
	public static void verifyEmpty(CommandLine cmd){
		String params ="bugid,repairtool,difftgendpath,evosuitejpath";
		String[] paramsList = params.split(",");
		for(int i=0;i<paramsList.length;i++) {			
				if(cmd.hasOption(paramsList[i])) {
				System.out.println(paramsList[i]+" : "+ cmd.getOptionValue(paramsList[i]));
				} else {
					throw new RuntimeException(paramsList[i]+" is Mandatory!" );
				}					
	}	
}
}
