package practices;

import java.util.Scanner;

public class TaxCalc {

	public static void main(String[] args) {

		double price, taxPrice, tax;
		tax = 0.18;

		Scanner input = new Scanner(System.in);

		System.out.println("Price: ");
		price = input.nextDouble();
		taxPrice = price + (price * tax);

		System.out.println("Taxed Price : " + taxPrice);

		input.close();
	}

}
