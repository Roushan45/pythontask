package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class HelloCheckBox extends JFrame{
	//Declared required components , checkbox , text field
	private Container contents;
	private JCheckBox box1,box2;
	private JTextField text;
	
	public HelloCheckBox(){
		//Initializing all the declared variable
		super("Hello select");
		contents=getContentPane();
		contents.setLayout(new FlowLayout());
		
		box1=new JCheckBox("checkbox1");
		box2=new JCheckBox("checkbox2");
		text=new JTextField(10);
		//Adding components to content pane
		contents.add(box1);
		contents.add(box2);
		contents.add(text);
		//Created object of Evenhandler class
		CheckBoxHandler handler = new CheckBoxHandler();
		//added item listener to box1 and box2
		box1.addItemListener(handler);
		box2.addItemListener(handler);
		//setting the size of frame
		setSize(300, 250);
		setVisible(true);
	}
	//private inner class for event handling
	private class CheckBoxHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
					if(e.getSource()==box1|| (e.getSource()==box2)){
						//if only box1 will selected
						if(box1.isSelected()&&(!box2.isSelected())){
							text.setText("hello");
						}
						//if only box2 will selected
						else if(box2.isSelected()&&(!box1.isSelected())){
							text.setText("HELLO");
						}
						//if both boxes will selected
						else if(box1.isSelected()&&box2.isSelected()){
							text.setText("HeLlO");
						}
						//if none boxes selected
						else if((!box1.isSelected())&&(!box2.isSelected())){
							text.setText("");
						}
					}
			}
		
	}
	//main method for running the program
	public static void main(String[] args) {
		
		HelloCheckBox check = new HelloCheckBox();
		check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
