package functioncalls;

public class FirstSecondHalf {
	
	public void printFirstHalf(String [] a) {
		for(int i=0;i<a.length/2;i++) {
			System.out.println(a[i]);
		}
	}
	
	public void printSecondHalf(String [] a) {
		for(int i=a.length/2-1;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
