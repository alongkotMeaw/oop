package lap6_2;

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
	public  Cashier() {
		
	}
	
	public void printReceipt(inventoryCart ci) {
		round = ci.get_round(); // get round
		int loop,con;
		System.out.printf("\t  Pumkin Shop (%s)\n",name);
		System.out.println("\t--------------------------");
		for(i_show = 0; i_show < round ;i_show++) {
			con = 0; //reset
			System.out.print("\t" +ci.get_itemsum(i_show) + " x ");
			System.out.print(ci.get_name(i_show)+ " ");
			//loop for set position
			for(loop = ci.get_name(i_show).length() ; loop <= 5 ;loop++ ) System.out.print(" ");
			if(ci.get_code(i_show) != null) System.out.print('(' + ci.get_code(i_show) + ") ");
			if(ci.get_weigth(i_show) != 0) {
				System.out.print(ci.get_weigth(i_show) +" Gram");
				con = con + 4 + loop + String.format("%d", ci.get_weigth(i_show)).length();
			}
			else{
				System.out.print(ci.get_volume(i_show) + " CC");
				con = con + 2 + loop + String.format("%d", ci.get_volume(i_show)).length();
			}
			
			//loop for set position loop 2
			for(int loop_2 = con; loop_2 < 14 ; loop_2++ ) System.out.print(" ");
			System.out.println(ci.get_prince(i_show) + " ");
			total = total + ci.get_prince(i_show);
		}
		
		System.out.println("\t--------------------------\n\tTotal    " + total +'$');
		
	}
	


}
