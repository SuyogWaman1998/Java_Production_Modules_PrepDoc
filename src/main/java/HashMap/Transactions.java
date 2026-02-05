package HashMap;

import java.util.Date;

public class Transactions {
	
	private String date;
	private Integer ammount;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAmmount() {
		return ammount;
	}
	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}
	public Transactions(String string, Integer ammount) {
		super();
		this.date = string;
		this.ammount = ammount;
	}
	

}
