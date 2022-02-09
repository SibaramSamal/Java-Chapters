package identifiers_02;

public class OperationsOnEqualsOperator {
	private static int x = 50,y = 50;
	public static void main(java.lang.String[] args) {
		System.out.println("x == y : "+(x == y));
		System.out.println("x = y : "+(x = y));
		System.out.println("x != y : "+(x != y));
		//System.out.println("x = y == y : "+(x = y == y)); //Type mismatch: cannot convert from boolean to int
		//System.out.println("x = y == y : "+(x = y) == y);//Incompatible operand types String and int
		System.out.println(3.5f == 3.5);	//only roundoff value comparisons are equal
		System.out.println(3.3f == 3.3);	//there are not equal
	}
}
