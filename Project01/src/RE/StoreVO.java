package RE;

public class StoreVO {
	private int store_num;
	private String store_name;
	private String uni_name;
	private String major_name;

	

	public StoreVO(int store_num, String store_name, String uni_name, String major_name) {
		super();
		this.store_num = store_num;
		this.store_name = store_name;
		this.uni_name = uni_name;
		this.major_name = major_name;
	}

	public int getStore_num() {
		return store_num;
	}

	public String getStore_name() {
		return store_name;
	}

	public String getUni_name() {
		return uni_name;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setStore_num(int store_num) {
		this.store_num = store_num;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public void setUni_name(String uni_name) {
		this.uni_name = uni_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}


}
