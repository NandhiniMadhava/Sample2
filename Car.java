package functioncalls;

public class Car {
	String brand;
	int price;
	String color;
	int taxAmount;
	
	public int netPrice(Car a) {
		return a.price+a.taxAmount;
	}

}
