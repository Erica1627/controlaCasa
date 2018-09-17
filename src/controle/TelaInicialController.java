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
import javafx.scene.input.KeyCode;
import util.Util;

/**
 * FXML Controller class
 *
 * @author reide
 */
public class TelaInicialController implements Initializable {

    @FXML private Button btNProjeto;
    @FXML private Button btAProjeto;
    @FXML private Button btSair;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btNProjeto.setOnMouseClicked((MouseEvent e)->{
            Util.abreNovoProjeto();
            //sair();
        });
        btNProjeto.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.abreNovoProjeto();
                //sair();
            }
        });
        btAProjeto.setOnMouseClicked((MouseEvent e)->{
            
        });
        btAProjeto.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                
            }
        });
        btSair.setOnMouseClicked((MouseEvent e)->{
           sair();
        });
        btSair.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                sair();
            }
        });
    }    
    
    public void sair(){
        ControlaCasa.getStage().close();
    }
}
