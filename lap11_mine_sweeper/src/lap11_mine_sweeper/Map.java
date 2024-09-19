package lap11_mine_sweeper;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Map extends JFrame {
    public Map(String map_title,int row,int col) {
        super(map_title);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        //set laout
        JPanel panel = new JPanel(new GridLayout(row,col, 1, 1)); // ช่องว่างระหว่างแถวและคอลัมน์คือ 10px

        // เพิ่มปุ่มใน Panel
        for (int i = 1; i <= row*col; i++) {
            panel.add(new JButton());
        }

        // เพิ่ม Panel ใน Frame
        add(panel);
        

    }

}
