
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, World!");


    NewWindow() {
        
        label.setBounds(0, 0, 200, 150);
        label.setFont(new Font(null, Font.BOLD, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.setVisible(true);
    }

}
