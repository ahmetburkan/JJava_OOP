package App.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AppController {

    @FXML
    private Button uitvoeren;

    @FXML
    private ChoiceBox<String> dierkeuze;

    @FXML
    private ChoiceBox bezoekerkeuze;

    @FXML
    private TextField handeling;

    @FXML
    private Text result;

//uitvoeren.setOnAction(e -> getDierKeuze(dierkeuze));

    private void getDierKeuze(ChoiceBox<String> dierkeuze) {
        String keuze = dierkeuze.getValue();
        System.out.println(keuze);
    }

    private void getHandelingInput(TextField handeling) {
        String input = handeling.getText();
        System.out.println(input);
    }

    private void getBezoekerKeuze(ChoiceBox<String> bezoekerkeuze) {
        String keuze = bezoekerkeuze.getValue();
        System.out.println(keuze);

    }

    private void onSubmit()  {
//        getDierKeuze();
//        getHandelingInput();
//        getBezoekerKeuze();

    }
}
