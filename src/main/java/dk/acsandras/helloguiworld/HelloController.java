package dk.acsandras.helloguiworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello Java GUI!");
    }

    @FXML
    protected void onKnap2Click() {
        welcomeText.setText("Hello Datamatiker");
    }


}