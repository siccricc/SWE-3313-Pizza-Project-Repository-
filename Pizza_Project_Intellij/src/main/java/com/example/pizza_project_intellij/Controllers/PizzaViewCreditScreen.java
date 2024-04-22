package com.example.pizza_project_intellij.Controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ResourceBundle;

public class PizzaViewCreditScreen implements Initializable {
    private String[] cardTypeArray = {"Visa","Mastercard","American Express"};

    @FXML
    private TextField acctHolderName;

    @FXML
    private TextField acctNumber;

    @FXML
    private TextField address;

    @FXML
    private Button cardEnter;

    @FXML
    private ComboBox<String> cardType;

    @FXML
    private TextField crdExpDate;

    @FXML
    private TextFlow orderSummary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cardType.setItems(FXCollections.observableArrayList(cardTypeArray));
    }
}
