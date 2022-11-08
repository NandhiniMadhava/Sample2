package functioncalls;

public class PrimeNumber {
	public void checkPrime(int [] num) {
	
		for(int i=2;i<num.length;i++) {
			if(num[i]%i==0) {
				System.out.println(num[i] + " is not a prime number");
			}
			else {
				System.out.println(num[i] + " is a prime number");
			}
		}
	}

}
