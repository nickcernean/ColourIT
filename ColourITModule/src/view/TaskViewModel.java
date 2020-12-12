package view;

import javafx.beans.property.*;
import model.Date;
import model.Task;

public class TaskViewModel {
    private StringProperty taskIDProperty;
    private StringProperty requirementIDProperty;
    private StringProperty labelNameProperty;
    private ObjectProperty<Date> deadlineProperty;
    private DoubleProperty estimatedHoursProperty;
    private DoubleProperty spentHoursProperty;
    public TaskViewModel(Task task){
        taskIDProperty=new SimpleStringProperty(task.getTaskID());
        requirementIDProperty = new SimpleStringProperty(task.getRequirementID());
        labelNameProperty = new SimpleStringProperty(task.getLabelName());
        deadlineProperty = new SimpleObjectProperty<Date>(task.getDeadline());
        estimatedHoursProperty = new SimpleDoubleProperty(task.getEstimatedHours());
        spentHoursProperty = new SimpleDoubleProperty(task.getTimeSpent());
    }
    public StringProperty getTaskIDProperty(){
        return taskIDProperty;
    }
    public StringProperty getRequirementIDProperty(){
        return requirementIDProperty;
    }
    public StringProperty getLabelNameProperty(){
        return labelNameProperty;
    }
    public ObjectProperty<Date> getDeadlineProperty(){
        return deadlineProperty;
    }
    public DoubleProperty getEstimatedHoursProperty(){
        return estimatedHoursProperty;
    }
    public DoubleProperty getSpentHoursProperty(){
        return spentHoursProperty;
    }
}
