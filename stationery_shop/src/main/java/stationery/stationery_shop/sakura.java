package stationery.stationery_shop;

public class sakura implements Store {
	private int price;
	private String color;
	private String brand;
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
	
	public sakura() {
		setColor("pink");
		setPrice(25);
		setBrand("Sakura");
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
