package OOPs_Basics;

public class SU_Constructors {
	
	SU_Constructors(){
		System.out.println("0 - Param Constructor");
	}
	SU_Constructors(int x, int y){
		System.out.println("2 - Param Constructor");
	}
	SU_Constructors(int x){
		System.out.println("1 - Param Constructor");
	}
	{
		System.out.println("Initializer block.");
	}
	{
		new SU_Constructors();
		System.out.println("2nd Initializer block.");
	}
	public static void main(String[] args) {
		SU_Constructors obj = new SU_Constructors();
		SU_Constructors ob2 = new SU_Constructors(2,96);
//		SU_Constructors ob3 = new SU_Constructors(6);

	}

}
