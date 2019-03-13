package testgen;

public class CompileResult
{
    int exit_val;
    String[] compile_cmds;
    public CompileResult(int eval, String[] ccmds) {
	exit_val = eval;
	compile_cmds = ccmds;
    }
    public int getExitValue() { return exit_val; }
    public String[] getCompileCommands() { return compile_cmds; }
}
