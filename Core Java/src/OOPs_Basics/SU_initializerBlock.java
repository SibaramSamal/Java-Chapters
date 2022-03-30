package OOPs_Basics;

public class SU_initializerBlock {

	public SU_initializerBlock() {
		System.out.println("Inside 0 - param constructor");
	}

	{
		System.out.println("Inside 1st init block");
	}
	{
		System.out.println("Inside 2nd init block");
	}

	public static void main(String[] args) {
		SU_initializerBlock obj = new SU_initializerBlock();
		{
			System.out.println("Init block inside main(-)");
		}
	}
	{
		System.out.println("Init block outside main(-)");
	}
}
