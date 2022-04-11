package OOPs_Basics;

public class ObjectTypeChk {
	public static void main(String[] args) {
		Object x = '5';
		System.out.println(x instanceof Character);	//will return true
	}
}

// "instanceof" operator is used compare if the operand is the object of specified class or not.
// Here, x is being checked whether it is the object of Character class or not. If yes, return true or else return false. 