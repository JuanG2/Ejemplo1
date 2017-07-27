/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author juan.gomez_rod
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField nombre1;
    
    @FXML
    private TextField codigo1;
    
    LinkedList <Estudiante> E1;
            
    @FXML
    private void handleButtonActionA(ActionEvent event) {
       
       String nombre = nombre1.getText();
       String codigo = codigo1.getText(); 
       
       Estudiante objE = new Estudiante (nombre,codigo);
       boolean ss = E1.add(objE);
       if(ss){
          nombre1.setText("");
          codigo1.setText("");
       }
    }
    
    private void handleButtonActionM(ActionEvent event) {
       String mostrar= "";
       for(int i=0; i<E1.size(); i++){
             
            
         }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        E1 = new LinkedList<>();
    }    
    
}

