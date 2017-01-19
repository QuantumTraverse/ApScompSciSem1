public class User
{
	private String firstname, lastname, avatar;
	private int userID;
	public User()
	{
		firstname = "Null";
		lastname = "Null";
		avatar = "Null";
	}
	public User(String fN, String lN)
	{
		firstname = fN;
		lastname = lN;
		avatar = "Null";
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public User(String fN, String lN, String a)
	{
		firstname = fN;
		lastname = lN;
		avatar = a;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public void setValues(String fN, String lN, String a)
	{
		firstname = fN;
		lastname = lN;
		avatar = a;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstname + "\nLast Name: " + lastname + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
}