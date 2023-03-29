package POJO;

public class employee {
	
	private int idn;
	private String firstname;
	private String lastname;
	
	public void setId(int id)
	{
		this.idn=id;
	}
	
	public int getId()
	{
		return idn;
	}
	
	public void setfirstName(String firstName)
	{
		this.firstname=firstName;
	}
	
	public String getfirstName()
	{
		return firstname;
	}
	
	public void setlastName(String lastName)
	{
		this.lastname=lastName;
	}
	
	public String getlastName()
	{
		return lastname;
	}

}
