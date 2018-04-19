package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dinner extends JFrame {
	
	private Container contents;
	private JLabel jText;
	private JLabel jImage;
	
	public Dinner(){
		super("whats 4 dinner");
		contents=getContentPane();
		contents.setLayout(new FlowLayout());
		jText = new JLabel("maggi  ");
		jText.setForeground(Color.BLACK);
		jText.setBackground(Color.WHITE);
		jText.setOpaque(true);
		jImage = new JLabel(new ImageIcon("G:\\tt\\tt.png"));
		contents.add(jText);
		contents.add(jImage);
		setVisible(true);
		setSize(300, 200);
		
	}
	public static void main(String[] args) {
		new Dinner().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
