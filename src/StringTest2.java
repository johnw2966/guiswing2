import javax.swing.*;
/** compares two references to the same object */
public class StringTest2 {
	public static void main (String args[]) {
		String str1 = new String("Java");
		// create a second reference to the first object
		String str2 = str1;
		// they are referencing the same object, so are deemed ==
		if (str1 == str2)
		  JOptionPane.showMessageDialog(null,"equal");
		else
		  JOptionPane.showMessageDialog(null,"not equal");
	}
}