package functioncalls;

public class UseLaptop {
	public static void main(String [] args) {
		Laptop lap1 = new Laptop();
		lap1.brand = "DELL";
		lap1.price = 60000;
		lap1.color = "Black";
		lap1.isWarranty = true;
		Laptop lap2 = new Laptop();
		lap2.brand = "HP";
		lap2.price = 50000;
		lap2.color = "White";
		lap2.isWarranty = true;
		Laptop lap3 = new Laptop();
		lap3.brand = "Lenovo";
		lap3.price = 40000;
		lap3.color = "Red";
		lap3.isWarranty = false;
		Laptop lap4 = new Laptop();
		lap4.brand = "Acer";
		lap4.price = 30000;
		lap4.color = "Black";
		lap4.isWarranty = false;
		Laptop [] laptops = {lap1,lap2,lap3};
		System.out.println("Details of Laptop with Warranty:");
		lap2.showWarrantyObjects(laptops);
		
	}

}
