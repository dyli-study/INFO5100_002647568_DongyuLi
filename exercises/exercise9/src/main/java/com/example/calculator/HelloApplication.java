package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private TextField leftTextField;
    private TextField rightTextField;
    private TextField resultTextField;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);


        leftTextField = new TextField();
        GridPane.setConstraints(leftTextField, 1, 0);



        rightTextField = new TextField();
        GridPane.setConstraints(rightTextField, 1, 1);



        resultTextField = new TextField();
        resultTextField.setEditable(false);
        GridPane.setConstraints(resultTextField, 1, 2);

        Button plusButton = new Button("+");
        plusButton.setOnAction(e -> calculateResult("+"));
        GridPane.setConstraints(plusButton, 2, 0);

        Button minusButton = new Button("-");
        minusButton.setOnAction(e -> calculateResult("-"));
        GridPane.setConstraints(minusButton, 3, 0);

        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(e -> calculateResult("*"));
        GridPane.setConstraints(multiplyButton, 2, 1);

        Button divisionButton = new Button("/");
        divisionButton.setOnAction(e -> calculateResult("/"));
        GridPane.setConstraints(divisionButton, 3, 1);

        grid.getChildren().addAll(leftTextField, rightTextField, resultTextField,
                plusButton, minusButton, multiplyButton, divisionButton);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateResult(String operator) {
        double num1 = Double.parseDouble(rightTextField.getText());
        double num2 = Double.parseDouble(leftTextField.getText());
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        resultTextField.setText(String.valueOf(result));
    }


}




//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}

