package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gradeCalculator.fxml"));
        root.setStyle("-fx-background-color: #dce3e5;");
        primaryStage.setTitle("Grade Calculator");
        primaryStage.setScene(new Scene(root, 800, 620));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}

