import javax.swing.*;
/** uses .equals method to compare the content of two different string objects */
public class StringTest3 {
	public static void main (String args[]) {
		String str1 = new String("Java");
		String str2 = new String("Java");
		/** the .equals() method for Strings checks the content of the two objects */
		if (str1.equals(str2))
		  JOptionPane.showMessageDialog(null,"equal");
		else
		  JOptionPane.showMessageDialog(null,"not equal");
	}
}