import java.util.ArrayList;

public class Project
{
  private String name;
  private String projectID;
  private String description;
  private Date deadline;
  private int estimatedHours;
  private RequirementList requirementList;
  private Team team;
  private Status status;
  private TaskList taskList;

  public Project(String name, String projectID, String description,
      Date deadline, int estimatedHours, Status status)
  {
    setName(name);
    setDescription(description);
    setProjectID(projectID);
    setDeadline(deadline);
    setEstimatedHours(estimatedHours);
    this.team=new Team();
    updateProjectStatus(status.NOTSTARTED);
    this.requirementList=new RequirementList();
    this.taskList=new TaskList();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public String getProjectID()
  {
    return projectID;
  }

  public void setProjectID(String projectID)
  {
    if (projectID != null && !projectID.equals("")&&projectID.length()==5)
    {
     this.projectID=projectID;
    }
    else {throw new IllegalArgumentException("The ID must contain 4 characters");}
  }

  public Date getDeadline()
  {
    return deadline;
  }

  public void setDeadline(Date deadline)
  {
    this.deadline = deadline;
  }

  public int getEstimatedHours()
  {
    return estimatedHours;
  }

  public void setEstimatedHours(int estimatedHours)
  {
    this.estimatedHours = estimatedHours;
  }

  public RequirementList getRequirements()
  {
    return requirementList;
  }

  public void setScrumMaster(String teamMemberID)
  {
    team.getTeamMembersByID(teamMemberID).setRole(Role.SCRUM_MASTER);
  }

  public void setProductOwner(String teamMemberID)
  {
    team.getTeamMembersByID(teamMemberID).setRole(Role.PRODUCT_OWNER);
  }

  public void addTeamMemberInAProject(String teamMemberID)
  {
    team.addNewTeamMember(team.getTeamMembersByID(teamMemberID));
  }

  public TeamMember[] getAllMembers()
  {
    return team.getAllTeamMembers();
  }

  public void updateProjectStatus(Status status)
  {
    this.status = status;
  }

  public Status getProjectStatus()
  {
    return status;
  }

  public int getHoursSpentOnProject()
  {
    return requirementList.getRequirementsListTotalHoursOfWork();
  }
/* To be implemented*/
//  public TaskList getUnassignedTasks()
//  {
//
//  }

  public Requirement[] getRequirementsByImportance()
  {
    return requirementList.getRequirementsSortedByOrderNum();
  }

}
