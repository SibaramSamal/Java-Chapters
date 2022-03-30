package OOPs_Basics;

public class SU_InitVsStatic {
	SU_InitVsStatic(){
		System.out.println("Inside 0 param constructor");
	}
	{
		System.out.println("init block 1");
	}
	{
		System.out.println("init block 2");
	}
	public static void main(String[] args) {
		System.out.println("main(-)");

	}
	
	static {
		System.out.println("static block");
		SU_InitVsStatic obj = new SU_InitVsStatic();
		SU_InitVsStatic obj2 = new SU_InitVsStatic();
	}
	{
		System.out.println("init block 3");
	}

}
