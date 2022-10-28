import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class InfoHelpPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField informationHelpFormattedTextField;
    private JTextPane onThisPageYouTextPane;
    private JButton backButton;

    public InfoHelpPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoPage screen = new InfoPage();
                screen.setVisible(true);
                screen.setSize(750,520);
                closeframe();
            }
        });
    }
    private void closeframe(){this.setVisible(false);}
}
