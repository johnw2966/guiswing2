import javax.swing.*;
/** initialises an array of doubles and averages it using enhanced 'for' loop */
public class Rain {
    public static void main(String[] args) {
       // double[] rainfall = new double[12];
 		double [] rainfall = {1.1, 2.2, 3.0, 2.1,
 							  0.2, 3.0, 1.5, 2.9,
 							  3.1, 0.1, 2.1, 1.0};

		double   annualAverage,
		 sum = 0.0;

		for (double number : rainfall) {
			sum += number;
		}
		annualAverage = sum / rainfall.length;
		
		String output = String.format("%-25s %6.2f\n","Average monthly rainfall ",annualAverage);
		JOptionPane.showMessageDialog(null,output);
    }
}
