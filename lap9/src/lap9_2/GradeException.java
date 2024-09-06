package lap9_2;

public class GradeException extends Exception{
		public GradeException(String mesage) {
			super(mesage);
		}
		/*
		public static void checkABCD(String grade)throws GradeException {
			if(grade.charAt(0) != 'A' && grade.charAt(0) != 'B' && grade.charAt(0) != 'C' && grade.charAt(0) != 'D' && grade.charAt(0) != 'F' ) {
				throw new GradeException("(grade must be A B C D E F) can not display.");
			}
			
		}*/
}
