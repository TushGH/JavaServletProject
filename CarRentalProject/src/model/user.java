package model;

public class user {
	private String Username ;
	private String Password ;
	private String fullName ;
	private String Role ;
	private String Licence ;
	private String DOB ;
	private String email ;
	private String PhoneNo ;
	private String Address ;
	private String UTAID ;
	private String AutoClub ;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String username, String password, String fullName, String role, String licence, String dOB,
			String email, String phoneNo, String address, String uTAID, String autoClub) {
		super();
		Username = username;
		Password = password;
		this.fullName = fullName;
		Role = role;
		Licence = licence;
		DOB = dOB;
		this.email = email;
		PhoneNo = phoneNo;
		Address = address;
		UTAID = uTAID;
		AutoClub = autoClub;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getLicence() {
		return Licence;
	}

	public void setLicence(String licence) {
		Licence = licence;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUTAID() {
		return UTAID;
	}

	public void setUTAID(String uTAID) {
		UTAID = uTAID;
	}

	public String getAutoClub() {
		return AutoClub;
	}

	public void setAutoClub(String autoClub) {
		AutoClub = autoClub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
