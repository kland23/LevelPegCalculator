import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LevelPegCalculator {
    public static void main(String[] args) throws Exception {
        String input;
        input = JOptionPane.showInputDialog(null, "Enter A1 Reading: "); // creates dialog box to enter reading A1
        double A1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter B1 Reading: "); // creates dialog box to enter reading B1
        double B1 = Double.parseDouble(input);
        double resultOne = A1 - B1; // equation solves difference between readings A1 & B1
        DecimalFormat pattern = new DecimalFormat("##0.00");
        JOptionPane.showMessageDialog(null, "A1 - B1 = " + pattern.format(resultOne)); // creates dialog box displaying
                                                                                       // the solved equation
        input = JOptionPane.showInputDialog(null, "Enter A2 Reading: "); // creates dialog box to enter reading A2
        double A2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog(null, "Enter B2 Reading: "); // creates dialog box to enter reading B2
        double B2 = Double.parseDouble(input);
        double endResult = A2 - resultOne; // equation solves the difference between A2 - (A1 - B1)
        if (endResult == B2) {
            JOptionPane.showMessageDialog(null,
                    "Readings Check!\nNo calibration required at this time.\nEnjoy your Friday and crack a cold one.");
        } else {
            JOptionPane.showMessageDialog(null, "Calibration Required.\nError = " + pattern.format(endResult - B2)
                    + "\nBack to the shop she goes :(");
        }
    }
}