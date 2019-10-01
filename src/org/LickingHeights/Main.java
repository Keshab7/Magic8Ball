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
}
