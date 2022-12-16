package FoodOrdering;

import javax.swing.*;
import java.awt.event.*;

public class FoodOrderGUI extends JFrame implements ActionListener {
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

        app3.btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total = 0.0;

                if(app3.cPizza.isSelected()){
                    total+=100;
                }
                if(app3.cBurger.isSelected()){
                    total+=80;
                }
                if(app3.cFries.isSelected()){
                    total+=65;
                }
                if(app3.cSoftDrinks.isSelected()){
                    total+=55;
                }
                if(app3.cTea.isSelected()){
                    total+=50;
                }
                if(app3.cSundae.isSelected()){
                    total+=40;
                }

                if(app3.rb5.isSelected()){
                    double discount = 100 - 5;
                    total*=discount/100;
                }
                else if(app3.rb10.isSelected()){
                    double discount = 100 - 10;
                    total*=discount/100;
                }
                else if(app3.rb15.isSelected()){
                    double discount = 100 - 15;
                    total*=discount/100;
                }
                    JOptionPane.showMessageDialog(null,String.format("The total price is Php %.2f", total));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}



