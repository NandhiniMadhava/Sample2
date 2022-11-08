package functioncalls;

public class Student1 {
	String name;
	int id;
	int totalMark;
	
	public void highMark (Student1 [] a) 
	{
		int max = a[0].totalMark;
		Student1 index = null;
		for(int i=0; i<a.length; i++) {
			if(a[i].totalMark>= max) {
				max = a[i].totalMark;
				index = a[i];
			}
			
		}
		System.out.println("Details of the Student with high score :" +"\n"+ "Name= "+index.name+ " id= " + index.id+ " Marks= "+index.totalMark);
	}

}
