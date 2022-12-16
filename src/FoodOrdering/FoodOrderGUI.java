package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public static void main(String[] args) {
        FoodOrderGUI app3 = new FoodOrderGUI();
        app3.setTitle("Food Ordering System");
        app3.setContentPane(app3.panel1);
        app3.setSize(600, 600);
        app3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app3.setVisible(true);
        app3.setLocationRelativeTo(null);

    }
}



