package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class borderPaneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private MenuItem menuitem_kapat;

    @FXML
    private MenuItem menuitem_kaydet;

    @FXML
    private MenuItem menuitem_sil;

    @FXML
    private MenuItem menuitem_yardým;

    @FXML
    private Button btn1;

    @FXML
    private CheckBox checkbox1;

    @FXML
    private CheckBox checkbox2;

    @FXML
    private RadioButton radiobutton1;

    @FXML
    private RadioButton radiobutton2;

    @FXML
    private ToggleButton togglebutton1;

    @FXML
    private ToggleButton togglebutton2;
    
    ToggleGroup grup1 = new ToggleGroup();
	ToggleGroup grup2 = new ToggleGroup();
	
	 @FXML
	 void menuitem_kapat_Click(ActionEvent event) {
		 
		

	 }

	 @FXML
	 void menuitem_kaydet_Click(ActionEvent event) {

	 }

	 @FXML
	 void menuitem_sil_Click(ActionEvent event) {

	 }

	 @FXML
	 void menuitem_yardým_Click(ActionEvent event) {

	 }

	
	
    @FXML
    void btn1_Click(ActionEvent event) {
    	
    	//System.out.println(checkbox1.isSelected());
    	System.out.println(checkbox1.isIndeterminate());
    	

    }

    @FXML
    void checkbox1_Click(ActionEvent event) {
    	
    	if(checkbox1.isSelected())
    	{
    		System.out.println("checkbox1 seçili.");
    		checkbox1.setText("Açýk");
    	}else {
    		System.out.println("cehckbox1 seçilmedi");
    		checkbox1.setText("Kapalý");
    	}
    	

    }

    @FXML
    void checkbox2_Click(ActionEvent event) {

    	if(checkbox2.isSelected())
    	{
    		System.out.println("checkbox2 seçili.");
    		checkbox2.setText("Açýk");
    	}else {
    		System.out.println("cehckbox2 seçilmedi");
    		checkbox2.setText("Kapalý");
    	}
    }

    @FXML
    void radiobutton1_Click(ActionEvent event) {

    	if(radiobutton1.isSelected())
    	{
    		System.out.println("radiobutton1 seçili.");
    		radiobutton1.setText("Açýk");
    	}else {
    		System.out.println("radiobutton1 seçilmedi");
    		radiobutton1.setText("Kapalý");
    	}
    }

    @FXML
    void radiobutton2_Click(ActionEvent event) {

    	if(radiobutton2.isSelected())
    	{
    		System.out.println("radiobutton2 seçili.");
    		radiobutton2.setText("Açýk");
    	}else {
    		System.out.println("radiobutton2 seçilmedi");
    		radiobutton2.setText("Kapalý");
    	}
    }

    @FXML
    void togglebutton1_Click(ActionEvent event) {

    	if(togglebutton1.isSelected())
    	{
    		System.out.println("togglebutton1 seçili.");
    		togglebutton1.setText("Açýk");
    	}else {
    		System.out.println("togglebutton1 seçilmedi");
    		togglebutton1.setText("Kapalý");
    	}
    }

    @FXML
    void togglebutton2_Click(ActionEvent event) {
    	if(togglebutton2.isSelected())
    	{
    		System.out.println("togglebutton2 seçili.");
    		togglebutton2.setText("Açýk");
    	}else {
    		System.out.println("togglebutton2 seçilmedi");
    		togglebutton2.setText("Kapalý");
    	}
    	
    }

    @FXML
    void initialize() {
        
    	checkbox1.setIndeterminate(true);
    	checkbox2.setIndeterminate(true);
    	
    	togglebutton1.setToggleGroup(grup1);
    	togglebutton2.setToggleGroup(grup1);
    	
    	radiobutton1.setToggleGroup(grup2);
    	radiobutton2.setToggleGroup(grup2);
    	
    	
    	
    	checkbox1.setText("Kapalý");
    	checkbox2.setText("Kapalý");
    	radiobutton1.setText("Kapalý");
    	radiobutton2.setText("Kapalý");
    	togglebutton1.setText("Kapalý");
    	togglebutton2.setText("Kapalý");
    	

    }

}

