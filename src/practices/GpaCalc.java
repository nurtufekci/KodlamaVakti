package practices;

import java.util.Scanner;

public class GpaCalc {

	public static void main(String[] args) {

		// variables

		double midterm1, midterm2, finals, result;
		Scanner input = new Scanner(System.in);

		System.out.println("First Midterm : ");
		midterm1 = input.nextDouble();

		System.out.println("Second Midterm : ");
		midterm2 = input.nextDouble();

		System.out.println("Final : ");
		finals = input.nextDouble();

		// calculations

		result = (midterm1 * 0.2) + (midterm2 * 0.35) + (finals * 0.45);
		System.out.println("GPA Result : " + result);

		// conditions

		boolean res = result > 50;
		String passedRes = res ? "Passed" : "Failed";

		// result
		System.out.println(passedRes);
		
		input.close();
	}

}
