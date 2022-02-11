package wrapperclasses_03;

public class MyInteger extends MyNumber{

	private static int value; //as it becomes constant, we have to initialise it
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

}
