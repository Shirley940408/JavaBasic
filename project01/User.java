public class User {

	private String usn;
	private String pwd;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//constructor
	public User(String usn, String pwd) {
		this.usn = usn;
		this.pwd = pwd;
	}
	

}
