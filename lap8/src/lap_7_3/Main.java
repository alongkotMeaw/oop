package lap_7_3;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
			 JFrame frame = new JFrame("Test"); 
			 frame.setSize(250,300); 
			 frame.setVisible(true); 
			 frame.setEnabled (true); 
			 JButton jb = new JButton("click"); 
			 JPanel center = new JPanel(); 
			 center.add(jb); 
			 frame.getContentPane().add(center, BorderLayout.CENTER); 
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			 // jb.addActionListener(…); 
			

	}

}
