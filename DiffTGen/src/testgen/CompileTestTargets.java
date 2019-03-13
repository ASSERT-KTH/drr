package testgen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import interfaces.CompilingInterface;
import util.CommandExecutor;

public class CompileTestTargets implements CompilingInterface {
	
	private static String tmpBuildClassesPath;
	private static String projectRootPath;

	public static boolean compile(List<Modification> modList, List<MethodToBeInstrumented> oracleMedInstruList,
			String outputPath) {

		String testid = Global.testID;
		projectRootPath = outputPath + "/" + testid;
		File projectDir = new File(projectRootPath);

		String targetPath = projectRootPath + "/target";
		String targetBuildClassesPath = targetPath + "/build";
		tmpBuildClassesPath = targetPath + "/build/tmp";

		File targetBuildDir = new File(targetPath + "/build");
		if (!targetBuildDir.exists()) {
			targetBuildDir.mkdir();
			new File(targetBuildClassesPath).mkdir();
			new File(tmpBuildClassesPath).mkdir();
		}
		String compilepath = new CompileTestTargets().getCompilePath(projectRootPath);
		CompileResult compileResult = CompileExecutor.compile(projectDir, compilepath, targetPath,
				tmpBuildClassesPath);
		validateResult(compileResult);
		copyDependency(targetBuildClassesPath, projectRootPath);
		updateDependency(targetBuildClassesPath);

		return true;
	}

	private static void updateDependency(String targetBuildClassesPath) {
		System.out.print("tmpBuildClassesPath "+tmpBuildClassesPath);
		System.out.print("targetBuildClassesPath "+targetBuildClassesPath);
		String[] dependUpdateCmd = new String[] { "cp", "-rf", tmpBuildClassesPath+"/", targetBuildClassesPath+"/classes" };
		int updateDependencyResult = CommandExecutor.execute(dependUpdateCmd, new File(projectRootPath), null);		
		validateIntResult(updateDependencyResult, dependUpdateCmd);
	}

	public static void copyDependency(String targetBuildClassesPath, String projectRootPath) {
		// Create a dependency jar file with target files updated (this is later used by
		// the test generator)
		String[] copyCmds = new String[] { "cp", "-rf", Global.dependjpath, targetBuildClassesPath };
		int cpResult = CommandExecutor.execute(copyCmds, new File(projectRootPath), null);
		validateIntResult(cpResult, copyCmds);

	}

	private static void validateIntResult(int cpResult, String[] copyCmds) {
		if (cpResult != 0) {
			System.err.println("Failed Copying the Dependency Jar File.");
			for (String cpCmd : copyCmds) {
				System.err.print(cpCmd + " ");
			}
			System.err.println();
			throw new RuntimeException(copyCmds + ": failed copying dependency!");
		}

	}

	private static void validateResult(CompileResult compileResult) {
		if (compileResult.getExitValue() != 0) {
			System.err.println("Failed Compiling Target Program Files.");
			String[] compileCmds = compileResult.getCompileCommands();
			for (String compileCmd : compileCmds) {
				System.err.print(compileCmd + " ");
			}
			System.err.println();
			throw new RuntimeException(compileCmds + ": fail to be compiled!");
		}

	}

	@Override
	public String getCompilePath(String projectRootPath) {
		String libdpath = Global.difftgendpath + "/lib";
		String compilepath = ":" + Global.dependjpath + ":" + libdpath + "/myprinter.jar:" + libdpath
				+ "/commons-lang3-3.5.jar:" + libdpath + "/junit-4.11.jar:" + libdpath + "/evosuite-1.0.2.jar:"
				+ libdpath + "/servlet.jar";
		return compilepath;
	}


}
