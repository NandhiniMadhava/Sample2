package functioncalls;

public class UseMaxmini {
	public static void main(String[] args) {
	Maxmini m = new Maxmini();
	int[] nums = { 10,20,30,85,23,15,95};
	m.findMax(nums);
	System.out.println(m.findMini(nums));
}
}
