package house;
import java.util.Scanner;

public class house {
	
	private String address;
	private String city;
	private String State;
	private int zipcode;
	private int sqft;
	private String sale_status;
	
	public house(String address, String city, String State, int zipcode, int sqft, String sale_status) {
		this.address = address;
		this.city = city;
		this.State = State;
		this.zipcode = zipcode;
		this.sqft = sqft;
		this.sale_status = sale_status;
	}
	
	public house(house ob) {
		address = ob.address;
		city = ob.city;
		State = ob.State;
		zipcode = ob.zipcode;
		sqft = ob.sqft;
		sale_status = ob.sale_status;
	}
	
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return State;
	}
	public int getZip() {
		return zipcode;
	}
	public int getSqft() {
		return sqft;
	}
	public String getSaleStatus() {
		return sale_status;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.State = state;
	}
	public void setZip(int zip_code) {
		this.zipcode = zip_code;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public void setSaleStatus(String sale_status) {
		this.sale_status = sale_status;
	}

}
