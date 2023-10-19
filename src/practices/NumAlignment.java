package practices;

import java.util.Scanner;

public class NumAlignment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the three numbers you want to be sorted one by one : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a != b && a != c && b != c) {
			if (a > b && a > c) {
				if (b > c) {
					System.out.println(a + " > " + b + " > " + c);
				} else {
					System.out.println(a + " > " + c + " > " + b);
				}
			} else if (b > a && b > c) {
				if (a > c) {
					System.out.println(b + " > " + a + " > " + c);
				} else {
					System.out.println(b + " > " + c + " > " + a);
				}
			} else {
				if (a > b) {
					System.out.println(c + " > " + a + " > " + b);
				} else {
					System.out.println(c + " > " + b + " > " + a);
				}
			}
		} else {
			System.out.println("Please enter distinct numbers!");
		}
		scan.close();

	}

}
