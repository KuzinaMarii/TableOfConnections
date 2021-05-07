package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button showTableButton;

    @FXML
    private Button addNewNoteButton;

    public Controller() {
    }

    @FXML
    void initialize() {
        addNewNoteButton.setOnAction(event -> {
            System.out.println("кнопка добавление новой записи");
        });
        showTableButton.setOnAction(event -> {
            System.out.println("кнопка показать таблицу");
            showTableButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/showWindow.fxml"));

            try{
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }
}
