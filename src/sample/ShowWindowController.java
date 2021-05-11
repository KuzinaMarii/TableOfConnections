package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowWindowController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button showTableButton;

    @FXML
    private Button addNewNoteButton;

    @FXML
    void initialize() {
        showTableButton.setOnAction(event -> {

        });
    }
}