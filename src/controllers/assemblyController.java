package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.IOException;

public class assemblyController {

    @FXML
    MediaView video;

    public void initialize(){
        Media media = new Media(getClass().getResource("/resources/imgs/video.mp4").toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        video.setMediaPlayer(mediaPlayer);
        mediaPlayer.setAutoPlay(true);
    }

    public void change(String scene, MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/"+scene+".fxml"));
        stage.setScene(new Scene(root));
    }

    public void toStep7(MouseEvent mouseEvent) throws IOException {
        change("step7", mouseEvent);
    }

    public void toStep8(MouseEvent mouseEvent) throws IOException {
        change("step8", mouseEvent);
    }
}
