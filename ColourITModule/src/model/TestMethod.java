package model;

public class TestMethod
{
  public static void main(String[] args)
  {
    /*model.TeamMember member1=new model.TeamMember("Cernean Nicoale","0001",new model.Email("nicolaecer","gmail","com"),3,new model.Date(29,11,2000),model.Role.TEAM_MEMBER);
    model.TeamMember member2=new model.TeamMember("Joseph Carroll","0002",new model.Email("josephcar","yahoo","com"),5,new model.Date(18,12,1996),model.Role.TEAM_MEMBER);
    model.TeamMember member3=new model.TeamMember("Rokas Paulaskas","0003",new model.Email("rokaspau","mail","ru"),3,new model.Date(3,2,2001),model.Role.TEAM_MEMBER);
    model.TeamMember member4=new model.TeamMember("Nichita Railean","0004",new model.Email("nichitarai","yahoo","com"),6,new model.Date(8,5,2002),model.Role.TEAM_MEMBER);
    model.TeamMember member5=new model.TeamMember("Felix Stan","0005",new model.Email("felixsta","gmail","com"),12,new model.Date(28,12,1997),model.Role.TEAM_MEMBER);


    model.Team team1=new model.Team();
    team1.addNewTeamMember(member1);
    team1.addNewTeamMember(member2);
    team1.addNewTeamMember(member3);
    team1.addNewTeamMember(member4);
    team1.addNewTeamMember(member5);*/
   /* model.Task task1 = new model.Task("1","2","Newtask1","taskdescription",new model.Date(),20,model.Status.NOTSTARTED);
    System.out.println(task1);
    task1.assignTeamMember(new model.TeamMember("Rokas","2511",new model.Email("rokas","gmail","com"),8,new model.Date(),model.Role.SCRUM_MASTER));
    System.out.println(task1.getResponsibleTeamMembers());
    task1.assignTeamMember(new model.TeamMember("Nichita","2511",new model.Email("rokas","gmail","com"),8,new model.Date(),model.Role.SCRUM_MASTER));
    model.Task task2=new model.Task("4","3","tasktask","taskelis",new model.Date(),8,model.Status.STARTED);
    System.out.println(task1.getResponsibleTeamMembers());
    System.out.println(task1);
    task1.setTaskID("5");
    System.out.println(task1.getTaskID());
    task1.setDescription("newDescription");
    System.out.println(task1.getDescription());
    task1.setEstimatedHours(8);
    System.out.println(task1.getEstimatedHours());
    task1.setHoursSpent(8.8);
    System.out.println(task1.getTimeSpent());
    System.out.println(task1.getRequirementID());
    task1.setLabelName("newName");
    System.out.println(task1.getLabelName());
    System.out.println(task1);
    System.out.println(task2.equals(task1));
    model.TeamMember teamMember1= new model.TeamMember("Rokas","2511",new model.Email("rokas","gmail","com"),8,new model.Date(),model.Role.SCRUM_MASTER);
    model.TeamMember teamMember2 = new model.TeamMember("Jeris","2509",new model.Email("Jerry","gmail","com"),5,new model.Date(),model.Role.TEAM_MEMBER);
    System.out.println("");
    System.out.println(teamMember1);
    teamMember1.setName("Tomas");
    System.out.println(teamMember1.getName());
    teamMember1.setTeamMemberID("2222");
    System.out.println(teamMember1.getTeamMemberID());
    teamMember1.setYearsOfExperience(7);
    System.out.println(teamMember1.getYearsOfExperience());
    System.out.println(teamMember1.getBirthdate());
    teamMember1.setEmail(new model.Email("Tomas","yandex","ru"));
    System.out.println(teamMember1.getEmail());
    teamMember1.setRole(model.Role.TEAM_MEMBER);
    System.out.println(teamMember1.getRole());
    teamMember1.addTaskToList(task1);
    System.out.println(teamMember1.getTeamMemberTaskList());
    System.out.println(teamMember1);
    System.out.println(teamMember2);
    System.out.println(teamMember1.equals(teamMember2));
    teamMember2.addTaskToList(task2);
    System.out.println(teamMember2.getTeamMemberTaskList());
    model.Team team = new model.Team();
    team.addNewTeamMember(teamMember1);
    team.addNewTeamMember(teamMember2);
    System.out.println(team.totalNumberOfTeamMembers());
    System.out.println(team.getAllTeamMembers());
    System.out.println(team.getTeamMembersByID("2509"));
    System.out.println(team.getTeamMembersByID("2222"));
    System.out.println(team.getTeamMemberByName("Jeriss"));
    System.out.println(team.getTeamMembersByExperience(7));
    System.out.println(team.getTeamMembersByExperience(5));
    System.out.println(team.getTeamMembersByEmail(new model.Email("jErry","gmail","com")));
    System.out.println(team.getTeamMembersByBirthday(new model.Date()));
    System.out.println(team.getScrumMaster());
    team.getAllTeamMembers().get(0).setRole(model.Role.SCRUM_MASTER);
    System.out.println(team.getScrumMaster());
    team.getAllTeamMembers().get(1).setRole(model.Role.PRODUCT_OWNER);
    System.out.println(team.getProductOwner());
    System.out.println(team.getTeamMemberTasks("2509"));
    System.out.println(team);*/
//    member1.setName(" John Travolta");
//    System.out.println(member1.getName());
//    member1.setTeamMemberID("1001");
//    System.out.println(member1.getTeamMemberID());
//  member1.setEmail(new model.Email("johntravi","gmail","ru"));
//    System.out.println(member1.getEmail());
//member1.setYearsOfExperience(5);
//    System.out.println(member1.getYearsOfExperience());
//    member1.setRole(model.Role.SCRUM_MASTER);
//    System.out.println(member1.getRole());
//    System.out.println(member1.toString());


//    model.ProjectList projectList1=new model.ProjectList();
//
//    model.Project project1=new model.Project("Chevron Ltd.","Mobile and desktop app","001",new model.Date(30,12,2020),120,model.Status.NOTSTARTED);
//    project1.addATeam(team1);
//
//    projectList1.addProject(project1);
//
//    model.RequirementList requirementList1=new model.RequirementList();
//
//    model.Requirement requirement1=new model.Requirement("GUI","10000","00001",17,new model.UserStory("beautiful GUI","user friendly","product owner"), new model.Date(15,12,2020),2,model.Status.NOTSTARTED);
//    model.Requirement requirement2=new model.Requirement("Design","20000","00001",20,new model.UserStory("design of graphs","somehow","scrum master"), new model.Date(12,1,2021),3,model.Status.NOTSTARTED);
 //   model.Requirement requirement3=new model.Requirement("Class design","30000","001",25,new model.UserStory("something2","somehow1","product owner"), new model.Date(14,1,2021),1,model.Status.NOTSTARTED);
//    model.Requirement requirement4=new model.Requirement("model.Project report ","40000","001",30,new model.UserStory("something3","Somehow2","team member"), new model.Date(10,2,2021),5,model.Status.NOTSTARTED);
//    model.Requirement requirement5=new model.Requirement("User story","50000","001",10,new model.UserStory("mobile back-end","efficient","team member"), new model.Date(1,1,2021),4,model.Status.NOTSTARTED);
//
//    requirementList1.addRequirement(requirement1);
//    requirementList1.addRequirement(requirement2);
//    requirementList1.addRequirement(requirement3);
//    requirementList1.addRequirement(requirement4);
//    requirementList1.addRequirement(requirement5);
//
//   model.TaskList taskList1 = new model.TaskList();
//    model.TaskList taskList2 = new model.TaskList();
//
//   model.Task task1=new model.Task("model.Project UI","0001",requirement1.getRequirementID(),"model.Project User interface",new model.Date(11,12,2020),5,model.Status.NOTSTARTED);
//    model.Task task2=new model.Task("model.Task UI","0002",requirement1.getRequirementID(),"model.Task User interface",new model.Date(12,12,2020),5,model.Status.NOTSTARTED);
//    model.Task task3=new model.Task("model.Requirement UI","0003",requirement2.getRequirementID(),"model.Requirement User interface",new model.Date(13,12,2020),5,model.Status.NOTSTARTED);
//    model.Task task4=new model.Task("model.TaskList UI","0004",requirement2.getRequirementID(),"model.TaskList User interface",new model.Date(14,12,2020),5,model.Status.NOTSTARTED);
//    model.Task task5=new model.Task("model.RequirementList UI","0005",requirement2.getRequirementID(),"model.RequirementList User interface",new model.Date(15,12,2020),5,model.Status.NOTSTARTED);
//
//    taskList1.addTask(task1);
//    taskList1.addTask(task2);
//
//    taskList2.addTask(task3);
//    taskList2.addTask(task4);
//    taskList2.addTask(task5);
//
//    requirement1.addTaskList(taskList1);
//    requirement2.addTaskList(taskList2);
Task task = new Task("this","this","this","this",new Date(),20.5,Status.ENDED);
TaskList taskList = new TaskList();
taskList.addTask(task);
System.out.println(taskList);
taskList.removeTask(task);
System.out.println(taskList+"removed");
/*Requirement R1 = new Requirement("projectID1", "requirementID1", "name1", new UserStory("what","where","who"), 10, new Date(), 2);
    Requirement R2 = new Requirement("projectID2", "requirementID2", "name2", new UserStory("what","where","who"), 10, new Date(), 1);
    R1.addTask("taskID1", "requirementID1", "labelName1", "description1", new Date(), 5, Status.ENDED);
    R1.addTask("taskID2", "requirementID2", "labelName2", "description2", new Date(), 5, Status.ENDED);
    R2.addTask("taskID1", "requirementID1", "labelName1", "description1", new Date(), 5, Status.ENDED);
    R2.addTask("taskID2", "requirementID2", "labelName2", "description2", new Date(), 5, Status.ENDED);

    RequirementList list1 = new RequirementList();
    list1.addRequirement(R1);
    list1.addRequirement(R2);
    //System.out.println(Arrays.toString(list1.getRequirementsSortedByOrderNum()));
    Project project = new Project("name", "projectID", "description", new Date(), 8, Status.STARTED);
    project.addRequirement(R1);
    project.addRequirement(R2);
    System.out.println(project.getRequirementsByImportance());
    System.out.println(project.getUnassignedTasks());
    System.out.println(project.getHoursSpentOnProject());

    System.out.println(project.getProjectStatus());

  }*/

}}
