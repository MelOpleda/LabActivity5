package SimpleCalc;

import javax.swing.*;
import java.awt.event.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;


    public static void main(String[] args) {
        SimpleCalcGUI app2 = new SimpleCalcGUI();
        app2.setTitle("Sample Calculator");
        app2.setContentPane(app2.pnlMain);
        app2.setSize(500, 250);
        app2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app2.setVisible(true);
        app2.setLocationRelativeTo(null);
        app2.lblResult.setEditable(false);

        app2.tfNumber1.setHorizontalAlignment(JLabel.CENTER);
        app2.tfNumber2.setHorizontalAlignment(JLabel.CENTER);
        app2.lblResult.setHorizontalAlignment(JLabel.CENTER);

        app2.cbOperations.addItem("+");
        app2.cbOperations.addItem("-");
        app2.cbOperations.addItem("*");
        app2.cbOperations.addItem("/");


    }
}
