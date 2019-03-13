package testgen;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class InitialParams {

	public static boolean init(String bugid, String repairTool, List<Modification> modList,
			List<MethodToBeInstrumented> oracleMedInstruList, int trials, int timeout, String outputRootdPath) {

		String testID = bugid + "_" + repairTool.toLowerCase();

		File outputRootDir = new File(outputRootdPath);
		if (!outputRootDir.exists()) {
			outputRootDir.mkdir();
		}
		String output_dpath = outputRootdPath + "/" + testID;
		File output_dir = new File(output_dpath);
		if (!output_dir.exists()) {
			output_dir.mkdir();
		}
		File output_bug_dir = new File(output_dpath + "/bug");
		File output_patch_dir = new File(output_dpath + "/patch");
		File output_fix_dir = new File(output_dpath + "/fix");
		File output_target_dir = new File(output_dpath + "/target");
		File output_test_dir = new File(output_dpath + "/test");
		File output_testcase_dir = new File(output_dpath + "/testcase");
		if (!output_bug_dir.exists()) {
			output_bug_dir.mkdir();
		}
		if (!output_patch_dir.exists()) {
			output_patch_dir.mkdir();
		}
		if (!output_fix_dir.exists()) {
			output_fix_dir.mkdir();
		}
		if (!output_target_dir.exists()) {
			output_target_dir.mkdir();
		}
		if (!output_test_dir.exists()) {
			output_test_dir.mkdir();
		}
		if (!output_testcase_dir.exists()) {
			output_testcase_dir.mkdir();
		}

		// Copy change-related files to bug, patch & fix directories
		Set<String> copied_set = new HashSet<String>();
		for (Modification mod : modList) {
			String fppath = mod.getFPPath();
			if (fppath == null) {
				fppath = mod.getInsertDummyPath();
			}
			if (fppath == null) {
				continue;
			}
			if (!copied_set.contains(fppath)) { // Don't copy twice
				try {
					FileUtils.copyFileToDirectory(new File(fppath), output_bug_dir);
					copied_set.add(fppath);
				} catch (Throwable t) {
					System.err.println("Failed copying the file: " + fppath);
					t.printStackTrace();
					System.err.println(t);
					return false;
				}
			}

			String pppath = mod.getPPPath();
			if (pppath == null) {
				pppath = mod.getDelDummyPath();
			}
			if (pppath == null) {
				continue;
			}
			if (!copied_set.contains(pppath)) { // Don't copy twice
				try {
					FileUtils.copyFileToDirectory(new File(pppath), output_patch_dir);
					copied_set.add(pppath);
				} catch (Throwable t) {
					System.err.println("Failed copying the file: " + pppath);
					t.printStackTrace();
					System.err.println(t);
					return false;
				}
			}
		}

		for (MethodToBeInstrumented oracle_med_instru : oracleMedInstruList) {
			String cppath = oracle_med_instru.getFilePath();
			if (cppath == null) {
				continue;
			}
			if (!copied_set.contains(cppath)) {
				try {
					FileUtils.copyFileToDirectory(new File(cppath), output_fix_dir);
					copied_set.add(cppath);
				} catch (Throwable t) {
					System.err.println("Failed copying the file: " + cppath);
					t.printStackTrace();
					System.err.println(t);
					return false;
				}
			}
		}
		return true;
	}

}
