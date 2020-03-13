package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public Loops() {
        System.out.println(" Loops");
    }

    /*           Exercise 1
        Write a program which prints numbers from 89 to 117.
    */
    public void ExerciseOne(){
        for (int i = 89; i <= 177 ; i++) {
            System.out.println(i);
        }
    }

    /*
                Exercise 2
        Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.
    */
    public void ExerciseTwo(){
        for (int i = 1; i <= 40 ; i++) {
            if(i % 3 == 0){
                System.out.println("Quack");
            }
            System.out.println(i);
        }
    }
    /*          Exercise 3
        Write a program which asks the user for a password. Make the password “shark50”.
        Each time the user enters the password incorrectly, prompt them for a password again. When the user enters the password correctly, print “ACCESS APPROVED”.
     */
    public void ExerciseThree(){
        String password = "shark50";
        String userPassword = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter Password: ");
            userPassword = scanner.nextLine();
        } while(!userPassword.equals(password));

        System.out.println("ACCESS APPROVED");
    }

    /*          Exercise 4
        Write a program which makes use of a loop to print the following output:
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
    */
    public void ExerciseFour(){
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
    }

    /*          Exercise 5
        Create a game where the program picks a random number from 1 to 100 and the player has to guess it.
        Each time the player makes a guess, print “HIGHER” if the guess was too low or “LOWER” if the guess was too high.
        If the player correctly guesses the number, print “CORRECT”, then end the game.
        You can use the line of code below which produces a random number from 1 to 100, and stores it in randomNumber.
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
    */
    public void ExerciseFive(){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
            }

        } while (guess != randomNumber);
    }

    /*
                Exercise 6
        Modify the program in Exercise 5 so that once the game is won, it informs the player how many guesses it took them.
    */
    public void ExerciseSix(){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " guesses!");
            }

        } while (guess != randomNumber);
    }
}
