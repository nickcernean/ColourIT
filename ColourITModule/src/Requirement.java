import java.util.ArrayList;

/**
 * A class representing a Requirement
 *
 * @author Nichita Railean
 * @version 1.0 3dec
 */

public class Requirement
{

  private String projectID;
  private String labelName;
  private int estimatedHours;
  private Date deadline;
  private int orderNum;
  private String requirementID;
  private UserStory description;
  private Status status;
  private Team team;
  private TaskList taskList;

  /**
   * A 7 argument constructor creating a Requirement
   *
   * @param projectID      project id
   * @param requirementID  requirement id
   * @param labelName      requirement name
   * @param description    user story description
   * @param estimatedHours estimated hours for the requirement
   * @param deadline       requirement deadline
   * @param orderNum       index of requirement
   */
  public Requirement(String labelName, String requirementID, String projectID,
      int estimatedHours, UserStory description, Date deadline, int orderNum,
      Status status)
  {
    if (projectID != null && !(projectID.equals("")) && requirementID != null
        && !(requirementID.equals("")) && labelName != null && !(labelName
        .equals("")) && description != null && estimatedHours >= 0
        && deadline != null && orderNum >= 0)
    {
      setName(labelName);
      setRequirementID(requirementID);
      this.projectID = projectID;
      setEstimatedHours(estimatedHours);
      setDescription(description);
      setDeadline(deadline);
      setOrderNum(orderNum);
      this.status=status.NOTSTARTED;
      this.team = new Team();
      this.taskList = new TaskList();
    }

  }

  /**
   * A method getting the name or the requirement
   *
   * @return name of the requirement
   */
  public String getName()
  {
    return labelName;
  }

  /**
   * A method setting the name of the requirement
   *
   * @param newLabelName the new name
   */
  public void setName(String newLabelName)
  {
    if (newLabelName != null && !(newLabelName.equals("")))
    {
      this.labelName = newLabelName;
    }
  }

  /**
   * A method returning the requirement ID
   *
   * @return the requirement ID
   */
  public String getRequirementID()
  {
    return requirementID;
  }

  /**
   * A method setting the requirement ID
   *
   * @param newID the new requirement ID
   */
  public void setRequirementID(String newID)
  {
    if (newID != null && !(newID.equals("")))
    {
      requirementID = newID;
    }
  }

  /**
   * A method getting the project ID
   *
   * @return the project id
   */
  public String getProjectID()
  {
    return projectID;
  }

  /**
   * A method getting the Estimated hours for the Requirement
   *
   * @return estimated hours of the requirement
   */
  public int getEstimatedHours()
  {
    return estimatedHours;
  }

  /**
   * A method setting the estimated hours of the requirement;
   *
   * @param newHours the new hours
   */
  public void setEstimatedHours(int newHours)
  {
    if (newHours >= 0)
    {
      this.estimatedHours = newHours;
    }
  }

  /**
   * A method getting the description
   *
   * @return description of the requirement
   */
  public UserStory getDescription()
  {
    return description;
  }

  /**
   * A method setting the description of the requirement
   *
   * @param newDescription the new description
   */
  public void setDescription(UserStory newDescription)
  {
    if (newDescription != null)
    {
      this.description = newDescription;
    }
  }

  /**
   * A method getting the deadline for the requirement
   *
   * @return the deadline of the requirement
   */
  public Date getDeadline()
  {
    return deadline;
  }

  /**
   * A method setting the dead line for the requirement
   *
   * @param newDeadline the new deadline of the requirement
   */
  public void setDeadline(Date newDeadline)
  {
    if (newDeadline != null)
    {
      this.deadline = newDeadline;
    }
  }

  /**
   * A method returning the order number
   *
   * @return returning the order number
   */

  public int getOrderNum()
  {
    return orderNum;
  }

  /**
   * A method setting the order number
   *
   * @param orderNum the new order num of the requirement
   */
  public void setOrderNum(int orderNum)
  {
    if (orderNum >= 0)
    {
      this.orderNum = orderNum;
    }
    else
      throw new IllegalArgumentException("Illegal order number");
  }

  /**
   * A method getting the status of the requirement
   *
   * @return the status of the requirement
   */
  public Status getStatus()
  {
    if (taskList.getActiveTasks().equals(null))
    {
      return Status.ENDED;
    }
    else
      return Status.STARTED;

  }

  /**
   * A method getting the hours spent on a requirement
   *
   * @return the hours spent on the requirement
   */
  public int getSpentHoursOnRequirement()
  {
    return taskList.getHoursSpent();
  }

  /**
   * A method getting the Tasklist
   *
   * @return task list
   */
  public TaskList getTasks()
  {
    return taskList;
  }

  /**
   * A method getting an array with responsible team members
   *
   * @return array with responsible team members
   */
  /*To be edited/errors pops-up*/
//  public TeamMember[] GetResponsibleTeam()
//  {
//    TeamMember[] responsibleTeam = new TeamMember[team.totalNumberOfTeamMembers()];
//    for (int i = 0; i < team.totalNumberOfTeamMembers(); i++)
//    {
//      responsibleTeam[i] = team.;
//    }
//    return responsibleTeam;
//  }



}
