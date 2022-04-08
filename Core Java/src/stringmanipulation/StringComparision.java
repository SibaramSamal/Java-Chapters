package stringmanipulation;

// Comparision tetsing of string objects

public class StringComparision {

	public static void main(String[] args) {
		StringComparision obj = new StringComparision();
		StringComparision obj2 = new StringComparision();
		String s1 = "Sibaram";
		String s2 = new String("sibaram");
		//comparing s1 and s2 with == operator
		System.out.println(s1 == s2);
		//comparing s1 and s2 with Sting class equals()
		System.out.println(s1.equals(s2));
		//comparing obj and ojb2 with Object class equals()
		System.out.println(obj.equals(obj2));
		//comparing s1 and s2 with equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
/*
	conclusion:
	== and equals() of Object class acts as same. They both checks the references equal or not.
	equals() of String class checks the cntents of the object.
	equalsIgnoreCase() willchecks the contents without case constraint.
*/