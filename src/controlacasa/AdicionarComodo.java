/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlacasa;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author reide
 */
public class AdicionarComodo extends Application {

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        AdicionarComodo.stage = stage;
    }
    private static Stage stage;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/telas/AdicionarComodo.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Adicionar Cômodo");
        stage.setScene(scene);
        stage.show();
       setStage(stage);
    }
}
