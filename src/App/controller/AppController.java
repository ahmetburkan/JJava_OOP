package App.controller;

import App.model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AppController {

    @FXML
    private TextField objectnaam;

    @FXML
    private ChoiceBox<String> objectkeuze;

    @FXML
    private TextField objectactie;

    @FXML
    private Button objectaanmaken;

    @FXML
    private Text title;

    @FXML
    private ChoiceBox<String> keuze;

    @FXML
    private ChoiceBox<String> keuze1;

    @FXML
    private Button uitvoeren;

    @FXML
    private Text result;


    public void initialize() {

        setObjectByInput();
        showAction();
    }


    public void setObjectByInput() {

        objectaanmaken.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String wat = objectkeuze.getValue();
                String naam = objectnaam.getText();
                String actie = objectactie.getText();

                switch (wat) {
                    case "Hond":
                        Hond hond = new Hond();
                        hond.setNaam(naam);
                        hond.setSpel(actie);
                        break;

                    case "Konijn":
                        Konijn konijn = new Konijn();
                        konijn.setNaam(naam);
                        konijn.setSpel(actie);
                        break;

                    case "Kat":
                        Kat kat = new Kat();
                        kat.setNaam(naam);
                        kat.setSpel(actie);
                        break;

                    case "Bezoeker":
                        Bezoeker bezoeker = new Bezoeker();
                        bezoeker.setNaam(naam);
                        bezoeker.setSpel(actie);
                        break;

                    default:
                        title.setText("internal server error. Connect developers");
                        break;
                }

                objectnaam.clear();
                objectactie.clear();

                populateChoiceBox();

            }
        });
    }

    public void populateChoiceBox() {
        keuze.getItems().removeAll(keuze.getItems());
        keuze1.getItems().removeAll(keuze1.getItems());

        for (Handeling object : ObjLijst.getInstance().lijst) {
            keuze.getItems().add(object.getNaam());
            keuze1.getItems().add(object.getNaam());
        }
    }

    public void showAction() {

        uitvoeren.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String wat = keuze.getValue();
                String wat1 = keuze1.getValue();


                for (Handeling object : ObjLijst.getInstance().lijst) {

                    if(object.getNaam().equals(wat)) {
                        object.setMetWie(wat1);

                        result.setText(object.aanHetSpelen());

                    }
                }
            }
        });
    }

}