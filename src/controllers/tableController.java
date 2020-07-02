package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class tableController {

    public static class Elemento{
        private int elemn;
        private int nodo1;
        private int nodo2;
        private int nodo3;
        private int nodo4;

        public Elemento(int elemn, int nodo1, int nodo2, int nodo3, int nodo4) {
            this.elemn = elemn;
            this.nodo1 = nodo1;
            this.nodo2 = nodo2;
            this.nodo3 = nodo3;
            this.nodo4 = nodo4;
        }

        public int getElemn() {
            return elemn;
        }

        public void setElemn(int elemn) {
            this.elemn = elemn;
        }

        public int getNodo1() {
            return nodo1;
        }

        public void setNodo1(int nodo1) {
            this.nodo1 = nodo1;
        }

        public int getNodo2() {
            return nodo2;
        }

        public void setNodo2(int nodo2) {
            this.nodo2 = nodo2;
        }

        public int getNodo3() {
            return nodo3;
        }

        public void setNodo3(int nodo3) {
            this.nodo3 = nodo3;
        }

        public int getNodo4() {
            return nodo4;
        }

        public void setNodo4(int nodo4) {
            this.nodo4 = nodo4;
        }
    }

    @FXML
    private TableView<Elemento> tableview;
    @FXML
    private TableColumn<Elemento, Integer> element;
    @FXML
    private TableColumn<Elemento, Integer> node1;
    @FXML
    private TableColumn<Elemento, Integer> node2;
    @FXML
    private TableColumn<Elemento, Integer> node3;
    @FXML
    private TableColumn<Elemento, Integer> node4;


    public void initialize(){
        element.setCellValueFactory(new PropertyValueFactory<>("elemn"));
        node1.setCellValueFactory(new PropertyValueFactory<>("nodo1"));
        node2.setCellValueFactory(new PropertyValueFactory<>("nodo2"));
        node3.setCellValueFactory(new PropertyValueFactory<>("nodo3"));
        node4.setCellValueFactory(new PropertyValueFactory<>("nodo4"));

        Elemento elem1 = new Elemento(1,1,7,2,8);
        Elemento elem2 = new Elemento(2,3,1,6,8);
        Elemento elem3 = new Elemento(3,4,1,5,8);
        Elemento elem4 = new Elemento(4,6,4,8,1);
        Elemento elem5 = new Elemento(5,7,1,3,8);
        Elemento elem6 = new Elemento(6,8,5,2,1);

        tableview.getItems().addAll(elem1,elem2,elem3,elem4,elem5,elem6);

    }

    public void toMesh(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/mesh.fxml"));
        stage.setScene(new Scene(root));
    }

    public void toStep1(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/step1.fxml"));
        stage.setScene(new Scene(root));
    }
}


