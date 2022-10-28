import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CalculatingLikabilityPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField calculatingLikabilityFormattedTextField;
    private JButton backButton;
    private JButton EditAddTasterButton;
    private JButton deleteButton;
    private JButton calculateButton;
    private JTextField textField1;
    private JList list1;
    private JButton helpButton;
    private JFormattedTextField tastersFormattedTextField;
    private JTextField textField2;

    CalculatingLikabilityPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatingLikabilityHelpPage screen = new CalculatingLikabilityHelpPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeframe();
            }
        });
        EditAddTasterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAddTasters screen = new EditAddTasters();
                screen.setVisible(true);
                screen.setSize(750,500);
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
    }
    private void closeframe(){this.setVisible(false);}
}
