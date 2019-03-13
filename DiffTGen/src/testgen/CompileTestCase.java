package testgen;

import java.io.File;

import interfaces.CompilingInterface;

public class CompileTestCase implements CompilingInterface {
	
	private static String difftgendpath= Global.difftgendpath;
	private static String dependjpath= Global.dependjpath;

	public static boolean compile(String projectRootPath) {

		String compilepath = new CompileTestCase().getCompilePath(projectRootPath);
		String tc_dpath = projectRootPath+"/testcase";
		String tc_build_dpath = tc_dpath+"/build";
		String tc_build_classes_dpath = tc_build_dpath+"/classes";
		File tc_dir = new File(tc_dpath);
		File tc_build_dir = new File(tc_build_dpath);
		File tc_build_classes_dir = new File(tc_build_classes_dpath);
		if (!tc_build_dir.exists()) { tc_build_dir.mkdir(); }
		if (!tc_build_classes_dir.exists()) { tc_build_classes_dir.mkdir(); }

		CompileResult comp_rslt = CompileExecutor.compile(tc_dir, compilepath, tc_dpath, tc_build_classes_dpath);
		if (comp_rslt.getExitValue() != 0) {
		    System.err.println("Failed Compiling the Test Cases.");
		    String[] comp_cmds = comp_rslt.getCompileCommands();
		    for (String comp_cmd : comp_cmds) {
			System.err.print(comp_cmd + " ");
		    }
		    System.err.println();
		    return false;
		}

		return true;
	    }

	@Override
	public String getCompilePath(String projectRootPath) {
		String libdpath = difftgendpath + "/lib";
		String compilepath =
		    ":"+projectRootPath+"/bug/instru1/build/classes:" //Instrumented Files First
		    +dependjpath+":"
		    +libdpath+"/myprinter.jar:"
		    +libdpath+"/commons-lang3-3.5.jar:"
		    +libdpath+"/junit-4.11.jar:"
		    +libdpath+"/evosuite-1.0.2.jar:"
		    +libdpath+"/servlet.jar";
		
		return compilepath;
	}
}
