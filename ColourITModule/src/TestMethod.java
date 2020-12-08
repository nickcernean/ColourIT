public class TestMethod
{
  public static void main(String[] args)
  {

    RequirementList requirementList = new RequirementList();
    requirementList.addRequirement(new Requirement("1212", "12445", "getpeople",
        new UserStory("lest  asa "), 15, new Date(12, 12, 2020), 4));
    requirementList.addRequirement(new Requirement("4322", "12122", "getpeople",
        new UserStory("Lets say ok"), 100, new Date(12, 1, 2021), 5));
    requirementList.addRequirement(
        new Requirement("4322", "21221", "getpeople", new UserStory("dsadad"),
            35, new Date(12, 3, 2021), 6));

    System.out.println(requirementList.getRequirementByID("1244"));





  }

}
