
public class User {

	@CustomAnnotation(count = 1,name = "userName")
	private String userName;
	private String userMail;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public User(String userName, String userMail) {
		super();
		this.userName = userName;
		this.userMail = userMail;
	}
	@Override
	@CustomAnnotation(count = 2, name = "toString method")
	public String toString() {
		return "User [userName=" + userName + ", userMail=" + userMail + "]";
	}
			
}
