package view;

import javafx.beans.property.*;
import model.Date;
import model.Requirement;
import model.Status;
import model.UserStory;

public class RequirementViewModel {
    private StringProperty projectID;
    private StringProperty requirementID;
    private StringProperty name;
    private ObjectProperty <UserStory> userStoryObjectProperty;
    private IntegerProperty estimatedHours;
    private ObjectProperty <Date> deadlineObjectProperty;
    private IntegerProperty orderNum;
    private ObjectProperty <Status> status;

    public RequirementViewModel(Requirement requirement){
        projectID = new SimpleStringProperty(requirement.getProjectID());
        requirementID = new SimpleStringProperty(requirement.getRequirementID());
        name = new SimpleStringProperty(requirement.getName());
        userStoryObjectProperty = new SimpleObjectProperty<UserStory>(requirement.getDescription());
        estimatedHours = new SimpleIntegerProperty(requirement.getEstimatedHours());
        deadlineObjectProperty = new SimpleObjectProperty<Date>(requirement.getDeadline());
        orderNum = new SimpleIntegerProperty(requirement.getOrderNum());
        status = new SimpleObjectProperty<Status>(requirement.getStatus());

    }

    public StringProperty getProjectID(){return projectID;}

    public StringProperty getRequirementID(){return requirementID;}

    public StringProperty getName(){return name;}

    public ObjectProperty<UserStory> getUserStoryObjectProperty(){return userStoryObjectProperty;}

    public IntegerProperty getEstimatedHours(){return estimatedHours;}

    public ObjectProperty<Date> getDeadlineObjectProperty(){return deadlineObjectProperty;}

    public IntegerProperty getOrderNum(){return orderNum;}

    public ObjectProperty<Status> getStatus(){return status;}







}
