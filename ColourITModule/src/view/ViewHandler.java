package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.TaskListModel;

public class ViewHandler {
    private Scene currentScene;
    private Stage primaryStage;
    private TaskListModel model;
    public ViewHandler (TaskListModel model){
        this.currentScene = new Scene (new Region());
        this.model=model;
    }
    public void start(Stage primaryStage){
        this.primaryStage=primaryStage;
        openView();
    }
    public void openView(){
        Region root = loadTaskListView("TaskListView.fxml");
        currentScene.setRoot(root);
        String title="";
        if(root.getUserData()!=null){
            title+=root.getUserData();
        }
        primaryStage.setTitle(title);
        primaryStage.setScene(currentScene);
        primaryStage.setWidth(root.getPrefWidth());
        primaryStage.setHeight(root.getPrefHeight());
        primaryStage.show();
    }
    private Region loadTaskListView(String fxmlFile){
        Region root = null;
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlFile));
            root=loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }
        return root;
    }
}
