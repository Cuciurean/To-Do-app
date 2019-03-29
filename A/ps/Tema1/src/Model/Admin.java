package Model;


public class Admin {
	
	private String username;
    private String password;


    public Admin(String username, String password) 
    {
    	 this.username = username;
    	 this.password = password;
    }

    public void setName ( String n ) {
    	username = n;
    	} 

    public String getName() {
    	   return username;
    	} 
    
    public void setPass ( String p ) {
    	password = p;
    	} 

    public String getPass() {
    	   return password;
    	} 


}
