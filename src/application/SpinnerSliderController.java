package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;

public class SpinnerSliderController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image1;

    @FXML
    private Slider slider1;

    @FXML
    private Slider slider2;

    @FXML
    private Spinner<Integer> spin1;

    @FXML
    private Spinner<Integer> spin2;

    @FXML
    void initialize() {
        
    	SpinnerValueFactory.IntegerSpinnerValueFactory deger1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0,5);
    	SpinnerValueFactory.IntegerSpinnerValueFactory deger2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0,5);

    	spin1.setValueFactory(deger1);
    	spin2.setValueFactory(deger2);
    	
    	slider1.setMax(500);
    	//slider1.setShowTickLabels(true);
    	//slider1.setShowTickMarks(true);
    	slider1.setMajorTickUnit(25);
    	slider1.setBlockIncrement(10);
    	
    	slider2.setMax(500);
    	//slider2.setShowTickLabels(true);
    	//slider2.setShowTickMarks(true);
    	slider2.setMajorTickUnit(25);
    	slider2.setBlockIncrement(10);
    	
       	spin1.valueProperty().addListener(
    			(obs,oldValue,newValue)-> {
    				
    				image1.setLayoutX(Double.parseDouble(String.valueOf(oldValue)));	
    				image1.setLayoutX(Double.parseDouble(String.valueOf(newValue)));	
    			}
    			
    			
    			);
    	spin2.valueProperty().addListener(
    			(obs,oldValue,newValue)-> {
    				
    				
    				image1.setLayoutY(Double.parseDouble(String.valueOf(oldValue)));	
    				image1.setLayoutY(Double.parseDouble(String.valueOf(newValue)));	
    			}
    			
    			
    			);
    	
    	slider1.valueProperty().addListener(
    			(obs,oldValue,newValue)-> {
    				
    				//image1.setFitHeight(Double.parseDouble(String.valueOf(oldValue)));	
    				image1.setFitHeight(Double.parseDouble(String.valueOf(newValue)));
    				//lblHeigth.setText(String.valueOf(newValue));
    				}
    			);
    	slider2.valueProperty().addListener(
    			(obs,oldValue,newValue)-> {
    				//imageView.setFitWidth(Double.parseDouble(String.valueOf(oldValue)));
    				image1.setFitWidth(Double.parseDouble(String.valueOf(newValue)));
    				}
    			);
    	
    	
    }

}
