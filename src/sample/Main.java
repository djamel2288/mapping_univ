package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.classes.Etudiant;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws ParseException {
        //launch(args);
        int age;
        Date dt = new SimpleDateFormat("yyyy-MM-dd").parse("1995-08-27");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Etudiant et = new Etudiant("CHAHRAT", dt);
        age = et.age();
        System.out.println("Nome : "+et.getEtu_nom()+"\nAge : "+age);
    }
}
