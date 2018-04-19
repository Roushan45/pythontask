package cheggapril;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ListAnimal extends JFrame{
	//added two button one for animal adding and one for
	//exit the GUI
	private JButton addAnimal,close;
	//for list view added JtextArea
	private JTextArea listView;

	//default constructor for initializing 
	//the components
	public ListAnimal() {
		//created frame
		JFrame frame = new JFrame("Add Animal");
		//added jpanel and set layout to GridLayout
		JPanel panel = new JPanel(new GridLayout());
		//panel added for buttons
		JPanel rightPanel = new JPanel(new GridLayout(10,0,10,10));
		//components intialized
		listView = new JTextArea(3,50);
		addAnimal = new JButton("Add Animal");
		close = new JButton("close");
		//components added to panel
		panel.add(listView);
		//panel added to frame
		frame.add(panel);
		rightPanel.add(addAnimal);
		rightPanel.add(close);
		frame.add(rightPanel,BorderLayout.EAST);
		
		//added listener for close buton
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		//added listener for addAnimal button
		addAnimal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//here taking input using joptionpane
				String text=JOptionPane.showInputDialog("Enter Animal Name");
				//appending name to list
				listView.append(text+"\n");

			}
		});
		//making frame visible
		frame. setVisible(true);
		//setting the frame size
		frame. setSize(400, 600);

	}
	//main method
	public static void main(String[] args) {
		//calling the default constructor
		ListAnimal listGUI=new ListAnimal();
		listGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
