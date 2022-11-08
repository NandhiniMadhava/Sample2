package functioncalls;

public class Laptop {
	String brand;
	int price;
	String color;
	boolean isWarranty;
	
	public void showWarrantyObjects (Laptop [] a) {
		for(int i=0; i<a.length;i++) {
			if(a[i].isWarranty== true) {
				System.out.println(" Brand: " +a[i].brand + ", Price: "+a[i].price+ ", Color: "+a[i].color);
			}
		}
	}

}
