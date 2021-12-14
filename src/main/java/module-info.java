module dk.acsandras.helloguiworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.acsandras.helloguiworld to javafx.fxml;
    exports dk.acsandras.helloguiworld;
    exports dk.acsandras.helloguiworld.model;
    opens dk.acsandras.helloguiworld.model to javafx.fxml;
    exports dk.acsandras.helloguiworld.controlers;
    opens dk.acsandras.helloguiworld.controlers to javafx.fxml;
}