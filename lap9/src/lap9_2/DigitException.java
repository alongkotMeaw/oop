package lap9_2;

public class DigitException extends Exception {
  
	public DigitException(String mesage) {
		super(mesage);
	}
	
	public static void checkdigit(String name) throws DigitException{
		for (char m : name.toCharArray()) {
			for(char n : "123456789".toCharArray())
			if (m == n) {
				throw new DigitException("(digit is not allowed in name) can not display.");
			}
		}
		
	}

}
