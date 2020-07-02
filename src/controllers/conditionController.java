package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class conditionController {
    public void toDomain(MouseEvent mouseEvent) throws IOException {

        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/domain.fxml"));
        stage.setScene(new Scene(root));

    }

    public void toMesh(MouseEvent mouseEvent) throws IOException {

        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/mesh.fxml"));
        stage.setScene(new Scene(root));

    }
}
