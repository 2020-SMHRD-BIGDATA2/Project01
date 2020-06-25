package RE;

public class TaxiVO {
	private int taxi_num;
	private String taxi_title;
	private String taxi_sub;
	private String per_id;
	private String taxi_date;
	
	
	public TaxiVO(int taxi_num, String taxi_title, String taxi_sub, String per_id, String taxi_date) {
		this.taxi_num = taxi_num;
		this.taxi_title = taxi_title;
		this.taxi_sub = taxi_sub;
		this.per_id = per_id;
		this.taxi_date = taxi_date;
	}


	public int getTaxi_num() {
		return taxi_num;
	}


	public String getTaxi_title() {
		return taxi_title;
	}


	public String getTaxi_sub() {
		return taxi_sub;
	}


	public String getPer_id() {
		return per_id;
	}


	public String getTaxi_date() {
		return taxi_date;
	}


	public void setTaxi_num(int taxi_num) {
		this.taxi_num = taxi_num;
	}


	public void setTaxi_title(String taxi_title) {
		this.taxi_title = taxi_title;
	}


	public void setTaxi_sub(String taxi_sub) {
		this.taxi_sub = taxi_sub;
	}


	public void setPer_id(String per_id) {
		this.per_id = per_id;
	}


	public void setTaxi_date(String taxi_date) {
		this.taxi_date = taxi_date;
	}

	
	
	

}
