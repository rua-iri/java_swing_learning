import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;


public class Main{

    public static void main(String[] args) {

        ImageIcon img = new ImageIcon("hello-world.png");

        JLabel label = new JLabel();
        label.setText("Hello, World!");
        label.setIcon(img);

        //set label to the top and centre of the window
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setIconTextGap(-15);
        label.setBackground(Color.red);
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.add(label);
    }
}
