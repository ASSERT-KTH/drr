package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import util.*;


public class TestCaseGeneratorTrial implements Callable<List<TestCase>>
{
    String targetid, trialid, proj_dpath;
    TestTarget target;
    int timeout;
    TestClassGenerator tcgen;
    boolean overfitting_break, run_evosuite;
    String tclass_compilepath;
    String difftgendpath;
    String dependjpath, evosuitejpath;


    public TestCaseGeneratorTrial(String targetid, String trialid, TestTarget target, String proj_dpath, int timeout, boolean overfitting_break, boolean run_evosuite, String difftgendpath, String dependjpath) {
	this.targetid = targetid;
	this.trialid = trialid;
	this.proj_dpath = proj_dpath;
	this.target = target;
	this.timeout = timeout;
	this.tcgen = new TestClassGenerator();
	this.overfitting_break = overfitting_break;
	this.run_evosuite = run_evosuite;
	this.difftgendpath = difftgendpath;
	this.dependjpath = dependjpath;

	String libdpath = difftgendpath + "/lib";
	tclass_compilepath = ":"+proj_dpath+"/bug/instru0/build/classes:"
	    +dependjpath+":"
	    +libdpath+"/myprinter.jar:"
	    +libdpath+"/commons-lang3-3.5.jar:"
	    +libdpath+"/junit-4.11.jar:"
	    +libdpath+"/evosuite-1.0.2.jar:"
	    +libdpath+"/servlet.jar";

	this.evosuitejpath = libdpath+"/evosuite-1.0.2.jar";
    }


