package com.example.maven_javafx_demo1.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

   @FXML
   private Button button2;

   @FXML
   private TextField textfiled2;

   @FXML
   private TextField textfiled1;

   @FXML
   private Button button1;

   @FXML
   private ImageView myimageview;

   @FXML
   private Label label1;

   @FXML
   private Label label2;

   @FXML
   private Label label3;

   //设置两张图片
   Image image1 =
           new Image(this.getClass().getResourceAsStream("lightbulb_01.png"));
   Image image2 =
           new Image(this.getClass().getResourceAsStream("lightbulb_01_on.png"));

   @FXML
   boolean Flag = true;

   public Stage stage;

   @FXML
   void getCheckCode(ActionEvent event) {

      if(Flag){
         label3.setText("已发送，请等待60s");
         myimageview.setImage(image2);
         Flag = false;
      }else {
         label3.setText("未发送验证码");
         myimageview.setImage(image1);
         Flag = true;
      }

   }

   @FXML
   void LoginButton(ActionEvent event) {
      try {
         AnchorPane anchorPane =
               FXMLLoader.load(this.getClass().getResource("main.fxml"));
         Scene scene = new Scene(anchorPane);
         stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.setTitle("主界面");
         stage.show();
      }catch (IOException e){
         e.printStackTrace();
      }

/*      parent operation_parent = fxmlloader.load(getclass().getresource("../main/loginmain.fxml"));

      scene operation_creating_scene = new scene(operation_parent);

      stage createoperation_stage = (stage) ((node) event.getsource()).getscene().getwindow();

      createoperation_stage.hide();

      createoperation_stage.setscene(operation_creating_scene);

      createoperation_stage.show();*/

   }



}
