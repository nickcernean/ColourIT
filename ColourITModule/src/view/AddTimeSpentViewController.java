package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Date;
import model.Status;
import model.Task;
import model.TaskListModel;

public class AddTimeSpentViewController {
    @FXML private TextField taskID;
    @FXML private TextField hoursSpent;
    @FXML private TextField addHoursSpent;
    @FXML private Label errorLabel;
    private TaskListModel model;
    private ViewHandler viewHandler;
    private Region root;
    private Task task;
    public AddTimeSpentViewController(){

    }
    public void init(ViewHandler viewHandler, TaskListModel model, Region root, Task task){
        this.model = model;
        this.viewHandler = viewHandler;
        this.root = root;
        this.task=task;
        reset();
    }
    public void reset(){
        this.taskID.setText("");
        this.hoursSpent.setText("");
        this.addHoursSpent.setText("");
        this.errorLabel.setText("");
        try{
            this.taskID.setText(model.getTaskID(task));
            this.taskID.setEditable(false);
            this.hoursSpent.setText(model.getSpentHoursOfTheTask(task)+"");
            this.hoursSpent.setEditable(false);

        }catch (Exception e){
            errorLabel.setText(e.getMessage());
        }
    }
    public Region getRoot(){
        return root;
    }
    @FXML private void backButtonPressed(){
        viewHandler.openView("taskDetails",task);
    }
    @FXML private void submitButtonPressed(){
        errorLabel.setText("");
        try
        {
            task.setHoursSpent(Double.parseDouble(addHoursSpent.getText()));
            viewHandler.openView("taskDetails",task);
        }
        catch (NumberFormatException e)
        {
            errorLabel.setText("Illegal " + e.getMessage());
        }
        catch (Exception e)
        {
            errorLabel.setText(e.getMessage());
        }
    }
}
