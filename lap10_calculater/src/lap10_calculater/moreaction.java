package lap10_calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.CryptoPrimitive;

public class moreaction {
	compute compute = new compute();
	mygridlayout layout;
	protected String opera = "";
	

	public moreaction(mygridlayout layout) {
		this.layout = layout;
	}

	ActionListener buttonListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// for 1
			if (e.getSource() == layout.b_1) {
				System.out.println("press 1");
				opera = opera + '1';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_2) {
				System.out.println("press 2");
				opera = opera + '2';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
			 
			} else if (e.getSource() == layout.b_3) {
				System.out.println("press 3");
				opera = opera + '3';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_4) {
				System.out.println("press 4");
				opera = opera + '4';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_5) {
				System.out.println("press 5");
				opera = opera + '5';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_6) {
				System.out.println("press 6");
				opera = opera + '6';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_7) {
				System.out.println("press 7");
				opera = opera + '7';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_8) {
				System.out.println("press 8");
				opera = opera + '8';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_9) {
				System.out.println("press 9");
				opera = opera + '9';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_c) {
				System.out.println("press c");
				opera = ""; //clear text filed array
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_ce) {
				System.out.println("press ce");
			
				opera = opera.substring(0 , (opera.toCharArray().length - 1));  // for cut last str
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
					
			} else if (e.getSource() == layout.b_divide) {
				System.out.println("press /");
				System.out.println(opera); // check opera
				opera = opera + '/';
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_minus) {
				System.out.println("press -");
				System.out.println(opera); // check opera
				opera = opera + '-';
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_multiply) {
				System.out.println("press *");
				System.out.println(opera); // check opera
				opera = opera + '*';
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_plus) {
				System.out.println("press +");
				System.out.println(opera); // check opera
				opera = opera + '+';
				layout.textField.setText(opera);
				
			} else if (e.getSource() == layout.b_sum) {
				opera = compute.cal(opera).toString() + "";
				System.out.println("press =");
				System.out.println(opera); // check opera
				layout.textField.setText(opera);
			}

		}
	};

}
