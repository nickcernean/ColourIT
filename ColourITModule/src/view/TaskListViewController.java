package view;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.scene.control.Alert.AlertType;

import model.Date;
import model.Status;
import model.Task;
import model.TaskListModel;

import java.util.Optional;

public class TaskListViewController {
    @FXML private TableView<TaskViewModel> taskListTable;
    @FXML private TableColumn<TaskViewModel, String > taskIDColumn;
    @FXML private TableColumn<TaskViewModel,String> requirementIDColumn;
    @FXML private TableColumn<TaskViewModel, String> nameColumn;
    @FXML private TableColumn<TaskViewModel, String> descriptionColumn;
    @FXML private TableColumn<TaskViewModel, Date> deadlineColumn;
    @FXML private TableColumn<TaskViewModel, Number> estimatedHoursColumn;
    @FXML private TableColumn<TaskViewModel, Number> hoursSpentColumn;
    @FXML private TableColumn<TaskViewModel, Status> statusColumn;
    private Region root;
    private TaskListModel model;
    private ViewHandler viewHandler;
    private TaskListViewModel viewModel;
    public TaskListViewController(){

    }
    public void init(ViewHandler viewHandler,TaskListModel model, Region root){
        this.model = model;
        this.viewHandler=viewHandler;
        this.root=root;
        this.viewModel=new TaskListViewModel(model);
        taskIDColumn.setCellValueFactory(cellData -> cellData.getValue().getTaskIDProperty());
        requirementIDColumn.setCellValueFactory(cellData -> cellData.getValue().getRequirementIDProperty());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().getLabelNameProperty());
        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().getDescriptionProperty());
        deadlineColumn.setCellValueFactory(cellData -> cellData.getValue().getDeadlineProperty());
        estimatedHoursColumn.setCellValueFactory(cellData -> cellData.getValue().getEstimatedHoursProperty());
        hoursSpentColumn.setCellValueFactory(cellData -> cellData.getValue().getSpentHoursProperty());
        statusColumn.setCellValueFactory(cellData -> cellData.getValue().getStatusProperty());
        taskListTable.setItems(viewModel.getList());
    }
    public void reset(){
        viewModel.update();
    }
    public Region getRoot(){
        return root;
    }
    @FXML private void addTaskButtonPressed(){
        viewHandler.openView("addTask");
    }
    @FXML private void removeTaskButtonPressed(){
        try
        {
            TaskViewModel selectedItem = taskListTable.getSelectionModel()
                    .getSelectedItem();

            boolean remove = confirmation();
            if (remove)
            {
                Task task = new Task(selectedItem.getTaskIDProperty().get(),
                        selectedItem.getRequirementIDProperty().get(),selectedItem.getLabelNameProperty().get(),selectedItem.getDescriptionProperty().get(),new Date(),selectedItem.getEstimatedHoursProperty().get(), Status.STARTED);
                model.removeTask(task);
                viewModel.remove(task);
                taskListTable.getSelectionModel().clearSelection();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    private Boolean confirmation(){
        int index = taskListTable.getSelectionModel().getSelectedIndex();
        TaskViewModel selectedItem = taskListTable.getItems().get(index);
        if (index < 0 || index >= taskListTable.getItems().size())
        {
            return false;
        }
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(
                "Removing task {" + selectedItem.getTaskIDProperty().get() +
                        selectedItem.getRequirementIDProperty().get() +selectedItem.getLabelNameProperty().get() + selectedItem.getDescriptionProperty().get() + selectedItem.getDeadlineProperty().get() + selectedItem.getEstimatedHoursProperty().get() + selectedItem.getStatusProperty().get() + "}");
        Optional<ButtonType> result = alert.showAndWait();
        return ((result.isPresent()) && (result.get() == ButtonType.OK));
    }
    @FXML private void showTaskDetailsButtonPressed(){
        viewHandler.openView("taskDetails");
    }
    @FXML private void assignTeamMemberButtonPressed(){
        viewHandler.openView("assignMember");
    }
    @FXML private void removeTeamMemberButtonPressed(){
        viewHandler.openView("removeMember");
    }
    @FXML private void backButtonPressed(){
        viewHandler.openView("requirements");
    }
    }

