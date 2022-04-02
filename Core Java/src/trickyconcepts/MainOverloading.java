package trickyconcepts;

//Aim of the program : To test, "Can main() be overload?"
public class MainOverloading {
	static void main(int x) {
		System.out.println("The value inputtesd is:"+x);
	}

	public static void main(String[] args) {
		System.out.println("Regular main(-)");
		main(56);
	}
}
