import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class NewAccountPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField newAccountMenuFormattedTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JButton backButton;
    private JButton createNewAccountButton;
    private JButton helpButton;

    NewAccountPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage screen = new LoginPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewAccountHelpPage screen = new NewAccountHelpPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
    }
    private void closeframe(){
        this.setVisible(false);
    }

    public void setVisable(boolean b) {
    }
}
