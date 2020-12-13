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
    private TaskListViewController taskListViewController;
    private AddTaskViewController addTaskViewController;
    public ViewHandler (TaskListModel model){
        this.currentScene = new Scene (new Region());
        this.model=model;
    }
    public void start(Stage primaryStage){
        this.primaryStage=primaryStage;
        openView("taskList");
    }
    public void openView(String id){
        Region root =null;
        switch(id){
            case "taskList":
                 root = loadTaskListView("TaskListView.fxml");
                break;
            case "addTask":
                 root = loadAddTaskView("addTaskView.fxml");
                 break;
            case "taskDetails":
                root = loadTaskDetailsView("TaskDetailsView.fxml");
                break;
        }
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
    private Region loadAddTaskView(String fxmlFile){
        if(addTaskViewController==null){
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                Region root = loader.load();
                addTaskViewController=loader.getController();
                addTaskViewController.init(this,model,root);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            addTaskViewController.reset();
        }
        return addTaskViewController.getRoot();
    }
    private Region loadTaskListView(String fxmlFile){
        if (taskListViewController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                Region root = loader.load();
                taskListViewController = loader.getController();
                taskListViewController.init(this, model, root);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            taskListViewController.reset();
        }
        return taskListViewController.getRoot();
}
    private Region loadTaskDetailsView(String fxmlFile){
        Region root=null;
      //  if (taskListViewController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                 root = loader.load();
               // taskListViewController = loader.getController();
               // taskListViewController.init(this, model, root);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
//       else
//        {
//            taskListViewController.reset();
//        }
        return root;
    }}
