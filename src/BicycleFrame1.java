// version 1 actionPerformed() completed but only new system and quit implemented
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // NEW
/** manages an array of bikes, with minimal event-handling */
public class BicycleFrame1 extends JFrame implements ActionListener{
    
     JMenu fileMenu,bikeMenu;
     private Bicycle [] bikes; // an array of bikes   NEW
     int count; // number of valid bikes in the array  NEW
     
    // driver 
    public static void main( String[] args ) {
        BicycleFrame1 frame = new BicycleFrame1();
        frame.setVisible(true);
    }
    
    // constructor
    public BicycleFrame1( ) {
        newSystem();  // NEW
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
    /** initialises the array to hold a set of Bicycles  NEW
     */
      public void newSystem() {
      	bikes = new Bicycle[10];  // system will allow us to have up to 10 bikes
      	count = 0;  // at the start, we don't have any
      }
      
     /** adds a new bicycle: stub method for the moment   NEW
      **/
      public void addBicycle(){
      	showMessage("Add not implemented yet");
      }
      
      /** display a list of all bicycles; stub method for the moment NEW
       **/
      public void display(){
      	showMessage("Display not implemented yet");
      } // end display
      
      /** handles all actions: partly implemented    NEW */
      public void actionPerformed (ActionEvent e) {
      	// find out what was clicked, and proceed accordingly
      	if (e.getActionCommand() .equals ("Quit")){
      	 showMessage("Shutting down the system");
      	 System.exit(0);
      	}
      	else if (e.getActionCommand() .equals ("Add")){
      	   addBicycle(); // stub method written for this
      	}
      	else if (e.getActionCommand() .equals ("Display")){
           display();  // stub method written for this
      	}
      	else if (e.getActionCommand() .equals ("New File")){
      		newSystem(); // initialises the array and a counter
        }
      	else if (e.getActionCommand() .equals ("Save")){
      	 showMessage("Save not implemented yet");
      	}
      	
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
      	item.addActionListener(this);  // NEW
      	fileMenu.add(item);
      	item = new JMenuItem("Open");
      	item.addActionListener(this);  // NEW
      	fileMenu.add(item);
      	item = new JMenuItem("New File");
      	item.addActionListener(this);  // NEW
      	fileMenu.add(item);
      	// create the 'quit' option
      	fileMenu.addSeparator();
      	item = new JMenuItem("Quit");
      	item.addActionListener(this);  // NEW
      	fileMenu.add(item);
      }
      
      private void createBikeMenu(){
      	// create the menu
      	bikeMenu = new JMenu("Bicycle");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	
      	item = new JMenuItem("Add");
      	item.addActionListener(this);  // NEW
      	bikeMenu.add(item);
      	
      	item = new JMenuItem("Display");
      	item.addActionListener(this);   // NEW
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