import java.util.ArrayList;

/*
 * RequirementList class, the class that contains all the requirements of a project
 * and methods that edits/updates all the information related to a specific requirement
 *
 * @author Nicolae Cernean
 * @version 1.1 2020-12-07
 */
public class RequirementList
{
  private Project projectID;
  private ArrayList<Requirement> requirements;
  private Requirement requirement;

  /**
   * Creating a list of requirements
   */
  public RequirementList()
  {
    this.requirements = new ArrayList<>();
  }

  /**
   * Adds a new requirement to requirementlist
   *
   * @param requirement - the requirement added to the list
   */
  public void addRequirement(Requirement requirement)
  {
    requirements.add(requirement);
  }

  /**
   * Removes the requirement from requirement list
   *
   * @param requirementID - the removed requirement
   */
  public void removeRequirement(String requirementID)
  {
    requirements.remove(getRequirementByID(requirementID));
  }

  /**
   * Returns a requirement by it's ID
   *
   * @param requirementID - the removed requirement
   * @return requirement
   */
  public Requirement getRequirementByID(String requirementID)
  {
    Requirement requirement = null;
    for (int i = 0; i < requirements.size(); i++)
    {
      if (requirements.get(i).getRequirementID().equals(requirementID))
      {
        requirement = requirements.get(i);
      }
      else
        throw new IllegalArgumentException("Invalid ID");
    }
    return requirement;
  }

  /**
   * Returns requirement ID
   *
   * @return requirement ID
   */
  public String getRequirementID()
  {
    return requirement.getRequirementID();
  }

  /**
   * Edit the deadline of a requirement
   *
   * @param requirementID - the requirement
   * @param newDeadline   -oof the requirement
   */
  public void editDeadLineOfARequirement(String requirementID, Date newDeadline)
  {
    getRequirementByID(requirementID).setDeadline(newDeadline);
  }

  /**
   * Edit the deadline of a requirement
   *
   * @param requirementID  - the requirement
   * @param estimatedHours -updates the requirement hours spent
   */
  public void editEstimatedHoursOfARequirement(String requirementID,
      int estimatedHours)
  {
    getRequirementByID(requirementID).setEstimatedHours(estimatedHours);
  }

  /**
   * Edit the description of a requirement
   *
   * @param requirementID  - the requirement
   * @param newDescription -updates the description of a requirement
   */
  public void editDescriptionOfARequirement(String requirementID,
      UserStory newDescription)
  {
    getRequirementByID(requirementID).setDescription(newDescription);
  }

  /**
   * Returns the status of a requirement Started/Ended/Not Started
   *
   * @param requirementID - the requirement
   * @return the status of a requirement
   */
  public Status getRequirementStatus(String requirementID)
  {
    return getRequirementByID(requirementID).getStatus();
  }

  /**
   * Edit the description of a requirement
   *
   * @param requirementID - the requirement
   * @param orderNum      -the importance of the requirement/the order number
   */
  public void assignRequirementOrder(String requirementID, int orderNum)
  {
    getRequirementByID(requirementID).setOrderNum(orderNum);
  }

  /**
   * Returns the total hours of work of the reuquirement list
   * return -hours worked
   */
  public int getRequirementsListTotalHoursOfWork()
  {
    int hours = 0;
    for (int i = 0; i < requirements.size(); i++)
    {
      hours += requirements.get(i).getSpentHoursOnRequirement();
    }
    return hours;
  }

  /**
   * Returns all finished reuquirements
   * return -arraylist of finished requirements
   */
  public ArrayList<Requirement> getFinishedRequirements()
  {
    ArrayList<Requirement> finished = new ArrayList<>();
    for (int i = 0; i < requirements.size(); i++)
    {
      if (requirements.get(i).getStatus().equals(Status.ENDED))
      {
        finished.add(requirements.get(i));
      }
    }
    return finished;
  }

  /**
   * Returns all requirements that are still unfinished
   * return -arraylist of unfinished requirements
   */
  public ArrayList<Requirement> getActiveRequirements()
  {
    ArrayList<Requirement> started = new ArrayList<>();
    for (int i = 0; i < requirements.size(); i++)
    {
      if (requirements.get(i).getStatus().equals(Status.NOTSTARTED)
          && requirements.get(i).getStatus().equals(Status.STARTED))
      {
        started.add(requirements.get(i));
      }
    }
    return started;
  }

  /**
   * Returns all requirements
   * return -array of all requirements
   */
  public Requirement[] getAllRequirements()
  {
    Requirement[] requirementsarr = new Requirement[requirements.size()];
    for (int i = 0; i < requirements.size(); i++)
    {
      requirementsarr[i] = requirements.get(i);
    }
    return requirementsarr;
  }

  /**
   * Is the order number of a requirement is used or not
   * return -true or false
   */
  public boolean isOrderNumUsed(int orderNum)
  {
    for (int i = 0; i < requirements.size() - 1; i++)
    {
      if (requirements.get(i).getOrderNum() == orderNum)
      {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns all the requirements sorted from the most important to less important
   * return -array of requirements by importance
   */
  /*May be some mistakes*/
  public Requirement[] getRequirementsSortedByOrderNum()
  {
    Requirement[] requirementsarr = new Requirement[requirements.size()];
    for (int i = 0; i < requirements.size() - 1; i++)
    {
      if (isOrderNumUsed(requirements.get(i).getOrderNum()))
      {
        if (requirements.get(i).getOrderNum() > requirements.get(i + 1)
            .getOrderNum())
        {
          requirementsarr[i] = requirements.get(i + 1);
          requirements.add(requirements.get(i));
          i = -1;
        }
      }
      else
        throw new IllegalArgumentException("Order num used");
    }
    return requirementsarr;
  }

}
