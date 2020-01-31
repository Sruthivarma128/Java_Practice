package dayOne;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input = scan.nextInt();
		System.out.println("Entered number is: ");
		System.out.println(user_input);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal number");
		double user_input1 = scan1.nextDouble();
		System.out.println("Entered decimal number is: ");
		System.out.println(user_input1);
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some String");
		String user_input2 = scan2.nextLine();
		System.out.println("Entered String is: ");
		System.out.print(user_input2);
	}

}
