package stationery.stationery_shop;

public class elephant implements Store {
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
	
	public elephant() {
		setColor("red");
		setPrice(20);
		setBrand("Elephant");
	}
	public elephant(int price2, String color2, String brand2) {
		// TODO Auto-generated constructor stub
	}
	public elephant(String color2, int price2, String brand2) {
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
