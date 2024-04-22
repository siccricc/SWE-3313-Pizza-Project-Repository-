package com.example.pizza_project_intellij.Controllers;

import com.example.pizza_project_intellij.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PizzaViewCheckoutScreen implements Initializable{

    public String[] pizzaSizeArray = {"Monster","Large", "Medium", "Small"};
    public String[] pizzaStyleArray = {"Hand Tossed", "Thin Crust", "Deep Dish","Cheese Crust"};
    private String[] pizzaToppingsArray = {"Pepperoni", "Mushrooms", "Sausage", "Extra Cheese", "Onion", "Green Pepper", "Fresh Garlic", "Tomato"};

    private String[] drinkSizeArray = {"Large", "Medium", "Small"};
    private String[] drinkTypeArray = {"Sprite", "Coke", "Dr. Pepper", "Crush", "Starry"};

    @FXML
    private AnchorPane checkoutAnchorPane;

    @FXML
    private Button drinkEnter;

    @FXML
    private ChoiceBox<String> drinkSize;

    @FXML
    private ChoiceBox<String> drinkType;

    @FXML
    private TextFlow orderSummary;

    @FXML
    private Button pizzaEnter;

    @FXML
    private Button paynowButton;

    @FXML
    private ChoiceBox<String> pizzaSize;

    @FXML
    private ChoiceBox<String> pizzaStyle;

    @FXML
    private ChoiceBox<String> pizzaToppings;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pizzaSize.getItems().addAll(pizzaSizeArray);
    }
}
