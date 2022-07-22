/*
Looping Statement
--> for
--> while
--> do while
--> for each

Loop - Whenever we want to repeat certain statements several times then we should write those statments inside loop body.

1) for loop - for is keyword

step by step code execution----
step1 initialization - means put value in variable means assign value to variable

step2 condition - when condition is true then below code will execute

step4 increment/decrement - after execution of code then process of ++ or -- of value will done.

step5 again condition will be checked. if condition is true then code will remain work but if false then code will stop working.
{
//code
}

2) while loop - While loop in Java comes into use when we need to repeatedly execute a block of statements. The while loop is considered as a repeating if statement. If the number of iterations is not fixed, it is recommended to use the while loop.

3) do-while loop -

4) for each loop -






 */


import java.util.Scanner;

public class loop {
    public static void main (String[] args){

       System.out.println("Enter any Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

//        //without using loop
//
//        System.out.println("These are result without using loop");
//        System.out.println(num*1);
//        System.out.println(num*2);
//        System.out.println(num*3);
//        System.out.println(num*4);
//        System.out.println(num*5);
//        System.out.println(num*6);
//        System.out.println(num*7);
//        System.out.println(num*8);
//        System.out.println(num*9);
//        System.out.println(num*10);


        //above program using loop
     int i; //declare int i before using for
     for (i=1; i<10; i++) // i=1 means initialisation start with number 1, condition- table we needed is till 10 that's why i<10, increment++
     {
        System.out.println(num*i);
       // System.out.println("Program 1 ended");
     }


     //while loop

//        System.out.println("Enter any Number: ");
//        Scanner input2 = new Scanner(System.in);
//        int no1 = input2.nextInt();
//        while (no1>=0)
//        {
//            if (no1%2==0)
//            {
//               System.out.println("Even number");
//               break; //to stop while loop for printing continuously line
//            }else
//            {
//               System.out.println("Odd Number");
//            }
//        }
//        System.out.println("while loop ended....");

      //do while loop

        System.out.println("Enter Number: ");
        Scanner input3 = new Scanner(System.in);
        int numBer2 = input3.nextInt();
        do {
            System.out.print(numBer2+ " ");
            ++numBer2;
        }
        while (numBer2<=10);








    }
}
