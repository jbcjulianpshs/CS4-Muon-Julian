/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
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

/**
 *
 * @author johnb
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML public ImageView subjectImage;
    @FXML public Text subject;
    @FXML public Text units;
    @FXML public Text grade;
    @FXML public Button previous;
    @FXML public Button next;
    @FXML public TextField searchBar;
    @FXML public Button search;
    @FXML public Text errortext;
    
    @FXML public void setSubject(int x) {
        subject.setText(Subject.subjectList.get(x).getName());
        units.setText(Double.toString(Subject.subjectList.get(x).getUnits()));
        grade.setText(Double.toString(Subject.subjectList.get(x).getGrade()));
        Image i = new Image(getClass().getResourceAsStream(Subject.subjectList.get(x).getImgFileName()));
        subjectImage.setImage(i);
        buttonEnabling(x);
        errortext.setText("");
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
            errortext.setText("Subject does not exist");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setSubject(0);
    }    
    
}
