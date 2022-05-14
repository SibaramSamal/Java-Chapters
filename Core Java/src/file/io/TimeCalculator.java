package file.io;

public class TimeCalculator {
	private static long time;
	public static void startTime() {
		//time = System.currentTimeMillis();	//returns time in milliseconds which is rounded value
		time = System.nanoTime();	//returns time in exact nano miliseconds. Actual measurable
	}
	public static void endTime() {
		System.out.println("Total time spent for execution: "+(System.nanoTime()-time));
	}
}
