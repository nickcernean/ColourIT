/**
 * Email of the employees object
 * @author Rokas Paulauskas
 * @version 1.001 2020-12-03
 */
public class Email {
  private String user;
  private String host;
  private String domain;

  /**
   * Creates email object, if some part is not valid changes it to wrong or something
   * @param user - name of the user
   * @param host - name of the email host
   * @param domain - name of the email domain
   */
  public Email(String user, String host, String domain) {
    this.user = user;
    this.host = host;
    this.domain = domain;
    if (user.length() < 1 || user.length() > 64) {
      this.user = "wrong";
    }
    if (host.length() < 1 || host.length() > 63) {
      this.host = "email";
    }
    char checkh = host.charAt(0);
    if (!((checkh >= 'A' && checkh <= 'Z') || (checkh >= 'a' && checkh <= 'z'))) {
      this.host = "email";
    }
    if (domain.length() < 1 || domain.length() > 63) {
      this.domain = "address";
    }
    int letters = 0;
    for (int i = 0; i < domain.length() - 1; i++) {
      char checkd = host.charAt(0);
      if (!((checkd >= 'A' && checkd <= 'Z') || (checkd >= 'a' && checkd <= 'z'))) {
        letters++;
      }
    }
    if (letters < 1) {
      domain = "address";

    }

  }

  /**
   * gets the name of the user
   * @return user
   */
  public String getUser() {
    return this.user;
  }

  /**
   * gets the name of the host for example gmail/yahoo etc
   * @return host
   */
  public String getHost() {
    return this.host;
  }

  /**
   * gets domain of the email service for example com/co.uk/lt etc
   * @return domain
   */
  public String getDomain() {
    return this.domain;
  }

  /**
   * formats the user/host/domain to the valid email if there was any wrong input changes the string to wrong format.
   * @return
   */
  public String toString() {

    if (host.equals("email") || user.equals("wrong") || domain.equals("address")) {
      return "Wrong format";
    } else
      return this.user + "@" + this.host + "." + this.domain;
  }

  /**
   * compares objects first checks if it is email if not returns false else compares email objects if they are the same
   * @param obj - any object
   * @return false or true if the emails are the same or not.
   */
  @Override public boolean equals(Object obj){
    if(!(obj instanceof Email)){
      return false;
    }
    Email other = (Email) obj;
    return user.equals(other.getUser()) && host.equals(other.getHost()) && domain.equals(other.getDomain());
  }

}
