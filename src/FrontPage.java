import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrontPage extends JFrame{
    private JPanel Mainpanel;
    private JButton searchButton;
    private JButton backButton;
    private JButton addButton;
    private JList listRecipe;
    private JButton helpButton;
    private JButton infoButton;
    private JTextField Name;
    private JTextField Time;
    private JTextField Likability;
    private JTextField Difficulty;
    private JTextField recipeListTextField;
    private static DefaultListModel listRecipeModel;

    FrontPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        listRecipeModel = new DefaultListModel();
        listRecipe.setModel(listRecipeModel);
        refreshRecipeList();


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
                FrontHelpPage screen = new FrontHelpPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchPage screen = new SearchPage();
                screen.setVisible(true);
                screen.setSize(750,500);
                closeframe();
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoPage screen = new InfoPage();
                screen.setVisible(true);
                screen.setSize(750,520);
                closeframe();

                int gradeNumber = listRecipe.getSelectedIndex();
                Recipe g = NewRecipePage.array.get(gradeNumber);
                screen.ReName.setText(g.getName());
                screen.ImportantNotes.setText(g.getImNotes());
                screen.Ingredience.setToolTipText(g.getIngredients());
                screen.Instructions.setText(g.getInstructions());
                screen.Time.setText(String.valueOf(g.getTime()));
                screen.Likability.setText(String.valueOf(g.getLikability()));
                screen.Difficulty.setText(String.valueOf(g.getDifficulty()));
                screen.milkCheckBox.setSelected(Boolean.valueOf(g.Milk));
                screen.otherLactoseProductsCheckBox.setSelected(Boolean.valueOf(g.OthLactosePro));
                screen.eggsCheckBox.setSelected(Boolean.valueOf(g.Eggs));
                screen.meatCheckBox.setSelected(Boolean.valueOf(g.Meat));
                screen.vegetablesCheckBox.setSelected(Boolean.valueOf(g.Vegetables));
                screen.grainsCheckBox.setSelected(Boolean.valueOf(g.Grains));
                screen.fishCheckBox.setSelected(Boolean.valueOf(g.Fish));
                screen.otherSeafoodProductsCheckBox.setSelected(Boolean.valueOf(g.OthSeafoodPro));
                screen.fruitsCheckBox.setSelected(Boolean.valueOf(g.Fruits));
                screen.condinanceCheckBox.setSelected(Boolean.valueOf(g.Condiments));
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewRecipePage screen = new NewRecipePage();
                screen.setVisible(true);
                screen.setSize(750,520);
                closeframe();
            }
        });
        listRecipe.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int gradeNumber = listRecipe.getSelectedIndex();
                Recipe g = NewRecipePage.array.get(gradeNumber);
                Name.setText(g.getName());
                Time.setText(String.valueOf(g.getTime()));
                Likability.setText(String.valueOf(g.getLikability()));
                Difficulty.setText(String.valueOf(g.getDifficulty()));
            }
        });
    }
    private void closeframe(){
        this.setVisible(false);
    }

    public static void refreshRecipeList(){
        listRecipeModel.removeAllElements();
        for (Recipe g : NewRecipePage.array){
            listRecipeModel.addElement(g.getName());
        }

    }

}
