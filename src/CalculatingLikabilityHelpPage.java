import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CalculatingLikabilityHelpPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField calculatingLikabilityHelpFormattedTextField;
    private JTextPane onThisPageYouTextPane;
    private JButton backButton;

    CalculatingLikabilityHelpPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatingLikabilityPage screen = new CalculatingLikabilityPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
    }
    private void closeframe(){this.setVisible(false);}
}
