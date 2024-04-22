package com.example.pizza_project_intellij.Controllers;

import com.example.pizza_project_intellij.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextFlow;

import java.io.IOException;

public class PizzaViewPayscreen {

    @FXML
    private AnchorPane paymentAnchorPane;

    @FXML
    private Button choiceCash;

    @FXML
    private Button choiceCheck;

    @FXML
    private Button choiceCredit;

    @FXML
    private Menu homeButton;

    @FXML
    private TextFlow itemChosenList;

    @FXML
    void onCashClick(ActionEvent event) {

    }

    @FXML
    void onCheckClick(ActionEvent event) {

    }

    @FXML
    private ComboBox<String> cardType;

    @FXML
    void onCreditClick(ActionEvent event) throws IOException {
        new SceneSwitch(paymentAnchorPane, "Pizza-View-CreditScreen.fxml");
    }

    @FXML
    void onHomeClick(ActionEvent event) {

    }

}
