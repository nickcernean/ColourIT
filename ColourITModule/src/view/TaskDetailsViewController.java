package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Task;
import model.TaskList;
import model.TaskListModel;

public class TaskDetailsViewController
{
    @FXML private TextField taskID;
    @FXML private TextField requirementID;
    @FXML private TextField labelName;
    @FXML private TextField description;
    @FXML private TextField numberOfTeamMembers;
    @FXML private TextField spentHours;
    @FXML private TextField estimatedHours;
    @FXML private Label errorLabel;

    private Region root;
    private TaskListModel model;
    private ViewHandler viewHandler;
    private Task task;

    public TaskDetailsViewController()
    {
        // Called by FXMLLoader
    }

    public void init(ViewHandler viewHandler, TaskListModel model, Region root, Task task)
    {
        this.model = model;
        this.viewHandler = viewHandler;
        this.root = root;
        this.task=task;
        reset();
    }

    public void reset()
    {
        this.taskID.setText("");
        this.requirementID.setText("");
        this.labelName.setText("");
        this.description.setText("");
        this.numberOfTeamMembers.setText("");
        this.estimatedHours.setText("");
        try
        {
            this.taskID.setText(model.getTaskID(task));
            this.taskID.setEditable(false);
            this.requirementID.setText(model.getRequirementIDOfTheTask(task));
            this.requirementID.setEditable(false);
            this.labelName.setText(model.getLabelNameOfTheTask(task));
            this.labelName.setEditable(false);
            this.requirementID.setEditable(false);
            this.description.setText(model.getDescriptionOfTheTask(task));
            this.description.setEditable(false);
            this.numberOfTeamMembers.setText(0+"");
            this.numberOfTeamMembers.setEditable(false);
            this.spentHours.setText(model.getSpentHoursOfTheTask(task)+"");
            this.spentHours.setEditable(false);
            this.estimatedHours.setText(model.getEstimatedHoursOfTheTask(task)+"");
            this.estimatedHours.setEditable(false);
            this.errorLabel.setText("");
        }
        catch (Exception e)
        {
            this.errorLabel.setText(e.getMessage());
        }
    }

    public Region getRoot()
    {
        return root;
    }

    @FXML private void backButtonPressed()
    {
        viewHandler.openView("taskList");
    }
    @FXML private void addTimeSpentButtonPressed(){viewHandler.openView("addHoursSpent",task);}
}

