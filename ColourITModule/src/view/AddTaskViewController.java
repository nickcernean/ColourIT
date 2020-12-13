package view;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    @FXML private TextField day;
    @FXML private TextField month;
    @FXML private TextField year;
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
        this.day.setText("");
        this.month.setText("");
        this.year.setText("");
        this.taskDescriptionTextField.setText("");
        statusChoiceBox = new ChoiceBox<Status>();
        statusChoiceBox.setItems(FXCollections.observableArrayList(Status.NOTSTARTED,Status.STARTED,Status.ENDED));
        statusChoiceBox.setTooltip(new Tooltip("Select Task status."));
        //deadlineDatePicker = new DatePicker();
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
          //  LocalDate date = deadlineDatePicker.getValue();

            Task task = new Task(taskIDTextField.getText(),requirementIDTextField.getText(),labelNameTextField.getText(),taskDescriptionTextField.getText(),new Date(Integer.parseInt(day.getText()),Integer.parseInt(month.getText()),Integer.parseInt(year.getText())),Double.parseDouble(estimatedHoursTextField.getText()),Status.STARTED );
            model.addTask(task);
            viewHandler.openView("taskList");
           // System.out.println(date);
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
