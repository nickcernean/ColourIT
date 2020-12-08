import java.util.ArrayList;

public class ProjectList
{
  private ArrayList<Project> projects;

  public ProjectList()
  {
    this.projects = new ArrayList<Project>();
  }

  public void addProject(Project project)
  {
    projects.add(project);
  }

  public Project getProjectByID(String projectID)
  {
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectID().equals(projectID))
      {
        return projects.get(i);
      }
    }
    throw new IllegalArgumentException("Invalid Project ID");
  }

  public Project[] getAllProjects()
  {

    Project[] projectList = new Project[projects.size()];
    for (int i = 0; i < projects.size(); i++)
    {
      projectList[i] = projects.get(i);

    }
    return projectList;
  }

  public Project getProjectByName(String name)
  {
    for (int i = 0; i < projects.size(); i++)

      if (projects.get(i).getName().equals(name))
      {
        return projects.get(i);
      }
    throw new IllegalArgumentException("Invalid Project Id");
  }

  public Status getProjectStatus(String projectID)
  {
    return getProjectByID(projectID).getProjectStatus();
  }

  public void removeProject(String projectID)
  {
    projects.remove(getProjectByID(projectID));
  }

  public void editDeadlineOfAProject(String projectID, Date newDeadline)
  {
    getProjectByID(projectID).setDeadline(newDeadline);
  }

  public void editUserStoryOfTheProject(String projectID, String newDescription)
  {
    getProjectByID(projectID).setDescription(newDescription);
  }

  public Project[] getAllActiveProjects()
  {
    Project[] projectList = new Project[projects.size()];
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectStatus().equals(Status.ENDED))
      {
        throw new IllegalArgumentException("No active project");
      }
      else
      {
        projectList[i] = projects.get(i);
      }
    }
    return projectList;
  }

  public RequirementList getRequirementsOfAProject(String projectID)
  {
    return getProjectByID(projectID).getRequirements();
  }

  public Requirement[] getRequirementsByImportance(String projectID)
  {
    return getProjectByID(projectID).getRequirementsByImportance();
  }
}
