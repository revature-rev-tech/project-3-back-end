package com.project3.revtech.pojo;

public class UserPojo {

	 private int user_id;
	 private String first_name;
	 private String last_name;
     private String username;
     private String email;
     private String password;
	 private String address;
	 private String contact;
	 
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPojo(int user_id, String first_name, String last_name, String username, String email, String password,
			String address, String contact) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "UserPojo [user_id=" + user_id + ", firstName=" + first_name + ", lastName=" + last_name + ", username="
				+ username + ", email=" + email + ", password=" + password + ", address=" + address + ", contact="
				+ contact + "]";
	}

  
}
