import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class FoodList implements FoodInterface{

	
	public HashMap<FoodItem,CabinClass> foodMap = new HashMap<FoodItem,CabinClass>();
	
	
	
	public FoodList() {
			
		FoodItem foodItem1 = new FoodItem("Pasta Bolognese", 230);
		FoodItem foodItem2 = new FoodItem("Meat balls", 130);
		FoodItem foodItem3 = new FoodItem("Lasagne", 330);
		FoodItem foodItem4 = new FoodItem("Fried chicken", 430);
		FoodItem foodItem5 = new FoodItem("Soup", 230);
		FoodItem foodItem6 = new FoodItem("Salmon", 500);
		
		foodMap.put(foodItem1, CabinClass.ECONOMY);
		foodMap.put(foodItem2, CabinClass.ECONOMY);
		foodMap.put(foodItem3, CabinClass.ECONOMY);
		foodMap.put(foodItem4, CabinClass.ECONOMY);
		foodMap.put(foodItem5, CabinClass.FIRST);
		foodMap.put(foodItem6, CabinClass.FIRST);
		getFoodItemsList(CabinClass.ECONOMY);
	}
	

	public void addFoodItem(FoodItem foodItem, CabinClass cabinclass){
		foodMap.put(foodItem, cabinclass);
	}
	
	
	
	public HashMap<FoodItem, CabinClass> getFoodItemsList(CabinClass cabinclass){
		
		HashMap<FoodItem, CabinClass> temp = new HashMap<FoodItem, CabinClass>();
		
		Iterator<Entry<FoodItem, CabinClass>> iter  = foodMap.entrySet().iterator();
		while(iter.hasNext()){
			Entry<FoodItem, CabinClass> entry = iter.next();
			if(entry.getValue().equals(cabinclass)){
				temp.put(entry.getKey(), cabinclass);

			}			
			System.out.println( entry.getKey() + " CabinClass :"+entry.getValue());

		}
			return temp;
	}


	
	
}
