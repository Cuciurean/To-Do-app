package Model;


public class Employee {
	
	
	private String Name;
	private String pass;
    private String Job;
    private int Age;
    private String email;
    
    public Employee(String Name, String pass, String Job, int Age, String email) 
    {
    	 this.Name = Name;
    	 this.pass = pass;
    	 this.Job = Job;
    	 this.Age = Age;
    	 this.email = email;
    	 
    }
    
    public void setName ( String n ) {
    	Name = n;
    	} 

    public String getName() {
    	   return Name;
    	} 
    
    public void setPass ( String p ) {
    	pass = p;
    	} 

    public String getPass() {
    	   return pass;
    	} 
    
    public void setJob ( String j ) {
    	Job = j;
    	} 

    public String getJob() {
    	   return Job;
    	} 
    
    public void setemail ( String e ) {
    	email = e;
    	} 

    public String getemail() {
    	   return email;
    	} 
    
    public void setAge ( int  a ) {
    	Age = a;
    	} 

    public int getAge() {
    	   return Age;
    	} 
}
