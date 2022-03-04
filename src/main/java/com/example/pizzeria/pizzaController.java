package com.example.pizzeria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;

public class pizzaController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private URL url;

    // dane do zamówienia, na ten czas w kontrolerze
    private short liczbaPizza = 0; // liczba danej pizzy w zamowieniu
    private short liczbaSosy = 0; // liczba danego sosu w zamowieniu


    @FXML
    private Button addToOrderButton;

    @FXML
    private Button dodatkiButton;

    // zmiana okienka na poglad do dodatkow
    public void changeToDodatkiScene(ActionEvent click) throws IOException {
        url = Paths.get("./src/main/resources/com/example/pizzeria/dodatki-view.fxml").toUri().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage)((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Przyciski do wyboru rozmiaru pizzy, najpewniej dodac metody ktore zaaktualizuja zamowienie
    // wpisujac cene po wybraniu rozmiaru pizzy
    @FXML
    private Button largePizzaButton;

    @FXML
    private Button mediumPizzaButton;

    @FXML
    private Button smallPizzaButton;

    @FXML
    private Button miejsceButton;

    // zmiana okienka na poglad do restauracji
    public void changeToMiejsceScene(ActionEvent click) throws IOException {
        url = Paths.get("./src/main/resources/com/example/pizzeria/restauracja-view.fxml").toUri().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage)((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // zmiana okienka na poglad do mapy
    public void changeToMapaScene(ActionEvent click) throws IOException {
        url = Paths.get("./src/main/resources/com/example/pizzeria/mapa-view.fxml").toUri().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage)((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // pole tekstowe, ktore wyswietla liczbe wybranych pizz lub dodatkow
    @FXML
    private Label showNumberLabel;

    @FXML
    private Button minusButton;

    // zmiejsza liczbe wybranych pizz
    public void odejmnijLiczbePizz(ActionEvent click) throws Exception {
        if (liczbaPizza > 0) {
            liczbaPizza--;
            showNumberLabel.setText("" + liczbaPizza);
        }
    }

    // zmiejsza liczbe wybranych dodatkow
    public void odejmnijLiczbeDodatki(ActionEvent click) throws Exception {
        if (liczbaSosy > 0) {
            liczbaSosy--;
            showNumberLabel.setText("" + liczbaSosy);
        }
    }

    @FXML
    private Button ordersButton;

    // zmiana okienka na poglad do zamowien
    public void changeToZamowieniaScene(ActionEvent click) throws Exception {
        url = Paths.get("./src/main/resources/com/example/pizzeria/zamowienia-view.fxml").toUri().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage)((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button pizzaButton;

    // zmiana okienka na poglad do pizz
    public void changeToPizzaScene(ActionEvent click) throws Exception {
        url = Paths.get("./src/main/resources/com/example/pizzeria/pizza-view.fxml").toUri().toURL();
        root = FXMLLoader.load(url);
        stage = (Stage)((Node)click.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button plusButton;
    // zwieksza liczbe danej pizzy
    public void dodajLiczbePizz(ActionEvent click) throws Exception {
            liczbaPizza++;
            showNumberLabel.setText("" + liczbaPizza);
    }
    // zwieksz liczbe danego dodatku
    public void dodajLiczbeDodatki(ActionEvent click) throws Exception {
        liczbaSosy++;
        showNumberLabel.setText("" + liczbaSosy);
    }


    @FXML
    private Button rachunkiButton;

}
