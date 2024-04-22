module com.example.pizza_project_intellij {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.pizza_project_intellij to javafx.fxml;
    exports com.example.pizza_project_intellij;
    exports com.example.pizza_project_intellij.Controllers;
    opens com.example.pizza_project_intellij.Controllers to javafx.fxml;


}