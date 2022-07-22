/*
Control flow - conditional statement, looping statement, transfer statement

1) Conditional Statement - it has 5 types
-> if
-> if-else
-> else-if
-> nested if
-> Switch case

1) if statement- It is used when we want to test a single condition.
if condition is false then code (statements) will not perform.

Syntax - if(condition) {
  //Statements;
}

2) if-else statement - It is used when we want to execute two statements for a single condition.
3) else-if statement - It is used when we have only one if block, multiple else-if blocks and at the last else block.
4) nested if-else - Whenever, we define if.else block inside another if-else block called nested if-else.
 */


import java.util.Scanner;

public class controlflow {
    public static void main (String[] args) {

        //if statement example
        System.out.println("Program 1 launched");
        System.out.println("Enter Password:= ");
        Scanner input = new Scanner(System.in);
        int password = input.nextInt();

        // if the user input the correct no 2731 then only following details will be printed.
        if (password == 2731) //2731==2731
        {
            System.out.println("My Name:= Pratham");
            System.out.println("My age:= 25");
            System.out.println("My Address:= Mumbai gate, Taj hotel 41002");
        }


        // if else statement
        System.out.println("Program 2 activated");
        System.out.println("Enter Password:= ");
        Scanner input1 = new Scanner(System.in);
        int password1 = input1.nextInt();

        // if the user input the correct no 2731 then only following details will be printed.
        if (password == 2731) //2731==2731
        {
            System.out.println("Correct password here are all your following details");
            System.out.println("My Name:= Pratham");
            System.out.println("My age:= 25");
            System.out.println("My Address:= Mumbai gate, Taj hotel 41002");
        } else {
            System.out.println("Sorry, wrong password try again :(");
            System.out.println("Program 2 ended -----");
        }


        //else if statement

        System.out.println("3rd Program initialized.....");
        System.out.println("Enter Marks: ");
        Scanner input2 = new Scanner(System.in);
        int marks = input2.nextInt();

        if (marks >= 60 && marks <= 100) {

            System.out.println("First Division");

        } else if (marks >= 45 && marks < 60) {

            System.out.println("Second Division");

        } else if (marks >= 33 && marks < 45) {
            System.out.println("Third Division");
        } else {
            System.out.println("Failed...");
        }


        //nested if else statement

        // create program to find-out which is greatest in a>b>c

        Scanner inputNumber = new Scanner(System.in);

        int num1 = inputNumber.nextInt();
        int num2 = inputNumber.nextInt();
        int num3 = inputNumber.nextInt();

        //suppose num1 = 20, num2 = 100, num3 = 45;

        if (num1 > num2) //20>10
        {
            if (num1 > num3) //20>45
            {
                System.out.println("Maximum Number: " + num1);
            } else {
                System.out.println("Maximum Number: " + num3);
            }

        } else {
            if (num2 > num3) {
                System.out.println("Maximum Number: " + num2);
            } else {
                System.out.println("Maximum Number: " + num3);
            }
        }







    }

}
