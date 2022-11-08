package functioncalls;

public class Maxmini {
	public void findMax(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value:" +max);
	}

	public int findMini(int [] a) {
		int mini = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]<=mini) {
				mini = a[i];
			}
		}
		return mini;
	}
}
