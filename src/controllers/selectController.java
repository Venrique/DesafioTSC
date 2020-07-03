package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class selectController {

    public void change(String scene, MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/"+scene+".fxml"));
        stage.setScene(new Scene(root));
    }

    public void toModel(MouseEvent mouseEvent) throws IOException {
        change("model",mouseEvent);
    }

    public void toDomain(MouseEvent mouseEvent) throws IOException {
        change("domain",mouseEvent);
    }

    public void toConditions(MouseEvent mouseEvent) throws IOException {
        change("conditions",mouseEvent);
    }

    public void toMesh(MouseEvent mouseEvent) throws IOException {
        change("mesh",mouseEvent);
    }

    public void toStep1(MouseEvent mouseEvent) throws IOException {
        change("step1",mouseEvent);
    }

    public void toStep2(MouseEvent mouseEvent) throws IOException {
        change("step2",mouseEvent);
    }

    public void toStep3(MouseEvent mouseEvent) throws IOException {
        change("step3",mouseEvent);
    }

    public void toStep4(MouseEvent mouseEvent) throws IOException {
        change("step4",mouseEvent);
    }

    public void toStep5(MouseEvent mouseEvent) throws IOException {
        change("step5",mouseEvent);
    }

    public void toStep6(MouseEvent mouseEvent) throws IOException {
        change("step6",mouseEvent);
    }

    public void toStep7(MouseEvent mouseEvent) throws IOException {
        change("step7",mouseEvent);
    }

    public void toStep8(MouseEvent mouseEvent) throws IOException {
        change("step8",mouseEvent);
    }

    public void toMenu(MouseEvent mouseEvent) throws IOException {
        change("menu",mouseEvent);
    }
}
