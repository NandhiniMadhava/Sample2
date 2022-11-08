package functioncalls;

public class Findcount {
	public void count(String a) {
		int lower =0;
		int upper =0;
		int num =0;
		int spcl =0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>= 'a' && a.charAt(i) <='z') {
				lower++;
				
			}
			else if(a.charAt(i)>='A' && a.charAt(i)<='Z') {
				upper++;
			}
			else if(a.charAt(i) >='0' && a.charAt(i)<='9') {
				num++;
			}
			else {
				spcl++;
			}
		}
		System.out.println( "UPPERCASE COUNT= "+upper +"\n"+ "LOWERCASE COUNT = "+lower+"\n"+"NUMBER COUNT = "+num+"\n"+"SPECIAL CHARACTER COUNT = "+spcl);
	}

}
