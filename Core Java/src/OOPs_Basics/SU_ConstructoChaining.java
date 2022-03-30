package OOPs_Basics;

public class SU_ConstructoChaining {
	SU_ConstructoChaining(){
		this(5);
		System.out.println("Zero param constructor");
	}
	SU_ConstructoChaining(int x){
		this(5,6);
		System.out.println("1 param constructor");
	}
	SU_ConstructoChaining(int x,int y){
		System.out.println("2 param constructor");
	}
	public static void main(String[] args) {
		SU_ConstructoChaining obj = new SU_ConstructoChaining();
	}

}
