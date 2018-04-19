package cheggapril;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

public class GUIFileModify extends JFrame{
	//declared instance required variables
	private String text="";
	private File selectedFile;
    private JButton save = new JButton("Save and Close");
    private JFrame frame=new JFrame("Edit the Text");
    private JButton exit = new JButton("Exit");
   
    private JTextArea textArea = new JTextArea(text,0,100);
	public GUIFileModify() {
		readFile();
		buildPanel();
	}
	//this method will build panel
	private void buildPanel(){
		//created new panel of grid layout
		JPanel panel = new JPanel(new GridLayout());
        JPanel rightPanel = new JPanel(new GridLayout(15,0,10,10));
        //making layout as scrollable
         JScrollPane scroller=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //adding components to panel
         panel.add(scroller);
        
         frame.add(panel);
         frame.getContentPane().add(rightPanel,BorderLayout.EAST);
         rightPanel.add(save);
         rightPanel.add(exit);
         //adding listener for exit button
         exit.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e)
                   {
                       frame.dispose();

                   }
       });
         //adding listener for exit button
         save.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent e) {
               saveFileOperation();
               frame.dispose();

           }
       });
         //setting frame size
          frame.setSize(500, 500);
          frame.setVisible(true);   
         

}
//method for saving the file
	 private void saveFileOperation(){
	        FileWriter out=null;


	        try {
	            out = new FileWriter(selectedFile);     
	            out.write(textArea.getText());
	            out.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	  }
	 //method for reading the file using
	 //JFileChooser and filereader
	 private void readFile(){
		 JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		
			int returnValue = fileChooser.showOpenDialog(null);

			if (returnValue == JFileChooser.APPROVE_OPTION) {
				selectedFile = fileChooser.getSelectedFile();
			}
			try {
				FileReader reader= new FileReader(selectedFile);
		          Scanner scanner = new Scanner(reader);
		             while(scanner.hasNextLine()){
		              String line=scanner.nextLine()+"\n";
		              text=text+line;
		             }
		             //after reading file setting to text area
		             textArea.setText(text);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	 }



	public static void main(String[] args) {

		//calling the constructor
		new GUIFileModify();

	}

}