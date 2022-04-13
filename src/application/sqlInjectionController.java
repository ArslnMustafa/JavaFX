

package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class sqlInjectionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private PasswordField password1;
    
    @FXML
    private TextArea textarea1;

    @FXML
    private TextField textfield1;

    @FXML
    void btn1_click(ActionEvent event) {
    	
    	LoginKontrol(textfield1.getText(), password1.getText());
    	
    }
    
    
    @FXML
    void btn2_click(ActionEvent event) {
    	
    	
    	
    	textfield1.clear();
    	password1.clear();
    	textfield1.setFocusTraversable(true);
    	Alert alert = new Alert(AlertType.NONE);
    	alert.setTitle("�ste otomasyon");
    	alert.setHeaderText("Kay�t silme");
    	alert.setContentText("KAYDI KALICI OLARAK S�LMEK �STED�G�N�ZE EM�N M�S�N�Z ?");
    	
    	ButtonType btn1 = new ButtonType("Evet");
    	ButtonType btn2 = new ButtonType("Hay�r");
    	ButtonType btn3 = new ButtonType("�ptal");
    	alert.getButtonTypes().addAll(btn1,btn2,btn3);
    	Optional<ButtonType> sonuc = alert.showAndWait();
    	if(sonuc.get()==btn1) {
    		textarea1.clear();
    	}
    	else if(sonuc.get()==btn2) {
    		System.out.println("HAYIR secenegine t�kland�.");
    	}
    	else if(sonuc.get()==btn3) {
    		System.out.println("Iptal secenegine t�kland�.");
    	}
    
    	
    
    }
    
    
    
    public void LoginKontrol(String kul , String sifre)
    {
    	
    		 	
    	    
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("�STE Otomasyon"); 
        	alert.setHeaderText("Hata Mesaj�"); 
        	
        	Alert alert1 = new Alert(AlertType.INFORMATION); //bu yap�lar enum yap�lar�d�r 
        	alert1.setTitle("�STE Otomasyon"); 
        	alert1.setHeaderText("Bilgi Mesaj�"); 
        	
        	if(!kul.isEmpty() && !sifre.isEmpty()) //kul ve �ifre bo� de�ilde
        	{
        		if (kul.contains("mustafa@iste.edu.tr") && kul.length()==19 ) 
        		{ 
        			if (sifre.contains("=")||sifre.contains("'") || sifre.contains("\\x75") || sifre.contains("\\x25")) 
        			{
        				alert.setContentText("SQL Injection tespit edildi!!!!"); 
        				alert.showAndWait();	
        				
    				}
        			
        			else
        			{
        				if (sifre.length() != 6  )
        				{
        					
        					
        					alert.setContentText("Sifre 6 karakterli olmal�d�r");
        					alert.showAndWait();
    					}
        				
        		    	
        				
        				else
        				{
        					String username ="mustafa@iste.edu.tr";
        					String password="456789";
        					
        					if (kul.equals(username)&& sifre.equals(password)) {
								TextInputDialog dialog = new TextInputDialog(password1.getText());
        			    	dialog.setTitle("�STE otomasyon");
        			    	dialog.setHeaderText("Onay kodu");
        			    	dialog.setContentText("kod giriniz");
        			    	
        			    	Optional<String> sonuc = dialog.showAndWait();
        			    	 if (sonuc.isPresent()) {
								if(sonuc.get().contains("192523063")) {
									textarea1.setText("Ho�geldiniz Mustafa ARSLAN "+ sonuc.get());
								}else {
									alert.setContentText("l�tfen do�ru onay kodunu giriniz");
									alert.showAndWait();
								}
								
							  } 
							}
        					else {
								alert.setContentText("l�tfen do�ru �ifre giriniz.");
								alert.showAndWait();
							}
        					
        			    	
        					
        				}
        			}		
    			}
        		else
        		{
        			alert.setContentText("Ynal�� mail adresiyle girilmemelidir.."); 
        			alert.showAndWait();
        		}
        	}
        	else
        	{
        		alert.setContentText("kullan�c� ad� ve �ifre bo� ge�ilemez"); 
        		alert.showAndWait();
        	}
   
    }
    
 
    @FXML
    void initialize() {
   

    }

}




