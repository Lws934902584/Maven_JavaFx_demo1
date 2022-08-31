package com.example.maven_javafx_demo1.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
   public static void main(String[] args) {
      Application.launch(args);
   }

   //重写父类方法
   @Override
   public void start(Stage stage) throws Exception {
      // Unable to construct Application instance: class com.example.maven_javafx_demo1.test.Main
      //自己新建的无法运行，java需要模块化，要在module-info。java写模块化

  /*    Label label1 = new Label("你好啊");
      BorderPane pane = new BorderPane(label1);
      Scene scene = new Scene(pane);
      stage.setScene(scene);
      stage.show();
      stage.setHeight(400);
      stage.setWidth(400);*/


      //-------FXMLLoader  要让他能够和scene builder联系起来，让它能够显示--------
      //静态方法的方式
      AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("main.fxml"));
      //动态方法的方式
//      FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("loginmain.fxml"));

      //-------Scene-------
      Scene scene = new Scene(anchorPane);
      stage.setScene(scene);
      stage.show();

   }
}
