package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        int firstNumber;
        keyboard = new Scanner(System.in);

        System.out.println("Hello and Welcome To Your Personal Magic 8 Ball");
        System.out.println("Go Ahead and Ask a Yes or No Question");
        keyboard.nextLine();

        System.out.println("Now Pick a number 1-100 to Find Your Outcome");
        firstNumber = keyboard.nextInt();
        if (10 >= firstNumber && firstNumber >= 0) {
            System.out.println("Maybe");
        }
        else if (20 >= firstNumber && firstNumber > 10) {
            System.out.println("Never");
        }
        else if (30 >= firstNumber && firstNumber >20) {
            System.out.println("I Can See It Happening");
        }
        else if (40 >= firstNumber && firstNumber >30) {
            System.out.println("I Don't Think So");
        }
        else if (50 >= firstNumber && firstNumber >40) {
            System.out.println("Doesn't Look Too Good");
        }
        else if (60 >= firstNumber && firstNumber >50) {
            System.out.println("I Don't Even Know What That Means");
        }
        else if (70 >= firstNumber && firstNumber >60) {
            System.out.println("I'm Busy Go Away!");
        }
        else if (80 >= firstNumber && firstNumber >70) {
            System.out.println("I Honestly Think It'll Go Down");
        }
        else if (90 >= firstNumber && firstNumber >80) {
            System.out.println("The Outcome Seems Likely");
        }
        else if (100 >= firstNumber && firstNumber >90) {
            System.out.println("Absolutely Yes!");
        }
        else
            System.out.println("Are you dumb? I said 1-100. What is this?");
    }
}
