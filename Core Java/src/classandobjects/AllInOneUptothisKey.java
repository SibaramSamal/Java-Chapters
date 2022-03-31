package classandobjects;

/**
 * @author Sibaram
 *
 *Aim: To use all the concepts like class,object,constructors, initializer blocks,
 *		static keyword, this keyword in a single application.
 *I have setup a static datamember to count the total number of objects created, and all other
 *mislaneous functionalities.
 *
 */

class Bulb{
	static int count;
	
	boolean status;
	String company;
	float price;
	Bulb(){
		//System.out.println("Number of bulbs Produced: "+count);
		status = true;
		company = "surya";
		price = 80.4f;
	}
	Bulb(String company,float price,boolean status){
		this.company = company;
		this.price = price;
		this.status = status;
	}
	void showData(){
		System.out.println("Company name: "+company);
		System.out.println("M.R.P: "+price);
		System.out.println("Delivery status: "+status);
	}
	static void showBulbCount(){
		System.out.println("Number of bulbs Produced: "+count);
	}
	{
		count++;
	}	
}
public class AllInOneUptothisKey {

	public static void main(String[] args) {
		Bulb obj = new Bulb();	//bulb no. 1
		Bulb obj2 = new Bulb();	//bulb no. 2
		Bulb obj3 = new Bulb("Phillips", 86.8f, false);	//bulb no. 3
		obj.showData();
		obj2.showData();
		obj3.showData();
		new Bulb();			// bulb no. 4
		Bulb.showBulbCount();	//total 4 numbers of bulbs produced
	}

}
