package com.example.pizza_project_intellij.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaController {


    @FXML
    private Button deliveryButton;

    @FXML
    private Menu homeButton;

    @FXML
    private Button takeOutButton;

    @FXML
    void onClickDelivery(ActionEvent event) throws IOException {
        Parent viewLoginSignUp = FXMLLoader.load(getClass().getResource("Pizza-View-Login-SignUp.fxml"));
        Scene loginSignUpScene = new Scene(viewLoginSignUp);

        //stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(loginSignUpScene);
        window.show();


    }

    @FXML
    void onClickHome(ActionEvent event) {

    }

    @FXML
    void onClickTakeOut(ActionEvent event) {

    }
}
