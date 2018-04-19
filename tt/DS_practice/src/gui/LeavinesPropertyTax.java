package gui;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*; //for event handling

import javax.swing.*;
import javax.swing.JPanel;
public class LeavinesPropertyTax extends JFrame
{
   //Add a frame object
   JFrame frame;
   private JPanel panel; // to hold components
   private JLabel actualValueLabel;
   private JLabel assessmentValueLabel;
   private JLabel noText;// here declared one JLabel component
   private JLabel propertyTaxLabel;
   private JTextField actualValueTF; // text field
   private JButton calcButton1;
   private JButton calcButton2;

   // start of constructor
   public LeavinesPropertyTax()
   {
       //Adding properties to JFrame
       frame = new JFrame("Property Tax");
      
       //Adding a layout
       frame.setLayout(new GridLayout(3, 2, 10, 10));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       //Building panel
       buildPanel();
      
       //Displaying frame
       frame.pack();
       frame.setVisible(true);
       
   } // end of constructor


   // start of buildPanel method
   private void buildPanel ()
   {
       // actual value label to display instructions.
       actualValueLabel = new JLabel("Enter the property value $");
    
       // assessment value label
       assessmentValueLabel = new JLabel();
       noText = new JLabel();
       // property tax label
       propertyTaxLabel = new JLabel();
    
       // actual vale text field
       actualValueTF = new JTextField(8);
    
       // calculation buttons
       calcButton1 = new JButton("Calculate Assessment Value");
       calcButton2 = new JButton("Calculate the Property Tax");

       // the action listers to the button
       calcButton1.addActionListener(new CalcButtonListener());
       calcButton2.addActionListener(new CalcButtonListener());

       // add the components to the frame
       frame.add(actualValueLabel);
       frame.add(actualValueTF);
      // frame.add(assessmentValueLabel);
      // frame.add(propertyTaxLabel);
       frame.add(calcButton1);
       frame.add(noText); //-- added noText label in between to buttons
       frame.add(calcButton2);
    
   } // end of buildPanel method


   // The class CalcButtonListener is an action listener class for the calculate button.
   private class CalcButtonListener implements ActionListener
   {
       // This method is executed when the user clicks on the button that says "calculate."
       public void actionPerformed(ActionEvent e)
       {
           String input;
           String actionCommand = e.getActionCommand();
           double amount;
           double assessmentValue;
           double propertyTax;
        
           // get the text entered by the user into the actual value text field.
           input = actualValueTF.getText();
        
           // convert the input into double
           amount = Double.parseDouble(input);
        
           // calculate the property tax
           assessmentValue = amount * 0.4;
        
           // calculate the property tax
           propertyTax = assessmentValue * 0.64 / 100;
        
           // Determine which button was clicked and display the output.
                       if (actionCommand.equals("Calculate Assessment Value"))
                       {
                           JOptionPane.showMessageDialog(null,"Assessment value: $" + assessmentValue );
                       }
                    
                       else if (actionCommand.equals("Calculate the Property Tax"))
                       {
                           JOptionPane.showMessageDialog(null,"Property tax: $" + propertyTax );
                       }
        
        
       } // end of actionPerformed method
   } // end of calcButtonListener class

   // the object to the LeavinesPropertyTex class
   public static void main(String args[])
   {
       new LeavinesPropertyTax();
   } // end of main method
} // end of LeavinesPropertyTax class