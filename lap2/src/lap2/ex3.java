package lap2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter started day: ");
        int day = sc.nextInt();
        System.out.println("Su Mo Tu We Th Fr Sa");
        day = day - 1;
        for(int j = day; j > 0; j--) {
    		System.out.print("   ");
    	}
        int check = 1;
        for(int i = 1; i <= 31;) {
        	if(check == 0) day = 0;
        	for(int j_2 = day; j_2 < 7 && i <= 31; j_2++) {
        		System.out.print(i);
        		i++;
        		if(i <= 10)
        		    System.out.print("  ");
        		else
        			System.out.print(" ");	
        	}
        	System.out.println("");
        	check = 0;
        }
	}

}
