package OOPs_Basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Enter class you want to load: ");
		Scanner sc = new Scanner(System.in);
		Class obj = Class.forName(sc.next());// for loading the class
		/* After loading the class to create object, use newInstance(). But in this way, only default
		   constructor in called. To call all other types of constructors, we have to collect all the 
		   constructor references in an Constructor array and through the index number and parameterized
		    newInstance(), we can call our required constructors
		 */
		obj.newInstance();	//For 0-Param constructor
		Constructor[] ob = obj.getDeclaredConstructors();
		ob[0].newInstance();	//For 0-Param constructor
		ob[1].newInstance(5,6); //For 2-Param constructor
	}
}
