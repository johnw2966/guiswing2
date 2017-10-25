import javax.swing.*;
/** demonstrates using a fixed array of Strings */
public class Weekdays1 {
	// set up an array of Strings to hold the days of the week, then pick one to display
	public static void main (String args[]){
		// declare and populate the array
		String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday"};// add the others yourself
		// let the user enter a day number	
		int dayNum = Integer.parseInt(JOptionPane.showInputDialog("enter a number between 1 and 4"));
		// show the corresponding day name: remember the computer indexes from 0
		JOptionPane.showMessageDialog(null,"You picked day number " + dayNum +
			          " which is " + day[dayNum-1]);
		
	}
}