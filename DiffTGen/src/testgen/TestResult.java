package testgen;

public class TestResult
{
    String method_name;
    String result_ctnt;

    public TestResult(String name, String ctnt) {
	method_name = name;
	result_ctnt = ctnt;
    }

    public String getMethodName() { return method_name; }

    public String getResultContent() { return result_ctnt; }

    public String toString() {
	return "Test Method Name: " + method_name + "\nResult:\n" + result_ctnt;
    }
}
