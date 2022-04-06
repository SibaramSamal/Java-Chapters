package packages.mypackages;

import packages.mypackages2.Address;	//to use Address class, we must import it

public class Student {
	int sid;
	String sname;
	Address add;

	public Student(int id, String sname, Address add) {
		this.sid = id;
		this.sname = sname;
		this.add = add;
	}
	public String toString() {
		return "Sname: "+sname+" Address:"+add.getStreetName()+", "+add.getPin();
	}
	public static void main(String[] args) {
		Student st = new Student(14,"Sibaram Samal",new Address("New Burupada","761146"));
		System.out.println(st);
	}
}
