package collection.arraylist;

import java.util.ArrayList;

/* Introduction to ArrayList
 * @author 
 * Sibaram Samal

 	- It is the implementation class of List(I)
 	- ArrayList object can be used to create an empty dynamic array whose initial capacity is 10. 
 	- If we add beyond this size, half of size of array will be added i.e 10 + 5 = 15 will be the new capacity
 	- Duplicate value are allowed.
 	- Order of insertion is maintained.
 	- 
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		// ArrayList<Student> obj = new ArrayList();	this type creation is telling the jvm that it is genericc type specfic for Student type contents.
		ArrayList obj = new ArrayList();
		obj.add(15);
		obj.add("Sibaram");
		obj.add(56.3);
		obj.add('A');
		obj.add(5l);
		obj.add(15);
		System.out.println(obj.size());	//size will return the total elements in it.
		System.out.println(obj);
		ArrayList obj2 = new ArrayList(obj);
		System.out.println(obj2); 	//we can copy one array list to another
		obj.add(2,"Mr.");
		System.out.println(obj);
		
	}
}