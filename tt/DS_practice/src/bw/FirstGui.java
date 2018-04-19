package bw;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class FirstGui extends JFrame{
	private Container contents;
	public FirstGui(){
		super("ffirst gui");
		
		contents=getContentPane();
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		FirstGui first = new FirstGui();
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
