package introduction_01;

public class MainMethodArguments {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]); // Display the arguments

		// To find the sum of argument values, as they are String types,we have to
		// convert them into premitive types.
		float sum = 0;
		for (int i = 0; i < args.length; i++)
			sum += Float.parseFloat(args[i]);	//String value converted into float type
		System.out.println(sum);
	}
}
