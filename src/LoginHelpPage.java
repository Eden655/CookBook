import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginHelpPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField loginHelpFormattedTextField;
    private JTextPane onThisPageYouTextPane;
    private JButton backButton;

    LoginHelpPage(){
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeframe();
                LoginPage screen = new LoginPage();
                screen.setVisible(true);
                screen.setSize(750,500);
            }
        });
    }

    private void closeframe(){
        this.setVisible(false);
    }
}
