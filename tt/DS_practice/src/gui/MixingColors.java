package gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MixingColors extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container contents;
	private JCheckBox red,blue,green;
	private int redValue,greenValue,blueValue;
	private JLabel label;
	
	public MixingColors() {
		super("Selecting color");
		contents=getContentPane();
		contents.setLayout(new FlowLayout());
		
		red=new JCheckBox("red");
		green=new JCheckBox("green");
		blue=new JCheckBox("blue");
		
		label=new JLabel("watch background");
		label.setOpaque(true);
		label.setForeground(Color.GRAY);
		label.setBackground(new Color(0,0,0));
		
		contents.add(red);contents.add(blue);contents.add(green);contents.add(label);
		CheckBoxHandler checkboxEvent = new CheckBoxHandler();
		red.addItemListener(checkboxEvent);
		blue.addItemListener(checkboxEvent);
		green.addItemListener(checkboxEvent);
		
		setSize(200, 175);setVisible(true);
		
	}
	private class CheckBoxHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==red){
				if(e.getStateChange()==ItemEvent.SELECTED ){
					redValue=255;
				}
				else{
					redValue=0;
				}
			}
			else if(e.getSource()==blue){
				if(e.getStateChange()==ItemEvent.SELECTED){
					blueValue=255;
					
				}
				else{
					blueValue=0;
				}
			}
			else if(e.getSource()==green){
				if(e.getStateChange()==ItemEvent.SELECTED){
					greenValue=255;
				}
				else{
					greenValue=0;
				}
			}
			label.setBackground(new Color(redValue,blueValue,greenValue));
			
		}
		
	}
	public static void main(String[] args) {
		new MixingColors().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
