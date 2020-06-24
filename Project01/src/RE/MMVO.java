package RE;

public class MMVO {
	String id;
	String pw;
	String uniName;
	String majorName;
	
	public MMVO(String id, String pw, String uniName, String majorName) {
		this.id = id;
		this.pw = pw;
		this.uniName = uniName;
		this.majorName = majorName;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getUniName() {
		return uniName;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}


}
