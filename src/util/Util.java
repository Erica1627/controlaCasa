/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controlacasa.AdicionarComodo;
import controlacasa.ControlaCasa;
import controlacasa.NovoProjeto;
import controle.NovoProjetoController;
import controle.TelaInicialController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

/**
 *
 * @author reide
 */
public class Util {
    public static void abreNovoProjeto(){
        NovoProjeto novoProjeto = new NovoProjeto();
        try {
            novoProjeto.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void sairNP(){
        NovoProjeto.getStage().close();
    }
    
    public static void entrarAddComodo(){
        AdicionarComodo addComodo = new AdicionarComodo();
        try {
            addComodo.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sairNP();
    }
    
    public static void entrarTelaInicial(){
        ControlaCasa telaInicial = new ControlaCasa();
        try {
            telaInicial.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(NovoProjetoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        sairNP();
    }
}
