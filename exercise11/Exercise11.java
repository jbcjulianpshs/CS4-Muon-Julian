package exercise11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author johnb
 */
public class Exercise11 extends Application {
    /*
    Create a user interface so that the name, image logo, units, and grade of a
    single subject are displayed. Include a button that says "Next".Write the 
    code in such a way that displayed subject can be changed by changing a 
    single variable in the code. 
    */
    
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
    
    Subject displayedSubject = math;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Exercise 11");

        /* Setting a layout */
        VBox root = new VBox(8);
        Scene scene = new Scene(root, 450, 450);
        primaryStage.setScene(scene);
        
        /* Adding text */
        Text subject = new Text(displayedSubject.getName());
        subject.setFill(Color.BLUE);
        subject.setFont(new Font("Arial", 20));
        root.getChildren().add(subject);
        
        /* Adding an image */
        ImageView subjectImage = new ImageView();
        Image img = new Image(Exercise11.class.getResourceAsStream(displayedSubject.getImgFileName()));
        subjectImage.setImage(img);
        root.getChildren().add(subjectImage);
        
        String units = new String(String.valueOf(displayedSubject.getUnits()));
        String grade = new String(String.valueOf(displayedSubject.getGrade()));
        Text unitsAndGrade = new Text("Units: " + units + " Grade: " + grade);
        root.getChildren().add(unitsAndGrade);
        
        /* Adding a button */
        Button button = new Button("Next");
        root.getChildren().add(button);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}