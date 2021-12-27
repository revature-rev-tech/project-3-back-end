package com.project3.revtech.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_details")
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@OneToMany(mappedBy = "user")
	private List<Cart> carts;

	@NotNull
	@Column(name = "user_email")
	private String userEmail;

	@NotNull
	@Column(name = "user_name")
	private String userName;

	@NotNull
	@Column(name = "user_password")
	private String userPassword;

	@NotNull
	@Column(name = "user_first_name")
	private String userFirstName;

	@NotNull
	@Column(name = "user_last_name")
	private String userLastName;

	@NotNull
	@Column(name = "user_address")
	private String userAddress;

	@NotNull
	@Column(name = "user_contact")
	private String userContact;

	@NotNull
	@Column(name = "user_type")
	private String userType;

	@Column(name = "user_removed")
	private boolean userRemoved;

	public User(int userId, List<Cart> carts, @NotNull String userEmail, @NotNull String userName,
			@NotNull String userPassword, @NotNull String userFirstName, @NotNull String userLastName,
			@NotNull String userAddress, @NotNull String userContact, @NotNull String userType, boolean userRemoved) {
		super();
		this.userId = userId;
		this.carts = carts;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userType = userType;
		this.userRemoved = userRemoved;
	}

	public User(int userId, String userEmail, String userName, String userPassword, String userFirstName, String userLastName, String userAddress, String userContact, String userType, boolean userRemoved) {
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userType = userType;
		this.userRemoved = userRemoved;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isUserRemoved() {
		return userRemoved;
	}

	public void setUserRemoved(boolean userRemoved) {
		this.userRemoved = userRemoved;
	}
}
