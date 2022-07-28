import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {

       /*
        Question 1 - What will be the result of the following expression:
        float a = 7/4 * 9/2
         here 7 first divided by 4 then value comes 15.75 which multiply by 9 then divided by 2
        answer will be 7.875
         in question 7/4*9/2 is written in integer not like 7/4.0f which is float so remember this
        */

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);


        //Question 2 - Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        //this means that add 8 to user input but print the result by subtracting it from 8



        char grade = 'A';
         grade = (char)(grade + 8); //typecasting means converting one data type to other like here integer is changed to char
        System.out.println(grade);


        //decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);



        //Question 3 - Use comparison operators to find out whether a given number is greater than the user entered number or not.
         Scanner input = new Scanner(System.in);
        System.out.println("Enter no");
         int no = input.nextInt();
         System.out.println(no>8);


         //Question 4 -Find the value of 'a' in expression given below :
        int x = 7;
        int a1 = 7*49/7 + 35/7;
        System.out.println(a1);



    }
}