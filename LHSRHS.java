package functioncalls;

public class LHSRHS {
	public String findLHS(int a, int b){
		if (((a+b)*(a+b))==(a*a)+(b*b)+2*(a)*(b)) {
			return "LHS=RHS";	
		} else {
			return "Not equal";
		}
	}

}
