package main;

public class User {
	// variables
	private int id;
	private String user;
	private String password;
	private String name;
	private String address;

	// class constructor
	public User(int id, String user, String password, String name, String address) {
		this.id = id;
		this.user = user;
		this.password = password;
		this.name = name;
		this.address = address;
	}

	// toString method
	public String toString() {
		return String.format("User:%1s | %s is going to: %s", this.user, this.name, this.address);
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// end of getters and setters

}