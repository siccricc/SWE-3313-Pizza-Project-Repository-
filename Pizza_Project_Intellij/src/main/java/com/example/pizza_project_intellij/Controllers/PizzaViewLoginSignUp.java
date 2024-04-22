package com.example.pizza_project_intellij.Controllers;
import com.example.pizza_project_intellij.Customer;
import com.example.pizza_project_intellij.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PizzaViewLoginSignUp {
    Customer newCustomer = new Customer();
    Customer returningCustomer = new Customer();

    @FXML
    private AnchorPane loginSignupAnchorPane;
    @FXML
    private Button loginEnter;

    @FXML
    private TextField loginPassword;

    @FXML
    private TextField loginUserName;

    @FXML
    private TextField signupCity;

    @FXML
    private TextField signupCountry;

    @FXML
    private Button signupEnter;

    @FXML
    private TextField signupPassword;

    @FXML
    private TextField signupPhone;

    @FXML
    private TextField signupState;

    @FXML
    private TextField signupStreetAddress;

    @FXML
    private TextField signupUserName;

    @FXML
    private TextField signupZIP;

    @FXML
    void onEnterLogin(ActionEvent event) throws IOException {
        returningCustomer.setUsername(loginUserName.getText());
        returningCustomer.setPassword(loginPassword.getText());

        if(returningCustomer.getUsername().equals("manager")) {
            new SceneSwitch(loginSignupAnchorPane, "Pizza-View-ManagerScreen.fxml");
        } else if(returningCustomer.getUsername().equals("employee")) {
            new SceneSwitch(loginSignupAnchorPane, "Pizza-View-EmployeeScreen.fxml");
        }
        else {
            new SceneSwitch(loginSignupAnchorPane, "Pizza-View-CheckoutScreen.fxml");
        }
    }

    @FXML
    void onEnterSignup(ActionEvent event) throws IOException {
        newCustomer.setUsername(signupUserName.getText());
        newCustomer.setPassword(signupPassword.getText());
        newCustomer.setStreet(signupStreetAddress.getText());
        newCustomer.setCity(signupCity.getText());
        newCustomer.setState(signupState.getText());
        newCustomer.setCountry(signupCountry.getText());
        newCustomer.setPostal(Integer.parseInt(signupZIP.getText()));

        new SceneSwitch(loginSignupAnchorPane, "Pizza-View-CheckoutScreen.fxml");
    }

}
