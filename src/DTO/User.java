package DTO;

public class User {

	private int idUsers;
	private String name;
	private String lastname;
	private String email;
	private String password;
	private String role;
	
	
	public User( String name, String lastname, String email, String password, String role) {
		super();
		
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.role = role;
	}


	public User() {
		super();
	}


	public int getIdUsers() {
		return idUsers;
	}


	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
