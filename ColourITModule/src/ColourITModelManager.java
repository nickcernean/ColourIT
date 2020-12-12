public class ColourITModelManager implements ColourITModel {
    @Override
    public void addNewTeamMember(String name, int yearsOfExperience, Email email) {

    }

    @Override
    public void addTeamMemberToProject(String projectID, TeamMember teamMember) {

    }

    @Override
    public void assignTeamMemberRoleInProject(String projectID, TeamMember teamMember, Role role) {

    }

    @Override
    public void removeTeamMemberFromProject(String projectID, TeamMember teamMember) {

    }

    @Override
    public Team getAllTeamMembers() {
        return null;
    }

    @Override
    public TeamMember getTeamMemberByProjectID(String projectID, String name) {
        return null;
    }

    @Override
    public Team getTeamMembersOfAProject(String projectID) {
        return null;
    }

    @Override
    public ProjectList getProjectsByTeamMember(TeamMember teamMember) {
        return null;
    }

    @Override
    public TaskList getTeamMemberTasks(TeamMember teamMember) {
        return null;
    }

    @Override
    public void createRequirement(String projectID, String requirementID, String labelName, UserStory description, Date deadline, int estimatedHours, int orderNum) {

    }

    @Override
    public void addRequirement(Requirement requirement) {

    }

    @Override
    public RequirementList getAllRequirementsOfAProject(String projectID) {
        return null;
    }

    @Override
    public void removeRequirement(String projectID, String requirementID) {

    }

    @Override
    public void editDeadlineOfARequirement(String requirementID, Date newDeadline) {

    }

    @Override
    public void editEstimatedHoursOfARequirement(String requirementID, int estimatedHours) {

    }

    @Override
    public void editDescriptionOfArequirement(String requirementID, UserStory newDescription) {

    }

    @Override
    public Status getRequirementStatus(String requirementID) {
        return null;
    }

    @Override
    public void updateRequirementStatus(String requirementID, Status status) {

    }

    @Override
    public void assignRequirementOrder(String requirementID, int orderNum) {

    }

    @Override
    public RequirementList getRequirementsByImportance(String projectID) {
        return null;
    }

    @Override
    public int getRequirementTotalHoursOfWork(String requirementID) {
        return 0;
    }

    @Override
    public void addTaskWorkedHours(String taskID, TeamMember teamMember, double amount) {

    }

    @Override
    public double getTaskAmountOfHours(String taskID) {
        return 0;
    }

    @Override
    public void createTask(String taskID, String requirementID, String labelName, String description, Date deadline, int estimatedHours, Status status) {

    }

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void assignTaskToATeamMember(String taskID, TeamMember teamMember) {

    }

    @Override
    public TaskList getAllRequirementTasks(String requirementID) {
        return null;
    }

    @Override
    public void editDeadlineOfATask(String taskID, Date newDeadline) {

    }

    @Override
    public void editEstimatedHoursOfATask(String taskID, int estimatedHours) {

    }

    @Override
    public void editDescriptionOfATask(String taskID, String newDescription) {

    }

    @Override
    public void endTask(String taskID) {

    }

    @Override
    public Task getTask(String taskID) {
        return null;
    }

    @Override
    public void removeTask(String taskID) {

    }

    @Override
    public Status getTaskStatus(String taskID) {
        return null;
    }

    @Override
    public void addProject(String name, String description, String projectID, Date deadline, int estimatedHours) {

    }

    @Override
    public Project getProject(String projectID) {
        return null;
    }

    @Override
    public ProjectList getAllProjects() {
        return null;
    }

    @Override
    public Project getProjectByName(String name) {
        return null;
    }

    @Override
    public void removeProject(String projectID) {

    }

    @Override
    public void saveProject(String projectID, String filename) {

    }

    @Override
    public void editDeadlineOfAProject(String projectID, Date newDeadline) {

    }

    @Override
    public void editEstimatedHoursOfAProject(String projectID, int estimatedHours) {

    }

    @Override
    public void editDescriptionOfAProject(String projectID, String description) {

    }

    @Override
    public ProjectList getAllActiveProjects() {
        return null;
    }
}
