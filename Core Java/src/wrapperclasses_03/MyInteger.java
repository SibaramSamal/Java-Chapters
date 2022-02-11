package wrapperclasses_03;

public class MyInteger extends MyNumber{

	private final int value; //as it becomes constant, we have to initialise it
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public int intValue() {
		return value;
	}
	public long longValue() {
		return value;
	}	
	public float floatValue() {
		return value;
	}
	public double doubleValue() {
		return value;
	}
}
