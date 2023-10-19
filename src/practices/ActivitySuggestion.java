package practices;

import java.util.Scanner;

public class ActivitySuggestion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double temp;
		String activity;

		System.out.println("What is the temperature ? ");
		temp = scan.nextDouble();

		if (temp >= 30 && temp < 40) {
			activity = " swimming!";
		} else if (temp >= 5 && temp < 30) {
			activity = " cinema!";
		} else if (temp > -5 && temp < 5) {
			activity = " skiing!";
		} else {
			activity = "Invalid Data!";
		}

		if (activity.contains("Invalid")) {
			System.out.println(activity + " Please Try Again! ");
		} else {
			System.out.println("Our activity suggestion is" + activity);
		}

		scan.close();
	}

}
