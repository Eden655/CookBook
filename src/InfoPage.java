import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPage extends JFrame{
    private JPanel Mainpanel;
    public JFormattedTextField ReName;
    private JButton deleteButton;
    private JButton editButton;
    private JButton helpButton;
    public JTextPane ImportantNotes;
    public JTextPane Instructions;
    private JFormattedTextField variablesFormattedTextField;
    public JTextField Time;
    public JTextField Likability;
    public JCheckBox fruitsCheckBox;
    public JCheckBox condinanceCheckBox;
    public JCheckBox milkCheckBox;
    public JCheckBox otherLactoseProductsCheckBox;
    public JCheckBox fishCheckBox;
    public JCheckBox otherSeafoodProductsCheckBox;
    public JCheckBox vegetablesCheckBox;
    public JCheckBox grainsCheckBox;
    public JCheckBox meatCheckBox;
    public JCheckBox eggsCheckBox;
    public JList Ingredience;
    private JButton backButton;
    public JTextField Difficulty;

    InfoPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrontPage screen = new FrontPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoHelpPage screen = new InfoHelpPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditingPage screen = new EditingPage();
                screen.setVisible(true);
                screen.setSize(750,520);
                closeframe();
            }
        });
    }
    private void closeframe(){this.setVisible(false);}

    private void replaceinfo(){

       // ReName.setText(NewRecipePage.array.get(NewRecipePage.Name));
    }
}

// what if every time a new recipe is created and saved, the info page is made and stored in the front page,
// instead of creating and transfering date
