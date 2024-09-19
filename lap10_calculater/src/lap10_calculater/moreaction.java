package lap10_calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class moreaction {
	compute compute = new compute();
	mygridlayout layout;
	protected String opera = "";
	protected String historyOpera = "";
	private int lastIndexOpera;
	private boolean checkLastIndexOPera = true; // for check last first for unsuport casre EX +5+5 or 5+5-
	private boolean checFristIndexopera = true;
	public moreaction(mygridlayout layout) {
		this.layout = layout;
	}

	ActionListener buttonListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// for
			if (e.getSource() == layout.b_1) {
				System.out.println("press 1");
				opera = opera + '1';
				historyOpera = historyOpera + '1'; // for remember all oprerand
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_2) {
				System.out.println("press 2");
				opera = opera + '2';
				historyOpera = historyOpera + '2';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_3) {
				System.out.println("press 3");
				opera = opera + '3';
				historyOpera = historyOpera + '3';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_4) {
				System.out.println("press 4");
				opera = opera + '4';
				historyOpera = historyOpera + '4';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_5) {
				System.out.println("press 5");
				opera = opera + '5';
				historyOpera = historyOpera + '5';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_6) {
				System.out.println("press 6");
				opera = opera + '6';
				historyOpera = historyOpera + '6';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_7) {
				System.out.println("press 7");
				opera = opera + '7';
				historyOpera = historyOpera + '7';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_8) {
				System.out.println("press 8");
				opera = opera + '8';
				historyOpera = historyOpera + '8';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_9) {
				System.out.println("press 9");
				opera = opera + '9';
				historyOpera = historyOpera + '9';
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_c) {
				System.out.println("press c");
				opera = ""; // clear text filed array
				historyOpera = "";
				System.out.println(opera); // check opera
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_ce) {
				if (historyOpera.length() == 0) {
					layout.textField.setText("Out of rane");
					System.out.println("Stop don't do it opera is empty");
				} else {
					System.out.println("press ce now you can press any times");
					// historyOpera = historyOpera; // do nothing with this in this case
					historyOpera = historyOpera.substring(0, (historyOpera.toCharArray().length - 1)); // delete last
					opera = historyOpera; // for cut last str
					System.out.println("opera = " + opera); // check opera
					layout.textField.setText(historyOpera);
				}

			} else if (e.getSource() == layout.b_divide) {
				System.out.println("press /");
				System.out.println(opera); // check opera
				opera = opera + '/';
				historyOpera = historyOpera + '/';
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_minus) {
				System.out.println("press -");
				System.out.println(opera); // check opera
				opera = opera + '-';
				historyOpera = historyOpera + '-';
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_multiply) {
				System.out.println("press *");
				System.out.println(opera); // check opera
				opera = opera + '*';
				historyOpera = historyOpera + '*';
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_plus) {
				System.out.println("press +");
				System.out.println(opera); // check opera
				opera = opera + '+';
				historyOpera = historyOpera + '+';
				layout.textField.setText(opera);

			} else if (e.getSource() == layout.b_sum) {
				System.out.println("operChec  = " + opera);
				checkLastIndexOPera = true; // set to true for new round
				checFristIndexopera = true;
				lastIndexOpera = opera.length() - 1; // if last index not int set textframe sysntaxeroor
				System.out.println("Show last" + opera.charAt(lastIndexOpera));
				for (char op : "+-*/".toCharArray()) {
					if (opera.charAt(lastIndexOpera) == op) {
						checkLastIndexOPera = false;
						break;
					}
				}
				// check first for -value or first is +-/*
				for (char op : "+-*/".toCharArray()) {
					if (opera.charAt(0) == op) {
						checFristIndexopera = false;
						break;
					}
				}
				if (checkLastIndexOPera && checFristIndexopera) {
					opera = compute.cal(opera).toString() + "";
					System.out.println("press =");
					System.out.println(opera); // check opera
					layout.textField.setText(opera);
				} else
					layout.textField.setText("Syntax Erorr");
			}

		}
	};

}
