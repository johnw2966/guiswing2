import javax.swing.*;
/** details of friends entered by user */
public class FriendsArray2 {
    public static void main (String[] args) {
        Person[]    friends;         //declare the friends array
        friends = new Person[4];    //and then create it

        for (int i = 0; i < friends.length; i++) {
            friends[i] = new Person( );
            //read in data values
            friends[i].setName  (JOptionPane.showInputDialog(null,"Enter name:"));
            friends[i].setAge   (Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Enter age:")));
            friends[i].setGender( JOptionPane.showInputDialog(null,"Enter gender:").charAt(0));
            
        }
        // output the details of all friends
        // note the use of for-each loop
        JTextArea area = new JTextArea();
        for (Person pp : friends)
        	area.append( pp.toString() + "\n");
        JOptionPane.showMessageDialog(null,area,"Details of my Friends", JOptionPane.PLAIN_MESSAGE);
       // equivalent display, using the for loop
       area.setText("Just the names this time..\n");
        for (int i = 0; i< friends.length; i++)
        	area.append(friends[i].getName() + "\n");
        JOptionPane.showMessageDialog(null,area,"And Again!", JOptionPane.PLAIN_MESSAGE);
        
       //------ Find the youngest and oldest person ----------//
        Person    youngest,       //points to the youngest person
                     oldest;         //points to the oldest person

        youngest = oldest = friends[0];
        // Could we use the enhanced for loop for this bit?
        for (int i = 1; i < friends.length; i++) {
            if ( friends[i].getAge() < youngest.getAge() ) {
                //found a younger person
                youngest   = friends[i];
            }
            else if ( friends[i].getAge() > oldest.getAge() ) {
                //found an older person
                oldest     = friends[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Oldest  : " + oldest.getName()
                    + " is " +   oldest.getAge() + " years old.");
       JOptionPane.showMessageDialog(null, "Youngest: " + youngest.getName()
                    + " is " + youngest.getAge() + " years old.");
 
        
        String searchName = JOptionPane.showInputDialog(null,"Name to search:");
        int i = 0;
        // could we use an enhanced for loop here?
        while ( i < friends.length &&     //still more persons to search
                !friends[i].getName().equals( searchName ) ) {
            i++;
        }

        if (i == friends.length) {
            //not found - unsuccessful search
            JOptionPane.showMessageDialog(null, searchName + " was not in the array" );

        } else {
            //found - successful search
            JOptionPane.showMessageDialog(null,"Found " + searchName + " at position " + i);
        }
    }
}