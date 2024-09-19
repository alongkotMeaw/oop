package lap11_mine_sweeper;

import java.io.Closeable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.println("Enter row: ");
		row = sc.nextInt();
		System.out.println("Enter coloum: ");
		col = sc.nextInt();
		sc.close();
		new Map("Mine Sweerep",row,col);
	}
}
