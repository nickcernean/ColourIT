/*
 * Team class to store a list of Team Members
 *
 * @author Joseph Carroll
 * @author Nicolae Cernean(edited)
 * @version 1.1 2020-12-07
 */
import java.util.ArrayList;

public class Team
{

  private ArrayList<TeamMember> team;
  private TaskList taskList;

  /**
   * Creating a list of team member
   */
  public Team()
  {
    this.team = new ArrayList<TeamMember>();
    //    this.teamMemberTaskList = new ArrayList<>();
    this.taskList = new TaskList();
  }

  /**
   * Adds a new team member to a team
   *
   * @param teamMember - new team member to add to team
   */
  public void addNewTeamMember(TeamMember teamMember)
  {
    team.add(teamMember);
  }

  /**
   * Removes a team member from a team
   *
   * @param teamMemberID - team member to be removed
   */
  public void removeTeamMember(String teamMemberID)
  {
    team.remove(getTeamMembersByID(teamMemberID));
  }

  /**
   * Gets the number of team members in a team
   *
   * @return total number of team members
   */
  public int totalNumberOfTeamMembers()
  {
    return team.size();
  }

  /**
   * Gets a list of all the team members
   *
   * @return an array of team members
   */
  public TeamMember[] getAllTeamMembers()
  {
    TeamMember[] teamList = new TeamMember[team.size()];
    for (int i = 0; i < team.size(); i++)
    {
      teamList[i] = team.get(i);
    }
    if (teamList[0] == null)
      throw new NullPointerException("No list available");
    else
      return teamList;
  }

  /**
   * Gets a team member with a specific ID
   *
   * @param teamMemberID - team members ID to be checked
   * @return a team member
   */
  public TeamMember getTeamMembersByID(String teamMemberID)
  {
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getTeamMemberID().equals(teamMemberID))
        return team.get(i);
    }
    throw new IllegalArgumentException("Invalid ID");
  }

  /**
   * Gets a list of team members by name
   *
   * @param name - name to be searched for
   * @return an array of team members
   */
  public TeamMember[] getTeamMemberByName(String name)
  {
    TeamMember[] nameList = new TeamMember[team.size()];
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getName().equals(name))
        nameList[i] = team.get(i);
    }
    if (nameList[0] == null)
      throw new NullPointerException("No list available");
    else
      return nameList;
  }

  /**
   * Gets a list of team members with specific number of years of experience
   *
   * @param yearsOfExperience - desired number of years of experience
   * @return an array of team members
   */
  public TeamMember[] getTeamMembersByExperience(int yearsOfExperience)
  {
    TeamMember[] xpList = new TeamMember[team.size()];
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getYearsOfExperience() == yearsOfExperience)
        xpList[i] = team.get(i);
    }
    if (xpList[0] == null)
      throw new NullPointerException("No list available");
    else
      return xpList;
  }

  /**
   * Gets a list of team members by email
   *
   * @param - email to be searched for
   * @return an array of team members
   */
  public TeamMember[] getTeamMembersByEmail(Email email)
  {
    TeamMember[] emailList = new TeamMember[team.size()];
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getEmail().equals(email))
        emailList[i] = team.get(i);
    }
    if (emailList[0] == null)
      throw new NullPointerException("No list available");
    else
      return emailList;
  }

  /**
   * Gets a list of team members by birthday
   *
   * @param date - birthday to be searched for
   * @return an array of team members
   */
  public TeamMember[] getTeamMembersByBirthday(Date date)
  {
    TeamMember[] birthdayList = new TeamMember[team.size()];
    for (int i = 0; i < team.size(); i++)
    {
      if (team.get(i).getBirthdate().equals(date))
        birthdayList[i] = team.get(i);
    }
    if (birthdayList[0] == null)
      throw new NullPointerException("No list available");
    else
      return birthdayList;
  }

  /**
   * Returns the scrum master from team
   *
   * @return returns the scrum master
   */
  public TeamMember getScrumMaster()
  {
    for (int i = 0; i < team.size(); i++)

      if (team.get(i).getRole().equals(Role.SCRUM_MASTER))
      {
        return team.get(i);
      }
    throw new IllegalArgumentException(
        "Please assign a scrum master to this project");
  }
  /**
   * Returns the product owner from team
   *
   * @return returns the product owner
   */
  public TeamMember getProductOwner()
  {
    for (int i = 0; i < team.size(); i++)

      if (team.get(i).getRole().equals(Role.PRODUCT_OWNER))
      {
        return team.get(i);
      }
    throw new IllegalArgumentException(
        "Please assign a product owner to this project");
  }

  /**
   * Assigns a task to a team member by his teamMemberID
   *
   * @param taskID the task ID
   * @param teamMemberID the team member ID
   */
  public void assignTaskToATeamMember(String taskID, String teamMemberID)
  {
    getTeamMembersByID(teamMemberID)
        .addTaskToList(taskList.getTaskByID(taskID));
  }

  /**
   * Returns all the tasks of a team member
   *
    * @param teamMemberID the team member ID
   */
  public ArrayList<Task> getTeamMemberTasks(String teamMemberID)
  {
   return getTeamMembersByID(teamMemberID).getTeamMemberTaskList();
  }
}
