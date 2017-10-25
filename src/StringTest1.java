import javax.swing.*;
/** shows that two different string objects can be created containing the same text */
public class StringTest1 {
	public static void main (String args[]) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		// == when used with objects checks are they actually the same object
		if (str1 == str2)
		  JOptionPane.showMessageDialog(null,"equal");
		else
		  JOptionPane.showMessageDialog(null,"not equal");
	}
}