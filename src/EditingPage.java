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

public class EditingPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField recipeNameFormattedTextField;
    private JButton deleteButton;
    private JButton helpButton;
    private JTextPane instructionsTextPane;
    private JTextPane importantNotesTextPane;
    private JFormattedTextField variablesFormattedTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JCheckBox milkCheckBox;
    private JCheckBox otherLactoseProductsCheckBox;
    private JCheckBox eggsCheckBox;
    private JCheckBox meatCheckBox;
    private JCheckBox grainsCheckBox;
    private JCheckBox vegetablesCheckBox;
    private JCheckBox otherSeafoodProductsCheckBox;
    private JCheckBox condimentsCheckBox;
    private JCheckBox fruitsCheckBox;
    private JCheckBox fishCheckBox;
    private JList list1;
    private JButton backButton;
    private JButton button1;

    EditingPage() {
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
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditingHelpPage screen = new EditingHelpPage();
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
    }

    private void closeframe(){this.setVisible(false);}

}

