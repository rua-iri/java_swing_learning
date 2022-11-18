
import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "This is a message", "Message Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is an information message", "Information Message", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a question message", "Question Message", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a warning message", "Warning Message", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is a error message", "Error Message", JOptionPane.ERROR_MESSAGE);
        
        int answer = JOptionPane.showConfirmDialog(null, "Do you accept the terms and conditions?", "Confirmation Dialog", JOptionPane.YES_NO_CANCEL_OPTION);

        System.out.println("Answer: " + answer);

    }

}
