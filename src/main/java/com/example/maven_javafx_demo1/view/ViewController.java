package com.example.maven_javafx_demo1.view;

import com.example.maven_javafx_demo1.model.Category;
import com.example.maven_javafx_demo1.model.Dish;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

   @FXML   //打了个问号的意思是泛型，这里可以是字符串类型、对象类型、整型类型  ， 一般列表是string类型的
//   private ListView<String> listView;
   private ListView<Category> listView;


   @FXML
   private TableView<Dish> tableView;

   //让列表和表格有联系
   @FXML
   private TableColumn<Dish,String> disIdColum;
   private TableColumn<Dish,String> disNameColum;
   private TableColumn<Dish,String> disImageColum;
      private TableColumn<Dish,Double> disPriceColum;

//   String[] food = {"A","B","C"};//将字符串的数据加入到listview中

   Category[] categories={new Category(),new Category(),new Category()};

   private ObservableList<Dish> dishData = FXCollections.observableArrayList();

   @Override  //重写初始化的方法
   public void initialize(URL location, ResourceBundle resources) {
      //将数据加入进来
      listView.getItems().addAll(categories);  //现获取items，后去添加数组信息进去

      dishData.add(new Dish("D001","AAA","imgs/1.png",52.5));
      dishData.add(new Dish("D002","BBB","imgs/2.png",53.5));
      dishData.add(new Dish("D003","CCC","imgs/3.png",54.5));
      dishData.add(new Dish("D004","DDD","imgs/4.png",55.5));

      //lambda表达式
      disIdColum.setCellValueFactory(cellData->cellData.getValue().dishIdProperty());
      disNameColum.setCellValueFactory(cellData->cellData.getValue().dishNameProperty());
   }
}
