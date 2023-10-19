package practices;

import java.util.Scanner;

public class CircleCalc {

	public static void main(String[] args) {

		// area : 2 * pi * r
		// volume : pi * r * r

		double pi = 3.14;
		double area, vol;
		int r;

		Scanner input = new Scanner(System.in);
		System.out.println("Radius of the circle : ");
		r = input.nextInt();

		area = 2 * pi * r;
		vol = pi * (r * r);

		System.out.println("Area : " + area);
		System.out.println("Vol : " + vol);

		input.close();

	}

}
