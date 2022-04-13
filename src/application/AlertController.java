package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;

public class AlertController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    void btn1_Click(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Mustafa ARSLAN");
    	alert.setHeaderText("isteotomas");
    	alert.setContentText("iste otomasyon");
    	alert.showAndWait();

    }

    @FXML
    void btn2_Click(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.NONE);
    	//Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Mustafa ARSLAN");
    	alert.setHeaderText("isteotomas");
    	alert.setContentText("iste otomasyon");
    	//alert.showAndWait();
    	
    	ButtonType btn1 = new ButtonType("Evet");
    	ButtonType btn2 = new ButtonType("Hayýr");
    	ButtonType btn3 = new ButtonType("Ýptal", ButtonData.CANCEL_CLOSE);
    	ButtonType btn4 = new ButtonType("Evet----", ButtonData.OK_DONE);
    	ButtonType btn5 = new ButtonType("Hayýr----", ButtonData.NO);
    	
    	alert.getButtonTypes().addAll(btn1,btn2,btn3,btn4,btn5);
    	Optional<ButtonType> sonuc = alert.showAndWait();
    	
    	if(sonuc.get() == btn1) {
    		System.out.println("evet ile ilgili iþlemler");
    	}
    	else if (sonuc.get() == btn2) {
    		System.out.println("Hayýr ile ilgili iþlemler");
    	}
    	else if (sonuc.get() == btn3) {
    		System.out.println("Ýptal ile ilgili iþlemler");
    	}
    	else {
    		System.out.println("Ýptal iþlemi");
    	}

    }

    @FXML
    void btn3_Click(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Mustafa ARSLAN");
    	alert.setHeaderText("isteotomas");
    	alert.setContentText("iste otomasyon");
    	alert.showAndWait();

    }

    @FXML
    void btn4_Click(ActionEvent event) {
    	List<String> sec = new ArrayList<String>();
    	sec.add("Adana");
    	sec.add("Ýstanbul");
    	sec.add("Hatay");
    	sec.add("Kayseri");
    	sec.add("Kýrýkkale");
    	
    	ChoiceDialog<String> dialog = new ChoiceDialog<String>("Adana",sec);
    	Optional<String> sonuc =  dialog.showAndWait();
    	
    	if(sonuc.isPresent()) {
    		System.out.println("seçilen il: "+sonuc.get());
    	}
    }

    @FXML
    void btn5_Click(ActionEvent event) {
    	
    	TextInputDialog dialog = new TextInputDialog();
    	dialog.setTitle("isteotomasyon");
    	dialog.setHeaderText("iste otomasyon");
    	dialog.setContentText("iste otomasyonu içindir");
    	Optional<String> sonuc = dialog.showAndWait();
    	
    	if(sonuc.isPresent()) {
    		System.out.println("Gönderilen kod: "+ sonuc.get());
    	}

    }

    @FXML
    void btn6_Click(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Mustafa ARSLAN");
    	alert.setHeaderText("isteotomas");
    	alert.setContentText("iste otomasyon");
    	//alert.showAndWait();
    	
    	ButtonType btn1 = new ButtonType("Evet");
    	ButtonType btn2 = new ButtonType("Hayýr");
    	ButtonType btn3 = new ButtonType("Ýptal", ButtonData.CANCEL_CLOSE);
    	ButtonType btn4 = new ButtonType("Evet----", ButtonData.OK_DONE);
    	ButtonType btn5 = new ButtonType("Hayýr----", ButtonData.NO);
    	
    	alert.getButtonTypes().addAll(btn1,btn2,btn3,btn4,btn5);
    	Optional<ButtonType> sonuc = alert.showAndWait();
    	
    	if(sonuc.get() == btn1) {
    		System.out.println("evet ile ilgili iþlemler");
    	}
    	else if (sonuc.get() == btn2) {
    		System.out.println("Hayýr ile ilgili iþlemler");
    	}
    	else if (sonuc.get() == btn3) {
    		System.out.println("Ýptal ile ilgili iþlemler");
    	}
    	else {
    		System.out.println("Ýptal iþlemi");
    	}
    }

    @FXML
    void initialize() {
    
    }

}
