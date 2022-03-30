package OOPs_Basics;

public class SU_DataShadowing_thisKeyWord {
	int x = 10;
	 void setData(int x) {
		 x = x;	
		 System.out.println(x);	//45 stored in itself
	 }
	 void showData() {
		 System.out.println("Value of instance variale = "+x);
	 }
	public static void main(String[] args) {
		SU_DataShadowing_thisKeyWord obj = new SU_DataShadowing_thisKeyWord();
		obj.setData(45);
		obj.showData();
	}
}

/*
 approach 1:
 pass the object reference to the setData() and use it
 
 approach 2:
 make the object reference global
 
 approach 3:
 use this keyword
 
 */
