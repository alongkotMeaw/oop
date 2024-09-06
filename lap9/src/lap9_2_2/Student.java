package lap9_2_2;

public class Student {

	public static class SpaceException extends Exception {
		public SpaceException(String message) {
			super(message);
		}

		public static void checkSpace(String name) throws SpaceException {
			for (char m : name.toCharArray()) {
				if (m == ' ') {
					throw new SpaceException("(space is not allowed in name) cannot display.");
				}
			}
		}
	}

	public static class IncompleteException extends Exception {
		public IncompleteException(String message) {
			super(message);
		}

		public static void checkGrade(String grade) throws IncompleteException {
			for (char m : grade.toCharArray()) {
				if (m != 'A' && m != 'B' && m != 'C' && m != 'D' && m != 'F') {
					throw new IncompleteException("(grade " + m + " is incomplete) cannot display.");
				}
			}
		}
	}

	public static class GradeException extends Exception {
		public GradeException(String message) {
			super(message);
		}

		public static void checkABCD(String grade) throws GradeException {
			if (grade.charAt(0) != 'A' && grade.charAt(0) != 'B' && grade.charAt(0) != 'C' && grade.charAt(0) != 'D'
					&& grade.charAt(0) != 'F') {
				throw new GradeException("(grade must be A B C D F) cannot display.");
			}
		}
	}

	public static class DigitException extends Exception {
		public DigitException(String message) {
			super(message);
		}

		public static void checkdigit(String name) throws DigitException {
			for (char m : name.toCharArray()) {
				if (Character.isDigit(m)) {
					throw new DigitException("(digit is not allowed in name) cannot display.");
				}
			}
		}
	}

	// attributes
	private String name;
	private String grade;
	private double gpa;

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public void show() {
		gpa = 0.0;
		try {
			SpaceException.checkSpace(name);
			DigitException.checkdigit(name);
			GradeException.checkABCD(grade);
			IncompleteException.checkGrade(grade);

			for (char m : grade.toCharArray()) {
				gpa = gpa + ('D' - m + 1);
			}
			System.out.println(name + " registered " + grade.length() + " subjects and got GPA " + gpa / grade.length());
		} catch (DigitException | SpaceException | GradeException | IncompleteException e) {
			System.out.println(e.getMessage());
		}
	}
}
