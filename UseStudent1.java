package functioncalls;

public class UseStudent1 {
	public static void main(String [] abc ) {
		Student1 s1 = new Student1();
		s1.name = "Nandhini";
		s1.id = 123;
		s1.totalMark = 98;
		Student1 s2 = new Student1();
		s2.name = "Swetha";
		s2.id = 456;
		s2.totalMark = 99;
		Student1 s3 = new Student1();
		s3.name = "Pravartiga";
		s3.id = 789;
		s3.totalMark = 100;
		Student1 [] students = { s1,s2,s3};
		s1.highMark(students);
				
	}

}
