package lap6_2;


import lap_7_2.Card;

public class Cashier {
	//atibute
	private String name;
	private double total = 0.0;
	private int round;
	private int i_show;
	inventoryCart cat_in;
	Card a;
	//constructer
    public  Cashier() {
		
	}
	public Cashier(String name) {
		this.name = name;
	}
	
	
	
	
	public void doPayment(inventoryCart cat_in,Card a) {
		this.a = a;
		this.cat_in = cat_in;
		System.out.println("\tCARD TYPE " + a.type());
		System.out.println("\tCARD NUMBER:xxx-xxx-5555");
		 
		
	}
	
	
	public void printReceipt() {
		round = cat_in.get_round(); // get round
		int loop,con;
		System.out.printf("\t  Pumkin Shop (%s)\n",name);
		System.out.println("\t--------------------------");
		for(i_show = 0; i_show < round ;i_show++) {
			con = 0; //reset
			System.out.print("\t" +cat_in.get_itemsum(i_show) + " x ");
			System.out.print(cat_in.get_name(i_show)+ " ");
			//loop for set position
			for(loop = cat_in.get_name(i_show).length() ; loop <= 5 ;loop++ ) System.out.print(" ");
			if(cat_in.get_code(i_show) != null) System.out.print('(' + cat_in.get_code(i_show) + ") ");
			if(cat_in.get_weigth(i_show) != 0) {
				System.out.print(cat_in.get_weigth(i_show) +" Gram");
				con = con + 4 + loop + String.format("%d", cat_in.get_weigth(i_show)).length();
			}
			else{
				System.out.print(cat_in.get_volume(i_show) + " CC");
				con = con + 2 + loop + String.format("%d", cat_in.get_volume(i_show)).length();

			}
			
			//loop for set position loop 2
			for(int loop_2 = con; loop_2 < 14 ; loop_2++ ) System.out.print(" ");

			System.out.println(cat_in.get_prince(i_show) + " ");
			total = total + cat_in.get_prince(i_show);
		}
		total = (total - total/100 *a.discount());
		a.withdraw(total);
		System.out.println("\tcard discount " + a.discount());

			System.out.println(cat_in.get_prince(i_show) + " ");
			total = total + cat_in.get_prince(i_show);
		
		

		System.out.println("\t--------------------------\n\tTotal    " + total +'$');
	}
	
	
		
}
	




