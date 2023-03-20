/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.Event;


/**
 *
 * @author MUON
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML ImageView subjectImage;
    @FXML Text subject;
    @FXML Text units;
    @FXML Text grade;
    @FXML Button start;
    @FXML Button previous;
    @FXML Button next;
    @FXML Button search;
    @FXML TextField searchBar;
    
    int x = 0;
    
    @FXML public void setSubject() {
        Image img = new Image(Subject.subjectList.get(0).getImgFileName());
        subjectImage.setImage(img);
        subject.setText(Subject.subjectList.get(0).getName());
        Scene subjectScene = new Scene(root);
            Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            thisStage.hide();
            thisStage.setScene(subjectScene);
            thisStage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
