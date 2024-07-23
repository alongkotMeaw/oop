package lap2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the number : ");
		String s = sc.nextLine();
		 int result = 0;
		 // cut str
		 System.out.print(s + " = ");
		 for(int i = 0; i < s.length(); i++){
			 System.out.print(s.charAt(i));
			 // con ot int
			 char con = s.charAt(i);
			 int out = con - '0'; // - in ascll
			 result = result +  out;
			 if(i < s.length() - 1)
				 System.out.print(" + ");
		 }
		 System.out.print(" = " + result);
		 
	}

}
/*
 * char x = '9';
int y = x - '0'; // gives the int value 9
 */

