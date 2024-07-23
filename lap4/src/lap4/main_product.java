package lap4;

import java.util.Scanner;

public class main_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		product[] p = new product[5];
		//assign
		p[0] = new product(0,"Mama",5.5);
		p[1] = new product(10,"Lays",10.5);
		System.out.println("======== Enter Products details =======");
		for (int i = 2; i < 5; i++) {
			
			System.out.print("Product code ");
			int code  = sc.nextInt();
			String c = sc.nextLine(); // ดักเเบบซี
			
			System.out.print("name:");
			String name = sc.nextLine();
			
			System.out.print("price:");
			double price = sc.nextDouble();
			
			p[i] = new product(code,name,price);
		}
		
		//shown
		System.out.println("======== List of Product ========");
		for (int i = 0; i < 5; i++) {
			p[i].show();
		}
		
		//order
		System.out.println("===== What do you want to buy =====\nEnter product code (press -1 to exit)");
		int orCode;
		double result = 0.0;
		do {
			System.out.print("Product Code:");
			orCode = sc.nextInt();
			for(int j = 0; j < 5; j++) {
				if(p[j].get_code() == orCode) {
					System.out.print("Amount of " + p[j].get_name() + ":");
					int amount = sc.nextInt();
					result = result + p[j].get_price()*amount;
				}
			}
			
		}while(orCode != -1);
		System.out.println("You have to pay " + result + " Bath");
		
		
		
		

	}

}
