package lap9_2;

import java.security.PrivateKey;

public class SpaceException extends Exception {
	public SpaceException(String mesage) {
		super(mesage);
	}

	static void checkSpace(String message) throws SpaceException {	
		for (char m : message.toCharArray()) {
			if (m == ' ') {
				throw new SpaceException("(space is not allowed in name) can not display. \r\n" + "");
			}
		}
	}

}