package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.Requirement;
import model.RequirementList;
import model.RequirementListModel;

public class ViewHandler {
    private Scene currentScene;
    private Stage primaryStage;
    private RequirementListModel model;
    private RequirementListMenuControllerr menuControllerr;
    private AddRequirementController addRequirementController;

    public ViewHandler(RequirementListModel model){
        this.model = model;
        currentScene = new Scene(new Region());
    }

    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        openView("Menu");
    }

    public void openView(String id){
        Region root = null;
        switch (id){
            case "Menu":
                root = loadRequirementListView("RequirementListMenu.fxml");
                break;
            case "Add":
                root = loadAddRequirement("AddRequirementB.fxml");
                break;

        }
        currentScene.setRoot(root);
        String title = "";
        if (root.getUserData() != null)
        {
            title += root.getUserData();
        }
        primaryStage.setTitle(title);
        primaryStage.setScene(currentScene);
        primaryStage.setWidth(root.getPrefWidth());
        primaryStage.setHeight(root.getPrefHeight());
        primaryStage.show();
    }

    public void closeView(){ primaryStage.close();}

    private Region loadRequirementListView(String fxmlFile){
        if(menuControllerr == null){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                Region root = loader.load();
                menuControllerr = loader.getController();
                menuControllerr.init(this,model,root);
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            menuControllerr.reset();
        }
        return menuControllerr.getRoot();
    }

    private Region loadAddRequirement(String fxmlFile){
        if(addRequirementController == null){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));
                Region root = loader.load();
                addRequirementController = loader.getController();
                addRequirementController.init(this,model,root);
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            addRequirementController.reset();
        }
        return addRequirementController.getRoot();

    }







}
