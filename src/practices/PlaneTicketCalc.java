package practices;

import java.util.Scanner;

public class PlaneTicketCalc {

	public static void main(String[] args) {

		int km, age;
		boolean isRoundTrip;
		Scanner scan = new Scanner(System.in);

		System.out.println("Destination distance : ");
		km = scan.nextInt();
		System.out.println("What is your age ? ");
		age = scan.nextInt();
		System.out.println("Is your trip round-trip ? ");
		isRoundTrip = scan.nextBoolean();

		double kmPrice, ageDiscount;

		if (km > 0 && (age > 0 && age < 120)) {

			kmPrice = km * 0.10;

			if (age < 12) {

				ageDiscount = kmPrice * 0.5;
			} else if (age <= 25) {
				ageDiscount = kmPrice * 0.9;
			} else if (age > 65) {
				ageDiscount = kmPrice * 0.7;
			} else {
				ageDiscount = kmPrice;
			}

			if (isRoundTrip) {
				ageDiscount *= 0.8;
			}

			ageDiscount *= 2;

			System.out.println("Plane ticket price : " + ageDiscount + "$");

		} else {
			System.out.println("Invalid data!");
		}

		scan.close();

	}
}
