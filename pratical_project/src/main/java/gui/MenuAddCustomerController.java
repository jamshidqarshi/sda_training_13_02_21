package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MenuAddCustomerController {

    @FXML
    private Label labelResult;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtPassport;

    @FXML
    private TextField txtNacId;

    @FXML
    private TextField txtDob;

    @FXML
    private Button btnSave;
    @FXML
    private Button btnClean;

    @FXML
    public void buttonClick(ActionEvent e) {
        String name = txtName.getText().toString();
        String lName = txtLastName.getText().toString();

        if (e.getSource() == btnSave) {
            labelResult.setText(name +" "+ lName);
            //here call repository save customer
        } else  if (e.getSource() == btnClean) {
            //clean TextField
        }
    }

}
