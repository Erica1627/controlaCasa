/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import controlacasa.ControlaCasa;
import controlacasa.NovoProjeto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author reide
 */
public class TelaInicialController implements Initializable {

    @FXML private Button btNProjeto;
    @FXML private Button btAProjeto;
    @FXML private Button btSair;
    @FXML
    private Label lbControleCasa;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btNProjeto.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                abreNovoProjeto();
            
            }
        });
       
        btAProjeto.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                
            }
        });
        
        btSair.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                sair();
            }
        });
    }  
     
    private void  abreNovoProjeto(){
        NovoProjeto novoProjeto = new NovoProjeto();
       
        try {
            novoProjeto.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sair();
    }
    
    public void sair(){
        ControlaCasa.getStage().close();
    }
    
    @FXML
    private void acNovoProjeto(ActionEvent event) {
        abreNovoProjeto();
       
    }
    
    @FXML
    private void acAbrirProjeto(ActionEvent event) {
         
    }
    
     @FXML
    private void acSair(ActionEvent event) {
         sair();
    }
}
