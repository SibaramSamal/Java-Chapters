package OOPs_Basics;

public class SU_ObjectCoutUsingStatic {
	static int count;
	int c;
	SU_ObjectCoutUsingStatic(){
		count++;
		c++;
		System.out.println(count+" "+c);
	}
	public static void main(String[] args) {
		SU_ObjectCoutUsingStatic obj = new SU_ObjectCoutUsingStatic();
		SU_ObjectCoutUsingStatic obj2 = new SU_ObjectCoutUsingStatic();
		SU_ObjectCoutUsingStatic obj3 = new SU_ObjectCoutUsingStatic();
		System.out.println("Total numbers of objects created : "+SU_ObjectCoutUsingStatic.count);
	}
}
