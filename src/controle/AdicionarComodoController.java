/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controlacasa.AdicionarComodo;
import controlacasa.NovoProjeto;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


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
       /* 
        btCriar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                abreNovoProjeto();
                sair();
            }
        });
        
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                abreNovoProjeto();
                sair();
            }
        });*/
    }    
    private void abreNovoProjeto(){
        NovoProjeto novoProjeto = new NovoProjeto();
        
        try {
            novoProjeto.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(AdicionarComodoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sair();
    }
    public void sair(){
        AdicionarComodo.getStage().close();
    }

    @FXML
    private void acCriar(ActionEvent event) {
        abreNovoProjeto();   
    }

    @FXML
    private void acCancelar(ActionEvent event) {
        abreNovoProjeto();
        sair();
    }
}