    @Override public List<TestCase> call() {
	List<TestCase> tc_list = new ArrayList<TestCase>();
	System.err.println("*** Running Target "+targetid+" Trial "+trialid+" ***");
	System.err.println();
	
	String rslt_tc_ctnt = null;
	String target_dpath = proj_dpath + "/target";
	boolean regression_found = false;
	boolean repair_found = false;
	boolean defective_found = false;
	String project_cp = //As EvoSuite running argument
	    target_dpath+"/build/classes:"+
	    difftgendpath+"/lib/myprinter.jar:"+
	    difftgendpath+"/lib/commons-lang3-3.5.jar";
	    
	//Generate a test class covering the goals
	TestClass tclass = tcgen.generateTestClass(target_dpath, targetid, trialid, project_cp, target, run_evosuite, evosuitejpath, timeout);
	
	if (tclass == null) {
	    System.err.println("Target "+targetid+" Trial "+trialid+": Failed Generating a Test Class.");
	    System.err.println("*** Target "+targetid+" Trial "+trialid+" finished ***");
	    return tc_list;
	}
	if (tclass.isChangeExercised()) {
	    System.err.println("Target "+targetid+" Trial "+trialid+": Change Exercised!");
	}
	else {
	    System.err.println("Target "+targetid+" Trial "+trialid+": No Change Exercised!");
	    System.err.println("*** Target "+targetid+" Trial " + trialid + " finished ***");
	    return tc_list;
	}

	String tclass_package_name = tclass.getPackageName();
	String tclass_name = tclass.getClassName();
	String tclass_full_name = tclass_package_name+"."+tclass_name;
	String tclass_ctnt = tclass.getClassContent();

	//Write the test class to file
	String tclass_dpath = proj_dpath+"/test/"+targetid+"/"+trialid;
	File tclass_dir = new File(tclass_dpath);
	if (!tclass_dir.exists()) { tclass_dir.mkdirs(); }
	String tclass_fpath = tclass_dpath+"/"+tclass_name+".java";
	File tclass_f = new File(tclass_fpath);
	try { FileUtils.writeStringToFile(tclass_f, tclass_ctnt, (String) null);}
	catch (Throwable t) { System.err.println(t); t.printStackTrace(); }

	String tclass_buildpath = tclass_dpath+"/build";
	String tclass_build_classes_dpath = tclass_buildpath+"/classes";
	File tclass_build_classes_dir = new File(tclass_build_classes_dpath);
	if (!tclass_build_classes_dir.exists()) { tclass_build_classes_dir.mkdirs(); }

	CompileResult tclass_compile_rslt = CompileExecutor.compile(tclass_dir, tclass_compilepath, tclass_dpath, tclass_build_classes_dpath);
	if (tclass_compile_rslt.getExitValue() != 0) {
	    System.err.println("Target "+targetid+" Trial "+trialid+": Test Class Compilation Failure.");
	    String[] compile_cmds = tclass_compile_rslt.getCompileCommands();
	    for (String compile_cmd : compile_cmds) {
		System.err.print(compile_cmd + " ");
	    }
	    System.err.println();
	    System.err.println("*** Target "+targetid+" Trial "+trialid+" finished ***");
	    return tc_list;
	}

	System.err.println("Target "+targetid+" Trial "+trialid+" finish generating & compiling test class.");
	
	//Test fp, pp & cp against the test class
	String fp_rslt_path = proj_dpath + "/bug/test/"+targetid+"/"+trialid+"/rslt";
	String fp_rslt_dpath = proj_dpath + "/bug/test/"+targetid+"/"+trialid;
	String pp_rslt_path = proj_dpath + "/patch/test/"+targetid+"/"+trialid+"/rslt";
	String pp_rslt_dpath = proj_dpath + "/patch/test/"+targetid+"/"+trialid;
	String cp_rslt_path = proj_dpath + "/fix/test/"+targetid+"/"+trialid+"/rslt";
	String cp_rslt_dpath = proj_dpath + "/fix/test/"+targetid+"/"+trialid;

	File fp_rslt_dir = new File(fp_rslt_dpath);
	File pp_rslt_dir = new File(pp_rslt_dpath);
	File cp_rslt_dir = new File(cp_rslt_dpath);
	if (!fp_rslt_dir.exists()) { fp_rslt_dir.mkdirs(); }
	if (!pp_rslt_dir.exists()) { pp_rslt_dir.mkdirs(); }
	if (!cp_rslt_dir.exists()) { cp_rslt_dir.mkdirs(); }
	
	String[] test_fp_cmds = new String[] {
	    "ant", "-f", difftgendpath+"/tclassrunner.xml",
	    "-Dtclass_full_name="+tclass_full_name,
	    "-Dinstru_build_dir="+proj_dpath+"/bug/instru0/build/classes",
	    "-Dtclass_build_dir="+tclass_build_classes_dpath,
	    "-Ddependjpath="+dependjpath,
	    "-Ddifftgendir="+difftgendpath, "run-tclass" };

	int test_fp_exit_val = CommandExecutor.execute(test_fp_cmds, fp_rslt_dir, new File(fp_rslt_path));

	String[] test_pp_cmds = new String[] {
	    "ant", "-f", difftgendpath+"/tclassrunner.xml",
	    "-Dtclass_full_name="+tclass_full_name,
	    "-Dinstru_build_dir="+proj_dpath+"/patch/instru0/build/classes",
	    "-Dtclass_build_dir="+tclass_build_classes_dpath,
	    "-Ddependjpath="+dependjpath,
	    "-Ddifftgendir="+difftgendpath, "run-tclass" };
	
	int test_pp_exit_val = CommandExecutor.execute(test_pp_cmds, pp_rslt_dir, new File(pp_rslt_path));
	
	String[] test_cp_cmds = new String[] {
	    "ant", "-f", difftgendpath+"/tclassrunner.xml",
	    "-Dtclass_full_name="+tclass_full_name,
	    "-Dinstru_build_dir="+proj_dpath+"/fix/instru0/build/classes",
	    "-Dtclass_build_dir="+tclass_build_classes_dpath,
	    "-Ddependjpath="+dependjpath,
	    "-Ddifftgendir="+difftgendpath, "run-tclass" };
	    
	System.err.println("Target "+targetid+" Trial "+trialid+" finish running bug & patch against the test method.");
	
	int test_cp_exit_val = OracleRunner.writeResultWithDeprecatedValues(cp_rslt_dpath, test_cp_cmds);
	if (test_cp_exit_val != 0) {
	    System.err.println("Target "+targetid+" Trial "+trialid+": Oracle Result is NOT available.");
	    System.err.println("*** Target "+targetid+" Trial " + trialid + " finished ***");
	    return tc_list;
	}

	System.err.println("Target "+targetid+" Trial "+trialid+" finish writing oracle results.");
	
	File fp_rslt_f = new File(fp_rslt_path);
	File pp_rslt_f = new File(pp_rslt_path);
	File cp_rslt_f = new File(cp_rslt_path);
	List<TestResult> fp_tr_list = readResultFile(fp_rslt_f);
	List<TestResult> pp_tr_list = readResultFile(pp_rslt_f);
	List<TestResult> cp_tr_list = readResultFile(cp_rslt_f);
	int fp_tr_list_size = fp_tr_list.size();
	int pp_tr_list_size = pp_tr_list.size();
	int cp_tr_list_size = cp_tr_list.size();

	int tr_size = (fp_tr_list_size <= pp_tr_list_size) ? fp_tr_list_size : pp_tr_list_size;
	boolean diff_semantics_found = false;
	ExpectedItem regression_ei = null;
	ExpectedItem repair_ei = null;
	ExpectedItem defective_ei = null;
	
	for (int j=0; j<tr_size; j++) {
	    TestResult fp_tr = fp_tr_list.get(j);
	    TestResult pp_tr = pp_tr_list.get(j);
	    String fp_tr_mname = fp_tr.getMethodName();
	    String pp_tr_mname = pp_tr.getMethodName();
	    if (fp_tr_mname.equals(pp_tr_mname)) {
		String fp_tr_ctnt = fp_tr.getResultContent().trim();
		String pp_tr_ctnt = pp_tr.getResultContent().trim();
		System.err.println("Target "+targetid+" Trial "+trialid+" Checking Running Results from Test Method: "+fp_tr_mname);

		if (!fp_tr_ctnt.equals(pp_tr_ctnt)) {
		    diff_semantics_found = true;
		    System.err.println("Target "+targetid+" Trial "+trialid+": Semantic Difference Found!");
		    TestResult cp_tr = cp_tr_list.get(j);
		    String cp_tr_mname = cp_tr.getMethodName();
		    if (fp_tr_mname.equals(cp_tr_mname)) {
			String cp_tr_ctnt = cp_tr.getResultContent().trim();
			ExpectedItem ei0 = getExpectedItem(fp_tr_mname, fp_tr_ctnt, pp_tr_ctnt, cp_tr_ctnt);
			if (ei0 == null) { //Give up this test method
			    continue;
			} 

			int ei0_prop = ei0.getProperty();
			if (ei0_prop == 0) {
			    regression_found = true;
			    if (regression_ei == null) { regression_ei = ei0; }
			    System.err.println("Target "+targetid+" Trial "+trialid+": Regression Test Found!");
			    if (overfitting_break) { break; }
			}
			else if (ei0_prop == 1) {
			    repair_found = true;
			    if (repair_ei == null) { repair_ei = ei0; }
			    System.err.println("Target "+targetid+" Trial "+trialid+": Repair Test Found!");
			}
			else if (ei0_prop == 2) {
			    defective_found = true;
			    if (defective_ei == null) { defective_ei = ei0; }
			    System.err.println("Target "+targetid+" Trial "+trialid+": Both-incorrect Test Found!");
			    if (overfitting_break) { break; }
			}
		    }
		    else {
			System.err.println("Target "+targetid+" Trial "+trialid+": Inconsistent Test Methods between FP & CP");
		    }
		}
		else {
		    System.err.println("Target "+targetid+" Trial "+trialid+": Identical Running Results.");
		}
	    }
	    else {
		System.err.println("Target "+targetid+" Trial "+trialid+": Inconsistent Test Methods between FP & PP!");
	    }

	    if (regression_ei!=null && repair_ei!=null && defective_ei!=null) {
		break;
	    }
	}

	System.err.println("Target "+targetid+" Trial "+trialid+" finish Checking Running Results.");
	
	if (!diff_semantics_found) {
	    System.err.println("Target "+targetid+" Trial "+trialid+": No Different Semantics Found.");
	    System.err.println("*** Target "+targetid+" Trial " + trialid + " finished ***");
	    return tc_list;
	}
	else {
	    TestCaseGenerator0 tcgen0 = new TestCaseGenerator0();
	    if (regression_ei != null) {
		rslt_tc_ctnt = tcgen0.createTestCaseClass(tclass, regression_ei);
		String tc_full_name = tclass_package_name+".DiffTGen"+regression_ei.getProperty()+"Test";
		tc_list.add(new TestCase(regression_ei.getProperty(), tc_full_name, rslt_tc_ctnt));
	    }
	    if (repair_ei != null) {
		rslt_tc_ctnt = tcgen0.createTestCaseClass(tclass, repair_ei);
		String tc_full_name = tclass_package_name+".DiffTGen"+repair_ei.getProperty()+"Test";
		tc_list.add(new TestCase(repair_ei.getProperty(), tc_full_name, rslt_tc_ctnt));		
	    }
	    if (defective_ei != null) {
		rslt_tc_ctnt = tcgen0.createTestCaseClass(tclass, defective_ei);
		String tc_full_name = tclass_package_name+".DiffTGen"+defective_ei.getProperty()+"Test";
		tc_list.add(new TestCase(defective_ei.getProperty(), tc_full_name, rslt_tc_ctnt));
	    }
	    
	    if (regression_ei==null && repair_ei==null && defective_ei==null) {
		System.err.println("Target "+targetid+" Trial "+trialid+" Failed to produce a test case.");
	    }

	    System.err.println("*** Target "+targetid+" Trial " + trialid + " finished ***");
	    return tc_list;
	}	
    }

