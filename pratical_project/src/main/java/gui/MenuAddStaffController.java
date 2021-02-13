package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class MenuAddStaffController {
	@FXML
	private Label label;
	
	@FXML
	private CheckBox ch1;

	@FXML
	private CheckBox ch2;

	@FXML
	private ChoiceBox<String> choiceBox;

	@FXML
	private ComboBox<String> comboBox;
	private ObservableList<String> boxdata = FXCollections.observableArrayList();


	@FXML 
	ToggleGroup groupRadio;
	@FXML 
	RadioButton radioA;
	@FXML 
	RadioButton radioB;


	@FXML
	private TextField textField;


	@FXML 
	ToggleGroup groupToggle;
	@FXML
	private ToggleButton toggleA;
	@FXML
	private ToggleButton toggleB;

	@FXML
	private Slider slider;
	
	
	@FXML
	private Button btnCkeckBox;
	@FXML
	private Button btnChoiceBox;
	@FXML
	private Button btnComboBox;
	@FXML
	private Button btnRadio;
	@FXML
	private Button btnTextField;
	@FXML
	private Button btnToggleButton;
	@FXML
	private Button btnToggleSlider;
	
	
	public MenuAddStaffController() {
		boxdata.add("Japan");
		boxdata.add("England");
		boxdata.add("Italy");
		boxdata.add("Ireland");
		boxdata.add("Germany");
	}




	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		comboBox.setItems(boxdata);
		comboBox.setValue("Japan");

		choiceBox.setItems(boxdata);
		choiceBox.setValue("Ireland");


		
		/** ComboBox */
		comboBox.setOnAction((event) -> {
			String selectedS = comboBox.getSelectionModel().getSelectedItem();
			label.setText("ComboBox: " + selectedS);
		});

		//		comboBox.setOnAction(new EventHandler<ActionEvent>(){
		//			@Override
		//			public void handle(ActionEvent event) {
		//				String selectedS = comboBox.getSelectionModel().getSelectedItem();
		//				label.setText("ComboBox: " + selectedS);
		//			}
		//		});



		
		/** ChoiceBox */
		choiceBox.setOnAction((event) ->{
			String selectedS = choiceBox.getSelectionModel().getSelectedItem();
			label.setText("ChoiceBox: " + selectedS);
		});


		
		/** CheckBox */
		ch1.setOnAction((event) -> {
			boolean selectedS = ch1.isSelected();
			label.setText("CheckBox 1: " + selectedS);
		});

		ch2.setOnAction((event) -> {
			boolean selectedS = ch2.isSelected();
			label.setText("CheckBox 2: " + selectedS);
		});


		
		/** Radio Button */
		groupRadio.selectedToggleProperty().addListener(((observable, oldValue, newValue) -> {
			if (groupRadio.getSelectedToggle() != null) {
				label.setText("Radio: " + ((RadioButton) this.groupRadio.getSelectedToggle()).getText());
			}
		}));


		/** TextField */
		// Handle TextField text changes.
		textField.textProperty().addListener((observable, oldValue, newValue) -> {
			label.setText("TextField: " + textField.getText());
		});

		// Handle TextField enter key event.
		//		textField.setOnAction((event) -> {
		//			label.setText("TextField: " + textField.getText());
		//		});




		/** ToggleButton */
		groupToggle.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			label.setText("TextField: " + textField.getText());
			if(toggleA.isSelected()) {
				toggleA.setStyle("-fx-base: darkorange;");
				toggleB.setStyle("-fx-base: lightblue;");
				label.setText("TA: ");
			} else {
				toggleA.setStyle("-fx-base: lightblue;");
				toggleB.setStyle("-fx-base: darkorange;");
				label.setText("TB: ");
			}
		});
		
		/** ToggleButton */
		slider.valueProperty().addListener((observable, oldValue, newValue) -> {
			label.setText("Slider Value: " + newValue.intValue());
		});
	}

	@FXML
	public void buttonClick(ActionEvent e){
		if(e.getSource() == btnCkeckBox) {
			
			if(ch1.isSelected()) {
				alertDialog("CheckBox 1");
			}else {
				alertDialog("CheckBox 2");
			}

		} else if (e.getSource() == btnChoiceBox) {

		} else if (e.getSource() == btnComboBox) {

		} else if (e.getSource() == btnRadio) {

		} else if (e.getSource() == btnTextField) {

		} else if (e.getSource() == btnToggleButton) {

		} else if (e.getSource() == btnToggleSlider) {

		}
		//		if(e.getSource() == button){
		//			System.out.println("**** Button Pressed ****");
		//			System.out.println("Your choice is : " + choiceBox.getValue());
		//		}else if(e.getSource() == choiceBox){
		//			System.out.println("**** ChoiceBox Changed ****");
		//			System.out.println("The current choice is : " + choiceBox.getValue());
		//	
		//		}else{
		//			
		//		}

		//		 if(cb1.isSelected()){
		//	            count++;
		//	            message += cb1.getText() + "\n";
		//	        }


		//this.label.setText(((RadioButton) this.groupRadio.getSelectedToggle()).getText());

	}
	
	public void alertDialog(String msg) {
		 Alert dialog = new Alert(Alert.AlertType.INFORMATION);
         dialog.setTitle("Printing Alert Dialog");
         dialog.setHeaderText("Header...");
         dialog.setContentText(msg);
         dialog.showAndWait();
	}
}
