import java.util.ArrayList;

/**
 * TeamMember class to store data about Team Members
 *
 * @author Rokas Paulauskas
 * @author Nicolae Cernean(edited)
 * @version 1.002 2020-12-07
 */
public class TeamMember
{
  private String name;
  private String teamMemberID;
  private int yearsOfExperience;
  private Email email;
  private Date birthdate;
  private Role role;
  private ArrayList<Task> teamMemberTaskList;

  /**
   * Creating a team member to the files
   *
   * @param name              - name of the team member
   * @param yearsOfExperience - how many years of experience team member has in the software developer field
   * @param email             - team members email
   * @param birthDate         - the birth date of the team member
   * @param role              - the role of a team member
   */
  public TeamMember(String name, String teamMemberID, Email email,
      int yearsOfExperience, Date birthDate, Role role)
  {
    if (name != null && !name.equals("") && teamMemberID != null
        && !teamMemberID.equals("") && yearsOfExperience >= 0 && email != null
        && birthDate != null)
    {
      setName(name);
      setTeamMemberID(teamMemberID);
      setYearsOfExperience(yearsOfExperience);
      setEmail(email);
      this.birthdate = birthDate;
      setRole(role.TEAM_MEMBER);
      this.teamMemberTaskList = new ArrayList<>();
    }
  }

  /**
   * Returns employees name
   *
   * @return employees name
   */
  public String getName()
  {
    return name;
  }

  /**
   * Sets a new team member name
   *
   * @param name -edit name of a team member
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Returns team member ID
   *
   * @return teamMemberID
   */
  public String getTeamMemberID()
  {
    return teamMemberID;
  }

  /**
   * Sets a new ID of a team member
   *
   * @param teamMemberID -edit ID of a team member
   */
  public void setTeamMemberID(String teamMemberID)
  {
    if (teamMemberID.length() == 4)
    {
      this.teamMemberID = teamMemberID;
    }
    else
    {
      throw new IllegalArgumentException("The ID must contain 4 characters");
    }
  }

  /**
   * Gets an email of the employee
   *
   * @return returns email object
   */
  public Email getEmail()
  {
    return email;
  }

  /**
   * Sets/edits a new email of a team member
   *
   * @param newEmail -edit the email of a team member
   */
  public void setEmail(Email newEmail)
  {
    if (isEmailValid(newEmail))
      this.email = newEmail;
    else
      throw new IllegalArgumentException("Illegal input, try again");
  }

  /**
   * Gets a role for the team member
   *
   * @return returns the role of a team member
   */

  public Role getRole()
  {
    return role;
  }

  /**
   * Sets a role for a team member
   *
   * @param role set a new role for a team member
   */

  public void setRole(Role role)
  {
    this.role = role;
  }

  /**
   * Returns how long the employee has worked in this field
   *
   * @return years of experience in software developer field
   */
  public int getYearsOfExperience()
  {
    return yearsOfExperience;
  }

  /**
   * Updates/Sets a new year of a team member worked in this field
   *
   * @param newYears -sets/updates years of experience
   */
  public void setYearsOfExperience(int newYears)
  {
    this.yearsOfExperience = newYears;
  }

  /**
   * Returns the birth date of the employee
   *
   * @return employees birth date
   */
  public Date getBirthdate()
  {
    return birthdate;
  }

  /**
   * Checks if the given email is valid
   *
   * @param email - email you give to check if it is valid
   * @return true or false which equals to valid or not valid
   */
  public boolean isEmailValid(Email email)
  {
    if (email.toString().equals("Wrong format"))
    {
      return false;
    }
    return true;
  }

  /**
   * Compares employees checks if it is the same employee if it
   * is another object automatically says that they are not the same
   *
   * @param obj any object
   * @return same object or not
   */
  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof TeamMember))
    {
      return false;
    }
    TeamMember other = (TeamMember) obj;
    return name.equals(other.getName()) && yearsOfExperience == other
        .getYearsOfExperience() && email.equals(other.getEmail()) && birthdate
        .equals(other.getBirthdate());
  }
  /**
   * Add a task to a team member task list
   *
   * @param  task-is added to team members task list
   */
  public void addTaskToList(Task task)
  {
    teamMemberTaskList.add(task);
  }
  /**
   * Returns all the information about a team member
   *
   * @return all tasks of a team member
   */
  public ArrayList<Task> getTeamMemberTaskList()
  {
    return teamMemberTaskList;
  }

  /**
   * Returns all the information about a team member
   *
   * @return all information about a team member
   */
  @Override public String toString()
  {
    return "TeamMember:" + "name='" + name + '\'' + ", teamMemberID='"
        + teamMemberID + '\'' + ", yearsOfExperience=" + yearsOfExperience
        + ", email=" + email + ", birthdate=" + birthdate + ", role=" + role;
  }
}
