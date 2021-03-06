package model;

public interface ColourITModel {
    void addNewTeamMember(String name,int yearsOfExperience,Email email);
    void addTeamMemberToProject(String projectID,TeamMember teamMember);
    void assignTeamMemberRoleInProject(String projectID, TeamMember teamMember, Role role);
    void removeTeamMemberFromProject(String projectID,TeamMember teamMember);
    Team getAllTeamMembers();
    TeamMember getTeamMemberByProjectID(String projectID, String name);
    Team getTeamMembersOfAProject(String projectID);
    ProjectList getProjectsByTeamMember(TeamMember teamMember);
    TaskList getTeamMemberTasks(TeamMember teamMember);
    void createRequirement(String projectID,String requirementID,String labelName,UserStory description,Date deadline,int estimatedHours,
    int orderNum);
    void addRequirement(Requirement requirement);
    RequirementList getAllRequirementsOfAProject(String projectID);
    void removeRequirement(String projectID, String requirementID);
    void editDeadlineOfARequirement(String requirementID,Date newDeadline);
    void editEstimatedHoursOfARequirement(String requirementID,int estimatedHours);
    void editDescriptionOfArequirement(String requirementID, UserStory newDescription);
    Status getRequirementStatus(String requirementID);
    void updateRequirementStatus(String requirementID,Status status);
    void assignRequirementOrder(String requirementID,int orderNum);
    RequirementList getRequirementsByImportance(String projectID);
    int getRequirementTotalHoursOfWork(String requirementID);
    void addTaskWorkedHours(String taskID,TeamMember teamMember,double amount);
    double getTaskAmountOfHours(String taskID);
    void createTask(String taskID, String requirementID, String labelName, String description, Date deadline, int estimatedHours, Status status);
    void addTask(Task task);
    void assignTaskToATeamMember(String taskID,TeamMember teamMember);
    TaskList getAllRequirementTasks(String requirementID);
    void editDeadlineOfATask(String taskID,Date newDeadline);
    void editEstimatedHoursOfATask(String taskID,int estimatedHours);
    void editDescriptionOfATask(String taskID,String newDescription);
    void endTask(String taskID);
    Task getTask(String taskID);
    void removeTask(String taskID);
    Status getTaskStatus(String taskID);
    void addProject(String name,String description,String projectID,Date deadline,int estimatedHours);
    Project getProject(String projectID);
    ProjectList getAllProjects();
    Project getProjectByName(String name);
    void removeProject(String projectID);
    void saveProject(String projectID,String filename);
    void editDeadlineOfAProject(String projectID,Date newDeadline);
    void editEstimatedHoursOfAProject(String projectID, int estimatedHours);
    void editDescriptionOfAProject(String projectID,String description);
    ProjectList getAllActiveProjects();
}
