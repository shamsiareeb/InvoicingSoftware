package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML protected void newCustomer(ActionEvent Event) throws IOException{
    Stage stage = new Stage();
    Parent root = FXMLLoader.load(getClass().getResource("popupNewCustomer.fxml"));
    Scene scene = new Scene(root, 300, 275);
    stage.setScene(scene);
    Popup popup = new Popup();
    popup.show(stage);
    }
    @FXML protected void newItem(ActionEvent Event){
        Popup popup = new Popup();
    }
    @FXML protected void newInvoice(ActionEvent Event){
        Popup popup = new Popup();
    }
    @FXML protected void newPayment(ActionEvent Event){
        Popup popup = new Popup();
    }
    @FXML protected void newEstimate(ActionEvent Event){
        Popup popup = new Popup();
    }

}
