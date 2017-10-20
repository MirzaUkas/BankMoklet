/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author MirzaUY
 */
public class FXMLDocumentController implements Initializable {
 String pin="";
        String PIN="1234";
        int kesempatan=3;
        int tmp;
    @FXML
    private PasswordField input;
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton buttonc;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pencet1(ActionEvent event) {
        pin+="1";
        input.setText(pin);
    }

    @FXML
    private void pencet4(ActionEvent event) {
        pin+="4";
        input.setText(pin);
    }

    @FXML
    private void pencet7(ActionEvent event) {
        pin+="7";
        input.setText(pin);
    }

    @FXML
    private void pencetC(ActionEvent event) { 
        pin="";
        input.setText(pin);
    }

    @FXML
    private void pencet2(ActionEvent event) {
        pin+="2";
        input.setText(pin);
    }

    @FXML
    private void pencet5(ActionEvent event) {
        pin+="5";
        input.setText(pin);
    }

    @FXML
    private void pencet8(ActionEvent event) {
        pin+="8";
        input.setText(pin);
    }

    @FXML
    private void pencet0(ActionEvent event) {
        pin+="0";
        input.setText(pin);
    }

    @FXML
    private void pencet3(ActionEvent event) {
        pin+="3";
        input.setText(pin);
    }

    @FXML
    private void pencet6(ActionEvent event) {
        pin+="6";
        input.setText(pin);
    }

    @FXML
    private void pencet9(ActionEvent event) {
        pin+="9";
        input.setText(pin);
    }

    @FXML
    private void pencetok(ActionEvent event) {
         if(pin.equals(PIN)){
            try{
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxml = new FXMLLoader();
                fxml.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxml.load(),830,450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }catch(IOException e){
            System.out.println("Failed to create new window"+e);
            }
        }else{
        kesempatan-= 1;
        JOptionPane.showMessageDialog(null, "PIN salah \nTersisa "+kesempatan+ " kesempatan lagi !!");
        input.setText("");
        pin="";
        if(kesempatan == 0){
        System.exit(0);
        }
        }
    }
    
}
