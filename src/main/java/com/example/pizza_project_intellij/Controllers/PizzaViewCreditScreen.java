package com.example.pizza_project_intellij.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class PizzaViewCreditScreen {

    @FXML
    private TextField acctHolderName;

    @FXML
    private TextField acctNumber;

    @FXML
    private TextField address;

    @FXML
    private Button cardEnter;

    @FXML
    private ChoiceBox<?> cardType;

    @FXML
    private TextField crdExpDate;

    @FXML
    private TextFlow orderSummary;

}
