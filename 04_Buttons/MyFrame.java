
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;



public class MyFrame extends JFrame implements ActionListener{

    String btnText = "Hello";
    JButton button;

    MyFrame() {

        ImageIcon icon = new ImageIcon("25-thumbs-up.png");

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.setText(btnText);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setSize(300, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button) {
            btnText += "!";
            System.out.println(btnText);
        }
    }

}
