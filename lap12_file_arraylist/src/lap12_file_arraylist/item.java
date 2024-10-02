package lap12_file_arraylist;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class item {
	private String name;
	private double pricce;
	private int quantity;
	private double total ;
	public String toString() {
		return name + "  " + pricce +"$  " + quantity + "   " + total;
	}
	

	
    
    public static void main(String[] args) {
    	String name;
    	double pricce;
    	int quantity;
        String choice ;
        ArrayList<item> item = new ArrayList<item>();
		Scanner sc = new Scanner(System.in);
		do {
			item n = new item();
			System.out.print("Enter the name of the item:");
			n.name = sc.next();
			System.out.print("Enter the unit price:");
			n.pricce = sc.nextDouble();
			System.out.println("Enter the quatity");
			n.quantity = sc.nextInt();
			n.total = n.pricce * n.quantity; 
			System.out.print("Continute shopping (y/n)?");
			choice = sc.next();
			item.add(n);
			
		}while(choice.charAt(0) == 'y');
		
		
		System.out.println("Final shopping cart total");
		double total_atcart = 0;
		for(item n : item) {
			total_atcart += n.total;
			System.out.println(n.toString());
		}
		System.out.println("TOtal at cart " + total_atcart);
		
		/*
		try {
		      FileWriter Writer = new FileWriter("C:\\Users\\meama\\source\\repos\\eclipse-workspace\\lap12_file_arraylist\\src\\lap12_file_arraylist\\item.txt");
		      for(item n : item) {
					total_atcart += n.total;
					Writer.write(n.name + ',' + n.pricce + ',' + n.quantity);
				}
		     Writer.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		*/
	
	}

}
