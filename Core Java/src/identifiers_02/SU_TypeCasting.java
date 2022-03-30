package identifiers_02;

public class SU_TypeCasting{

	void ratioCalculate(int x,int y) {
		float ratio = x/y;
		System.out.println(ratio);
	}
	
	public static void main(java.lang.String[] args) {
		SU_TypeCasting obj = new SU_TypeCasting();
		obj.ratioCalculate(2,3);
	}
}
