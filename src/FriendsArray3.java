import javax.swing.*;
/** user doesn't fill the array */
public class FriendsArray3 {
    public static void main (String[] args) {
        Person[]    friends;         //declare the friends array
        friends = new Person[10];    //and then create it
		int response;
		int numFriends;
        int i = 0;
        do {
            friends[i] = new Person( );
            //read in data values
            friends[i].setName  (JOptionPane.showInputDialog(null,"Enter name:"));
            friends[i].setAge   (Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Enter age:")));
            friends[i].setGender( JOptionPane.showInputDialog(null,"Enter gender:").charAt(0));
            i++;
            response = JOptionPane.showConfirmDialog(null,"Another friend?");
        } while (response == JOptionPane.YES_OPTION);
        numFriends = i;
        
        // output the details of all friends
       JTextArea area = new JTextArea("The full list of friends\n");
       for (i = 0; i< friends.length; i++) // reuse the same 'i'
        	area.append(friends[i] + "\n");
       JOptionPane.showMessageDialog(null,area,"And Again!", JOptionPane.PLAIN_MESSAGE);
       // now output only the valid ones
       area.setText("Now just the valid ones...\n");
        for (i = 0; i< numFriends; i++)
        	area.append(friends[i] + "\n");
        JOptionPane.showMessageDialog(null,area,"And Again!", JOptionPane.PLAIN_MESSAGE);
     // program crashes when you try to extract a name from a null friends
       area.setText("Now just the names...\n");
        for (i = 0; i< friends.length; i++)
        	area.append(friends[i].getName() + "\n");
        JOptionPane.showMessageDialog(null,area,"My Friends", JOptionPane.PLAIN_MESSAGE);
    
    }
}