package OOPs_Basics;

public class SU_staticKeyword {
	int sid;
	String name,address,phone;
	static String school,company;
	{
		school = "SSVM";
		company = "xyz";
	}
	public SU_staticKeyword(int sid, String name, String address, String phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public void showData() {
		System.out.println("Id:"+sid+" Name:"+name+" Address:"+address+" phone:"+phone+" School:"+school+" Company:"+company);
	}
	
	public static void main(String[] args) {
		SU_staticKeyword obj = new SU_staticKeyword(14, "Sibaram Samal", "Berhampur", "9988775566");
		SU_staticKeyword obj2 = new SU_staticKeyword(3, "Jeet Bisoi", "Berhampur", "9988711566");
		obj.showData();
		obj2.showData();
	}

}
