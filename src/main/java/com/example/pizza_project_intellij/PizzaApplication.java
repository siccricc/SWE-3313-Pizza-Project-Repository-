package com.example.pizza_project_intellij;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pizza-View.fxml"));
        stage.setScene(new Scene(root, 780, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
