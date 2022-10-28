import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class NewRecipePage extends JFrame{
    private JPanel Mainpanel;
    private JButton deleteButton;
    private JButton helpButton;
    private JTextPane imNotes;
    private JTextPane instructions;
    private JFormattedTextField variablesFormattedTextField;
    private JTextField Time;
    private JTextField Likability;
    private JTextField Difficulty;
    public JCheckBox milkCheckBox;
    private JCheckBox otherLactoseProductsCheckBox;
    private JCheckBox meatCheckBox;
    private JCheckBox grainsCheckBox;
    private JCheckBox otherSeafoodProductsCheckBox;
    private JCheckBox condinanceCheckBox;
    private JCheckBox eggsCheckBox;
    private JCheckBox vegetablesCheckBox;
    private JCheckBox fishCheckBox;
    private JCheckBox fruitsCheckBox;
    private JButton backButton;
    private JButton button1;
    private JButton saveButton;
    private JTextField Name;
    private JTextPane ingredients;
    public static ArrayList<Recipe> array = new ArrayList<Recipe>();


    NewRecipePage() {
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
                NewRecipeHelpPage screen = new NewRecipeHelpPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatingLikabilityPage screen = new CalculatingLikabilityPage();
                screen.setVisible(true);
                screen.setSize(750,500);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recipe g = new Recipe(Name.getText(), imNotes.getText(), instructions.getText(), Integer.parseInt(Time.getText()), Double.parseDouble(Likability.getText()), Integer.parseInt(Difficulty.getText()), ingredients.getText(), milkCheckBox.isSelected(), otherLactoseProductsCheckBox.isSelected(), eggsCheckBox.isSelected(), meatCheckBox.isSelected(),fruitsCheckBox.isSelected(),otherSeafoodProductsCheckBox.isSelected(),vegetablesCheckBox.isSelected(),grainsCheckBox.isSelected(),fishCheckBox.isSelected(),condinanceCheckBox.isSelected());
                array.add(g);
                FrontPage screen = new FrontPage();
                screen.refreshRecipeList();
                System.out.println("recipe g:" + g.name + g.ImNotes + g.Eggs + g.Fish);
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });

    }
    private void closeframe(){this.setVisible(false);}

}
