package com.mpp.lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		// btn.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// System.out.println("Hello World!");
		// }
		// });

		btn.setOnAction(evt -> {
			System.out.println("Hello My Source is : ");
			System.out.println("this is next statement");
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);

		Button btn2 = new Button();
		btn2.setText("Say 'Hello MUM'");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello MUM!");
			}
		});
		// btn2.setTranslateX(10);
		btn2.setTranslateY(50);
		root.getChildren().add(btn2);
		primaryStage.setScene(new Scene(root, 500, 250));
		primaryStage.show();

	}
}
