
public class User {
	private String name;
	 private String Email;
	 private int Password;

    
	public User(String name, String email, int password) {
	
		this.name = name;
		Email = email;
		Password = password;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
}
}
