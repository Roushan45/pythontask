package cheggapril;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class BankPanel extends JFrame{
	//1. declare instance variables in panel class level
	// create components
	private JLabel balanceL, optionL, withdrawL, depositL, remainingL,dummy;
	private JTextField withdraw, deposit, remaining;
	private JButton balance, Clear;
	private JRadioButton withdrawR, depositR;
	//private ButtonGroup buttonGroup;
	private Container contents;

	//panel constructor
	BankPanel(){

		//initializing components
		super("Transaction operation");
		contents=getContentPane();
		contents.setLayout(new FlowLayout());
		balanceL = new JLabel ("Bank account balance: $5826");
		optionL = new JLabel ("Select your option: ");
		withdrawL = new JLabel ("How much would you like to withdraw?: ");
		depositL = new JLabel ("How much would you like to deposit?: ");
		remainingL = new JLabel ("Remaining balance: ");
		dummy = new JLabel();
	
		withdraw = new JTextField(10);
		deposit = new JTextField(10);
		remaining = new JTextField(10);

		//Buttons

		balance = new JButton ("Balance");
		Clear = new JButton ("Clear");

		//Radio buttons (must be grouped together)
		withdrawR = new JRadioButton("Withdraw");
		depositR = new JRadioButton("Deposit");



		//Listeners
		balance.addActionListener(new remainingListener());
		Clear.addActionListener(new ClearListener());

		//Adding components to panel

		contents.add (balanceL);
		//add(transGroup); 
		
		contents.add (optionL);
		contents.add(new JLabel());
		//contents.add(new JLabel());
		contents.add (withdraw);
		//you missing here 
		//jbutton should also be added
		contents.add (deposit);
		contents.add(withdrawR);
		contents.add(depositR);
		ButtonGroup transGroup = new ButtonGroup();
		transGroup.add(withdrawR);
		transGroup.add(depositR);
		contents.	add (withdrawL);
		contents.	add (withdraw);
		
		contents.add (depositL);
		contents.add (deposit);

		contents.add (remainingL);
		contents.add (remaining);

		contents.add (balance);
		contents.add (Clear);

		//Size and background for panel
		//panel.setVisible(true);
		//making the pane visible
		setSize(200, 400);
		setVisible(true);
		setBackground(Color.red);
	}

	private class remainingListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event){

			double w, d ;
			double amount= 5826;
			if(event.getSource()==balance){

				//modified here
				//operations performed on basic of 
				//current button selected
				//for withdraw
				if(withdrawR.isSelected()){
					String withdrawText = withdraw.getText();
					w = Double.parseDouble(withdrawText);
					amount=amount-w;
					remaining.setText(String.valueOf(amount));
					withdraw.setText("");
					
				}
				//for deposit
				if(depositR.isSelected()){
					String depositText = deposit.getText();
					d = Double.parseDouble(depositText);
					amount = amount+d;
					remaining.setText(String.valueOf(amount));
					deposit.setText("");
				}
			} }}
	// Clear push button-- listener
	private class ClearListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event){
			//clear info from text fields
			withdraw.setText("");
			deposit.setText("");
			remaining.setText("");
			//clear info from balance label
			remainingL.setText("");
		}
	}
	//main method
	public static void main(String[] args) {
		//created object of bankpanel
	BankPanel obj=	new BankPanel();
	obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

