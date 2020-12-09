import java.util.ArrayList;

/**
 * A class representing a Task list
 *
 * @author Nichita Railean
 * @author Nicolae Cernean(edited)
 * @version 001.2 2020-12-07
 */

public class TaskList
{
  private ArrayList<Task> tasks;
  private Task task;

  /**
   * A 0 argument constructor initializing the Task arraylist
   */
  public TaskList()
  {
    this.tasks = new ArrayList<>();

  }

  /**
   * A method returning a task by index
   *
   * @param index index of a task
   * @return a task
   */
  public Task getTaskByIndex(int index)
  {
    Task task = null;
    for (int i = 0; i < tasks.size(); i++)
    {
      if (tasks.get(i).equals(index))
      {
        task = tasks.get(i);
      }
    }
    return task;
  }

  /**
   * A method adding a task to tasklist
   *
   * @param task -the task
   */
  public void addTask(Task task)
  {
    tasks.add(task);
  }

  /**
   * A method returning an array with all requiremnt tasks
   *
   * @param requirementID the requirement id
   * @return the array
   */
  public Task[] getAllRequirementTask(String requirementID)
  {
    Task[] taskarray = new Task[tasks.size()];
    for (int i = 0; i < tasks.size(); i++)
    {
      if (tasks.get(i).getRequirementID().equals(requirementID))
      {
        taskarray[i] = tasks.get(i);
      }
    }
    return taskarray;
  }

  /**
   * A method setting the deadline of a task by id
   *
   * @param taskID      the id of a task
   * @param newDeadline the new deadline
   */
  public void setDeadlineOfATask(String taskID, Date newDeadline)
  {
    if (taskID != null && !(taskID.equals("") && newDeadline != null))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          i.setDeadline(newDeadline);
        }
      }
    }
  }

  /**
   * A method setting the estimated hours of a task by id
   *
   * @param taskID         the id of a task
   * @param estimatedHours the new estimated hours
   */
  public void setEstimatedHoursOfATask(String taskID, int estimatedHours)
  {
    if (taskID != null && !(taskID.equals("") && estimatedHours >= 0))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          i.setEstimatedHours(estimatedHours);
        }
      }
    }
  }

  /**
   * A method setting the description of a task by id
   *
   * @param taskID         the id of a task
   * @param newDescription the new description
   */
  public void setDescriptionOfATask(String taskID, String newDescription)
  {
    if (taskID != null && !(taskID.equals("") && newDescription != null
        && !(newDescription.equals(""))))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          i.setDescription(newDescription);
        }
      }
    }
  }

  /**
   * A method ending a task
   *
   * @param taskID the id of a task
   */
  public void endTask(String taskID)
  {
    if (taskID != null && !(taskID.equals("")))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          i.finishTask();
        }
      }
    }
  }

  /**
   * A method getting a Task
   *
   * @param taskID the id of a task
   * @return the task
   */
  public Task getTaskByID(String taskID)
  {
    if (taskID != null && !(taskID.equals("")))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          return i;
        }
      }
    }

    return null;
  }

  /**
   * A method removing a task by id
   *
   * @param taskID the id of a task
   */
  public void removeTask(String taskID)
  {
    if (taskID != null && !(taskID.equals("")))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          tasks.remove(i);
        }
      }
    }
  }

  /**
   * A method getting the status of a Task
   *
   * @param taskID the id of a task
   * @return the status
   */
  public Status getTaskStatus(String taskID)
  {
    if (taskID != null && !(taskID.equals("")))
    {
      for (Task i : tasks)
      {
        if (i.getTaskID().equals(taskID))
        {
          return i.getStatus();
        }
        else
          throw new IllegalArgumentException("Illegal task ID");
      }
    }
    throw new IllegalArgumentException("Try again");
  }

  /**
   * A method getting the hours spent on a task
   *
   * @return the hours spent
   */
  public int getHoursSpent()
  {
    int hours = 0;
    for (Task i : tasks)
    {
      hours += i.getTimeSpent();
    }
    return hours;
  }

  /**
   * A method getting an array will all the finished tasks
   *
   * @return the array
   */
  public ArrayList<Task> getFinishedTasks()
  {
    ArrayList<Task> finished = new ArrayList<>();
    for (Task i : tasks)
    {
      if (i.getStatus().equals(Status.ENDED))
      {
        finished.add(i);
      }
    }
    return finished;
  }

  /**
   * A method getting an array will all the Active tasks
   *
   * @return the array
   */
  public ArrayList<Task> getActiveTasks()
  {
    ArrayList<Task> active = new ArrayList<>();
    for (Task i : tasks)
    {
      if (i.getStatus().equals(Status.STARTED))
      {
        active.add(i);
      }
    }
    return active;
  }


}










