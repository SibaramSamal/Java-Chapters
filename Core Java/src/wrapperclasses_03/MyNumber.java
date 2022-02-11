package wrapperclasses_03;

//This is the actual java.lang package Number class looks like
public abstract class MyNumber {
	public abstract int getValue();
	
	public abstract int intValue();
	public abstract long longValue();
	public abstract float floatValue();
	public abstract double doubleValue();
	
	public byte  byteValue() {
        return (byte)getValue();
    }
	public short  shortValue() {
        return (short)getValue();
    }
}
