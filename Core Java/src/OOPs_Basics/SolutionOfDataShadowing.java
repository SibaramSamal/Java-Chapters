package OOPs_Basics;

public class SolutionOfDataShadowing {
	//approach 1:
	static SolutionOfDataShadowing obj;
		int x = 10;
		 void setData(int x) {
			 obj.x = x;	
			 System.out.println(x);
		 }
	//approach 2:
		 void setData2(int x,SolutionOfDataShadowing y) {
			 y.x = x;	
			 System.out.println(x);
		 }
		 void showData() {
			 System.out.println(obj);
			 System.out.println("Value of instance variale = "+x);
		 }
		public static void main(String[] args) {
			obj = new SolutionOfDataShadowing();
			SolutionOfDataShadowing obj2 = new SolutionOfDataShadowing();
			System.out.println(obj);
			obj.setData(456);
			obj.setData2(456,obj2);
			obj.showData();
		}
}
