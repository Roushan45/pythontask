/*package chegg;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Name2 extends Application{
	 @Override 
	   public void start(Stage stage) {       
	      //Creating a Text_Example object 
	      Text text1 = new Text("Your Name");       
	      
	      //Setting font to the text 
	      text1.setFont(Font.font("arial", FontPosture.REGULAR, 20));
	      //setting the underline of text
	      text1.setUnderline(true);
	      //setting the text color to blue
	      text1.setFill(Color.BLUE);
	      
	      //setting text to rotate 45degree clockwise
	      text1.setRotate(45);
	      	      
	      
	      //setting the position of the text 
	      text1.setX(150); 
	      text1.setY(90);     
	      
	      //Striking through the text 
	      //text1.setStrikethrough(true); 
	       
	             
	      //Creating a Group object  
	      Group root = new Group(text1);   
	               
	      //Creating a scene object
	      Scene scene = new Scene(root, 400, 200);  
	      
	      //Setting title to the Stage 
	      stage.setTitle("Name2_45degreeRotate"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene); 
	         
	      //Displaying the contents of the stage 
	      stage.show(); 
	   }      
	 public static void main(String args[]){ 
	      launch(args); 
	   } 
}
*/