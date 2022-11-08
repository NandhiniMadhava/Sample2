package functioncalls;

public class ForwardReverse {
public void PrintForward(String name) {
	for(int i =0; i<name.length(); i++) {
		 System.out.println(name.charAt(i));
	}
}
public void PrintReverse(String name) {
	for(int i=name.length()-1; i>=0;i--) {
		System.out.println(name.charAt(i));
	}
}

public String stringReverse() {
	String name = "Nandhini";
	String temp= "";
	for(int i=name.length()-1;i>=0;i--) {
		temp = temp+name.charAt(i);
	}
	return temp;
}
}
