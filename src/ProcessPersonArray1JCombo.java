import javax.swing.*;
/** version which displays the names of all the people in a combo box */
public class ProcessPersonArray1JCombo {
	// sets up an array of 4 persons, displays their names in a JComboBox
	// then lets the user pick one of the names
    public static void main (String[] args) {
        Person[]    person;         //declare the person array
        person = new Person[4];    //and then create it

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person( );
            //read in data values
            person[i].setName  (JOptionPane.showInputDialog(null,"Enter name:"));
            person[i].setAge   (Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Enter age:")));
            person[i].setGender( JOptionPane.showInputDialog(null,"Enter gender:").charAt(0));
            
        }
        // create a combo box
        JComboBox names = new JComboBox();
        // add all the names into it
        for (Person pp : person)
        	names.addItem( pp.getName() );
        // Allow the user to pick one name from the combo box
        JOptionPane.showMessageDialog(null,names,"Person list", JOptionPane.PLAIN_MESSAGE);
        // find the index position of the one selected
        int idx = names.getSelectedIndex();
        // display this item from the array
        JOptionPane.showMessageDialog(null,"The person you picked was person no " + idx +
        	" whose full details are as follows: \n" + person[idx].toString());
    }
}