// version 2 Add records and store in an array: display the array
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** manages an array of bikes: add and display implemented, but only for owner name */
public class BicycleFrame2 extends JFrame implements ActionListener{

     JMenu fileMenu,bikeMenu;
     Bicycle [] bikes; // an array of bikes
     int count; // number of valid bikes in the array

    // driver
    public static void main( String[] args ) {
        BicycleFrame2 frame = new BicycleFrame2();
        frame.setVisible(true);
    }

    // constructor
    public BicycleFrame2( ) {
        newSystem(); // create the array and set the count to 0
        //set the frame default properties
        setTitle     ( "Bike repair shop system" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
      //  pane.setBackground(Color.blue);
        pane.setBackground(new Color(240,210,240));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        createFileMenu();
        createBikeMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bikeMenu);
     }

      public void newSystem() {
      	bikes = new Bicycle[10];
      	count = 0;
      }

      /** adds a new bicycle to the system, getting the details from the user
       */   // NEW
      public void addBicycle(){
      	Bicycle temp = new Bicycle();
      	temp.setOwner(JOptionPane.showInputDialog("Who owns this bike?"));
      	bikes[count] = temp; // 'default bike
      	// set the attributes: ask the user for owner name etc
      	count++; // now there is one more bike in the system
      }

      /** Displays a list of all bicycles in a JTextArea
       */  // NEW
      public void display(){
      	JTextArea area = new JTextArea();
      	if (count>0) {
      	  area.setText("Bicycle List: \n\n");
      	  for (int i = 0; i<count; i++) // loop over existing bikes, rather than array size
      	    area.append("Bike no: " + i + " " +bikes[i].toString()+"\n");
      	  showMessage(area);
      	}
      	else
      	    showMessage("No bicycles in the system");
      } // end display

      public void actionPerformed (ActionEvent e) {
      	if (e.getActionCommand() .equals ("Quit")){
      	 showMessage("Shutting down the system");
      	 System.exit(0);
      	}
      	else if (e.getActionCommand() .equals ("Add")){
      	   addBicycle(); // branch to a separate method
      	}
      	else if (e.getActionCommand() .equals ("Display")){
           display();
      	}
      	else if (e.getActionCommand() .equals ("New File")){
      		newSystem();
        }
      	else if (e.getActionCommand() .equals ("Save")){
      	 showMessage("Save not implemented yet");
      	}// else if

      	else if (e.getActionCommand() .equals ("Open")){
      	 showMessage("Open not implemented yet");
      	}
      	else
      	  showMessage("I have no idea what you clicked");
      } // actionPerformed

        private void createFileMenu(){
         // create the menu
      	fileMenu = new JMenu("File");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	item = new JMenuItem("Save");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	item = new JMenuItem("Open");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	item = new JMenuItem("New File");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	// create the 'quit' option
      	fileMenu.addSeparator();
      	item = new JMenuItem("Quit");
      	item.addActionListener(this);
      	fileMenu.add(item);
      }

      private void createBikeMenu(){
      	// create the menu
      	bikeMenu = new JMenu("Bicycle");
      	// declare a menu item (re-usable)
      	JMenuItem item;

      	item = new JMenuItem("Add");
      	item.addActionListener(this);
      	bikeMenu.add(item);

      	item = new JMenuItem("Display");
      	item.addActionListener(this);
      	bikeMenu.add(item);
      }
       /** utility methods to make the code simpler */
      public void showMessage (String s){
      	JOptionPane.showMessageDialog(null,s);
      }

      public void showMessage (JTextArea s){
      	JOptionPane.showMessageDialog(null,s);
      }
}