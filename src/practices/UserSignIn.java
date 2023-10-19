package practices;

import java.util.Scanner;

public class UserSignIn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String userName, passWord;
		String actualUser = "grimaren";
		String pass = "Besiktas1903";
		System.out.println("Your User Name : ");
		userName = scan.next();
		System.out.println("Password : ");
		passWord = scan.next();

		if (userName.equals(actualUser) && passWord.equals(pass)) {
			System.out.println("Successfully Logged In!");
		} else {
			System.out.println("Username or password is wrong!");
		}

		scan.close();

	}

}
