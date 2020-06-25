package RE;

public class CelebVO {
	
	private String showNum;
	private String celebName;
	private String celebJob;
	private String uniname;
	public CelebVO(String showNum, String celebName, String celebJob, String uniname) {
		super();
		this.showNum = showNum;
		this.celebName = celebName;
		this.celebJob = celebJob;
		this.uniname = uniname;
	}
	public String getShowNum() {
		return showNum;
	}
	public void setShowNum(String showNum) {
		this.showNum = showNum;
	}
	public String getCelebName() {
		return celebName;
	}
	public void setCelebName(String celebName) {
		this.celebName = celebName;
	}
	public String getCelebJob() {
		return celebJob;
	}
	public void setCelebJob(String celebJob) {
		this.celebJob = celebJob;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	
	

}
