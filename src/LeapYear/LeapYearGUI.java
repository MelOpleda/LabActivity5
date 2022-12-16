package LeapYear;

import javax.swing.*;
import java.awt.event.*;

public class LeapYearGUI extends JFrame implements ActionListener {
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;


    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.pnlMain);
        app.setSize(500, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setLocationRelativeTo(null);

        app.btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int year;
                try {
                    year = Integer.parseInt(app.tfYear.getText());
                } catch (NumberFormatException numberFormatException) {
                    return;
                }
                if(((year %4 == 0)&&(year %100 != 0))||year %400 == 0)
                    JOptionPane.showMessageDialog(null, "Leap year");
                else
                    JOptionPane.showMessageDialog(null, "Not a leap year");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

