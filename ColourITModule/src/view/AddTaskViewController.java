package view;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Date;
import model.Status;
import model.Task;
import model.TaskListModel;

public class AddTaskViewController
{
    @FXML private TextField taskIDTextField;

    @FXML private TextField requirementIDTextField;
    @FXML private TextField labelNameTextField;
    @FXML private TextField taskDescriptionTextField;
    @FXML private DatePicker deadlineDatePicker;
    @FXML private TextField estimatedHoursTextField;
    @FXML private ChoiceBox<Status> statusChoiceBox;
    @FXML private Label errorLabel;

    private Region root;
    private TaskListModel model;
    private ViewHandler viewHandler;

    public AddTaskViewController()
    {
        // Called by FXMLLoader
    }

    public void init(ViewHandler viewHandler, TaskListModel model, Region root)
    {
        this.model = model;
        this.viewHandler = viewHandler;
        this.root = root;
        reset();
    }

    public void reset()
    {
        this.errorLabel.setText("");
        this.taskIDTextField.setText("");
        this.requirementIDTextField.setText("");
        this.estimatedHoursTextField.setText("");
        this.labelNameTextField.setText("");
        this.taskDescriptionTextField.setText("");
        statusChoiceBox = new ChoiceBox<>();
        statusChoiceBox.setItems(FXCollections.observableArrayList(Status.NOTSTARTED,Status.STARTED,Status.ENDED));
    }

    public Region getRoot()
    {
        return root;
    }

    @FXML private void addTaskSubmitButtonPressed()
    {
        errorLabel.setText("");
        try
        {
            Task task = new Task(taskIDTextField.getText(),requirementIDTextField.getText(),labelNameTextField.getText(),taskDescriptionTextField.getText(),new Date(),Double.parseDouble(estimatedHoursTextField.getText()),Status.STARTED );
            model.addTask(task);
            viewHandler.openView("taskList");
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

    @FXML private void addTaskCancelButtonPressed()
    {
        viewHandler.openView("taskList");
    }


}
