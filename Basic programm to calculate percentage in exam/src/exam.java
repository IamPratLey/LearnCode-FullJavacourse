import java.util.Scanner;

public class exam {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the marks of subjects");

        System.out.println("Enter marks you got in Subject 1: ");
        int sub1 = input.nextInt();
        System.out.println("Enter marks you got in Subject 2: ");
        int sub2 = input.nextInt();
        System.out.println("Enter marks you got in Subject 3: ");
        int sub3 = input.nextInt();
        System.out.println("Enter marks you got in Subject 4: ");
        int sub4 = input.nextInt();
        System.out.println("Enter marks you got in Subject 5: ");
        int sub5 = input.nextInt();
        System.out.println("Enter out of total marks: ");
        double outofTotalmarks = input.nextDouble();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;

        System.out.println("Sum of total marks is: " + sum);


        float calculatePercentage = (float) ((sum / outofTotalmarks) * 100);

        if (calculatePercentage >= 60 && calculatePercentage <= 100) {

            System.out.println("First Division");

        } else if (calculatePercentage >= 45 && calculatePercentage < 60) {

            System.out.println("Second Division");

        } else if (calculatePercentage>= 33 && calculatePercentage < 45) {
            System.out.println("Third Division");
        } else {
            System.out.println("Failed...");
        }

        System.out.println("Your percentage in Exam is " + calculatePercentage + "%");

    }
}
