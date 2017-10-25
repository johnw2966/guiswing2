import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Displays a Frame which has a text area, a text field and two buttons
 */
public class TextAreaExample extends JFrame implements ActionListener {
    // declare all the GUI objects: they will be built in the constructor
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;

    public static void main(String[] args) {
        TextAreaExample frame = new TextAreaExample();
        frame.setVisible(true);
    }

    public TextAreaExample() {
        //set the frame properties
        setTitle     ("JTextArea Example");
        setSize      (300,250);
        setLocation  (250,100);
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
		// set the layout to flow
        Container cPane;
        cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());
        
        // create and add the text area
        textArea = new JTextArea(8,22);
        textArea.setEditable(false);
        cPane.add(textArea);
        
        //add the text field
        inputLine = new JTextField(22);
        //inputLine.setFont(new Font("Courier", Font.PLAIN, 14));
        cPane.add(inputLine);
        inputLine.addActionListener(this);
        
        //create and place two buttons on the frame
        addButton = new JButton("Add");
        cPane.add(addButton);

        clearButton = new JButton("Clear");
        cPane.add(clearButton);

        //register this frame as an action listener of the two buttons
        clearButton.addActionListener(this);
        addButton.addActionListener(this);
    }

    /** Standard method to respond the action event.
     * @param e the ActionEvent object     */
    public void actionPerformed(ActionEvent e) {
    	 if (e.getSource() == addButton )
                  addText(inputLine.getText());
         else if (e.getSource() == clearButton)
                clearText( );
         else 
            addText(inputLine.getText());
     } // end actionPerformed
            
    /** user-written method to add a line of text to the text area 
     * @param newline the line to be added
     **/ 
     private void addText(String newline) {
        textArea.append(newline +"\n");
        inputLine.setText("");
    }
	/** user-written method to empty the text area */
    private void clearText( ) {
        textArea.setText("\n");
        inputLine.setText("\n");
    }
}