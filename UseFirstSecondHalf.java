package functioncalls;

public class UseFirstSecondHalf {
	public static void main(String [] args) {
		FirstSecondHalf fsh = new FirstSecondHalf();
		String [] names = {"Nandhini", "Swetha", "Pravartiga", "Madhavan", "Santhi","John"};
		fsh.printFirstHalf(names);
		System.out.println(" ");
		fsh.printSecondHalf(names);
	}

}
