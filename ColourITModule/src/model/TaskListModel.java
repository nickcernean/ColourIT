package model;

public interface TaskListModel {

        public void addTask(Task task);

        public void removeTask(String ID);

        public void removeTask(Task task);

        public String getTaskID(Task task);
        public int taskListSize();

        public Task getTask(int index);

        String getRequirementIDOfTheTask(Task task);

        String getLabelNameOfTheTask(Task task);

        String getDescriptionOfTheTask(Task task);

        int getTeamMembersOfTheTask(Task task);

        double getSpentHoursOfTheTask(Task task);

        double getEstimatedHoursOfTheTask(Task task);
}
