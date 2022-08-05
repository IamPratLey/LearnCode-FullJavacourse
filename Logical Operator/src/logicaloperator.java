/*
Relational Operators in Java :
Relational operators are used to evaluate conditions (true or false) inside the if statements. Some examples of relational operators are:

== (equals)
>= (greater than or equals to)
> (greater than)
< (less than)
<= (less than or equals to)
!= (not equals)
Note: ‘=’ is used for an assignment whereas ‘==’ is used for equality check. The condition can be either true or false.




Logical Operators :
Logical operators are used to provide logic to our Java programs.
There are three types of logical operators in Java :
&& - AND
|| - OR
! – NOT

AND Operator :
Evaluates to true if both the conditions are true.

Y && Y = Y
Y && N = N
N && Y = N
N && N = N
Convention: # Y – True and N - False

OR Operator :
Evaluates to true when at least one of the conditions is true.

Y || Y = Y
Y || N = Y
N || Y = Y
N || N = N
Convention: # Y – True and N - False

NOT Operator :
Negates the given logic (true becomes false and vice-versa)

!Y = N
!N = Y
 */

public class logicaloperator {
    public static void main(String[] args) {


        System.out.println("Logical AND...");
        boolean x = true;
        boolean y = false;
//        if (x && y){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("Logical OR...");
//
//        if (x || y){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("Logical NOT");
        System.out.print("Not(x) is ");
        System.out.println(!x); //this opposite the result from true to false , false to true
        System.out.print("Not(y) is ");
        System.out.println(!y);

    }
}





