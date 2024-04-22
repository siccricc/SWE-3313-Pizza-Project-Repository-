package com.example.pizza_project_intellij.Controllers;

import com.example.pizza_project_intellij.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaController {

    @FXML
    private AnchorPane pizzaViewAnchorPane;

    @FXML
    private Button deliveryButton;

    @FXML
    private Menu homeButton;

    @FXML
    private Button takeOutButton;

    @FXML
    void onClickDelivery(ActionEvent event) throws IOException {
        new SceneSwitch(pizzaViewAnchorPane, "Pizza-View-Login-SignUp.fxml");
    }

    @FXML
    void onClickHome(ActionEvent event) throws IOException {
        new SceneSwitch(pizzaViewAnchorPane, "Pizza-View.fxml");
    }

    @FXML
    void onClickTakeOut(ActionEvent event) throws IOException {
        new SceneSwitch(pizzaViewAnchorPane, "Pizza-View-Login-SignUp.fxml");
    }
}
