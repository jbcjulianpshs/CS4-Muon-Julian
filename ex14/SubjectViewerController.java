/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package ex14;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author johnb
 */
public class SubjectViewerController implements Initializable {
    
    @FXML public ImageView subjectImage;
    @FXML public Text subject, units, grade, errortext;
    @FXML public Button previous, next, back, search;
    @FXML public TextField searchBar;
    
    @FXML public void setSubject(int x) {
        subject.setText(Subject.subjectList.get(x).getName());
        units.setText(Double.toString(Subject.subjectList.get(x).getUnits()));
        grade.setText(Double.toString(Subject.subjectList.get(x).getGrade()));
        Image i = new Image(getClass().getResourceAsStream("imgs/" + Subject.subjectList.get(x).getImgFileName()));
        subjectImage.setImage(i);
        buttonEnabling(x);
    }
    
    @FXML public void next(ActionEvent event) {
        int x = Subject.getSubjectIndex(subject.getText());
        x++;
        setSubject(x);
    }
    
    @FXML public void previous(ActionEvent event) {
        int x = Subject.getSubjectIndex(subject.getText());
        x--;
        setSubject(x);
    }
    
    @FXML private void back (ActionEvent event) throws IOException{
        Node component = (Node) event.getSource();
        Stage stage = (Stage) component.getScene().getWindow();
        
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
    public void buttonEnabling(int x) {
        if(x <= 0){
        previous.setDisable(true);
        }else{previous.setDisable(false);}
        if(x >= ((Subject.subjectList.size())-1)){
        next.setDisable(true);
        }else{next.setDisable(false);}
    }
    
    @FXML public void search(ActionEvent event) {
        String term = searchBar.getText();
        try{
            int y = Subject.getSubjectIndex(term);
            setSubject(y);
        }
        catch(NullPointerException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Subject not found.");
            alert.showAndWait();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
