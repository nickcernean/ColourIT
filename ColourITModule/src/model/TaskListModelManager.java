package model;

public class TaskListModelManager implements TaskListModel {
    private TaskList taskList;

    public TaskListModelManager(){
        this.taskList= new TaskList();
        createDummyData();
    }
    private void createDummyData(){
//        try{
//            String
//        }
    }
    @Override
    public void addTask(Task task) {
        taskList.addTask(task);
    }

    @Override
    public void removeTask(String ID) {
        taskList.removeTaskByID(ID);
    }

    @Override
    public void removeTask(Task task) {
        taskList.removeTask(task);
    }

    @Override
    public int taskListSize() {
        return taskList.getSize();
    }

    @Override
    public Task getTask(int index) {
        return taskList.getTaskByIndex(index);
    }
}
