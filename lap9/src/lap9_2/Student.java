package lap9_2;

import java.security.PrivateKey;

public class Student {
	// adtibute
	private String name;
	private String grade;
	private double gpa;
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public void show() {
		gpa = 0.0;
		// IncompleteException :(grade I is incomplete) can not display.
		try {
			SpaceException.checkSpace(name);
			DigitException.checkdigit(name);
			GradeException.checkABCD(grade);
			IncompleteException.checkGrade(grade);
			
			for (char m : grade.toCharArray()) {
				//System.out.println(m);
				gpa = gpa + ('D'  - m + 1);
				//System.out.println(gpa);
			}
			System.out.println(name + "registered "+ grade.length() + " subjects and got GPA  " + gpa/grade.length());
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