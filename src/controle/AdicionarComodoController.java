/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controlacasa.AdicionarComodo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import util.Util;

/**
 * FXML Controller class
 *
 * @author reide
 */
public class AdicionarComodoController implements Initializable {

    @FXML private TextField txNomeComodo;
    @FXML private TextField txLargura;
    @FXML private TextField txComprimento;
    @FXML private Button btCriar;
    @FXML private Button btCancelar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btCriar.setOnMouseClicked((MouseEvent e)->{
            
            Util.abreNovoProjeto();
            sair();
        });
        btCriar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.abreNovoProjeto();
                sair();
            }
        });
        btCancelar.setOnMouseClicked((MouseEvent e)->{
           Util.abreNovoProjeto();
           sair();
        });
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.abreNovoProjeto();
                sair();
            }
        });
    }    
    
    public void sair(){
        AdicionarComodo.getStage().close();
    }
}
