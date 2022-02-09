package identifiers_02;

public class PredefinedClsNamedUserMethod {
	public static void main(java.lang.String[] args) {
		System.out.println("Hello From Main");
		
	}
}
/*
	We can use userdefined methods as identifiers as method name but incase we use that predefined method in our program, we must specify the fully qualified package name.
	eg. in this case, we have our own "String" named class. So when we try to run the program, JVM fails to load the main() because it was looing fro the String class of java.lang package but as it is giving priority to the current package, so it gives error because main() prototype is pre defined and fixed bu JVM people.

*/