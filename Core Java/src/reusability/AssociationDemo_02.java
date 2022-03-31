package reusability;

class Employee{
	int id;
	String name,phone;
	float sal;
	Address add;//aggregation
	Employee(int id,String name,String phone,float sal,Address add){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.sal = sal;
		this.add = add;
	}
	void displayEmpData() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Phone no.: "+phone);
		System.out.println("Salary: "+sal);
		System.out.println("Address:"+add.name+","+add.pin);
	}
}
class Address{
	String name,pin;
	Address(String name,String pin){
		this.name = name;
		this.pin = pin;
	}
	Address(String name){
		this.name = name;
	}
}
public class AssociationDemo_02 {

	public static void main(String[] args) {
		Employee emp = new Employee(14,"Sibaram Samal","8342866295",28000f,new Address("New Burupada","761146"));
		Employee emp2 = new Employee(3,"Jeet Bisoi","7856423185",28000f,new Address("Berhampur"));
		emp.displayEmpData();
		emp2.displayEmpData();
	}
}
