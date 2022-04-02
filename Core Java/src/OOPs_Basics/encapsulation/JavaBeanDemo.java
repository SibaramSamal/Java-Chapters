package OOPs_Basics.encapsulation;

import java.util.Scanner;

public class JavaBeanDemo {
	boolean validateUser(UserBean obj) {
		if(obj.getUserName().equals("Sibaram") & obj.getPassword().equals("1111"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		UserBean obj = new UserBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name: ");
		String userName = sc.next();
		System.out.println("Enter password: ");
		String pass = sc.next();
		
		obj.setUserName(userName);//setting inputs in java bean
		obj.setPassword(pass);
		JavaBeanDemo demo = new JavaBeanDemo();
		if(demo.validateUser(obj) == true)
			System.out.println("Valid user");
		else
			System.out.println("Invalid user !!!! ");
	}
}
