import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        //Question 1- Write a program to sum three numbers in java?
        int a = 3;
        int b = 5;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);


        //Question 2- write a program to calculate CGPA using marks of these subjects(out of 100)?
        //use float when you required output in percentage, when you divide int with int you will get answer in int not in decimals
        float sub1 = 56;
        float sub2 = 76;
        float sub3 = 96;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);


        //Question 3- write a program which asks the user to center his/her name and greats them with "Hello <name>, have a good day" test?
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", have a good day");



        //Question 4- Write a program to convert kilometer to miles?
        System.out.println("Enter value to convert km to miles:");
        float n = input.nextFloat();
        float kmtoMiles = (float) (n* 0.62137119);
        System.out.println("Value from km to miles: " + kmtoMiles);




        //Question 5- Write a program to detect whether a number entered by the user is integer or not?
        System.out.println(input.hasNextInt());
    }
}
