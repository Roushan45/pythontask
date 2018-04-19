package gui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ChangingColor extends JFrame{
	
	private Container contents;
	private JRadioButton red, green,blue;
	private ButtonGroup colorGroup;
	private JLabel label;
	private Color selectColor = Color.RED;
	
	public ChangingColor(){
		super("selecting a color");
		contents = getContentPane();
		contents.setLayout(new FlowLayout());
		
		red=new JRadioButton("red",true);
		blue=new JRadioButton("blue");
		green = new JRadioButton("Green");
		
		label=new JLabel("watch changing color");
		label.setForeground(Color.GRAY);
		label.setOpaque(true);
		label.setBackground(selectColor);
		
		contents.add(red);contents.add(blue);contents.add(green);
		contents.add(label);
		
		colorGroup = new ButtonGroup();
		colorGroup.add(red);colorGroup.add(blue);colorGroup.add(green);
		
		RadioButtonHandler  radio=  new RadioButtonHandler();
		red.addItemListener(radio);
		blue.addItemListener(radio);
		green.addItemListener(radio);
		
		setSize(200, 175);
		setVisible(true);
		
	}
	private class RadioButtonHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==red){
				selectColor=Color.RED;
				
			}
			if(e.getSource()==blue){
				selectColor = Color.BLUE;
			}
			if(e.getSource()==green){
				selectColor=Color.GREEN;
			}
			label.setBackground(selectColor);
			
		}
		
	}
	public static void main(String[] args) {
		ChangingColor chngecolor = new ChangingColor();
		chngecolor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
