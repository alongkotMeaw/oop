package lap9_2;




public class Student {
	
	
	// adtibute
	private String name;
	private String grade;
	private double gpa;
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public  void calGpa(String grade) throws GradeException ,IncompleteException{
		gpa = 0.0f;
		if(grade.charAt(0) != 'A' && grade.charAt(0) != 'B' && grade.charAt(0) != 'C' && grade.charAt(0) != 'D' && grade.charAt(0) != 'F' ) {
			throw new GradeException("(grade must be A B C D E F) can not display.");
		}
		for (char m : grade.toCharArray()) {
			if (m != 'A' && m != 'B' && m != 'C' && m != 'D' && m != 'F') {
				throw new IncompleteException("(grade " + m + " is incomplete) can not display");
			}
		}
		
		for (char m : grade.toCharArray()) {
			//System.out.println(m);
			gpa = gpa + ('D'  - m + 1.0);
			//System.out.println(gpa);
			
		}
		
	}

	public void show() {
		// IncompleteException :(grade I is incomplete) can not display.
		try {
			SpaceException.checkSpace(name);
			DigitException.checkdigit(name);
			calGpa(grade);
			System.out.println(name + " registered "+ grade.length() + " subjects and got GPA  " + gpa/grade.length());
		} catch (DigitException e) {
			System.out.println(e);
		} catch (SpaceException e) {
			System.out.print(e);
		} catch (GradeException e) {
			System.out.println(e);
		} catch (IncompleteException e) {
			System.out.println(e);
		}
		
		
		
	
	}
}