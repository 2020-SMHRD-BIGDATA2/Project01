package RE;

public class DAO_Show {
	private String celeb_name;
	private String celeb_job;
	private String uni_name;
	public DAO_Show(String celeb_name, String celeb_job, String uni_name) {
		super();
		this.celeb_name = celeb_name;
		this.celeb_job = celeb_job;
		this.uni_name = uni_name;
	}
	public String getCeleb_name() {
		return celeb_name;
	}
	public String getCeleb_job() {
		return celeb_job;
	}
	public String getUni_name() {
		return uni_name;
	}
	public void setCeleb_name(String celeb_name) {
		this.celeb_name = celeb_name;
	}
	public void setCeleb_job(String celeb_job) {
		this.celeb_job = celeb_job;
	}
	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}

}
