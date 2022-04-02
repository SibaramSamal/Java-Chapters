package introduction_01;

//AIm: To solve multiple number of overloaded method of similar arguments, apply var args concept

public class VarArgsDemo {
	/*
		void showData(){ some logic }
		void showData(int x){ some logic }
		void showData(int x,int y){ some logic }
		void showData(int x,int y,int a,int f,int h,....){ some logic }
		
		here the requirement may vary from situation to situation. So we have to go for a generalised 
		signature for any numbers of similar type arguments.
	*/
	
	void showData(int ... varg) {	//varg acts as an integer array
		for(int i=0 ; i<varg.length ; i++)
			System.out.println(varg[i]);
	}
	public static void main(String[] args) {
		VarArgsDemo d = new VarArgsDemo();
		d.showData(56,6);
		d.showData(5,66,9,10,23,56,96,15);

	}

}
