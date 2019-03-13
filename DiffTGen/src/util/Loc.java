package util;

public class Loc
{
    int ln, cn;

    public Loc(int ln, int cn) {
	this.ln = ln;
	this.cn = cn;
    }

    public int getLineNumber() { return ln; }

    public int getColumnNumber() { return cn; }
}
