import java.util.ArrayList;

public class RequirementList
{
  private Project projectID;
  private ArrayList<Requirement> requirements;

  public RequirementList()
  {
    this.requirements = new ArrayList<>();
  }

  public void addRequirement(Requirement requirement)
  {
    requirements.add(requirement);
  }

  public void removeRequirement(String requirementID)
  {
    requirements.remove(getRequirementByID(requirementID));
  }

  public Requirement getRequirementByID(String requirementID)
  {
    for (int i = 0; i < requirements.size(); i++)
      if (requirements.get(i).getRequirementID().equals(requirementID))
      {
        return requirements.get(i);
      }
    throw new IllegalArgumentException("Invalid ID");
  }

  public void editDeadLineOfARequirement(String requirementID, Date newDeadline)
  {
    getRequirementByID(requirementID).setDeadline(newDeadline);
  }

  public void editEstimatedHoursOfARequirement(String requirementID,
      int estimatedHours)
  {
    getRequirementByID(requirementID).setEstimatedHours(estimatedHours);
  }

  public void editDescriptionOfARequirement(String requirementID,
      UserStory newDescription)
  {
    getRequirementByID(requirementID).setDescription(newDescription);
  }

  public Status getRequirementStatus(String requirementID)
  {
    return getRequirementByID(requirementID).getStatus();
  }

  public void assignRequirementOrder(String requirementID, int orderNum)
  {
    getRequirementByID(requirementID).setOrderNum(orderNum);
  }

  public int getRequirementsListTotalHoursOfWork()
  {
    int hours = 0;
    for (int i = 0; i < requirements.size(); i++)
    {
      hours += requirements.get(i).getSpentHoursOnRequirement();
    }
    return hours;
  }

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

  public void updateRequirementStatus(String requirementID, Status newStatus)
  {
    getRequirementByID(requirementID).updateStatus(newStatus);
  }

  public Requirement[] getAllRequirements()
  {
    Requirement[] requirementsarr = new Requirement[requirements.size()];
    for (int i = 0; i < requirements.size(); i++)
    {
      requirementsarr[i] = requirements.get(i);
    }
    return requirementsarr;
  }

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
      else throw new IllegalArgumentException("Order num used");
      }
    }
    return requirementsarr;
  }

}
