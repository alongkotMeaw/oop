package lap12_file_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class lap12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arrB = input.split(",");
		for(String c : arrB) {
			System.out.println(c);
		}
		System.out.println(input);
	}
}
