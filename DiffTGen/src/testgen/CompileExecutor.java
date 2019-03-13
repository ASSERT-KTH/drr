package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import util.*;

public class CompileExecutor
{
    /* Note, it only compile java files right under the src directory "srcdpath". */
    public static CompileResult compile(File running_dir, String compilepath, String srcdpath, String desdpath) {
	File jfiles_dir = new File(srcdpath);
	List<String> compile_cmds_list = new ArrayList<String>();
	compile_cmds_list.add("javac");
	compile_cmds_list.add("-cp");
	compile_cmds_list.add(compilepath);
	compile_cmds_list.add("-d");
	compile_cmds_list.add(desdpath);
	File[] jfiles = jfiles_dir.listFiles();
	for (File jfile : jfiles) {
	    if (jfile.isFile()) {
		String jfile_name = jfile.getName();
		if (jfile_name.endsWith(".java")) {
		    compile_cmds_list.add(srcdpath+"/"+jfile_name);
		}
	    }
	}

	String[] compile_cmds = compile_cmds_list.toArray(new String[0]);
	int compile_exit_val = CommandExecutor.execute(compile_cmds, running_dir);
	return new CompileResult(compile_exit_val, compile_cmds);
    }
}
