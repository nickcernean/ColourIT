public class TestMethod
{
  public static void main(String[] args)
  {
    /*TeamMember member1=new TeamMember("Cernean Nicoale","0001",new Email("nicolaecer","gmail","com"),3,new Date(29,11,2000),Role.TEAM_MEMBER);
    TeamMember member2=new TeamMember("Joseph Carroll","0002",new Email("josephcar","yahoo","com"),5,new Date(18,12,1996),Role.TEAM_MEMBER);
    TeamMember member3=new TeamMember("Rokas Paulaskas","0003",new Email("rokaspau","mail","ru"),3,new Date(3,2,2001),Role.TEAM_MEMBER);
    TeamMember member4=new TeamMember("Nichita Railean","0004",new Email("nichitarai","yahoo","com"),6,new Date(8,5,2002),Role.TEAM_MEMBER);
    TeamMember member5=new TeamMember("Felix Stan","0005",new Email("felixsta","gmail","com"),12,new Date(28,12,1997),Role.TEAM_MEMBER);


    Team team1=new Team();
    team1.addNewTeamMember(member1);
    team1.addNewTeamMember(member2);
    team1.addNewTeamMember(member3);
    team1.addNewTeamMember(member4);
    team1.addNewTeamMember(member5);*/
    Task task1 = new Task("1","2","Newtask1","taskdescription",new Date(),20,Status.NOTSTARTED);
    System.out.println(task1);
    task1.assignTeamMember(new TeamMember("Rokas","2511",new Email("rokas","gmail","com"),8,new Date(),Role.SCRUM_MASTER));
    System.out.println(task1.getResponsibleTeamMembers());
    task1.assignTeamMember(new TeamMember("Nichita","2511",new Email("rokas","gmail","com"),8,new Date(),Role.SCRUM_MASTER));
    System.out.println(task1.getResponsibleTeamMembers());
//    member1.setName(" John Travolta");
//    System.out.println(member1.getName());
//    member1.setTeamMemberID("1001");
//    System.out.println(member1.getTeamMemberID());
//  member1.setEmail(new Email("johntravi","gmail","ru"));
//    System.out.println(member1.getEmail());
//member1.setYearsOfExperience(5);
//    System.out.println(member1.getYearsOfExperience());
//    member1.setRole(Role.SCRUM_MASTER);
//    System.out.println(member1.getRole());
//    System.out.println(member1.toString());


//    ProjectList projectList1=new ProjectList();
//
//    Project project1=new Project("Chevron Ltd.","Mobile and desktop app","001",new Date(30,12,2020),120,Status.NOTSTARTED);
//    project1.addATeam(team1);
//
//    projectList1.addProject(project1);
//
//    RequirementList requirementList1=new RequirementList();
//
//    Requirement requirement1=new Requirement("GUI","10000","00001",17,new UserStory("beautiful GUI","user friendly","product owner"), new Date(15,12,2020),2,Status.NOTSTARTED);
//    Requirement requirement2=new Requirement("Design","20000","00001",20,new UserStory("design of graphs","somehow","scrum master"), new Date(12,1,2021),3,Status.NOTSTARTED);
 //   Requirement requirement3=new Requirement("Class design","30000","001",25,new UserStory("something2","somehow1","product owner"), new Date(14,1,2021),1,Status.NOTSTARTED);
//    Requirement requirement4=new Requirement("Project report ","40000","001",30,new UserStory("something3","Somehow2","team member"), new Date(10,2,2021),5,Status.NOTSTARTED);
//    Requirement requirement5=new Requirement("User story","50000","001",10,new UserStory("mobile back-end","efficient","team member"), new Date(1,1,2021),4,Status.NOTSTARTED);
//
//    requirementList1.addRequirement(requirement1);
//    requirementList1.addRequirement(requirement2);
//    requirementList1.addRequirement(requirement3);
//    requirementList1.addRequirement(requirement4);
//    requirementList1.addRequirement(requirement5);
//
//   TaskList taskList1 = new TaskList();
//    TaskList taskList2 = new TaskList();
//
//   Task task1=new Task("Project UI","0001",requirement1.getRequirementID(),"Project User interface",new Date(11,12,2020),5,Status.NOTSTARTED);
//    Task task2=new Task("Task UI","0002",requirement1.getRequirementID(),"Task User interface",new Date(12,12,2020),5,Status.NOTSTARTED);
//    Task task3=new Task("Requirement UI","0003",requirement2.getRequirementID(),"Requirement User interface",new Date(13,12,2020),5,Status.NOTSTARTED);
//    Task task4=new Task("TaskList UI","0004",requirement2.getRequirementID(),"TaskList User interface",new Date(14,12,2020),5,Status.NOTSTARTED);
//    Task task5=new Task("RequirementList UI","0005",requirement2.getRequirementID(),"RequirementList User interface",new Date(15,12,2020),5,Status.NOTSTARTED);
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






  }

}
