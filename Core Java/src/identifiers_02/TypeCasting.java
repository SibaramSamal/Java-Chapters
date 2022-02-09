package identifiers_02;

/*
	Literals are the Constant valus that are asigned to the variables.
	integer,character,floatingpoint,string are the literals in java.
	
	=> Bydefault integer literals are of type int. If we want them to be treated as long type value, we have to use postfix l or L to the value.
	=> Bydefault floating point literals are of type double. If we want them to be treated as float type value, we have to use postfix f or F to the value.
	
*/
public class TypeCasting {
	private long x = 999999999; //int value assigned to Long value
	private long y = 5585652664l; // here the value is out of range of int type. so to treat this value as long, we have to use l as postfix.
	//private double d = 8516416144944655999999999999999999999999996f; //float is default
	// we can check frm the assigned value is out of range for float value. if we want to treat this as double type, we have to use postfix d
	
	
	/*
	 
	 as java supports unicode character set, we can assign int value from 0 to 65535 but earlier languages supports onli ASCII range which is 0-32767
	 
*/
	char ch = 65535;	//65536 will give error
	
	public static void main(java.lang.String[] args) {
		TypeCasting t = new TypeCasting();
		System.out.println(t.ch);
	}
}
/*
	Bydefault, OS supports only ASCII character set. So beyond this range JVM will store ? symbol as replacement
*/
