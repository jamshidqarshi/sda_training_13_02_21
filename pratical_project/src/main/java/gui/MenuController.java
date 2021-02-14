package gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {
    private FXMLLoader fXMLLoader;

    @FXML
    private MenuItem menuItemClose;

    @FXML
    private MenuItem menuItemScreen1;

    @FXML
    private MenuItem menuItemScreen2;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    private Pane centralPane;

    @FXML
    public void actionMenus(ActionEvent e) {

        if(e.getSource() == menuItemClose) {
            Platform.exit();
        } else if (e.getSource() == menuItemScreen1) {

            loadScreen("menuAddStaff.fxml");

        } else if (e.getSource() == menuItemScreen2) {

            loadScreen("menuAddCustomer.fxml");
        }

    }


    public void loadScreen(String screen) {

        try {
            fXMLLoader = new FXMLLoader(getClass().getResource(screen));
            centralPane.getChildren().clear();
            centralPane.getChildren().add(fXMLLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