    private List<TestResult> readResultFile(File rslt_f) {

	List<TestResult> tr_list = new ArrayList<TestResult>();
	
	List<String> rslt_lines = null;
	try { rslt_lines = FileUtils.readLines(rslt_f, (String) null); }
	catch (Throwable t) { System.err.println(t); t.printStackTrace(); }
	if (rslt_lines == null) { return tr_list; }

	int start=-1, end=-1;
	int size = rslt_lines.size();
	for (int i=0; i<size; i++) {
	    String rslt_line = rslt_lines.get(i).trim();
	    if ("run-tclass:".equals(rslt_line)) {
		start = i+1;
		break;
	    }
	}
	for (int j=size-1; j>=0; j--) {
	    String rslt_line = rslt_lines.get(j).trim();
	    if ("BUILD SUCCESSFUL".equals(rslt_line) ||
		"BUILD FAILED".equals(rslt_line)) {
		end = j-1;
		break;
	    }
	}
	if (start==-1 || end==-1) { return tr_list; }

	String curr_tm_name = null;
	StringBuilder curr_output_sb = new StringBuilder();
	for (int i=start; i<=end; i++) {
	    String rslt_line = rslt_lines.get(i).trim();
	    if (rslt_line.startsWith("[java] ")) {
		rslt_line = rslt_line.substring(7); //rm [java]
	    } 
	    else {
		rslt_line = "";
	    }
	    
	    if (rslt_line.startsWith("Test Method:")) {
		curr_tm_name = rslt_line.substring(13);
	    }
	    else if (rslt_line.equals("<ssssss>")) { //The Test Method Separator
		TestResult tr = new TestResult(curr_tm_name, curr_output_sb.toString().trim());
		tr_list.add(tr);
		curr_tm_name = null;
		curr_output_sb = new StringBuilder();
	    }
	    else {
		curr_output_sb.append(rslt_line);
		curr_output_sb.append("\n");
	    }
	}
	if (curr_tm_name != null) {
	    TestResult tr = new TestResult(curr_tm_name, curr_output_sb.toString().trim());
	    tr_list.add(tr);
	}
	
	return tr_list;
    }


