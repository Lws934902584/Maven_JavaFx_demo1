module com.example.maven_javafx_demo1 {
   requires javafx.controls;
   requires javafx.fxml;


   opens com.example.maven_javafx_demo1 to javafx.fxml;

   //自己新写了一个文件需要在这里模块化
   opens com.example.maven_javafx_demo1.test to javafx.fxml;
   opens com.example.maven_javafx_demo1.test2 to javafx.fxml;
   opens com.example.maven_javafx_demo1.test3 to javafx.fxml;





   exports com.example.maven_javafx_demo1;
   exports com.example.maven_javafx_demo1.test;
   exports com.example.maven_javafx_demo1.test2;
   exports com.example.maven_javafx_demo1.test3;

   exports com.example.maven_javafx_demo1.view;
   opens com.example.maven_javafx_demo1.view to javafx.fxml;

}