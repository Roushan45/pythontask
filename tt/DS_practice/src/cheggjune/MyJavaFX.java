/*package cheggjune;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class MyJavaFX extends Application
{
   @Override // Override the start method in the Application class
   public void start(Stage primaryStage) throws Exception
   {
       double sum = 0;
      
       // Create a scene and place a button in the scene.
       Pane pane = new Pane();
       pane.setStyle("-fx-background-color: white;");
      
      
      
       Button btnPlusMinus = new Button("+-");
       btnPlusMinus.setLayoutX(0);
       btnPlusMinus.setLayoutY(300);
       btnPlusMinus.setPrefSize(60, 60);
       btnPlusMinus.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnPlusMinus.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnPlusMinus);
      
       Button btnDecimal = new Button(".");
       btnDecimal.setLayoutX(120);
       btnDecimal.setLayoutY(300);
       btnDecimal.setPrefSize(60, 60);
       btnDecimal.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnDecimal.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnDecimal);
      
       Button btnEquals = new Button("=");
       btnEquals.setLayoutX(180);
       btnEquals.setLayoutY(300);
       btnEquals.setPrefSize(60, 60);
       btnEquals.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnEquals.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnEquals);
      
       Button btnAddition = new Button("+");
       btnAddition.setLayoutX(180);
       btnAddition.setLayoutY(240);
       btnAddition.setPrefSize(60, 60);
       btnAddition.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnAddition.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnAddition);
      
       Button btnSubtraction = new Button("-");
       btnSubtraction.setLayoutX(180);
       btnSubtraction.setLayoutY(180);
       btnSubtraction.setPrefSize(60, 60);
       btnSubtraction.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnSubtraction.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnSubtraction);
      
       Button btnDivide = new Button("/");
       btnDivide.setLayoutX(180);
       btnDivide.setLayoutY(120);
       btnDivide.setPrefSize(60, 60);
       btnDivide.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnDivide.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnDivide);
      
       Button btnMultiply = new Button("X");
       btnMultiply.setLayoutX(180);
       btnMultiply.setLayoutY(60);
       btnMultiply.setPrefSize(60, 60);
       btnMultiply.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnMultiply.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnMultiply);
      
       Button btnZero = new Button("0");
       btnZero.setLayoutX(60);
       btnZero.setLayoutY(300);
       btnZero.setPrefSize(60, 60);
       btnZero.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnZero.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnZero);
          
       Button btnOne = new Button("1");
       btnOne.setLayoutX(0);
       btnOne.setLayoutY(240);
       btnOne.setPrefSize(60, 60);
       btnOne.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnOne.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnOne);
      
       Button btnTwo = new Button("2");
       btnTwo.setLayoutX(60);
       btnTwo.setLayoutY(240);
       btnTwo.setPrefSize(60, 60);
       btnTwo.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnTwo.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnTwo);
      
       Button btnThree = new Button("3");
       btnThree.setLayoutX(120);
       btnThree.setLayoutY(240);
       btnThree.setPrefSize(60, 60);
       btnThree.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnThree.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnThree);
      
       Button btnFour = new Button("4");
       btnFour.setLayoutX(0);
       btnFour.setLayoutY(180);
       btnFour.setPrefSize(60, 60);
       btnFour.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnFour.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnFour);
      
       Button btnFive = new Button("5");
       btnFive.setLayoutX(60);
       btnFive.setLayoutY(180);
       btnFive.setPrefSize(60, 60);
       btnFive.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnFive.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnFive);
      
       Button btnSix = new Button("6");
       btnSix.setLayoutX(120);
       btnSix.setLayoutY(180);
       btnSix.setPrefSize(60, 60);
       btnSix.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnSix.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnSix);
      
       Button btnSeven = new Button("7");
       btnSeven.setLayoutX(0);
       btnSeven.setLayoutY(120);
       btnSeven.setPrefSize(60, 60);
       btnSeven.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnSeven.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnSeven);
      
       Button btnEight = new Button("8");
       btnEight.setLayoutX(60);
       btnEight.setLayoutY(120);
       btnEight.setPrefSize(60, 60);
       btnEight.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnEight.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnEight);
      
       Button btnNine = new Button("9");
       btnNine.setLayoutX(120);
       btnNine.setLayoutY(120);
       btnNine.setPrefSize(60, 60);
       btnNine.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnNine.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnNine);
      
       Button btnDelete = new Button("<-");
       btnDelete.setLayoutX(120);
       btnDelete.setLayoutY(60);
       btnDelete.setPrefSize(60, 60);
       btnDelete.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnDelete.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnDelete);
      
       Button btnClear = new Button("C");
       btnClear.setLayoutX(60);
       btnClear.setLayoutY(60);
       btnClear.setPrefSize(60, 60);
       btnClear.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnClear.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnClear);
      
       Button btnPercent = new Button("%");
       btnPercent.setLayoutX(0);
       btnPercent.setLayoutY(60);
       btnPercent.setPrefSize(60, 60);
       btnPercent.setFont(Font.font("Arial",FontWeight.BOLD,22));
       btnPercent.setStyle("-fx-background-color: #F3F3F3;");
       pane.getChildren().add(btnPercent);
      
       Label myLabel = new Label("123456");
       myLabel.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,40));
       myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
       myLabel.setLayoutX(10); // set the x location of the label
       myLabel.setLayoutY(5); // set the y location of the label
       myLabel.setPrefSize(220, 60); // set the width and height of the label
       myLabel.setText("123456789"); // put some numbers into the label
       pane.getChildren().add(myLabel);
       myLabel.setText(Double.toString(sum));
      
       Scene scene = new Scene(pane,240,360, Color.WHITE);
       primaryStage.setTitle("D's Calculator"); // Set the stage title
       primaryStage.setScene(scene); // Place the scene in the stage
       primaryStage.show(); // Display the stage
   }
   public static void main(String[] args)
   {
       launch(args);
   }
}*/