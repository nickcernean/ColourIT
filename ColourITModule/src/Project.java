import java.util.ArrayList;
/*
 * Project class, is the class with all the methods needed to edit/update the project and store all the data related to projects
 *
 * @author Nicolae Cernean
 * @version 1.1 2020-12-07
 */
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
  private TeamMember teamMember;
  private TaskList taskList;
  private ArrayList <Team>teamProject;

  /**
   * Creating a project with all
   *
   * @param name           - name of the project
   * @param projectID-     project ID
   * @param description    - description of the project
   * @param deadline       - the deadline of the project
   * @param estimatedHours - estimated hours spent
   * @param status         -status of the project
   */

  public Project(String name, String projectID, String description,
      Date deadline, int estimatedHours, Status status)
  {
    setName(name);
    setDescription(description);
    setProjectID(projectID);
    setDeadline(deadline);
    setEstimatedHours(estimatedHours);
    this.team = new Team();
    updateProjectStatus(Status.NOTSTARTED);
    this.requirementList = new RequirementList();
   this.taskList = new TaskList();
   this.teamProject = new ArrayList();
  }

  /**
   * Returns projects name
   *
   * @return projects name
   */
  public String getName()
  {
    return name;
  }

  /**
   * The method is adding a team to the project
   *
   * @param team added to the project
   */
  public void addATeam(Team team)
  {
     teamProject.add(team);
  }
  /**
   * Edit/Updates projects name
   *
   * @param name of the project
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Returns project description
   *
   * @return projects description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Sets/Updates projects description
   *
   * @param description of the project
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Returns project ID
   *
   * @return projects ID
   */
  public String getProjectID()
  {
    return projectID;
  }

  /**
   * Sets/Updates projects ID
   *
   * @param projectID is updating
   */
  public void setProjectID(String projectID)
  {
    if (projectID != null && !projectID.equals("") && projectID.length() == 3)
    {
      this.projectID = projectID;
    }
    else
    {
      throw new IllegalArgumentException("The ID must contain 3 characters");
    }
  }

  /**
   * Returns deadline of the project
   *
   * @return project deadline
   */
  public Date getDeadline()
  {
    return deadline;
  }

  /**
   * Sets/Updates projects ID
   *
   * @param deadline is updated
   */
  public void setDeadline(Date deadline)
  {
    this.deadline = deadline;
  }

  /**
   * Returns estimated working hours on project
   *
   * @return project estimated hours for work in project
   */
  public int getEstimatedHours()
  {
    return estimatedHours;
  }

  /**
   * Sets/updates estimated hours of work in the project
   *
   * @param estimatedHours newHours of work in project
   */
  public void setEstimatedHours(int estimatedHours)
  {
    this.estimatedHours = estimatedHours;
  }

  /**
   * Returns arequirements added in the project
   *
   * @return requirements of the project
   */
  public RequirementList getRequirements()
  {
    return requirementList;
  }

  /**
   * Sets/updates the scrum master of the project
   *
   * @param teamMemberID the team member that will be the scrum master
   */
  public void setScrumMaster(String teamMemberID)
  {
    team.getTeamMembersByID(teamMemberID).setRole(Role.SCRUM_MASTER);
  }

  /**
   * Sets/updates the scrum master of the project
   *
   * @param teamMemberID the team member that will be the product owner
   */
  public void setProductOwner(String teamMemberID)
  {
    team.getTeamMembersByID(teamMemberID).setRole(Role.PRODUCT_OWNER);
  }

  /**
   * Adds a team member in the project
   *
   * @param teamMemberID the team member that will be added in the project
   */
  public void addTeamMemberInAProject(String teamMemberID)
  {
    team.addNewTeamMember(team.getTeamMembersByID(teamMemberID));
  }

  /**
   * Returns all the team members working on the project
   *
   * @return the team member that will be added in the project
   */
  public TeamMember[] getAllMembers()
  {
    return team.getAllTeamMembers();
  }

  /**
   * Returns the project status
   *
   * @param status the new status of the project
   */
  public void updateProjectStatus(Status status)
  {
    this.status = status;
  }

  /**
   * Returns the project status
   *
   * @return the project status
   */
  public Status getProjectStatus()
  {
    return status;
  }

  /**
   * Returns the total hours that are/were spent on the project
   *
   * @return the project total hours spent
   */
  public int getHoursSpentOnProject()
  {
    return requirementList.getRequirementsListTotalHoursOfWork();
  }

  /**
   * Returns all the tasks of the project that weren't assigned to team members
   *
   * @return all the unassigned tasks between the team members
   */
  public ArrayList<Task> getUnassignedTasks()
  {
  ArrayList<Task> tasks=new ArrayList<>();
    for (int i = 0; i < teamMember.getTeamMemberTaskList().size(); i++)
    {
      if (!(teamMember.getTeamMemberTaskList().get(i).equals(taskList.getTaskByIndex(i))))
      {
      tasks.add(teamMember.getTeamMemberTaskList().get(i));
      }
    }
 return tasks;
  }

  /**
   * Returns the requirements by importance
   *
   * @return all the the requirements by importance
   */
  public Requirement[] getRequirementsByImportance()
  {
    return requirementList.getRequirementsSortedByOrderNum();
  }

}
