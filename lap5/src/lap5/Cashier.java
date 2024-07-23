package lap5;

public class Cashier {
	//atibute
	private String name;
	private int total = 0;
	private int round;
	private int i_show;
	//constructer
	public Cashier(String name) {
		this.name = name;
	}
	
	public void printReceipt(inventoryCart ci) {
		round = ci.get_round(); // get round
		System.out.printf("\t  Pumkin Shop (%s)\n",name);
		for(i_show = 0; i_show < round ;i_show++) {
			System.out.print("\t" +ci.get_itemsum(i_show) + " ");
			System.out.print(ci.get_name(i_show)+ " ");
			//loop for set position
			for(int loop = ci.get_name(i_show).length() ; loop <= 5 ;loop++ ) System.out.print(" ");
			System.out.print('(' + ci.get_code(i_show) + ") ");
			System.out.println(ci.get_prince(i_show) + " ");
			total = total + ci.get_prince(i_show) * ci.get_itemsum(i_show);
		}
		
		System.out.println("\t\tTotal    " + total +'$');
		
	}


}
