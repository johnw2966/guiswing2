//import java.util.*;  // note the import statement
import javax.swing.*;
/** person algorithms */
public class FriendsArray4 {
    public static void main(String[] arg) {
        Person   person;
        Person [] friends; // declare a list of Persons

        friends = new Person[4];

        friends[0] = new Person("Jane", 20, 'F');
        friends[1] = new Person("Jack",  16, 'M');
        friends[2] = new Person("Jill", 81, 'F');
        friends[3] = new Person("John", 24, 'M');
        displayAll(friends);
        showAllYoungerThan(21, friends);
        calcAverageAge(friends);
        int youngest = findYoungest(friends);
        JOptionPane.showMessageDialog(null,"Youngest person is: " + friends[youngest].getName());
    }

      public static int findYoungest(Person []friends){
    	int lowIdx = 0;
    	for (int i = 0; i<friends.length; i++)
    		if (friends[i].getAge() < friends[lowIdx].getAge())
    			lowIdx = i;
        return lowIdx;
      }

      public static void calcAverageAge(Person [] friends){
   	    int total = 0;
   	    int count = 0;
        for (int i = 0; i<friends.length; i++){
        	 total += friends[i].getAge();
        	 count++;
        }
        JOptionPane.showMessageDialog(null,"Total Age: " + total +
        	                           "\nNumber of Friends: " + count +
        	                           "\nAverage Age: " + (double) total / count);
   }

   public static void showAllYoungerThan(int x, Person [] friends){
   	    JTextArea output = new JTextArea("Those younger than " + x + "\n");
        for (int i = 0; i<friends.length; i++){
        	  if (friends[i].getAge() < x)
                output.append( friends[i].toString( ) + "\n" );
        }
        JOptionPane.showMessageDialog(null,output);
   }

    public static void displayAll(Person [] friends){
    	JTextArea output = new JTextArea("My Friends\n");
        for (int i = 0; i<friends.length; i++){
              output.append( friends[i].toString( ) + "\n" );
        }
        JOptionPane.showMessageDialog(null,output);
    }
}