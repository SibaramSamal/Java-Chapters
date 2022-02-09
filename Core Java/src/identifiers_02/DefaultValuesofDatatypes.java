package identifiers_02;

public class DefaultValuesofDatatypes {
	private static byte b;
	private static short s;
	private static int i;
	private static long l;
	private static float f;
	private static double d;
	private static char c;
	private static boolean bl;
	
	public static void main(java.lang.String[] args) {
		int x;
		System.out.println("Default value of Premitive data types");
		System.out.println("Byte : "+b);
		System.out.println("short : "+s);
		System.out.println("int : "+i);
		System.out.println("long : "+l);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		System.out.println("char : "+c);
		System.out.println("boolean : "+bl);
		
		//System.out.println("Default value of variable declared inside method : "x);
		/*
		 
		  As x is not a class level variable, we can't left it without initialise(if we use that variable in the program). 
		  Or it will give : Syntax error on token "x", delete this token
		
		*/
	}
}

/* 
  	only class level variables are initialiised by the compiler. Method level variables are to be initialise by the prorammer.
 
Default value of Premitive data types
Byte : 0
short : 0
int : 0
long : 0
float : 0.0
double : 0.0
char : 


 */
