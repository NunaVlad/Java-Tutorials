package com.company;

public class HelloWorld {

    // \n - newline
    // \t - tab
    // \b - backspace

    public HelloWorld() {
        System.out.println("Hello world");
    }

    /*  Exercise 1
    Create a program which produces the following output:

    SHOPPING LIST
        - Milk
            > Semi-skimmed
            > Medium
        - Eggs
            > Free-range
        - Bread
    */
    public void ExerciseOne(){
        System.out.println("Exercise 1");
        System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Bread\n\n");
    }

    /*
        Exercise 2
     If you used multiple print/println statements in Exercise 1,
     rewrite the program using only a single print/println method (or vice versa).
     */
    public void ExerciseTwo(){
        System.out.println("Exercise 2");
        System.out.println("SHOPPING LIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free-range\n\t- Bread\n\n\n");
    }

    /*
        Exercise 3
    Create a program which produces the following output:
        The
            Cake
        Is        A
            Lie.
    As a rule, each word must go in its own print/println method.
     */

    public void ExerciseThree(){
        System.out.println("Exercise 3");
        System.out.println("The");
        System.out.println("\tCake");
        System.out.println("Is\t\t\tA");
        System.out.println("\tLie.\n\n");
    }
}
