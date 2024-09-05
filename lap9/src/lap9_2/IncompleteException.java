package lap9_2;

public class IncompleteException extends Exception {
	public IncompleteException(String mesage) {
		super(mesage);
	}

	public static void checkGrade(String grade)throws IncompleteException {
		for (char m : grade.toCharArray()) {
			if (m != 'A' && m != 'B' && m != 'C' && m != 'D' && m != 'F') {
				throw new IncompleteException("(grade " + m + " is incomplete) can not display");
			}
		}
		
	}

}
