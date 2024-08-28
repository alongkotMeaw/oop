package lap_7_2;
import lap6_3.FixedSalary;
import lap6_2.Milk;
import lap6_2.Sugar;
import lap6_2.Coffee;
import lap6_2. inventoryCart ;
import lap6_2.Cashier;
import lap6_2.Product;

public class Main {

	public static void main(String[] args) { 
	
		FixedSalary employeeA = new FixedSalary("Clark", "Kent", "555-999-5555", 15000.00); 
		SavingAccount  b = new SavingAccount(employeeA); 
		b.deposit(1000); 
		Milk p1 = new Milk(150); 
		p1.setVolumn(250); 
		Sugar p2 = new Sugar(50); 
		p2.setWeight(250); 
		Product p3 = new Coffee(250); 
		p3.setWeight(50); 
		Product p4 = new Coffee(250); 
		p4.setWeight(50); 
		 
		inventoryCart ic = new inventoryCart (10); 
    	ic.add(p1); 
	  	ic.add(p2); 
		ic.add(p3); 
		ic.add(p4); 
		 Cashier c = new Cashier(); 
		 c.doPayment(ic,employeeA.getCard()); 
		 c.printReceipt(); 
	}

}
