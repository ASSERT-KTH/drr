package testgen;

public class InstrumentedClass
{
    String class_name;
    String instru_class_ctnt;

    public InstrumentedClass(String cn, String icc) {
	class_name = cn;
	instru_class_ctnt = icc;
    }

    public String getClassName() { return class_name; }

    public String getInstrumentedClassContent() { return instru_class_ctnt; }
}
