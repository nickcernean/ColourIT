package model;

public interface TaskListModel {

        public void addTask(Task task);

        public void removeTask(String ID);

        public void removeTask(Task task);

        public int taskListSize();

        public Task getTask(int index);
    }
