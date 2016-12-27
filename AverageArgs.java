/*  Alejandro Parana
 *  CSCI300 Exercise 1.1
 *  Date: 10/2014
 *  Purpose: find the average of command line arguments passed in
 */
public class AverageArgs {
	public static void main(String[] args) {
		int sum = 0;
		int lengthOfArgs = args.length;

		for (String s : args) {
			sum += Integer.parseInt(s);
		}
		if (lengthOfArgs > 0) {
			System.out.println("Average: " + (double) sum / lengthOfArgs);
		} else {
			System.out.println("No arguments found.");
		}
	}

}
