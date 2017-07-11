package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class cont {

		@FXML
		private Label label;
		private boolean t= false;
		private boolean win = false;
		@FXML private Button button1;
		@FXML private Button button2;
		@FXML private Button button3;
		@FXML private Button button4;
		@FXML private Button button5;
		@FXML private Button button6;
		@FXML private Button button7;
		@FXML private Button button8;
		@FXML private Button button9;
		@FXML private Button button;
		
		@FXML
		public void clck(ActionEvent event)
		{
			if(!win){
				if( !t && !(((Button)event.getSource()).getText()).equals("O") && !(((Button)event.getSource()).getText()).equals("X"))
				{
					((Button)event.getSource()).setTextFill(Color.web("red"));
					((Button)event.getSource()).setText("X");
					label.setText("2ndPlayer'sTurn");
					t=true;
				}
				
				else if(t && !(((Button)event.getSource()).getText()).equals("O") && !(((Button)event.getSource()).getText()).equals("X"))
				{
					((Button)event.getSource()).setTextFill(Color.web("blue"));
					((Button)event.getSource()).setText("O");
					t=false;
					label.setText("1stPlayer'sTurn");
				}
				
				
			if(   (button1.getText().equals(button2.getText())) && (button3.getText().equals(button2.getText()) &&  button3.getText().equals("X") )
					||
					(button4.getText().equals(button5.getText())) && (button6.getText().equals(button5.getText()) &&  button4.getText().equals("X"))
					||
					(button7.getText().equals(button8.getText())) && (button9.getText().equals(button8.getText())&&  button8.getText().equals("X"))
					||
					(button1.getText().equals(button4.getText())) && (button4.getText().equals(button7.getText())&&  button7.getText().equals("X"))
					||
					(button2.getText().equals(button5.getText())) && (button8.getText().equals(button2.getText())&&  button2.getText().equals("X"))
					||
					(button1.getText().equals(button5.getText())) && (button9.getText().equals(button5.getText())&&  button5.getText().equals("X"))
					||
					(button3.getText().equals(button9.getText())) && (button9.getText().equals(button6.getText())&&  button9.getText().equals("X"))
					||
					(button7.getText().equals(button5.getText())) && (button3.getText().equals(button5.getText())&&  button3.getText().equals("X")))
					{
						label.setText("Player1 WINS !!!!");
						win = true;
					}
			else if
			(   (button1.getText().equals(button2.getText())) && (button3.getText().equals(button2.getText()) &&  button3.getText().equals("O") )
					||
					(button4.getText().equals(button5.getText())) && (button6.getText().equals(button5.getText()) &&  button4.getText().equals("O"))
					||
					(button7.getText().equals(button8.getText())) && (button9.getText().equals(button8.getText())&&  button8.getText().equals("O"))
					||
					(button1.getText().equals(button4.getText())) && (button4.getText().equals(button7.getText())&&  button7.getText().equals("O"))
					||
					(button2.getText().equals(button5.getText())) && (button8.getText().equals(button2.getText())&&  button2.getText().equals("O"))
					||
					(button1.getText().equals(button5.getText())) && (button9.getText().equals(button5.getText())&&  button5.getText().equals("O"))
					||
					(button3.getText().equals(button9.getText())) && (button9.getText().equals(button6.getText())&&  button9.getText().equals("O"))
					||
					(button7.getText().equals(button5.getText())) && (button3.getText().equals(button5.getText())&&  button3.getText().equals("O")))
					{
				
			       	label.setText("Player2 WINS !!!!"); 
			       	win = true;
			       					
					}
			
			check();
			}
		
		}
		
		@FXML
		public void click (ActionEvent e)
		{
	       	button.setTextFill(Color.web("#000000"));
	       	button1.setTextFill(Color.web("#000000"));
	       	button2.setTextFill(Color.web("#000000"));
	       	button3.setTextFill(Color.web("#000000"));
	       	button4.setTextFill(Color.web("#000000"));
	       	button5.setTextFill(Color.web("#000000"));
	       	button6.setTextFill(Color.web("#000000"));
	       	button7.setTextFill(Color.web("#000000"));
	       	button8.setTextFill(Color.web("#000000"));
	       	button9.setTextFill(Color.web("#000000"));
	       	button1.setText(".");
			button2.setText(".");
			button3.setText(".");
			button4.setText(".");
			button5.setText(".");
			button6.setText(".");
			button7.setText(".");
			button8.setText(".");
			button9.setText(".");
	       	label.setText(" ");
	       	win = false;
	       	label.setText("1stPlayer'sTurn");
	  }
		
		public void check()
		{
			if(!win){
				if(     !button1.getText().equals(".") && !button2.getText().equals(".") && !button3.getText().equals(".") &&
						!button4.getText().equals(".") && !button5.getText().equals(".") && !button6.getText().equals(".") &&
						!button7.getText().equals(".") && !button8.getText().equals(".") && !button9.getText().equals(".") )
					{
				       	label.setText("    DRAW !!!");
				         label.setTextFill(Color.web("orange"));
				       	button.setTextFill(Color.web("blue"));
					}
				
			}
		}
		
		
}

