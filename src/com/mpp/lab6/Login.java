package com.mpp.lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Text message = new Text("");
		grid.add(message, 1, 5);
//		message.setId("tooltip");

		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		// userTextField.setPrefColumnCount(10);
		// userTextField.setPrefWidth(30);
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);
		// grid.setGridLinesVisible(true) ;

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		Button btn = new Button("Sign in");
		btn.setTooltip(new Tooltip("Click me to sign in !!"));
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 4);

		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				message.setText("Sign in button pressed!!");
			}
		});
		
		
		Button btn2 = new Button("Reset");
		HBox hbBtn2 = new HBox(10);
		hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
		hbBtn2.getChildren().add(btn2);
		grid.add(hbBtn2, 0, 4);

		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Reset button clicked!");
				userTextField.setText("");
				pwBox.setText("");
				message.setText("Reset button pressed!!");
			}
		});

//		final Text actiontarget = new Text();
//		grid.add(actiontarget, 1, 6);
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent e) {
//				actiontarget.setFill(Color.FIREBRICK);
//				actiontarget.setText("Sign in button pressed");
//			}
//		});
		// btn.setOnAction(evt -> {
		// actiontarget.setFill(Color.FIREBRICK);
		// actiontarget.setText("Sign-in button pressed");
		// });

		// Scene scene = new Scene(grid, 300, 200);
		Scene scene = new Scene(grid);
		scene.getStylesheets().add(getClass().getResource("Login.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}