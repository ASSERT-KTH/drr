package testgen;

public class MethodToBeInstrumented
{
    public String fpath;
    public String mloc;

    public MethodToBeInstrumented(String fpath, String mloc) {
	this.fpath = fpath;
	this.mloc = mloc;
    }

    public String getFilePath() { return fpath; }

    public String getMethodLoc() { return mloc; }
}
