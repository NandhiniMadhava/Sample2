package functioncalls;

public class UseLHSRHS {
	public static void main(String [] args) {
		LHSRHS lhs = new LHSRHS();
		int a= Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(lhs.findLHS(a,b));
	}

}
