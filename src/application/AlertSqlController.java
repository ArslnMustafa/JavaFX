package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlertSqlController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea area1;

    @FXML
    private Button btnekle;

    @FXML
    private Button btnsil;

    @FXML
    private TextField txt1;

    @FXML
    void btnekleOnAction(ActionEvent event) {
    	area1.setText(txt1.getText());
    	btnekle.setText(txt1.getText());

    }

    @FXML
    void btnsilOnAction(ActionEvent event) {
    	area1.clear();
    	txt1.clear();
    }

    @FXML
    void initialize() {
      
    }

}

