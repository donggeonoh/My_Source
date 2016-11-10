package odg.ch07;

public class LoginBean {
	private String userId;
	private String passWd;
	
	final String _userid = "myuser";
	final String _passwd = "1234";
	
	public boolean checkUser() {
		if(isUser()) return true;
		else return false;
	}
	
	private boolean isUser() {
		if(userId.equals(_userid) && passWd.equals(_passwd)) return true;
		else return false;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
}