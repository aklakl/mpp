package com.mpp.extra.methodreference;

import java.util.function.BiFunction;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MethodReferenceCalculator extends Application {

	Operation op = new Operation();

	// BiFunction<Integer, Integer, Integer> multiply = (a, b) -> (a * b);
	BiFunction<Integer, Integer, Integer> multiplyM = op::multiply;
	// BiFunction<Integer, Integer, Integer> add = (a, b) -> (a + b);
	BiFunction<Integer, Integer, Integer> addM = op::add;
	// BiFunction<Integer, Integer, Integer> sub = (a, b) -> (a - b);
	BiFunction<Integer, Integer, Integer> subM = op::sub;
	// BiFunction<Integer, Integer, Integer> divide = (a, b) -> (a / b);
	BiFunction<Integer, Integer, Integer> divideM = op::divide;

	public static void main(String[] args) {
		launch(args);
	}

	public int getSelectedAction(String action, int a, int b) {
		switch (action) {
		case "Multiply":
			return multiplyM.apply(a, b);
		case "Add":
			return addM.apply(a, b);
		case "Divide":
			return divideM.apply(a, b);
		case "Sub":
			return subM.apply(a, b);
		default:
			return addM.apply(a, b);
		}
	}

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Calculator!");
		Label value1label = new Label("Value 1");
		Label value2label = new Label("Value 2");
		Label operationLabel = new Label("Operation");
		Label resultLabel = new Label("Result");
		TextField value1 = new TextField();
		TextField value2 = new TextField();
		TextField result = new TextField();
		Button button = new Button("Get Result");

		ObservableList<String> options = FXCollections.observableArrayList("Multiply", "Add", "Sub", "Divide");
		ComboBox<String> operation = new ComboBox<String>(options);

		GridPane root = new GridPane();
		root.add(value1label, 0, 0);
		root.add(value2label, 0, 1);
		root.add(operationLabel, 0, 2);
		root.add(resultLabel, 0, 3);
		root.add(value1, 1, 0);
		root.add(value2, 1, 1);
		root.add(operation, 1, 2);
		root.add(result, 1, 3);
		root.add(button, 1, 4);

		button.setOnAction(evt -> {
			int a = Integer.parseInt(value1.getText().trim());
			int b = Integer.parseInt(value2.getText().trim());
			result.setText("" + getSelectedAction(operation.getValue(), a, b));
		});
		primaryStage.setScene(new Scene(root, 250, 150));
		primaryStage.show();

	}

	class Operation {

		int multiply(int a, int b) {
			return a * b;
		}

		int add(int a, int b) {
			return a + b;
		}

		int sub(int a, int b) {
			return a - b;
		}

		int divide(int a, int b) {
			return a / b;
		}
	}
}