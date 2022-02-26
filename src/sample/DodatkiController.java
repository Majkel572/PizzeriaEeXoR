package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class DodatkiController {
    @FXML
    private Button dodatkiButton;

    @FXML
    private Button pizzaButton;

    public void loadDodatkiScene(ActionEvent ev) throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource("wyborDodatkow.fxml"));
        Stage stage = (Stage) dodatkiButton.getScene().getWindow();
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

    public void loadPizzaScene(ActionEvent ev) throws Exception{
        Parent root = FXMLLoader.load(Main.class.getResource("wyborDodatkow2.fxml"));
        Stage stage = (Stage)pizzaButton.getScene().getWindow();
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }


}
