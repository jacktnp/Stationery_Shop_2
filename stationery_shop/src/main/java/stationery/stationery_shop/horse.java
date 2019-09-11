package stationery.stationery_shop;

public class horse implements Store {
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
	
	public horse(int price2, String color2, String brand2) {
		setColor("black");
		setPrice(10);
		setBrand("Horse");
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
