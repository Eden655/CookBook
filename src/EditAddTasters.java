import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EditAddTasters extends JFrame{
    private JPanel Mainpanel;
    private JTextField TastersName;
    private JButton addButton;
    private JButton deleteButton;
    private JList TastersList;
    private JButton backButton;
    private JButton nextButton;
    private JButton helpButton;
    private JTextField editAddTastersTextField;
    static ArrayList<Tasters> arrayTasters = new ArrayList<Tasters>();
    private static DefaultListModel listTastersModel;



    EditAddTasters() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        listTastersModel = new DefaultListModel();
        TastersList.setModel(listTastersModel);
        refreshRecipeListTasters();


        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAddTastersHelpPage screen = new EditAddTastersHelpPage();
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

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Tasters t = new Tasters(TastersName.getName());
                System.out.println("list refreshed1: " + TastersName.getName());
                arrayTasters.add(t);
                System.out.println("list refreshed2: " + TastersName.getName());
                refreshRecipeListTasters();
                System.out.println("list refreshed3: " + TastersName.getName());

            }
        });
        TastersList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int gradeNumber = TastersList.getSelectedIndex();
                Tasters t = arrayTasters.get(gradeNumber);
                TastersName.setText(t.getTastersName());

            }
        });
    }
    private void closeframe(){this.setVisible(false);}

    public static void refreshRecipeListTasters(){
        listTastersModel.removeAllElements();
        for (Tasters t : arrayTasters){
            listTastersModel.addElement(t.getTastersName());
        }
    }


    }
