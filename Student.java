package functioncalls;

public class Student {
	String name;
	int rollNo;
	int age;
	String department;
	public void oddRollDetails (Student [] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].rollNo%2!=0) {
				System.out.println(a[i].name+" " + a[i].rollNo+" " + a[i].age+" " +a[i].department);
			}
		}
	}

}
