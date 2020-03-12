package com.company;

import java.util.Scanner;

public class UserInput {
    public UserInput() {
        System.out.println("User Input");
    }


    /*      Exercise 1

    Make changes to the program from the lesson video so that:
    It prints “You’ve lived x years. In another x years you’ll be 2x years old.”, where x is their age.

    It informs the user of how many characters are in their name.
    Hint: Use the .length() method on the string, which returns the number of characters e.g. theString.length()
    */

    public void ExerciseOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
        System.out.println("");
        System.out.println("Your name is " + firstName + ". Your name is " + firstName.length() + " characters long.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old.");
    }

    /*         Exercise 2

    Write a program which divides a restaurant bill so that each person pays an equal amount. Take a look at the hints below if you get stuck.

    Hint 1: Prompt the user for the necessary input. Then do some calculation with that input, and print the result.
    Hint 2: Using the Scanner, ask for the bill total and the number of people it will be split between.
    Hint 3: Divide the bill total by the number of people to calculate how much each person should pay, and print the result.
    */

    public void ExerciseTwo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Restaurant Bill Calculator\n");

        System.out.print("Enter bill total: £\n");
        double bill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format("A bill of £%.2f split between " + people + " people comes to approximately £%.2f each", bill, eachPay);
    }
}