    private ExpectedItem getExpectedItem(String tm_name, String fp_ctnt, String pp_ctnt, String cp_ctnt) {

	String[] fp_lines = fp_ctnt.split("\n");
	String[] pp_lines = pp_ctnt.split("\n");
	String[] cp_lines = cp_ctnt.split("\n");
	int fp_lines_size = fp_lines.length;
	int pp_lines_size = pp_lines.length;
	int cp_lines_size = cp_lines.length;

	boolean determined_value_changed = false;
	for (int i=0; i<cp_lines_size; i++) {
	    String cp_line = cp_lines[i];
	    if (cp_line.startsWith("VALUE:")) {
		boolean comparable0 = false;
		if (i<fp_lines_size && i<pp_lines_size) {
		    String fp_line = fp_lines[i];
		    String pp_line = pp_lines[i];
		    if (fp_line.startsWith("VALUE:") && pp_line.startsWith("VALUE:")) {
			comparable0 = true;
		    }
		    else {
			System.err.println("Either FP Line or PP Line is NOT a VALUE Line.");
			System.err.println("CP Line (#"+i+"): " + cp_line);
			System.err.println("FP Line (#"+i+"): " + fp_line);
			System.err.println("PP Line (#"+i+"): " + pp_line);
		    }
		}
		else {
		    System.err.println("Either FP Line (#"+i+") or PP Line (#"+i+") is NOT available.");
		}
		if (!comparable0) { //Give up producing an expected item
		    return null;
		} 

		boolean comparable1 = false;
		String cp_prim_loc = cp_lines[i-2];
		String fp_prim_loc =
		    ((0<=i-2) && (i-2<fp_lines_size)) ? fp_lines[i-2] : "";
		String pp_prim_loc =
		    ((0<=i-2) && (i-2<pp_lines_size)) ? pp_lines[i-2] : "";
		if (cp_prim_loc.equals(fp_prim_loc) &&
		    cp_prim_loc.equals(pp_prim_loc)) {
		    comparable1 = true;
		}
		if (!comparable1) { //Give up producing an expected item
		    System.err.println("Non-comparable VALUE Lines.");
		    System.err.println("CP Line (#"+i+"): " + cp_line);
		    System.err.println("CP PRIM_LOC Line (#"+(i-2)+"): " + cp_prim_loc);
		    System.err.println("FP PRIM_LOC Line (#"+(i-2)+"): " + fp_prim_loc);
		    System.err.println("PP PRIM_LOC Line (#"+(i-2)+"): " + pp_prim_loc);
		    return null;
		} 
		
		String fp_line = fp_lines[i];
		String pp_line = pp_lines[i];
		boolean cp_equals_fp = cp_line.equals(fp_line);
		boolean cp_equals_pp = cp_line.equals(pp_line);
		if (cp_equals_fp && cp_equals_pp) {
		    continue; //Keep looking for other comparable values
		}

		determined_value_changed = true;
		String asserted_prim_loc =
		    cp_prim_loc.substring(new String("PRIM_LOC:").length());
		String expected_type =
		    cp_lines[i-1].substring(new String("TYPE:").length());
		String expected_value =
		    cp_lines[i].substring(new String("VALUE:").length());

		ExpectedItem ei = new ExpectedItem(tm_name, asserted_prim_loc, expected_type, expected_value, "Throwable".equals(expected_type));

		if (cp_equals_fp && !cp_equals_pp) {
		    ei.setProperty(0); //Regression
		}
		else if (!cp_equals_fp && cp_equals_pp) {
		    ei.setProperty(1); //Repair
		}
		else if (!cp_equals_fp && !cp_equals_pp) {
		    ei.setProperty(2); //Defective
		}

		return ei;
	    }
	}

	if (!determined_value_changed) {
	    System.err.println("No Determined Value Changed For " + tm_name + "!");
	}

	return null;
    }
    
}
