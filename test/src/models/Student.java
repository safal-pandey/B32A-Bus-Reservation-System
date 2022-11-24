package models;

public class Student {
	// creation of instance variable
	private String user_fname;
	private String user_lname;
	private String user_email;
	private String user_contact;
	private String user_address;
	private String user_pass;

	// creation of public getter and setter --> for student ID
	public String getUser_fname() {
		return this.user_fname;
	}

	public String getUser_lname() {
		return this.user_lname;
	}

	public String getUser_email() {
		return this.user_email;
	}

	public String getUser_contact() {
		return this.user_contact;
	}

	public String getUser_address() {
		return this.user_address;
	}

	public String getUser_pass() {
		return this.user_pass;
	}

	public void setUser_fname(String newUser_fname) {
		this.user_fname = newUser_fname;
	}

	public void setUser_lname(String newUser_lname) {
		this.user_lname = newUser_lname;
	}

	public void setUser_email(String newUser_email) {
		this.user_email = newUser_email;
	}

	public void setUser_contact(String newUser_contact) {
		this.user_contact = newUser_contact;
	}

	public void setUser_address(String newUser_address) {
		this.user_address = newUser_address;
	}

	public void setUser_pass(String newUser_pass) {
		this.user_pass = newUser_pass;
	}

	// creation of public getter and setter --> for student Name

	// creation of public constructor
	public Student(String user_fname,
			String user_lname,
			String user_email,
			String user_contact,
			String user_address,
			String user_pass) {
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_email = user_email;
		this.user_contact = user_contact;
		this.user_address = user_address;
		this.user_pass = user_pass;

	}

}