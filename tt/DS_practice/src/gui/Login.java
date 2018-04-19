package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container contents;
	private JLabel idLabel, passwordLabel,message;
	private JTextField id;
	private JPasswordField password;
	private JTextArea legal;
	
	public Login(){
		super("Login Screen");
		contents = getContentPane();
		contents.setLayout(new FlowLayout());
		idLabel = new JLabel("Enter Id");
		id=new JTextField("",12);
		passwordLabel = new JLabel("Enter Password");
		password=  new JPasswordField(8);
		password.setEchoChar('$');
		message = new JLabel("Log in above");
		
		legal = new JTextArea("dobt use fir phishing\n"+
								"it will be punishable");
		
		legal.setEditable(false);
		
		contents.add(idLabel);
		contents.add(id);
		contents.add(passwordLabel);
		contents.add(password);
		contents.add(message);
		contents.add(legal);
		TextFieldHandler listener = new TextFieldHandler();
		id.addActionListener(listener);
		//password.addActionListener(listener);
		setSize(250, 200);
		setVisible(true);
		
	}
	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//  Auto-generated method stub
			if((id.getText().equals("Rakesh"))
			&&new String(password.getPassword()).equals("Rakesh")){
				message.setForeground(Color.BLACK);
				message.setText("Welcome Rakesh");
				
			}
			else{
				message.setForeground(Color.RED);
				message.setText("Something goes wrong");
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		Login login = new Login();
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
