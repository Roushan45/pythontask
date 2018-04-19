package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleMath extends JFrame {
	
	private Container contents;
	private JLabel operandLabel, resultLabel,result;
	private JTextField operand;
	private JButton square,cube;
	
	public SimpleMath(){
		super("simple Math");
		contents=getContentPane();
		contents.setLayout(new FlowLayout());
		operandLabel =new JLabel("Enter Number");
		operand=new JTextField(5);
		square = new JButton("suare");
		cube = new JButton("cube");
		
		resultLabel = new JLabel("Result");
		result = new JLabel("?????");
		
		contents.add(operandLabel);
		contents.add(operand);
		contents.add(square);
		contents.add(cube);
		contents.add(resultLabel);
		contents.add(result);
		ButtonHandler btn = new ButtonHandler();
		square.addActionListener(btn);
		cube.addActionListener(btn);
		setSize(300, 275);
		setVisible(true);
		
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double op = Double.parseDouble(operand.getText());
			
			if(e.getSource()==square){
				result.setText((new Double(op*op)).toString());
			}
			else if(e.getSource()==cube){
				result.setText((new Double(op*op*op)).toString());
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		SimpleMath math = new SimpleMath();
		math.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
