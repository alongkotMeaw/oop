package p2;

import javax.swing.JFrame;

public class Map extends JFrame {
    public Map(String map_title) {
        super(map_title);
        this.setSize(320, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(layout);
        this.setLocationRelativeTo(null);

    }

}
