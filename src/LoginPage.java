import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField loginMenuFormattedTextField;
    private JTextField usertext;
    private JTextField password;
    private JButton helpButton;
    private JButton loginButton;
    private JButton closeButton;
    private JButton createNewAccountButton;

    LoginPage(){
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();


        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginHelpPage screen = new LoginHelpPage();
                screen.setSize(750,500);
                screen.setVisible(true);
                closeframe();

            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeframe();
            }
        });
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewAccountPage screen = new NewAccountPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FrontPage screen = new FrontPage();
               screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();

            }
        });
    }

    private void closeframe(){
        this.setVisible(false);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
