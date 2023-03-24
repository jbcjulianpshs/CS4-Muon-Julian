/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package ex14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author johnb
 */
public class Ex14 extends Application {
    
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
    Subject ss = new Subject("Social Science", "social science.png", 1, 1.5);
    Subject english = new Subject("English", "english.png", 1, 1.75);
    Subject res = new Subject("Research", "research.png", 5, 1.5);
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
