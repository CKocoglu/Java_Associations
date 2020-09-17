
public class SystemLogin {
	private String username;
	private int password;
	

	public SystemLogin() {
		
	}
	public SystemLogin(String username, int password) {
		this.username = username;
		this.password = password;
	}
	public SystemLogin( int password) {
		this.username = "admin";
		this.password = password;
	}

	public boolean Login(String username,int password) {
		
		if(this.username.equals(username) && this.password==password)
		{
			return true;
		}
		else
		{
			System.out.println("Wrong password. Try again.");
			return false;
		}
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
