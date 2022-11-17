
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaunchPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");


    LaunchPage() {

        myButton.setBounds(100, 150, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton) {
            NewWindow myWindow = new NewWindow();
        }
    }

}
