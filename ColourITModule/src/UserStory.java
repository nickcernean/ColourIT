/**
 *  A class representing a User Story
 * @author Nichita Railean
 * @version 1.0 dec 3
 */

public class UserStory
{
  private String what;
  private String why;
  private String who;

  /**
   *  A 3 argument constructor creating an UserStory
   * @param what what
   * @param why why
   * @param who who
   *
   */

  public UserStory (String what, String why, String who ) {
    this.what = what;
    this.why = why;
    this.who = who;
  }

  /**
   * A one argument creting a User story
   * Setting why, who to an empty String
   * @param what what
   */

  public UserStory (String what){
    this.what = what;
    this.why = "";
    this.who = "";
  }

  /**
   * A method copying the UserStory
   * @return the copy named other
   */

  public UserStory copy(){
    UserStory other = new UserStory(what, why, who);
    return other;
  }
}
