package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LeavinesCheckBoxes extends JFrame
{
    private JLabel messageLabel; // A message for the user
    private JCheckBox blueCheckBox; // To select blue background
    private JCheckBox orangeCheckBox; // To select orange foreground
    private final int WINDOW_WIDTH = 500; // Window width
    private final int WINDOW_HEIGHT = 300; // Window height
    
    public  LeavinesCheckBoxes()
    {
        
        // Set the text for the title bar. 
        setTitle("Color Check Boxes");
        
        // Set the size of the window. 
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
    // Specify an action for the close button. 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a label. 
        messageLabel = new JLabel("Click the check boxes.");
        
        // Create the check boxes. 
        blueCheckBox = new JCheckBox("BLUE");
        orangeCheckBox = new JCheckBox("ORANGE"); 
        
        // Add an item listener to the check boxes. 
        blueCheckBox.addItemListener(new CheckBoxListener());
        orangeCheckBox.addItemListener(new CheckBoxListener());
        
        // Add a FlowLayout manager to the content pane. 
        setLayout(new GridLayout(1,2));
        
        // Add the label and check boxes to the content pane. 
        add(messageLabel); 
        add(blueCheckBox);
        add(orangeCheckBox);
        
        // Display the window. 
        setVisible(true);
    }
    
    private class CheckBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
        	//here taking both the source if any one changes it will trigger event
            if(e.getSource()==blueCheckBox || e.getSource()==orangeCheckBox){
            	//case 1 only blue checkbox is selected
            	if(blueCheckBox.isSelected()&& !orangeCheckBox.isSelected()){
            		// It was selected so therefore the background will appear blue. 
                    getContentPane().setBackground(Color.blue);
                      blueCheckBox.setBackground(Color.blue);
                      orangeCheckBox.setBackground(Color.blue);
                     
                      // It was selected so therefore the foreground will appear yellow.
                      getContentPane().setForeground(Color.yellow);
                      blueCheckBox.setForeground(Color.yellow);
                      orangeCheckBox.setForeground(Color.yellow);
            	}
            	//case 2 only blue orangecheckbox is selected
            	else if(!blueCheckBox.isSelected()&& orangeCheckBox.isSelected()){
            		// Set the two check boxes to light gray. 
            		getContentPane().setBackground(Color.orange);
                    blueCheckBox.setBackground(Color.orange);
                    orangeCheckBox.setBackground(Color.orange);
                  
                    getContentPane().setForeground(Color.white);
                    blueCheckBox.setForeground(Color.white);
                    orangeCheckBox.setForeground(Color.white);
            	}
            	//case 3 both checkbox selected
            	else if(blueCheckBox.isSelected()&& orangeCheckBox.isSelected()){
            		getContentPane().setBackground(Color.blue);
                    blueCheckBox.setBackground(Color.blue);
                    orangeCheckBox.setBackground(Color.blue);
                    getContentPane().setForeground(Color.orange);
                    blueCheckBox.setForeground(Color.orange);
                    orangeCheckBox.setForeground(Color.orange);
            	}
            	////case 4 no check box selected
            	else if(!blueCheckBox.isSelected()&& !orangeCheckBox.isSelected()){
            		getContentPane().setBackground(Color.gray);
                    blueCheckBox.setBackground(Color.gray);
                    orangeCheckBox.setBackground(Color.gray);
                    
                    getContentPane().setForeground(Color.black);
                       blueCheckBox.setForeground(Color.black);
                       orangeCheckBox.setForeground(Color.black);
            	}
            }
             }
            }
                     
                   public static void main(String[] args)
                   {
                   new LeavinesCheckBoxes();
                   }
    }