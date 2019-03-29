package Model;


public class Team {
	
	private String TeamName;
    private String Members;
    private String Project;
    
    public Team(String TeamName, String Members, String Project) 
    {
    	 this.TeamName = TeamName;
    	 this.Members = Members;
    	 this.Project = Project;
    	 
    }
    
    public void setTeamName ( String n ) {
    	TeamName = n;
    	} 

    public String getTeamName() {
    	   return TeamName;
    	} 
    
    public void setMembers ( String j ) {
    	Members = j;
    	} 

    public String getMembers() {
    	   return Members;
    	} 
    
    public void setProject ( String e ) {
    	Project = e;
    	} 

    public String getProject() {
    	   return Project;
    	} 
    

}
