package practices;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);

		System.out.println("Give 2 numbers : ");
		x = input.nextInt();
		y = input.nextInt();

		System.out.println("Operator : 1 -Sum  2 -Sub 3 -Div 4 -Mult");
		int operator = input.nextInt();
		int result = 0;

		switch (operator) {
		case 1:
			result = x + y;
			break;
		case 2:
			result = x - y;
			break;
		case 3:
			result = x / y;
			break;
		case 4:
			result = x * y;
			break;
		default:
			System.out.println("Invalid operator!");
		}

		System.out.println(result);
		input.close();

	}

}
