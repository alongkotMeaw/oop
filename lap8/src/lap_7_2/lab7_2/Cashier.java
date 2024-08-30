package th.ac.ku.kps.eng.cpe.oop.lab7_2;

public class Cashier {
	private InventoryCart ic;
	private Card card;
	private double total = 0;

	public Cashier() {}
	public void printReceipt() {
		System.out.println("\t\tCARD TYPE: "+card.type());
		if(card instanceof DebitCard){
			DebitCard c = (DebitCard)card;
			System.out.println("\tCARD NUMBER : xxx-xxx-"+c.getAccount().getEmployee().getSecurityNumber().substring(8));
			System.out.println("\t\tPumpkin Shop \n");
			for(Product print:ic.getAllProduct()){
				System.out.printf("\t %d x %s \t %d \n",print.getCount(),print.getName(),(int)print.getPrice());
			}
			System.out.println("\t-----------------------\t");
			System.out.println("\t  CARD DISCOUNT "+card.discount()+"%");
			System.out.printf("\t   Total\t "+total);
		}
	}
	public void doPayment(InventoryCart ic,Card card){
		   this.ic = ic;
		   this.card = card;
		   for(Product print : ic.getAllProduct()){
		       total += print.getPrice();
		   }
		   total = total-total*card.discount()/100;
		   card.withdraw(total);
		}
}
