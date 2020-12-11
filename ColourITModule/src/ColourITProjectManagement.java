public interface ColourITProjectManagement {
    void addNewTeamMember(String name,int yearsOfExperience,Email email);
    void addTeamMemberToProject(String projectID,TeamMember teamMember);
    void assignTeamMemberRoleInProject(String s);
    
}
