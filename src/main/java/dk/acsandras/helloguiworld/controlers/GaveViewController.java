/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/12/2021
 */
package dk.acsandras.helloguiworld.controlers;

import dk.acsandras.helloguiworld.model.GaveListe;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GaveViewController {

    @FXML
    private Label statusLabel;

    @FXML
    private TextField kortText;

    @FXML
    private TextArea langText;

    @FXML
    protected void tilfojGave() {
        String gavenavn = kortText.getText();
        String beskrivelse = langText.getText();
        statusLabel.setText("Tilføjer gave til databasen: " + gavenavn + " - " + beskrivelse);
        System.out.println("Tilføjer gave.");
        // TODO: Gem gavenavn og beskrivelse i databasen
    }

    @FXML
    protected void indlaesGave() {
        // TODO indlæs fra fil eller db
        GaveListe x = new GaveListe();
        //String navn = "Bil";
        //String beskrivelse = "Rød";
        String gaveliste = "";
        for (int i = 0; i < x.indhold.size(); i++) {
            gaveliste += x.indhold.get(i).navn + " - " + String.valueOf(x.indhold.get(i).pris) + " kroner.\n";
        }
        kortText.setText("Gavelisten indeholder");
        langText.setText(gaveliste);
        statusLabel.setText("gave indlæst ");
    }
}
