package application;

import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;

import javafx.scene.control.TextField;

public class denemeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Hesapla;
    @FXML
    private Button btn_Hesapla2;

    @FXML
    private TextField lbl_Ad;
    
    @FXML
    private Label lbl_Index;

    @FXML
    private TextField lbl_Boy;

    @FXML
    private TextField lbl_Kilo;

    @FXML
    private TextField lbl_Soyad;

    @FXML
    private ListView<String> lv_Ad;

    @FXML
    private ListView<Double> lv_Boy;

    @FXML
    private ListView<Double> lv_Index;

    @FXML
    private ListView<Double> lv_Kilo;

    @FXML
    private ListView<String> lv_Soyad;

    @FXML
    void btn_Hesapla_Click(ActionEvent event) {

    	String Ad = String.valueOf(lbl_Ad.getText());
    	lv_Ad.getItems().add(Ad);
    	
    	String Soyad = String.valueOf(lbl_Soyad.getText());
    	lv_Soyad.getItems().add(Soyad);
    	
    	Double Boy = Double.parseDouble(lbl_Boy.getText());
    	lv_Boy.getItems().add(Boy);
    	
    	double Kilo = Double.parseDouble(lbl_Kilo.getText());
    	lv_Kilo.getItems().add(Kilo);
    	
    	double index= Kilo / ((Boy * Boy)/10000);
    	lv_Index.getItems().add(index);
    	
    	/*
    	double a= lv_Index.getItems().indexOf(lv_Index);
    	
    	if(a>30) {
    		
    		lbl_Index.setText("Obez");
    		
    	}else if(a>25 && a<29.99 ) {
    		lbl_Index.setText("Kilolu");
    	}else if(a>18.5 && a<24.99 ) {
    		lbl_Index.setText("Saðlýklý Kilolu");
    	}else  {
    		lbl_Index.setText("Zayýf");
    	}
    	
    	*/

    }
    @FXML
    void btn_Hesapla_Click2(ActionEvent event) {
    	
    	
    	double a= lv_Index.getSelectionModel().getSelectedItem();
    	
    	if(a>30) {
    		
    		lbl_Index.setText("Obez");
    		
    	}else if(a>25 && a<29.99 ) {
    		lbl_Index.setText("Kilolu");
    	}else if(a>18.5 && a<24.99 ) {
    		lbl_Index.setText("Saðlýklý Kilolu");
    	}else  {
    		lbl_Index.setText("Zayýf");
    	}
    }
    
    

    @FXML
    void initialize() {
    	
    }

}
