package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Task;
import model.TaskListModel;

public class TaskListViewModel {
    private ObservableList<TaskViewModel> list;
    private TaskListModel model;
    public TaskListViewModel(TaskListModel model){
        this.model=model;
        this.list= FXCollections.observableArrayList();
        update();
    }
    public void update(){
        list.clear();
        for(int i=0;i< model.taskListSize();i++){
            list.add(new TaskViewModel( model.getTask(i)));
        }
    }
    public ObservableList<TaskViewModel> getList(){
        return list;
    }
    public void remove(Task task){
        for (int i = 0; i < list.size(); i++)
        {
            // gonna finish later
        }
    }
    public void add(Task task){
        list.add(new TaskViewModel( task));
    }
}
