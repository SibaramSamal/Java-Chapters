package classandobjects;
class Student{
	int id;	//instance member variable
	String name;	//instance member variable
	static String school;	//static declared variable is class level
	static {
		Student.school = "SSVM";	//static block codes executed at the time of object creation
	}
	public String toString() {
		return "ID:"+id+" Name:"+name+" School:"+school;
	}
}
public class ClassObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 14;
		s1.name = "Ramesh";
		
		Student s2 = new Student();
		s2.id = 136;
		s2.name = "Naresh";
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
