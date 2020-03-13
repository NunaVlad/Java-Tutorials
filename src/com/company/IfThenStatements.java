package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IfThenStatements {
    public IfThenStatements() {
        System.out.println("If-then Statements");
    }

    /*
            Exercise 1
        Write a program with two int variables, int x and int y, and give each one a value.
        Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and y are the same”.
        Change the values and run the program a few times to check it works.
    */
    public void ExerciseOne(){
        int x = 0;
        int y = 0;

        if(x > y){
            System.out.println("x is bigger than y");
        }

        if( y > x){
            System.out.println("y is bigger than x");
        }

        if(x == y){
            System.out.println("x and y are the same");
        }
    }

    /*
            Exercise 2
        Modify the program from Exercise 1 so it also prints the difference between x and y.
     */
    public void ExerciseTwo(){
        int x = 4;
        int y = 1;

        if(x > y){
            System.out.println("x is bigger than y");
        }

        if( y > x){
            System.out.println("y is bigger than x");
        }

        if(x == y){
            System.out.println();
        }

        int diff = x - y;
        System.out.println("Difference between x and y is: " + diff);
    }

    /*
            Exercise 3
        Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
        If the player guesses right, print “Correct! Aren’t you lucky.“.
        If the player guesses wrong, print “Hard luck! Maybe next time.“.
        You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber.
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
    */
    public void ExerciseThree(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        guessNumber(randomNumber, -1);
    }

    private void guessNumber(int randomNumber, int numberOfGuesses){

        if(numberOfGuesses == 0){
            System.out.println("Game over, good luck next time!");
            return;
        }
        Scanner scann = new Scanner(System.in);
        int guessedNumber = scann.nextInt();
        System.out.println("Try to guess my number. Insert a number between 1 and 5 inclusive");

        if(numberOfGuesses != -1){
            numberOfGuesses--;
        }

        if(guessedNumber == randomNumber){
            System.out.println("Correct! Aren’t you lucky.\n");
        }else{
            System.out.println("Hard luck! Maybe next time.\n");
            guessNumber(randomNumber, numberOfGuesses);
        }
    }

    /*
            Exercise 4
    Modify the program from Exercise 3 so it gives the player two chances to guess the number.
    */
    public void ExerciseFour(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        guessNumber(randomNumber, 2);
    }

}
