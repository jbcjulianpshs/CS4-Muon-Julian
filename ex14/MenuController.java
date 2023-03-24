/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package ex14;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class MenuController implements Initializable {
    
    @FXML private ImageView icon1, icon2, icon3;
    @FXML private Button prev, next;
    
    private int page;
    private int maxPage;
    private ArrayList<ImageView> iconList;
    
    @FXML private void next(){
        clearIcons();
        page++;
        setSubjectIcons();
        checkLimit();
    }
    
    @FXML private void previous(){
        clearIcons();
        page--;
        setSubjectIcons();
        checkLimit();
    }
    
    public void setSubjectIcons(){
        int index = page*3;
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
                iconList.get(i).setImage(img);
            }
            catch(IndexOutOfBoundsException e){
                Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
                iconList.get(i).setImage(img);
            }
        }
    }
    
    public void checkLimit(){
        if(page == maxPage) next.setDisable(true);
        else next.setDisable(false);
        if(page == 0) prev.setDisable(true);
        else prev.setDisable(false);
    }
    
    public void clearIcons(){
        for(ImageView i : iconList){
            i.setImage(null);
        }
    }
    
    @FXML private void openSubject(MouseEvent event) throws IOException {
        int offset = 0;
        if(event.getSource() == icon1) offset = 0;
        if(event.getSource() == icon2) offset = 1;
        if(event.getSource() == icon3) offset = 2;
        int index = page * 3 + offset;
        Subject selected = Subject.getSubjectByIndex(index);
        
        Node component = (Node) event.getSource();
        Stage stage = (Stage) component.getScene().getWindow();
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("subjectViewer.fxml"));
        Parent root = loader.load();
        SubjectViewerController controller = loader.getController();
        controller.setSubject(Subject.getSubjectIndex(selected));
        Scene scene = new Scene(root);
        
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iconList = new ArrayList();
        iconList.add(icon1);
        iconList.add(icon2);
        iconList.add(icon3);
        page = 0;
        maxPage = Subject.getListLength()/3;
        setSubjectIcons();
        checkLimit();
    }    
    
}
