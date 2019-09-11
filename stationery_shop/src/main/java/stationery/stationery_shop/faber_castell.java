package stationery.stationery_shop;

public class faber_castell implements Store {
	private int price;
	private String color;
	private String brand;
	public faber_castell(String color2, int price2, String brand2) {
		// TODO Auto-generated constructor stub
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
	
	public void elephant() {
		setColor("blue");
		setPrice(15);
		setBrand("Faber castell");
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
