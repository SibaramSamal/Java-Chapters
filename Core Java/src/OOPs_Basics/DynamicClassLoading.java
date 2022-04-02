package OOPs_Basics;

import java.util.Scanner;

class Sample{
	static {
		System.out.println("Sample class loaded");
	}
	Sample(){
		System.out.println("Sample class 0 param constructor");
	}
	Sample(int x,int y){
		System.out.println("2 param constructor");
	}
}

public class DynamicClassLoading {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("Enter class you want to load: ");
		Scanner sc = new Scanner(System.in);
		Class obj = Class.forName(sc.next());
		obj.newInstance();
	}
}
