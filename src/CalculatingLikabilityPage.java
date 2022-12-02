import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatingLikabilityPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField calculatingLikabilityFormattedTextField;
    private JButton backButton;
    private JButton EditAddTasterButton;
    private JButton deleteButton;
    private JButton calculateButton;
    private JTextField TotalAverage;
    private JList listTasters;
    private JButton helpButton;
    private JFormattedTextField tastersFormattedTextField;
    private JTextField Marks;
    private JTextField TastersName;
    private JButton addTastingMemberButton;
    private JButton addRatingButton;
    public static ArrayList<Tasters> arrayT = new ArrayList<Tasters>();
    private static DefaultListModel listTastersModel;



    CalculatingLikabilityPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        listTastersModel = new DefaultListModel();
        listTasters.setModel(listTastersModel);
        refreshRecipeList();



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

        addTastingMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tasters g = new Tasters(
                        TastersName.getText()

                );
                arrayT.add(g);
                refreshRecipeList();

            }
        });
        listTasters.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int gradeNumber = listTasters.getSelectedIndex();
                Tasters g = CalculatingLikabilityPage.arrayT.get(gradeNumber);
                TotalAverage.setText(String.valueOf(g.getTotalAverage()));

            }
        });
        addRatingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tasters g = new Tasters(
                        Integer.parseInt(Marks.getText())

                );
                arrayT.add(g);
                refreshMarkList();
            }
        });
    }
    private void closeframe(){this.setVisible(false);}
    public static void refreshRecipeList(){
        listTastersModel.removeAllElements();
        for (Tasters g : CalculatingLikabilityPage.arrayT){
            listTastersModel.addElement(g.getTastersName());
        }

    }
    public static void refreshMarkList(){
        listTastersModel.removeAllElements();
        for (Tasters g : CalculatingLikabilityPage.arrayT){
            listTastersModel.addElement(g.getTastersName());
        }

    }
}
