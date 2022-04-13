package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class labDenemeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnHesapla;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private ComboBox<String> combo1;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio4;

    @FXML
    private ToggleButton toggle1;

    @FXML
    private ToggleButton toggle2;

    @FXML
    private ToggleButton toggle3;

    @FXML
    private ToggleButton toggle4;

    @FXML
    private ToggleButton toggle5;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtField1;

    @FXML
    private TextField txtField2;

    @FXML
    void btnHesapla_Click(ActionEvent event) {

    	int sonuc=0;
    	String toggle="";
    	if(check1.isSelected()) {
    		sonuc += 1;
    	}
    	if(!check2.isSelected()) {
    		sonuc += 1;
    	}
    	if(!check3.isSelected()) {
    		sonuc += 1;
    	}
    	if(radio3.isSelected()) {
    		sonuc += 1;
    	}
    	if(combo1.getSelectionModel().getSelectedItem()=="edu") {
    		sonuc += 1;
    	}
    	if(toggle1.isSelected()) {
    		toggle = toggle1.getText();
    	}
    	if(toggle2.isSelected()) {
    		toggle = toggle2.getText();
    	}
    	if(toggle3.isSelected()) {
    		toggle = toggle3.getText();
    	}
    	if(toggle4.isSelected()) {
    		toggle = toggle4.getText();
    	}
    	if(toggle5.isSelected()) {
    		toggle = toggle5.getText();
    	}
    	txtArea.setText("Sn " + toggle + " Bölüm ögrencisi, " + txtField1.getText() +"-" +txtField2.getText() + "  5 sorudan  " + sonuc + "  adet soruyu doðru cevapladýnýz.");
        
    	
    	
    }

    @FXML
    void check1_Click(ActionEvent event) {

    }

    @FXML
    void check2_Click(ActionEvent event) {

    }

    @FXML
    void check3_Click(ActionEvent event) {

    }

    @FXML
    void combo1_Click(ActionEvent event) {

    }

    @FXML
    void radio1_Click(ActionEvent event) {

    }

    @FXML
    void radio2_Click(ActionEvent event) {

    }

    @FXML
    void radio3_Click(ActionEvent event) {

    }

    @FXML
    void radio4_Click(ActionEvent event) {

    }

    @FXML
    void toggle1_Click(ActionEvent event) {

    }

    @FXML
    void toggle2_Click(ActionEvent event) {

    }

    @FXML
    void toggle3_Click(ActionEvent event) {

    }

    @FXML
    void toggle4_Click(ActionEvent event) {

    }

    @FXML
    void toggle5_Click(ActionEvent event) {

    }

    @FXML
    void txtField1_Click(ActionEvent event) {

    }

    @FXML
    void txtField2_Click(ActionEvent event) {

    }
    
    ToggleGroup grup1 = new ToggleGroup();
    ToggleGroup grup2 = new ToggleGroup();

    @FXML
    void initialize() {
    	combo1.getItems().add("gov");
        combo1.getItems().add("net");
        combo1.getItems().add("edu");
        combo1.getItems().add("com");
        combo1.getItems().add("org");
        
        toggle1.setToggleGroup(grup1);
        toggle2.setToggleGroup(grup1);
        toggle3.setToggleGroup(grup1);
        toggle4.setToggleGroup(grup1);
        toggle5.setToggleGroup(grup1);
        
        radio1.setToggleGroup(grup2);
        radio2.setToggleGroup(grup2);
        radio3.setToggleGroup(grup2);
        radio4.setToggleGroup(grup2);
        
        check1.setIndeterminate(true);
        check2.setIndeterminate(true);
        check3.setIndeterminate(true);
        
        

    }

}
