package lap2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String str = sc.nextLine();
		String newWord = str.replace("happy", "happy:)");
		newWord = newWord.replace("sad", "sad:(");
		System.out.println(newWord);
		
		
		
	

   }
}
