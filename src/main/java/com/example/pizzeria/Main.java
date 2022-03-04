package com.example.pizzeria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        URL url = null;
        Parent root = null;

        try {
            // problem - nie widzi lokalizacji "dodatki-view.fxml", ale "pizza-view.fxml" juz tak
            url = Paths.get("./src/main/resources/com/example/pizzeria/pizza-view.fxml").toUri().toURL();
            root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            stage.setTitle("EeXoR pizzeria");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        pizzaButton.setText("Pizza");
//        pizzaButton.setOnAction( e -> {
//            System.out.println("pizza");
//        });

    }
}