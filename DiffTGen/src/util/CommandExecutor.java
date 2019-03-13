package util;

import java.io.File;

public class CommandExecutor
{
    public static int execute(String[] cmds, File exec_d) {

	return execute(cmds, exec_d, null);
    }
    
    public static int execute(String[] cmds, File exec_d, File output_f) {

	ProcessBuilder pb = new ProcessBuilder(cmds);
	pb.directory(exec_d);
	//Redirect the running output to summary file
	if (output_f != null) { pb.redirectOutput(output_f); }
	Process proc = null;
	boolean flag0 = true;
	try { proc = pb.start(); }
	catch (Exception e) {
	    System.err.println("ProcessBuilder Start Error: " + e);
	    e.printStackTrace();
	    flag0 = false;
	}
	if (!flag0) {
	    if (proc != null) { proc.destroy(); }
	    return -1;
	}
	int exit_val = -1;
	try { exit_val = proc.waitFor(); }
	//try { exit_val = timeoutWaitFor(proc, timeout); }
	catch (InterruptedException e) {
	    System.err.println("Process WaitFor Error: " + e);
	    e.printStackTrace();
	}
	if (proc != null) { proc.destroy(); }
	return exit_val;
    }
}
