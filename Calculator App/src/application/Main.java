package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class Main extends Application {
	
	Label empty = new Label("");
	TextField tfOutput = new TextField();
	Label lbResult = new Label("");
	Button btAdd = new Button("+");
	Button btSubtract = new Button("-");
	Button btMultiply = new Button("*");
	Button btDivide = new Button("/");
	Button btClear = new Button("C");
	Button btDelete = new Button("<-");
	Button btOne = new Button("1");
	Button btTwo = new Button("2");
	Button btThree = new Button("3");
	Button btFour = new Button("4");
	Button btFive = new Button("5");
	Button btSix = new Button("6");
	Button btSeven = new Button("7");
	Button btEight = new Button("8");
	Button btNine = new Button("9");
	Button btZero = new Button("0");
	Button btComa = new Button(",");
	Button btEqual = new Button("=");
	
	Font myFont = new Font("Comic Sans MS",15);
	
	private double result = 0;
	double num1;
	double num2;
	char operator;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			btAdd.setMinWidth(50);
			btAdd.setMinHeight(50);
			
			btOne.setMinWidth(50);
			btOne.setMinHeight(50);
			
			btTwo.setMinWidth(50);
			btTwo.setMinHeight(50);
			
			btThree.setMinWidth(50);
			btThree.setMinHeight(50);
			
			btClear.setMinWidth(50);
			btClear.setMinHeight(50);
			
			btDelete.setMinWidth(50);
			btDelete.setMinHeight(50);
			
			btFour.setMinWidth(50);
			btFour.setMinHeight(50);
			
			btFive.setMinWidth(50);
			btFive.setMinHeight(50);
			
			btSix.setMinWidth(50);
			btSix.setMinHeight(50);
			
			btSubtract.setMinWidth(50);
			btSubtract.setMinHeight(50);
			
			btSeven.setMinWidth(50);
			btSeven.setMinHeight(50);
			
			btEight.setMinWidth(50);
			btEight.setMinHeight(50);
			
			btNine.setMinWidth(50);
			btNine.setMinHeight(50);
			
			btMultiply.setMinWidth(50);
			btMultiply.setMinHeight(50);
			
			btComa.setMinWidth(50);
			btComa.setMinHeight(50);
			
			btEqual.setMinWidth(50);
			btEqual.setMinHeight(50);
			
			btZero.setMinWidth(50);
			btZero.setMinHeight(50);
			
			btDivide.setMinWidth(50);
			btDivide.setMinHeight(50);
			
			tfOutput.setMinWidth(215);
			tfOutput.setMinHeight(40);
			tfOutput.setEditable(false);
			tfOutput.setFont(myFont);
			
			GridPane p1 = new GridPane();
			
			p1.setAlignment(Pos.CENTER);
			p1.setHgap(5);
			p1.setVgap(5);
			
			p1.add(btClear, 2, 1);
			p1.add(btDelete, 3, 1);
			
			p1.add(btOne, 0, 2);
			p1.add(btTwo, 1, 2);
			p1.add(btThree, 2, 2);
			p1.add(btAdd, 3, 2);
			
			p1.add(btFour, 0, 3);
			p1.add(btFive, 1, 3);
			p1.add(btSix, 2, 3);
			p1.add(btSubtract, 3, 3);
			
			p1.add(btSeven, 0, 4);
			p1.add(btEight, 1, 4);
			p1.add(btNine, 2, 4);
			p1.add(btMultiply, 3, 4);

			p1.add(btComa, 0, 5);
			p1.add(btZero, 1, 5);
			p1.add(btEqual, 2, 5);
			p1.add(btDivide, 3, 5);
			
			GridPane p2 = new GridPane();
			p2.setAlignment(Pos.TOP_CENTER);
			p2.setHgap(5);
			p2.setVgap(5);
		
			p2.add(empty, 0, 0);
			p2.add(lbResult, 0, 2);
			p2.add(tfOutput, 0, 1);
			lbResult.setMaxHeight(40);
			lbResult.setMaxWidth(200);
			
			
			
			BorderPane borderPane= new BorderPane();
			borderPane.setCenter(p1);
			borderPane.setTop(p2);
			
			
			Scene scene = new Scene(borderPane,300,370);
			primaryStage.setTitle("CALCULATOR");
			primaryStage.setScene(scene); primaryStage.show();
			
			btOne.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("1"));
			});
			
			btTwo.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("2"));
			});
			
			btThree.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("3"));
			});
			
			btFour.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("4"));
			});
			
			btFive.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("5"));
			});
			
			btSix.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("6"));
			});
			
			btSeven.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("7"));
			});
			
			btEight.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("8"));
			});
			
			btNine.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("9"));
			});
			
			btZero.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat("0"));
			});
			
			btClear.setOnAction(e -> {
				result = 0;
				lbResult.setText("");
				empty.setText("");
				tfOutput.clear();
			});
			
			btDelete.setOnAction(e -> {
				if(!(tfOutput.getText().equals(""))) {
					tfOutput.setText(tfOutput.getText(0, tfOutput.getLength()-1));
				}
			});
			
			btComa.setOnAction(e -> {
				tfOutput.setText(tfOutput.getText().concat(","));
			});
			
			btAdd.setOnAction(e -> {
				num1 = Double.parseDouble(tfOutput.getText());
				operator = '+';
				tfOutput.clear();
			});
			
			btSubtract.setOnAction(e -> {
				num1 = Double.parseDouble(tfOutput.getText());
				operator = '-';
				tfOutput.clear();
			});
			
			btDivide.setOnAction(e -> {
				num1 = Double.parseDouble(tfOutput.getText());
				operator = '/';
				tfOutput.clear();
			});
			
			btMultiply.setOnAction(e -> {
				num1 = Double.parseDouble(tfOutput.getText());
				operator = '*';
				tfOutput.clear();
			});
			
			btEqual.setOnAction(e -> {
				num2 = Double.parseDouble(tfOutput.getText());
				
				switch(operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '/':
					result = num1/num2;
					break;
				case '*':
					result = num1*num2;
					break;
				}
				tfOutput.setText(String.valueOf(result));
				num1 = result;
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
