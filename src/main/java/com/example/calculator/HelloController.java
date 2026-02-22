package com.example.calculator;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField display;

    private double num1 = 0;
    private String operator = "";

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        num1 = Double.parseDouble(display.getText());
        operator = ((javafx.scene.control.Button) event.getSource()).getText();
        display.clear();
    }

    @FXML
    private void handleEquals() {
        double num2 = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }
        display.setText(String.valueOf(result));
    }

    @FXML
    private void handleClear() {
        display.clear();
        num1 = 0;
        operator = "";
    }
}