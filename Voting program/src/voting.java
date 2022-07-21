/*
Create program to check whether candidate is eligible for vote or not?
 */


import java.util.Scanner;

public class voting {

    public static void main(String[] args) {

        System.out.println("Hello! Excited to vote for first time ?");
        System.out.println("Check whether you are eligible to vote or not :)");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations, " + "you are " + age + " eligible to vote");
        } else {
            System.out.println("Sorry, you are too young to vote. Wait till you turn 18 :)");
        }
    }
}