import java.util.*;  // note the import statement
import javax.swing.*;
/** creates an array of persons */
public class FriendsArray1 {
    public static void main(String[] arg) {
        Person   person;
        Person [] friends; // declare the array
        //Create the array, then create each member
        // details are hard-coded, to speed up the running of it
        friends = new Person[4];

        friends[0] = new Person("Jane", 10, 'F');
        friends[1]= new Person("Jack",  6, 'M');
        friends[2] = new Person("Jill",  8, 'F');
        friends[3]= new Person("John", 14, 'M');
        
        // display the array to the console
        for (int i = 0; i<friends.length; i++){
            System.out.println( friends[i].toString() );
        }
       // display the array to a text area 
        JTextArea output = new JTextArea("My Friends\n");
        for (int i = 0; i<friends.length; i++){
              output.append( friends[i].getName( ) + "\n" );
        }
        JOptionPane.showMessageDialog(null,output);
        
       // use a for-each loop to generate this display
       // reuse the same text area: setText() clears the old text
        output.setText("My Friends Again\n");
        for (Person pp : friends)
        	output.append(pp.getName() + "\n");
        JOptionPane.showMessageDialog(null,output);
    }
}