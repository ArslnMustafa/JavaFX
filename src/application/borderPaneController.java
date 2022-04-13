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
    private MenuItem menuitem_yard�m;

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
	 void menuitem_yard�m_Click(ActionEvent event) {

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
    		System.out.println("checkbox1 se�ili.");
    		checkbox1.setText("A��k");
    	}else {
    		System.out.println("cehckbox1 se�ilmedi");
    		checkbox1.setText("Kapal�");
    	}
    	

    }

    @FXML
    void checkbox2_Click(ActionEvent event) {

    	if(checkbox2.isSelected())
    	{
    		System.out.println("checkbox2 se�ili.");
    		checkbox2.setText("A��k");
    	}else {
    		System.out.println("cehckbox2 se�ilmedi");
    		checkbox2.setText("Kapal�");
    	}
    }

    @FXML
    void radiobutton1_Click(ActionEvent event) {

    	if(radiobutton1.isSelected())
    	{
    		System.out.println("radiobutton1 se�ili.");
    		radiobutton1.setText("A��k");
    	}else {
    		System.out.println("radiobutton1 se�ilmedi");
    		radiobutton1.setText("Kapal�");
    	}
    }

    @FXML
    void radiobutton2_Click(ActionEvent event) {

    	if(radiobutton2.isSelected())
    	{
    		System.out.println("radiobutton2 se�ili.");
    		radiobutton2.setText("A��k");
    	}else {
    		System.out.println("radiobutton2 se�ilmedi");
    		radiobutton2.setText("Kapal�");
    	}
    }

    @FXML
    void togglebutton1_Click(ActionEvent event) {

    	if(togglebutton1.isSelected())
    	{
    		System.out.println("togglebutton1 se�ili.");
    		togglebutton1.setText("A��k");
    	}else {
    		System.out.println("togglebutton1 se�ilmedi");
    		togglebutton1.setText("Kapal�");
    	}
    }

    @FXML
    void togglebutton2_Click(ActionEvent event) {
    	if(togglebutton2.isSelected())
    	{
    		System.out.println("togglebutton2 se�ili.");
    		togglebutton2.setText("A��k");
    	}else {
    		System.out.println("togglebutton2 se�ilmedi");
    		togglebutton2.setText("Kapal�");
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
    	
    	
    	
    	checkbox1.setText("Kapal�");
    	checkbox2.setText("Kapal�");
    	radiobutton1.setText("Kapal�");
    	radiobutton2.setText("Kapal�");
    	togglebutton1.setText("Kapal�");
    	togglebutton2.setText("Kapal�");
    	

    }

}

