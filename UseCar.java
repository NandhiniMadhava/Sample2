package functioncalls;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand= "Audi";
		c1.price = 2500000;
		c1.color="Red";
		c1.taxAmount = 50000;
		Car c2 = new Car();
		c2.brand= "BMW";
		c2.price = 300000;
		c2.color="Black";
		c2.taxAmount = 20000;
		Car c3 = new Car();
		c3.brand= "Ferrari";
		c3.price = 4500000;
		c3.color= "Blue";
		c3.taxAmount = 70000;
		System.out.println("Netprice " +c1.netPrice(c2));
	}}