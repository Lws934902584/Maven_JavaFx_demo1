package com.example.maven_javafx_demo1.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class MainController {

   @FXML
   private Button button4;

   @FXML
   private Label label4;

   @FXML
   private Button button5;

   @FXML
   private Button button2;

   @FXML
   private Button button3;

   @FXML
   private Button button6;

   @FXML
   private ImageView myimageview;

   @FXML
   private Button button1;

   @FXML
   private Label label1;

   @FXML
   private Label label2;

   @FXML
   private Label label3;


   @FXML
   void show1(ActionEvent event) {
      label1.setText("60¥");
      label2.setText("90份");

   }

   @FXML
   void show2(ActionEvent event) {
      label1.setText("68¥");
      label2.setText("45份");

   }

   @FXML
   void show3(ActionEvent event) {
      label1.setText("15¥");
      label2.setText("29份");

   }

}
