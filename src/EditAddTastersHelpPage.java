import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EditAddTastersHelpPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField editAddTastersHelpFormattedTextField;
    private JTextPane onThisPageYouTextPane;
    private JButton backButton;

    EditAddTastersHelpPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAddTasters screen = new EditAddTasters();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
    }
    private void closeframe(){this.setVisible(false);}
}
