package com.example.pizza_project_intellij.Controllers;

import com.example.pizza_project_intellij.Item;
import com.example.pizza_project_intellij.Order;
import com.example.pizza_project_intellij.SceneSwitch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class PizzaViewCheckoutScreen implements Initializable{

    private String[] pizzaSizeArray = {"Monster","Large","Medium","Small"};
    public String[] pizzaStyleArray = {"Hand Tossed", "Thin Crust", "Deep Dish","Cheese Crust"};
    private String[] pizzaToppingsArray = {"Pepperoni", "Mushrooms", "Sausage", "Extra Cheese", "Onion", "Green Pepper", "Fresh Garlic", "Tomato"};

    private String[] drinkSizeArray = {"Large", "Medium", "Small"};
    private String[] drinkTypeArray = {"Sprite", "Coke", "Dr. Pepper", "Crush", "Starry"};


    @FXML
    private AnchorPane checkoutAnchorPane;

    @FXML
    private Button drinkEnter;

    @FXML
    private ComboBox<String> drinkSize;

    @FXML
    private ComboBox<String> drinkType;

    @FXML
    private Text orderSummary;

    @FXML
    private Button pizzaEnter;

    @FXML
    private Button paynowButton;

    @FXML
    void onClickPayNow(ActionEvent event) throws IOException {
        new SceneSwitch(checkoutAnchorPane, "Pizza-View-Payscreen.fxml");
    }

    @FXML
    private ComboBox<String> pizzaSize;

    @FXML
    private ComboBox<String> pizzaStyle;

    @FXML
    private ComboBox<String> pizzaToppings;

    @FXML
    void pickDrinkSize(ActionEvent event) {

    }

    @FXML
    void pickDrinkType(ActionEvent event) {

    }

    @FXML
    void pickPizzaSize(ActionEvent event) {

    }

    @FXML
    void pickPizzaStyle(ActionEvent event) {

    }

    @FXML
    void pickPizzaToppings(ActionEvent event) {

    }

    @FXML
    void onClickDrinkList(ActionEvent event) {

    }

    @FXML
    void onClickPizzaList(ActionEvent event) {
        Item newItem = new Item();

        newItem.setPizzaSize(pizzaSize.getValue());
        newItem.setPizzaSize(pizzaStyle.getValue());
        newItem.setToppings(pizzaToppings.getValue());

        orderSummary.setText("");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pizzaSize.setItems(FXCollections.observableArrayList(pizzaSizeArray));
        pizzaStyle.setItems(FXCollections.observableArrayList(pizzaStyleArray));
        pizzaToppings.setItems(FXCollections.observableArrayList((pizzaToppingsArray)));

        drinkType.setItems(FXCollections.observableArrayList(drinkTypeArray));
        drinkSize.setItems(FXCollections.observableArrayList(drinkSizeArray));
    }
}
