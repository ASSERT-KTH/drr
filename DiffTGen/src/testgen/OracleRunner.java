package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import util.*;

public class OracleRunner
{
    public static int writeResultWithDeprecatedValues(String rslt_dpath, String[] test_cmds) {
	String rslt_path = rslt_dpath + "/rslt";
	String rslt_path_a = rslt_path + "_a";
	String rslt_path_b = rslt_path + "_b";
	File rslt_dir = new File(rslt_dpath);
	File rslt_fa = new File(rslt_path_a);
	File rslt_fb = new File(rslt_path_b);
	int ev0 = CommandExecutor.execute(test_cmds, rslt_dir, rslt_fa);
	int ev1 = CommandExecutor.execute(test_cmds, rslt_dir, rslt_fb);
	if (ev0 != 0 || ev1 != 0) { return -1; }

	List<String> rslt_lines_a = null;
	List<String> rslt_lines_b = null;
	try {
	    rslt_lines_a = FileUtils.readLines(rslt_fa, (String) null);
	    rslt_lines_b = FileUtils.readLines(rslt_fb, (String) null);
	}
	catch (Throwable t) {
	    t.printStackTrace();
	    System.err.println(t);
	}
	if (rslt_lines_a == null || rslt_lines_b == null) {
	    return -1;
	}

	int size_a = rslt_lines_a.size();
	int size_b = rslt_lines_b.size();
	if (size_a != size_b) {
	    System.err.println("Result Files are Different in Line Numbers!");
	    return -1;
	}

	for (int i=0; i<size_a; i++) {
	    String rslt_line_a = rslt_lines_a.get(i);
	    String rslt_line_a_trimmed = rslt_line_a.trim();
	    if (rslt_line_a_trimmed.startsWith("[java] VALUE:")) {
		String rslt_line_b_trimmed = rslt_lines_b.get(i).trim();
		if (!rslt_line_a_trimmed.equals(rslt_line_b_trimmed)) {
		    //Random Value Found!
		    String rslt_line_a0 = rslt_line_a.replace("[java] VALUE:", "[java] DEPRECATED-VALUE:");
		    rslt_lines_a.set(i, rslt_line_a0);
		}
	    }
	}

	File rslt_f = new File(rslt_path);
	boolean write_success = true;
	try {
	    FileUtils.writeLines(rslt_f, (String)null, rslt_lines_a);
	}
	catch (Throwable t) {
	    t.printStackTrace();
	    System.err.println(t);
	    write_success = false;
	}

	if (!write_success) { return -1; }
	else { return 0; }
    }
}
