package lap10_calculater;

import javax.swing.JFrame;
//////////********************************************************************************************//////////
//not suport for input < 10
// -value and only cal integer


public class Main {

	public static void main(String[] args) {
		mygridlayout con = new mygridlayout();
		moreaction action = new moreaction(con);
		// action add
		con.b_1.addActionListener(action.buttonListener);
		con.b_2.addActionListener(action.buttonListener);
		con.b_3.addActionListener(action.buttonListener);
		con.b_4.addActionListener(action.buttonListener);
		con.b_5.addActionListener(action.buttonListener);
		con.b_6.addActionListener(action.buttonListener);
		con.b_7.addActionListener(action.buttonListener);
		con.b_8.addActionListener(action.buttonListener);
		con.b_9.addActionListener(action.buttonListener);
		con.b_c.addActionListener(action.buttonListener);
		con.b_ce.addActionListener(action.buttonListener);
		con.b_divide.addActionListener(action.buttonListener);
		con.b_minus.addActionListener(action.buttonListener);
		con.b_multiply.addActionListener(action.buttonListener);
		con.b_plus.addActionListener(action.buttonListener);
		con.b_sum.addActionListener(action.buttonListener);
	}

}
