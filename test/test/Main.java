import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private int clickCount = 0; // ตัวแปรสำหรับนับจำนวนครั้งที่ปุ่มถูกกด

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().createAndShowGUI());
    }

    private void createAndShowGUI() {
        // สร้าง JFrame
        JFrame frame = new JFrame("Button Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // สร้าง JButton
        JButton button = new JButton("Click me!");
        
        // สร้าง ActionListener
        ActionListener buttonClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++; // เพิ่มจำนวนครั้งที่ปุ่มถูกกด
                button.setText("Clicked " + clickCount + " times"); // อัปเดตข้อความบนปุ่ม
            }
        };
        
        // เชื่อมโยง ActionListener เข้ากับ JButton
        button.addActionListener(buttonClickListener);
        
        // เพิ่มปุ่มลงใน JFrame
        frame.getContentPane().add(button);
        
        // แสดง JFrame
        frame.setVisible(true);
    }
}
