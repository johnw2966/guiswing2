// version 0: Frame and menus but no actions or data
import javax.swing.*;
import java.awt.*;

/** displays menus for manipulating an collection of bikes */
public class BicycleFrame0 extends JFrame {
     // one menu for standard things like open, save etc
     // another menu for bicycle-related things like add, display, increaseValue
     JMenu fileMenu, bikeMenu;
     
    /** driver which creates the frame and displays it */
    public static void main( String[] args ) {
        BicycleFrame0 frame = new BicycleFrame0();
        frame.setVisible(true);
    }
    
    /** creates the menus and populates them */
    public BicycleFrame0( ) {
        //set the frame default properties
        setTitle     ( "Bike repair shop system" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
        pane.setBackground(new Color(240,210,240));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        // build the individual menus: user-written methods
        createFileMenu();
        createBikeMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bikeMenu);
     }     
        
        /** creates and populates the File menu */       
        private void createFileMenu(){
         // create the menu
      	fileMenu = new JMenu("File");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	item = new JMenuItem("Save");
      	fileMenu.add(item);
      	
      	item = new JMenuItem("Open");
      	fileMenu.add(item);
      	
      	item = new JMenuItem("New File");
      	fileMenu.add(item);
       	// create the 'quit' option
      	fileMenu.addSeparator();
      	item = new JMenuItem("Quit");

      	fileMenu.add(item);
      }
      
      /** creates and populates the Bicycle menu */
      private void createBikeMenu(){
      	// create the menu
      	bikeMenu = new JMenu("Bicycle");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	  	
      	item = new JMenuItem("Add");
      	bikeMenu.add(item);
      	
      	item = new JMenuItem("Display");
      	bikeMenu.add(item);
      }
       // utility methods to make the code simpler 
       /** displays a String in a message dialog
        *@param s The string to be displayed */
      public void showMessage (String s){
      	JOptionPane.showMessageDialog(null,s);
      }
      
      /** displays a TextArea in a message dialog
       *@param s the Text Area to be displayed
       */
      public void showMessage (JTextArea s){
      	JOptionPane.showMessageDialog(null,s);
      }
}