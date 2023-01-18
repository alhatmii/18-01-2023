import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {

//		Initializing Scanner:
		Scanner sc = new Scanner(System.in);

//		Initializing Menu:
		boolean i = true;
		while (i) {

			System.out.println("1- Implement Stack (Push & POP).");
			System.out.println("2- Create a function in Java that checks whether a given string is a palindrome using a stack.");
			System.out.println("3- Design a stack in Java that supports push, pop, and get the middle element operations in O(1) time.");
			System.out.println("4- Given a list of integers, implement a stack in Java that can return the second largest element in O(1) time.");
			System.out.println("5- Create a function in Java that evaluates a postfix expression using a stack.");
			System.out.println("6- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {

			}

//			To Print out the data:
			else if (choice == 2) {

			}

			else if (choice == 3) {

			}

			else if (choice == 4) {

			}

			else if (choice == 5) {

			}

//			Exiting the menu:
			else if (choice == 6) {
				i = false;

				System.out.println("See you next time!");
			}

//			When Entering larger value:
			else {
				System.out.println("Re-Enter the right value.");
			}

//					Closing sc Scanner:
//					sc.close();
		}
	}
}