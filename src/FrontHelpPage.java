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

public class FrontHelpPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField recipeListHelpFormattedTextField;
    private JTextPane onThisPageYouTextPane;
    private JButton backButton;

    FrontHelpPage() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.Mainpanel);
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
    }
      private void closeframe(){this.setVisible(false);}
}

