/*
Input & Output
to get input from user we use Scanner class (java.util.Scanner)

Syntax= Scanner obj=name = new Scanner (System.in);

Scanner class methods
1) nextInt() - for getting integer value
2} nextline() - for string value
3) nextDouble() - for double value

Output - System class (java.lang.System) lang is default package

Syntax - System.out.println();
 */


import java.util.Scanner;

// Create programme by taking input from the user and add it
public class InputOutput {

    public static void main(String[] args) {


        System.out.print("Enter any two numbers: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int c = a+b;
        System.out.print("Sum of two numbers: " +c);



    }
}
