package RE;

public class MMVO {
	String id;
	String pw;
	int uniNum;
	int majorNum;
	public MMVO(String id, String pw, int uniNum, int majorNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.uniNum = uniNum;
		this.majorNum = majorNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getUniNum() {
		return uniNum;
	}
	public void setUniNum(int uniNum) {
		this.uniNum = uniNum;
	}
	public int getMajorNum() {
		return majorNum;
	}
	public void setMajorNum(int majorNum) {
		this.majorNum = majorNum;
	}
	

}
