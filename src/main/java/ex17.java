/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 17 - Blood Alcohol Calculator

Sometimes you have to perform a more complex calculation based on some provided inputs and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.


Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint

Prevent the user from entering non-numeric values.

Challenges

Handle metric units.
Look up the legal BAC limit by state and prompt for the state. Display a message that states whether or not it’s legal to drive based on the computed BAC.
Develop this as a mobile application that makes it easy to record each drink, updating the BAC each time a drink is entered.

 */
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //inputs 1
        boolean isNumber;
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");

        do {
            if (in.hasNextInt()) {
                isNumber = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber = false;
                in.nextLine();
            }
        }while (!(isNumber));
        String str1 = in.nextLine();

        int sex = Integer.parseInt(str1);

        //inputs 2
        boolean isNumber2;
        System.out.print("How many ounces of alcohol did you have? ");

        do {
            if (in.hasNextInt()) {
                isNumber2 = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber2 = false;
                in.nextLine();
            }
        }while (!(isNumber2));
        String str2 = in.nextLine();

        int ounces = Integer.parseInt(str2);

        //inputs 3
        boolean isNumber3;
        System.out.print("What is your weight, in pounds? ");

        do {
            if (in.hasNextInt()) {
                isNumber3 = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber3 = false;
                in.nextLine();
            }
        }while (!(isNumber3));
        String str3 = in.nextLine();

        int pounds = Integer.parseInt(str3);

        //inputs 4
        boolean isNumber4;
        System.out.print("How many hours has it been since your last drink? ");

        do {
            if (in.hasNextInt()) {
                isNumber4 = true;
            } else {
                System.out.print("Please enter a numerical value! ");
                isNumber4 = false;
                in.nextLine();
            }
        }while (!(isNumber4));
        String str4 = in.nextLine();

        int hours = Integer.parseInt(str4);

        if (sex==1){
            double BAC = (ounces*(5.14/pounds)*0.73)-0.015*hours;
            System.out.println(String.format("Your BAC is %f",BAC));

            String output = BAC<.08 ? "It is legal for you to drive." : "It is not legal for you to drive.";
            System.out.print(output);
        }
        else if (sex==2){
            double BAC = (ounces*(5.14/pounds)*0.66)-0.015*hours;
            System.out.println(String.format("Your BAC is %f",BAC));

            String output = BAC<.08 ? "It is legal for you to drive." : "It is not legal for you to drive.";
            System.out.print(output);
        }
        else {
            System.out.print("invalid input for \"male\" or \"female\"");
        }


    }
}
