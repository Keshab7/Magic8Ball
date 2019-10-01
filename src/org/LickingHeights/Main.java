package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        int firstNumber;
        keyboard = new Scanner(System.in);
        System.out.println("Pick a number 1-100");
        firstNumber = keyboard.nextInt();
        if (10 >= firstNumber && firstNumber >= 0) {
            System.out.println("Maybe");
        }
        if (20 >= firstNumber && firstNumber > 10) {
            System.out.println("Never");
        }
        if (30 >= firstNumber && firstNumber >20) {
            System.out.println("I Can See It Happening");
        }
        if (40 >= firstNumber && firstNumber >30) {
            System.out.println("I Don't Think So");
        }
        if (50 >= firstNumber && firstNumber >40) {
            System.out.println("Doesn't Look Too Good");
        }
        if (60 >= firstNumber && firstNumber >50) {
            System.out.println("I Don't Even Know What That Means");
        }
        if (70 >= firstNumber && firstNumber >60) {
            System.out.println("I'm Busy Go Away!");
        }
        if (80 >= firstNumber && firstNumber >70) {
            System.out.println("I Honestly Think It'll Go Down");
        }
       
    }
}
