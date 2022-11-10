import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is my application");
        frame.setResizable(false);

        ImageIcon img = new ImageIcon("Rory Picture.png");
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));


        frame.setVisible(true);
    }
}
