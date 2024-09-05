package lap9_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4 };
		try {
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); 
		}

		for (int i : num) {
			System.out.println(i);
		}

	}

}
