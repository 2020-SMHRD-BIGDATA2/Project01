package RE;

public class PMVO {
	private String PER_ID;
	private String PER_PW;
	private String PER_NAME;
	private String PER_PHONE;
	private String PER_SECURITYNUM;

	public PMVO(String pER_ID, String pER_PW, String pER_NAME, String pER_PHONE, String pER_SECURITYNUM) {
		PER_ID = pER_ID;
		PER_PW = pER_PW;
		PER_NAME = pER_NAME;
		PER_PHONE = pER_PHONE;
		PER_SECURITYNUM = pER_SECURITYNUM;
	}
	
	public PMVO(String pER_ID) {
		PER_ID = pER_ID;
	}

	public String getPER_ID() {
		return PER_ID;
	}
	public void setPER_ID(String pER_ID) {
		PER_ID = pER_ID;
	}
	public String getPER_PW() {
		return PER_PW;
	}
	public void setPER_PW(String pER_PW) {
		PER_PW = pER_PW;
	}
	public String getPER_NAME() {
		return PER_NAME;
	}
	public void setPER_NAME(String pER_NAME) {
		PER_NAME = pER_NAME;
	}
	public String getPER_PHONE() {
		return PER_PHONE;
	}
	public void setPER_PHONE(String pER_PHONE) {
		PER_PHONE = pER_PHONE;
	}
	public String getPER_SECURITYNUM() {
		return PER_SECURITYNUM;
	}
	public void setPER_SECURITYNUM(String pER_SECURITYNUM) {
		PER_SECURITYNUM = pER_SECURITYNUM;
	}
	
	
	
}
