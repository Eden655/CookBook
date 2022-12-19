import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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

public class SearchPage extends JFrame{
    private JPanel Mainpanel;
    private JFormattedTextField searchRecipeFormattedTextField;
    public JList list1;
    private JButton backButton;
    private JFormattedTextField variablesFormattedTextField;
    private JCheckBox milkCheckBox;
    private JCheckBox fruitsCheckBox;
    private JCheckBox grainsCheckBox;
    private JCheckBox otherSeaFoodCheckBox;
    private JCheckBox eggsCheckBox;
    private JCheckBox otherLactoseProductsCheckBox;
    private JCheckBox fishCheckBox;
    private JCheckBox vegetablesCheckBox;
    private JCheckBox meatCheckBox;
    private JCheckBox timeCheckBox;
    private JCheckBox likabilityCheckBox;
    private JCheckBox difficultyCheckBox;
    private JCheckBox condinanceCheckBox;
    private JButton helpButton;
    private JButton infoButton;
    private static DefaultListModel list1Model;
    public static ArrayList<Recipe> arrayVar;

    SearchPage() {
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        list1Model = new DefaultListModel();
        list1.setModel(list1Model);
        refreshRecipeList();


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
                SearchHealpPage screen = new SearchHealpPage();
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
                int gradeNumber = list1.getSelectedIndex();
                Recipe g = NewRecipePage.array.get(gradeNumber);
                screen.ReName.setText(g.getName());
                screen.ImportantNotes.setText(g.getImNotes());
                screen.Ingredients.setText(g.getIngredients());
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
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int gradeNumber = list1.getSelectedIndex();
                Recipe g = NewRecipePage.array.get(gradeNumber);


            }
        });
        meatCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (meatCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isMeat())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());

            }

        });
        milkCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (milkCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isMilk())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        otherLactoseProductsCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (otherLactoseProductsCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isOthLactosePro())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });

        eggsCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (eggsCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isEggs())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        vegetablesCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (vegetablesCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isVegetables())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        fishCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (fishCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isFish())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        otherSeaFoodCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (otherSeaFoodCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isOthSeafoodPro())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        grainsCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (grainsCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isGrains())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        fruitsCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (fruitsCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isFruits())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });
        condinanceCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                arrayVar = new ArrayList<Recipe>();

                if (condinanceCheckBox.isSelected())
                    for ( Recipe s : NewRecipePage.array)
                        if(s.isCondiments())
                            arrayVar.add(s);


                list1Model.removeAllElements();
                for (Recipe r : arrayVar)
                    list1Model.addElement(r.getName());
            }
        });


        timeCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SortTime(NewRecipePage.array);

            }
        });

        likabilityCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SortLikability(NewRecipePage.array);
            }
        });
        difficultyCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SortDifficulty(NewRecipePage.array);
            }
        });
    }

    public void SortTime(ArrayList<Recipe> x){
        Recipe[] temp = new Recipe[2];
        int counter = 0;
        Recipe tmp;
        for (Recipe r : x){
            temp[counter] = r;
            counter++;
        }
        for (int i = 0; i < temp.length; i++)
            for ( int j = 0; j < (temp.length - 1); j++)
                if (temp[j].getTime() > temp[j+1].getTime()){
                    tmp = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = tmp;
                }

        for (int i = 0; i < temp.length; i++)
                if(temp[i] != null)
                    System.out.println(temp[i].toString());

       list1Model.removeAllElements();
        for (int i = 0; i < temp.length; i++)
            list1Model.addElement(temp[i].getName());
    }

    public void SortLikability(ArrayList<Recipe> x){
        Recipe[] tempL = new Recipe[2];
        int counter = 0;
        Recipe tmpL;
        for (Recipe r : x){
            tempL[counter] = r;
            counter++;
        }
        for (int i = 0; i < tempL.length; i++)
            for ( int j = 0; j < (tempL.length - 1); j++)
                if (tempL[j].getLikability() > tempL[j+1].getLikability()){
                    tmpL = tempL[j];
                    tempL[j] = tempL[j+1];
                    tempL[j+1] = tmpL;
                }

        for (int i = 0; i < tempL.length; i++)
            if(tempL[i] != null)
                System.out.println(tempL[i].toString());

        list1Model.removeAllElements();
        for (int i = 0; i < tempL.length; i++)
            list1Model.addElement(tempL[i].getName());
    }

    public void SortDifficulty(ArrayList<Recipe> x){
        Recipe[] tempD = new Recipe[2];
        int counter = 0;
        Recipe tmpD;
        for (Recipe r : x){
            tempD[counter] = r;
            counter++;
        }
        for (int i = 0; i < tempD.length; i++)
            for ( int j = 0; j < (tempD.length - 1); j++)
                if (tempD[j].getDifficulty() > tempD[j+1].getDifficulty()){
                    tmpD = tempD[j];
                    tempD[j] = tempD[j+1];
                    tempD[j+1] = tmpD;
                }

        for (int i = 0; i < tempD.length; i++)
            if(tempD[i] != null)
                System.out.println(tempD[i].toString());

        list1Model.removeAllElements();
        for (int i = 0; i < tempD.length; i++)
            list1Model.addElement(tempD[i].getName());
    }



    private void closeframe(){this.setVisible(false);}

    public static void refreshRecipeList(){
        list1Model.removeAllElements();
        for (Recipe g : NewRecipePage.array){
            list1Model.addElement(g.getName());
        }
    }

}




