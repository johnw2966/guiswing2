import javax.swing.*;
/** choose a day of the week from a JList */
public class Weekdays2JList {
	public static void main (String args[]){
		// store the days of the week in an array
		String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday"};
		// put them into a GUI object
		JList dayList = new JList(day);
		// display the GUI object in a dialog
	    JOptionPane.showMessageDialog(null,dayList,"Choose your day", JOptionPane.PLAIN_MESSAGE);
	    // find the position of the item that was selected within the dialog
	    int dayNum = dayList.getSelectedIndex();
		// display the information, using the index position of the selection
		JOptionPane.showMessageDialog(null,"You picked item number " + (dayNum+1) +
			          " which is " + day[dayNum]);
	    // or you could go straight to the object which was selected: 
	    JOptionPane.showMessageDialog(null," You picked " + dayList.getSelectedValue());	
	}
}