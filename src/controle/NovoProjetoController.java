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
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
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
public class NovoProjetoController implements Initializable {

    @FXML private Button btAddComodo;
    @FXML private TextField txNProjeto;
    @FXML private PasswordField txCriarSenha;
    @FXML private TextField txCriarLogin;
    @FXML private Button btCriar;
    @FXML private Button btCancelar;
    @FXML private ListView<?> lvComodos;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btAddComodo.setOnMouseClicked((MouseEvent e)->{
            Util.entrarAddComodo();
        });
        btAddComodo.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.entrarAddComodo();
            }
        });
        btCriar.setOnMouseClicked((MouseEvent e)->{
            //Util.entrarTelaInicial();
            Util.sairNP();
        });
        btCriar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.entrarTelaInicial();
            }
        });
        btCancelar.setOnMouseClicked((MouseEvent e)->{
           Util.entrarTelaInicial();
        });
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                Util.entrarTelaInicial();
            }
        });
    }    
}    
    

