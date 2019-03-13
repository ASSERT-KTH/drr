package testgen;

public class ValidateState {

	public static void validate(Boolean status, String keyword) {
		if (!status) {
			System.err.println(keyword + " Failure.");
			return;
		} else {
			System.out.println(keyword + " Done.");
		}
	}
}
