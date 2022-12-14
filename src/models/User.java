package models;

public class User {
	// creation of instance variable
	private String username;
	private String email;
	private String pass;
	private String cpass;
	private String dob;
	private String sq;
	private String contact;
	
	private String contact_us;

	public String getContact_us() {
		return this.contact_us;
	}

	public void setContact_us(String contact_us) {
		this.contact_us = contact_us;
	}

	public User(String username, String email, String pass, String cpass, String dob, String sq, String contact,  String contact_us) {
		this.username = username;
		this.email = email;
		this.pass = pass;
		this.cpass = cpass;
		this.dob = dob;
		this.sq = sq;
		this.contact = contact;
		
		this.contact_us = contact_us;
	}

	

	

	

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCpass() {
		return this.cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSq() {
		return this.sq;
	}

	public void setSq(String sq) {
		this.sq = sq;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

}