/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author MirzaUY
 */
public class FXMLMenuAwalController implements Initializable {
    int sal= 100000;
    
    @FXML
    private JFXButton seket;
    @FXML
    private JFXButton limaratus;
    @FXML
    private JFXButton satus;
    @FXML
    private JFXButton duaratus;
    @FXML
    private JFXButton satujuta;
    @FXML
    private JFXButton lain;
    @FXML
    private JFXTextField saldo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        saldo.setText(100000+"");
    }    

    @FXML
    private void aksiseket(ActionEvent event) {
        sal-=50000;
        saldo.setText(sal+"");
        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL \nSaldo Anda Tersisa "+sal);
        
    }

    @FXML
    private void aksilima(ActionEvent event) {
         sal-=500000;
        saldo.setText(sal+"");
        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL \nSaldo Anda Tersisa "+sal);
    }

    @FXML
    private void aksisatus(ActionEvent event) {
        sal-=100000;
        saldo.setText(sal+"");
        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL \nSaldo Anda Tersisa "+sal);
    }

    @FXML
    private void aksiduaratus(ActionEvent event) {
         sal-=200000;
        saldo.setText(sal+"");
        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL \nSaldo Anda Tersisa "+sal);
    }

    @FXML
    private void aksisatujuta(ActionEvent event) {
        sal-=1000000;
        saldo.setText(sal+"");
        JOptionPane.showMessageDialog(null, "PENARIKAN BERHASIL \nSaldo Anda Tersisa "+sal);
    }

    @FXML
    private void aksilain(ActionEvent event) {
    }
    
}
