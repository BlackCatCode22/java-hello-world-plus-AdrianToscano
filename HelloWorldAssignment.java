// Name of programmer: Adrian Anguiano
// Name of program: HelloWorldAssignment
// Date started: 01/23/23
//
// Description of program: Ask user for her first name and echo back in a greeting.
// Input/Processing/Output: user input in console, output is System.out in console
// Purpose of program: CIT-63 assignment Spring 2023
//
// References:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;
public class HelloWorldAssignment {
    public static void main(String[] args) {
        // variable declarations
        Scanner userInput = new Scanner(System.in);
        String userName = "";

        // prompt user for input
        System.out.println("Hello, please enter your name: ");

        // accept input
        userName = userInput.nextLine();

        // output the user's name with a greeting
        System.out.println("\nCool name!\nHave a great day, " + userName + "!!:)");
    }

}
