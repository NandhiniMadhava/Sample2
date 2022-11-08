package functioncalls;

public class UseStudent {
	public static void main(String [] args) {
	Student s1 = new Student();
	s1.name = "Nandhini";
	s1.rollNo = 123;
	s1.age= 22;
	s1.department= "CSE";
	Student s2 = new Student();
	s2.name = "Swetha";
	s2.rollNo = 456;
	s2.age= 21;
	s2.department= "ECE";
	Student s3 = new Student();
	s3.name = "Pravartiga";
	s3.rollNo = 789;
	s3.age= 20;
	s3.department= "CIVIL";
	Student [] students = new Student [3];
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	s1.oddRollDetails(students);
	}
}
