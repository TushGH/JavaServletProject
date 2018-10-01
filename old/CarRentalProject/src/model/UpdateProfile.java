package model;

public class UpdateProfile {
	private String Username ;
	private String curpassword ;
	private String newpassword ;
	private String conpassword ;
	private String fullName ;
	private String email ;
	private String PhoneNo ;
	private String addr ;
	

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getcurpassword() {
		return curpassword;
	}

	public void setcurpassword(String curpassword) {
		this.curpassword = curpassword;
	}
	
	public String getnewpassword() {
		return newpassword;
	}

	public void setnewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	
	public String getconpassword() {
		return conpassword;
	}

	public void setconpassword(String conpassword) {
		this.conpassword = conpassword;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
	public UpdateProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateProfile(String username, String fullName, String email, String phoneNo, String addr,
			String curpassword, String newpassword, String conpassword) {
		super();
		Username = username;
		this.curpassword = curpassword;
		this.newpassword = newpassword;
		this.conpassword = conpassword;
		this.fullName = fullName;
		this.email = email;
		PhoneNo = phoneNo;
		this.addr = addr;
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

	public String getaddr() {
		return addr;
	}

	public void setaddr(String addr) {
		this.addr = addr;
	}
}
