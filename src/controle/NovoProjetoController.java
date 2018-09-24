/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controlacasa.AdicionarComodo;
import controlacasa.ControlaCasa;
import controlacasa.NovoProjeto;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


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
        
     btAddComodo.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                entrarAddComodo ();
            }
        });
        
        btCriar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                entrarTelaInicial();
            }
        });
        
        btCancelar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
               entrarTelaInicial();
            }
        });
    }   
    
    private void entrarAddComodo(){
        AdicionarComodo addComodo = new AdicionarComodo();
        try {
            addComodo.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(NovoProjetoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        NovoProjeto.getStage().close();
    }
    
    private void entrarTelaInicial(){
        ControlaCasa telaInicial = new ControlaCasa();
        try {
            telaInicial.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(NovoProjetoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        NovoProjeto.getStage().close();
    }

    @FXML
    private void addcomodo(ActionEvent event) {
        entrarAddComodo ();
    }
    

    @FXML
    private void cancelar(ActionEvent event) {
        entrarTelaInicial();
    }

    @FXML
    private void criar(ActionEvent event) {
         entrarTelaInicial();
    }
}    
    

