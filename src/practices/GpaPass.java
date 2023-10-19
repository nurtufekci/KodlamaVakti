package practices;

import java.util.Scanner;

public class GpaPass {

	public static void main(String[] args) {

		double languageStudies, science, math, pe, socialStudies;
		double finalGrade;
		String result = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Grade for Language Studies : ");
		languageStudies = scan.nextDouble();
		System.out.println("Grade for Science  : ");
		science = scan.nextDouble();
		System.out.println("Grade for Mathematics  : ");
		math = scan.nextDouble();
		System.out.println("Grade for Physical Education  : ");
		pe = scan.nextDouble();
		System.out.println("Grade for Social Studies : ");
		socialStudies = scan.nextDouble();

		finalGrade = (languageStudies + science + math + pe + socialStudies) / 5;

		if (finalGrade > 0 && finalGrade < 50) {
			result = "Unfortuneatly! You have failed this academic year!";
			System.out.println(finalGrade);

		} else if (finalGrade >= 50 && finalGrade < 100) {
			result = "Congrats! You have passed this academic year! ";
			System.out.println(finalGrade);

		} else {
			result = "Invalid result! Try Again!";
		}

		System.out.println(result);
		scan.close();

	}

}
