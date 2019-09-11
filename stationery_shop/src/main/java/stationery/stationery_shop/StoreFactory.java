package stationery.stationery_shop;

public class StoreFactory {
	public Store getType(String shapeType, int price, String color, String brand){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("ELEPHANT")){
	         return new elephant(price, color, brand);
	         
	      } else if(shapeType.equalsIgnoreCase("FABER_CASTELL")){
	         return new faber_castell(color, price, brand);
	         
	      } else if(shapeType.equalsIgnoreCase("HORSE")){
	         return new horse(price, color, brand);
	      }
	      
	      return null;
	   }
}