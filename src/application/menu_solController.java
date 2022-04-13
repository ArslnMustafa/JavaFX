package application;

import java.nio.file.attribute.AclEntry;

import javafx.fxml.FXMLLoader;

public class menu_solController {
	
	


 
 	try{
 	Stage stage = new Stage();
 	AnchorPane panel = (AnchorPane) FXMLLoader.load(get.Class().getResource());
 	Scene scene1 = new Scene(panel);
 	stage.getScene(scene1);
 	stage.show();
 
 	}catch (Exception e) {
 		
 	}
 	
 }

	
	try {
	FXMLLoader loader = new FXMLLoader (getClass().getResource("menu_sag"));
	AnchorPane pane2 = (AnchorPane) loader.getController();
	menu_sag_controller  nesne = loader.getController();
	Scene scene1 = new Scene(pane2);
	nesne.VeriAl
	}
	catch(Exception e){}
	/* menu sagcontroller
	 
	 public void Verial(String deger){
	 	lbl1.setText(deger);
	 }
	
	
	
	
	*/