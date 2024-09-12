package lap10_calculater;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class mygridlayout extends JFrame {

	JButton b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_c, b_ce, b_divide, b_multiply, b_plus, b_minus, b_sum;
	JTextField textField;

	public mygridlayout() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints con = new GridBagConstraints();
		this.setSize(320, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculater");
		this.setLayout(layout);
		this.setLocationRelativeTo(null);

		b_1 = new JButton("1");
		b_2 = new JButton("2");
		b_3 = new JButton("3");
		b_4 = new JButton("4");
		b_5 = new JButton("5");
		b_6 = new JButton("6");
		b_7 = new JButton("7");
		b_8 = new JButton("8");
		b_9 = new JButton("9");
		b_c = new JButton("C");
		b_ce = new JButton("CE");
		b_divide = new JButton("/");
		b_multiply = new JButton("*");
		b_plus = new JButton("+");
		b_minus = new JButton("-");
		b_sum = new JButton("=");

		/// set text layout
		textField = new JTextField();
		textField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 50));
		textField.setHorizontalAlignment(JTextField.RIGHT); // set text in right

		con.gridx = 0;
		con.gridy = 0;
		con.gridwidth = 4;
		con.gridheight = 2;
		con.fill = GridBagConstraints.BOTH;
		this.add(textField, con);

		con.gridx = 0;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 1;
		con.weightx = 1.0;
		con.weighty = 1.0;
		con.fill = GridBagConstraints.BOTH;
		this.add(b_c, con);

		// ปุ่มที่ 2
		con.gridx = 1;
		con.gridy = 2;
		this.add(b_ce, con);

		// ปุ่มที่ 3
		con.gridx = 2;
		con.gridy = 2;
		this.add(b_divide, con);

		// ปุ่มที่ 4
		con.gridx = 3;
		con.gridy = 2;
		this.add(b_multiply, con);

		con.gridx = 0;
		con.gridy = 3;
		this.add(b_1, con);

		con.gridx = 1;
		con.gridy = 3;
		this.add(b_2, con);

		con.gridx = 2;
		con.gridy = 3;
		this.add(b_3, con);

		con.gridx = 3;
		con.gridy = 3;
		this.add(b_plus, con);

		con.gridx = 0;
		con.gridy = 4;
		this.add(b_4, con);

		con.gridx = 1;
		con.gridy = 4;
		this.add(b_5, con);

		con.gridx = 2;
		con.gridy = 4;
		this.add(b_6, con);

		con.gridx = 3;
		con.gridy = 4;
		this.add(b_minus, con);

		con.gridx = 0;
		con.gridy = 5;
		this.add(b_7, con);

		con.gridx = 1;
		con.gridy = 5;
		this.add(b_8, con);

		con.gridx = 2;
		con.gridy = 5;
		this.add(b_9, con);

		con.gridx = 3;
		con.gridy = 5;
		this.add(b_sum, con);
		this.setVisible(true);
	}

}
