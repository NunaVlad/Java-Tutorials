package com.company;

import java.util.Scanner;

/*
        Exercise 1
        Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.



        Exercise 2
        Use a loop to populate an array with integers from 1 to 20.
        Use another loop to print the contents of the array (the elements) backwards.



        Exercise 3
        Create an array of five doubles and give each element some value.
        Calculate the sum of all the elements and print the result. Calculate the mean/average of the all the elements and print that too.



        Exercise 4
        Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        However, create the array so it can only hold a maximum of three strings. After the user enters the third item, print “No more memory available.”,
        then print out the contents of the array.
        Note: For this program use scanner.nextLine() when grabbing input from the user.
        This is because if the user enters a food such as “Ice cream” then scanner.next() will interpret that as two separate strings, due to the space.
        This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another. However, if you use scanner.nextLine(),
        it will return the entire line as a single string.

 */
public class Arrays {
    public Arrays() {
        System.out.println("Arrays");
    }
    /*
            Exercise 1
    Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.
    */
    public void ExerciseOne(){
        System.out.println("");
        int[] intArr = new int[10];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 6;
        intArr[4] = 55;
        intArr[5] = 123;
        intArr[6] = 432;
        intArr[7] = 4333;
        intArr[8] = 222332;
        intArr[9] = 41;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    /*
            Exercise 2
    Use a loop to populate an array with integers from 1 to 20.
    Use another loop to print the contents of the array (the elements) backwards.
    */
    public void ExerciseTwo(){
        System.out.println("");
        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }
    /*
            Exercise 3
    Create an array of five doubles and give each element some value.
    Calculate the sum of all the elements and print the result. Calculate the mean/average of the all the elements and print that too.
    */
    public void ExerciseThree(){
        System.out.println("");
        double[] intArr = new double[5];
        intArr[0] = 1.123;
        intArr[1] = 2.90098;
        intArr[2] = 19090;
        intArr[3] = 6.213246;
        intArr[4] = 4865.22;

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        double mean = sum / intArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("");
        System.out.println("Mean: " + mean);
    }

    /*
            Exercise 4
    Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
    However, create the array so it can only hold a maximum of three strings. After the user enters the third item, print “No more memory available.”,
    then print out the contents of the array.
    Note: For this program use scanner.nextLine() when grabbing input from the user.
    This is because if the user enters a food such as “Ice cream” then scanner.next() will interpret that as two separate strings, due to the space.
    This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another. However, if you use scanner.nextLine(),
    it will return the entire line as a single string.
    */
    public void ExerciseFour(){
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }
    }
}
