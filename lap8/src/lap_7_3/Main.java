package lap_7_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Main {
	static int count = 0;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setSize(250, 300);
		frame.setVisible(true);
		frame.setEnabled(true);
		JButton jb = new JButton("click");
		JPanel center = new JPanel();
		center.add(jb);
		frame.getContentPane().add(center, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener buttonClickListener = new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				count++; 
				//jb.setText("Clicked " + count); 
				System.out.println(count);
			 }
		  };
		    
		jb.addActionListener(buttonClickListener);

	}

}
