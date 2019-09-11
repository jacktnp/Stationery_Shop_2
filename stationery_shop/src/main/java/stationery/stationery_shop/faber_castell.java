package stationery.stationery_shop;

public class faber_castell implements Store{

	private int price;
	private String color;
	private String brand;
	
	public faber_castell() {
		this.price = price;
		this.color = color;
		this.brand = "faber_castell";
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


}