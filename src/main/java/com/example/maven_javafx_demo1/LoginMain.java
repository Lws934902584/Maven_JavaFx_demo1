package com.example.maven_javafx_demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginMain extends Application {
   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage stage) throws Exception{
      AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/loginmain.fxml"));

      Scene scene = new Scene(anchorPane);

      stage.setTitle("登录界面");
      stage.setScene(scene);
      stage.show();
   }
}
