package com.example.maven_javafx_demo1.test2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {

   @FXML
   private CheckBox myChoicebox;

   @FXML
   private ImageView myImageView;

   @FXML
   private Label myLabel;

   @FXML
   private AnchorPane choicebox;

   Image image1 =
           new Image(this.getClass().getResourceAsStream("lightbulb_01.png"));
   Image image2 =
           new Image(this.getClass().getResourceAsStream("lightbulb_01_on.png"));

   boolean OK = true;
   public void change(ActionEvent event){
      if(OK){
         myLabel.setText("灯已打开");
         myImageView.setImage(image2);
         OK = false;
      }else{
         myLabel.setText("灯已关闭");
         myImageView.setImage(image1);
         OK = true;
      }
   }

}
