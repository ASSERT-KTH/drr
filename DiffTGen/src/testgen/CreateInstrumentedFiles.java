package testgen;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class CreateInstrumentedFiles {

	public static boolean createInstrumentedFiles(String bugid, String repairTool, List<Modification> modList,
			List<MethodToBeInstrumented> oracleMedInstruList, String outputRootdPath) {

		String testid = bugid + "_" + repairTool.toLowerCase();
		String projectPath = outputRootdPath + "/" + testid;

		/*
		 * create intrumented path with the method call/
		 */
		createInstruPath(projectPath, "instru0");
		createInstruPath(projectPath, "instru1");

		// Group the modifications by files
		Map<String, List<String>> mod_map_fp = new HashMap<String, List<String>>();
		Map<String, List<String>> mod_map_pp = new HashMap<String, List<String>>();
		Map<String, List<String>> mod_map_cp = new HashMap<String, List<String>>();
		int modList_size = modList.size();
		int oracleMedInstruList_size = oracleMedInstruList.size();
		for (int i = 0; i < modList_size; i++) {
			Modification mod = modList.get(i);
			String fppath = mod.getFPPath();
			String fploc = mod.getFPLoc();
			if (fppath == null) {
				fppath = mod.getInsertDummyPath();
			}
			if (fploc == null) {
				fploc = mod.getInsertDummyCtxtLoc();
			}
			String fpmloc = ASTHelper.getMethodLoc(fppath, fploc);
			// ===============
			// System.err.println("fpmloc in Main: " + fpmloc);
			// ===============
			List<String> fpmlocs = mod_map_fp.get(fppath);
			if (fpmlocs == null) {
				fpmlocs = new ArrayList<String>();
				mod_map_fp.put(fppath, fpmlocs);
			}
			if (!fpmlocs.contains(fpmloc)) {
				fpmlocs.add(fpmloc);
			}

			String pppath = mod.getPPPath();
			String pploc = mod.getPPLoc();
			if (pppath == null) {
				pppath = mod.getDelDummyPath();
			}
			if (pploc == null) {
				pploc = mod.getDelDummyCtxtLoc();
			}
			String ppmloc = ASTHelper.getMethodLoc(pppath, pploc);
			// ===============
			// System.err.println("ppmloc in Main: " + ppmloc);
			// ===============
			List<String> ppmlocs = mod_map_pp.get(pppath);
			if (ppmlocs == null) {
				ppmlocs = new ArrayList<String>();
				mod_map_pp.put(pppath, ppmlocs);
			}
			if (!ppmlocs.contains(ppmloc)) {
				ppmlocs.add(ppmloc);
			}
		}

		for (int i = 0; i < oracleMedInstruList_size; i++) {
			MethodToBeInstrumented med_instru = oracleMedInstruList.get(i);
			String cpmloc = med_instru.getMethodLoc();
			// if (cpmloc == null) { continue; } //This is not for instrumentation.
			// ===============
			// System.err.println("cpmloc in Main: " + cpmloc);
			// ===============
			String cppath = med_instru.getFilePath();
			List<String> cpmlocs = mod_map_cp.get(cppath);
			if (cpmlocs == null) {
				cpmlocs = new ArrayList<String>();
				mod_map_cp.put(cppath, cpmlocs);
			}
			if (cpmloc != null && !cpmlocs.contains(cpmloc)) {
				cpmlocs.add(cpmloc);
			}
		}

		ClassUnderTestInstrumentor cftg = new ClassUnderTestInstrumentor();
		Iterator mod_map_fp_it = mod_map_fp.entrySet().iterator();
		while (mod_map_fp_it.hasNext()) {
			Map.Entry<String, List<String>> entry = (Map.Entry<String, List<String>>) mod_map_fp_it.next();
			String fppath = entry.getKey();
			List<String> fpmlocs = entry.getValue();
			InstrumentedClass fp_oic = cftg.getOutputInstrumentedClass(fppath, fpmlocs);
			InstrumentedClass fp_tcic = cftg.getTestCaseInstrumentedClass(fppath, fpmlocs);
			String fp_oic_fpath = projectPath + "/bug/instru0/" + fp_oic.getClassName() + ".java";
			String fp_oic_fctnt = fp_oic.getInstrumentedClassContent();
			if (fp_oic_fctnt != null) {
				try {
					FileUtils.writeStringToFile(new File(fp_oic_fpath), fp_oic_fctnt, (String) null);
				} catch (Throwable t) {
					System.err.println(t);
					t.printStackTrace();
				}
			}

			String fp_tcic_fpath = projectPath + "/bug/instru1/" + fp_tcic.getClassName() + ".java";
			String fp_tcic_fctnt = fp_tcic.getInstrumentedClassContent();
			if (fp_tcic_fctnt != null) {
				try {
					FileUtils.writeStringToFile(new File(fp_tcic_fpath), fp_tcic_fctnt, (String) null);
				} catch (Throwable t) {
					System.err.println(t);
					t.printStackTrace();
				}
			}
		}

		Iterator mod_map_pp_it = mod_map_pp.entrySet().iterator();
		while (mod_map_pp_it.hasNext()) {
			Map.Entry<String, List<String>> entry = (Map.Entry<String, List<String>>) mod_map_pp_it.next();
			String pppath = entry.getKey();
			List<String> ppmlocs = entry.getValue();
			InstrumentedClass pp_oic = cftg.getOutputInstrumentedClass(pppath, ppmlocs);
			InstrumentedClass pp_tcic = cftg.getTestCaseInstrumentedClass(pppath, ppmlocs);
			String pp_oic_fpath = projectPath + "/patch/instru0/" + pp_oic.getClassName() + ".java";
			String pp_oic_fctnt = pp_oic.getInstrumentedClassContent();
			if (pp_oic_fctnt != null) {
				try {
					FileUtils.writeStringToFile(new File(pp_oic_fpath), pp_oic_fctnt, (String) null);
				} catch (Throwable t) {
					System.err.println(t);
					t.printStackTrace();
				}
			}

			String pp_tcic_fpath = projectPath + "/patch/instru1/" + pp_tcic.getClassName() + ".java";
			String pp_tcic_fctnt = pp_tcic.getInstrumentedClassContent();
			if (pp_tcic_fctnt != null) {
				try {
					FileUtils.writeStringToFile(new File(pp_tcic_fpath), pp_tcic_fctnt, (String) null);
				} catch (Throwable t) {
					System.err.println(t);
					t.printStackTrace();
				}
			}
		}

		Iterator mod_map_cp_it = mod_map_cp.entrySet().iterator();
		while (mod_map_cp_it.hasNext()) {
			Map.Entry<String, List<String>> entry = (Map.Entry<String, List<String>>) mod_map_cp_it.next();
			String cppath = entry.getKey();
			List<String> cpmlocs = entry.getValue();
			if (cpmlocs.isEmpty()) {
				// Note that we still copy the uninstrumented file to its instrumentation
				// directory. Later we compile all these files in the directory for running.
				try {
					FileUtils.copyFileToDirectory(new File(cppath), new File(projectPath + "/fix/instru0"));
				} catch (Throwable t) {
					System.err.println(t);
					t.printStackTrace();
				}
			} else {
				InstrumentedClass cp_oic = cftg.getOutputInstrumentedClass(cppath, cpmlocs);
				String cp_oic_fpath = projectPath + "/fix/instru0/" + cp_oic.getClassName() + ".java";
				String cp_oic_fctnt = cp_oic.getInstrumentedClassContent();
				if (cp_oic_fctnt != null) {
					try {
						FileUtils.writeStringToFile(new File(cp_oic_fpath), cp_oic_fctnt, (String) null);
					} catch (Throwable t) {
						System.err.println(t);
						t.printStackTrace();
					}
				}
			}
		}

		return true;
	}

	public static void createInstruPath(String projectPath, String instru) {
		String faultProgramInstruPath = projectPath + "/bug/" + instru;
		String patchProgramInstruPath = projectPath + "/patch/" + instru;
		String fixProgramInstruPath = projectPath + "/fix/" + instru;
		File faultProgramInstruDir = new File(faultProgramInstruPath);
		File patchProgramInstruDir = new File(patchProgramInstruPath);
		File fixProgramInstruDir = new File(fixProgramInstruPath);
		if (!faultProgramInstruDir.exists()) {
			faultProgramInstruDir.mkdir();
		}
		if (!patchProgramInstruDir.exists()) {
			patchProgramInstruDir.mkdir();
		}
		if (!fixProgramInstruDir.exists()) {
			fixProgramInstruDir.mkdir();
		}

	}

}
