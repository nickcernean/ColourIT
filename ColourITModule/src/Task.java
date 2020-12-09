import java.util.ArrayList;

/**
 * Task object to describe and share the work of the task
 *
 * @author Rokas Paulauskas
 * @author Nicolae Cernean(edited)
 * @version 1.001 2020-12-03
 * @version 1.002 2020-12-07
 */
public class Task
{
  private String taskID;
  private Requirement requirementID;
  private String labelName;
  private String description;
  private double estimatedHours;
  private Date deadline;
  private double hoursSpent;
  private Status status;
  private Team team;

  /**
   * Creates a task object
   *
   * @param taskID         - task identification number
   * @param requirementID  - requirement identification number
   * @param labelName      - task name
   * @param description    - what you have to do
   * @param deadline       - by when it should be finished
   * @param estimatedHours - in how many hours you should approximately finish it
   */
  public Task(String taskID, Requirement requirementID, String labelName,
      String description, Date deadline, int estimatedHours, Status status)
  {
    if (taskID != null && !taskID.equals("") && requirementID != null
        && !requirementID.equals("") && labelName != null && !labelName
        .equals("") && description != null && !description.equals("")
        && deadline != null && estimatedHours >= 0)
    {
      setTaskID(taskID);
      this.requirementID = requirementID;
      setLabelName(labelName);
      setDeadline(deadline);
      setDescription(description);
      setEstimatedHours(estimatedHours);
      this.team=new Team();
      setHoursSpent(0);
      setStatus(Status.NOTSTARTED);
    }
  }
  /**
   * get task identification number
   *
   * @return taskID
   */
  public String getTaskID()
  {
    return taskID;
  }

  /**
   * change task identification number to new one
   *
   * @param newID - new task identification number
   */
  public void setTaskID(String newID)
  {
    if (taskID != null && !taskID.equals("")&&taskID.length()==5)
    {
      taskID = newID;
    }
    else {throw new IllegalArgumentException("The ID must contain 5 characters");}

  }

  /**
   * get requirement identification number
   *
   * @return requirementID
   */
  public String getRequirementID()
  {
    return requirementID.getRequirementID();
  }

  /**
   * get task name
   *
   * @return labelName
   */
  public String getLabelName()
  {
    return labelName;
  }

  /**
   * change task name
   *
   * @param newName - new task name
   */
  public void setLabelName(String newName)
  {
    this.labelName = newName;
  }

  /**
   * get task description/what should be done
   *
   * @return description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * get in how many hours the task should be completed
   *
   * @return estimatedHours
   */
  /**
   * set new task description, the task description is changed/
   *
   * @param newDescription - new task description, change.
   */
  public void setDescription(String newDescription)
  {
    if (description != null && !description.equals(""))
    {
      description = newDescription;
    }
  }

  /**
   * Get by when the task should be completed
   *
   * @return deadline
   */
  public Date getDeadline()
  {
    return deadline;
  }

  /**
   * set new deadline for the task extend it/shorten it
   *
   * @param newDeadline - new date when it should be completed
   */
  public void setDeadline(Date newDeadline)
  {
    if (newDeadline != null)
    {
      deadline = newDeadline.copy();
    }
  }
  /**
   * The method returns the estimated hours of work on a task
   *
   * @param  - returns the estimated hours of work
   */

  public double getEstimatedHours()
  {
    return estimatedHours;
  }

  /**
   * new estimated hours, the task was changed or the time was reevaluated and you would need more hours to complete it
   *
   * @param newHour - new time how many hours you technically would need
   */
  public void setEstimatedHours(double newHour)
  {
    if (newHour >= 0)
    {
      estimatedHours = newHour;
    }
  }
  /**
   * Get task status
   *
   * @return status
   */
  public Status getStatus()
  {
    return status;
  }
  /**
   * Set task status to any state of the given choices
   *
   * @param status
   */
  public void setStatus(Status status)
  {
    if (status != null)
    {
      this.status = status;
    }
  }

  /**
   * Remove team member from the task
   *
   * @param teamMemberID - team member that gets removed
   */
  public void removeTeamMember(String teamMemberID)
  {
    if (team.getTeamMembersByID(teamMemberID) != null)
    {
      for (int i = 0; i < team.totalNumberOfTeamMembers(); i++)
      {
        if (team.getTeamMembersByID(teamMemberID).equals(teamMemberID))
        {
          team.removeTeamMember(teamMemberID);
        }
      }
    }
  }
  /**
   * get how many hours are already spent on the task
   *
   * @return hoursSpent
   */
  public double getTimeSpent()
  {
    return hoursSpent;
  }

  /**
   * add more hours spent on the task
   *
   * @param hoursSpent - hours spent today on the task or in the past few days
   */
  public void setHoursSpent(double hoursSpent)
  {
    if (this.hoursSpent + hoursSpent >= 0)
    {
      this.hoursSpent += hoursSpent;
    }
  }

  /**
   * Get a list of team members working on the task.
   *
   * @return teamMembers
   */

  /* To be edited/errors pops-up
//  public TeamMember[] getResponsibleTeamMembers()
//  {
//    TeamMember[] teamMembers = new TeamMember[team.totalNumberOfTeamMembers()];
//    for (int i = 0; i < team.totalNumberOfTeamMembers(); i++)
//    {
//      teamMembers[i] = team.ge;
//    }
//    return teamMembers;
//  }
  /**
   * set task to finished state
   */
  public void finishTask()
  {
    setStatus(Status.ENDED);
  }

  /**
   * check if this task and the object given in the arguments are the same
   *
   * @param obj
   * @return true or false(the same or not)
   */
  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Task))
    {
      return false;
    }
    Task other = (Task) obj;
    return taskID.equals(other.getTaskID()) && requirementID
        .equals(other.getRequirementID()) && labelName
        .equals(other.getLabelName()) && description
        .equals(other.getDescription()) && estimatedHours == other
        .getEstimatedHours() && deadline.equals(other.getDeadline())
        && hoursSpent == other.getTimeSpent();
  }

  @Override public String toString()
  {
    return "Task:" + "taskID='" + taskID + '\'' + ", requirementID="
        + requirementID + ", labelName='" + labelName + '\'' + ", description='"
        + description + '\'' + ", estimatedHours=" + estimatedHours
        + ", deadline=" + deadline + ", hoursSpent=" + hoursSpent + ", status="
        + status;
  }
}