package testgen;

public class TestClass
{
    String package_name;
    String class_name;
    String class_ctnt;
    boolean change_exercised;

    public TestClass(String pname, String cname, String cctnt, boolean ce) {
	this.package_name = pname;
	this.class_name = cname;
	this.class_ctnt = cctnt;
	this.change_exercised = ce;
    }

    public String getPackageName() { return package_name; }

    public String getClassName() { return class_name; }

    public String getClassContent() { return class_ctnt; }

    public boolean isChangeExercised() { return change_exercised; }
}
